package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jl1 {
    public final t21 a;
    public final mh b;
    public final HashMap c;

    public jl1(Context context, mh mhVar) {
        t21 t21Var = new t21(25, context);
        this.c = new HashMap();
        this.a = t21Var;
        this.b = mhVar;
    }

    public final synchronized mz2 a(String str) {
        if (this.c.containsKey(str)) {
            return (mz2) this.c.get(str);
        }
        CctBackendFactory x = this.a.x(str);
        if (x == null) {
            return null;
        }
        mh mhVar = this.b;
        mz2 create = x.create(new ul((Context) mhVar.p, (dq2) mhVar.n, (dq2) mhVar.o, str));
        this.c.put(str, create);
        return create;
    }
}
