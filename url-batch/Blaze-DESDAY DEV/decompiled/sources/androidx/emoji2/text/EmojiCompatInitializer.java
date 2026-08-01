package androidx.emoji2.text;

import C.g;
import U.j;
import U.k;
import U.s;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import j0.C0147a;
import j0.InterfaceC0148b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0148b {
    @Override // j0.InterfaceC0148b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // j0.InterfaceC0148b
    public final Object b(Context context) {
        Object obj;
        s sVar = new s(new g(context));
        sVar.f852a = 1;
        if (j.f856k == null) {
            synchronized (j.f855j) {
                try {
                    if (j.f856k == null) {
                        j.f856k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        C0147a c2 = C0147a.c(context);
        c2.getClass();
        synchronized (C0147a.f2632e) {
            try {
                obj = c2.f2633a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        t e2 = ((r) obj).e();
        e2.a(new k(this, e2));
        return Boolean.TRUE;
    }
}
