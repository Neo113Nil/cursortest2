package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pg1 implements pj1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ qg1 f;

    public pg1(int i, int i2, Map map, Function1 function1, Function1 function12, qg1 qg1Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
        this.e = function12;
        this.f = qg1Var;
    }

    @Override // defpackage.pj1
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.pj1
    public final void b() {
        this.e.invoke(this.f.x);
    }

    @Override // defpackage.pj1
    public final int c() {
        return this.b;
    }

    @Override // defpackage.pj1
    public final Function1 d() {
        return this.d;
    }

    @Override // defpackage.pj1
    public final int e() {
        return this.a;
    }
}
