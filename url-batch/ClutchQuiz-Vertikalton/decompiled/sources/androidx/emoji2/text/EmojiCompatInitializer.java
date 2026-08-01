package androidx.emoji2.text;

import A0.h;
import T.k;
import T.l;
import T.u;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import l0.C0253a;
import l0.InterfaceC0254b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0254b {
    @Override // l0.InterfaceC0254b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // l0.InterfaceC0254b
    public final Object b(Context context) {
        Object obj;
        u uVar = new u(new h(context));
        uVar.f812a = 1;
        if (k.f816k == null) {
            synchronized (k.f815j) {
                try {
                    if (k.f816k == null) {
                        k.f816k = new k(uVar);
                    }
                } finally {
                }
            }
        }
        C0253a c2 = C0253a.c(context);
        c2.getClass();
        synchronized (C0253a.f3089e) {
            try {
                obj = c2.f3090a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        v d = ((t) obj).d();
        d.a(new l(this, d));
        return Boolean.TRUE;
    }
}
