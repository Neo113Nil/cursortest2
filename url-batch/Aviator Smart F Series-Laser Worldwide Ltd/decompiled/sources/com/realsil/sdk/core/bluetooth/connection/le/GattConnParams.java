package com.realsil.sdk.core.bluetooth.connection.le;

import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class GattConnParams {
    public static final int ATT_MTU_SIZE_BLE = 256;
    public static final int GATT_MAX_MTU_SIZE = 517;
    public static final int MAX_RECONNECT_TIMES = 2;
    public static final int MIN_ATT_MTU_SIZE_BR_EDR = 48;
    public static final int MIN_ATT_MTU_SIZE_LE = 20;
    public static final int PHY_HIGH_SPEED = 1;
    public static final int PHY_LONG_RANGE_X2 = 2;
    public static final int PHY_LONG_RANGE_X4 = 3;
    public static final int PHY_NORMAL = 0;
    public static final int TRANSPORT_AUTO = 0;
    public static final int TRANSPORT_BREDR = 1;
    public static final int TRANSPORT_LE = 2;

    /* renamed from: a, reason: collision with root package name */
    public final String f15477a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15478b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15479c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15480d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15481e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15482f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15483g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15484h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15485i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15486j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f15487k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f15488l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f15489m;
    public int phyLevel;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15490a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15491b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f15493d;

        /* renamed from: g, reason: collision with root package name */
        public boolean f15496g;

        /* renamed from: c, reason: collision with root package name */
        public int f15492c = 2;

        /* renamed from: e, reason: collision with root package name */
        public int f15494e = 1;

        /* renamed from: f, reason: collision with root package name */
        public int f15495f = 2;

        /* renamed from: h, reason: collision with root package name */
        public boolean f15497h = true;

        /* renamed from: i, reason: collision with root package name */
        public boolean f15498i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f15499j = 20;

        /* renamed from: k, reason: collision with root package name */
        public boolean f15500k = false;
        public int phyLevel = 0;

        /* renamed from: l, reason: collision with root package name */
        public boolean f15501l = false;

        /* renamed from: m, reason: collision with root package name */
        public boolean f15502m = false;

        public Builder a2dp(boolean z7) {
            this.f15501l = z7;
            return this;
        }

        public Builder address(String str) {
            this.f15490a = str;
            return this;
        }

        public GattConnParams build() {
            return new GattConnParams(this.f15490a, this.f15491b, this.f15492c, this.f15493d, this.f15494e, this.f15495f, this.f15496g, this.f15497h, this.f15498i, this.f15499j, this.f15500k, this.phyLevel, this.f15501l, this.f15502m);
        }

        @Deprecated
        public Builder createBond(boolean z7) {
            this.f15491b = z7;
            return this;
        }

        public Builder hfp(boolean z7) {
            this.f15502m = z7;
            return this;
        }

        public Builder hid(boolean z7) {
            this.f15493d = z7;
            return this;
        }

        public Builder ignoreEnableNotificationResponse(boolean z7) {
            this.f15497h = z7;
            return this;
        }

        public Builder phy(boolean z7, int i8) {
            this.f15500k = z7;
            this.phyLevel = i8;
            return this;
        }

        public Builder reconnectTimes(int i8) {
            this.f15494e = i8;
            return this;
        }

        public Builder refreshCache(boolean z7) {
            this.f15496g = z7;
            return this;
        }

        public Builder requestMtu(boolean z7) {
            this.f15498i = z7;
            return this;
        }

        public Builder transport(int i8) {
            this.f15495f = i8;
            return this;
        }

        public Builder createBond(boolean z7, int i8) {
            this.f15491b = z7;
            this.f15492c = i8;
            return this;
        }

        public Builder requestMtu(boolean z7, int i8) {
            this.f15498i = z7;
            this.f15499j = i8;
            return this;
        }
    }

    public GattConnParams(String str, boolean z7, int i8, boolean z8, int i9, int i10, boolean z9, boolean z10, boolean z11, int i11, boolean z12, int i12, boolean z13, boolean z14) {
        this.f15477a = str;
        this.f15478b = z7;
        this.f15479c = i8;
        this.f15480d = z8;
        this.f15481e = i9;
        this.f15482f = i10;
        this.f15483g = z9;
        this.f15484h = z10;
        this.f15485i = z11;
        this.f15486j = i11;
        this.f15487k = z12;
        this.phyLevel = i12;
        this.f15488l = z13;
        this.f15489m = z14;
    }

    public String getAddress() {
        return this.f15477a;
    }

    public int getBondTransport() {
        return this.f15479c;
    }

    public int getConnectionTransport() {
        return this.f15482f;
    }

    public int getDefaultMtuSize() {
        return this.f15486j;
    }

    public int getReconnectTimes() {
        return this.f15481e;
    }

    public boolean ignoreEnableNotificationResponse() {
        return this.f15484h;
    }

    public boolean isA2dpEnabled() {
        return this.f15488l;
    }

    public boolean isCreateBond() {
        return this.f15478b;
    }

    public boolean isHfpEnabled() {
        return this.f15489m;
    }

    public boolean isHid() {
        return this.f15480d;
    }

    public boolean isIgnoreEnableNotificationResponse() {
        return this.f15484h;
    }

    public boolean isPhyEnabled() {
        return this.f15487k;
    }

    public boolean isRefreshCache() {
        return this.f15483g;
    }

    public boolean isRequestMtuEnabled() {
        return this.f15485i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GattConnParams {");
        sb.append("\n\taddress=" + BluetoothHelper.formatAddress(this.f15477a, true) + ", isHid=" + this.f15480d + ", a2dp=" + this.f15488l + ", hfp=" + this.f15489m);
        Locale locale = Locale.US;
        boolean z7 = this.f15478b;
        int i8 = this.f15479c;
        StringBuilder sb2 = new StringBuilder("\n\tcreateBond=");
        sb2.append(z7);
        sb2.append(",transport=");
        sb2.append(i8);
        sb.append(sb2.toString());
        sb.append("\n\tmtu=" + this.f15485i + "(" + this.f15486j + ")");
        boolean z8 = this.f15487k;
        StringBuilder sb3 = new StringBuilder("\n\tphy=");
        sb3.append(z8);
        sb.append(sb3.toString());
        sb.append("\n\tconnectionTransport=" + this.f15482f);
        sb.append("\n\trefreshCache=" + this.f15483g);
        sb.append("\n\treconnectTimes=" + this.f15481e);
        sb.append("\n}");
        return sb.toString();
    }
}
