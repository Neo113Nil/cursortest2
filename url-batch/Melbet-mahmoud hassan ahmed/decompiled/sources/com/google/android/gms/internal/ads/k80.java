package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class k80 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final j80 f7417a;

    public k80(j80 j80Var) {
        this.f7417a = j80Var;
    }

    public static void b(eu0 eu0Var, j80 j80Var) {
        eu0Var.G0("/reward", new k80(j80Var));
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f7417a.c();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f7417a.a();
                    return;
                }
                return;
            }
        }
        yj0 yj0Var = null;
        try {
            int parseInt = Integer.parseInt(map.get("amount"));
            String str2 = map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                yj0Var = new yj0(str2, parseInt);
            }
        } catch (NumberFormatException e7) {
            io0.h("Unable to parse reward amount.", e7);
        }
        this.f7417a.q0(yj0Var);
    }
}
