package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.gc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1947gc {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f26100d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private static volatile C1947gc f26101e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26102f = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2042kc f26103a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ry f26104b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o2.Q f26105c;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.identifiers.ad.AdvertisingInfoHolderLoader$getAdvertisingInfo$2", f = "AdvertisingInfoHolderLoader.kt", l = {27}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.gc$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f26106b;

        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return C1947gc.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C1947gc.this.new a((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f26106b;
            if (i4 == 0) {
                ResultKt.a(obj);
                o2.Q q4 = C1947gc.this.f26105c;
                this.f26106b = 1;
                obj = q4.await(this);
                if (obj == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            C2090mc c2090mc = obj instanceof C2090mc ? (C2090mc) obj : null;
            if (c2090mc != null) {
                return c2090mc.a();
            }
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ C1947gc(Context context) {
        this(r0, new C2113nc(), new C2042kc(context));
        InterfaceC3316J a4;
        a4 = fu.a((j50) null);
    }

    @Nullable
    public final Object a(@NotNull kotlin.coroutines.d dVar) {
        return o2.W0.d(this.f26104b.a(), new a(null), dVar);
    }

    private C1947gc(InterfaceC3316J interfaceC3316J, C2113nc c2113nc, C2042kc c2042kc) {
        o2.Q b4;
        this.f26103a = c2042kc;
        c2113nc.getClass();
        this.f26104b = C2113nc.a();
        b4 = AbstractC3337k.b(interfaceC3316J, null, o2.L.f42010c, new C1923fc(this, null), 1, null);
        this.f26105c = b4;
    }
}
