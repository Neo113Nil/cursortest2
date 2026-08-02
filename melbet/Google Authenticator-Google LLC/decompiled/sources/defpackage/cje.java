package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cje implements cjr {
    public static volatile int a = -1;

    @Deprecated
    public static final bxm l;
    private static final ox o;
    public final cjt d;
    public final String e;
    public final Context f;
    protected final String g;
    public final String h;
    public final cjy i;
    public final cjn j;
    public int k;
    protected final ddw m;
    public static final dbl[] b = new dbl[0];
    public static final String[] c = new String[0];
    private static final ow n = new ow(null);

    static {
        cjc cjcVar = new cjc();
        o = cjcVar;
        l = new bxm("ClearcutLogger.API", cjcVar);
    }

    protected cje(Context context, String str, String str2, cjy cjyVar, int i, ddw ddwVar, cjt cjtVar, cjn cjnVar) {
        if (!cjyVar.a(cjz.ACCOUNT_NAME)) {
            oy.am(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        b(cjyVar);
        this.f = context.getApplicationContext();
        this.h = context.getPackageName();
        this.g = str;
        this.e = str2;
        this.i = cjyVar;
        this.k = i == 0 ? 1 : i;
        this.m = ddwVar == null ? new ddw(context, null, null) : ddwVar;
        this.d = cjtVar == null ? new cko(context) : cjtVar;
        this.j = cjnVar;
    }

    static final String a(Iterable iterable) {
        return new gzl(", ").c(iterable);
    }

    static final void b(cjy cjyVar) {
        if (!cjyVar.equals(cjy.c) && !cjyVar.equals(cjy.a) && !cjyVar.equals(cjy.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    public static final int[] d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    @Override // defpackage.cjr
    public final boolean c() {
        return this.i.equals(cjy.b);
    }

    public final void e() {
        this.k = 3;
    }
}
