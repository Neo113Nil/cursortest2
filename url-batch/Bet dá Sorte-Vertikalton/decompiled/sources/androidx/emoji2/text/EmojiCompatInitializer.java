package androidx.emoji2.text;

import C.h;
import T.j;
import T.k;
import T.s;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import i0.C0136a;
import i0.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // i0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i0.b
    public final Object b(Context context) {
        Object obj;
        s sVar = new s(new h(context));
        sVar.f785a = 1;
        if (j.f789k == null) {
            synchronized (j.f788j) {
                try {
                    if (j.f789k == null) {
                        j.f789k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        C0136a c2 = C0136a.c(context);
        c2.getClass();
        synchronized (C0136a.f2495e) {
            try {
                obj = c2.f2496a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        t d = ((r) obj).d();
        d.a(new k(this, d));
        return Boolean.TRUE;
    }
}
