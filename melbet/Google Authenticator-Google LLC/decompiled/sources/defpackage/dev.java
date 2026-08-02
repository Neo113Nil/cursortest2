package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dev {
    public static final hkh a = hkh.l("com/google/android/libraries/androidatgoogle/privacy/PrivacyScreenImpl");
    public final Application b;
    public final Handler c;
    public Activity d;
    public final AtomicBoolean e;
    public final koi f;
    public final koi g;
    public det h;
    private final koi i;

    public dev(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = (Application) applicationContext;
        this.c = new Handler(Looper.getMainLooper());
        this.e = new AtomicBoolean(false);
        this.i = new kop(new aux(this, 3));
        this.f = new kop(new aux(this, 4));
        this.g = new kop(new aux(this, 5));
    }

    public final det a() {
        det detVar = this.h;
        if (detVar != null) {
            return detVar;
        }
        throw new IllegalStateException("Privacy Screen is not configured");
    }

    public final hvi b() {
        return dih.u(e().e(), new cvr(9));
    }

    public final hvi c(dff dffVar) {
        dffVar.getClass();
        return dih.t(e().f(), new ccb(new ajq(dffVar, 16), 13));
    }

    public final hvi d(final boolean z) {
        this.e.set(z);
        return dih.t(e().f(), new ccb(new krt() { // from class: dew
            @Override // defpackage.krt
            public final Object a(Object obj) {
                dfe dfeVar = (dfe) obj;
                dfeVar.getClass();
                dfg dfgVar = dfeVar.c;
                if (dfgVar == null) {
                    dfgVar = dfg.a;
                }
                jkj C = dfgVar.C();
                if (!C.b.M()) {
                    C.t();
                }
                boolean z2 = z;
                dfg dfgVar2 = (dfg) C.b;
                dfgVar2.b |= 1;
                dfgVar2.c = z2;
                jkp q = C.q();
                q.getClass();
                dfg dfgVar3 = (dfg) q;
                jkj C2 = dfeVar.C();
                if (!C2.b.M()) {
                    C2.t();
                }
                dfe dfeVar2 = (dfe) C2.b;
                dfeVar2.c = dfgVar3;
                dfeVar2.b |= 1;
                return (dfe) C2.q();
            }
        }, 14));
    }

    public final bvw e() {
        return (bvw) this.i.a();
    }
}
