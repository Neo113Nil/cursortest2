package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements d1.b {
    @Override // d1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // d1.b
    public final Object b(Context context) {
        Object obj;
        u uVar = new u(new a2.e(context));
        uVar.f336a = 1;
        if (l.f340k == null) {
            synchronized (l.f339j) {
                try {
                    if (l.f340k == null) {
                        l.f340k = new l(uVar);
                    }
                } finally {
                }
            }
        }
        d1.a c = d1.a.c(context);
        c.getClass();
        synchronized (d1.a.f1467e) {
            try {
                obj = c.f1468a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final androidx.lifecycle.t f4 = ((androidx.lifecycle.r) obj).f();
        f4.a(new androidx.lifecycle.d(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public final void b() {
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(), 500L);
                f4.f(this);
            }
        });
        return Boolean.TRUE;
    }
}
