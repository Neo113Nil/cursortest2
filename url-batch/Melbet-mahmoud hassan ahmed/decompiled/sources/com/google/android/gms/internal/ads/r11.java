package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class r11 implements l11 {

    /* renamed from: a, reason: collision with root package name */
    private final uy1 f10974a;

    r11(uy1 uy1Var) {
        this.f10974a = uy1Var;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void a(Map<String, String> map) {
        char c7;
        uy1 uy1Var;
        qy1 qy1Var;
        String str = map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c7 = 0;
            }
            c7 = 65535;
        } else {
            if (str.equals("flick")) {
                c7 = 1;
            }
            c7 = 65535;
        }
        if (c7 == 0) {
            uy1Var = this.f10974a;
            qy1Var = qy1.SHAKE;
        } else if (c7 != 1) {
            uy1Var = this.f10974a;
            qy1Var = qy1.NONE;
        } else {
            uy1Var = this.f10974a;
            qy1Var = qy1.FLICK;
        }
        uy1Var.j(qy1Var);
    }
}
