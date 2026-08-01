package je;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import n0.o1;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5205d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5206e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5207i;

    /* renamed from: r, reason: collision with root package name */
    public final Object f5208r;

    public n(f fVar, CoroutineContext coroutineContext) {
        this.f5206e = coroutineContext;
        this.f5207i = le.v.b(coroutineContext);
        this.f5208r = new a3.t(fVar, (ld.a) null, 13);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // je.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ld.a aVar) {
        m mVar;
        int i3;
        switch (this.f5205d) {
            case 0:
                f fVar = (f) this.f5207i;
                wd.z zVar = (wd.z) this.f5206e;
                if (aVar instanceof m) {
                    mVar = (m) aVar;
                    int i10 = mVar.f5203r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        mVar.f5203r = i10 - Integer.MIN_VALUE;
                        Object obj2 = mVar.f5201e;
                        md.a aVar2 = md.a.f6622d;
                        i3 = mVar.f5203r;
                        if (i3 == 0) {
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    obj = mVar.f5200d;
                                    cf.c.M(obj2);
                                    if (!((Boolean) obj2).booleanValue()) {
                                        zVar.f10164d = true;
                                        mVar.f5200d = null;
                                        mVar.f5203r = 3;
                                        if (fVar.b(obj, mVar) == aVar2) {
                                        }
                                    }
                                    break;
                                } else if (i3 != 3) {
                                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            }
                            cf.c.M(obj2);
                        } else {
                            cf.c.M(obj2);
                            if (zVar.f10164d) {
                                mVar.f5200d = null;
                                mVar.f5203r = 1;
                                if (fVar.b(obj, mVar) == aVar2) {
                                }
                            } else {
                                ?? r11 = (nd.i) this.f5208r;
                                mVar.f5200d = obj;
                                mVar.f5203r = 2;
                                obj2 = r11.invoke(obj, mVar);
                                if (obj2 == aVar2) {
                                }
                                if (!((Boolean) obj2).booleanValue()) {
                                }
                            }
                        }
                    }
                }
                mVar = new m(this, aVar);
                Object obj22 = mVar.f5201e;
                md.a aVar22 = md.a.f6622d;
                i3 = mVar.f5203r;
                if (i3 == 0) {
                }
                break;
            case 1:
                Object a9 = ke.c.a((CoroutineContext) this.f5206e, obj, this.f5207i, (a3.t) this.f5208r, aVar);
                if (a9 != md.a.f6622d) {
                    break;
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                z0 z0Var = (z0) this.f5207i;
                ((o1) this.f5206e).setValue(Boolean.valueOf(booleanValue ? ((Boolean) ((Function2) ((n0.z0) this.f5208r).getValue()).invoke(z0Var.f9917a.l(), z0Var.f9920d.getValue())).booleanValue() : false));
                break;
        }
        return Unit.f5554a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(wd.z zVar, f fVar, Function2 function2) {
        this.f5206e = zVar;
        this.f5207i = fVar;
        this.f5208r = (nd.i) function2;
    }

    public n(o1 o1Var, z0 z0Var, n0.z0 z0Var2) {
        this.f5206e = o1Var;
        this.f5207i = z0Var;
        this.f5208r = z0Var2;
    }
}
