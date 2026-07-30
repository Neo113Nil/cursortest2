package com.anythink.basead.mixad.c;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.b.b.j;
import com.anythink.basead.d.f;
import com.anythink.basead.g.b;
import com.anythink.basead.g.h;
import com.anythink.basead.mixad.c.a.a;
import com.anythink.basead.ui.BaseATActivity;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.basead.ui.thirdparty.ThirdPartyBannerATView;
import com.anythink.basead.ui.thirdparty.ThirdPartyFullScreenATView;
import com.anythink.basead.ui.thirdparty.ThirdPartyHalfScreenATView;
import com.anythink.basead.ui.thirdparty.ThirdPartyNativeTemplateView;
import com.anythink.basead.ui.thirdparty.ThirdPartySelfRenderScreenATView;
import com.anythink.basead.ui.thirdparty.ThirdPartySplashATView;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.i;
import com.anythink.core.common.d.l;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.l.e.a.a;
import com.anythink.core.common.l.e.a.g;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.q;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b implements com.anythink.core.common.l.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9688a = "b";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.basead.mixad.c.a.a f9689b;

    /* renamed from: com.anythink.basead.mixad.c.b$2, reason: invalid class name */
    public class AnonymousClass2 extends h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.l.e.a.b f9693a;

        public AnonymousClass2(com.anythink.core.common.l.e.a.b bVar) {
            this.f9693a = bVar;
        }

        @Override // com.anythink.basead.g.h, com.anythink.basead.g.a
        public final void onAdClosed() {
            com.anythink.core.common.l.e.a.b bVar = this.f9693a;
            if (bVar != null) {
                bVar.onClose();
            }
        }

        @Override // com.anythink.basead.g.h, com.anythink.basead.g.a
        public final void onShowFailed(f fVar) {
            com.anythink.core.common.l.e.a.b bVar = this.f9693a;
            if (bVar != null) {
                if (fVar != null) {
                    bVar.onVideoError(fVar.a(), fVar.b());
                } else {
                    bVar.onVideoError("", "");
                }
            }
        }
    }

    /* renamed from: com.anythink.basead.mixad.c.b$3, reason: invalid class name */
    public class AnonymousClass3 extends i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f9695a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.l.e.a.b f9696b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ThirdPartySplashATView f9697c;

        public AnonymousClass3(boolean[] zArr, com.anythink.core.common.l.e.a.b bVar, ThirdPartySplashATView thirdPartySplashATView) {
            this.f9695a = zArr;
            this.f9696b = bVar;
            this.f9697c = thirdPartySplashATView;
        }

        @Override // com.anythink.core.common.d.i, com.anythink.core.common.d.o
        public final void onAdClicked(View view) {
            com.anythink.core.common.l.e.a.b bVar = this.f9696b;
            if (bVar != null) {
                bVar.onAdClicked(null);
            }
        }

        @Override // com.anythink.core.common.d.i, com.anythink.core.common.d.o
        public final void onAdImpressed() {
            boolean[] zArr = this.f9695a;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            com.anythink.core.common.l.e.a.b bVar = this.f9696b;
            if (bVar != null) {
                bVar.onAdImpressed();
            }
        }

        @Override // com.anythink.core.common.d.i, com.anythink.core.common.d.o
        public final void onAdVideoStart() {
            this.f9697c.disableHWVideoViewClickable();
        }

        @Override // com.anythink.core.common.d.i, com.anythink.core.common.d.o
        public final void onDeeplinkCallback(boolean z8) {
            com.anythink.core.common.l.e.a.b bVar = this.f9696b;
            if (bVar != null) {
                bVar.onDeeplinkCallback(z8);
            }
        }

        @Override // com.anythink.core.common.d.i, com.anythink.core.common.d.o
        public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            com.anythink.core.common.l.e.a.b bVar = this.f9696b;
            if (bVar != null) {
                bVar.onDownloadConfirmCallback(context, view, aTNetworkConfirmInfo);
            }
        }
    }

    /* renamed from: com.anythink.basead.mixad.c.b$4, reason: invalid class name */
    public class AnonymousClass4 extends h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.l.e.a.b f9699a;

        public AnonymousClass4(com.anythink.core.common.l.e.a.b bVar) {
            this.f9699a = bVar;
        }

        @Override // com.anythink.basead.g.h, com.anythink.basead.g.a
        public final void onAdClosed() {
            com.anythink.core.common.l.e.a.b bVar = this.f9699a;
            if (bVar != null) {
                bVar.onClose();
            }
        }
    }

    /* renamed from: com.anythink.basead.mixad.c.b$5, reason: invalid class name */
    public class AnonymousClass5 extends i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f9701a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.l.e.a.b f9702b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ThirdPartyBannerATView f9703c;

        public AnonymousClass5(boolean[] zArr, com.anythink.core.common.l.e.a.b bVar, ThirdPartyBannerATView thirdPartyBannerATView) {
            this.f9701a = zArr;
            this.f9702b = bVar;
            this.f9703c = thirdPartyBannerATView;
        }

        @Override // com.anythink.core.common.d.i, com.anythink.core.common.d.o
        public final void onAdClicked(View view) {
            com.anythink.core.common.l.e.a.b bVar = this.f9702b;
            if (bVar != null) {
                if (bVar instanceof com.anythink.core.common.l.e.a) {
                    ((com.anythink.core.common.l.e.a) bVar).setClickedArea(this.f9703c.getClickedArea());
                }
                this.f9702b.onAdClicked(null);
            }
        }

        @Override // com.anythink.core.common.d.i, com.anythink.core.common.d.o
        public final void onAdDislikeButtonClick() {
            super.onAdDislikeButtonClick();
            com.anythink.core.common.l.e.a.b bVar = this.f9702b;
            if (bVar != null) {
                bVar.onClose();
            }
        }

        @Override // com.anythink.core.common.d.i, com.anythink.core.common.d.o
        public final void onAdImpressed() {
            boolean[] zArr = this.f9701a;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            com.anythink.core.common.l.e.a.b bVar = this.f9702b;
            if (bVar != null) {
                bVar.onAdImpressed();
            }
        }

        @Override // com.anythink.core.common.d.i, com.anythink.core.common.d.o
        public final void onDeeplinkCallback(boolean z8) {
            com.anythink.core.common.l.e.a.b bVar = this.f9702b;
            if (bVar != null) {
                bVar.onDeeplinkCallback(z8);
            }
        }

        @Override // com.anythink.core.common.d.i, com.anythink.core.common.d.o
        public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            com.anythink.core.common.l.e.a.b bVar = this.f9702b;
            if (bVar != null) {
                bVar.onDownloadConfirmCallback(context, view, aTNetworkConfirmInfo);
            }
        }
    }

    /* renamed from: com.anythink.basead.mixad.c.b$6, reason: invalid class name */
    public class AnonymousClass6 implements BaseMediaATView.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.l.e.a.b f9705a;

        public AnonymousClass6(com.anythink.core.common.l.e.a.b bVar) {
            this.f9705a = bVar;
        }

        @Override // com.anythink.basead.ui.BaseMediaATView.a
        public final void onClickCloseView() {
            com.anythink.core.common.l.e.a.b bVar = this.f9705a;
            if (bVar != null) {
                bVar.onAdDislikeButtonClick();
            }
        }
    }

    public b(com.anythink.basead.mixad.c.a.a aVar) {
        this.f9689b = aVar;
    }

    private static ATNativeAdInfo a(ATNativeAdCustomRender aTNativeAdCustomRender, BaseAd baseAd) {
        c cVar = new c(baseAd);
        cVar.a(new a(baseAd));
        cVar.a(aTNativeAdCustomRender);
        return cVar;
    }

    private com.anythink.core.common.l.e.a.c b(com.anythink.basead.mixad.c.a.a aVar, BaseAd baseAd, Context context, x xVar, w<?> wVar) {
        if (aVar == null) {
            return null;
        }
        ThirdPartyNativeTemplateView thirdPartyNativeTemplateView = new ThirdPartyNativeTemplateView(context, wVar, xVar, true, new AnonymousClass6(aVar.h()), baseAd);
        thirdPartyNativeTemplateView.init(aVar.k(), aVar.l(), xVar.f14325o.bi());
        thirdPartyNativeTemplateView.setLayoutParams(new ViewGroup.LayoutParams(thirdPartyNativeTemplateView.getMediaViewWidth(), thirdPartyNativeTemplateView.getMediaViewHeight()));
        return thirdPartyNativeTemplateView;
    }

    public b(com.anythink.core.common.l.d.a aVar) {
        if (aVar == null) {
            return;
        }
        BaseAd b9 = aVar.b();
        if (b9 instanceof com.anythink.core.common.l.g.d) {
            Context a9 = aVar.a();
            ATNativeAdCustomRender c4 = aVar.c();
            com.anythink.core.common.l.g.d dVar = (com.anythink.core.common.l.g.d) b9;
            com.anythink.basead.mixad.e.a aVar2 = new com.anythink.basead.mixad.e.a(dVar);
            com.anythink.basead.mixad.e.b bVar = new com.anythink.basead.mixad.e.b(dVar, aVar.g(), aVar.e());
            a.C0042a a10 = new a.C0042a().a(a9);
            c cVar = new c(b9);
            cVar.a(new a(b9));
            cVar.a(c4);
            this.f9689b = a10.a(cVar).a(aVar2).a(bVar).b(aVar.h()).a(aVar.d()).b(aVar.j()).c(aVar.k()).a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.anythink.core.api.ATNativeAdInfo, com.anythink.core.common.l.e.a.g] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.anythink.core.api.ATNativeAdCustomRender] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // com.anythink.core.common.l.e.a.a
    public final com.anythink.core.common.l.e.a.c a() {
        char c4;
        int i;
        com.anythink.basead.mixad.e.c cVar;
        int i4;
        boolean z8;
        boolean z9;
        int i9;
        com.anythink.core.common.l.a aVar;
        ?? r52;
        com.anythink.basead.mixad.c.a.a aVar2;
        ?? r11;
        int a9;
        com.anythink.basead.mixad.c.a.a aVar3 = this.f9689b;
        if (aVar3 == null) {
            return null;
        }
        try {
            x b9 = aVar3.b();
            w<?> c9 = this.f9689b.c();
            Context j9 = this.f9689b.j();
            int f6 = this.f9689b.f();
            String e6 = this.f9689b.e();
            if (j9 == null || b9 == null || c9 == null) {
                return null;
            }
            if (j9 instanceof Activity) {
                try {
                    j9 = (Context) new WeakReference(j9).get();
                } catch (Throwable th) {
                    th = th;
                    i = -1;
                    c4 = 0;
                    e.b("createView error:".concat(String.valueOf(i)), th.getMessage() + ", " + q.a(th.getStackTrace()), t.b().r());
                    th.getStackTrace()[c4].toString();
                    return null;
                }
            }
            Context context = j9;
            y yVar = b9.f14325o;
            if (yVar instanceof com.anythink.basead.mixad.e.c) {
                cVar = (com.anythink.basead.mixad.e.c) yVar;
                z9 = cVar.a();
                i9 = cVar.b();
                i4 = cVar.c();
                z8 = 2;
            } else {
                cVar = null;
                i4 = 2;
                z8 = 2;
                z9 = true;
                i9 = 1;
            }
            int i10 = b9.f14320j;
            c4 = 0;
            try {
                ?? r22 = (g) this.f9689b.a();
                int i11 = i9;
                BaseAd a10 = r22.a();
                com.anythink.basead.mixad.shake.a aVar4 = new com.anythink.basead.mixad.shake.a(context, a10, cVar);
                r22.a(aVar4);
                ?? d2 = r22.d();
                try {
                    if (d2 != 0 && !z9) {
                        try {
                            View i12 = this.f9689b.i();
                            if (i12 == null) {
                                i12 = d2.getMediationViewFromNativeAd(r22, l.a(a10, r22.b()));
                            }
                            if (i12 != null) {
                                ThirdPartySelfRenderScreenATView thirdPartySelfRenderScreenATView = new ThirdPartySelfRenderScreenATView(context, b9, c9, e6, i10, f6, a10, i12, r22.c());
                                if (!String.valueOf(i10).equals("2")) {
                                    if (String.valueOf(i10).equals("4")) {
                                    }
                                    return thirdPartySelfRenderScreenATView;
                                }
                                thirdPartySelfRenderScreenATView.setMixNativeAdEventListener(this.f9689b.h());
                                thirdPartySelfRenderScreenATView.init();
                                return thirdPartySelfRenderScreenATView;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r22 = i10;
                            i = r22;
                            e.b("createView error:".concat(String.valueOf(i)), th.getMessage() + ", " + q.a(th.getStackTrace()), t.b().r());
                            th.getStackTrace()[c4].toString();
                            return null;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    String valueOf = String.valueOf(i10);
                    if (i4 == 1) {
                        switch (valueOf.hashCode()) {
                            case 50:
                                if (valueOf.equals("2")) {
                                    r11 = z8;
                                    break;
                                }
                                r11 = -1;
                                break;
                            case 51:
                                if (valueOf.equals("3")) {
                                    r11 = 0;
                                    break;
                                }
                                r11 = -1;
                                break;
                            case 52:
                                if (valueOf.equals("4")) {
                                    r11 = 1;
                                    break;
                                }
                                r11 = -1;
                                break;
                            default:
                                r11 = -1;
                                break;
                        }
                        if (r11 != 0 && r11 != 1) {
                            a9 = r11 != z8 ? 0 : q.a(context, 50.0f);
                        } else {
                            a9 = q.a(context, 148.0f);
                        }
                        aVar = aVar4.a(a9, a9, null);
                    } else {
                        aVar = null;
                    }
                    switch (valueOf.hashCode()) {
                        case j.f5973W /* 48 */:
                            if (valueOf.equals("0")) {
                                r52 = 3;
                                break;
                            }
                            r52 = -1;
                            break;
                        case j.f5974X /* 49 */:
                        default:
                            r52 = -1;
                            break;
                        case 50:
                            if (valueOf.equals("2")) {
                                r52 = z8;
                                break;
                            }
                            r52 = -1;
                            break;
                        case 51:
                            if (valueOf.equals("3")) {
                                r52 = 0;
                                break;
                            }
                            r52 = -1;
                            break;
                        case 52:
                            if (valueOf.equals("4")) {
                                r52 = 1;
                                break;
                            }
                            r52 = -1;
                            break;
                    }
                    if (r52 == 0) {
                        if (i11 == 1) {
                            return new ThirdPartyFullScreenATView(context, b9, c9, e6, i10, f6, a10, aVar);
                        }
                        return new ThirdPartyHalfScreenATView(context, b9, c9, e6, i10, f6, a10, aVar);
                    }
                    if (r52 == 1) {
                        com.anythink.basead.mixad.c.a.a aVar5 = this.f9689b;
                        if (aVar5 == null) {
                            return null;
                        }
                        com.anythink.core.common.l.e.a.b h9 = aVar5.h();
                        ThirdPartySplashATView thirdPartySplashATView = new ThirdPartySplashATView(context, b9, c9, new AnonymousClass2(h9), "", a10, aVar);
                        a10.setNativeEventListener(new AnonymousClass3(new boolean[]{false}, h9, thirdPartySplashATView));
                        thirdPartySplashATView.setDontCountDown(aVar5.g());
                        return thirdPartySplashATView;
                    }
                    if (r52 != z8) {
                        if (r52 != 3 || (aVar2 = this.f9689b) == null) {
                            return null;
                        }
                        ThirdPartyNativeTemplateView thirdPartyNativeTemplateView = new ThirdPartyNativeTemplateView(context, c9, b9, true, new AnonymousClass6(aVar2.h()), a10);
                        thirdPartyNativeTemplateView.init(aVar2.k(), aVar2.l(), b9.f14325o.bi());
                        thirdPartyNativeTemplateView.setLayoutParams(new ViewGroup.LayoutParams(thirdPartyNativeTemplateView.getMediaViewWidth(), thirdPartyNativeTemplateView.getMediaViewHeight()));
                        return thirdPartyNativeTemplateView;
                    }
                    com.anythink.basead.mixad.c.a.a aVar6 = this.f9689b;
                    if (aVar6 == null) {
                        return null;
                    }
                    com.anythink.core.common.l.e.a.b h10 = aVar6.h();
                    ThirdPartyBannerATView thirdPartyBannerATView = new ThirdPartyBannerATView(context, a10, b9, c9, new AnonymousClass4(h10));
                    a10.setNativeEventListener(new AnonymousClass5(new boolean[]{false}, h10, thirdPartyBannerATView));
                    return thirdPartyBannerATView;
                } catch (Throwable th4) {
                    th = th4;
                    i10 = i10;
                    i = i10;
                    e.b("createView error:".concat(String.valueOf(i)), th.getMessage() + ", " + q.a(th.getStackTrace()), t.b().r());
                    th.getStackTrace()[c4].toString();
                    return null;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            c4 = 0;
            i = -1;
        }
    }

    @Override // com.anythink.core.common.l.e.a.a
    public final void a(Activity activity, com.anythink.core.basead.b.c cVar, a.InterfaceC0082a interfaceC0082a) {
        com.anythink.basead.mixad.c.a.a aVar;
        View mediationViewFromNativeAd;
        if (activity == null || cVar == null || (aVar = this.f9689b) == null) {
            return;
        }
        cVar.f12076c = aVar.c();
        cVar.f12081h = this.f9689b.b();
        final String str = cVar.f12077d;
        final com.anythink.core.common.l.e.a.b h9 = this.f9689b.h();
        com.anythink.basead.g.b.a().a(str, new b.AbstractC0041b() { // from class: com.anythink.basead.mixad.c.b.1
            @Override // com.anythink.basead.g.b.AbstractC0041b
            public final void a(com.anythink.basead.g.j jVar) {
                com.anythink.core.common.l.e.a.b bVar = h9;
                if (bVar != null) {
                    bVar.onAdImpressed();
                }
            }

            @Override // com.anythink.basead.g.b.AbstractC0041b
            public final void b() {
                com.anythink.core.common.l.e.a.b bVar = h9;
                if (bVar != null) {
                    bVar.onAdVideoEnd();
                }
            }

            @Override // com.anythink.basead.g.b.AbstractC0041b
            public final void c() {
            }

            @Override // com.anythink.basead.g.b.AbstractC0041b
            public final void d() {
                com.anythink.basead.g.b.a().b(str);
                com.anythink.core.common.l.e.a.b bVar = h9;
                if (bVar != null) {
                    bVar.onClose();
                }
            }

            @Override // com.anythink.basead.g.b.AbstractC0041b
            public final void a(f fVar) {
                com.anythink.core.common.l.e.a.b bVar = h9;
                if (bVar != null) {
                    if (fVar != null) {
                        bVar.onVideoError(fVar.a(), fVar.b());
                    } else {
                        bVar.onVideoError("", "");
                    }
                }
            }

            @Override // com.anythink.basead.g.b.AbstractC0041b
            public final void b(com.anythink.basead.g.j jVar) {
                com.anythink.core.common.l.e.a.b bVar = h9;
                if ((bVar instanceof com.anythink.core.common.l.e.a) && jVar != null) {
                    ((com.anythink.core.common.l.e.a) bVar).setClickedArea(jVar.f9140b);
                }
                com.anythink.core.common.l.e.a.b bVar2 = h9;
                if (bVar2 != null) {
                    bVar2.onAdClicked(null);
                }
            }

            @Override // com.anythink.basead.g.b.AbstractC0041b
            public final void a() {
                com.anythink.core.common.l.e.a.b bVar = h9;
                if (bVar != null) {
                    bVar.onAdVideoStart();
                }
            }

            @Override // com.anythink.basead.g.b.AbstractC0041b
            public final void a(boolean z8) {
                com.anythink.core.common.l.e.a.b bVar = h9;
                if (bVar != null) {
                    bVar.onDeeplinkCallback(z8);
                }
            }
        });
        com.anythink.basead.mixad.a.a().a(str, interfaceC0082a);
        com.anythink.basead.mixad.a.a().a(str, this.f9689b);
        com.anythink.basead.mixad.c.a.a aVar2 = this.f9689b;
        if (aVar2 != null) {
            y yVar = aVar2.b().f14325o;
            if ((yVar instanceof com.anythink.basead.mixad.e.c) && !((com.anythink.basead.mixad.e.c) yVar).a()) {
                ATNativeAdInfo a9 = aVar2.a();
                if (a9 instanceof g) {
                    g gVar = (g) a9;
                    BaseAd a10 = gVar.a();
                    ATNativeAdCustomRender d2 = gVar.d();
                    if (d2 != null && (mediationViewFromNativeAd = d2.getMediationViewFromNativeAd(a9, l.a(a10, gVar.b()))) != null) {
                        aVar2.a(mediationViewFromNativeAd);
                        cVar.f12082j = true;
                    }
                }
            }
        }
        BaseATActivity.a(activity, cVar);
    }

    private static int a(Context context, String str) {
        str.getClass();
        switch (str) {
            case "2":
                return q.a(context, 50.0f);
            case "3":
            case "4":
                return q.a(context, 148.0f);
            default:
                return 0;
        }
    }

    private com.anythink.core.common.l.e.a.c a(com.anythink.basead.mixad.c.a.a aVar, BaseAd baseAd, Context context, x xVar, w wVar, com.anythink.core.common.l.a aVar2) {
        if (aVar == null) {
            return null;
        }
        com.anythink.core.common.l.e.a.b h9 = aVar.h();
        ThirdPartySplashATView thirdPartySplashATView = new ThirdPartySplashATView(context, xVar, wVar, new AnonymousClass2(h9), "", baseAd, aVar2);
        baseAd.setNativeEventListener(new AnonymousClass3(new boolean[]{false}, h9, thirdPartySplashATView));
        thirdPartySplashATView.setDontCountDown(aVar.g());
        return thirdPartySplashATView;
    }

    private com.anythink.core.common.l.e.a.c a(com.anythink.basead.mixad.c.a.a aVar, BaseAd baseAd, Context context, x xVar, w<?> wVar) {
        if (aVar == null) {
            return null;
        }
        com.anythink.core.common.l.e.a.b h9 = aVar.h();
        ThirdPartyBannerATView thirdPartyBannerATView = new ThirdPartyBannerATView(context, baseAd, xVar, wVar, new AnonymousClass4(h9));
        baseAd.setNativeEventListener(new AnonymousClass5(new boolean[]{false}, h9, thirdPartyBannerATView));
        return thirdPartyBannerATView;
    }

    private static boolean a(com.anythink.basead.mixad.c.a.a aVar) {
        View mediationViewFromNativeAd;
        if (aVar == null) {
            return false;
        }
        y yVar = aVar.b().f14325o;
        if ((yVar instanceof com.anythink.basead.mixad.e.c) && !((com.anythink.basead.mixad.e.c) yVar).a()) {
            ATNativeAdInfo a9 = aVar.a();
            if (a9 instanceof g) {
                g gVar = (g) a9;
                BaseAd a10 = gVar.a();
                ATNativeAdCustomRender d2 = gVar.d();
                if (d2 != null && (mediationViewFromNativeAd = d2.getMediationViewFromNativeAd(a9, l.a(a10, gVar.b()))) != null) {
                    aVar.a(mediationViewFromNativeAd);
                    return true;
                }
            }
        }
        return false;
    }
}
