package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class zae {
    public final Set zaa;

    public zae(Set set) {
        Preconditions.checkNotNull(set);
        this.zaa = Collections.unmodifiableSet(set);
    }
}
