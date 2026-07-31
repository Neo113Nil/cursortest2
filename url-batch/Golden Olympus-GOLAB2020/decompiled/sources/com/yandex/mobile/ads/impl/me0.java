package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.do1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class me0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final do1 f29030a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1875dc f29031b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f29032c;

    public /* synthetic */ me0(Context context) {
        this(context, new do1(), new C1875dc());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    @Nullable
    public final C1851cc a() {
        try {
            this.f29030a.getClass();
            Intrinsics.checkNotNullParameter("com.google.android.gms.ads.identifier.AdvertisingIdClient", "className");
            if (AdvertisingIdClient.class == 0) {
                return null;
            }
            do1 do1Var = this.f29030a;
            Object[] objArr = {this.f29032c};
            do1Var.getClass();
            Object a4 = do1.a(AdvertisingIdClient.class, "getAdvertisingIdInfo", objArr);
            if (a4 == null) {
                return null;
            }
            String str = (String) do1.a.a(a4, "getId", new Object[0]);
            Boolean bool = (Boolean) do1.a.a(a4, b9.i.f15531M, new Object[0]);
            this.f29031b.getClass();
            if (bool == null || str == null) {
                return null;
            }
            return new C1851cc(str, bool.booleanValue());
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    public me0(@NotNull Context context, @NotNull do1 reflectHelper, @NotNull C1875dc advertisingInfoCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reflectHelper, "reflectHelper");
        Intrinsics.checkNotNullParameter(advertisingInfoCreator, "advertisingInfoCreator");
        this.f29030a = reflectHelper;
        this.f29031b = advertisingInfoCreator;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f29032c = applicationContext;
    }
}
