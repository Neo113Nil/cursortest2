package com.onesignal.inAppMessages.internal.lifecycle.impl;

import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import q2.InterfaceC0597a;
import q2.InterfaceC0598b;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class a extends com.onesignal.common.events.b implements InterfaceC0598b {

    /* renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0037a extends j implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0037a(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0597a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0597a it) {
            i.e(it, "it");
            it.onMessageActionOccurredOnMessage(this.$message, this.$action);
        }
    }

    public static final class b extends j implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0597a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0597a it) {
            i.e(it, "it");
            it.onMessageActionOccurredOnPreview(this.$message, this.$action);
        }
    }

    public static final class c extends j implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
            super(1);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0597a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0597a it) {
            i.e(it, "it");
            it.onMessagePageChanged(this.$message, this.$page);
        }
    }

    public static final class d extends j implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0597a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0597a it) {
            i.e(it, "it");
            it.onMessageWasDismissed(this.$message);
        }
    }

    public static final class e extends j implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0597a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0597a it) {
            i.e(it, "it");
            it.onMessageWasDisplayed(this.$message);
        }
    }

    public static final class f extends j implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0597a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0597a it) {
            i.e(it, "it");
            it.onMessageWillDismiss(this.$message);
        }
    }

    public static final class g extends j implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0597a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0597a it) {
            i.e(it, "it");
            it.onMessageWillDisplay(this.$message);
        }
    }

    @Override // q2.InterfaceC0598b
    public void messageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a message, com.onesignal.inAppMessages.internal.c action) {
        i.e(message, "message");
        i.e(action, "action");
        fire(new C0037a(message, action));
    }

    @Override // q2.InterfaceC0598b
    public void messageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a message, com.onesignal.inAppMessages.internal.c action) {
        i.e(message, "message");
        i.e(action, "action");
        fire(new b(message, action));
    }

    @Override // q2.InterfaceC0598b
    public void messagePageChanged(com.onesignal.inAppMessages.internal.a message, com.onesignal.inAppMessages.internal.g page) {
        i.e(message, "message");
        i.e(page, "page");
        fire(new c(message, page));
    }

    @Override // q2.InterfaceC0598b
    public void messageWasDismissed(com.onesignal.inAppMessages.internal.a message) {
        i.e(message, "message");
        fire(new d(message));
    }

    @Override // q2.InterfaceC0598b
    public void messageWasDisplayed(com.onesignal.inAppMessages.internal.a message) {
        i.e(message, "message");
        fire(new e(message));
    }

    @Override // q2.InterfaceC0598b
    public void messageWillDismiss(com.onesignal.inAppMessages.internal.a message) {
        i.e(message, "message");
        fire(new f(message));
    }

    @Override // q2.InterfaceC0598b
    public void messageWillDisplay(com.onesignal.inAppMessages.internal.a message) {
        i.e(message, "message");
        fire(new g(message));
    }
}
