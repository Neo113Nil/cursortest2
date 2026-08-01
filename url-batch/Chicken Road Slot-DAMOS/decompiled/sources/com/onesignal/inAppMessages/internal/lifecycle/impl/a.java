package com.onesignal.inAppMessages.internal.lifecycle.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends com.onesignal.common.events.b implements bb.b {
    @Override // bb.b
    public void messageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        aVar.getClass();
        cVar.getClass();
        fire(new C0030a(aVar, cVar));
    }

    @Override // bb.b
    public void messageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        aVar.getClass();
        cVar.getClass();
        fire(new b(aVar, cVar));
    }

    @Override // bb.b
    public void messagePageChanged(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
        aVar.getClass();
        gVar.getClass();
        fire(new c(aVar, gVar));
    }

    @Override // bb.b
    public void messageWasDismissed(com.onesignal.inAppMessages.internal.a aVar) {
        aVar.getClass();
        fire(new d(aVar));
    }

    @Override // bb.b
    public void messageWasDisplayed(com.onesignal.inAppMessages.internal.a aVar) {
        aVar.getClass();
        fire(new e(aVar));
    }

    @Override // bb.b
    public void messageWillDismiss(com.onesignal.inAppMessages.internal.a aVar) {
        aVar.getClass();
        fire(new f(aVar));
    }

    @Override // bb.b
    public void messageWillDisplay(com.onesignal.inAppMessages.internal.a aVar) {
        aVar.getClass();
        fire(new g(aVar));
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        public final void invoke(bb.a aVar) {
            aVar.getClass();
            aVar.onMessageWasDismissed(this.$message);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bb.a) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        public final void invoke(bb.a aVar) {
            aVar.getClass();
            aVar.onMessageWasDisplayed(this.$message);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bb.a) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        public final void invoke(bb.a aVar) {
            aVar.getClass();
            aVar.onMessageWillDismiss(this.$message);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bb.a) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        public final void invoke(bb.a aVar) {
            aVar.getClass();
            aVar.onMessageWillDisplay(this.$message);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bb.a) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0030a extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0030a(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        public final void invoke(bb.a aVar) {
            aVar.getClass();
            aVar.onMessageActionOccurredOnMessage(this.$message, this.$action);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bb.a) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        public final void invoke(bb.a aVar) {
            aVar.getClass();
            aVar.onMessageActionOccurredOnPreview(this.$message, this.$action);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bb.a) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
            super(1);
            this.$message = aVar;
            this.$page = gVar;
        }

        public final void invoke(bb.a aVar) {
            aVar.getClass();
            aVar.onMessagePageChanged(this.$message, this.$page);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bb.a) obj);
            return Unit.f5554a;
        }
    }
}
