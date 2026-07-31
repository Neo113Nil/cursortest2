package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes3.dex */
public final class Kk {

    /* renamed from: a, reason: collision with root package name */
    public final Ok f37899a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f37900b;

    public Kk(Context context, C2772l5 c2772l5) {
        c2772l5.a();
        Ok ok = new Ok(context, c2772l5);
        this.f37899a = ok;
        this.f37900b = MapsKt.toMutableMap(ok.a());
    }
}
