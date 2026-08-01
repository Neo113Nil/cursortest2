package com.trembin.nirefon.betfury.data;

import defpackage.ad0;
import defpackage.ay;
import defpackage.b90;
import defpackage.bd0;
import defpackage.bi;
import defpackage.cb0;
import defpackage.ch0;
import defpackage.dh0;
import defpackage.dy;
import defpackage.eb0;
import defpackage.eh0;
import defpackage.fh0;
import defpackage.gk0;
import defpackage.h2;
import defpackage.mv;
import defpackage.oa0;
import defpackage.ow;
import defpackage.pa0;
import defpackage.pp;
import defpackage.sz;
import defpackage.uf0;
import defpackage.uv;
import defpackage.wg0;
import defpackage.ww;
import defpackage.xm;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class NoteDatabase_Impl extends NoteDatabase {
    private final ww _noteDao = new wg0(new h2(4, this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final NoteDao_Impl _noteDao$lambda$0(NoteDatabase_Impl noteDatabase_Impl) {
        return new NoteDao_Impl(noteDatabase_Impl);
    }

    @Override // defpackage.ma0
    public void clearAllTables() {
        performClear(false, "notes");
    }

    @Override // defpackage.ma0
    public List<Object> createAutoMigrations(Map<ow, Object> map) {
        map.getClass();
        return new ArrayList();
    }

    @Override // defpackage.ma0
    public uv createInvalidationTracker() {
        return new uv(this, new LinkedHashMap(), new LinkedHashMap(), "notes");
    }

    @Override // defpackage.ma0
    public pa0 createOpenDelegate() {
        return new pa0() { // from class: com.trembin.nirefon.betfury.data.NoteDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super("ebfe4690bc64fe48fe91f164195c5456", 1, "57b69d04d05ca6424cf35e8ecf85b552");
            }

            @Override // defpackage.pa0
            public void createAllTables(cb0 cb0Var) {
                cb0Var.getClass();
                gk0.p(cb0Var, "CREATE TABLE IF NOT EXISTS `notes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `priority` TEXT NOT NULL, `isPinned` INTEGER NOT NULL, `reminderTime` INTEGER, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL)");
                gk0.p(cb0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                gk0.p(cb0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ebfe4690bc64fe48fe91f164195c5456')");
            }

            @Override // defpackage.pa0
            public void dropAllTables(cb0 cb0Var) {
                cb0Var.getClass();
                gk0.p(cb0Var, "DROP TABLE IF EXISTS `notes`");
            }

            @Override // defpackage.pa0
            public void onCreate(cb0 cb0Var) {
                cb0Var.getClass();
            }

            @Override // defpackage.pa0
            public void onOpen(cb0 cb0Var) {
                cb0Var.getClass();
                NoteDatabase_Impl.this.internalInitInvalidationTracker(cb0Var);
            }

            @Override // defpackage.pa0
            public void onPostMigrate(cb0 cb0Var) {
                cb0Var.getClass();
            }

            @Override // defpackage.pa0
            public void onPreMigrate(cb0 cb0Var) {
                cb0Var.getClass();
                dy u = bi.u();
                eb0 N = cb0Var.N("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (N.G()) {
                    try {
                        u.add(N.h(0));
                    } finally {
                    }
                }
                mv.h(N, null);
                ListIterator listIterator = bi.i(u).listIterator(0);
                while (true) {
                    ay ayVar = (ay) listIterator;
                    if (!ayVar.hasNext()) {
                        return;
                    }
                    String str = (String) ayVar.next();
                    if (uf0.r(str, "room_fts_content_sync_", false)) {
                        gk0.p(cb0Var, "DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
            }

            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0266  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0283  */
            @Override // defpackage.pa0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public oa0 onValidateSchema(cb0 cb0Var) {
                long j;
                Map b;
                ad0 ad0Var;
                fh0 fh0Var;
                cb0Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new ch0("id", "INTEGER", true, 1, null, 1));
                linkedHashMap.put("title", new ch0("title", "TEXT", true, 0, null, 1));
                linkedHashMap.put("content", new ch0("content", "TEXT", true, 0, null, 1));
                linkedHashMap.put("priority", new ch0("priority", "TEXT", true, 0, null, 1));
                linkedHashMap.put("isPinned", new ch0("isPinned", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("reminderTime", new ch0("reminderTime", "INTEGER", false, 0, null, 1));
                linkedHashMap.put("createdAt", new ch0("createdAt", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("updatedAt", new ch0("updatedAt", "INTEGER", true, 0, null, 1));
                fh0 fh0Var2 = new fh0(linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                eb0 N = cb0Var.N("PRAGMA table_info(`notes`)");
                try {
                    long j2 = 0;
                    if (N.G()) {
                        int t = bi.t(N, "name");
                        int t2 = bi.t(N, "type");
                        int t3 = bi.t(N, "notnull");
                        int t4 = bi.t(N, "pk");
                        int t5 = bi.t(N, "dflt_value");
                        sz szVar = new sz();
                        while (true) {
                            String h = N.h(t);
                            j = j2;
                            szVar.put(h, new ch0(h, N.h(t2), N.getLong(t3) != j2, (int) N.getLong(t4), N.isNull(t5) ? null : N.h(t5), 2));
                            if (!N.G()) {
                                break;
                            }
                            j2 = j;
                        }
                        b = szVar.b();
                        mv.h(N, null);
                    } else {
                        b = xm.f;
                        mv.h(N, null);
                        j = 0;
                    }
                    N = cb0Var.N("PRAGMA foreign_key_list(`notes`)");
                    try {
                        int t6 = bi.t(N, "id");
                        int t7 = bi.t(N, "seq");
                        int t8 = bi.t(N, "table");
                        int t9 = bi.t(N, "on_delete");
                        int t10 = bi.t(N, "on_update");
                        List F = gk0.F(N);
                        N.reset();
                        ad0 ad0Var2 = new ad0();
                        while (N.G()) {
                            if (N.getLong(t7) == j) {
                                int i = (int) N.getLong(t6);
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj : F) {
                                    int i2 = t6;
                                    int i3 = t7;
                                    if (((pp) obj).f == i) {
                                        arrayList3.add(obj);
                                    }
                                    t6 = i2;
                                    t7 = i3;
                                }
                                int i4 = t6;
                                int i5 = t7;
                                int i6 = 0;
                                for (int size = arrayList3.size(); i6 < size; size = size) {
                                    Object obj2 = arrayList3.get(i6);
                                    i6++;
                                    pp ppVar = (pp) obj2;
                                    arrayList.add(ppVar.h);
                                    arrayList2.add(ppVar.i);
                                }
                                ad0Var2.add(new dh0(N.h(t8), N.h(t9), N.h(t10), arrayList, arrayList2));
                                t6 = i4;
                                t7 = i5;
                            }
                        }
                        ad0 a = bd0.a(ad0Var2);
                        mv.h(N, null);
                        N = cb0Var.N("PRAGMA index_list(`notes`)");
                        try {
                            int t11 = bi.t(N, "name");
                            int t12 = bi.t(N, "origin");
                            int t13 = bi.t(N, "unique");
                            if (t11 != -1 && t12 != -1 && t13 != -1) {
                                ad0 ad0Var3 = new ad0();
                                while (N.G()) {
                                    if ("c".equals(N.h(t12))) {
                                        eh0 G = gk0.G(cb0Var, N.h(t11), N.getLong(t13) == 1);
                                        if (G == null) {
                                            mv.h(N, null);
                                        } else {
                                            ad0Var3.add(G);
                                        }
                                    }
                                }
                                ad0 a2 = bd0.a(ad0Var3);
                                mv.h(N, null);
                                ad0Var = a2;
                                fh0Var = new fh0(b, a, ad0Var);
                                if (!fh0Var2.equals(fh0Var)) {
                                    return new oa0(null, true);
                                }
                                return new oa0("notes(com.trembin.nirefon.betfury.data.Note).\n Expected:\n" + fh0Var2 + "\n Found:\n" + fh0Var, false);
                            }
                            mv.h(N, null);
                            ad0Var = null;
                            fh0Var = new fh0(b, a, ad0Var);
                            if (!fh0Var2.equals(fh0Var)) {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        };
    }

    @Override // defpackage.ma0
    public Set<ow> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // defpackage.ma0
    public Map<ow, List<ow>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(b90.a(NoteDao.class), NoteDao_Impl.Companion.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // com.trembin.nirefon.betfury.data.NoteDatabase
    public NoteDao noteDao() {
        return (NoteDao) this._noteDao.getValue();
    }
}
