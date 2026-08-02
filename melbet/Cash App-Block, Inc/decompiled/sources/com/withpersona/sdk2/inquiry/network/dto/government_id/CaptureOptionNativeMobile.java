package com.withpersona.sdk2.inquiry.network.dto.government_id;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@JsonClass(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "", "<init>", "(Ljava/lang/String;I)V", "MOBILE_CAMERA", "UPLOAD", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CaptureOptionNativeMobile {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CaptureOptionNativeMobile[] $VALUES;

    @Json(name = "mobile_camera")
    public static final CaptureOptionNativeMobile MOBILE_CAMERA = new CaptureOptionNativeMobile("MOBILE_CAMERA", 0);

    @Json(name = "upload")
    public static final CaptureOptionNativeMobile UPLOAD = new CaptureOptionNativeMobile("UPLOAD", 1);

    private static final /* synthetic */ CaptureOptionNativeMobile[] $values() {
        return new CaptureOptionNativeMobile[]{MOBILE_CAMERA, UPLOAD};
    }

    static {
        CaptureOptionNativeMobile[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private CaptureOptionNativeMobile(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CaptureOptionNativeMobile valueOf(String str) {
        return (CaptureOptionNativeMobile) Enum.valueOf(CaptureOptionNativeMobile.class, str);
    }

    public static CaptureOptionNativeMobile[] values() {
        return (CaptureOptionNativeMobile[]) $VALUES.clone();
    }
}
