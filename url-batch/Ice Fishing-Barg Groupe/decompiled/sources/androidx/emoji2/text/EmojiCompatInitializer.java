package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.dc0;
import defpackage.m9;
import defpackage.o01;
import defpackage.q3;
import defpackage.s01;
import defpackage.x40;
import defpackage.y40;
import defpackage.yo0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements yo0 {
    @Override // defpackage.yo0
    public final List PxuCJdSBwIXG() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.yo0
    public final Object lS5Rgt96tfkO(Context context) {
        Object obj;
        dc0 dc0Var = new dc0(new q3(context, 4));
        dc0Var.PxuCJdSBwIXG = 1;
        if (x40.dgRBjINgWbAK == null) {
            synchronized (x40.wdg6QnbFHrFF) {
                try {
                    if (x40.dgRBjINgWbAK == null) {
                        x40.dgRBjINgWbAK = new x40(dc0Var);
                    }
                } finally {
                }
            }
        }
        m9 S9EYkSpbGuxq = m9.S9EYkSpbGuxq(context);
        S9EYkSpbGuxq.getClass();
        synchronized (m9.cpQdD2nAriOS) {
            try {
                obj = ((HashMap) S9EYkSpbGuxq.OPXfSBeufaJ8).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = S9EYkSpbGuxq.r3s1LDPKFs1S(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        s01 rtx2ld2ELZv4 = ((o01) obj).rtx2ld2ELZv4();
        rtx2ld2ELZv4.PxuCJdSBwIXG(new y40(this, rtx2ld2ELZv4));
        return Boolean.TRUE;
    }
}
