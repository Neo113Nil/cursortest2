package com.onesignal.core.activities;

import H5.AbstractC0165z;
import H5.InterfaceC0163x;
import K5.i;
import L5.k;
import N.p;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.l;
import androidx.lifecycle.L;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import com.onesignal.core.internal.permissions.h;
import java.util.Arrays;
import java.util.HashSet;
import k5.InterfaceC0475e;
import k5.v;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import o5.C0570j;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import t.AbstractC0641a;
import t.AbstractC0644d;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class PermissionsActivity extends l {
    private final InterfaceC0475e viewModel$delegate = new A.e(t.a(h.class), new f(this), new e(this), new g(null, this));

    public static final class a extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PermissionsActivity.this.handleBundleParams(null, this);
        }
    }

    public static final class b extends q5.g implements InterfaceC0747p {
        int label;

        public static final class a extends q5.g implements InterfaceC0747p {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PermissionsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PermissionsActivity permissionsActivity, InterfaceC0564d interfaceC0564d) {
                super(2, interfaceC0564d);
                this.this$0 = permissionsActivity;
            }

            @Override // q5.AbstractC0605a
            public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
                a aVar = new a(this.this$0, interfaceC0564d);
                aVar.Z$0 = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // x5.InterfaceC0747p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC0564d) obj2);
            }

            @Override // q5.AbstractC0605a
            public final Object invokeSuspend(Object obj) {
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                if (this.Z$0) {
                    this.this$0.finishActivity();
                }
                return v.f5219a;
            }

            public final Object invoke(boolean z5, InterfaceC0564d interfaceC0564d) {
                return ((a) create(Boolean.valueOf(z5), interfaceC0564d)).invokeSuspend(v.f5219a);
            }
        }

        public b(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return PermissionsActivity.this.new b(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            v vVar = v.f5219a;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return vVar;
            }
            AbstractC0676f.w(obj);
            i shouldFinish = PermissionsActivity.this.getViewModel().getShouldFinish();
            a aVar = new a(PermissionsActivity.this, null);
            this.label = 1;
            int i8 = K5.g.f1402a;
            Object c7 = L5.l.a(new K5.b(new K5.f(aVar, null), shouldFinish, C0570j.f5620f, -2, 1), null, 0, 1, 1).c(k.f1514f, this);
            if (c7 != enumC0580a) {
                c7 = vVar;
            }
            if (c7 != enumC0580a) {
                c7 = vVar;
            }
            return c7 == enumC0580a ? enumC0580a : vVar;
        }
    }

    public static final class c extends q5.g implements InterfaceC0747p {
        int label;

        public c(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return PermissionsActivity.this.new c(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                if (PermissionsActivity.this.getViewModel().getPermissionRequestType() == null) {
                    PermissionsActivity permissionsActivity = PermissionsActivity.this;
                    Bundle extras = permissionsActivity.getIntent().getExtras();
                    this.label = 1;
                    if (permissionsActivity.handleBundleParams(extras, this) == enumC0580a) {
                        return enumC0580a;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }
    }

    public static final class d extends q5.g implements InterfaceC0747p {
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Intent intent, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$intent = intent;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return PermissionsActivity.this.new d(this.$intent, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((d) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                PermissionsActivity permissionsActivity = PermissionsActivity.this;
                Bundle extras = this.$intent.getExtras();
                this.label = 1;
                if (permissionsActivity.handleBundleParams(extras, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }
    }

    public static final class e extends j implements InterfaceC0732a {
        final /* synthetic */ l $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.$this_viewModels = lVar;
        }

        @Override // x5.InterfaceC0732a
        public final V invoke() {
            V defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.i.d(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final class f extends j implements InterfaceC0732a {
        final /* synthetic */ l $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l lVar) {
            super(0);
            this.$this_viewModels = lVar;
        }

        @Override // x5.InterfaceC0732a
        public final X invoke() {
            X viewModelStore = this.$this_viewModels.getViewModelStore();
            kotlin.jvm.internal.i.d(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public static final class g extends j implements InterfaceC0732a {
        final /* synthetic */ InterfaceC0732a $extrasProducer;
        final /* synthetic */ l $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC0732a interfaceC0732a, l lVar) {
            super(0);
            this.$extrasProducer = interfaceC0732a;
            this.$this_viewModels = lVar;
        }

        @Override // x5.InterfaceC0732a
        public final O.b invoke() {
            O.b bVar;
            InterfaceC0732a interfaceC0732a = this.$extrasProducer;
            if (interfaceC0732a != null && (bVar = (O.b) interfaceC0732a.invoke()) != null) {
                return bVar;
            }
            O.b defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.i.d(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishActivity() {
        finish();
        overridePendingTransition(S1.a.onesignal_fade_in, S1.a.onesignal_fade_out);
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
    public final Object handleBundleParams(Bundle bundle, InterfaceC0564d interfaceC0564d) {
        a aVar;
        Object obj;
        int i7;
        String string;
        PermissionsActivity permissionsActivity;
        if (interfaceC0564d instanceof a) {
            aVar = (a) interfaceC0564d;
            int i8 = aVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.label = i8 - Integer.MIN_VALUE;
                obj = aVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = aVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    if (bundle != null) {
                        reregisterCallbackHandlers(bundle);
                        String string2 = bundle.getString(h.INTENT_EXTRA_PERMISSION_TYPE);
                        string = bundle.getString(h.INTENT_EXTRA_ANDROID_PERMISSION_STRING);
                        h viewModel = getViewModel();
                        aVar.L$0 = this;
                        aVar.L$1 = string;
                        aVar.label = 1;
                        obj = viewModel.initialize(this, string2, string, aVar);
                        if (obj == enumC0580a) {
                            return enumC0580a;
                        }
                        permissionsActivity = this;
                    }
                    return v.f5219a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                string = (String) aVar.L$1;
                permissionsActivity = (PermissionsActivity) aVar.L$0;
                AbstractC0676f.w(obj);
                if (((Boolean) obj).booleanValue()) {
                    permissionsActivity.finishActivity();
                } else if (string != null) {
                    permissionsActivity.requestPermission(string);
                }
                return v.f5219a;
            }
        }
        aVar = new a(interfaceC0564d);
        obj = aVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = aVar.label;
        if (i7 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return v.f5219a;
    }

    private final void requestPermission(String str) {
        if (getViewModel().shouldRequestPermission()) {
            getViewModel().recordRationaleState(AbstractC0644d.b(this, str));
            String[] strArr = {str};
            HashSet hashSet = new HashSet();
            if (TextUtils.isEmpty(strArr[0])) {
                throw new IllegalArgumentException(p.b(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[0], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(0);
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[1 - size] : strArr;
            if (size > 0) {
                if (size == 1) {
                    return;
                }
                if (!hashSet.contains(0)) {
                    strArr2[0] = strArr[0];
                }
            }
            AbstractC0641a.b(this, strArr, 2);
        }
    }

    private final void reregisterCallbackHandlers(Bundle bundle) {
        kotlin.jvm.internal.i.b(bundle);
        String string = bundle.getString(h.INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(C1.c.h("Could not find callback class for PermissionActivity: ", string));
        }
    }

    @Override // androidx.activity.l, t.AbstractActivityC0648h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null) {
            finishActivity();
        } else {
            AbstractC0165z.l(L.e(this), null, new b(null), 3);
            AbstractC0165z.l(L.e(this), null, new c(null), 3);
        }
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.onNewIntent(intent);
        AbstractC0165z.l(L.e(this), null, new d(intent, null), 3);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        getViewModel().resetWaitingState();
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.i.e(permissions, "permissions");
        kotlin.jvm.internal.i.e(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 2) {
            getViewModel().onRequestPermissionsResult(permissions, grantResults, permissions.length != 0 ? AbstractC0644d.b(this, permissions[0]) : false);
        }
    }
}
