package ru.rustore.sdk.pay.internal;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.ea;
import ru.rustore.sdk.pay.internal.ha;
import ru.rustore.sdk.pay.internal.ml;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class ea extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44014a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f44015b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public LinearLayout f44016c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageView f44017d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f44018e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public RecyclerView f44019f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public FrameLayout f44020g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public Button f44021h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public FrameLayout f44022i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f44023j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public FrameLayout f44024k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public TextView f44025l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public LinearLayout f44026m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public View f44027n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public w9 f44028o;

    public static final class a extends kotlin.jvm.internal.s implements Function1<ha, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            String str;
            ha state = (ha) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            if (!Intrinsics.areEqual(state, ha.b.f44229a)) {
                if (state instanceof ha.a) {
                    ea eaVar = ea.this;
                    ha.a aVar = (ha.a) state;
                    LinearLayout linearLayout = eaVar.f44026m;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    }
                    LinearLayout linearLayout2 = eaVar.f44016c;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                    w9 w9Var = eaVar.f44028o;
                    if (w9Var != null) {
                        List<qm> items = aVar.f44225a;
                        Intrinsics.checkNotNullParameter(items, "items");
                        w9Var.f45160c.e(items);
                    }
                    RecyclerView recyclerView = eaVar.f44019f;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                    }
                    View view = eaVar.f44027n;
                    if (view != null) {
                        view.setVisibility(aVar.f44228d instanceof ml.a ? 0 : 8);
                    }
                    String string = eaVar.getString(R.string.sdk_pay_purchase_button, aVar.f44227c.getValue());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sdk_p… state.amountLabel.value)");
                    ml mlVar = aVar.f44228d;
                    if (mlVar != null) {
                        Resources resources = eaVar.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "resources");
                        str = yl.a(mlVar, resources);
                    } else {
                        str = string;
                    }
                    Button button = eaVar.f44021h;
                    if (button != null) {
                        button.setText(str);
                    }
                    TextView textView = eaVar.f44023j;
                    if (textView != null) {
                        textView.setText(string);
                    }
                    TextView textView2 = eaVar.f44025l;
                    if (textView2 != null) {
                        textView2.setText(string);
                    }
                    s9 s9Var = aVar.f44226b;
                    boolean z4 = (s9Var instanceof s9.b) || (s9Var instanceof s9.c);
                    FrameLayout frameLayout = eaVar.f44020g;
                    if (frameLayout != null) {
                        frameLayout.setVisibility((z4 || Intrinsics.areEqual(s9Var, s9.a.f44973a)) ? 0 : 8);
                    }
                    FrameLayout frameLayout2 = eaVar.f44022i;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(Intrinsics.areEqual(s9Var, s9.e.f44981a) ? 0 : 8);
                    }
                    FrameLayout frameLayout3 = eaVar.f44024k;
                    if (frameLayout3 != null) {
                        frameLayout3.setVisibility(Intrinsics.areEqual(s9Var, s9.d.f44980a) ? 0 : 8);
                    }
                } else if (Intrinsics.areEqual(state, ha.c.f44230a)) {
                    ea eaVar2 = ea.this;
                    LinearLayout linearLayout3 = eaVar2.f44016c;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    RecyclerView recyclerView2 = eaVar2.f44019f;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(8);
                    }
                    FrameLayout frameLayout4 = eaVar2.f44020g;
                    if (frameLayout4 != null) {
                        frameLayout4.setVisibility(8);
                    }
                    FrameLayout frameLayout5 = eaVar2.f44022i;
                    if (frameLayout5 != null) {
                        frameLayout5.setVisibility(8);
                    }
                    FrameLayout frameLayout6 = eaVar2.f44024k;
                    if (frameLayout6 != null) {
                        frameLayout6.setVisibility(8);
                    }
                    LinearLayout linearLayout4 = eaVar2.f44026m;
                    if (linearLayout4 != null) {
                        linearLayout4.setVisibility(0);
                    }
                }
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
            return ea.this;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f44031a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f44031a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44031a.invoke()).getViewModelStore();
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
            Bundle requireArguments = ea.this.requireArguments();
            Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments()");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = requireArguments.getSerializable("purchaseId", PurchaseId.class);
            } else {
                Object serializable = requireArguments.getSerializable("purchaseId");
                if (!(serializable instanceof PurchaseId)) {
                    serializable = null;
                }
                obj = (PurchaseId) serializable;
            }
            if (obj != null) {
                return new la((PurchaseId) obj);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public ea() {
        super(R.layout.sdk_pay_payment_methods_fragment);
        this.f44014a = E.a(this, H.b(ka.class), new c(new b()), new d());
    }

    public static final void a(ea eaVar, View view) {
        FragmentManager a4 = ((ga) ((ka) eaVar.f44014a.getValue()).f44434a.f45486b3.getValue()).f44167a.a();
        if (a4 != null) {
            a4.V0();
        }
    }

    public static final void b(ea eaVar, View view) {
        ((ka) eaVar.f44014a.getValue()).a();
    }

    public static final void c(ea eaVar, View view) {
        ((ka) eaVar.f44014a.getValue()).a();
    }

    public static final void d(ea eaVar, View view) {
        ((ka) eaVar.f44014a.getValue()).a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f44028o = null;
        Disposable disposable = this.f44015b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f44016c = (LinearLayout) view.findViewById(R.id.payment_methods_toolbar);
        this.f44017d = (ImageView) view.findViewById(R.id.toolbar_close_icon);
        this.f44018e = (TextView) view.findViewById(R.id.toolbar_title);
        this.f44019f = (RecyclerView) view.findViewById(R.id.payment_methods_list);
        this.f44020g = (FrameLayout) view.findViewById(R.id.basic_purchase_button_layout);
        this.f44021h = (Button) view.findViewById(R.id.purchase_button);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.sbp_purchase_button);
        this.f44022i = frameLayout;
        this.f44023j = frameLayout != null ? (TextView) frameLayout.findViewById(R.id.sbp_purchase_button_price) : null;
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.sber_pay_purchase_button);
        this.f44024k = frameLayout2;
        this.f44025l = frameLayout2 != null ? (TextView) frameLayout2.findViewById(R.id.sber_pay_purchase_button_price) : null;
        this.f44026m = (LinearLayout) view.findViewById(R.id.payment_methods_progress_indicator_layout);
        this.f44027n = view.findViewById(R.id.subscription_promo_tariff_purchase_content);
        TextView textView = this.f44018e;
        if (textView != null) {
            textView.setText(getString(R.string.sdk_pay_payment_method_title));
        }
        w9 w9Var = new w9(new ca((ka) this.f44014a.getValue()), new da((ka) this.f44014a.getValue()));
        this.f44028o = w9Var;
        RecyclerView recyclerView = this.f44019f;
        if (recyclerView != null) {
            recyclerView.setAdapter(w9Var);
        }
        a();
        this.f44015b = ObservableSubscribeKt.subscribe$default(Subject.DefaultImpls.observe$default(((ka) this.f44014a.getValue()).f44437d, null, 1, null), null, null, new a(), 3, null);
    }

    public final void a() {
        ImageView imageView = this.f44017d;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: D3.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ea.a(ea.this, view);
                }
            });
        }
        Button button = this.f44021h;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: D3.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ea.b(ea.this, view);
                }
            });
        }
        FrameLayout frameLayout = this.f44022i;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: D3.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ea.c(ea.this, view);
                }
            });
        }
        FrameLayout frameLayout2 = this.f44024k;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: D3.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ea.d(ea.this, view);
                }
            });
        }
    }
}
