package ru.rustore.sdk.pay.internal;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Y;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.d;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.lf;
import ru.rustore.sdk.pay.internal.of;
import ru.rustore.sdk.pay.internal.ze;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableObserveOnKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.subject.MutableStateSubject;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class lf extends Fragment {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f44544r = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44545a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f44546b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f44547c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public View f44548d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public ImageView f44549e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f44550f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f44551g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public LinearLayout f44552h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public LinearLayout f44553i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public ImageView f44554j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public TextView f44555k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public Button f44556l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public Button f44557m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public LinearLayout f44558n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public TextView f44559o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public ImageView f44560p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public ImageView f44561q;

    public static final class a extends kotlin.jvm.internal.s implements Function1<of, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            String string;
            of state = (of) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            lf lfVar = lf.this;
            int i4 = lf.f44544r;
            if (state instanceof of.c) {
                of.c cVar = (of.c) state;
                e0 e0Var = cVar.f44737a.f44051e;
                TextView textView = lfVar.f44547c;
                if (textView != null) {
                    textView.setVisibility(cVar.f44738b ? 0 : 8);
                }
                View view = lfVar.f44548d;
                if (view != null) {
                    view.setVisibility(8);
                }
                Button button = lfVar.f44556l;
                if (button != null) {
                    button.setVisibility(8);
                }
                Button button2 = lfVar.f44557m;
                if (button2 != null) {
                    button2.setVisibility(8);
                }
                ImageView imageView = lfVar.f44549e;
                if (imageView != null) {
                    q6.a(imageView, e0Var.f43982a.getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), lfVar.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
                }
                TextView textView2 = lfVar.f44550f;
                if (textView2 != null) {
                    textView2.setText(e0Var.f43983b.getValue());
                }
                TextView textView3 = lfVar.f44551g;
                if (textView3 != null) {
                    textView3.setText(lfVar.getString(R.string.sdk_pay_application_purchase_subtitle));
                }
                LinearLayout linearLayout = lfVar.f44552h;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                ImageView imageView2 = lfVar.f44554j;
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.sdk_pay_illustration_success_result);
                }
                TextView textView4 = lfVar.f44555k;
                if (textView4 != null) {
                    textView4.setText(R.string.payment_result_success_message);
                }
                LinearLayout linearLayout2 = lfVar.f44553i;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
            } else if (state instanceof of.f) {
                of.f fVar = (of.f) state;
                ze zeVar = fVar.f44747a.f44822g;
                TextView textView5 = lfVar.f44547c;
                if (textView5 != null) {
                    textView5.setVisibility(fVar.f44749c ? 0 : 8);
                }
                View view2 = lfVar.f44548d;
                if (view2 != null) {
                    view2.setVisibility((fVar.f44750d == null || !fVar.f44749c) ? 8 : 0);
                }
                Button button3 = lfVar.f44556l;
                if (button3 != null) {
                    button3.setVisibility(8);
                }
                ImageView imageView3 = lfVar.f44549e;
                if (imageView3 != null) {
                    q6.a(imageView3, zeVar.getIcon().getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), lfVar.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
                }
                TextView textView6 = lfVar.f44550f;
                if (textView6 != null) {
                    textView6.setText(zeVar.getTitle().getValue());
                }
                TextView textView7 = lfVar.f44551g;
                if (textView7 != null) {
                    if (zeVar instanceof ze.a) {
                        string = lfVar.getString(R.string.sdk_pay_product_purchase_subtitle);
                    } else {
                        if (!(zeVar instanceof ze.b)) {
                            throw new W1.m();
                        }
                        string = lfVar.getString(R.string.sdk_pay_subscription_purchase_subtitle);
                    }
                    textView7.setText(string);
                }
                LinearLayout linearLayout3 = lfVar.f44552h;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                ImageView imageView4 = lfVar.f44554j;
                if (imageView4 != null) {
                    imageView4.setImageResource(R.drawable.sdk_pay_illustration_success_result);
                }
                TextView textView8 = lfVar.f44555k;
                if (textView8 != null) {
                    textView8.setText(R.string.payment_result_success_message);
                }
                LinearLayout linearLayout4 = lfVar.f44553i;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                Button button4 = lfVar.f44557m;
                if (button4 != null) {
                    button4.setVisibility(fVar.f44748b ? 0 : 8);
                }
                lfVar.a(fVar.f44750d, false);
            } else if (state instanceof of.b) {
                of.b bVar = (of.b) state;
                lfVar.a(bVar.f44736b, bVar.f44735a.f44242d, true, null, false);
            } else if (state instanceof of.e) {
                of.e eVar = (of.e) state;
                lfVar.a(eVar.f44745c, eVar.f44743a.f44255i, eVar.f44744b, eVar.f44746d, true);
            } else if (state instanceof of.a) {
                of.a aVar = (of.a) state;
                lfVar.a(aVar.f44733a, aVar.f44734b, null, false);
            } else if (state instanceof of.d) {
                of.d dVar = (of.d) state;
                lfVar.a(dVar.f44739a, dVar.f44741c, dVar.f44742d, true);
            }
            return Unit.f41027a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return lf.this;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f44564a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f44564a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44564a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements Function0<Y.b> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object obj;
            Bundle requireArguments = lf.this.requireArguments();
            Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments()");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = requireArguments.getSerializable("purchaseResult", hf.class);
            } else {
                Object serializable = requireArguments.getSerializable("purchaseResult");
                if (!(serializable instanceof hf)) {
                    serializable = null;
                }
                obj = (hf) serializable;
            }
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            hf result = (hf) obj;
            Intrinsics.checkNotNullParameter(result, "result");
            return new pf(result);
        }
    }

    public lf() {
        super(R.layout.sdk_pay_purchase_result_fragment);
        this.f44545a = E.a(this, H.b(qf.class), new c(new b()), new d());
    }

    public static final void a(lf lfVar, View view) {
        ProductType productType;
        qf qfVar = (qf) lfVar.f44545a.getValue();
        of value = qfVar.f44831c.getValue();
        if (value instanceof of.b) {
            jf jfVar = (jf) qfVar.f44829a.f45384C2.getValue();
            k kVar = k.APPLICATION;
            hf.a.b bVar = ((of.b) value).f44735a;
            jfVar.b(kVar, bVar.f44241c, bVar.f44240b);
        } else if (value instanceof of.e) {
            qb qbVar = ((y5) qfVar.f44829a.f45520i2.getValue()).f45261a.f43860b.f44876a;
            jf jfVar2 = (jf) qfVar.f44829a.f45384C2.getValue();
            k a4 = (qbVar == null || (productType = qbVar.f44821f) == null) ? null : j.a(productType);
            hf.b.C0259b c0259b = ((of.e) value).f44743a;
            jfVar2.b(a4, c0259b.f44248b, c0259b.f44247a);
        }
        ((e) qfVar.f44829a.f45460V2.getValue()).f43981a = d.c.f43945a;
        li liVar = ((nf) qfVar.f44829a.f45495d2.getValue()).f44701a;
        liVar.getClass();
        fd fdVar = new fd();
        liVar.a(fdVar, new oi(fdVar));
    }

    public static final void b(lf lfVar, View view) {
        qf qfVar = (qf) lfVar.f44545a.getValue();
        of value = qfVar.f44831c.getValue();
        of.f fVar = value instanceof of.f ? (of.f) value : null;
        if (fVar == null) {
            return;
        }
        qb qbVar = fVar.f44747a;
        jf jfVar = (jf) qfVar.f44829a.f45384C2.getValue();
        k analyticsProductType = j.a(qbVar.f44821f);
        InvoiceId invoiceId = qbVar.f44819d;
        PurchaseId purchaseId = qbVar.f44818c;
        jfVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.putAll(jfVar.f44376a.a());
        wc.a(createMapBuilder, "rustore_payment", analyticsProductType.f44406a, invoiceId, "invoiceId");
        createMapBuilder.put("purchaseId", purchaseId.getValue());
        jfVar.f44377b.a("PaySheetGetReceipt.clicked", MapsKt.build(createMapBuilder));
        nf nfVar = (nf) qfVar.f44829a.f45495d2.getValue();
        PurchaseId purchaseId2 = qbVar.f44818c;
        nfVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
        li liVar = nfVar.f44701a;
        liVar.getClass();
        Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
        Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
        hh hhVar = new hh();
        hhVar.setArguments(androidx.core.os.d.a(TuplesKt.to("purchaseId", purchaseId2)));
        liVar.a(hhVar, new pi(liVar, hhVar));
    }

    public static final void c(lf lfVar, View view) {
        qf qfVar = (qf) lfVar.f44545a.getValue();
        of value = qfVar.f44831c.getValue();
        if (!(value instanceof of.e)) {
            if (value instanceof of.d) {
                jf jfVar = (jf) qfVar.f44829a.f45384C2.getValue();
                of.d dVar = (of.d) value;
                ProductType productType = dVar.f44740b.f44253g;
                k a4 = productType != null ? j.a(productType) : null;
                hf.b.C0259b c0259b = dVar.f44740b;
                jfVar.a(a4, c0259b.f44248b, c0259b.f44247a);
                Url url = ((g7) qfVar.f44829a.f45472Y2.getValue()).a();
                if (url == null) {
                    qfVar.f44831c.setValue(new of.e(hf.b.C0259b.a(dVar.f44740b, null, new RuStorePaymentException.RuStorePaymentCommonException("Auth url is null on purchase result screen", null, 2, null), KotlinVersion.MAX_COMPONENT_VALUE), false, dVar.f44739a, dVar.f44742d));
                    return;
                }
                nf nfVar = (nf) qfVar.f44829a.f45495d2.getValue();
                nfVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                nfVar.f44701a.c(url);
                return;
            }
            return;
        }
        jf jfVar2 = (jf) qfVar.f44829a.f45384C2.getValue();
        of.e eVar = (of.e) value;
        ProductType productType2 = eVar.f44743a.f44253g;
        k a5 = productType2 != null ? j.a(productType2) : null;
        hf.b.C0259b c0259b2 = eVar.f44743a;
        jfVar2.a(a5, c0259b2.f44248b, c0259b2.f44247a);
        Url url2 = ((g7) qfVar.f44829a.f45472Y2.getValue()).a();
        if (url2 != null) {
            nf nfVar2 = (nf) qfVar.f44829a.f45495d2.getValue();
            nfVar2.getClass();
            Intrinsics.checkNotNullParameter(url2, "url");
            nfVar2.f44701a.c(url2);
            return;
        }
        MutableStateSubject<of> mutableStateSubject = qfVar.f44831c;
        hf.b.C0259b failureResult = hf.b.C0259b.a(eVar.f44743a, null, new RuStorePaymentException.RuStorePaymentCommonException("Auth url is null on purchase result screen", null, 2, null), KotlinVersion.MAX_COMPONENT_VALUE);
        boolean z4 = eVar.f44744b;
        boolean z5 = eVar.f44745c;
        dn dnVar = eVar.f44746d;
        Intrinsics.checkNotNullParameter(failureResult, "failureResult");
        mutableStateSubject.setValue(new of.e(failureResult, z4, z5, dnVar));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f44546b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f44547c = (TextView) view.findViewById(R.id.test_mode_marker);
        this.f44548d = view.findViewById(R.id.test_mode_marker_spaser);
        this.f44549e = (ImageView) view.findViewById(R.id.product_image);
        this.f44550f = (TextView) view.findViewById(R.id.product_title);
        this.f44551g = (TextView) view.findViewById(R.id.product_subtitle);
        this.f44552h = (LinearLayout) view.findViewById(R.id.product_details);
        this.f44553i = (LinearLayout) view.findViewById(R.id.result_content);
        this.f44554j = (ImageView) view.findViewById(R.id.result_image);
        this.f44555k = (TextView) view.findViewById(R.id.result_message);
        this.f44556l = (Button) view.findViewById(R.id.payment_methods_button);
        this.f44557m = (Button) view.findViewById(R.id.send_receipt_button);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.user_info);
        this.f44558n = linearLayout;
        this.f44559o = linearLayout != null ? (TextView) linearLayout.findViewById(R.id.user_name) : null;
        LinearLayout linearLayout2 = this.f44558n;
        this.f44560p = linearLayout2 != null ? (ImageView) linearLayout2.findViewById(R.id.user_avatar) : null;
        LinearLayout linearLayout3 = this.f44558n;
        this.f44561q = linearLayout3 != null ? (ImageView) linearLayout3.findViewById(R.id.user_info_action_icon) : null;
        a();
        this.f44546b = ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(Subject.DefaultImpls.observe$default(((qf) this.f44545a.getValue()).f44832d, null, 1, null), Dispatchers.INSTANCE.getMain(), null, 2, null), null, null, new a(), 3, null);
    }

    public final void a() {
        Button button = this.f44556l;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: D3.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lf.a(lf.this, view);
                }
            });
        }
        Button button2 = this.f44557m;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: D3.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lf.b(lf.this, view);
                }
            });
        }
        LinearLayout linearLayout = this.f44558n;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: D3.D
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lf.c(lf.this, view);
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0124, code lost:
    
        if (r6.equals("4040022") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x013c, code lost:
    
        if (r6.equals("4000018") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020a, code lost:
    
        r6 = ru.rustore.sdk.pay.R.string.sdk_pay_error_cannot_purchase_product;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0146, code lost:
    
        if (r6.equals("4000017") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0150, code lost:
    
        if (r6.equals("4000016") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x015a, code lost:
    
        if (r6.equals("4000015") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0164, code lost:
    
        if (r6.equals("4000014") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x016e, code lost:
    
        if (r6.equals("4000013") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a4, code lost:
    
        r6 = ru.rustore.sdk.pay.R.string.sdk_pay_error_cannot_purchase_app;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0178, code lost:
    
        if (r6.equals("4000012") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0182, code lost:
    
        if (r6.equals("4000011") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x018c, code lost:
    
        if (r6.equals("4000010") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0196, code lost:
    
        if (r6.equals("4000009") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a0, code lost:
    
        if (r6.equals("4000008") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01ae, code lost:
    
        if (r6.equals("4000007") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01b8, code lost:
    
        if (r6.equals("4000006") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c2, code lost:
    
        if (r6.equals("4000005") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01cc, code lost:
    
        if (r6.equals("4000004") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01d6, code lost:
    
        if (r6.equals("5000003") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01e0, code lost:
    
        if (r6.equals("5000002") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01e9, code lost:
    
        if (r6.equals("4040002") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01f2, code lost:
    
        if (r6.equals("4030002") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0207, code lost:
    
        if (r6.equals("4000030") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0213, code lost:
    
        if (r6.equals("4000021") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x021f, code lost:
    
        r6 = ru.rustore.sdk.pay.R.string.sdk_pay_error_already_purchased_product;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x021c, code lost:
    
        if (r6.equals("4000020") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0228, code lost:
    
        if (r6.equals("4000002") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0231, code lost:
    
        if (r6.equals("4000001") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0106, code lost:
    
        if (r6.equals("4040025") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0234, code lost:
    
        r6 = ru.rustore.sdk.pay.R.string.sdk_pay_error_common;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0110, code lost:
    
        if (r6.equals("4040024") == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x011a, code lost:
    
        if (r6.equals("4040023") == false) goto L195;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z4, Throwable error, boolean z5, dn dnVar, boolean z6) {
        int i4;
        TextView textView = this.f44547c;
        if (textView != null) {
            textView.setVisibility(z4 ? 0 : 8);
        }
        View view = this.f44548d;
        if (view != null) {
            view.setVisibility((dnVar == null || !z4) ? 8 : 0);
        }
        LinearLayout linearLayout = this.f44552h;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        Button button = this.f44557m;
        if (button != null) {
            button.setVisibility(8);
        }
        Button button2 = this.f44556l;
        if (button2 != null) {
            button2.setVisibility(z5 ? 0 : 8);
        }
        ImageView imageView = this.f44554j;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.sdk_pay_illustration_fail_result);
        }
        TextView textView2 = this.f44555k;
        if (textView2 != null) {
            yj yjVar = yj.I3;
            if (yjVar != null) {
                ((vi) yjVar.f45541m3.getValue()).getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                if (error instanceof RuStorePaymentException.RuStorePaymentCommonException) {
                    i4 = R.string.sdk_pay_error_cant_pay;
                } else if (error instanceof RuStorePaymentException.RuStorePayInvalidActivePurchase) {
                    i4 = R.string.sdk_pay_error_invalid_purchase;
                } else if (error instanceof RuStorePaymentException.RuStorePayInvalidConsoleAppId) {
                    i4 = R.string.sdk_pay_error_invalid_console_app_id;
                } else if (error instanceof RuStorePaymentException.RuStorePaySignatureException) {
                    i4 = R.string.sdk_pay_error_cant_pay;
                } else if (error instanceof RuStorePaymentException.EmptyPaymentTokenException) {
                    i4 = R.string.sdk_pay_error_cant_pay;
                } else if (error instanceof RuStoreNotInstalledException) {
                    i4 = R.string.sdk_pay_error_rustore_not_installed;
                } else if (error instanceof RuStoreOutdatedException) {
                    i4 = R.string.sdk_pay_error_rustore_outdated;
                } else if (error instanceof RuStoreUserUnauthorizedException) {
                    i4 = R.string.sdk_pay_error_rustore_unauthorized;
                } else if (error instanceof vm) {
                    i4 = R.string.sdk_pay_error_rustore_unauthorized;
                } else if (error instanceof RuStoreApplicationBannedException) {
                    i4 = R.string.sdk_pay_error_common;
                } else if (error instanceof RuStoreUserBannedException) {
                    i4 = R.string.sdk_pay_error_common;
                } else if (error instanceof RuStorePaymentException.RuStorePaymentNetworkException) {
                    String code = ((RuStorePaymentException.RuStorePaymentNetworkException) error).getCode();
                    if (code != null) {
                        int hashCode = code.hashCode();
                        if (hashCode != 325557045) {
                            if (hashCode != 325557046) {
                                if (hashCode != 325557106) {
                                    if (hashCode != 325557107) {
                                        if (hashCode != 325557137) {
                                            if (hashCode != 326480569) {
                                                if (hashCode != 328327609) {
                                                    if (hashCode != 329251130) {
                                                        if (hashCode != 1213060727) {
                                                            if (hashCode != 1213060728) {
                                                                switch (hashCode) {
                                                                    case 325557048:
                                                                        break;
                                                                    case 325557049:
                                                                        break;
                                                                    case 325557050:
                                                                        break;
                                                                    case 325557051:
                                                                        break;
                                                                    case 325557052:
                                                                        break;
                                                                    case 325557053:
                                                                        break;
                                                                    default:
                                                                        switch (hashCode) {
                                                                            case 325557075:
                                                                                break;
                                                                            case 325557076:
                                                                                break;
                                                                            case 325557077:
                                                                                break;
                                                                            case 325557078:
                                                                                break;
                                                                            case 325557079:
                                                                                break;
                                                                            case 325557080:
                                                                                break;
                                                                            case 325557081:
                                                                                break;
                                                                            case 325557082:
                                                                                break;
                                                                            case 325557083:
                                                                                break;
                                                                            case 325557084:
                                                                                if (code.equals("4000019")) {
                                                                                    i4 = R.string.sdk_pay_error_already_purchased_app;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (hashCode) {
                                                                                }
                                                                        }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (code.equals("4010004")) {
                                                i4 = R.string.sdk_pay_error_unknown_purchase_status;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i4 = R.string.sdk_pay_error_common;
                } else {
                    i4 = R.string.sdk_pay_error_common;
                }
                textView2.setText(i4);
            } else {
                throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
            }
        }
        LinearLayout linearLayout2 = this.f44553i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        a(dnVar, z6);
    }

    public final void a(boolean z4, String str, dn dnVar, boolean z5) {
        TextView textView = this.f44547c;
        if (textView != null) {
            textView.setVisibility(z4 ? 0 : 8);
        }
        View view = this.f44548d;
        if (view != null) {
            view.setVisibility((dnVar == null || !z4) ? 8 : 0);
        }
        LinearLayout linearLayout = this.f44552h;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        Button button = this.f44557m;
        if (button != null) {
            button.setVisibility(8);
        }
        Button button2 = this.f44556l;
        if (button2 != null) {
            button2.setVisibility(0);
        }
        ImageView imageView = this.f44554j;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.sdk_pay_illustration_fail_result);
        }
        TextView textView2 = this.f44555k;
        if (textView2 != null) {
            textView2.setText(getString(R.string.sdk_pay_payment_result_bank_app_error_message, str));
        }
        LinearLayout linearLayout2 = this.f44553i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        a(dnVar, z5);
    }

    public final void a(dn dnVar, boolean z4) {
        ImageView imageView;
        if (dnVar != null) {
            TextView textView = this.f44559o;
            if (textView != null) {
                textView.setText(dnVar.f43979a);
            }
            Url url = dnVar.f43980b;
            if (url != null && (imageView = this.f44560p) != null) {
                q6.a(imageView, url.getValue(), Integer.valueOf(R.drawable.sdk_pay_no_user_avatar), 4);
            }
            LinearLayout linearLayout = this.f44558n;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            ImageView imageView2 = this.f44561q;
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(z4 ? 0 : 8);
            return;
        }
        LinearLayout linearLayout2 = this.f44558n;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }
}
