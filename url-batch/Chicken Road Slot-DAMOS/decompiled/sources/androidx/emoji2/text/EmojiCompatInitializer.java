package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import c4.k;
import c4.l;
import c4.o;
import c4.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import n5.a;
import n5.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // n5.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // n5.b
    public final Object b(Context context) {
        Object obj;
        t tVar = new t(new o(context, 0));
        tVar.f1753a = 1;
        if (k.f1756k == null) {
            synchronized (k.j) {
                try {
                    if (k.f1756k == null) {
                        k.f1756k = new k(tVar);
                    }
                } finally {
                }
            }
        }
        a c10 = a.c(context);
        c10.getClass();
        synchronized (a.f7143e) {
            try {
                obj = c10.f7144a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        w g = ((u) obj).g();
        g.a(new l(this, g));
        return Boolean.TRUE;
    }
}
