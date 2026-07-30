package com.realsil.sdk.dfu.v;

import com.realsil.sdk.bbpro.core.transportlayer.AckPacket;
import com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.model.DfuQcConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;

/* loaded from: classes4.dex */
public class a extends com.realsil.sdk.dfu.u.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f16420p = true;

    public a() {
        this.f16326a = 22;
    }

    @Override // com.realsil.sdk.dfu.u.a
    public void a(AckPacket ackPacket) {
        super.a(ackPacket);
        int toAckId = ackPacket.getToAckId();
        byte status = ackPacket.getStatus();
        if (toAckId == 24) {
            if (status == 2 || status == 1) {
                ZLogger.w(com.realsil.sdk.dfu.u.a.f16324n, "CMD_GET_STATUS not support");
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
                this.f16420p = false;
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
                ZLogger.d(com.realsil.sdk.dfu.u.a.f16324n, "CMD_OTA_IMAGE_SECTION_SIZE_INFO not support");
                if (this.f16328c == 262) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (toAckId == 1536) {
            if ((status == 2 || status == 1 || status == 3) && this.f16328c == 258) {
                g();
                return;
            }
            return;
        }
        if (toAckId == 1537) {
            if (status == 2 || status == 1 || status == 3) {
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
                ZLogger.d(com.realsil.sdk.dfu.u.a.f16324n, "CMD_GET_CONFIG_RELEASE_VERSION not support");
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
            ZLogger.d(com.realsil.sdk.dfu.u.a.f16324n, "CMD_GET_INACTIVE_BANK_IMAGE_INFO not support");
            if (this.f16328c == 260) {
                g();
            }
        }
    }

    @Override // com.realsil.sdk.dfu.u.a
    public boolean f() {
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
        this.f16331f.add(new OtaModeInfo(0));
        this.f16331f.add(new OtaModeInfo(16));
        if (!d()) {
            ZLogger.v(com.realsil.sdk.dfu.u.a.f16323m, "already in idle state");
            return false;
        }
        b(259);
        if (!a(1537, new byte[]{0})) {
            if (com.realsil.sdk.dfu.u.a.f16322l) {
                ZLogger.v(b().toString());
            }
            b(2);
            return false;
        }
        h();
        if (b().isBankEnabled()) {
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
        if (a(24, new byte[]{2})) {
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
                b().parseX0016(parameters);
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
