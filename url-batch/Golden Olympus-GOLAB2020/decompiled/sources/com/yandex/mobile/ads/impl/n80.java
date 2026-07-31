package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n80 {
    public static boolean a(Context context, m80 toggle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(toggle, "toggle");
        int i4 = zr0.f35758b;
        Intrinsics.checkNotNullParameter(context, "context");
        return zr0.a(context, "YadPreferenceFile").a(toggle.a(), false);
    }
}
