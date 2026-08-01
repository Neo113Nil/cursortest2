package o4;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function1;
import n0.z0;
import u.h0;
import u.i0;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7495e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7496i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7497r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7498s;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f7494d = i3;
        this.f7495e = obj;
        this.f7496i = obj2;
        this.f7497r = obj3;
        this.f7498s = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i3 = this.f7494d;
        Object obj2 = this.f7498s;
        Object obj3 = this.f7497r;
        Object obj4 = this.f7496i;
        Object obj5 = this.f7495e;
        switch (i3) {
            case 0:
                Function1 function1 = (Function1) obj4;
                Function1 function12 = (Function1) obj3;
                z0 z0Var = (z0) obj2;
                u.o oVar = (u.o) obj;
                n4.s sVar = ((n4.h) oVar.a()).f7063e;
                sVar.getClass();
                h hVar = (h) sVar;
                if (((Boolean) ((i) obj5).f7477c.getValue()).booleanValue() || ((Boolean) z0Var.getValue()).booleanValue()) {
                    int i10 = n4.s.f7113s;
                    for (n4.s sVar2 : a.a.B(hVar)) {
                    }
                    return (i0) function1.invoke(oVar);
                }
                int i11 = n4.s.f7113s;
                for (n4.s sVar3 : a.a.B(hVar)) {
                }
                return (i0) function12.invoke(oVar);
            case 1:
                Function1 function13 = (Function1) obj4;
                Function1 function14 = (Function1) obj3;
                z0 z0Var2 = (z0) obj2;
                u.o oVar2 = (u.o) obj;
                n4.s sVar4 = ((n4.h) oVar2.c()).f7063e;
                sVar4.getClass();
                h hVar2 = (h) sVar4;
                if (((Boolean) ((i) obj5).f7477c.getValue()).booleanValue() || ((Boolean) z0Var2.getValue()).booleanValue()) {
                    int i12 = n4.s.f7113s;
                    for (n4.s sVar5 : a.a.B(hVar2)) {
                    }
                    return (h0) function13.invoke(oVar2);
                }
                int i13 = n4.s.f7113s;
                for (n4.s sVar6 : a.a.B(hVar2)) {
                }
                return (h0) function14.invoke(oVar2);
            default:
                n4.h hVar3 = (n4.h) obj;
                hVar3.getClass();
                ((z) obj5).f10164d = true;
                ((q4.h) obj4).a((n4.s) obj3, (Bundle) obj2, hVar3, j0.f5574d);
                return Unit.f5554a;
        }
    }
}
