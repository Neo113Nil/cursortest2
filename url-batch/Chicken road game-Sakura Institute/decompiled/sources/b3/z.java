package b3;

import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1380f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1381g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1382h;

    public /* synthetic */ z(int i7, Object obj, Object obj2, boolean z8) {
        this.f1380f = i7;
        this.f1382h = obj;
        this.f1381g = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        m4.d dVar;
        Exception exc;
        switch (this.f1380f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b0.g((View) this.f1381g);
                ((ValueAnimator) this.f1382h).start();
                return;
            case 1:
                ((c7.h) this.f1382h).C((c7.s0) this.f1381g);
                return;
            case 2:
                ((c7.h) this.f1381g).C((d7.e) this.f1382h);
                return;
            case 3:
                throw new RuntimeException((String) this.f1381g, (Throwable) this.f1382h);
            case 4:
                h7.g gVar = (h7.g) this.f1382h;
                c7.t tVar = gVar.f4683i;
                int i7 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f1381g).run();
                    } catch (Throwable th) {
                        c7.a0.l(h6.j.f4661f, th);
                    }
                    Runnable Z = gVar.Z();
                    if (Z == null) {
                        return;
                    }
                    this.f1381g = Z;
                    i7++;
                    if (i7 >= 16 && tVar.X(gVar)) {
                        tVar.V(gVar, this);
                        return;
                    }
                }
                break;
            case 5:
                j5.r rVar = (j5.r) ((androidx.room.c) this.f1382h).f1070h;
                String str = (String) this.f1381g;
                if (rVar.f5112c) {
                    return;
                }
                rVar.e();
                if (rVar.f5114e != null) {
                    rVar.b(str);
                    return;
                }
                if (str.length() <= 6) {
                    try {
                        int parseInt = Integer.parseInt(str);
                        if (parseInt > 0) {
                            rVar.d(parseInt);
                        }
                        str = null;
                    } catch (NumberFormatException unused) {
                    }
                    if (str == null) {
                        rVar.b(str);
                        return;
                    }
                    return;
                }
                rVar.d(1);
                if (str == null) {
                }
            case 6:
                androidx.room.c cVar = (androidx.room.c) this.f1382h;
                u5.e eVar = (u5.e) this.f1381g;
                if (eVar.getCause() == null || !(eVar.getCause() instanceof EOFException)) {
                    ((j5.r) cVar.f1070h).f5119j.d("WebSocket error.", eVar, new Object[0]);
                } else {
                    ((j5.r) cVar.f1070h).f5119j.d("WebSocket reached EOF.", null, new Object[0]);
                }
                j5.r.a((j5.r) cVar.f1070h);
                return;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((k5.a) this.f1382h).f5366h = null;
                ((androidx.lifecycle.c0) this.f1381g).run();
                return;
            case 8:
                j4.b bVar = (j4.b) this.f1381g;
                l4.l lVar = (l4.l) this.f1382h;
                k4.a aVar = lVar.f5987a;
                l4.j jVar = (l4.j) lVar.f5992f.f5968j.get(lVar.f5988b);
                if (jVar == null) {
                    return;
                }
                if (bVar.f5003g != 0) {
                    jVar.o(bVar, null);
                    return;
                }
                lVar.f5991e = true;
                if (aVar.m()) {
                    if (!lVar.f5991e || (dVar = lVar.f5989c) == null) {
                        return;
                    }
                    aVar.h(dVar, lVar.f5990d);
                    return;
                }
                try {
                    aVar.h(null, aVar.b());
                    return;
                } catch (SecurityException e9) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e9);
                    aVar.d("Failed to get service from broker.");
                    jVar.o(new j4.b(10), null);
                    return;
                }
            case q.c.f7259c /* 9 */:
                q5.g gVar2 = (q5.g) this.f1382h;
                ArrayList arrayList = (ArrayList) this.f1381g;
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    q5.e eVar2 = (q5.e) obj;
                    if (((b1.b) gVar2.f7528h).v()) {
                        ((b1.b) gVar2.f7528h).d("Raising " + eVar2.toString(), null, new Object[0]);
                    }
                    eVar2.a();
                }
                return;
            case q.c.f7261e /* 10 */:
                synchronized (((z4.f) this.f1382h).f10105c) {
                    androidx.room.c cVar2 = (androidx.room.c) ((z4.f) this.f1382h).f10106d;
                    ((Map) ((androidx.room.c) cVar2.f1070h).f1070h).remove((z4.c) cVar2.f1069g);
                }
                return;
            case 11:
                synchronized (((z4.f) this.f1382h).f10105c) {
                    z4.a aVar2 = (z4.a) ((z4.f) this.f1382h).f10106d;
                    z4.i iVar = (z4.i) this.f1381g;
                    synchronized (iVar.f10108a) {
                        exc = iVar.f10113f;
                    }
                    m4.o.d(exc);
                    aVar2.a(exc);
                }
                return;
            case 12:
                synchronized (((z4.f) this.f1382h).f10105c) {
                    ((z4.b) ((z4.f) this.f1382h).f10106d).b(((z4.i) this.f1381g).a());
                }
                return;
            default:
                z4.i iVar2 = (z4.i) this.f1381g;
                try {
                    ((y5.a) this.f1382h).call();
                    iVar2.d(null);
                    return;
                } catch (Exception e10) {
                    iVar2.c(e10);
                    return;
                } catch (Throwable th2) {
                    iVar2.c(new RuntimeException(th2));
                    return;
                }
        }
    }

    public /* synthetic */ z(Object obj, int i7, Object obj2) {
        this.f1380f = i7;
        this.f1381g = obj;
        this.f1382h = obj2;
    }

    public z(View view, f0 f0Var, androidx.room.c cVar, ValueAnimator valueAnimator) {
        this.f1380f = 0;
        this.f1381g = view;
        this.f1382h = valueAnimator;
    }
}
