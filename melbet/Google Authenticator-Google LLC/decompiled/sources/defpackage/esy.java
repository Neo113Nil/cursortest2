package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.ContentObserver;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esy {
    public static esy a;
    public final Context b;
    public boolean c;
    public final Object d;

    public esy(Context context) {
        this.c = false;
        this.b = context;
        this.d = new esx();
    }

    static synchronized void a() {
        Context context;
        synchronized (esy.class) {
            esy esyVar = a;
            if (esyVar != null && (context = esyVar.b) != null && esyVar.d != null && esyVar.c) {
                context.getContentResolver().unregisterContentObserver((ContentObserver) a.d);
            }
            a = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void b() {
        if (this.c) {
            return;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((cp) this.b).L().a((aeq) it.next());
        }
        this.c = true;
    }

    public esy() {
        this.c = false;
        this.b = null;
        this.d = null;
    }

    public esy(Activity activity, Set set) {
        this.c = false;
        this.b = (bg) activity;
        this.d = set;
    }
}
