package androidx.emoji2.text;

import C.g;
import T.j;
import T.k;
import T.s;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import i0.C0137a;
import i0.InterfaceC0138b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0138b {
    @Override // i0.InterfaceC0138b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i0.InterfaceC0138b
    public final Object b(Context context) {
        Object obj;
        s sVar = new s(new g(context));
        sVar.f797a = 1;
        if (j.f801k == null) {
            synchronized (j.f800j) {
                try {
                    if (j.f801k == null) {
                        j.f801k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        C0137a c2 = C0137a.c(context);
        c2.getClass();
        synchronized (C0137a.f2514e) {
            try {
                obj = c2.f2515a.get(ProcessLifecycleInitializer.class);
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
