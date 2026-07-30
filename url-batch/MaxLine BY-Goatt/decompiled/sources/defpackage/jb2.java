package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.data.MaxLineDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jb2 {
    public final gu a;
    public final Context b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public th f;
    public th g;
    public final kb2 h;
    public final long i;
    public final zg1 j;
    public final LinkedHashSet k;
    public final LinkedHashSet l;
    public final ArrayList m;
    public final boolean n;
    public final boolean o;

    public jb2(Context context) {
        context.getClass();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.h = kb2.m;
        this.i = -1L;
        this.j = new zg1(2);
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
        this.m = new ArrayList();
        this.n = true;
        this.o = true;
        this.a = d82.a(MaxLineDatabase.class);
        this.b = context;
        this.c = "maxline.db";
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d1, code lost:
    
        defpackage.lh.e("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d6, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lb2 a() {
        String str;
        xf0 xf0Var;
        ib2 ib2Var;
        br2 br2Var;
        th thVar = this.f;
        if (thVar == null && this.g == null) {
            th thVar2 = uh.c;
            this.g = thVar2;
            this.f = thVar2;
        } else if (thVar != null && this.g == null) {
            this.g = thVar;
        } else if (thVar == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.l;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = this.k;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                    lh.c(in1.k(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        u30 u30Var = new u30(18);
        if (this.i > 0) {
            if (this.c != null) {
                lh.e("Required value was null.");
                return null;
            }
            lh.e("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        kb2 kb2Var = this.h;
        kb2Var.getClass();
        Context context = this.b;
        context.getClass();
        if (kb2Var == kb2.m) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            kb2Var = (activityManager == null || activityManager.isLowRamDevice()) ? kb2.n : kb2.o;
        }
        kb2 kb2Var2 = kb2Var;
        th thVar3 = this.f;
        if (thVar3 == null) {
            lh.e("Required value was null.");
            return null;
        }
        th thVar4 = this.g;
        if (thVar4 == null) {
            lh.e("Required value was null.");
            return null;
        }
        k70 k70Var = new k70(context, this.c, u30Var, this.j, this.d, false, kb2Var2, thVar3, thVar4, null, this.n, false, linkedHashSet2, null, null, null, this.e, this.m, false, null, null);
        k70Var.q = this.o;
        Class y = yj1.y(this.a);
        Package r0 = y.getPackage();
        if (r0 == null || (str = r0.getName()) == null) {
            str = BuildConfig.FLAVOR;
        }
        String canonicalName = y.getCanonicalName();
        canonicalName.getClass();
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
        }
        String replace = canonicalName.replace('.', '_');
        replace.getClass();
        String concat = replace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(str.length() == 0 ? concat : str + '.' + concat, true, y.getClassLoader());
            cls.getClass();
            lb2 lb2Var = (lb2) cls.getDeclaredConstructor(null).newInstance(null);
            lb2Var.getClass();
            lb2Var.j = k70Var.q;
            try {
                xf0Var = lb2Var.c();
                xf0Var.getClass();
            } catch (ws1 unused) {
                xf0Var = null;
            }
            if (xf0Var == null) {
                new ib2(k70Var, new zd(25, lb2Var));
                throw null;
            }
            lb2Var.e = new ib2(k70Var, xf0Var);
            lb2Var.f = lb2Var.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set e = lb2Var.e();
            List list = k70Var.m;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = e.iterator();
            while (true) {
                int i = -1;
                if (it2.hasNext()) {
                    h71 h71Var = (h71) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            if (((gu) h71Var).d(list.get(size2))) {
                                zArr[size2] = true;
                                i = size2;
                                break;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                    if (i < 0) {
                        b71.p(((gu) h71Var).b(), ") is missing in the database configuration.", "A required auto migration spec (");
                        return null;
                    }
                    linkedHashMap.put(h71Var, list.get(i));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i3 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                break;
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size3 = i3;
                        }
                    }
                    Iterator it3 = lb2Var.a(linkedHashMap).iterator();
                    if (it3.hasNext()) {
                        it3.next().getClass();
                        b71.o();
                        return null;
                    }
                    LinkedHashMap f = lb2Var.f();
                    List list2 = k70Var.l;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : f.entrySet()) {
                        h71 h71Var2 = (h71) entry.getKey();
                        for (h71 h71Var3 : (List) entry.getValue()) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i4 = size4 - 1;
                                    if (((gu) h71Var3).d(list2.get(size4))) {
                                        zArr2[size4] = true;
                                        break;
                                    }
                                    if (i4 < 0) {
                                        break;
                                    }
                                    size4 = i4;
                                }
                            }
                            size4 = -1;
                            if (size4 < 0) {
                                b71.s("A required type converter (", ((gu) h71Var3).b(), ") for ", ((gu) h71Var2).b(), " is missing in the database configuration.");
                                return null;
                            }
                            Object obj = list2.get(size4);
                            h71Var3.getClass();
                            obj.getClass();
                            lb2Var.i.put(h71Var3, obj);
                        }
                    }
                    int size5 = list2.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i5 = size5 - 1;
                            if (!zArr2[size5]) {
                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size5 = i5;
                        }
                    }
                    lb2Var.c = k70Var.g;
                    lb2Var.d = new cf(k70Var.h);
                    Executor executor = lb2Var.c;
                    if (executor == null) {
                        Intrinsics.f("internalQueryExecutor");
                        throw null;
                    }
                    m30 b = j8.b(f.c(ap.x(executor), gk2.a()));
                    lb2Var.a = b;
                    CoroutineContext coroutineContext = b.m;
                    cf cfVar = lb2Var.d;
                    if (cfVar == null) {
                        Intrinsics.f("internalTransactionExecutor");
                        throw null;
                    }
                    lb2Var.b = coroutineContext.p(ap.x(cfVar));
                    ib2 ib2Var2 = lb2Var.e;
                    if (ib2Var2 == null) {
                        Intrinsics.f("connectionManager");
                        throw null;
                    }
                    br2 c = ib2Var2.c();
                    if (c != null) {
                        while (!(c instanceof r32)) {
                            if (c instanceof q90) {
                                c = ((q90) c).b();
                            }
                        }
                        ib2Var = lb2Var.e;
                        if (ib2Var != null) {
                            Intrinsics.f("connectionManager");
                            throw null;
                        }
                        br2 c2 = ib2Var.c();
                        if (c2 != null) {
                            br2Var = c2;
                            while (!(br2Var instanceof hl)) {
                                if (br2Var instanceof q90) {
                                    br2Var = ((q90) br2Var).b();
                                }
                            }
                            return lb2Var;
                        }
                        br2Var = null;
                        return lb2Var;
                    }
                    c = null;
                    ib2Var = lb2Var.e;
                    if (ib2Var != null) {
                    }
                }
            }
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Cannot find implementation for " + y.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot access the constructor " + y.getCanonicalName(), e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Failed to create an instance of " + y.getCanonicalName(), e4);
        }
    }
}
