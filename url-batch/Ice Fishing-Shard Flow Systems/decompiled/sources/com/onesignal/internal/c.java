package com.onesignal.internal;

import R5.C0164d;
import R5.InterfaceC0168h;
import R5.i;
import R5.k;
import X5.j;
import android.content.Context;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.h;
import com.onesignal.core.CoreModule;
import com.onesignal.session.SessionModule;
import com.onesignal.user.UserModule;
import com.onesignal.user.internal.d;
import com.onesignal.user.internal.e;
import com.onesignal.user.internal.l;
import h3.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlin.text.t;
import n2.InterfaceC0751b;
import n2.InterfaceC0752c;
import n6.AbstractC0786t;
import n6.AbstractC0792z;
import n6.C0781n;
import n6.InterfaceC0780m;
import n6.InterfaceC0789w;
import s2.InterfaceC0889a;
import u6.C0953e;
import u6.ExecutorC0952d;

/* loaded from: classes.dex */
public final class c implements InterfaceC0751b, t2.b {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private final Object applicationServiceLock;
    private volatile boolean applicationServiceStarted;
    private final InterfaceC0168h configModel$delegate;
    private final K2.a debug;
    private final InterfaceC0168h featureManager$delegate;
    private final InterfaceC0168h identityModelStore$delegate;
    private final InterfaceC0168h identityVerificationService$delegate;
    private Exception initFailureException;
    private final Object initLock;
    private volatile a initState;
    private final AbstractC0786t ioDispatcher;
    private final InterfaceC0168h jwtTokenStore$delegate;
    private final List<String> listOfModules;
    private final InterfaceC0168h loginHelper$delegate;
    private final Object loginLogoutLock;
    private final InterfaceC0168h logoutHelper$delegate;
    private final InterfaceC0168h operationRepo$delegate;
    private g otelManager;
    private final InterfaceC0168h preferencesService$delegate;
    private final InterfaceC0168h propertiesModelStore$delegate;
    private final String sdkVersion;
    private final t2.d services;
    private final InterfaceC0168h subscriptionModelStore$delegate;
    private volatile InterfaceC0780m suspendCompletion;
    private final InterfaceC0168h userSwitcher$delegate;

    public static final class A extends p implements Function0 {
        public A() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.user.internal.d invoke() {
            return new com.onesignal.user.internal.d(c.this.getIdentityModelStore(), c.this.getUserSwitcher(), c.this.getOperationRepo(), c.this.getConfigModel(), c.this.getJwtTokenStore(), c.this.loginLogoutLock);
        }
    }

