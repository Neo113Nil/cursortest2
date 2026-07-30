package h4;

import com.crrepa.ble.conn.bean.CRPQuickResponsesCountInfo;
import com.crrepa.ble.conn.bean.CRPQuickResponsesDetailInfo;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class r {
    private r() {
    }

    public static CRPQuickResponsesDetailInfo a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 4) {
            return null;
        }
        CRPQuickResponsesDetailInfo cRPQuickResponsesDetailInfo = new CRPQuickResponsesDetailInfo();
        cRPQuickResponsesDetailInfo.setId(bArr[2]);
        int i8 = bArr[3];
        if (i8 > 0 && bArr.length == i8 + 4) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, 4, bArr2, 0, i8);
            cRPQuickResponsesDetailInfo.setMessage(new String(bArr2, StandardCharsets.UTF_8));
        }
        return cRPQuickResponsesDetailInfo;
    }

    public static CRPQuickResponsesCountInfo b(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 4) {
            return null;
        }
        CRPQuickResponsesCountInfo cRPQuickResponsesCountInfo = new CRPQuickResponsesCountInfo();
        cRPQuickResponsesCountInfo.setEnable(bArr[2] > 0);
        cRPQuickResponsesCountInfo.setCount(bArr[3]);
        return cRPQuickResponsesCountInfo;
    }

    public static String c(byte[] bArr) {
        int i8;
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 4 || (i8 = bArr[3]) <= 0 || bArr.length != i8 + 4) {
            return null;
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 4, bArr2, 0, i8);
        return new String(bArr2, StandardCharsets.UTF_8);
    }
}
