package t1;

import G.InterfaceC0191c0;
import G.X0;
import java.util.List;
import java.util.Map;
import k.C0730F;
import k.C0731G;
import k.C0739e;
import k.C0746l;
import k.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s1.C1193i;

/* loaded from: classes.dex */
public final class w extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f10711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f10712e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f10713i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f10714j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f10715k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X0 f10716l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f10717m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Map map, i iVar, Function1 function1, Function1 function12, Function1 function13, X0 x02, InterfaceC0191c0 interfaceC0191c0) {
        super(1);
        this.f10711d = map;
        this.f10712e = iVar;
        this.f10713i = function1;
        this.f10714j = function12;
        this.f10715k = function13;
        this.f10716l = x02;
        this.f10717m = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0746l c0746l = (C0746l) obj;
        float f4 = 0.0f;
        if (!((List) this.f10716l.getValue()).contains(c0746l.b())) {
            return new k.v(C0730F.f7252b, C0731G.f7254b, 0.0f, new M(true, C0739e.f7286d));
        }
        String str = ((C1193i) c0746l.b()).f10514l;
        Map map = this.f10711d;
        Float f5 = (Float) map.get(str);
        if (f5 != null) {
            f4 = f5.floatValue();
        } else {
            map.put(((C1193i) c0746l.b()).f10514l, Float.valueOf(0.0f));
        }
        if (!Intrinsics.a(((C1193i) c0746l.c()).f10514l, ((C1193i) c0746l.b()).f10514l)) {
            f4 = (((Boolean) this.f10712e.f10655c.getValue()).booleanValue() || ((Boolean) this.f10717m.getValue()).booleanValue()) ? f4 - 1.0f : f4 + 1.0f;
        }
        map.put(((C1193i) c0746l.c()).f10514l, Float.valueOf(f4));
        return new k.v((C0730F) this.f10713i.invoke(c0746l), (C0731G) this.f10714j.invoke(c0746l), f4, (M) this.f10715k.invoke(c0746l));
    }
}
