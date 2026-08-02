package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ny {
    public final Set a = new CopyOnWriteArraySet();
    public volatile Context b;

    public final void a() {
        this.b = null;
    }

    public final void b(Context context) {
        this.b = context;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nz) it.next()).a();
        }
    }
}
