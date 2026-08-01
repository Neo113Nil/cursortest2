package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.am;
import defpackage.bv;
import defpackage.ep;
import defpackage.lx;
import defpackage.nx;
import defpackage.o0;
import defpackage.s6;
import defpackage.zl;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements bv {
    @Override // defpackage.bv
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.bv
    public final Object b(Context context) {
        Object obj;
        ep epVar = new ep(new o0(context));
        epVar.a = 1;
        if (zl.k == null) {
            synchronized (zl.j) {
                try {
                    if (zl.k == null) {
                        zl.k = new zl(epVar);
                    }
                } finally {
                }
            }
        }
        s6 m = s6.m(context);
        m.getClass();
        synchronized (s6.f) {
            try {
                obj = ((HashMap) m.b).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = m.f(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        nx e = ((lx) obj).e();
        e.a(new am(this, e));
        return Boolean.TRUE;
    }
}
