package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.yandex.mobile.ads.impl.px;
import java.util.List;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class be0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kx f23719a;

    @kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.domain.GetDebugPanelFeedDataUseCase", f = "GetDebugPanelFeedDataUseCase.kt", l = {15}, m = "invoke")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        be0 f23720b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f23721c;

        /* renamed from: e, reason: collision with root package name */
        int f23723e;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23721c = obj;
            this.f23723e |= Integer.MIN_VALUE;
            return be0.this.a(false, this);
        }
    }

    public be0(@NotNull kx repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f23719a = repo;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z4, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        be0 be0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f23723e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f23723e = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f23721c;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f23723e;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    kx kxVar = this.f23719a;
                    aVar.f23720b = this;
                    aVar.f23723e = 1;
                    obj = kxVar.a(z4, aVar);
                    if (obj == f4) {
                        return f4;
                    }
                    be0Var = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    be0Var = aVar.f23720b;
                    ResultKt.a(obj);
                }
                qw qwVar = (qw) obj;
                List<kw> c4 = qwVar.c();
                mw d4 = qwVar.d();
                nx h4 = qwVar.h();
                be0Var.getClass();
                return new xw(c4, d4, new ox(h4.c(), new px(!h4.d() ? h4.b().isEmpty() ? px.a.f30607b : px.a.f30608c : px.a.f30609d, h4.b())), qwVar.g(), qwVar.b(), qwVar.e(), qwVar.f());
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f23721c;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f23723e;
        if (i4 != 0) {
        }
        qw qwVar2 = (qw) obj2;
        List<kw> c42 = qwVar2.c();
        mw d42 = qwVar2.d();
        nx h42 = qwVar2.h();
        be0Var.getClass();
        return new xw(c42, d42, new ox(h42.c(), new px(!h42.d() ? h42.b().isEmpty() ? px.a.f30607b : px.a.f30608c : px.a.f30609d, h42.b())), qwVar2.g(), qwVar2.b(), qwVar2.e(), qwVar2.f());
    }
}
