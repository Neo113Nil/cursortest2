package x;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import w.c;

/* loaded from: classes.dex */
class b implements w.c {

    /* renamed from: f, reason: collision with root package name */
    private final Context f23045f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23046g;

    /* renamed from: h, reason: collision with root package name */
    private final c.a f23047h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f23048i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f23049j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private a f23050k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23051l;

    static class a extends SQLiteOpenHelper {

        /* renamed from: f, reason: collision with root package name */
        final x.a[] f23052f;

        /* renamed from: g, reason: collision with root package name */
        final c.a f23053g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f23054h;

        /* renamed from: x.b$a$a, reason: collision with other inner class name */
        class C0151a implements DatabaseErrorHandler {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f23055a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x.a[] f23056b;

            C0151a(c.a aVar, x.a[] aVarArr) {
                this.f23055a = aVar;
                this.f23056b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f23055a.c(a.f(this.f23056b, sQLiteDatabase));
            }
        }

        a(Context context, String str, x.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f22841a, new C0151a(aVar, aVarArr));
            this.f23053g = aVar;
            this.f23052f = aVarArr;
        }

        static x.a f(x.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            x.a aVar = aVarArr[0];
            if (aVar == null || !aVar.b(sQLiteDatabase)) {
                aVarArr[0] = new x.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        x.a b(SQLiteDatabase sQLiteDatabase) {
            return f(this.f23052f, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f23052f[0] = null;
        }

        synchronized w.b h() {
            this.f23054h = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f23054h) {
                return b(writableDatabase);
            }
            close();
            return h();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f23053g.b(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f23053g.d(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            this.f23054h = true;
            this.f23053g.e(b(sQLiteDatabase), i7, i8);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f23054h) {
                return;
            }
            this.f23053g.f(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            this.f23054h = true;
            this.f23053g.g(b(sQLiteDatabase), i7, i8);
        }
    }

    b(Context context, String str, c.a aVar, boolean z6) {
        this.f23045f = context;
        this.f23046g = str;
        this.f23047h = aVar;
        this.f23048i = z6;
    }

    private a b() {
        a aVar;
        synchronized (this.f23049j) {
            if (this.f23050k == null) {
                x.a[] aVarArr = new x.a[1];
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 23 || this.f23046g == null || !this.f23048i) {
                    this.f23050k = new a(this.f23045f, this.f23046g, aVarArr, this.f23047h);
                } else {
                    this.f23050k = new a(this.f23045f, new File(this.f23045f.getNoBackupFilesDir(), this.f23046g).getAbsolutePath(), aVarArr, this.f23047h);
                }
                if (i7 >= 16) {
                    this.f23050k.setWriteAheadLoggingEnabled(this.f23051l);
                }
            }
            aVar = this.f23050k;
        }
        return aVar;
    }

    @Override // w.c
    public w.b I() {
        return b().h();
    }

    @Override // w.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b().close();
    }

    @Override // w.c
    public String getDatabaseName() {
        return this.f23046g;
    }

    @Override // w.c
    public void setWriteAheadLoggingEnabled(boolean z6) {
        synchronized (this.f23049j) {
            a aVar = this.f23050k;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z6);
            }
            this.f23051l = z6;
        }
    }
}
