package ru.rustore.sdk.pay.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.a;
import ru.rustore.sdk.pay.internal.d;
import ru.rustore.sdk.pay.internal.s6;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

@Metadata
/* loaded from: classes3.dex */
public final class s6 extends BottomSheetDialogFragment {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final W1.h f44964a = E.a(this, H.b(x6.class), new b(new a()), null);

    public static final class a extends kotlin.jvm.internal.s implements Function0<Fragment> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return s6.this;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function0<androidx.lifecycle.b0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f44966a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f44966a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            androidx.lifecycle.b0 viewModelStore = ((androidx.lifecycle.c0) this.f44966a.invoke()).getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public static li a() {
        yj yjVar = yj.I3;
        if (yjVar != null) {
            return (li) yjVar.f45542n.getValue();
        }
        throw new RuStorePaymentException.RuStorePayClientNotCreated("To get an instance of the RuStorePayClient, you must first initialize it", null, 2, null);
    }

    public static final void b(s6 s6Var, DialogInterface dialogInterface) {
        x6 x6Var = (x6) s6Var.f44964a.getValue();
        if (!(((e) x6Var.f45209a.f45460V2.getValue()).f43981a instanceof d.a)) {
            x6Var.a(new v6(x6Var), new w6(x6Var));
            hf hfVar = (hf) x6Var.a(t6.f45035a, u6.f45082a);
            e eVar = (e) x6Var.f45209a.f45460V2.getValue();
            d.a state = new d.a(hfVar);
            eVar.getClass();
            Intrinsics.checkNotNullParameter(state, "state");
            eVar.f43981a = state;
        }
        s6Var.requireActivity().finish();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1328c
    public final int getTheme() {
        return R.style.RuStorePayBottomSheetDialogTheme;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.sdk_pay_initial_bottom_sheet_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a().f44586b = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1328c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        x6 x6Var = (x6) this.f44964a.getValue();
        d dVar = ((e) x6Var.f45209a.f45460V2.getValue()).f43981a;
        if (dVar instanceof d.a) {
            x6Var.a(((d.a) dVar).f43943a);
        } else {
            boolean z4 = dVar instanceof d.b;
            ua uaVar = ((wa) x6Var.f45209a.f45456U2.getValue()).f45161a.f45124a;
            if (!z4 || (!(uaVar instanceof ua.e) && !(uaVar instanceof ua.d))) {
                x6Var.a((hf) x6Var.a(t6.f45035a, u6.f45082a));
            }
        }
        requireActivity().finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ua uaVar;
        Serializable serializable;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            li a4 = a();
            a4.getClass();
            Intrinsics.checkNotNullParameter(this, "fragment");
            a4.f44586b = this;
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    serializable = arguments.getSerializable("PAYMENT_TYPE_TAG", ua.class);
                    uaVar = (ua) serializable;
                    if (!(uaVar instanceof ua.e)) {
                        a().b(((ua.e) uaVar).f45093a);
                    } else if (uaVar instanceof ua.d) {
                        a().b(((ua.d) uaVar).f45092a);
                    } else {
                        boolean z4 = true;
                        if (!(uaVar instanceof ua.b ? true : uaVar instanceof ua.c ? true : uaVar instanceof ua.a) && uaVar != null) {
                            z4 = false;
                        }
                        if (z4) {
                            x6 x6Var = (x6) this.f44964a.getValue();
                            ru.rustore.sdk.pay.internal.a aVar = ((t5) x6Var.f45209a.f45435P1.getValue()).f45034a.f43892a.f43838a;
                            if (aVar instanceof a.C0255a) {
                                r6 r6Var = (r6) x6Var.f45209a.f45388D2.getValue();
                                r6Var.getClass();
                                Map createMapBuilder = MapsKt.createMapBuilder();
                                createMapBuilder.putAll(r6Var.f44889a.a());
                                createMapBuilder.put("rustore_payment", "1");
                                r6Var.f44890b.a("appPurchase", MapsKt.build(createMapBuilder));
                            } else if (aVar instanceof a.b) {
                                r6 r6Var2 = (r6) x6Var.f45209a.f45388D2.getValue();
                                r6Var2.f44890b.a("paySheetLoad", r6Var2.f44889a.a());
                            } else if (aVar == null) {
                                throw new RuStorePaymentException.RuStorePayInvalidActivePurchase(null, null, 3, null);
                            }
                            li a5 = a();
                            a5.getClass();
                            fd fdVar = new fd();
                            a5.a(fdVar, new oi(fdVar));
                        }
                    }
                }
                uaVar = null;
                if (!(uaVar instanceof ua.e)) {
                }
            } else {
                Bundle arguments2 = getArguments();
                Serializable serializable2 = arguments2 != null ? arguments2.getSerializable("PAYMENT_TYPE_TAG") : null;
                if (serializable2 instanceof ua) {
                    uaVar = (ua) serializable2;
                    if (!(uaVar instanceof ua.e)) {
                    }
                }
                uaVar = null;
                if (!(uaVar instanceof ua.e)) {
                }
            }
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: D3.L
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    s6.a(s6.this, dialogInterface);
                }
            });
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: D3.M
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    s6.b(s6.this, dialogInterface);
                }
            });
        }
    }

    public static final void a(s6 s6Var, DialogInterface dialogInterface) {
        int i4;
        BottomSheetDialog bottomSheetDialog = dialogInterface instanceof BottomSheetDialog ? (BottomSheetDialog) dialogInterface : null;
        if (bottomSheetDialog != null) {
            s6Var.getClass();
            if (bottomSheetDialog.findViewById(R.id.root_bottom_sheet) != null) {
                int a4 = (int) ((s6Var.getResources().getDisplayMetrics().heightPixels - a(r0)) * 0.9d);
                if (s6Var.getResources().getConfiguration().orientation == 2) {
                    i4 = (int) (s6Var.getResources().getDisplayMetrics().widthPixels * 0.7d);
                } else {
                    i4 = s6Var.getResources().getDisplayMetrics().widthPixels;
                }
                BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
                behavior.setPeekHeight(0);
                behavior.setHideable(true);
                behavior.setMaxWidth(i4);
                behavior.setMaxHeight(a4);
                behavior.setState(3);
                behavior.setSkipCollapsed(true);
            }
        }
    }

    public static int a(final View view) {
        final kotlin.jvm.internal.E e4 = new kotlin.jvm.internal.E();
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: D3.N
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return s6.a(kotlin.jvm.internal.E.this, view, view2, windowInsets);
            }
        });
        view.requestApplyInsets();
        return e4.f41130b;
    }

    public static final WindowInsets a(kotlin.jvm.internal.E e4, View view, View view2, WindowInsets insets) {
        int stableInsetTop;
        int systemBars;
        Insets insetsIgnoringVisibility;
        Intrinsics.checkNotNullParameter(view2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            systemBars = WindowInsets.Type.systemBars();
            insetsIgnoringVisibility = rootWindowInsets.getInsetsIgnoringVisibility(systemBars);
            stableInsetTop = insetsIgnoringVisibility.bottom;
        } else {
            WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
            stableInsetTop = rootWindowInsets2 != null ? rootWindowInsets2.getStableInsetTop() : 0;
        }
        e4.f41130b = stableInsetTop;
        return insets;
    }
}
