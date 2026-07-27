package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f5253a;

    /* renamed from: b, reason: collision with root package name */
    public u2 f5254b;

    /* renamed from: c, reason: collision with root package name */
    public v2 f5255c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5256d;

    public final void finalize() {
        v2 v2Var;
        u2 u2Var = this.f5254b;
        if (u2Var != null) {
            t2 t2Var = u2Var.f5269b;
            if (!t2Var.isDone()) {
                if (r2.f5245f.D(t2Var, null, new C0361p1(new D0.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f5253a)), 3)))) {
                    r2.d(t2Var);
                }
            }
        }
        if (this.f5256d || (v2Var = this.f5255c) == null) {
            return;
        }
        v2Var.i(null);
    }
}
