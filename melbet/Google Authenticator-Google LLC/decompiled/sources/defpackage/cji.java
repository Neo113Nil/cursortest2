package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cji extends cje {
    public static final List n = new CopyOnWriteArrayList();
    public final List o;
    public final cjg p;

    public cji(Context context, String str, String str2, cjy cjyVar, int i, ddw ddwVar, cjt cjtVar, cjg cjgVar, cjn cjnVar) {
        super(context, str, str2, cjyVar, i, ddwVar, cjtVar, cjnVar);
        this.o = new CopyOnWriteArrayList();
        this.p = cjgVar;
    }

    public static cji f(Context context, String str) {
        cjd cjdVar = new cjd(context, str);
        cjdVar.b(cjy.b);
        return cjdVar.a();
    }

    public final cjf g(jll jllVar) {
        oy.at(jllVar);
        return new cjf(this, jllVar);
    }

    @Deprecated
    public final cjf h(jll jllVar, djg djgVar) {
        oy.at(jllVar);
        cjf cjfVar = new cjf(this, jllVar);
        cjfVar.d(djgVar);
        return cjfVar;
    }

    public cji(Context context, String str, String str2) {
        this(context, str, str2, cjy.a, 0, new ddw(context, null, null), new cko(context), null, null);
    }
}
