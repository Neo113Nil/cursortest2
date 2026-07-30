package androidx.lifecycle;

import android.content.Intent;
import c7.m1;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.RootActivity;
import com.chicken.road.whale.plate.PlatePageActivity;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1016g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1017h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1018i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, h6.d dVar, int i7) {
        super(2, dVar);
        this.f1016g = i7;
        this.f1018i = obj;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f1016g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p pVar = new p((q) this.f1018i, dVar, 0);
                pVar.f1017h = obj;
                return pVar;
            case 1:
                return new p((Callable) this.f1017h, (c7.h) this.f1018i, dVar, 1);
            case 2:
                return new p((RootActivity) this.f1017h, (f4.u) this.f1018i, dVar, 2);
            case 3:
                p pVar2 = new p((f4.c0) this.f1018i, dVar, 3);
                pVar2.f1017h = obj;
                return pVar2;
            case 4:
                p pVar3 = new p((g3.i0) this.f1018i, dVar, 4);
                pVar3.f1017h = obj;
                return pVar3;
            default:
                p pVar4 = new p((y.j) this.f1018i, dVar, 5);
                pVar4.f1017h = obj;
                return pVar4;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f1016g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p pVar = (p) create((c7.x) obj, (h6.d) obj2);
                d6.z zVar = d6.z.f2639a;
                pVar.invokeSuspend(zVar);
                return zVar;
            case 1:
                p pVar2 = (p) create((c7.x) obj, (h6.d) obj2);
                d6.z zVar2 = d6.z.f2639a;
                pVar2.invokeSuspend(zVar2);
                return zVar2;
            case 2:
                p pVar3 = (p) create((c7.x) obj, (h6.d) obj2);
                d6.z zVar3 = d6.z.f2639a;
                pVar3.invokeSuspend(zVar3);
                return zVar3;
            case 3:
                p pVar4 = (p) create((k3.b) obj, (h6.d) obj2);
                d6.z zVar4 = d6.z.f2639a;
                pVar4.invokeSuspend(zVar4);
                return zVar4;
            case 4:
                return ((p) create((g3.i0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                return ((p) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f1016g;
        boolean z8 = false;
        h6.d dVar = null;
        int i8 = 1;
        d6.z zVar = d6.z.f2639a;
        Object obj2 = this.f1018i;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                c7.x xVar = (c7.x) this.f1017h;
                q qVar = (q) obj2;
                x xVar2 = qVar.f1019f;
                if (xVar2.f1046d.compareTo(o.f1008g) >= 0) {
                    xVar2.a(qVar);
                } else {
                    c7.x0 x0Var = (c7.x0) xVar.k().u(c7.u.f1748g);
                    if (x0Var != null) {
                        x0Var.c(null);
                    }
                }
                return zVar;
            case 1:
                c7.h hVar = (c7.h) obj2;
                d6.a.e(obj);
                try {
                    hVar.resumeWith(((Callable) this.f1017h).call());
                } catch (Throwable th) {
                    hVar.resumeWith(d6.a.b(th));
                }
                return zVar;
            case 2:
                d6.a.e(obj);
                RootActivity rootActivity = (RootActivity) this.f1017h;
                f4.m mVar = PlatePageActivity.Companion;
                f4.u uVar = (f4.u) obj2;
                String str = uVar.f3350a;
                boolean z9 = uVar.f3351b;
                mVar.getClass();
                r6.k.f(str, "url");
                Intent putExtra = new Intent(rootActivity, (Class<?>) PlatePageActivity.class).putExtra("extra_url", str).putExtra("extra_consent", z9);
                r6.k.e(putExtra, "putExtra(...)");
                rootActivity.startActivity(putExtra);
                rootActivity.finish();
                return zVar;
            case 3:
                d6.a.e(obj);
                k3.b bVar = (k3.b) this.f1017h;
                k3.d dVar2 = ((f4.c0) obj2).f3308d;
                Boolean bool = Boolean.TRUE;
                bVar.getClass();
                r6.k.f(dVar2, "key");
                bVar.c(dVar2, bool);
                return zVar;
            case 4:
                d6.a.e(obj);
                g3.i0 i0Var = (g3.i0) this.f1017h;
                if ((i0Var instanceof g3.c) && i0Var.f4147a <= ((g3.i0) obj2).f4147a) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            default:
                d6.a.e(obj);
                c7.x xVar3 = (c7.x) this.f1017h;
                y.j jVar = (y.j) obj2;
                c7.x0 x0Var2 = (c7.x0) jVar.f9717a.getAndSet(null);
                AtomicReference atomicReference = jVar.f9717a;
                m1 p6 = c7.a0.p(xVar3, null, null, new y.b(x0Var2, jVar, dVar, i8), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, p6)) {
                        z8 = true;
                    } else if (atomicReference.get() != null) {
                    }
                }
                return Boolean.valueOf(z8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, h6.d dVar, int i7) {
        super(2, dVar);
        this.f1016g = i7;
        this.f1017h = obj;
        this.f1018i = obj2;
    }
}
