package h4;

import com.crrepa.ble.conn.bean.CRPAppInfo;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class g {
    private g() {
    }

    public static CRPAppInfo a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i8 = 1;
        for (int i9 = 1; i9 < bArr.length; i9++) {
            if (bArr[i9] == 0) {
                arrayList.add(new String(bArr, i8, i9 - i8, StandardCharsets.UTF_8));
                i8 = i9 + 1;
            }
        }
        int size = arrayList.size();
        return new CRPAppInfo(1 <= size ? (String) arrayList.get(0) : "", 2 <= size ? (String) arrayList.get(1) : "", 3 <= size ? Integer.parseInt((String) arrayList.get(2)) : -1);
    }
}
