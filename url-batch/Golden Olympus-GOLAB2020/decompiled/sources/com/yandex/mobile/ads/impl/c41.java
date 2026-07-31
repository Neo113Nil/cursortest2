package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c92;
import com.yandex.mobile.ads.impl.o71;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c41 implements o71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f24051a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l71 f24052b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private String f24053c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private v61 f24054d;

    static final class a extends kotlin.jvm.internal.s implements Function0<Boolean> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z4) {
            super(0);
            this.f24056c = z4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(c41.this.d() && !this.f24056c);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(c41.this.d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c41(@NotNull List<? extends C2276uf<?>> assets, @NotNull l71 nativeAdsConfiguration) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(nativeAdsConfiguration, "nativeAdsConfiguration");
        this.f24051a = assets;
        this.f24052b = nativeAdsConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(c41 this$0, v61 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List<C2276uf<?>> list = this$0.f24051a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C2276uf) obj).f()) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                C2276uf<?> c2276uf = (C2276uf) obj2;
                v61 v61Var = this$0.f24054d;
                InterfaceC2299vf<?> a4 = v61Var != null ? v61Var.a(c2276uf) : null;
                if (a4 != null && a4.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(c41 this$0, v61 it) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List<C2276uf<?>> list = this$0.f24051a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((C2276uf) obj2).f()) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            C2276uf<?> c2276uf = (C2276uf) obj;
            v61 v61Var = this$0.f24054d;
            InterfaceC2299vf<?> a4 = v61Var != null ? v61Var.a(c2276uf) : null;
            if (a4 == null) {
                a4 = null;
            }
            if (a4 == null || !a4.a(c2276uf.d())) {
                break;
            }
        }
        C2276uf c2276uf2 = (C2276uf) obj;
        this$0.f24053c = c2276uf2 != null ? c2276uf2.b() : null;
        return c2276uf2 == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(c41 this$0, v61 it) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List<C2276uf<?>> list = this$0.f24051a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((C2276uf) obj2).f()) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            C2276uf<?> c2276uf = (C2276uf) obj;
            v61 v61Var = this$0.f24054d;
            InterfaceC2299vf<?> a4 = v61Var != null ? v61Var.a(c2276uf) : null;
            if (a4 == null || !a4.e()) {
                break;
            }
        }
        C2276uf c2276uf2 = (C2276uf) obj;
        this$0.f24053c = c2276uf2 != null ? c2276uf2.b() : null;
        return c2276uf2 == null;
    }

    public final boolean d() {
        return !a(new o71.a() { // from class: com.yandex.mobile.ads.impl.G0
            @Override // com.yandex.mobile.ads.impl.o71.a
            public final boolean a(v61 v61Var) {
                boolean c4;
                c4 = c41.c(c41.this, v61Var);
                return c4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(c41 this$0, v61 it) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List<C2276uf<?>> list = this$0.f24051a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((C2276uf) obj2).f()) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            C2276uf<?> c2276uf = (C2276uf) obj;
            v61 v61Var = this$0.f24054d;
            InterfaceC2299vf<?> a4 = v61Var != null ? v61Var.a(c2276uf) : null;
            if (a4 == null || !a4.b()) {
                break;
            }
        }
        C2276uf c2276uf2 = (C2276uf) obj;
        this$0.f24053c = c2276uf2 != null ? c2276uf2.b() : null;
        return c2276uf2 == null;
    }

    private final boolean a(o71.a aVar) {
        v61 v61Var = this.f24054d;
        if (v61Var == null) {
            return false;
        }
        this.f24052b.c();
        return aVar.a(v61Var);
    }

    public final boolean b() {
        return !a(new o71.a() { // from class: com.yandex.mobile.ads.impl.I0
            @Override // com.yandex.mobile.ads.impl.o71.a
            public final boolean a(v61 v61Var) {
                boolean a4;
                a4 = c41.a(c41.this, v61Var);
                return a4;
            }
        });
    }

    public final boolean c() {
        return !a(new o71.a() { // from class: com.yandex.mobile.ads.impl.H0
            @Override // com.yandex.mobile.ads.impl.o71.a
            public final boolean a(v61 v61Var) {
                boolean b4;
                b4 = c41.b(c41.this, v61Var);
                return b4;
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.o71
    public final void a(@Nullable v61 v61Var) {
        this.f24054d = v61Var;
    }

    @Override // com.yandex.mobile.ads.impl.o71
    @NotNull
    public final jq1 a() {
        return new jq1(this.f24053c, a(new o71.a() { // from class: com.yandex.mobile.ads.impl.F0
            @Override // com.yandex.mobile.ads.impl.o71.a
            public final boolean a(v61 v61Var) {
                boolean d4;
                d4 = c41.d(c41.this, v61Var);
                return d4;
            }
        }));
    }

    @Override // com.yandex.mobile.ads.impl.o71
    @NotNull
    public final c92 a(boolean z4, boolean z5) {
        c92.a aVar;
        Function0 aVar2 = z5 ? new a(z4) : new b();
        List<C2276uf<?>> list = this.f24051a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                if (((C2276uf) it.next()).f() && (i4 = i4 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            if (i4 >= 2 && b() && !z4) {
                aVar = c92.a.f24133i;
                return new c92(aVar, this.f24053c);
            }
        }
        if (((Boolean) aVar2.invoke()).booleanValue()) {
            aVar = c92.a.f24136l;
        } else if (c()) {
            aVar = c92.a.f24129e;
        } else {
            aVar = c92.a.f24127c;
        }
        return new c92(aVar, this.f24053c);
    }
}
