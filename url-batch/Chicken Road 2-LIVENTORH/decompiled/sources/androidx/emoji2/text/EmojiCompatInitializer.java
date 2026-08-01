package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements h1.b {
    @Override // h1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // h1.b
    public final Object b(Context context) {
        Object obj;
        v vVar = new v(new a0.a(context));
        vVar.f325a = 1;
        if (l.f332k == null) {
            synchronized (l.f331j) {
                try {
                    if (l.f332k == null) {
                        l.f332k = new l(vVar);
                    }
                } finally {
                }
            }
        }
        h1.a c4 = h1.a.c(context);
        c4.getClass();
        synchronized (h1.a.f1800e) {
            try {
                obj = c4.f1801a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c4.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final androidx.lifecycle.t e4 = ((androidx.lifecycle.r) obj).e();
        e4.a(new androidx.lifecycle.d(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public final void a() {
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o(), 500L);
                e4.f(this);
            }
        });
        return Boolean.TRUE;
    }
}
