package com.realsil.sdk.core.bluetooth.scanner.compat;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.realsil.sdk.core.bluetooth.compat.BluetoothAdapterCompat;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.utility.BitUtils;
import com.realsil.sdk.core.utility.StringUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class CompatScanFilter implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final String f15611a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15612b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15613c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15614d;

    /* renamed from: e, reason: collision with root package name */
    public final ParcelUuid f15615e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelUuid f15616f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelUuid f15617g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelUuid f15618h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelUuid f15619i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f15620j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f15621k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15622l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f15623m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f15624n;
    public static final CompatScanFilter EMPTY = new Builder().build();

    @NonNull
    public static final Parcelable.Creator<CompatScanFilter> CREATOR = new Parcelable.Creator<CompatScanFilter>() { // from class: com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CompatScanFilter createFromParcel(Parcel parcel) {
            Builder builder = new Builder();
            if (parcel.readInt() == 1) {
                builder.setDeviceName(parcel.readString());
            }
            String readString = parcel.readInt() == 1 ? parcel.readString() : null;
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                builder.setServiceUuid(parcelUuid);
                if (parcel.readInt() == 1) {
                    builder.setServiceUuid(parcelUuid, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                builder.setServiceSolicitationUuid(parcelUuid2);
                if (parcel.readInt() == 1) {
                    builder.setServiceSolicitationUuid(parcelUuid2, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid3 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        builder.setServiceData(parcelUuid3, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        builder.setServiceData(parcelUuid3, bArr, bArr2);
                    }
                }
            }
            int readInt = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    builder.setManufacturerData(readInt, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    builder.setManufacturerData(readInt, bArr3, bArr4);
                }
            }
            if (readString != null) {
                int readInt2 = parcel.readInt();
                if (parcel.readInt() == 1) {
                    byte[] bArr5 = new byte[16];
                    parcel.readByteArray(bArr5);
                    builder.a(readString, readInt2, bArr5);
                } else {
                    builder.setDeviceAddress(readString, readInt2);
                }
            }
            return builder.build();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CompatScanFilter[] newArray(int i8) {
            return new CompatScanFilter[i8];
        }
    };

    public static final class Builder {
        public static final int LEN_IRK_OCTETS = 16;

        /* renamed from: a, reason: collision with root package name */
        public String f15625a;

        /* renamed from: b, reason: collision with root package name */
        public String f15626b;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f15628d;

        /* renamed from: e, reason: collision with root package name */
        public ParcelUuid f15629e;

        /* renamed from: f, reason: collision with root package name */
        public ParcelUuid f15630f;

        /* renamed from: g, reason: collision with root package name */
        public ParcelUuid f15631g;

        /* renamed from: h, reason: collision with root package name */
        public ParcelUuid f15632h;

        /* renamed from: i, reason: collision with root package name */
        public ParcelUuid f15633i;

        /* renamed from: j, reason: collision with root package name */
        public byte[] f15634j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f15635k;

        /* renamed from: m, reason: collision with root package name */
        public byte[] f15637m;

        /* renamed from: n, reason: collision with root package name */
        public byte[] f15638n;

        /* renamed from: c, reason: collision with root package name */
        public int f15627c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f15636l = -1;

        public final Builder a(String str, int i8, byte[] bArr) {
            if (!BluetoothAdapter.checkBluetoothAddress(str)) {
                throw new IllegalArgumentException("invalid device address " + str);
            }
            if (i8 < 0 || i8 > 1) {
                throw new IllegalArgumentException("'addressType' is invalid!");
            }
            if (i8 == 1 && bArr != null && !StringUtils.isEmpty(str) && !BluetoothAdapterCompat.isAddressRandomStatic(str)) {
                throw new IllegalArgumentException("Invalid combination: IRK requires either a PUBLIC or RANDOM (STATIC) Address");
            }
            this.f15626b = str;
            this.f15627c = i8;
            this.f15628d = bArr;
            return this;
        }

        public CompatScanFilter build() {
            return new CompatScanFilter(this.f15625a, this.f15626b, this.f15629e, this.f15630f, this.f15631g, this.f15632h, this.f15633i, this.f15634j, this.f15635k, this.f15636l, this.f15637m, this.f15638n, this.f15627c, this.f15628d);
        }

        public Builder setDeviceAddress(String str) {
            if (str != null) {
                return setDeviceAddress(str, 0);
            }
            this.f15626b = str;
            return this;
        }

        public Builder setDeviceName(String str) {
            this.f15625a = str;
            return this;
        }

        public Builder setManufacturerData(int i8, byte[] bArr) {
            if (bArr != null && i8 < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            this.f15636l = i8;
            this.f15637m = bArr;
            this.f15638n = null;
            return this;
        }

        public Builder setServiceData(ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            this.f15633i = parcelUuid;
            this.f15634j = bArr;
            this.f15635k = null;
            return this;
        }

        @NonNull
        public Builder setServiceSolicitationUuid(@Nullable ParcelUuid parcelUuid) {
            this.f15631g = parcelUuid;
            if (parcelUuid == null) {
                this.f15632h = null;
            }
            return this;
        }

        public Builder setServiceUuid(ParcelUuid parcelUuid) {
            this.f15629e = parcelUuid;
            this.f15630f = null;
            return this;
        }

        @NonNull
        public Builder setDeviceAddress(@NonNull String str, int i8) {
            return a(str, i8, null);
        }

        public Builder setManufacturerData(int i8, byte[] bArr, byte[] bArr2) {
            if (bArr != null && i8 < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            byte[] bArr3 = this.f15638n;
            if (bArr3 != null) {
                byte[] bArr4 = this.f15637m;
                if (bArr4 == null) {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
                if (bArr4.length != bArr3.length) {
                    throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                }
            }
            this.f15636l = i8;
            this.f15637m = bArr;
            this.f15638n = bArr2;
            return this;
        }

        public Builder setServiceData(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            byte[] bArr3 = this.f15635k;
            if (bArr3 != null) {
                byte[] bArr4 = this.f15634j;
                if (bArr4 == null) {
                    throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                }
                if (bArr4.length != bArr3.length) {
                    throw new IllegalArgumentException("size mismatch for service data and service data mask");
                }
            }
            this.f15633i = parcelUuid;
            this.f15634j = bArr;
            this.f15635k = bArr2;
            return this;
        }

        @NonNull
        public Builder setServiceSolicitationUuid(@Nullable ParcelUuid parcelUuid, @Nullable ParcelUuid parcelUuid2) {
            if (parcelUuid2 != null && parcelUuid == null) {
                throw new IllegalArgumentException("SolicitationUuid is null while SolicitationUuidMask is not null!");
            }
            this.f15631g = parcelUuid;
            this.f15632h = parcelUuid2;
            return this;
        }

        public Builder setServiceUuid(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (this.f15630f != null && this.f15629e == null) {
                throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            this.f15629e = parcelUuid;
            this.f15630f = parcelUuid2;
            return this;
        }
    }

    public CompatScanFilter(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, ParcelUuid parcelUuid4, ParcelUuid parcelUuid5, byte[] bArr, byte[] bArr2, int i8, byte[] bArr3, byte[] bArr4, int i9, byte[] bArr5) {
        this.f15611a = str;
        this.f15615e = parcelUuid;
        this.f15616f = parcelUuid2;
        this.f15617g = parcelUuid3;
        this.f15618h = parcelUuid4;
        this.f15612b = str2;
        this.f15619i = parcelUuid5;
        this.f15620j = bArr;
        this.f15621k = bArr2;
        this.f15622l = i8;
        this.f15623m = bArr3;
        this.f15624n = bArr4;
        this.f15613c = i9;
        this.f15614d = bArr5;
    }

    public static boolean matchesPartialData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i8 = 0; i8 < bArr.length; i8++) {
                if (bArr3[i8] != bArr[i8]) {
                    return false;
                }
            }
            return true;
        }
        for (int i9 = 0; i9 < bArr.length; i9++) {
            byte b8 = bArr2[i9];
            if ((bArr3[i9] & b8) != (b8 & bArr[i9])) {
                return false;
            }
        }
        return true;
    }

    public static boolean matchesServiceUuids(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List<ParcelUuid> list) {
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        for (ParcelUuid parcelUuid3 : list) {
            if (BitUtils.maskedEquals(parcelUuid3.getUuid(), parcelUuid.getUuid(), parcelUuid2 == null ? null : parcelUuid2.getUuid())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CompatScanFilter.class == obj.getClass()) {
            CompatScanFilter compatScanFilter = (CompatScanFilter) obj;
            if (Objects.equals(this.f15611a, compatScanFilter.f15611a) && Objects.equals(this.f15612b, compatScanFilter.f15612b) && this.f15622l == compatScanFilter.f15622l && Objects.deepEquals(this.f15623m, compatScanFilter.f15623m) && Objects.deepEquals(this.f15624n, compatScanFilter.f15624n) && Objects.equals(this.f15619i, compatScanFilter.f15619i) && Objects.deepEquals(this.f15620j, compatScanFilter.f15620j) && Objects.deepEquals(this.f15621k, compatScanFilter.f15621k) && Objects.equals(this.f15615e, compatScanFilter.f15615e) && Objects.equals(this.f15616f, compatScanFilter.f15616f) && Objects.equals(this.f15617g, compatScanFilter.f15617g) && Objects.equals(this.f15618h, compatScanFilter.f15618h)) {
                return true;
            }
        }
        return false;
    }

    public int getAddressType() {
        return this.f15613c;
    }

    @Nullable
    public String getDeviceAddress() {
        return this.f15612b;
    }

    @Nullable
    public String getDeviceName() {
        return this.f15611a;
    }

    @Nullable
    public byte[] getIrk() {
        return this.f15614d;
    }

    @Nullable
    public byte[] getManufacturerData() {
        return this.f15623m;
    }

    @Nullable
    public byte[] getManufacturerDataMask() {
        return this.f15624n;
    }

    public int getManufacturerId() {
        return this.f15622l;
    }

    @Nullable
    public byte[] getServiceData() {
        return this.f15620j;
    }

    @Nullable
    public byte[] getServiceDataMask() {
        return this.f15621k;
    }

    @Nullable
    public ParcelUuid getServiceDataUuid() {
        return this.f15619i;
    }

    @Nullable
    public ParcelUuid getServiceSolicitationUuid() {
        return this.f15617g;
    }

    @Nullable
    public ParcelUuid getServiceSolicitationUuidMask() {
        return this.f15618h;
    }

    @Nullable
    public ParcelUuid getServiceUuid() {
        return this.f15615e;
    }

    @Nullable
    public ParcelUuid getServiceUuidMask() {
        return this.f15616f;
    }

    public int hashCode() {
        return Objects.hash(this.f15611a, this.f15612b, Integer.valueOf(this.f15622l), Integer.valueOf(Arrays.hashCode(this.f15623m)), Integer.valueOf(Arrays.hashCode(this.f15624n)), this.f15619i, Integer.valueOf(Arrays.hashCode(this.f15620j)), Integer.valueOf(Arrays.hashCode(this.f15621k)), this.f15615e, this.f15616f, this.f15617g, this.f15618h);
    }

    public boolean isAllFieldsEmpty() {
        return EMPTY.equals(this);
    }

    @RequiresApi(api = 21)
    public boolean matches(ScanResult scanResult) {
        ParcelUuid parcelUuid;
        List serviceSolicitationUuids;
        if (scanResult == null) {
            return false;
        }
        BluetoothDevice device = scanResult.getDevice();
        String str = this.f15612b;
        if (str != null && (device == null || !str.equals(device.getAddress()))) {
            return false;
        }
        ScanRecord scanRecord = scanResult.getScanRecord();
        String str2 = this.f15611a;
        boolean z7 = (str2 == null && this.f15615e == null && this.f15623m == null && this.f15620j == null && this.f15617g == null) ? false : true;
        if (scanRecord == null) {
            return !z7;
        }
        if (str2 != null && !str2.equals(scanRecord.getDeviceName())) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.f15615e;
        if (parcelUuid2 != null && !matchesServiceUuids(parcelUuid2, this.f15616f, scanRecord.getServiceUuids())) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && (parcelUuid = this.f15617g) != null) {
            ParcelUuid parcelUuid3 = this.f15618h;
            serviceSolicitationUuids = scanRecord.getServiceSolicitationUuids();
            if (serviceSolicitationUuids != null) {
                Iterator it = serviceSolicitationUuids.iterator();
                while (it.hasNext()) {
                    if (BitUtils.maskedEquals(((ParcelUuid) it.next()).getUuid(), parcelUuid.getUuid(), parcelUuid3 == null ? null : parcelUuid3.getUuid())) {
                    }
                }
            }
            return false;
        }
        ParcelUuid parcelUuid4 = this.f15619i;
        if (parcelUuid4 != null && !matchesPartialData(this.f15620j, this.f15621k, scanRecord.getServiceData(parcelUuid4))) {
            return false;
        }
        int i8 = this.f15622l;
        return i8 < 0 || matchesPartialData(this.f15623m, this.f15624n, scanRecord.getManufacturerSpecificData(i8));
    }

    public String toString() {
        return "BluetoothLeScanFilter [mDeviceName=" + this.f15611a + ", mDeviceAddress=" + BluetoothHelper.formatAddress(this.f15612b, true) + ", mUuid=" + this.f15615e + ", mUuidMask=" + this.f15616f + ", mServiceSolicitationUuid=" + this.f15617g + ", mServiceSolicitationUuidMask=" + this.f15618h + ", mServiceDataUuid=" + Objects.toString(this.f15619i) + ", mServiceData=" + Arrays.toString(this.f15620j) + ", mServiceDataMask=" + Arrays.toString(this.f15621k) + ", mManufacturerId=" + this.f15622l + ", mManufacturerData=" + Arrays.toString(this.f15623m) + ", mManufacturerDataMask=" + Arrays.toString(this.f15624n) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f15611a == null ? 0 : 1);
        String str = this.f15611a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.f15612b == null ? 0 : 1);
        String str2 = this.f15612b;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.f15615e == null ? 0 : 1);
        ParcelUuid parcelUuid = this.f15615e;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i8);
            parcel.writeInt(this.f15616f == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.f15616f;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i8);
            }
        }
        parcel.writeInt(this.f15617g == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.f15617g;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i8);
            parcel.writeInt(this.f15618h == null ? 0 : 1);
            ParcelUuid parcelUuid4 = this.f15618h;
            if (parcelUuid4 != null) {
                parcel.writeParcelable(parcelUuid4, i8);
            }
        }
        parcel.writeInt(this.f15619i == null ? 0 : 1);
        ParcelUuid parcelUuid5 = this.f15619i;
        if (parcelUuid5 != null) {
            parcel.writeParcelable(parcelUuid5, i8);
            parcel.writeInt(this.f15620j == null ? 0 : 1);
            byte[] bArr = this.f15620j;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f15620j);
                parcel.writeInt(this.f15621k == null ? 0 : 1);
                byte[] bArr2 = this.f15621k;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f15621k);
                }
            }
        }
        parcel.writeInt(this.f15622l);
        parcel.writeInt(this.f15623m == null ? 0 : 1);
        byte[] bArr3 = this.f15623m;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f15623m);
            parcel.writeInt(this.f15624n == null ? 0 : 1);
            byte[] bArr4 = this.f15624n;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.f15624n);
            }
        }
        if (this.f15612b != null) {
            parcel.writeInt(this.f15613c);
            parcel.writeInt(this.f15614d == null ? 0 : 1);
            byte[] bArr5 = this.f15614d;
            if (bArr5 != null) {
                parcel.writeByteArray(bArr5);
            }
        }
    }
}
