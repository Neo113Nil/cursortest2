package com.onesignal.inAppMessages.internal;

import H5.C0153m;
import H5.InterfaceC0152l;
import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import b2.InterfaceC0265a;
import com.onesignal.common.AndroidUtils;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import g2.InterfaceC0391a;
import h3.InterfaceC0405a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k2.C0469c;
import k5.C0482l;
import l3.InterfaceC0493a;
import l3.InterfaceC0494b;
import l5.AbstractC0506j;
import m2.InterfaceC0523b;
import n2.C0542a;
import o2.InterfaceC0558a;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.EnumC0580a;
import q2.InterfaceC0597a;
import q2.InterfaceC0598b;
import q5.AbstractC0607c;
import r2.InterfaceC0616a;
import r3.C0617a;
import u0.AbstractC0676f;
import u2.InterfaceC0691a;
import v2.C0705a;
import w2.InterfaceC0717a;
import w2.InterfaceC0718b;
import w3.InterfaceC0719a;
import w3.InterfaceC0720b;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;
import y5.InterfaceC0766a;
import y5.InterfaceC0768c;

/* loaded from: classes.dex */
public final class k implements l2.j, com.onesignal.core.internal.startup.b, InterfaceC0719a, com.onesignal.common.modeling.g, InterfaceC0597a, InterfaceC0718b, InterfaceC0493a, T1.e, com.onesignal.user.internal.jwt.a {
    private final T1.f _applicationService;
    private final InterfaceC0523b _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final O1.c _consistencyManager;
    private final InterfaceC0558a _displayer;
    private final r3.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final InterfaceC0405a _influenceManager;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final InterfaceC0265a _languageContext;
    private final InterfaceC0598b _lifecycle;
    private final j3.b _outcomeEventsController;
    private final InterfaceC0616a _prefs;
    private final InterfaceC0691a _repository;
    private final InterfaceC0494b _sessionService;
    private final C0705a _state;
    private final InterfaceC0720b _subscriptionManager;
    private final InterfaceC0391a _time;
    private final InterfaceC0717a _triggerController;
    private final w2.d _triggerModelStore;
    private final m3.a _userManager;
    private final Set<String> clickedClickIds;
    private final Set<String> dismissedMessages;
    private final Set<String> earlySessionTriggers;
    private final P5.a fetchIAMMutex;
    private boolean hasCompletedFirstFetch;
    private final C0036k identityModelChangeHandler;
    private final Set<String> impressionedMessages;
    private volatile Long lastTimeFetchedIAMs;
    private final com.onesignal.common.events.b lifecycleCallback;
    private final com.onesignal.common.events.b messageClickCallback;
    private final List<a> messageDisplayQueue;
    private final P5.a messageDisplayQueueMutex;
    private List<a> messages;
    private volatile String pendingJwtRetryExternalId;
    private volatile M1.b pendingJwtRetryRywData;
    private final List<a> redisplayedInAppMessages;
    private final Set<String> viewedPageIds;

