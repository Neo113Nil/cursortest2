package com.crrepa.ble.sifli.dfu;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class CurrentSendFile {
    String fileName;
    int packetSize;
    ArrayList<byte[]> sendData;
    int totalCount;
    int totalSize;

    public CurrentSendFile(int i8, int i9, String str) {
        this.totalSize = i8;
        this.fileName = str;
        this.packetSize = i9;
        int i10 = i8 % i9;
        int i11 = i8 / i9;
        this.totalCount = i10 != 0 ? i11 + 1 : i11;
    }

    public byte[] getData(int i8) {
        return this.sendData.get(i8);
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getTotalSize() {
        return this.totalSize;
    }

    public CurrentSendFile(byte[] bArr, int i8, String str) {
        byte[] bArr2;
        this.packetSize = 2048;
        int length = bArr.length;
        this.totalSize = length;
        this.fileName = str;
        if (length == 0) {
            this.totalCount = 0;
            this.sendData = null;
            return;
        }
        this.packetSize = i8;
        this.totalCount = bArr.length % i8 == 0 ? bArr.length / i8 : (bArr.length / i8) + 1;
        this.sendData = new ArrayList<>(this.totalCount);
        int i9 = 0;
        for (int i10 = 0; i10 < this.totalCount; i10++) {
            int i11 = i9 + i8;
            if (i11 <= bArr.length) {
                bArr2 = new byte[i8];
                System.arraycopy(bArr, i9, bArr2, 0, i8);
                i9 = i11;
            } else {
                int length2 = bArr.length - i9;
                bArr2 = new byte[length2];
                System.arraycopy(bArr, i9, bArr2, 0, length2);
                i9 += length2;
            }
            this.sendData.add(i10, bArr2);
        }
    }
}
