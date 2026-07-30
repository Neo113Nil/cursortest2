package com.facebook.appevents.cloudbridge;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum AppEventUserAndAppDataField {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes"),
    ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP("add_to_messaging_customer_base_for_whatsapp");

    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    AppEventUserAndAppDataField(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppEventUserAndAppDataField invoke(String str) {
            str.getClass();
            for (AppEventUserAndAppDataField appEventUserAndAppDataField : AppEventUserAndAppDataField.values()) {
                if (Intrinsics.b(appEventUserAndAppDataField.getRawValue(), str)) {
                    return appEventUserAndAppDataField;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
