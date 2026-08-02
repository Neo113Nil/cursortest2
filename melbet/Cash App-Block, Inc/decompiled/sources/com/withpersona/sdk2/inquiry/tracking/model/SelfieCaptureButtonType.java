package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "SHUTTER", "FLASH", "SWITCH_CAMERA", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SelfieCaptureButtonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelfieCaptureButtonType[] $VALUES;

    @Json(name = "shutter")
    public static final SelfieCaptureButtonType SHUTTER = new SelfieCaptureButtonType("SHUTTER", 0);

    @Json(name = "flash")
    public static final SelfieCaptureButtonType FLASH = new SelfieCaptureButtonType("FLASH", 1);

    @Json(name = "switch_camera")
    public static final SelfieCaptureButtonType SWITCH_CAMERA = new SelfieCaptureButtonType("SWITCH_CAMERA", 2);

    private static final /* synthetic */ SelfieCaptureButtonType[] $values() {
        return new SelfieCaptureButtonType[]{SHUTTER, FLASH, SWITCH_CAMERA};
    }

    static {
        SelfieCaptureButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private SelfieCaptureButtonType(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SelfieCaptureButtonType valueOf(String str) {
        return (SelfieCaptureButtonType) Enum.valueOf(SelfieCaptureButtonType.class, str);
    }

    public static SelfieCaptureButtonType[] values() {
        return (SelfieCaptureButtonType[]) $VALUES.clone();
    }
}
