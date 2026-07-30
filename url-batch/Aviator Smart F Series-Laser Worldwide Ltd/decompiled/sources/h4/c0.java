package h4;

import com.crrepa.ble.conn.bean.CRPElectronicCardCountInfo;
import com.crrepa.ble.conn.bean.CRPElectronicCardInfo;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class c0 {
    private c0() {
    }

    public static CRPElectronicCardInfo a(byte[] bArr) {
        if (bArr.length < 6) {
            return null;
        }
        byte b8 = bArr[3];
        int a8 = com.crrepa.g1.c.a(bArr[4]);
        byte[] bArr2 = new byte[a8];
        System.arraycopy(bArr, 5, bArr2, 0, a8);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr2, charset);
        int a9 = com.crrepa.g1.c.a(bArr[a8 + 5]);
        byte[] bArr3 = new byte[a9];
        System.arraycopy(bArr, a8 + 6, bArr3, 0, a9);
        return new CRPElectronicCardInfo(b8, str, new String(bArr3, charset));
    }

    public static CRPElectronicCardCountInfo b(byte[] bArr) {
        if (bArr.length < 4) {
            return null;
        }
        byte b8 = bArr[3];
        int a8 = com.crrepa.g1.c.a(bArr[4]);
        ArrayList arrayList = new ArrayList();
        if (bArr.length - 5 > 0) {
            for (int i8 = 5; i8 < bArr.length; i8++) {
                arrayList.add(Integer.valueOf(bArr[i8]));
            }
        }
        return new CRPElectronicCardCountInfo(b8, a8, arrayList);
    }
}
