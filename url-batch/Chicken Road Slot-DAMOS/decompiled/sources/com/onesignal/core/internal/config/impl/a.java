package com.onesignal.core.internal.config.impl;

import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nd.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ra.b, g {
    public static final C0016a Companion = new C0016a(null);
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final fa.b _paramsBackendService;
    private final dd.b _subscriptionManager;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function1 {
        final /* synthetic */ String $appId;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, a aVar, ld.a aVar2) {
            super(1, aVar2);
            this.$appId = str;
            this.this$0 = aVar;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return new b(this.$appId, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00cd A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00da A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f4 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0101 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x010e A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x011b A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0128 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0135 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0142 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0153 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0164 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0179 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x018e A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01a3 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01b8 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01cd A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01e2 A[Catch: a -> 0x0025, TryCatch #0 {a -> 0x0025, blocks: (B:8:0x0041, B:11:0x0062, B:16:0x0070, B:18:0x00cd, B:19:0x00d4, B:21:0x00da, B:22:0x00e1, B:24:0x00e7, B:25:0x00ee, B:27:0x00f4, B:28:0x00fb, B:30:0x0101, B:31:0x0108, B:33:0x010e, B:34:0x0115, B:36:0x011b, B:37:0x0122, B:39:0x0128, B:40:0x012f, B:42:0x0135, B:43:0x013c, B:45:0x0142, B:46:0x014d, B:48:0x0153, B:49:0x015a, B:51:0x0164, B:52:0x016f, B:54:0x0179, B:55:0x0184, B:57:0x018e, B:58:0x0199, B:60:0x01a3, B:61:0x01ae, B:63:0x01b8, B:64:0x01c3, B:66:0x01cd, B:67:0x01d8, B:69:0x01e2, B:70:0x01ed, B:89:0x0021), top: B:88:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x023d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01f8 -> B:7:0x023b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0237 -> B:6:0x023a). Please report as a decompilation issue!!! */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 576
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.config.impl.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(com.onesignal.core.internal.config.b bVar, fa.b bVar2, dd.b bVar3) {
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        this._configModelStore = bVar;
        this._paramsBackendService = bVar2;
        this._subscriptionManager = bVar3;
    }

    private final void fetchParams() {
        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
        if (appId.length() == 0) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(appId, this, null), 1, null);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        aVar.getClass();
        str.getClass();
        if (Intrinsics.a(str, "NORMAL")) {
            fetchParams();
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        if (Intrinsics.a(jVar.getProperty(), "appId")) {
            fetchParams();
        }
    }

    @Override // ra.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        fetchParams();
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.config.impl.a$a, reason: collision with other inner class name */
    public static final class C0016a {
        public /* synthetic */ C0016a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0016a() {
        }
    }
}