    public static final class B extends j implements Function2 {
        final /* synthetic */ String $externalId;
        final /* synthetic */ String $jwtBearerToken;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(String str, String str2, c cVar, V5.b bVar) {
            super(2, bVar);
            this.$externalId = str;
            this.$jwtBearerToken = str2;
            this.this$0 = cVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new B(this.$externalId, this.$jwtBearerToken, this.this$0, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        
            if (r1.enqueueLogin$com_onesignal_core(r6, r5) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        
            if (r6.suspendUntilInit("login", r5) == r0) goto L23;
         */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                K2.c cVar = K2.c.DEBUG;
                StringBuilder sb = new StringBuilder("login(externalId: ");
                sb.append(this.$externalId);
                sb.append(", jwtBearerToken: ...");
                String str = this.$jwtBearerToken;
                sb.append(str != null ? t.t(str) : null);
                sb.append(')');
                com.onesignal.debug.internal.logging.b.log(cVar, sb.toString());
                c cVar2 = this.this$0;
                this.label = 1;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                V6.b.P(obj);
            }
            d.a switchUser$com_onesignal_core = this.this$0.getLoginHelper().switchUser$com_onesignal_core(this.$externalId, this.$jwtBearerToken);
            if (switchUser$com_onesignal_core == null) {
                return Unit.f6114a;
            }
            com.onesignal.user.internal.d loginHelper = this.this$0.getLoginHelper();
            this.label = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((B) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class C extends j implements Function1 {
        final /* synthetic */ e.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(e.a aVar, V5.b bVar) {
            super(1, bVar);
            this.$context = aVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return c.this.new C(this.$context, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((C) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(this.$context);
            return Unit.f6114a;
        }
    }

    public static final class D extends j implements Function2 {
        final /* synthetic */ e.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(e.a aVar, V5.b bVar) {
            super(2, bVar);
            this.$context = aVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new D(this.$context, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(this.$context);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((D) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class E extends p implements Function0 {
        public E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.user.internal.e invoke() {
            return new com.onesignal.user.internal.e(c.this.getIdentityModelStore(), c.this.getUserSwitcher(), c.this.getOperationRepo(), c.this.getConfigModel(), c.this.getSubscriptionModelStore(), c.this.getIdentityVerificationService(), c.this.loginLogoutLock);
        }
    }

    public static final class F extends j implements Function2 {
        int label;

        public F(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new F(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "logoutSuspend()");
                c cVar = c.this;
                this.label = 1;
                if (cVar.suspendUntilInit("logout", this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            e.a switchUser$com_onesignal_core = c.this.getLogoutHelper().switchUser$com_onesignal_core();
            if (switchUser$com_onesignal_core == null) {
                return Unit.f6114a;
            }
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(switchUser$com_onesignal_core);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((F) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class G extends p implements Function0 {
        public G() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final n invoke() {
            return (n) c.this.services.getService(n.class);
        }
    }

    public static final class H extends p implements Function0 {
        public H() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final F2.f invoke() {
            return (F2.f) c.this.services.getService(F2.f.class);
        }
    }

    public static final class I extends p implements Function0 {
        public I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final H2.b invoke() {
            return (H2.b) c.this.services.getService(H2.b.class);
        }
    }

    public static final class J extends p implements Function0 {
        public J() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.user.internal.properties.b invoke() {
            return (com.onesignal.user.internal.properties.b) c.this.services.getService(com.onesignal.user.internal.properties.b.class);
        }
    }

    public static final class K extends p implements Function0 {
        public K() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final I3.a invoke() {
            return (I3.a) c.this.services.getService(I3.a.class);
        }
    }

    public static final class L extends j implements Function2 {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(boolean z7, V5.b bVar) {
            super(2, bVar);
            this.$value = z7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new L(this.$value, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            Boolean bool = c.this._consentGiven;
            c.this._consentGiven = Boolean.valueOf(this.$value);
            c.this.getConfigModel().setConsentGiven(Boolean.valueOf(this.$value));
            if (!Intrinsics.a(bool, Boolean.valueOf(this.$value)) && this.$value) {
                c.this.getOperationRepo().forceExecuteOperations();
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((L) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class M extends j implements Function2 {
        final /* synthetic */ boolean $required;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(boolean z7, V5.b bVar) {
            super(2, bVar);
            this.$required = z7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new M(this.$required, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            c.this._consentRequired = Boolean.valueOf(this.$required);
            c.this.getConfigModel().setConsentRequired(Boolean.valueOf(this.$required));
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((M) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class N extends j implements Function2 {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(boolean z7, V5.b bVar) {
            super(2, bVar);
            this.$value = z7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new N(this.$value, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            c.this._disableGMSMissingPrompt = Boolean.valueOf(this.$value);
            c.this.getConfigModel().setDisableGMSMissingPrompt(this.$value);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((N) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class O extends p implements Function0 {
        public O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Y3.e invoke() {
            return (Y3.e) c.this.services.getService(Y3.e.class);
        }
    }

    public static final class P extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public P(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.suspendAndReturn(null, this);
        }
    }

    public static final class Q extends j implements Function2 {
        final /* synthetic */ String $externalId;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Q(String str, String str2, c cVar, V5.b bVar) {
            super(2, bVar);
            this.$externalId = str;
            this.$token = str2;
            this.this$0 = cVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new Q(this.$externalId, this.$token, this.this$0, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "updateUserJwtSuspend(externalId: " + this.$externalId + ", token: ..." + t.t(this.$token) + ')');
                c cVar = this.this$0;
                this.label = 1;
                if (cVar.suspendUntilInit("updateUserJwt", this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            if (!this.this$0.isInitialized()) {
                throw new IllegalStateException("'initWithContext failed' before 'updateUserJwt'");
            }
            this.this$0.getJwtTokenStore().putJwt(this.$externalId, this.$token);
            this.this$0.getOperationRepo().forceExecuteOperations();
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((Q) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class R extends p implements Function0 {
        public R() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final O3.a invoke() {
            return (O3.a) c.this.services.getService(O3.a.class);
        }
    }

    public static final class S extends p implements Function0 {

        public static final class a extends p implements Function0 {
            final /* synthetic */ Context $appContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.$appContext = context;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Context invoke() {
                return this.$appContext;
            }
        }

        public S() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final l invoke() {
            Context appContext = ((v2.f) c.this.services.getService(v2.f.class)).getAppContext();
            return new l(c.this.getPreferencesService(), c.this.getOperationRepo(), c.this.services, null, c.this.getIdentityModelStore(), c.this.getPropertiesModelStore(), c.this.getSubscriptionModelStore(), c.this.getConfigModel(), null, com.onesignal.common.c.INSTANCE.getCarrierName(appContext), Build.VERSION.RELEASE, null, new a(appContext), 2312, null);
        }
    }

    public static final class T extends j implements Function2 {
        final /* synthetic */ String $operationName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T(String str, V5.b bVar) {
            super(2, bVar);
            this.$operationName = str;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new T(this.$operationName, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                c cVar = c.this;
                String str = this.$operationName;
                this.label = 1;
                if (cVar.waitUntilInitInternal(str, this) == aVar) {
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
            return ((T) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.internal.c$a, reason: case insensitive filesystem */
    public static final class C0330a extends X5.c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0330a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.awaitInitCompletion(null, null, this);
        }
    }

    /* renamed from: com.onesignal.internal.c$b, reason: case insensitive filesystem */
    public static final class C0331b extends j implements Function2 {
        final /* synthetic */ Function0<T> $getter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0331b(Function0<? extends T> function0, V5.b bVar) {
            super(2, bVar);
            this.$getter = function0;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new C0331b(this.$getter, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return obj;
            }
            V6.b.P(obj);
            c cVar = c.this;
            Function0<T> function0 = this.$getter;
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(function0, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0331b) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.internal.c$c, reason: collision with other inner class name */
    public static final class C0046c extends p implements Function0 {
        public C0046c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.core.internal.config.b invoke() {
            return (com.onesignal.core.internal.config.b) ((com.onesignal.core.internal.config.c) c.this.services.getService(com.onesignal.core.internal.config.c.class)).getModel();
        }
    }

    /* renamed from: com.onesignal.internal.c$d, reason: case insensitive filesystem */
    public static final class C0332d extends p implements Function0 {
        public C0332d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Boolean consentGiven = c.this.getConfigModel().getConsentGiven();
            return Boolean.valueOf(consentGiven != null ? consentGiven.booleanValue() : Intrinsics.a(c.this._consentGiven, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$e, reason: case insensitive filesystem */
    public static final class C0333e extends p implements Function0 {
        public C0333e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Boolean consentRequired = c.this.getConfigModel().getConsentRequired();
            return Boolean.valueOf(consentRequired != null ? consentRequired.booleanValue() : Intrinsics.a(c.this._consentRequired, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$f, reason: case insensitive filesystem */
    public static final class C0334f extends p implements Function0 {
        public C0334f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.getConfigModel().getDisableGMSMissingPrompt());
        }
    }

    /* renamed from: com.onesignal.internal.c$g, reason: case insensitive filesystem */
    public static final class C0335g extends p implements Function0 {
        public C0335g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B2.e invoke() {
            return (B2.e) c.this.services.getService(B2.e.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$h, reason: case insensitive filesystem */
    public static final class C0336h extends j implements Function2 {
        int label;

        public C0336h(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new C0336h(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            Boolean consentGiven = c.this.getConfigModel().getConsentGiven();
            return Boolean.valueOf(consentGiven != null ? consentGiven.booleanValue() : Intrinsics.a(c.this._consentGiven, Boolean.TRUE));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0336h) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.internal.c$i, reason: case insensitive filesystem */
    public static final class C0337i extends j implements Function2 {
        int label;

        public C0337i(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new C0337i(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            Boolean consentRequired = c.this.getConfigModel().getConsentRequired();
            return Boolean.valueOf(consentRequired != null ? consentRequired.booleanValue() : Intrinsics.a(c.this._consentRequired, Boolean.TRUE));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0337i) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.internal.c$j, reason: case insensitive filesystem */
    public static final class C0338j extends j implements Function2 {
        int label;

        public C0338j(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new C0338j(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return Boolean.valueOf(c.this.getConfigModel().getDisableGMSMissingPrompt());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0338j) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.internal.c$k, reason: case insensitive filesystem */
    public static final class C0339k extends j implements Function2 {
        int label;

        /* renamed from: com.onesignal.internal.c$k$a */
        public static final class a extends p implements Function0 {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final N2.j invoke() {
                return (N2.j) this.this$0.services.getService(N2.j.class);
            }
        }

        public C0339k(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new C0339k(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return obj;
            }
            V6.b.P(obj);
            c cVar = c.this;
            a aVar2 = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0339k) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.internal.c$l, reason: case insensitive filesystem */
    public static final class C0340l extends j implements Function2 {
        int label;

        /* renamed from: com.onesignal.internal.c$l$a */
        public static final class a extends p implements Function0 {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Z2.a invoke() {
                return (Z2.a) this.this$0.services.getService(Z2.a.class);
            }
        }

        public C0340l(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new C0340l(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return obj;
            }
            V6.b.P(obj);
            c cVar = c.this;
            a aVar2 = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0340l) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.internal.c$m, reason: case insensitive filesystem */
    public static final class C0341m extends j implements Function2 {
        int label;

        /* renamed from: com.onesignal.internal.c$m$a */
        public static final class a extends p implements Function0 {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final n invoke() {
                return (n) this.this$0.services.getService(n.class);
            }
        }

        public C0341m(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new C0341m(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return obj;
            }
            V6.b.P(obj);
            c cVar = c.this;
            a aVar2 = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0341m) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.internal.c$n, reason: case insensitive filesystem */
    public static final class C0342n extends j implements Function2 {
        int label;

        /* renamed from: com.onesignal.internal.c$n$a */
        public static final class a extends p implements Function0 {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final I3.a invoke() {
                return (I3.a) this.this$0.services.getService(I3.a.class);
            }
        }

        public C0342n(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new C0342n(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return obj;
            }
            V6.b.P(obj);
            c cVar = c.this;
            a aVar2 = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0342n) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.internal.c$o, reason: case insensitive filesystem */
    public static final class C0343o extends j implements Function2 {
        int label;

        /* renamed from: com.onesignal.internal.c$o$a */
        public static final class a extends p implements Function0 {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final O3.a invoke() {
                return (O3.a) this.this$0.services.getService(O3.a.class);
            }
        }

        public C0343o(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new C0343o(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
                return obj;
            }
            V6.b.P(obj);
            c cVar = c.this;
            a aVar2 = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar2, this);
            return suspendAndReturn == aVar ? aVar : suspendAndReturn;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0343o) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* renamed from: com.onesignal.internal.c$p, reason: case insensitive filesystem */
    public static final class C0344p extends p implements Function0 {
        public C0344p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final T3.b invoke() {
            return (T3.b) c.this.services.getService(T3.b.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$q, reason: case insensitive filesystem */
    public static final class C0345q extends p implements Function0 {
        public C0345q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.core.internal.config.impl.c invoke() {
            return (com.onesignal.core.internal.config.impl.c) c.this.services.getService(com.onesignal.core.internal.config.impl.c.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$r, reason: case insensitive filesystem */
    public static final class C0346r extends p implements Function0 {
        public C0346r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final N2.j invoke() {
            return (N2.j) c.this.services.getService(N2.j.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$s, reason: case insensitive filesystem */
    public static final class C0347s extends p implements Function0 {
        public C0347s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B2.e invoke() {
            return (B2.e) c.this.services.getService(B2.e.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$t, reason: case insensitive filesystem */
    public static final class C0348t extends j implements Function1 {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0348t(Context context, String str, V5.b bVar) {
            super(1, bVar);
            this.$context = context;
            this.$appId = str;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return c.this.new C0348t(this.$context, this.$appId, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((C0348t) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            c.this.internalInit(this.$context, this.$appId);
            return Unit.f6114a;
        }
    }

    public static final class u extends j implements Function2 {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Context context, String str, V5.b bVar) {
            super(2, bVar);
            this.$context = context;
            this.$appId = str;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new u(this.$context, this.$appId, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return Boolean.valueOf(c.this.internalInit(this.$context, this.$appId));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((u) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class v extends j implements Function2 {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Context context, String str, V5.b bVar) {
            super(2, bVar);
            this.$context = context;
            this.$appId = str;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new v(this.$context, this.$appId, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                kotlin.jvm.internal.B b7 = new kotlin.jvm.internal.B();
                kotlin.jvm.internal.D d7 = new kotlin.jvm.internal.D();
                Object obj2 = c.this.initLock;
                c cVar = c.this;
                synchronized (obj2) {
                    try {
                        if (cVar.initState.isSDKAccessible()) {
                            b7.f6150d = false;
                            d7.f6152d = cVar.suspendCompletion;
                        } else {
                            b7.f6150d = true;
                            d7.f6152d = null;
                            cVar.initState = a.IN_PROGRESS;
                            cVar.suspendCompletion = AbstractC0792z.a();
                            cVar.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
                        }
                        Unit unit = Unit.f6114a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (b7.f6150d) {
                    return Boolean.valueOf(c.this.internalInit(this.$context, this.$appId));
                }
                com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "initWithContext: init already in progress or completed, awaiting completion");
                Object obj3 = d7.f6152d;
                Intrinsics.b(obj3);
                this.label = 1;
                if (((C0781n) ((InterfaceC0780m) obj3)).W(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Boolean.valueOf(c.this.initState == a.SUCCESS);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((v) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class w extends p implements Function0 {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.onesignal.user.internal.jwt.c invoke() {
            return (com.onesignal.user.internal.jwt.c) c.this.services.getService(com.onesignal.user.internal.jwt.c.class);
        }
    }

    public static final class x extends p implements Function0 {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Z2.a invoke() {
            return (Z2.a) c.this.services.getService(Z2.a.class);
        }
    }

    public static final class y extends j implements Function1 {
        final /* synthetic */ d.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(d.a aVar, V5.b bVar) {
            super(1, bVar);
            this.$context = aVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return c.this.new y(this.$context, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((y) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                com.onesignal.user.internal.d loginHelper = c.this.getLoginHelper();
                d.a aVar2 = this.$context;
                this.label = 1;
                if (loginHelper.enqueueLogin$com_onesignal_core(aVar2, this) == aVar) {
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
    }

    public static final class z extends j implements Function2 {
        final /* synthetic */ d.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(d.a aVar, V5.b bVar) {
            super(2, bVar);
            this.$context = aVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return c.this.new z(this.$context, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                com.onesignal.user.internal.d loginHelper = c.this.getLoginHelper();
                d.a aVar2 = this.$context;
                this.label = 1;
                if (loginHelper.enqueueLogin$com_onesignal_core(aVar2, this) == aVar) {
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
            return ((z) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public c() {
        this(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitInitCompletion(InterfaceC0780m interfaceC0780m, String str, V5.b bVar) {
        C0330a c0330a;
        int i2;
        c cVar;
        String str2;
        long j;
        String str3;
        if (bVar instanceof C0330a) {
            c0330a = (C0330a) bVar;
            int i5 = c0330a.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0330a.label = i5 - Integer.MIN_VALUE;
                Object obj = c0330a.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0330a.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("Waiting for init to complete...", null, 2, null);
                    long currentTimeMillis = System.currentTimeMillis();
                    c0330a.L$0 = this;
                    c0330a.L$1 = str;
                    c0330a.J$0 = currentTimeMillis;
                    c0330a.label = 1;
                    if (((C0781n) interfaceC0780m).W(c0330a) == aVar) {
                        return aVar;
                    }
                    cVar = this;
                    str2 = str;
                    j = currentTimeMillis;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = c0330a.J$0;
                    str2 = (String) c0330a.L$1;
                    cVar = (c) c0330a.L$0;
                    V6.b.P(obj);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                if (str2 == null) {
                    str3 = "OneSignalImp initialization completed before '" + str2 + "' (took " + currentTimeMillis2 + "ms)";
                } else {
                    str3 = "OneSignalImp initialization completed (took " + currentTimeMillis2 + "ms)";
                }
                com.onesignal.debug.internal.logging.b.debug$default(str3, null, 2, null);
                if (cVar.initState == a.FAILED) {
                    return Unit.f6114a;
                }
                Exception exc = cVar.initFailureException;
                if (exc != null) {
                    throw exc;
                }
                throw new IllegalStateException("Initialization failed. Cannot proceed.");
            }
        }
        c0330a = new C0330a(bVar);
        Object obj2 = c0330a.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0330a.label;
        if (i2 != 0) {
        }
        long currentTimeMillis22 = System.currentTimeMillis() - j;
        if (str2 == null) {
        }
        com.onesignal.debug.internal.logging.b.debug$default(str3, null, 2, null);
        if (cVar.initState == a.FAILED) {
        }
    }

    private final <T> T blockingGet(Function0<? extends T> function0) {
        try {
            if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
                com.onesignal.debug.internal.logging.b.debug$default("This is called on main thread. This is not recommended.", null, 2, null);
            }
        } catch (RuntimeException e7) {
            com.onesignal.debug.internal.logging.b.debug$default("Could not check main thread status (likely in test environment): " + e7.getMessage(), null, 2, null);
        }
        if (this.initState == a.SUCCESS) {
            return (T) function0.invoke();
        }
        return (T) AbstractC0792z.o(kotlin.coroutines.g.f6146d, new C0331b(function0, null));
    }

    private final com.onesignal.core.internal.startup.c bootstrapServices() {
        com.onesignal.core.internal.startup.c cVar = new com.onesignal.core.internal.startup.c(this.services);
        cVar.bootstrap();
        return cVar;
    }

    private final void completeInit(a aVar) {
        if (aVar != a.SUCCESS && aVar != a.FAILED) {
            throw new IllegalArgumentException(("completeInit requires a terminal state, got " + aVar).toString());
        }
        synchronized (this.initLock) {
            this.initState = aVar;
            ((C0781n) this.suspendCompletion).J(Unit.f6114a);
        }
    }

    private final void ensureApplicationServiceStarted(Context context) {
        if (this.applicationServiceStarted) {
            return;
        }
        synchronized (this.applicationServiceLock) {
            if (this.applicationServiceStarted) {
                return;
            }
            v2.f fVar = (v2.f) this.services.getService(v2.f.class);
            Intrinsics.c(fVar, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((com.onesignal.core.internal.application.impl.a) fVar).start(context);
            com.onesignal.debug.internal.logging.b.INSTANCE.setApplicationService(fVar);
            this.applicationServiceStarted = true;
            Unit unit = Unit.f6114a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.core.internal.config.b getConfigModel() {
        return (com.onesignal.core.internal.config.b) this.configModel$delegate.getValue();
    }

    private final B2.e getFeatureManager() {
        return (B2.e) this.featureManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T3.b getIdentityModelStore() {
        return (T3.b) this.identityModelStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.core.internal.config.impl.c getIdentityVerificationService() {
        return (com.onesignal.core.internal.config.impl.c) this.identityVerificationService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.jwt.c getJwtTokenStore() {
        return (com.onesignal.user.internal.jwt.c) this.jwtTokenStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.d getLoginHelper() {
        return (com.onesignal.user.internal.d) this.loginHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.e getLogoutHelper() {
        return (com.onesignal.user.internal.e) this.logoutHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F2.f getOperationRepo() {
        return (F2.f) this.operationRepo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H2.b getPreferencesService() {
        return (H2.b) this.preferencesService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.properties.b getPropertiesModelStore() {
        return (com.onesignal.user.internal.properties.b) this.propertiesModelStore$delegate.getValue();
    }

    private final AbstractC0786t getRuntimeIoDispatcher() {
        return isBackgroundThreadingEnabled() ? com.onesignal.common.threading.a.INSTANCE.getIO() : this.ioDispatcher;
    }

    private final <T> T getServiceWithFeatureGate(Function0<? extends T> function0) {
        if (isBackgroundThreadingEnabled()) {
            return (T) waitAndReturn(function0);
        }
        int i2 = b.$EnumSwitchMapping$0[this.initState.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Must call 'initWithContext' before use");
        }
        if (i2 == 2) {
            warnIfBlockingOnMainThread(null);
            return (T) waitAndReturn(function0);
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return (T) function0.invoke();
            }
            throw new k();
        }
        Exception exc = this.initFailureException;
        if (exc != null) {
            throw exc;
        }
        throw new IllegalStateException("Initialization failed. Cannot proceed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y3.e getSubscriptionModelStore() {
        return (Y3.e) this.subscriptionModelStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l getUserSwitcher() {
        return (l) this.userSwitcher$delegate.getValue();
    }

    private final void initEssentials(Context context) {
        g gVar = new g(context, new C0347s(), null, null, null, null, null, 124, null);
        gVar.initializeFromCachedConfig();
        this.otelManager = gVar;
        H2.c.INSTANCE.ensureNoObfuscatedPrefStore(context);
        ensureApplicationServiceStarted(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalInit(Context context, String str) {
        try {
            if (!AndroidUtils.INSTANCE.isAndroidUserUnlocked(context)) {
                com.onesignal.debug.internal.logging.b.warn$default("initWithContext called when device storage is locked, no user data is accessible!", null, 2, null);
                completeInit(a.FAILED);
                return false;
            }
            initEssentials(context);
            com.onesignal.core.internal.startup.c bootstrapServices = bootstrapServices();
            g gVar = this.otelManager;
            if (gVar != null) {
                gVar.subscribeToConfigStore((com.onesignal.core.internal.config.c) this.services.getService(com.onesignal.core.internal.config.c.class));
            }
            com.onesignal.user.internal.a resolveAppId = com.onesignal.user.internal.b.resolveAppId(str, getConfigModel(), getPreferencesService());
            if (resolveAppId.getFailed()) {
                IllegalStateException illegalStateException = new IllegalStateException("suspendInitInternal: no appId provided or found in local storage. Please pass a valid appId to initWithContext().");
                Exception exc = this.initFailureException;
                if (exc != null) {
                    C0164d.a(exc, illegalStateException);
                }
                com.onesignal.debug.internal.logging.b.warn$default("suspendInitInternal: no appId provided or found in local storage. Please pass a valid appId to initWithContext().", null, 2, null);
                completeInit(a.FAILED);
                return false;
            }
            com.onesignal.core.internal.config.b configModel = getConfigModel();
            String appId = resolveAppId.getAppId();
            Intrinsics.b(appId);
            configModel.setAppId(appId);
            boolean forceCreateUser = resolveAppId.getForceCreateUser();
            updateConfig();
            getUserSwitcher().initUser(forceCreateUser);
            bootstrapServices.scheduleStart();
            completeInit(a.SUCCESS);
            return true;
        } catch (Exception e7) {
            com.onesignal.debug.internal.logging.b.error("OneSignal: internalInit threw unexpectedly; marking init FAILED", e7);
            Exception exc2 = this.initFailureException;
            if (exc2 != null) {
                C0164d.a(exc2, e7);
            }
            completeInit(a.FAILED);
            return false;
        }
    }

    private final boolean isBackgroundThreadingEnabled() {
        if (!this.applicationServiceStarted) {
            return false;
        }
        try {
            return getFeatureManager().isEnabled(B2.b.SDK_BACKGROUND_THREADING);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("OneSignal: Failed to resolve BACKGROUND_THREADING feature, defaulting to legacy mode.", th);
            return false;
        }
    }

    private static /* synthetic */ void isBackgroundThreadingEnabled$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void login$lambda$4(c this$0, d.a context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        AbstractC0792z.o(this$0.getRuntimeIoDispatcher(), this$0.new z(context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logout$lambda$5(c this$0, e.a context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        AbstractC0792z.o(this$0.getRuntimeIoDispatcher(), this$0.new D(context, null));
    }

    private final String notInitializedMessage(String str) {
        return str != null ? C4.p.i("Must call 'initWithContext' before '", str, '\'') : "Must call 'initWithContext' before use";
    }

    private final void requireInitForOperation(String str) {
        int i2 = b.$EnumSwitchMapping$0[this.initState.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException(C4.p.i("Must call 'initWithContext' before '", str, '\''));
        }
        if (i2 == 2) {
            warnIfBlockingOnMainThread(str);
            waitForInit(str);
        } else {
            if (i2 != 3) {
                return;
            }
            Exception exc = this.initFailureException;
            if (exc == null) {
                throw new IllegalStateException(C4.p.i("Initialization failed before '", str, '\''));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object suspendAndReturn(Function0<? extends T> function0, V5.b bVar) {
        P p7;
        int i2;
        if (bVar instanceof P) {
            p7 = (P) bVar;
            int i5 = p7.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                p7.label = i5 - Integer.MIN_VALUE;
                Object obj = p7.result;
                W5.a aVar = W5.a.f2787d;
                i2 = p7.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    p7.L$0 = function0;
                    p7.label = 1;
                    if (suspendUntilInit$default(this, null, p7, 1, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function0 = (Function0) p7.L$0;
                    V6.b.P(obj);
                }
                return function0.invoke();
            }
        }
        p7 = new P(bVar);
        Object obj2 = p7.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = p7.label;
        if (i2 != 0) {
        }
        return function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object suspendUntilInit(String str, V5.b bVar) {
        Object waitUntilInitInternal = waitUntilInitInternal(str, bVar);
        return waitUntilInitInternal == W5.a.f2787d ? waitUntilInitInternal : Unit.f6114a;
    }

    public static /* synthetic */ Object suspendUntilInit$default(c cVar, String str, V5.b bVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return cVar.suspendUntilInit(str, bVar);
    }

    private final void updateConfig() {
        if (this._consentRequired != null) {
            com.onesignal.core.internal.config.b configModel = getConfigModel();
            Boolean bool = this._consentRequired;
            Intrinsics.b(bool);
            configModel.setConsentRequired(bool);
        }
        if (this._consentGiven != null) {
            com.onesignal.core.internal.config.b configModel2 = getConfigModel();
            Boolean bool2 = this._consentGiven;
            Intrinsics.b(bool2);
            configModel2.setConsentGiven(bool2);
        }
        if (this._disableGMSMissingPrompt != null) {
            com.onesignal.core.internal.config.b configModel3 = getConfigModel();
            Boolean bool3 = this._disableGMSMissingPrompt;
            Intrinsics.b(bool3);
            configModel3.setDisableGMSMissingPrompt(bool3.booleanValue());
        }
    }

    private final <T> T waitAndReturn(Function0<? extends T> function0) {
        waitForInit$default(this, null, 1, null);
        return (T) function0.invoke();
    }

    private final void waitForInit(String str) {
        if (this.initState == a.SUCCESS) {
            return;
        }
        AbstractC0792z.o(kotlin.coroutines.g.f6146d, new T(str, null));
    }

    public static /* synthetic */ void waitForInit$default(c cVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        cVar.waitForInit(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object waitUntilInitInternal(String str, V5.b bVar) {
        a aVar;
        InterfaceC0780m interfaceC0780m;
        synchronized (this.initLock) {
            try {
                aVar = this.initState;
                interfaceC0780m = aVar == a.IN_PROGRESS ? this.suspendCompletion : null;
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException(notInitializedMessage(str));
        }
        if (i2 == 2) {
            Intrinsics.b(interfaceC0780m);
            Object awaitInitCompletion = awaitInitCompletion(interfaceC0780m, str, bVar);
            return awaitInitCompletion == W5.a.f2787d ? awaitInitCompletion : Unit.f6114a;
        }
        if (i2 != 3) {
            return Unit.f6114a;
        }
        Exception exc = this.initFailureException;
        if (exc != null) {
            throw exc;
        }
        throw new IllegalStateException("Initialization failed. Cannot proceed.");
    }

    public static /* synthetic */ Object waitUntilInitInternal$default(c cVar, String str, V5.b bVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return cVar.waitUntilInitInternal(str, bVar);
    }

    private final void warnIfBlockingOnMainThread(String str) {
        String str2;
        if (isBackgroundThreadingEnabled()) {
            return;
        }
        try {
            if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
                if (str == null || (str2 = C4.p.i("'", str, '\'')) == null) {
                    str2 = "this OneSignal API";
                }
                com.onesignal.debug.internal.logging.b.warn$default(r4.f.d("Calling ", str2, " on the main thread while OneSignal initialization is still in progress. This will block the UI thread until init completes (ANR risk on slow devices). Prefer calling from a background thread, or use the suspend API (OneSignal.initWithContextSuspend, OneSignal.getUser(), OneSignal.loginSuspend(), etc.) from a coroutine."), null, 2, null);
            }
        } catch (RuntimeException e7) {
            com.onesignal.debug.internal.logging.b.debug$default("Could not determine main-thread status; skipping ANR-risk warning: " + e7.getMessage(), null, 2, null);
        }
    }

    public void addUserJwtInvalidatedListener(InterfaceC0752c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("addUserJwtInvalidatedListener");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'addUserJwtInvalidatedListener'");
        }
        getJwtTokenStore().addUserJwtInvalidatedListener(listener);
    }

    @Override // t2.b
    public <T> List<T> getAllServices(Class<T> c7) {
        Intrinsics.checkNotNullParameter(c7, "c");
        return this.services.getAllServices(c7);
    }

    public boolean getConsentGiven() {
        return isInitialized() ? ((Boolean) blockingGet(new C0332d())).booleanValue() : Intrinsics.a(this._consentGiven, Boolean.TRUE);
    }

    public boolean getConsentRequired() {
        return isInitialized() ? ((Boolean) blockingGet(new C0333e())).booleanValue() : Intrinsics.a(this._consentRequired, Boolean.TRUE);
    }

    @Override // n2.InterfaceC0751b
    public K2.a getDebug() {
        return this.debug;
    }

    public boolean getDisableGMSMissingPrompt() {
        return isInitialized() ? ((Boolean) blockingGet(new C0334f())).booleanValue() : Intrinsics.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    @Override // n2.InterfaceC0751b
    public N2.j getInAppMessages() {
        return (N2.j) getServiceWithFeatureGate(new C0346r());
    }

    @Override // n2.InterfaceC0751b
    public Z2.a getLocation() {
        return (Z2.a) getServiceWithFeatureGate(new x());
    }

    @Override // n2.InterfaceC0751b
    public n getNotifications() {
        return (n) getServiceWithFeatureGate(new G());
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // t2.b
    public <T> T getService(Class<T> c7) {
        Intrinsics.checkNotNullParameter(c7, "c");
        return (T) this.services.getService(c7);
    }

    @Override // t2.b
    public <T> T getServiceOrNull(Class<T> c7) {
        Intrinsics.checkNotNullParameter(c7, "c");
        return (T) this.services.getServiceOrNull(c7);
    }

    @Override // n2.InterfaceC0751b
    public I3.a getSession() {
        return (I3.a) getServiceWithFeatureGate(new K());
    }

    @Override // n2.InterfaceC0751b
    public O3.a getUser() {
        return (O3.a) getServiceWithFeatureGate(new R());
    }

    @Override // t2.b
    public <T> boolean hasService(Class<T> c7) {
        Intrinsics.checkNotNullParameter(c7, "c");
        return this.services.hasService(c7);
    }

    @Override // n2.InterfaceC0751b
    public boolean initWithContext(Context context, String appId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        K2.c cVar = K2.c.DEBUG;
        com.onesignal.debug.internal.logging.b.log(cVar, "Calling deprecated initWithContext(context: " + context + ", appId: " + appId + ')');
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        synchronized (this.initLock) {
            if (this.initState.isSDKAccessible()) {
                com.onesignal.debug.internal.logging.b.log(cVar, "initWithContext: SDK already initialized or in progress");
                return true;
            }
            this.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
            this.initState = a.IN_PROGRESS;
            this.suspendCompletion = AbstractC0792z.a();
            Unit unit = Unit.f6114a;
            try {
                ensureApplicationServiceStarted(context);
                if (!isBackgroundThreadingEnabled()) {
                    return ((Boolean) AbstractC0792z.o(getRuntimeIoDispatcher(), new u(context, appId, null))).booleanValue();
                }
                com.onesignal.common.threading.b.suspendifyOnIO(new C0348t(context, appId, null));
                return true;
            } catch (Exception e7) {
                Exception exc = this.initFailureException;
                if (exc != null) {
                    C0164d.a(exc, e7);
                }
                completeInit(a.FAILED);
                throw e7;
            }
        }
    }

    public Object initWithContextSuspend(Context context, String str, V5.b bVar) {
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "initWithContext(context: " + context + ", appId: " + str + ')');
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        return AbstractC0792z.t(getRuntimeIoDispatcher(), new v(context, str, null), bVar);
    }

    @Override // n2.InterfaceC0751b
    public boolean isInitialized() {
        return this.initState == a.SUCCESS;
    }

    @Override // n2.InterfaceC0751b
    public void login(String externalId) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        login(externalId, null);
    }

    public Object loginSuspend(String str, String str2, V5.b bVar) {
        Object t6 = AbstractC0792z.t(getRuntimeIoDispatcher(), new B(str, str2, this, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    @Override // n2.InterfaceC0751b
    public void logout() {
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "Calling deprecated logout()");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("logout");
        } else {
            requireInitForOperation("logout");
        }
        e.a switchUser$com_onesignal_core = getLogoutHelper().switchUser$com_onesignal_core();
        if (switchUser$com_onesignal_core == null) {
            return;
        }
        if (isBackgroundThreadingEnabled()) {
            com.onesignal.common.threading.b.suspendifyOnIO(new C(switchUser$com_onesignal_core, null));
        } else {
            new Thread(new A.j(this, 18, switchUser$com_onesignal_core)).start();
        }
    }

    public Object logoutSuspend(V5.b bVar) {
        Object t6 = AbstractC0792z.t(getRuntimeIoDispatcher(), new F(null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    public void removeUserJwtInvalidatedListener(InterfaceC0752c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("removeUserJwtInvalidatedListener");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'removeUserJwtInvalidatedListener'");
        }
        getJwtTokenStore().removeUserJwtInvalidatedListener(listener);
    }

    @Override // n2.InterfaceC0751b
    public void setConsentGiven(boolean z7) {
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z7);
        if (isInitialized()) {
            getConfigModel().setConsentGiven(Boolean.valueOf(z7));
            if (Intrinsics.a(bool, Boolean.valueOf(z7)) || !z7) {
                return;
            }
            getOperationRepo().forceExecuteOperations();
        }
    }

    @Override // n2.InterfaceC0751b
    public void setConsentRequired(boolean z7) {
        this._consentRequired = Boolean.valueOf(z7);
        if (isInitialized()) {
            getConfigModel().setConsentRequired(Boolean.valueOf(z7));
        }
    }

    public void setDisableGMSMissingPrompt(boolean z7) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z7);
        if (isInitialized()) {
            getConfigModel().setDisableGMSMissingPrompt(z7);
        }
    }

    public void updateUserJwt(String externalId, String token) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(token, "token");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "updateUserJwt(externalId: " + externalId + ", token: ..." + t.t(token) + ')');
        if (isBackgroundThreadingEnabled()) {
            waitForInit("updateUserJwt");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'updateUserJwt'");
        }
        getJwtTokenStore().putJwt(externalId, token);
        getOperationRepo().forceExecuteOperations();
    }

    public Object updateUserJwtSuspend(String str, String str2, V5.b bVar) {
        Object t6 = AbstractC0792z.t(getRuntimeIoDispatcher(), new Q(str, str2, this, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    public c(AbstractC0786t ioDispatcher) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.ioDispatcher = ioDispatcher;
        this.suspendCompletion = AbstractC0792z.a();
        this.initState = a.NOT_STARTED;
        this.sdkVersion = h.INSTANCE.getSdkVersion();
        this.debug = new L2.a();
        this.operationRepo$delegate = i.b(new H());
        this.identityModelStore$delegate = i.b(new C0344p());
        this.propertiesModelStore$delegate = i.b(new J());
        this.subscriptionModelStore$delegate = i.b(new O());
        this.preferencesService$delegate = i.b(new I());
        this.jwtTokenStore$delegate = i.b(new w());
        this.identityVerificationService$delegate = i.b(new C0345q());
        List<String> d7 = r.d("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = d7;
        t2.c cVar = new t2.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = d7.iterator();
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(it.next()).newInstance();
                Intrinsics.c(newInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((InterfaceC0889a) newInstance);
            } catch (ClassNotFoundException e7) {
                e7.printStackTrace();
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((InterfaceC0889a) obj).register(cVar);
        }
        this.services = cVar.build();
        this.featureManager$delegate = i.b(new C0335g());
        this.configModel$delegate = i.b(new C0046c());
        this.initLock = new Object();
        this.loginLogoutLock = new Object();
        this.applicationServiceLock = new Object();
        this.userSwitcher$delegate = i.b(new S());
        this.loginHelper$delegate = i.b(new A());
        this.logoutHelper$delegate = i.b(new E());
    }

    public Object getInAppMessages(V5.b bVar) {
        return AbstractC0792z.t(getRuntimeIoDispatcher(), new C0339k(null), bVar);
    }

    public Object getLocation(V5.b bVar) {
        return AbstractC0792z.t(getRuntimeIoDispatcher(), new C0340l(null), bVar);
    }

    public Object getNotifications(V5.b bVar) {
        return AbstractC0792z.t(getRuntimeIoDispatcher(), new C0341m(null), bVar);
    }

    public Object getSession(V5.b bVar) {
        return AbstractC0792z.t(getRuntimeIoDispatcher(), new C0342n(null), bVar);
    }

    public Object getUser(V5.b bVar) {
        return AbstractC0792z.t(getRuntimeIoDispatcher(), new C0343o(null), bVar);
    }

    @Override // n2.InterfaceC0751b
    public void login(String externalId, String str) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        K2.c cVar = K2.c.DEBUG;
        StringBuilder sb = new StringBuilder("Calling deprecated login(externalId: ");
        sb.append(externalId);
        sb.append(", jwtBearerToken: ...");
        sb.append(str != null ? t.t(str) : null);
        sb.append(')');
        com.onesignal.debug.internal.logging.b.log(cVar, sb.toString());
        if (isBackgroundThreadingEnabled()) {
            waitForInit("login");
        } else {
            requireInitForOperation("login");
        }
        d.a switchUser$com_onesignal_core = getLoginHelper().switchUser$com_onesignal_core(externalId, str);
        if (switchUser$com_onesignal_core == null) {
            return;
        }
        if (isBackgroundThreadingEnabled()) {
            com.onesignal.common.threading.b.suspendifyOnIO(new y(switchUser$com_onesignal_core, null));
        } else {
            new Thread(new A.j(this, 19, switchUser$com_onesignal_core)).start();
        }
    }

    public Object getConsentGiven(V5.b bVar) {
        return AbstractC0792z.t(getRuntimeIoDispatcher(), new C0336h(null), bVar);
    }

    public Object getConsentRequired(V5.b bVar) {
        return AbstractC0792z.t(getRuntimeIoDispatcher(), new C0337i(null), bVar);
    }

    public Object getDisableGMSMissingPrompt(V5.b bVar) {
        return AbstractC0792z.t(getRuntimeIoDispatcher(), new C0338j(null), bVar);
    }

    public Object setConsentRequired(boolean z7, V5.b bVar) {
        Object t6 = AbstractC0792z.t(getRuntimeIoDispatcher(), new M(z7, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    public Object setDisableGMSMissingPrompt(boolean z7, V5.b bVar) {
        Object t6 = AbstractC0792z.t(getRuntimeIoDispatcher(), new N(z7, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    public Object setConsentGiven(boolean z7, V5.b bVar) {
        Object t6 = AbstractC0792z.t(getRuntimeIoDispatcher(), new L(z7, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    @Override // n2.InterfaceC0751b
    public Object initWithContext(Context context, V5.b bVar) {
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "initWithContext(context: " + context + ')');
        return initWithContextSuspend(context, null, bVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(AbstractC0786t abstractC0786t, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC0786t);
        if ((i2 & 1) != 0) {
            C0953e c0953e = n6.F.f7011a;
            abstractC0786t = ExecutorC0952d.f8106i;
        }
    }
}
