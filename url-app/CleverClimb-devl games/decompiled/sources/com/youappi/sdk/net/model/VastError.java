package com.youappi.sdk.net.model;

import android.support.v7.widget.helper.ItemTouchHelper;

/* loaded from: classes2.dex */
public enum VastError {
    VAST_ERROR_PARSING_FAILED(100),
    VAST_ERROR_AD_TYPE(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION),
    VAST_ERROR_WRAPPER_ERROR(300),
    VAST_ERROR_VAST_REDIRECT_TIME_OUT(301),
    VAST_ERROR_WRAPPER_LIMIT_EXCEEDED(302),
    VAST_ERROR_EMPTY_VAST_RESPONSE(303),
    VAST_ERROR_UNABLE_TO_FIND_MEDIA(401),
    VAST_ERROR_DISPLAY(405),
    VAST_ERROR_PRELOADING_ASSETS(2100),
    VAST_FAILED_SHOWING_CARD(2101);

    private final int code;

    VastError(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
