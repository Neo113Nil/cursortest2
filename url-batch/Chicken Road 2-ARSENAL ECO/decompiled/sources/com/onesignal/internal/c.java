package com.onesignal.internal;

import F2.n;
import H5.AbstractC0161v;
import H5.AbstractC0165z;
import H5.C0153m;
import H5.InterfaceC0152l;
import H5.InterfaceC0163x;
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
import f2.C0366c;
import f2.InterfaceC0365b;
import g3.InterfaceC0392a;
import i2.InterfaceC0425a;
import j2.C0437a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k5.InterfaceC0475e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l5.AbstractC0507k;
import m1.AbstractC0521b;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x2.InterfaceC0728a;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class c implements L1.b, R1.b {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private final Object applicationServiceLock;
    private volatile boolean applicationServiceStarted;
    private final InterfaceC0475e configModel$delegate;
    private Exception initFailureException;
    private final Object initLock;
    private final List<String> listOfModules;
    private final InterfaceC0475e loginHelper$delegate;
    private final Object loginLogoutLock;
    private final InterfaceC0475e logoutHelper$delegate;
    private g otelManager;
    private final R1.d services;
    private final InterfaceC0475e userSwitcher$delegate;
    private volatile InterfaceC0152l suspendCompletion = AbstractC0165z.a();
    private volatile a initState = a.NOT_STARTED;
    private final String sdkVersion = h.INSTANCE.getSdkVersion();
    private final InterfaceC0425a debug = new C0437a();
    private final InterfaceC0475e operationRepo$delegate = AbstractC0521b.x(new D());
    private final InterfaceC0475e identityModelStore$delegate = AbstractC0521b.x(new C0310o());
    private final InterfaceC0475e propertiesModelStore$delegate = AbstractC0521b.x(new F());
    private final InterfaceC0475e subscriptionModelStore$delegate = AbstractC0521b.x(new K());
    private final InterfaceC0475e preferencesService$delegate = AbstractC0521b.x(new E());
    private final InterfaceC0475e jwtTokenStore$delegate = AbstractC0521b.x(new u());
    private final InterfaceC0475e identityVerificationService$delegate = AbstractC0521b.x(new C0311p());

    public static final class A extends j implements InterfaceC0732a {
        public A() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final com.onesignal.user.internal.e invoke() {
            return new com.onesignal.user.internal.e(c.this.getIdentityModelStore(), c.this.getUserSwitcher(), c.this.getOperationRepo(), c.this.getConfigModel(), c.this.getSubscriptionModelStore(), c.this.getIdentityVerificationService(), c.this.loginLogoutLock);
        }
    }

    public static final class B extends q5.g implements InterfaceC0747p {
        int label;

        public B(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new B(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((B) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "logoutSuspend()");
                c cVar = c.this;
                this.label = 1;
                if (cVar.suspendUntilInit("logout", this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            e.a switchUser$com_onesignal_core = c.this.getLogoutHelper().switchUser$com_onesignal_core();
            k5.v vVar = k5.v.f5219a;
            if (switchUser$com_onesignal_core == null) {
                return vVar;
            }
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(switchUser$com_onesignal_core);
            return vVar;
        }
    }

    public static final class C extends j implements InterfaceC0732a {
        public C() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final n invoke() {
            return (n) c.this.services.getService(n.class);
        }
    }

    public static final class D extends j implements InterfaceC0732a {
        public D() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final d2.f invoke() {
            return (d2.f) c.this.services.getService(d2.f.class);
        }
    }

    public static final class E extends j implements InterfaceC0732a {
        public E() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final InterfaceC0365b invoke() {
            return (InterfaceC0365b) c.this.services.getService(InterfaceC0365b.class);
        }
    }

    public static final class F extends j implements InterfaceC0732a {
        public F() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final com.onesignal.user.internal.properties.b invoke() {
            return (com.onesignal.user.internal.properties.b) c.this.services.getService(com.onesignal.user.internal.properties.b.class);
        }
    }

    public static final class G extends j implements InterfaceC0732a {
        public G() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final InterfaceC0392a invoke() {
            return (InterfaceC0392a) c.this.services.getService(InterfaceC0392a.class);
        }
    }

    public static final class H extends q5.g implements InterfaceC0747p {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(boolean z5, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$value = z5;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new H(this.$value, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((H) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            Boolean bool = c.this._consentGiven;
            c.this._consentGiven = Boolean.valueOf(this.$value);
            c.this.getConfigModel().setConsentGiven(Boolean.valueOf(this.$value));
            if (!i.a(bool, Boolean.valueOf(this.$value)) && this.$value) {
                c.this.getOperationRepo().forceExecuteOperations();
            }
            return k5.v.f5219a;
        }
    }

    public static final class I extends q5.g implements InterfaceC0747p {
        final /* synthetic */ boolean $required;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(boolean z5, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$required = z5;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new I(this.$required, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((I) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            c.this._consentRequired = Boolean.valueOf(this.$required);
            c.this.getConfigModel().setConsentRequired(Boolean.valueOf(this.$required));
            return k5.v.f5219a;
        }
    }

    public static final class J extends q5.g implements InterfaceC0747p {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(boolean z5, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$value = z5;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new J(this.$value, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((J) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            c.this._disableGMSMissingPrompt = Boolean.valueOf(this.$value);
            c.this.getConfigModel().setDisableGMSMissingPrompt(this.$value);
            return k5.v.f5219a;
        }
    }

    public static final class K extends j implements InterfaceC0732a {
        public K() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final w3.e invoke() {
            return (w3.e) c.this.services.getService(w3.e.class);
        }
    }

    public static final class L extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public L(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.suspendAndReturn(null, this);
        }
    }

    public static final class M extends q5.g implements InterfaceC0747p {
        final /* synthetic */ String $externalId;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(String str, String str2, c cVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$externalId = str;
            this.$token = str2;
            this.this$0 = cVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new M(this.$externalId, this.$token, this.this$0, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((M) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "updateUserJwtSuspend(externalId: " + this.$externalId + ", token: ..." + F5.j.g0(this.$token) + ')');
                c cVar = this.this$0;
                this.label = 1;
                if (cVar.suspendUntilInit("updateUserJwt", this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            if (!this.this$0.isInitialized()) {
                throw new IllegalStateException("'initWithContext failed' before 'updateUserJwt'");
            }
            this.this$0.getJwtTokenStore().putJwt(this.$externalId, this.$token);
            this.this$0.getOperationRepo().forceExecuteOperations();
            return k5.v.f5219a;
        }
    }

    public static final class N extends j implements InterfaceC0732a {
        public N() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final m3.a invoke() {
            return (m3.a) c.this.services.getService(m3.a.class);
        }
    }

    public static final class O extends j implements InterfaceC0732a {

        public static final class a extends j implements InterfaceC0732a {
            final /* synthetic */ Context $appContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.$appContext = context;
            }

            @Override // x5.InterfaceC0732a
            public final Context invoke() {
                return this.$appContext;
            }
        }

        public O() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final l invoke() {
            Context appContext = ((T1.f) c.this.services.getService(T1.f.class)).getAppContext();
            return new l(c.this.getPreferencesService(), c.this.getOperationRepo(), c.this.services, null, c.this.getIdentityModelStore(), c.this.getPropertiesModelStore(), c.this.getSubscriptionModelStore(), c.this.getConfigModel(), null, com.onesignal.common.c.INSTANCE.getCarrierName(appContext), Build.VERSION.RELEASE, null, new a(appContext), 2312, null);
        }
    }

    public static final class P extends q5.g implements InterfaceC0747p {
        final /* synthetic */ String $operationName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(String str, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$operationName = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new P(this.$operationName, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((P) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                c cVar = c.this;
                String str = this.$operationName;
                this.label = 1;
                if (cVar.waitUntilInitInternal(str, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return k5.v.f5219a;
        }
    }

    /* renamed from: com.onesignal.internal.c$a, reason: case insensitive filesystem */
    public static final class C0297a extends AbstractC0607c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0297a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.awaitInitCompletion(null, null, this);
        }
    }

    /* renamed from: com.onesignal.internal.c$b, reason: case insensitive filesystem */
    public static final class C0298b extends q5.g implements InterfaceC0747p {
        final /* synthetic */ InterfaceC0732a $getter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0298b(InterfaceC0732a interfaceC0732a, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$getter = interfaceC0732a;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new C0298b(this.$getter, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((C0298b) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return obj;
            }
            AbstractC0676f.w(obj);
            c cVar = c.this;
            InterfaceC0732a interfaceC0732a = this.$getter;
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(interfaceC0732a, this);
            return suspendAndReturn == enumC0580a ? enumC0580a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$c, reason: collision with other inner class name */
    public static final class C0046c extends j implements InterfaceC0732a {
        public C0046c() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final com.onesignal.core.internal.config.b invoke() {
            return (com.onesignal.core.internal.config.b) ((com.onesignal.core.internal.config.c) c.this.services.getService(com.onesignal.core.internal.config.c.class)).getModel();
        }
    }

    /* renamed from: com.onesignal.internal.c$d, reason: case insensitive filesystem */
    public static final class C0299d extends j implements InterfaceC0732a {
        public C0299d() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            Boolean consentGiven = c.this.getConfigModel().getConsentGiven();
            return Boolean.valueOf(consentGiven != null ? consentGiven.booleanValue() : i.a(c.this._consentGiven, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$e, reason: case insensitive filesystem */
    public static final class C0300e extends j implements InterfaceC0732a {
        public C0300e() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            Boolean consentRequired = c.this.getConfigModel().getConsentRequired();
            return Boolean.valueOf(consentRequired != null ? consentRequired.booleanValue() : i.a(c.this._consentRequired, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$f, reason: case insensitive filesystem */
    public static final class C0301f extends j implements InterfaceC0732a {
        public C0301f() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.getConfigModel().getDisableGMSMissingPrompt());
        }
    }

    /* renamed from: com.onesignal.internal.c$g, reason: case insensitive filesystem */
    public static final class C0302g extends q5.g implements InterfaceC0747p {
        int label;

        public C0302g(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new C0302g(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((C0302g) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            Boolean consentGiven = c.this.getConfigModel().getConsentGiven();
            return Boolean.valueOf(consentGiven != null ? consentGiven.booleanValue() : i.a(c.this._consentGiven, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$h, reason: case insensitive filesystem */
    public static final class C0303h extends q5.g implements InterfaceC0747p {
        int label;

        public C0303h(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new C0303h(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((C0303h) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            Boolean consentRequired = c.this.getConfigModel().getConsentRequired();
            return Boolean.valueOf(consentRequired != null ? consentRequired.booleanValue() : i.a(c.this._consentRequired, Boolean.TRUE));
        }
    }

    /* renamed from: com.onesignal.internal.c$i, reason: case insensitive filesystem */
    public static final class C0304i extends q5.g implements InterfaceC0747p {
        int label;

        public C0304i(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new C0304i(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((C0304i) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            return Boolean.valueOf(c.this.getConfigModel().getDisableGMSMissingPrompt());
        }
    }

    /* renamed from: com.onesignal.internal.c$j, reason: case insensitive filesystem */
    public static final class C0305j extends q5.g implements InterfaceC0747p {
        int label;

        /* renamed from: com.onesignal.internal.c$j$a */
        public static final class a extends j implements InterfaceC0732a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // x5.InterfaceC0732a
            public final l2.j invoke() {
                return (l2.j) this.this$0.services.getService(l2.j.class);
            }
        }

        public C0305j(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new C0305j(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((C0305j) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return obj;
            }
            AbstractC0676f.w(obj);
            c cVar = c.this;
            a aVar = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC0580a ? enumC0580a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$k, reason: case insensitive filesystem */
    public static final class C0306k extends q5.g implements InterfaceC0747p {
        int label;

        /* renamed from: com.onesignal.internal.c$k$a */
        public static final class a extends j implements InterfaceC0732a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // x5.InterfaceC0732a
            public final InterfaceC0728a invoke() {
                return (InterfaceC0728a) this.this$0.services.getService(InterfaceC0728a.class);
            }
        }

        public C0306k(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new C0306k(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((C0306k) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return obj;
            }
            AbstractC0676f.w(obj);
            c cVar = c.this;
            a aVar = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC0580a ? enumC0580a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$l, reason: case insensitive filesystem */
    public static final class C0307l extends q5.g implements InterfaceC0747p {
        int label;

        /* renamed from: com.onesignal.internal.c$l$a */
        public static final class a extends j implements InterfaceC0732a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // x5.InterfaceC0732a
            public final n invoke() {
                return (n) this.this$0.services.getService(n.class);
            }
        }

        public C0307l(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new C0307l(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((C0307l) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return obj;
            }
            AbstractC0676f.w(obj);
            c cVar = c.this;
            a aVar = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC0580a ? enumC0580a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$m, reason: case insensitive filesystem */
    public static final class C0308m extends q5.g implements InterfaceC0747p {
        int label;

        /* renamed from: com.onesignal.internal.c$m$a */
        public static final class a extends j implements InterfaceC0732a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // x5.InterfaceC0732a
            public final InterfaceC0392a invoke() {
                return (InterfaceC0392a) this.this$0.services.getService(InterfaceC0392a.class);
            }
        }

        public C0308m(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new C0308m(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((C0308m) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return obj;
            }
            AbstractC0676f.w(obj);
            c cVar = c.this;
            a aVar = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC0580a ? enumC0580a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$n, reason: case insensitive filesystem */
    public static final class C0309n extends q5.g implements InterfaceC0747p {
        int label;

        /* renamed from: com.onesignal.internal.c$n$a */
        public static final class a extends j implements InterfaceC0732a {
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // x5.InterfaceC0732a
            public final m3.a invoke() {
                return (m3.a) this.this$0.services.getService(m3.a.class);
            }
        }

        public C0309n(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new C0309n(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((C0309n) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return obj;
            }
            AbstractC0676f.w(obj);
            c cVar = c.this;
            a aVar = new a(cVar);
            this.label = 1;
            Object suspendAndReturn = cVar.suspendAndReturn(aVar, this);
            return suspendAndReturn == enumC0580a ? enumC0580a : suspendAndReturn;
        }
    }

    /* renamed from: com.onesignal.internal.c$o, reason: case insensitive filesystem */
    public static final class C0310o extends j implements InterfaceC0732a {
        public C0310o() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final r3.b invoke() {
            return (r3.b) c.this.services.getService(r3.b.class);
        }
    }

    /* renamed from: com.onesignal.internal.c$p, reason: case insensitive filesystem */
    public static final class C0311p extends j implements InterfaceC0732a {
        public C0311p() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final com.onesignal.core.internal.config.impl.c invoke() {
            return (com.onesignal.core.internal.config.impl.c) c.this.services.getService(com.onesignal.core.internal.config.impl.c.class);
        }
    }

    public static final class q extends j implements InterfaceC0732a {
        public q() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final l2.j invoke() {
            return (l2.j) c.this.services.getService(l2.j.class);
        }
    }

    public static final class r extends j implements InterfaceC0732a {
        public r() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Z1.e invoke() {
            return (Z1.e) c.this.services.getService(Z1.e.class);
        }
    }

    public static final class s extends q5.g implements InterfaceC0743l {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Context context, String str, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$context = context;
            this.$appId = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return c.this.new s(this.$context, this.$appId, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            c.this.internalInit(this.$context, this.$appId);
            return k5.v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((s) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class t extends q5.g implements InterfaceC0747p {
        final /* synthetic */ String $appId;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Context context, String str, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$context = context;
            this.$appId = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return c.this.new t(this.$context, this.$appId, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((t) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            InterfaceC0152l interfaceC0152l;
            boolean z5;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                Object obj2 = c.this.initLock;
                c cVar = c.this;
                synchronized (obj2) {
                    try {
                        if (cVar.initState.isSDKAccessible()) {
                            interfaceC0152l = cVar.suspendCompletion;
                            z5 = false;
                        } else {
                            cVar.initState = a.IN_PROGRESS;
                            cVar.suspendCompletion = AbstractC0165z.a();
                            cVar.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
                            interfaceC0152l = null;
                            z5 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z5) {
                    return Boolean.valueOf(c.this.internalInit(this.$context, this.$appId));
                }
                com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "initWithContext: init already in progress or completed, awaiting completion");
                i.b(interfaceC0152l);
                this.label = 1;
                if (((C0153m) interfaceC0152l).T(this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return Boolean.valueOf(c.this.initState == a.SUCCESS);
        }
    }

    public static final class u extends j implements InterfaceC0732a {
        public u() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final com.onesignal.user.internal.jwt.c invoke() {
            return (com.onesignal.user.internal.jwt.c) c.this.services.getService(com.onesignal.user.internal.jwt.c.class);
        }
    }

    public static final class v extends j implements InterfaceC0732a {
        public v() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final InterfaceC0728a invoke() {
            return (InterfaceC0728a) c.this.services.getService(InterfaceC0728a.class);
        }
    }

    public static final class w extends q5.g implements InterfaceC0743l {
        final /* synthetic */ d.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(d.a aVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$context = aVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return c.this.new w(this.$context, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                com.onesignal.user.internal.d loginHelper = c.this.getLoginHelper();
                d.a aVar = this.$context;
                this.label = 1;
                if (loginHelper.enqueueLogin$com_onesignal_core(aVar, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return k5.v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((w) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class x extends j implements InterfaceC0732a {
        public x() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final com.onesignal.user.internal.d invoke() {
            return new com.onesignal.user.internal.d(c.this.getIdentityModelStore(), c.this.getUserSwitcher(), c.this.getOperationRepo(), c.this.getConfigModel(), c.this.getJwtTokenStore(), c.this.loginLogoutLock);
        }
    }

    public static final class y extends q5.g implements InterfaceC0747p {
        final /* synthetic */ String $externalId;
        final /* synthetic */ String $jwtBearerToken;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, String str2, c cVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$externalId = str;
            this.$jwtBearerToken = str2;
            this.this$0 = cVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new y(this.$externalId, this.$jwtBearerToken, this.this$0, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((y) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r7.suspendUntilInit("login", r6) == r0) goto L23;
         */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            k5.v vVar = k5.v.f5219a;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                i2.c cVar = i2.c.DEBUG;
                StringBuilder sb = new StringBuilder("login(externalId: ");
                sb.append(this.$externalId);
                sb.append(", jwtBearerToken: ...");
                String str = this.$jwtBearerToken;
                sb.append(str != null ? F5.j.g0(str) : null);
                sb.append(')');
                com.onesignal.debug.internal.logging.b.log(cVar, sb.toString());
                c cVar2 = this.this$0;
                this.label = 1;
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return vVar;
                }
                AbstractC0676f.w(obj);
            }
            d.a switchUser$com_onesignal_core = this.this$0.getLoginHelper().switchUser$com_onesignal_core(this.$externalId, this.$jwtBearerToken);
            if (switchUser$com_onesignal_core != null) {
                com.onesignal.user.internal.d loginHelper = this.this$0.getLoginHelper();
                this.label = 2;
                if (loginHelper.enqueueLogin$com_onesignal_core(switchUser$com_onesignal_core, this) == enumC0580a) {
                    return enumC0580a;
                }
            }
            return vVar;
        }
    }

    public static final class z extends q5.g implements InterfaceC0743l {
        final /* synthetic */ e.a $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(e.a aVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$context = aVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return c.this.new z(this.$context, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            c.this.getLogoutHelper().enqueueLogout$com_onesignal_core(this.$context);
            return k5.v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((z) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public c() {
        List<String> z5 = AbstractC0507k.z("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = z5;
        R1.c cVar = new R1.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = z5.iterator();
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(it.next()).newInstance();
                i.c(newInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((Q1.a) newInstance);
            } catch (ClassNotFoundException e4) {
                e4.printStackTrace();
            }
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Q1.a) obj).register(cVar);
        }
        this.services = cVar.build();
        this.configModel$delegate = AbstractC0521b.x(new C0046c());
        this.initLock = new Object();
        this.loginLogoutLock = new Object();
        this.applicationServiceLock = new Object();
        this.userSwitcher$delegate = AbstractC0521b.x(new O());
        this.loginHelper$delegate = AbstractC0521b.x(new x());
        this.logoutHelper$delegate = AbstractC0521b.x(new A());
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
    public final Object awaitInitCompletion(InterfaceC0152l interfaceC0152l, String str, InterfaceC0564d interfaceC0564d) {
        C0297a c0297a;
        int i7;
        c cVar;
        String str2;
        long j4;
        String str3;
        if (interfaceC0564d instanceof C0297a) {
            c0297a = (C0297a) interfaceC0564d;
            int i8 = c0297a.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0297a.label = i8 - Integer.MIN_VALUE;
                Object obj = c0297a.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0297a.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("Waiting for init to complete...", null, 2, null);
                    long currentTimeMillis = System.currentTimeMillis();
                    c0297a.L$0 = this;
                    c0297a.L$1 = str;
                    c0297a.J$0 = currentTimeMillis;
                    c0297a.label = 1;
                    if (((C0153m) interfaceC0152l).T(c0297a) == enumC0580a) {
                        return enumC0580a;
                    }
                    cVar = this;
                    str2 = str;
                    j4 = currentTimeMillis;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j4 = c0297a.J$0;
                    str2 = (String) c0297a.L$1;
                    cVar = (c) c0297a.L$0;
                    AbstractC0676f.w(obj);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j4;
                if (str2 == null) {
                    str3 = "OneSignalImp initialization completed before '" + str2 + "' (took " + currentTimeMillis2 + "ms)";
                } else {
                    str3 = "OneSignalImp initialization completed (took " + currentTimeMillis2 + "ms)";
                }
                com.onesignal.debug.internal.logging.b.debug$default(str3, null, 2, null);
                if (cVar.initState == a.FAILED) {
                    return k5.v.f5219a;
                }
                Exception exc = cVar.initFailureException;
                if (exc != null) {
                    throw exc;
                }
                throw new IllegalStateException("Initialization failed. Cannot proceed.");
            }
        }
        c0297a = new C0297a(interfaceC0564d);
        Object obj2 = c0297a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0297a.label;
        if (i7 != 0) {
        }
        long currentTimeMillis22 = System.currentTimeMillis() - j4;
        if (str2 == null) {
        }
        com.onesignal.debug.internal.logging.b.debug$default(str3, null, 2, null);
        if (cVar.initState == a.FAILED) {
        }
    }

    private final <T> T blockingGet(InterfaceC0732a interfaceC0732a) {
        try {
            if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
                com.onesignal.debug.internal.logging.b.debug$default("This is called on main thread. This is not recommended.", null, 2, null);
            }
        } catch (RuntimeException e4) {
            com.onesignal.debug.internal.logging.b.debug$default("Could not check main thread status (likely in test environment): " + e4.getMessage(), null, 2, null);
        }
        return this.initState == a.SUCCESS ? (T) interfaceC0732a.invoke() : (T) AbstractC0165z.o(new C0298b(interfaceC0732a, null));
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
            ((C0153m) this.suspendCompletion).U(k5.v.f5219a);
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
            T1.f fVar = (T1.f) this.services.getService(T1.f.class);
            i.c(fVar, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((com.onesignal.core.internal.application.impl.a) fVar).start(context);
            com.onesignal.debug.internal.logging.b.INSTANCE.setApplicationService(fVar);
            this.applicationServiceStarted = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.core.internal.config.b getConfigModel() {
        return (com.onesignal.core.internal.config.b) this.configModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r3.b getIdentityModelStore() {
        return (r3.b) this.identityModelStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.core.internal.config.impl.c getIdentityVerificationService() {
        return (com.onesignal.core.internal.config.impl.c) this.identityVerificationService$delegate.getValue();
    }

    private final AbstractC0161v getIoDispatcher() {
        return com.onesignal.common.threading.a.INSTANCE.getIO();
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
    public final d2.f getOperationRepo() {
        return (d2.f) this.operationRepo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0365b getPreferencesService() {
        return (InterfaceC0365b) this.preferencesService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.onesignal.user.internal.properties.b getPropertiesModelStore() {
        return (com.onesignal.user.internal.properties.b) this.propertiesModelStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w3.e getSubscriptionModelStore() {
        return (w3.e) this.subscriptionModelStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l getUserSwitcher() {
        return (l) this.userSwitcher$delegate.getValue();
    }

    private final void initEssentials(Context context) {
        g gVar = new g(context, new r(), null, null, null, null, null, 124, null);
        gVar.initializeFromCachedConfig();
        this.otelManager = gVar;
        C0366c.INSTANCE.ensureNoObfuscatedPrefStore(context);
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
                    i6.g.a(exc, illegalStateException);
                }
                com.onesignal.debug.internal.logging.b.warn$default("suspendInitInternal: no appId provided or found in local storage. Please pass a valid appId to initWithContext().", null, 2, null);
                completeInit(a.FAILED);
                return false;
            }
            com.onesignal.core.internal.config.b configModel = getConfigModel();
            String appId = resolveAppId.getAppId();
            i.b(appId);
            configModel.setAppId(appId);
            boolean forceCreateUser = resolveAppId.getForceCreateUser();
            updateConfig();
            getUserSwitcher().initUser(forceCreateUser);
            bootstrapServices.scheduleStart();
            completeInit(a.SUCCESS);
            return true;
        } catch (Exception e4) {
            com.onesignal.debug.internal.logging.b.error("OneSignal: internalInit threw unexpectedly; marking init FAILED", e4);
            Exception exc2 = this.initFailureException;
            if (exc2 != null) {
                i6.g.a(exc2, e4);
            }
            completeInit(a.FAILED);
            return false;
        }
    }

    private final String notInitializedMessage(String str) {
        if (str == null) {
            return "Must call 'initWithContext' before use";
        }
        return "Must call 'initWithContext' before '" + str + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object suspendAndReturn(InterfaceC0732a interfaceC0732a, InterfaceC0564d interfaceC0564d) {
        L l7;
        int i7;
        if (interfaceC0564d instanceof L) {
            l7 = (L) interfaceC0564d;
            int i8 = l7.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                l7.label = i8 - Integer.MIN_VALUE;
                Object obj = l7.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = l7.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    l7.L$0 = interfaceC0732a;
                    l7.label = 1;
                    if (suspendUntilInit$default(this, null, l7, 1, null) == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0732a = (InterfaceC0732a) l7.L$0;
                    AbstractC0676f.w(obj);
                }
                return interfaceC0732a.invoke();
            }
        }
        l7 = new L(interfaceC0564d);
        Object obj2 = l7.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = l7.label;
        if (i7 != 0) {
        }
        return interfaceC0732a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object suspendUntilInit(String str, InterfaceC0564d interfaceC0564d) {
        Object waitUntilInitInternal = waitUntilInitInternal(str, interfaceC0564d);
        return waitUntilInitInternal == EnumC0580a.f5697f ? waitUntilInitInternal : k5.v.f5219a;
    }

    public static /* synthetic */ Object suspendUntilInit$default(c cVar, String str, InterfaceC0564d interfaceC0564d, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        return cVar.suspendUntilInit(str, interfaceC0564d);
    }

    private final void updateConfig() {
        if (this._consentRequired != null) {
            com.onesignal.core.internal.config.b configModel = getConfigModel();
            Boolean bool = this._consentRequired;
            i.b(bool);
            configModel.setConsentRequired(bool);
        }
        if (this._consentGiven != null) {
            com.onesignal.core.internal.config.b configModel2 = getConfigModel();
            Boolean bool2 = this._consentGiven;
            i.b(bool2);
            configModel2.setConsentGiven(bool2);
        }
        if (this._disableGMSMissingPrompt != null) {
            com.onesignal.core.internal.config.b configModel3 = getConfigModel();
            Boolean bool3 = this._disableGMSMissingPrompt;
            i.b(bool3);
            configModel3.setDisableGMSMissingPrompt(bool3.booleanValue());
        }
    }

    private final <T> T waitAndReturn(InterfaceC0732a interfaceC0732a) {
        waitForInit$default(this, null, 1, null);
        return (T) interfaceC0732a.invoke();
    }

    private final void waitForInit(String str) {
        if (this.initState == a.SUCCESS) {
            return;
        }
        AbstractC0165z.o(new P(str, null));
    }

    public static /* synthetic */ void waitForInit$default(c cVar, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        cVar.waitForInit(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object waitUntilInitInternal(String str, InterfaceC0564d interfaceC0564d) {
        a aVar;
        InterfaceC0152l interfaceC0152l;
        synchronized (this.initLock) {
            aVar = this.initState;
            interfaceC0152l = aVar == a.IN_PROGRESS ? this.suspendCompletion : null;
        }
        int i7 = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i7 == 1) {
            throw new IllegalStateException(notInitializedMessage(str));
        }
        if (i7 == 2) {
            i.b(interfaceC0152l);
            Object awaitInitCompletion = awaitInitCompletion(interfaceC0152l, str, interfaceC0564d);
            return awaitInitCompletion == EnumC0580a.f5697f ? awaitInitCompletion : k5.v.f5219a;
        }
        if (i7 != 3) {
            return k5.v.f5219a;
        }
        Exception exc = this.initFailureException;
        if (exc != null) {
            throw exc;
        }
        throw new IllegalStateException("Initialization failed. Cannot proceed.");
    }

    public static /* synthetic */ Object waitUntilInitInternal$default(c cVar, String str, InterfaceC0564d interfaceC0564d, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        return cVar.waitUntilInitInternal(str, interfaceC0564d);
    }

    public void addUserJwtInvalidatedListener(L1.c listener) {
        i.e(listener, "listener");
        waitForInit("addUserJwtInvalidatedListener");
        getJwtTokenStore().addUserJwtInvalidatedListener(listener);
    }

    @Override // R1.b
    public <T> List<T> getAllServices(Class<T> c7) {
        i.e(c7, "c");
        return this.services.getAllServices(c7);
    }

    public boolean getConsentGiven() {
        return isInitialized() ? ((Boolean) blockingGet(new C0299d())).booleanValue() : i.a(this._consentGiven, Boolean.TRUE);
    }

    public boolean getConsentRequired() {
        return isInitialized() ? ((Boolean) blockingGet(new C0300e())).booleanValue() : i.a(this._consentRequired, Boolean.TRUE);
    }

    @Override // L1.b
    public InterfaceC0425a getDebug() {
        return this.debug;
    }

    public boolean getDisableGMSMissingPrompt() {
        return isInitialized() ? ((Boolean) blockingGet(new C0301f())).booleanValue() : i.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    @Override // L1.b
    public l2.j getInAppMessages() {
        return (l2.j) waitAndReturn(new q());
    }

    @Override // L1.b
    public InterfaceC0728a getLocation() {
        return (InterfaceC0728a) waitAndReturn(new v());
    }

    @Override // L1.b
    public n getNotifications() {
        return (n) waitAndReturn(new C());
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // R1.b
    public <T> T getService(Class<T> c7) {
        i.e(c7, "c");
        return (T) this.services.getService(c7);
    }

    @Override // R1.b
    public <T> T getServiceOrNull(Class<T> c7) {
        i.e(c7, "c");
        return (T) this.services.getServiceOrNull(c7);
    }

    @Override // L1.b
    public InterfaceC0392a getSession() {
        return (InterfaceC0392a) waitAndReturn(new G());
    }

    @Override // L1.b
    public m3.a getUser() {
        return (m3.a) waitAndReturn(new N());
    }

    @Override // R1.b
    public <T> boolean hasService(Class<T> c7) {
        i.e(c7, "c");
        return this.services.hasService(c7);
    }

    @Override // L1.b
    public boolean initWithContext(Context context, String appId) {
        i.e(context, "context");
        i.e(appId, "appId");
        i2.c cVar = i2.c.DEBUG;
        com.onesignal.debug.internal.logging.b.log(cVar, "Calling deprecated initWithContext(context: " + context + ", appId: " + appId + ')');
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        synchronized (this.initLock) {
            if (this.initState.isSDKAccessible()) {
                com.onesignal.debug.internal.logging.b.log(cVar, "initWithContext: SDK already initialized or in progress");
                return true;
            }
            this.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
            this.initState = a.IN_PROGRESS;
            this.suspendCompletion = AbstractC0165z.a();
            try {
                ensureApplicationServiceStarted(context);
                com.onesignal.common.threading.b.suspendifyOnIO(new s(context, appId, null));
                return true;
            } catch (Exception e4) {
                Exception exc = this.initFailureException;
                if (exc != null) {
                    i6.g.a(exc, e4);
                }
                completeInit(a.FAILED);
                throw e4;
            }
        }
    }

    public Object initWithContextSuspend(Context context, String str, InterfaceC0564d interfaceC0564d) {
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "initWithContext(context: " + context + ", appId: " + str + ')');
        com.onesignal.common.threading.a.INSTANCE.prewarm();
        return AbstractC0165z.t(getIoDispatcher(), new t(context, str, null), interfaceC0564d);
    }

    @Override // L1.b
    public boolean isInitialized() {
        return this.initState == a.SUCCESS;
    }

    @Override // L1.b
    public void login(String externalId) {
        i.e(externalId, "externalId");
        login(externalId, null);
    }

    public Object loginSuspend(String str, String str2, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(getIoDispatcher(), new y(str, str2, this, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    @Override // L1.b
    public void logout() {
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "Calling deprecated logout()");
        waitForInit("logout");
        e.a switchUser$com_onesignal_core = getLogoutHelper().switchUser$com_onesignal_core();
        if (switchUser$com_onesignal_core == null) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnIO(new z(switchUser$com_onesignal_core, null));
    }

    public Object logoutSuspend(InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(getIoDispatcher(), new B(null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    public void removeUserJwtInvalidatedListener(L1.c listener) {
        i.e(listener, "listener");
        waitForInit("removeUserJwtInvalidatedListener");
        getJwtTokenStore().removeUserJwtInvalidatedListener(listener);
    }

    @Override // L1.b
    public void setConsentGiven(boolean z5) {
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z5);
        if (isInitialized()) {
            getConfigModel().setConsentGiven(Boolean.valueOf(z5));
            if (i.a(bool, Boolean.valueOf(z5)) || !z5) {
                return;
            }
            getOperationRepo().forceExecuteOperations();
        }
    }

    @Override // L1.b
    public void setConsentRequired(boolean z5) {
        this._consentRequired = Boolean.valueOf(z5);
        if (isInitialized()) {
            getConfigModel().setConsentRequired(Boolean.valueOf(z5));
        }
    }

    public void setDisableGMSMissingPrompt(boolean z5) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z5);
        if (isInitialized()) {
            getConfigModel().setDisableGMSMissingPrompt(z5);
        }
    }

    public void updateUserJwt(String externalId, String token) {
        i.e(externalId, "externalId");
        i.e(token, "token");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "updateUserJwt(externalId: " + externalId + ", token: ..." + F5.j.g0(token) + ')');
        waitForInit("updateUserJwt");
        getJwtTokenStore().putJwt(externalId, token);
        getOperationRepo().forceExecuteOperations();
    }

    public Object updateUserJwtSuspend(String str, String str2, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(getIoDispatcher(), new M(str, str2, this, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    public Object getInAppMessages(InterfaceC0564d interfaceC0564d) {
        return AbstractC0165z.t(getIoDispatcher(), new C0305j(null), interfaceC0564d);
    }

    public Object getLocation(InterfaceC0564d interfaceC0564d) {
        return AbstractC0165z.t(getIoDispatcher(), new C0306k(null), interfaceC0564d);
    }

    public Object getNotifications(InterfaceC0564d interfaceC0564d) {
        return AbstractC0165z.t(getIoDispatcher(), new C0307l(null), interfaceC0564d);
    }

    public Object getSession(InterfaceC0564d interfaceC0564d) {
        return AbstractC0165z.t(getIoDispatcher(), new C0308m(null), interfaceC0564d);
    }

    public Object getUser(InterfaceC0564d interfaceC0564d) {
        return AbstractC0165z.t(getIoDispatcher(), new C0309n(null), interfaceC0564d);
    }

    @Override // L1.b
    public void login(String externalId, String str) {
        i.e(externalId, "externalId");
        i2.c cVar = i2.c.DEBUG;
        StringBuilder sb = new StringBuilder("Calling deprecated login(externalId: ");
        sb.append(externalId);
        sb.append(", jwtBearerToken: ...");
        sb.append(str != null ? F5.j.g0(str) : null);
        sb.append(')');
        com.onesignal.debug.internal.logging.b.log(cVar, sb.toString());
        waitForInit("login");
        d.a switchUser$com_onesignal_core = getLoginHelper().switchUser$com_onesignal_core(externalId, str);
        if (switchUser$com_onesignal_core == null) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnIO(new w(switchUser$com_onesignal_core, null));
    }

    public Object getConsentGiven(InterfaceC0564d interfaceC0564d) {
        return AbstractC0165z.t(getIoDispatcher(), new C0302g(null), interfaceC0564d);
    }

    public Object getConsentRequired(InterfaceC0564d interfaceC0564d) {
        return AbstractC0165z.t(getIoDispatcher(), new C0303h(null), interfaceC0564d);
    }

    public Object getDisableGMSMissingPrompt(InterfaceC0564d interfaceC0564d) {
        return AbstractC0165z.t(getIoDispatcher(), new C0304i(null), interfaceC0564d);
    }

    public Object setConsentRequired(boolean z5, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(getIoDispatcher(), new I(z5, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    public Object setDisableGMSMissingPrompt(boolean z5, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(getIoDispatcher(), new J(z5, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    public Object setConsentGiven(boolean z5, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(getIoDispatcher(), new H(z5, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    @Override // L1.b
    public Object initWithContext(Context context, InterfaceC0564d interfaceC0564d) {
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "initWithContext(context: " + context + ')');
        return initWithContextSuspend(context, null, interfaceC0564d);
    }
}
