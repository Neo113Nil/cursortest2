package com.crrepa.ble.spp.hisilicon.receive;

import com.crrepa.ble.spp.hisilicon.receive.map.CRPMapManager;
import com.crrepa.ble.spp.hisilicon.write.SPPFileTransManager;

/* loaded from: classes3.dex */
public class SPPReceiver {
    private void parseFile(byte b8, byte b9, byte[] bArr) {
        if (b8 == 3) {
            if (b9 == 1) {
                SPPFileTransManager.getInstance().sendRequestInfo(FileParser.parseRequest(bArr));
                return;
            }
            return;
        }
        if (b8 != 5) {
            if (b8 == 6 && b9 == 2) {
                SPPFileTransManager.getInstance().sendStopAck();
                return;
            }
            return;
        }
        if (b9 == 1) {
            SPPFileTransManager.getInstance().sendNotify(FileParser.parseNotify(bArr));
        }
    }

    public void onReceiverChanged(byte b8, byte b9, byte b10, byte[] bArr) {
        if (b8 == 6) {
            parseFile(b9, b10, bArr);
        } else if (b8 == 13 && b9 == 3) {
            CRPMapManager.getInstance().parseMap(b10, bArr);
        }
    }
}
