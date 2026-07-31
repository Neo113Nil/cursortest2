package androidx.emoji2.text;

import C1.a;
import C1.b;
import android.content.Context;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.InterfaceC0292v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import m.y0;
import m1.i;
import m1.j;
import m1.s;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // C1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // C1.b
    public final Object b(Context context) {
        Object obj;
        y0 y0Var = new y0();
        y0Var.f6913d = context.getApplicationContext();
        s sVar = new s(y0Var);
        sVar.f6977b = 1;
        if (i.f6945k == null) {
            synchronized (i.f6944j) {
                try {
                    if (i.f6945k == null) {
                        i.f6945k = new i(sVar);
                    }
                } finally {
                }
            }
        }
        a c2 = a.c(context);
        c2.getClass();
        synchronized (a.f684e) {
            try {
                obj = c2.f685a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0294x e3 = ((InterfaceC0292v) obj).e();
        e3.a(new j(this, e3));
        return Boolean.TRUE;
    }
}
