package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPFunctionInfo;
import java.util.List;

/* loaded from: classes3.dex */
public class g0 {
    private g0() {
    }

    public static byte[] a() {
        return g.a(37, null);
    }

    public static byte[] b() {
        return g.a(37, new byte[]{-1});
    }

    public static byte[] a(CRPFunctionInfo cRPFunctionInfo) {
        List<Integer> functionList = cRPFunctionInfo.getFunctionList();
        byte[] bArr = new byte[functionList.size() + 1];
        for (int i8 = 0; i8 < functionList.size(); i8++) {
            bArr[i8] = functionList.get(i8).byteValue();
        }
        bArr[functionList.size()] = 0;
        return g.a(21, bArr);
    }
}
