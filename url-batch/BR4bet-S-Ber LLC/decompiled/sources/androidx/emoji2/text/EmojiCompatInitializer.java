package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.br;
import defpackage.k6;
import defpackage.lj;
import defpackage.mj;
import defpackage.ms;
import defpackage.os;
import defpackage.rc0;
import defpackage.yl;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements br {
    @Override // defpackage.br
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.br
    public final Object b(Context context) {
        Object obj;
        yl ylVar = new yl(new rc0(context));
        ylVar.a = 1;
        if (lj.k == null) {
            synchronized (lj.j) {
                try {
                    if (lj.k == null) {
                        lj.k = new lj(ylVar);
                    }
                } finally {
                }
            }
        }
        k6 r = k6.r(context);
        r.getClass();
        synchronized (k6.k) {
            try {
                obj = ((HashMap) r.g).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = r.k(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        os e = ((ms) obj).e();
        e.a(new mj(this, e));
        return Boolean.TRUE;
    }
}
