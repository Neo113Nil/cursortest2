package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes.dex */
public final class FieldArray implements Cloneable {
    private static final FieldData DELETED = new FieldData();
    private FieldData[] mData;
    private int[] mFieldNumbers;
    private boolean mGarbage;
    private int mSize;

    public FieldArray() {
        this(10);
    }

    private boolean arrayEquals(int[] iArr, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    private int binarySearch(int i3) {
        int i4 = this.mSize - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = this.mFieldNumbers[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    private void gc() {
        int i3 = this.mSize;
        int[] iArr = this.mFieldNumbers;
        FieldData[] fieldDataArr = this.mData;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            FieldData fieldData = fieldDataArr[i5];
            if (fieldData != DELETED) {
                if (i5 != i4) {
                    iArr[i4] = iArr[i5];
                    fieldDataArr[i4] = fieldData;
                    fieldDataArr[i5] = null;
                }
                i4++;
            }
        }
        this.mGarbage = false;
        this.mSize = i4;
    }

    private int idealByteArraySize(int i3) {
        for (int i4 = 4; i4 < 32; i4++) {
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                return i5;
            }
        }
        return i3;
    }

    private int idealIntArraySize(int i3) {
        return idealByteArraySize(i3 * 4) / 4;
    }

    public FieldData dataAt(int i3) {
        if (this.mGarbage) {
            gc();
        }
        return this.mData[i3];
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

    public FieldData get(int i3) {
        FieldData fieldData;
        int binarySearch = binarySearch(i3);
        if (binarySearch < 0 || (fieldData = this.mData[binarySearch]) == DELETED) {
            return null;
        }
        return fieldData;
    }

    public int hashCode() {
        if (this.mGarbage) {
            gc();
        }
        int i3 = 17;
        for (int i4 = 0; i4 < this.mSize; i4++) {
            i3 = (((i3 * 31) + this.mFieldNumbers[i4]) * 31) + this.mData[i4].hashCode();
        }
        return i3;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void put(int i3, FieldData fieldData) {
        int binarySearch = binarySearch(i3);
        if (binarySearch >= 0) {
            this.mData[binarySearch] = fieldData;
            return;
        }
        int i4 = ~binarySearch;
        int i5 = this.mSize;
        if (i4 < i5) {
            FieldData[] fieldDataArr = this.mData;
            if (fieldDataArr[i4] == DELETED) {
                this.mFieldNumbers[i4] = i3;
                fieldDataArr[i4] = fieldData;
                return;
            }
        }
        if (this.mGarbage && i5 >= this.mFieldNumbers.length) {
            gc();
            i4 = ~binarySearch(i3);
        }
        int i6 = this.mSize;
        if (i6 >= this.mFieldNumbers.length) {
            int idealIntArraySize = idealIntArraySize(i6 + 1);
            int[] iArr = new int[idealIntArraySize];
            FieldData[] fieldDataArr2 = new FieldData[idealIntArraySize];
            int[] iArr2 = this.mFieldNumbers;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            FieldData[] fieldDataArr3 = this.mData;
            System.arraycopy(fieldDataArr3, 0, fieldDataArr2, 0, fieldDataArr3.length);
            this.mFieldNumbers = iArr;
            this.mData = fieldDataArr2;
        }
        int i7 = this.mSize - i4;
        if (i7 != 0) {
            int[] iArr3 = this.mFieldNumbers;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7);
            FieldData[] fieldDataArr4 = this.mData;
            System.arraycopy(fieldDataArr4, i4, fieldDataArr4, i8, this.mSize - i4);
        }
        this.mFieldNumbers[i4] = i3;
        this.mData[i4] = fieldData;
        this.mSize++;
    }

    public void remove(int i3) {
        int binarySearch = binarySearch(i3);
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

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public FieldArray(int i3) {
        this.mGarbage = false;
        int idealIntArraySize = idealIntArraySize(i3);
        this.mFieldNumbers = new int[idealIntArraySize];
        this.mData = new FieldData[idealIntArraySize];
        this.mSize = 0;
    }

    private boolean arrayEquals(FieldData[] fieldDataArr, FieldData[] fieldDataArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (!fieldDataArr[i4].equals(fieldDataArr2[i4])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final FieldArray m8clone() {
        int size = size();
        FieldArray fieldArray = new FieldArray(size);
        System.arraycopy(this.mFieldNumbers, 0, fieldArray.mFieldNumbers, 0, size);
        for (int i3 = 0; i3 < size; i3++) {
            FieldData fieldData = this.mData[i3];
            if (fieldData != null) {
                fieldArray.mData[i3] = fieldData.m9clone();
            }
        }
        fieldArray.mSize = size;
        return fieldArray;
    }
}
