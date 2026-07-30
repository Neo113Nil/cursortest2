package com.realsil.sdk.core.bluetooth.scanner;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.bluetooth.scanner.DispatcherFilter;
import com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class ScannerParams implements Parcelable {
    public static final Parcelable.Creator<ScannerParams> CREATOR = new Parcelable.Creator<ScannerParams>() { // from class: com.realsil.sdk.core.bluetooth.scanner.ScannerParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScannerParams createFromParcel(Parcel parcel) {
            return new ScannerParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScannerParams[] newArray(int i8) {
            return new ScannerParams[i8];
        }
    };
    public static final long EXPIRATION_TIMEOUT = 10000;
    public static final int SCAN_MECHANISM_ALL = 0;
    public static final int SCAN_MECHANISM_FILTER_ONE = 1;
    public static final int SCAN_MODE_DUAL = 0;
    public static final int SCAN_MODE_GATT = 17;
    public static final int SCAN_MODE_GATT_STRICT = 18;
    public static final int SCAN_MODE_NA = 0;
    public static final int SCAN_MODE_SPP = 32;
    public static final int SCAN_MODE_SPP_STRICT = 33;

    /* renamed from: a, reason: collision with root package name */
    public int f15584a;

    /* renamed from: b, reason: collision with root package name */
    public int f15585b;

    /* renamed from: c, reason: collision with root package name */
    public String f15586c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15587d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15588e;

    /* renamed from: f, reason: collision with root package name */
    public String f15589f;

    /* renamed from: g, reason: collision with root package name */
    public int f15590g;

    /* renamed from: h, reason: collision with root package name */
    public long f15591h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15592i;

    /* renamed from: j, reason: collision with root package name */
    public long f15593j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15594k;

    /* renamed from: l, reason: collision with root package name */
    public int f15595l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15596m;

    /* renamed from: n, reason: collision with root package name */
    public int f15597n;

    /* renamed from: o, reason: collision with root package name */
    public int f15598o;

    /* renamed from: p, reason: collision with root package name */
    public List f15599p;

    /* renamed from: q, reason: collision with root package name */
    public List f15600q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15601r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15602s;

    /* renamed from: t, reason: collision with root package name */
    public long f15603t;

    public ScannerParams() {
        this(0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddressFilter() {
        return this.f15589f;
    }

    public long getAutoScanDelay() {
        return this.f15593j;
    }

    public List<DispatcherFilter> getDispatchFilters() {
        return this.f15600q;
    }

    public long getExpirationTimeout() {
        return this.f15603t;
    }

    public int getFilterProfile() {
        return this.f15597n;
    }

    public int getMajorDeviceClass() {
        return this.f15598o;
    }

    public String getNameFilter() {
        return this.f15586c;
    }

    public int getPhy() {
        return this.f15595l;
    }

    public int getRssiFilter() {
        return this.f15590g;
    }

    public List<CompatScanFilter> getScanFilters() {
        return this.f15599p;
    }

    public int getScanMechanism() {
        return this.f15585b;
    }

    public int getScanMode() {
        return this.f15584a;
    }

    public long getScanPeriod() {
        return this.f15591h;
    }

    public boolean isAutoDiscovery() {
        return this.f15592i;
    }

    public boolean isConnectable() {
        return this.f15596m;
    }

    public boolean isDuplicateCheckEnabled() {
        return this.f15601r;
    }

    public boolean isExpirationCheckEnabled() {
        return this.f15602s;
    }

    public boolean isNameFuzzyMatchEnable() {
        return this.f15587d;
    }

    public boolean isNameNullable() {
        return this.f15588e;
    }

    public boolean isReusePairedDeviceEnabled() {
        return this.f15594k;
    }

    public void setAddressFilter(String str) {
        this.f15589f = str;
    }

    public void setAutoDiscovery(boolean z7) {
        this.f15592i = z7;
    }

    public void setAutoScanDelay(long j8) {
        this.f15593j = j8;
    }

    public void setConnectable(boolean z7) {
        this.f15596m = z7;
    }

    public void setDispatchFilters(List<DispatcherFilter> list) {
        this.f15600q = list;
    }

    public void setDuplicateCheckEnabled(boolean z7) {
        this.f15601r = z7;
    }

    public void setExpirationCheckEnabled(boolean z7) {
        this.f15602s = z7;
    }

    public void setExpirationTimeout(long j8) {
        this.f15603t = j8;
    }

    @Deprecated
    public void setFilterProfile(int i8) {
        this.f15597n = i8;
        if (1 == i8) {
            DispatcherFilter build = new DispatcherFilter.Builder().setFilterUuids(BluetoothUuidCompat.HEADSET_PROFILE_UUIDS).build();
            if (this.f15600q == null) {
                this.f15600q = new ArrayList();
            }
            this.f15600q.add(build);
            setDispatchFilters(this.f15600q);
            this.f15598o = 1024;
        }
    }

    @Deprecated
    public void setFilterUuids(ParcelUuid[] parcelUuidArr) {
        DispatcherFilter build = new DispatcherFilter.Builder().setFilterUuids(parcelUuidArr).build();
        if (this.f15600q == null) {
            this.f15600q = new ArrayList();
        }
        this.f15600q.add(build);
        setDispatchFilters(this.f15600q);
    }

    public void setMajorDeviceClass(int i8) {
        this.f15598o = i8;
    }

    public void setNameFilter(String str) {
        this.f15586c = str;
    }

    public void setNameFuzzyMatchEnable(boolean z7) {
        this.f15587d = z7;
    }

    public void setNameNullable(boolean z7) {
        this.f15588e = z7;
    }

    public void setPhy(int i8) {
        this.f15595l = i8;
    }

    public void setReusePairedDeviceEnabled(boolean z7) {
        this.f15594k = z7;
    }

    public void setRssiFilter(int i8) {
        this.f15590g = i8;
    }

    public void setScanFilters(List<CompatScanFilter> list) {
        this.f15599p = list;
    }

    public void setScanMechanism(int i8) {
        this.f15585b = i8;
    }

    public void setScanMode(int i8) {
        this.f15584a = i8;
    }

    public void setScanPeriod(long j8) {
        this.f15591h = j8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScannerParams {");
        Locale locale = Locale.US;
        sb.append("\n\tscanMode:" + this.f15584a + ",scanMechanism:" + this.f15585b + ",scanPeriod=" + this.f15591h + "(ms)");
        sb.append(String.format(locale, "\n\tmajorDeviceClass=0x%04X,filterProfile=%d, connectable=%b", Integer.valueOf(this.f15598o), Integer.valueOf(this.f15597n), Boolean.valueOf(this.f15596m)));
        sb.append("\n\tnameFilter:" + this.f15586c + ",fuzzyMatchEnable=" + this.f15587d + ",nullable=" + this.f15588e);
        sb.append("\n\tautoDiscovery:" + this.f15592i + ",autoScanDelay=" + this.f15593j);
        sb.append("\n\texpirationCheckEnabled:" + this.f15602s + ",expirationTimeout=" + this.f15603t);
        int i8 = this.f15590g;
        StringBuilder sb2 = new StringBuilder("\n\trssiFilter=");
        sb2.append(i8);
        sb.append(sb2.toString());
        List list = this.f15600q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ZLogger.v(((DispatcherFilter) it.next()).toString());
            }
        }
        sb.append("\n}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f15584a);
        parcel.writeInt(this.f15585b);
        parcel.writeString(this.f15586c);
        parcel.writeByte(this.f15587d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15588e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f15589f);
        parcel.writeInt(this.f15590g);
        parcel.writeLong(this.f15591h);
        parcel.writeByte(this.f15592i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f15593j);
        parcel.writeByte(this.f15594k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f15595l);
        parcel.writeByte(this.f15596m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f15597n);
        parcel.writeInt(this.f15598o);
        parcel.writeTypedList(this.f15599p);
        parcel.writeTypedList(this.f15600q);
        parcel.writeByte(this.f15601r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15602s ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f15603t);
    }

    public ScannerParams(int i8) {
        this.f15584a = 0;
        this.f15585b = 0;
        this.f15586c = "";
        this.f15587d = false;
        this.f15588e = true;
        this.f15590g = -1000;
        this.f15591h = 10000L;
        this.f15593j = 6000L;
        this.f15594k = true;
        this.f15595l = 255;
        this.f15596m = true;
        this.f15598o = 7936;
        this.f15599p = new ArrayList();
        this.f15600q = new ArrayList();
        this.f15601r = false;
        this.f15602s = false;
        this.f15603t = 10000L;
        this.f15584a = i8;
        this.f15591h = (i8 == 17 || i8 == 18) ? 60000L : C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
        this.f15592i = false;
        this.f15585b = 0;
    }

    public ScannerParams(Parcel parcel) {
        this.f15584a = 0;
        this.f15585b = 0;
        this.f15586c = "";
        this.f15587d = false;
        this.f15588e = true;
        this.f15590g = -1000;
        this.f15591h = 10000L;
        this.f15593j = 6000L;
        this.f15594k = true;
        this.f15595l = 255;
        this.f15596m = true;
        this.f15598o = 7936;
        this.f15599p = new ArrayList();
        this.f15600q = new ArrayList();
        this.f15601r = false;
        this.f15602s = false;
        this.f15603t = 10000L;
        this.f15584a = parcel.readInt();
        this.f15585b = parcel.readInt();
        this.f15586c = parcel.readString();
        this.f15587d = parcel.readByte() != 0;
        this.f15588e = parcel.readByte() != 0;
        this.f15589f = parcel.readString();
        this.f15590g = parcel.readInt();
        this.f15591h = parcel.readLong();
        this.f15592i = parcel.readByte() != 0;
        this.f15593j = parcel.readLong();
        this.f15594k = parcel.readByte() != 0;
        this.f15595l = parcel.readInt();
        this.f15596m = parcel.readByte() != 0;
        this.f15597n = parcel.readInt();
        this.f15598o = parcel.readInt();
        this.f15599p = parcel.createTypedArrayList(CompatScanFilter.CREATOR);
        this.f15600q = parcel.createTypedArrayList(DispatcherFilter.CREATOR);
        this.f15601r = parcel.readByte() != 0;
        this.f15602s = parcel.readByte() != 0;
        this.f15603t = parcel.readLong();
    }
}
