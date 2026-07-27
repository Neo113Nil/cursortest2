package androidx.compose.animation;

import S.n;
import k.C0729E;
import k.C0730F;
import k.C0731G;
import k.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.g0;
import l.m0;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class EnterExitTransitionElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f4997a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f4998b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f4999c;

    /* renamed from: d, reason: collision with root package name */
    public final C0730F f5000d;

    /* renamed from: e, reason: collision with root package name */
    public final C0731G f5001e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f5002f;

    /* renamed from: g, reason: collision with root package name */
    public final x f5003g;

    public EnterExitTransitionElement(m0 m0Var, g0 g0Var, g0 g0Var2, C0730F c0730f, C0731G c0731g, Function0 function0, x xVar) {
        this.f4997a = m0Var;
        this.f4998b = g0Var;
        this.f4999c = g0Var2;
        this.f5000d = c0730f;
        this.f5001e = c0731g;
        this.f5002f = function0;
        this.f5003g = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return this.f4997a.equals(enterExitTransitionElement.f4997a) && Intrinsics.a(this.f4998b, enterExitTransitionElement.f4998b) && Intrinsics.a(this.f4999c, enterExitTransitionElement.f4999c) && Intrinsics.a(null, null) && this.f5000d.equals(enterExitTransitionElement.f5000d) && Intrinsics.a(this.f5001e, enterExitTransitionElement.f5001e) && Intrinsics.a(this.f5002f, enterExitTransitionElement.f5002f) && Intrinsics.a(this.f5003g, enterExitTransitionElement.f5003g);
    }

    public final int hashCode() {
        int hashCode = this.f4997a.hashCode() * 31;
        g0 g0Var = this.f4998b;
        int hashCode2 = (hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        g0 g0Var2 = this.f4999c;
        return this.f5003g.hashCode() + ((this.f5002f.hashCode() + ((this.f5001e.f7256a.hashCode() + ((this.f5000d.f7253a.hashCode() + ((hashCode2 + (g0Var2 != null ? g0Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }

    @Override // r0.T
    public final n l() {
        return new C0729E(this.f4997a, this.f4998b, this.f4999c, this.f5000d, this.f5001e, this.f5002f, this.f5003g);
    }

    @Override // r0.T
    public final void m(n nVar) {
        C0729E c0729e = (C0729E) nVar;
        c0729e.f7245t = this.f4997a;
        c0729e.f7246u = this.f4998b;
        c0729e.f7247v = this.f4999c;
        c0729e.f7248w = this.f5000d;
        c0729e.f7249x = this.f5001e;
        c0729e.f7250y = this.f5002f;
        c0729e.f7251z = this.f5003g;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f4997a + ", sizeAnimation=" + this.f4998b + ", offsetAnimation=" + this.f4999c + ", slideAnimation=null, enter=" + this.f5000d + ", exit=" + this.f5001e + ", isEnabled=" + this.f5002f + ", graphicsLayerBlock=" + this.f5003g + ')';
    }
}
