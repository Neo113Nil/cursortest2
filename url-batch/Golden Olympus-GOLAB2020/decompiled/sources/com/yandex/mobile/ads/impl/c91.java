package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.impl.C3139z9;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.InterfaceC3359v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeMediaLoader$loadMedia$2", f = "NativeMediaLoader.kt", l = {42, 43, IronSourceConstants.APP_ENTER_BACKGROUND, 46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c91 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    o2.Q f24103b;

    /* renamed from: c, reason: collision with root package name */
    int f24104c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f24105d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2286v2 f24106e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d91 f24107f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Context f24108g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ h41 f24109h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ sv f24110i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ zi0 f24111j;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeMediaLoader$loadMedia$2$imagesLoadJob$1", f = "NativeMediaLoader.kt", l = {37}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f24112b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d91 f24113c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h41 f24114d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ zi0 f24115e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d91 d91Var, h41 h41Var, zi0 zi0Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f24113c = d91Var;
            this.f24114d = h41Var;
            this.f24115e = zi0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f24113c, this.f24114d, this.f24115e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            u81 u81Var;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f24112b;
            if (i4 == 0) {
                ResultKt.a(obj);
                u81Var = this.f24113c.f24509a;
                h41 h41Var = this.f24114d;
                zi0 zi0Var = this.f24115e;
                this.f24112b = 1;
                if (u81Var.a(h41Var, zi0Var, this) == f4) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeMediaLoader$loadMedia$2$loadVideoTask$1", f = "NativeMediaLoader.kt", l = {40}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f24116b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d91 f24117c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f24118d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h41 f24119e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ sv f24120f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d91 d91Var, Context context, h41 h41Var, sv svVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f24117c = d91Var;
            this.f24118d = context;
            this.f24119e = h41Var;
            this.f24120f = svVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new b(this.f24117c, this.f24118d, this.f24119e, this.f24120f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            sa1 sa1Var;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f24116b;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                return obj;
            }
            ResultKt.a(obj);
            sa1Var = this.f24117c.f24511c;
            Context context = this.f24118d;
            h41 h41Var = this.f24119e;
            sv svVar = this.f24120f;
            this.f24116b = 1;
            Object a4 = sa1Var.a(true, context, h41Var, svVar, this);
            return a4 == f4 ? f4 : a4;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeMediaLoader$loadMedia$2$webViewLoadJob$1", f = "NativeMediaLoader.kt", l = {C3139z9.f40334K}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f24121b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d91 f24122c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f24123d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h41 f24124e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d91 d91Var, Context context, h41 h41Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f24122c = d91Var;
            this.f24123d = context;
            this.f24124e = h41Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new c(this.f24122c, this.f24123d, this.f24124e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            yb1 yb1Var;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f24121b;
            if (i4 == 0) {
                ResultKt.a(obj);
                yb1Var = this.f24122c.f24510b;
                Context context = this.f24123d;
                h41 h41Var = this.f24124e;
                this.f24121b = 1;
                if (yb1Var.a(context, h41Var, this) == f4) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c91(C2286v2 c2286v2, d91 d91Var, Context context, h41 h41Var, sv svVar, zi0 zi0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f24106e = c2286v2;
        this.f24107f = d91Var;
        this.f24108g = context;
        this.f24109h = h41Var;
        this.f24110i = svVar;
        this.f24111j = zi0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        c91 c91Var = new c91(this.f24106e, this.f24107f, this.f24108g, this.f24109h, this.f24110i, this.f24111j, dVar);
        c91Var.f24105d = obj;
        return c91Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c91) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r2.join(r14) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        if (r15.join(r14) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        sa1 sa1Var;
        InterfaceC3359v0 d4;
        InterfaceC3359v0 d5;
        o2.Q b4;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f24104c;
        if (i4 == 0) {
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f24105d;
            if (this.f24106e.t()) {
                d4 = AbstractC3337k.d(interfaceC3316J, null, null, new a(this.f24107f, this.f24109h, this.f24111j, null), 3, null);
                d5 = AbstractC3337k.d(interfaceC3316J, null, null, new c(this.f24107f, this.f24108g, this.f24109h, null), 3, null);
                b4 = AbstractC3337k.b(interfaceC3316J, null, null, new b(this.f24107f, this.f24108g, this.f24109h, this.f24110i, null), 3, null);
                this.f24105d = d5;
                this.f24103b = b4;
                this.f24104c = 1;
            } else {
                sa1Var = this.f24107f.f24511c;
                Context context = this.f24108g;
                h41 h41Var = this.f24109h;
                sv svVar = this.f24110i;
                this.f24104c = 4;
                Object a4 = sa1Var.a(false, context, h41Var, svVar, this);
                if (a4 != f4) {
                    return a4;
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                b4 = (o2.Q) this.f24105d;
                ResultKt.a(obj);
                this.f24105d = null;
                this.f24104c = 3;
                Object await = b4.await(this);
                return await == f4 ? f4 : await;
            }
            if (i4 == 3) {
                ResultKt.a(obj);
                return obj;
            }
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
            return obj;
        }
        b4 = this.f24103b;
        d5 = (InterfaceC3359v0) this.f24105d;
        ResultKt.a(obj);
        this.f24105d = b4;
        this.f24103b = null;
        this.f24104c = 2;
    }
}
