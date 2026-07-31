package w1;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.gatesof.olympus.martu.marku.App;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final q f9907a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9908b;

    /* renamed from: c, reason: collision with root package name */
    public int f9909c;

    /* renamed from: d, reason: collision with root package name */
    public final s f9910d;

    /* renamed from: e, reason: collision with root package name */
    public n f9911e;

    /* renamed from: f, reason: collision with root package name */
    public final t f9912f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f9913g;

    /* renamed from: h, reason: collision with root package name */
    public final r f9914h;

    /* renamed from: i, reason: collision with root package name */
    public final r f9915i;

    /* JADX WARN: Type inference failed for: r1v0, types: [w1.r] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w1.r] */
    public v(App app, Intent intent, q qVar, Executor executor) {
        f2.j.f(intent, "serviceIntent");
        f2.j.f(qVar, "invalidationTracker");
        this.f9907a = qVar;
        this.f9908b = executor;
        Context applicationContext = app.getApplicationContext();
        this.f9912f = new t(this);
        this.f9913g = new AtomicBoolean(false);
        u uVar = new u(this);
        final int i3 = 0;
        this.f9914h = new Runnable(this) { // from class: w1.r

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ v f9903e;

            {
                this.f9903e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        v vVar = this.f9903e;
                        f2.j.f(vVar, "this$0");
                        try {
                            n nVar = vVar.f9911e;
                            if (nVar != null) {
                                vVar.f9909c = nVar.c(vVar.f9912f, "salon_ledger.db");
                                q qVar2 = vVar.f9907a;
                                s sVar = vVar.f9910d;
                                if (sVar != null) {
                                    qVar2.a(sVar);
                                    return;
                                } else {
                                    f2.j.j("observer");
                                    throw null;
                                }
                            }
                            return;
                        } catch (RemoteException e3) {
                            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e3);
                            return;
                        }
                    default:
                        v vVar2 = this.f9903e;
                        f2.j.f(vVar2, "this$0");
                        s sVar2 = vVar2.f9910d;
                        if (sVar2 != null) {
                            vVar2.f9907a.c(sVar2);
                            return;
                        } else {
                            f2.j.j("observer");
                            throw null;
                        }
                }
            }
        };
        final int i4 = 1;
        this.f9915i = new Runnable(this) { // from class: w1.r

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ v f9903e;

            {
                this.f9903e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        v vVar = this.f9903e;
                        f2.j.f(vVar, "this$0");
                        try {
                            n nVar = vVar.f9911e;
                            if (nVar != null) {
                                vVar.f9909c = nVar.c(vVar.f9912f, "salon_ledger.db");
                                q qVar2 = vVar.f9907a;
                                s sVar = vVar.f9910d;
                                if (sVar != null) {
                                    qVar2.a(sVar);
                                    return;
                                } else {
                                    f2.j.j("observer");
                                    throw null;
                                }
                            }
                            return;
                        } catch (RemoteException e3) {
                            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e3);
                            return;
                        }
                    default:
                        v vVar2 = this.f9903e;
                        f2.j.f(vVar2, "this$0");
                        s sVar2 = vVar2.f9910d;
                        if (sVar2 != null) {
                            vVar2.f9907a.c(sVar2);
                            return;
                        } else {
                            f2.j.j("observer");
                            throw null;
                        }
                }
            }
        };
        this.f9910d = new s(this, (String[]) qVar.f9892d.keySet().toArray(new String[0]));
        applicationContext.bindService(intent, uVar, 1);
    }
}
