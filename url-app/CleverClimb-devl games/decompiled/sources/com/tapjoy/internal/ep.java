package com.tapjoy.internal;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ep {
    public static List a() {
        return new eq(Collections.emptyList());
    }

    public static List a(String str, List list) {
        if (list == null) {
            throw new NullPointerException(str + " == null");
        }
        if (list instanceof eq) {
            list = ((eq) list).f8013a;
        }
        if (list == Collections.emptyList() || (list instanceof eo)) {
            return list;
        }
        eo eoVar = new eo(list);
        if (!eoVar.contains(null)) {
            return eoVar;
        }
        throw new IllegalArgumentException(str + ".contains(null)");
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static IllegalStateException a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        int length = objArr.length;
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = com.umeng.commonsdk.proguard.d.ap;
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        throw new IllegalStateException("Required field" + str + " not set:" + ((Object) sb));
    }
}
