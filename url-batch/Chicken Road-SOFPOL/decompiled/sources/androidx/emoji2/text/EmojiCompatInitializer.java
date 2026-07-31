package androidx.emoji2.text;

import a5.a;
import a5.b;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.u;
import d4.l;
import d4.m;
import d4.p;
import d4.w;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // a5.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // a5.b
    public final Object b(Context context) {
        Object obj;
        w wVar = new w(new p(context, 0));
        wVar.f2301b = 1;
        if (l.f2267k == null) {
            synchronized (l.f2266j) {
                try {
                    if (l.f2267k == null) {
                        l.f2267k = new l(wVar);
                    }
                } finally {
                }
            }
        }
        a c8 = a.c(context);
        c8.getClass();
        synchronized (a.f233e) {
            try {
                obj = c8.f234a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c8.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        androidx.lifecycle.w g3 = ((u) obj).g();
        g3.a(new m(this, g3));
        return Boolean.TRUE;
    }
}
