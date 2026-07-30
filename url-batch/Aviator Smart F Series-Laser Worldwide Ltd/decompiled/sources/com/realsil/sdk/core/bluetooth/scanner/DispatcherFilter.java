package com.realsil.sdk.core.bluetooth.scanner;

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
import com.realsil.sdk.core.RtkCore;
import com.realsil.sdk.core.bluetooth.compat.BluetoothAdapterCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.BitUtils;
import com.realsil.sdk.core.utility.StringUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class DispatcherFilter implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15546a = RtkCore.VDBG;

    /* renamed from: b, reason: collision with root package name */
    public final String f15547b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15548c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15549d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f15550e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelUuid f15551f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelUuid f15552g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelUuid f15553h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelUuid f15554i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelUuid f15555j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f15556k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f15557l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15558m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f15559n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f15560o;

    /* renamed from: p, reason: collision with root package name */
    public final ParcelUuid[] f15561p;
    public static final DispatcherFilter EMPTY = new Builder().build();

    @NonNull
    public static final Parcelable.Creator<DispatcherFilter> CREATOR = new Parcelable.Creator<DispatcherFilter>() { // from class: com.realsil.sdk.core.bluetooth.scanner.DispatcherFilter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DispatcherFilter createFromParcel(Parcel parcel) {
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
            builder.setFilterUuids((ParcelUuid[]) parcel.createTypedArray(ParcelUuid.CREATOR));
            return builder.build();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DispatcherFilter[] newArray(int i8) {
            return new DispatcherFilter[i8];
        }
    };

    public static final class Builder {
        public static final int LEN_IRK_OCTETS = 16;

        /* renamed from: a, reason: collision with root package name */
        public String f15562a;

        /* renamed from: b, reason: collision with root package name */
        public String f15563b;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f15565d;

        /* renamed from: e, reason: collision with root package name */
        public ParcelUuid f15566e;

        /* renamed from: f, reason: collision with root package name */
        public ParcelUuid f15567f;

        /* renamed from: g, reason: collision with root package name */
        public ParcelUuid f15568g;

        /* renamed from: h, reason: collision with root package name */
        public ParcelUuid f15569h;

        /* renamed from: i, reason: collision with root package name */
        public ParcelUuid f15570i;

        /* renamed from: j, reason: collision with root package name */
        public byte[] f15571j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f15572k;

        /* renamed from: m, reason: collision with root package name */
        public byte[] f15574m;

        /* renamed from: n, reason: collision with root package name */
        public byte[] f15575n;

        /* renamed from: c, reason: collision with root package name */
        public int f15564c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f15573l = -1;

        /* renamed from: o, reason: collision with root package name */
        public ParcelUuid[] f15576o = new ParcelUuid[0];

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
            this.f15563b = str;
            this.f15564c = i8;
            this.f15565d = bArr;
            return this;
        }

        public DispatcherFilter build() {
            return new DispatcherFilter(this.f15562a, this.f15563b, this.f15566e, this.f15567f, this.f15568g, this.f15569h, this.f15570i, this.f15571j, this.f15572k, this.f15573l, this.f15574m, this.f15575n, this.f15564c, this.f15565d, this.f15576o);
        }

        public Builder setDeviceAddress(String str) {
            if (str != null) {
                return setDeviceAddress(str, 0);
            }
            this.f15563b = str;
            return this;
        }

        public Builder setDeviceName(String str) {
            this.f15562a = str;
            return this;
        }

        public Builder setFilterUuids(ParcelUuid[] parcelUuidArr) {
            this.f15576o = parcelUuidArr;
            return this;
        }

        public Builder setManufacturerData(int i8, byte[] bArr) {
            if (bArr != null && i8 < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            this.f15573l = i8;
            this.f15574m = bArr;
            this.f15575n = null;
            return this;
        }

        public Builder setServiceData(ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            this.f15570i = parcelUuid;
            this.f15571j = bArr;
            this.f15572k = null;
            return this;
        }

        @NonNull
        public Builder setServiceSolicitationUuid(@Nullable ParcelUuid parcelUuid) {
            this.f15568g = parcelUuid;
            if (parcelUuid == null) {
                this.f15569h = null;
            }
            return this;
        }

        public Builder setServiceUuid(ParcelUuid parcelUuid) {
            this.f15566e = parcelUuid;
            this.f15567f = null;
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
            byte[] bArr3 = this.f15575n;
            if (bArr3 != null) {
                byte[] bArr4 = this.f15574m;
                if (bArr4 == null) {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
                if (bArr4.length != bArr3.length) {
                    throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                }
            }
            this.f15573l = i8;
            this.f15574m = bArr;
            this.f15575n = bArr2;
            return this;
        }

        public Builder setServiceData(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            byte[] bArr3 = this.f15572k;
            if (bArr3 != null) {
                byte[] bArr4 = this.f15571j;
                if (bArr4 == null) {
                    throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                }
                if (bArr4.length != bArr3.length) {
                    throw new IllegalArgumentException("size mismatch for service data and service data mask");
                }
            }
            this.f15570i = parcelUuid;
            this.f15571j = bArr;
            this.f15572k = bArr2;
            return this;
        }

        @NonNull
        public Builder setServiceSolicitationUuid(@Nullable ParcelUuid parcelUuid, @Nullable ParcelUuid parcelUuid2) {
            if (parcelUuid2 != null && parcelUuid == null) {
                throw new IllegalArgumentException("SolicitationUuid is null while SolicitationUuidMask is not null!");
            }
            this.f15568g = parcelUuid;
            this.f15569h = parcelUuid2;
            return this;
        }

        public Builder setServiceUuid(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (this.f15567f != null && this.f15566e == null) {
                throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            this.f15566e = parcelUuid;
            this.f15567f = parcelUuid2;
            return this;
        }
    }

    public DispatcherFilter(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, ParcelUuid parcelUuid4, ParcelUuid parcelUuid5, byte[] bArr, byte[] bArr2, int i8, byte[] bArr3, byte[] bArr4, int i9, byte[] bArr5, ParcelUuid[] parcelUuidArr) {
        this.f15547b = str;
        this.f15551f = parcelUuid;
        this.f15552g = parcelUuid2;
        this.f15553h = parcelUuid3;
        this.f15554i = parcelUuid4;
        this.f15548c = str2;
        this.f15555j = parcelUuid5;
        this.f15556k = bArr;
        this.f15557l = bArr2;
        this.f15558m = i8;
        this.f15559n = bArr3;
        this.f15560o = bArr4;
        this.f15549d = i9;
        this.f15550e = bArr5;
        this.f15561p = parcelUuidArr;
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
        if (obj != null && DispatcherFilter.class == obj.getClass()) {
            DispatcherFilter dispatcherFilter = (DispatcherFilter) obj;
            if (Objects.equals(this.f15547b, dispatcherFilter.f15547b) && Objects.equals(this.f15548c, dispatcherFilter.f15548c) && this.f15558m == dispatcherFilter.f15558m && Objects.deepEquals(this.f15559n, dispatcherFilter.f15559n) && Objects.deepEquals(this.f15560o, dispatcherFilter.f15560o) && Objects.equals(this.f15555j, dispatcherFilter.f15555j) && Objects.deepEquals(this.f15556k, dispatcherFilter.f15556k) && Objects.deepEquals(this.f15557l, dispatcherFilter.f15557l) && Objects.equals(this.f15551f, dispatcherFilter.f15551f) && Objects.equals(this.f15552g, dispatcherFilter.f15552g) && Objects.equals(this.f15553h, dispatcherFilter.f15553h) && Objects.equals(this.f15554i, dispatcherFilter.f15554i)) {
                return true;
            }
        }
        return false;
    }

    public int getAddressType() {
        return this.f15549d;
    }

    @Nullable
    public String getDeviceAddress() {
        return this.f15548c;
    }

    @Nullable
    public String getDeviceName() {
        return this.f15547b;
    }

    public ParcelUuid[] getFilterUuids() {
        return this.f15561p;
    }

    @Nullable
    public byte[] getIrk() {
        return this.f15550e;
    }

    @Nullable
    public byte[] getManufacturerData() {
        return this.f15559n;
    }

    @Nullable
    public byte[] getManufacturerDataMask() {
        return this.f15560o;
    }

    public int getManufacturerId() {
        return this.f15558m;
    }

    @Nullable
    public byte[] getServiceData() {
        return this.f15556k;
    }

    @Nullable
    public byte[] getServiceDataMask() {
        return this.f15557l;
    }

    @Nullable
    public ParcelUuid getServiceDataUuid() {
        return this.f15555j;
    }

    @Nullable
    public ParcelUuid getServiceSolicitationUuid() {
        return this.f15553h;
    }

    @Nullable
    public ParcelUuid getServiceSolicitationUuidMask() {
        return this.f15554i;
    }

    @Nullable
    public ParcelUuid getServiceUuid() {
        return this.f15551f;
    }

    @Nullable
    public ParcelUuid getServiceUuidMask() {
        return this.f15552g;
    }

    public int hashCode() {
        return Objects.hash(this.f15547b, this.f15548c, Integer.valueOf(this.f15558m), Integer.valueOf(Arrays.hashCode(this.f15559n)), Integer.valueOf(Arrays.hashCode(this.f15560o)), this.f15555j, Integer.valueOf(Arrays.hashCode(this.f15556k)), Integer.valueOf(Arrays.hashCode(this.f15557l)), this.f15551f, this.f15552g, this.f15553h, this.f15554i);
    }

    public boolean isAllFieldsEmpty() {
        return EMPTY.equals(this);
    }

    public boolean matches(BluetoothDevice bluetoothDevice) {
        return true;
    }

    public boolean matchesSupportedUuids(ParcelUuid[] parcelUuidArr) {
        ParcelUuid[] parcelUuidArr2 = this.f15561p;
        if (parcelUuidArr2 == null || parcelUuidArr2.length <= 0 || BluetoothUuidCompat.containsAnyUuid(parcelUuidArr, parcelUuidArr2)) {
            return true;
        }
        if (!this.f15546a) {
            return false;
        }
        ZLogger.v("profile filter failed");
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DispatcherFilter {");
        sb.append("\n\tmDeviceName=" + this.f15547b + ", mDeviceAddress=" + BluetoothHelper.formatAddress(this.f15548c, true) + ", mUuid=" + this.f15551f + ", mUuidMask=" + this.f15552g + ", mServiceSolicitationUuid=" + this.f15553h + ", mServiceSolicitationUuidMask=" + this.f15554i + ", mServiceDataUuid=" + Objects.toString(this.f15555j) + ", mServiceData=" + Arrays.toString(this.f15556k) + ", mServiceDataMask=" + Arrays.toString(this.f15557l) + ", mManufacturerId=" + this.f15558m + ", mManufacturerData=" + Arrays.toString(this.f15559n) + ", mManufacturerDataMask=" + Arrays.toString(this.f15560o) + "]");
        ParcelUuid[] parcelUuidArr = this.f15561p;
        if (parcelUuidArr != null && parcelUuidArr.length > 0) {
            sb.append(String.format(Locale.US, "\n\tfilterUuids=" + Arrays.toString(this.f15561p), new Object[0]));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f15547b == null ? 0 : 1);
        String str = this.f15547b;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.f15548c == null ? 0 : 1);
        String str2 = this.f15548c;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.f15551f == null ? 0 : 1);
        ParcelUuid parcelUuid = this.f15551f;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i8);
            parcel.writeInt(this.f15552g == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.f15552g;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i8);
            }
        }
        parcel.writeInt(this.f15553h == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.f15553h;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i8);
            parcel.writeInt(this.f15554i == null ? 0 : 1);
            ParcelUuid parcelUuid4 = this.f15554i;
            if (parcelUuid4 != null) {
                parcel.writeParcelable(parcelUuid4, i8);
            }
        }
        parcel.writeInt(this.f15555j == null ? 0 : 1);
        ParcelUuid parcelUuid5 = this.f15555j;
        if (parcelUuid5 != null) {
            parcel.writeParcelable(parcelUuid5, i8);
            parcel.writeInt(this.f15556k == null ? 0 : 1);
            byte[] bArr = this.f15556k;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f15556k);
                parcel.writeInt(this.f15557l == null ? 0 : 1);
                byte[] bArr2 = this.f15557l;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f15557l);
                }
            }
        }
        parcel.writeInt(this.f15558m);
        parcel.writeInt(this.f15559n == null ? 0 : 1);
        byte[] bArr3 = this.f15559n;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f15559n);
            parcel.writeInt(this.f15560o == null ? 0 : 1);
            byte[] bArr4 = this.f15560o;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.f15560o);
            }
        }
        if (this.f15548c != null) {
            parcel.writeInt(this.f15549d);
            parcel.writeInt(this.f15550e == null ? 0 : 1);
            byte[] bArr5 = this.f15550e;
            if (bArr5 != null) {
                parcel.writeByteArray(bArr5);
            }
        }
        parcel.writeTypedArray(this.f15561p, i8);
    }

    @RequiresApi(api = 21)
    public boolean matches(ScanResult scanResult) {
        ParcelUuid parcelUuid;
        List serviceSolicitationUuids;
        if (scanResult == null) {
            return false;
        }
        BluetoothDevice device = scanResult.getDevice();
        String str = this.f15548c;
        if (str != null && (device == null || !str.equals(device.getAddress()))) {
            return false;
        }
        ScanRecord scanRecord = scanResult.getScanRecord();
        String str2 = this.f15547b;
        boolean z7 = (str2 == null && this.f15551f == null && this.f15559n == null && this.f15556k == null && this.f15553h == null) ? false : true;
        if (scanRecord == null) {
            return !z7;
        }
        if (str2 != null && !str2.equals(scanRecord.getDeviceName())) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.f15551f;
        if (parcelUuid2 != null && !matchesServiceUuids(parcelUuid2, this.f15552g, scanRecord.getServiceUuids())) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && (parcelUuid = this.f15553h) != null) {
            ParcelUuid parcelUuid3 = this.f15554i;
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
        ParcelUuid parcelUuid4 = this.f15555j;
        if (parcelUuid4 != null && !matchesPartialData(this.f15556k, this.f15557l, scanRecord.getServiceData(parcelUuid4))) {
            return false;
        }
        int i8 = this.f15558m;
        return i8 < 0 || matchesPartialData(this.f15559n, this.f15560o, scanRecord.getManufacturerSpecificData(i8));
    }
}
