package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class rv0 {
    public final Context a;
    public final String b;
    public final t21 c;
    public final tt2 d;
    public final oe e;
    public final int f;
    public final by1 g;
    public final wv0 h;

    public rv0(Context context, t21 t21Var, tt2 tt2Var, qv0 qv0Var) {
        ll3.w(context, "Null context is not permitted.");
        ll3.w(t21Var, "Api must not be null.");
        ll3.w(qv0Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        ll3.w(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = t21Var;
        this.d = tt2Var;
        this.e = new oe(t21Var, tt2Var, attributionTag);
        wv0 d = wv0.d(applicationContext);
        this.h = d;
        this.f = d.t.getAndIncrement();
        this.g = qv0Var.a;
        bb3 bb3Var = d.y;
        bb3Var.sendMessage(bb3Var.obtainMessage(7, this));
    }

    public final mh a() {
        mh mhVar = new mh(6, false);
        Set set = Collections.EMPTY_SET;
        if (((ii) mhVar.n) == null) {
            mhVar.n = new ii(0);
        }
        ((ii) mhVar.n).addAll(set);
        Context context = this.a;
        mhVar.p = context.getClass().getName();
        mhVar.o = context.getPackageName();
        return mhVar;
    }
}
