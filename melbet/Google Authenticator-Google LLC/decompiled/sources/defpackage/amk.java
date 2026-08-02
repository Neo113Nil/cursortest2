package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class amk {
    public final int a;
    public final /* synthetic */ ajb b;

    public amk(int i) {
        this.a = i;
    }

    public static final void a(String str) {
        if (ksp.g(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int c = ksp.c(str.charAt(true != z ? i : length));
            if (z) {
                if (c > 0) {
                    break;
                } else {
                    length--;
                }
            } else if (c > 0) {
                z = true;
            } else {
                i++;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x005f A[EDGE_INSN: B:116:0x005f->B:100:0x005f BREAK  A[LOOP:4: B:78:0x001d->B:101:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0061  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(amj amjVar, int i, int i2) {
        Iterable iterable;
        kol kolVar;
        boolean z;
        ana anaVar = new ana(amjVar);
        ajb ajbVar = this.b;
        ajd ajdVar = ajbVar.a;
        if (i == i2) {
            iterable = kpk.a;
        } else {
            boolean z2 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            do {
                if (z2) {
                    if (i3 >= i2) {
                        iterable = arrayList;
                        break;
                    }
                    brn brnVar = ajdVar.q;
                    if (z2) {
                        TreeMap treeMap = (TreeMap) brnVar.a.get(Integer.valueOf(i3));
                        if (treeMap != null) {
                            kolVar = new kol(treeMap, treeMap.keySet());
                            if (kolVar != null) {
                            }
                        }
                        kolVar = null;
                        if (kolVar != null) {
                        }
                    } else {
                        TreeMap treeMap2 = (TreeMap) brnVar.a.get(Integer.valueOf(i3));
                        if (treeMap2 != null) {
                            kolVar = new kol(treeMap2, treeMap2.descendingKeySet());
                            if (kolVar != null) {
                                break;
                            }
                            Object obj = kolVar.b;
                            Map map = (Map) kolVar.a;
                            Iterator it = ((Iterable) obj).iterator();
                            while (it.hasNext()) {
                                int intValue = ((Number) it.next()).intValue();
                                if (z2) {
                                    if (i3 + 1 <= intValue && intValue <= i2) {
                                        Object obj2 = map.get(Integer.valueOf(intValue));
                                        obj2.getClass();
                                        arrayList.add(obj2);
                                        z = true;
                                        i3 = intValue;
                                        break;
                                    }
                                } else if (i2 <= intValue && intValue < i3) {
                                    Object obj22 = map.get(Integer.valueOf(intValue));
                                    obj22.getClass();
                                    arrayList.add(obj22);
                                    z = true;
                                    i3 = intValue;
                                    break;
                                    break;
                                }
                            }
                            z = false;
                        }
                        kolVar = null;
                        if (kolVar != null) {
                        }
                    }
                } else {
                    if (i3 <= i2) {
                        iterable = arrayList;
                        break;
                    }
                    brn brnVar2 = ajdVar.q;
                    if (z2) {
                    }
                }
            } while (z);
            iterable = null;
        }
        if (iterable != null) {
            aka akaVar = ajbVar.b;
            akaVar.d(anaVar);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((alk) it2.next()).b(anaVar);
            }
            jxu g = akaVar.g(anaVar);
            if (!g.a) {
                throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(g.b)));
            }
            akaVar.f();
            ajbVar.a(anaVar);
            return;
        }
        if (i <= i2 || !ajdVar.i) {
            Set set = ajdVar.j;
            if (ajdVar.h && !set.contains(Integer.valueOf(i))) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.");
            }
        }
        if (ajdVar.m) {
            amh a = anaVar.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                kpt kptVar = new kpt(10);
                while (a.l()) {
                    String d = a.d(0);
                    if (!ksp.s(d, "sqlite_") && !ksp.b(d, "android_metadata")) {
                        kptVar.add(new kol(d, Boolean.valueOf(ksp.b(a.d(1), "view"))));
                    }
                }
                List a2 = ixc.a(kptVar);
                ixf.i(a, null);
                ListIterator listIterator = ((kpt) a2).listIterator(0);
                while (listIterator.hasNext()) {
                    kol kolVar2 = (kol) listIterator.next();
                    String str = (String) kolVar2.a;
                    if (((Boolean) kolVar2.b).booleanValue()) {
                        yj.o(anaVar, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        yj.o(anaVar, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } finally {
            }
        } else {
            ajbVar.b.b(anaVar);
        }
        for (ajz ajzVar : ajbVar.c) {
        }
        ajbVar.b.a(anaVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public amk(ajb ajbVar, int i) {
        this(i);
        this.b = ajbVar;
    }
}
