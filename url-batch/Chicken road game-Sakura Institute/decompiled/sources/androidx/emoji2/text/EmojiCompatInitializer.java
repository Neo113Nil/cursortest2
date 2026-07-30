package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import b4.a;
import b4.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import l3.k;
import l3.l;
import l3.n;
import l3.t;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // b4.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // b4.b
    public final Object b(Context context) {
        Object obj;
        t tVar = new t(new n(context, 0));
        tVar.f5900a = 1;
        if (k.f5907k == null) {
            synchronized (k.f5906j) {
                try {
                    if (k.f5907k == null) {
                        k.f5907k = new k(tVar);
                    }
                } finally {
                }
            }
        }
        a c4 = a.c(context);
        c4.getClass();
        synchronized (a.f1384e) {
            try {
                obj = c4.f1385a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c4.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        x f9 = ((v) obj).f();
        f9.a(new l(this, f9));
        return Boolean.TRUE;
    }
}
