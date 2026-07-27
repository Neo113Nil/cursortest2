package p0;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import r0.C1077s;
import r0.C1078t;

/* renamed from: p0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986v implements InterfaceC0946G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f9067c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0987w f9068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0941B f9069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f9070f;

    public C0986v(int i2, int i4, Map map, C0987w c0987w, C0941B c0941b, Function1 function1) {
        this.f9065a = i2;
        this.f9066b = i4;
        this.f9067c = map;
        this.f9068d = c0987w;
        this.f9069e = c0941b;
        this.f9070f = function1;
    }

    @Override // p0.InterfaceC0946G
    public final int g() {
        return this.f9065a;
    }

    @Override // p0.InterfaceC0946G
    public final int j() {
        return this.f9066b;
    }

    @Override // p0.InterfaceC0946G
    public final Map k() {
        return this.f9067c;
    }

    @Override // p0.InterfaceC0946G
    public final void l() {
        C1077s c1077s;
        boolean A4 = this.f9068d.A();
        Function1 function1 = this.f9070f;
        C0941B c0941b = this.f9069e;
        if (!A4 || (c1077s = ((C1078t) c0941b.f8978d.B.f2909c).f9842Q) == null) {
            function1.invoke(((C1078t) c0941b.f8978d.B.f2909c).f9704o);
        } else {
            function1.invoke(c1077s.f9704o);
        }
    }

    @Override // p0.InterfaceC0946G
    public final Function1 m() {
        return null;
    }
}
