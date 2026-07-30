package e1;

import D.y;
import X0.v;
import Z0.r;
import d1.C4455a;
import f1.AbstractC4490a;

/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37297a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37298b;

    /* renamed from: c, reason: collision with root package name */
    public final C4455a f37299c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37300d;

    public n(String str, int i, C4455a c4455a, boolean z8) {
        this.f37297a = str;
        this.f37298b = i;
        this.f37299c = c4455a;
        this.f37300d = z8;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4490a abstractC4490a) {
        return new r(vVar, abstractC4490a, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f37297a);
        sb.append(", index=");
        return y.m(sb, this.f37298b, '}');
    }
}
