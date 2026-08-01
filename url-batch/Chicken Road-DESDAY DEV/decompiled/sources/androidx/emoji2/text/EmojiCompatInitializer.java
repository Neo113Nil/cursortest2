package androidx.emoji2.text;

import C.g;
import T.j;
import T.k;
import T.s;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import i0.C0138a;
import i0.InterfaceC0139b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0139b {
    @Override // i0.InterfaceC0139b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i0.InterfaceC0139b
    public final Object b(Context context) {
        Object obj;
        s sVar = new s(new g(context));
        sVar.f770a = 1;
        if (j.f774k == null) {
            synchronized (j.f773j) {
                try {
                    if (j.f774k == null) {
                        j.f774k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        C0138a c2 = C0138a.c(context);
        c2.getClass();
        synchronized (C0138a.f2456e) {
            try {
                obj = c2.f2457a.get(ProcessLifecycleInitializer.class);
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
