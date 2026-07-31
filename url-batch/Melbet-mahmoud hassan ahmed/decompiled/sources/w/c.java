package w;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public interface c extends Closeable {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f22841a;

        public a(int i7) {
            this.f22841a = i7;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e7) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e7);
                    }
                }
            } catch (Exception e8) {
                Log.w("SupportSQLite", "delete failed: ", e8);
            }
        }

        public void b(w.b bVar) {
        }

        public void c(w.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.r());
            if (!bVar.isOpen()) {
                a(bVar.r());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = bVar.j();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    Iterator<Pair<String, String>> it = list.iterator();
                    while (it.hasNext()) {
                        a((String) it.next().second);
                    }
                } else {
                    a(bVar.r());
                }
            }
        }

        public abstract void d(w.b bVar);

        public abstract void e(w.b bVar, int i7, int i8);

        public void f(w.b bVar) {
        }

        public abstract void g(w.b bVar, int i7, int i8);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f22842a;

        /* renamed from: b, reason: collision with root package name */
        public final String f22843b;

        /* renamed from: c, reason: collision with root package name */
        public final a f22844c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f22845d;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            Context f22846a;

            /* renamed from: b, reason: collision with root package name */
            String f22847b;

            /* renamed from: c, reason: collision with root package name */
            a f22848c;

            /* renamed from: d, reason: collision with root package name */
            boolean f22849d;

            a(Context context) {
                this.f22846a = context;
            }

            public b a() {
                if (this.f22848c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f22846a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f22849d && TextUtils.isEmpty(this.f22847b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f22846a, this.f22847b, this.f22848c, this.f22849d);
            }

            public a b(a aVar) {
                this.f22848c = aVar;
                return this;
            }

            public a c(String str) {
                this.f22847b = str;
                return this;
            }

            public a d(boolean z6) {
                this.f22849d = z6;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z6) {
            this.f22842a = context;
            this.f22843b = str;
            this.f22844c = aVar;
            this.f22845d = z6;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: w.c$c, reason: collision with other inner class name */
    public interface InterfaceC0147c {
        c a(b bVar);
    }

    w.b I();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z6);
}
