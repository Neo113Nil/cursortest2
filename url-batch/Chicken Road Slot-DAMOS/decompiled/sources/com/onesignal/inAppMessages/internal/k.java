package com.onesignal.inAppMessages.internal;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.common.AndroidUtils;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import ge.k0;
import ge.x0;
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
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import wd.g0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements wa.j, ra.b, dd.a, com.onesignal.common.modeling.g, bb.a, hb.b, sc.a, ea.e {
    private final ea.f _applicationService;
    private final xa.b _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final y9.c _consistencyManager;
    private final za.a _displayer;
    private final yc.b _identityModelStore;
    private final oc.a _influenceManager;
    private final la.a _languageContext;
    private final bb.b _lifecycle;
    private final qc.b _outcomeEventsController;
    private final cb.a _prefs;
    private final fb.a _repository;
    private final sc.b _sessionService;
    private final gb.a _state;
    private final dd.b _subscriptionManager;
    private final sa.a _time;
    private final hb.a _triggerController;
    private final hb.d _triggerModelStore;
    private final tc.a _userManager;
    private final Set<String> clickedClickIds;
    private final Set<String> dismissedMessages;
    private final Set<String> earlySessionTriggers;
    private final oe.a fetchIAMMutex;
    private boolean hasCompletedFirstFetch;
    private final j identityModelChangeHandler;
    private final Set<String> impressionedMessages;
    private Long lastTimeFetchedIAMs;
    private final com.onesignal.common.events.b lifecycleCallback;
    private final com.onesignal.common.events.b messageClickCallback;
    private final List<com.onesignal.inAppMessages.internal.a> messageDisplayQueue;
    private final oe.a messageDisplayQueueMutex;
    private List<com.onesignal.inAppMessages.internal.a> messages;
    private final List<com.onesignal.inAppMessages.internal.a> redisplayedInAppMessages;
    private final Set<String> viewedPageIds;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.attemptToShowInAppMessage(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a0 extends nd.i implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $inAppMessage;
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.prompt.impl.b> $prompts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a0(com.onesignal.inAppMessages.internal.a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, ld.a aVar2) {
            super(1, aVar2);
            this.$inAppMessage = aVar;
            this.$prompts = list;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return k.this.new a0(this.$inAppMessage, this.$prompts, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((a0) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                k kVar = k.this;
                com.onesignal.inAppMessages.internal.a aVar2 = this.$inAppMessage;
                List<com.onesignal.inAppMessages.internal.prompt.impl.b> list = this.$prompts;
                this.label = 1;
                if (kVar.showMultiplePrompts(aVar2, list, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.evaluateInAppMessages(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b0 extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b0(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.showMultiplePrompts(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fetchMessages(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c0 extends nd.i implements Function1 {
        Object L$0;
        int label;

        public c0(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return k.this.new c0(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((c0) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
        
            if (r5.cleanCachedInAppMessages(r4) == r0) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005f A[LOOP:0: B:7:0x0059->B:9:0x005f, LOOP_END] */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Iterator it;
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                fb.a aVar2 = k.this._repository;
                this.label = 1;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) this.L$0;
                    cf.c.M(obj);
                    list.addAll((Collection) obj);
                    it = k.this.redisplayedInAppMessages.iterator();
                    while (it.hasNext()) {
                        ((com.onesignal.inAppMessages.internal.a) it.next()).setDisplayedInSession(false);
                    }
                    return Unit.f5554a;
                }
                cf.c.M(obj);
            }
            List list2 = k.this.redisplayedInAppMessages;
            fb.a aVar3 = k.this._repository;
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
                return Unit.f5554a;
            }
            return aVar;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends wd.p implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(k.this._time.getCurrentTimeMillis() - k.this._sessionService.getStartTime());
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.i implements Function1 {
        int label;

        public e(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return k.this.new e(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((e) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            if (r1.fetchMessages(r7, r6) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        
            if (r7 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        
            if (r7 == r0) goto L22;
         */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                String onesignalId = k.this._userManager.getOnesignalId();
                y9.c cVar = k.this._consistencyManager;
                w9.a aVar2 = new w9.a(onesignalId);
                this.label = 1;
                obj = cVar.getRywDataFromAwaitableCondition(aVar2, this);
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                    w9.b bVar = (w9.b) obj;
                    if (bVar != null) {
                        k kVar = k.this;
                        this.label = 3;
                    }
                    return Unit.f5554a;
                }
                cf.c.M(obj);
            }
            this.label = 2;
            obj = ((ge.n) ((ge.m) obj)).f0(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireOutcomesForClick(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public h(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForClick(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class i extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public i(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForPageChange(null, null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class j implements com.onesignal.common.modeling.g {

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends nd.i implements Function1 {
            final /* synthetic */ String $newOneSignalId;
            int label;
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, String str, ld.a aVar) {
                super(1, aVar);
                this.this$0 = kVar;
                this.$newOneSignalId = str;
            }

            @Override // nd.a
            public final ld.a create(ld.a aVar) {
                return new a(this.this$0, this.$newOneSignalId, aVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(ld.a aVar) {
                return ((a) create(aVar)).invokeSuspend(Unit.f5554a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
            
                if (r1.fetchMessages(r7, r6) == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
            
                if (r7 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
            
                if (r7 == r0) goto L22;
             */
            @Override // nd.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                md.a aVar = md.a.f6622d;
                int i3 = this.label;
                if (i3 == 0) {
                    cf.c.M(obj);
                    y9.c cVar = this.this$0._consistencyManager;
                    w9.a aVar2 = new w9.a(this.$newOneSignalId);
                    this.label = 1;
                    obj = cVar.getRywDataFromAwaitableCondition(aVar2, this);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                cf.c.M(obj);
                                return Unit.f5554a;
                            }
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                        w9.b bVar = (w9.b) obj;
                        if (bVar != null) {
                            k kVar = this.this$0;
                            this.label = 3;
                        }
                        return Unit.f5554a;
                    }
                    cf.c.M(obj);
                }
                this.label = 2;
                obj = ((ge.n) ((ge.m) obj)).f0(this);
            }
        }

        public j() {
        }

        @Override // com.onesignal.common.modeling.g
        public void onModelReplaced(yc.a aVar, String str) {
            aVar.getClass();
            str.getClass();
        }

        @Override // com.onesignal.common.modeling.g
        public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
            jVar.getClass();
            str.getClass();
            if (Intrinsics.a(jVar.getProperty(), "onesignal_id")) {
                Object oldValue = jVar.getOldValue();
                oldValue.getClass();
                Object newValue = jVar.getNewValue();
                newValue.getClass();
                String str2 = (String) newValue;
                com.onesignal.common.d dVar = com.onesignal.common.d.INSTANCE;
                if (!dVar.isLocalId((String) oldValue) || dVar.isLocalId(str2)) {
                    return;
                }
                com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(k.this, str2, null), 1, null);
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.k$k, reason: collision with other inner class name */
    public static final class C0029k extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0029k(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.messageWasDismissed(null, false, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class m extends nd.i implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.onesignal.inAppMessages.internal.c cVar, com.onesignal.inAppMessages.internal.a aVar, k kVar, ld.a aVar2) {
            super(1, aVar2);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new m(this.$action, this.$message, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((m) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
        
            if (r8.fireOutcomesForClick(r1, r3, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        
            if (r8.fireRESTCallForClick(r1, r4, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        
            if (r8.beginProcessingPrompts(r1, r5, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        
            if (r8.firePublicClickHandler(r1, r6, r7) == r0) goto L25;
         */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                com.onesignal.inAppMessages.internal.a aVar2 = this.$message;
                com.onesignal.inAppMessages.internal.c cVar = this.$action;
                this.label = 1;
            } else if (i3 == 1) {
                cf.c.M(obj);
            } else if (i3 == 2) {
                cf.c.M(obj);
                this.this$0.fireClickAction(this.$action);
                k kVar2 = this.this$0;
                com.onesignal.inAppMessages.internal.a aVar3 = this.$message;
                com.onesignal.inAppMessages.internal.c cVar2 = this.$action;
                this.label = 3;
            } else {
                if (i3 != 3) {
                    if (i3 == 4) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                this.this$0.fireTagCallForClick(this.$action);
                k kVar3 = this.this$0;
                String messageId = this.$message.getMessageId();
                List<com.onesignal.inAppMessages.internal.f> outcomes = this.$action.getOutcomes();
                this.label = 4;
            }
            k kVar4 = this.this$0;
            com.onesignal.inAppMessages.internal.a aVar4 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class n extends nd.i implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.onesignal.inAppMessages.internal.c cVar, com.onesignal.inAppMessages.internal.a aVar, k kVar, ld.a aVar2) {
            super(1, aVar2);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new n(this.$action, this.$message, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((n) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r6.beginProcessingPrompts(r1, r3, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        
            if (r6.firePublicClickHandler(r1, r4, r5) == r0) goto L15;
         */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                com.onesignal.inAppMessages.internal.a aVar2 = this.$message;
                com.onesignal.inAppMessages.internal.c cVar = this.$action;
                this.label = 1;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                    this.this$0.fireClickAction(this.$action);
                    this.this$0.logInAppMessagePreviewActions(this.$action);
                    return Unit.f5554a;
                }
                cf.c.M(obj);
            }
            k kVar2 = this.this$0;
            com.onesignal.inAppMessages.internal.a aVar3 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class o extends nd.i implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar, ld.a aVar2) {
            super(1, aVar2);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return k.this.new o(this.$message, this.$page, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((o) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                k kVar = k.this;
                com.onesignal.inAppMessages.internal.a aVar2 = this.$message;
                com.onesignal.inAppMessages.internal.g gVar = this.$page;
                this.label = 1;
                if (kVar.fireRESTCallForPageChange(aVar2, gVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class p extends nd.i implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.onesignal.inAppMessages.internal.a aVar, ld.a aVar2) {
            super(1, aVar2);
            this.$message = aVar;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return k.this.new p(this.$message, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((p) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                k kVar = k.this;
                com.onesignal.inAppMessages.internal.a aVar2 = this.$message;
                this.label = 1;
                if (k.messageWasDismissed$default(kVar, aVar2, false, this, 2, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class r extends nd.i implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ String $variantId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, com.onesignal.inAppMessages.internal.a aVar, ld.a aVar2) {
            super(1, aVar2);
            this.$variantId = str;
            this.$message = aVar;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return k.this.new r(this.$variantId, this.$message, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((r) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    cf.c.M(obj);
                    xa.b bVar = k.this._backend;
                    String appId = ((com.onesignal.core.internal.config.a) k.this._configModelStore.getModel()).getAppId();
                    String id2 = k.this._subscriptionManager.getSubscriptions().getPush().getId();
                    String str = this.$variantId;
                    String messageId = this.$message.getMessageId();
                    this.label = 1;
                    rVar = this;
                    try {
                        if (bVar.sendIAMImpression(appId, id2, str, messageId, rVar) == aVar) {
                            return aVar;
                        }
                    } catch (z9.a unused) {
                        k.this.impressionedMessages.remove(rVar.$message.getMessageId());
                        return Unit.f5554a;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                    rVar = this;
                }
                k.this._prefs.setImpressionesMessagesId(k.this.impressionedMessages);
            } catch (z9.a unused2) {
                rVar = this;
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class u extends nd.i implements Function1 {
        int label;

        public u(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return k.this.new u(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((u) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class v extends nd.i implements Function1 {
        int label;

        public v(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return k.this.new v(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((v) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class w extends nd.i implements Function2 {
        int label;

        public w(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return k.this.new w(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ge.x xVar, ld.a aVar) {
            return ((w) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            k.this._displayer.dismissCurrentInAppMessage();
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class x extends nd.i implements Function1 {
        int label;

        public x(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return k.this.new x(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((x) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class y extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public y(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.persistInAppMessage(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class z extends nd.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public z(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.queueMessageForDisplay(null, this);
        }
    }

    public k(ea.f fVar, sc.b bVar, oc.a aVar, com.onesignal.core.internal.config.b bVar2, tc.a aVar2, yc.b bVar3, dd.b bVar4, qc.b bVar5, gb.a aVar3, cb.a aVar4, fb.a aVar5, xa.b bVar6, hb.a aVar6, hb.d dVar, za.a aVar7, bb.b bVar7, la.a aVar8, sa.a aVar9, y9.c cVar) {
        fVar.getClass();
        bVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        aVar2.getClass();
        bVar3.getClass();
        bVar4.getClass();
        bVar5.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        bVar6.getClass();
        aVar6.getClass();
        dVar.getClass();
        aVar7.getClass();
        bVar7.getClass();
        aVar8.getClass();
        aVar9.getClass();
        cVar.getClass();
        this._applicationService = fVar;
        this._sessionService = bVar;
        this._influenceManager = aVar;
        this._configModelStore = bVar2;
        this._userManager = aVar2;
        this._identityModelStore = bVar3;
        this._subscriptionManager = bVar4;
        this._outcomeEventsController = bVar5;
        this._state = aVar3;
        this._prefs = aVar4;
        this._repository = aVar5;
        this._backend = bVar6;
        this._triggerController = aVar6;
        this._triggerModelStore = dVar;
        this._displayer = aVar7;
        this._lifecycle = bVar7;
        this._languageContext = aVar8;
        this._time = aVar9;
        this._consistencyManager = cVar;
        this.lifecycleCallback = new com.onesignal.common.events.b();
        this.messageClickCallback = new com.onesignal.common.events.b();
        this.messages = new ArrayList();
        this.dismissedMessages = new LinkedHashSet();
        this.impressionedMessages = new LinkedHashSet();
        this.viewedPageIds = new LinkedHashSet();
        this.clickedClickIds = new LinkedHashSet();
        this.messageDisplayQueue = new ArrayList();
        this.messageDisplayQueueMutex = new oe.c();
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = new oe.c();
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        synchronizedSet.getClass();
        this.earlySessionTriggers = synchronizedSet;
        this.identityModelChangeHandler = new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0133, code lost:
    
        if (r3.queueMessageForDisplay((com.onesignal.inAppMessages.internal.a) r14, r1) == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0162, code lost:
    
        if (r3.messageWasDismissed((com.onesignal.inAppMessages.internal.a) r14, true, r1) == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:
    
        if (r10.a(r1) == r2) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptToShowInAppMessage(ld.a aVar) {
        a aVar2;
        Object obj;
        int i3;
        k kVar;
        wd.b0 b0Var;
        oe.a aVar3;
        wd.b0 b0Var2;
        Boolean bool;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i10 = aVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i10 - Integer.MIN_VALUE;
                obj = aVar2.result;
                md.a aVar4 = md.a.f6622d;
                i3 = aVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    ea.f fVar = this._applicationService;
                    aVar2.L$0 = this;
                    aVar2.label = 1;
                    obj = fVar.waitUntilSystemConditionsAvailable(aVar2);
                    if (obj != aVar4) {
                        kVar = this;
                    }
                    return aVar4;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                cf.c.M(obj);
                                return Unit.f5554a;
                            }
                            if (i3 == 5) {
                                cf.c.M(obj);
                                return Unit.f5554a;
                            }
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b0Var2 = (wd.b0) aVar2.L$1;
                        kVar = (k) aVar2.L$0;
                        cf.c.M(obj);
                        bool = (Boolean) obj;
                        if (bool == null) {
                            if (bool.equals(Boolean.FALSE)) {
                                kVar._state.setInAppMessageIdShowing(null);
                                g0.a(kVar.messages).remove(b0Var2.f10141d);
                                Object obj2 = b0Var2.f10141d;
                                obj2.getClass();
                                aVar2.L$0 = null;
                                aVar2.L$1 = null;
                                aVar2.label = 5;
                            }
                            return Unit.f5554a;
                        }
                        kVar._state.setInAppMessageIdShowing(null);
                        Object obj3 = b0Var2.f10141d;
                        obj3.getClass();
                        aVar2.L$0 = null;
                        aVar2.L$1 = null;
                        aVar2.label = 4;
                        return aVar4;
                    }
                    oe.a aVar5 = (oe.a) aVar2.L$2;
                    wd.b0 b0Var3 = (wd.b0) aVar2.L$1;
                    k kVar2 = (k) aVar2.L$0;
                    cf.c.M(obj);
                    b0Var = b0Var3;
                    aVar3 = aVar5;
                    kVar = kVar2;
                    try {
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + kVar.messageDisplayQueue, null, 2, null);
                        if (kVar.getPaused()) {
                            com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
                        } else if (kVar.messageDisplayQueue.isEmpty()) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
                        } else if (kVar._state.getInAppMessageIdShowing() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                            com.onesignal.inAppMessages.internal.a remove = kVar.messageDisplayQueue.remove(0);
                            b0Var.f10141d = remove;
                            gb.a aVar6 = kVar._state;
                            remove.getClass();
                            aVar6.setInAppMessageIdShowing(remove.getMessageId());
                        }
                        aVar3.d(null);
                        Object obj4 = b0Var.f10141d;
                        if (obj4 != null) {
                            aVar2.L$0 = kVar;
                            aVar2.L$1 = b0Var;
                            aVar2.L$2 = null;
                            aVar2.label = 3;
                            Object displayMessage = kVar._displayer.displayMessage((com.onesignal.inAppMessages.internal.a) obj4, aVar2);
                            if (displayMessage != aVar4) {
                                b0Var2 = b0Var;
                                obj = displayMessage;
                                bool = (Boolean) obj;
                                if (bool == null) {
                                }
                            }
                            return aVar4;
                        }
                        return Unit.f5554a;
                    } catch (Throwable th) {
                        aVar3.d(null);
                        throw th;
                    }
                }
                kVar = (k) aVar2.L$0;
                cf.c.M(obj);
                if (((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct", null, 2, null);
                    return Unit.f5554a;
                }
                b0Var = new wd.b0();
                aVar3 = kVar.messageDisplayQueueMutex;
                aVar2.L$0 = kVar;
                aVar2.L$1 = b0Var;
                aVar2.L$2 = aVar3;
                aVar2.label = 2;
            }
        }
        aVar2 = new a(aVar);
        obj = aVar2.result;
        md.a aVar42 = md.a.f6622d;
        i3 = aVar2.label;
        if (i3 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(com.onesignal.inAppMessages.internal.a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, ld.a aVar2) {
        if (list.isEmpty()) {
            return Unit.f5554a;
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + aVar, null, 2, null);
        this._displayer.dismissCurrentInAppMessage();
        Object showMultiplePrompts = showMultiplePrompts(aVar, list, aVar2);
        return showMultiplePrompts == md.a.f6622d ? showMultiplePrompts : Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evaluateInAppMessages(ld.a aVar) {
        b bVar;
        int i3;
        k kVar;
        Iterator it;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = bVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.evaluateInAppMessages()", null, 2, null);
                    ArrayList arrayList = new ArrayList();
                    synchronized (this.messages) {
                        for (com.onesignal.inAppMessages.internal.a aVar3 : this.messages) {
                            if (this._triggerController.evaluateMessageTriggers(aVar3)) {
                                setDataForRedisplay(aVar3);
                                if (!this.dismissedMessages.contains(aVar3.getMessageId()) && !aVar3.isFinished()) {
                                    arrayList.add(aVar3);
                                }
                            }
                        }
                    }
                    kVar = this;
                    it = arrayList.iterator();
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) bVar.L$1;
                    kVar = (k) bVar.L$0;
                    cf.c.M(obj);
                }
                while (it.hasNext()) {
                    com.onesignal.inAppMessages.internal.a aVar4 = (com.onesignal.inAppMessages.internal.a) it.next();
                    bVar.L$0 = kVar;
                    bVar.L$1 = it;
                    bVar.label = 1;
                    if (kVar.queueMessageForDisplay(aVar4, bVar) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f5554a;
            }
        }
        bVar = new b(aVar);
        Object obj2 = bVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = bVar.label;
        if (i3 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019a, code lost:
    
        if (r4.evaluateInAppMessages(r9) == r3) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessages(w9.b bVar, ld.a aVar) {
        c cVar;
        c cVar2;
        md.a aVar2;
        int i3;
        oe.a aVar3;
        String str;
        String str2;
        w9.b bVar2;
        k kVar;
        long currentTimeMillis;
        Long l10;
        Object listInAppMessages;
        k kVar2;
        List<com.onesignal.inAppMessages.internal.a> list;
        try {
            if (aVar instanceof c) {
                cVar = (c) aVar;
                int i10 = cVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i10 - Integer.MIN_VALUE;
                    cVar2 = cVar;
                    Object obj = cVar2.result;
                    aVar2 = md.a.f6622d;
                    i3 = cVar2.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        if (!this._applicationService.isInForeground()) {
                            return Unit.f5554a;
                        }
                        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                        String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
                        if (id2.length() == 0 || com.onesignal.common.d.INSTANCE.isLocalId(id2) || appId.length() == 0) {
                            return Unit.f5554a;
                        }
                        aVar3 = this.fetchIAMMutex;
                        cVar2.L$0 = this;
                        cVar2.L$1 = bVar;
                        cVar2.L$2 = appId;
                        cVar2.L$3 = id2;
                        cVar2.L$4 = aVar3;
                        cVar2.label = 1;
                        if (aVar3.a(cVar2) != aVar2) {
                            str = id2;
                            str2 = appId;
                            bVar2 = bVar;
                            kVar = this;
                        }
                        return aVar2;
                    }
                    if (i3 == 1) {
                        aVar3 = (oe.a) cVar2.L$4;
                        String str3 = (String) cVar2.L$3;
                        String str4 = (String) cVar2.L$2;
                        bVar2 = (w9.b) cVar2.L$1;
                        k kVar3 = (k) cVar2.L$0;
                        cf.c.M(obj);
                        str = str3;
                        str2 = str4;
                        kVar = kVar3;
                    } else {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                cf.c.M(obj);
                                return Unit.f5554a;
                            }
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kVar2 = (k) cVar2.L$0;
                        cf.c.M(obj);
                        list = (List) obj;
                        if (list != null) {
                            return Unit.f5554a;
                        }
                        if ((list instanceof xd.a) && !(list instanceof xd.c)) {
                            g0.e(list, "kotlin.collections.MutableList");
                            throw null;
                        }
                        kVar2.messages = list;
                        synchronized (kVar2.earlySessionTriggers) {
                            try {
                                if (!kVar2.earlySessionTriggers.isEmpty()) {
                                    com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Processing triggers added early on cold start: " + kVar2.earlySessionTriggers, null, 2, null);
                                    for (com.onesignal.inAppMessages.internal.a aVar4 : kVar2.messages) {
                                        boolean contains = kVar2.redisplayedInAppMessages.contains(aVar4);
                                        boolean isTriggerOnMessage = kVar2._triggerController.isTriggerOnMessage(aVar4, kVar2.earlySessionTriggers);
                                        if (contains && isTriggerOnMessage) {
                                            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Setting isTriggerChanged=true for message " + aVar4.getMessageId(), null, 2, null);
                                            aVar4.setTriggerChanged(true);
                                        }
                                    }
                                    kVar2.earlySessionTriggers.clear();
                                }
                                kVar2.hasCompletedFirstFetch = true;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        cVar2.L$0 = null;
                        cVar2.label = 3;
                    }
                    currentTimeMillis = kVar._time.getCurrentTimeMillis();
                    l10 = kVar.lastTimeFetchedIAMs;
                    if (l10 == null && currentTimeMillis - l10.longValue() < ((com.onesignal.core.internal.config.a) kVar._configModelStore.getModel()).getFetchIAMMinInterval()) {
                        return Unit.f5554a;
                    }
                    kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis);
                    aVar3.d(null);
                    d dVar = kVar.new d();
                    xa.b bVar3 = kVar._backend;
                    cVar2.L$0 = kVar;
                    cVar2.L$1 = null;
                    cVar2.L$2 = null;
                    cVar2.L$3 = null;
                    cVar2.L$4 = null;
                    cVar2.label = 2;
                    listInAppMessages = bVar3.listInAppMessages(str2, str, bVar2, dVar, cVar2);
                    if (listInAppMessages != aVar2) {
                        kVar2 = kVar;
                        obj = listInAppMessages;
                        list = (List) obj;
                        if (list != null) {
                        }
                    }
                    return aVar2;
                }
            }
            currentTimeMillis = kVar._time.getCurrentTimeMillis();
            l10 = kVar.lastTimeFetchedIAMs;
            if (l10 == null) {
            }
            kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis);
            aVar3.d(null);
            d dVar2 = kVar.new d();
            xa.b bVar32 = kVar._backend;
            cVar2.L$0 = kVar;
            cVar2.L$1 = null;
            cVar2.L$2 = null;
            cVar2.L$3 = null;
            cVar2.L$4 = null;
            cVar2.label = 2;
            listInAppMessages = bVar32.listInAppMessages(str2, str, bVar2, dVar2, cVar2);
            if (listInAppMessages != aVar2) {
            }
            return aVar2;
        } finally {
            aVar3.d(null);
        }
        cVar = new c(aVar);
        cVar2 = cVar;
        Object obj2 = cVar2.result;
        aVar2 = md.a.f6622d;
        i3 = cVar2.label;
        if (i3 != 0) {
        }
    }

    private final void fetchMessagesWhenConditionIsMet() {
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new e(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireClickAction(com.onesignal.inAppMessages.internal.c cVar) {
        if (cVar.getUrl() == null || cVar.getUrl().length() <= 0) {
            return;
        }
        if (cVar.getUrlTarget() == wa.k.BROWSER) {
            AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), cVar.getUrl());
        } else if (cVar.getUrlTarget() == wa.k.IN_APP_WEBVIEW) {
            ya.b.INSTANCE.open$com_onesignal_inAppMessages(cVar.getUrl(), true, this._applicationService.getAppContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireOutcomesForClick(String str, List<com.onesignal.inAppMessages.internal.f> list, ld.a aVar) {
        f fVar;
        int i3;
        Iterator<com.onesignal.inAppMessages.internal.f> it;
        k kVar;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = fVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    this._influenceManager.onDirectInfluenceFromIAM(str);
                    it = list.iterator();
                    kVar = this;
                } else {
                    if (i3 != 1 && i3 != 2 && i3 != 3) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) fVar.L$1;
                    kVar = (k) fVar.L$0;
                    cf.c.M(obj);
                }
                while (it.hasNext()) {
                    com.onesignal.inAppMessages.internal.f next = it.next();
                    String name = next.getName();
                    if (next.isUnique()) {
                        qc.b bVar = kVar._outcomeEventsController;
                        fVar.L$0 = kVar;
                        fVar.L$1 = it;
                        fVar.label = 1;
                        if (bVar.sendUniqueOutcomeEvent(name, fVar) == aVar2) {
                            return aVar2;
                        }
                    } else if (next.getWeight() > 0.0f) {
                        qc.b bVar2 = kVar._outcomeEventsController;
                        float weight = next.getWeight();
                        fVar.L$0 = kVar;
                        fVar.L$1 = it;
                        fVar.label = 2;
                        if (bVar2.sendOutcomeEventWithValue(name, weight, fVar) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        qc.b bVar3 = kVar._outcomeEventsController;
                        fVar.L$0 = kVar;
                        fVar.L$1 = it;
                        fVar.label = 3;
                        if (bVar3.sendOutcomeEvent(name, fVar) == aVar2) {
                            return aVar2;
                        }
                    }
                }
                return Unit.f5554a;
            }
        }
        fVar = new f(aVar);
        Object obj2 = fVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = fVar.label;
        if (i3 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar, ld.a aVar2) {
        if (!this.messageClickCallback.getHasSubscribers()) {
            return Unit.f5554a;
        }
        this._influenceManager.onDirectInfluenceFromIAM(aVar.getMessageId());
        Object suspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new g(new com.onesignal.inAppMessages.internal.b(aVar, cVar), null), aVar2);
        return suspendingFireOnMain == md.a.f6622d ? suspendingFireOnMain : Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(4:10|11|12|13)(2:27|28))(2:29|(2:31|32)(2:33|(2:49|50)(4:(1:39)|40|41|(1:43)(1:44))))|14|15|16|17))|51|6|7|(0)(0)|14|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        r11.removeClickId(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForClick(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar, ld.a aVar2) {
        h hVar;
        int i3;
        String clickId;
        k kVar;
        com.onesignal.inAppMessages.internal.a aVar3;
        String str;
        if (aVar2 instanceof h) {
            hVar = (h) aVar2;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
                h hVar2 = hVar;
                Object obj = hVar2.result;
                md.a aVar4 = md.a.f6622d;
                i3 = hVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    String variantIdForMessage = ya.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    if (variantIdForMessage == null) {
                        return Unit.f5554a;
                    }
                    clickId = cVar.getClickId();
                    if (!(aVar.getRedisplayStats().isRedisplayEnabled() && clickId != null && aVar.isClickAvailable(clickId)) && CollectionsKt.u(this.clickedClickIds, clickId)) {
                        return Unit.f5554a;
                    }
                    if (clickId != null) {
                        this.clickedClickIds.add(clickId);
                        aVar.addClickId(clickId);
                    }
                    try {
                        xa.b bVar = this._backend;
                        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                        String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
                        String messageId = aVar.getMessageId();
                        boolean isFirstClick = cVar.isFirstClick();
                        hVar2.L$0 = this;
                        hVar2.L$1 = aVar;
                        hVar2.L$2 = clickId;
                        hVar2.label = 1;
                        if (bVar.sendIAMClick(appId, id2, variantIdForMessage, messageId, clickId, isFirstClick, hVar2) == aVar4) {
                            return aVar4;
                        }
                        kVar = this;
                    } catch (z9.a unused) {
                        kVar = this;
                        aVar3 = aVar;
                        str = clickId;
                        g0.a(kVar.clickedClickIds).remove(str);
                        if (str != null) {
                        }
                        return Unit.f5554a;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) hVar2.L$2;
                    aVar3 = (com.onesignal.inAppMessages.internal.a) hVar2.L$1;
                    kVar = (k) hVar2.L$0;
                    try {
                        cf.c.M(obj);
                        clickId = str;
                        aVar = aVar3;
                    } catch (z9.a unused2) {
                        g0.a(kVar.clickedClickIds).remove(str);
                        if (str != null) {
                        }
                        return Unit.f5554a;
                    }
                }
                kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
                return Unit.f5554a;
            }
        }
        hVar = new h(aVar2);
        h hVar22 = hVar;
        Object obj2 = hVar22.result;
        md.a aVar42 = md.a.f6622d;
        i3 = hVar22.label;
        if (i3 != 0) {
        }
        kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
        return Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForPageChange(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar, ld.a aVar2) {
        i iVar;
        int i3;
        String str;
        k kVar;
        if (aVar2 instanceof i) {
            iVar = (i) aVar2;
            int i10 = iVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.label = i10 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.result;
                md.a aVar3 = md.a.f6622d;
                i3 = iVar2.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    String variantIdForMessage = ya.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    if (variantIdForMessage == null) {
                        return Unit.f5554a;
                    }
                    String pageId = gVar.getPageId();
                    String str2 = aVar.getMessageId() + pageId;
                    if (this.viewedPageIds.contains(str2)) {
                        com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                        return Unit.f5554a;
                    }
                    this.viewedPageIds.add(str2);
                    try {
                        xa.b bVar = this._backend;
                        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                        String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
                        String messageId = aVar.getMessageId();
                        iVar2.L$0 = this;
                        iVar2.L$1 = str2;
                        iVar2.label = 1;
                        if (bVar.sendIAMPageImpression(appId, id2, variantIdForMessage, messageId, pageId, iVar2) == aVar3) {
                            return aVar3;
                        }
                        str = str2;
                        kVar = this;
                    } catch (z9.a unused) {
                        str = str2;
                        kVar = this;
                        kVar.viewedPageIds.remove(str);
                        return Unit.f5554a;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) iVar2.L$1;
                    kVar = (k) iVar2.L$0;
                    try {
                        cf.c.M(obj);
                    } catch (z9.a unused2) {
                        kVar.viewedPageIds.remove(str);
                        return Unit.f5554a;
                    }
                }
                kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
                return Unit.f5554a;
            }
        }
        iVar = new i(aVar2);
        i iVar22 = iVar;
        Object obj2 = iVar22.result;
        md.a aVar32 = md.a.f6622d;
        i3 = iVar22.label;
        if (i3 != 0) {
        }
        kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
        return Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(com.onesignal.inAppMessages.internal.c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.inAppMessages.internal.i tags = cVar.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                com.onesignal.common.f fVar = com.onesignal.common.f.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                tagsToAdd.getClass();
                this._userManager.addTags(fVar.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                com.onesignal.common.f fVar2 = com.onesignal.common.f.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                tagsToRemove.getClass();
                this._userManager.removeTags(fVar2.newStringSetFromJSONArray(tagsToRemove));
            }
        }
    }

    private final boolean hasMessageTriggerChanged(com.onesignal.inAppMessages.internal.a aVar) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(aVar)) {
            return !aVar.isDisplayedInSession();
        }
        return aVar.isTriggerChanged() || (!aVar.isDisplayedInSession() && aVar.getTriggers().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(com.onesignal.inAppMessages.internal.c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + cVar.getTags(), null, 2, null);
        }
        if (cVar.getOutcomes().size() > 0) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + cVar.getOutcomes(), null, 2, null);
        }
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection, boolean z10) {
        synchronized (this.messages) {
            for (com.onesignal.inAppMessages.internal.a aVar : this.messages) {
                boolean contains = this.redisplayedInAppMessages.contains(aVar);
                boolean isTriggerOnMessage = this._triggerController.isTriggerOnMessage(aVar, collection);
                boolean messageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(aVar);
                if (!aVar.isTriggerChanged() && contains && (isTriggerOnMessage || (z10 && messageHasOnlyDynamicTriggers))) {
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + aVar, null, 2, null);
                    aVar.setTriggerChanged(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        if (r11.attemptToShowInAppMessage(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
    
        if (r11.evaluateInAppMessages(r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        if (persistInAppMessage(r10, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object messageWasDismissed(com.onesignal.inAppMessages.internal.a aVar, boolean z10, ld.a aVar2) {
        C0029k c0029k;
        int i3;
        k kVar;
        if (aVar2 instanceof C0029k) {
            c0029k = (C0029k) aVar2;
            int i10 = c0029k.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0029k.label = i10 - Integer.MIN_VALUE;
                Object obj = c0029k.result;
                md.a aVar3 = md.a.f6622d;
                i3 = c0029k.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    if (aVar.isPreview()) {
                        kVar = this;
                        kVar._influenceManager.onInAppMessageDismissed();
                        if (kVar._state.getCurrentPrompt() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed", null, 2, null);
                            return Unit.f5554a;
                        }
                        if (kVar.lifecycleCallback.getHasSubscribers()) {
                            kVar.lifecycleCallback.fireOnMain(new l(aVar));
                        }
                        kVar._state.setInAppMessageIdShowing(null);
                        if (kVar.messageDisplayQueue.isEmpty()) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message dismissed evaluating messages", null, 2, null);
                            c0029k.L$0 = null;
                            c0029k.L$1 = null;
                            c0029k.label = 3;
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show", null, 2, null);
                            c0029k.L$0 = null;
                            c0029k.L$1 = null;
                            c0029k.label = 2;
                        }
                        return aVar3;
                    }
                    this.dismissedMessages.add(aVar.getMessageId());
                    if (!z10) {
                        this._prefs.setDismissedMessagesId(this.dismissedMessages);
                        this._state.setLastTimeInAppDismissed(new Long(this._time.getCurrentTimeMillis()));
                        c0029k.L$0 = this;
                        c0029k.L$1 = aVar;
                        c0029k.label = 1;
                    }
                    kVar = this;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        if (i3 == 3) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (com.onesignal.inAppMessages.internal.a) c0029k.L$1;
                    kVar = (k) c0029k.L$0;
                    cf.c.M(obj);
                }
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
                kVar._influenceManager.onInAppMessageDismissed();
                if (kVar._state.getCurrentPrompt() != null) {
                }
            }
        }
        c0029k = new C0029k(aVar2);
        Object obj2 = c0029k.result;
        md.a aVar32 = md.a.f6622d;
        i3 = c0029k.label;
        if (i3 != 0) {
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
        kVar._influenceManager.onInAppMessageDismissed();
        if (kVar._state.getCurrentPrompt() != null) {
        }
    }

    public static /* synthetic */ Object messageWasDismissed$default(k kVar, com.onesignal.inAppMessages.internal.a aVar, boolean z10, ld.a aVar2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z10 = false;
        }
        return kVar.messageWasDismissed(aVar, z10, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persistInAppMessage(com.onesignal.inAppMessages.internal.a aVar, ld.a aVar2) {
        y yVar;
        int i3;
        k kVar;
        int indexOf;
        if (aVar2 instanceof y) {
            yVar = (y) aVar2;
            int i10 = yVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.label = i10 - Integer.MIN_VALUE;
                Object obj = yVar.result;
                md.a aVar3 = md.a.f6622d;
                i3 = yVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    aVar.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / 1000);
                    aVar.getRedisplayStats().incrementDisplayQuantity();
                    aVar.setTriggerChanged(false);
                    aVar.setDisplayedInSession(true);
                    fb.a aVar4 = this._repository;
                    yVar.L$0 = this;
                    yVar.L$1 = aVar;
                    yVar.label = 1;
                    if (aVar4.saveInAppMessage(aVar, yVar) == aVar3) {
                        return aVar3;
                    }
                    kVar = this;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (com.onesignal.inAppMessages.internal.a) yVar.L$1;
                    kVar = (k) yVar.L$0;
                    cf.c.M(obj);
                }
                kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
                indexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
                List<com.onesignal.inAppMessages.internal.a> list = kVar.redisplayedInAppMessages;
                if (indexOf == -1) {
                    list.set(indexOf, aVar);
                } else {
                    list.add(aVar);
                }
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
                return Unit.f5554a;
            }
        }
        yVar = new y(aVar2);
        Object obj2 = yVar.result;
        md.a aVar32 = md.a.f6622d;
        i3 = yVar.label;
        if (i3 != 0) {
        }
        kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
        indexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
        List<com.onesignal.inAppMessages.internal.a> list2 = kVar.redisplayedInAppMessages;
        if (indexOf == -1) {
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
        return Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r4.attemptToShowInAppMessage(r1) != r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queueMessageForDisplay(com.onesignal.inAppMessages.internal.a aVar, ld.a aVar2) {
        z zVar;
        int i3;
        oe.a aVar3;
        k kVar;
        try {
            if (aVar2 instanceof z) {
                zVar = (z) aVar2;
                int i10 = zVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zVar.label = i10 - Integer.MIN_VALUE;
                    Object obj = zVar.result;
                    md.a aVar4 = md.a.f6622d;
                    i3 = zVar.label;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        aVar3 = this.messageDisplayQueueMutex;
                        zVar.L$0 = this;
                        zVar.L$1 = aVar;
                        zVar.L$2 = aVar3;
                        zVar.label = 1;
                        if (aVar3.a(zVar) != aVar4) {
                            kVar = this;
                        }
                        return aVar4;
                    }
                    if (i3 != 1) {
                        if (i3 == 2) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oe.a aVar5 = (oe.a) zVar.L$2;
                    com.onesignal.inAppMessages.internal.a aVar6 = (com.onesignal.inAppMessages.internal.a) zVar.L$1;
                    kVar = (k) zVar.L$0;
                    cf.c.M(obj);
                    aVar3 = aVar5;
                    aVar = aVar6;
                    if (!kVar.messageDisplayQueue.contains(aVar) && !Intrinsics.a(kVar._state.getInAppMessageIdShowing(), aVar.getMessageId())) {
                        kVar.messageDisplayQueue.add(aVar);
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + aVar.getMessageId() + ", added to the queue", null, 2, null);
                    }
                    aVar3.d(null);
                    zVar.L$0 = null;
                    zVar.L$1 = null;
                    zVar.L$2 = null;
                    zVar.label = 2;
                }
            }
            if (!kVar.messageDisplayQueue.contains(aVar)) {
                kVar.messageDisplayQueue.add(aVar);
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + aVar.getMessageId() + ", added to the queue", null, 2, null);
            }
            aVar3.d(null);
            zVar.L$0 = null;
            zVar.L$1 = null;
            zVar.L$2 = null;
            zVar.label = 2;
        } catch (Throwable th) {
            aVar3.d(null);
            throw th;
        }
        zVar = new z(aVar2);
        Object obj2 = zVar.result;
        md.a aVar42 = md.a.f6622d;
        i3 = zVar.label;
        if (i3 != 0) {
        }
    }

    private final void setDataForRedisplay(com.onesignal.inAppMessages.internal.a aVar) {
        boolean contains = this.dismissedMessages.contains(aVar.getMessageId());
        int indexOf = this.redisplayedInAppMessages.indexOf(aVar);
        if (!contains || indexOf == -1) {
            return;
        }
        com.onesignal.inAppMessages.internal.a aVar2 = this.redisplayedInAppMessages.get(indexOf);
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

    private final void showAlertDialogMessage(final com.onesignal.inAppMessages.internal.a aVar, final List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list) {
        String string = this._applicationService.getAppContext().getString(wa.l.location_permission_missing_title);
        string.getClass();
        String string2 = this._applicationService.getAppContext().getString(wa.l.location_permission_missing_message);
        string2.getClass();
        new AlertDialog.Builder(this._applicationService.getCurrent()).setTitle(string).setMessage(string2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onesignal.inAppMessages.internal.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                k.showAlertDialogMessage$lambda$11(k.this, aVar, list, dialogInterface, i3);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlertDialogMessage$lambda$11(k kVar, com.onesignal.inAppMessages.internal.a aVar, List list, DialogInterface dialogInterface, int i3) {
        kVar.getClass();
        aVar.getClass();
        list.getClass();
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, kVar.new a0(aVar, list, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0118, code lost:
    
        if (messageWasDismissed$default(r12, r13, false, r15, 2, null) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b5 -> B:17:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMultiplePrompts(com.onesignal.inAppMessages.internal.a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, ld.a aVar2) {
        b0 b0Var;
        k kVar;
        int i3;
        Iterator<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> it;
        b0 b0Var2;
        k kVar2;
        com.onesignal.inAppMessages.internal.a aVar3;
        List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list2;
        com.onesignal.inAppMessages.internal.a aVar4;
        k kVar3;
        if (aVar2 instanceof b0) {
            b0Var = (b0) aVar2;
            int i10 = b0Var.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b0Var.label = i10 - Integer.MIN_VALUE;
                kVar = this;
                Object obj = b0Var.result;
                md.a aVar5 = md.a.f6622d;
                i3 = b0Var.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    it = list.iterator();
                    b0Var2 = b0Var;
                    kVar2 = kVar;
                    aVar3 = aVar;
                    list2 = list;
                    while (it.hasNext()) {
                    }
                    aVar4 = aVar3;
                    b0 b0Var3 = b0Var2;
                    kVar3 = kVar2;
                    if (kVar3._state.getCurrentPrompt() != null) {
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> it2 = (Iterator) b0Var.L$3;
                    List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list3 = (List) b0Var.L$2;
                    com.onesignal.inAppMessages.internal.a aVar6 = (com.onesignal.inAppMessages.internal.a) b0Var.L$1;
                    kVar2 = (k) b0Var.L$0;
                    cf.c.M(obj);
                    b0Var2 = b0Var;
                    list2 = list3;
                    it = it2;
                    b.a aVar7 = (b.a) obj;
                    kVar2._state.setCurrentPrompt(null);
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + aVar7, null, 2, null);
                    if (aVar6.isPreview() || aVar7 != b.a.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                        aVar3 = aVar6;
                        while (it.hasNext()) {
                            com.onesignal.inAppMessages.internal.prompt.impl.b next = it.next();
                            if (!next.hasPrompted()) {
                                kVar2._state.setCurrentPrompt(next);
                                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle: " + kVar2._state.getCurrentPrompt(), null, 2, null);
                                com.onesignal.inAppMessages.internal.prompt.impl.b currentPrompt = kVar2._state.getCurrentPrompt();
                                currentPrompt.getClass();
                                currentPrompt.setPrompted(true);
                                com.onesignal.inAppMessages.internal.prompt.impl.b currentPrompt2 = kVar2._state.getCurrentPrompt();
                                currentPrompt2.getClass();
                                b0Var2.L$0 = kVar2;
                                b0Var2.L$1 = aVar3;
                                b0Var2.L$2 = list2;
                                b0Var2.L$3 = it;
                                b0Var2.label = 1;
                                Object handlePrompt = currentPrompt2.handlePrompt(b0Var2);
                                if (handlePrompt != aVar5) {
                                    aVar6 = aVar3;
                                    obj = handlePrompt;
                                    b.a aVar72 = (b.a) obj;
                                    kVar2._state.setCurrentPrompt(null);
                                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + aVar72, null, 2, null);
                                    if (aVar6.isPreview()) {
                                    }
                                    aVar3 = aVar6;
                                    while (it.hasNext()) {
                                    }
                                }
                                return aVar5;
                            }
                        }
                        aVar4 = aVar3;
                        b0 b0Var32 = b0Var2;
                        kVar3 = kVar2;
                        if (kVar3._state.getCurrentPrompt() != null) {
                            return Unit.f5554a;
                        }
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: No IAM prompt to handle, dismiss message: " + aVar4.getMessageId(), null, 2, null);
                        b0Var32.L$0 = null;
                        b0Var32.L$1 = null;
                        b0Var32.L$2 = null;
                        b0Var32.L$3 = null;
                        b0Var32.label = 2;
                    } else {
                        kVar2.showAlertDialogMessage(aVar6, list2);
                        aVar4 = aVar6;
                        b0 b0Var322 = b0Var2;
                        kVar3 = kVar2;
                        if (kVar3._state.getCurrentPrompt() != null) {
                        }
                    }
                }
            }
        }
        kVar = this;
        b0Var = kVar.new b0(aVar2);
        Object obj2 = b0Var.result;
        md.a aVar52 = md.a.f6622d;
        i3 = b0Var.label;
        if (i3 != 0) {
        }
    }

    @Override // wa.j
    /* renamed from: addClickListener */
    public void mo3addClickListener(wa.c cVar) {
        cVar.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addClickListener(listener: " + cVar + ')', null, 2, null);
        this.messageClickCallback.subscribe(cVar);
    }

    @Override // wa.j
    /* renamed from: addLifecycleListener */
    public void mo4addLifecycleListener(wa.g gVar) {
        gVar.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + gVar + ')', null, 2, null);
        this.lifecycleCallback.subscribe(gVar);
    }

    @Override // wa.j
    /* renamed from: addTrigger */
    public void mo5addTrigger(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb2 = new StringBuilder("InAppMessagesManager.addTrigger(key: ");
        sb2.append(str);
        sb2.append(", value: ");
        com.onesignal.debug.internal.logging.b.debug$default(n0.l.h(sb2, str2, ')'), null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Tracking trigger added early on cold start: " + str, null, 2, null);
                this.earlySessionTriggers.add(str);
            }
        }
        hb.c cVar = (hb.c) this._triggerModelStore.get(str);
        if (cVar != null) {
            cVar.setValue(str2);
            return;
        }
        hb.c cVar2 = new hb.c();
        cVar2.setId(str);
        cVar2.setKey(str);
        cVar2.setValue(str2);
        com.onesignal.common.modeling.b.add$default(this._triggerModelStore, cVar2, null, 2, null);
    }

    @Override // wa.j
    /* renamed from: addTriggers */
    public void mo6addTriggers(Map<String, String> map) {
        map.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTriggers(triggers: " + map + ')', null, 2, null);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            mo5addTrigger(entry.getKey(), entry.getValue());
        }
    }

    @Override // wa.j
    /* renamed from: clearTriggers */
    public void mo7clearTriggers() {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                this.earlySessionTriggers.clear();
            }
        }
        com.onesignal.common.modeling.b.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // wa.j
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // bb.a
    public void onMessageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        aVar.getClass();
        cVar.getClass();
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new m(cVar, aVar, this, null), 1, null);
    }

    @Override // bb.a
    public void onMessageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        aVar.getClass();
        cVar.getClass();
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new n(cVar, aVar, this, null), 1, null);
    }

    @Override // bb.a
    public void onMessagePageChanged(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
        aVar.getClass();
        gVar.getClass();
        if (aVar.isPreview()) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new o(aVar, gVar, null), 1, null);
    }

    @Override // bb.a
    public void onMessageWasDismissed(com.onesignal.inAppMessages.internal.a aVar) {
        aVar.getClass();
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new p(aVar, null), 1, null);
    }

    @Override // bb.a
    public void onMessageWasDisplayed(com.onesignal.inAppMessages.internal.a aVar) {
        aVar.getClass();
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new q(aVar));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (aVar.isPreview() || this.impressionedMessages.contains(aVar.getMessageId())) {
            return;
        }
        this.impressionedMessages.add(aVar.getMessageId());
        String variantIdForMessage = ya.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
        if (variantIdForMessage == null) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new r(variantIdForMessage, aVar, null), 1, null);
    }

    @Override // bb.a
    public void onMessageWillDismiss(com.onesignal.inAppMessages.internal.a aVar) {
        aVar.getClass();
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new s(aVar));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // bb.a
    public void onMessageWillDisplay(com.onesignal.inAppMessages.internal.a aVar) {
        aVar.getClass();
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new t(aVar));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        aVar.getClass();
        str.getClass();
        fetchMessagesWhenConditionIsMet();
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        jVar.getClass();
        str.getClass();
        if (Intrinsics.a(jVar.getProperty(), "appId")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // sc.a
    public void onSessionStarted() {
        Iterator<com.onesignal.inAppMessages.internal.a> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    @Override // dd.a
    public void onSubscriptionAdded(fd.e eVar) {
        eVar.getClass();
    }

    @Override // dd.a
    public void onSubscriptionChanged(fd.e eVar, com.onesignal.common.modeling.j jVar) {
        eVar.getClass();
        jVar.getClass();
        if ((eVar instanceof fd.b) && Intrinsics.a(jVar.getPath(), "id")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // dd.a
    public void onSubscriptionRemoved(fd.e eVar) {
        eVar.getClass();
    }

    @Override // hb.b
    public void onTriggerChanged(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + str + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(kotlin.collections.x.c(str), true);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new u(null), 1, null);
    }

    @Override // hb.b
    public void onTriggerCompleted(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: " + str, null, 2, null);
        new HashSet().add(str);
    }

    @Override // hb.b
    public void onTriggerConditionChanged(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(kotlin.collections.x.c(str), false);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new v(null), 1, null);
    }

    @Override // wa.j
    /* renamed from: removeClickListener */
    public void mo8removeClickListener(wa.c cVar) {
        cVar.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeClickListener(listener: " + cVar + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(cVar);
    }

    @Override // wa.j
    /* renamed from: removeLifecycleListener */
    public void mo9removeLifecycleListener(wa.g gVar) {
        gVar.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + gVar + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(gVar);
    }

    @Override // wa.j
    /* renamed from: removeTrigger */
    public void mo10removeTrigger(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTrigger(key: " + str + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                this.earlySessionTriggers.remove(str);
            }
        }
        com.onesignal.common.modeling.b.remove$default(this._triggerModelStore, str, null, 2, null);
    }

    @Override // wa.j
    /* renamed from: removeTriggers */
    public void mo11removeTriggers(Collection<String> collection) {
        collection.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTriggers(keys: " + collection + ')', null, 2, null);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            mo10removeTrigger((String) it.next());
        }
    }

    @Override // wa.j
    public void setPaused(boolean z10) {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setPaused(value: " + z10 + ')', null, 2, null);
        this._state.setPaused(z10);
        if (z10 && this._state.getInAppMessageIdShowing() != null) {
            ne.e eVar = k0.f4372a;
            ge.a0.s(x0.f4413d, le.o.f5995a, new w(null), 2);
        }
        if (z10) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new x(null), 1, null);
    }

    @Override // ra.b
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
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new c0(null), 1, null);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class l extends wd.p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                invoke((wa.g) null);
                return Unit.f5554a;
            }
            i0.j();
            return null;
        }

        public final void invoke(wa.g gVar) {
            gVar.getClass();
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.c();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class q extends wd.p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                invoke((wa.g) null);
                return Unit.f5554a;
            }
            i0.j();
            return null;
        }

        public final void invoke(wa.g gVar) {
            gVar.getClass();
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.d();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class s extends wd.p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                invoke((wa.g) null);
                return Unit.f5554a;
            }
            i0.j();
            return null;
        }

        public final void invoke(wa.g gVar) {
            gVar.getClass();
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.b();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class t extends wd.p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                invoke((wa.g) null);
                return Unit.f5554a;
            }
            i0.j();
            return null;
        }

        public final void invoke(wa.g gVar) {
            gVar.getClass();
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.a();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends nd.i implements Function2 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.b $result;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.inAppMessages.internal.b bVar, ld.a aVar) {
            super(2, aVar);
            this.$result = bVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            g gVar = new g(this.$result, aVar);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((wa.c) null, (ld.a) obj2);
            }
            i0.j();
            return null;
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cf.c.M(obj);
            throw n0.l.e(this.L$0);
        }

        public final Object invoke(wa.c cVar, ld.a aVar) {
            return ((g) create(cVar, aVar)).invokeSuspend(Unit.f5554a);
        }
    }

    @Override // sc.a
    public void onSessionActive() {
    }

    @Override // ea.e
    public void onUnfocused() {
    }

    @Override // ea.e
    public void onFocus(boolean z10) {
    }

    @Override // sc.a
    public void onSessionEnded(long j3) {
    }
}
