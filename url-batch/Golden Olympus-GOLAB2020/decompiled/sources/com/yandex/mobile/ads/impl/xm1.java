package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.qi0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xm1 implements nm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wd2 f34622a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C2276uf<ej0> f34623b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final C2276uf<no> f34624c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f34625d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ym1 f34626e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ew1 f34627f;

    private static final class a implements qi0.b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ m2.h[] f34628c = {C1873da.a(a.class, "weekQrcodeContainer", "getWeekQrcodeContainer()Landroid/view/ViewGroup;", 0), C1873da.a(a.class, "weekQrcodeImageView", "getWeekQrcodeImageView()Landroid/widget/ImageView;", 0)};

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ao1 f34629a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ao1 f34630b;

        public a(@NotNull db2 uiElements) {
            Intrinsics.checkNotNullParameter(uiElements, "uiElements");
            this.f34629a = bo1.a(uiElements.k());
            this.f34630b = bo1.a(uiElements.l());
        }

        @Override // com.yandex.mobile.ads.impl.qi0.b
        public final void a(@Nullable Bitmap bitmap) {
            if (bitmap == null) {
                ao1 ao1Var = this.f34629a;
                m2.h[] hVarArr = f34628c;
                ViewGroup viewGroup = (ViewGroup) ao1Var.getValue(this, hVarArr[0]);
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                ImageView imageView = (ImageView) this.f34630b.getValue(this, hVarArr[1]);
                if (imageView == null) {
                    return;
                }
                imageView.setVisibility(8);
                return;
            }
            ao1 ao1Var2 = this.f34630b;
            m2.h[] hVarArr2 = f34628c;
            ImageView imageView2 = (ImageView) ao1Var2.getValue(this, hVarArr2[1]);
            if (imageView2 != null) {
                imageView2.setImageBitmap(bitmap);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f34629a.getValue(this, hVarArr2[0]);
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            ImageView imageView3 = (ImageView) this.f34630b.getValue(this, hVarArr2[1]);
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(0);
        }
    }

    public xm1(@NotNull Context context, @NotNull zi0 imageProvider, @NotNull wd2 videoClicks, @Nullable C2276uf<ej0> c2276uf, @Nullable C2276uf<no> c2276uf2, @NotNull Context applicationContext, @NotNull ym1 qrcodeLoader, @NotNull ew1 settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(videoClicks, "videoClicks");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(qrcodeLoader, "qrcodeLoader");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f34622a = videoClicks;
        this.f34623b = c2276uf;
        this.f34624c = c2276uf2;
        this.f34625d = applicationContext;
        this.f34626e = qrcodeLoader;
        this.f34627f = settings;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        no noVar;
        Integer A4;
        ej0 d4;
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        Context context = this.f34625d;
        C2276uf<no> c2276uf = this.f34624c;
        String str = null;
        if (c2276uf == null || (noVar = c2276uf.d()) == null) {
            du1 a4 = this.f34627f.a(context);
            if (a4 != null && (A4 = a4.A()) != null) {
                if (A4.intValue() == 0) {
                    A4 = null;
                }
                if (A4 != null) {
                    noVar = new no(A4.intValue(), "https://www.yandex.ru/ads/qr/gen");
                }
            }
            noVar = null;
        }
        if (noVar == null) {
            ViewGroup k4 = uiElements.k();
            if (k4 != null) {
                k4.setVisibility(8);
            }
            ImageView l4 = uiElements.l();
            if (l4 == null) {
                return;
            }
            l4.setVisibility(8);
            return;
        }
        String a5 = this.f34622a.a();
        if (a5 != null) {
            if (a5.length() <= 0) {
                a5 = null;
            }
            if (a5 != null) {
                C2276uf<ej0> c2276uf2 = this.f34623b;
                if (c2276uf2 != null && (d4 = c2276uf2.d()) != null) {
                    str = d4.f();
                }
                this.f34626e.a(noVar, a5, str, new a(uiElements));
                return;
            }
        }
        ViewGroup k5 = uiElements.k();
        if (k5 != null) {
            k5.setVisibility(8);
        }
        ImageView l5 = uiElements.l();
        if (l5 == null) {
            return;
        }
        l5.setVisibility(8);
    }
}
