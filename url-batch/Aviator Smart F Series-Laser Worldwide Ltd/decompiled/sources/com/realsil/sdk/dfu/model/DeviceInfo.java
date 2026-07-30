package com.realsil.sdk.dfu.model;

import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.wrapper.SocImageWrapper;
import com.realsil.sdk.dfu.n.b;
import com.realsil.sdk.dfu.s.d;
import com.realsil.sdk.dfu.x.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import y5.u;

/* loaded from: classes4.dex */
public class DeviceInfo {
    public static final int AES_MODE_16_FIRST = 0;
    public static final int AES_MODE_16_N = 1;
    public static final int BUD_ROLE_PRIMARY = 1;
    public static final int BUD_ROLE_SECONDARY = 2;
    public static final int BUD_ROLE_SINGLE = 0;
    public static final int MECHANISM_ALL_IN_ONE = 2;
    public static final int MECHANISM_ALL_IN_ONE_WITH_BUFFER = 3;
    public static final int MECHANISM_DEFAULT = 1;
    public static final int MECHANISM_ONE_BY_ONE = 1;
    public static final int RWS_FLAG_HANDOVER_PROCESSING = 1;
    public static final int RWS_FLAG_PREPARED = 0;
    public static final int RWS_MODE_ENGAGED = 2;
    public static final int RWS_MODE_ENGAGE_IDLE = 1;
    public static final int RWS_MODE_SINGLE = 0;
    public static final int UPDATE_MULTI_AT_A_TIME = 1;
    public static final int UPDATE_ONE_BY_ONE = 0;
    public List A;
    public int B;
    public byte C;
    public byte D;
    public byte[] E;
    public int G;
    public Map H;
    public int appData0;
    public int appData1;
    public int appData2;
    public int appData3;
    public boolean appDataSupportedOld;
    public BankInfo bootBankInfo;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16139d;
    public DisInfo disInfo;

    /* renamed from: e, reason: collision with root package name */
    public int f16140e;

    /* renamed from: f, reason: collision with root package name */
    public int f16141f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16142g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16143h;
    public byte[] imageSectionSizeValues;
    public byte[] imageVersionValues;
    public byte[] inactiveImageVersionValues;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16145j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16147l;
    public int mtu;
    public BankInfo normalBankInfo;
    public int protocolType;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f16153r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f16154s;
    public BankInfo secureBankInfo;
    public int secureVersion;

    /* renamed from: t, reason: collision with root package name */
    public int f16155t;

    /* renamed from: u, reason: collision with root package name */
    public int f16156u;

    /* renamed from: v, reason: collision with root package name */
    public int f16157v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16159x;

    /* renamed from: y, reason: collision with root package name */
    public List f16160y;

    /* renamed from: z, reason: collision with root package name */
    public List f16161z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16136a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16137b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16138c = false;
    public int icType = 3;
    public int specVersion = 0;
    public int appFreeBank = 0;
    public int patchFreeBank = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f16144i = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f16146k = 0;
    public boolean leNormalModeSupported = true;
    public boolean compressSupported = false;
    public int compressMode = 0;
    public boolean reportImageNumberFeatureSupported = false;

    /* renamed from: m, reason: collision with root package name */
    public int f16148m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f16149n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f16150o = 0;
    public boolean rwsOtaBudSupported = false;
    public boolean rwsOtaFirstBud = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16151p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16152q = false;
    public int maxBufferCheckSize = 256;
    public int otaTempBufferSize = 0;
    public int imageVersionIndicator = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f16158w = 1;
    public int updateBankIndicator = 0;
    public int F = -1;
    public OtaBudInfo I = new OtaBudInfo();
    public OtaBudInfo J = new OtaBudInfo();
    public OtaBudInfo K = new OtaBudInfo();
    public boolean handShakeSupported = false;
    public boolean nandFlashSupported = false;
    public boolean longImageVersionSupported = false;

    public final int a(int i8, int i9) {
        return i8;
    }

    public void appendActiveImageVersionBytes(byte[] bArr) {
        appendActiveImageVersionBytes(bArr, 0);
    }

    public void appendDebugCharacteristicInfo(int i8, byte[] bArr) {
        if (this.A == null) {
            this.A = new ArrayList();
        }
        this.A.add(new CharacteristicInfo(i8, bArr));
    }

    public void appendImageFeatureInfo(int i8, String str) {
        if (this.H == null) {
            this.H = new HashMap();
        }
        this.H.put(Integer.valueOf(i8), str);
    }

    public void appendImageSectionSizeBytes(byte[] bArr) {
        byte[] bArr2 = this.imageSectionSizeValues;
        if (bArr2 == null || bArr2.length <= 0) {
            this.imageSectionSizeValues = bArr;
        } else {
            byte[] bArr3 = new byte[bArr2.length + bArr.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.imageSectionSizeValues.length, bArr.length);
            this.imageSectionSizeValues = bArr3;
        }
        this.f16160y = ImageVersionInfoParser.wrapperImageVersionInfos(this.protocolType, this.specVersion, this.updateBankIndicator, this.imageVersionIndicator, this.imageVersionValues, this.imageSectionSizeValues, this.longImageVersionSupported);
    }

    public void appendImageVersionBytes(byte[] bArr) {
        int i8 = this.protocolType;
        if (i8 == 20 || i8 == 21 || i8 == 22) {
            if (bArr == null || bArr.length < 1) {
                return;
            }
            if (bArr[0] == 0) {
                appendActiveImageVersionBytes(bArr, 1);
                return;
            } else {
                appendInactiveImageVersionBytes(bArr, 1);
                return;
            }
        }
        if (i8 == 16) {
            if (this.specVersion < 4) {
                appendActiveImageVersionBytes(bArr, 0);
                return;
            }
            if (bArr == null || bArr.length < 1) {
                return;
            }
            if (bArr[0] == 0) {
                appendActiveImageVersionBytes(bArr, 1);
                return;
            } else {
                appendInactiveImageVersionBytes(bArr, 1);
                return;
            }
        }
        if (i8 != 17 || this.specVersion < 6) {
            appendActiveImageVersionBytes(bArr, 0);
            return;
        }
        if (bArr == null || bArr.length < 1) {
            return;
        }
        if (bArr[0] == 0) {
            appendActiveImageVersionBytes(bArr, 1);
        } else {
            appendInactiveImageVersionBytes(bArr, 1);
        }
    }

