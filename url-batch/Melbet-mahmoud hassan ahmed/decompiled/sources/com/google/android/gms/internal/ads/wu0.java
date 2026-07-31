package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class wu0 implements t70<eu0> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ yu0 f13945a;

    wu0(yu0 yu0Var) {
        this.f13945a = yu0Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(eu0 eu0Var, Map map) {
        int i7;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.f13945a) {
                    i7 = this.f13945a.K;
                    if (i7 != parseInt) {
                        this.f13945a.K = parseInt;
                        this.f13945a.requestLayout();
                    }
                }
            } catch (Exception e7) {
                io0.h("Exception occurred while getting webview content height", e7);
            }
        }
    }
}
