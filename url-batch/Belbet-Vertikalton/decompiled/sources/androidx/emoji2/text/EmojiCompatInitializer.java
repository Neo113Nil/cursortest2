package androidx.emoji2.text;

import C1.d;
import V.j;
import V.k;
import V.t;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.v;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import n0.C0314a;
import n0.InterfaceC0315b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0315b {
    @Override // n0.InterfaceC0315b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // n0.InterfaceC0315b
    public final Object b(Context context) {
        Object obj;
        t tVar = new t(new d(context));
        tVar.f1271a = 1;
        if (j.f1274k == null) {
            synchronized (j.j) {
                try {
                    if (j.f1274k == null) {
                        j.f1274k = new j(tVar);
                    }
                } finally {
                }
            }
        }
        C0314a c2 = C0314a.c(context);
        c2.getClass();
        synchronized (C0314a.e) {
            try {
                obj = c2.f3752a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        v e = ((androidx.lifecycle.t) obj).e();
        e.a(new k(this, e));
        return Boolean.TRUE;
    }
}
