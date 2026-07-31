package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class qk {
    public static Map<String, Object> a(Object[][] objArr) {
        HashMap hashMap = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e4) {
                o9.d().a(e4);
            }
        }
        return hashMap;
    }
}
