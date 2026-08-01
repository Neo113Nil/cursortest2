package androidx.emoji2.text;

import C.g;
import U.j;
import U.k;
import U.s;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import j0.C0145a;
import j0.InterfaceC0146b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0146b {
    @Override // j0.InterfaceC0146b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // j0.InterfaceC0146b
    public final Object b(Context context) {
        Object obj;
        s sVar = new s(new g(context));
        sVar.f843a = 1;
        if (j.f847k == null) {
            synchronized (j.f846j) {
                try {
                    if (j.f847k == null) {
                        j.f847k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        C0145a c2 = C0145a.c(context);
        c2.getClass();
        synchronized (C0145a.f2594e) {
            try {
                obj = c2.f2595a.get(ProcessLifecycleInitializer.class);
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
