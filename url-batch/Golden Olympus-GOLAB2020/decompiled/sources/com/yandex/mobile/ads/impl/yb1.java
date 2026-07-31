package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.mobile.ads.impl.ew1;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2105n4 f35035a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final cw0 f35036b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final p21 f35037c;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeWebViewLoader", f = "NativeWebViewLoader.kt", l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "loadWebViews")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        yb1 f35038b;

        /* renamed from: c, reason: collision with root package name */
        Context f35039c;

        /* renamed from: d, reason: collision with root package name */
        h41 f35040d;

        /* renamed from: e, reason: collision with root package name */
        C2105n4 f35041e;

        /* renamed from: f, reason: collision with root package name */
        EnumC2082m4 f35042f;

        /* renamed from: g, reason: collision with root package name */
        Iterator f35043g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f35044h;

        /* renamed from: j, reason: collision with root package name */
        int f35046j;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35044h = obj;
            this.f35046j |= Integer.MIN_VALUE;
            return yb1.this.a(null, null, this);
        }
    }

    public yb1(@NotNull C2105n4 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f35035a = adLoadingPhasesManager;
        this.f35036b = new cw0();
        this.f35037c = new p21();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Context context, @NotNull h41 h41Var, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        C2105n4 c2105n4;
        EnumC2082m4 enumC2082m4;
        Context context2;
        Iterator<eu0> it;
        h41 h41Var2;
        yb1 yb1Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f35046j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f35046j = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f35044h;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f35046j;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    Set<eu0> a4 = this.f35036b.a(h41Var);
                    int i6 = ew1.f25476l;
                    du1 a5 = ew1.a.a().a(context);
                    int E4 = a5 != null ? a5.E() : 0;
                    if (!C2362y9.a(context) || E4 == 0 || a4.isEmpty()) {
                        return Unit.f41027a;
                    }
                    c2105n4 = this.f35035a;
                    enumC2082m4 = EnumC2082m4.f28860q;
                    C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
                    context2 = context;
                    it = a4.iterator();
                    h41Var2 = h41Var;
                    yb1Var = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = aVar.f35043g;
                    EnumC2082m4 enumC2082m42 = aVar.f35042f;
                    c2105n4 = aVar.f35041e;
                    h41 h41Var3 = aVar.f35040d;
                    Context context3 = aVar.f35039c;
                    yb1Var = aVar.f35038b;
                    ResultKt.a(obj);
                    h41Var2 = h41Var3;
                    enumC2082m4 = enumC2082m42;
                    context2 = context3;
                }
                while (it.hasNext()) {
                    eu0 next = it.next();
                    p21 p21Var = yb1Var.f35037c;
                    C2360y7<?> b4 = h41Var2.b();
                    aVar.f35038b = yb1Var;
                    aVar.f35039c = context2;
                    aVar.f35040d = h41Var2;
                    aVar.f35041e = c2105n4;
                    aVar.f35042f = enumC2082m4;
                    aVar.f35043g = it;
                    aVar.f35046j = 1;
                    if (p21Var.a(context2, next, b4, aVar) == f4) {
                        return f4;
                    }
                }
                Unit unit = Unit.f41027a;
                c2105n4.a(enumC2082m4);
                return unit;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f35044h;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f35046j;
        if (i4 != 0) {
        }
        while (it.hasNext()) {
        }
        Unit unit2 = Unit.f41027a;
        c2105n4.a(enumC2082m4);
        return unit2;
    }
}
