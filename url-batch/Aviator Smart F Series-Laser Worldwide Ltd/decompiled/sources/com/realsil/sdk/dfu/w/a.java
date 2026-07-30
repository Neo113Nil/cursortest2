package com.realsil.sdk.dfu.w;

import com.realsil.sdk.bbpro.core.transportlayer.AckPacket;
import com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.model.OtaModeInfo;

/* loaded from: classes4.dex */
public class a extends com.realsil.sdk.dfu.u.a {
    public a() {
        this.f16326a = 0;
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
        if (toAckId == 1536) {
            if (status == 2 || status == 1) {
                ZLogger.w("CMD_OTA_GET_DEVICE_INFO not support");
                if (this.f16328c == 258) {
                    g();
                    return;
                }
                return;
            }
            return;
        }
        if (toAckId != 1537) {
            return;
        }
        if (status == 2 || status == 1 || status == 3) {
            if (com.realsil.sdk.dfu.u.a.f16322l) {
                ZLogger.d("GET_IMAGE_INFO failed");
            }
            if (this.f16328c == 259) {
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
                ZLogger.d(b().toString());
            }
            b(2);
            return false;
        }
        h();
        this.f16331f.add(new OtaModeInfo(16));
        if (!d()) {
            ZLogger.d("already in idle state");
            return false;
        }
        b(259);
        if (!a(1537, (byte[]) null)) {
            if (com.realsil.sdk.dfu.u.a.f16322l) {
                ZLogger.d(b().toString());
            }
            b(2);
            return false;
        }
        h();
        if (!d()) {
            ZLogger.d("already in idle state");
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
            if (opcode == 1536) {
                b().parseX0000(parameters);
            } else if (opcode != 1537) {
                return;
            } else {
                b().appendActiveImageVersionBytes(parameters);
            }
        } else {
            if (this.f16328c != 263 || parameters == null || parameters.length <= 0) {
                return;
            }
            if (parameters[0] != 2) {
                return;
            } else {
                b().setBatteryLevel(parameters.length > 1 ? parameters[1] & 255 : 0, parameters.length > 2 ? parameters[2] & 255 : 0);
            }
        }
        g();
    }
}
