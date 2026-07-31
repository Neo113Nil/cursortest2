package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;

/* loaded from: classes11.dex */
public class SingleFieldBuilderV3 implements AbstractMessage.BuilderParent {
    private AbstractMessage.Builder builder;
    private boolean isClean;
    private AbstractMessage message;
    private AbstractMessage.BuilderParent parent;

    public SingleFieldBuilderV3(AbstractMessage abstractMessage, AbstractMessage.BuilderParent builderParent, boolean z) {
        this.message = (AbstractMessage) Internal.checkNotNull(abstractMessage);
        this.parent = builderParent;
        this.isClean = z;
    }

    public void dispose() {
        this.parent = null;
    }

    public AbstractMessage getMessage() {
        if (this.message == null) {
            this.message = (AbstractMessage) this.builder.buildPartial();
        }
        return this.message;
    }

    public AbstractMessage build() {
        this.isClean = true;
        return getMessage();
    }

    public AbstractMessage.Builder getBuilder() {
        if (this.builder == null) {
            AbstractMessage.Builder builder = (AbstractMessage.Builder) this.message.newBuilderForType(this);
            this.builder = builder;
            builder.mergeFrom((Message) this.message);
            this.builder.markClean();
        }
        return this.builder;
    }

    public MessageOrBuilder getMessageOrBuilder() {
        AbstractMessage.Builder builder = this.builder;
        return builder != null ? builder : this.message;
    }

    public SingleFieldBuilderV3 setMessage(AbstractMessage abstractMessage) {
        this.message = (AbstractMessage) Internal.checkNotNull(abstractMessage);
        AbstractMessage.Builder builder = this.builder;
        if (builder != null) {
            builder.dispose();
            this.builder = null;
        }
        onChanged();
        return this;
    }

    public SingleFieldBuilderV3 mergeFrom(AbstractMessage abstractMessage) {
        if (this.builder == null) {
            Message message = this.message;
            if (message == message.getDefaultInstanceForType()) {
                this.message = abstractMessage;
                onChanged();
                return this;
            }
        }
        getBuilder().mergeFrom((Message) abstractMessage);
        onChanged();
        return this;
    }

    public SingleFieldBuilderV3 clear() {
        Message defaultInstanceForType;
        AbstractMessage abstractMessage = this.message;
        if (abstractMessage != null) {
            defaultInstanceForType = abstractMessage.getDefaultInstanceForType();
        } else {
            defaultInstanceForType = this.builder.getDefaultInstanceForType();
        }
        this.message = (AbstractMessage) defaultInstanceForType;
        AbstractMessage.Builder builder = this.builder;
        if (builder != null) {
            builder.dispose();
            this.builder = null;
        }
        onChanged();
        return this;
    }

    private void onChanged() {
        AbstractMessage.BuilderParent builderParent;
        if (this.builder != null) {
            this.message = null;
        }
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
}
