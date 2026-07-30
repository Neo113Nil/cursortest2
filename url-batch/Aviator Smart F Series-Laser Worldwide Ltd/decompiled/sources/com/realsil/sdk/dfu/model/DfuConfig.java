package com.realsil.sdk.dfu.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.dongle.DongleConfig;
import com.realsil.sdk.dfu.gatt.GattConfig;
import com.realsil.sdk.dfu.l.a;
import com.realsil.sdk.dfu.model.BinParameters;
import com.realsil.sdk.dfu.model.ConnectionParameters;
import com.realsil.sdk.dfu.model.DfuBufferCheckConfig;
import com.realsil.sdk.dfu.spp.SppConfig;
import java.util.Locale;

/* loaded from: classes4.dex */
public class DfuConfig implements Parcelable {
    public static final int BATTERY_LEVEL_FORMAT_PERCENTAGE = 0;
    public static final int BATTERY_LEVEL_FORMAT_VALUE = 1;

    @Deprecated
    public static final int BUFFER_CHECK_MTU_UPDATE_MECHANISM_CUSTOMIZED = 3;

    @Deprecated
    public static final int BUFFER_CHECK_MTU_UPDATE_MECHANISM_V1 = 1;

    @Deprecated
    public static final int BUFFER_CHECK_MTU_UPDATE_MECHANISM_V2 = 2;
    public static final int CHANNEL_TYPE_GATT = 0;
    public static final int CHANNEL_TYPE_SPP = 1;
    public static final int CHANNEL_TYPE_SPP_AND_WIFI = 3;
    public static final int CHANNEL_TYPE_USB = 2;
    public static final int COMPLETE_ACTION_REMOVE_BOND = 1;
    public static final long CONNECTION_PARAMETERS_UPDATE_TIMEOUT = 10000;
    public static final Parcelable.Creator<DfuConfig> CREATOR = new Parcelable.Creator<DfuConfig>() { // from class: com.realsil.sdk.dfu.model.DfuConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DfuConfig createFromParcel(Parcel parcel) {
            return new DfuConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DfuConfig[] newArray(int i8) {
            return new DfuConfig[i8];
        }
    };
    public static final int EA_CLOSE_GATT = 4;
    public static final int ERROR_ACTION_DISCONNECT = 1;
    public static final int ERROR_ACTION_REFRESH_DEVICE = 2;
    public static final int FILE_LOCATION_ASSETS = 1;
    public static final int FILE_LOCATION_SDCARD = 0;
    public static final byte IMAGE_VERIFY_IC_TYPE = 1;
    public static final byte IMAGE_VERIFY_NA = 0;
    public static final byte IMAGE_VERIFY_SECTION_SIZE = 4;
    public static final byte IMAGE_VERIFY_VERSION = 2;
    public static final int MAX_POWER_LEVER = 110;
    public static final int MIN_POWER_LEVER = 30;
    public static final int MIN_POWER_LEVER_FOR_HUAWEI = 140;
    public boolean A;
    public int B;
    public int C;
    public ConnectionParameters D;
    public GattConfig E;
    public SppConfig F;
    public DongleConfig G;
    public BinParameters H;
    public DfuBufferCheckConfig I;
    public String J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public long Q;
    public int R;
    public DfuQcConfig S;

    /* renamed from: a, reason: collision with root package name */
    public int f16169a;

    /* renamed from: b, reason: collision with root package name */
    public int f16170b;

    /* renamed from: c, reason: collision with root package name */
    public int f16171c;

    /* renamed from: d, reason: collision with root package name */
    public int f16172d;

    /* renamed from: e, reason: collision with root package name */
    public String f16173e;

    /* renamed from: f, reason: collision with root package name */
    public int f16174f;

    /* renamed from: g, reason: collision with root package name */
    public int f16175g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16176h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16177i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16178j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16179k;

    /* renamed from: l, reason: collision with root package name */
    public Long f16180l;

    /* renamed from: m, reason: collision with root package name */
    public int f16181m;