    public void appendInactiveImageVersionBytes(byte[] bArr) {
        appendInactiveImageVersionBytes(bArr, 0);
    }

    public final void b() {
        int i8 = this.specVersion;
        if (i8 == 0) {
            if (this.f16146k == 1) {
                this.f16158w = 2;
                return;
            } else {
                this.f16158w = 1;
                return;
            }
        }
        if (i8 == 1) {
            if (this.f16146k != 1) {
                this.f16158w = 1;
                return;
            } else if (this.otaTempBufferSize != 0) {
                this.f16158w = 3;
                return;
            } else {
                this.f16158w = 2;
                return;
            }
        }
        if (i8 == 2) {
            this.f16158w = 1;
            return;
        }
        if (this.f16146k != 1) {
            this.f16158w = 1;
        } else if (this.otaTempBufferSize != 0) {
            this.f16158w = 3;
        } else {
            this.f16158w = 2;
        }
    }

    public String dumpFeatures() {
        Map map = this.H;
        if (map == null || map.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : this.H.keySet()) {
            sb.append(String.format("--image:0x%04X, feature:%s", num, this.H.get(num)));
        }
        return sb.toString();
    }

    public int getActiveBank() {
        int i8 = this.updateBankIndicator;
        if (i8 == 1) {
            return 1;
        }
        return i8 == 2 ? 0 : 15;
    }

    public ImageVersionInfo getActiveImageVersionInfo(int i8) {
        List list = this.f16160y;
        if (list != null && list.size() > 0) {
            for (ImageVersionInfo imageVersionInfo : this.f16160y) {
                if (imageVersionInfo.getBitNumber() == i8) {
                    return imageVersionInfo;
                }
            }
        }
        return null;
    }

    public ImageVersionInfo getActiveImageVersionInfoByImageId(int i8) {
        List list = this.f16160y;
        if (list != null && list.size() > 0) {
            for (ImageVersionInfo imageVersionInfo : this.f16160y) {
                if (imageVersionInfo.getImageId() == i8) {
                    return imageVersionInfo;
                }
            }
        }
        return null;
    }

    public int getAesEncryptMode() {
        return this.f16144i;
    }

    public byte[] getAppConfigReleaseVer() {
        return this.E;
    }

    public SocImageWrapper getAppUiParameterVersion() {
        return new DeviceInfoWrapper(this).getAppConfigImageWrapper();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0 != 10) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007e, code lost:
    
