package com.facebook.appevents.cloudbridge;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum AppEventType {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;

    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppEventType invoke(String str) {
            str.getClass();
            return Intrinsics.b(str, "MOBILE_APP_INSTALL") ? AppEventType.MOBILE_APP_INSTALL : Intrinsics.b(str, "CUSTOM_APP_EVENTS") ? AppEventType.CUSTOM : AppEventType.OTHER;
        }

        private Companion() {
        }
    }
}
