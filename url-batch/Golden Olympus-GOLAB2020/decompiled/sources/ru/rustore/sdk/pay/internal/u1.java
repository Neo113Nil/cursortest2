package ru.rustore.sdk.pay.internal;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.c2;
import ru.rustore.sdk.pay.internal.u1;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class u1 extends Fragment {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f45056i = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f45057a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f45058b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public ImageView f45059c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f45060d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public LinearLayout f45061e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public LinearLayout f45062f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public RecyclerView f45063g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public View f45064h;

    public static final class a extends kotlin.jvm.internal.s implements Function1<c2, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            c2 state = (c2) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            if (Intrinsics.areEqual(state, c2.c.f43897a)) {
                u1 u1Var = u1.this;
                LinearLayout linearLayout = u1Var.f45061e;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = u1Var.f45062f;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                View view = u1Var.f45064h;
                if (view != null) {
                    view.setVisibility(0);
                }
            } else if (Intrinsics.areEqual(state, c2.b.f43896a)) {
                u1 u1Var2 = u1.this;
                LinearLayout linearLayout3 = u1Var2.f45062f;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                View view2 = u1Var2.f45064h;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                LinearLayout linearLayout4 = u1Var2.f45061e;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
            } else if (state instanceof c2.a) {
                u1 u1Var3 = u1.this;
                ArrayList arrayList = ((c2.a) state).f43895a;
                LinearLayout linearLayout5 = u1Var3.f45061e;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                View view3 = u1Var3.f45064h;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                RecyclerView recyclerView = u1Var3.f45063g;
                if (recyclerView != null) {
                    recyclerView.setAdapter(new o1(arrayList, new v1((h2) u1Var3.f45057a.getValue())));
                }
                LinearLayout linearLayout6 = u1Var3.f45062f;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
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
            return u1.this;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f45067a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f45067a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f45067a.invoke()).getViewModelStore();
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
            Bundle requireArguments = u1.this.requireArguments();
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
                return new i2((PurchaseId) obj);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public u1() {
        super(R.layout.sdk_pay_bank_apps_fragment);
        this.f45057a = E.a(this, H.b(h2.class), new c(new b()), new d());
    }

    public static final void a(u1 u1Var, View view) {
        FragmentManager a4 = ((h2) u1Var.f45057a.getValue()).f44203i.f43844a.a();
        if (a4 != null) {
            a4.V0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f45058b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f45059c = (ImageView) view.findViewById(R.id.toolbar_close_icon);
        this.f45060d = (TextView) view.findViewById(R.id.toolbar_title);
        this.f45061e = (LinearLayout) view.findViewById(R.id.empty_content);
        this.f45062f = (LinearLayout) view.findViewById(R.id.bank_apps_content);
        this.f45063g = (RecyclerView) view.findViewById(R.id.bank_apps_list);
        this.f45064h = view.findViewById(R.id.bank_apps_progress_indicator);
        TextView textView = this.f45060d;
        if (textView != null) {
            textView.setText(getString(R.string.sdk_pay_bank_apps_title));
        }
        ImageView imageView = this.f45059c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: D3.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    u1.a(u1.this, view2);
                }
            });
        }
        this.f45058b = ObservableSubscribeKt.subscribe$default(Subject.DefaultImpls.observe$default(((h2) this.f45057a.getValue()).f44208n, null, 1, null), null, null, new a(), 3, null);
    }
}
