package t;

import S.n;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1200d extends n {

    /* renamed from: t, reason: collision with root package name */
    public C1199c f10617t;

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    @Override // S.n
    public final void t0() {
        C1199c c1199c = this.f10617t;
        if (c1199c != null) {
            c1199c.f10616a.m(this);
        }
        if (c1199c != null) {
            c1199c.f10616a.b(this);
        }
        this.f10617t = c1199c;
    }

    @Override // S.n
    public final void u0() {
        C1199c c1199c = this.f10617t;
        if (c1199c != null) {
            Intrinsics.d(c1199c, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            c1199c.f10616a.m(this);
        }
    }
}
