package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class g {
    private static final int DEFAULT_CAPACITY = 10;
    static final f[] EMPTY_ELEMENTS = new f[0];
    private boolean copyOnWrite;
    private int elementCount;
    private f[] elements;

    public g() {
        this(10);
    }

    static f[] cloneElements(f[] fVarArr) {
        return fVarArr.length < 1 ? EMPTY_ELEMENTS : (f[]) fVarArr.clone();
    }

    private void reallocate(int i8) {
        f[] fVarArr = new f[Math.max(this.elements.length, i8 + (i8 >> 1))];
        System.arraycopy(this.elements, 0, fVarArr, 0, this.elementCount);
        this.elements = fVarArr;
        this.copyOnWrite = false;
    }

    public void add(f fVar) {
        if (fVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        int length = this.elements.length;
        int i8 = this.elementCount + 1;
        if (this.copyOnWrite | (i8 > length)) {
            reallocate(i8);
        }
        this.elements[this.elementCount] = fVar;
        this.elementCount = i8;
    }

    public void addAll(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("'other' cannot be null");
        }
        int size = gVar.size();
        if (size < 1) {
            return;
        }
        int length = this.elements.length;
        int i8 = this.elementCount + size;
        int i9 = 0;
        if ((i8 > length) | this.copyOnWrite) {
            reallocate(i8);
        }
        do {
            f fVar = gVar.get(i9);
            if (fVar == null) {
                throw new NullPointerException("'other' elements cannot be null");
            }
            this.elements[this.elementCount + i9] = fVar;
            i9++;
        } while (i9 < size);
        this.elementCount = i8;
    }

    f[] copyElements() {
        int i8 = this.elementCount;
        if (i8 == 0) {
            return EMPTY_ELEMENTS;
        }
        f[] fVarArr = new f[i8];
        System.arraycopy(this.elements, 0, fVarArr, 0, i8);
        return fVarArr;
    }

    public f get(int i8) {
        if (i8 < this.elementCount) {
            return this.elements[i8];
        }
        throw new ArrayIndexOutOfBoundsException(i8 + " >= " + this.elementCount);
    }

    public int size() {
        return this.elementCount;
    }

    f[] takeElements() {
        int i8 = this.elementCount;
        if (i8 == 0) {
            return EMPTY_ELEMENTS;
        }
        f[] fVarArr = this.elements;
        if (fVarArr.length == i8) {
            this.copyOnWrite = true;
            return fVarArr;
        }
        f[] fVarArr2 = new f[i8];
        System.arraycopy(fVarArr, 0, fVarArr2, 0, i8);
        return fVarArr2;
    }

    public g(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.elements = i8 == 0 ? EMPTY_ELEMENTS : new f[i8];
        this.elementCount = 0;
        this.copyOnWrite = false;
    }
}
