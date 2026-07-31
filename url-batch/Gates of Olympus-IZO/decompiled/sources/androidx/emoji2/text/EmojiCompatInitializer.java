package androidx.emoji2.text;

import A2.g;
import android.content.Context;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.InterfaceC0236v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import j1.C0518i;
import j1.C0519j;
import j1.r;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import y1.C1063a;
import y1.InterfaceC1064b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1064b {
    @Override // y1.InterfaceC1064b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // y1.InterfaceC1064b
    public final Object b(Context context) {
        Object obj;
        r rVar = new r(new g(context));
        rVar.f5284b = 1;
        if (C0518i.f5255k == null) {
            synchronized (C0518i.f5254j) {
                try {
                    if (C0518i.f5255k == null) {
                        C0518i.f5255k = new C0518i(rVar);
                    }
                } finally {
                }
            }
        }
        C1063a c3 = C1063a.c(context);
        c3.getClass();
        synchronized (C1063a.f8827e) {
            try {
                obj = c3.f8828a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c3.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0238x e3 = ((InterfaceC0236v) obj).e();
        e3.a(new C0519j(this, e3));
        return Boolean.TRUE;
    }
}
