package io.reactivex.internal.util;

/* loaded from: classes3.dex */
public final class OpenHashSet<T> {
    private static final int INT_PHI = -1640531527;
    T[] keys;
    final float loadFactor;
    int mask;
    int maxSize;
    int size;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    static int mix(int i8) {
        int i9 = i8 * INT_PHI;
        return i9 ^ (i9 >>> 16);
    }

    public boolean add(T t7) {
        T t8;
        T[] tArr = this.keys;
        int i8 = this.mask;
        int mix = mix(t7.hashCode()) & i8;
        T t9 = tArr[mix];
        if (t9 != null) {
            if (t9.equals(t7)) {
                return false;
            }
            do {
                mix = (mix + 1) & i8;
                t8 = tArr[mix];
                if (t8 == null) {
                }
            } while (!t8.equals(t7));
            return false;
        }
        tArr[mix] = t7;
        int i9 = this.size + 1;
        this.size = i9;
        if (i9 >= this.maxSize) {
            rehash();
        }
        return true;
    }

    public Object[] keys() {
        return this.keys;
    }

    void rehash() {
        T t7;
        T[] tArr = this.keys;
        int length = tArr.length;
        int i8 = length << 1;
        int i9 = i8 - 1;
        T[] tArr2 = (T[]) new Object[i8];
        int i10 = this.size;
        while (true) {
            int i11 = i10 - 1;
            if (i10 == 0) {
                this.mask = i9;
                this.maxSize = (int) (i8 * this.loadFactor);
                this.keys = tArr2;
                return;
            }
            do {
                length--;
                t7 = tArr[length];
            } while (t7 == null);
            int mix = mix(t7.hashCode()) & i9;
            if (tArr2[mix] != null) {
                do {
                    mix = (mix + 1) & i9;
                } while (tArr2[mix] != null);
            }
            tArr2[mix] = tArr[length];
            i10 = i11;
        }
    }

    public boolean remove(T t7) {
        T t8;
        T[] tArr = this.keys;
        int i8 = this.mask;
        int mix = mix(t7.hashCode()) & i8;
        T t9 = tArr[mix];
        if (t9 == null) {
            return false;
        }
        if (t9.equals(t7)) {
            return removeEntry(mix, tArr, i8);
        }
        do {
            mix = (mix + 1) & i8;
            t8 = tArr[mix];
            if (t8 == null) {
                return false;
            }
        } while (!t8.equals(t7));
        return removeEntry(mix, tArr, i8);
    }

    boolean removeEntry(int i8, T[] tArr, int i9) {
        int i10;
        T t7;
        this.size--;
        while (true) {
            int i11 = i8 + 1;
            while (true) {
                i10 = i11 & i9;
                t7 = tArr[i10];
                if (t7 == null) {
                    tArr[i8] = null;
                    return true;
                }
                int mix = mix(t7.hashCode()) & i9;
                if (i8 > i10) {
                    if (i8 >= mix && mix > i10) {
                        break;
                    }
                    i11 = i10 + 1;
                } else if (i8 < mix && mix <= i10) {
                    i11 = i10 + 1;
                }
            }
            tArr[i8] = t7;
            i8 = i10;
        }
    }

    public int size() {
        return this.size;
    }

    public OpenHashSet(int i8) {
        this(i8, 0.75f);
    }

    public OpenHashSet(int i8, float f8) {
        this.loadFactor = f8;
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i8);
        this.mask = roundToPowerOfTwo - 1;
        this.maxSize = (int) (f8 * roundToPowerOfTwo);
        this.keys = (T[]) new Object[roundToPowerOfTwo];
    }
}
