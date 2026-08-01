package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements i1.b {
    @Override // i1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i1.b
    public final Object b(Context context) {
        Object obj;
        v vVar = new v(new a0.a(context));
        vVar.f448a = 1;
        if (l.f454k == null) {
            synchronized (l.f453j) {
                try {
                    if (l.f454k == null) {
                        l.f454k = new l(vVar);
                    }
                } finally {
                }
            }
        }
        i1.a c5 = i1.a.c(context);
        c5.getClass();
        synchronized (i1.a.f1997e) {
            try {
                obj = c5.f1998a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c5.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final androidx.lifecycle.t f5 = ((androidx.lifecycle.r) obj).f();
        f5.a(new androidx.lifecycle.d(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public final void b() {
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(), 500L);
                f5.f(this);
            }
        });
        return Boolean.TRUE;
    }
}
