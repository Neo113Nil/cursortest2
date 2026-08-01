package c2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n0 implements a2.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f1624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f1625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f1626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f1627f;

    public n0(int i3, int i10, Map map, Function1 function1, Function1 function12, o0 o0Var) {
        this.f1622a = i3;
        this.f1623b = i10;
        this.f1624c = map;
        this.f1625d = function1;
        this.f1626e = function12;
        this.f1627f = o0Var;
    }

    @Override // a2.h0
    public final Map a() {
        return this.f1624c;
    }

    @Override // a2.h0
    public final void b() {
        this.f1626e.invoke(this.f1627f.f1636y);
    }

    @Override // a2.h0
    public final int c() {
        return this.f1623b;
    }

    @Override // a2.h0
    public final Function1 d() {
        return this.f1625d;
    }

    @Override // a2.h0
    public final int e() {
        return this.f1622a;
    }
}
