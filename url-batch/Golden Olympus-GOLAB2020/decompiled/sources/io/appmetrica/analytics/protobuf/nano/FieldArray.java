package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes3.dex */
public final class FieldArray implements Cloneable {
    private static final FieldData DELETED = new FieldData();
    private FieldData[] mData;
    private int[] mFieldNumbers;
    private boolean mGarbage;
    private int mSize;

    FieldArray() {
        this(10);
    }

    private boolean arrayEquals(int[] iArr, int[] iArr2, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (iArr[i5] != iArr2[i5]) {
                return false;
            }
        }
        return true;
    }

    private int binarySearch(int i4) {
        int i5 = this.mSize - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = this.mFieldNumbers[i7];
            if (i8 < i4) {
                i6 = i7 + 1;
            } else {
                if (i8 <= i4) {
                    return i7;
                }
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }

    private void gc() {
        int i4 = this.mSize;
        int[] iArr = this.mFieldNumbers;
        FieldData[] fieldDataArr = this.mData;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            FieldData fieldData = fieldDataArr[i6];
            if (fieldData != DELETED) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    fieldDataArr[i5] = fieldData;
                    fieldDataArr[i6] = null;
                }
                i5++;
            }
        }
        this.mGarbage = false;
        this.mSize = i5;
    }

    private int idealByteArraySize(int i4) {
        for (int i5 = 4; i5 < 32; i5++) {
            int i6 = (1 << i5) - 12;
            if (i4 <= i6) {
                return i6;
            }
        }
        return i4;
    }

    private int idealIntArraySize(int i4) {
        return idealByteArraySize(i4 * 4) / 4;
    }

    FieldData dataAt(int i4) {
        if (this.mGarbage) {
            gc();
        }
        return this.mData[i4];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldArray)) {
            return false;
        }
        FieldArray fieldArray = (FieldArray) obj;
        return size() == fieldArray.size() && arrayEquals(this.mFieldNumbers, fieldArray.mFieldNumbers, this.mSize) && arrayEquals(this.mData, fieldArray.mData, this.mSize);
    }

    FieldData get(int i4) {
        FieldData fieldData;
        int binarySearch = binarySearch(i4);
        if (binarySearch < 0 || (fieldData = this.mData[binarySearch]) == DELETED) {
            return null;
        }
        return fieldData;
    }

    public int hashCode() {
        if (this.mGarbage) {
            gc();
        }
        int i4 = 17;
        for (int i5 = 0; i5 < this.mSize; i5++) {
            i4 = (((i4 * 31) + this.mFieldNumbers[i5]) * 31) + this.mData[i5].hashCode();
        }
        return i4;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    void put(int i4, FieldData fieldData) {
        int binarySearch = binarySearch(i4);
        if (binarySearch >= 0) {
            this.mData[binarySearch] = fieldData;
            return;
        }
        int i5 = ~binarySearch;
        int i6 = this.mSize;
        if (i5 < i6) {
            FieldData[] fieldDataArr = this.mData;
            if (fieldDataArr[i5] == DELETED) {
                this.mFieldNumbers[i5] = i4;
                fieldDataArr[i5] = fieldData;
                return;
            }
        }
        if (this.mGarbage && i6 >= this.mFieldNumbers.length) {
            gc();
            i5 = ~binarySearch(i4);
        }
        int i7 = this.mSize;
        if (i7 >= this.mFieldNumbers.length) {
            int idealIntArraySize = idealIntArraySize(i7 + 1);
            int[] iArr = new int[idealIntArraySize];
            FieldData[] fieldDataArr2 = new FieldData[idealIntArraySize];
            int[] iArr2 = this.mFieldNumbers;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            FieldData[] fieldDataArr3 = this.mData;
            System.arraycopy(fieldDataArr3, 0, fieldDataArr2, 0, fieldDataArr3.length);
            this.mFieldNumbers = iArr;
            this.mData = fieldDataArr2;
        }
        int i8 = this.mSize - i5;
        if (i8 != 0) {
            int[] iArr3 = this.mFieldNumbers;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8);
            FieldData[] fieldDataArr4 = this.mData;
            System.arraycopy(fieldDataArr4, i5, fieldDataArr4, i9, this.mSize - i5);
        }
        this.mFieldNumbers[i5] = i4;
        this.mData[i5] = fieldData;
        this.mSize++;
    }

    void remove(int i4) {
        int binarySearch = binarySearch(i4);
        if (binarySearch >= 0) {
            FieldData[] fieldDataArr = this.mData;
            FieldData fieldData = fieldDataArr[binarySearch];
            FieldData fieldData2 = DELETED;
            if (fieldData != fieldData2) {
                fieldDataArr[binarySearch] = fieldData2;
                this.mGarbage = true;
            }
        }
    }

    int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    FieldArray(int i4) {
        this.mGarbage = false;
        int idealIntArraySize = idealIntArraySize(i4);
        this.mFieldNumbers = new int[idealIntArraySize];
        this.mData = new FieldData[idealIntArraySize];
        this.mSize = 0;
    }

    private boolean arrayEquals(FieldData[] fieldDataArr, FieldData[] fieldDataArr2, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (!fieldDataArr[i5].equals(fieldDataArr2[i5])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final FieldArray m240clone() {
        int size = size();
        FieldArray fieldArray = new FieldArray(size);
        System.arraycopy(this.mFieldNumbers, 0, fieldArray.mFieldNumbers, 0, size);
        for (int i4 = 0; i4 < size; i4++) {
            FieldData fieldData = this.mData[i4];
            if (fieldData != null) {
                fieldArray.mData[i4] = fieldData.m241clone();
            }
        }
        fieldArray.mSize = size;
        return fieldArray;
    }
}
