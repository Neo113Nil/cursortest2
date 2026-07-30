package com.realsil.sdk.dfu.utils;

import android.hardware.usb.UsbDevice;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.dfu.gatt.GattConfig;
import com.realsil.sdk.dfu.spp.SppConfig;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class ConnectParams {
    public static final int BATTERY_VALUE_F1 = 1;
    public static final int BATTERY_VALUE_F2 = 2;

    /* renamed from: a, reason: collision with root package name */
    public String f16354a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16355b;

    /* renamed from: c, reason: collision with root package name */
    public String f16356c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16357d;

    /* renamed from: e, reason: collision with root package name */
    public int f16358e;

    /* renamed from: f, reason: collision with root package name */
    public UUID f16359f;

    /* renamed from: g, reason: collision with root package name */
    public UUID f16360g;

    /* renamed from: h, reason: collision with root package name */
    public UsbDevice f16361h;

    /* renamed from: i, reason: collision with root package name */
    public int f16362i;

    /* renamed from: j, reason: collision with root package name */
    public int f16363j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16364k;

    /* renamed from: l, reason: collision with root package name */
    public SppConfig f16365l;

    /* renamed from: m, reason: collision with root package name */
    public GattConfig f16366m;

    public static class Builder {

        /* renamed from: b, reason: collision with root package name */
        public boolean f16368b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16370d;

        /* renamed from: h, reason: collision with root package name */
        public UsbDevice f16374h;

        /* renamed from: j, reason: collision with root package name */
        public boolean f16376j;

        /* renamed from: l, reason: collision with root package name */
        public boolean f16378l;

        /* renamed from: m, reason: collision with root package name */
        public SppConfig f16379m;

        /* renamed from: n, reason: collision with root package name */
        public GattConfig f16380n;

        /* renamed from: a, reason: collision with root package name */
        public String f16367a = "";

        /* renamed from: c, reason: collision with root package name */
        public String f16369c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f16371e = 1;

        /* renamed from: f, reason: collision with root package name */
        public UUID f16372f = UUID.fromString("0000d0ff-3c17-d293-8e48-14fe2e4da212");

        /* renamed from: g, reason: collision with root package name */
        public UUID f16373g = UUID.fromString("00006287-3c17-d293-8e48-14fe2e4da212");

        /* renamed from: i, reason: collision with root package name */
        public int f16375i = 2;

        /* renamed from: k, reason: collision with root package name */
        public int f16377k = 1;

        public Builder address(String str) {
            this.f16367a = str;
            return this;
        }

        public Builder batteryValueFormat(int i8) {
            this.f16377k = i8;
            return this;
        }

        public ConnectParams build() {
            if (this.f16380n == null) {
                this.f16380n = new GattConfig.Builder().refreshCache(this.f16376j).build();
            }
            return new ConnectParams(this.f16367a, this.f16368b, this.f16369c, this.f16370d, this.f16371e, this.f16372f, this.f16373g, this.f16374h, this.f16375i, this.f16377k, this.f16378l, this.f16379m, this.f16380n);
        }

        public Builder createBond(boolean z7) {
            this.f16368b = z7;
            return this;
        }

        public Builder dfuServiceUuid(UUID uuid) {
            this.f16373g = uuid;
            return this;
        }

        public Builder gattConfig(GattConfig gattConfig) {
            this.f16380n = gattConfig;
            return this;
        }

        public Builder hid(boolean z7) {
            this.f16370d = z7;
            return this;
        }

        public Builder imageFeatureEnabled(boolean z7) {
            this.f16378l = z7;
            return this;
        }

        public Builder localName(String str) {
            this.f16369c = str;
            return this;
        }

        public Builder otaServiceUuid(UUID uuid) {
            this.f16372f = uuid;
            return this;
        }

        public Builder reconnectTimes(int i8) {
            this.f16371e = i8;
            return this;
        }

        @Deprecated
        public Builder refreshCache(boolean z7) {
            this.f16376j = z7;
            return this;
        }

        public Builder sppConfig(SppConfig sppConfig) {
            this.f16379m = sppConfig;
            return this;
        }

        public Builder usbDevice(UsbDevice usbDevice) {
            this.f16374h = usbDevice;
            return this;
        }

        public Builder usbGattRxEndpointType(int i8) {
            this.f16375i = i8;
            return this;
        }
    }

    public ConnectParams(String str, boolean z7, String str2, boolean z8, int i8, UUID uuid, UUID uuid2, UsbDevice usbDevice, int i9, int i10, boolean z9, SppConfig sppConfig, GattConfig gattConfig) {
        this.f16354a = "";
        this.f16358e = 1;
        this.f16359f = UUID.fromString("0000d0ff-3c17-d293-8e48-14fe2e4da212");
        UUID.fromString("00006287-3c17-d293-8e48-14fe2e4da212");
        this.f16354a = str;
        this.f16355b = z7;
        this.f16356c = str2;
        this.f16357d = z8;
        this.f16358e = i8;
        this.f16359f = uuid;
        this.f16360g = uuid2;
        this.f16361h = usbDevice;
        this.f16362i = i9;
        this.f16363j = i10;
        this.f16364k = z9;
        this.f16365l = sppConfig;
        this.f16366m = gattConfig;
    }

    public String getAddress() {
        return this.f16354a;
    }

    public int getBatteryValueFormat() {
        return this.f16363j;
    }

    public UUID getDfuServiceUuid() {
        return this.f16360g;
    }

    public GattConfig getGattConfig() {
        GattConfig gattConfig = this.f16366m;
        return gattConfig == null ? new GattConfig.Builder().build() : gattConfig;
    }

    public String getLocalName() {
        return this.f16356c;
    }

    public UUID getOtaServiceUuid() {
        return this.f16359f;
    }

    public int getReconnectTimes() {
        return this.f16358e;
    }

    public SppConfig getSppConfig() {
        SppConfig sppConfig = this.f16365l;
        return sppConfig == null ? new SppConfig.Builder().build() : sppConfig;
    }

    public UsbDevice getUsbDevice() {
        return this.f16361h;
    }

    public int getUsbGattRxEndpointType() {
        return this.f16362i;
    }

    public boolean isCreateBond() {
        return this.f16355b;
    }

    public boolean isHid() {
        return this.f16357d;
    }

    public boolean isImageFeatureEnabled() {
        return this.f16364k;
    }

    public boolean isRefreshCache() {
        return getGattConfig().isRefreshCacheEnabled();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectParams {\n");
        sb.append(String.format("localName=%s, address=%s\n", this.f16356c, BluetoothHelper.formatAddress(this.f16354a, true)));
        sb.append(String.format("isHid=%b\n", Boolean.valueOf(this.f16357d)));
        sb.append(String.format(Locale.US, "reconnectTimes=%d\n", Integer.valueOf(this.f16358e)));
        sb.append(String.format("imageFeatureEnabled=%b\n", Boolean.valueOf(this.f16364k)));
        SppConfig sppConfig = this.f16365l;
        if (sppConfig != null) {
            sb.append(sppConfig.toString());
        }
        GattConfig gattConfig = this.f16366m;
        if (gattConfig != null) {
            sb.append(gattConfig.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
