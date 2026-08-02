package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes9.dex */
public abstract class AbstractMessageLite implements MessageLite {
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream newInstance = CodedOutputStream.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Serializing to a byte array threw an IOException (should never happen).", (Throwable) e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int computeRawVarint32Size = CodedOutputStream.computeRawVarint32Size(serializedSize) + serializedSize;
        if (computeRawVarint32Size > 4096) {
            computeRawVarint32Size = 4096;
        }
        CodedOutputStream newInstance = CodedOutputStream.newInstance(outputStream, computeRawVarint32Size);
        newInstance.writeRawVarint32(serializedSize);
        writeTo(newInstance);
        newInstance.flush();
    }

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {
        public static void addAll(Iterable iterable, Collection collection) {
            if (iterable instanceof LazyStringList) {
                Iterator<T> it = ((LazyStringList) iterable).getUnderlyingElements().iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                collection.addAll((Collection) iterable);
                return;
            }
            if (iterable instanceof Collection) {
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
                collection.addAll((Collection) iterable);
                return;
            }
            for (Object obj : iterable) {
                obj.getClass();
                collection.add(obj);
            }
        }

        @Override // 
        /* renamed from: clone */
        public abstract BuilderType mo4151clone();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final class LimitedInputStream extends FilterInputStream {
            public int limit;

            public LimitedInputStream(InputStream inputStream, int i) {
                super(inputStream);
                this.limit = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) {
                int i3 = this.limit;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.limit -= read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) {
                long skip = super.skip(Math.min(j, this.limit));
                if (skip >= 0) {
                    this.limit = (int) (this.limit - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() {
                if (this.limit <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.limit--;
                }
                return read;
            }
        }
    }
}
