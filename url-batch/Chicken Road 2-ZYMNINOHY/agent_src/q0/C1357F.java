package q0;

import W.InterfaceC0113f;
import java.io.IOException;

/* renamed from: q0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1357F implements InterfaceC0113f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0.e f14825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1377t f14826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0.g f14827c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f14828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f14829e;

    public /* synthetic */ C1357F(f0.e eVar, C1377t c1377t, n0.g gVar, IOException iOException, boolean z) {
        this.f14825a = eVar;
        this.f14826b = c1377t;
        this.f14827c = gVar;
        this.f14828d = iOException;
        this.f14829e = z;
    }

    @Override // W.InterfaceC0113f
    public final void accept(Object obj) {
        H h2 = (H) obj;
        f0.e eVar = this.f14825a;
        h2.e(eVar.f8491a, eVar.f8492b, this.f14826b, this.f14827c, this.f14828d, this.f14829e);
    }
}
