package ru.rustore.sdk.pay.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Y;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.hh;
import ru.rustore.sdk.pay.internal.ln;
import ru.rustore.sdk.pay.internal.nh;
import ru.rustore.sdk.pay.model.AppUserEmail;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class hh extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44272a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f44273b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public LinearLayout f44274c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public TextInputLayout f44275d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public TextInputEditText f44276e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Button f44277f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public g5 f44278g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public View f44279h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public LinearLayout f44280i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public LinearLayout f44281j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public Button f44282k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public Button f44283l;

    public static final class a extends kotlin.jvm.internal.s implements Function1<nh, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            nh state = (nh) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state instanceof nh.a) {
                hh.a(hh.this, (nh.a) state);
            } else if (state instanceof nh.c) {
                hh.a(hh.this);
            } else if (state instanceof nh.b) {
                hh hhVar = hh.this;
                LinearLayout linearLayout = hhVar.f44274c;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                Button button = hhVar.f44277f;
                if (button != null) {
                    button.setVisibility(8);
                }
                View view = hhVar.f44279h;
                if (view != null) {
                    view.setVisibility(8);
                }
                LinearLayout linearLayout2 = hhVar.f44280i;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                LinearLayout linearLayout3 = hhVar.f44281j;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
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
            return hh.this;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f44286a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f44286a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44286a.invoke()).getViewModelStore();
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
            Bundle requireArguments = hh.this.requireArguments();
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
                return new rh((PurchaseId) obj);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public hh() {
        super(R.layout.sdk_pay_receipt_sending_fragment);
        this.f44272a = E.a(this, H.b(qh.class), new c(new b()), new d());
    }

    public static final void a(hh hhVar, View view) {
        Editable text;
        qh qhVar = (qh) hhVar.f44272a.getValue();
        TextInputEditText textInputEditText = hhVar.f44276e;
        qhVar.a((textInputEditText == null || (text = textInputEditText.getText()) == null) ? null : text.toString());
    }

    public static final void b(hh hhVar, View view) {
        qh qhVar = (qh) hhVar.f44272a.getValue();
        nh value = qhVar.f44846f.getValue();
        nh.b bVar = value instanceof nh.b ? (nh.b) value : null;
        if (bVar != null) {
            qhVar.f44846f.setValue(new nh.a(bVar.f44706a, null));
        }
    }

    public static final void c(hh hhVar, View view) {
        s6 s6Var = ((qh) hhVar.f44272a.getValue()).f44844d.f44646a.f44586b;
        if (s6Var != null) {
            s6Var.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f44273b;
        if (disposable != null) {
            disposable.dispose();
        }
        TextInputEditText textInputEditText = this.f44276e;
        if (textInputEditText != null) {
            textInputEditText.removeTextChangedListener(this.f44278g);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f44274c = (LinearLayout) view.findViewById(R.id.email_input_content);
        this.f44275d = (TextInputLayout) view.findViewById(R.id.email_field);
        this.f44276e = (TextInputEditText) view.findViewById(R.id.email_input);
        this.f44277f = (Button) view.findViewById(R.id.send_receipt_button);
        this.f44279h = view.findViewById(R.id.receipt_sending_progress_indicator);
        this.f44280i = (LinearLayout) view.findViewById(R.id.error_message_content);
        this.f44281j = (LinearLayout) view.findViewById(R.id.error_buttons_content);
        this.f44282k = (Button) view.findViewById(R.id.retry_button);
        this.f44283l = (Button) view.findViewById(R.id.cancel_button);
        this.f44278g = new g5(this.f44275d, requireContext().getColor(r5.a(this, R.attr.sdk_pay_stroke_accent, R.color.sdk_pay_stroke_accent_light)));
        a();
        this.f44273b = ObservableSubscribeKt.subscribe$default(Subject.DefaultImpls.observe$default(((qh) this.f44272a.getValue()).f44847g, null, 1, null), null, null, new a(), 3, null);
    }

    public static final boolean a(hh hhVar, TextView textView, int i4, KeyEvent keyEvent) {
        Editable text;
        if (i4 != 4 && i4 != 6 && i4 != 0) {
            return false;
        }
        qh qhVar = (qh) hhVar.f44272a.getValue();
        TextInputEditText textInputEditText = hhVar.f44276e;
        qhVar.a((textInputEditText == null || (text = textInputEditText.getText()) == null) ? null : text.toString());
        return true;
    }

    public static final void a(hh hhVar, nh.a aVar) {
        int i4;
        Editable text;
        TextInputEditText textInputEditText = hhVar.f44276e;
        if (textInputEditText != null) {
            AppUserEmail appUserEmail = aVar.f44704a;
            textInputEditText.setText(appUserEmail != null ? appUserEmail.getValue() : null);
        }
        ln lnVar = aVar.f44705b;
        if (lnVar != null) {
            if (Intrinsics.areEqual(lnVar, ln.a.f44608a)) {
                i4 = R.string.sdk_pay_empty_field_text;
            } else {
                if (!Intrinsics.areEqual(lnVar, ln.b.f44609a)) {
                    throw new W1.m();
                }
                i4 = R.string.sdk_pay_wrong_email_text;
            }
            TextInputLayout textInputLayout = hhVar.f44275d;
            if (textInputLayout != null) {
                textInputLayout.setHelperText(hhVar.getString(i4));
            }
            int a4 = r5.a(hhVar, R.attr.sdk_pay_stroke_negative, R.color.sdk_pay_stroke_negative_light);
            TextInputLayout textInputLayout2 = hhVar.f44275d;
            if (textInputLayout2 != null) {
                textInputLayout2.setBoxStrokeColor(hhVar.requireContext().getColor(a4));
            }
            TextInputEditText textInputEditText2 = hhVar.f44276e;
            int length = (textInputEditText2 == null || (text = textInputEditText2.getText()) == null) ? 0 : text.length();
            TextInputEditText textInputEditText3 = hhVar.f44276e;
            if (textInputEditText3 != null) {
                textInputEditText3.setSelection(length);
            }
            TextInputLayout textInputLayout3 = hhVar.f44275d;
            if (textInputLayout3 != null) {
                textInputLayout3.requestFocus();
            }
        }
        View view = hhVar.f44279h;
        if (view != null) {
            view.setVisibility(8);
        }
        LinearLayout linearLayout = hhVar.f44280i;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = hhVar.f44281j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = hhVar.f44274c;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
        TextInputLayout textInputLayout4 = hhVar.f44275d;
        if (textInputLayout4 != null) {
            textInputLayout4.setVisibility(0);
        }
        Button button = hhVar.f44277f;
        if (button == null) {
            return;
        }
        button.setVisibility(0);
    }

    public static final void a(hh hhVar) {
        Object systemService = hhVar.requireContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            TextInputEditText textInputEditText = hhVar.f44276e;
            inputMethodManager.hideSoftInputFromWindow(textInputEditText != null ? textInputEditText.getWindowToken() : null, 0);
        }
        TextInputLayout textInputLayout = hhVar.f44275d;
        if (textInputLayout != null) {
            textInputLayout.setVisibility(8);
        }
        Button button = hhVar.f44277f;
        if (button != null) {
            button.setVisibility(8);
        }
        LinearLayout linearLayout = hhVar.f44280i;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = hhVar.f44281j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = hhVar.f44274c;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
        View view = hhVar.f44279h;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final void a() {
        Button button = this.f44277f;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: D3.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hh.a(hh.this, view);
                }
            });
        }
        TextInputEditText textInputEditText = this.f44276e;
        if (textInputEditText != null) {
            textInputEditText.addTextChangedListener(this.f44278g);
        }
        TextInputEditText textInputEditText2 = this.f44276e;
        if (textInputEditText2 != null) {
            textInputEditText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: D3.u
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                    return hh.a(hh.this, textView, i4, keyEvent);
                }
            });
        }
        Button button2 = this.f44282k;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: D3.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hh.b(hh.this, view);
                }
            });
        }
        Button button3 = this.f44283l;
        if (button3 != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: D3.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hh.c(hh.this, view);
                }
            });
        }
    }
}
