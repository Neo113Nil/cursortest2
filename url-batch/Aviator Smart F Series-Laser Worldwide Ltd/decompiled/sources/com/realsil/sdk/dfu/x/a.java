package com.realsil.sdk.dfu.x;

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
    public boolean f16423p = true;

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
                this.f16423p = false;
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

    @Override // com.realsil.sdk.dfu.u.a
    public boolean f() {
        List list;
        OtaModeInfo otaModeInfo;
        super.f();
        b(258);
        if (!a(1536, (byte[]) null)) {
            if (com.realsil.sdk.dfu.u.a.f16322l) {
                ZLogger.v(b().toString());
            }
            b(2);
            return false;
        }
        h();
        if (b().isRwsEnabled()) {
            list = this.f16331f;
            otaModeInfo = new OtaModeInfo(21);
        } else {
            list = this.f16331f;
            otaModeInfo = new OtaModeInfo(16);
        }
        list.add(otaModeInfo);
        if (b().isSeqOtaSupported()) {
            this.f16331f.add(new OtaModeInfo(23));
        }
        if (b().isVpIdOtaSupported()) {
            this.f16331f.add(new OtaModeInfo(24));
        }
        if (!d()) {
            ZLogger.v(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
            return false;
        }
        ZLogger.v(com.realsil.sdk.dfu.u.a.f16323m, String.format(Locale.US, "specVersion=0x%04X", Integer.valueOf(b().specVersion)));
        b(259);
        if (!(b().specVersion <= 5 ? a(1537, (byte[]) null) : a(1537, new byte[]{0}))) {
            if (com.realsil.sdk.dfu.u.a.f16322l) {
                ZLogger.v(b().toString());
            }
            b(2);
            return false;
        }
        h();
        if (b().specVersion >= 5) {
            if (b().isBankEnabled()) {
                if (b().icType == 7 || b().icType == 6) {
                    this.f16331f.add(new OtaModeInfo(19));
                }
                if (!d()) {
                    ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
                    return false;
                }
                b(260);
                if (!(b().specVersion >= 6 ? a(1537, new byte[]{1}) : a(1550, (byte[]) null))) {
                    if (com.realsil.sdk.dfu.u.a.f16322l) {
                        ZLogger.v(b().toString());
                    }
                    b(2);
                    return false;
                }
                h();
            }
            if (!d()) {
                ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
                return false;
            }
            b(261);
            if (!a(1549, (byte[]) null)) {
                if (com.realsil.sdk.dfu.u.a.f16322l) {
                    ZLogger.d(b().toString());
                }
                b(2);
                return false;
            }
            h();
            if (this.f16327b.isImageFeatureEnabled()) {
                this.f16423p = true;
                List<ImageVersionInfo> imageVersionInfos = b().getImageVersionInfos();
                if (imageVersionInfos != null && !imageVersionInfos.isEmpty()) {
                    for (ImageVersionInfo imageVersionInfo : imageVersionInfos) {
                        if (!this.f16423p) {
                            break;
                        }
                        if (imageVersionInfo.getVersion() != com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 && imageVersionInfo.getVersion() != -1) {
                            b(DfuException.ERROR_CANNOT_FIND_DEVICE);
                            if (!a(new Command.Builder().writeType(2).packet(793, new byte[]{(byte) (imageVersionInfo.getImageId() & 255), (byte) ((imageVersionInfo.getImageId() >> 8) & 255)}).eventId(793).build())) {
                                if (com.realsil.sdk.dfu.u.a.f16322l) {
                                    ZLogger.d(b().toString());
                                }
                                b(2);
                                return false;
                            }
                            h();
                        }
                    }
                }
            }
            if (com.realsil.sdk.dfu.u.a.f16324n) {
                ZLogger.v(b().dumpFeatures());
            }
        }
        if (b().getUpdateMechanism() == 3) {
            if (!d()) {
                ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
                return false;
            }
            b(DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS);
            if (!a(1546, (byte[]) null)) {
                if (com.realsil.sdk.dfu.u.a.f16322l) {
                    ZLogger.d(b().toString());
                }
                b(2);
                return false;
            }
            h();
        }
        if (!d()) {
            ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
            return false;
        }
        b(DfuException.ERROR_NO_CHARACTERISTIC_FOUND_OR_LOSS);
        if (!a(24, new byte[]{2})) {
            if (com.realsil.sdk.dfu.u.a.f16322l) {
                ZLogger.d(b().toString());
            }
            b(2);
            return false;
        }
        h();
        if (!d()) {
            ZLogger.d(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
            return false;
        }
        b(DfuException.ERROR_CONNECT_ERROR);
        if (a(CommandContract.buildPacket(783))) {
            h();
            return true;
        }
        if (com.realsil.sdk.dfu.u.a.f16322l) {
            ZLogger.d(b().toString());
        }
        b(2);
        return false;
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
