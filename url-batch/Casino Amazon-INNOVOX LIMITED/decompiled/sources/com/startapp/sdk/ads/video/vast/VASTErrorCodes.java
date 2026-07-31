package com.startapp.sdk.ads.video.vast;

import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import io.appmetrica.analytics.AppMetricaDefaultValues;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public enum VASTErrorCodes {
    ErrorNone(0),
    XMLParsingError(100),
    /* JADX INFO: Fake field, exist only in values array */
    SchemaValidationError(101),
    /* JADX INFO: Fake field, exist only in values array */
    VersionOfResponseNotSupported(102),
    /* JADX INFO: Fake field, exist only in values array */
    TraffickingError(200),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentLinearity(ComposerKt.providerKey),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentDuration(ComposerKt.compositionLocalMapKey),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentSize(ComposerKt.providerValuesKey),
    /* JADX INFO: Fake field, exist only in values array */
    AdCategoryRequired(ComposerKt.providerMapsKey),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralWrapperError(300),
    WrapperTimeout(301),
    /* JADX INFO: Fake field, exist only in values array */
    WrapperLimitReached(302),
    WrapperNoReponse(303),
    /* JADX INFO: Fake field, exist only in values array */
    InlineResponseTimeout(304),
    GeneralLinearError(400),
    FileNotFound(TypedValues.Cycle.TYPE_CURVE_FIT),
    TimeoutMediaFileURI(TypedValues.Cycle.TYPE_VISIBILITY),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(TypedValues.Cycle.TYPE_ALPHA),
    MediaFileDisplayError(405),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(406),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(407),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(408),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(409),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(410),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(411),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(500),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(TypedValues.Position.TYPE_TRANSITION_EASING),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(TypedValues.Position.TYPE_DRAWPATH),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(TypedValues.Position.TYPE_PERCENT_WIDTH),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(TypedValues.Motion.TYPE_STAGGER),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(TypedValues.Motion.TYPE_PATH_ROTATE),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(TypedValues.Motion.TYPE_QUANTIZE_MOTION_PHASE),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(TypedValues.Motion.TYPE_EASING),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(TypedValues.Motion.TYPE_QUANTIZE_INTERPOLATOR),
    UndefinedError(TypedValues.Custom.TYPE_INT),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(TypedValues.Custom.TYPE_FLOAT),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND),
    SAProcessSuccess(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);

    private final int value;

    VASTErrorCodes(int i) {
        this.value = i;
    }

    public final int a() {
        return this.value;
    }
}
