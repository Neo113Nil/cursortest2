package w1;

import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import e2.InterfaceC0426e;
import java.util.concurrent.Callable;
import q2.InterfaceC0835w;
import s2.C0969c;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1179b extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public C0969c f9854h;

    /* renamed from: i, reason: collision with root package name */
    public int f9855i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f9856j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1180c f9857k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s2.g f9858l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Callable f9859m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s2.g f9860n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1179b(AppDatabase_Impl appDatabase_Impl, C1180c c1180c, s2.g gVar, Callable callable, s2.g gVar2, V1.d dVar) {
        super(2, dVar);
        this.f9856j = appDatabase_Impl;
        this.f9857k = c1180c;
        this.f9858l = gVar;
        this.f9859m = callable;
        this.f9860n = gVar2;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1179b) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1179b(this.f9856j, this.f9857k, this.f9858l, this.f9859m, this.f9860n, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0014, B:8:0x0035, B:12:0x0040, B:14:0x0048, B:23:0x0024, B:25:0x002e), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:8:0x0035). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0969c c0969c;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9855i;
        C1180c c1180c = this.f9857k;
        q qVar = this.f9856j.f9923e;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                qVar.a(c1180c);
                c0969c = new C0969c(this.f9858l);
            } else if (i3 == 1) {
                c0969c = this.f9854h;
                R1.a.e(obj);
                if (((Boolean) obj).booleanValue()) {
                    qVar.c(c1180c);
                    return R1.y.f4171a;
                }
                c0969c.c();
                Object call = this.f9859m.call();
                s2.g gVar = this.f9860n;
                this.f9854h = c0969c;
                this.f9855i = 2;
                if (gVar.f(this, call) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0969c = this.f9854h;
                R1.a.e(obj);
            }
            this.f9854h = c0969c;
            this.f9855i = 1;
            obj = c0969c.b(this);
            if (obj == aVar) {
                return aVar;
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th) {
            qVar.c(c1180c);
            throw th;
        }
    }
}
