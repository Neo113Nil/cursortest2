package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ng implements ks {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public ng(ls lsVar) {
        this.f = 3;
        this.g = lsVar;
        jb jbVar = jb.c;
        Class<?> cls = lsVar.getClass();
        hb hbVar = (hb) jbVar.a.get(cls);
        this.h = hbVar == null ? jbVar.a(cls, null) : hbVar;
    }

    @Override // defpackage.ks
    public final void f(ms msVar, gs gsVar) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                mj mjVar = (mj) obj;
                int i2 = mg.a[gsVar.ordinal()];
                if (i2 == 3) {
                    (Build.VERSION.SDK_INT >= 28 ? ad.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new pj(), 500L);
                    mjVar.f.f(mjVar);
                } else if (i2 == 7) {
                    g9.i("ON_ANY must not been send by anybody");
                    break;
                }
                ks ksVar = (ks) obj2;
                if (ksVar != null) {
                    ksVar.f(msVar, gsVar);
                    break;
                }
                break;
            case 1:
                if (gsVar == gs.ON_START) {
                    ((os) obj).f(this);
                    ((s3) obj2).f();
                    break;
                }
                break;
            case 2:
                cz czVar = (cz) obj;
                int i3 = gz.a[gsVar.ordinal()];
                if (i3 == 1) {
                    czVar.b(true);
                    break;
                } else if (i3 == 2) {
                    czVar.b(false);
                    break;
                } else if (i3 == 3) {
                    czVar.a();
                    ((os) obj2).f(this);
                    break;
                }
                break;
            default:
                ls lsVar = (ls) obj;
                HashMap hashMap = ((hb) obj2).a;
                hb.a((List) hashMap.get(gsVar), msVar, gsVar, lsVar);
                hb.a((List) hashMap.get(gs.ON_ANY), msVar, gsVar, lsVar);
                break;
        }
    }

    public /* synthetic */ ng(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public ng(cz czVar, hz hzVar, os osVar) {
        this.f = 2;
        this.g = czVar;
        this.h = osVar;
    }
}
