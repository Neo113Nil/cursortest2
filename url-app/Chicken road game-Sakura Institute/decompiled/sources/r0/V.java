package r0;

import G.C0223t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public S.n f9725a;

    /* renamed from: b, reason: collision with root package name */
    public int f9726b;

    /* renamed from: c, reason: collision with root package name */
    public I.d f9727c;

    /* renamed from: d, reason: collision with root package name */
    public I.d f9728d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0223t f9730f;

    public V(C0223t c0223t, S.n nVar, int i2, I.d dVar, I.d dVar2, boolean z4) {
        this.f9730f = c0223t;
        this.f9725a = nVar;
        this.f9726b = i2;
        this.f9727c = dVar;
        this.f9728d = dVar2;
        this.f9729e = z4;
    }

    public final boolean a(int i2, int i4) {
        I.d dVar = this.f9727c;
        int i5 = this.f9726b;
        S.m mVar = (S.m) dVar.f3330d[i2 + i5];
        S.m mVar2 = (S.m) this.f9728d.f3330d[i5 + i4];
        W w4 = X.f9731a;
        return Intrinsics.a(mVar, mVar2) || S.a.a(mVar, mVar2);
    }
}
