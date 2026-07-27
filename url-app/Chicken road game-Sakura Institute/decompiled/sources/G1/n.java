package G1;

import B1.C0097d;
import W2.AbstractC0298u;
import W2.B;
import W2.C0286h;
import W2.W;
import a1.C0368D;
import a1.C0411z;
import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import com.appsflyer.attribution.RequestError;
import f2.C0632a;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import q.AbstractC1024c;
import t2.CallableC1204a;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3143d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3144e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3145i;

    public /* synthetic */ n(int i2, Object obj, Object obj2, boolean z4) {
        this.f3143d = i2;
        this.f3144e = obj;
        this.f3145i = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        H1.d dVar;
        switch (this.f3143d) {
            case 0:
                o oVar = (o) this.f3145i;
                l lVar = (l) oVar.f3151f.f3119j.get(oVar.f3147b);
                if (lVar == null) {
                    return;
                }
                E1.b bVar = (E1.b) this.f3144e;
                if (!(bVar.f2278e == 0)) {
                    lVar.o(bVar, null);
                    return;
                }
                oVar.f3150e = true;
                F1.a aVar = oVar.f3146a;
                if (aVar.l()) {
                    if (!oVar.f3150e || (dVar = oVar.f3148c) == null) {
                        return;
                    }
                    aVar.e(dVar, oVar.f3149d);
                    return;
                }
                try {
                    aVar.e(null, aVar.g());
                    return;
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    aVar.k("Failed to get service from broker.");
                    lVar.o(new E1.b(10), null);
                    return;
                }
            case 1:
                synchronized (((U1.h) this.f3145i).f4119b) {
                    y.t tVar = (y.t) ((U1.h) this.f3145i).f4121d;
                    ((Map) ((y.t) tVar.f11495i).f11495i).remove((U1.e) tVar.f11494e);
                }
                return;
            case 2:
                synchronized (((U1.h) this.f3145i).f4119b) {
                    U1.b bVar2 = (U1.b) ((U1.h) this.f3145i).f4121d;
                    Exception c4 = ((U1.d) this.f3144e).c();
                    H1.o.d(c4);
                    bVar2.a(c4);
                }
                return;
            case 3:
                synchronized (((U1.h) this.f3145i).f4119b) {
                    ((U1.c) ((U1.h) this.f3145i).f4121d).b(((U1.d) this.f3144e).d());
                }
                return;
            case 4:
                U1.k kVar = (U1.k) this.f3144e;
                try {
                    ((CallableC1204a) this.f3145i).call();
                    kVar.h(null);
                    return;
                } catch (Exception e5) {
                    kVar.g(e5);
                    return;
                } catch (Throwable th) {
                    kVar.g(new RuntimeException(th));
                    return;
                }
            case 5:
                ((C0286h) this.f3145i).E((W) this.f3144e, Unit.f7487a);
                return;
            case 6:
                ((C0286h) this.f3144e).E((X2.d) this.f3145i, Unit.f7487a);
                return;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0411z.g((View) this.f3144e);
                ((ValueAnimator) this.f3145i).start();
                return;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                int i2 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f3144e).run();
                    } catch (Throwable th2) {
                        B.i(th2, kotlin.coroutines.i.f7498d);
                    }
                    b3.g gVar = (b3.g) this.f3145i;
                    Runnable A4 = gVar.A();
                    if (A4 == null) {
                        return;
                    }
                    this.f3144e = A4;
                    i2++;
                    if (i2 >= 16) {
                        AbstractC0298u abstractC0298u = gVar.f5661j;
                        if (abstractC0298u.u(gVar)) {
                            abstractC0298u.t(gVar, this);
                            return;
                        }
                    }
                }
            case AbstractC1024c.f9242c /* 9 */:
                throw new RuntimeException((String) this.f3144e, (Throwable) this.f3145i);
            case 10:
                e2.r rVar = (e2.r) ((y.t) this.f3145i).f11495i;
                if (rVar.f6248c) {
                    return;
                }
                rVar.e();
                f2.b bVar3 = rVar.f6250e;
                String str = (String) this.f3144e;
                if (bVar3 != null) {
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
            case RequestError.STOP_TRACKING /* 11 */:
                p2.f fVar = (p2.f) this.f3144e;
                Throwable cause = fVar.getCause();
                y.t tVar2 = (y.t) this.f3145i;
                if (cause == null || !(fVar.getCause() instanceof EOFException)) {
                    ((e2.r) tVar2.f11495i).f6255j.d("WebSocket error.", fVar, new Object[0]);
                } else {
                    ((e2.r) tVar2.f11495i).f6255j.d("WebSocket reached EOF.", null, new Object[0]);
                }
                e2.r.a((e2.r) tVar2.f11495i);
                return;
            case 12:
                ((C0632a) this.f3145i).f6652h = null;
                ((C.t) this.f3144e).run();
                return;
            default:
                Iterator it = ((ArrayList) this.f3144e).iterator();
                while (it.hasNext()) {
                    l2.e eVar = (l2.e) it.next();
                    l2.g gVar2 = (l2.g) this.f3145i;
                    if (((C0097d) gVar2.f7977c).y()) {
                        ((C0097d) gVar2.f7977c).d("Raising " + eVar.toString(), null, new Object[0]);
                    }
                    eVar.a();
                }
                return;
        }
    }

    public /* synthetic */ n(Object obj, int i2, Object obj2) {
        this.f3143d = i2;
        this.f3145i = obj;
        this.f3144e = obj2;
    }

    public n(View view, C0368D c0368d, y.t tVar, ValueAnimator valueAnimator) {
        this.f3143d = 7;
        this.f3144e = view;
        this.f3145i = valueAnimator;
    }
}
