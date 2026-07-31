package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.e50;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v32 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private pt f33493a;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r1.q() == true) goto L8;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u32 a(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull C1871d8 receiver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        pt ptVar = this.f33493a;
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        boolean z4 = a4 != null;
        if (ptVar != null && z4) {
            return new yu(ptVar, receiver, new Handler(Looper.getMainLooper()));
        }
        C2148p1 c2148p1 = new C2148p1(sdkEnvironmentModule);
        int i5 = e50.f25096e;
        return new oy(context, c2148p1, adResponse, receiver, sdkEnvironmentModule, e50.a.a(context), adConfiguration);
    }

    public final void a(@Nullable com.yandex.mobile.ads.nativeads.c cVar) {
        this.f33493a = cVar;
    }
}
