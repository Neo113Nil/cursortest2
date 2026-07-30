package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class qc {
    public static final pc Companion = new pc();
    public boolean PxuCJdSBwIXG;
    public boolean lS5Rgt96tfkO;

    public static final void PxuCJdSBwIXG(bx1 bx1Var, fy1 fy1Var) {
        Object uv1Var;
        v40 v40Var = bx1Var.Y1f8riQaR6yg;
        lS5Rgt96tfkO(fy1Var);
        uv uvVar = bx1Var.TSizfFm2Yiuu;
        dx1 dx1Var = uvVar.a92UlCVFR9N8;
        dx1 dx1Var2 = dx1.OPXfSBeufaJ8;
        if (dx1Var == dx1Var2) {
            sj0.S9EYkSpbGuxq(fy1Var, "PRAGMA journal_mode = WAL");
        } else {
            sj0.S9EYkSpbGuxq(fy1Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (uvVar.a92UlCVFR9N8 == dx1Var2) {
            sj0.S9EYkSpbGuxq(fy1Var, "PRAGMA synchronous = NORMAL");
        } else {
            sj0.S9EYkSpbGuxq(fy1Var, "PRAGMA synchronous = FULL");
        }
        hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("PRAGMA user_version");
        try {
            amuv7NJvPxHu.tmVwIGCQF4zR();
            int i = (int) amuv7NJvPxHu.getLong(0);
            cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
            if (i != v40Var.PxuCJdSBwIXG) {
                sj0.S9EYkSpbGuxq(fy1Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        bx1Var.TSizfFm2Yiuu(fy1Var);
                    } else {
                        bx1Var.Y1f8riQaR6yg(fy1Var, i, v40Var.PxuCJdSBwIXG);
                    }
                    sj0.S9EYkSpbGuxq(fy1Var, "PRAGMA user_version = " + v40Var.PxuCJdSBwIXG);
                    uv1Var = no2.PxuCJdSBwIXG;
                } catch (Throwable th) {
                    uv1Var = new uv1(th);
                }
                if (!(uv1Var instanceof uv1)) {
                    sj0.S9EYkSpbGuxq(fy1Var, "END TRANSACTION");
                }
                Throwable PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(uv1Var);
                if (PxuCJdSBwIXG != null) {
                    sj0.S9EYkSpbGuxq(fy1Var, "ROLLBACK TRANSACTION");
                    throw PxuCJdSBwIXG;
                }
            }
            bx1Var.e9gEMXR7LXtO(fy1Var);
        } finally {
        }
    }

    public static void lS5Rgt96tfkO(fy1 fy1Var) {
        hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("PRAGMA busy_timeout");
        try {
            amuv7NJvPxHu.tmVwIGCQF4zR();
            long j = amuv7NJvPxHu.getLong(0);
            cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
            if (j < 3000) {
                sj0.S9EYkSpbGuxq(fy1Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cs0.r3s1LDPKFs1S(amuv7NJvPxHu, th);
                throw th2;
            }
        }
    }

    public final void TSizfFm2Yiuu(fy1 fy1Var) {
        fy1Var.getClass();
        hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (amuv7NJvPxHu.tmVwIGCQF4zR()) {
                if (amuv7NJvPxHu.getLong(0) == 0) {
                    z = true;
                }
            }
            cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
            bx1 bx1Var = (bx1) this;
            v40 v40Var = bx1Var.Y1f8riQaR6yg;
            v40Var.PxuCJdSBwIXG(fy1Var);
            if (!z) {
                p RAsUl2FVSrh6 = v40Var.RAsUl2FVSrh6(fy1Var);
                if (!RAsUl2FVSrh6.lS5Rgt96tfkO) {
                    u9.RAsUl2FVSrh6(RAsUl2FVSrh6.TSizfFm2Yiuu, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            a92UlCVFR9N8(fy1Var);
            v40Var.TSizfFm2Yiuu(fy1Var);
            Iterator it = bx1Var.e9gEMXR7LXtO.iterator();
            while (it.hasNext()) {
                ((ax1) it.next()).getClass();
                if (fy1Var instanceof ob2) {
                    ((ob2) fy1Var).rtx2ld2ELZv4.getClass();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a1 A[EDGE_INSN: B:136:0x00a1->B:120:0x00a1 BREAK  A[LOOP:4: B:98:0x0028->B:121:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y1f8riQaR6yg(fy1 fy1Var, int i, int i2) {
        Iterable iterable;
        vi1 vi1Var;
        boolean z;
        boolean z2;
        fy1Var.getClass();
        bx1 bx1Var = (bx1) this;
        uv uvVar = bx1Var.TSizfFm2Yiuu;
        zo0 zo0Var = uvVar.Y1f8riQaR6yg;
        zo0Var.getClass();
        if (i == i2) {
            iterable = p50.rtx2ld2ELZv4;
        } else {
            boolean z3 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            do {
                if (z3) {
                    if (i3 >= i2) {
                        iterable = arrayList;
                        break;
                    }
                    LinkedHashMap linkedHashMap = zo0Var.PxuCJdSBwIXG;
                    if (z3) {
                        TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap != null) {
                            vi1Var = new vi1(treeMap, treeMap.keySet());
                            if (vi1Var != null) {
                            }
                        }
                        vi1Var = null;
                        if (vi1Var != null) {
                        }
                    } else {
                        TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 != null) {
                            vi1Var = new vi1(treeMap2, treeMap2.descendingKeySet());
                            if (vi1Var != null) {
                                break;
                            }
                            Map map = (Map) vi1Var.rtx2ld2ELZv4;
                            Iterator it = ((Iterable) vi1Var.OPXfSBeufaJ8).iterator();
                            while (it.hasNext()) {
                                int intValue = ((Number) it.next()).intValue();
                                if (!z3) {
                                    if (i2 <= intValue && intValue < i3) {
                                        Object obj = map.get(Integer.valueOf(intValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = intValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= intValue && intValue <= i2) {
                                    Object obj2 = map.get(Integer.valueOf(intValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z = true;
                                    i3 = intValue;
                                    break;
                                }
                            }
                            z = false;
                        }
                        vi1Var = null;
                        if (vi1Var != null) {
                        }
                    }
                } else {
                    if (i3 <= i2) {
                        iterable = arrayList;
                        break;
                    }
                    LinkedHashMap linkedHashMap2 = zo0Var.PxuCJdSBwIXG;
                    if (z3) {
                    }
                }
            } while (z);
            iterable = null;
        }
        v40 v40Var = bx1Var.Y1f8riQaR6yg;
        if (iterable != null) {
            v40Var.a92UlCVFR9N8(fy1Var);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((vv) it2.next()).getClass();
                if (!(fy1Var instanceof ob2)) {
                    throw new ce1("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                pd0 pd0Var = ((ob2) fy1Var).rtx2ld2ELZv4;
                pd0Var.getClass();
                pd0Var.rtx2ld2ELZv4.execSQL("CREATE TABLE IF NOT EXISTS gate_config (\n    id INTEGER NOT NULL PRIMARY KEY,\n    valueSaved INTEGER NOT NULL,\n    customTab INTEGER NOT NULL,\n    customTabLink TEXT NOT NULL\n)");
            }
            p RAsUl2FVSrh6 = v40Var.RAsUl2FVSrh6(fy1Var);
            if (!RAsUl2FVSrh6.lS5Rgt96tfkO) {
                u9.RAsUl2FVSrh6(RAsUl2FVSrh6.TSizfFm2Yiuu, "Migration didn't properly handle: ");
                return;
            } else {
                v40Var.e9gEMXR7LXtO(fy1Var);
                a92UlCVFR9N8(fy1Var);
                return;
            }
        }
        uvVar.getClass();
        if (i <= i2 || !uvVar.wdg6QnbFHrFF) {
            Set set = uvVar.dgRBjINgWbAK;
            if (uvVar.OPXfSBeufaJ8 && (set == null || !set.contains(Integer.valueOf(i)))) {
                z2 = true;
                if (!z2) {
                    throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
                }
                if (uvVar.r3s1LDPKFs1S) {
                    hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                    try {
                        z11 BjEWd04qc7Mw = fx1.BjEWd04qc7Mw();
                        while (amuv7NJvPxHu.tmVwIGCQF4zR()) {
                            String dgRBjINgWbAK = amuv7NJvPxHu.dgRBjINgWbAK(0);
                            if (!pa2.yQRudnv4La6p(dgRBjINgWbAK, "sqlite_", false) && !dgRBjINgWbAK.equals("android_metadata")) {
                                BjEWd04qc7Mw.add(new vi1(dgRBjINgWbAK, Boolean.valueOf(cs0.wdg6QnbFHrFF(amuv7NJvPxHu.dgRBjINgWbAK(1), "view"))));
                            }
                        }
                        z11 ZbWwgt3aGe7A = fx1.ZbWwgt3aGe7A(BjEWd04qc7Mw);
                        cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
                        ListIterator listIterator = ZbWwgt3aGe7A.listIterator(0);
                        while (true) {
                            xj0 xj0Var = (xj0) listIterator;
                            if (!xj0Var.hasNext()) {
                                break;
                            }
                            vi1 vi1Var2 = (vi1) xj0Var.next();
                            String str = (String) vi1Var2.rtx2ld2ELZv4;
                            if (((Boolean) vi1Var2.OPXfSBeufaJ8).booleanValue()) {
                                sj0.S9EYkSpbGuxq(fy1Var, "DROP VIEW IF EXISTS `" + str + '`');
                            } else {
                                sj0.S9EYkSpbGuxq(fy1Var, "DROP TABLE IF EXISTS `" + str + '`');
                            }
                        }
                    } finally {
                    }
                } else {
                    v40Var.lS5Rgt96tfkO(fy1Var);
                }
                Iterator it3 = bx1Var.e9gEMXR7LXtO.iterator();
                while (it3.hasNext()) {
                    ((ax1) it3.next()).getClass();
                    if (fy1Var instanceof ob2) {
                        ((ob2) fy1Var).rtx2ld2ELZv4.getClass();
                    }
                }
                v40Var.PxuCJdSBwIXG(fy1Var);
                return;
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    public final void a92UlCVFR9N8(fy1 fy1Var) {
        sj0.S9EYkSpbGuxq(fy1Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sj0.S9EYkSpbGuxq(fy1Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((bx1) this).Y1f8riQaR6yg.lS5Rgt96tfkO) + "')");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e9gEMXR7LXtO(fy1 fy1Var) {
        boolean z;
        Object uv1Var;
        p RAsUl2FVSrh6;
        fy1Var.getClass();
        hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (amuv7NJvPxHu.tmVwIGCQF4zR()) {
                if (amuv7NJvPxHu.getLong(0) != 0) {
                    z = true;
                    cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
                    if (z) {
                        sj0.S9EYkSpbGuxq(fy1Var, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            RAsUl2FVSrh6 = ((bx1) this).Y1f8riQaR6yg.RAsUl2FVSrh6(fy1Var);
                        } catch (Throwable th) {
                            uv1Var = new uv1(th);
                        }
                        if (!RAsUl2FVSrh6.lS5Rgt96tfkO) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + RAsUl2FVSrh6.TSizfFm2Yiuu).toString());
                        }
                        ((bx1) this).Y1f8riQaR6yg.e9gEMXR7LXtO(fy1Var);
                        a92UlCVFR9N8(fy1Var);
                        uv1Var = no2.PxuCJdSBwIXG;
                        if (!(uv1Var instanceof uv1)) {
                            sj0.S9EYkSpbGuxq(fy1Var, "END TRANSACTION");
                        }
                        Throwable PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(uv1Var);
                        if (PxuCJdSBwIXG != null) {
                            sj0.S9EYkSpbGuxq(fy1Var, "ROLLBACK TRANSACTION");
                            throw PxuCJdSBwIXG;
                        }
                    } else {
                        amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String dgRBjINgWbAK = amuv7NJvPxHu.tmVwIGCQF4zR() ? amuv7NJvPxHu.dgRBjINgWbAK(0) : null;
                            cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
                            v40 v40Var = ((bx1) this).Y1f8riQaR6yg;
                            if (!((String) v40Var.lS5Rgt96tfkO).equals(dgRBjINgWbAK) && !((String) v40Var.TSizfFm2Yiuu).equals(dgRBjINgWbAK)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) v40Var.lS5Rgt96tfkO) + ", found: " + dgRBjINgWbAK).toString());
                            }
                        } finally {
                        }
                    }
                    bx1 bx1Var = (bx1) this;
                    bx1Var.Y1f8riQaR6yg.Y1f8riQaR6yg(fy1Var);
                    for (ax1 ax1Var : bx1Var.e9gEMXR7LXtO) {
                        ax1Var.getClass();
                        if (fy1Var instanceof ob2) {
                            pd0 pd0Var = ((ob2) fy1Var).rtx2ld2ELZv4;
                            pd0Var.getClass();
                            ax1Var.PxuCJdSBwIXG.OPXfSBeufaJ8(pd0Var);
                        }
                    }
                    this.PxuCJdSBwIXG = true;
                }
            }
            z = false;
            cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
            if (z) {
            }
            bx1 bx1Var2 = (bx1) this;
            bx1Var2.Y1f8riQaR6yg.Y1f8riQaR6yg(fy1Var);
            while (r0.hasNext()) {
            }
            this.PxuCJdSBwIXG = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
