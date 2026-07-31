package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class RepeatedFieldBuilderV3 implements AbstractMessage.BuilderParent {
    private List builders;
    private BuilderExternalList externalBuilderList;
    private MessageExternalList externalMessageList;
    private MessageOrBuilderExternalList externalMessageOrBuilderList;
    private boolean isClean;
    private boolean isMessagesListMutable;
    private List messages;
    private AbstractMessage.BuilderParent parent;

    public RepeatedFieldBuilderV3(List list, boolean z, AbstractMessage.BuilderParent builderParent, boolean z2) {
        this.messages = list;
        this.isMessagesListMutable = z;
        this.parent = builderParent;
        this.isClean = z2;
    }

    public void dispose() {
        this.parent = null;
    }

    private void ensureMutableMessageList() {
        if (this.isMessagesListMutable) {
            return;
        }
        this.messages = new ArrayList(this.messages);
        this.isMessagesListMutable = true;
    }

    private void ensureBuilders() {
        if (this.builders == null) {
            this.builders = new ArrayList(this.messages.size());
            for (int i = 0; i < this.messages.size(); i++) {
                this.builders.add(null);
            }
        }
    }

    public int getCount() {
        return this.messages.size();
    }

    public boolean isEmpty() {
        return this.messages.isEmpty();
    }

    public AbstractMessage getMessage(int i) {
        return getMessage(i, false);
    }

    private AbstractMessage getMessage(int i, boolean z) {
        List list = this.builders;
        if (list == null) {
            return (AbstractMessage) this.messages.get(i);
        }
        SingleFieldBuilderV3 singleFieldBuilderV3 = (SingleFieldBuilderV3) list.get(i);
        if (singleFieldBuilderV3 == null) {
            return (AbstractMessage) this.messages.get(i);
        }
        return z ? singleFieldBuilderV3.build() : singleFieldBuilderV3.getMessage();
    }

    public AbstractMessage.Builder getBuilder(int i) {
        ensureBuilders();
        SingleFieldBuilderV3 singleFieldBuilderV3 = (SingleFieldBuilderV3) this.builders.get(i);
        if (singleFieldBuilderV3 == null) {
            SingleFieldBuilderV3 singleFieldBuilderV32 = new SingleFieldBuilderV3((AbstractMessage) this.messages.get(i), this, this.isClean);
            this.builders.set(i, singleFieldBuilderV32);
            singleFieldBuilderV3 = singleFieldBuilderV32;
        }
        return singleFieldBuilderV3.getBuilder();
    }

    public MessageOrBuilder getMessageOrBuilder(int i) {
        List list = this.builders;
        if (list == null) {
            return (MessageOrBuilder) this.messages.get(i);
        }
        SingleFieldBuilderV3 singleFieldBuilderV3 = (SingleFieldBuilderV3) list.get(i);
        if (singleFieldBuilderV3 == null) {
            return (MessageOrBuilder) this.messages.get(i);
        }
        return singleFieldBuilderV3.getMessageOrBuilder();
    }

    public RepeatedFieldBuilderV3 setMessage(int i, AbstractMessage abstractMessage) {
        SingleFieldBuilderV3 singleFieldBuilderV3;
        Internal.checkNotNull(abstractMessage);
        ensureMutableMessageList();
        this.messages.set(i, abstractMessage);
        List list = this.builders;
        if (list != null && (singleFieldBuilderV3 = (SingleFieldBuilderV3) list.set(i, null)) != null) {
            singleFieldBuilderV3.dispose();
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public RepeatedFieldBuilderV3 addMessage(AbstractMessage abstractMessage) {
        Internal.checkNotNull(abstractMessage);
        ensureMutableMessageList();
        this.messages.add(abstractMessage);
        List list = this.builders;
        if (list != null) {
            list.add(null);
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public RepeatedFieldBuilderV3 addMessage(int i, AbstractMessage abstractMessage) {
        Internal.checkNotNull(abstractMessage);
        ensureMutableMessageList();
        this.messages.add(i, abstractMessage);
        List list = this.builders;
        if (list != null) {
            list.add(i, null);
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public RepeatedFieldBuilderV3 addAllMessages(Iterable iterable) {
        int i;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Internal.checkNotNull((AbstractMessage) it.next());
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            i = collection.size();
        } else {
            i = -1;
        }
        ensureMutableMessageList();
        if (i >= 0) {
            List list = this.messages;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + i);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            addMessage((AbstractMessage) it2.next());
        }
        onChanged();
        incrementModCounts();
        return this;
    }

    public AbstractMessage.Builder addBuilder(AbstractMessage abstractMessage) {
        ensureMutableMessageList();
        ensureBuilders();
        SingleFieldBuilderV3 singleFieldBuilderV3 = new SingleFieldBuilderV3(abstractMessage, this, this.isClean);
        this.messages.add(null);
        this.builders.add(singleFieldBuilderV3);
        onChanged();
        incrementModCounts();
        return singleFieldBuilderV3.getBuilder();
    }

    public AbstractMessage.Builder addBuilder(int i, AbstractMessage abstractMessage) {
        ensureMutableMessageList();
        ensureBuilders();
        SingleFieldBuilderV3 singleFieldBuilderV3 = new SingleFieldBuilderV3(abstractMessage, this, this.isClean);
        this.messages.add(i, null);
        this.builders.add(i, singleFieldBuilderV3);
        onChanged();
        incrementModCounts();
        return singleFieldBuilderV3.getBuilder();
    }

    public void remove(int i) {
        SingleFieldBuilderV3 singleFieldBuilderV3;
        ensureMutableMessageList();
        this.messages.remove(i);
        List list = this.builders;
        if (list != null && (singleFieldBuilderV3 = (SingleFieldBuilderV3) list.remove(i)) != null) {
            singleFieldBuilderV3.dispose();
        }
        onChanged();
        incrementModCounts();
    }

    public void clear() {
        this.messages = Collections.emptyList();
        this.isMessagesListMutable = false;
        List<SingleFieldBuilderV3> list = this.builders;
        if (list != null) {
            for (SingleFieldBuilderV3 singleFieldBuilderV3 : list) {
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                }
            }
            this.builders = null;
        }
        onChanged();
        incrementModCounts();
    }

    public List build() {
        this.isClean = true;
        boolean z = this.isMessagesListMutable;
        if (!z && this.builders == null) {
            return this.messages;
        }
        if (!z) {
            for (int i = 0; i < this.messages.size(); i++) {
                Message message = (Message) this.messages.get(i);
                SingleFieldBuilderV3 singleFieldBuilderV3 = (SingleFieldBuilderV3) this.builders.get(i);
                if (singleFieldBuilderV3 == null || singleFieldBuilderV3.build() == message) {
                }
            }
            return this.messages;
        }
        ensureMutableMessageList();
        for (int i2 = 0; i2 < this.messages.size(); i2++) {
            this.messages.set(i2, getMessage(i2, true));
        }
        List unmodifiableList = Collections.unmodifiableList(this.messages);
        this.messages = unmodifiableList;
        this.isMessagesListMutable = false;
        return unmodifiableList;
    }

    public List getMessageList() {
        if (this.externalMessageList == null) {
            this.externalMessageList = new MessageExternalList(this);
        }
        return this.externalMessageList;
    }

    public List getBuilderList() {
        if (this.externalBuilderList == null) {
            this.externalBuilderList = new BuilderExternalList(this);
        }
        return this.externalBuilderList;
    }

    public List getMessageOrBuilderList() {
        if (this.externalMessageOrBuilderList == null) {
            this.externalMessageOrBuilderList = new MessageOrBuilderExternalList(this);
        }
        return this.externalMessageOrBuilderList;
    }

    private void onChanged() {
        AbstractMessage.BuilderParent builderParent;
        if (!this.isClean || (builderParent = this.parent) == null) {
            return;
        }
        builderParent.markDirty();
        this.isClean = false;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
    public void markDirty() {
        onChanged();
    }

    private void incrementModCounts() {
        MessageExternalList messageExternalList = this.externalMessageList;
        if (messageExternalList != null) {
            messageExternalList.incrementModCount();
        }
        BuilderExternalList builderExternalList = this.externalBuilderList;
        if (builderExternalList != null) {
            builderExternalList.incrementModCount();
        }
        MessageOrBuilderExternalList messageOrBuilderExternalList = this.externalMessageOrBuilderList;
        if (messageOrBuilderExternalList != null) {
            messageOrBuilderExternalList.incrementModCount();
        }
    }

    private static class MessageExternalList extends AbstractList implements List {
        RepeatedFieldBuilderV3 builder;

        MessageExternalList(RepeatedFieldBuilderV3 repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.builder.getCount();
        }

        @Override // java.util.AbstractList, java.util.List
        public AbstractMessage get(int i) {
            return this.builder.getMessage(i);
        }

        void incrementModCount() {
            ((AbstractList) this).modCount++;
        }
    }

    private static class BuilderExternalList extends AbstractList implements List {
        RepeatedFieldBuilderV3 builder;

        BuilderExternalList(RepeatedFieldBuilderV3 repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.builder.getCount();
        }

        @Override // java.util.AbstractList, java.util.List
        public AbstractMessage.Builder get(int i) {
            return this.builder.getBuilder(i);
        }

        void incrementModCount() {
            ((AbstractList) this).modCount++;
        }
    }

    private static class MessageOrBuilderExternalList extends AbstractList implements List {
        RepeatedFieldBuilderV3 builder;

        MessageOrBuilderExternalList(RepeatedFieldBuilderV3 repeatedFieldBuilderV3) {
            this.builder = repeatedFieldBuilderV3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.builder.getCount();
        }

        @Override // java.util.AbstractList, java.util.List
        public MessageOrBuilder get(int i) {
            return this.builder.getMessageOrBuilder(i);
        }

        void incrementModCount() {
            ((AbstractList) this).modCount++;
        }
    }
}
