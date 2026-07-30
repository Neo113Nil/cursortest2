package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dj0 implements wk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ ej0 f;

    public dj0(int i, int i2, Map map, Function1 function1, Function1 function12, ej0 ej0Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
        this.e = function12;
        this.f = ej0Var;
    }

    @Override // defpackage.wk0
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.wk0
    public final void b() {
        this.e.invoke(this.f.p);
    }

    @Override // defpackage.wk0
    public final int c() {
        return this.b;
    }

    @Override // defpackage.wk0
    public final Function1 d() {
        return this.d;
    }

    @Override // defpackage.wk0
    public final int e() {
        return this.a;
    }
}
