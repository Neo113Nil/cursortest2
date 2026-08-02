package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class H1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f5851a;

    /* renamed from: b, reason: collision with root package name */
    public J1 f5852b;

    /* renamed from: c, reason: collision with root package name */
    public K1 f5853c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5854d;

    public final void a(Object obj) {
        this.f5854d = true;
        J1 j12 = this.f5852b;
        if (j12 != null) {
            I1 i12 = j12.f5865b;
            i12.getClass();
            if (obj == null) {
                obj = G1.f5841g;
            }
            if (G1.f5840f.M(i12, null, obj)) {
                G1.c(i12);
                this.f5851a = null;
                this.f5852b = null;
                this.f5853c = null;
            }
        }
    }

    public final void finalize() {
        K1 k12;
        J1 j12 = this.f5852b;
        if (j12 != null) {
            I1 i12 = j12.f5865b;
            if (!i12.isDone()) {
                if (G1.f5840f.M(i12, null, new G0(new C0343r0("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f5851a)), 1)))) {
                    G1.c(i12);
                }
            }
        }
        if (this.f5854d || (k12 = this.f5853c) == null) {
            return;
        }
        k12.h(null);
    }
}
