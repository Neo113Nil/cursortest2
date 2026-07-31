package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.j21;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import o2.C3345o;
import o2.InterfaceC3316J;
import o2.InterfaceC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p21 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bt1 f30283a;

    private interface a {
        void a();
    }

    private static final class b implements j21.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final q21 f30284a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final eu0 f30285b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final a f30286c;

        public b(@NotNull q21 mraidWebViewPool, @NotNull eu0 media, @NotNull c.a listener) {
            Intrinsics.checkNotNullParameter(mraidWebViewPool, "mraidWebViewPool");
            Intrinsics.checkNotNullParameter(media, "media");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f30284a = mraidWebViewPool;
            this.f30285b = media;
            this.f30286c = listener;
        }

        @Override // com.yandex.mobile.ads.impl.j21.a
        public final void a() {
            this.f30284a.b(this.f30285b);
            this.f30286c.a();
        }

        @Override // com.yandex.mobile.ads.impl.j21.a
        public final void b() {
            this.f30286c.a();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.webview.mraid.MraidWebViewLoader$loadWebView$2", f = "MraidWebViewLoader.kt", l = {68}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f30287b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30288c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ eu0 f30289d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30290e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p21 f30291f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f30292g;

        static final class a implements a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f30293a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3343n f30294b;

            a(boolean z4, C3345o c3345o) {
                this.f30293a = z4;
                this.f30294b = c3345o;
            }

            @Override // com.yandex.mobile.ads.impl.p21.a
            public final void a() {
                if (this.f30293a && this.f30294b.isActive()) {
                    InterfaceC3343n interfaceC3343n = this.f30294b;
                    Result.Companion companion = Result.Companion;
                    interfaceC3343n.resumeWith(Result.m243constructorimpl(Unit.f41027a));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, eu0 eu0Var, String str, p21 p21Var, boolean z4, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f30288c = context;
            this.f30289d = eu0Var;
            this.f30290e = str;
            this.f30291f = p21Var;
            this.f30292g = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new c(this.f30288c, this.f30289d, this.f30290e, this.f30291f, this.f30292g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            j21 j21Var;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f30287b;
            if (i4 == 0) {
                ResultKt.a(obj);
                q21 a4 = q21.f30646c.a(this.f30288c);
                if (a4.b() || a4.a(this.f30289d) || this.f30290e == null) {
                    return Unit.f41027a;
                }
                bt1 bt1Var = this.f30291f.f30283a;
                Context context = this.f30288c;
                bt1Var.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                try {
                    j21Var = new j21(context);
                } catch (Throwable unused) {
                    j21Var = null;
                }
                if (j21Var == null) {
                    return Unit.f41027a;
                }
                eu0 eu0Var = this.f30289d;
                String str = this.f30290e;
                boolean z4 = this.f30292g;
                this.f30287b = 1;
                C3345o c3345o = new C3345o(AbstractC1241b.c(this), 1);
                c3345o.E();
                b bVar = new b(a4, eu0Var, new a(z4, c3345o));
                a4.a(j21Var, eu0Var);
                j21Var.a(str, bVar);
                if (!z4 && c3345o.isActive()) {
                    Result.Companion companion = Result.Companion;
                    c3345o.resumeWith(Result.m243constructorimpl(Unit.f41027a));
                }
                Object y4 = c3345o.y();
                if (y4 == AbstractC1241b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (y4 == f4) {
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

    public /* synthetic */ p21() {
        this(new bt1());
    }

    @Nullable
    public final Object a(@NotNull Context context, @NotNull eu0 eu0Var, @NotNull C2360y7<?> c2360y7, @NotNull kotlin.coroutines.d dVar) {
        String b4 = eu0Var.b();
        boolean z4 = false;
        if (c2360y7.N()) {
            m80 toggle = m80.f28943f;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(toggle, "toggle");
            int i4 = zr0.f35758b;
            Intrinsics.checkNotNullParameter(context, "context");
            if (!zr0.a(context, "YadPreferenceFile").a(toggle.a(), false)) {
                z4 = true;
            }
        }
        Object g4 = AbstractC3333i.g(o2.Z.c().p(), new c(context, eu0Var, b4, this, z4, null), dVar);
        return g4 == AbstractC1241b.f() ? g4 : Unit.f41027a;
    }

    public p21(@NotNull bt1 safeMraidWebViewFactory) {
        Intrinsics.checkNotNullParameter(safeMraidWebViewFactory, "safeMraidWebViewFactory");
        this.f30283a = safeMraidWebViewFactory;
    }
}
