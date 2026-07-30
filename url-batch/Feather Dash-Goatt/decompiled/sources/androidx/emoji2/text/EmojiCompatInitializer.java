package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.h20;
import defpackage.i8;
import defpackage.l80;
import defpackage.o5;
import defpackage.vg0;
import defpackage.xg0;
import defpackage.yu;
import defpackage.zu;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements l80 {
    @Override // defpackage.l80
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.l80
    public final Object b(Context context) {
        Object obj;
        h20 h20Var = new h20(new o5(context, 2));
        h20Var.b = 1;
        if (yu.k == null) {
            synchronized (yu.j) {
                try {
                    if (yu.k == null) {
                        yu.k = new yu(h20Var);
                    }
                } finally {
                }
            }
        }
        i8 h = i8.h(context);
        h.getClass();
        synchronized (i8.j) {
            try {
                obj = ((HashMap) h.e).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = h.e(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        xg0 f = ((vg0) obj).f();
        f.a(new zu(this, f));
        return Boolean.TRUE;
    }
}
