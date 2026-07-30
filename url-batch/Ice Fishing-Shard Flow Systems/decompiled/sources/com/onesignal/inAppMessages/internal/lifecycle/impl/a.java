package com.onesignal.inAppMessages.internal.lifecycle.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a extends com.onesignal.common.events.b implements S2.b {

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0037a extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0037a(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((S2.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(S2.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageActionOccurredOnMessage(this.$message, this.$action);
        }
    }

    public static final class b extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((S2.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(S2.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageActionOccurredOnPreview(this.$message, this.$action);
        }
    }

    public static final class c extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
            super(1);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((S2.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(S2.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessagePageChanged(this.$message, this.$page);
        }
    }

    public static final class d extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((S2.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(S2.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWasDismissed(this.$message);
        }
    }

    public static final class e extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((S2.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(S2.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWasDisplayed(this.$message);
        }
    }

    public static final class f extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((S2.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(S2.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWillDismiss(this.$message);
        }
    }

    public static final class g extends p implements Function1 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((S2.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(S2.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onMessageWillDisplay(this.$message);
        }
    }

    @Override // S2.b
    public void messageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a message, com.onesignal.inAppMessages.internal.c action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        fire(new C0037a(message, action));
    }

    @Override // S2.b
    public void messageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a message, com.onesignal.inAppMessages.internal.c action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        fire(new b(message, action));
    }

    @Override // S2.b
    public void messagePageChanged(com.onesignal.inAppMessages.internal.a message, com.onesignal.inAppMessages.internal.g page) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(page, "page");
        fire(new c(message, page));
    }

    @Override // S2.b
    public void messageWasDismissed(com.onesignal.inAppMessages.internal.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new d(message));
    }

    @Override // S2.b
    public void messageWasDisplayed(com.onesignal.inAppMessages.internal.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new e(message));
    }

    @Override // S2.b
    public void messageWillDismiss(com.onesignal.inAppMessages.internal.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new f(message));
    }

    @Override // S2.b
    public void messageWillDisplay(com.onesignal.inAppMessages.internal.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        fire(new g(message));
    }
}
