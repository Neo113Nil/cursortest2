package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p91 implements pj1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ q91 e;
    public final /* synthetic */ v91 f;
    public final /* synthetic */ Function1 g;

    public p91(int i, int i2, Map map, Function1 function1, q91 q91Var, v91 v91Var, Function1 function12) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
        this.e = q91Var;
        this.f = v91Var;
        this.g = function12;
    }

    @Override // defpackage.pj1
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.pj1
    public final void b() {
        m21 m21Var;
        i91 i91Var = this.f.m;
        boolean w = this.e.w();
        Function1 function1 = this.g;
        if (!w || (m21Var = i91Var.P.c.b0) == null) {
            function1.invoke(i91Var.P.c.x);
        } else {
            function1.invoke(m21Var.x);
        }
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
