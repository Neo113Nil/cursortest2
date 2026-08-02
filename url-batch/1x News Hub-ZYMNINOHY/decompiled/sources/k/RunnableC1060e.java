package k;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import x1.AbstractC1240a;
import x1.C1244e;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1060e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9567e;

    public /* synthetic */ RunnableC1060e(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f9563a = i3;
        this.f9567e = obj;
        this.f9564b = obj2;
        this.f9565c = obj3;
        this.f9566d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9563a) {
            case 0:
                C1061f c1061f = (C1061f) this.f9564b;
                if (c1061f != null) {
                    b0.s sVar = (b0.s) this.f9567e;
                    ((ViewOnKeyListenerC1062g) sVar.f2544a).z = true;
                    c1061f.f9569b.c(false);
                    ((ViewOnKeyListenerC1062g) sVar.f2544a).z = false;
                }
                MenuItemC1066k menuItemC1066k = (MenuItemC1066k) this.f9565c;
                if (menuItemC1066k.isEnabled() && menuItemC1066k.hasSubMenu()) {
                    ((MenuC1065j) this.f9566d).p(menuItemC1066k, null, 4);
                    return;
                }
                return;
            default:
                synchronized (x1.l.f) {
                    C1244e c1244e = (C1244e) this.f9564b;
                    if (c1244e != null) {
                        x1.l.a((x1.l) this.f9567e, c1244e);
                    }
                    try {
                        if (AbstractC1240a.a(x1.l.f10760g)) {
                            Log.d("Sqflite", "delete database " + ((String) this.f9565c));
                        }
                        SQLiteDatabase.deleteDatabase(new File((String) this.f9565c));
                    } catch (Exception e3) {
                        Log.e("Sqflite", "error " + e3 + " while closing database " + x1.l.f10764k);
                    }
                }
                ((O1.j) this.f9566d).success(null);
                return;
        }
    }
}
