package a2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f162f;
    public final /* synthetic */ Function1 g;

    public u(int i3, int i10, Map map, Function1 function1, v vVar, c0 c0Var, Function1 function12) {
        this.f157a = i3;
        this.f158b = i10;
        this.f159c = map;
        this.f160d = function1;
        this.f161e = vVar;
        this.f162f = c0Var;
        this.g = function12;
    }

    @Override // a2.h0
    public final Map a() {
        return this.f159c;
    }

    @Override // a2.h0
    public final void b() {
        c2.p pVar;
        c2.g0 g0Var = this.f162f.f61d;
        boolean j = this.f161e.j();
        Function1 function1 = this.g;
        if (!j || (pVar = ((c2.q) g0Var.S.f1493d).f1640e0) == null) {
            function1.invoke(((c2.q) g0Var.S.f1493d).f1636y);
        } else {
            function1.invoke(pVar.f1636y);
        }
    }

    @Override // a2.h0
    public final int c() {
        return this.f158b;
    }

    @Override // a2.h0
    public final Function1 d() {
        return this.f160d;
    }

    @Override // a2.h0
    public final int e() {
        return this.f157a;
    }
}
