package defpackage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public at(brn brnVar, Typeface typeface, int i) {
        this.c = i;
        this.a = brnVar;
        this.b = typeface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, wo] */
    /* JADX WARN: Type inference failed for: r15v46, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.c) {
            case 0:
                ((bd) this.a).i((Bundle) this.b);
                return;
            case 1:
                ((cn) this.a).d((cm) this.b);
                return;
            case 2:
                ((bd) this.a).V((Bundle) this.b);
                return;
            case 3:
                ((bd) this.a).l((Bundle) this.b);
                return;
            case 4:
                bd bdVar = (bd) this.a;
                bdVar.ad(bdVar.R, (Bundle) this.b);
                return;
            case 5:
                ((bd) this.a).f((Bundle) this.b);
                return;
            case 6:
                cn cnVar = (cn) this.a;
                List list = cnVar.b;
                Object obj = this.b;
                if (list.contains(obj)) {
                    cm cmVar = (cm) obj;
                    int i2 = cmVar.h;
                    View view = cmVar.a.R;
                    view.getClass();
                    a.L(i2, view, cnVar.a);
                    return;
                }
                return;
            case 7:
                cn cnVar2 = (cn) this.a;
                List list2 = cnVar2.b;
                Object obj2 = this.b;
                list2.remove(obj2);
                cnVar2.c.remove(obj2);
                return;
            case 8:
                ?? r0 = this.a;
                Object obj3 = this.b;
                try {
                    r0.run();
                    return;
                } finally {
                    ((ayo) obj3).a();
                }
            case 9:
                dpi dpiVar = (dpi) this.b;
                es esVar = (es) dpiVar.b;
                if (esVar.f == dpiVar.a) {
                    Object obj4 = this.a;
                    ?? r02 = dpiVar.c;
                    esVar.d = r02;
                    esVar.e = DesugarCollections.unmodifiableList(r02);
                    ((ey) obj4).a(esVar.a);
                    esVar.b();
                    return;
                }
                return;
            case 10:
                ?? r03 = this.a;
                int size = r03.size();
                while (i < size) {
                    ji jiVar = (ji) r03.get(i);
                    Object obj5 = this.b;
                    lp lpVar = jiVar.a;
                    int i3 = jiVar.b;
                    int i4 = jiVar.c;
                    int i5 = jiVar.d;
                    int i6 = jiVar.e;
                    View view2 = lpVar.a;
                    int i7 = i5 - i3;
                    int i8 = i6 - i4;
                    if (i7 != 0) {
                        view2.animate().translationX(0.0f);
                    }
                    if (i8 != 0) {
                        view2.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view2.animate();
                    kv kvVar = (kv) obj5;
                    kvVar.j.add(lpVar);
                    animate.setDuration(250L).setListener(new je(kvVar, lpVar, i7, view2, i8, animate)).start();
                    i++;
                }
                ((ArrayList) r03).clear();
                ((kv) this.b).g.remove((Object) r03);
                return;
            case 11:
                ?? r04 = this.a;
                int size2 = r04.size();
                while (i < size2) {
                    jh jhVar = (jh) r04.get(i);
                    Object obj6 = this.b;
                    lp lpVar2 = jhVar.a;
                    View view3 = lpVar2 == null ? null : lpVar2.a;
                    lp lpVar3 = jhVar.b;
                    View view4 = lpVar3 != null ? lpVar3.a : null;
                    if (view3 != null) {
                        ViewPropertyAnimator duration = view3.animate().setDuration(250L);
                        kv kvVar2 = (kv) obj6;
                        kvVar2.l.add(jhVar.a);
                        duration.translationX(jhVar.e - jhVar.c);
                        duration.translationY(jhVar.f - jhVar.d);
                        duration.alpha(0.0f).setListener(new jf(kvVar2, jhVar, duration, view3)).start();
                    }
                    if (view4 != null) {
                        ViewPropertyAnimator animate2 = view4.animate();
                        kv kvVar3 = (kv) obj6;
                        kvVar3.l.add(jhVar.b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new jg(kvVar3, jhVar, animate2, view4)).start();
                    }
                    i++;
                }
                ((ArrayList) r04).clear();
                ((kv) this.b).h.remove((Object) r04);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ?? r05 = this.a;
                int size3 = r05.size();
                while (i < size3) {
                    lp lpVar4 = (lp) r05.get(i);
                    Object obj7 = this.b;
                    View view5 = lpVar4.a;
                    ViewPropertyAnimator animate3 = view5.animate();
                    kv kvVar4 = (kv) obj7;
                    kvVar4.i.add(lpVar4);
                    animate3.alpha(1.0f).setDuration(120L).setListener(new jd(kvVar4, lpVar4, view5, animate3)).start();
                    i++;
                }
                ((ArrayList) r05).clear();
                ((kv) this.b).f.remove((Object) r05);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ng) this.b).w((oe) this.a);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((pn) this.a).a.q().h((bsh) this.b);
                return;
            case 15:
                ((uw) this.a).b((Typeface) this.b);
                return;
            case 16:
                Object obj8 = ((brn) this.a).a;
                if (obj8 != null) {
                    ((uw) obj8).b((Typeface) this.b);
                    return;
                }
                return;
            case 17:
                this.b.a(this.a);
                return;
            case 18:
                Object obj9 = this.b;
                Object obj10 = this.a;
                int i9 = ado.a;
                Throwable th = (Throwable) obj9;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(obj10)), th);
                throw th;
            case 19:
                ahc ahcVar = (ahc) this.b;
                if (ahcVar.f()) {
                    ahcVar.c();
                } else {
                    ahcVar.b(this.a);
                }
                ahcVar.f = 3;
                return;
            default:
                Object obj11 = this.b;
                try {
                    this.a.run();
                    return;
                } finally {
                    ((akf) obj11).a();
                }
        }
    }

    public /* synthetic */ at(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public at(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ at(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
