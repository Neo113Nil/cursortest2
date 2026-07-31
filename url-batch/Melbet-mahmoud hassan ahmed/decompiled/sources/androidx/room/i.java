package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import w.c;

/* loaded from: classes.dex */
public class i extends c.a {

    /* renamed from: b, reason: collision with root package name */
    private androidx.room.a f1334b;

    /* renamed from: c, reason: collision with root package name */
    private final a f1335c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1336d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1337e;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1338a;

        public a(int i7) {
            this.f1338a = i7;
        }

        protected abstract void a(w.b bVar);

        protected abstract void b(w.b bVar);

        protected abstract void c(w.b bVar);

        protected abstract void d(w.b bVar);

        protected abstract void e(w.b bVar);

        protected abstract void f(w.b bVar);

        protected abstract b g(w.b bVar);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1339a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1340b;

        public b(boolean z6, String str) {
            this.f1339a = z6;
            this.f1340b = str;
        }
    }

    public i(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f1338a);
        this.f1334b = aVar;
        this.f1335c = aVar2;
        this.f1336d = str;
        this.f1337e = str2;
    }

    private void h(w.b bVar) {
        if (!k(bVar)) {
            b g7 = this.f1335c.g(bVar);
            if (g7.f1339a) {
                this.f1335c.e(bVar);
                l(bVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g7.f1340b);
            }
        }
        Cursor t6 = bVar.t(new w.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = t6.moveToFirst() ? t6.getString(0) : null;
            t6.close();
            if (!this.f1336d.equals(string) && !this.f1337e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            t6.close();
            throw th;
        }
    }

    private void i(w.b bVar) {
        bVar.k("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(w.b bVar) {
        Cursor L = bVar.L("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z6 = false;
            if (L.moveToFirst()) {
                if (L.getInt(0) == 0) {
                    z6 = true;
                }
            }
            return z6;
        } finally {
            L.close();
        }
    }

    private static boolean k(w.b bVar) {
        Cursor L = bVar.L("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z6 = false;
            if (L.moveToFirst()) {
                if (L.getInt(0) != 0) {
                    z6 = true;
                }
            }
            return z6;
        } finally {
            L.close();
        }
    }

    private void l(w.b bVar) {
        i(bVar);
        bVar.k(t.b.a(this.f1336d));
    }

    @Override // w.c.a
    public void b(w.b bVar) {
        super.b(bVar);
    }

    @Override // w.c.a
    public void d(w.b bVar) {
        boolean j7 = j(bVar);
        this.f1335c.a(bVar);
        if (!j7) {
            b g7 = this.f1335c.g(bVar);
            if (!g7.f1339a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g7.f1340b);
            }
        }
        l(bVar);
        this.f1335c.c(bVar);
    }

    @Override // w.c.a
    public void e(w.b bVar, int i7, int i8) {
        g(bVar, i7, i8);
    }

    @Override // w.c.a
    public void f(w.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f1335c.d(bVar);
        this.f1334b = null;
    }

    @Override // w.c.a
    public void g(w.b bVar, int i7, int i8) {
        boolean z6;
        List<u.a> c7;
        androidx.room.a aVar = this.f1334b;
        if (aVar == null || (c7 = aVar.f1240d.c(i7, i8)) == null) {
            z6 = false;
        } else {
            this.f1335c.f(bVar);
            Iterator<u.a> it = c7.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
            b g7 = this.f1335c.g(bVar);
            if (!g7.f1339a) {
                throw new IllegalStateException("Migration didn't properly handle: " + g7.f1340b);
            }
            this.f1335c.e(bVar);
            l(bVar);
            z6 = true;
        }
        if (z6) {
            return;
        }
        androidx.room.a aVar2 = this.f1334b;
        if (aVar2 != null && !aVar2.a(i7, i8)) {
            this.f1335c.b(bVar);
            this.f1335c.a(bVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i7 + " to " + i8 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
