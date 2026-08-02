package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "SHUTTER", "FLASH", "RETAKE_PHOTO", "CONTINUE", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GovIdCaptureButtonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GovIdCaptureButtonType[] $VALUES;

    @Json(name = "shutter")
    public static final GovIdCaptureButtonType SHUTTER = new GovIdCaptureButtonType("SHUTTER", 0);

    @Json(name = "flash")
    public static final GovIdCaptureButtonType FLASH = new GovIdCaptureButtonType("FLASH", 1);

    @Json(name = "retake_photo")
    public static final GovIdCaptureButtonType RETAKE_PHOTO = new GovIdCaptureButtonType("RETAKE_PHOTO", 2);

    @Json(name = "continue")
    public static final GovIdCaptureButtonType CONTINUE = new GovIdCaptureButtonType("CONTINUE", 3);

    private static final /* synthetic */ GovIdCaptureButtonType[] $values() {
        return new GovIdCaptureButtonType[]{SHUTTER, FLASH, RETAKE_PHOTO, CONTINUE};
    }

    static {
        GovIdCaptureButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private GovIdCaptureButtonType(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static GovIdCaptureButtonType valueOf(String str) {
        return (GovIdCaptureButtonType) Enum.valueOf(GovIdCaptureButtonType.class, str);
    }

    public static GovIdCaptureButtonType[] values() {
        return (GovIdCaptureButtonType[]) $VALUES.clone();
    }
}
