package z4;

import android.database.SQLException;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10756d;

    /* renamed from: e, reason: collision with root package name */
    public int f10757e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10758i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0 f10759r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(n0 n0Var, ld.a aVar, int i3) {
        super(2, aVar);
        this.f10756d = i3;
        this.f10759r = n0Var;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f10756d) {
            case 0:
                i0 i0Var = new i0(this.f10759r, aVar, 0);
                i0Var.f10758i = obj;
                return i0Var;
            default:
                i0 i0Var2 = new i0(this.f10759r, aVar, 1);
                i0Var2.f10758i = obj;
                return i0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10756d) {
            case 0:
                return ((i0) create((b5.j) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            default:
                return ((i0) create((e0) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
        }
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        switch (this.f10756d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f10757e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                b5.j jVar = (b5.j) this.f10758i;
                this.f10757e = 1;
                Object a9 = n0.a(this.f10759r, jVar, this);
                return a9 == aVar ? aVar : a9;
            default:
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f10757e;
                try {
                    if (i10 == 0) {
                        cf.c.M(obj);
                        e0Var = (e0) this.f10758i;
                        this.f10758i = e0Var;
                        this.f10757e = 1;
                        obj = e0Var.a(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                cf.c.M(obj);
                                return (Set) obj;
                            }
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        e0Var = (e0) this.f10758i;
                        cf.c.M(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return kotlin.collections.l0.f5576d;
                    }
                    d0 d0Var = d0.f10733e;
                    i0 i0Var = new i0(this.f10759r, null, 0);
                    this.f10758i = null;
                    this.f10757e = 2;
                    obj = e0Var.d(d0Var, i0Var, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    return (Set) obj;
                } catch (SQLException unused) {
                    return kotlin.collections.l0.f5576d;
                }
        }
    }
}
