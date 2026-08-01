package androidx.emoji2.text;

import B0.d;
import T.j;
import T.k;
import T.r;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.t;
import i0.C0135a;
import i0.InterfaceC0136b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0136b {
    @Override // i0.InterfaceC0136b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i0.InterfaceC0136b
    public final Object b(Context context) {
        Object obj;
        r rVar = new r(new d(context));
        rVar.f713a = 1;
        if (j.f717k == null) {
            synchronized (j.f716j) {
                try {
                    if (j.f717k == null) {
                        j.f717k = new j(rVar);
                    }
                } finally {
                }
            }
        }
        C0135a c2 = C0135a.c(context);
        c2.getClass();
        synchronized (C0135a.f2376e) {
            try {
                obj = c2.f2377a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        t d = ((androidx.lifecycle.r) obj).d();
        d.a(new k(this, d));
        return Boolean.TRUE;
    }
}
