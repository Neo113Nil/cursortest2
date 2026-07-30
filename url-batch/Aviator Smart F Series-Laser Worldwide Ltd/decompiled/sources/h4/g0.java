package h4;

import com.crrepa.ble.conn.bean.CRPFunctionInfo;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f16701a = -1;

    public static CRPFunctionInfo a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        CRPFunctionInfo cRPFunctionInfo = new CRPFunctionInfo();
        int i8 = 0;
        if (bArr[0] != -1) {
            cRPFunctionInfo.setDisplayFunction(true);
        } else {
            i8 = 1;
        }
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        while (i8 < length) {
            byte b8 = bArr[i8];
            if (b8 > 0) {
                arrayList.add(Integer.valueOf(b8));
            }
            i8++;
        }
        cRPFunctionInfo.setFunctionList(arrayList);
        return cRPFunctionInfo;
    }
}