    /* renamed from: n, reason: collision with root package name */
    public int f16182n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f16183o;

    /* renamed from: p, reason: collision with root package name */
    public int f16184p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16185q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16186r;

    /* renamed from: s, reason: collision with root package name */
    public int f16187s;

    /* renamed from: t, reason: collision with root package name */
    public int f16188t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16189u;

    /* renamed from: v, reason: collision with root package name */
    public int f16190v;

    /* renamed from: w, reason: collision with root package name */
    public int f16191w;

    /* renamed from: x, reason: collision with root package name */
    public int f16192x;

    /* renamed from: y, reason: collision with root package name */
    public long f16193y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f16194z;

    public DfuConfig() {
        this(0);
    }

    public void addCompleteAction(int i8) {
        this.f16181m = i8 | this.f16181m;
    }

    public void addErrorAction(int i8) {
        this.f16182n = i8 | this.f16182n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Long getActiveImageDelayTime() {
        return this.f16180l;
    }

    public String getAddress() {
        return this.f16173e;
    }

    public int getBatteryLevelFormat() {
        return this.f16191w;
    }

    public BinParameters getBinParameters() {
        return this.H;
    }

    public DfuBufferCheckConfig getBufferCheckConfig() {
        return this.I;
    }

    @Deprecated
    public int getBufferCheckMtuUpdateMechanism() {
        return getBufferCheckConfig().getMtuUpdateMechanism();
    }

    public int getChannelType() {
        return this.f16169a;
    }

    public ConnectionParameters getConnectionParameters() {
        return this.D;
    }

    public long getConnectionTimeout() {
        return this.f16193y;
    }

    public DongleConfig getDongleConfig() {
        if (this.G == null) {
            this.G = new DongleConfig.Builder().build();
        }
        return this.G;
    }

    public int getFlowControlInterval() {
        return this.f16187s;
    }

    public int getFlowControlIntervalUnit() {
        return this.f16188t;
    }

    public GattConfig getGattConfig() {
        return this.E;
    }

    public int getHandoverTimeout() {
        return this.L;
    }

    public int getImageVerifyIndicator() {
        return this.f16174f;
    }

    public int getLatencyTimeout() {
        return this.B;
    }

    public String getLocalName() {
        return this.J;
    }

    public int getLogLevel() {
        return this.K;
    }

    public int getLowBatteryThreshold() {
        return this.f16190v;
    }

    public int getManufacturerId() {
        return this.C;
    }

    public int getMaxPacketSize() {
        return this.f16184p;
    }

    public long getNotificationTimeout() {
        return this.Q;
    }

    public int getOtaWorkMode() {
        return this.f16171c;
    }

    public int getPrimaryIcType() {
        return this.f16172d;
    }

    public int getPrimaryMtuSize() {
        return this.f16184p;
    }

    public int getProtocolType() {
        return this.f16170b;
    }

    public DfuQcConfig getQcConfig() {
        return this.S;
    }

    public int getRetransConnectTimes() {
        return this.f16192x;
    }

    public byte[] getSecretKey() {
        return this.f16183o;
    }

    public SppConfig getSppConfig() {
        if (this.F == null) {
            this.F = new SppConfig.Builder().build();
        }
        return this.F;
    }

    public int getVersionCheckMode() {
        return this.f16175g;
    }

    public int getVpId() {
        return this.R;
    }

    public boolean isAutomaticActiveEnabled() {
        return this.f16176h;
    }

    public boolean isBatteryCheckEnabled() {
        return this.f16189u;
    }

    public boolean isBondConnectionEnabled() {
        return this.f16194z;
    }

    public boolean isBreakpointResumeEnabled() {
        return this.f16178j;
    }

    public boolean isCheckOtaResultEnabled() {
        return this.P;
    }

    public boolean isCompleteActionEnabled(int i8) {
        return (this.f16181m & i8) == i8;
    }

    public boolean isConParamUpdateLatencyEnabled() {
        return this.A;
    }

    public boolean isConnectBackEnabled() {
        return this.O;
    }

    public boolean isErrorActionEnabled(int i8) {
        return (this.f16182n & i8) == i8;
    }

    public boolean isFlowControlEnabled() {
        return this.f16186r;
    }

    public boolean isHid() {
        return this.N;
    }

    public boolean isIcCheckEnabled() {
        return (this.f16174f & 1) == 1;
    }

    public boolean isMtuUpdateEnabled() {
        return this.f16185q;
    }

    public boolean isSectionSizeCheckEnabled() {
        return (this.f16174f & 4) == 4;
    }

    public boolean isThroughputEnabled() {
        return this.f16177i;
    }

    public boolean isVersionCheckEnabled() {
        return (this.f16174f & 2) == 2;
    }

    public boolean isWaitActiveCmdAckEnabled() {
        return this.f16179k;
    }

    public boolean isWaitDisconnectWhenEnterOtaMode() {
        return this.M;
    }

    public void removeCompleteAction(int i8) {
        this.f16181m = (~i8) & this.f16181m;
    }

    public void removeErrorAction(int i8) {
        this.f16182n = (~i8) & this.f16182n;
    }

    public void setActiveImageDelayTime(Long l8) {
        this.f16180l = l8;
    }

    public void setAddress(String str) {
        this.f16173e = str;
    }

    public void setAutomaticActiveEnabled(boolean z7) {
        this.f16176h = z7;
    }

    public void setBatteryCheckEnabled(boolean z7) {
        this.f16189u = z7;
    }

    public void setBatteryLevelFormat(int i8) {
        this.f16191w = i8;
    }

    public void setBinParameters(BinParameters binParameters) {
        this.H = binParameters;
    }

    public void setBondConnectionEnabled(boolean z7) {
        this.f16194z = z7;
    }

    public void setBreakpointResumeEnabled(boolean z7) {
        this.f16178j = z7;
    }

    public void setBufferCheckConfig(DfuBufferCheckConfig dfuBufferCheckConfig) {
        this.I = dfuBufferCheckConfig;
    }

    @Deprecated
    public void setBufferCheckMtuUpdateEnabled(boolean z7) {
        DfuBufferCheckConfig.Builder builder;
        int i8;
        if (z7) {
            builder = new DfuBufferCheckConfig.Builder();
            i8 = 2;
        } else {
            builder = new DfuBufferCheckConfig.Builder();
            i8 = 1;
        }
        setBufferCheckConfig(builder.mtuUpdateMechanism(i8).build());
    }

    @Deprecated
    public void setBufferCheckMtuUpdateMechanism(int i8) {
        setBufferCheckConfig(new DfuBufferCheckConfig.Builder().mtuUpdateMechanism(i8).build());
    }

    public void setChannelType(int i8) {
        this.f16169a = i8;
    }

    public void setCheckOtaResultEnabled(boolean z7) {
        this.P = z7;
    }

    public void setConParamUpdateLatencyEnabled(boolean z7) {
        this.A = z7;
    }

    public void setConnectBackEnabled(boolean z7) {
        this.O = z7;
    }

    public void setConnectionParameters(ConnectionParameters connectionParameters) {
        this.D = connectionParameters;
    }

    public void setConnectionTimeout(long j8) {
        this.f16193y = j8;
    }

    @Deprecated
    public void setControlPointUuid(String str) {
        setDfuControlPointUuid(str);
    }

    @Deprecated
    public void setDataUuid(String str) {
        setDfuDataUuid(str);
    }

    @Deprecated
    public void setDfuControlPointUuid(String str) {
        this.E.setDfuControlPointUuid(str);
    }

    @Deprecated
    public void setDfuDataUuid(String str) {
        this.E.setDfuDataUuid(str);
    }

    @Deprecated
    public void setDfuServiceUuid(String str) {
        this.E.setDfuServiceUuid(str);
    }

    public void setDongleConfig(DongleConfig dongleConfig) {
        this.G = dongleConfig;
    }

    public void setFileIndicator(int i8) {
    }

    public void setFileLocation(int i8) {
    }

    public void setFilePath(String str) {
        BinParameters binParameters = this.H;
        if (binParameters == null) {
            setBinParameters(new BinParameters.Builder().filePath(str).build());
        } else {
            binParameters.setFilePath(str);
        }
    }

    public void setFileSuffix(String str) {
        BinParameters binParameters = this.H;
        if (binParameters == null) {
            setBinParameters(new BinParameters.Builder().suffix(str).build());
        } else {
            binParameters.setSuffix(str);
        }
    }

    public void setFlowControlEnabled(boolean z7) {
        this.f16186r = z7;
    }

    public void setFlowControlInterval(int i8) {
        this.f16187s = i8;
    }

    public void setFlowControlIntervalUnit(int i8) {
        this.f16188t = i8;
    }

    public void setGattConfig(GattConfig gattConfig) {
        this.E = gattConfig;
    }

    public void setHandoverTimeout(int i8) {
        this.L = i8;
    }

    public void setHid(boolean z7) {
        this.N = z7;
    }

    public void setIcCheckEnabled(boolean z7) {
        this.f16174f = z7 ? this.f16174f | 1 : this.f16174f & (-2);
    }

    public void setImageVerifyIndicator(int i8) {
        this.f16174f = i8;
    }

    public void setLatencyTimeout(int i8) {
        this.B = i8;
    }

    public void setLocalName(String str) {
        this.J = str;
    }

    public void setLogLevel(int i8) {
        this.K = i8;
    }

    public void setLowBatteryThreshold(int i8) {
        this.f16190v = i8;
    }

    public void setManufacturerId(int i8) {
        this.C = i8;
    }

    @Deprecated
    public void setMaxPacketSize(int i8) {
        this.f16184p = i8;
    }

    public void setMtuUpdateEnabled(boolean z7) {
        this.f16185q = z7;
    }

    public void setNotificationTimeout(long j8) {
        if (j8 < 0 || j8 > 60000) {
            ZLogger.w(String.format(Locale.US, "timeout in millis, should range from 0 ~ %d", 60000L));
        } else {
            this.Q = j8;
        }
    }

    @Deprecated
    public void setOtaServiceUuid(String str) {
        this.E.setOtaServiceUuid(str);
    }

    public void setOtaWorkMode(int i8) {
        this.f16171c = i8;
    }

    public void setPrimaryIcType(int i8) {
        this.f16172d = i8;
    }

    public void setPrimaryMtuSize(int i8) {
        this.f16184p = i8;
    }

    public void setProtocolType(int i8) {
        this.f16170b = i8;
    }

    public void setQcConfig(DfuQcConfig dfuQcConfig) {
        this.S = dfuQcConfig;
    }

    public void setRetransConnectTimes(int i8) {
        this.f16192x = i8;
    }

    public void setSecretKey(byte[] bArr) {
        this.f16183o = bArr;
    }

    public void setSectionSizeCheckEnabled(boolean z7) {
        this.f16174f = z7 ? this.f16174f | 4 : this.f16174f & (-5);
    }

    @Deprecated
    public void setServiceUuid(String str) {
        setDfuServiceUuid(str);
    }

    public void setSppConfig(SppConfig sppConfig) {
        this.F = sppConfig;
    }

    public void setThroughputEnabled(boolean z7) {
        this.f16177i = z7;
    }

    public void setVersionCheckEnabled(boolean z7) {
        this.f16174f = z7 ? this.f16174f | 2 : this.f16174f & (-3);
    }

    public void setVersionCheckMode(int i8) {
        this.f16175g = i8;
    }

    public void setVpId(int i8) {
        this.R = i8;
    }

    public void setWaitActiveCmdAckEnabled(boolean z7) {
        this.f16179k = z7;
    }

    public void setWaitDisconnectWhenEnterOtaMode(boolean z7) {
        this.M = z7;
    }

    public String toString() {
        SppConfig sppConfig;
        String format;
        StringBuilder sb = new StringBuilder();
        sb.append("DfuConfig{");
        sb.append(String.format("manufacturerId=0x%04X, primaryIcType=%s\n", Integer.valueOf(this.C), a.a(this.f16172d)));
        sb.append(String.format("address==%s, localName=%s, isHid=%b\n", BluetoothHelper.formatAddress(this.f16173e, true), this.J, Boolean.valueOf(this.N)));
        Locale locale = Locale.US;
        sb.append(String.format(locale, "logLevel=%d\n", Integer.valueOf(this.K)));
        sb.append(String.format("mProtocolType=0x%04X, mChannelType=0x%02x, workMode=0x%04X\n", Integer.valueOf(this.f16170b), Integer.valueOf(this.f16169a), Integer.valueOf(this.f16171c)));
        int i8 = this.f16169a;
        if (i8 == 0) {
            ConnectionParameters connectionParameters = this.D;
            if (connectionParameters != null) {
                sb.append(String.format("\t%s\n", connectionParameters.toString()));
            } else {
                ZLogger.v("not set connectionParameters");
            }
            GattConfig gattConfig = this.E;
            if (gattConfig != null) {
                format = String.format("\t%s\n", gattConfig.toString());
                sb.append(format);
            }
        } else if (i8 == 2) {
            DongleConfig dongleConfig = this.G;
            if (dongleConfig != null) {
                format = String.format("\t%s\n", dongleConfig.toString());
                sb.append(format);
            }
        } else if (i8 == 1 && (sppConfig = this.F) != null) {
            format = String.format("\t%s\n", sppConfig.toString());
            sb.append(format);
        }
        BinParameters binParameters = this.H;
        if (binParameters != null) {
            sb.append(String.format("\t%s\n", binParameters.toString()));
        } else {
            ZLogger.v("not set binParameters");
        }
        if (this.f16171c == 24) {
            sb.append(String.format("\n\tvpId=0x%04X", Integer.valueOf(this.R)));
        }
        sb.append(String.format(locale, "handoverTimeout=%ds, notificationTimeout=%dms\n", Integer.valueOf(this.L), Long.valueOf(this.Q)));
        sb.append(String.format("\timageVerifyIndicator=0x%08x\n", Integer.valueOf(this.f16174f)));
        sb.append(String.format(locale, "\tversionCheck=%b, mode=%d, icCheck=%b, sectionSizeCheck=%b\n, batteryCheck=%b, connectBack=%b, checkOtaResult=%b\n", Boolean.valueOf(isVersionCheckEnabled()), Integer.valueOf(getVersionCheckMode()), Boolean.valueOf(isIcCheckEnabled()), Boolean.valueOf(isSectionSizeCheckEnabled()), Boolean.valueOf(this.f16189u), Boolean.valueOf(this.O), Boolean.valueOf(this.P)));
        sb.append(String.format(locale, "conParamUpdateLatency=%b, latencyTimeout=%d", Boolean.valueOf(this.A), Integer.valueOf(this.B)));
        if (this.f16189u) {
            sb.append(String.format(locale, "\nlowBatteryThreshold=%d, batteryLevelFormat=%d", Integer.valueOf(this.f16190v), Integer.valueOf(this.f16191w)));
        }
        sb.append(String.format(locale, "\nmtuUpdate=%b,primaryMtuSize=%d", Boolean.valueOf(this.f16185q), Integer.valueOf(this.f16184p)));
        sb.append("\n\t");
        sb.append(this.I.toString());
        sb.append(String.format("\nthroughput=%b, breakpointResume=%b,waitActiveCmdAck=%b, activeImageDelayTime=%d", Boolean.valueOf(this.f16177i), Boolean.valueOf(this.f16178j), Boolean.valueOf(this.f16179k), this.f16180l));
        if (this.f16186r) {
            sb.append(String.format(locale, ", flowControl: interval=%d, unit=%dms", Integer.valueOf(this.f16187s), Integer.valueOf(this.f16188t)));
        }
        sb.append(String.format("\ncompleteAction=0x%04X, ", Integer.valueOf(this.f16181m)));
        sb.append(String.format("\nerrorAction=0x%04X, ERROR_ACTION_DISCONNECT=%b, ERROR_ACTION_REFRESH_DEVICE=%b, EA_CLOSE_GATT=%b", Integer.valueOf(this.f16182n), Boolean.valueOf(isErrorActionEnabled(1)), Boolean.valueOf(isErrorActionEnabled(2)), Boolean.valueOf(isErrorActionEnabled(4))));
        sb.append(String.format(locale, "\nretransConnectTimes=%d, connectionTimeout=%d", Integer.valueOf(this.f16192x), Long.valueOf(this.f16193y)));
        if (this.S != null) {
            sb.append("\n\t" + this.S.toString());
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f16169a);
        parcel.writeInt(this.f16170b);
        parcel.writeInt(this.f16171c);
        parcel.writeInt(this.f16172d);
        parcel.writeString(this.f16173e);
        parcel.writeInt(this.f16174f);
        parcel.writeInt(this.f16175g);
        parcel.writeByte(this.f16176h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16177i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16178j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16179k ? (byte) 1 : (byte) 0);
        if (this.f16180l == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f16180l.longValue());
        }
        parcel.writeInt(this.f16181m);
        parcel.writeInt(this.f16182n);
        parcel.writeByteArray(this.f16183o);
        parcel.writeInt(this.f16184p);
        parcel.writeByte(this.f16185q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16186r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f16187s);
        parcel.writeInt(this.f16188t);
        parcel.writeByte(this.f16189u ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f16190v);
        parcel.writeInt(this.f16191w);
        parcel.writeInt(this.f16192x);
        parcel.writeLong(this.f16193y);
        parcel.writeByte(this.f16194z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeParcelable(this.D, i8);
        parcel.writeParcelable(this.E, i8);
        parcel.writeParcelable(this.F, i8);
        parcel.writeParcelable(this.G, i8);
        parcel.writeParcelable(this.H, i8);
        parcel.writeParcelable(this.I, i8);
        parcel.writeString(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeByte(this.M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.N ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.O ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.P ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.Q);
        parcel.writeInt(this.R);
        parcel.writeParcelable(this.S, i8);
    }

    public DfuConfig(int i8) {
        this.f16169a = 0;
        this.f16170b = 0;
        this.f16171c = 0;
        this.f16172d = 3;
        this.f16174f = 7;
        this.f16175g = 0;
        this.f16176h = true;
        this.f16177i = false;
        this.f16178j = false;
        this.f16179k = false;
        this.f16180l = 0L;
        this.f16181m = 0;
        this.f16182n = 7;
        this.f16184p = 20;
        this.f16185q = false;
        this.f16186r = false;
        this.f16187s = 0;
        this.f16188t = 50;
        this.f16189u = false;
        this.f16190v = 30;
        this.f16191w = 0;
        this.f16192x = 2;
        this.f16193y = 32000L;
        this.f16194z = false;
        this.A = true;
        this.B = 6;
        this.C = 93;
        this.K = 0;
        this.L = 6;
        this.M = true;
        this.Q = 10000L;
        this.f16171c = i8;
        this.D = new ConnectionParameters.Builder().minInterval(6).maxInterval(17).latency(0).timeout(500).build();
        this.E = new GattConfig.Builder().build();
        this.H = new BinParameters.Builder().build();
        this.I = new DfuBufferCheckConfig.Builder().build();
    }

    public DfuConfig(Parcel parcel) {
        this.f16169a = 0;
        this.f16170b = 0;
        this.f16171c = 0;
        this.f16172d = 3;
        this.f16174f = 7;
        this.f16175g = 0;
        this.f16176h = true;
        this.f16177i = false;
        this.f16178j = false;
        this.f16179k = false;
        this.f16180l = 0L;
        this.f16181m = 0;
        this.f16182n = 7;
        this.f16184p = 20;
        this.f16185q = false;
        this.f16186r = false;
        this.f16187s = 0;
        this.f16188t = 50;
        this.f16189u = false;
        this.f16190v = 30;
        this.f16191w = 0;
        this.f16192x = 2;
        this.f16193y = 32000L;
        this.f16194z = false;
        this.A = true;
        this.B = 6;
        this.C = 93;
        this.K = 0;
        this.L = 6;
        this.M = true;
        this.Q = 10000L;
        this.f16169a = parcel.readInt();
        this.f16170b = parcel.readInt();
        this.f16171c = parcel.readInt();
        this.f16172d = parcel.readInt();
        this.f16173e = parcel.readString();
        this.f16174f = parcel.readInt();
        this.f16175g = parcel.readInt();
        this.f16176h = parcel.readByte() != 0;
        this.f16177i = parcel.readByte() != 0;
        this.f16178j = parcel.readByte() != 0;
        this.f16179k = parcel.readByte() != 0;
        this.f16180l = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
        this.f16181m = parcel.readInt();
        this.f16182n = parcel.readInt();
        this.f16183o = parcel.createByteArray();
        this.f16184p = parcel.readInt();
        this.f16185q = parcel.readByte() != 0;
        this.f16186r = parcel.readByte() != 0;
        this.f16187s = parcel.readInt();
        this.f16188t = parcel.readInt();
        this.f16189u = parcel.readByte() != 0;
        this.f16190v = parcel.readInt();
        this.f16191w = parcel.readInt();
        this.f16192x = parcel.readInt();
        this.f16193y = parcel.readLong();
        this.f16194z = parcel.readByte() != 0;
        this.A = parcel.readByte() != 0;
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = (ConnectionParameters) parcel.readParcelable(ConnectionParameters.class.getClassLoader());
        this.E = (GattConfig) parcel.readParcelable(GattConfig.class.getClassLoader());
        this.F = (SppConfig) parcel.readParcelable(SppConfig.class.getClassLoader());
        this.G = (DongleConfig) parcel.readParcelable(DongleConfig.class.getClassLoader());
        this.H = (BinParameters) parcel.readParcelable(BinParameters.class.getClassLoader());
        this.I = (DfuBufferCheckConfig) parcel.readParcelable(DfuBufferCheckConfig.class.getClassLoader());
        this.J = parcel.readString();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readByte() != 0;
        this.N = parcel.readByte() != 0;
        this.O = parcel.readByte() != 0;
        this.P = parcel.readByte() != 0;
        this.Q = parcel.readLong();
        this.R = parcel.readInt();
        this.S = (DfuQcConfig) parcel.readParcelable(DfuQcConfig.class.getClassLoader());
    }

    public DfuConfig(String str, String str2) {
        this.f16169a = 0;
        this.f16170b = 0;
        this.f16171c = 0;
        this.f16172d = 3;
        this.f16174f = 7;
        this.f16175g = 0;
        this.f16176h = true;
        this.f16177i = false;
        this.f16178j = false;
        this.f16179k = false;
        this.f16180l = 0L;
        this.f16181m = 0;
        this.f16182n = 7;
        this.f16184p = 20;
        this.f16185q = false;
        this.f16186r = false;
        this.f16187s = 0;
        this.f16188t = 50;
        this.f16189u = false;
        this.f16190v = 30;
        this.f16191w = 0;
        this.f16192x = 2;
        this.f16193y = 32000L;
        this.f16194z = false;
        this.A = true;
        this.B = 6;
        this.C = 93;
        this.K = 0;
        this.L = 6;
        this.M = true;
        this.Q = 10000L;
        this.f16173e = str;
        this.D = new ConnectionParameters.Builder().minInterval(6).maxInterval(17).latency(0).timeout(500).build();
        ZLogger.v("init default:" + this.D.toString());
        this.E = new GattConfig.Builder().build();
        this.H = new BinParameters.Builder().storageType(0).filePath(str2).build();
        ZLogger.v("init default:" + this.H.toString());
        this.I = new DfuBufferCheckConfig.Builder().build();
    }
}
