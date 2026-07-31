package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.impl.pj0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u81 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f32858a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2105n4 f32859b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2140og f32860c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final jj0 f32861d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ri0 f32862e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final pj0 f32863f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function1<zi0, yi0> f32864g;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeImagesLoader", f = "NativeImagesLoader.kt", l = {49}, m = "loadImages")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        u81 f32865b;

        /* renamed from: c, reason: collision with root package name */
        zi0 f32866c;

        /* renamed from: d, reason: collision with root package name */
        h41 f32867d;

        /* renamed from: e, reason: collision with root package name */
        C2105n4 f32868e;

        /* renamed from: f, reason: collision with root package name */
        EnumC2082m4 f32869f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f32870g;

        /* renamed from: i, reason: collision with root package name */
        int f32872i;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32870g = obj;
            this.f32872i |= Integer.MIN_VALUE;
            return u81.a(u81.this, this);
        }
    }

    public /* synthetic */ u81(Context context, InterfaceC3316J interfaceC3316J, C2105n4 c2105n4) {
        this(context, interfaceC3316J, c2105n4, new C2140og(), new jj0(), new ri0(context), new pj0(), t81.f32242b);
    }

    public static final /* synthetic */ Object a(u81 u81Var, kotlin.coroutines.d dVar) {
        return u81Var.a(null, null, null, dVar);
    }

    @Nullable
    public final Object a(@NotNull h41 h41Var, @NotNull zi0 zi0Var, @NotNull kotlin.coroutines.d dVar) {
        yi0 yi0Var = (yi0) this.f32864g.invoke(zi0Var);
        pj0.a a4 = this.f32863f.a(h41Var);
        Set<ej0> a5 = a4.a();
        Set<ej0> b4 = a4.b();
        Set<ej0> c4 = a4.c();
        yi0Var.a(b4);
        if (Intrinsics.areEqual(h41Var.b().E(), q81.f30708d.a())) {
            AbstractC3337k.d(this.f32858a, null, null, new v81(this.f32862e.a(c4), zi0Var, null), 3, null);
        }
        Object a6 = a(a5, zi0Var, h41Var, dVar);
        return a6 == AbstractC1241b.f() ? a6 : Unit.f41027a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u81(@NotNull Context context, @NotNull InterfaceC3316J coroutineScope, @NotNull C2105n4 adLoadingPhasesManager, @NotNull C2140og assetsFilter, @NotNull jj0 imageValuesFilter, @NotNull ri0 imageLoadManager, @NotNull pj0 imagesForPreloadingProvider, @NotNull Function1<? super zi0, yi0> previewPreloadingFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(assetsFilter, "assetsFilter");
        Intrinsics.checkNotNullParameter(imageValuesFilter, "imageValuesFilter");
        Intrinsics.checkNotNullParameter(imageLoadManager, "imageLoadManager");
        Intrinsics.checkNotNullParameter(imagesForPreloadingProvider, "imagesForPreloadingProvider");
        Intrinsics.checkNotNullParameter(previewPreloadingFactory, "previewPreloadingFactory");
        this.f32858a = coroutineScope;
        this.f32859b = adLoadingPhasesManager;
        this.f32860c = assetsFilter;
        this.f32861d = imageValuesFilter;
        this.f32862e = imageLoadManager;
        this.f32863f = imagesForPreloadingProvider;
        this.f32864g = previewPreloadingFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Set<ej0> set, zi0 zi0Var, h41 nativeAdBlock, kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        u81 u81Var;
        zi0 zi0Var2;
        C2105n4 c2105n4;
        EnumC2082m4 enumC2082m4;
        oj0 oj0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f32872i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f32872i = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f32870g;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f32872i;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    if (set.isEmpty()) {
                        return Unit.f41027a;
                    }
                    C2105n4 c2105n42 = this.f32859b;
                    EnumC2082m4 enumC2082m42 = EnumC2082m4.f28858o;
                    C2001ij.a(c2105n42, enumC2082m42, "adLoadingPhaseType", enumC2082m42, null);
                    ri0 ri0Var = this.f32862e;
                    aVar.f32865b = this;
                    aVar.f32866c = zi0Var;
                    aVar.f32867d = nativeAdBlock;
                    aVar.f32868e = c2105n42;
                    aVar.f32869f = enumC2082m42;
                    aVar.f32872i = 1;
                    Object a4 = ri0Var.a(set, aVar);
                    if (a4 == f4) {
                        return f4;
                    }
                    u81Var = this;
                    zi0Var2 = zi0Var;
                    c2105n4 = c2105n42;
                    obj = a4;
                    enumC2082m4 = enumC2082m42;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    enumC2082m4 = aVar.f32869f;
                    c2105n4 = aVar.f32868e;
                    nativeAdBlock = aVar.f32867d;
                    zi0Var2 = aVar.f32866c;
                    u81Var = aVar.f32865b;
                    ResultKt.a(obj);
                }
                oj0Var = (oj0) obj;
                if (oj0Var instanceof oj0.a) {
                    Map<String, Bitmap> images = ((oj0.a) oj0Var).a();
                    C2360y7<?> b4 = nativeAdBlock.b();
                    if (!Intrinsics.areEqual(b4.E(), q81.f30707c.a()) && !Intrinsics.areEqual(b4.E(), q81.f30708d.a())) {
                        jj0 jj0Var = u81Var.f32861d;
                        jj0Var.getClass();
                        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
                        Intrinsics.checkNotNullParameter(images, "images");
                        Iterator<u31> it = nativeAdBlock.c().e().iterator();
                        while (it.hasNext()) {
                            List<C2276uf<?>> b5 = it.next().b();
                            if (!b5.isEmpty()) {
                                jj0Var.a(b5, images);
                            }
                        }
                        C2140og c2140og = u81Var.f32860c;
                        c2140og.getClass();
                        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
                        Intrinsics.checkNotNullParameter(images, "images");
                        for (u31 u31Var : nativeAdBlock.c().e()) {
                            List<C2276uf<?>> b6 = u31Var.b();
                            if (!b6.isEmpty()) {
                                u31Var.a(c2140og.a(b6, images));
                            }
                        }
                    }
                    zi0Var2.a(images);
                }
                Unit unit = Unit.f41027a;
                c2105n4.a(enumC2082m4);
                return unit;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f32870g;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f32872i;
        if (i4 != 0) {
        }
        oj0Var = (oj0) obj2;
        if (oj0Var instanceof oj0.a) {
        }
        Unit unit2 = Unit.f41027a;
        c2105n4.a(enumC2082m4);
        return unit2;
    }
}
