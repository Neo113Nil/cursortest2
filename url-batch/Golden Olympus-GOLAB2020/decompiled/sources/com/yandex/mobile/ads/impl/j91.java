package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.i91;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3333i;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.InterfaceC3359v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeResourcesLoader$load$1", f = "NativeResourcesLoader.kt", l = {IronSourceConstants.REGISTER_TRIGGER_SUCCESS, IronSourceConstants.SET_NETWORK_DATA}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j91 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    o2.Q f27577b;

    /* renamed from: c, reason: collision with root package name */
    int f27578c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f27579d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f27580e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ v41 f27581f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ i91.a f27582g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ i91 f27583h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C2286v2 f27584i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ h41 f27585j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ sv f27586k;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeResourcesLoader$load$1$1", f = "NativeResourcesLoader.kt", l = {IronSourceConstants.REGISTER_TRIGGER_SUCCESS}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f27587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i91 f27588c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h41 f27589d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i91 i91Var, h41 h41Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f27588c = i91Var;
            this.f27589d = h41Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f27588c, this.f27589d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.f27588c, this.f27589d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            da1 da1Var;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f27587b;
            if (i4 == 0) {
                ResultKt.a(obj);
                da1Var = this.f27588c.f27144c;
                h41 h41Var = this.f27589d;
                this.f27587b = 1;
                if (da1Var.a(h41Var, this) == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return Unit.f41027a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeResourcesLoader$load$1$updatedNativeAdBlockTask$1", f = "NativeResourcesLoader.kt", l = {50}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f27590b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f27591c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i91 f27592d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2286v2 f27593e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f27594f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h41 f27595g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ sk1 f27596h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ sv f27597i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i91 i91Var, C2286v2 c2286v2, Context context, h41 h41Var, sk1 sk1Var, sv svVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f27592d = i91Var;
            this.f27593e = c2286v2;
            this.f27594f = context;
            this.f27595g = h41Var;
            this.f27596h = sk1Var;
            this.f27597i = svVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            b bVar = new b(this.f27592d, this.f27593e, this.f27594f, this.f27595g, this.f27596h, this.f27597i, dVar);
            bVar.f27591c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object m243constructorimpl;
            d91 d91Var;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f27590b;
            try {
                if (i4 == 0) {
                    ResultKt.a(obj);
                    i91 i91Var = this.f27592d;
                    C2286v2 c2286v2 = this.f27593e;
                    Context context = this.f27594f;
                    h41 h41Var = this.f27595g;
                    sk1 sk1Var = this.f27596h;
                    sv svVar = this.f27597i;
                    Result.Companion companion = Result.Companion;
                    d91Var = i91Var.f27143b;
                    this.f27590b = 1;
                    d91Var.getClass();
                    obj = AbstractC3333i.g(o2.Z.b(), new c91(c2286v2, d91Var, context, h41Var, svVar, sk1Var, null), this);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                m243constructorimpl = Result.m243constructorimpl((h41) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                return null;
            }
            return m243constructorimpl;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j91(Context context, v41 v41Var, i91.a aVar, i91 i91Var, C2286v2 c2286v2, h41 h41Var, sv svVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f27580e = context;
        this.f27581f = v41Var;
        this.f27582g = aVar;
        this.f27583h = i91Var;
        this.f27584i = c2286v2;
        this.f27585j = h41Var;
        this.f27586k = svVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        j91 j91Var = new j91(this.f27580e, this.f27581f, this.f27582g, this.f27583h, this.f27584i, this.f27585j, this.f27586k, dVar);
        j91Var.f27579d = obj;
        return j91Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j91) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        o2.Q b4;
        InterfaceC3359v0 d4;
        sk1 sk1Var;
        sk1 sk1Var2;
        h41 h41Var;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f27578c;
        if (i4 == 0) {
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f27579d;
            sk1 sk1Var3 = new sk1(this.f27580e);
            b4 = AbstractC3337k.b(interfaceC3316J, null, null, new b(this.f27583h, this.f27584i, this.f27580e, this.f27585j, sk1Var3, this.f27586k, null), 3, null);
            d4 = AbstractC3337k.d(interfaceC3316J, null, null, new a(this.f27583h, this.f27585j, null), 3, null);
            this.f27579d = sk1Var3;
            this.f27577b = b4;
            this.f27578c = 1;
            if (d4.join(this) != f4) {
                sk1Var = sk1Var3;
            }
            return f4;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sk1Var2 = (sk1) this.f27579d;
            ResultKt.a(obj);
            h41Var = (h41) obj;
            if (h41Var != null) {
                this.f27581f.a(C1942g7.d());
            } else {
                this.f27582g.a(sk1Var2, h41Var);
            }
            return Unit.f41027a;
        }
        b4 = this.f27577b;
        sk1Var = (sk1) this.f27579d;
        ResultKt.a(obj);
        this.f27579d = sk1Var;
        this.f27577b = null;
        this.f27578c = 2;
        obj = b4.await(this);
        if (obj != f4) {
            sk1Var2 = sk1Var;
            h41Var = (h41) obj;
            if (h41Var != null) {
            }
            return Unit.f41027a;
        }
        return f4;
    }
}
