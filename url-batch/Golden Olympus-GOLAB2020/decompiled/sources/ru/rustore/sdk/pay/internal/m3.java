package ru.rustore.sdk.pay.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.g3;
import ru.rustore.sdk.pay.internal.m3;
import ru.rustore.sdk.pay.internal.p3;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.Observable;
import ru.rustore.sdk.reactive.observable.ObservableObserveOnKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.subject.Subject;

@Metadata
/* loaded from: classes3.dex */
public final class m3 extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44618a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f44619b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public Disposable f44620c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageView f44621d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f44622e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public RecyclerView f44623f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public View f44624g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public View f44625h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public Button f44626i;

    public static final class a extends kotlin.jvm.internal.s implements Function1<p3, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            p3 state = (p3) obj;
            Intrinsics.checkNotNullParameter(state, "state");
            if (!(state instanceof p3.c)) {
                if (state instanceof p3.b) {
                    m3 m3Var = m3.this;
                    p3.b bVar = (p3.b) state;
                    View view = m3Var.f44624g;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    View view2 = m3Var.f44625h;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    RecyclerView recyclerView = m3Var.f44623f;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        recyclerView.setAdapter(new p4(bVar.f44771a, new n3((r3) m3Var.f44618a.getValue())));
                        Context requireContext = m3Var.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                        j6 j6Var = new j6(requireContext);
                        if (m3Var.getResources().getConfiguration().orientation == 2) {
                            recyclerView.addItemDecoration(j6Var);
                        } else {
                            recyclerView.removeItemDecoration(j6Var);
                        }
                    }
                } else if (state instanceof p3.d) {
                    m3 m3Var2 = m3.this;
                    View view3 = m3Var2.f44624g;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    RecyclerView recyclerView2 = m3Var2.f44623f;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(8);
                    }
                    View view4 = m3Var2.f44625h;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                } else if (state instanceof p3.a) {
                    m3 m3Var3 = m3.this;
                    View view5 = m3Var3.f44624g;
                    if (view5 != null) {
                        view5.setVisibility(8);
                    }
                    RecyclerView recyclerView3 = m3Var3.f44623f;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(8);
                    }
                    View view6 = m3Var3.f44625h;
                    if (view6 != null) {
                        view6.setVisibility(0);
                    }
                }
            }
            return Unit.f41027a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function1<g3, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            String string;
            g3 event = (g3) obj;
            Intrinsics.checkNotNullParameter(event, "event");
            m3 m3Var = m3.this;
            RecyclerView recyclerView = m3Var.f44623f;
            if (recyclerView != null) {
                if (event instanceof g3.a) {
                    string = m3Var.getString(R.string.sdk_pay_coupon_selection_error);
                } else {
                    if (!(event instanceof g3.b)) {
                        throw new W1.m();
                    }
                    string = m3Var.getString(R.string.sdk_pay_coupon_selection_connection_error);
                }
                Intrinsics.checkNotNullExpressionValue(string, "when (event) {\n         …tion_error)\n            }");
                nn.a(recyclerView, string);
            }
            return Unit.f41027a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m3.this;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f44630a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f44630a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44630a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public m3() {
        super(R.layout.sdk_pay_coupon_list_layout);
        this.f44618a = E.a(this, H.b(r3.class), new d(new c()), null);
    }

    public static final void a(m3 m3Var, View view) {
        r3 r3Var = (r3) m3Var.f44618a.getValue();
        l3 params = r3Var.f44883g;
        if (params != null) {
            k3 k3Var = (k3) r3Var.f44877a.f45380B2.getValue();
            k3Var.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.putAll(k3Var.f44413a.a());
            createMapBuilder.put("rustore_payment", params.f44501a.f44406a);
            createMapBuilder.put("invoiceId", params.f44502b.getValue());
            k3Var.f44414b.a("PaymentSdkSheetReturnBack", MapsKt.build(createMapBuilder));
        }
        FragmentManager a4 = ((o3) r3Var.f44877a.f45500e2.getValue()).f44720a.a();
        if (a4 != null) {
            a4.V0();
        }
    }

    public static final void b(m3 m3Var, View view) {
        r3 r3Var = (r3) m3Var.f44618a.getValue();
        p3 value = r3Var.f44878b.getValue();
        if (value instanceof p3.a) {
            r3Var.f44878b.setValue(p3.d.f44774a);
            p3.a aVar = (p3.a) value;
            r3Var.a(aVar.f44768a, aVar.f44769b, aVar.f44770c);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.f44619b;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.f44620c;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f44621d = (ImageView) view.findViewById(R.id.toolbar_close_icon);
        this.f44622e = (TextView) view.findViewById(R.id.toolbar_title);
        this.f44623f = (RecyclerView) view.findViewById(R.id.coupons_list);
        this.f44624g = view.findViewById(R.id.coupon_progress_indicator);
        this.f44625h = view.findViewById(R.id.coupon_connection_error);
        this.f44626i = (Button) view.findViewById(R.id.retry_button);
        a();
        TextView textView = this.f44622e;
        if (textView != null) {
            textView.setText(getString(R.string.sdk_pay_coupons_title));
        }
        Observable observe$default = Subject.DefaultImpls.observe$default(((r3) this.f44618a.getValue()).f44879c, null, 1, null);
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        this.f44619b = ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(observe$default, dispatchers.getMain(), null, 2, null), null, null, new a(), 3, null);
        this.f44620c = ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(Subject.DefaultImpls.observe$default(((r3) this.f44618a.getValue()).f44881e, null, 1, null), dispatchers.getMain(), null, 2, null), null, null, new b(), 3, null);
    }

    public final void a() {
        ImageView imageView = this.f44621d;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: D3.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m3.a(m3.this, view);
                }
            });
        }
        Button button = this.f44626i;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: D3.G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m3.b(m3.this, view);
                }
            });
        }
    }
}
