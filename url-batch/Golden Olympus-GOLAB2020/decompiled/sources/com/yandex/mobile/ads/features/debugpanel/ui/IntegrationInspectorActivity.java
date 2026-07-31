package com.yandex.mobile.ads.features.debugpanel.ui;

import W1.h;
import W1.i;
import a2.AbstractC1241b;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.features.debugpanel.common.BaseActivity;
import com.yandex.mobile.ads.impl.ax;
import com.yandex.mobile.ads.impl.fw;
import com.yandex.mobile.ads.impl.kh2;
import com.yandex.mobile.ads.impl.no0;
import com.yandex.mobile.ads.impl.rx;
import com.yandex.mobile.ads.impl.sw;
import com.yandex.mobile.ads.impl.sx;
import com.yandex.mobile.ads.impl.tx;
import com.yandex.mobile.ads.impl.ux;
import com.yandex.mobile.ads.impl.vx;
import com.yandex.mobile.ads.impl.wg2;
import com.yandex.mobile.ads.impl.yg2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.G;
import r2.InterfaceC3396f;
import r2.InterfaceC3397g;

@Metadata
/* loaded from: classes2.dex */
public final class IntegrationInspectorActivity extends BaseActivity<no0> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final h f22444d = i.b(new a());

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final h f22445e = i.b(new e());

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final h f22446f = i.b(new d());

    static final class a extends s implements Function0<sw> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Context applicationContext = IntegrationInspectorActivity.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return new sw(applicationContext);
        }
    }

    @f(c = "com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity$setupUiHandlers$1$1", f = "IntegrationInspectorActivity.kt", l = {43}, m = "invokeSuspend")
    static final class b extends l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f22448b;

        static final class a<T> implements InterfaceC3397g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ IntegrationInspectorActivity f22450a;

            a(IntegrationInspectorActivity integrationInspectorActivity) {
                this.f22450a = integrationInspectorActivity;
            }

            @Override // r2.InterfaceC3397g
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                IntegrationInspectorActivity.b(this.f22450a).a((sx) obj);
                return Unit.f41027a;
            }
        }

        b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return IntegrationInspectorActivity.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return IntegrationInspectorActivity.this.new b((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f22448b;
            if (i4 == 0) {
                ResultKt.a(obj);
                InterfaceC3396f c4 = IntegrationInspectorActivity.d(IntegrationInspectorActivity.this).c();
                a aVar = new a(IntegrationInspectorActivity.this);
                this.f22448b = 1;
                if (c4.a(aVar, this) == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return Unit.f41027a;
        }
    }

    @f(c = "com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity$setupUiHandlers$1$2", f = "IntegrationInspectorActivity.kt", l = {48}, m = "invokeSuspend")
    static final class c extends l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f22451b;

        static final class a<T> implements InterfaceC3397g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ IntegrationInspectorActivity f22453a;

            a(IntegrationInspectorActivity integrationInspectorActivity) {
                this.f22453a = integrationInspectorActivity;
            }

            @Override // r2.InterfaceC3397g
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                IntegrationInspectorActivity.c(this.f22453a).a((ux) obj);
                return Unit.f41027a;
            }
        }

        c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return IntegrationInspectorActivity.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return IntegrationInspectorActivity.this.new c((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f22451b;
            if (i4 == 0) {
                ResultKt.a(obj);
                G d4 = IntegrationInspectorActivity.d(IntegrationInspectorActivity.this).d();
                a aVar = new a(IntegrationInspectorActivity.this);
                this.f22451b = 1;
                if (d4.a(aVar, this) == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            throw new W1.f();
        }
    }

    static final class d extends s implements Function0<tx> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new tx(IntegrationInspectorActivity.this);
        }
    }

    static final class e extends s implements Function0<vx> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            IntegrationInspectorActivity integrationInspectorActivity = IntegrationInspectorActivity.this;
            com.yandex.mobile.ads.features.debugpanel.ui.a aVar = new com.yandex.mobile.ads.features.debugpanel.ui.a(IntegrationInspectorActivity.d(IntegrationInspectorActivity.this));
            ax a4 = IntegrationInspectorActivity.a(IntegrationInspectorActivity.this).a();
            return new vx(integrationInspectorActivity, aVar, a4, new LinearLayoutManager(integrationInspectorActivity, 1, false), new fw(aVar, a4, new wg2(aVar, a4), new kh2()));
        }
    }

    public static final sw a(IntegrationInspectorActivity integrationInspectorActivity) {
        return (sw) integrationInspectorActivity.f22444d.getValue();
    }

    public static final tx b(IntegrationInspectorActivity integrationInspectorActivity) {
        return (tx) integrationInspectorActivity.f22446f.getValue();
    }

    public static final vx c(IntegrationInspectorActivity integrationInspectorActivity) {
        return (vx) integrationInspectorActivity.f22445e.getValue();
    }

    private final void e() {
        InterfaceC3316J a4 = a();
        AbstractC3337k.d(a4, null, null, new b(null), 3, null);
        AbstractC3337k.d(a4, null, null, new c(null), 3, null);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().a(rx.d.f31463a);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    protected final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_debug);
        d();
        b().a(rx.a.f31460a);
        e();
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    protected final void onDestroy() {
        ((sw) this.f22444d.getValue()).a().a();
        super.onDestroy();
    }

    public static final /* synthetic */ no0 d(IntegrationInspectorActivity integrationInspectorActivity) {
        return integrationInspectorActivity.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IntegrationInspectorActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b().a(rx.g.f31466a);
    }

    private final void d() {
        ((ImageButton) findViewById(R.id.toolbar_share_button)).setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.features.debugpanel.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntegrationInspectorActivity.a(IntegrationInspectorActivity.this, view);
            }
        });
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity
    @NotNull
    public final yg2<no0> c() {
        return ((sw) this.f22444d.getValue()).b();
    }
}
