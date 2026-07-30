package com.realsil.sdk.dfu.model;

import com.realsil.sdk.dfu.RtkDfu;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import y5.u;

/* loaded from: classes4.dex */
public final class DisInfo {
    public boolean disSupported;
    public int productId;
    public int productVersion;
    public int vendorId;
    public int vendorIdSource;

    public static DisInfo fromBytes(byte[] bArr) {
        DisInfo disInfo = new DisInfo();
        if (bArr != null && bArr.length >= 7) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            disInfo.disSupported = true;
            disInfo.vendorIdSource = wrap.get() & 255;
            disInfo.vendorId = wrap.getShort();
            disInfo.productId = wrap.getShort() & u.MAX_VALUE;
            disInfo.productVersion = wrap.getShort();
        }
        return disInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DIS {");
        if (this.disSupported) {
            Locale locale = Locale.US;
            sb.append(String.format(locale, "\n\t\tVID=0x%04X(%d), PID=0x%04X(%d)", Integer.valueOf(this.vendorId), Integer.valueOf(this.vendorId), Integer.valueOf(this.productId), Integer.valueOf(this.productId)));
            if (RtkDfu.TDBG) {
                sb.append(String.format(locale, "\n\t\tVIDSrc=0x%02X(%d), productVersion=0x%04X(%d)", Integer.valueOf(this.vendorIdSource), Integer.valueOf(this.vendorIdSource), Integer.valueOf(this.productVersion), Integer.valueOf(this.productVersion)));
            }
        }
        return sb.toString();
    }
}
