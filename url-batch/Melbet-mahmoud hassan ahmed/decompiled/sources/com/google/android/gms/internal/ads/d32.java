package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d32 implements ow2 {

    /* renamed from: f, reason: collision with root package name */
    private final Map<gw2, String> f4060f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Map<gw2, String> f4061g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final ww2 f4062h;

    public d32(Set<c32> set, ww2 ww2Var) {
        gw2 gw2Var;
        String str;
        gw2 gw2Var2;
        String str2;
        this.f4062h = ww2Var;
        for (c32 c32Var : set) {
            Map<gw2, String> map = this.f4060f;
            gw2Var = c32Var.f3714b;
            str = c32Var.f3713a;
            map.put(gw2Var, str);
            Map<gw2, String> map2 = this.f4061g;
            gw2Var2 = c32Var.f3715c;
            str2 = c32Var.f3713a;
            map2.put(gw2Var2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void a(gw2 gw2Var, String str) {
        ww2 ww2Var = this.f4062h;
        String valueOf = String.valueOf(str);
        ww2Var.e(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "s.");
        if (this.f4061g.containsKey(gw2Var)) {
            ww2 ww2Var2 = this.f4062h;
            String valueOf2 = String.valueOf(this.f4061g.get(gw2Var));
            ww2Var2.e(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "s.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void b(gw2 gw2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void s(gw2 gw2Var, String str) {
        ww2 ww2Var = this.f4062h;
        String valueOf = String.valueOf(str);
        ww2Var.d(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."));
        if (this.f4060f.containsKey(gw2Var)) {
            ww2 ww2Var2 = this.f4062h;
            String valueOf2 = String.valueOf(this.f4060f.get(gw2Var));
            ww2Var2.d(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."));
        }
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void z(gw2 gw2Var, String str, Throwable th) {
        ww2 ww2Var = this.f4062h;
        String valueOf = String.valueOf(str);
        ww2Var.e(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "f.");
        if (this.f4061g.containsKey(gw2Var)) {
            ww2 ww2Var2 = this.f4062h;
            String valueOf2 = String.valueOf(this.f4061g.get(gw2Var));
            ww2Var2.e(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "f.");
        }
    }
}
