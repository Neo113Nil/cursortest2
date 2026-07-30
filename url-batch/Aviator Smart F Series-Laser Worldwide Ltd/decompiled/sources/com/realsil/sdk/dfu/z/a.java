package com.realsil.sdk.dfu.z;

import com.realsil.sdk.bbpro.core.protocol.CommandContract;
import com.realsil.sdk.bbpro.core.transportlayer.AckPacket;
import com.realsil.sdk.bbpro.core.transportlayer.Command;
import com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.model.DfuQcConfig;
import com.realsil.sdk.dfu.model.ImageVersionInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class a extends com.realsil.sdk.dfu.u.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f16471p = true;

    public a() {
        this.f16326a = 17;
    }

    @Override // com.realsil.sdk.dfu.u.a
    public void a(AckPacket ackPacket) {
        super.a(ackPacket);
        int toAckId = ackPacket.getToAckId();
        byte status = ackPacket.getStatus();
        if (toAckId == 24) {
            if (status == 2 || status == 1) {
                ZLogger.w("CMD_GET_STATUS not support");
                if (this.f16328c == 263) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (toAckId == 783) {
            if (status == 2 || status == 1) {
                ZLogger.d("CMD_GET_PACKAGE_ID not support");
                if (this.f16328c == 264) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (toAckId == 793) {
            if (status != 0) {
                ZLogger.d("CMD_GET_IMAGE_FEATURE_INFO not support");
                this.f16471p = false;
                if (this.f16328c == 265) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (toAckId == 1546) {
            if (status == 2 || status == 1) {
                ZLogger.d("CMD_OTA_IMAGE_SECTION_SIZE_INFO not support");
                if (this.f16328c == 262) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (toAckId == 1584) {
            if (status != 0) {
                ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "CMD_GET_OTHER_FW_VERSION not support");
                if (this.f16328c == 267) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (toAckId == 1591) {
            if (status != 0) {
                ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "CMD_GET_BT_SOC_FW_VERSION not support");
                if (this.f16328c == 266) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (toAckId == 1536) {
            if (status == 2 || status == 1 || status == 3) {
                if (com.realsil.sdk.dfu.u.a.f16324n) {
                    ZLogger.d("GET_TARGET_INFO failed");
                }
                if (this.f16328c == 258) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (toAckId == 1537) {
            if (status == 2 || status == 1 || status == 3) {
                if (com.realsil.sdk.dfu.u.a.f16324n) {
                    ZLogger.d("GET_IMAGE_INFO failed,mState=" + this.f16328c);
                }
                if (this.f16328c == 259) {
                    g();
                    return;
                } else {
                    if (b().specVersion < 5 || this.f16328c != 260) {
                        return;
                    }
                    g();
                    return;
                }
            }
            return;
        }
        if (toAckId == 1549) {
            if (status == 2 || status == 1) {
                ZLogger.d("CMD_GET_CONFIG_RELEASE_VERSION not support");
                if (this.f16328c == 261) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (toAckId != 1550) {
            return;
        }
        if (status == 2 || status == 1) {
            ZLogger.d("CMD_GET_INACTIVE_BANK_IMAGE_INFO not support");
            if (this.f16328c == 260) {
                g();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0212, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023b, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0263, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0280, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0296, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02bc, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02be, code lost:
    
        com.realsil.sdk.core.logger.ZLogger.d(b().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x02c9, code lost:
    
        b(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d0, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00e9, code lost:
    
        com.realsil.sdk.core.logger.ZLogger.v(b().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f1, code lost:
    
        if (com.realsil.sdk.dfu.u.a.f16322l != false) goto L138;
     */
    @Override // com.realsil.sdk.dfu.u.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f() {
        List list;
        OtaModeInfo otaModeInfo;
        super.f();
        b(258);
        if (a(1536, (byte[]) null)) {
            h();
            if (b().isRwsEnabled()) {
                list = this.f16331f;
                otaModeInfo = new OtaModeInfo(21);
            } else {
                list = this.f16331f;
                otaModeInfo = new OtaModeInfo(16);
            }
            list.add(otaModeInfo);
            if (d()) {
                ZLogger.v(com.realsil.sdk.dfu.u.a.f16323m, String.format(Locale.US, "specVersion=0x%04X", Integer.valueOf(b().specVersion)));
                b(259);
                if (b().specVersion <= 5 ? a(1537, (byte[]) null) : a(1537, new byte[]{0})) {
                    h();
                    if (b().specVersion >= 5) {
                        if (b().isBankEnabled()) {
                            if (b().icType == 7 || b().icType == 6) {
                                this.f16331f.add(new OtaModeInfo(19));
                            }
                            if (d()) {
                                b(260);
                                if (b().specVersion >= 6 ? a(1537, new byte[]{1}) : a(1550, (byte[]) null)) {
                                    h();
                                }
                            }
                            ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
                        }
                        if (d()) {
                            b(261);
                            if (a(1549, (byte[]) null)) {
                                h();
                                if (this.f16327b.isImageFeatureEnabled()) {
                                    this.f16471p = true;
                                    List<ImageVersionInfo> imageVersionInfos = b().getImageVersionInfos();
                                    if (imageVersionInfos != null && !imageVersionInfos.isEmpty()) {
                                        for (ImageVersionInfo imageVersionInfo : imageVersionInfos) {
                                            if (!this.f16471p) {
                                                break;
                                            }
                                            if (imageVersionInfo.getVersion() != com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 && imageVersionInfo.getVersion() != -1) {
                                                b(DfuException.ERROR_CANNOT_FIND_DEVICE);
                                                if (a(new Command.Builder().writeType(2).packet(793, new byte[]{(byte) (imageVersionInfo.getImageId() & 255), (byte) ((imageVersionInfo.getImageId() >> 8) & 255)}).eventId(793).build())) {
                                                    h();
                                                }
                                            }
                                        }
                                    }
                                }
                                if (com.realsil.sdk.dfu.u.a.f16324n) {
                                    ZLogger.v(b().dumpFeatures());
                                }
                            }
                        }
                        ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
                    }
                    if (b().getUpdateMechanism() == 3) {
                        if (d()) {
                            b(DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS);
                            if (a(1546, (byte[]) null)) {
                                h();
                            }
                        }
                        ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
                    }
                    if (d()) {
                        b(DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS);
                        if (a(24, new byte[]{2})) {
                            h();
                            if (d()) {
                                b(DfuException.ERROR_CONNECT_ERROR);
                                if (a(CommandContract.buildPacket(783))) {
                                    h();
                                    if (d()) {
                                        b(DfuException.ERROR_WRITE_CHARAC_NOTIFY_ERROR);
                                        if (a(TransportLayerPacket.encodePayload(1591, new byte[0]))) {
                                            h();
                                            b(DfuException.ERROR_WRITE_CHARAC_ERROR);
                                            if (b().getRwsMode() == 0) {
                                                if (!a(TransportLayerPacket.encodePayload(1584, new byte[]{0}))) {
                                                }
                                                h();
                                                return true;
                                            }
                                            if (b().getRwsMode() != 2) {
                                                if (b().getRwsMode() == 1) {
                                                    if (!a(TransportLayerPacket.encodePayload(1584, new byte[]{(byte) b().getBudRole()}))) {
                                                    }
                                                    h();
                                                }
                                                return true;
                                            }
                                            if (a(TransportLayerPacket.encodePayload(1584, new byte[]{1}))) {
                                                h();
                                                if (!a(TransportLayerPacket.encodePayload(1584, new byte[]{2}))) {
                                                }
                                                h();
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
                }
            } else {
                ZLogger.v(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
            }
            return false;
        }
    }

    @Override // com.realsil.sdk.dfu.u.a
    public void a(TransportLayerPacket transportLayerPacket) {
        super.a(transportLayerPacket);
        int opcode = transportLayerPacket.getOpcode();
        transportLayerPacket.getPayload();
        byte[] parameters = transportLayerPacket.getParameters();
        if (opcode != 25) {
            if (opcode == 793) {
                if (this.f16328c == 265) {
                    com.realsil.sdk.dfu.t.b a8 = com.realsil.sdk.dfu.t.b.a(parameters);
                    if (a8 != null) {
                        if (com.realsil.sdk.dfu.u.a.f16324n) {
                            ZLogger.v(String.format("image:0x%04X, feature:%s", Integer.valueOf(a8.f16310a), a8.f16311b));
                        }
                        b().appendImageFeatureInfo(a8.f16310a, a8.f16311b);
                    }
                    g();
                    return;
                }
                return;
            }
            if (opcode == 1544) {
                if (this.f16328c == 262) {
                    if (parameters != null && parameters.length > 0) {
                        b().appendImageSectionSizeBytes(parameters);
                    }
                    g();
                    return;
                }
                return;
            }
            if (opcode != 1584) {
                if (opcode != 1591) {
                    if (opcode == 2321) {
                        if (this.f16328c == 264) {
                            if (parameters != null && parameters.length >= 2) {
                                b().setIcId(parameters[0]);
                                b().setPackageId(parameters[1]);
                            }
                            g();
                            return;
                        }
                        return;
                    }
                    if (opcode != 1536) {
                        if (opcode == 1537) {
                            b().appendImageVersionBytes(parameters);
                        } else if (opcode == 1548) {
                            b().setAppConfigReleaseVer(parameters);
                        } else if (opcode != 1549) {
                            return;
                        } else {
                            b().appendInactiveImageVersionBytes(parameters);
                        }
                    } else if (this.f16328c != 258) {
                        return;
                    } else {
                        b().parseX0011(parameters);
                    }
                } else if (this.f16328c != 266) {
                    return;
                } else {
                    b().saveBudBtFwVersion(parameters);
                }
            } else if (this.f16328c != 267) {
                return;
            } else {
                b().saveOtherFwVersion(parameters);
            }
        } else if (this.f16328c != 263 || parameters == null || parameters.length <= 0 || parameters[0] != 2) {
            return;
        } else {
            b().setBatteryLevel(parameters.length > 1 ? parameters[1] & 255 : 0, parameters.length > 2 ? parameters[2] & 255 : 0);
        }
        g();
    }

    @Override // com.realsil.sdk.dfu.u.a
    public boolean a(OtaDeviceInfo otaDeviceInfo, DfuQcConfig dfuQcConfig) {
        return a(1554, new byte[]{(byte) (dfuQcConfig.getIndicator() & 255)});
    }
}
