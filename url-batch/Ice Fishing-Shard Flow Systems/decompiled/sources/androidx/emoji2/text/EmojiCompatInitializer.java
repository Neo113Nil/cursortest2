package androidx.emoji2.text;

import N1.i;
import U.j;
import U.k;
import U.q;
import android.content.Context;
import androidx.lifecycle.AbstractC0250p;
import androidx.lifecycle.InterfaceC0256w;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import o0.C0796a;
import o0.InterfaceC0797b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0797b {
    @Override // o0.InterfaceC0797b
    public final Object create(Context context) {
        Object obj;
        q qVar = new q(new i(context, 1));
        qVar.f2698b = 1;
        if (j.j == null) {
            synchronized (j.f2666i) {
                try {
                    if (j.j == null) {
                        j.j = new j(qVar);
                    }
                } finally {
                }
            }
        }
        C0796a c7 = C0796a.c(context);
        c7.getClass();
        synchronized (C0796a.f7112e) {
            try {
                obj = c7.f7113a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c7.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0250p lifecycle = ((InterfaceC0256w) obj).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // o0.InterfaceC0797b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
