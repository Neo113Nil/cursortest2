package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xp1 extends o81 implements Function1 {
    public final /* synthetic */ Map m;
    public final /* synthetic */ ez n;
    public final /* synthetic */ Function1 o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ so2 r;
    public final /* synthetic */ zn1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp1(Map map, ez ezVar, Function1 function1, Function1 function12, Function1 function13, so2 so2Var, zn1 zn1Var) {
        super(1);
        this.m = map;
        this.n = ezVar;
        this.o = function1;
        this.p = function12;
        this.q = function13;
        this.r = so2Var;
        this.s = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zc zcVar = (zc) obj;
        float f = 0.0f;
        if (!((List) this.r.getValue()).contains(zcVar.b())) {
            return new r20(ai0.b, uj0.b, 0.0f, new tl2(sc.n));
        }
        String str = ((cp1) zcVar.b()).r;
        Map map = this.m;
        Float f2 = (Float) map.get(str);
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            map.put(((cp1) zcVar.b()).r, Float.valueOf(0.0f));
        }
        if (!Intrinsics.b(((cp1) zcVar.c()).r, ((cp1) zcVar.b()).r)) {
            f = (((Boolean) this.n.c.getValue()).booleanValue() || ((Boolean) this.s.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
        }
        map.put(((cp1) zcVar.c()).r, Float.valueOf(f));
        return new r20((ai0) this.o.invoke(zcVar), (uj0) this.p.invoke(zcVar), f, (tl2) this.q.invoke(zcVar));
    }
}
