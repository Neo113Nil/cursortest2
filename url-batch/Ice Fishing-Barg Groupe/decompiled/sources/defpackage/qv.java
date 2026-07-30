package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.webkit.WebSettings;
import com.ice.fishing.grenza.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qv implements jr1 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final rv lS5Rgt96tfkO;

    public /* synthetic */ qv(rv rvVar, int i, int i2) {
        this.PxuCJdSBwIXG = i2;
        this.lS5Rgt96tfkO = rvVar;
        this.TSizfFm2Yiuu = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x031f, code lost:
    
        defpackage.u9.XL4ISE6Oc65B("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ba A[LOOP:7: B:140:0x038b->B:152:0x03ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048a  */
    @Override // defpackage.jr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        Object obj;
        String str;
        v40 v40Var;
        tb2 tb2Var;
        bx1 bx1Var;
        tb2 tb2Var2;
        boolean z;
        boolean z2;
        int i;
        int i2;
        Object b0Var;
        boolean z3 = true;
        int i3 = 2;
        switch (this.PxuCJdSBwIXG) {
            case 0:
                int i4 = this.TSizfFm2Yiuu;
                switch (i4) {
                    case 0:
                        AppDatabase appDatabase = (AppDatabase) this.lS5Rgt96tfkO.TSizfFm2Yiuu.get();
                        appDatabase.getClass();
                        us0 x50lh2ztY7Y5 = appDatabase.x50lh2ztY7Y5();
                        th0.wdg6QnbFHrFF(x50lh2ztY7Y5);
                        return new w51(x50lh2ztY7Y5);
                    case 1:
                        Context context = this.lS5Rgt96tfkO.PxuCJdSBwIXG.PxuCJdSBwIXG;
                        if (ia2.fRTaYY6FBZcX("app_db")) {
                            obj = null;
                            u9.XL4ISE6Oc65B("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            zo0 zo0Var = new zo0(2);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            ArrayList arrayList3 = new ArrayList();
                            ck PxuCJdSBwIXG = bu1.PxuCJdSBwIXG(AppDatabase.class);
                            vv[] vvVarArr = {ov2.a92UlCVFR9N8};
                            vvVarArr[0].getClass();
                            linkedHashSet2.add(1);
                            linkedHashSet2.add(2);
                            for (vv vvVar : (vv[]) Arrays.copyOf(vvVarArr, 1)) {
                                zo0Var.lS5Rgt96tfkO(vvVar);
                            }
                            s9 s9Var = t9.TSizfFm2Yiuu;
                            if (!linkedHashSet2.isEmpty()) {
                                Iterator it = linkedHashSet2.iterator();
                                while (it.hasNext()) {
                                    int intValue = ((Number) it.next()).intValue();
                                    if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                                        u9.e9gEMXR7LXtO(o0.wdg6QnbFHrFF("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", intValue));
                                        return null;
                                    }
                                }
                            }
                            ib0 ib0Var = new ib0(i3);
                            Object systemService = context.getSystemService("activity");
                            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                            dx1 dx1Var = (activityManager == null || activityManager.isLowRamDevice()) ? dx1.rtx2ld2ELZv4 : dx1.OPXfSBeufaJ8;
                            obj = null;
                            uv uvVar = new uv(context, "app_db", ib0Var, zo0Var, arrayList, false, dx1Var, s9Var, s9Var, null, true, false, linkedHashSet, null, null, null, arrayList2, arrayList3, false, null, null);
                            Class e6tOsSdd2EFb = kj0.e6tOsSdd2EFb(PxuCJdSBwIXG);
                            Package r6 = e6tOsSdd2EFb.getPackage();
                            if (r6 == null || (str = r6.getName()) == null) {
                                str = "";
                            }
                            String canonicalName = e6tOsSdd2EFb.getCanonicalName();
                            canonicalName.getClass();
                            if (str.length() != 0) {
                                canonicalName = canonicalName.substring(str.length() + 1);
                            }
                            String replace = canonicalName.replace('.', '_');
                            replace.getClass();
                            String concat = replace.concat("_Impl");
                            try {
                                Class<?> cls = Class.forName(str.length() == 0 ? concat : str + '.' + concat, true, e6tOsSdd2EFb.getClassLoader());
                                cls.getClass();
                                ex1 ex1Var = (ex1) cls.getDeclaredConstructor(null).newInstance(null);
                                ex1Var.getClass();
                                ex1Var.wdg6QnbFHrFF = true;
                                try {
                                    v40 TSizfFm2Yiuu = ex1Var.TSizfFm2Yiuu();
                                    TSizfFm2Yiuu.getClass();
                                    v40Var = TSizfFm2Yiuu;
                                } catch (ce1 unused) {
                                    v40Var = null;
                                }
                                if (v40Var == null) {
                                    new bx1(uvVar, new mq1(ex1Var), new gb0(2, ex1Var, fx1.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 1));
                                    throw null;
                                }
                                ex1Var.e9gEMXR7LXtO = new bx1(uvVar, v40Var, new gb0(2, ex1Var, fx1.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 2));
                                ex1Var.a92UlCVFR9N8 = ex1Var.lS5Rgt96tfkO();
                                zo0 zo0Var2 = uvVar.Y1f8riQaR6yg;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Set e9gEMXR7LXtO = ex1Var.e9gEMXR7LXtO();
                                List list = uvVar.cpQdD2nAriOS;
                                int size = list.size();
                                boolean[] zArr = new boolean[size];
                                Iterator it2 = e9gEMXR7LXtO.iterator();
                                while (true) {
                                    int i5 = -1;
                                    if (it2.hasNext()) {
                                        eu0 eu0Var = (eu0) it2.next();
                                        int size2 = list.size() - 1;
                                        if (size2 >= 0) {
                                            while (true) {
                                                int i6 = size2 - 1;
                                                z2 = z3;
                                                i = i5;
                                                if (((ck) eu0Var).Y1f8riQaR6yg(list.get(size2))) {
                                                    zArr[size2] = z2;
                                                    i2 = size2;
                                                } else if (i6 >= 0) {
                                                    i5 = i;
                                                    size2 = i6;
                                                    z3 = z2;
                                                }
                                            }
                                        } else {
                                            z2 = z3;
                                            i = -1;
                                        }
                                        i2 = i;
                                        if (i2 >= 0) {
                                            linkedHashMap.put(eu0Var, list.get(i2));
                                            z3 = z2;
                                        } else {
                                            rc1.OPXfSBeufaJ8("A required auto migration spec (", ((ck) eu0Var).lS5Rgt96tfkO(), ") is missing in the database configuration.");
                                        }
                                    } else {
                                        boolean z4 = z3;
                                        int size3 = list.size() - 1;
                                        if (size3 >= 0) {
                                            while (true) {
                                                int i7 = size3 - 1;
                                                if (size3 < size && zArr[size3]) {
                                                    if (i7 >= 0) {
                                                        size3 = i7;
                                                    }
                                                }
                                            }
                                        }
                                        for (vv vvVar2 : ex1Var.PxuCJdSBwIXG(linkedHashMap)) {
                                            vvVar2.getClass();
                                            LinkedHashMap linkedHashMap2 = zo0Var2.PxuCJdSBwIXG;
                                            if (linkedHashMap2.containsKey(1)) {
                                                Map map = (Map) linkedHashMap2.get(1);
                                                if (map == null) {
                                                    map = q50.rtx2ld2ELZv4;
                                                }
                                                z = map.containsKey(2);
                                            } else {
                                                z = false;
                                            }
                                            if (!z) {
                                                zo0Var2.lS5Rgt96tfkO(vvVar2);
                                            }
                                        }
                                        LinkedHashMap a92UlCVFR9N8 = ex1Var.a92UlCVFR9N8();
                                        List list2 = uvVar.x50lh2ztY7Y5;
                                        boolean[] zArr2 = new boolean[list2.size()];
                                        for (Map.Entry entry : a92UlCVFR9N8.entrySet()) {
                                            eu0 eu0Var2 = (eu0) entry.getKey();
                                            for (eu0 eu0Var3 : (List) entry.getValue()) {
                                                int size4 = list2.size() - 1;
                                                if (size4 >= 0) {
                                                    while (true) {
                                                        int i8 = size4 - 1;
                                                        if (((ck) eu0Var3).Y1f8riQaR6yg(list2.get(size4))) {
                                                            zArr2[size4] = z4;
                                                        } else if (i8 >= 0) {
                                                            size4 = i8;
                                                        }
                                                    }
                                                    if (size4 < 0) {
                                                        Object obj2 = list2.get(size4);
                                                        eu0Var3.getClass();
                                                        obj2.getClass();
                                                        ex1Var.OPXfSBeufaJ8.put(eu0Var3, obj2);
                                                    } else {
                                                        u9.cpQdD2nAriOS("A required type converter (", ((ck) eu0Var3).lS5Rgt96tfkO(), ") for ", ((ck) eu0Var2).lS5Rgt96tfkO(), " is missing in the database configuration.");
                                                    }
                                                }
                                                size4 = -1;
                                                if (size4 < 0) {
                                                }
                                            }
                                        }
                                        int size5 = list2.size() - 1;
                                        if (size5 >= 0) {
                                            while (true) {
                                                int i9 = size5 - 1;
                                                if (!zArr2[size5]) {
                                                    throw new IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                                }
                                                if (i9 >= 0) {
                                                    size5 = i9;
                                                }
                                            }
                                        }
                                        ex1Var.TSizfFm2Yiuu = uvVar.RAsUl2FVSrh6;
                                        ex1Var.Y1f8riQaR6yg = new rk2(uvVar.rtx2ld2ELZv4);
                                        Executor executor = ex1Var.TSizfFm2Yiuu;
                                        if (executor == null) {
                                            cs0.tmVwIGCQF4zR("internalQueryExecutor");
                                            throw null;
                                        }
                                        at Y1f8riQaR6yg = cs0.Y1f8riQaR6yg(f2.xfACYKDMU6Dj(new i70(executor), new mb2(null)));
                                        ex1Var.PxuCJdSBwIXG = Y1f8riQaR6yg;
                                        hu huVar = Y1f8riQaR6yg.rtx2ld2ELZv4;
                                        rk2 rk2Var = ex1Var.Y1f8riQaR6yg;
                                        if (rk2Var == null) {
                                            cs0.tmVwIGCQF4zR("internalTransactionExecutor");
                                            throw null;
                                        }
                                        ex1Var.lS5Rgt96tfkO = huVar.RfyTYNmI9Srp(new i70(rk2Var));
                                        bx1 bx1Var2 = ex1Var.e9gEMXR7LXtO;
                                        if (bx1Var2 == null) {
                                            cs0.tmVwIGCQF4zR("connectionManager");
                                            throw null;
                                        }
                                        tb2 tb2Var3 = bx1Var2.RAsUl2FVSrh6;
                                        if (tb2Var3 != null) {
                                            tb2Var = tb2Var3;
                                            while (!(tb2Var instanceof fp1)) {
                                                if (tb2Var instanceof vx) {
                                                    tb2Var = ((vx) tb2Var).lS5Rgt96tfkO();
                                                }
                                            }
                                            bx1Var = ex1Var.e9gEMXR7LXtO;
                                            if (bx1Var != null) {
                                                cs0.tmVwIGCQF4zR("connectionManager");
                                                throw null;
                                            }
                                            tb2 tb2Var4 = bx1Var.RAsUl2FVSrh6;
                                            if (tb2Var4 != null) {
                                                tb2Var2 = tb2Var4;
                                                while (!(tb2Var2 instanceof gb)) {
                                                    if (tb2Var2 instanceof vx) {
                                                        tb2Var2 = ((vx) tb2Var2).lS5Rgt96tfkO();
                                                    }
                                                }
                                                return (AppDatabase) ex1Var;
                                            }
                                            tb2Var2 = null;
                                            return (AppDatabase) ex1Var;
                                        }
                                        tb2Var = null;
                                        bx1Var = ex1Var.e9gEMXR7LXtO;
                                        if (bx1Var != null) {
                                        }
                                    }
                                }
                            } catch (ClassNotFoundException e) {
                                throw new RuntimeException("Cannot find implementation for " + e6tOsSdd2EFb.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
                            } catch (IllegalAccessException e2) {
                                throw new RuntimeException("Cannot access the constructor " + e6tOsSdd2EFb.getCanonicalName(), e2);
                            } catch (InstantiationException e3) {
                                throw new RuntimeException("Failed to create an instance of " + e6tOsSdd2EFb.getCanonicalName(), e3);
                            }
                        }
                        return obj;
                    case 2:
                        b0 b0Var2 = (b0) this.lS5Rgt96tfkO.RAsUl2FVSrh6.get();
                        AppDatabase appDatabase2 = (AppDatabase) this.lS5Rgt96tfkO.TSizfFm2Yiuu.get();
                        appDatabase2.getClass();
                        bg0 dgRBjINgWbAK = appDatabase2.dgRBjINgWbAK();
                        th0.wdg6QnbFHrFF(dgRBjINgWbAK);
                        return new gg0(b0Var2, dgRBjINgWbAK);
                    case 3:
                        rv rvVar = this.lS5Rgt96tfkO;
                        Context context2 = rvVar.PxuCJdSBwIXG.PxuCJdSBwIXG;
                        g0 g0Var = (g0) rvVar.a92UlCVFR9N8.get();
                        g0Var.getClass();
                        b0Var = new b0(context2, g0Var);
                        break;
                    case 4:
                        rv rvVar2 = this.lS5Rgt96tfkO;
                        Context context3 = rvVar2.PxuCJdSBwIXG.PxuCJdSBwIXG;
                        if1 if1Var = (if1) rvVar2.e9gEMXR7LXtO.get();
                        if1Var.getClass();
                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                        defaultUserAgent.getClass();
                        b0Var = new g0(if1Var, defaultUserAgent);
                        break;
                    case 5:
                        dm0 dm0Var = new dm0();
                        dm0Var.Y1f8riQaR6yg = am0.rtx2ld2ELZv4;
                        gf1 gf1Var = new gf1();
                        gf1Var.TSizfFm2Yiuu.add(dm0Var);
                        TimeUnit.MILLISECONDS.getClass();
                        gf1Var.S2OOm9zPNm0h = mv2.lS5Rgt96tfkO("timeout", 80000L);
                        gf1Var.ZbWwgt3aGe7A = mv2.lS5Rgt96tfkO("timeout", 80000L);
                        gf1Var.pnx5pC0XzaCw = mv2.lS5Rgt96tfkO("timeout", 80000L);
                        gf1Var.IAToe7bXGz4N = mv2.lS5Rgt96tfkO("interval", 20000L);
                        return new if1(gf1Var);
                    case 6:
                        AppDatabase appDatabase3 = (AppDatabase) this.lS5Rgt96tfkO.TSizfFm2Yiuu.get();
                        appDatabase3.getClass();
                        us0 x50lh2ztY7Y52 = appDatabase3.x50lh2ztY7Y5();
                        th0.wdg6QnbFHrFF(x50lh2ztY7Y52);
                        return new xr1(x50lh2ztY7Y52);
                    default:
                        throw new AssertionError(i4);
                }
                return b0Var;
            default:
                rv rvVar3 = this.lS5Rgt96tfkO;
                int i10 = this.TSizfFm2Yiuu;
                if (i10 == 0) {
                    return new wy((w51) rvVar3.Y1f8riQaR6yg.get());
                }
                if (i10 == 1) {
                    return new cf0();
                }
                if (i10 == 2) {
                    return new hm0((w51) rvVar3.Y1f8riQaR6yg.get());
                }
                if (i10 == 3) {
                    return new ov0((gg0) rvVar3.rtx2ld2ELZv4.get());
                }
                if (i10 == 4) {
                    return new u51((w51) rvVar3.Y1f8riQaR6yg.get());
                }
                if (i10 == 5) {
                    return new wr1((xr1) rvVar3.OPXfSBeufaJ8.get());
                }
                throw new AssertionError(i10);
        }
    }
}
