package androidx.compose.foundation.layout;

import w1.x0;
import x.u;
import x.w;
import y0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class FillElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f485a;

    /* renamed from: b, reason: collision with root package name */
    public final float f486b;

    public FillElement(u uVar, float f6) {
        this.f485a = uVar;
        this.f486b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f485a == fillElement.f485a && this.f486b == fillElement.f486b;
    }

    @Override // w1.x0
    public final l f() {
        w wVar = new w();
        wVar.f8309r = this.f485a;
        wVar.f8310s = this.f486b;
        return wVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        w wVar = (w) lVar;
        wVar.f8309r = this.f485a;
        wVar.f8310s = this.f486b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f486b) + (this.f485a.hashCode() * 31);
    }
}
