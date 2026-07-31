package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.sdk.components.a;
import com.startapp.sdk.internal.af;
import com.startapp.sdk.internal.x5;
import java.io.Serializable;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class SimpleTokenConfig implements Serializable {
    private static final long serialVersionUID = 2058698844345650499L;
    private boolean enabled = false;

    public final boolean a(Context context) {
        a a2 = a.a(context);
        return !((af) a2.G.a()).getBoolean("userDisabledSimpleToken", false) && this.enabled && ((x5) a2.i.a()).b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.enabled == ((SimpleTokenConfig) obj).enabled;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.enabled).hashCode();
    }
}
