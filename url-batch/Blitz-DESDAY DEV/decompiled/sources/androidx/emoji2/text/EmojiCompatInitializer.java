package androidx.emoji2.text;

import E.g;
import V.j;
import V.k;
import V.r;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k0.C0171a;
import k0.b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // k0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // k0.b
    public final Object b(Context context) {
        Object obj;
        r rVar = new r(new g(context));
        rVar.f883a = 1;
        if (j.f887k == null) {
            synchronized (j.f886j) {
                try {
                    if (j.f887k == null) {
                        j.f887k = new j(rVar);
                    }
                } finally {
                }
            }
        }
        C0171a c2 = C0171a.c(context);
        c2.getClass();
        synchronized (C0171a.f2834e) {
            try {
                obj = c2.f2835a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        t f2 = ((androidx.lifecycle.r) obj).f();
        f2.a(new k(this, f2));
        return Boolean.TRUE;
    }
}
