package com.onesignal.inAppMessages.internal;

import a4.InterfaceC0178b;
import a4.InterfaceC0181e;
import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.common.AndroidUtils;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import f6.InterfaceC0406a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import n6.C0781n;
import n6.InterfaceC0780m;
import o2.C0799a;
import o2.C0800b;
import org.json.JSONArray;
import org.json.JSONObject;
import r2.C0846a;
import v6.InterfaceC0979a;

/* loaded from: classes.dex */
public final class k implements N2.j, com.onesignal.core.internal.startup.b, Y3.a, com.onesignal.common.modeling.g, S2.a, Y2.b, N3.a, v2.e, com.onesignal.user.internal.jwt.a {
    private final v2.f _applicationService;
    private final O2.b _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final q2.c _consistencyManager;
    private final Q2.a _displayer;
    private final T3.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final J3.a _influenceManager;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final D2.a _languageContext;
    private final S2.b _lifecycle;
    private final L3.b _outcomeEventsController;
    private final T2.a _prefs;
    private final W2.a _repository;
    private final N3.b _sessionService;
    private final X2.a _state;
    private final Y3.b _subscriptionManager;
    private final I2.a _time;
    private final Y2.a _triggerController;
    private final Y2.d _triggerModelStore;
    private final O3.a _userManager;
    private final Set<String> clickedClickIds;
    private final Set<String> dismissedMessages;
    private final Set<String> earlySessionTriggers;
    private final InterfaceC0979a fetchIAMMutex;
    private boolean hasCompletedFirstFetch;
    private final C0036k identityModelChangeHandler;
    private final Set<String> impressionedMessages;
    private volatile Long lastTimeFetchedIAMs;
    private final com.onesignal.common.events.b lifecycleCallback;
    private final com.onesignal.common.events.b messageClickCallback;
    private final List<a> messageDisplayQueue;
    private final InterfaceC0979a messageDisplayQueueMutex;
    private List<a> messages;
    private volatile String pendingJwtRetryExternalId;
    private volatile C0800b pendingJwtRetryRywData;
    private final List<a> redisplayedInAppMessages;
    private final Set<String> viewedPageIds;

