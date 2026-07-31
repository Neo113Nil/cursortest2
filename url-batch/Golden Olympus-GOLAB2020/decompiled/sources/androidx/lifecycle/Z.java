package androidx.lifecycle;

import b0.AbstractC1367a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class Z {
    public static final AbstractC1367a a(c0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC1343i ? ((InterfaceC1343i) owner).getDefaultViewModelCreationExtras() : AbstractC1367a.C0126a.f13298b;
    }
}
