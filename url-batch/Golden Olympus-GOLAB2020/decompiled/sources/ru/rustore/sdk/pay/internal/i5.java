package ru.rustore.sdk.pay.internal;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.k5;
import ru.rustore.sdk.pay.internal.ze;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.Observable;
import ru.rustore.sdk.reactive.observable.ObservableFilterKt;
import ru.rustore.sdk.reactive.observable.ObservableMapKt;
import ru.rustore.sdk.reactive.observable.ObservableObserveOnKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeOnKt;
import ru.rustore.sdk.reactive.observable.ObservableTakeFirstKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class i5 extends Fragment {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f44299i = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44300a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f44301b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public ImageView f44302c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f44303d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f44304e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public LinearLayout f44305f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f44306g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public ImageView f44307h;

    public static final class a extends kotlin.jvm.internal.s implements Function1<k5, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ImageView imageView;
            String string;
            k5 state = (k5) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state instanceof k5.a) {
                i5 i5Var = i5.this;
                e0 e0Var = ((k5.a) state).f44416a.f44051e;
                ImageView imageView2 = i5Var.f44302c;
                if (imageView2 != null) {
                    q6.a(imageView2, e0Var.f43982a.getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), i5Var.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
                }
                TextView textView = i5Var.f44303d;
                if (textView != null) {
                    textView.setText(e0Var.f43983b.getValue());
                }
                TextView textView2 = i5Var.f44304e;
                if (textView2 != null) {
                    textView2.setText(i5Var.getString(R.string.sdk_pay_application_purchase_subtitle));
                }
            } else if (state instanceof k5.c) {
                i5 i5Var2 = i5.this;
                k5.c cVar = (k5.c) state;
                ze zeVar = cVar.f44418a.f44822g;
                dn dnVar = cVar.f44419b;
                ImageView imageView3 = i5Var2.f44302c;
                if (imageView3 != null) {
                    q6.a(imageView3, zeVar.getIcon().getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), i5Var2.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
                }
                TextView textView3 = i5Var2.f44303d;
                if (textView3 != null) {
                    textView3.setText(zeVar.getTitle().getValue());
                }
                TextView textView4 = i5Var2.f44304e;
                if (textView4 != null) {
                    if (zeVar instanceof ze.a) {
                        string = i5Var2.getString(R.string.sdk_pay_product_purchase_subtitle);
                    } else {
                        if (!(zeVar instanceof ze.b)) {
                            throw new W1.m();
                        }
                        string = i5Var2.getString(R.string.sdk_pay_subscription_purchase_subtitle);
                    }
                    textView4.setText(string);
                }
                if (dnVar != null) {
                    TextView textView5 = i5Var2.f44306g;
                    if (textView5 != null) {
                        textView5.setText(dnVar.f43979a);
                    }
                    Url url = dnVar.f43980b;
                    if (url != null && (imageView = i5Var2.f44307h) != null) {
                        q6.a(imageView, url.getValue(), Integer.valueOf(R.drawable.sdk_pay_no_user_avatar), 4);
                    }
                    LinearLayout linearLayout = i5Var2.f44305f;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                } else {
                    LinearLayout linearLayout2 = i5Var2.f44305f;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
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
            return i5.this;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f44310a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f44310a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44310a.invoke()).getViewModelStore();
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
            Bundle requireArguments = i5.this.requireArguments();
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
                return new o5((PurchaseId) obj);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public i5() {
        super(R.layout.sdk_pay_external_payment_result_fragment);
        this.f44300a = E.a(this, H.b(n5.class), new c(new b()), new d());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f44301b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        n5 n5Var = (n5) this.f44300a.getValue();
        Disposable disposable = n5Var.f44682f;
        if (disposable != null) {
            disposable.dispose();
        }
        c8 c8Var = (c8) n5Var.f44677a.f45459V1.getValue();
        PurchaseId purchaseId = n5Var.f44678b;
        c8Var.getClass();
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Observable create$default = Observable.Companion.create$default(Observable.Companion, null, new z7(c8Var, purchaseId), 1, null);
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        n5Var.f44682f = ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(ObservableTakeFirstKt.takeFirst$default(ObservableMapKt.map(ObservableFilterKt.filter(ObservableSubscribeOnKt.subscribeOn(create$default, dispatchers.getIo()), new a8(c8Var)), new b8(c8Var)), 0, 1, null), dispatchers.getMain(), null, 2, null), new m5(n5Var), null, new l5(n5Var), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Disposable disposable = ((n5) this.f44300a.getValue()).f44682f;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f44302c = (ImageView) view.findViewById(R.id.product_image);
        this.f44303d = (TextView) view.findViewById(R.id.product_title);
        this.f44304e = (TextView) view.findViewById(R.id.product_subtitle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.user_info);
        this.f44305f = linearLayout;
        this.f44306g = linearLayout != null ? (TextView) linearLayout.findViewById(R.id.user_name) : null;
        LinearLayout linearLayout2 = this.f44305f;
        this.f44307h = linearLayout2 != null ? (ImageView) linearLayout2.findViewById(R.id.user_avatar) : null;
        this.f44301b = ObservableSubscribeKt.subscribe$default(Subject.DefaultImpls.observe$default(((n5) this.f44300a.getValue()).f44681e, null, 1, null), null, null, new a(), 3, null);
    }
}
