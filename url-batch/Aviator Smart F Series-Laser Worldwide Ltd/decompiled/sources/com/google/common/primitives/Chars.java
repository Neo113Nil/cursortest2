package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import okhttp3.internal.ws.WebSocketProtocol;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Chars {
    public static final int BYTES = 2;

    @GwtCompatible
    private static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final char[] array;
        final int end;
        final int start;

        CharArrayAsList(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Character) && Chars.indexOf(this.array, ((Character) obj).charValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i8 = 0; i8 < size; i8++) {
                if (this.array[this.start + i8] != charArrayAsList.array[charArrayAsList.start + i8]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i8 = 1;
            for (int i9 = this.start; i9 < this.end; i9++) {
                i8 = (i8 * 31) + Chars.hashCode(this.array[i9]);
            }
            return i8;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int indexOf;
            if (!(obj instanceof Character) || (indexOf = Chars.indexOf(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Character) || (lastIndexOf = Chars.lastIndexOf(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return lastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i8, int i9) {
            Preconditions.checkPositionIndexes(i8, i9, size());
            if (i8 == i9) {
                return Collections.emptyList();
            }
            char[] cArr = this.array;
            int i10 = this.start;
            return new CharArrayAsList(cArr, i8 + i10, i10 + i9);
        }

        char[] toCharArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i8 = this.start;
            while (true) {
                i8++;
                if (i8 >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.array[i8]);
            }
        }

        CharArrayAsList(char[] cArr, int i8, int i9) {
            this.array = cArr;
            this.start = i8;
            this.end = i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i8) {
            Preconditions.checkElementIndex(i8, size());
            return Character.valueOf(this.array[this.start + i8]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Character set(int i8, Character ch) {
            Preconditions.checkElementIndex(i8, size());
            char[] cArr = this.array;
            int i9 = this.start;
            char c8 = cArr[i9 + i8];
            cArr[i9 + i8] = ((Character) Preconditions.checkNotNull(ch)).charValue();
            return Character.valueOf(c8);
        }
    }

    private enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int min = Math.min(cArr.length, cArr2.length);
            for (int i8 = 0; i8 < min; i8++) {
                int compare = Chars.compare(cArr[i8], cArr2[i8]);
                if (compare != 0) {
                    return compare;
                }
            }
            return cArr.length - cArr2.length;
        }
    }

    private Chars() {
    }

    public static List<Character> asList(char... cArr) {
        return cArr.length == 0 ? Collections.emptyList() : new CharArrayAsList(cArr);
    }

    public static char checkedCast(long j8) {
        char c8 = (char) j8;
        Preconditions.checkArgument(((long) c8) == j8, "Out of range: %s", j8);
        return c8;
    }

    public static int compare(char c8, char c9) {
        return c8 - c9;
    }

    public static char[] concat(char[]... cArr) {
        int i8 = 0;
        for (char[] cArr2 : cArr) {
            i8 += cArr2.length;
        }
        char[] cArr3 = new char[i8];
        int i9 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, i9, cArr4.length);
            i9 += cArr4.length;
        }
        return cArr3;
    }

    @Beta
    public static char constrainToRange(char c8, char c9, char c10) {
        Preconditions.checkArgument(c9 <= c10, "min (%s) must be less than or equal to max (%s)", c9, c10);
        return c8 < c9 ? c9 : c8 < c10 ? c8 : c10;
    }

    public static boolean contains(char[] cArr, char c8) {
        for (char c9 : cArr) {
            if (c9 == c8) {
                return true;
            }
        }
        return false;
    }

    public static char[] ensureCapacity(char[] cArr, int i8, int i9) {
        Preconditions.checkArgument(i8 >= 0, "Invalid minLength: %s", i8);
        Preconditions.checkArgument(i9 >= 0, "Invalid padding: %s", i9);
        return cArr.length < i8 ? Arrays.copyOf(cArr, i8 + i9) : cArr;
    }

    @GwtIncompatible
    public static char fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    @GwtIncompatible
    public static char fromBytes(byte b8, byte b9) {
        return (char) ((b8 << 8) | (b9 & 255));
    }

    public static int hashCode(char c8) {
        return c8;
    }

    public static int indexOf(char[] cArr, char c8) {
        return indexOf(cArr, c8, 0, cArr.length);
    }

    public static String join(String str, char... cArr) {
        Preconditions.checkNotNull(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder((str.length() * (length - 1)) + length);
        sb.append(cArr[0]);
        for (int i8 = 1; i8 < length; i8++) {
            sb.append(str);
            sb.append(cArr[i8]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(char[] cArr, char c8) {
        return lastIndexOf(cArr, c8, 0, cArr.length);
    }

    public static Comparator<char[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static char max(char... cArr) {
        Preconditions.checkArgument(cArr.length > 0);
        char c8 = cArr[0];
        for (int i8 = 1; i8 < cArr.length; i8++) {
            char c9 = cArr[i8];
            if (c9 > c8) {
                c8 = c9;
            }
        }
        return c8;
    }

    public static char min(char... cArr) {
        Preconditions.checkArgument(cArr.length > 0);
        char c8 = cArr[0];
        for (int i8 = 1; i8 < cArr.length; i8++) {
            char c9 = cArr[i8];
            if (c9 < c8) {
                c8 = c9;
            }
        }
        return c8;
    }

    public static void reverse(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        reverse(cArr, 0, cArr.length);
    }

    public static char saturatedCast(long j8) {
        if (j8 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return (char) 65535;
        }
        if (j8 < 0) {
            return (char) 0;
        }
        return (char) j8;
    }

    public static void sortDescending(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        sortDescending(cArr, 0, cArr.length);
    }

    public static char[] toArray(Collection<Character> collection) {
        if (collection instanceof CharArrayAsList) {
            return ((CharArrayAsList) collection).toCharArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = ((Character) Preconditions.checkNotNull(array[i8])).charValue();
        }
        return cArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(char c8) {
        return new byte[]{(byte) (c8 >> '\b'), (byte) c8};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(char[] cArr, char c8, int i8, int i9) {
        while (i8 < i9) {
            if (cArr[i8] == c8) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(char[] cArr, char c8, int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            if (cArr[i10] == c8) {
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
    public static int indexOf(char[] cArr, char[] cArr2) {
        Preconditions.checkNotNull(cArr, "array");
        Preconditions.checkNotNull(cArr2, "target");
        if (cArr2.length == 0) {
            return 0;
        }
        int i8 = 0;
        while (i8 < (cArr.length - cArr2.length) + 1) {
            for (int i9 = 0; i9 < cArr2.length; i9++) {
                if (cArr[i8 + i9] != cArr2[i9]) {
                    break;
                }
            }
            return i8;
        }
        return -1;
    }

    public static void reverse(char[] cArr, int i8, int i9) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i8, i9, cArr.length);
        for (int i10 = i9 - 1; i8 < i10; i10--) {
            char c8 = cArr[i8];
            cArr[i8] = cArr[i10];
            cArr[i10] = c8;
            i8++;
        }
    }

    public static void sortDescending(char[] cArr, int i8, int i9) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i8, i9, cArr.length);
        Arrays.sort(cArr, i8, i9);
        reverse(cArr, i8, i9);
    }
}
