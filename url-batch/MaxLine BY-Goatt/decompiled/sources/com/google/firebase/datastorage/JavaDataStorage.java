package com.google.firebase.datastorage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import defpackage.a42;
import defpackage.a50;
import defpackage.at0;
import defpackage.b42;
import defpackage.cl0;
import defpackage.d42;
import defpackage.d82;
import defpackage.f50;
import defpackage.gk2;
import defpackage.h62;
import defpackage.i70;
import defpackage.j8;
import defpackage.j80;
import defpackage.k7;
import defpackage.l51;
import defpackage.n52;
import defpackage.n60;
import defpackage.o30;
import defpackage.on1;
import defpackage.oq2;
import defpackage.p50;
import defpackage.pv;
import defpackage.t71;
import defpackage.t80;
import defpackage.tr;
import defpackage.u;
import defpackage.v;
import defpackage.vb0;
import defpackage.wk;
import defpackage.wk2;
import defpackage.xk2;
import defpackage.yk2;
import defpackage.z71;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class JavaDataStorage {
    static final /* synthetic */ t71[] $$delegatedProperties;
    private final Context context;
    private final n60 dataStore;
    private final h62 dataStore$delegate;
    private final ThreadLocal<Boolean> editLock;
    private final String name;

    static {
        n52 n52Var = new n52(tr.NO_RECEIVER, JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        d82.a.getClass();
        $$delegatedProperties = new t71[]{n52Var};
    }

    public JavaDataStorage(Context context, String str) {
        context.getClass();
        str.getClass();
        this.context = context;
        this.name = str;
        this.editLock = new ThreadLocal<>();
        at0 at0Var = new at0(new l51(this, 0));
        l51 l51Var = new l51(this, 1);
        t80 t80Var = vb0.a;
        j80 j80Var = j80.o;
        oq2 a = gk2.a();
        j80Var.getClass();
        this.dataStore$delegate = new a42(str, at0Var, l51Var, j8.b(f.c(j80Var, a)));
        this.dataStore = getDataStore(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d42 dataStore_delegate$lambda$0(JavaDataStorage javaDataStorage, f50 f50Var) {
        f50Var.getClass();
        Log.w(d82.a(JavaDataStorage.class).c(), "CorruptionException in " + javaDataStorage.name + " DataStore running in process " + Process.myPid(), f50Var);
        return new on1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dataStore_delegate$lambda$1(JavaDataStorage javaDataStorage, Context context) {
        context.getClass();
        String str = javaDataStorage.name;
        LinkedHashSet linkedHashSet = xk2.a;
        str.getClass();
        linkedHashSet.getClass();
        o30 o30Var = null;
        return pv.c(new wk2(context, str, yk2.a, new p50(5, o30Var, linkedHashSet), new wk(3, o30Var, 1)));
    }

    private final n60 getDataStore(Context context) {
        at0 at0Var;
        h62 h62Var = this.dataStore$delegate;
        t71 t71Var = $$delegatedProperties[0];
        a42 a42Var = (a42) h62Var;
        a42Var.getClass();
        context.getClass();
        t71Var.getClass();
        at0 at0Var2 = a42Var.f;
        if (at0Var2 != null) {
            return at0Var2;
        }
        synchronized (a42Var.e) {
            try {
                if (a42Var.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    at0 at0Var3 = a42Var.b;
                    Function1 function1 = a42Var.c;
                    applicationContext.getClass();
                    List list = (List) function1.invoke(applicationContext);
                    a50 a50Var = a42Var.d;
                    k7 k7Var = new k7(17, applicationContext, a42Var);
                    list.getClass();
                    a42Var.f = new at0(new at0(new i70(new cl0(new u(26, k7Var)), pv.c(new v(20, null, list)), at0Var3, a50Var)));
                }
                at0Var = a42Var.f;
                at0Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return at0Var;
    }

    public final <T> boolean contains(b42 b42Var) {
        b42Var.getClass();
        return ((Boolean) z71.P(h.m, new JavaDataStorage$contains$1(this, b42Var, null))).booleanValue();
    }

    public final d42 editSync(Function1<? super on1, Unit> function1) {
        function1.getClass();
        return (d42) z71.P(h.m, new JavaDataStorage$editSync$1(this, function1, null));
    }

    public final Map<b42, Object> getAllSync() {
        return (Map) z71.P(h.m, new JavaDataStorage$getAllSync$1(this, null));
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getName() {
        return this.name;
    }

    public final <T> T getSync(b42 b42Var, T t) {
        b42Var.getClass();
        return (T) z71.P(h.m, new JavaDataStorage$getSync$1(this, b42Var, t, null));
    }

    public final <T> d42 putSync(b42 b42Var, T t) {
        b42Var.getClass();
        return (d42) z71.P(h.m, new JavaDataStorage$putSync$1(this, b42Var, t, null));
    }
}
