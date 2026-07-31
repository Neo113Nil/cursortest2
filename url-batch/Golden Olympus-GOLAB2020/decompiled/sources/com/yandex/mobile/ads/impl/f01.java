package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ju1;
import com.yandex.mobile.ads.impl.ur0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f01 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ew1 f25531a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile e01 f25532b;

    static final class a extends kotlin.jvm.internal.s implements Function0<g92> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i92 f25533b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f25534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i92 i92Var, Context context) {
            super(0);
            this.f25533b = i92Var;
            this.f25534c = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f25533b.a(this.f25534c);
        }
    }

    static {
        int i4 = ew1.f25476l;
        f25531a = ew1.a.a();
    }

    @NotNull
    public static final e01 a(@NotNull Context context, @NotNull i92 varioqubAdapterProvider, @NotNull InterfaceC2343xd appAdAnalyticsActivator) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(varioqubAdapterProvider, "varioqubAdapterProvider");
        Intrinsics.checkNotNullParameter(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        if (f25532b == null) {
            obj = e01.f25049e;
            synchronized (obj) {
                try {
                    if (f25532b == null) {
                        Context a4 = xr.a(context);
                        f25532b = a(a4, varioqubAdapterProvider, f25531a.a(a4), appAdAnalyticsActivator);
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e01 e01Var = f25532b;
        if (e01Var != null) {
            return e01Var;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r4 == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static e01 a(Context context, i92 i92Var, du1 du1Var, InterfaceC2343xd interfaceC2343xd) {
        boolean z4;
        C2275ue c2275ue = new C2275ue();
        mp1 a4 = new C2298ve(interfaceC2343xd, C2044ke.a()).a(context);
        W1.h b4 = W1.i.b(new a(i92Var, context));
        if (du1Var != null) {
            boolean u4 = du1Var.u();
            z4 = true;
        }
        z4 = false;
        int i4 = ur0.f33232f;
        e01 e01Var = new e01(a4, b4, z4, ur0.a.a().c());
        fu1 fu1Var = new fu1(c2275ue);
        int i5 = ju1.f27825d;
        new eu1(c2275ue, fu1Var, ju1.a.a()).a();
        return e01Var;
    }
}
