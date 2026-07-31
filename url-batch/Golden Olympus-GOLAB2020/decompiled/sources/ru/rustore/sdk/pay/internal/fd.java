package ru.rustore.sdk.pay.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.fd;
import ru.rustore.sdk.pay.internal.gl;
import ru.rustore.sdk.pay.internal.h3;
import ru.rustore.sdk.pay.internal.h4;
import ru.rustore.sdk.pay.internal.kd;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.Observable;
import ru.rustore.sdk.reactive.observable.ObservableObserveOnKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class fd extends Fragment {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f44062g0 = 0;

    /* renamed from: A, reason: collision with root package name */
    @Nullable
    public View f44063A;

    /* renamed from: B, reason: collision with root package name */
    @Nullable
    public View f44064B;

    /* renamed from: C, reason: collision with root package name */
    @Nullable
    public LinearLayout f44065C;

    /* renamed from: D, reason: collision with root package name */
    @Nullable
    public RecyclerView f44066D;

    /* renamed from: E, reason: collision with root package name */
    @Nullable
    public FrameLayout f44067E;

    /* renamed from: F, reason: collision with root package name */
    @Nullable
    public Button f44068F;

    /* renamed from: G, reason: collision with root package name */
    @Nullable
    public FrameLayout f44069G;

    /* renamed from: H, reason: collision with root package name */
    @Nullable
    public TextView f44070H;

    /* renamed from: I, reason: collision with root package name */
    @Nullable
    public FrameLayout f44071I;

    /* renamed from: J, reason: collision with root package name */
    @Nullable
    public TextView f44072J;

    /* renamed from: K, reason: collision with root package name */
    @Nullable
    public y9 f44073K;

    /* renamed from: L, reason: collision with root package name */
    @Nullable
    public TextView f44074L;

    /* renamed from: M, reason: collision with root package name */
    @Nullable
    public TextView f44075M;

    /* renamed from: N, reason: collision with root package name */
    @Nullable
    public TextView f44076N;

    /* renamed from: O, reason: collision with root package name */
    @Nullable
    public View f44077O;

    /* renamed from: P, reason: collision with root package name */
    @Nullable
    public TextView f44078P;

    /* renamed from: Q, reason: collision with root package name */
    @Nullable
    public TextView f44079Q;

    /* renamed from: R, reason: collision with root package name */
    @Nullable
    public View f44080R;

    /* renamed from: S, reason: collision with root package name */
    @Nullable
    public TextView f44081S;

    /* renamed from: T, reason: collision with root package name */
    @Nullable
    public TextView f44082T;

    /* renamed from: U, reason: collision with root package name */
    @Nullable
    public View f44083U;

    /* renamed from: V, reason: collision with root package name */
    @Nullable
    public TextView f44084V;

    /* renamed from: W, reason: collision with root package name */
    @Nullable
    public TextView f44085W;

    /* renamed from: X, reason: collision with root package name */
    @Nullable
    public TextView f44086X;

    /* renamed from: Y, reason: collision with root package name */
    @Nullable
    public View f44087Y;

    /* renamed from: Z, reason: collision with root package name */
    @Nullable
    public View f44088Z;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44089a;

    /* renamed from: a0, reason: collision with root package name */
    @Nullable
    public TextView f44090a0;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f44091b;

    /* renamed from: b0, reason: collision with root package name */
    @Nullable
    public LinearLayout f44092b0;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public Disposable f44093c;

    /* renamed from: c0, reason: collision with root package name */
    @Nullable
    public TextView f44094c0;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f44095d;

    /* renamed from: d0, reason: collision with root package name */
    @Nullable
    public ImageView f44096d0;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public View f44097e;

    /* renamed from: e0, reason: collision with root package name */
    @Nullable
    public ImageView f44098e0;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public LinearLayout f44099f;

    /* renamed from: f0, reason: collision with root package name */
    @NotNull
    public final W1.h f44100f0;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public LinearLayout f44101g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public ImageView f44102h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public TextView f44103i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f44104j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public View f44105k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public TextView f44106l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public TextView f44107m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public TextView f44108n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public ImageView f44109o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public View f44110p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public TextView f44111q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public TextView f44112r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public TextView f44113s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public View f44114t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public View f44115u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public TextView f44116v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public View f44117w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public TextView f44118x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public View f44119y;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public View f44120z;

    public static final class a extends kotlin.jvm.internal.s implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(androidx.core.content.a.d(fd.this.requireContext(), r5.a(fd.this, R.attr.sdk_pay_text_accent, R.color.sdk_pay_text_accent_light)));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return fd.this;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f44123a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f44123a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44123a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public fd() {
        super(R.layout.sdk_pay_purchase_creation_layout);
        this.f44089a = E.a(this, H.b(ld.class), new c(new b()), null);
        this.f44100f0 = W1.i.b(new a());
    }

    public static final void a(fd fdVar, View view) {
        ((ld) fdVar.f44089a.getValue()).b();
    }

    public static final void b(fd fdVar, View view) {
        ((ld) fdVar.f44089a.getValue()).b();
    }

    public static final void c(fd fdVar, View view) {
        ((ld) fdVar.f44089a.getValue()).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(fd fdVar, View view) {
        Pair pair;
        kd value;
        boolean z4;
        Pair pair2;
        boolean booleanValue;
        h4 h4Var;
        ld ldVar = (ld) fdVar.f44089a.getValue();
        kd value2 = ldVar.f44516c.getValue();
        if (!(value2 instanceof kd.a)) {
            if (value2 instanceof kd.b) {
                kd.b bVar = (kd.b) value2;
                pair = TuplesKt.to(j.a(bVar.f44458e.f44821f), bVar.f44458e.f44819d);
            }
            value = ldVar.f44516c.getValue();
            if (!(value instanceof kd.a)) {
                kd.a aVar = (kd.a) value;
                pair2 = TuplesKt.to(Boolean.valueOf(aVar.f44449d), aVar.f44447b);
            } else if (!(value instanceof kd.b)) {
                if (!(value instanceof kd.c ? true : value instanceof kd.d)) {
                    throw new W1.m();
                }
                return;
            } else {
                kd.b bVar2 = (kd.b) value;
                pair2 = TuplesKt.to(Boolean.valueOf(bVar2.f44457d), bVar2.f44455b);
            }
            booleanValue = ((Boolean) pair2.component1()).booleanValue();
            h4Var = (h4) pair2.component2();
            if (!(h4Var instanceof h4.d) && !(h4Var instanceof h4.b)) {
                z4 = false;
            }
            if (booleanValue && z4) {
                li liVar = ((jd) ldVar.f44514a.f45547o.getValue()).f44374a;
                liVar.getClass();
                m3 m3Var = new m3();
                liVar.a(m3Var, new mi(liVar, m3Var));
                return;
            }
            if (booleanValue || !(h4Var instanceof h4.b)) {
            }
            ldVar.f44518e.emit(h3.a.f44210a);
            return;
        }
        pair = TuplesKt.to(k.APPLICATION, ((kd.a) value2).f44450e.f44048b);
        k analyticsProductType = (k) pair.component1();
        InvoiceId invoiceId = (InvoiceId) pair.component2();
        xc xcVar = (xc) ldVar.f44514a.f45375A2.getValue();
        xcVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(xcVar.f45222a.a());
        wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
        xcVar.f45223b.a("paySheet.coupon.click", MapsKt.build(createMapBuilder));
        value = ldVar.f44516c.getValue();
        if (!(value instanceof kd.a)) {
        }
        booleanValue = ((Boolean) pair2.component1()).booleanValue();
        h4Var = (h4) pair2.component2();
        if (!(h4Var instanceof h4.d)) {
            z4 = false;
        }
        if (booleanValue) {
        }
        if (booleanValue) {
        }
    }

    public static final void e(fd fdVar, View view) {
        ld ldVar = (ld) fdVar.f44089a.getValue();
        kd value = ldVar.f44516c.getValue();
        if (value instanceof kd.a) {
            kd.a aVar = (kd.a) value;
            h4 h4Var = aVar.f44447b;
            if (h4Var instanceof h4.d) {
                if (aVar.f44449d) {
                    ldVar.f44518e.emit(h3.c.f44212a);
                    return;
                }
                ldVar.f44516c.setValue(kd.a.a(aVar, null, new h4.c(((h4.d) h4Var).f44216a), null, null, false, 253));
                f0 f0Var = aVar.f44450e;
                InvoiceId invoiceId = f0Var.f44048b;
                ldVar.a(((h4.d) aVar.f44447b).f44216a.f43845a, f0Var.f44047a, k.APPLICATION, invoiceId, new fe(ldVar, aVar, invoiceId));
                return;
            }
            return;
        }
        if (value instanceof kd.b) {
            kd.b bVar = (kd.b) value;
            if (bVar.f44455b instanceof h4.d) {
                k a4 = j.a(bVar.f44458e.f44821f);
                if (bVar.f44457d) {
                    ldVar.f44518e.emit(h3.c.f44212a);
                    return;
                }
                ldVar.f44516c.setValue(kd.b.a(bVar, null, new h4.c(((h4.d) bVar.f44455b).f44216a), null, null, false, false, 2045));
                qb qbVar = bVar.f44458e;
                InvoiceId invoiceId2 = qbVar.f44819d;
                ldVar.a(((h4.d) bVar.f44455b).f44216a.f43845a, qbVar.f44818c, a4, invoiceId2, new ge(ldVar, bVar, a4, invoiceId2));
            }
        }
    }

    public static final void f(fd fdVar, View view) {
        ImageView imageView = fdVar.f44109o;
        if (imageView != null) {
            imageView.animate().rotation(imageView.getRotation() + 180.0f).start();
        }
        ld ldVar = (ld) fdVar.f44089a.getValue();
        kd value = ldVar.f44516c.getValue();
        if (value instanceof kd.a) {
            kd.a aVar = (kd.a) value;
            boolean z4 = aVar.f44448c.f43910d;
            boolean z5 = !z4;
            if (!z4) {
                xc xcVar = (xc) ldVar.f44514a.f45375A2.getValue();
                k kVar = k.APPLICATION;
                f0 f0Var = aVar.f44450e;
                xcVar.a(kVar, f0Var.f44048b, f0Var.f44047a);
            }
            ldVar.f44516c.setValue(kd.a.a(aVar, null, null, cb.a(aVar.f44448c, null, null, z5, 7), null, false, 251));
            return;
        }
        if (value instanceof kd.b) {
            kd.b bVar = (kd.b) value;
            boolean z6 = bVar.f44456c.f43910d;
            boolean z7 = !z6;
            if (!z6) {
                xc xcVar2 = (xc) ldVar.f44514a.f45375A2.getValue();
                k a4 = j.a(bVar.f44458e.f44821f);
                qb qbVar = bVar.f44458e;
                xcVar2.a(a4, qbVar.f44819d, qbVar.f44818c);
            }
            ldVar.f44516c.setValue(kd.b.a(bVar, null, null, cb.a(bVar.f44456c, null, null, z7, 7), null, false, false, 2043));
            return;
        }
        if (value instanceof kd.d) {
            kd.d dVar = (kd.d) value;
            boolean z8 = dVar.f44474i;
            boolean z9 = !z8;
            if (!z8) {
                xc xcVar3 = (xc) ldVar.f44514a.f45375A2.getValue();
                k kVar2 = k.SUBSCRIPTION;
                qb qbVar2 = dVar.f44467b;
                xcVar3.a(kVar2, qbVar2.f44819d, qbVar2.f44818c);
            }
            ldVar.f44516c.setValue(kd.d.a(dVar, null, null, false, false, z9, 767));
        }
    }

    public static final void g(fd fdVar, View view) {
        PurchaseId purchaseId;
        ld ldVar = (ld) fdVar.f44089a.getValue();
        kd value = ldVar.f44516c.getValue();
        if (value instanceof kd.a) {
            purchaseId = ((kd.a) value).f44450e.f44047a;
        } else if (value instanceof kd.b) {
            purchaseId = ((kd.b) value).f44458e.f44818c;
        } else {
            if (!(value instanceof kd.d)) {
                if (!Intrinsics.areEqual(value, kd.c.f44465a)) {
                    throw new W1.m();
                }
                return;
            }
            purchaseId = ((kd.d) value).f44467b.f44818c;
        }
        jd jdVar = (jd) ldVar.f44514a.f45547o.getValue();
        jdVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        li liVar = jdVar.f44374a;
        liVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        ea eaVar = new ea();
        eaVar.setArguments(androidx.core.os.d.a(TuplesKt.to("purchaseId", purchaseId)));
        liVar.a(eaVar, new ni(liVar, eaVar));
    }

    public static final void h(fd fdVar, View view) {
        ld ldVar = (ld) fdVar.f44089a.getValue();
        kd value = ldVar.f44516c.getValue();
        if (value instanceof kd.c ? true : value instanceof kd.a) {
            return;
        }
        if (value instanceof kd.b) {
            xc xcVar = (xc) ldVar.f44514a.f45375A2.getValue();
            kd.b bVar = (kd.b) value;
            k analyticsProductType = j.a(bVar.f44458e.f44821f);
            qb qbVar = bVar.f44458e;
            InvoiceId invoiceId = qbVar.f44819d;
            PurchaseId purchaseId = qbVar.f44818c;
            xcVar.getClass();
            Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.putAll(xcVar.f45222a.a());
            wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
            createMapBuilder.put("purchaseId", purchaseId.getValue());
            xcVar.f45223b.a("paySheetAccount.click", MapsKt.build(createMapBuilder));
            ldVar.a();
            return;
        }
        if (value instanceof kd.d) {
            xc xcVar2 = (xc) ldVar.f44514a.f45375A2.getValue();
            kd.d dVar = (kd.d) value;
            k analyticsProductType2 = j.a(dVar.f44467b.f44821f);
            qb qbVar2 = dVar.f44467b;
            InvoiceId invoiceId2 = qbVar2.f44819d;
            PurchaseId purchaseId2 = qbVar2.f44818c;
            xcVar2.getClass();
            Intrinsics.checkNotNullParameter(analyticsProductType2, "analyticsProductType");
            Intrinsics.checkNotNullParameter(invoiceId2, "invoiceId");
            Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
            Map createMapBuilder2 = MapsKt.createMapBuilder();
            createMapBuilder2.putAll(xcVar2.f45222a.a());
            wc.a(createMapBuilder2, "rustore_payment", analyticsProductType2.f44406a, invoiceId2, "invoiceId");
            createMapBuilder2.put("purchaseId", purchaseId2.getValue());
            xcVar2.f45223b.a("paySheetAccount.click", MapsKt.build(createMapBuilder2));
            ldVar.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f44073K = null;
        Disposable disposable = this.f44091b;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.f44093c;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f44095d = (TextView) view.findViewById(R.id.test_mode_marker);
        this.f44097e = view.findViewById(R.id.test_mode_marker_spaser);
        this.f44099f = (LinearLayout) view.findViewById(R.id.progress_indicator_layout);
        this.f44101g = (LinearLayout) view.findViewById(R.id.content_layout);
        this.f44102h = (ImageView) view.findViewById(R.id.product_image);
        this.f44103i = (TextView) view.findViewById(R.id.product_title);
        this.f44104j = (TextView) view.findViewById(R.id.product_subtitle);
        this.f44105k = view.findViewById(R.id.price_cell);
        this.f44106l = (TextView) view.findViewById(R.id.price);
        this.f44107m = (TextView) view.findViewById(R.id.original_price);
        this.f44108n = (TextView) view.findViewById(R.id.purchase_interval);
        this.f44111q = (TextView) view.findViewById(R.id.details_original_price);
        this.f44109o = (ImageView) view.findViewById(R.id.details_discount_icon);
        this.f44110p = view.findViewById(R.id.price_details_layout);
        this.f44064B = view.findViewById(R.id.discount_layout);
        this.f44112r = (TextView) view.findViewById(R.id.discount);
        this.f44113s = (TextView) view.findViewById(R.id.total_price);
        this.f44114t = view.findViewById(R.id.coupons_cell_layout);
        this.f44115u = view.findViewById(R.id.coupon_content_layout);
        this.f44120z = view.findViewById(R.id.coupon_unselect_progress_indicator);
        this.f44116v = (TextView) view.findViewById(R.id.coupons_count);
        this.f44117w = view.findViewById(R.id.selected_coupon_nominal_layout);
        this.f44118x = (TextView) view.findViewById(R.id.selected_coupon_nominal);
        this.f44119y = view.findViewById(R.id.unselect_coupon_icon);
        this.f44063A = view.findViewById(R.id.open_coupon_list_icon);
        this.f44067E = (FrameLayout) view.findViewById(R.id.basic_purchase_button_layout);
        this.f44068F = (Button) view.findViewById(R.id.purchase_button);
        this.f44069G = (FrameLayout) view.findViewById(R.id.sbp_purchase_button);
        this.f44071I = (FrameLayout) view.findViewById(R.id.sber_pay_purchase_button);
        FrameLayout frameLayout = this.f44069G;
        this.f44070H = frameLayout != null ? (TextView) frameLayout.findViewById(R.id.sbp_purchase_button_price) : null;
        FrameLayout frameLayout2 = this.f44071I;
        this.f44072J = frameLayout2 != null ? (TextView) frameLayout2.findViewById(R.id.sber_pay_purchase_button_price) : null;
        this.f44065C = (LinearLayout) view.findViewById(R.id.payment_method_block);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.payment_methods);
        y9 y9Var = new y9(new ed((ld) this.f44089a.getValue()));
        this.f44073K = y9Var;
        recyclerView.setAdapter(y9Var);
        recyclerView.setItemAnimator(null);
        this.f44066D = recyclerView;
        this.f44074L = (TextView) view.findViewById(R.id.offer_consent);
        this.f44075M = (TextView) view.findViewById(R.id.unauthorized_conditions);
        this.f44076N = (TextView) view.findViewById(R.id.mobile_phone_conditions);
        this.f44077O = view.findViewById(R.id.promo_tariff_cell);
        this.f44078P = (TextView) view.findViewById(R.id.promo_tariff_interval);
        this.f44079Q = (TextView) view.findViewById(R.id.promo_tariff_price);
        this.f44080R = view.findViewById(R.id.start_tariff_cell);
        this.f44081S = (TextView) view.findViewById(R.id.start_tariff_interval);
        this.f44082T = (TextView) view.findViewById(R.id.start_tariff_price);
        this.f44083U = view.findViewById(R.id.standard_tariff_cell);
        this.f44084V = (TextView) view.findViewById(R.id.standard_tariff_interval);
        this.f44085W = (TextView) view.findViewById(R.id.standard_tariff_price);
        this.f44087Y = view.findViewById(R.id.subscription_tariffs_layout);
        this.f44086X = (TextView) view.findViewById(R.id.subscription_total_price);
        View findViewById = view.findViewById(R.id.subscription_promo_tariff_purchase_content);
        this.f44088Z = findViewById;
        this.f44090a0 = findViewById != null ? (TextView) findViewById.findViewById(R.id.subscription_promo_tariff_text) : null;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.user_info);
        this.f44092b0 = linearLayout;
        this.f44094c0 = linearLayout != null ? (TextView) linearLayout.findViewById(R.id.user_name) : null;
        LinearLayout linearLayout2 = this.f44092b0;
        this.f44096d0 = linearLayout2 != null ? (ImageView) linearLayout2.findViewById(R.id.user_avatar) : null;
        LinearLayout linearLayout3 = this.f44092b0;
        this.f44098e0 = linearLayout3 != null ? (ImageView) linearLayout3.findViewById(R.id.user_info_action_icon) : null;
        a();
        String string = requireContext().getString(R.string.sdk_pay_unauthorized_user_purchase_conditions);
        Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…user_purchase_conditions)");
        SpannableString spannableString = new SpannableString(string);
        int i4 = R.string.sdk_pay_offer_link_text;
        cd cdVar = new cd((ld) this.f44089a.getValue());
        String string2 = requireContext().getString(i4);
        Intrinsics.checkNotNullExpressionValue(string2, "requireContext().getString(linkStringResource)");
        int c02 = StringsKt.c0(string, string2, 0, false, 6, null);
        spannableString.setSpan(new zc(cdVar, this), c02, string2.length() + c02, 33);
        int i5 = R.string.sdk_pay_unauthorized_user_purchase_conditions_policy;
        dd ddVar = new dd((ld) this.f44089a.getValue());
        String string3 = requireContext().getString(i5);
        Intrinsics.checkNotNullExpressionValue(string3, "requireContext().getString(linkStringResource)");
        int c03 = StringsKt.c0(string, string3, 0, false, 6, null);
        spannableString.setSpan(new zc(ddVar, this), c03, string3.length() + c03, 33);
        TextView textView = this.f44075M;
        if (textView != null) {
            textView.setText(spannableString);
        }
        TextView textView2 = this.f44075M;
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        int i6 = R.string.sdk_pay_offer_consent;
        int i7 = R.string.sdk_pay_offer_link_text;
        TextView textView3 = this.f44074L;
        ad adVar = new ad((ld) this.f44089a.getValue());
        String string4 = requireContext().getString(i6);
        Intrinsics.checkNotNullExpressionValue(string4, "requireContext().getString(fullTextResource)");
        SpannableString spannableString2 = new SpannableString(string4);
        String string5 = requireContext().getString(i7);
        Intrinsics.checkNotNullExpressionValue(string5, "requireContext().getString(linkStringResource)");
        int c04 = StringsKt.c0(string4, string5, 0, false, 6, null);
        spannableString2.setSpan(new zc(adVar, this), c04, string5.length() + c04, 33);
        if (textView3 != null) {
            textView3.setText(spannableString2);
        }
        if (textView3 != null) {
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        int i8 = R.string.sdk_pay_unauthorized_user_mobile_phone_payment_conditions;
        int i9 = R.string.sdk_pay_unauthorized_user_mobile_phone_payment_conditions_end;
        TextView textView4 = this.f44076N;
        bd bdVar = new bd((ld) this.f44089a.getValue());
        String string6 = requireContext().getString(i8);
        Intrinsics.checkNotNullExpressionValue(string6, "requireContext().getString(fullTextResource)");
        SpannableString spannableString3 = new SpannableString(string6);
        String string7 = requireContext().getString(i9);
        Intrinsics.checkNotNullExpressionValue(string7, "requireContext().getString(linkStringResource)");
        int c05 = StringsKt.c0(string6, string7, 0, false, 6, null);
        spannableString3.setSpan(new zc(bdVar, this), c05, string7.length() + c05, 33);
        if (textView4 != null) {
            textView4.setText(spannableString3);
        }
        if (textView4 != null) {
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Observable observe$default = Subject.DefaultImpls.observe$default(((ld) this.f44089a.getValue()).f44517d, null, 1, null);
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        this.f44091b = ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(observe$default, dispatchers.getMain(), null, 2, null), null, null, new gd(this), 3, null);
        this.f44093c = ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(Subject.DefaultImpls.observe$default(((ld) this.f44089a.getValue()).f44519f, null, 1, null), dispatchers.getMain(), null, 2, null), null, null, new hd(this), 3, null);
    }

    public final void a() {
        Button button = this.f44068F;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: D3.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fd.a(fd.this, view);
                }
            });
        }
        FrameLayout frameLayout = this.f44069G;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: D3.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fd.b(fd.this, view);
                }
            });
        }
        FrameLayout frameLayout2 = this.f44071I;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: D3.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fd.c(fd.this, view);
                }
            });
        }
        View view = this.f44114t;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: D3.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    fd.d(fd.this, view2);
                }
            });
        }
        View view2 = this.f44117w;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: D3.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    fd.e(fd.this, view3);
                }
            });
        }
        View view3 = this.f44105k;
        if (view3 != null) {
            view3.setOnClickListener(new View.OnClickListener() { // from class: D3.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    fd.f(fd.this, view4);
                }
            });
        }
        LinearLayout linearLayout = this.f44065C;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: D3.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    fd.g(fd.this, view4);
                }
            });
        }
        LinearLayout linearLayout2 = this.f44092b0;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: D3.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    fd.h(fd.this, view4);
                }
            });
        }
    }

    public final void a(List<tm> newMethods, s9 s9Var) {
        y9 y9Var = this.f44073K;
        if (y9Var != null) {
            Intrinsics.checkNotNullParameter(newMethods, "newMethods");
            y9Var.f45265b.e(newMethods);
        }
        Iterator<tm> it = newMethods.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().f45048a, s9Var)) {
                break;
            } else {
                i4++;
            }
        }
        int max = Math.max(i4, 0);
        RecyclerView recyclerView = this.f44066D;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(max);
        }
    }

    public final void a(dn dnVar) {
        ImageView imageView;
        if (dnVar != null) {
            TextView textView = this.f44094c0;
            if (textView != null) {
                textView.setText(dnVar.f43979a);
            }
            Url url = dnVar.f43980b;
            if (url != null && (imageView = this.f44096d0) != null) {
                q6.a(imageView, url.getValue(), Integer.valueOf(R.drawable.sdk_pay_no_user_avatar), 4);
            }
            LinearLayout linearLayout = this.f44092b0;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            ImageView imageView2 = this.f44098e0;
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = this.f44092b0;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    public final void a(cb cbVar) {
        View view = this.f44087Y;
        if (view != null) {
            view.setVisibility(8);
        }
        TextView textView = this.f44108n;
        if (textView != null) {
            textView.setText(getString(R.string.sdk_pay_one_time_purchase_title));
        }
        View view2 = this.f44110p;
        if (view2 != null) {
            view2.setVisibility(cbVar.f43910d ? 0 : 8);
        }
        TextView textView2 = this.f44111q;
        if (textView2 != null) {
            textView2.setText(cbVar.f43907a);
        }
        if (cbVar.f43908b != null) {
            TextView textView3 = this.f44106l;
            if (textView3 != null) {
                textView3.setText(cbVar.f43909c);
            }
            TextView textView4 = this.f44107m;
            if (textView4 != null) {
                textView4.setVisibility(0);
                textView4.setPaintFlags(textView4.getPaintFlags() | 16);
                textView4.setText(cbVar.f43907a);
            }
            View view3 = this.f44064B;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            TextView textView5 = this.f44112r;
            if (textView5 != null) {
                textView5.setText(cbVar.f43908b);
            }
        } else {
            TextView textView6 = this.f44106l;
            if (textView6 != null) {
                textView6.setText(cbVar.f43907a);
            }
            TextView textView7 = this.f44107m;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            View view4 = this.f44064B;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
        TextView textView8 = this.f44113s;
        if (textView8 == null) {
            return;
        }
        textView8.setText(cbVar.f43909c);
    }

    public final void a(boolean z4, h4 h4Var) {
        int a4;
        int a5;
        int a6;
        Drawable background;
        int a7;
        int a8;
        if (h4Var instanceof h4.a) {
            View view = this.f44114t;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        if (h4Var instanceof h4.b) {
            h4.b bVar = (h4.b) h4Var;
            View view2 = this.f44114t;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f44115u;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = this.f44063A;
            if (view4 != null) {
                view4.setVisibility(!z4 ? 0 : 8);
            }
            View view5 = this.f44120z;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            View view6 = this.f44117w;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            TextView textView = this.f44116v;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f44116v;
            if (textView2 != null) {
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                if (z4) {
                    a7 = r5.a(this, R.attr.sdk_pay_surface_tertiary, R.color.sdk_pay_surface_tertiary_light);
                } else {
                    a7 = r5.a(this, R.attr.sdk_pay_icon_accent, R.color.sdk_pay_icon_accent_light);
                }
                int d4 = androidx.core.content.a.d(requireContext, a7);
                if (z4) {
                    a8 = r5.a(this, R.attr.sdk_pay_text_secondary, R.color.sdk_pay_text_secondary_light);
                } else {
                    a8 = r5.a(this, R.attr.sdk_pay_text_quaternary_constant, R.color.sdk_pay_text_quaternary_constant_light);
                }
                Drawable background2 = textView2.getBackground();
                if (background2 != null) {
                    background2.setTint(d4);
                }
                textView2.setTextColor(androidx.core.content.a.d(requireContext(), a8));
                textView2.setText(String.valueOf(bVar.f44214a));
                return;
            }
            return;
        }
        if (h4Var instanceof h4.d) {
            h4.d dVar = (h4.d) h4Var;
            View view7 = this.f44114t;
            if (view7 != null) {
                view7.setVisibility(0);
            }
            View view8 = this.f44115u;
            if (view8 != null) {
                view8.setVisibility(0);
            }
            View view9 = this.f44063A;
            if (view9 != null) {
                view9.setVisibility(!z4 ? 0 : 8);
            }
            View view10 = this.f44120z;
            if (view10 != null) {
                view10.setVisibility(8);
            }
            TextView textView3 = this.f44116v;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            View view11 = this.f44117w;
            if (view11 != null) {
                view11.setVisibility(0);
            }
            View view12 = this.f44119y;
            if (view12 != null) {
                view12.setVisibility(z4 ? 8 : 0);
            }
            Context requireContext2 = requireContext();
            if (z4) {
                a4 = r5.a(this, R.attr.sdk_pay_surface_tertiary, R.color.sdk_pay_surface_tertiary_light);
            } else {
                switch (dVar.f44216a.f43851g) {
                    case A:
                    case E:
                    case F:
                    case G:
                    case H:
                    case Z:
                        a4 = r5.a(this, R.attr.sdk_pay_rainbow_purple, R.color.sdk_pay_rainbow_purple_light);
                        break;
                    case B:
                        a4 = r5.a(this, R.attr.sdk_pay_rainbow_violet, R.color.sdk_pay_rainbow_violet_light);
                        break;
                    case C:
                        a4 = r5.a(this, R.attr.sdk_pay_rainbow_raspberry_pink, R.color.sdk_pay_rainbow_raspberry_pink_light);
                        break;
                    case D:
                        a4 = r5.a(this, R.attr.sdk_pay_rainbow_green, R.color.sdk_pay_rainbow_green_light);
                        break;
                    default:
                        throw new W1.m();
                }
            }
            int d5 = androidx.core.content.a.d(requireContext2, a4);
            View view13 = this.f44117w;
            if (view13 != null && (background = view13.getBackground()) != null) {
                background.setTint(d5);
            }
            StringBuilder sb = new StringBuilder("-");
            yj yjVar = yj.I3;
            if (yjVar != null) {
                u4 u4Var = (u4) yjVar.f45529k1.getValue();
                long j4 = dVar.f44216a.f43846b;
                u4Var.getClass();
                sb.append(u4.a(j4));
                String sb2 = sb.toString();
                TextView textView4 = this.f44118x;
                if (textView4 != null) {
                    if (z4) {
                        a5 = r5.a(this, R.attr.sdk_pay_text_secondary, R.color.sdk_pay_text_secondary_light);
                    } else {
                        a5 = r5.a(this, R.attr.sdk_pay_text_quaternary_constant, R.color.sdk_pay_text_quaternary_constant_light);
                    }
                    if (z4) {
                        a6 = r5.a(this, R.attr.sdk_pay_icon_tertiary, R.color.sdk_pay_icon_tertiary_light);
                    } else {
                        a6 = r5.a(this, R.attr.sdk_pay_icon_constant, R.color.sdk_pay_icon_constant_light);
                    }
                    textView4.setTextColor(androidx.core.content.a.d(requireContext(), a5));
                    textView4.setText(sb2);
                    Drawable[] compoundDrawables = textView4.getCompoundDrawables();
                    Intrinsics.checkNotNullExpressionValue(compoundDrawables, "compoundDrawables");
                    for (Drawable drawable : compoundDrawables) {
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(androidx.core.content.a.d(requireContext(), a6), PorterDuff.Mode.SRC_IN));
                        }
                    }
                    return;
                }
                return;
            }
            throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
        }
        if (h4Var instanceof h4.c) {
            View view14 = this.f44114t;
            if (view14 != null) {
                view14.setVisibility(0);
            }
            View view15 = this.f44063A;
            if (view15 != null) {
                view15.setVisibility(0);
            }
            View view16 = this.f44115u;
            if (view16 != null) {
                view16.setVisibility(8);
            }
            View view17 = this.f44120z;
            if (view17 == null) {
                return;
            }
            view17.setVisibility(0);
        }
    }

    public final void a(String str, boolean z4, s9 s9Var) {
        String string;
        Button button = this.f44068F;
        if (button != null) {
            if (z4) {
                string = getString(R.string.sdk_pay_proceed_purchase_button, str);
            } else {
                string = getString(R.string.sdk_pay_purchase_button, str);
            }
            button.setText(string);
        }
        TextView textView = this.f44070H;
        if (textView != null) {
            textView.setText(getString(R.string.sdk_pay_purchase_button, str));
        }
        TextView textView2 = this.f44072J;
        if (textView2 != null) {
            textView2.setText(getString(R.string.sdk_pay_purchase_button, str));
        }
        boolean z5 = (s9Var instanceof s9.b) || (s9Var instanceof s9.c);
        FrameLayout frameLayout = this.f44067E;
        if (frameLayout != null) {
            frameLayout.setVisibility((z5 || (s9Var instanceof s9.a)) ? 0 : 8);
        }
        FrameLayout frameLayout2 = this.f44069G;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(Intrinsics.areEqual(s9Var, s9.e.f44981a) ? 0 : 8);
        }
        FrameLayout frameLayout3 = this.f44071I;
        if (frameLayout3 == null) {
            return;
        }
        frameLayout3.setVisibility(Intrinsics.areEqual(s9Var, s9.d.f44980a) ? 0 : 8);
    }

    public final String a(gl glVar) {
        if (glVar instanceof gl.a) {
            int i4 = ((gl.a) glVar).f44185a;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            return a3.a(requireContext, R.plurals.sdk_pay_days_count, i4, Integer.valueOf(i4));
        }
        if (glVar instanceof gl.b) {
            int i5 = ((gl.b) glVar).f44186a;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
            return a3.a(requireContext2, R.plurals.sdk_pay_months_count, i5, Integer.valueOf(i5));
        }
        if (!(glVar instanceof gl.c)) {
            throw new W1.m();
        }
        int i6 = ((gl.c) glVar).f44187a;
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext()");
        return a3.a(requireContext3, R.plurals.sdk_pay_years_count, i6, Integer.valueOf(i6));
    }

    public static String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(str.charAt(0));
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb.append((Object) upperCase);
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }
}
