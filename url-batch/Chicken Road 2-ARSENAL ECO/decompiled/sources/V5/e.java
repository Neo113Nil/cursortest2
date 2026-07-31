package V5;

import D3.B;

/* loaded from: classes.dex */
public final class e extends B {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2731c;

    public e(A.j jVar, boolean z5) {
        super(jVar);
        this.f2731c = z5;
    }

    @Override // D3.B
    public final void i(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        if (this.f2731c) {
            super.i(value);
        } else {
            g(value);
        }
    }
}
