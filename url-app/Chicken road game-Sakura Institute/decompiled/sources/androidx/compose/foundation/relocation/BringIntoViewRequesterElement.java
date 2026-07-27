package androidx.compose.foundation.relocation;

import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r0.T;
import t.C1199c;
import t.C1200d;

@Metadata
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final C1199c f5107a;

    public BringIntoViewRequesterElement(C1199c c1199c) {
        this.f5107a = c1199c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (Intrinsics.a(this.f5107a, ((BringIntoViewRequesterElement) obj).f5107a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5107a.hashCode();
    }

    @Override // r0.T
    public final n l() {
        C1200d c1200d = new C1200d();
        c1200d.f10617t = this.f5107a;
        return c1200d;
    }

    @Override // r0.T
    public final void m(n nVar) {
        C1200d c1200d = (C1200d) nVar;
        C1199c c1199c = c1200d.f10617t;
        if (c1199c != null) {
            c1199c.f10616a.m(c1200d);
        }
        C1199c c1199c2 = this.f5107a;
        if (c1199c2 != null) {
            c1199c2.f10616a.b(c1200d);
        }
        c1200d.f10617t = c1199c2;
    }
}
