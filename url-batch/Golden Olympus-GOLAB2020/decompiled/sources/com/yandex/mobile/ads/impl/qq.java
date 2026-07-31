package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import b2.AbstractC1372b;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qq {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct f30862a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30863b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final v31 f30864c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30865b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f30866c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f30867d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f30868e;

        static {
            a aVar = new a(0, "FAVICON");
            f30865b = aVar;
            a aVar2 = new a(1, "ICON");
            f30866c = aVar2;
            a aVar3 = new a(2, "THUMB");
            f30867d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f30868e = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f30868e.clone();
        }
    }

    public qq(@NotNull ct nativeAdAssets, int i4, @NotNull v31 nativeAdAdditionalViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        this.f30862a = nativeAdAssets;
        this.f30863b = i4;
        this.f30864c = nativeAdAdditionalViewProvider;
    }

    @Nullable
    public final ImageView a(@NotNull View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        return a(parentView, a.f30865b, this.f30862a.e());
    }

    @Nullable
    public final ImageView b(@NotNull View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        return a(parentView, a.f30866c, this.f30862a.g());
    }

    private final ImageView a(View container, a aVar, et etVar) {
        a aVar2;
        et g4 = this.f30862a.g();
        et e4 = this.f30862a.e();
        if (g4 != null) {
            aVar2 = a.f30866c;
        } else if (e4 != null) {
            aVar2 = a.f30865b;
        } else {
            aVar2 = a.f30867d;
        }
        if (etVar == null || aVar2 != aVar) {
            return null;
        }
        int d4 = etVar.d();
        int b4 = etVar.b();
        int i4 = this.f30863b;
        if (i4 <= d4 && i4 <= b4) {
            this.f30864c.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            return (ImageView) container.findViewById(R.id.icon_large);
        }
        this.f30864c.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        return (ImageView) container.findViewById(R.id.icon_small);
    }
}
