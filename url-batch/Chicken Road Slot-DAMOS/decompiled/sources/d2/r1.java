package d2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r1 implements je.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3522e;

    public /* synthetic */ r1(int i3, Object obj) {
        this.f3521d = i3;
        this.f3522e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    @Override // je.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ld.a aVar) {
        x3.n nVar;
        int i3;
        switch (this.f3521d) {
            case 0:
                ((s1) this.f3522e).f3533i.i(((Number) obj).floatValue());
                return Unit.f5554a;
            case 1:
                if (Intrinsics.a((f9.b) obj, f9.b.f4208a)) {
                    ((n4.x) this.f3522e).a(l9.j.INSTANCE, new a1.f(23));
                    return Unit.f5554a;
                }
                a2.r.p();
                return null;
            case 2:
                ((wd.b0) this.f3522e).f10141d = obj;
                throw new ke.a(this);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((Context) this.f3522e).startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) obj)));
                return Unit.f5554a;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                if (aVar instanceof x3.n) {
                    nVar = (x3.n) aVar;
                    int i10 = nVar.f10413e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        nVar.f10413e = i10 - Integer.MIN_VALUE;
                        Object obj2 = nVar.f10412d;
                        md.a aVar2 = md.a.f6622d;
                        i3 = nVar.f10413e;
                        if (i3 == 0) {
                            if (i3 == 1) {
                                cf.c.M(obj2);
                                return Unit.f5554a;
                            }
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj2);
                        je.f fVar = (je.f) this.f3522e;
                        x3.t0 t0Var = (x3.t0) obj;
                        if (t0Var instanceof x3.o0) {
                            throw ((x3.o0) t0Var).f10419b;
                        }
                        if (t0Var instanceof x3.c) {
                            Object obj3 = ((x3.c) t0Var).f10341b;
                            nVar.f10413e = 1;
                            if (fVar.b(obj3, nVar) == aVar2) {
                                return aVar2;
                            }
                            return Unit.f5554a;
                        }
                        if ((t0Var instanceof x3.l0) || (t0Var instanceof x3.u0) || (t0Var instanceof x3.n0)) {
                            kotlin.collections.i0.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        } else {
                            a2.r.p();
                        }
                        return null;
                    }
                }
                nVar = new x3.n(this, aVar);
                Object obj22 = nVar.f10412d;
                md.a aVar22 = md.a.f6622d;
                i3 = nVar.f10413e;
                if (i3 == 0) {
                }
                break;
            default:
                x3.z zVar = (x3.z) this.f3522e;
                if (zVar.f10502v.a() instanceof x3.l0) {
                    return Unit.f5554a;
                }
                Object f3 = x3.z.f(zVar, true, aVar);
                return f3 == md.a.f6622d ? f3 : Unit.f5554a;
        }
    }
}
