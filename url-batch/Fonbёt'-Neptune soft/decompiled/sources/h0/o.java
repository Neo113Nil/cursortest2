package h0;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import i.C0207e;
import i.MenuC0211i;
import i.MenuItemC0212j;
import i.ViewOnKeyListenerC0208f;
import java.io.File;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2344i;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f2340e = i2;
        this.f2344i = obj;
        this.f2341f = obj2;
        this.f2342g = obj3;
        this.f2343h = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2340e) {
            case 0:
                synchronized (p.f2348j) {
                    C0197e c0197e = (C0197e) this.f2341f;
                    if (c0197e != null) {
                        p.a((p) this.f2344i, c0197e);
                    }
                    try {
                        if (AbstractC0193a.b(p.f2349k)) {
                            Log.d("Sqflite", "delete database " + ((String) this.f2342g));
                        }
                        SQLiteDatabase.deleteDatabase(new File((String) this.f2342g));
                    } catch (Exception e2) {
                        Log.e("Sqflite", "error " + e2 + " while closing database " + p.f2353o);
                    }
                }
                ((v0.i) this.f2343h).c(null);
                return;
            default:
                C0207e c0207e = (C0207e) this.f2341f;
                if (c0207e != null) {
                    B.m mVar = (B.m) this.f2344i;
                    ((ViewOnKeyListenerC0208f) mVar.f78f).f2380D = true;
                    c0207e.f2375b.c(false);
                    ((ViewOnKeyListenerC0208f) mVar.f78f).f2380D = false;
                }
                MenuItemC0212j menuItemC0212j = (MenuItemC0212j) this.f2342g;
                if (menuItemC0212j.isEnabled() && menuItemC0212j.hasSubMenu()) {
                    ((MenuC0211i) this.f2343h).p(menuItemC0212j, null, 4);
                    return;
                }
                return;
        }
    }
}
