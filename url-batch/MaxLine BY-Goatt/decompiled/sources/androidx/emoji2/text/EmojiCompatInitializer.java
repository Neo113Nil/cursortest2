package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.ad1;
import defpackage.ag0;
import defpackage.bg0;
import defpackage.g21;
import defpackage.id1;
import defpackage.mh;
import defpackage.tp0;
import defpackage.u9;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements g21 {
    @Override // defpackage.g21
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.g21
    public final Object b(Context context) {
        Object obj;
        tp0 tp0Var = new tp0(new u9(context, 2));
        tp0Var.a = 1;
        if (ag0.k == null) {
            synchronized (ag0.j) {
                try {
                    if (ag0.k == null) {
                        ag0.k = new ag0(tp0Var);
                    }
                } finally {
                }
            }
        }
        mh t = mh.t(context);
        t.getClass();
        synchronized (mh.r) {
            try {
                obj = ((HashMap) t.n).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = t.m(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        ad1 lifecycle = ((id1) obj).getLifecycle();
        lifecycle.a(new bg0(this, lifecycle));
        return Boolean.TRUE;
    }
}
