package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.z7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2383z7 {
    @NotNull
    public static C1814b a(@NotNull Map headers) {
        Set set;
        Long l4;
        Intrinsics.checkNotNullParameter(headers, "headers");
        String a4 = cf0.a(headers, bh0.f23797r);
        String str = "";
        if (a4 == null) {
            a4 = "";
        }
        String a5 = cf0.a(headers, bh0.f23769V);
        if (a5 == null) {
            set = kotlin.collections.T.e();
        } else {
            try {
                str = new JSONObject(a5).optString("test_ids", "");
            } catch (Throwable unused) {
                ap0.d(new Object[0]);
            }
            String str2 = str;
            Intrinsics.checkNotNull(str2);
            List split$default = StringsKt.split$default(str2, new String[]{";"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                try {
                    l4 = Long.valueOf(Long.parseLong((String) it.next()));
                } catch (Throwable unused2) {
                    l4 = null;
                }
                if (l4 != null) {
                    arrayList.add(l4);
                }
            }
            set = CollectionsKt.toSet(arrayList);
        }
        return new C1814b(a4, set);
    }
}
