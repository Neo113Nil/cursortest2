package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1971hc {

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.identifiers.ad.AdvertisingInfoLoader$requestAdvertisingInfo$2", f = "AdvertisingInfoLoader.kt", l = {11}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.hc$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f26700b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f26701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f26701c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f26701c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.f26701c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C1947gc c1947gc;
            Object obj2;
            C1947gc c1947gc2;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f26700b;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                return obj;
            }
            ResultKt.a(obj);
            int i5 = C1947gc.f26102f;
            Context context = this.f26701c;
            Intrinsics.checkNotNullParameter(context, "context");
            c1947gc = C1947gc.f26101e;
            if (c1947gc == null) {
                obj2 = C1947gc.f26100d;
                synchronized (obj2) {
                    c1947gc2 = C1947gc.f26101e;
                    if (c1947gc2 == null) {
                        c1947gc2 = new C1947gc(context);
                        C1947gc.f26101e = c1947gc2;
                    }
                }
                c1947gc = c1947gc2;
            }
            this.f26700b = 1;
            Object a4 = c1947gc.a(this);
            return a4 == f4 ? f4 : a4;
        }
    }

    @Nullable
    public static Object a(@NotNull Context context, @NotNull kotlin.coroutines.d dVar) {
        return AbstractC3333i.g(o2.Z.b(), new a(context, null), dVar);
    }
}