    public static final class A extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public A(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.persistInAppMessage(null, this);
        }
    }

    public static final class B extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public B(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.queueMessageForDisplay(null, this);
        }
    }

    public static final class C extends X5.j implements Function1 {
        final /* synthetic */ a $inAppMessage;
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.prompt.impl.b> $prompts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, V5.b bVar) {
            super(1, bVar);
            this.$inAppMessage = aVar;
            this.$prompts = list;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new C(this.$inAppMessage, this.$prompts, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((C) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                k kVar = k.this;
                a aVar2 = this.$inAppMessage;
                List<com.onesignal.inAppMessages.internal.prompt.impl.b> list = this.$prompts;
                this.label = 1;
                if (kVar.showMultiplePrompts(aVar2, list, this) == aVar) {
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

    public static final class D extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public D(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.showMultiplePrompts(null, null, this);
        }
    }

    public static final class E extends X5.j implements Function1 {
        Object L$0;
        int label;

        public E(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new E(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((E) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
        
            if (r5.cleanCachedInAppMessages(r4) == r0) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0060 A[LOOP:0: B:7:0x005a->B:9:0x0060, LOOP_END] */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Iterator it;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                W2.a aVar2 = k.this._repository;
                this.label = 1;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$0;
                    V6.b.P(obj);
                    list.addAll((Collection) obj);
                    it = k.this.redisplayedInAppMessages.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).setDisplayedInSession(false);
                    }
                    return Unit.f6114a;
                }
                V6.b.P(obj);
            }
            List list2 = k.this.redisplayedInAppMessages;
            W2.a aVar3 = k.this._repository;
            this.L$0 = list2;
            this.label = 2;
            Object listInAppMessages = aVar3.listInAppMessages(this);
            if (listInAppMessages != aVar) {
                list = list2;
                obj = listInAppMessages;
                list.addAll((Collection) obj);
                it = k.this.redisplayedInAppMessages.iterator();
                while (it.hasNext()) {
                }
                return Unit.f6114a;
            }
            return aVar;
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$a, reason: case insensitive filesystem */
    public static final class C0325a extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0325a(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.attemptToShowInAppMessage(this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$b, reason: case insensitive filesystem */
    public static final class C0326b extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0326b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.evaluateInAppMessages(this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$c, reason: case insensitive filesystem */
    public static final class C0327c extends X5.c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C0327c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fetchIvOrSaveRetry(null, null, null, null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$d, reason: case insensitive filesystem */
    public static final class C0328d extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C0328d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fetchMessages(null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$e, reason: case insensitive filesystem */
    public static final class C0329e extends kotlin.jvm.internal.p implements Function0 {
        public C0329e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(k.this._time.getCurrentTimeMillis() - k.this._sessionService.getStartTime());
        }
    }

    public static final class f extends X5.j implements Function1 {
        int label;

        public f(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new f(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f6114a);
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
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                String onesignalId = k.this._userManager.getOnesignalId();
                q2.c cVar = k.this._consistencyManager;
                C0799a c0799a = new C0799a(onesignalId);
                this.label = 1;
                obj = cVar.getRywDataFromAwaitableCondition(c0799a, this);
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        return Unit.f6114a;
                    }
                    V6.b.P(obj);
                    C0800b c0800b = (C0800b) obj;
                    if (c0800b != null) {
                        k kVar = k.this;
                        this.label = 3;
                    }
                    return Unit.f6114a;
                }
                V6.b.P(obj);
            }
            this.label = 2;
            obj = ((C0781n) ((InterfaceC0780m) obj)).W(this);
        }
    }

    public static final class g extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public g(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireOutcomesForClick(null, null, this);
        }
    }

    public static final class h extends X5.j implements Function2 {
        final /* synthetic */ b $result;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, V5.b bVar2) {
            super(2, bVar2);
            this.$result = bVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            h hVar = new h(this.$result, bVar);
            hVar.L$0 = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N2.c cVar, V5.b bVar) {
            return ((h) create(cVar, bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            ((M2.c) ((N2.c) this.L$0)).onClick(this.$result);
            return Unit.f6114a;
        }
    }

    public static final class i extends X5.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public i(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForClick(null, null, this);
        }
    }

    public static final class j extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public j(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForPageChange(null, null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$k, reason: collision with other inner class name */
    public static final class C0036k implements com.onesignal.common.modeling.g {

        /* renamed from: com.onesignal.inAppMessages.internal.k$k$a */
        public static final class a extends X5.j implements Function1 {
            final /* synthetic */ String $newOneSignalId;
            int label;
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, String str, V5.b bVar) {
                super(1, bVar);
                this.this$0 = kVar;
                this.$newOneSignalId = str;
            }

            @Override // X5.a
            public final V5.b create(V5.b bVar) {
                return new a(this.this$0, this.$newOneSignalId, bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(V5.b bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
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
            @Override // X5.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                W5.a aVar = W5.a.f2787d;
                int i2 = this.label;
                if (i2 == 0) {
                    V6.b.P(obj);
                    q2.c cVar = this.this$0._consistencyManager;
                    C0799a c0799a = new C0799a(this.$newOneSignalId);
                    this.label = 1;
                    obj = cVar.getRywDataFromAwaitableCondition(c0799a, this);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj);
                            return Unit.f6114a;
                        }
                        V6.b.P(obj);
                        C0800b c0800b = (C0800b) obj;
                        if (c0800b != null) {
                            k kVar = this.this$0;
                            this.label = 3;
                        }
                        return Unit.f6114a;
                    }
                    V6.b.P(obj);
                }
                this.label = 2;
                obj = ((C0781n) ((InterfaceC0780m) obj)).W(this);
            }
        }

        public C0036k() {
        }

        @Override // com.onesignal.common.modeling.g
        public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(tag, "tag");
            if (Intrinsics.a(args.getProperty(), "onesignal_id")) {
                Object oldValue = args.getOldValue();
                Intrinsics.c(oldValue, "null cannot be cast to non-null type kotlin.String");
                Object newValue = args.getNewValue();
                Intrinsics.c(newValue, "null cannot be cast to non-null type kotlin.String");
                String str = (String) newValue;
                com.onesignal.common.d dVar = com.onesignal.common.d.INSTANCE;
                if (!dVar.isLocalId((String) oldValue) || dVar.isLocalId(str)) {
                    return;
                }
                com.onesignal.common.threading.b.suspendifyOnIO(new a(k.this, str, null));
            }
        }

        @Override // com.onesignal.common.modeling.g
        public void onModelReplaced(T3.a model, String tag) {
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(tag, "tag");
            k.this.pendingJwtRetryExternalId = null;
            k.this.pendingJwtRetryRywData = null;
        }
    }

    public static final class l extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public l(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.messageWasDismissed(null, false, this);
        }
    }

    public static final class m extends kotlin.jvm.internal.p implements Function1 {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((N2.g) obj);
            return Unit.f6114a;
        }

        public final void invoke(N2.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ((M2.c) it).onDidDismiss(new e(this.$message));
        }
    }

    public static final class n extends X5.j implements Function1 {
        final /* synthetic */ C0800b $pendingRyw;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C0800b c0800b, V5.b bVar) {
            super(1, bVar);
            this.$pendingRyw = c0800b;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new n(this.$pendingRyw, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((n) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                k kVar = k.this;
                C0800b c0800b = this.$pendingRyw;
                this.label = 1;
                if (kVar.fetchMessages(c0800b, this) == aVar) {
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

    public static final class o extends X5.j implements Function1 {
        final /* synthetic */ c $action;
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(c cVar, a aVar, k kVar, V5.b bVar) {
            super(1, bVar);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new o(this.$action, this.$message, this.this$0, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f6114a);
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
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                a aVar2 = this.$message;
                c cVar = this.$action;
                this.label = 1;
            } else if (i2 == 1) {
                V6.b.P(obj);
            } else if (i2 == 2) {
                V6.b.P(obj);
                this.this$0.fireClickAction(this.$action);
                k kVar2 = this.this$0;
                a aVar3 = this.$message;
                c cVar2 = this.$action;
                this.label = 3;
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                V6.b.P(obj);
                this.this$0.fireTagCallForClick(this.$action);
                k kVar3 = this.this$0;
                String messageId = this.$message.getMessageId();
                List<com.onesignal.inAppMessages.internal.f> outcomes = this.$action.getOutcomes();
                this.label = 4;
            }
            k kVar4 = this.this$0;
            a aVar4 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }
    }

    public static final class p extends X5.j implements Function1 {
        final /* synthetic */ c $action;
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(c cVar, a aVar, k kVar, V5.b bVar) {
            super(1, bVar);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new p(this.$action, this.$message, this.this$0, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((p) create(bVar)).invokeSuspend(Unit.f6114a);
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
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                a aVar2 = this.$message;
                c cVar = this.$action;
                this.label = 1;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    this.this$0.fireClickAction(this.$action);
                    this.this$0.logInAppMessagePreviewActions(this.$action);
                    return Unit.f6114a;
                }
                V6.b.P(obj);
            }
            k kVar2 = this.this$0;
            a aVar3 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }
    }

    public static final class q extends X5.j implements Function1 {
        final /* synthetic */ a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(a aVar, com.onesignal.inAppMessages.internal.g gVar, V5.b bVar) {
            super(1, bVar);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new q(this.$message, this.$page, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((q) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                k kVar = k.this;
                a aVar2 = this.$message;
                com.onesignal.inAppMessages.internal.g gVar = this.$page;
                this.label = 1;
                if (kVar.fireRESTCallForPageChange(aVar2, gVar, this) == aVar) {
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

    public static final class r extends X5.j implements Function1 {
        final /* synthetic */ a $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(a aVar, V5.b bVar) {
            super(1, bVar);
            this.$message = aVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new r(this.$message, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((r) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                k kVar = k.this;
                a aVar2 = this.$message;
                this.label = 1;
                if (k.messageWasDismissed$default(kVar, aVar2, false, this, 2, null) == aVar) {
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

    public static final class s extends kotlin.jvm.internal.p implements Function1 {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((N2.g) obj);
            return Unit.f6114a;
        }

        public final void invoke(N2.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ((M2.c) it).onDidDisplay(new e(this.$message));
        }
    }

    public static final class t extends X5.j implements Function1 {
        final /* synthetic */ a $message;
        final /* synthetic */ String $variantId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, a aVar, V5.b bVar) {
            super(1, bVar);
            this.$variantId = str;
            this.$message = aVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new t(this.$variantId, this.$message, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((t) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    V6.b.P(obj);
                    O2.b bVar = k.this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) k.this._configModelStore.getModel()).getAppId();
                    String id = k.this._subscriptionManager.getSubscriptions().getPush().getId();
                    String str = this.$variantId;
                    String messageId = this.$message.getMessageId();
                    this.label = 1;
                    tVar = this;
                    try {
                        if (bVar.sendIAMImpression(appId, id, str, messageId, tVar) == aVar) {
                            return aVar;
                        }
                    } catch (C0846a unused) {
                        k.this.impressionedMessages.remove(tVar.$message.getMessageId());
                        return Unit.f6114a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    tVar = this;
                }
                k.this._prefs.setImpressionesMessagesId(k.this.impressionedMessages);
            } catch (C0846a unused2) {
                tVar = this;
            }
            return Unit.f6114a;
        }
    }

    public static final class u extends kotlin.jvm.internal.p implements Function1 {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((N2.g) obj);
            return Unit.f6114a;
        }

        public final void invoke(N2.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ((M2.c) it).onWillDismiss(new e(this.$message));
        }
    }

    public static final class v extends kotlin.jvm.internal.p implements Function1 {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((N2.g) obj);
            return Unit.f6114a;
        }

        public final void invoke(N2.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ((M2.c) it).onWillDisplay(new e(this.$message));
        }
    }

    public static final class w extends X5.j implements Function1 {
        int label;

        public w(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new w(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((w) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
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

    public static final class x extends X5.j implements Function1 {
        int label;

        public x(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new x(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((x) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
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

    public static final class y extends X5.j implements Function1 {
        int label;

        public y(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new y(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((y) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            k.this._displayer.dismissCurrentInAppMessage();
            return Unit.f6114a;
        }
    }

    public static final class z extends X5.j implements Function1 {
        int label;

        public z(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return k.this.new z(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((z) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
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

    public k(v2.f _applicationService, N3.b _sessionService, J3.a _influenceManager, com.onesignal.core.internal.config.c _configModelStore, O3.a _userManager, T3.b _identityModelStore, Y3.b _subscriptionManager, L3.b _outcomeEventsController, X2.a _state, T2.a _prefs, W2.a _repository, O2.b _backend, Y2.a _triggerController, Y2.d _triggerModelStore, Q2.a _displayer, S2.b _lifecycle, D2.a _languageContext, I2.a _time, q2.c _consistencyManager, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_userManager, "_userManager");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_outcomeEventsController, "_outcomeEventsController");
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_repository, "_repository");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_triggerController, "_triggerController");
        Intrinsics.checkNotNullParameter(_triggerModelStore, "_triggerModelStore");
        Intrinsics.checkNotNullParameter(_displayer, "_displayer");
        Intrinsics.checkNotNullParameter(_lifecycle, "_lifecycle");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_consistencyManager, "_consistencyManager");
        Intrinsics.checkNotNullParameter(_jwtTokenStore, "_jwtTokenStore");
        Intrinsics.checkNotNullParameter(_identityVerificationService, "_identityVerificationService");
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
        this.messageDisplayQueueMutex = new v6.c();
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = new v6.c();
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.checkNotNullExpressionValue(synchronizedSet, "synchronizedSet(...)");
        this.earlySessionTriggers = synchronizedSet;
        this.identityModelChangeHandler = new C0036k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013a, code lost:
    
        if (r3.queueMessageForDisplay((com.onesignal.inAppMessages.internal.a) r14, r1) == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0168, code lost:
    
        if (r3.messageWasDismissed((com.onesignal.inAppMessages.internal.a) r14, true, r1) == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a3, code lost:
    
        if (r10.c(r1) == r2) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r3v8, types: [v6.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptToShowInAppMessage(V5.b bVar) {
        C0325a c0325a;
        Object obj;
        int i2;
        k kVar;
        kotlin.jvm.internal.D d7;
        v6.c cVar;
        kotlin.jvm.internal.D d8;
        Boolean bool;
        if (bVar instanceof C0325a) {
            c0325a = (C0325a) bVar;
            int i5 = c0325a.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0325a.label = i5 - Integer.MIN_VALUE;
                obj = c0325a.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0325a.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    v2.f fVar = this._applicationService;
                    c0325a.L$0 = this;
                    c0325a.label = 1;
                    obj = fVar.waitUntilSystemConditionsAvailable(c0325a);
                    if (obj != aVar) {
                        kVar = this;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                V6.b.P(obj);
                                return Unit.f6114a;
                            }
                            if (i2 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj);
                            return Unit.f6114a;
                        }
                        d8 = (kotlin.jvm.internal.D) c0325a.L$1;
                        kVar = (k) c0325a.L$0;
                        V6.b.P(obj);
                        bool = (Boolean) obj;
                        if (bool == null) {
                            if (bool.equals(Boolean.FALSE)) {
                                kVar._state.setInAppMessageIdShowing(null);
                                List<a> list = kVar.messages;
                                Object obj2 = d8.f6152d;
                                I.a(list);
                                list.remove(obj2);
                                Object obj3 = d8.f6152d;
                                Intrinsics.b(obj3);
                                c0325a.L$0 = null;
                                c0325a.L$1 = null;
                                c0325a.label = 5;
                            }
                            return Unit.f6114a;
                        }
                        kVar._state.setInAppMessageIdShowing(null);
                        Object obj4 = d8.f6152d;
                        Intrinsics.b(obj4);
                        c0325a.L$0 = null;
                        c0325a.L$1 = null;
                        c0325a.label = 4;
                        return aVar;
                    }
                    ?? r32 = (InterfaceC0979a) c0325a.L$2;
                    kotlin.jvm.internal.D d9 = (kotlin.jvm.internal.D) c0325a.L$1;
                    k kVar2 = (k) c0325a.L$0;
                    V6.b.P(obj);
                    d7 = d9;
                    cVar = r32;
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
                            d7.f6152d = remove;
                            X2.a aVar2 = kVar._state;
                            Intrinsics.b(remove);
                            aVar2.setInAppMessageIdShowing(remove.getMessageId());
                        }
                        Unit unit = Unit.f6114a;
                        cVar.e(null);
                        Object obj5 = d7.f6152d;
                        if (obj5 != null) {
                            c0325a.L$0 = kVar;
                            c0325a.L$1 = d7;
                            c0325a.L$2 = null;
                            c0325a.label = 3;
                            Object displayMessage = kVar._displayer.displayMessage((a) obj5, c0325a);
                            if (displayMessage != aVar) {
                                d8 = d7;
                                obj = displayMessage;
                                bool = (Boolean) obj;
                                if (bool == null) {
                                }
                            }
                            return aVar;
                        }
                        return Unit.f6114a;
                    } catch (Throwable th) {
                        cVar.e(null);
                        throw th;
                    }
                }
                kVar = (k) c0325a.L$0;
                V6.b.P(obj);
                if (((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct", null, 2, null);
                    return Unit.f6114a;
                }
                d7 = new kotlin.jvm.internal.D();
                InterfaceC0979a interfaceC0979a = kVar.messageDisplayQueueMutex;
                c0325a.L$0 = kVar;
                c0325a.L$1 = d7;
                c0325a.L$2 = interfaceC0979a;
                c0325a.label = 2;
                cVar = (v6.c) interfaceC0979a;
            }
        }
        c0325a = new C0325a(bVar);
        obj = c0325a.result;
        W5.a aVar3 = W5.a.f2787d;
        i2 = c0325a.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, V5.b bVar) {
        if (list.isEmpty()) {
            return Unit.f6114a;
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + aVar, null, 2, null);
        this._displayer.dismissCurrentInAppMessage();
        Object showMultiplePrompts = showMultiplePrompts(aVar, list, bVar);
        return showMultiplePrompts == W5.a.f2787d ? showMultiplePrompts : Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evaluateInAppMessages(V5.b bVar) {
        C0326b c0326b;
        int i2;
        k kVar;
        Iterator it;
        if (bVar instanceof C0326b) {
            c0326b = (C0326b) bVar;
            int i5 = c0326b.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0326b.label = i5 - Integer.MIN_VALUE;
                Object obj = c0326b.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0326b.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.evaluateInAppMessages()", null, 2, null);
                    ArrayList arrayList = new ArrayList();
                    synchronized (this.messages) {
                        try {
                            for (a aVar2 : this.messages) {
                                if (this._triggerController.evaluateMessageTriggers(aVar2)) {
                                    setDataForRedisplay(aVar2);
                                    if (!this.dismissedMessages.contains(aVar2.getMessageId()) && !aVar2.isFinished()) {
                                        arrayList.add(aVar2);
                                    }
                                }
                            }
                            Unit unit = Unit.f6114a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    kVar = this;
                    it = arrayList.iterator();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) c0326b.L$1;
                    kVar = (k) c0326b.L$0;
                    V6.b.P(obj);
                }
                while (it.hasNext()) {
                    a aVar3 = (a) it.next();
                    c0326b.L$0 = kVar;
                    c0326b.L$1 = it;
                    c0326b.label = 1;
                    if (kVar.queueMessageForDisplay(aVar3, c0326b) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f6114a;
            }
        }
        c0326b = new C0326b(bVar);
        Object obj2 = c0326b.result;
        W5.a aVar4 = W5.a.f2787d;
        i2 = c0326b.label;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchIvOrSaveRetry(String str, String str2, C0800b c0800b, Function0<Long> function0, V5.b bVar) {
        C0327c c0327c;
        int i2;
        C0800b c0800b2;
        k kVar;
        boolean z7;
        String str3;
        if (bVar instanceof C0327c) {
            c0327c = (C0327c) bVar;
            int i5 = c0327c.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0327c.label = i5 - Integer.MIN_VALUE;
                C0327c c0327c2 = c0327c;
                Object obj = c0327c2.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0327c2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    boolean ivBehaviorActive = this._identityVerificationService.getIvBehaviorActive();
                    String externalId = ((T3.a) this._identityModelStore.getModel()).getExternalId();
                    R5.r rVar = (!ivBehaviorActive || externalId == null) ? new R5.r("onesignal_id", ((T3.a) this._identityModelStore.getModel()).getOnesignalId(), null) : new R5.r("external_id", externalId, this._jwtTokenStore.getJwt(externalId));
                    String str4 = rVar.f2429d;
                    String str5 = (String) rVar.f2430e;
                    String str6 = (String) rVar.f2431i;
                    if (!ivBehaviorActive || externalId == null) {
                        c0800b2 = c0800b;
                    } else {
                        this.pendingJwtRetryExternalId = externalId;
                        c0800b2 = c0800b;
                        this.pendingJwtRetryRywData = c0800b2;
                    }
                    try {
                        O2.b bVar2 = this._backend;
                        c0327c2.L$0 = this;
                        c0327c2.L$1 = externalId;
                        c0327c2.Z$0 = ivBehaviorActive;
                        c0327c2.label = 1;
                        obj = bVar2.listInAppMessagesIv(str, str4, str5, str2, c0800b2, function0, str6, c0327c2);
                        if (obj == aVar) {
                            return aVar;
                        }
                        kVar = this;
                        z7 = ivBehaviorActive;
                        str3 = externalId;
                    } catch (C0846a e7) {
                        e = e7;
                        kVar = this;
                        z7 = ivBehaviorActive;
                        str3 = externalId;
                        if (z7 || str3 == null) {
                            com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ": " + e.getResponse(), null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.info$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ", awaiting JWT refresh for " + str3, null, 2, null);
                            kVar.lastTimeFetchedIAMs = null;
                        }
                        return null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z7 = c0327c2.Z$0;
                    str3 = (String) c0327c2.L$1;
                    kVar = (k) c0327c2.L$0;
                    try {
                        V6.b.P(obj);
                    } catch (C0846a e8) {
                        e = e8;
                        if (z7) {
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
        c0327c = new C0327c(bVar);
        C0327c c0327c22 = c0327c;
        Object obj2 = c0327c22.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0327c22.label;
        if (i2 != 0) {
        }
        List list2 = (List) obj2;
        kVar.pendingJwtRetryExternalId = null;
        kVar.pendingJwtRetryRywData = null;
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d0, code lost:
    
        if (r4.evaluateInAppMessages(r9) == r3) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9 A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:63:0x00cf, B:65:0x00d9, B:67:0x00f4, B:70:0x00ff), top: B:62:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessages(C0800b c0800b, V5.b bVar) {
        C0328d c0328d;
        int i2;
        String id;
        InterfaceC0979a interfaceC0979a;
        String str;
        C0800b c0800b2;
        k kVar;
        k kVar2;
        List<a> list;
        try {
            if (bVar instanceof C0328d) {
                c0328d = (C0328d) bVar;
                int i5 = c0328d.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0328d.label = i5 - Integer.MIN_VALUE;
                    C0328d c0328d2 = c0328d;
                    Object obj = c0328d2.result;
                    W5.a aVar = W5.a.f2787d;
                    i2 = c0328d2.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        if (!this._applicationService.isInForeground()) {
                            return Unit.f6114a;
                        }
                        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                        id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        if (id.length() == 0 || com.onesignal.common.d.INSTANCE.isLocalId(id) || appId.length() == 0) {
                            return Unit.f6114a;
                        }
                        InterfaceC0979a interfaceC0979a2 = this.fetchIAMMutex;
                        c0328d2.L$0 = this;
                        c0328d2.L$1 = c0800b;
                        c0328d2.L$2 = appId;
                        c0328d2.L$3 = id;
                        c0328d2.L$4 = interfaceC0979a2;
                        c0328d2.label = 1;
                        v6.c cVar = (v6.c) interfaceC0979a2;
                        if (cVar.c(c0328d2) != aVar) {
                            interfaceC0979a = cVar;
                            str = appId;
                            c0800b2 = c0800b;
                            kVar = this;
                        }
                        return aVar;
                    }
                    if (i2 == 1) {
                        interfaceC0979a = (InterfaceC0979a) c0328d2.L$4;
                        id = (String) c0328d2.L$3;
                        String str2 = (String) c0328d2.L$2;
                        C0800b c0800b3 = (C0800b) c0328d2.L$1;
                        kVar = (k) c0328d2.L$0;
                        V6.b.P(obj);
                        str = str2;
                        c0800b2 = c0800b3;
                    } else if (i2 == 2) {
                        kVar2 = (k) c0328d2.L$0;
                        V6.b.P(obj);
                        list = (List) obj;
                        if (list != null) {
                        }
                    } else {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            V6.b.P(obj);
                            return Unit.f6114a;
                        }
                        kVar2 = (k) c0328d2.L$0;
                        V6.b.P(obj);
                        list = (List) obj;
                        if (list != null) {
                            return Unit.f6114a;
                        }
                        if ((list instanceof InterfaceC0406a) && !(list instanceof f6.c)) {
                            I.d(list, "kotlin.collections.MutableList");
                            throw null;
                        }
                        kVar2.messages = list;
                        synchronized (kVar2.earlySessionTriggers) {
                            try {
                                if (!kVar2.earlySessionTriggers.isEmpty()) {
                                    com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Processing triggers added early on cold start: " + kVar2.earlySessionTriggers, null, 2, null);
                                    for (a aVar2 : kVar2.messages) {
                                        boolean contains = kVar2.redisplayedInAppMessages.contains(aVar2);
                                        boolean isTriggerOnMessage = kVar2._triggerController.isTriggerOnMessage(aVar2, kVar2.earlySessionTriggers);
                                        if (contains && isTriggerOnMessage) {
                                            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Setting isTriggerChanged=true for message " + aVar2.getMessageId(), null, 2, null);
                                            aVar2.setTriggerChanged(true);
                                        }
                                    }
                                    kVar2.earlySessionTriggers.clear();
                                }
                                kVar2.hasCompletedFirstFetch = true;
                                Unit unit = Unit.f6114a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        c0328d2.L$0 = null;
                        c0328d2.label = 4;
                    }
                    long currentTimeMillis = kVar._time.getCurrentTimeMillis();
                    if (kVar.lastTimeFetchedIAMs != null) {
                        Long l7 = kVar.lastTimeFetchedIAMs;
                        Intrinsics.b(l7);
                        if (currentTimeMillis - l7.longValue() < ((com.onesignal.core.internal.config.b) kVar._configModelStore.getModel()).getFetchIAMMinInterval()) {
                            return Unit.f6114a;
                        }
                    }
                    kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis);
                    Unit unit2 = Unit.f6114a;
                    ((v6.c) interfaceC0979a).e(null);
                    C0329e c0329e = kVar.new C0329e();
                    if (kVar._identityVerificationService.getNewCodePathsRun()) {
                        O2.b bVar2 = kVar._backend;
                        c0328d2.L$0 = kVar;
                        c0328d2.L$1 = null;
                        c0328d2.L$2 = null;
                        c0328d2.L$3 = null;
                        c0328d2.L$4 = null;
                        c0328d2.label = 3;
                        obj = bVar2.listInAppMessages(str, id, c0800b2, c0329e, c0328d2);
                        if (obj != aVar) {
                            kVar2 = kVar;
                            list = (List) obj;
                            if (list != null) {
                            }
                        }
                    } else {
                        c0328d2.L$0 = kVar;
                        c0328d2.L$1 = null;
                        c0328d2.L$2 = null;
                        c0328d2.L$3 = null;
                        c0328d2.L$4 = null;
                        c0328d2.label = 2;
                        obj = kVar.fetchIvOrSaveRetry(str, id, c0800b2, c0329e, c0328d2);
                        if (obj != aVar) {
                            kVar2 = kVar;
                            list = (List) obj;
                            if (list != null) {
                            }
                        }
                    }
                    return aVar;
                }
            }
            long currentTimeMillis2 = kVar._time.getCurrentTimeMillis();
            if (kVar.lastTimeFetchedIAMs != null) {
            }
            kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis2);
            Unit unit22 = Unit.f6114a;
            ((v6.c) interfaceC0979a).e(null);
            C0329e c0329e2 = kVar.new C0329e();
            if (kVar._identityVerificationService.getNewCodePathsRun()) {
            }
            return aVar;
        } finally {
            ((v6.c) interfaceC0979a).e(null);
        }
        c0328d = new C0328d(bVar);
        C0328d c0328d22 = c0328d;
        Object obj2 = c0328d22.result;
        W5.a aVar3 = W5.a.f2787d;
        i2 = c0328d22.label;
        if (i2 != 0) {
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
        if (cVar.getUrlTarget() == N2.k.BROWSER) {
            AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), cVar.getUrl());
        } else if (cVar.getUrlTarget() == N2.k.IN_APP_WEBVIEW) {
            P2.b.INSTANCE.open$com_onesignal_inAppMessages(cVar.getUrl(), true, this._applicationService.getAppContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireOutcomesForClick(String str, List<com.onesignal.inAppMessages.internal.f> list, V5.b bVar) {
        g gVar;
        int i2;
        Iterator<com.onesignal.inAppMessages.internal.f> it;
        k kVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i5 = gVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                gVar.label = i5 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = gVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    this._influenceManager.onDirectInfluenceFromIAM(str);
                    it = list.iterator();
                    kVar = this;
                } else {
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) gVar.L$1;
                    kVar = (k) gVar.L$0;
                    V6.b.P(obj);
                }
                while (it.hasNext()) {
                    com.onesignal.inAppMessages.internal.f next = it.next();
                    String name = next.getName();
                    if (next.isUnique()) {
                        L3.b bVar2 = kVar._outcomeEventsController;
                        gVar.L$0 = kVar;
                        gVar.L$1 = it;
                        gVar.label = 1;
                        if (bVar2.sendUniqueOutcomeEvent(name, gVar) == aVar) {
                            return aVar;
                        }
                    } else if (next.getWeight() > 0.0f) {
                        L3.b bVar3 = kVar._outcomeEventsController;
                        float weight = next.getWeight();
                        gVar.L$0 = kVar;
                        gVar.L$1 = it;
                        gVar.label = 2;
                        if (bVar3.sendOutcomeEventWithValue(name, weight, gVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        L3.b bVar4 = kVar._outcomeEventsController;
                        gVar.L$0 = kVar;
                        gVar.L$1 = it;
                        gVar.label = 3;
                        if (bVar4.sendOutcomeEvent(name, gVar) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Unit.f6114a;
            }
        }
        gVar = new g(bVar);
        Object obj2 = gVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = gVar.label;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(a aVar, c cVar, V5.b bVar) {
        if (!this.messageClickCallback.getHasSubscribers()) {
            return Unit.f6114a;
        }
        this._influenceManager.onDirectInfluenceFromIAM(aVar.getMessageId());
        Object suspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new h(new b(aVar, cVar), null), bVar);
        return suspendingFireOnMain == W5.a.f2787d ? suspendingFireOnMain : Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(4:10|11|12|13)(2:27|28))(2:29|(2:31|32)(2:33|(2:49|50)(4:(1:39)|40|41|(1:43)(1:44))))|14|15|16|17))|51|6|7|(0)(0)|14|15|16|17|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForClick(a aVar, c cVar, V5.b bVar) {
        i iVar;
        int i2;
        String clickId;
        k kVar;
        a aVar2;
        String str;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i5 = iVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iVar.label = i5 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = iVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    String variantIdForMessage = P2.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    if (variantIdForMessage == null) {
                        return Unit.f6114a;
                    }
                    clickId = cVar.getClickId();
                    if (!(aVar.getRedisplayStats().isRedisplayEnabled() && clickId != null && aVar.isClickAvailable(clickId)) && CollectionsKt.m(this.clickedClickIds, clickId)) {
                        return Unit.f6114a;
                    }
                    if (clickId != null) {
                        this.clickedClickIds.add(clickId);
                        aVar.addClickId(clickId);
                    }
                    try {
                        O2.b bVar2 = this._backend;
                        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        String messageId = aVar.getMessageId();
                        boolean isFirstClick = cVar.isFirstClick();
                        iVar2.L$0 = this;
                        iVar2.L$1 = aVar;
                        iVar2.L$2 = clickId;
                        iVar2.label = 1;
                        if (bVar2.sendIAMClick(appId, id, variantIdForMessage, messageId, clickId, isFirstClick, iVar2) == aVar3) {
                            return aVar3;
                        }
                        kVar = this;
                    } catch (C0846a unused) {
                        kVar = this;
                        aVar2 = aVar;
                        str = clickId;
                        Set<String> set = kVar.clickedClickIds;
                        I.a(set);
                        set.remove(str);
                        if (str != null) {
                        }
                        return Unit.f6114a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) iVar2.L$2;
                    aVar2 = (a) iVar2.L$1;
                    kVar = (k) iVar2.L$0;
                    try {
                        V6.b.P(obj);
                        clickId = str;
                        aVar = aVar2;
                    } catch (C0846a unused2) {
                        Set<String> set2 = kVar.clickedClickIds;
                        I.a(set2);
                        set2.remove(str);
                        if (str != null) {
                            aVar2.removeClickId(str);
                        }
                        return Unit.f6114a;
                    }
                }
                kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
                return Unit.f6114a;
            }
        }
        iVar = new i(bVar);
        i iVar22 = iVar;
        Object obj2 = iVar22.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = iVar22.label;
        if (i2 != 0) {
        }
        kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
        return Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForPageChange(a aVar, com.onesignal.inAppMessages.internal.g gVar, V5.b bVar) {
        j jVar;
        int i2;
        String str;
        k kVar;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i5 = jVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                jVar.label = i5 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = jVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    String variantIdForMessage = P2.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    if (variantIdForMessage == null) {
                        return Unit.f6114a;
                    }
                    String pageId = gVar.getPageId();
                    String str2 = aVar.getMessageId() + pageId;
                    if (this.viewedPageIds.contains(str2)) {
                        com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                        return Unit.f6114a;
                    }
                    this.viewedPageIds.add(str2);
                    try {
                        O2.b bVar2 = this._backend;
                        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        String messageId = aVar.getMessageId();
                        jVar2.L$0 = this;
                        jVar2.L$1 = str2;
                        jVar2.label = 1;
                        if (bVar2.sendIAMPageImpression(appId, id, variantIdForMessage, messageId, pageId, jVar2) == aVar2) {
                            return aVar2;
                        }
                        str = str2;
                        kVar = this;
                    } catch (C0846a unused) {
                        str = str2;
                        kVar = this;
                        kVar.viewedPageIds.remove(str);
                        return Unit.f6114a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) jVar2.L$1;
                    kVar = (k) jVar2.L$0;
                    try {
                        V6.b.P(obj);
                    } catch (C0846a unused2) {
                        kVar.viewedPageIds.remove(str);
                        return Unit.f6114a;
                    }
                }
                kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
                return Unit.f6114a;
            }
        }
        jVar = new j(bVar);
        j jVar22 = jVar;
        Object obj2 = jVar22.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = jVar22.label;
        if (i2 != 0) {
        }
        kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
        return Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.inAppMessages.internal.i tags = cVar.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                com.onesignal.common.f fVar = com.onesignal.common.f.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                Intrinsics.b(tagsToAdd);
                this._userManager.addTags(fVar.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                com.onesignal.common.f fVar2 = com.onesignal.common.f.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                Intrinsics.b(tagsToRemove);
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

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection, boolean z7) {
        synchronized (this.messages) {
            try {
                for (a aVar : this.messages) {
                    boolean contains = this.redisplayedInAppMessages.contains(aVar);
                    boolean isTriggerOnMessage = this._triggerController.isTriggerOnMessage(aVar, collection);
                    boolean messageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(aVar);
                    if (!aVar.isTriggerChanged() && contains && (isTriggerOnMessage || (z7 && messageHasOnlyDynamicTriggers))) {
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + aVar, null, 2, null);
                        aVar.setTriggerChanged(true);
                    }
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        if (r11.attemptToShowInAppMessage(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ef, code lost:
    
        if (r11.evaluateInAppMessages(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        if (persistInAppMessage(r10, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object messageWasDismissed(a aVar, boolean z7, V5.b bVar) {
        l lVar;
        int i2;
        k kVar;
        if (bVar instanceof l) {
            lVar = (l) bVar;
            int i5 = lVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lVar.label = i5 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = lVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    if (aVar.isPreview()) {
                        kVar = this;
                        kVar._influenceManager.onInAppMessageDismissed();
                        if (kVar._state.getCurrentPrompt() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed", null, 2, null);
                            return Unit.f6114a;
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
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show", null, 2, null);
                            lVar.L$0 = null;
                            lVar.L$1 = null;
                            lVar.label = 2;
                        }
                        return aVar2;
                    }
                    this.dismissedMessages.add(aVar.getMessageId());
                    if (!z7) {
                        this._prefs.setDismissedMessagesId(this.dismissedMessages);
                        this._state.setLastTimeInAppDismissed(new Long(this._time.getCurrentTimeMillis()));
                        lVar.L$0 = this;
                        lVar.L$1 = aVar;
                        lVar.label = 1;
                    }
                    kVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            V6.b.P(obj);
                            return Unit.f6114a;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        return Unit.f6114a;
                    }
                    aVar = (a) lVar.L$1;
                    kVar = (k) lVar.L$0;
                    V6.b.P(obj);
                }
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
                kVar._influenceManager.onInAppMessageDismissed();
                if (kVar._state.getCurrentPrompt() != null) {
                }
            }
        }
        lVar = new l(bVar);
        Object obj2 = lVar.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = lVar.label;
        if (i2 != 0) {
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
        kVar._influenceManager.onInAppMessageDismissed();
        if (kVar._state.getCurrentPrompt() != null) {
        }
    }

    public static /* synthetic */ Object messageWasDismissed$default(k kVar, a aVar, boolean z7, V5.b bVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z7 = false;
        }
        return kVar.messageWasDismissed(aVar, z7, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persistInAppMessage(a aVar, V5.b bVar) {
        A a7;
        int i2;
        k kVar;
        int indexOf;
        if (bVar instanceof A) {
            a7 = (A) bVar;
            int i5 = a7.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                a7.label = i5 - Integer.MIN_VALUE;
                Object obj = a7.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = a7.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    aVar.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / 1000);
                    aVar.getRedisplayStats().incrementDisplayQuantity();
                    aVar.setTriggerChanged(false);
                    aVar.setDisplayedInSession(true);
                    W2.a aVar3 = this._repository;
                    a7.L$0 = this;
                    a7.L$1 = aVar;
                    a7.label = 1;
                    if (aVar3.saveInAppMessage(aVar, a7) == aVar2) {
                        return aVar2;
                    }
                    kVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) a7.L$1;
                    kVar = (k) a7.L$0;
                    V6.b.P(obj);
                }
                kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
                indexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
                if (indexOf == -1) {
                    kVar.redisplayedInAppMessages.set(indexOf, aVar);
                } else {
                    kVar.redisplayedInAppMessages.add(aVar);
                }
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
                return Unit.f6114a;
            }
        }
        a7 = new A(bVar);
        Object obj2 = a7.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = a7.label;
        if (i2 != 0) {
        }
        kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
        indexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
        if (indexOf == -1) {
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
        return Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r4.attemptToShowInAppMessage(r1) != r2) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v10, types: [v6.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queueMessageForDisplay(a aVar, V5.b bVar) {
        B b7;
        int i2;
        v6.c cVar;
        k kVar;
        try {
            if (bVar instanceof B) {
                b7 = (B) bVar;
                int i5 = b7.label;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    b7.label = i5 - Integer.MIN_VALUE;
                    Object obj = b7.result;
                    W5.a aVar2 = W5.a.f2787d;
                    i2 = b7.label;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        InterfaceC0979a interfaceC0979a = this.messageDisplayQueueMutex;
                        b7.L$0 = this;
                        b7.L$1 = aVar;
                        b7.L$2 = interfaceC0979a;
                        b7.label = 1;
                        cVar = (v6.c) interfaceC0979a;
                        if (cVar.c(b7) != aVar2) {
                            kVar = this;
                        }
                        return aVar2;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        return Unit.f6114a;
                    }
                    ?? r9 = (InterfaceC0979a) b7.L$2;
                    a aVar3 = (a) b7.L$1;
                    kVar = (k) b7.L$0;
                    V6.b.P(obj);
                    cVar = r9;
                    aVar = aVar3;
                    if (!kVar.messageDisplayQueue.contains(aVar) && !Intrinsics.a(kVar._state.getInAppMessageIdShowing(), aVar.getMessageId())) {
                        kVar.messageDisplayQueue.add(aVar);
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + aVar.getMessageId() + ", added to the queue", null, 2, null);
                    }
                    Unit unit = Unit.f6114a;
                    cVar.e(null);
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
            Unit unit2 = Unit.f6114a;
            cVar.e(null);
            b7.L$0 = null;
            b7.L$1 = null;
            b7.L$2 = null;
            b7.label = 2;
        } catch (Throwable th) {
            cVar.e(null);
            throw th;
        }
        b7 = new B(bVar);
        Object obj2 = b7.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = b7.label;
        if (i2 != 0) {
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
        String string = this._applicationService.getAppContext().getString(N2.l.location_permission_missing_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this._applicationService.getAppContext().getString(N2.l.location_permission_missing_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        new AlertDialog.Builder(this._applicationService.getCurrent()).setTitle(string).setMessage(string2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onesignal.inAppMessages.internal.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                k.showAlertDialogMessage$lambda$11(k.this, aVar, list, dialogInterface, i2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlertDialogMessage$lambda$11(k this$0, a inAppMessage, List prompts, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(inAppMessage, "$inAppMessage");
        Intrinsics.checkNotNullParameter(prompts, "$prompts");
        com.onesignal.common.threading.b.suspendifyOnIO(this$0.new C(inAppMessage, prompts, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0119, code lost:
    
        if (messageWasDismissed$default(r12, r13, false, r15, 2, null) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b6 -> B:17:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMultiplePrompts(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, V5.b bVar) {
        D d7;
        k kVar;
        int i2;
        Iterator<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> it;
        D d8;
        k kVar2;
        a aVar2;
        List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list2;
        a aVar3;
        k kVar3;
        if (bVar instanceof D) {
            d7 = (D) bVar;
            int i5 = d7.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                d7.label = i5 - Integer.MIN_VALUE;
                kVar = this;
                Object obj = d7.result;
                W5.a aVar4 = W5.a.f2787d;
                i2 = d7.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    it = list.iterator();
                    d8 = d7;
                    kVar2 = kVar;
                    aVar2 = aVar;
                    list2 = list;
                    while (it.hasNext()) {
                    }
                    aVar3 = aVar2;
                    D d9 = d8;
                    kVar3 = kVar2;
                    if (kVar3._state.getCurrentPrompt() != null) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V6.b.P(obj);
                        return Unit.f6114a;
                    }
                    Iterator<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> it2 = (Iterator) d7.L$3;
                    List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list3 = (List) d7.L$2;
                    a aVar5 = (a) d7.L$1;
                    kVar2 = (k) d7.L$0;
                    V6.b.P(obj);
                    d8 = d7;
                    list2 = list3;
                    it = it2;
                    b.a aVar6 = (b.a) obj;
                    kVar2._state.setCurrentPrompt(null);
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + aVar6, null, 2, null);
                    if (aVar5.isPreview() || aVar6 != b.a.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                        aVar2 = aVar5;
                        while (it.hasNext()) {
                            com.onesignal.inAppMessages.internal.prompt.impl.b next = it.next();
                            if (!next.hasPrompted()) {
                                kVar2._state.setCurrentPrompt(next);
                                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle: " + kVar2._state.getCurrentPrompt(), null, 2, null);
                                com.onesignal.inAppMessages.internal.prompt.impl.b currentPrompt = kVar2._state.getCurrentPrompt();
                                Intrinsics.b(currentPrompt);
                                currentPrompt.setPrompted(true);
                                com.onesignal.inAppMessages.internal.prompt.impl.b currentPrompt2 = kVar2._state.getCurrentPrompt();
                                Intrinsics.b(currentPrompt2);
                                d8.L$0 = kVar2;
                                d8.L$1 = aVar2;
                                d8.L$2 = list2;
                                d8.L$3 = it;
                                d8.label = 1;
                                Object handlePrompt = currentPrompt2.handlePrompt(d8);
                                if (handlePrompt != aVar4) {
                                    aVar5 = aVar2;
                                    obj = handlePrompt;
                                    b.a aVar62 = (b.a) obj;
                                    kVar2._state.setCurrentPrompt(null);
                                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + aVar62, null, 2, null);
                                    if (aVar5.isPreview()) {
                                    }
                                    aVar2 = aVar5;
                                    while (it.hasNext()) {
                                    }
                                }
                                return aVar4;
                            }
                        }
                        aVar3 = aVar2;
                        D d92 = d8;
                        kVar3 = kVar2;
                        if (kVar3._state.getCurrentPrompt() != null) {
                            return Unit.f6114a;
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: No IAM prompt to handle, dismiss message: " + aVar3.getMessageId(), null, 2, null);
                        d92.L$0 = null;
                        d92.L$1 = null;
                        d92.L$2 = null;
                        d92.L$3 = null;
                        d92.label = 2;
                    } else {
                        kVar2.showAlertDialogMessage(aVar5, list2);
                        aVar3 = aVar5;
                        D d922 = d8;
                        kVar3 = kVar2;
                        if (kVar3._state.getCurrentPrompt() != null) {
                        }
                    }
                }
            }
        }
        kVar = this;
        d7 = kVar.new D(bVar);
        Object obj2 = d7.result;
        W5.a aVar42 = W5.a.f2787d;
        i2 = d7.label;
        if (i2 != 0) {
        }
    }

    @Override // N2.j
    /* renamed from: addClickListener */
    public void mo11addClickListener(N2.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.subscribe(listener);
    }

    @Override // N2.j
    /* renamed from: addLifecycleListener */
    public void mo12addLifecycleListener(N2.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.subscribe(listener);
    }

    @Override // N2.j
    /* renamed from: addTrigger */
    public void mo13addTrigger(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTrigger(key: " + key + ", value: " + value + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            try {
                if (!this.hasCompletedFirstFetch) {
                    com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Tracking trigger added early on cold start: " + key, null, 2, null);
                    this.earlySessionTriggers.add(key);
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Y2.c cVar = (Y2.c) this._triggerModelStore.get(key);
        if (cVar != null) {
            cVar.setValue(value);
            return;
        }
        Y2.c cVar2 = new Y2.c();
        cVar2.setId(key);
        cVar2.setKey(key);
        cVar2.setValue(value);
        com.onesignal.common.modeling.b.add$default(this._triggerModelStore, cVar2, null, 2, null);
    }

    @Override // N2.j
    /* renamed from: addTriggers */
    public void mo14addTriggers(Map<String, String> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTriggers(triggers: " + triggers + ')', null, 2, null);
        for (Map.Entry<String, String> entry : triggers.entrySet()) {
            mo13addTrigger(entry.getKey(), entry.getValue());
        }
    }

    @Override // N2.j
    /* renamed from: clearTriggers */
    public void mo15clearTriggers() {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        synchronized (this.earlySessionTriggers) {
            try {
                if (!this.hasCompletedFirstFetch) {
                    this.earlySessionTriggers.clear();
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.onesignal.common.modeling.b.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // N2.j
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // v2.e
    public void onFocus(boolean z7) {
    }

    @Override // com.onesignal.user.internal.jwt.a
    public void onJwtUpdated(String externalId) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        String str = this.pendingJwtRetryExternalId;
        C0800b c0800b = this.pendingJwtRetryRywData;
        if (str == null || !str.equals(externalId) || c0800b == null) {
            return;
        }
        this.pendingJwtRetryExternalId = null;
        this.pendingJwtRetryRywData = null;
        com.onesignal.debug.internal.logging.b.info$default(r4.f.d("InAppMessagesManager: JWT refreshed for ", externalId, ", retrying IAM fetch"), null, 2, null);
        com.onesignal.common.threading.b.suspendifyOnIO(new n(c0800b, null));
    }

    @Override // S2.a
    public void onMessageActionOccurredOnMessage(a message, c action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        com.onesignal.common.threading.b.suspendifyOnIO(new o(action, message, this, null));
    }

    @Override // S2.a
    public void onMessageActionOccurredOnPreview(a message, c action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        com.onesignal.common.threading.b.suspendifyOnIO(new p(action, message, this, null));
    }

    @Override // S2.a
    public void onMessagePageChanged(a message, com.onesignal.inAppMessages.internal.g page) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(page, "page");
        if (message.isPreview()) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnIO(new q(message, page, null));
    }

    @Override // S2.a
    public void onMessageWasDismissed(a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        com.onesignal.common.threading.b.suspendifyOnIO(new r(message, null));
    }

    @Override // S2.a
    public void onMessageWasDisplayed(a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new s(message));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (message.isPreview() || this.impressionedMessages.contains(message.getMessageId())) {
            return;
        }
        this.impressionedMessages.add(message.getMessageId());
        String variantIdForMessage = P2.a.INSTANCE.variantIdForMessage(message, this._languageContext);
        if (variantIdForMessage == null) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnIO(new t(variantIdForMessage, message, null));
    }

    @Override // S2.a
    public void onMessageWillDismiss(a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new u(message));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // S2.a
    public void onMessageWillDisplay(a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new v(message));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "appId")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // N3.a
    public void onSessionActive() {
    }

    @Override // N3.a
    public void onSessionEnded(long j7) {
    }

    @Override // N3.a
    public void onSessionStarted() {
        Iterator<a> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    @Override // Y3.a
    public void onSubscriptionAdded(InterfaceC0181e subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // Y3.a
    public void onSubscriptionChanged(InterfaceC0181e subscription, com.onesignal.common.modeling.j args) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(args, "args");
        if ((subscription instanceof InterfaceC0178b) && Intrinsics.a(args.getPath(), "id")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // Y3.a
    public void onSubscriptionRemoved(InterfaceC0181e subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // Y2.b
    public void onTriggerChanged(String newTriggerKey) {
        Intrinsics.checkNotNullParameter(newTriggerKey, "newTriggerKey");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + newTriggerKey + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(kotlin.collections.q.b(newTriggerKey), true);
        com.onesignal.common.threading.b.suspendifyOnDefault(new w(null));
    }

    @Override // Y2.b
    public void onTriggerCompleted(String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: " + triggerId, null, 2, null);
        new HashSet().add(triggerId);
    }

    @Override // Y2.b
    public void onTriggerConditionChanged(String triggerId) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(kotlin.collections.q.b(triggerId), false);
        com.onesignal.common.threading.b.suspendifyOnDefault(new x(null));
    }

    @Override // v2.e
    public void onUnfocused() {
    }

    @Override // N2.j
    /* renamed from: removeClickListener */
    public void mo16removeClickListener(N2.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(listener);
    }

    @Override // N2.j
    /* renamed from: removeLifecycleListener */
    public void mo17removeLifecycleListener(N2.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(listener);
    }

    @Override // N2.j
    /* renamed from: removeTrigger */
    public void mo18removeTrigger(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTrigger(key: " + key + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            try {
                if (!this.hasCompletedFirstFetch) {
                    this.earlySessionTriggers.remove(key);
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.onesignal.common.modeling.b.remove$default(this._triggerModelStore, key, null, 2, null);
    }

    @Override // N2.j
    /* renamed from: removeTriggers */
    public void mo19removeTriggers(Collection<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTriggers(keys: " + keys + ')', null, 2, null);
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            mo18removeTrigger((String) it.next());
        }
    }

    @Override // N2.j
    public void setPaused(boolean z7) {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setPaused(value: " + z7 + ')', null, 2, null);
        this._state.setPaused(z7);
        if (z7 && this._state.getInAppMessageIdShowing() != null) {
            com.onesignal.common.threading.b.suspendifyOnMain(new y(null));
        }
        if (z7) {
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
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        fetchMessagesWhenConditionIsMet();
    }
}
