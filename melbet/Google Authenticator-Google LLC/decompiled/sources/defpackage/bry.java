package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.View$CalledFromWrongThreadListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bry {
    public final Object a;

    public bry(Context context, final elc elcVar) {
        this.a = elcVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(elcVar.a);
        application.registerComponentCallbacks(elcVar.a);
        if (Build.VERSION.SDK_INT < 37 || elcVar.c != null) {
            return;
        }
        elcVar.c = new View$CalledFromWrongThreadListener() { // from class: ela
            public final void onCalledFromWrongThread() {
                if (((Boolean) elc.this.b.b()).booleanValue()) {
                    ((hkf) ((hkf) ((hkf) eiu.a.g()).j(hlj.MEDIUM)).i("com/google/android/libraries/performance/primes/lifecycle/AppLifecycleTracker", "attachToApp", 56, "AppLifecycleTracker.java")).s("Called from wrong thread");
                }
            }
        };
        View.registerCalledFromWrongThreadListener(elcVar.c);
    }

    public final void a() {
        ((ddm) ((bry) this.a).a).q(null);
    }

    public final hvi b() {
        return ((fcu) this.a).d();
    }

    public final void c(dmm dmmVar, int i, fhg fhgVar, View view) {
        dms a = dms.a((FloatingActionButton) this.a);
        Animator animator = a.c;
        if (animator != null) {
            animator.cancel();
        }
        dmmVar.b(new dmr(this, a, i, fhgVar, view));
        AnimatorSet animatorSet = new AnimatorSet();
        List list = dmmVar.i;
        fhq.h(animatorSet, list);
        animatorSet.addListener(new dml(dmmVar));
        List list2 = dmmVar.j;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            animatorSet.addListener((Animator.AnimatorListener) it.next());
        }
        list.clear();
        list2.clear();
        animatorSet.start();
    }

    public final void d(eve eveVar) {
        eveVar.a((evi) this.a);
    }

    public final String e(Uri uri, String str, String str2) {
        qy qyVar;
        if (uri != null) {
            qyVar = (qy) ((qy) this.a).get(uri.toString());
        } else {
            qyVar = null;
        }
        if (qyVar == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(str2);
        }
        return (String) qyVar.get(str2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, koe] */
    public final erl f(float f) {
        Random random = (Random) this.a.b();
        random.getClass();
        return new erl(random, f);
    }

    public final void g(ekz ekzVar) {
        ekzVar.getClass();
        elb elbVar = ((elc) this.a).a;
        int i = elb.c;
        elbVar.a.add(ekzVar);
    }

    public final void h(ekz ekzVar) {
        elb elbVar = ((elc) this.a).a;
        int i = elb.c;
        elbVar.a.remove(ekzVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, koe] */
    public final Object i(gzf gzfVar) {
        try {
            ikm ikmVar = (ikm) this.a.b();
            if (ikg.t((CronetEngine) ikmVar.a)) {
                throw new iej();
            }
            return gzfVar.a(ikmVar);
        } catch (IllegalStateException | UnsatisfiedLinkError e) {
            throw new iej(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Object obj, Executor executor) {
        executor.getClass();
        if (obj != 0) {
            ((htu) this.a).a(obj, executor);
        }
    }

    public bry(Object obj, char[] cArr) {
        this.a = obj;
    }

    public bry(Object obj, short[] sArr) {
        this.a = obj;
    }

    public bry(byte[] bArr) {
        this.a = new ddm();
    }

    public bry(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
        floatingActionButton.getResources();
    }

    public bry(Object obj, byte[] bArr) {
        obj.getClass();
        this.a = obj;
    }

    public bry(Resources resources, boolean z) {
        this.a = new bse(resources, z);
    }

    public bry(kaa kaaVar) {
        kaaVar.getClass();
        this.a = kaaVar;
    }

    public bry() {
        this.a = new bry((byte[]) null);
    }

    public bry(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public bry(Context context, byte[] bArr) {
        this.a = hoq.v(new eks(context, 3));
    }
}
