package com.chartboost.sdk.Model;

/* loaded from: classes.dex */
public final class CBError {

    /* renamed from: a, reason: collision with root package name */
    private final a f3600a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3601b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3602c = true;

    public enum CBClickError {
        URI_INVALID,
        URI_UNRECOGNIZED,
        AGE_GATE_FAILURE,
        NO_HOST_ACTIVITY,
        INTERNAL
    }

    public enum CBImpressionError {
        INTERNAL,
        INTERNET_UNAVAILABLE,
        TOO_MANY_CONNECTIONS,
        WRONG_ORIENTATION,
        FIRST_SESSION_INTERSTITIALS_DISABLED,
        NETWORK_FAILURE,
        NO_AD_FOUND,
        SESSION_NOT_STARTED,
        IMPRESSION_ALREADY_VISIBLE,
        NO_HOST_ACTIVITY,
        USER_CANCELLATION,
        INVALID_LOCATION,
        VIDEO_UNAVAILABLE,
        VIDEO_ID_MISSING,
        ERROR_PLAYING_VIDEO,
        INVALID_RESPONSE,
        ASSETS_DOWNLOAD_FAILURE,
        ERROR_CREATING_VIEW,
        ERROR_DISPLAYING_VIEW,
        INCOMPATIBLE_API_VERSION,
        ERROR_LOADING_WEB_VIEW,
        ASSET_PREFETCH_IN_PROGRESS,
        ACTIVITY_MISSING_IN_MANIFEST,
        EMPTY_LOCAL_VIDEO_LIST,
        END_POINT_DISABLED,
        HARDWARE_ACCELERATION_DISABLED,
        PENDING_IMPRESSION_ERROR,
        VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION,
        ASSET_MISSING,
        WEB_VIEW_PAGE_LOAD_TIMEOUT,
        WEB_VIEW_CLIENT_RECEIVED_ERROR,
        INTERNET_UNAVAILABLE_AT_SHOW
    }

    public enum a {
        MISCELLANEOUS,
        INTERNET_UNAVAILABLE,
        INVALID_RESPONSE,
        UNEXPECTED_RESPONSE,
        NETWORK_FAILURE,
        PUBLIC_KEY_MISSING,
        HTTP_NOT_FOUND
    }

    public CBError(a aVar, String str) {
        this.f3600a = aVar;
        this.f3601b = str;
    }

    public a a() {
        return this.f3600a;
    }

    public String b() {
        return this.f3601b;
    }

    public CBImpressionError c() {
        switch (this.f3600a) {
            case MISCELLANEOUS:
            case UNEXPECTED_RESPONSE:
            case PUBLIC_KEY_MISSING:
                return CBImpressionError.INTERNAL;
            case INTERNET_UNAVAILABLE:
                return CBImpressionError.INTERNET_UNAVAILABLE;
            case HTTP_NOT_FOUND:
                return CBImpressionError.NO_AD_FOUND;
            default:
                return CBImpressionError.NETWORK_FAILURE;
        }
    }
}
