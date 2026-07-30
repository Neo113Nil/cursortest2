package com.realsil.sdk.core.bluetooth.scanner;

import android.os.ParcelUuid;
import android.util.ArrayMap;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.e.b;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class SpecScanRecord {

    /* renamed from: a, reason: collision with root package name */
    public final int f15604a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15605b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f15606c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f15607d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15608e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15609f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f15610g;

    public SpecScanRecord(ArrayList arrayList, SparseArray sparseArray, Map map, int i8, int i9, String str, byte[] bArr) {
        this.f15605b = arrayList;
        this.f15606c = sparseArray;
        this.f15607d = map;
        this.f15609f = str;
        this.f15604a = i8;
        this.f15608e = i9;
        this.f15610g = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpecScanRecord parseFromBytes(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        ArrayMap arrayMap = new ArrayMap();
        int i8 = -1;
        byte b8 = -2147483648;
        String str = null;
        int i9 = 0;
        while (i9 < bArr.length) {
            try {
                int i10 = i9 + 1;
                int i11 = bArr[i9] & 255;
                if (i11 == 0) {
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    return new SpecScanRecord(arrayList, sparseArray, arrayMap, i8, b8, str, bArr);
                }
                int i12 = i11 - 1;
                int i13 = i9 + 2;
                int i14 = bArr[i10] & 255;
                int i15 = 2;
                if (i14 != 22) {
                    if (i14 == 255) {
                        int i16 = ((bArr[i9 + 3] & 255) << 8) + (bArr[i13] & 255);
                        int i17 = i11 - 3;
                        byte[] bArr2 = new byte[i17];
                        System.arraycopy(bArr, i9 + 4, bArr2, 0, i17);
                        sparseArray.put(i16, bArr2);
                    } else if (i14 != 32 && i14 != 33) {
                        switch (i14) {
                            case 1:
                                i8 = bArr[i13] & 255;
                                break;
                            case 2:
                            case 3:
                                int i18 = i12;
                                int i19 = i13;
                                while (i18 > 0) {
                                    byte[] bArr3 = new byte[2];
                                    System.arraycopy(bArr, i19, bArr3, 0, 2);
                                    arrayList.add(BluetoothUuidCompat.parseUuidFrom(bArr3));
                                    i18 -= 2;
                                    i19 += 2;
                                }
                                break;
                            case 4:
                            case 5:
                                int i20 = i12;
                                int i21 = i13;
                                while (i20 > 0) {
                                    byte[] bArr4 = new byte[4];
                                    System.arraycopy(bArr, i21, bArr4, 0, 4);
                                    arrayList.add(BluetoothUuidCompat.parseUuidFrom(bArr4));
                                    i20 -= 4;
                                    i21 += 4;
                                }
                                break;
                            case 6:
                            case 7:
                                int i22 = i12;
                                int i23 = i13;
                                while (i22 > 0) {
                                    byte[] bArr5 = new byte[16];
                                    System.arraycopy(bArr, i23, bArr5, 0, 16);
                                    arrayList.add(BluetoothUuidCompat.parseUuidFrom(bArr5));
                                    i22 -= 16;
                                    i23 += 16;
                                }
                                break;
                            case 8:
                            case 9:
                                byte[] bArr6 = new byte[i12];
                                System.arraycopy(bArr, i13, bArr6, 0, i12);
                                str = new String(bArr6);
                                break;
                            case 10:
                                b8 = bArr[i13];
                                break;
                        }
                    }
                    i9 = i13 + i12;
                }
                if (i14 == 32) {
                    i15 = 4;
                } else if (i14 == 33) {
                    i15 = 16;
                }
                byte[] bArr7 = new byte[i15];
                System.arraycopy(bArr, i13, bArr7, 0, i15);
                ParcelUuid parseUuidFrom = BluetoothUuidCompat.parseUuidFrom(bArr7);
                int i24 = i13 + i15;
                int i25 = i12 - i15;
                byte[] bArr8 = new byte[i25];
                System.arraycopy(bArr, i24, bArr8, 0, i25);
                arrayMap.put(parseUuidFrom, bArr8);
                i9 = i13 + i12;
            } catch (Exception unused) {
                ZLogger.w("unable to parse scan record: " + Arrays.toString(bArr));
                return new SpecScanRecord(null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        if (arrayList.isEmpty()) {
        }
        return new SpecScanRecord(arrayList, sparseArray, arrayMap, i8, b8, str, bArr);
    }

    public int getAdvertiseFlags() {
        return this.f15604a;
    }

    public byte[] getBytes() {
        return this.f15610g;
    }

    @Nullable
    public String getDeviceName() {
        return this.f15609f;
    }

    public SparseArray<byte[]> getManufacturerSpecificData() {
        return this.f15606c;
    }

    public Map<ParcelUuid, byte[]> getServiceData() {
        return this.f15607d;
    }

    public List<ParcelUuid> getServiceUuids() {
        return this.f15605b;
    }

    public int getTxPowerLevel() {
        return this.f15608e;
    }

    public String toString() {
        return "ScanRecord [mAdvertiseFlags=" + this.f15604a + ", mServiceUuids=" + this.f15605b + "\n, mManufacturerSpecificData=" + b.a(this.f15606c) + ", mServiceData=" + b.a(this.f15607d) + ", mTxPowerLevel=" + this.f15608e + ", mDeviceName=" + this.f15609f + "]";
    }

    @Nullable
    public byte[] getManufacturerSpecificData(int i8) {
        SparseArray sparseArray = this.f15606c;
        if (sparseArray != null) {
            return (byte[]) sparseArray.get(i8);
        }
        return null;
    }

    @Nullable
    public byte[] getServiceData(ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            return null;
        }
        return (byte[]) this.f15607d.get(parcelUuid);
    }
}