        if (r0 != 10) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getAppVersion() {
        ImageVersionInfo activeImageVersionInfo;
        int i8 = this.protocolType;
        if (i8 == 16) {
            int i9 = this.icType;
            if (i9 > 3) {
                if (i9 != 5) {
                    if (i9 != 9) {
                        if (i9 != 12) {
                            if (i9 != 4) {
                                if (i9 != 6) {
                                    if (i9 != 7) {
                                        if (i9 != 8) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                activeImageVersionInfo = getActiveImageVersionInfo(a(5, this.imageVersionIndicator));
            }
            activeImageVersionInfo = null;
        } else if (i8 == 17) {
            int i10 = this.icType;
            if (i10 > 3) {
                if (i10 != 5 && i10 != 9 && i10 != 12) {
                    if (i10 == 4 || i10 == 6 || i10 == 7 || i10 == 8 || i10 == 10) {
                        if (this.specVersion >= 6) {
                            activeImageVersionInfo = getActiveImageVersionInfoByImageId(10131);
                        }
                    }
                }
                activeImageVersionInfo = getActiveImageVersionInfo(a(5, this.imageVersionIndicator));
            }
            activeImageVersionInfo = null;
        } else {
            int i11 = this.specVersion;
            if (i11 == 0) {
                return this.f16156u;
            }
            if (i11 >= 1) {
                int i12 = this.icType;
                if (i12 <= 3) {
                    activeImageVersionInfo = this.updateBankIndicator == 2 ? getActiveImageVersionInfo(2) : getActiveImageVersionInfo(1);
                } else {
                    if (i12 != 5) {
                        if (i12 != 9) {
                            if (i12 != 12) {
                                if (i12 != 4) {
                                    if (i12 != 6) {
                                        if (i12 != 7) {
                                            if (i12 != 8) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    activeImageVersionInfo = getActiveImageVersionInfo(a(5, this.imageVersionIndicator));
                }
            }
            activeImageVersionInfo = null;
        }
        if (activeImageVersionInfo != null) {
            return activeImageVersionInfo.getVersion();
        }
        return 0L;
    }

    public int getBatteryLevel() {
        return this.f16140e;
    }

    public int getBudRole() {
        return this.f16148m;
    }

    public int getBufferCheckMtuUpdateMechanism() {
        return this.protocolType == 0 ? 1 : 2;
    }

    public int getCompressedImageHeaderOffset() {
        return this.G;
    }

    public List<CharacteristicInfo> getDebugCharacteristicInfos() {
        return this.A;
    }

    public byte[] getDeviceMac() {
        return this.f16154s;
    }

    public DisInfo getDisInfo() {
        return this.disInfo;
    }

    public SocImageWrapper getDspUiParameterVersion() {
        return new DeviceInfoWrapper(this).getDspConfigImageWrapper();
    }

    public List<ImageVersionInfo> getExistImageVersionInfos() {
        ArrayList arrayList = new ArrayList();
        List list = this.f16160y;
        if (list != null && !list.isEmpty()) {
            for (ImageVersionInfo imageVersionInfo : this.f16160y) {
                if (imageVersionInfo.getIndication() != 0) {
                    arrayList.add(imageVersionInfo);
                }
            }
        }
        return arrayList;
    }

    public List<ImageVersionInfo> getExistInactiveImageVersionInfos() {
        ArrayList arrayList = new ArrayList();
        List list = this.f16161z;
        if (list != null && !list.isEmpty()) {
            for (ImageVersionInfo imageVersionInfo : this.f16161z) {
                if (imageVersionInfo.getIndication() != 0) {
                    arrayList.add(imageVersionInfo);
                }
            }
        }
        return arrayList;
    }

    public List<SocImageWrapper> getExistInactiveSocImageWrappers() {
        return DeviceInfoParser.getExistInactiveSocImageWrappers(this, this.f16161z);
    }

    public List<SocImageWrapper> getExistSocImageWrappers() {
        ArrayList arrayList = new ArrayList();
        List list = this.f16160y;
        if (list != null && !list.isEmpty()) {
            for (ImageVersionInfo imageVersionInfo : this.f16160y) {
                if (imageVersionInfo.getIndication() != 0) {
                    arrayList.add(new SocImageWrapper.Builder().setDeviceInfo(this).imageVersionInfo(imageVersionInfo).imageFeature(getImageFeature(imageVersionInfo.getImageId())).build());
                }
            }
        }
        return arrayList;
    }

    public byte getIcId() {
        return this.C;
    }

    public String getImageFeature(int i8) {
        Map map = this.H;
        return (map == null || map.size() == 0 || !this.H.containsKey(Integer.valueOf(i8))) ? "" : (String) this.H.get(Integer.valueOf(i8));
    }

    public Map<Integer, String> getImageFeatureMap() {
        return this.H;
    }

    public int getImageHeaderOffset() {
        return this.F;
    }

    public List<ImageVersionInfo> getImageVersionInfos() {
        return this.f16160y;
    }

    public ImageVersionInfo getInActiveImageVersionInfo(int i8) {
        List list = this.f16161z;
        if (list != null && list.size() > 0) {
            for (ImageVersionInfo imageVersionInfo : this.f16161z) {
                if (imageVersionInfo.getBitNumber() == i8) {
                    return imageVersionInfo;
                }
            }
        }
        return null;
    }

    public ImageVersionInfo getInActiveImageVersionInfoByImageId(int i8) {
        List list = this.f16161z;
        if (list != null && list.size() > 0) {
            for (ImageVersionInfo imageVersionInfo : this.f16161z) {
                if (imageVersionInfo.getImageId() == i8) {
                    return imageVersionInfo;
                }
            }
        }
        return null;
    }

    public int getInactiveBank() {
        int i8 = this.updateBankIndicator;
        if (i8 == 1) {
            return 0;
        }
        return i8 == 2 ? 1 : 15;
    }

    public List<ImageVersionInfo> getInactiveImageVersionInfos() {
        return this.f16161z;
    }

    public String getIpv() {
        return String.format("I%02XP%04XV%02XCID%02XPID%02X", Integer.valueOf(this.icType), Integer.valueOf(this.protocolType), Integer.valueOf(this.specVersion), Byte.valueOf(this.C), Byte.valueOf(this.D));
    }

    public OtaBudInfo getLeftBudInfo() {
        return this.J;
    }

    public int getNoTempImageId() {
        return this.B;
    }

    public int getOldPatchVersion() {
        return this.f16155t;
    }

    public SocImageWrapper getOtaHeaderVersion() {
        return new DeviceInfoWrapper(this).getOtaHeaderImageWrapper();
    }

    public byte getPackageId() {
        return this.D;
    }

    public int getPatchExtensionVersion() {
        return this.f16157v;
    }

    public long getPatchVersion() {
        return new DeviceInfoWrapper(this).getRomPatchImageWrapper().getImageVersion();
    }

    public int getPrimaryBat() {
        return this.f16140e;
    }

    public int getProtocolType() {
        return this.protocolType;
    }

    public OtaBudInfo getRightBudInfo() {
        return this.K;
    }

    public byte[] getRwsBdAddr() {
        return this.f16153r;
    }

    public int getRwsMode() {
        return this.f16150o;
    }

    public int getRwsUpdateFlag() {
        return this.f16149n;
    }

    public int getSecondaryBat() {
        return this.f16141f;
    }

    public OtaBudInfo getSingleBudInfo() {
        return this.I;
    }

    public int getUpdateBank() {
        int i8 = this.updateBankIndicator;
        if (i8 == 1) {
            return 0;
        }
        return i8 == 2 ? 1 : 15;
    }

    public int getUpdateImageFlag() {
        return this.f16146k;
    }

    public int getUpdateMechanism() {
        return this.f16158w;
    }

    public boolean isAesEncryptEnabled() {
        return this.f16143h;
    }

    public boolean isBankEnabled() {
        return this.f16159x;
    }

    public boolean isBasSupported() {
        return this.f16139d;
    }

    public boolean isBufferCheckEnabled() {
        return this.f16142g;
    }

    public boolean isCopyImageEnabled() {
        return this.f16145j;
    }

    public boolean isDebugInfoSupported() {
        List list = this.A;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isFilterAdvByDeviceMacSupported() {
        return this.icType > 3;
    }

    public boolean isHandShakeSupported() {
        return this.handShakeSupported;
    }

    public boolean isMergeBankEnabled() {
        return this.compressSupported && this.compressMode == 0;
    }

    public boolean isRwsEnabled() {
        return this.f16147l;
    }

    public boolean isRwsSecondaryBud() {
        if (this.rwsOtaBudSupported) {
            return !this.rwsOtaFirstBud;
        }
        return true;
    }

    public boolean isSeqOtaSupported() {
        return this.f16151p;
    }

    public boolean isTestConfigSupported() {
        return this.protocolType == 17 && this.specVersion >= 6;
    }

    public boolean isVpIdOtaSupported() {
        return this.f16152q;
    }

    public boolean parseDeviceMac(byte[] bArr) {
        if (bArr == null || bArr.length < 6) {
            ZLogger.w("invalid device mac value");
            return false;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        byte[] bArr2 = new byte[6];
        this.f16154s = bArr2;
        wrap.get(bArr2, 0, 6);
        return true;
    }

    public boolean parseDeviceMacV2(byte[] bArr) {
        if (bArr == null || bArr.length < 6) {
            ZLogger.w("invalid device mac value");
            return false;
        }
        int length = bArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        byte[] bArr2 = new byte[6];
        this.f16154s = bArr2;
        wrap.get(bArr2, 0, 6);
        if (length < 12) {
            return true;
        }
        byte[] bArr3 = new byte[6];
        this.f16153r = bArr3;
        wrap.get(bArr3, 0, 6);
        return true;
    }

    public void parseX0000(byte[] bArr) {
        parseX0000(bArr, 0);
    }

    public void parseX0010(byte[] bArr) {
        d dVar = new d();
        if (dVar.a(bArr)) {
            this.icType = dVar.f15985c;
            int i8 = dVar.f15986d;
            this.specVersion = i8;
            if (i8 < 4) {
                this.secureVersion = dVar.f15987e;
                this.f16145j = dVar.i();
                this.f16149n = dVar.C;
            } else {
                this.leNormalModeSupported = dVar.f15995m;
                this.f16151p = dVar.K;
                this.f16152q = dVar.L;
                this.mtu = dVar.f15999q;
            }
            this.f16146k = dVar.d();
            this.f16142g = dVar.h();
            this.f16143h = dVar.f();
            this.f16144i = dVar.a();
            this.otaTempBufferSize = dVar.f15997o;
            this.compressSupported = dVar.F;
            this.compressMode = dVar.G;
            this.reportImageNumberFeatureSupported = dVar.I;
            this.f16159x = dVar.g();
            this.updateBankIndicator = dVar.f16001s;
            this.imageVersionIndicator = dVar.f15998p;
            this.f16147l = dVar.f16008z;
            this.f16150o = dVar.A;
            this.rwsOtaBudSupported = dVar.D;
            this.rwsOtaFirstBud = dVar.E;
            this.f16148m = dVar.B;
            this.F = dVar.c();
            this.G = dVar.b();
            this.f16158w = dVar.e();
        }
    }

    public void parseX0011(byte[] bArr) {
        f fVar = new f();
        if (fVar.a(bArr)) {
            this.icType = fVar.f15985c;
            this.specVersion = fVar.f15986d;
            this.secureVersion = fVar.f15987e;
            this.f16145j = fVar.i();
            this.f16151p = fVar.K;
            this.f16152q = fVar.L;
            this.normalBankInfo = fVar.f16002t;
            this.bootBankInfo = fVar.f16003u;
            this.secureBankInfo = fVar.f16004v;
            this.updateBankIndicator = fVar.f16001s;
            this.mtu = fVar.f15999q;
            this.f16159x = fVar.g();
            this.f16146k = fVar.d();
            this.otaTempBufferSize = fVar.f15997o;
            this.imageVersionIndicator = fVar.f15998p;
            this.f16142g = fVar.h();
            this.f16143h = fVar.f();
            this.f16144i = fVar.a();
            this.compressSupported = fVar.F;
            this.compressMode = fVar.G;
            this.reportImageNumberFeatureSupported = fVar.I;
            this.F = fVar.c();
            this.G = fVar.b();
            this.f16147l = fVar.f16008z;
            this.f16148m = fVar.B;
            this.f16150o = fVar.A;
            this.rwsOtaBudSupported = fVar.D;
            this.rwsOtaFirstBud = fVar.E;
            this.f16158w = fVar.e();
        }
    }

    public void parseX0012(byte[] bArr) {
        b bVar = new b();
        if (bVar.a(bArr)) {
            this.icType = bVar.f15985c;
            this.specVersion = bVar.f15986d;
            this.secureVersion = bVar.f15987e;
            this.f16142g = bVar.h();
            this.f16143h = bVar.f();
            this.f16144i = bVar.a();
            this.f16145j = bVar.i();
            this.f16146k = bVar.d();
            this.handShakeSupported = bVar.f15994l;
            this.maxBufferCheckSize = bVar.f15996n;
            this.otaTempBufferSize = bVar.f15997o;
            this.imageVersionIndicator = bVar.f15998p;
            this.F = bVar.c();
            this.G = bVar.b();
            this.f16158w = bVar.e();
            this.f16159x = bVar.g();
            this.updateBankIndicator = bVar.f16001s;
            this.compressSupported = bVar.F;
        }
    }

    public void parseX0014(byte[] bArr) {
        com.realsil.sdk.dfu.p.b bVar = new com.realsil.sdk.dfu.p.b();
        if (bVar.a(bArr)) {
            this.icType = bVar.f15985c;
            this.specVersion = bVar.f15986d;
            this.f16142g = bVar.h();
            this.f16143h = bVar.f();
            this.f16144i = bVar.a();
            this.f16146k = bVar.d();
            this.leNormalModeSupported = bVar.f15995m;
            this.nandFlashSupported = bVar.H;
            this.longImageVersionSupported = bVar.J;
            this.f16150o = bVar.K;
            this.f16148m = bVar.L;
            this.f16147l = bVar.M;
            this.otaTempBufferSize = bVar.f15997o;
            this.f16158w = bVar.e();
            this.normalBankInfo = bVar.f16002t;
            this.bootBankInfo = bVar.f16003u;
            this.secureBankInfo = bVar.f16004v;
            this.f16159x = bVar.g();
            this.updateBankIndicator = bVar.f16001s;
            this.imageVersionIndicator = bVar.f15998p;
            this.mtu = bVar.f15999q;
            this.F = bVar.c();
            this.G = bVar.b();
            this.compressSupported = bVar.F;
            this.compressMode = bVar.G;
        }
    }

    public void parseX0015(byte[] bArr) {
        com.realsil.sdk.dfu.q.b bVar = new com.realsil.sdk.dfu.q.b();
        if (bVar.a(bArr)) {
            this.icType = bVar.f15985c;
            this.specVersion = bVar.f15986d;
            this.f16142g = bVar.h();
            this.f16143h = bVar.f();
            this.f16144i = bVar.a();
            this.f16146k = bVar.d();
            this.leNormalModeSupported = bVar.f15995m;
            this.compressSupported = bVar.F;
            this.compressMode = bVar.G;
            this.otaTempBufferSize = bVar.f15997o;
            this.F = bVar.c();
            this.G = bVar.b();
            this.f16158w = bVar.e();
            this.updateBankIndicator = bVar.f16001s;
            this.imageVersionIndicator = bVar.f15998p;
            this.normalBankInfo = bVar.f16002t;
            this.bootBankInfo = bVar.f16003u;
            this.secureBankInfo = bVar.f16004v;
            this.f16159x = bVar.g();
        }
    }

    public void parseX0016(byte[] bArr) {
        com.realsil.sdk.dfu.v.b bVar = new com.realsil.sdk.dfu.v.b();
        if (bVar.a(bArr)) {
            this.icType = bVar.f15985c;
            this.specVersion = bVar.f15986d;
            this.f16146k = bVar.d();
            this.otaTempBufferSize = bVar.f15997o;
            this.normalBankInfo = bVar.f16002t;
            this.bootBankInfo = bVar.f16003u;
            this.secureBankInfo = bVar.f16004v;
            this.f16159x = bVar.g();
            this.updateBankIndicator = bVar.f16001s;
            this.mtu = bVar.f15999q;
            this.imageVersionIndicator = bVar.f15998p;
            this.f16142g = bVar.h();
            this.f16143h = bVar.f();
            this.f16144i = bVar.a();
            this.f16146k = bVar.d();
            this.leNormalModeSupported = bVar.f15995m;
            this.nandFlashSupported = bVar.H;
            this.compressSupported = bVar.F;
            this.compressMode = bVar.G;
            this.F = bVar.c();
            this.G = bVar.b();
            this.f16147l = bVar.M;
            this.f16148m = bVar.L;
            this.f16150o = bVar.K;
            this.rwsOtaBudSupported = bVar.D;
            this.rwsOtaFirstBud = bVar.E;
            this.f16158w = bVar.e();
        }
    }

    public void saveBudBtFwVersion(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        if (bArr.length >= 4) {
            this.I.setOtaHeaderImageVersion(Arrays.copyOfRange(bArr, 0, 4));
            this.J.setOtaHeaderImageVersion(Arrays.copyOfRange(bArr, 0, 4));
        }
        if (bArr.length >= 8) {
            this.K.setOtaHeaderImageVersion(Arrays.copyOfRange(bArr, 4, 8));
        }
    }

    public void saveOtherFwVersion(byte[] bArr) {
        OtaBudInfo otaBudInfo;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        int i8 = bArr[0] & 255;
        if (i8 == 0) {
            otaBudInfo = this.I;
        } else if (i8 == 1) {
            otaBudInfo = this.J;
        } else if (i8 != 2) {
            return;
        } else {
            otaBudInfo = this.K;
        }
        otaBudInfo.saveOtherFwVersion(bArr);
    }

    public void setActiveImageVersionValues(byte[] bArr) {
        this.imageVersionValues = bArr;
        this.f16160y = ImageVersionInfoParser.wrapperImageVersionInfos(this.protocolType, this.specVersion, this.updateBankIndicator, this.imageVersionIndicator, bArr, this.imageSectionSizeValues, this.longImageVersionSupported);
    }

    public void setAppConfigReleaseVer(byte[] bArr) {
        this.E = bArr;
    }

    public void setAppVersion(int i8) {
        this.f16156u = i8;
    }

    public void setBatteryLevel(int i8) {
        setBatteryLevel(i8, 0);
    }

    public void setIcId(byte b8) {
        this.C = b8;
    }

    public void setImageSectionSizeValues(byte[] bArr) {
        this.imageSectionSizeValues = bArr;
        this.f16160y = ImageVersionInfoParser.wrapperImageVersionInfos(this.protocolType, this.specVersion, this.updateBankIndicator, this.imageVersionIndicator, this.imageVersionValues, bArr, this.longImageVersionSupported);
    }

    public void setImageVersionValues(byte[] bArr) {
        int i8 = this.protocolType;
        if (i8 == 20 || i8 == 21 || i8 == 22) {
            if (bArr == null || bArr.length < 1) {
                setActiveImageVersionValues(null);
                return;
            }
            byte b8 = bArr[0];
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 1, bArr2, 0, length);
            if (b8 == 0) {
                setActiveImageVersionValues(bArr2);
                return;
            } else {
                setInactiveImageVersionValues(bArr2);
                return;
            }
        }
        if (i8 == 16) {
            if (this.specVersion < 4) {
                setActiveImageVersionValues(bArr);
                return;
            }
            if (bArr == null || bArr.length < 1) {
                setActiveImageVersionValues(null);
                return;
            }
            byte b9 = bArr[0];
            int length2 = bArr.length - 1;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr, 1, bArr3, 0, length2);
            if (b9 == 0) {
                setActiveImageVersionValues(bArr3);
                return;
            } else {
                setInactiveImageVersionValues(bArr3);
                return;
            }
        }
        if (i8 != 17 || this.specVersion < 6) {
            setActiveImageVersionValues(bArr);
            return;
        }
        if (bArr == null || bArr.length < 1) {
            setActiveImageVersionValues(null);
            return;
        }
        byte b10 = bArr[0];
        int length3 = bArr.length - 1;
        byte[] bArr4 = new byte[length3];
        System.arraycopy(bArr, 1, bArr4, 0, length3);
        if (b10 == 0) {
            setActiveImageVersionValues(bArr4);
        } else {
            setInactiveImageVersionValues(bArr4);
        }
    }

    public void setInactiveImageVersionValues(byte[] bArr) {
        this.inactiveImageVersionValues = bArr;
        this.f16161z = ImageVersionInfoParser.wrapperImageVersionInfos(this.protocolType, this.specVersion, this.updateBankIndicator, this.imageVersionIndicator, bArr, this.imageSectionSizeValues, this.longImageVersionSupported);
    }

    public void setMode(int i8) {
        this.f16142g = (i8 & 1) != 0;
        this.f16143h = ((i8 & 2) >> 1) != 0;
        this.f16144i = (i8 & 4) >> 2;
        this.f16145j = ((i8 & 8) >> 3) != 0;
        this.f16146k = (i8 & 16) >> 4;
        this.f16147l = ((i8 & 32) >> 5) != 0;
        b();
    }

    public void setNoTempImageId(int i8) {
        this.B = i8;
    }

    public void setPackageId(byte b8) {
        this.D = b8;
    }

    public void setPatchExtensionVersion(int i8) {
        this.f16157v = i8;
    }

    public void setPatchVersion(int i8) {
        this.f16155t = i8;
    }

    public void setPnpId(byte[] bArr) {
        this.disInfo = DisInfo.fromBytes(bArr);
    }

    public void setPrimaryBat(int i8) {
        this.f16140e = i8;
    }

    public void setProtocolType(int i8) {
        this.protocolType = i8;
    }

    public void setRwsMode(int i8) {
        this.f16150o = i8;
    }

    public void setRwsUpdateFlag(int i8) {
        this.f16149n = i8;
    }

    public void setSecondaryBat(int i8) {
        this.f16141f = i8;
    }

    public String toString() {
        String format;
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceInfo{");
        sb.append(String.format("\nIPV=%s", getIpv()));
        sb.append(String.format("\n%s", this.disInfo.toString()));
        if (this.f16139d) {
            sb.append("\n\tBAS:");
            sb.append(String.format(Locale.US, "\npriBat=0x%02X(%d), secBat=0x%02X(%d)", Integer.valueOf(this.f16140e), Integer.valueOf(this.f16140e), Integer.valueOf(this.f16141f), Integer.valueOf(this.f16141f)));
        }
        if (isFilterAdvByDeviceMacSupported()) {
            sb.append(String.format("\ndeviceMac: %s", BluetoothHelper.formatAddressPositive(this.f16154s)));
        }
        sb.append(String.format("\tbufferCheckEnabled=%b\n", Boolean.valueOf(this.f16142g)));
        if (this.f16142g) {
            sb.append(String.format(Locale.US, "\t\tmaxBufferCheckSize=0x%04X(%d)\n", Integer.valueOf(this.maxBufferCheckSize), Integer.valueOf(this.maxBufferCheckSize)));
        }
        sb.append(String.format("\taesEncryptEnabled=%b", Boolean.valueOf(this.f16143h)));
        if (this.f16143h) {
            sb.append(String.format("\t,mode=0x%02X", Integer.valueOf(this.f16144i)));
        }
        sb.append(String.format("\n\tcopyImageEnabled=%b, longImageVersionSupported=%b\n", Boolean.valueOf(this.f16145j), Boolean.valueOf(this.longImageVersionSupported)));
        sb.append(String.format("\tupdateImageFlag=0x%02X\n", Integer.valueOf(this.f16146k)));
        sb.append(String.format("\trwsEnabled=%b, rwsMode=0x%02X, budRole: 0x%02X\n", Boolean.valueOf(this.f16147l), Integer.valueOf(this.f16150o), Integer.valueOf(this.f16148m)));
        if (this.f16147l) {
            sb.append(String.format("\t\trwsUpdateFlag:0x%02X, rwsBdAddr: %s\n", Integer.valueOf(this.f16149n), BluetoothHelper.formatAddress(this.f16153r, false, true)));
        }
        sb.append(String.format("mUpdateMechanism=0x%02X\n", Integer.valueOf(this.f16158w)));
        if (this.f16158w == 3) {
            sb.append(String.format(Locale.US, "\notaTempBufferSize=0x%04X(%d)\n", Integer.valueOf(this.otaTempBufferSize), Integer.valueOf(this.otaTempBufferSize)));
        }
        int i8 = this.protocolType;
        if (i8 == 0) {
            int i9 = this.specVersion;
            if (i9 == 0) {
                Locale locale = Locale.US;
                sb.append(String.format(locale, "\tpatchVersion=0x%04X\n", Integer.valueOf(this.f16155t)));
                sb.append(String.format(locale, "\tpatchFreeBank=0x%02X\n", Integer.valueOf(this.patchFreeBank)));
                sb.append(String.format(locale, "\tappVersion=0x%04X\n", Integer.valueOf(this.f16156u)));
                sb.append(String.format("\tappFreeBank=0x%02X\n", Integer.valueOf(this.appFreeBank)));
                sb.append(String.format(locale, "\tpatchExtensionVersion=%d\n", Integer.valueOf(this.f16157v)));
                if (this.icType > 3) {
                    sb.append(String.format(locale, "\tappData0=%d\n", Integer.valueOf(this.appData0)));
                    sb.append(String.format(locale, "\tappData1=%d\n", Integer.valueOf(this.appData1)));
                    sb.append(String.format(locale, "\tappData2=%d\n", Integer.valueOf(this.appData2)));
                    format = String.format(locale, "\tappData3=%d\n", Integer.valueOf(this.appData3));
                    sb.append(format);
                }
            } else {
                if (i9 == 1) {
                    Locale locale2 = Locale.US;
                    sb.append(String.format(locale2, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.secureVersion), Integer.valueOf(this.secureVersion)));
                    sb.append(String.format(locale2, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.imageVersionIndicator)));
                    format = String.format(locale2, "\tupdateBankIndicator=0x%02X\n", Integer.valueOf(this.updateBankIndicator));
                } else if (i9 == 2) {
                    Locale locale3 = Locale.US;
                    sb.append(String.format(locale3, "\tnoTempImageId=0x%04X\n", Integer.valueOf(this.B)));
                    format = String.format(locale3, "\tpatchVersion=0x%04X\n", Integer.valueOf(this.f16155t));
                }
                sb.append(format);
            }
        } else if (i8 == 17) {
            Locale locale4 = Locale.US;
            sb.append(String.format(locale4, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.secureVersion), Integer.valueOf(this.secureVersion)));
            sb.append(String.format(locale4, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.imageVersionIndicator)));
            sb.append(String.format(locale4, "\tupdateBankIndicator=0x%02X(%d)\n", Integer.valueOf(this.updateBankIndicator), Integer.valueOf(this.updateBankIndicator)));
            if (this.specVersion >= 6) {
                format = String.format(locale4, "\tmtu=0x%04X\n", Integer.valueOf(this.mtu));
                sb.append(format);
            }
        } else {
            if (i8 == 16) {
                Locale locale5 = Locale.US;
                sb.append(String.format(locale5, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.secureVersion), Integer.valueOf(this.secureVersion)));
                sb.append(String.format(locale5, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.imageVersionIndicator)));
                sb.append(String.format(locale5, "\tupdateBankIndicator=0x%02X(%d)\n", Integer.valueOf(this.updateBankIndicator), Integer.valueOf(this.updateBankIndicator)));
                if (this.specVersion > 4) {
                    format = String.format(locale5, "\tmtu=0x%04X\n", Integer.valueOf(this.mtu));
                }
            } else if (i8 == 20 || i8 == 22) {
                Locale locale6 = Locale.US;
                sb.append(String.format(locale6, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.secureVersion), Integer.valueOf(this.secureVersion)));
                sb.append(String.format(locale6, "\timageVersionIndicator=0x%08X, updateBankIndicator=0x%02X(%d)\n", Integer.valueOf(this.imageVersionIndicator), Integer.valueOf(this.updateBankIndicator), Integer.valueOf(this.updateBankIndicator)));
                format = String.format(locale6, "\tmtu=0x%04X\n", Integer.valueOf(this.mtu));
            } else if (i8 == 21) {
                Locale locale7 = Locale.US;
                sb.append(String.format(locale7, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.secureVersion), Integer.valueOf(this.secureVersion)));
                sb.append(String.format(locale7, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.imageVersionIndicator)));
                sb.append(String.format(locale7, "\tupdateBankIndicator=0x%02X(%d)\n", Integer.valueOf(this.updateBankIndicator), Integer.valueOf(this.updateBankIndicator)));
                format = String.format(locale7, "\tmtu=0x%04X\n", Integer.valueOf(this.mtu));
            } else {
                Locale locale8 = Locale.US;
                sb.append(String.format(locale8, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.secureVersion), Integer.valueOf(this.secureVersion)));
                sb.append(String.format(locale8, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.imageVersionIndicator)));
                format = String.format(locale8, "\tupdateBankIndicator=0x%02X(%d)\n", Integer.valueOf(this.updateBankIndicator), Integer.valueOf(this.updateBankIndicator));
            }
            sb.append(format);
        }
        sb.append(String.format("\tcompressSupported=%b\n", Boolean.valueOf(this.compressSupported)));
        if (this.compressSupported) {
            sb.append(String.format(Locale.US, "\t\tcompressedImageHeaderOffset=0x%04X(%d)\n", Integer.valueOf(this.G), Integer.valueOf(this.G)));
        }
        sb.append(String.format(Locale.US, "\timageHeaderOffset=0x%04X(%d)\n", Integer.valueOf(this.F), Integer.valueOf(this.F)));
        sb.append(String.format("bankEnabled=%b\n", Boolean.valueOf(this.f16159x)));
        BankInfo bankInfo = this.bootBankInfo;
        if (bankInfo != null) {
            sb.append(String.format("bootBankInfo=%b\n", bankInfo.toString()));
        }
        sb.append(String.format("reportImageNumberFeature=%b\n", Boolean.valueOf(this.reportImageNumberFeatureSupported)));
        if (this.f16138c) {
            List list = this.f16160y;
            if (list != null && !list.isEmpty()) {
                sb.append("activeImages:\n");
                for (ImageVersionInfo imageVersionInfo : this.f16160y) {
                    sb.append("\t");
                    sb.append(imageVersionInfo.toString());
                    sb.append("\n");
                }
            }
            List list2 = this.f16161z;
            if (list2 != null && !list2.isEmpty()) {
                sb.append("inactiveImages:\n");
                for (ImageVersionInfo imageVersionInfo2 : this.f16161z) {
                    sb.append("\t");
                    sb.append(imageVersionInfo2.toString());
                    sb.append("\n");
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public final void a() {
        if (this.imageVersionIndicator == 0) {
            this.f16159x = false;
            return;
        }
        this.updateBankIndicator = 0;
        for (int i8 = 0; i8 < 16; i8++) {
            int i9 = (this.imageVersionIndicator >> (i8 * 2)) & 3;
            if (i9 == 1) {
                if (this.updateBankIndicator == 0) {
                    this.updateBankIndicator = 2;
                }
            } else if (i9 == 2) {
                this.updateBankIndicator = 1;
            }
        }
        this.f16159x = this.updateBankIndicator != 0;
        if (this.f16137b) {
            ZLogger.v(String.format("imageVersionIndicator = 0x%08x, bankEnabled=%b, updateBankIndicator=0x%02X", Integer.valueOf(this.imageVersionIndicator), Boolean.valueOf(this.f16159x), Integer.valueOf(this.updateBankIndicator)));
        }
    }

    public void appendActiveImageVersionBytes(byte[] bArr, int i8) {
        int length = bArr.length - i8;
        byte[] bArr2 = this.imageVersionValues;
        if (bArr2 == null || bArr2.length <= 0) {
            byte[] bArr3 = new byte[length];
            this.imageVersionValues = bArr3;
            System.arraycopy(bArr, i8, bArr3, 0, length);
        } else {
            byte[] bArr4 = new byte[bArr2.length + length];
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            System.arraycopy(bArr, i8, bArr4, this.imageVersionValues.length, length);
            this.imageVersionValues = bArr4;
        }
        this.f16160y = ImageVersionInfoParser.wrapperImageVersionInfos(this.protocolType, this.specVersion, this.updateBankIndicator, this.imageVersionIndicator, this.imageVersionValues, this.imageSectionSizeValues, this.longImageVersionSupported);
    }

    public void appendInactiveImageVersionBytes(byte[] bArr, int i8) {
        int length = bArr.length - i8;
        byte[] bArr2 = this.inactiveImageVersionValues;
        if (bArr2 == null || bArr2.length <= 0) {
            byte[] bArr3 = new byte[length];
            this.inactiveImageVersionValues = bArr3;
            System.arraycopy(bArr, i8, bArr3, 0, length);
        } else {
            byte[] bArr4 = new byte[bArr2.length + bArr.length];
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            System.arraycopy(bArr, i8, bArr4, this.inactiveImageVersionValues.length, bArr.length - i8);
            this.inactiveImageVersionValues = bArr4;
        }
        this.f16161z = ImageVersionInfoParser.wrapperImageVersionInfos(this.protocolType, this.specVersion, this.updateBankIndicator, this.imageVersionIndicator, this.inactiveImageVersionValues, this.imageSectionSizeValues, this.longImageVersionSupported);
    }

    public void parseX0000(byte[] bArr, int i8) {
        if (bArr == null) {
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int remaining = wrap.remaining();
        if (remaining <= i8) {
            return;
        }
        int i9 = remaining - i8;
        try {
            if (i9 <= 1) {
                this.icType = 3;
                this.specVersion = 0;
                this.appFreeBank = (byte) (wrap.get(i8) & 15);
                byte b8 = (byte) ((wrap.get(i8) & 240) >> 4);
                this.patchFreeBank = b8;
                this.appDataSupportedOld = false;
                int i10 = this.appFreeBank;
                if (i10 == 15 && b8 == 15) {
                    this.f16159x = false;
                    this.updateBankIndicator = 0;
                } else {
                    this.f16159x = true;
                    if (i10 != 1 && b8 != 1) {
                        this.updateBankIndicator = 1;
                    }
                    this.updateBankIndicator = 2;
                }
                setMode(2);
                return;
            }
            this.icType = wrap.get(i8) & 255;
            byte b9 = (byte) (wrap.get(i8 + 1) & 15);
            this.specVersion = b9;
            if (b9 != 0) {
                if (b9 == 1) {
                    if (i9 >= 3) {
                        this.secureVersion = wrap.get(i8 + 2) & 255;
                    }
                    if (i9 >= 4) {
                        setMode(wrap.get(i8 + 3));
                    }
                    if (i9 >= 5) {
                        this.maxBufferCheckSize = wrap.getShort(i8 + 4) & u.MAX_VALUE;
                    }
                    if (i9 >= 7) {
                        this.otaTempBufferSize = wrap.get(i8 + 6) & 255;
                    }
                    if (i9 >= 12) {
                        this.imageVersionIndicator = wrap.getInt(i8 + 8);
                    }
                    b();
                    a();
                    return;
                }
                if (b9 == 2) {
                    if (i9 >= 3) {
                        this.secureVersion = wrap.get(i8 + 2) & 255;
                    }
                    if (i9 >= 4) {
                        setMode(wrap.get(i8 + 3));
                    }
                    if (i9 >= 5) {
                        this.maxBufferCheckSize = wrap.getShort(i8 + 4) & u.MAX_VALUE;
                    }
                    if (i9 >= 7) {
                        this.B = wrap.getShort(i8 + 6) & u.MAX_VALUE;
                    }
                    if (i9 >= 8) {
                        this.f16155t = wrap.getShort(i8 + 7) & u.MAX_VALUE;
                    }
                    b();
                    a();
                    return;
                }
                return;
            }
            if (i9 >= 3) {
                int i11 = i8 + 2;
                this.appFreeBank = (byte) (wrap.get(i11) & 15);
                this.patchFreeBank = (byte) ((wrap.get(i11) & 240) >> 4);
            }
            this.otaTempBufferSize = 0;
            if (i9 >= 4) {
                setMode(wrap.get(i8 + 3));
            }
            if (i9 >= 6) {
                this.maxBufferCheckSize = (wrap.get(i8 + 5) << 8) | wrap.get(4);
            }
            if (i9 >= 14) {
                this.appDataSupportedOld = true;
                this.appData0 = (wrap.get(i8 + 7) << 8) | wrap.get(i8 + 6);
                this.appData1 = (wrap.get(i8 + 9) << 8) | wrap.get(i8 + 8);
                this.appData2 = (wrap.get(i8 + 11) << 8) | wrap.get(i8 + 10);
                this.appData3 = wrap.get(i8 + 12) | (wrap.get(i8 + 13) << 8);
            }
            b();
            int i12 = this.appFreeBank;
            if (i12 == 15 && this.patchFreeBank == 15) {
                this.f16159x = false;
                this.updateBankIndicator = 0;
                return;
            }
            this.f16159x = true;
            if (i12 != 1 && this.patchFreeBank != 1) {
                this.updateBankIndicator = 1;
                return;
            }
            this.updateBankIndicator = 2;
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
    }

    public void setBatteryLevel(int i8, int i9) {
        this.f16139d = true;
        this.f16140e = i8;
        this.f16141f = i9;
    }
}
