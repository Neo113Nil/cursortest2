package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.ironsource.b9;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class pw0 extends kg2<CustomizableMediaView, mw0> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ww0 f30594c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f30595c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f30596d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f30597e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f30598f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f30599g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ a[] f30600h;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f30601b;

        static {
            a aVar = new a(0, "WEB_VIEW", b9.h.f15449K);
            f30595c = aVar;
            a aVar2 = new a(1, "VIDEO", "video");
            f30596d = aVar2;
            a aVar3 = new a(2, "MULTIBANNER", "multibanner");
            f30597e = aVar3;
            a aVar4 = new a(3, "IMAGE", "image");
            f30598f = aVar4;
            a aVar5 = new a(4, "MEDIATION", "mediation");
            f30599g = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            f30600h = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str, String str2) {
            this.f30601b = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f30600h.clone();
        }

        @NotNull
        public final String a() {
            return this.f30601b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(@NotNull CustomizableMediaView mediaView, @NotNull ww0 mediaViewRenderController) {
        super(mediaView);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        this.f30594c = mediaViewRenderController;
    }

    public abstract void a(@NotNull CustomizableMediaView customizableMediaView);

    @Override // com.yandex.mobile.ads.impl.kg2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull CustomizableMediaView mediaView, @NotNull mw0 value) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f30594c.a(mediaView, d());
    }

    public abstract void a(@NotNull mw0 mw0Var);

    @NotNull
    public abstract a d();
}
