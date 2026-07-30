package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class Bytes {

    @GwtCompatible
    private static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        ByteArrayAsList(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Byte) && Bytes.indexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteArrayAsList)) {
                return super.equals(obj);
            }
            ByteArrayAsList byteArrayAsList = (ByteArrayAsList) obj;
            int size = size();
            if (byteArrayAsList.size() != size) {
                return false;
            }
            for (int i8 = 0; i8 < size; i8++) {
                if (this.array[this.start + i8] != byteArrayAsList.array[byteArrayAsList.start + i8]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i8 = 1;
            for (int i9 = this.start; i9 < this.end; i9++) {
                i8 = (i8 * 31) + Bytes.hashCode(this.array[i9]);
            }
            return i8;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int indexOf;
            if (!(obj instanceof Byte) || (indexOf = Bytes.indexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return indexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int lastIndexOf;
            if (!(obj instanceof Byte) || (lastIndexOf = Bytes.lastIndexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i8, int i9) {
            Preconditions.checkPositionIndexes(i8, i9, size());
            if (i8 == i9) {
                return Collections.emptyList();
            }
            byte[] bArr = this.array;
            int i10 = this.start;
            return new ByteArrayAsList(bArr, i8 + i10, i10 + i9);
        }

        byte[] toByteArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append((int) this.array[this.start]);
            int i8 = this.start;
            while (true) {
                i8++;
                if (i8 >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.array[i8]);
            }
        }

        ByteArrayAsList(byte[] bArr, int i8, int i9) {
            this.array = bArr;
            this.start = i8;
            this.end = i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int i8) {
            Preconditions.checkElementIndex(i8, size());
            return Byte.valueOf(this.array[this.start + i8]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte set(int i8, Byte b8) {
            Preconditions.checkElementIndex(i8, size());
            byte[] bArr = this.array;
            int i9 = this.start;
            byte b9 = bArr[i9 + i8];
            bArr[i9 + i8] = ((Byte) Preconditions.checkNotNull(b8)).byteValue();
            return Byte.valueOf(b9);
        }
    }

    private Bytes() {
    }

    public static List<Byte> asList(byte... bArr) {
        return bArr.length == 0 ? Collections.emptyList() : new ByteArrayAsList(bArr);
    }

    public static byte[] concat(byte[]... bArr) {
        int i8 = 0;
        for (byte[] bArr2 : bArr) {
            i8 += bArr2.length;
        }
        byte[] bArr3 = new byte[i8];
        int i9 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
            i9 += bArr4.length;
        }
        return bArr3;
    }

    public static boolean contains(byte[] bArr, byte b8) {
        for (byte b9 : bArr) {
            if (b9 == b8) {
                return true;
            }
        }
        return false;
    }

    public static byte[] ensureCapacity(byte[] bArr, int i8, int i9) {
        Preconditions.checkArgument(i8 >= 0, "Invalid minLength: %s", i8);
        Preconditions.checkArgument(i9 >= 0, "Invalid padding: %s", i9);
        return bArr.length < i8 ? Arrays.copyOf(bArr, i8 + i9) : bArr;
    }

    public static int hashCode(byte b8) {
        return b8;
    }

    public static int indexOf(byte[] bArr, byte b8) {
        return indexOf(bArr, b8, 0, bArr.length);
    }

    public static int lastIndexOf(byte[] bArr, byte b8) {
        return lastIndexOf(bArr, b8, 0, bArr.length);
    }

    public static void reverse(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        reverse(bArr, 0, bArr.length);
    }

    public static byte[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ByteArrayAsList) {
            return ((ByteArrayAsList) collection).toByteArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr[i8] = ((Number) Preconditions.checkNotNull(array[i8])).byteValue();
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(byte[] bArr, byte b8, int i8, int i9) {
        while (i8 < i9) {
            if (bArr[i8] == b8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(byte[] bArr, byte b8, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (bArr[i10] == b8) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(byte[] bArr, byte[] bArr2) {
        Preconditions.checkNotNull(bArr, "array");
        Preconditions.checkNotNull(bArr2, "target");
        if (bArr2.length == 0) {
            return 0;
        }
        int i8 = 0;
        while (i8 < (bArr.length - bArr2.length) + 1) {
            for (int i9 = 0; i9 < bArr2.length; i9++) {
                if (bArr[i8 + i9] != bArr2[i9]) {
                    break;
                }
            }
            return i8;
        }
        return -1;
    }

    public static void reverse(byte[] bArr, int i8, int i9) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i8, i9, bArr.length);
        for (int i10 = i9 - 1; i8 < i10; i10--) {
            byte b8 = bArr[i8];
            bArr[i8] = bArr[i10];
            bArr[i10] = b8;
            i8++;
        }
    }
}
