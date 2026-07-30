package defpackage;

import com.ice.fishing.grenza.data.db.AppDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l9 extends v40 {
    public final /* synthetic */ AppDatabase_Impl Y1f8riQaR6yg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(AppDatabase_Impl appDatabase_Impl) {
        super(2, "41075557b4924ff46c5a149080c5f094", "af16b5da210756917447825b3c04649a");
        this.Y1f8riQaR6yg = appDatabase_Impl;
    }

    @Override // defpackage.v40
    public final void PxuCJdSBwIXG(fy1 fy1Var) {
        fy1Var.getClass();
        sj0.S9EYkSpbGuxq(fy1Var, "CREATE TABLE IF NOT EXISTS `items` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `rating` INTEGER NOT NULL, `description` TEXT NOT NULL, `protein` INTEGER NOT NULL, `origin` TEXT NOT NULL, `mood` TEXT NOT NULL, `carbs` INTEGER NOT NULL, `dietary` TEXT NOT NULL, `vessel` TEXT NOT NULL, `hint` TEXT NOT NULL, PRIMARY KEY(`id`))");
        sj0.S9EYkSpbGuxq(fy1Var, "CREATE TABLE IF NOT EXISTS `gate_config` (`id` INTEGER NOT NULL, `valueSaved` INTEGER NOT NULL, `customTab` INTEGER NOT NULL, `customTabLink` TEXT NOT NULL, PRIMARY KEY(`id`))");
        sj0.S9EYkSpbGuxq(fy1Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sj0.S9EYkSpbGuxq(fy1Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '41075557b4924ff46c5a149080c5f094')");
    }

    @Override // defpackage.v40
    public final p RAsUl2FVSrh6(fy1 fy1Var) {
        fy1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new ad2("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("name", new ad2("name", "TEXT", true, 0, null, 1));
        linkedHashMap.put("rating", new ad2("rating", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("description", new ad2("description", "TEXT", true, 0, null, 1));
        linkedHashMap.put("protein", new ad2("protein", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("origin", new ad2("origin", "TEXT", true, 0, null, 1));
        linkedHashMap.put("mood", new ad2("mood", "TEXT", true, 0, null, 1));
        linkedHashMap.put("carbs", new ad2("carbs", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("dietary", new ad2("dietary", "TEXT", true, 0, null, 1));
        linkedHashMap.put("vessel", new ad2("vessel", "TEXT", true, 0, null, 1));
        linkedHashMap.put("hint", new ad2("hint", "TEXT", true, 0, null, 1));
        fd2 fd2Var = new fd2("items", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        fd2.Companion.getClass();
        fd2 PxuCJdSBwIXG = bd2.PxuCJdSBwIXG(fy1Var, "items");
        if (!fd2Var.equals(PxuCJdSBwIXG)) {
            return new p("items(com.ice.fishing.grenza.data.db.Item).\n Expected:\n" + fd2Var + "\n Found:\n" + PxuCJdSBwIXG, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new ad2("id", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("valueSaved", new ad2("valueSaved", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("customTab", new ad2("customTab", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("customTabLink", new ad2("customTabLink", "TEXT", true, 0, null, 1));
        fd2 fd2Var2 = new fd2("gate_config", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        fd2 PxuCJdSBwIXG2 = bd2.PxuCJdSBwIXG(fy1Var, "gate_config");
        if (fd2Var2.equals(PxuCJdSBwIXG2)) {
            return new p(null, true);
        }
        return new p("gate_config(com.ice.fishing.grenza.data.db.GateConfigEntity).\n Expected:\n" + fd2Var2 + "\n Found:\n" + PxuCJdSBwIXG2, false);
    }

    @Override // defpackage.v40
    public final void TSizfFm2Yiuu(fy1 fy1Var) {
        fy1Var.getClass();
    }

    @Override // defpackage.v40
    public final void Y1f8riQaR6yg(fy1 fy1Var) {
        fy1Var.getClass();
        ns0 Y1f8riQaR6yg = this.Y1f8riQaR6yg.Y1f8riQaR6yg();
        gm2 gm2Var = Y1f8riQaR6yg.lS5Rgt96tfkO;
        gm2Var.getClass();
        hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("PRAGMA query_only");
        try {
            amuv7NJvPxHu.tmVwIGCQF4zR();
            boolean jyegZNwi31qc = amuv7NJvPxHu.jyegZNwi31qc();
            cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
            if (!jyegZNwi31qc) {
                sj0.S9EYkSpbGuxq(fy1Var, "PRAGMA temp_store = MEMORY");
                sj0.S9EYkSpbGuxq(fy1Var, "PRAGMA recursive_triggers = 1");
                sj0.S9EYkSpbGuxq(fy1Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (gm2Var.Y1f8riQaR6yg) {
                    sj0.S9EYkSpbGuxq(fy1Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    sj0.S9EYkSpbGuxq(fy1Var, pa2.bEKsvqmvPh2y("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                ue1 ue1Var = gm2Var.rtx2ld2ELZv4;
                ReentrantLock reentrantLock = ue1Var.PxuCJdSBwIXG;
                reentrantLock.lock();
                try {
                    ue1Var.Y1f8riQaR6yg = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (Y1f8riQaR6yg.RAsUl2FVSrh6) {
            }
        } finally {
        }
    }

    @Override // defpackage.v40
    public final void a92UlCVFR9N8(fy1 fy1Var) {
        fy1Var.getClass();
        z11 BjEWd04qc7Mw = fx1.BjEWd04qc7Mw();
        hy1 amuv7NJvPxHu = fy1Var.amuv7NJvPxHu("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (amuv7NJvPxHu.tmVwIGCQF4zR()) {
            try {
                BjEWd04qc7Mw.add(amuv7NJvPxHu.dgRBjINgWbAK(0));
            } finally {
            }
        }
        cs0.r3s1LDPKFs1S(amuv7NJvPxHu, null);
        ListIterator listIterator = fx1.ZbWwgt3aGe7A(BjEWd04qc7Mw).listIterator(0);
        while (true) {
            xj0 xj0Var = (xj0) listIterator;
            if (!xj0Var.hasNext()) {
                return;
            }
            String str = (String) xj0Var.next();
            if (pa2.yQRudnv4La6p(str, "room_fts_content_sync_", false)) {
                sj0.S9EYkSpbGuxq(fy1Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // defpackage.v40
    public final void e9gEMXR7LXtO(fy1 fy1Var) {
        fy1Var.getClass();
    }

    @Override // defpackage.v40
    public final void lS5Rgt96tfkO(fy1 fy1Var) {
        fy1Var.getClass();
        sj0.S9EYkSpbGuxq(fy1Var, "DROP TABLE IF EXISTS `items`");
        sj0.S9EYkSpbGuxq(fy1Var, "DROP TABLE IF EXISTS `gate_config`");
    }
}
