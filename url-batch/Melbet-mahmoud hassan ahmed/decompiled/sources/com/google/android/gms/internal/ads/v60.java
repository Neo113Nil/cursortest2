package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class v60 implements t70<eu0> {
    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(eu0 eu0Var, Map map) {
        eu0 eu0Var2 = eu0Var;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                io0.g("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                io0.g("No timestamp given for CSI tick.");
                return;
            }
            try {
                long a7 = y2.t.a().a() + (Long.parseLong(str4) - y2.t.a().b());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                eu0Var2.n().c(str2, str3, a7);
                return;
            } catch (NumberFormatException e7) {
                io0.h("Malformed timestamp for CSI tick.", e7);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                io0.g("No value given for CSI experiment.");
                return;
            } else {
                eu0Var2.n().a().d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                io0.g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                io0.g("No name given for CSI extra.");
            } else {
                eu0Var2.n().a().d(str6, str7);
            }
        }
    }
}
