package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.a;
import defpackage.a6;
import defpackage.ac;
import defpackage.aq;
import defpackage.k0;
import defpackage.kh;
import defpackage.nh;
import defpackage.qo;
import defpackage.se;
import defpackage.uj;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements qo {
    @Override // defpackage.qo
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.qo
    public final Object b(Context context) {
        Object obj;
        uj ujVar = new uj(new k0(context));
        ujVar.a = 1;
        if (kh.k == null) {
            synchronized (kh.j) {
                try {
                    if (kh.k == null) {
                        kh.k = new kh(ujVar);
                    }
                } finally {
                }
            }
        }
        a6 n = a6.n(context);
        n.getClass();
        synchronized (a6.f) {
            try {
                obj = ((HashMap) n.b).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = n.f(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final a e = ((aq) obj).e();
        e.a(new se(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // defpackage.se
            public final void a() {
                (Build.VERSION.SDK_INT >= 28 ? ac.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new nh(), 500L);
                e.f(this);
            }
        });
        return Boolean.TRUE;
    }
}
