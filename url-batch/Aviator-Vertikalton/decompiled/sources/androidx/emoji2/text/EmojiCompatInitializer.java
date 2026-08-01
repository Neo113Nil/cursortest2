package androidx.emoji2.text;

import B0.d;
import T.j;
import T.k;
import T.t;
import android.content.Context;
import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.InterfaceC0086t;
import androidx.lifecycle.ProcessLifecycleInitializer;
import h0.C0164a;
import h0.InterfaceC0165b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0165b {
    @Override // h0.InterfaceC0165b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // h0.InterfaceC0165b
    public final Object b(Context context) {
        Object obj;
        t tVar = new t(new d(context));
        tVar.f784a = 1;
        if (j.f788k == null) {
            synchronized (j.f787j) {
                try {
                    if (j.f788k == null) {
                        j.f788k = new j(tVar);
                    }
                } finally {
                }
            }
        }
        C0164a c2 = C0164a.c(context);
        c2.getClass();
        synchronized (C0164a.f2619e) {
            try {
                obj = c2.f2620a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0082o lifecycle = ((InterfaceC0086t) obj).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }
}
