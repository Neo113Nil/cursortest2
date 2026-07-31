package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w21 {

    /* renamed from: a, reason: collision with root package name */
    private final String f13667a;

    /* renamed from: b, reason: collision with root package name */
    private final lc0 f13668b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f13669c;

    /* renamed from: d, reason: collision with root package name */
    private b31 f13670d;

    /* renamed from: e, reason: collision with root package name */
    private final t70<Object> f13671e = new s21(this);

    /* renamed from: f, reason: collision with root package name */
    private final t70<Object> f13672f = new u21(this);

    public w21(String str, lc0 lc0Var, Executor executor) {
        this.f13667a = str;
        this.f13668b = lc0Var;
        this.f13669c = executor;
    }

    static /* bridge */ /* synthetic */ boolean g(w21 w21Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(w21Var.f13667a);
    }

    public final void c(b31 b31Var) {
        this.f13668b.b("/updateActiveView", this.f13671e);
        this.f13668b.b("/untrackActiveViewUnit", this.f13672f);
        this.f13670d = b31Var;
    }

    public final void d(eu0 eu0Var) {
        eu0Var.G0("/updateActiveView", this.f13671e);
        eu0Var.G0("/untrackActiveViewUnit", this.f13672f);
    }

    public final void e() {
        this.f13668b.c("/updateActiveView", this.f13671e);
        this.f13668b.c("/untrackActiveViewUnit", this.f13672f);
    }

    public final void f(eu0 eu0Var) {
        eu0Var.H0("/updateActiveView", this.f13671e);
        eu0Var.H0("/untrackActiveViewUnit", this.f13672f);
    }
}
