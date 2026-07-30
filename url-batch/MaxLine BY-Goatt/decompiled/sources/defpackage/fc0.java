package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fc0 implements ld2 {
    public final /* synthetic */ md2 m;
    public final hc0 n;

    public fc0(md2 md2Var, hc0 hc0Var) {
        this.m = md2Var;
        this.n = hc0Var;
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
}
