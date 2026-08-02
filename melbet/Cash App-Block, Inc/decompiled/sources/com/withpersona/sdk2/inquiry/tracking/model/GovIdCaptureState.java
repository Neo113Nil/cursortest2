package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "IDLE", "TAKING_PHOTO", "CONFIRMING", "SUBMITTING", "CAPTURED_PHOTO", "RECORDING_TIMED_OUT", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GovIdCaptureState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GovIdCaptureState[] $VALUES;

    @Json(name = "loading")
    public static final GovIdCaptureState LOADING = new GovIdCaptureState("LOADING", 0);

    @Json(name = "idle")
    public static final GovIdCaptureState IDLE = new GovIdCaptureState("IDLE", 1);

    @Json(name = "taking_photo")
    public static final GovIdCaptureState TAKING_PHOTO = new GovIdCaptureState("TAKING_PHOTO", 2);

    @Json(name = "confirming")
    public static final GovIdCaptureState CONFIRMING = new GovIdCaptureState("CONFIRMING", 3);

    @Json(name = "submitting")
    public static final GovIdCaptureState SUBMITTING = new GovIdCaptureState("SUBMITTING", 4);

    @Json(name = "captured_photo")
    public static final GovIdCaptureState CAPTURED_PHOTO = new GovIdCaptureState("CAPTURED_PHOTO", 5);

    @Json(name = "recording_timed_out")
    public static final GovIdCaptureState RECORDING_TIMED_OUT = new GovIdCaptureState("RECORDING_TIMED_OUT", 6);

    private static final /* synthetic */ GovIdCaptureState[] $values() {
        return new GovIdCaptureState[]{LOADING, IDLE, TAKING_PHOTO, CONFIRMING, SUBMITTING, CAPTURED_PHOTO, RECORDING_TIMED_OUT};
    }

    static {
        GovIdCaptureState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private GovIdCaptureState(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static GovIdCaptureState valueOf(String str) {
        return (GovIdCaptureState) Enum.valueOf(GovIdCaptureState.class, str);
    }

    public static GovIdCaptureState[] values() {
        return (GovIdCaptureState[]) $VALUES.clone();
    }
}
