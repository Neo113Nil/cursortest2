package com.onesignal.core.internal.config.impl;

import X5.j;
import com.onesignal.common.modeling.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements com.onesignal.core.internal.startup.b, g {
    public static final C0018a Companion = new C0018a(null);
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final w2.c _paramsBackendService;
    private final Y3.b _subscriptionManager;

    /* renamed from: com.onesignal.core.internal.config.impl.a$a, reason: collision with other inner class name */
    public static final class C0018a {
        public /* synthetic */ C0018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0018a() {
        }
    }

    public static final class b extends j implements Function1 {
        final /* synthetic */ String $appId;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, a aVar, V5.b bVar) {
            super(1, bVar);
            this.$appId = str;
            this.this$0 = aVar;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return new b(this.$appId, this.this$0, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00d0 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00e7 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00f4 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0101 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x010e A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x011b A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0128 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0135 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0142 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x014f A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0160 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0171 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0186 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x019b A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01b0 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01c5 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01da A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01ef A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0204 A[Catch: a -> 0x0027, TryCatch #0 {a -> 0x0027, blocks: (B:8:0x0042, B:11:0x0063, B:16:0x0071, B:18:0x00d0, B:19:0x00d6, B:21:0x00e7, B:22:0x00ee, B:24:0x00f4, B:25:0x00fb, B:27:0x0101, B:28:0x0108, B:30:0x010e, B:31:0x0115, B:33:0x011b, B:34:0x0122, B:36:0x0128, B:37:0x012f, B:39:0x0135, B:40:0x013c, B:42:0x0142, B:43:0x0149, B:45:0x014f, B:46:0x015a, B:48:0x0160, B:49:0x0167, B:51:0x0171, B:52:0x017c, B:54:0x0186, B:55:0x0191, B:57:0x019b, B:58:0x01a6, B:60:0x01b0, B:61:0x01bb, B:63:0x01c5, B:64:0x01d0, B:66:0x01da, B:67:0x01e5, B:69:0x01ef, B:70:0x01fa, B:72:0x0204, B:73:0x020b, B:93:0x0023), top: B:92:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0290  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x024b -> B:7:0x028e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x028a -> B:6:0x028d). Please report as a decompilation issue!!! */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 659
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.config.impl.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(com.onesignal.core.internal.config.c _configModelStore, w2.c _paramsBackendService, Y3.b _subscriptionManager) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_paramsBackendService, "_paramsBackendService");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        this._configModelStore = _configModelStore;
        this._paramsBackendService = _paramsBackendService;
        this._subscriptionManager = _subscriptionManager;
    }

    private final void fetchParams() {
        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
        if (appId.length() == 0) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnIO(new b(appId, this, null));
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "appId")) {
            fetchParams();
        }
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        fetchParams();
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "NORMAL")) {
            fetchParams();
        }
    }
}
