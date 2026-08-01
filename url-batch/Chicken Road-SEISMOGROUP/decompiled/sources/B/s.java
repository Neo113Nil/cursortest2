package B;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f73b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f74c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M.j f75d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f76e;

    public s(t tVar, g gVar, String str, M.j jVar) {
        this.f76e = tVar;
        this.f73b = gVar;
        this.f74c = str;
        this.f75d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (t.f80g) {
            g gVar = this.f73b;
            if (gVar != null) {
                t.c(this.f76e, gVar);
            }
            try {
                if (a.b(t.f81h)) {
                    Log.d("Sqflite", "delete database " + this.f74c);
                }
                SQLiteDatabase.deleteDatabase(new File(this.f74c));
            } catch (Exception e2) {
                Log.e("Sqflite", "error " + e2 + " while closing database " + t.f85l);
            }
        }
        this.f75d.c(null);
    }
}
