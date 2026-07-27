package androidx.compose.foundation.layout;

import S.n;
import kotlin.Metadata;
import l.AbstractC0784j;
import q.C1047z;
import r0.T;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes.dex */
public final class FillElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final int f5058a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5059b;

    public FillElement(float f4, int i2) {
        this.f5058a = i2;
        this.f5059b = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f5058a == fillElement.f5058a && this.f5059b == fillElement.f5059b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5059b) + (AbstractC0784j.d(this.f5058a) * 31);
    }

    @Override // r0.T
    public final n l() {
        C1047z c1047z = new C1047z();
        c1047z.f9350t = this.f5058a;
        c1047z.f9351u = this.f5059b;
        return c1047z;
    }

    @Override // r0.T
    public final void m(n nVar) {
        C1047z c1047z = (C1047z) nVar;
        c1047z.f9350t = this.f5058a;
        c1047z.f9351u = this.f5059b;
    }
}