    public static final class A extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public A(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.persistInAppMessage(null, this);
        }
    }

    public static final class B extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public B(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.queueMessageForDisplay(null, this);
        }
    }

    public static final class C extends q5.g implements InterfaceC0743l {
        final /* synthetic */ a $inAppMessage;
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.prompt.impl.b> $prompts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$inAppMessage = aVar;
            this.$prompts = list;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new C(this.$inAppMessage, this.$prompts, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                k kVar = k.this;
                a aVar = this.$inAppMessage;
                List<com.onesignal.inAppMessages.internal.prompt.impl.b> list = this.$prompts;
                this.label = 1;
                if (kVar.showMultiplePrompts(aVar, list, this) == enumC0580a) {
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
            return ((C) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class D extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public D(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.showMultiplePrompts(null, null, this);
        }
    }

    public static final class E extends q5.g implements InterfaceC0743l {
        Object L$0;
        int label;

        public E(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new E(interfaceC0564d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
        
            if (r5.cleanCachedInAppMessages(r4) == r0) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0060 A[LOOP:0: B:7:0x005a->B:9:0x0060, LOOP_END] */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Iterator it;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                InterfaceC0691a interfaceC0691a = k.this._repository;
                this.label = 1;
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$0;
                    AbstractC0676f.w(obj);
                    list.addAll((Collection) obj);
                    it = k.this.redisplayedInAppMessages.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).setDisplayedInSession(false);
                    }
                    return k5.v.f5219a;
                }
                AbstractC0676f.w(obj);
            }
            List list2 = k.this.redisplayedInAppMessages;
            InterfaceC0691a interfaceC0691a2 = k.this._repository;
            this.L$0 = list2;
            this.label = 2;
            Object listInAppMessages = interfaceC0691a2.listInAppMessages(this);
            if (listInAppMessages != enumC0580a) {
                list = list2;
                obj = listInAppMessages;
                list.addAll((Collection) obj);
                it = k.this.redisplayedInAppMessages.iterator();
                while (it.hasNext()) {
                }
                return k5.v.f5219a;
            }
            return enumC0580a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((E) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$a, reason: case insensitive filesystem */
    public static final class C0292a extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0292a(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.attemptToShowInAppMessage(this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$b, reason: case insensitive filesystem */
    public static final class C0293b extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0293b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.evaluateInAppMessages(this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$c, reason: case insensitive filesystem */
    public static final class C0294c extends AbstractC0607c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C0294c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fetchIvOrSaveRetry(null, null, null, null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$d, reason: case insensitive filesystem */
    public static final class C0295d extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C0295d(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fetchMessages(null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$e, reason: case insensitive filesystem */
    public static final class C0296e extends kotlin.jvm.internal.j implements InterfaceC0732a {
        public C0296e() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Long invoke() {
            return Long.valueOf(k.this._time.getCurrentTimeMillis() - k.this._sessionService.getStartTime());
        }
    }

    public static final class f extends q5.g implements InterfaceC0743l {
        int label;

        public f(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new f(interfaceC0564d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r1.fetchMessages(r7, r6) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (r7 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        
            if (r7 == r0) goto L22;
         */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                String onesignalId = k.this._userManager.getOnesignalId();
                O1.c cVar = k.this._consistencyManager;
                M1.a aVar = new M1.a(onesignalId);
                this.label = 1;
                obj = cVar.getRywDataFromAwaitableCondition(aVar, this);
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        return k5.v.f5219a;
                    }
                    AbstractC0676f.w(obj);
                    M1.b bVar = (M1.b) obj;
                    if (bVar != null) {
                        k kVar = k.this;
                        this.label = 3;
                    }
                    return k5.v.f5219a;
                }
                AbstractC0676f.w(obj);
            }
            this.label = 2;
            obj = ((C0153m) ((InterfaceC0152l) obj)).T(this);
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((f) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class g extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireOutcomesForClick(null, null, this);
        }
    }

    public static final class h extends q5.g implements InterfaceC0747p {
        final /* synthetic */ b $result;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$result = bVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            h hVar = new h(this.$result, interfaceC0564d);
            hVar.L$0 = obj;
            return hVar;
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            ((C0469c) ((l2.c) this.L$0)).onClick(this.$result);
            return k5.v.f5219a;
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(l2.c cVar, InterfaceC0564d interfaceC0564d) {
            return ((h) create(cVar, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class i extends AbstractC0607c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public i(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForClick(null, null, this);
        }
    }

    public static final class j extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForPageChange(null, null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$k, reason: collision with other inner class name */
    public static final class C0036k implements com.onesignal.common.modeling.g {

        /* renamed from: com.onesignal.inAppMessages.internal.k$k$a */
        public static final class a extends q5.g implements InterfaceC0743l {
            final /* synthetic */ String $newOneSignalId;
            int label;
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, String str, InterfaceC0564d interfaceC0564d) {
                super(1, interfaceC0564d);
                this.this$0 = kVar;
                this.$newOneSignalId = str;
            }

            @Override // q5.AbstractC0605a
            public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
                return new a(this.this$0, this.$newOneSignalId, interfaceC0564d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
            
                if (r1.fetchMessages(r7, r6) == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
            
                if (r7 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            
                if (r7 == r0) goto L22;
             */
            @Override // q5.AbstractC0605a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                int i7 = this.label;
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    O1.c cVar = this.this$0._consistencyManager;
                    M1.a aVar = new M1.a(this.$newOneSignalId);
                    this.label = 1;
                    obj = cVar.getRywDataFromAwaitableCondition(aVar, this);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0676f.w(obj);
                            return k5.v.f5219a;
                        }
                        AbstractC0676f.w(obj);
                        M1.b bVar = (M1.b) obj;
                        if (bVar != null) {
                            k kVar = this.this$0;
                            this.label = 3;
                        }
                        return k5.v.f5219a;
                    }
                    AbstractC0676f.w(obj);
                }
                this.label = 2;
                obj = ((C0153m) ((InterfaceC0152l) obj)).T(this);
            }

            @Override // x5.InterfaceC0743l
            public final Object invoke(InterfaceC0564d interfaceC0564d) {
                return ((a) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
            }
        }

        public C0036k() {
        }

        @Override // com.onesignal.common.modeling.g
        public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
            kotlin.jvm.internal.i.e(args, "args");
            kotlin.jvm.internal.i.e(tag, "tag");
            if (kotlin.jvm.internal.i.a(args.getProperty(), "onesignal_id")) {
                Object oldValue = args.getOldValue();
                kotlin.jvm.internal.i.c(oldValue, "null cannot be cast to non-null type kotlin.String");
                Object newValue = args.getNewValue();
                kotlin.jvm.internal.i.c(newValue, "null cannot be cast to non-null type kotlin.String");
                String str = (String) newValue;
                com.onesignal.common.d dVar = com.onesignal.common.d.INSTANCE;
                if (!dVar.isLocalId((String) oldValue) || dVar.isLocalId(str)) {
                    return;
                }
                com.onesignal.common.threading.b.suspendifyOnIO(new a(k.this, str, null));
            }
        }

        @Override // com.onesignal.common.modeling.g
        public void onModelReplaced(C0617a model, String tag) {
            kotlin.jvm.internal.i.e(model, "model");
            kotlin.jvm.internal.i.e(tag, "tag");
            k.this.pendingJwtRetryExternalId = null;
            k.this.pendingJwtRetryRywData = null;
        }
    }

    public static final class l extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public l(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.messageWasDismissed(null, false, this);
        }
    }

    public static final class m extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l2.g) obj);
            return k5.v.f5219a;
        }

        public final void invoke(l2.g it) {
            kotlin.jvm.internal.i.e(it, "it");
            ((C0469c) it).onDidDismiss(new e(this.$message));
        }
    }

    public static final class n extends q5.g implements InterfaceC0743l {
        final /* synthetic */ M1.b $pendingRyw;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(M1.b bVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$pendingRyw = bVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new n(this.$pendingRyw, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                k kVar = k.this;
                M1.b bVar = this.$pendingRyw;
                this.label = 1;
                if (kVar.fetchMessages(bVar, this) == enumC0580a) {
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
            return ((n) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class o extends q5.g implements InterfaceC0743l {
        final /* synthetic */ c $action;
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(c cVar, a aVar, k kVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new o(this.$action, this.$message, this.this$0, interfaceC0564d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
        
            if (r8.fireOutcomesForClick(r1, r3, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        
            if (r8.fireRESTCallForClick(r1, r4, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        
            if (r8.beginProcessingPrompts(r1, r5, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            if (r8.firePublicClickHandler(r1, r6, r7) == r0) goto L25;
         */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                a aVar = this.$message;
                c cVar = this.$action;
                this.label = 1;
            } else if (i7 == 1) {
                AbstractC0676f.w(obj);
            } else if (i7 == 2) {
                AbstractC0676f.w(obj);
                this.this$0.fireClickAction(this.$action);
                k kVar2 = this.this$0;
                a aVar2 = this.$message;
                c cVar2 = this.$action;
                this.label = 3;
            } else {
                if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return k5.v.f5219a;
                }
                AbstractC0676f.w(obj);
                this.this$0.fireTagCallForClick(this.$action);
                k kVar3 = this.this$0;
                String messageId = this.$message.getMessageId();
                List<com.onesignal.inAppMessages.internal.f> outcomes = this.$action.getOutcomes();
                this.label = 4;
            }
            k kVar4 = this.this$0;
            a aVar3 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((o) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class p extends q5.g implements InterfaceC0743l {
        final /* synthetic */ c $action;
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(c cVar, a aVar, k kVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return new p(this.$action, this.$message, this.this$0, interfaceC0564d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (r6.beginProcessingPrompts(r1, r3, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r6.firePublicClickHandler(r1, r4, r5) == r0) goto L15;
         */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                a aVar = this.$message;
                c cVar = this.$action;
                this.label = 1;
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    this.this$0.fireClickAction(this.$action);
                    this.this$0.logInAppMessagePreviewActions(this.$action);
                    return k5.v.f5219a;
                }
                AbstractC0676f.w(obj);
            }
            k kVar2 = this.this$0;
            a aVar2 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((p) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class q extends q5.g implements InterfaceC0743l {
        final /* synthetic */ a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(a aVar, com.onesignal.inAppMessages.internal.g gVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new q(this.$message, this.$page, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                k kVar = k.this;
                a aVar = this.$message;
                com.onesignal.inAppMessages.internal.g gVar = this.$page;
                this.label = 1;
                if (kVar.fireRESTCallForPageChange(aVar, gVar, this) == enumC0580a) {
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
            return ((q) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class r extends q5.g implements InterfaceC0743l {
        final /* synthetic */ a $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(a aVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$message = aVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new r(this.$message, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                k kVar = k.this;
                a aVar = this.$message;
                this.label = 1;
                if (k.messageWasDismissed$default(kVar, aVar, false, this, 2, null) == enumC0580a) {
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
            return ((r) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class s extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l2.g) obj);
            return k5.v.f5219a;
        }

        public final void invoke(l2.g it) {
            kotlin.jvm.internal.i.e(it, "it");
            ((C0469c) it).onDidDisplay(new e(this.$message));
        }
    }

    public static final class t extends q5.g implements InterfaceC0743l {
        final /* synthetic */ a $message;
        final /* synthetic */ String $variantId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, a aVar, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$variantId = str;
            this.$message = aVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new t(this.$variantId, this.$message, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    InterfaceC0523b interfaceC0523b = k.this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) k.this._configModelStore.getModel()).getAppId();
                    String id = k.this._subscriptionManager.getSubscriptions().getPush().getId();
                    String str = this.$variantId;
                    String messageId = this.$message.getMessageId();
                    this.label = 1;
                    tVar = this;
                    try {
                        if (interfaceC0523b.sendIAMImpression(appId, id, str, messageId, tVar) == enumC0580a) {
                            return enumC0580a;
                        }
                    } catch (P1.a unused) {
                        k.this.impressionedMessages.remove(tVar.$message.getMessageId());
                        return k5.v.f5219a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    tVar = this;
                }
                k.this._prefs.setImpressionesMessagesId(k.this.impressionedMessages);
            } catch (P1.a unused2) {
                tVar = this;
            }
            return k5.v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((t) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class u extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l2.g) obj);
            return k5.v.f5219a;
        }

        public final void invoke(l2.g it) {
            kotlin.jvm.internal.i.e(it, "it");
            ((C0469c) it).onWillDismiss(new e(this.$message));
        }
    }

    public static final class v extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l2.g) obj);
            return k5.v.f5219a;
        }

        public final void invoke(l2.g it) {
            kotlin.jvm.internal.i.e(it, "it");
            ((C0469c) it).onWillDisplay(new e(this.$message));
        }
    }

    public static final class w extends q5.g implements InterfaceC0743l {
        int label;

        public w(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new w(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == enumC0580a) {
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

    public static final class x extends q5.g implements InterfaceC0743l {
        int label;

        public x(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new x(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == enumC0580a) {
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
            return ((x) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class y extends q5.g implements InterfaceC0743l {
        int label;

        public y(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new y(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            k.this._displayer.dismissCurrentInAppMessage();
            return k5.v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((y) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public static final class z extends q5.g implements InterfaceC0743l {
        Object L$0;
        Object L$1;
        int label;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar) {
                super(1);
                this.this$0 = kVar;
            }

            @Override // x5.InterfaceC0743l
            public final Boolean invoke(com.onesignal.inAppMessages.internal.a it) {
                kotlin.jvm.internal.i.e(it, "it");
                return Boolean.valueOf(!this.this$0._triggerController.evaluateMessageTriggers(it) || it.isFinished() || this.this$0.dismissedMessages.contains(it.getMessageId()));
            }
        }

        public z(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return k.this.new z(interfaceC0564d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
        
            if (r8.attemptToShowInAppMessage(r7) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (r1.evaluateInAppMessages(r7) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
        
            if (r8 == r0) goto L22;
         */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            k kVar;
            Object obj2;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    P5.a aVar = k.this.messageDisplayQueueMutex;
                    kVar = k.this;
                    this.L$0 = aVar;
                    this.L$1 = kVar;
                    this.label = 1;
                    P5.d dVar = (P5.d) aVar;
                    Object c7 = dVar.c(this);
                    obj2 = dVar;
                } else if (i7 == 1) {
                    kVar = (k) this.L$1;
                    Object obj3 = (P5.a) this.L$0;
                    AbstractC0676f.w(obj);
                    obj2 = obj3;
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        return k5.v.f5219a;
                    }
                    AbstractC0676f.w(obj);
                    k kVar2 = k.this;
                    this.label = 3;
                }
                AbstractC0506j.L(kVar.messageDisplayQueue, new a(kVar));
                ((P5.d) obj2).d(null);
                k kVar3 = k.this;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            } catch (Throwable th) {
                ((P5.d) obj2).d(null);
                throw th;
            }
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((z) create(interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }
    }

    public k(T1.f _applicationService, InterfaceC0494b _sessionService, InterfaceC0405a _influenceManager, com.onesignal.core.internal.config.c _configModelStore, m3.a _userManager, r3.b _identityModelStore, InterfaceC0720b _subscriptionManager, j3.b _outcomeEventsController, C0705a _state, InterfaceC0616a _prefs, InterfaceC0691a _repository, InterfaceC0523b _backend, InterfaceC0717a _triggerController, w2.d _triggerModelStore, InterfaceC0558a _displayer, InterfaceC0598b _lifecycle, InterfaceC0265a _languageContext, InterfaceC0391a _time, O1.c _consistencyManager, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.i.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.i.e(_sessionService, "_sessionService");
        kotlin.jvm.internal.i.e(_influenceManager, "_influenceManager");
        kotlin.jvm.internal.i.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.i.e(_userManager, "_userManager");
        kotlin.jvm.internal.i.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.i.e(_subscriptionManager, "_subscriptionManager");
        kotlin.jvm.internal.i.e(_outcomeEventsController, "_outcomeEventsController");
        kotlin.jvm.internal.i.e(_state, "_state");
        kotlin.jvm.internal.i.e(_prefs, "_prefs");
        kotlin.jvm.internal.i.e(_repository, "_repository");
        kotlin.jvm.internal.i.e(_backend, "_backend");
        kotlin.jvm.internal.i.e(_triggerController, "_triggerController");
        kotlin.jvm.internal.i.e(_triggerModelStore, "_triggerModelStore");
        kotlin.jvm.internal.i.e(_displayer, "_displayer");
        kotlin.jvm.internal.i.e(_lifecycle, "_lifecycle");
        kotlin.jvm.internal.i.e(_languageContext, "_languageContext");
        kotlin.jvm.internal.i.e(_time, "_time");
        kotlin.jvm.internal.i.e(_consistencyManager, "_consistencyManager");
        kotlin.jvm.internal.i.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.i.e(_identityVerificationService, "_identityVerificationService");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._influenceManager = _influenceManager;
        this._configModelStore = _configModelStore;
        this._userManager = _userManager;
        this._identityModelStore = _identityModelStore;
        this._subscriptionManager = _subscriptionManager;
        this._outcomeEventsController = _outcomeEventsController;
        this._state = _state;
        this._prefs = _prefs;
        this._repository = _repository;
        this._backend = _backend;
        this._triggerController = _triggerController;
        this._triggerModelStore = _triggerModelStore;
        this._displayer = _displayer;
        this._lifecycle = _lifecycle;
        this._languageContext = _languageContext;
        this._time = _time;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this.lifecycleCallback = new com.onesignal.common.events.b();
        this.messageClickCallback = new com.onesignal.common.events.b();
        this.messages = new ArrayList();
        this.dismissedMessages = new LinkedHashSet();
        this.impressionedMessages = new LinkedHashSet();
        this.viewedPageIds = new LinkedHashSet();
        this.clickedClickIds = new LinkedHashSet();
        this.messageDisplayQueue = new ArrayList();
        this.messageDisplayQueueMutex = new P5.d();
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = new P5.d();
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        kotlin.jvm.internal.i.d(synchronizedSet, "synchronizedSet(...)");
        this.earlySessionTriggers = synchronizedSet;
        this.identityModelChangeHandler = new C0036k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
    
        if (r11.c(r1) == r2) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r3v8, types: [P5.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptToShowInAppMessage(InterfaceC0564d interfaceC0564d) {
        C0292a c0292a;
        Object obj;
        int i7;
        k kVar;
        kotlin.jvm.internal.s sVar;
        P5.d dVar;
        kotlin.jvm.internal.s sVar2;
        Boolean bool;
        if (interfaceC0564d instanceof C0292a) {
            c0292a = (C0292a) interfaceC0564d;
            int i8 = c0292a.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0292a.label = i8 - Integer.MIN_VALUE;
                obj = c0292a.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0292a.label;
                k5.v vVar = k5.v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    T1.f fVar = this._applicationService;
                    c0292a.L$0 = this;
                    c0292a.label = 1;
                    obj = fVar.waitUntilSystemConditionsAvailable(c0292a);
                    if (obj != enumC0580a) {
                        kVar = this;
                    }
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                AbstractC0676f.w(obj);
                                return vVar;
                            }
                            if (i7 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0676f.w(obj);
                            return vVar;
                        }
                        sVar2 = (kotlin.jvm.internal.s) c0292a.L$1;
                        kVar = (k) c0292a.L$0;
                        AbstractC0676f.w(obj);
                        bool = (Boolean) obj;
                        if (bool != null) {
                            kVar._state.setInAppMessageIdShowing(null);
                            Object obj2 = sVar2.f5233f;
                            kotlin.jvm.internal.i.b(obj2);
                            c0292a.L$0 = null;
                            c0292a.L$1 = null;
                            c0292a.label = 4;
                            return kVar.queueMessageForDisplay((a) obj2, c0292a) == enumC0580a ? enumC0580a : vVar;
                        }
                        if (bool.equals(Boolean.FALSE)) {
                            kVar._state.setInAppMessageIdShowing(null);
                            List<a> list = kVar.messages;
                            Object obj3 = sVar2.f5233f;
                            kotlin.jvm.internal.v.a(list);
                            list.remove(obj3);
                            Object obj4 = sVar2.f5233f;
                            kotlin.jvm.internal.i.b(obj4);
                            c0292a.L$0 = null;
                            c0292a.L$1 = null;
                            c0292a.label = 5;
                            if (kVar.messageWasDismissed((a) obj4, true, c0292a) == enumC0580a) {
                            }
                        }
                    }
                    ?? r32 = (P5.a) c0292a.L$2;
                    kotlin.jvm.internal.s sVar3 = (kotlin.jvm.internal.s) c0292a.L$1;
                    k kVar2 = (k) c0292a.L$0;
                    AbstractC0676f.w(obj);
                    sVar = sVar3;
                    dVar = r32;
                    kVar = kVar2;
                    try {
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + kVar.messageDisplayQueue, null, 2, null);
                        if (kVar.getPaused()) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
                        } else if (kVar.messageDisplayQueue.isEmpty()) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
                        } else if (kVar._state.getInAppMessageIdShowing() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                            a remove = kVar.messageDisplayQueue.remove(0);
                            sVar.f5233f = remove;
                            C0705a c0705a = kVar._state;
                            kotlin.jvm.internal.i.b(remove);
                            c0705a.setInAppMessageIdShowing(remove.getMessageId());
                        }
                        dVar.d(null);
                        Object obj5 = sVar.f5233f;
                        if (obj5 != null) {
                            c0292a.L$0 = kVar;
                            c0292a.L$1 = sVar;
                            c0292a.L$2 = null;
                            c0292a.label = 3;
                            Object displayMessage = kVar._displayer.displayMessage((a) obj5, c0292a);
                            if (displayMessage != enumC0580a) {
                                sVar2 = sVar;
                                obj = displayMessage;
                                bool = (Boolean) obj;
                                if (bool != null) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        dVar.d(null);
                        throw th;
                    }
                }
                kVar = (k) c0292a.L$0;
                AbstractC0676f.w(obj);
                if (((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct", null, 2, null);
                    return vVar;
                }
                sVar = new kotlin.jvm.internal.s();
                P5.a aVar = kVar.messageDisplayQueueMutex;
                c0292a.L$0 = kVar;
                c0292a.L$1 = sVar;
                c0292a.L$2 = aVar;
                c0292a.label = 2;
                dVar = (P5.d) aVar;
            }
        }
        c0292a = new C0292a(interfaceC0564d);
        obj = c0292a.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0292a.label;
        k5.v vVar2 = k5.v.f5219a;
        if (i7 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, InterfaceC0564d interfaceC0564d) {
        boolean isEmpty = list.isEmpty();
        k5.v vVar = k5.v.f5219a;
        if (!isEmpty) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + aVar, null, 2, null);
            this._displayer.dismissCurrentInAppMessage();
            Object showMultiplePrompts = showMultiplePrompts(aVar, list, interfaceC0564d);
            if (showMultiplePrompts == EnumC0580a.f5697f) {
                return showMultiplePrompts;
            }
        }
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evaluateInAppMessages(InterfaceC0564d interfaceC0564d) {
        C0293b c0293b;
        int i7;
        k kVar;
        Iterator it;
        if (interfaceC0564d instanceof C0293b) {
            c0293b = (C0293b) interfaceC0564d;
            int i8 = c0293b.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0293b.label = i8 - Integer.MIN_VALUE;
                Object obj = c0293b.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0293b.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.evaluateInAppMessages()", null, 2, null);
                    ArrayList arrayList = new ArrayList();
                    synchronized (this.messages) {
                        for (a aVar : this.messages) {
                            if (this._triggerController.evaluateMessageTriggers(aVar)) {
                                setDataForRedisplay(aVar);
                                if (!this.dismissedMessages.contains(aVar.getMessageId()) && !aVar.isFinished()) {
                                    arrayList.add(aVar);
                                }
                            }
                        }
                    }
                    kVar = this;
                    it = arrayList.iterator();
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) c0293b.L$1;
                    kVar = (k) c0293b.L$0;
                    AbstractC0676f.w(obj);
                }
                while (it.hasNext()) {
                    a aVar2 = (a) it.next();
                    c0293b.L$0 = kVar;
                    c0293b.L$1 = it;
                    c0293b.label = 1;
                    if (kVar.queueMessageForDisplay(aVar2, c0293b) == enumC0580a) {
                        return enumC0580a;
                    }
                }
                return k5.v.f5219a;
            }
        }
        c0293b = new C0293b(interfaceC0564d);
        Object obj2 = c0293b.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0293b.label;
        if (i7 != 0) {
        }
        while (it.hasNext()) {
        }
        return k5.v.f5219a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchIvOrSaveRetry(String str, String str2, M1.b bVar, InterfaceC0732a interfaceC0732a, InterfaceC0564d interfaceC0564d) {
        C0294c c0294c;
        int i7;
        M1.b bVar2;
        k kVar;
        boolean z5;
        String str3;
        if (interfaceC0564d instanceof C0294c) {
            c0294c = (C0294c) interfaceC0564d;
            int i8 = c0294c.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0294c.label = i8 - Integer.MIN_VALUE;
                C0294c c0294c2 = c0294c;
                Object obj = c0294c2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0294c2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    boolean ivBehaviorActive = this._identityVerificationService.getIvBehaviorActive();
                    String externalId = ((C0617a) this._identityModelStore.getModel()).getExternalId();
                    C0482l c0482l = (!ivBehaviorActive || externalId == null) ? new C0482l("onesignal_id", ((C0617a) this._identityModelStore.getModel()).getOnesignalId(), null) : new C0482l("external_id", externalId, this._jwtTokenStore.getJwt(externalId));
                    String str4 = c0482l.f5207f;
                    String str5 = (String) c0482l.f5208g;
                    String str6 = (String) c0482l.f5209h;
                    if (!ivBehaviorActive || externalId == null) {
                        bVar2 = bVar;
                    } else {
                        this.pendingJwtRetryExternalId = externalId;
                        bVar2 = bVar;
                        this.pendingJwtRetryRywData = bVar2;
                    }
                    try {
                        InterfaceC0523b interfaceC0523b = this._backend;
                        c0294c2.L$0 = this;
                        c0294c2.L$1 = externalId;
                        c0294c2.Z$0 = ivBehaviorActive;
                        c0294c2.label = 1;
                        obj = interfaceC0523b.listInAppMessagesIv(str, str4, str5, str2, bVar2, interfaceC0732a, str6, c0294c2);
                        if (obj == enumC0580a) {
                            return enumC0580a;
                        }
                        kVar = this;
                        z5 = ivBehaviorActive;
                        str3 = externalId;
                    } catch (P1.a e4) {
                        e = e4;
                        kVar = this;
                        z5 = ivBehaviorActive;
                        str3 = externalId;
                        if (z5 || str3 == null) {
                            com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ": " + e.getResponse(), null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.info$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ", awaiting JWT refresh for " + str3, null, 2, null);
                            kVar.lastTimeFetchedIAMs = null;
                        }
                        return null;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z5 = c0294c2.Z$0;
                    str3 = (String) c0294c2.L$1;
                    kVar = (k) c0294c2.L$0;
                    try {
                        AbstractC0676f.w(obj);
                    } catch (P1.a e7) {
                        e = e7;
                        if (z5) {
                        }
                        com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ": " + e.getResponse(), null, 2, null);
                        return null;
                    }
                }
                List list = (List) obj;
                kVar.pendingJwtRetryExternalId = null;
                kVar.pendingJwtRetryRywData = null;
                return list;
            }
        }
        c0294c = new C0294c(interfaceC0564d);
        C0294c c0294c22 = c0294c;
        Object obj2 = c0294c22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0294c22.label;
        if (i7 != 0) {
        }
        List list2 = (List) obj2;
        kVar.pendingJwtRetryExternalId = null;
        kVar.pendingJwtRetryRywData = null;
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01cc, code lost:
    
        if (r4.evaluateInAppMessages(r9) == r3) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:63:0x00cf, B:65:0x00d9, B:67:0x00f4, B:70:0x00ff), top: B:62:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessages(M1.b bVar, InterfaceC0564d interfaceC0564d) {
        C0295d c0295d;
        int i7;
        String id;
        P5.a aVar;
        String str;
        M1.b bVar2;
        k kVar;
        k kVar2;
        List<a> list;
        try {
            if (interfaceC0564d instanceof C0295d) {
                c0295d = (C0295d) interfaceC0564d;
                int i8 = c0295d.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0295d.label = i8 - Integer.MIN_VALUE;
                    C0295d c0295d2 = c0295d;
                    Object obj = c0295d2.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = c0295d2.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        if (!this._applicationService.isInForeground()) {
                            return k5.v.f5219a;
                        }
                        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                        id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        if (id.length() == 0 || com.onesignal.common.d.INSTANCE.isLocalId(id) || appId.length() == 0) {
                            return k5.v.f5219a;
                        }
                        P5.a aVar2 = this.fetchIAMMutex;
                        c0295d2.L$0 = this;
                        c0295d2.L$1 = bVar;
                        c0295d2.L$2 = appId;
                        c0295d2.L$3 = id;
                        c0295d2.L$4 = aVar2;
                        c0295d2.label = 1;
                        P5.d dVar = (P5.d) aVar2;
                        if (dVar.c(c0295d2) != enumC0580a) {
                            aVar = dVar;
                            str = appId;
                            bVar2 = bVar;
                            kVar = this;
                        }
                        return enumC0580a;
                    }
                    if (i7 == 1) {
                        aVar = (P5.a) c0295d2.L$4;
                        id = (String) c0295d2.L$3;
                        String str2 = (String) c0295d2.L$2;
                        M1.b bVar3 = (M1.b) c0295d2.L$1;
                        kVar = (k) c0295d2.L$0;
                        AbstractC0676f.w(obj);
                        str = str2;
                        bVar2 = bVar3;
                    } else if (i7 == 2) {
                        kVar2 = (k) c0295d2.L$0;
                        AbstractC0676f.w(obj);
                        list = (List) obj;
                        if (list != null) {
                        }
                    } else {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0676f.w(obj);
                            return k5.v.f5219a;
                        }
                        kVar2 = (k) c0295d2.L$0;
                        AbstractC0676f.w(obj);
                        list = (List) obj;
                        if (list != null) {
                            return k5.v.f5219a;
                        }
                        if ((list instanceof InterfaceC0766a) && !(list instanceof InterfaceC0768c)) {
                            kotlin.jvm.internal.v.d(list, "kotlin.collections.MutableList");
                            throw null;
                        }
                        kVar2.messages = list;
                        synchronized (kVar2.earlySessionTriggers) {
                            try {
                                if (!kVar2.earlySessionTriggers.isEmpty()) {
                                    com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Processing triggers added early on cold start: " + kVar2.earlySessionTriggers, null, 2, null);
                                    for (a aVar3 : kVar2.messages) {
                                        boolean contains = kVar2.redisplayedInAppMessages.contains(aVar3);
                                        boolean isTriggerOnMessage = kVar2._triggerController.isTriggerOnMessage(aVar3, kVar2.earlySessionTriggers);
                                        if (contains && isTriggerOnMessage) {
                                            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Setting isTriggerChanged=true for message " + aVar3.getMessageId(), null, 2, null);
                                            aVar3.setTriggerChanged(true);
                                        }
                                    }
                                    kVar2.earlySessionTriggers.clear();
                                }
                                kVar2.hasCompletedFirstFetch = true;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        c0295d2.L$0 = null;
                        c0295d2.label = 4;
                    }
                    long currentTimeMillis = kVar._time.getCurrentTimeMillis();
                    if (kVar.lastTimeFetchedIAMs != null) {
                        Long l7 = kVar.lastTimeFetchedIAMs;
                        kotlin.jvm.internal.i.b(l7);
                        if (currentTimeMillis - l7.longValue() < ((com.onesignal.core.internal.config.b) kVar._configModelStore.getModel()).getFetchIAMMinInterval()) {
                            return k5.v.f5219a;
                        }
                    }
                    kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis);
                    ((P5.d) aVar).d(null);
                    C0296e c0296e = kVar.new C0296e();
                    if (kVar._identityVerificationService.getNewCodePathsRun()) {
                        InterfaceC0523b interfaceC0523b = kVar._backend;
                        c0295d2.L$0 = kVar;
                        c0295d2.L$1 = null;
                        c0295d2.L$2 = null;
                        c0295d2.L$3 = null;
                        c0295d2.L$4 = null;
                        c0295d2.label = 3;
                        obj = interfaceC0523b.listInAppMessages(str, id, bVar2, c0296e, c0295d2);
                        if (obj != enumC0580a) {
                            kVar2 = kVar;
                            list = (List) obj;
                            if (list != null) {
                            }
                        }
                    } else {
                        c0295d2.L$0 = kVar;
                        c0295d2.L$1 = null;
                        c0295d2.L$2 = null;
                        c0295d2.L$3 = null;
                        c0295d2.L$4 = null;
                        c0295d2.label = 2;
                        obj = kVar.fetchIvOrSaveRetry(str, id, bVar2, c0296e, c0295d2);
                        if (obj != enumC0580a) {
                            kVar2 = kVar;
                            list = (List) obj;
                            if (list != null) {
                            }
                        }
                    }
                    return enumC0580a;
                }
            }
            long currentTimeMillis2 = kVar._time.getCurrentTimeMillis();
            if (kVar.lastTimeFetchedIAMs != null) {
            }
            kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis2);
            ((P5.d) aVar).d(null);
            C0296e c0296e2 = kVar.new C0296e();
            if (kVar._identityVerificationService.getNewCodePathsRun()) {
            }
            return enumC0580a;
        } finally {
            ((P5.d) aVar).d(null);
        }
        c0295d = new C0295d(interfaceC0564d);
        C0295d c0295d22 = c0295d;
        Object obj2 = c0295d22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0295d22.label;
        if (i7 != 0) {
        }
    }

    private final void fetchMessagesWhenConditionIsMet() {
        com.onesignal.common.threading.b.suspendifyOnIO(new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireClickAction(c cVar) {
        if (cVar.getUrl() == null || cVar.getUrl().length() <= 0) {
            return;
        }
        if (cVar.getUrlTarget() == l2.k.BROWSER) {
            AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), cVar.getUrl());
        } else if (cVar.getUrlTarget() == l2.k.IN_APP_WEBVIEW) {
            n2.b.INSTANCE.open$com_onesignal_inAppMessages(cVar.getUrl(), true, this._applicationService.getAppContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireOutcomesForClick(String str, List<com.onesignal.inAppMessages.internal.f> list, InterfaceC0564d interfaceC0564d) {
        g gVar;
        int i7;
        Iterator<com.onesignal.inAppMessages.internal.f> it;
        k kVar;
        if (interfaceC0564d instanceof g) {
            gVar = (g) interfaceC0564d;
            int i8 = gVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.label = i8 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = gVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    this._influenceManager.onDirectInfluenceFromIAM(str);
                    it = list.iterator();
                    kVar = this;
                } else {
                    if (i7 != 1 && i7 != 2 && i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) gVar.L$1;
                    kVar = (k) gVar.L$0;
                    AbstractC0676f.w(obj);
                }
                while (it.hasNext()) {
                    com.onesignal.inAppMessages.internal.f next = it.next();
                    String name = next.getName();
                    if (next.isUnique()) {
                        j3.b bVar = kVar._outcomeEventsController;
                        gVar.L$0 = kVar;
                        gVar.L$1 = it;
                        gVar.label = 1;
                        if (bVar.sendUniqueOutcomeEvent(name, gVar) == enumC0580a) {
                            return enumC0580a;
                        }
                    } else if (next.getWeight() > 0.0f) {
                        j3.b bVar2 = kVar._outcomeEventsController;
                        float weight = next.getWeight();
                        gVar.L$0 = kVar;
                        gVar.L$1 = it;
                        gVar.label = 2;
                        if (bVar2.sendOutcomeEventWithValue(name, weight, gVar) == enumC0580a) {
                            return enumC0580a;
                        }
                    } else {
                        j3.b bVar3 = kVar._outcomeEventsController;
                        gVar.L$0 = kVar;
                        gVar.L$1 = it;
                        gVar.label = 3;
                        if (bVar3.sendOutcomeEvent(name, gVar) == enumC0580a) {
                            return enumC0580a;
                        }
                    }
                }
                return k5.v.f5219a;
            }
        }
        gVar = new g(interfaceC0564d);
        Object obj2 = gVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = gVar.label;
        if (i7 != 0) {
        }
        while (it.hasNext()) {
        }
        return k5.v.f5219a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(a aVar, c cVar, InterfaceC0564d interfaceC0564d) {
        boolean hasSubscribers = this.messageClickCallback.getHasSubscribers();
        k5.v vVar = k5.v.f5219a;
        if (!hasSubscribers) {
            return vVar;
        }
        this._influenceManager.onDirectInfluenceFromIAM(aVar.getMessageId());
        Object suspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new h(new b(aVar, cVar), null), interfaceC0564d);
        return suspendingFireOnMain == EnumC0580a.f5697f ? suspendingFireOnMain : vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(4:10|11|12|13)(2:27|28))(3:29|(6:31|(1:45)|(1:37)|38|39|(1:41)(1:42))|24)|14|15|16))|47|6|7|(0)(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0073, code lost:
    
        if (r13.contains(r6) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForClick(a aVar, c cVar, InterfaceC0564d interfaceC0564d) {
        i iVar;
        int i7;
        String clickId;
        k kVar;
        a aVar2;
        String str;
        if (interfaceC0564d instanceof i) {
            iVar = (i) interfaceC0564d;
            int i8 = iVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.label = i8 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = iVar2.label;
                k5.v vVar = k5.v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    String variantIdForMessage = C0542a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    if (variantIdForMessage != null) {
                        clickId = cVar.getClickId();
                        if (!aVar.getRedisplayStats().isRedisplayEnabled() || clickId == null || !aVar.isClickAvailable(clickId)) {
                            Set<String> set = this.clickedClickIds;
                            kotlin.jvm.internal.i.e(set, "<this>");
                        }
                        if (clickId != null) {
                            this.clickedClickIds.add(clickId);
                            aVar.addClickId(clickId);
                        }
                        try {
                            InterfaceC0523b interfaceC0523b = this._backend;
                            String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                            String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                            String messageId = aVar.getMessageId();
                            boolean isFirstClick = cVar.isFirstClick();
                            iVar2.L$0 = this;
                            iVar2.L$1 = aVar;
                            iVar2.L$2 = clickId;
                            iVar2.label = 1;
                            if (interfaceC0523b.sendIAMClick(appId, id, variantIdForMessage, messageId, clickId, isFirstClick, iVar2) == enumC0580a) {
                                return enumC0580a;
                            }
                            kVar = this;
                        } catch (P1.a unused) {
                            kVar = this;
                            aVar2 = aVar;
                            str = clickId;
                            Set<String> set2 = kVar.clickedClickIds;
                            kotlin.jvm.internal.v.a(set2);
                            set2.remove(str);
                            if (str != null) {
                                aVar2.removeClickId(str);
                            }
                            return vVar;
                        }
                    }
                    return vVar;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) iVar2.L$2;
                aVar2 = (a) iVar2.L$1;
                kVar = (k) iVar2.L$0;
                try {
                    AbstractC0676f.w(obj);
                    clickId = str;
                    aVar = aVar2;
                } catch (P1.a unused2) {
                    Set<String> set22 = kVar.clickedClickIds;
                    kotlin.jvm.internal.v.a(set22);
                    set22.remove(str);
                    if (str != null) {
                    }
                    return vVar;
                }
                kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
                return vVar;
            }
        }
        iVar = new i(interfaceC0564d);
        i iVar22 = iVar;
        Object obj2 = iVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = iVar22.label;
        k5.v vVar2 = k5.v.f5219a;
        if (i7 != 0) {
        }
        kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForPageChange(a aVar, com.onesignal.inAppMessages.internal.g gVar, InterfaceC0564d interfaceC0564d) {
        j jVar;
        int i7;
        String str;
        k kVar;
        if (interfaceC0564d instanceof j) {
            jVar = (j) interfaceC0564d;
            int i8 = jVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                jVar.label = i8 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = jVar2.label;
                k5.v vVar = k5.v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    String variantIdForMessage = C0542a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    if (variantIdForMessage == null) {
                        return vVar;
                    }
                    String pageId = gVar.getPageId();
                    String str2 = aVar.getMessageId() + pageId;
                    if (this.viewedPageIds.contains(str2)) {
                        com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                        return vVar;
                    }
                    this.viewedPageIds.add(str2);
                    try {
                        InterfaceC0523b interfaceC0523b = this._backend;
                        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        String messageId = aVar.getMessageId();
                        jVar2.L$0 = this;
                        jVar2.L$1 = str2;
                        jVar2.label = 1;
                        if (interfaceC0523b.sendIAMPageImpression(appId, id, variantIdForMessage, messageId, pageId, jVar2) == enumC0580a) {
                            return enumC0580a;
                        }
                        str = str2;
                        kVar = this;
                    } catch (P1.a unused) {
                        str = str2;
                        kVar = this;
                        kVar.viewedPageIds.remove(str);
                        return vVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) jVar2.L$1;
                    kVar = (k) jVar2.L$0;
                    try {
                        AbstractC0676f.w(obj);
                    } catch (P1.a unused2) {
                        kVar.viewedPageIds.remove(str);
                        return vVar;
                    }
                }
                kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
                return vVar;
            }
        }
        jVar = new j(interfaceC0564d);
        j jVar22 = jVar;
        Object obj2 = jVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = jVar22.label;
        k5.v vVar2 = k5.v.f5219a;
        if (i7 != 0) {
        }
        kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.inAppMessages.internal.i tags = cVar.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                com.onesignal.common.f fVar = com.onesignal.common.f.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                kotlin.jvm.internal.i.b(tagsToAdd);
                this._userManager.addTags(fVar.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                com.onesignal.common.f fVar2 = com.onesignal.common.f.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                kotlin.jvm.internal.i.b(tagsToRemove);
                this._userManager.removeTags(fVar2.newStringSetFromJSONArray(tagsToRemove));
            }
        }
    }

    private final boolean hasMessageTriggerChanged(a aVar) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(aVar)) {
            return !aVar.isDisplayedInSession();
        }
        return aVar.isTriggerChanged() || (!aVar.isDisplayedInSession() && aVar.getTriggers().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + cVar.getTags(), null, 2, null);
        }
        if (cVar.getOutcomes().size() > 0) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + cVar.getOutcomes(), null, 2, null);
        }
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection, boolean z5) {
        synchronized (this.messages) {
            for (a aVar : this.messages) {
                boolean contains = this.redisplayedInAppMessages.contains(aVar);
                boolean isTriggerOnMessage = this._triggerController.isTriggerOnMessage(aVar, collection);
                boolean messageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(aVar);
                if (!aVar.isTriggerChanged() && contains && (isTriggerOnMessage || (z5 && messageHasOnlyDynamicTriggers))) {
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + aVar, null, 2, null);
                    aVar.setTriggerChanged(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (persistInAppMessage(r11, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object messageWasDismissed(a aVar, boolean z5, InterfaceC0564d interfaceC0564d) {
        l lVar;
        int i7;
        k kVar;
        if (interfaceC0564d instanceof l) {
            lVar = (l) interfaceC0564d;
            int i8 = lVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                lVar.label = i8 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = lVar.label;
                k5.v vVar = k5.v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    if (aVar.isPreview()) {
                        kVar = this;
                        kVar._influenceManager.onInAppMessageDismissed();
                        if (kVar._state.getCurrentPrompt() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed", null, 2, null);
                            return vVar;
                        }
                        if (kVar.lifecycleCallback.getHasSubscribers()) {
                            kVar.lifecycleCallback.fireOnMain(new m(aVar));
                        }
                        kVar._state.setInAppMessageIdShowing(null);
                        if (kVar.messageDisplayQueue.isEmpty()) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message dismissed evaluating messages", null, 2, null);
                            lVar.L$0 = null;
                            lVar.L$1 = null;
                            lVar.label = 3;
                            if (kVar.evaluateInAppMessages(lVar) != enumC0580a) {
                                return vVar;
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show", null, 2, null);
                            lVar.L$0 = null;
                            lVar.L$1 = null;
                            lVar.label = 2;
                            if (kVar.attemptToShowInAppMessage(lVar) != enumC0580a) {
                                return vVar;
                            }
                        }
                        return enumC0580a;
                    }
                    this.dismissedMessages.add(aVar.getMessageId());
                    if (!z5) {
                        this._prefs.setDismissedMessagesId(this.dismissedMessages);
                        this._state.setLastTimeInAppDismissed(new Long(this._time.getCurrentTimeMillis()));
                        lVar.L$0 = this;
                        lVar.L$1 = aVar;
                        lVar.label = 1;
                    }
                    kVar = this;
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AbstractC0676f.w(obj);
                            return vVar;
                        }
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        return vVar;
                    }
                    aVar = (a) lVar.L$1;
                    kVar = (k) lVar.L$0;
                    AbstractC0676f.w(obj);
                }
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
                kVar._influenceManager.onInAppMessageDismissed();
                if (kVar._state.getCurrentPrompt() != null) {
                }
            }
        }
        lVar = new l(interfaceC0564d);
        Object obj2 = lVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = lVar.label;
        k5.v vVar2 = k5.v.f5219a;
        if (i7 != 0) {
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
        kVar._influenceManager.onInAppMessageDismissed();
        if (kVar._state.getCurrentPrompt() != null) {
        }
    }

    public static /* synthetic */ Object messageWasDismissed$default(k kVar, a aVar, boolean z5, InterfaceC0564d interfaceC0564d, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z5 = false;
        }
        return kVar.messageWasDismissed(aVar, z5, interfaceC0564d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persistInAppMessage(a aVar, InterfaceC0564d interfaceC0564d) {
        A a7;
        int i7;
        k kVar;
        int indexOf;
        if (interfaceC0564d instanceof A) {
            a7 = (A) interfaceC0564d;
            int i8 = a7.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                a7.label = i8 - Integer.MIN_VALUE;
                Object obj = a7.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = a7.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    aVar.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / 1000);
                    aVar.getRedisplayStats().incrementDisplayQuantity();
                    aVar.setTriggerChanged(false);
                    aVar.setDisplayedInSession(true);
                    InterfaceC0691a interfaceC0691a = this._repository;
                    a7.L$0 = this;
                    a7.L$1 = aVar;
                    a7.label = 1;
                    if (interfaceC0691a.saveInAppMessage(aVar, a7) == enumC0580a) {
                        return enumC0580a;
                    }
                    kVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) a7.L$1;
                    kVar = (k) a7.L$0;
                    AbstractC0676f.w(obj);
                }
                kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
                indexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
                if (indexOf == -1) {
                    kVar.redisplayedInAppMessages.set(indexOf, aVar);
                } else {
                    kVar.redisplayedInAppMessages.add(aVar);
                }
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
                return k5.v.f5219a;
            }
        }
        a7 = new A(interfaceC0564d);
        Object obj2 = a7.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = a7.label;
        if (i7 != 0) {
        }
        kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
        indexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
        if (indexOf == -1) {
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
        return k5.v.f5219a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r4.attemptToShowInAppMessage(r1) != r2) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v9, types: [P5.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queueMessageForDisplay(a aVar, InterfaceC0564d interfaceC0564d) {
        B b7;
        int i7;
        P5.d dVar;
        k kVar;
        try {
            if (interfaceC0564d instanceof B) {
                b7 = (B) interfaceC0564d;
                int i8 = b7.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    b7.label = i8 - Integer.MIN_VALUE;
                    Object obj = b7.result;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = b7.label;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        P5.a aVar2 = this.messageDisplayQueueMutex;
                        b7.L$0 = this;
                        b7.L$1 = aVar;
                        b7.L$2 = aVar2;
                        b7.label = 1;
                        dVar = (P5.d) aVar2;
                        if (dVar.c(b7) != enumC0580a) {
                            kVar = this;
                        }
                        return enumC0580a;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0676f.w(obj);
                        return k5.v.f5219a;
                    }
                    ?? r9 = (P5.a) b7.L$2;
                    a aVar3 = (a) b7.L$1;
                    kVar = (k) b7.L$0;
                    AbstractC0676f.w(obj);
                    dVar = r9;
                    aVar = aVar3;
                    if (!kVar.messageDisplayQueue.contains(aVar) && !kotlin.jvm.internal.i.a(kVar._state.getInAppMessageIdShowing(), aVar.getMessageId())) {
                        kVar.messageDisplayQueue.add(aVar);
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + aVar.getMessageId() + ", added to the queue", null, 2, null);
                    }
                    dVar.d(null);
                    b7.L$0 = null;
                    b7.L$1 = null;
                    b7.L$2 = null;
                    b7.label = 2;
                }
            }
            if (!kVar.messageDisplayQueue.contains(aVar)) {
                kVar.messageDisplayQueue.add(aVar);
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + aVar.getMessageId() + ", added to the queue", null, 2, null);
            }
            dVar.d(null);
            b7.L$0 = null;
            b7.L$1 = null;
            b7.L$2 = null;
            b7.label = 2;
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        b7 = new B(interfaceC0564d);
        Object obj2 = b7.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = b7.label;
        if (i7 != 0) {
        }
    }

    private final void setDataForRedisplay(a aVar) {
        boolean contains = this.dismissedMessages.contains(aVar.getMessageId());
        int indexOf = this.redisplayedInAppMessages.indexOf(aVar);
        if (!contains || indexOf == -1) {
            return;
        }
        a aVar2 = this.redisplayedInAppMessages.get(indexOf);
        aVar.getRedisplayStats().setDisplayStats(aVar2.getRedisplayStats());
        aVar.setDisplayedInSession(aVar2.isDisplayedInSession());
        boolean hasMessageTriggerChanged = hasMessageTriggerChanged(aVar);
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setDataForRedisplay: " + aVar + " triggerHasChanged: " + hasMessageTriggerChanged, null, 2, null);
        if (hasMessageTriggerChanged && aVar.getRedisplayStats().isDelayTimeSatisfied() && aVar.getRedisplayStats().shouldDisplayAgain()) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setDataForRedisplay message available for redisplay: " + aVar.getMessageId(), null, 2, null);
            this.dismissedMessages.remove(aVar.getMessageId());
            this.impressionedMessages.remove(aVar.getMessageId());
            this.viewedPageIds.clear();
            this._prefs.setViewPageImpressionedIds(this.viewedPageIds);
            aVar.clearClickIds();
        }
    }

    private final void showAlertDialogMessage(final a aVar, final List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list) {
        String string = this._applicationService.getAppContext().getString(l2.l.location_permission_missing_title);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        String string2 = this._applicationService.getAppContext().getString(l2.l.location_permission_missing_message);
        kotlin.jvm.internal.i.d(string2, "getString(...)");
        new AlertDialog.Builder(this._applicationService.getCurrent()).setTitle(string).setMessage(string2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onesignal.inAppMessages.internal.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                k.showAlertDialogMessage$lambda$11(k.this, aVar, list, dialogInterface, i7);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlertDialogMessage$lambda$11(k this$0, a inAppMessage, List prompts, DialogInterface dialogInterface, int i7) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(inAppMessage, "$inAppMessage");
        kotlin.jvm.internal.i.e(prompts, "$prompts");
        com.onesignal.common.threading.b.suspendifyOnIO(this$0.new C(inAppMessage, prompts, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b8 -> B:16:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMultiplePrompts(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, InterfaceC0564d interfaceC0564d) {
        D d7;
        k kVar;
        int i7;
        Iterator<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> it;
        D d8;
        k kVar2;
        a aVar2;
        List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list2;
        a aVar3;
        k kVar3;
        if (interfaceC0564d instanceof D) {
            d7 = (D) interfaceC0564d;
            int i8 = d7.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                d7.label = i8 - Integer.MIN_VALUE;
                kVar = this;
                Object obj = d7.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = d7.label;
                k5.v vVar = k5.v.f5219a;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    it = list.iterator();
                    d8 = d7;
                    kVar2 = kVar;
                    aVar2 = aVar;
                    list2 = list;
                    while (it.hasNext()) {
                    }
                    aVar3 = aVar2;
                    kVar3 = kVar2;
                    if (kVar3._state.getCurrentPrompt() == null) {
                    }
                    return vVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                    return vVar;
                }
                Iterator<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> it2 = (Iterator) d7.L$3;
                List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list3 = (List) d7.L$2;
                a aVar4 = (a) d7.L$1;
                kVar2 = (k) d7.L$0;
                AbstractC0676f.w(obj);
                d8 = d7;
                list2 = list3;
                it = it2;
                b.a aVar5 = (b.a) obj;
                kVar2._state.setCurrentPrompt(null);
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + aVar5, null, 2, null);
                if (!aVar4.isPreview() && aVar5 == b.a.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                    kVar2.showAlertDialogMessage(aVar4, list2);
                    aVar3 = aVar4;
                    kVar3 = kVar2;
                    if (kVar3._state.getCurrentPrompt() == null) {
                    }
                    return vVar;
                }
                aVar2 = aVar4;
                while (it.hasNext()) {
                    com.onesignal.inAppMessages.internal.prompt.impl.b next = it.next();
                    if (!next.hasPrompted()) {
                        kVar2._state.setCurrentPrompt(next);
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle: " + kVar2._state.getCurrentPrompt(), null, 2, null);
                        com.onesignal.inAppMessages.internal.prompt.impl.b currentPrompt = kVar2._state.getCurrentPrompt();
                        kotlin.jvm.internal.i.b(currentPrompt);
                        currentPrompt.setPrompted(true);
                        com.onesignal.inAppMessages.internal.prompt.impl.b currentPrompt2 = kVar2._state.getCurrentPrompt();
                        kotlin.jvm.internal.i.b(currentPrompt2);
                        d8.L$0 = kVar2;
                        d8.L$1 = aVar2;
                        d8.L$2 = list2;
                        d8.L$3 = it;
                        d8.label = 1;
                        Object handlePrompt = currentPrompt2.handlePrompt(d8);
                        if (handlePrompt != enumC0580a) {
                            aVar4 = aVar2;
                            obj = handlePrompt;
                            b.a aVar52 = (b.a) obj;
                            kVar2._state.setCurrentPrompt(null);
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + aVar52, null, 2, null);
                            if (!aVar4.isPreview()) {
                            }
                            aVar2 = aVar4;
                            while (it.hasNext()) {
                            }
                        }
                        return enumC0580a;
                    }
                }
                aVar3 = aVar2;
                kVar3 = kVar2;
                if (kVar3._state.getCurrentPrompt() == null) {
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: No IAM prompt to handle, dismiss message: " + aVar3.getMessageId(), null, 2, null);
                    d8.L$0 = null;
                    d8.L$1 = null;
                    d8.L$2 = null;
                    d8.L$3 = null;
                    d8.label = 2;
                    if (messageWasDismissed$default(kVar3, aVar3, false, d8, 2, null) == enumC0580a) {
                        return enumC0580a;
                    }
                }
                return vVar;
            }
        }
        kVar = this;
        d7 = kVar.new D(interfaceC0564d);
        Object obj2 = d7.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = d7.label;
        k5.v vVar2 = k5.v.f5219a;
        if (i7 != 0) {
        }
    }

    @Override // l2.j
    /* renamed from: addClickListener */
    public void mo9addClickListener(l2.c listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.subscribe(listener);
    }

    @Override // l2.j
    /* renamed from: addLifecycleListener */
    public void mo10addLifecycleListener(l2.g listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.subscribe(listener);
    }

    @Override // l2.j
    /* renamed from: addTrigger */
    public void mo11addTrigger(String key, String value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTrigger(key: " + key + ", value: " + value + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Tracking trigger added early on cold start: ".concat(key), null, 2, null);
                this.earlySessionTriggers.add(key);
            }
        }
        w2.c cVar = (w2.c) this._triggerModelStore.get(key);
        if (cVar != null) {
            cVar.setValue(value);
            return;
        }
        w2.c cVar2 = new w2.c();
        cVar2.setId(key);
        cVar2.setKey(key);
        cVar2.setValue(value);
        com.onesignal.common.modeling.b.add$default(this._triggerModelStore, cVar2, null, 2, null);
    }

    @Override // l2.j
    /* renamed from: addTriggers */
    public void mo12addTriggers(Map<String, String> triggers) {
        kotlin.jvm.internal.i.e(triggers, "triggers");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTriggers(triggers: " + triggers + ')', null, 2, null);
        for (Map.Entry<String, String> entry : triggers.entrySet()) {
            mo11addTrigger(entry.getKey(), entry.getValue());
        }
    }

    @Override // l2.j
    /* renamed from: clearTriggers */
    public void mo13clearTriggers() {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                this.earlySessionTriggers.clear();
            }
        }
        com.onesignal.common.modeling.b.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // l2.j
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // T1.e
    public void onFocus(boolean z5) {
    }

    @Override // com.onesignal.user.internal.jwt.a
    public void onJwtUpdated(String externalId) {
        kotlin.jvm.internal.i.e(externalId, "externalId");
        String str = this.pendingJwtRetryExternalId;
        M1.b bVar = this.pendingJwtRetryRywData;
        if (str == null || !str.equals(externalId) || bVar == null) {
            return;
        }
        this.pendingJwtRetryExternalId = null;
        this.pendingJwtRetryRywData = null;
        com.onesignal.debug.internal.logging.b.info$default(W4.o.e("InAppMessagesManager: JWT refreshed for ", externalId, ", retrying IAM fetch"), null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnIO(new n(bVar, null));
    }

    @Override // q2.InterfaceC0597a
    public void onMessageActionOccurredOnMessage(a message, c action) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(action, "action");
        com.onesignal.common.threading.b.suspendifyOnIO(new o(action, message, this, null));
    }

    @Override // q2.InterfaceC0597a
    public void onMessageActionOccurredOnPreview(a message, c action) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(action, "action");
        com.onesignal.common.threading.b.suspendifyOnIO(new p(action, message, this, null));
    }

    @Override // q2.InterfaceC0597a
    public void onMessagePageChanged(a message, com.onesignal.inAppMessages.internal.g page) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(page, "page");
        if (message.isPreview()) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnIO(new q(message, page, null));
    }

    @Override // q2.InterfaceC0597a
    public void onMessageWasDismissed(a message) {
        kotlin.jvm.internal.i.e(message, "message");
        com.onesignal.common.threading.b.suspendifyOnIO(new r(message, null));
    }

    @Override // q2.InterfaceC0597a
    public void onMessageWasDisplayed(a message) {
        kotlin.jvm.internal.i.e(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new s(message));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (message.isPreview() || this.impressionedMessages.contains(message.getMessageId())) {
            return;
        }
        this.impressionedMessages.add(message.getMessageId());
        String variantIdForMessage = C0542a.INSTANCE.variantIdForMessage(message, this._languageContext);
        if (variantIdForMessage == null) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnIO(new t(variantIdForMessage, message, null));
    }

    @Override // q2.InterfaceC0597a
    public void onMessageWillDismiss(a message) {
        kotlin.jvm.internal.i.e(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new u(message));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // q2.InterfaceC0597a
    public void onMessageWillDisplay(a message) {
        kotlin.jvm.internal.i.e(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new v(message));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        kotlin.jvm.internal.i.e(args, "args");
        kotlin.jvm.internal.i.e(tag, "tag");
        if (kotlin.jvm.internal.i.a(args.getProperty(), "appId")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // l3.InterfaceC0493a
    public void onSessionActive() {
    }

    @Override // l3.InterfaceC0493a
    public void onSessionEnded(long j4) {
    }

    @Override // l3.InterfaceC0493a
    public void onSessionStarted() {
        Iterator<a> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    @Override // w3.InterfaceC0719a
    public void onSubscriptionAdded(y3.e subscription) {
        kotlin.jvm.internal.i.e(subscription, "subscription");
    }

    @Override // w3.InterfaceC0719a
    public void onSubscriptionChanged(y3.e subscription, com.onesignal.common.modeling.j args) {
        kotlin.jvm.internal.i.e(subscription, "subscription");
        kotlin.jvm.internal.i.e(args, "args");
        if ((subscription instanceof y3.b) && kotlin.jvm.internal.i.a(args.getPath(), "id")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // w3.InterfaceC0719a
    public void onSubscriptionRemoved(y3.e subscription) {
        kotlin.jvm.internal.i.e(subscription, "subscription");
    }

    @Override // w2.InterfaceC0718b
    public void onTriggerChanged(String newTriggerKey) {
        kotlin.jvm.internal.i.e(newTriggerKey, "newTriggerKey");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + newTriggerKey + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(AbstractC0676f.n(newTriggerKey), true);
        com.onesignal.common.threading.b.suspendifyOnDefault(new w(null));
    }

    @Override // w2.InterfaceC0718b
    public void onTriggerCompleted(String triggerId) {
        kotlin.jvm.internal.i.e(triggerId, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: ".concat(triggerId), null, 2, null);
        new HashSet().add(triggerId);
    }

    @Override // w2.InterfaceC0718b
    public void onTriggerConditionChanged(String triggerId) {
        kotlin.jvm.internal.i.e(triggerId, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(AbstractC0676f.n(triggerId), false);
        com.onesignal.common.threading.b.suspendifyOnDefault(new x(null));
    }

    @Override // T1.e
    public void onUnfocused() {
    }

    @Override // l2.j
    /* renamed from: removeClickListener */
    public void mo14removeClickListener(l2.c listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(listener);
    }

    @Override // l2.j
    /* renamed from: removeLifecycleListener */
    public void mo15removeLifecycleListener(l2.g listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(listener);
    }

    @Override // l2.j
    /* renamed from: removeTrigger */
    public void mo16removeTrigger(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTrigger(key: " + key + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                this.earlySessionTriggers.remove(key);
            }
        }
        com.onesignal.common.modeling.b.remove$default(this._triggerModelStore, key, null, 2, null);
    }

    @Override // l2.j
    /* renamed from: removeTriggers */
    public void mo17removeTriggers(Collection<String> keys) {
        kotlin.jvm.internal.i.e(keys, "keys");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTriggers(keys: " + keys + ')', null, 2, null);
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            mo16removeTrigger((String) it.next());
        }
    }

    @Override // l2.j
    public void setPaused(boolean z5) {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setPaused(value: " + z5 + ')', null, 2, null);
        boolean paused = this._state.getPaused();
        this._state.setPaused(z5);
        if (z5 && this._state.getInAppMessageIdShowing() != null) {
            com.onesignal.common.threading.b.suspendifyOnMain(new y(null));
        }
        if (!paused || z5) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnDefault(new z(null));
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        Set<String> dismissedMessagesId = this._prefs.getDismissedMessagesId();
        if (dismissedMessagesId != null) {
            this.dismissedMessages.addAll(dismissedMessagesId);
        }
        Long lastTimeInAppDismissed = this._prefs.getLastTimeInAppDismissed();
        if (lastTimeInAppDismissed != null) {
            this._state.setLastTimeInAppDismissed(lastTimeInAppDismissed);
        }
        this._subscriptionManager.subscribe(this);
        this._configModelStore.subscribe((com.onesignal.common.modeling.g) this);
        this._lifecycle.subscribe(this);
        this._triggerController.subscribe(this);
        this._sessionService.subscribe(this);
        this._applicationService.addApplicationLifecycleHandler(this);
        this._identityModelStore.subscribe((com.onesignal.common.modeling.g) this.identityModelChangeHandler);
        this._jwtTokenStore.addInternalUpdateListener(this);
        com.onesignal.common.threading.b.suspendifyOnIO(new E(null));
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        kotlin.jvm.internal.i.e(model, "model");
        kotlin.jvm.internal.i.e(tag, "tag");
        fetchMessagesWhenConditionIsMet();
    }
}
