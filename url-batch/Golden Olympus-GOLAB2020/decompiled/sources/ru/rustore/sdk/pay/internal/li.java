package ru.rustore.sdk.pay.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class li {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f44585a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public s6 f44586b;

    public static final class a extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u1 f44588b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u1 u1Var) {
            super(1);
            this.f44588b = u1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            li.a(li.this, transaction);
            transaction.b(R.id.pay_container, this.f44588b, u1.class.getSimpleName());
            return Unit.f41027a;
        }
    }

    public static final class b implements FragmentManager.k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FragmentManager f44589a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WeakReference<li> f44590b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PurchaseId f44591c;

        public b(FragmentManager fragmentManager, WeakReference<li> weakReference, PurchaseId purchaseId) {
            this.f44589a = fragmentManager;
            this.f44590b = weakReference;
            this.f44591c = purchaseId;
        }

        @Override // androidx.fragment.app.FragmentManager.k
        public final void onBackStackChanged() {
            this.f44589a.d1(this);
            li liVar = this.f44590b.get();
            if (liVar != null) {
                PurchaseId purchaseId = this.f44591c;
                int i4 = i5.f44299i;
                Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                i5 i5Var = new i5();
                i5Var.setArguments(androidx.core.os.d.a(TuplesKt.to("purchaseId", purchaseId)));
                liVar.a(i5Var, new ti(liVar, i5Var));
            }
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ag f44593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ag agVar) {
            super(1);
            this.f44593b = agVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            li.a(li.this, transaction);
            transaction.b(R.id.pay_container, this.f44593b, ag.class.getSimpleName());
            return Unit.f41027a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ig f44595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ig igVar) {
            super(1);
            this.f44595b = igVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            li.a(li.this, transaction);
            transaction.b(R.id.pay_container, this.f44595b, ig.class.getSimpleName());
            return Unit.f41027a;
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lg f44597b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(lg lgVar) {
            super(1);
            this.f44597b = lgVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            li.a(li.this, transaction);
            transaction.o(R.id.pay_container, this.f44597b, lg.class.getSimpleName());
            return Unit.f41027a;
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sg f44599b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(sg sgVar) {
            super(1);
            this.f44599b = sgVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            li.a(li.this, transaction);
            transaction.o(R.id.pay_container, this.f44599b, sg.class.getSimpleName());
            return Unit.f41027a;
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rn f44601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(rn rnVar) {
            super(1);
            this.f44601b = rnVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            li.a(li.this, transaction);
            transaction.o(R.id.pay_container, this.f44601b, rn.class.getSimpleName());
            return Unit.f41027a;
        }
    }

    public li(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44585a = context;
    }

    public static final void a(li liVar, androidx.fragment.app.z zVar) {
        liVar.getClass();
        int i4 = R.anim.sdk_pay_anim_fade_in;
        int i5 = R.anim.sdk_pay_anim_fade_out;
        Intrinsics.checkNotNullExpressionValue(zVar.p(i4, i5, i5, i5), "setCustomAnimations(\n   …_anim_fade_out,\n        )");
    }

    public final void b(@NotNull Url paymentUrl) {
        Intrinsics.checkNotNullParameter(paymentUrl, "redirectUrl");
        int i4 = ig.f44332e;
        Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
        ig igVar = new ig();
        igVar.setArguments(androidx.core.os.d.a(TuplesKt.to("paymentUrl", paymentUrl.getValue())));
        a(igVar, new d(igVar));
    }

    public final void c(@NotNull PurchaseId purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        int i4 = sg.f45004i;
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        sg sgVar = new sg();
        sgVar.setArguments(androidx.core.os.d.a(TuplesKt.to("purchaseId", purchaseId)));
        a(sgVar, new f(sgVar));
    }

    public final FragmentManager a() {
        s6 s6Var = this.f44586b;
        if (s6Var != null) {
            return s6Var.getChildFragmentManager();
        }
        return null;
    }

    public final void a(@NotNull Url paymentUrl) {
        Intrinsics.checkNotNullParameter(paymentUrl, "redirectUrl");
        int i4 = ag.f43809e;
        Intrinsics.checkNotNullParameter(paymentUrl, "paymentUrl");
        ag agVar = new ag();
        agVar.setArguments(androidx.core.os.d.a(TuplesKt.to("paymentUrl", paymentUrl.getValue())));
        a(agVar, new c(agVar));
    }

    public final void b(@NotNull String cardBindingId) {
        Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
        int i4 = lg.f44566l;
        Intrinsics.checkNotNullParameter(cardBindingId, "cardBindingId");
        lg lgVar = new lg();
        lgVar.setArguments(androidx.core.os.d.a(TuplesKt.to("cardBindingKey", cardBindingId)));
        a(lgVar, new e(lgVar));
    }

    public final void c(@NotNull Url authUrl) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        int i4 = rn.f44936d;
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        rn rnVar = new rn();
        rnVar.setArguments(androidx.core.os.d.a(TuplesKt.to("authUrl", authUrl)));
        a(rnVar, new g(rnVar));
    }

    public final void a(@NotNull hf result, boolean z4) {
        Intrinsics.checkNotNullParameter(result, "purchaseResult");
        FragmentManager a4 = a();
        if (a4 != null) {
            if (z4) {
                a4.j(new qi(a4, new WeakReference(this), result));
                a4.X0(null, 1);
                return;
            }
            int i4 = lf.f44544r;
            Intrinsics.checkNotNullParameter(result, "result");
            lf lfVar = new lf();
            lfVar.setArguments(androidx.core.os.d.a(TuplesKt.to("purchaseResult", result)));
            a(lfVar, new ri(this, lfVar));
        }
    }

    public final void b(@NotNull PurchaseId purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        FragmentManager a4 = a();
        if (a4 != null) {
            a4.j(new b(a4, new WeakReference(this), purchaseId));
            a4.X0(null, 1);
        }
    }

    public final void a(@NotNull PurchaseId purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        int i4 = u1.f45056i;
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        u1 u1Var = new u1();
        u1Var.setArguments(androidx.core.os.d.a(TuplesKt.to("purchaseId", purchaseId)));
        a(u1Var, new a(u1Var));
    }

    public final void a(Fragment fragment, Function1<? super androidx.fragment.app.z, Unit> function1) {
        androidx.fragment.app.z o4;
        FragmentManager a4 = a();
        if (a4 == null || (o4 = a4.o()) == null) {
            return;
        }
        function1.invoke(o4);
        o4.f(fragment.getClass().getSimpleName());
        o4.h();
    }

    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.Companion;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.setFlags(268435456);
            this.f44585a.startActivity(intent);
            Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m243constructorimpl(ResultKt.createFailure(th));
        }
    }
}
