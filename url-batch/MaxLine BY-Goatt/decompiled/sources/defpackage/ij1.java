package defpackage;

import android.content.Context;
import com.majelw.libystne.data.MaxLineDatabase;
import kotlin.Unit;
import kotlin.coroutines.f;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ij1 {
    public static final u30 d = new u30(29);
    public static volatile ij1 e;
    public final Context a;
    public final hk b;
    public final z51 c;

    public ij1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        u30 u30Var = MaxLineDatabase.k;
        applicationContext.getClass();
        MaxLineDatabase maxLineDatabase = MaxLineDatabase.l;
        if (maxLineDatabase == null) {
            synchronized (u30Var) {
                try {
                    maxLineDatabase = MaxLineDatabase.l;
                    if (maxLineDatabase == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        applicationContext2.getClass();
                        if (up2.y("maxline.db")) {
                            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                        }
                        lb2 a = new jb2(applicationContext2).a();
                        MaxLineDatabase.l = (MaxLineDatabase) a;
                        maxLineDatabase = (MaxLineDatabase) a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.b = maxLineDatabase.j();
        this.c = maxLineDatabase.k();
        oq2 a2 = gk2.a();
        t80 t80Var = vb0.a;
        z71.H(j8.b(f.c(a2, j80.o)), null, new v(28, null, this), 3);
    }

    public static final Double a(ij1 ij1Var, JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        double optDouble = jSONObject.optDouble(str);
        Double valueOf = Double.valueOf(optDouble);
        if (Double.isNaN(optDouble)) {
            return null;
        }
        return valueOf;
    }

    public static final String b(ij1 ij1Var, JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str) || !jSONObject.has(str)) {
            return null;
        }
        String optString = jSONObject.optString(str);
        if (up2.y(optString)) {
            return null;
        }
        return optString;
    }

    public final qn0 c(jk jkVar) {
        hk hkVar = this.b;
        if (jkVar == null) {
            return hkVar.b();
        }
        hkVar.getClass();
        return bd3.p(hkVar.a, new String[]{"atlas_entry"}, new ek(0, hkVar, jkVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r10 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(r30 r30Var) {
        ej1 ej1Var;
        Object obj;
        int i;
        Object U;
        if (r30Var instanceof ej1) {
            ej1Var = (ej1) r30Var;
            int i2 = ej1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ej1Var.o = i2 - Integer.MIN_VALUE;
                Object obj2 = ej1Var.m;
                obj = b50.m;
                i = ej1Var.o;
                z51 z51Var = this.c;
                if (i != 0) {
                    ca2.b(obj2);
                    ej1Var.o = 1;
                    Object U2 = l41.U(ej1Var, z51Var.a, new zd(16), false, true);
                    if (U2 != obj) {
                        U2 = Unit.a;
                    }
                } else if (i == 1) {
                    ca2.b(obj2);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            ca2.b(obj2);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj2);
                    ej1Var.o = 3;
                    Object U3 = l41.U(ej1Var, this.b.a, new zd(3), false, true);
                    if (U3 != obj) {
                        U3 = Unit.a;
                    }
                }
                ej1Var.o = 2;
                U = l41.U(ej1Var, z51Var.a, new zd(15), false, true);
                if (U != obj) {
                    U = Unit.a;
                }
            }
        }
        ej1Var = new ej1(this, r30Var);
        Object obj22 = ej1Var.m;
        obj = b50.m;
        i = ej1Var.o;
        z51 z51Var2 = this.c;
        if (i != 0) {
        }
        ej1Var.o = 2;
        U = l41.U(ej1Var, z51Var2.a, new zd(15), false, true);
        if (U != obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(r30 r30Var) {
        fj1 fj1Var;
        int i;
        if (r30Var instanceof fj1) {
            fj1Var = (fj1) r30Var;
            int i2 = fj1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fj1Var.o = i2 - Integer.MIN_VALUE;
                Object obj = fj1Var.m;
                b50 b50Var = b50.m;
                i = fj1Var.o;
                if (i != 0) {
                    ca2.b(obj);
                    t80 t80Var = vb0.a;
                    j80 j80Var = j80.o;
                    j5 j5Var = new j5(this, null);
                    fj1Var.o = 1;
                    obj = z71.V(j80Var, j5Var, fj1Var);
                    if (obj == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                obj.getClass();
                return obj;
            }
        }
        fj1Var = new fj1(this, r30Var);
        Object obj2 = fj1Var.m;
        b50 b50Var2 = b50.m;
        i = fj1Var.o;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    public final qn0 f(String str) {
        str.getClass();
        hk hkVar = this.b;
        hkVar.getClass();
        return bd3.p(hkVar.a, new String[]{"atlas_entry"}, new dk(str, hkVar, 0));
    }

    public final qn0 g(String str) {
        str.getClass();
        z51 z51Var = this.c;
        z51Var.getClass();
        return bd3.p(z51Var.a, new String[]{"jewelry_item"}, new ck(str, 1));
    }

    public final qn0 h() {
        return bd3.p(this.b.a, new String[]{"atlas_progress"}, new zd(6));
    }
}
