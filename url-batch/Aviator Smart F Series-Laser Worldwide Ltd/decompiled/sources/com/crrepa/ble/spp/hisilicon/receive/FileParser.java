package com.crrepa.ble.spp.hisilicon.receive;

import com.crrepa.ble.spp.hisilicon.receive.bean.FileRequestInfo;
import com.crrepa.g1.c;

/* loaded from: classes3.dex */
public class FileParser {
    private FileParser() {
    }

    public static int parseNotify(byte[] bArr) {
        if (c.h(bArr) || bArr.length < 8) {
            return -1;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 4, bArr2, 0, 4);
        return (int) c.f(bArr2);
    }

    public static FileRequestInfo parseRequest(byte[] bArr) {
        if (c.h(bArr) || bArr.length < 16) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int f8 = (int) c.f(bArr2);
        System.arraycopy(bArr, 8, bArr2, 0, 4);
        return new FileRequestInfo(f8, (int) c.f(bArr2));
    }
}
