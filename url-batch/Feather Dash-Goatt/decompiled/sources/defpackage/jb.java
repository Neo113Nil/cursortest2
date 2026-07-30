package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jb implements w71 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public jb(Set set, String str, String str2) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.c = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.a = str;
        this.e = str2;
        this.f = pa1.a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.d = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            af.c();
            throw null;
        }
    }

    @Override // defpackage.w71
    public boolean b() {
        return ((Boolean) ((av0) this.d).getValue()).booleanValue();
    }

    @Override // defpackage.w71
    public Object c(go0 go0Var, Function2 function2, fn fnVar) {
        Object A = la0.A(new f(this, go0Var, function2, null, 6), fnVar);
        return A == tn.d ? A : Unit.a;
    }

    @Override // defpackage.w71
    public float e(float f) {
        return ((Number) ((Function1) this.a).invoke(Float.valueOf(f))).floatValue();
    }

    public void f(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            dd0.j("Property \"autoMetadata\" has not been set");
        }
    }

    public kb g() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((sv) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.e) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new kb((String) this.a, (Integer) this.b, (sv) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        dd0.j("Missing required properties:".concat(str));
        return null;
    }

    public Task h(Task task) {
        return task.f(new kz0(), new af(this));
    }

    public void i(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String str4;
        boolean e;
        int i2;
        PackageInfo d;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        ez ezVar = (ez) this.a;
        ezVar.a();
        bundle.putString("gmp_app_id", ezVar.c.b);
        pl0 pl0Var = (pl0) this.b;
        synchronized (pl0Var) {
            try {
                if (pl0Var.a == 0 && (d = pl0Var.d("com.google.android.gms")) != null) {
                    pl0Var.a = d.versionCode;
                }
                i = pl0Var.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((pl0) this.b).b());
        pl0 pl0Var2 = (pl0) this.b;
        synchronized (pl0Var2) {
            try {
                if (((String) pl0Var2.e) == null) {
                    pl0Var2.f();
                }
                str3 = (String) pl0Var2.e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        ez ezVar2 = (ez) this.a;
        ezVar2.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(ezVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((ob) t80.c(((hz) ((iz) this.f)).d())).a;
            if (TextUtils.isEmpty(str5)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) t80.c(((hz) ((iz) this.f)).c()));
        bundle.putString("cliv", "fcm-25.0.1");
        c60 c60Var = (c60) ((p01) this.e).get();
        sq sqVar = (sq) ((p01) this.d).get();
        if (c60Var == null || sqVar == null) {
            return;
        }
        dq dqVar = (dq) c60Var;
        synchronized (dqVar) {
            long currentTimeMillis = System.currentTimeMillis();
            d60 d60Var = (d60) dqVar.a.get();
            synchronized (d60Var) {
                e = d60Var.e(d60.b, currentTimeMillis);
            }
            if (e) {
                synchronized (d60Var) {
                    d60Var.a.a(new c(d60Var, 8, d60Var.b(System.currentTimeMillis())));
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(qy0.v(i2)));
            bundle.putString("Firebase-Client", sqVar.a());
        }
    }

    public Task j(String str, String str2, Bundle bundle) {
        int i;
        try {
            i(str, str2, bundle);
            t41 t41Var = (t41) this.c;
            du1 du1Var = du1.g;
            xq0 xq0Var = t41Var.c;
            if (xq0Var.k() < 12000000) {
                return xq0Var.l() != 0 ? t41Var.a(bundle).g(du1Var, new c51(t41Var, 18, bundle)) : t80.o(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            xu1 k = xu1.k(t41Var.b);
            synchronized (k) {
                i = k.a;
                k.a = i + 1;
            }
            return k.l(new vu1(i, 1, bundle, 1)).f(du1Var, a60.p);
        } catch (InterruptedException | ExecutionException e) {
            return t80.o(e);
        }
    }

    public jb(Function1 function1) {
        this.a = function1;
        this.b = new pq(this);
        this.c = new lo0();
        Boolean bool = Boolean.FALSE;
        this.d = gb0.F(bool);
        this.e = gb0.F(bool);
        this.f = gb0.F(bool);
    }
}
