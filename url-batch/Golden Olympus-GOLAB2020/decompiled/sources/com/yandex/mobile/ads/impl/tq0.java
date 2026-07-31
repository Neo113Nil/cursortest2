package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tq0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f32550a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mr f32551b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1792a1 f32552c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32553d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f32554e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2286v2 f32555f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final uq0 f32556g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final sv f32557h;

    public /* synthetic */ tq0(Context context, C2360y7 c2360y7, mr mrVar, C1792a1 c1792a1, int i4, C2193r1 c2193r1, C2286v2 c2286v2) {
        this(context, c2360y7, mrVar, c1792a1, i4, c2193r1, c2286v2, new uq0(), new uv(context, c2286v2, new xq1().b(c2360y7, c2286v2)).a());
    }

    @NotNull
    public final sq0<ExtendedNativeAdView> a(@NotNull Context context, @NotNull ViewGroup container, @NotNull f61 f61Var, @NotNull dt dtVar, @NotNull InterfaceC2194r2 adCompleteListener, @NotNull ds1 closeVerificationController, @NotNull t42 timeProviderContainer, @NotNull a20 divKitActionHandlerDelegate, @Nullable q20 q20Var, @Nullable C2243t5 c2243t5) {
        Context context2 = context;
        f61 nativeAdPrivate = f61Var;
        dt nativeAdEventListener = dtVar;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "adEventListener");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(closeVerificationController, "closeVerificationController");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        C2286v2 adConfiguration = this.f32555f;
        C2360y7<?> adResponse = this.f32550a;
        InterfaceC1912f1 adActivityListener = this.f32554e;
        int i4 = this.f32553d;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        List<td0> designCreators = (adResponse.n() == gs.f26282f ? new js1(adConfiguration, adActivityListener, new fs1(adConfiguration, adActivityListener, i4)) : new mp0(adConfiguration, adActivityListener, new lp0(adConfiguration, adActivityListener, i4), new r41())).a(context2, this.f32550a, nativeAdPrivate, this.f32551b, nativeAdEventListener, this.f32552c, this.f32557h, adCompleteListener, closeVerificationController, timeProviderContainer, divKitActionHandlerDelegate, q20Var, c2243t5);
        uq0 uq0Var = this.f32556g;
        C2360y7<?> adResponse2 = this.f32550a;
        mr contentCloseListener = this.f32551b;
        C1792a1 eventController = this.f32552c;
        uq0Var.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(adResponse2, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(designCreators, "designCreators");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(designCreators, 10));
        Iterator<T> it = designCreators.iterator();
        while (it.hasNext()) {
            arrayList.add(((td0) it.next()).a(context2, adResponse2, nativeAdPrivate, contentCloseListener, nativeAdEventListener, eventController));
            context2 = context;
            nativeAdPrivate = f61Var;
            nativeAdEventListener = dtVar;
        }
        return new sq0<>(context, container, arrayList, new rq0(arrayList), new pq0(), new oq0());
    }

    public tq0(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull mr contentCloseListener, @NotNull C1792a1 eventController, int i4, @NotNull C2193r1 adActivityListener, @NotNull C2286v2 adConfiguration, @NotNull uq0 layoutDesignsProvider, @NotNull sv debugEventsReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(layoutDesignsProvider, "layoutDesignsProvider");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        this.f32550a = adResponse;
        this.f32551b = contentCloseListener;
        this.f32552c = eventController;
        this.f32553d = i4;
        this.f32554e = adActivityListener;
        this.f32555f = adConfiguration;
        this.f32556g = layoutDesignsProvider;
        this.f32557h = debugEventsReporter;
    }

    @NotNull
    public final ArrayList a(@NotNull Context context, @NotNull ExtendedNativeAdView extendedNativeAdView, @NotNull f61 nativeAdPrivate, @NotNull dt adEventListener, @NotNull InterfaceC2194r2 interfaceC2194r2, @NotNull ds1 ds1Var, @NotNull rl1 progressIncrementer, @NotNull C2220s5 c2220s5, @Nullable ArrayList arrayList, @Nullable q20 q20Var, @NotNull C2106n5 c2106n5, @NotNull np npVar) {
        ArrayList arrayList2;
        C2129o5 c2129o5;
        long j4;
        Context context2;
        ds1 ds1Var2;
        q20 q20Var2;
        C2106n5 adPod = c2106n5;
        Context context3 = context;
        Intrinsics.checkNotNullParameter(context3, "context");
        ExtendedNativeAdView container = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        InterfaceC2194r2 adCompleteListener = interfaceC2194r2;
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        ds1 closeVerificationController = ds1Var;
        Intrinsics.checkNotNullParameter(closeVerificationController, "closeVerificationController");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        C2220s5 divKitActionHandlerDelegate = c2220s5;
        Intrinsics.checkNotNullParameter(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        Intrinsics.checkNotNullParameter(adPod, "adPod");
        np closeTimerProgressIncrementer = npVar;
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        int i4 = 0;
        if (nativeAdPrivate instanceof pz1) {
            pz1 pz1Var = (pz1) nativeAdPrivate;
            List<C2243t5> b4 = adPod.b();
            ArrayList d4 = pz1Var.d();
            ArrayList arrayList3 = new ArrayList();
            int size = d4.size();
            while (i4 < size) {
                C2243t5 c2243t5 = (C2243t5) CollectionsKt.getOrNull(b4, i4);
                ArrayList arrayList4 = d4;
                C2129o5 c2129o52 = new C2129o5(b4);
                ArrayList arrayList5 = arrayList3;
                if (c2243t5 != null) {
                    c2129o5 = c2129o52;
                    j4 = c2243t5.a();
                } else {
                    c2129o5 = c2129o52;
                    j4 = 0;
                }
                C2197r5 c2197r5 = new C2197r5(j4);
                int i5 = size;
                C2129o5 c2129o53 = c2129o5;
                List<C2243t5> list = b4;
                pz1 pz1Var2 = pz1Var;
                int i6 = i4;
                t42 t42Var = new t42(progressIncrementer, c2129o53, c2197r5, new C2152p5(adPod, i4), closeTimerProgressIncrementer);
                f61 f61Var = (f61) arrayList4.get(i6);
                z22 z22Var = new z22(adEventListener);
                if (arrayList != null) {
                    ds1 ds1Var3 = closeVerificationController;
                    q20Var2 = (q20) CollectionsKt.getOrNull(arrayList, i6);
                    context2 = context3;
                    ds1Var2 = ds1Var3;
                } else {
                    context2 = context3;
                    ds1Var2 = closeVerificationController;
                    q20Var2 = null;
                }
                arrayList5.add(a(context2, container, f61Var, z22Var, adCompleteListener, ds1Var2, t42Var, divKitActionHandlerDelegate, q20Var2, c2243t5));
                i4 = i6 + 1;
                context3 = context;
                container = extendedNativeAdView;
                b4 = list;
                adCompleteListener = interfaceC2194r2;
                closeVerificationController = ds1Var;
                divKitActionHandlerDelegate = c2220s5;
                closeTimerProgressIncrementer = npVar;
                arrayList3 = arrayList5;
                d4 = arrayList4;
                size = i5;
                pz1Var = pz1Var2;
                adPod = c2106n5;
            }
            pz1 pz1Var3 = pz1Var;
            ArrayList arrayList6 = arrayList3;
            C2243t5 c2243t52 = (C2243t5) CollectionsKt.getOrNull(b4, d4.size());
            t42 t42Var2 = new t42(progressIncrementer, new C2129o5(b4), new C2197r5(c2243t52 != null ? c2243t52.a() : 0L), new of1(), npVar);
            if (q20Var != null) {
                arrayList2 = arrayList6;
                r16 = a(context, extendedNativeAdView, pz1Var3, adEventListener, interfaceC2194r2, ds1Var, t42Var2, c2220s5, q20Var, c2243t52);
            } else {
                arrayList2 = arrayList6;
            }
            sq0<ExtendedNativeAdView> sq0Var = r16;
            if (sq0Var != null) {
                arrayList2.add(sq0Var);
            }
            return arrayList2;
        }
        List<C2243t5> b5 = c2106n5.b();
        ArrayList arrayList7 = new ArrayList();
        C2129o5 c2129o54 = new C2129o5(b5);
        C2243t5 c2243t53 = (C2243t5) CollectionsKt.firstOrNull((List) b5);
        arrayList7.add(a(context, extendedNativeAdView, nativeAdPrivate, adEventListener, interfaceC2194r2, ds1Var, new t42(progressIncrementer, c2129o54, new C2197r5(c2243t53 != null ? c2243t53.a() : 0L), new C2152p5(c2106n5, 0), npVar), c2220s5, arrayList != null ? (q20) CollectionsKt.firstOrNull((List) arrayList) : null, (C2243t5) CollectionsKt.firstOrNull((List) b5)));
        C2243t5 c2243t54 = (C2243t5) CollectionsKt.getOrNull(b5, 1);
        sq0<ExtendedNativeAdView> a4 = q20Var != null ? a(context, extendedNativeAdView, nativeAdPrivate, adEventListener, interfaceC2194r2, ds1Var, new t42(progressIncrementer, new C2129o5(b5), new C2197r5(c2243t54 != null ? c2243t54.a() : 0L), new of1()), c2220s5, q20Var, c2243t54) : null;
        if (a4 != null) {
            arrayList7.add(a4);
        }
        return arrayList7;
    }
}
