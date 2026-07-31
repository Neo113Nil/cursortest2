package com.huawei.hms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    private static void a(Parcel parcel, int i4, int i5) {
        if (parcel == null) {
            return;
        }
        if (i5 < 65535) {
            parcel.writeInt(i4 | (i5 << 16));
        } else {
            parcel.writeInt(i4 | (-65536));
            parcel.writeInt(i5);
        }
    }

    private static void b(Parcel parcel, int i4) {
        if (parcel == null) {
            return;
        }
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(dataPosition - i4);
        parcel.setDataPosition(dataPosition);
    }

    public static int beginObjectHeader(Parcel parcel) {
        return a(parcel, 20293);
    }

    public static void finishObjectHeader(Parcel parcel, int i4) {
        b(parcel, i4);
    }

    public static void writeBigDecimal(Parcel parcel, int i4, BigDecimal bigDecimal, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (bigDecimal == null) {
            if (z4) {
                a(parcel, i4, 0);
            }
        } else {
            int a4 = a(parcel, i4);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            b(parcel, a4);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int i4, BigDecimal[] bigDecimalArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (bigDecimalArr == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i5 = 0; i5 < length; i5++) {
            parcel.writeByteArray(bigDecimalArr[i5].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i5].scale());
        }
        b(parcel, a4);
    }

    public static void writeBigInteger(Parcel parcel, int i4, BigInteger bigInteger, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (bigInteger != null) {
            int a4 = a(parcel, i4);
            parcel.writeByteArray(bigInteger.toByteArray());
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int i4, BigInteger[] bigIntegerArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (bigIntegerArr == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        b(parcel, a4);
    }

    public static void writeBoolean(Parcel parcel, int i4, boolean z4) {
        if (parcel == null) {
            return;
        }
        a(parcel, i4, 4);
        if (z4) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public static void writeBooleanArray(Parcel parcel, int i4, boolean[] zArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (zArr != null) {
            int a4 = a(parcel, i4);
            parcel.writeBooleanArray(zArr);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeBooleanList(Parcel parcel, int i4, List<Boolean> list, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (list == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(list.get(i5).booleanValue() ? 1 : 0);
        }
        b(parcel, a4);
    }

    public static void writeBooleanObject(Parcel parcel, int i4, Boolean bool, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (bool != null) {
            a(parcel, i4, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int i4, Bundle bundle, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (bundle != null) {
            int a4 = a(parcel, i4);
            parcel.writeBundle(bundle);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeByte(Parcel parcel, int i4, byte b4) {
        if (parcel == null) {
            return;
        }
        a(parcel, i4, 4);
        parcel.writeInt(b4);
    }

    public static void writeByteArray(Parcel parcel, int i4, byte[] bArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (bArr != null) {
            int a4 = a(parcel, i4);
            parcel.writeByteArray(bArr);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int i4, byte[][] bArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (bArr == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        b(parcel, a4);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i4, SparseArray<byte[]> sparseArray, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (sparseArray == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeByteArray(sparseArray.valueAt(i5));
        }
        b(parcel, a4);
    }

    public static void writeChar(Parcel parcel, int i4, char c4) {
        if (parcel == null) {
            return;
        }
        a(parcel, i4, 4);
        parcel.writeInt(c4);
    }

    public static void writeCharArray(Parcel parcel, int i4, char[] cArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (cArr != null) {
            int a4 = a(parcel, i4);
            parcel.writeCharArray(cArr);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeDouble(Parcel parcel, int i4, double d4) {
        if (parcel == null) {
            return;
        }
        a(parcel, i4, 8);
        parcel.writeDouble(d4);
    }

    public static void writeDoubleArray(Parcel parcel, int i4, double[] dArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (dArr != null) {
            int a4 = a(parcel, i4);
            parcel.writeDoubleArray(dArr);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeDoubleList(Parcel parcel, int i4, List<Double> list, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (list == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeDouble(list.get(i5).doubleValue());
        }
        b(parcel, a4);
    }

    public static void writeDoubleObject(Parcel parcel, int i4, Double d4, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (d4 != null) {
            a(parcel, i4, 8);
            parcel.writeDouble(d4.doubleValue());
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i4, SparseArray<Double> sparseArray, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (sparseArray == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeDouble(sparseArray.valueAt(i5).doubleValue());
        }
        b(parcel, a4);
    }

    public static void writeFloat(Parcel parcel, int i4, float f4) {
        if (parcel == null) {
            return;
        }
        a(parcel, i4, 4);
        parcel.writeFloat(f4);
    }

    public static void writeFloatArray(Parcel parcel, int i4, float[] fArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (fArr != null) {
            int a4 = a(parcel, i4);
            parcel.writeFloatArray(fArr);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeFloatList(Parcel parcel, int i4, List<Float> list, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (list == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeFloat(list.get(i5).floatValue());
        }
        b(parcel, a4);
    }

    public static void writeFloatObject(Parcel parcel, int i4, Float f4, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (f4 != null) {
            a(parcel, i4, 4);
            parcel.writeFloat(f4.floatValue());
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int i4, SparseArray<Float> sparseArray, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (sparseArray == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeFloat(sparseArray.valueAt(i5).floatValue());
        }
        b(parcel, a4);
    }

    public static void writeIBinder(Parcel parcel, int i4, IBinder iBinder, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (iBinder != null) {
            int a4 = a(parcel, i4);
            parcel.writeStrongBinder(iBinder);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int i4, IBinder[] iBinderArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (iBinderArr != null) {
            int a4 = a(parcel, i4);
            parcel.writeBinderArray(iBinderArr);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeIBinderList(Parcel parcel, int i4, List<IBinder> list, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (list != null) {
            int a4 = a(parcel, i4);
            parcel.writeBinderList(list);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i4, SparseArray<IBinder> sparseArray, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (sparseArray == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeStrongBinder(sparseArray.valueAt(i5));
        }
        b(parcel, a4);
    }

    public static void writeInt(Parcel parcel, int i4, int i5) {
        if (parcel == null) {
            return;
        }
        a(parcel, i4, 4);
        parcel.writeInt(i5);
    }

    public static void writeIntArray(Parcel parcel, int i4, int[] iArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (iArr != null) {
            int a4 = a(parcel, i4);
            parcel.writeIntArray(iArr);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeIntegerList(Parcel parcel, int i4, List<Integer> list, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (list == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(list.get(i5).intValue());
        }
        b(parcel, a4);
    }

    public static void writeIntegerObject(Parcel parcel, int i4, Integer num, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (num != null) {
            a(parcel, i4, 4);
            parcel.writeInt(num.intValue());
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeList(Parcel parcel, int i4, List list, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (list != null) {
            int a4 = a(parcel, i4);
            parcel.writeList(list);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeLong(Parcel parcel, int i4, long j4) {
        if (parcel == null) {
            return;
        }
        a(parcel, i4, 8);
        parcel.writeLong(j4);
    }

    public static void writeLongArray(Parcel parcel, int i4, long[] jArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (jArr != null) {
            int a4 = a(parcel, i4);
            parcel.writeLongArray(jArr);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeLongList(Parcel parcel, int i4, List<Long> list, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (list == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeLong(list.get(i5).longValue());
        }
        b(parcel, a4);
    }

    public static void writeLongObject(Parcel parcel, int i4, Long l4, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (l4 != null) {
            a(parcel, i4, 8);
            parcel.writeLong(l4.longValue());
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int i4, Parcel parcel2, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (parcel2 != null) {
            int a4 = a(parcel, i4);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeParcelArray(Parcel parcel, int i4, Parcel[] parcelArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (parcelArr == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int length = parcelArr.length;
        parcel.writeInt(length);
        for (int i5 = 0; i5 < length; i5++) {
            Parcel parcel2 = parcelArr[i5];
            if (parcel2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(parcel2.dataSize());
                Parcel parcel3 = parcelArr[i5];
                parcel.appendFrom(parcel3, 0, parcel3.dataSize());
            }
        }
        b(parcel, a4);
    }

    public static void writeParcelList(Parcel parcel, int i4, List<Parcel> list, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (list == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcel parcel2 = list.get(i5);
            if (parcel2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            }
        }
        b(parcel, a4);
    }

    public static void writeParcelSparseArray(Parcel parcel, int i4, SparseArray<Parcel> sparseArray, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (sparseArray == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            Parcel valueAt = sparseArray.valueAt(i5);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            }
        }
        b(parcel, a4);
    }

    public static void writeParcelable(Parcel parcel, int i4, Parcelable parcelable, int i5, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (parcelable != null) {
            int a4 = a(parcel, i4);
            parcelable.writeToParcel(parcel, i5);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeShort(Parcel parcel, int i4, short s4) {
        if (parcel == null) {
            return;
        }
        a(parcel, i4, 4);
        parcel.writeInt(s4);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i4, SparseBooleanArray sparseBooleanArray, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (sparseBooleanArray != null) {
            int a4 = a(parcel, i4);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeSparseIntArray(Parcel parcel, int i4, SparseIntArray sparseIntArray, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (sparseIntArray == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseIntArray.keyAt(i5));
            parcel.writeInt(sparseIntArray.valueAt(i5));
        }
        b(parcel, a4);
    }

    public static void writeSparseLongArray(Parcel parcel, int i4, SparseLongArray sparseLongArray, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (sparseLongArray == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseLongArray.keyAt(i5));
            parcel.writeLong(sparseLongArray.valueAt(i5));
        }
        b(parcel, a4);
    }

    public static void writeString(Parcel parcel, int i4, String str, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (str != null) {
            int a4 = a(parcel, i4);
            parcel.writeString(str);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeStringArray(Parcel parcel, int i4, String[] strArr, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (strArr != null) {
            int a4 = a(parcel, i4);
            parcel.writeStringArray(strArr);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeStringList(Parcel parcel, int i4, List<String> list, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (list != null) {
            int a4 = a(parcel, i4);
            parcel.writeStringList(list);
            b(parcel, a4);
        } else if (z4) {
            a(parcel, i4, 0);
        }
    }

    public static void writeStringSparseArray(Parcel parcel, int i4, SparseArray<String> sparseArray, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (sparseArray == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeString(sparseArray.valueAt(i5));
        }
        b(parcel, a4);
    }

    public static <P extends Parcelable> void writeTypedArray(Parcel parcel, int i4, P[] pArr, int i5, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (pArr == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        parcel.writeInt(a4);
        for (P p4 : pArr) {
            if (p4 != null) {
                a(parcel, p4, i5);
            } else {
                parcel.writeInt(0);
            }
        }
        b(parcel, a4);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i4, List<T> list, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (list == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            T t4 = list.get(i5);
            if (t4 != null) {
                a(parcel, t4, 0);
            } else {
                parcel.writeInt(0);
            }
        }
        b(parcel, a4);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i4, SparseArray<T> sparseArray, boolean z4) {
        if (parcel == null) {
            return;
        }
        if (sparseArray == null) {
            if (z4) {
                a(parcel, i4, 0);
                return;
            }
            return;
        }
        int a4 = a(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            T valueAt = sparseArray.valueAt(i5);
            if (valueAt != null) {
                a(parcel, valueAt, 0);
            } else {
                parcel.writeInt(0);
            }
        }
        b(parcel, a4);
    }

    private static int a(Parcel parcel, int i4) {
        parcel.writeInt(i4 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static <P extends Parcelable> void a(Parcel parcel, P p4, int i4) {
        if (parcel == null) {
            return;
        }
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        p4.writeToParcel(parcel, i4);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
