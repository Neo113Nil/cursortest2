package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.ch;
import defpackage.ec;
import defpackage.fh;
import defpackage.fp;
import defpackage.iq;
import defpackage.j1;
import defpackage.nq;
import defpackage.pj;
import defpackage.r6;
import defpackage.te;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements fp {
    @Override // defpackage.fp
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.fp
    public final Object b(Context context) {
        Object obj;
        pj pjVar = new pj(new j1(context));
        pjVar.a = 1;
        if (ch.k == null) {
            synchronized (ch.j) {
                try {
                    if (ch.k == null) {
                        ch.k = new ch(pjVar);
                    }
                } finally {
                }
            }
        }
        r6 n = r6.n(context);
        n.getClass();
        synchronized (r6.f) {
            try {
                obj = ((HashMap) n.b).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = n.f(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final iq lifecycle = ((nq) obj).getLifecycle();
        lifecycle.a(new te(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // defpackage.te
            public final void a() {
                (Build.VERSION.SDK_INT >= 28 ? ec.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new fh(), 500L);
                lifecycle.b(this);
            }
        });
        return Boolean.TRUE;
    }
}
