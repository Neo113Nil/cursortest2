package com.realsil.sdk.core.bluetooth.compat;

import android.os.ParcelUuid;
import android.util.ArrayMap;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.realsil.sdk.core.e.b;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class CompatScanRecord {

    /* renamed from: a, reason: collision with root package name */
    public final int f15441a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15442b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15443c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f15444d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f15445e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15446f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15447g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f15448h;

    public CompatScanRecord(ArrayList arrayList, ArrayList arrayList2, SparseArray sparseArray, Map map, int i8, int i9, String str, byte[] bArr) {
        this.f15443c = arrayList2;
        this.f15442b = arrayList;
        this.f15444d = sparseArray;
        this.f15445e = map;
        this.f15447g = str;
        this.f15441a = i8;
        this.f15446f = i9;
        this.f15448h = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CompatScanRecord parseFromBytes(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
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
                    return new CompatScanRecord(arrayList, arrayList2, sparseArray, arrayMap, i8, b8, str, bArr);
                }
                int i12 = i11 - 1;
                int i13 = i9 + 2;
                int i14 = bArr[i10] & 255;
                if (i14 != 255) {
                    int i15 = 16;
                    switch (i14) {
                        case 1:
                            i8 = bArr[i13] & 255;
                            break;
                        case 2:
                        case 3:
                            int i16 = i12;
                            int i17 = i13;
                            while (i16 > 0) {
                                byte[] bArr2 = new byte[2];
                                System.arraycopy(bArr, i17, bArr2, 0, 2);
                                arrayList.add(BluetoothUuidCompat.parseUuidFrom(bArr2));
                                i16 -= 2;
                                i17 += 2;
                            }
                            break;
                        case 4:
                        case 5:
                            int i18 = i12;
                            int i19 = i13;
                            while (i18 > 0) {
                                byte[] bArr3 = new byte[4];
                                System.arraycopy(bArr, i19, bArr3, 0, 4);
                                arrayList.add(BluetoothUuidCompat.parseUuidFrom(bArr3));
                                i18 -= 4;
                                i19 += 4;
                            }
                            break;
                        case 6:
                        case 7:
                            int i20 = i12;
                            int i21 = i13;
                            while (i20 > 0) {
                                byte[] bArr4 = new byte[16];
                                System.arraycopy(bArr, i21, bArr4, 0, 16);
                                arrayList.add(BluetoothUuidCompat.parseUuidFrom(bArr4));
                                i20 -= 16;
                                i21 += 16;
                            }
                            break;
                        case 8:
                        case 9:
                            byte[] bArr5 = new byte[i12];
                            System.arraycopy(bArr, i13, bArr5, 0, i12);
                            str = new String(bArr5);
                            break;
                        case 10:
                            b8 = bArr[i13];
                            break;
                        default:
                            switch (i14) {
                                case 20:
                                    int i22 = i12;
                                    int i23 = i13;
                                    while (i22 > 0) {
                                        byte[] bArr6 = new byte[2];
                                        System.arraycopy(bArr, i23, bArr6, 0, 2);
                                        arrayList2.add(BluetoothUuidCompat.parseUuidFrom(bArr6));
                                        i22 -= 2;
                                        i23 += 2;
                                    }
                                    continue;
                                case 21:
                                    int i24 = i12;
                                    int i25 = i13;
                                    while (i24 > 0) {
                                        byte[] bArr7 = new byte[16];
                                        System.arraycopy(bArr, i25, bArr7, 0, 16);
                                        arrayList2.add(BluetoothUuidCompat.parseUuidFrom(bArr7));
                                        i24 -= 16;
                                        i25 += 16;
                                    }
                                    continue;
                                case 22:
                                    break;
                                default:
                                    switch (i14) {
                                        case 31:
                                            int i26 = i12;
                                            int i27 = i13;
                                            while (i26 > 0) {
                                                byte[] bArr8 = new byte[4];
                                                System.arraycopy(bArr, i27, bArr8, 0, 4);
                                                arrayList2.add(BluetoothUuidCompat.parseUuidFrom(bArr8));
                                                i26 -= 4;
                                                i27 += 4;
                                            }
                                            break;
                                        case 32:
                                        case 33:
                                            break;
                                        default:
                                            continue;
                                    }
                            }
                            if (i14 == 32) {
                                i15 = 4;
                            } else if (i14 != 33) {
                                i15 = 2;
                            }
                            byte[] bArr9 = new byte[i15];
                            System.arraycopy(bArr, i13, bArr9, 0, i15);
                            ParcelUuid parseUuidFrom = BluetoothUuidCompat.parseUuidFrom(bArr9);
                            int i28 = i13 + i15;
                            int i29 = i12 - i15;
                            byte[] bArr10 = new byte[i29];
                            System.arraycopy(bArr, i28, bArr10, 0, i29);
                            arrayMap.put(parseUuidFrom, bArr10);
                            break;
                    }
                } else {
                    int i30 = ((bArr[i9 + 3] & 255) << 8) + (bArr[i13] & 255);
                    int i31 = i11 - 3;
                    byte[] bArr11 = new byte[i31];
                    System.arraycopy(bArr, i9 + 4, bArr11, 0, i31);
                    sparseArray.put(i30, bArr11);
                }
                i9 = i13 + i12;
            } catch (Exception unused) {
                ZLogger.e("unable to parse scan record: " + Arrays.toString(bArr));
                return new CompatScanRecord(null, null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        if (arrayList.isEmpty()) {
        }
        return new CompatScanRecord(arrayList, arrayList2, sparseArray, arrayMap, i8, b8, str, bArr);
    }

    public int getAdvertiseFlags() {
        return this.f15441a;
    }

    public byte[] getBytes() {
        return this.f15448h;
    }

    @Nullable
    public String getDeviceName() {
        return this.f15447g;
    }

    public SparseArray<byte[]> getManufacturerSpecificData() {
        return this.f15444d;
    }

    public Map<ParcelUuid, byte[]> getServiceData() {
        return this.f15445e;
    }

    @NonNull
    public List<ParcelUuid> getServiceSolicitationUuids() {
        return this.f15443c;
    }

    public List<ParcelUuid> getServiceUuids() {
        return this.f15442b;
    }

    public int getTxPowerLevel() {
        return this.f15446f;
    }

    public String toString() {
        return "ScanRecord [mAdvertiseFlags=" + this.f15441a + ", mServiceUuids=" + this.f15442b + ", mServiceSolicitationUuids=" + this.f15443c + ", mManufacturerSpecificData=" + b.a(this.f15444d) + ", mServiceData=" + b.a(this.f15445e) + ", mTxPowerLevel=" + this.f15446f + ", mDeviceName=" + this.f15447g + "]";
    }

    @Nullable
    public byte[] getManufacturerSpecificData(int i8) {
        SparseArray sparseArray = this.f15444d;
        if (sparseArray == null) {
            return null;
        }
        return (byte[]) sparseArray.get(i8);
    }

    @Nullable
    public byte[] getServiceData(ParcelUuid parcelUuid) {
        Map map;
        if (parcelUuid == null || (map = this.f15445e) == null) {
            return null;
        }
        return (byte[]) map.get(parcelUuid);
    }
}
