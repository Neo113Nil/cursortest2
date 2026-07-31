package ru.rustore.sdk.pay.internal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
import ru.rustore.sdk.pay.internal.pl;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class pl extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f44790d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44791a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f44792b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f44793c;

    public static final class a extends kotlin.jvm.internal.s implements Function1<rl, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            rl state = (rl) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            TextView textView = pl.this.f44793c;
            if (textView != null) {
                textView.setText(state.f44935a);
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
            return pl.this;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f44796a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f44796a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44796a.invoke()).getViewModelStore();
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
            String string = pl.this.requireArguments().getString("emailValue");
            if (string == null) {
                string = "";
            }
            return new vl(string);
        }
    }

    public pl() {
        super(R.layout.sdk_pay_success_receipt_sending_fragment);
        this.f44791a = E.a(this, H.b(ul.class), new c(new b()), new d());
    }

    public static final void a(pl plVar, View view) {
        s6 s6Var = ((ul) plVar.f44791a.getValue()).f45108a.f44854a.f44586b;
        if (s6Var != null) {
            s6Var.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f44792b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f44793c = (TextView) view.findViewById(R.id.email_value_text);
        Button button = (Button) view.findViewById(R.id.close_button);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: D3.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    pl.a(pl.this, view2);
                }
            });
        }
        this.f44792b = ObservableSubscribeKt.subscribe$default(Subject.DefaultImpls.observe$default(((ul) this.f44791a.getValue()).f45109b, null, 1, null), null, null, new a(), 3, null);
    }
}
