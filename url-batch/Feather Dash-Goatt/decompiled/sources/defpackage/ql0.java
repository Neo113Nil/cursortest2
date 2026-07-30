package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ql0 {
    public final yw a;
    public final i8 b;
    public final HashMap c;

    public ql0(Context context, i8 i8Var) {
        yw ywVar = new yw(context, 17);
        this.c = new HashMap();
        this.a = ywVar;
        this.b = i8Var;
    }

    public final synchronized fj1 a(String str) {
        if (this.c.containsKey(str)) {
            return (fj1) this.c.get(str);
        }
        CctBackendFactory k = this.a.k(str);
        if (k == null) {
            return null;
        }
        i8 i8Var = this.b;
        fj1 create = k.create(new hb((Context) i8Var.h, (me1) i8Var.e, (me1) i8Var.g, str));
        this.c.put(str, create);
        return create;
    }
}
