package androidx.emoji2.text;

import D.g;
import V.j;
import V.k;
import V.s;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k0.C0150a;
import k0.InterfaceC0151b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0151b {
    @Override // k0.InterfaceC0151b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // k0.InterfaceC0151b
    public final Object b(Context context) {
        Object obj;
        s sVar = new s(new g(context));
        sVar.f893a = 1;
        if (j.f897k == null) {
            synchronized (j.f896j) {
                try {
                    if (j.f897k == null) {
                        j.f897k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        C0150a c2 = C0150a.c(context);
        c2.getClass();
        synchronized (C0150a.f2731e) {
            try {
                obj = c2.f2732a.get(ProcessLifecycleInitializer.class);
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
