package androidx.lifecycle;

import o2.InterfaceC3316J;
import o2.R0;

/* loaded from: classes.dex */
public abstract class W {
    public static final InterfaceC3316J a(V v4) {
        InterfaceC3316J interfaceC3316J = (InterfaceC3316J) v4.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        return interfaceC3316J != null ? interfaceC3316J : (InterfaceC3316J) v4.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C1337c(R0.b(null, 1, null).plus(o2.Z.c().p())));
    }
}
