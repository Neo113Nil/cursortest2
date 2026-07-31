package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c92;
import com.yandex.mobile.ads.impl.o71;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2016ja implements o71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f27600a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l71 f27601b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<? extends String> f27602c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private String f27603d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private v61 f27604e;

    /* renamed from: com.yandex.mobile.ads.impl.ja$a */
    static final class a extends kotlin.jvm.internal.s implements Function0<Boolean> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z4) {
            super(0);
            this.f27606c = z4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C2016ja.this.e() && !this.f27606c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ja$b */
    static final class b extends kotlin.jvm.internal.s implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C2016ja.this.e());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C2016ja(List<? extends C2276uf<?>> assets, l71 nativeAdsConfiguration, Set<? extends String> rules) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(nativeAdsConfiguration, "nativeAdsConfiguration");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f27600a = assets;
        this.f27601b = nativeAdsConfiguration;
        this.f27602c = rules;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(C2016ja this$0, v61 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        List<C2276uf<?>> list = this$0.f27600a;
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
                InterfaceC2299vf<?> a4 = nativeAdViewAdapter.a((C2276uf) obj2);
                if (a4 != null && a4.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(C2016ja this$0, v61 nativeAdViewAdapter) {
        Object obj;
        InterfaceC2299vf<?> a4;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Iterator<T> it = this$0.f27600a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C2276uf c2276uf = (C2276uf) obj;
            if (c2276uf.f() && Intrinsics.areEqual(c2276uf.b(), "sponsored")) {
                break;
            }
        }
        C2276uf<?> c2276uf2 = (C2276uf) obj;
        return c2276uf2 == null || ((a4 = nativeAdViewAdapter.a(c2276uf2)) != null && a4.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(C2016ja this$0, v61 nativeAdViewAdapter) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        List<C2276uf<?>> list = this$0.f27600a;
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
            InterfaceC2299vf<?> a4 = nativeAdViewAdapter.a(c2276uf);
            if (a4 == null) {
                a4 = null;
            }
            if (a4 == null || !a4.a(c2276uf.d())) {
                break;
            }
        }
        C2276uf c2276uf2 = (C2276uf) obj;
        this$0.f27603d = c2276uf2 != null ? c2276uf2.b() : null;
        return c2276uf2 == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(C2016ja this$0, v61 nativeAdViewAdapter) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        List<C2276uf<?>> list = this$0.f27600a;
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
            InterfaceC2299vf<?> a4 = nativeAdViewAdapter.a((C2276uf) obj);
            if (a4 == null || !a4.e()) {
                break;
            }
        }
        C2276uf c2276uf = (C2276uf) obj;
        this$0.f27603d = c2276uf != null ? c2276uf.b() : null;
        return c2276uf == null;
    }

    public final boolean e() {
        return !a(new o71.a() { // from class: com.yandex.mobile.ads.impl.U7
            @Override // com.yandex.mobile.ads.impl.o71.a
            public final boolean a(v61 v61Var) {
                boolean d4;
                d4 = C2016ja.d(C2016ja.this, v61Var);
                return d4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(C2016ja this$0, v61 nativeAdViewAdapter) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        List<C2276uf<?>> list = this$0.f27600a;
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
            InterfaceC2299vf<?> a4 = nativeAdViewAdapter.a((C2276uf) obj);
            if (a4 == null || !a4.b()) {
                break;
            }
        }
        C2276uf c2276uf = (C2276uf) obj;
        this$0.f27603d = c2276uf != null ? c2276uf.b() : null;
        return c2276uf == null;
    }

    public final boolean b() {
        return !a(new o71.a() { // from class: com.yandex.mobile.ads.impl.X7
            @Override // com.yandex.mobile.ads.impl.o71.a
            public final boolean a(v61 v61Var) {
                boolean a4;
                a4 = C2016ja.a(C2016ja.this, v61Var);
                return a4;
            }
        });
    }

    public /* synthetic */ C2016ja(List list, l71 l71Var, Set set, int i4) {
        this(list, l71Var, set);
    }

    private final boolean a(o71.a aVar) {
        v61 v61Var = this.f27604e;
        if (v61Var == null) {
            return false;
        }
        this.f27601b.c();
        return aVar.a(v61Var);
    }

    public final boolean c() {
        return !a(new o71.a() { // from class: com.yandex.mobile.ads.impl.W7
            @Override // com.yandex.mobile.ads.impl.o71.a
            public final boolean a(v61 v61Var) {
                boolean b4;
                b4 = C2016ja.b(C2016ja.this, v61Var);
                return b4;
            }
        });
    }

    public final boolean d() {
        return !a(new o71.a() { // from class: com.yandex.mobile.ads.impl.V7
            @Override // com.yandex.mobile.ads.impl.o71.a
            public final boolean a(v61 v61Var) {
                boolean c4;
                c4 = C2016ja.c(C2016ja.this, v61Var);
                return c4;
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.o71
    public final void a(@Nullable v61 v61Var) {
        this.f27604e = v61Var;
    }

    @Override // com.yandex.mobile.ads.impl.o71
    @NotNull
    public final jq1 a() {
        return new jq1(this.f27603d, a(new o71.a() { // from class: com.yandex.mobile.ads.impl.T7
            @Override // com.yandex.mobile.ads.impl.o71.a
            public final boolean a(v61 v61Var) {
                boolean e4;
                e4 = C2016ja.e(C2016ja.this, v61Var);
                return e4;
            }
        }));
    }

    @Override // com.yandex.mobile.ads.impl.o71
    @NotNull
    public final c92 a(boolean z4, boolean z5) {
        Function0 aVar = z5 ? new a(z4) : new b();
        Set<? extends String> set = this.f27602c;
        c92.a status = c92.a.f24132h;
        Intrinsics.checkNotNullParameter(status, "status");
        if (set.contains(status.a()) || !c() || z4) {
            Set<? extends String> set2 = this.f27602c;
            c92.a status2 = c92.a.f24133i;
            Intrinsics.checkNotNullParameter(status2, "status");
            if (!set2.contains(status2.a())) {
                List<C2276uf<?>> list = this.f27600a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        if (((C2276uf) it.next()).f() && (i4 = i4 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                    if (i4 >= 2 && b() && !z4) {
                        status = c92.a.f24133i;
                    }
                }
            }
            Set<? extends String> set3 = this.f27602c;
            status = c92.a.f24136l;
            Intrinsics.checkNotNullParameter(status, "status");
            if (set3.contains(status.a()) || !((Boolean) aVar.invoke()).booleanValue()) {
                Set<? extends String> set4 = this.f27602c;
                status = c92.a.f24129e;
                Intrinsics.checkNotNullParameter(status, "status");
                if (set4.contains(status.a()) || !d()) {
                    status = c92.a.f24127c;
                }
            }
        }
        return new c92(status, this.f27603d);
    }
}
