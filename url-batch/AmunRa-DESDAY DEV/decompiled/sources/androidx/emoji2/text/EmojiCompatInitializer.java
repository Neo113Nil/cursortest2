package androidx.emoji2.text;

import C.g;
import T.j;
import T.k;
import T.s;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import i0.C0136a;
import i0.InterfaceC0137b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0137b {
    @Override // i0.InterfaceC0137b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i0.InterfaceC0137b
    public final Object b(Context context) {
        Object obj;
        s sVar = new s(new g(context));
        sVar.f760a = 1;
        if (j.f764k == null) {
            synchronized (j.f763j) {
                try {
                    if (j.f764k == null) {
                        j.f764k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        C0136a c2 = C0136a.c(context);
        c2.getClass();
        synchronized (C0136a.f2463e) {
            try {
                obj = c2.f2464a.get(ProcessLifecycleInitializer.class);
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
