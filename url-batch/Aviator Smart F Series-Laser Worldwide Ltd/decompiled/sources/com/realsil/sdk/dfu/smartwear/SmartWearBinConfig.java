package com.realsil.sdk.dfu.smartwear;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class SmartWearBinConfig {
    public int specVersion = 2;
    public boolean wifiFirmwareEnabled = false;
    public byte[] wifiFirmwareVersion = new byte[4];
    public boolean wifiBootLoaderEnabled = false;
    public boolean btFirmwareEnabled = false;
    public byte[] btFirmwareVersion = new byte[4];

    public byte[] encode(int i8) {
        if (i8 == 1) {
            byte[] bArr = new byte[4];
            byte[] bArr2 = this.btFirmwareVersion;
            if (bArr2 != null && bArr2.length >= 4) {
                System.arraycopy(bArr2, 0, bArr, 0, 4);
            }
            return bArr;
        }
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = this.btFirmwareVersion;
        if (bArr4 != null && bArr4.length >= 4) {
            System.arraycopy(bArr4, 0, bArr3, 4, 4);
        }
        return bArr3;
    }

    public byte[] encodeBtV2() {
        byte[] bArr = new byte[8];
        bArr[0] = 4;
        byte[] bArr2 = this.btFirmwareVersion;
        if (bArr2 != null && bArr2.length >= 4) {
            System.arraycopy(bArr2, 0, bArr, 4, 4);
        }
        return bArr;
    }

    public byte[] encodeV1() {
        byte[] bArr = new byte[4];
        byte[] bArr2 = this.btFirmwareVersion;
        if (bArr2 != null && bArr2.length >= 4) {
            System.arraycopy(bArr2, 0, bArr, 0, 4);
        }
        return bArr;
    }

    public byte[] encodeWiFiV2() {
        byte[] bArr = new byte[8];
        byte b8 = this.wifiBootLoaderEnabled ? (byte) 1 : (byte) 0;
        if (this.wifiFirmwareEnabled) {
            b8 = (byte) (b8 + 2);
        }
        bArr[0] = b8;
        byte[] bArr2 = this.wifiFirmwareVersion;
        if (bArr2 != null && bArr2.length >= 4) {
            System.arraycopy(bArr2, 0, bArr, 4, 4);
        }
        return bArr;
    }

    public int getImageNumber() {
        boolean z7 = this.wifiFirmwareEnabled;
        return this.btFirmwareEnabled ? (z7 ? 1 : 0) + 1 : z7 ? 1 : 0;
    }

    public String toString() {
        return "SmartWearBinConfig{specVersion=" + this.specVersion + ", wifiFirmwareEnabled=" + this.wifiFirmwareEnabled + ", wifiFirmwareVersion=" + Arrays.toString(this.wifiFirmwareVersion) + ", wifiBootLoaderEnabled=" + this.wifiBootLoaderEnabled + ", btFirmwareEnabled=" + this.btFirmwareEnabled + ", btFirmwareVersion=" + Arrays.toString(this.btFirmwareVersion) + '}';
    }
}
