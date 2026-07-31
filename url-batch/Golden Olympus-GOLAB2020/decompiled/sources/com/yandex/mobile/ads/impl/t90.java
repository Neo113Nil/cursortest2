package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.yandex.mobile.ads.impl.q90;
import com.yandex.mobile.ads.impl.tk1;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1918f7 f32247a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n90 f32248b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final r90 f32249c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final o90 f32250d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final r2.u f32251e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final r2.u f32252f;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.feed.data.FeedItemsRepository", f = "FeedItemsRepository.kt", l = {34, 37}, m = "loadNewFeedItem")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        t90 f32253b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32254c;

        /* renamed from: e, reason: collision with root package name */
        int f32256e;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32254c = obj;
            this.f32256e |= Integer.MIN_VALUE;
            return t90.this.a(this);
        }
    }

    public t90(@NotNull C1918f7 adRequestData, @NotNull n90 loadDataSource, @NotNull r90 preloadDataSource, @NotNull o90 loadEnoughMemoryValidator) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(loadDataSource, "loadDataSource");
        Intrinsics.checkNotNullParameter(preloadDataSource, "preloadDataSource");
        Intrinsics.checkNotNullParameter(loadEnoughMemoryValidator, "loadEnoughMemoryValidator");
        this.f32247a = adRequestData;
        this.f32248b = loadDataSource;
        this.f32249c = preloadDataSource;
        this.f32250d = loadEnoughMemoryValidator;
        r2.u a4 = r2.I.a(CollectionsKt.emptyList());
        this.f32251e = a4;
        this.f32252f = a4;
    }

    @Nullable
    public final Object b(@NotNull kotlin.coroutines.d dVar) {
        return this.f32250d.a() ? a(dVar) : new tk1.a(C1942g7.o());
    }

    @NotNull
    public final r2.u a() {
        return this.f32252f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        t90 t90Var;
        q90 q90Var;
        t90 t90Var2;
        d90 d90Var;
        r2.u uVar;
        Object value;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f32256e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f32256e = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f32254c;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f32256e;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    n90 n90Var = this.f32248b;
                    C1918f7 c1918f7 = this.f32247a;
                    List<d90> list = (List) this.f32252f.getValue();
                    aVar.f32253b = this;
                    aVar.f32256e = 1;
                    obj = n90Var.a(c1918f7, list, aVar);
                    if (obj != f4) {
                        t90Var = this;
                    }
                    return f4;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t90Var2 = aVar.f32253b;
                    ResultKt.a(obj);
                    d90Var = (d90) obj;
                    uVar = t90Var2.f32251e;
                    do {
                        value = uVar.getValue();
                    } while (!uVar.b(value, CollectionsKt.plus((Collection<? extends d90>) t90Var2.f32251e.getValue(), d90Var)));
                    return new tk1.b(d90Var);
                }
                t90Var = aVar.f32253b;
                ResultKt.a(obj);
                q90Var = (q90) obj;
                if (!(q90Var instanceof q90.b)) {
                    r90 r90Var = t90Var.f32249c;
                    or0 a4 = ((q90.b) q90Var).a();
                    aVar.f32253b = t90Var;
                    aVar.f32256e = 2;
                    obj = r90Var.a(a4, aVar);
                    if (obj != f4) {
                        t90Var2 = t90Var;
                        d90Var = (d90) obj;
                        uVar = t90Var2.f32251e;
                        do {
                            value = uVar.getValue();
                        } while (!uVar.b(value, CollectionsKt.plus((Collection<? extends d90>) t90Var2.f32251e.getValue(), d90Var)));
                        return new tk1.b(d90Var);
                    }
                    return f4;
                }
                if (q90Var instanceof q90.a) {
                    return new tk1.a(((q90.a) q90Var).a());
                }
                throw new W1.m();
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f32254c;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f32256e;
        if (i4 != 0) {
        }
        q90Var = (q90) obj2;
        if (!(q90Var instanceof q90.b)) {
        }
    }
}
