package com.onesignal.core.activities;

import B2.N;
import D.AbstractC0287g;
import D.H;
import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import R7.l;
import S7.n;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.p;
import androidx.lifecycle.L;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import com.onesignal.core.internal.permissions.h;
import h0.AbstractC4556b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import q7.InterfaceC4936e;
import q7.v;
import s4.C4998a;
import t0.AbstractC5051n;
import v7.C5139j;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class PermissionsActivity extends p {
    private final InterfaceC4936e viewModel$delegate = new N(s.a(h.class), new f(this), new e(this), new g(null, this));

    public static final class a extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PermissionsActivity.this.handleBundleParams(null, this);
        }
    }

    public static final class b extends x7.h implements E7.p {
        int label;

        public static final class a extends x7.h implements E7.p {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PermissionsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PermissionsActivity permissionsActivity, InterfaceC5133d interfaceC5133d) {
                super(2, interfaceC5133d);
                this.this$0 = permissionsActivity;
            }

            @Override // x7.AbstractC5217a
            public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
                a aVar = new a(this.this$0, interfaceC5133d);
                aVar.Z$0 = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // E7.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC5133d) obj2);
            }

            @Override // x7.AbstractC5217a
            public final Object invokeSuspend(Object obj) {
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                if (this.Z$0) {
                    this.this$0.finishActivity();
                }
                return v.f40183a;
            }

            public final Object invoke(boolean z8, InterfaceC5133d interfaceC5133d) {
                return ((a) create(Boolean.valueOf(z8), interfaceC5133d)).invokeSuspend(v.f40183a);
            }
        }

        public b(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return PermissionsActivity.this.new b(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            v vVar = v.f40183a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                return vVar;
            }
            com.bumptech.glide.f.r(obj);
            l shouldFinish = PermissionsActivity.this.getViewModel().getShouldFinish();
            a aVar = new a(PermissionsActivity.this, null);
            this.label = 1;
            int i4 = R7.h.f2862a;
            R7.g gVar = new R7.g(aVar, null);
            InterfaceC5138i interfaceC5138i = C5139j.f41372n;
            Q7.a aVar2 = Q7.a.f2731n;
            interfaceC5138i.n(interfaceC5138i);
            kotlin.jvm.internal.h.a(interfaceC5138i, interfaceC5138i);
            Object j9 = new H(gVar, shouldFinish, interfaceC5138i, 0, aVar2).j(n.f3013n, this);
            if (j9 != enumC5179a) {
                j9 = vVar;
            }
            if (j9 != enumC5179a) {
                j9 = vVar;
            }
            return j9 == enumC5179a ? enumC5179a : vVar;
        }
    }

    public static final class c extends x7.h implements E7.p {
        int label;

        public c(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return PermissionsActivity.this.new c(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((c) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                if (PermissionsActivity.this.getViewModel().getPermissionRequestType() == null) {
                    PermissionsActivity permissionsActivity = PermissionsActivity.this;
                    Bundle extras = permissionsActivity.getIntent().getExtras();
                    this.label = 1;
                    if (permissionsActivity.handleBundleParams(extras, this) == enumC5179a) {
                        return enumC5179a;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }
    }

    public static final class d extends x7.h implements E7.p {
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Intent intent, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$intent = intent;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return PermissionsActivity.this.new d(this.$intent, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((d) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                PermissionsActivity permissionsActivity = PermissionsActivity.this;
                Bundle extras = this.$intent.getExtras();
                this.label = 1;
                if (permissionsActivity.handleBundleParams(extras, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }
    }

    public static final class e extends i implements E7.a {
        final /* synthetic */ p $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p pVar) {
            super(0);
            this.$this_viewModels = pVar;
        }

        @Override // E7.a
        public final V invoke() {
            V defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.h.d(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final class f extends i implements E7.a {
        final /* synthetic */ p $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p pVar) {
            super(0);
            this.$this_viewModels = pVar;
        }

        @Override // E7.a
        public final X invoke() {
            X viewModelStore = this.$this_viewModels.getViewModelStore();
            kotlin.jvm.internal.h.d(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public static final class g extends i implements E7.a {
        final /* synthetic */ E7.a $extrasProducer;
        final /* synthetic */ p $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(E7.a aVar, p pVar) {
            super(0);
            this.$extrasProducer = aVar;
            this.$this_viewModels = pVar;
        }

        @Override // E7.a
        public final AbstractC4556b invoke() {
            AbstractC4556b abstractC4556b;
            E7.a aVar = this.$extrasProducer;
            if (aVar != null && (abstractC4556b = (AbstractC4556b) aVar.invoke()) != null) {
                return abstractC4556b;
            }
            AbstractC4556b defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.h.d(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishActivity() {
        finish();
        overridePendingTransition(C4998a.onesignal_fade_in, C4998a.onesignal_fade_out);
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
    public final Object handleBundleParams(Bundle bundle, InterfaceC5133d interfaceC5133d) {
        a aVar;
        Object obj;
        int i;
        String string;
        PermissionsActivity permissionsActivity;
        if (interfaceC5133d instanceof a) {
            aVar = (a) interfaceC5133d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                obj = aVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    if (bundle != null) {
                        reregisterCallbackHandlers(bundle);
                        String string2 = bundle.getString(h.INTENT_EXTRA_PERMISSION_TYPE);
                        string = bundle.getString(h.INTENT_EXTRA_ANDROID_PERMISSION_STRING);
                        h viewModel = getViewModel();
                        aVar.L$0 = this;
                        aVar.L$1 = string;
                        aVar.label = 1;
                        obj = viewModel.initialize(this, string2, string, aVar);
                        if (obj == enumC5179a) {
                            return enumC5179a;
                        }
                        permissionsActivity = this;
                    }
                    return v.f40183a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                string = (String) aVar.L$1;
                permissionsActivity = (PermissionsActivity) aVar.L$0;
                com.bumptech.glide.f.r(obj);
                if (((Boolean) obj).booleanValue()) {
                    permissionsActivity.finishActivity();
                } else if (string != null) {
                    permissionsActivity.requestPermission(string);
                }
                return v.f40183a;
            }
        }
        aVar = new a(interfaceC5133d);
        obj = aVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return v.f40183a;
    }

    private final void requestPermission(String str) {
        if (getViewModel().shouldRequestPermission()) {
            getViewModel().recordRationaleState(AbstractC0287g.e(this, str));
            AbstractC0287g.d(this, new String[]{str}, 2);
        }
    }

    private final void reregisterCallbackHandlers(Bundle bundle) {
        kotlin.jvm.internal.h.b(bundle);
        String string = bundle.getString(h.INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(AbstractC5051n.f("Could not find callback class for PermissionActivity: ", string));
        }
    }

    @Override // androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null) {
            finishActivity();
        } else {
            AbstractC0399y.o(L.e(this), null, new b(null), 3);
            AbstractC0399y.o(L.e(this), null, new c(null), 3);
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.onNewIntent(intent);
        AbstractC0399y.o(L.e(this), null, new d(intent, null), 3);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        getViewModel().resetWaitingState();
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.h.e(permissions, "permissions");
        kotlin.jvm.internal.h.e(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        if (i == 2) {
            getViewModel().onRequestPermissionsResult(permissions, grantResults, permissions.length != 0 ? AbstractC0287g.e(this, permissions[0]) : false);
        }
    }
}
