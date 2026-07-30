package defpackage;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class od2 implements ld2, zd2 {
    public final /* synthetic */ md2 m;
    public final xd2 n;
    public final kd1 o;
    public final wd2 p;

    public od2(md2 md2Var) {
        this.m = md2Var;
        xd2 xd2Var = new xd2(new yd2(this, new dj(11, this)));
        this.n = xd2Var;
        this.o = new kd1(this, false);
        this.p = xd2Var.b;
        Object c = md2Var.c("androidx.savedstate.SavedStateRegistry");
        xd2Var.a(c instanceof Bundle ? (Bundle) c : null);
        md2Var.d("androidx.savedstate.SavedStateRegistry", new dj(9, this));
    }

    @Override // defpackage.ld2
    public final boolean a(Object obj) {
        return this.m.a(obj);
    }

    @Override // defpackage.ld2
    public final Map b() {
        return this.m.b();
    }

    @Override // defpackage.ld2
    public final Object c(String str) {
        return this.m.c(str);
    }

    @Override // defpackage.ld2
    public final mh d(String str, Function0 function0) {
        return this.m.d(str, function0);
    }

    @Override // defpackage.id1
    public final ad1 getLifecycle() {
        return this.o;
    }

    @Override // defpackage.zd2
    public final wd2 getSavedStateRegistry() {
        return this.p;
    }
}
