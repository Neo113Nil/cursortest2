package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.data.MaxLineDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aj1 extends xf0 {
    public final /* synthetic */ MaxLineDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj1(MaxLineDatabase_Impl maxLineDatabase_Impl) {
        super(1, "4699d191b743c5a9a6bc9885424cf683", "07ab3c74871fe61a35f8eba6bcb0824d");
        this.d = maxLineDatabase_Impl;
    }

    @Override // defpackage.xf0
    public final void a(nc2 nc2Var) {
        nc2Var.getClass();
        s03.l(nc2Var, "CREATE TABLE IF NOT EXISTS `atlas_entry` (`slug` TEXT NOT NULL, `kind` TEXT NOT NULL, `nameRu` TEXT NOT NULL, `nameEn` TEXT NOT NULL, `formula` TEXT, `colorRu` TEXT NOT NULL, `colorEn` TEXT NOT NULL, `mohsMin` REAL, `mohsMax` REAL, `lustreRu` TEXT NOT NULL, `lustreEn` TEXT NOT NULL, `originRu` TEXT NOT NULL, `originEn` TEXT NOT NULL, `symbolismRu` TEXT NOT NULL, `symbolismEn` TEXT NOT NULL, `careRu` TEXT NOT NULL, `careEn` TEXT NOT NULL, `factsRu` TEXT NOT NULL, `factsEn` TEXT NOT NULL, `birthMonth` INTEGER, `zodiac` TEXT, `sources` TEXT NOT NULL, PRIMARY KEY(`slug`))");
        s03.l(nc2Var, "CREATE TABLE IF NOT EXISTS `atlas_progress` (`slug` TEXT NOT NULL, `studied` INTEGER NOT NULL, `favourite` INTEGER NOT NULL, `owned` INTEGER NOT NULL, PRIMARY KEY(`slug`))");
        s03.l(nc2Var, "CREATE TABLE IF NOT EXISTS `jewelry_item` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `metal` TEXT NOT NULL, `fineness` TEXT, `weightGrams` REAL, `purchaseDateEpochDay` INTEGER, `place` TEXT, `valueEntered` REAL, `notes` TEXT, `photoUri` TEXT, `favourite` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL)");
        s03.l(nc2Var, "CREATE TABLE IF NOT EXISTS `item_stone` (`itemId` INTEGER NOT NULL, `atlasSlug` TEXT NOT NULL, PRIMARY KEY(`itemId`, `atlasSlug`))");
        s03.l(nc2Var, "CREATE INDEX IF NOT EXISTS `index_item_stone_atlasSlug` ON `item_stone` (`atlasSlug`)");
        s03.l(nc2Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        s03.l(nc2Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4699d191b743c5a9a6bc9885424cf683')");
    }

    @Override // defpackage.xf0
    public final void b(nc2 nc2Var) {
        nc2Var.getClass();
        s03.l(nc2Var, "DROP TABLE IF EXISTS `atlas_entry`");
        s03.l(nc2Var, "DROP TABLE IF EXISTS `atlas_progress`");
        s03.l(nc2Var, "DROP TABLE IF EXISTS `jewelry_item`");
        s03.l(nc2Var, "DROP TABLE IF EXISTS `item_stone`");
    }

    @Override // defpackage.xf0
    public final void c(nc2 nc2Var) {
        nc2Var.getClass();
    }

    @Override // defpackage.xf0
    public final void d(nc2 nc2Var) {
        nc2Var.getClass();
        z41 d = this.d.d();
        f03 f03Var = d.b;
        f03Var.getClass();
        uc2 M = nc2Var.M("PRAGMA query_only");
        try {
            M.E();
            boolean z = M.getLong(0) != 0;
            yk3.w(M, null);
            if (!z) {
                s03.l(nc2Var, "PRAGMA temp_store = MEMORY");
                s03.l(nc2Var, "PRAGMA recursive_triggers = 1");
                s03.l(nc2Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (f03Var.d) {
                    s03.l(nc2Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    s03.l(nc2Var, tp2.m("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", BuildConfig.FLAVOR));
                }
                w50 w50Var = f03Var.h;
                ReentrantLock reentrantLock = (ReentrantLock) w50Var.b;
                reentrantLock.lock();
                try {
                    w50Var.a = true;
                    Unit unit = Unit.a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (d.g) {
            }
        } finally {
        }
    }

    @Override // defpackage.xf0
    public final void e(nc2 nc2Var) {
        nc2Var.getClass();
    }

    @Override // defpackage.xf0
    public final void f(nc2 nc2Var) {
        nc2Var.getClass();
        le1 b = pv.b();
        uc2 M = nc2Var.M("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (M.E()) {
            try {
                b.add(M.j(0));
            } finally {
            }
        }
        Unit unit = Unit.a;
        yk3.w(M, null);
        ListIterator listIterator = pv.a(b).listIterator(0);
        while (true) {
            sx0 sx0Var = (sx0) listIterator;
            if (!sx0Var.hasNext()) {
                return;
            }
            String str = (String) sx0Var.next();
            if (tp2.o(str, "room_fts_content_sync_", false)) {
                s03.l(nc2Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // defpackage.xf0
    public final mb2 g(nc2 nc2Var) {
        nc2Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("slug", new js2("slug", "TEXT", true, 1, null, 1));
        linkedHashMap.put("kind", new js2("kind", "TEXT", true, 0, null, 1));
        linkedHashMap.put("nameRu", new js2("nameRu", "TEXT", true, 0, null, 1));
        linkedHashMap.put("nameEn", new js2("nameEn", "TEXT", true, 0, null, 1));
        linkedHashMap.put("formula", new js2("formula", "TEXT", false, 0, null, 1));
        linkedHashMap.put("colorRu", new js2("colorRu", "TEXT", true, 0, null, 1));
        linkedHashMap.put("colorEn", new js2("colorEn", "TEXT", true, 0, null, 1));
        linkedHashMap.put("mohsMin", new js2("mohsMin", "REAL", false, 0, null, 1));
        linkedHashMap.put("mohsMax", new js2("mohsMax", "REAL", false, 0, null, 1));
        linkedHashMap.put("lustreRu", new js2("lustreRu", "TEXT", true, 0, null, 1));
        linkedHashMap.put("lustreEn", new js2("lustreEn", "TEXT", true, 0, null, 1));
        linkedHashMap.put("originRu", new js2("originRu", "TEXT", true, 0, null, 1));
        linkedHashMap.put("originEn", new js2("originEn", "TEXT", true, 0, null, 1));
        linkedHashMap.put("symbolismRu", new js2("symbolismRu", "TEXT", true, 0, null, 1));
        linkedHashMap.put("symbolismEn", new js2("symbolismEn", "TEXT", true, 0, null, 1));
        linkedHashMap.put("careRu", new js2("careRu", "TEXT", true, 0, null, 1));
        linkedHashMap.put("careEn", new js2("careEn", "TEXT", true, 0, null, 1));
        linkedHashMap.put("factsRu", new js2("factsRu", "TEXT", true, 0, null, 1));
        linkedHashMap.put("factsEn", new js2("factsEn", "TEXT", true, 0, null, 1));
        linkedHashMap.put("birthMonth", new js2("birthMonth", "INTEGER", false, 0, null, 1));
        linkedHashMap.put("zodiac", new js2("zodiac", "TEXT", false, 0, null, 1));
        linkedHashMap.put("sources", new js2("sources", "TEXT", true, 0, null, 1));
        ms2 ms2Var = new ms2("atlas_entry", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        ms2 k = ph2.k(nc2Var, "atlas_entry");
        if (!ms2Var.equals(k)) {
            return new mb2(false, "atlas_entry(com.majelw.libystne.data.AtlasEntry).\n Expected:\n" + ms2Var + "\n Found:\n" + k);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("slug", new js2("slug", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("studied", new js2("studied", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("favourite", new js2("favourite", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("owned", new js2("owned", "INTEGER", true, 0, null, 1));
        ms2 ms2Var2 = new ms2("atlas_progress", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        ms2 k2 = ph2.k(nc2Var, "atlas_progress");
        if (!ms2Var2.equals(k2)) {
            return new mb2(false, "atlas_progress(com.majelw.libystne.data.AtlasProgress).\n Expected:\n" + ms2Var2 + "\n Found:\n" + k2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new js2("id", "INTEGER", true, 1, null, 1));
        linkedHashMap3.put("name", new js2("name", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("type", new js2("type", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("metal", new js2("metal", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("fineness", new js2("fineness", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("weightGrams", new js2("weightGrams", "REAL", false, 0, null, 1));
        linkedHashMap3.put("purchaseDateEpochDay", new js2("purchaseDateEpochDay", "INTEGER", false, 0, null, 1));
        linkedHashMap3.put("place", new js2("place", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("valueEntered", new js2("valueEntered", "REAL", false, 0, null, 1));
        linkedHashMap3.put("notes", new js2("notes", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("photoUri", new js2("photoUri", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("favourite", new js2("favourite", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("createdAt", new js2("createdAt", "INTEGER", true, 0, null, 1));
        ms2 ms2Var3 = new ms2("jewelry_item", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        ms2 k3 = ph2.k(nc2Var, "jewelry_item");
        if (!ms2Var3.equals(k3)) {
            return new mb2(false, "jewelry_item(com.majelw.libystne.data.JewelryItem).\n Expected:\n" + ms2Var3 + "\n Found:\n" + k3);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("itemId", new js2("itemId", "INTEGER", true, 1, null, 1));
        linkedHashMap4.put("atlasSlug", new js2("atlasSlug", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new ls2("index_item_stone_atlasSlug", false, pv.c("atlasSlug"), pv.c("ASC")));
        ms2 ms2Var4 = new ms2("item_stone", linkedHashMap4, linkedHashSet, linkedHashSet2);
        ms2 k4 = ph2.k(nc2Var, "item_stone");
        if (ms2Var4.equals(k4)) {
            return new mb2(true, (String) null);
        }
        return new mb2(false, "item_stone(com.majelw.libystne.data.ItemStoneCrossRef).\n Expected:\n" + ms2Var4 + "\n Found:\n" + k4);
    }
}
