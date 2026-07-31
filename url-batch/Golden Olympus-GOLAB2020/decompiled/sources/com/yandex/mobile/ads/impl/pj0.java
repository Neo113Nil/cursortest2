package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pj0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lj0 f30463a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hb1 f30464b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Set<ej0> f30465a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Set<ej0> f30466b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Set<ej0> f30467c;

        public a(@NotNull HashSet imagesToLoad, @NotNull Set imagesToLoadPreview, @NotNull Set imagesToLoadInBack) {
            Intrinsics.checkNotNullParameter(imagesToLoad, "imagesToLoad");
            Intrinsics.checkNotNullParameter(imagesToLoadPreview, "imagesToLoadPreview");
            Intrinsics.checkNotNullParameter(imagesToLoadInBack, "imagesToLoadInBack");
            this.f30465a = imagesToLoad;
            this.f30466b = imagesToLoadPreview;
            this.f30467c = imagesToLoadInBack;
        }

        @NotNull
        public final Set<ej0> a() {
            return this.f30465a;
        }

        @NotNull
        public final Set<ej0> b() {
            return this.f30466b;
        }

        @NotNull
        public final Set<ej0> c() {
            return this.f30467c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f30465a, aVar.f30465a) && Intrinsics.areEqual(this.f30466b, aVar.f30466b) && Intrinsics.areEqual(this.f30467c, aVar.f30467c);
        }

        public final int hashCode() {
            return this.f30467c.hashCode() + ((this.f30466b.hashCode() + (this.f30465a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Images(imagesToLoad=" + this.f30465a + ", imagesToLoadPreview=" + this.f30466b + ", imagesToLoadInBack=" + this.f30467c + ")";
        }
    }

    public /* synthetic */ pj0() {
        this(new lj0(), new hb1());
    }

    @NotNull
    public final a a(@NotNull h41 nativeAdBlock) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        C2360y7<?> b4 = nativeAdBlock.b();
        n61 nativeAdResponse = nativeAdBlock.c();
        List<u31> nativeAds = nativeAdResponse.e();
        lj0 lj0Var = this.f30463a;
        lj0Var.getClass();
        Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(nativeAds, 10));
        for (u31 u31Var : nativeAds) {
            arrayList.add(lj0Var.a(u31Var.b(), u31Var.e()));
        }
        Set set = CollectionsKt.toSet(CollectionsKt.flatten(arrayList));
        this.f30463a.getClass();
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        List<q20> c4 = nativeAdResponse.c();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = c4.iterator();
        while (it.hasNext()) {
            List<ej0> d4 = ((q20) it.next()).d();
            if (d4 != null) {
                arrayList2.add(d4);
            }
        }
        Set j4 = kotlin.collections.T.j(set, CollectionsKt.toSet(CollectionsKt.flatten(arrayList2)));
        Set<ej0> c5 = this.f30464b.c(nativeAdResponse);
        Set j5 = kotlin.collections.T.j(j4, c5);
        if (!b4.R()) {
            j4 = null;
        }
        if (j4 == null) {
            j4 = kotlin.collections.T.e();
        }
        Set j6 = kotlin.collections.T.j(c5, j4);
        HashSet hashSet = new HashSet();
        for (Object obj : j6) {
            if (((ej0) obj).b()) {
                hashSet.add(obj);
            }
        }
        return new a(hashSet, j5, kotlin.collections.T.i(j5, hashSet));
    }

    public pj0(@NotNull lj0 imageValuesProvider, @NotNull hb1 nativeVideoUrlsProvider) {
        Intrinsics.checkNotNullParameter(imageValuesProvider, "imageValuesProvider");
        Intrinsics.checkNotNullParameter(nativeVideoUrlsProvider, "nativeVideoUrlsProvider");
        this.f30463a = imageValuesProvider;
        this.f30464b = nativeVideoUrlsProvider;
    }
}
