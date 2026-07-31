package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1945ga {
    @Nullable
    public static String a(@Nullable List list) {
        Object obj;
        Object obj2;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C2058l4) obj).a() == EnumC2082m4.f28846c) {
                    break;
                }
            }
            C2058l4 c2058l4 = (C2058l4) obj;
            if (c2058l4 != null && (obj2 = c2058l4.b().get(EnumC2082m4.f28846c.a())) != null) {
                return obj2.toString();
            }
        }
        return null;
    }
}
