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
import ru.rustore.sdk.pay.internal.ug;
import ru.rustore.sdk.pay.internal.ze;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class sg extends Fragment {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f45004i = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f45005a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f45006b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public ImageView f45007c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f45008d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f45009e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public LinearLayout f45010f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f45011g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public ImageView f45012h;

    public static final class a extends kotlin.jvm.internal.s implements Function1<ug, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ImageView imageView;
            String string;
            ug state = (ug) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            if (!(state instanceof ug.b)) {
                if (state instanceof ug.a) {
                    sg sgVar = sg.this;
                    e0 e0Var = ((ug.a) state).f45099a.f44051e;
                    ImageView imageView2 = sgVar.f45007c;
                    if (imageView2 != null) {
                        q6.a(imageView2, e0Var.f43982a.getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), sgVar.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
                    }
                    TextView textView = sgVar.f45008d;
                    if (textView != null) {
                        textView.setText(e0Var.f43983b.getValue());
                    }
                    TextView textView2 = sgVar.f45009e;
                    if (textView2 != null) {
                        textView2.setText(sgVar.getString(R.string.sdk_pay_application_purchase_subtitle));
                    }
                } else if (state instanceof ug.c) {
                    sg sgVar2 = sg.this;
                    ug.c cVar = (ug.c) state;
                    ze zeVar = cVar.f45101a.f44822g;
                    dn dnVar = cVar.f45102b;
                    ImageView imageView3 = sgVar2.f45007c;
                    if (imageView3 != null) {
                        q6.a(imageView3, zeVar.getIcon().getValue(), Integer.valueOf(R.drawable.sdk_pay_ic_product_image_placeholder), sgVar2.getResources().getDimension(R.dimen.sdk_pay_bottom_sheet_image_product_radius));
                    }
                    TextView textView3 = sgVar2.f45008d;
                    if (textView3 != null) {
                        textView3.setText(zeVar.getTitle().getValue());
                    }
                    TextView textView4 = sgVar2.f45009e;
                    if (textView4 != null) {
                        if (zeVar instanceof ze.a) {
                            string = sgVar2.getString(R.string.sdk_pay_product_purchase_subtitle);
                        } else {
                            if (!(zeVar instanceof ze.b)) {
                                throw new W1.m();
                            }
                            string = sgVar2.getString(R.string.sdk_pay_subscription_purchase_subtitle);
                        }
                        textView4.setText(string);
                    }
                    if (dnVar != null) {
                        TextView textView5 = sgVar2.f45011g;
                        if (textView5 != null) {
                            textView5.setText(dnVar.f43979a);
                        }
                        Url url = dnVar.f43980b;
                        if (url != null && (imageView = sgVar2.f45012h) != null) {
                            q6.a(imageView, url.getValue(), Integer.valueOf(R.drawable.sdk_pay_no_user_avatar), 4);
                        }
                        LinearLayout linearLayout = sgVar2.f45010f;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                        }
                    } else {
                        LinearLayout linearLayout2 = sgVar2.f45010f;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(8);
                        }
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
            return sg.this;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f45015a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f45015a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f45015a.invoke()).getViewModelStore();
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
            Bundle requireArguments = sg.this.requireArguments();
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
                return new ah((PurchaseId) obj);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public sg() {
        super(R.layout.sdk_pay_purchase_with_sber_pay_fragment);
        this.f45005a = E.a(this, H.b(zg.class), new c(new b()), new d());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f45006b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f45007c = (ImageView) view.findViewById(R.id.product_image);
        this.f45008d = (TextView) view.findViewById(R.id.product_title);
        this.f45009e = (TextView) view.findViewById(R.id.product_subtitle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.user_info);
        this.f45010f = linearLayout;
        this.f45011g = linearLayout != null ? (TextView) linearLayout.findViewById(R.id.user_name) : null;
        LinearLayout linearLayout2 = this.f45010f;
        this.f45012h = linearLayout2 != null ? (ImageView) linearLayout2.findViewById(R.id.user_avatar) : null;
        this.f45006b = ObservableSubscribeKt.subscribe$default(Subject.DefaultImpls.observe$default(((zg) this.f45005a.getValue()).f45363i, null, 1, null), null, null, new a(), 3, null);
    }
}
