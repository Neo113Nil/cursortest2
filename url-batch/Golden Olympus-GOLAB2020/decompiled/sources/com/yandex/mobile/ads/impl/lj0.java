package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lj0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ma0 f28617a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2163pg f28618b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final m02 f28619c;

    public /* synthetic */ lj0() {
        this(new ma0(), new C2163pg(), new m02());
    }

    @NotNull
    public final Set<ej0> a(@NotNull List<? extends C2276uf<?>> assets, @Nullable dr0 dr0Var) {
        Object obj;
        List emptyList;
        Object obj2;
        List<ej0> emptyList2;
        q20 c4;
        List<InterfaceC2237t> a4;
        Object obj3;
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f28618b.getClass();
        Set<ej0> mutableSet = CollectionsKt.toMutableSet(C2163pg.a(assets));
        Iterator<T> it = assets.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((C2276uf) obj).b(), "feedback")) {
                break;
            }
        }
        C2276uf c2276uf = (C2276uf) obj;
        this.f28617a.getClass();
        if (c2276uf == null || !(c2276uf.d() instanceof pa0)) {
            emptyList = CollectionsKt.emptyList();
        } else {
            List listOfNotNull = CollectionsKt.listOfNotNull(((pa0) c2276uf.d()).a());
            dr0 a5 = c2276uf.a();
            if (a5 == null || (a4 = a5.a()) == null) {
                obj2 = null;
            } else {
                Iterator<T> it2 = a4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (Intrinsics.areEqual(((InterfaceC2237t) obj3).a(), "divkit_adtune")) {
                        break;
                    }
                }
                obj2 = (InterfaceC2237t) obj3;
            }
            c20 c20Var = obj2 instanceof c20 ? (c20) obj2 : null;
            if (c20Var == null || (c4 = c20Var.c()) == null || (emptyList2 = c4.d()) == null) {
                emptyList2 = CollectionsKt.emptyList();
            }
            emptyList = CollectionsKt.plus((Collection) listOfNotNull, (Iterable) emptyList2);
        }
        mutableSet.addAll(emptyList);
        this.f28619c.getClass();
        mutableSet.addAll(m02.a(assets, dr0Var));
        return mutableSet;
    }

    public lj0(@NotNull ma0 feedbackImageProvider, @NotNull C2163pg assetsImagesProvider, @NotNull m02 socialActionImageProvider) {
        Intrinsics.checkNotNullParameter(feedbackImageProvider, "feedbackImageProvider");
        Intrinsics.checkNotNullParameter(assetsImagesProvider, "assetsImagesProvider");
        Intrinsics.checkNotNullParameter(socialActionImageProvider, "socialActionImageProvider");
        this.f28617a = feedbackImageProvider;
        this.f28618b = assetsImagesProvider;
        this.f28619c = socialActionImageProvider;
    }
}
