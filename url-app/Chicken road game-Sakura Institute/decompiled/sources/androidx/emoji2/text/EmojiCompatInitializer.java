package androidx.emoji2.text;

import M1.b;
import android.content.Context;
import androidx.lifecycle.C0483x;
import androidx.lifecycle.InterfaceC0481v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k1.h;
import k1.i;
import k1.o;
import w1.C1290a;
import w1.InterfaceC1291b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1291b {
    @Override // w1.InterfaceC1291b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // w1.InterfaceC1291b
    public final Object b(Context context) {
        Object obj;
        o oVar = new o(new b(context, 1));
        oVar.f6873a = 1;
        if (h.f7380k == null) {
            synchronized (h.f7379j) {
                try {
                    if (h.f7380k == null) {
                        h.f7380k = new h(oVar);
                    }
                } finally {
                }
            }
        }
        C1290a c4 = C1290a.c(context);
        c4.getClass();
        synchronized (C1290a.f11379e) {
            try {
                obj = c4.f11380a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c4.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0483x e4 = ((InterfaceC0481v) obj).e();
        e4.a(new i(this, e4));
        return Boolean.TRUE;
    }
}
