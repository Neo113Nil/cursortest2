package com.realsil.sdk.core.bluetooth.scanner;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.bluetooth.scanner.DispatcherFilter;
import com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter;
import com.realsil.sdk.core.d.g;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class BasicFilter implements Parcelable {
    public static final Parcelable.Creator<BasicFilter> CREATOR = new g();
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
    public int f15526a;

    /* renamed from: b, reason: collision with root package name */
    public int f15527b;

    /* renamed from: c, reason: collision with root package name */
    public String f15528c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15529d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15530e;

    /* renamed from: f, reason: collision with root package name */
    public String f15531f;

    /* renamed from: g, reason: collision with root package name */
    public int f15532g;

    /* renamed from: h, reason: collision with root package name */
    public long f15533h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15534i;

    /* renamed from: j, reason: collision with root package name */
    public long f15535j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15536k;

    /* renamed from: l, reason: collision with root package name */
    public int f15537l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15538m;

    /* renamed from: n, reason: collision with root package name */
    public int f15539n;

    /* renamed from: o, reason: collision with root package name */
    public int f15540o;

    /* renamed from: p, reason: collision with root package name */
    public List f15541p;

    /* renamed from: q, reason: collision with root package name */
    public List f15542q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15543r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15544s;

    /* renamed from: t, reason: collision with root package name */
    public long f15545t;

    public BasicFilter() {
        this(0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddressFilter() {
        return this.f15531f;
    }

    public long getAutoScanDelay() {
        return this.f15535j;
    }

    public List<DispatcherFilter> getDispatchFilters() {
        return this.f15542q;
    }

    public long getExpirationTimeout() {
        return this.f15545t;
    }

    public int getFilterProfile() {
        return this.f15539n;
    }

    public int getMajorDeviceClass() {
        return this.f15540o;
    }

    public String getNameFilter() {
        return this.f15528c;
    }

    public int getPhy() {
        return this.f15537l;
    }

    public int getRssiFilter() {
        return this.f15532g;
    }

    public List<CompatScanFilter> getScanFilters() {
        return this.f15541p;
    }

    public int getScanMechanism() {
        return this.f15527b;
    }

    public int getScanMode() {
        return this.f15526a;
    }

    public long getScanPeriod() {
        return this.f15533h;
    }

    public boolean isAutoDiscovery() {
        return this.f15534i;
    }

    public boolean isConnectable() {
        return this.f15538m;
    }

    public boolean isDuplicateCheckEnabled() {
        return this.f15543r;
    }

    public boolean isExpirationCheckEnabled() {
        return this.f15544s;
    }

    public boolean isNameFuzzyMatchEnable() {
        return this.f15529d;
    }

    public boolean isNameNullable() {
        return this.f15530e;
    }

    public boolean isReusePairedDeviceEnabled() {
        return this.f15536k;
    }

    public void setAddressFilter(String str) {
        this.f15531f = str;
    }

    public void setAutoDiscovery(boolean z7) {
        this.f15534i = z7;
    }

    public void setAutoScanDelay(long j8) {
        this.f15535j = j8;
    }

    public void setConnectable(boolean z7) {
        this.f15538m = z7;
    }

    public void setDispatchFilters(List<DispatcherFilter> list) {
        this.f15542q = list;
    }

    public void setDuplicateCheckEnabled(boolean z7) {
        this.f15543r = z7;
    }

    public void setExpirationCheckEnabled(boolean z7) {
        this.f15544s = z7;
    }

    public void setExpirationTimeout(long j8) {
        this.f15545t = j8;
    }

    @Deprecated
    public void setFilterProfile(int i8) {
        this.f15539n = i8;
        if (1 == i8) {
            DispatcherFilter build = new DispatcherFilter.Builder().setFilterUuids(BluetoothUuidCompat.HEADSET_PROFILE_UUIDS).build();
            if (this.f15542q == null) {
                this.f15542q = new ArrayList();
            }
            this.f15542q.add(build);
            setDispatchFilters(this.f15542q);
            this.f15540o = 1024;
        }
    }

    @Deprecated
    public void setFilterUuids(ParcelUuid[] parcelUuidArr) {
        DispatcherFilter build = new DispatcherFilter.Builder().setFilterUuids(parcelUuidArr).build();
        if (this.f15542q == null) {
            this.f15542q = new ArrayList();
        }
        this.f15542q.add(build);
        setDispatchFilters(this.f15542q);
    }

    public void setMajorDeviceClass(int i8) {
        this.f15540o = i8;
    }

    public void setNameFilter(String str) {
        this.f15528c = str;
    }

    public void setNameFuzzyMatchEnable(boolean z7) {
        this.f15529d = z7;
    }

    public void setNameNullable(boolean z7) {
        this.f15530e = z7;
    }

    public void setPhy(int i8) {
        this.f15537l = i8;
    }

    public void setReusePairedDeviceEnabled(boolean z7) {
        this.f15536k = z7;
    }

    public void setRssiFilter(int i8) {
        this.f15532g = i8;
    }

    public void setScanFilters(List<CompatScanFilter> list) {
        this.f15541p = list;
    }

    public void setScanMechanism(int i8) {
        this.f15527b = i8;
    }

    public void setScanMode(int i8) {
        this.f15526a = i8;
    }

    public void setScanPeriod(long j8) {
        this.f15533h = j8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScannerParams {");
        Locale locale = Locale.US;
        sb.append("\n\tscanMode:" + this.f15526a + ",scanMechanism:" + this.f15527b + ",scanPeriod=" + this.f15533h + "(ms)");
        sb.append(String.format(locale, "\n\tmajorDeviceClass=0x%04X,filterProfile=%d, connectable=%b", Integer.valueOf(this.f15540o), Integer.valueOf(this.f15539n), Boolean.valueOf(this.f15538m)));
        sb.append("\n\tnameFilter:" + this.f15528c + ",fuzzyMatchEnable=" + this.f15529d + ",nullable=" + this.f15530e);
        sb.append("\n\tautoDiscovery:" + this.f15534i + ",autoScanDelay=" + this.f15535j);
        int i8 = this.f15532g;
        StringBuilder sb2 = new StringBuilder("\n\trssiFilter=");
        sb2.append(i8);
        sb.append(sb2.toString());
        List list = this.f15542q;
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
        parcel.writeInt(this.f15526a);
        parcel.writeInt(this.f15527b);
        parcel.writeString(this.f15528c);
        parcel.writeByte(this.f15529d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15530e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f15531f);
        parcel.writeInt(this.f15532g);
        parcel.writeLong(this.f15533h);
        parcel.writeByte(this.f15534i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f15535j);
        parcel.writeByte(this.f15536k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f15537l);
        parcel.writeByte(this.f15538m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f15539n);
        parcel.writeInt(this.f15540o);
        parcel.writeTypedList(this.f15541p);
        parcel.writeTypedList(this.f15542q);
        parcel.writeByte(this.f15543r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15544s ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f15545t);
    }

    public BasicFilter(int i8) {
        this.f15526a = 0;
        this.f15527b = 0;
        this.f15528c = "";
        this.f15529d = false;
        this.f15530e = true;
        this.f15532g = -1000;
        this.f15533h = 10000L;
        this.f15535j = 6000L;
        this.f15536k = true;
        this.f15537l = 255;
        this.f15538m = true;
        this.f15540o = 7936;
        this.f15541p = new ArrayList();
        this.f15542q = new ArrayList();
        this.f15543r = false;
        this.f15544s = false;
        this.f15545t = 10000L;
        this.f15526a = i8;
        this.f15533h = (i8 == 17 || i8 == 18) ? 60000L : C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
        this.f15534i = false;
        this.f15527b = 0;
    }

    public BasicFilter(Parcel parcel) {
        this.f15526a = 0;
        this.f15527b = 0;
        this.f15528c = "";
        this.f15529d = false;
        this.f15530e = true;
        this.f15532g = -1000;
        this.f15533h = 10000L;
        this.f15535j = 6000L;
        this.f15536k = true;
        this.f15537l = 255;
        this.f15538m = true;
        this.f15540o = 7936;
        this.f15541p = new ArrayList();
        this.f15542q = new ArrayList();
        this.f15543r = false;
        this.f15544s = false;
        this.f15545t = 10000L;
        this.f15526a = parcel.readInt();
        this.f15527b = parcel.readInt();
        this.f15528c = parcel.readString();
        this.f15529d = parcel.readByte() != 0;
        this.f15530e = parcel.readByte() != 0;
        this.f15531f = parcel.readString();
        this.f15532g = parcel.readInt();
        this.f15533h = parcel.readLong();
        this.f15534i = parcel.readByte() != 0;
        this.f15535j = parcel.readLong();
        this.f15536k = parcel.readByte() != 0;
        this.f15537l = parcel.readInt();
        this.f15538m = parcel.readByte() != 0;
        this.f15539n = parcel.readInt();
        this.f15540o = parcel.readInt();
        this.f15541p = parcel.createTypedArrayList(CompatScanFilter.CREATOR);
        this.f15542q = parcel.createTypedArrayList(DispatcherFilter.CREATOR);
        this.f15543r = parcel.readByte() != 0;
        this.f15544s = parcel.readByte() != 0;
        this.f15545t = parcel.readLong();
    }
}
