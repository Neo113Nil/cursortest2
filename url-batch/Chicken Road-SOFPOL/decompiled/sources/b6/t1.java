package b6;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1460f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1461g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1462h;
    public final /* synthetic */ Object i;

    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1458d = i;
        this.f1459e = obj;
        this.f1460f = obj2;
        this.f1461g = obj3;
        this.f1462h = obj4;
        this.i = obj5;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        List list;
        switch (this.f1458d) {
            case 0:
                m0.z0 z0Var = (m0.z0) this.f1459e;
                m0.z0 z0Var2 = (m0.z0) this.f1460f;
                m0.z0 z0Var3 = (m0.z0) this.f1461g;
                m0.z0 z0Var4 = (m0.z0) this.f1462h;
                m0.z0 z0Var5 = (m0.z0) this.i;
                k1 k1Var = (k1) obj;
                q6.i.e(k1Var, "quiz");
                z0Var.setValue(k1Var);
                z0Var2.setValue(0);
                z0Var3.setValue(null);
                z0Var4.setValue(0);
                z0Var5.setValue(Boolean.FALSE);
                break;
            case 1:
                q6.o oVar = (q6.o) this.f1459e;
                ArrayList arrayList = (ArrayList) this.f1460f;
                q6.q qVar = (q6.q) this.f1461g;
                r4.g gVar = (r4.g) this.f1462h;
                Bundle bundle = (Bundle) this.i;
                o4.d dVar = (o4.d) obj;
                q6.i.e(dVar, "entry");
                oVar.f6201d = true;
                int indexOf = arrayList.indexOf(dVar);
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    list = arrayList.subList(qVar.f6203d, i);
                    qVar.f6203d = i;
                } else {
                    list = d6.u.f2326d;
                }
                gVar.a(dVar.f5621e, bundle, dVar, list);
                break;
            default:
                u.i0 i0Var = (u.i0) this.f1459e;
                q6.s sVar = (q6.s) this.f1460f;
                q6.p pVar = (q6.p) this.f1461g;
                u.e1 e1Var = (u.e1) this.f1462h;
                q6.o oVar2 = (q6.o) this.i;
                float floatValue = ((Float) obj).floatValue();
                u.d0 f6 = u.i0.f((c7.c) i0Var.f7020f);
                if (f6 != null) {
                    i0Var.g(f6);
                    u.d0 a8 = ((u.d0) sVar.f6205d).a(f6);
                    sVar.f6205d = a8;
                    pVar.f6202d = e1Var.g(e1Var.e(a8.f6949a));
                    oVar2.f6201d = !u.c0.a(r0 - floatValue);
                }
                return Boolean.valueOf(f6 != null);
        }
        return c6.m.f1757a;
    }
}
