package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.w0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class SerializedCollection implements Externalizable {
    public static final a Companion = new a(null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    private Collection<?> collection;
    private final int tag;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public SerializedCollection(Collection<?> collection, int i8) {
        s.checkNotNullParameter(collection, "collection");
        this.collection = collection;
        this.tag = i8;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        List build;
        Set createSetBuilder;
        s.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        int i8 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i9 = 0;
        if (i8 == 0) {
            List createListBuilder = q.createListBuilder(readInt);
            while (i9 < readInt) {
                createListBuilder.add(input.readObject());
                i9++;
            }
            build = q.build(createListBuilder);
        } else {
            if (i8 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i8 + '.');
            }
            createSetBuilder = w0.createSetBuilder(readInt);
            while (i9 < readInt) {
                createSetBuilder.add(input.readObject());
                i9++;
            }
            build = w0.build(createSetBuilder);
        }
        this.collection = build;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) {
        s.checkNotNullParameter(output, "output");
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public SerializedCollection() {
        this(CollectionsKt__CollectionsKt.emptyList(), 0);
    }
}
