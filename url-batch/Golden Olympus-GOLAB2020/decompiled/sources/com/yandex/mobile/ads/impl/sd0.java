package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.impl.ew1;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sd0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f31689a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f31690b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mr f31691c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2286v2 f31692d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final dt f31693e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final tq0 f31694f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2217s2 f31695g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sd0(Context context, C2360y7 c2360y7, RelativeLayout relativeLayout, mr mrVar, C1792a1 c1792a1, int i4, C2193r1 c2193r1, C2286v2 c2286v2) {
        this(context, c2360y7, relativeLayout, mrVar, c1792a1, c2193r1, c2286v2, new i81(c2193r1, new kd0(ew1.a.a().a(context))), new tq0(context, c2360y7, mrVar, c1792a1, i4, c2193r1, c2286v2), new C2217s2(c2193r1));
        int i5 = ew1.f25476l;
    }

    @NotNull
    public final nd0 a(@NotNull Context context, @NotNull f61 nativeAdPrivate, @NotNull mr contentCloseListener) {
        ArrayList arrayList;
        q20 q20Var;
        mr mrVar;
        ds1 ds1Var;
        ArrayList arrayList2;
        q20 q20Var2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        ds1 ds1Var2 = new ds1(context, new o20(nativeAdPrivate, contentCloseListener, this.f31692d.p().c(), new w20(), new c30()), contentCloseListener);
        InterfaceC2262u1 a4 = this.f31695g.a(this.f31689a, ds1Var2);
        List<q20> c4 = nativeAdPrivate.c();
        if (c4 != null) {
            arrayList = new ArrayList();
            for (Object obj : c4) {
                if (Intrinsics.areEqual(((q20) obj).e(), w00.f33851c.a())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List<q20> c5 = nativeAdPrivate.c();
        if (c5 != null) {
            ListIterator<q20> listIterator = c5.listIterator(c5.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    q20Var2 = null;
                    break;
                }
                q20Var2 = listIterator.previous();
                if (Intrinsics.areEqual(q20Var2.e(), w00.f33852d.a())) {
                    break;
                }
            }
            q20Var = q20Var2;
        } else {
            q20Var = null;
        }
        n61 a5 = nativeAdPrivate.a();
        C2106n5 a6 = a5 != null ? a5.a() : null;
        if (!Intrinsics.areEqual(this.f31689a.x(), t00.f32103c.a()) || a6 == null) {
            mrVar = contentCloseListener;
            ds1Var = ds1Var2;
            arrayList2 = arrayList;
        } else {
            if ((nativeAdPrivate instanceof pz1) || q20Var != null) {
                dt dtVar = this.f31693e;
                return new C2175q5(context, nativeAdPrivate, dtVar, ds1Var2, arrayList, q20Var, this.f31690b, a4, contentCloseListener, this.f31694f, a6, new ExtendedNativeAdView(context), new C2239t1(nativeAdPrivate, contentCloseListener, dtVar), new rl1(), new np(), new sr1(new d52()));
            }
            mrVar = contentCloseListener;
            arrayList2 = arrayList;
            ds1Var = ds1Var2;
        }
        ArrayList arrayList3 = arrayList2;
        return new rd0(this.f31694f.a(context, this.f31690b, nativeAdPrivate, this.f31693e, new pm1(a4), ds1Var, new t42(new rl1(), new ky1(this.f31689a), new oy1(this.f31689a), new ny1(), new np()), new py1(), arrayList3 != null ? (q20) CollectionsKt.firstOrNull((List) arrayList3) : null, null), mrVar);
    }

    public sd0(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull RelativeLayout container, @NotNull mr contentCloseListener, @NotNull C1792a1 eventController, @NotNull C2193r1 adActivityListener, @NotNull C2286v2 adConfiguration, @NotNull dt adEventListener, @NotNull tq0 layoutDesignsControllerCreator, @NotNull C2217s2 adCompleteListenerCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        Intrinsics.checkNotNullParameter(layoutDesignsControllerCreator, "layoutDesignsControllerCreator");
        Intrinsics.checkNotNullParameter(adCompleteListenerCreator, "adCompleteListenerCreator");
        this.f31689a = adResponse;
        this.f31690b = container;
        this.f31691c = contentCloseListener;
        this.f31692d = adConfiguration;
        this.f31693e = adEventListener;
        this.f31694f = layoutDesignsControllerCreator;
        this.f31695g = adCompleteListenerCreator;
    }
}
