package com.onesignal.core.activities;

import D6.y;
import R5.InterfaceC0168h;
import X5.j;
import a.AbstractC0169a;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.O;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import com.onesignal.core.internal.permissions.h;
import d.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;
import p6.EnumC0830a;
import q6.p;
import q6.t;
import q6.w;
import r6.m;
import r6.r;
import u2.C0944a;

@Metadata
/* loaded from: classes.dex */
public final class PermissionsActivity extends o {
    private final InterfaceC0168h viewModel$delegate;

    public static final class a extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PermissionsActivity.this.handleBundleParams(null, this);
        }
    }

    public static final class b extends j implements Function2 {
        int label;

        public static final class a extends j implements Function2 {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PermissionsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PermissionsActivity permissionsActivity, V5.b bVar) {
                super(2, bVar);
                this.this$0 = permissionsActivity;
            }

            @Override // X5.a
            public final V5.b create(Object obj, V5.b bVar) {
                a aVar = new a(this.this$0, bVar);
                aVar.Z$0 = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (V5.b) obj2);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                W5.a aVar = W5.a.f2787d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                if (this.Z$0) {
                    this.this$0.finishActivity();
                }
                return Unit.f6114a;
            }

            public final Object invoke(boolean z7, V5.b bVar) {
                return ((a) create(Boolean.valueOf(z7), bVar)).invokeSuspend(Unit.f6114a);
            }
        }

        public b(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return PermissionsActivity.this.new b(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                t shouldFinish = PermissionsActivity.this.getViewModel().getShouldFinish();
                a aVar2 = new a(PermissionsActivity.this, null);
                this.label = 1;
                int i5 = p.f7406a;
                Object e7 = w.b(new m(new q6.o(aVar2, null), shouldFinish, kotlin.coroutines.g.f6146d, -2, EnumC0830a.f7215d), 0).e(r.f7581d, this);
                if (e7 != aVar) {
                    e7 = Unit.f6114a;
                }
                if (e7 != aVar) {
                    e7 = Unit.f6114a;
                }
                if (e7 == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((b) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class c extends j implements Function2 {
        int label;

        public c(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return PermissionsActivity.this.new c(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                if (PermissionsActivity.this.getViewModel().getPermissionRequestType() == null) {
                    PermissionsActivity permissionsActivity = PermissionsActivity.this;
                    Bundle extras = permissionsActivity.getIntent().getExtras();
                    this.label = 1;
                    if (permissionsActivity.handleBundleParams(extras, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((c) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class d extends j implements Function2 {
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Intent intent, V5.b bVar) {
            super(2, bVar);
            this.$intent = intent;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return PermissionsActivity.this.new d(this.$intent, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                PermissionsActivity permissionsActivity = PermissionsActivity.this;
                Bundle extras = this.$intent.getExtras();
                this.label = 1;
                if (permissionsActivity.handleBundleParams(extras, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((d) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class e extends kotlin.jvm.internal.p implements Function0 {
        final /* synthetic */ o $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o oVar) {
            super(0);
            this.$this_viewModels = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Z invoke() {
            Z defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final class f extends kotlin.jvm.internal.p implements Function0 {
        final /* synthetic */ o $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o oVar) {
            super(0);
            this.$this_viewModels = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final b0 invoke() {
            b0 viewModelStore = this.$this_viewModels.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public static final class g extends kotlin.jvm.internal.p implements Function0 {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ o $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, o oVar) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_viewModels = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final b0.c invoke() {
            b0.c cVar;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (cVar = (b0.c) function0.invoke()) != null) {
                return cVar;
            }
            b0.c defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    public PermissionsActivity() {
        e factoryProducer = new e(this);
        C0643h viewModelClass = E.a(h.class);
        f storeProducer = new f(this);
        g extrasProducer = new g(null, this);
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        y yVar = new y();
        yVar.f634e = viewModelClass;
        yVar.f633d = storeProducer;
        yVar.f635i = factoryProducer;
        yVar.f636l = extrasProducer;
        this.viewModel$delegate = yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishActivity() {
        finish();
        overridePendingTransition(C0944a.onesignal_fade_in, C0944a.onesignal_fade_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h getViewModel() {
        return (h) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleBundleParams(Bundle bundle, V5.b bVar) {
        a aVar;
        Object obj;
        int i2;
        String string;
        PermissionsActivity permissionsActivity;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i5 = aVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.label = i5 - Integer.MIN_VALUE;
                obj = aVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = aVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    if (bundle != null) {
                        reregisterCallbackHandlers(bundle);
                        String string2 = bundle.getString(h.INTENT_EXTRA_PERMISSION_TYPE);
                        string = bundle.getString(h.INTENT_EXTRA_ANDROID_PERMISSION_STRING);
                        h viewModel = getViewModel();
                        aVar.L$0 = this;
                        aVar.L$1 = string;
                        aVar.label = 1;
                        obj = viewModel.initialize(this, string2, string, aVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        permissionsActivity = this;
                    }
                    return Unit.f6114a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                string = (String) aVar.L$1;
                permissionsActivity = (PermissionsActivity) aVar.L$0;
                V6.b.P(obj);
                if (((Boolean) obj).booleanValue()) {
                    permissionsActivity.finishActivity();
                } else if (string != null) {
                    permissionsActivity.requestPermission(string);
                }
                return Unit.f6114a;
            }
        }
        aVar = new a(bVar);
        obj = aVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = aVar.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Unit.f6114a;
    }

    private final void requestPermission(String str) {
        if (getViewModel().shouldRequestPermission()) {
            getViewModel().recordRationaleState(AbstractC0169a.C(this, str));
            AbstractC0169a.B(this, new String[]{str}, 2);
        }
    }

    private final void reregisterCallbackHandlers(Bundle bundle) {
        Intrinsics.b(bundle);
        String string = bundle.getString(h.INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(r4.f.i("Could not find callback class for PermissionActivity: ", string));
        }
    }

    @Override // d.o, y.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null) {
            finishActivity();
        } else {
            AbstractC0792z.l(O.e(this), null, new b(null), 3);
            AbstractC0792z.l(O.e(this), null, new c(null), 3);
        }
    }

    @Override // d.o, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        AbstractC0792z.l(O.e(this), null, new d(intent, null), 3);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        getViewModel().resetWaitingState();
    }

    @Override // d.o, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i2, permissions, grantResults);
        if (i2 == 2) {
            getViewModel().onRequestPermissionsResult(permissions, grantResults, permissions.length != 0 ? AbstractC0169a.C(this, permissions[0]) : false);
        }
    }
}
