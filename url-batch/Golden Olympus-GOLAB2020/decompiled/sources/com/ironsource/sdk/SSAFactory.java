package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.hr;
import com.ironsource.wj;

@Deprecated
/* loaded from: classes2.dex */
public class SSAFactory {
    public static hr getPublisherInstance(Activity activity) {
        return wj.b((Context) activity);
    }

    public static hr getPublisherTestInstance(Activity activity, int i4) {
        return wj.a(activity, i4);
    }
}
