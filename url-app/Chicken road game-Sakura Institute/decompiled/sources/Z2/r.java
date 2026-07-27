package Z2;

import a3.C0423a;
import android.os.Build;
import android.view.View;
import f1.C0610d;
import f1.C0628w;
import f1.Y;
import f1.a0;
import kotlin.Unit;
import s0.C1173v0;
import y2.AbstractC1343r;
import y2.C1338m;

/* loaded from: classes.dex */
public final class r implements InterfaceC0331g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4717e;

    public /* synthetic */ r(int i2, Object obj) {
        this.f4716d = i2;
        this.f4717e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    @Override // Z2.InterfaceC0331g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, C2.a aVar) {
        C0628w c0628w;
        int i2;
        Object b4;
        switch (this.f4716d) {
            case 0:
                ((M2.E) this.f4717e).f3580d = obj;
                throw new C0423a(this);
            case 1:
                Object t4 = ((Y2.p) ((Y2.q) this.f4717e)).f4447j.t(aVar, obj);
                return t4 == D2.a.f2163d ? t4 : Unit.f7487a;
            case 2:
                if (aVar instanceof C0628w) {
                    c0628w = (C0628w) aVar;
                    int i4 = c0628w.f6628k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0628w.f6628k = i4 - Integer.MIN_VALUE;
                        Object obj2 = c0628w.f6627j;
                        D2.a aVar2 = D2.a.f2163d;
                        i2 = c0628w.f6628k;
                        if (i2 != 0) {
                            AbstractC1343r.b(obj2);
                            Y y4 = (Y) obj;
                            if (y4 instanceof f1.Q) {
                                throw ((f1.Q) y4).f6535b;
                            }
                            if (!(y4 instanceof C0610d)) {
                                if (y4 instanceof f1.O ? true : y4 instanceof a0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new C1338m();
                            }
                            Object obj3 = ((C0610d) y4).f6566b;
                            c0628w.f6628k = 1;
                            if (((InterfaceC0331g) this.f4717e).d(obj3, c0628w) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1343r.b(obj2);
                        }
                        return Unit.f7487a;
                    }
                }
                c0628w = new C0628w(this, aVar);
                Object obj22 = c0628w.f6627j;
                D2.a aVar22 = D2.a.f2163d;
                i2 = c0628w.f6628k;
                if (i2 != 0) {
                }
                return Unit.f7487a;
            case 3:
                f1.N n2 = (f1.N) this.f4717e;
                return ((n2.f6525m.w() instanceof f1.O) || (b4 = f1.N.b(n2, true, aVar)) != D2.a.f2163d) ? Unit.f7487a : b4;
            case 4:
                ((C1173v0) this.f4717e).f10403d.f(((Number) obj).floatValue());
                return Unit.f7487a;
            default:
                y.t tVar = (y.t) this.f4717e;
                if (Build.VERSION.SDK_INT >= 34) {
                    y.i.f11482a.a(tVar.o(), (View) tVar.f11494e);
                }
                return Unit.f7487a;
        }
    }
}
