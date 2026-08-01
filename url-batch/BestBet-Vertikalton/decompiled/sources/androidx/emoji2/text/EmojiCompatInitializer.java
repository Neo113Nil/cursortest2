package androidx.emoji2.text;

import A0.c;
import U.j;
import U.k;
import U.t;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.v;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import n0.C0292a;
import n0.b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // n0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // n0.b
    public final Object b(Context context) {
        Object obj;
        t tVar = new t(new c(context));
        tVar.f1085a = 1;
        if (j.f1089k == null) {
            synchronized (j.f1088j) {
                try {
                    if (j.f1089k == null) {
                        j.f1089k = new j(tVar);
                    }
                } finally {
                }
            }
        }
        C0292a c2 = C0292a.c(context);
        c2.getClass();
        synchronized (C0292a.f3554e) {
            try {
                obj = c2.f3555a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        v e2 = ((androidx.lifecycle.t) obj).e();
        e2.a(new k(this, e2));
        return Boolean.TRUE;
    }
}
