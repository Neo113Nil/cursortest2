package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL", "AUTO", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SelfieCaptureMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelfieCaptureMethod[] $VALUES;

    @Json(name = "manual")
    public static final SelfieCaptureMethod MANUAL = new SelfieCaptureMethod("MANUAL", 0);

    @Json(name = "auto")
    public static final SelfieCaptureMethod AUTO = new SelfieCaptureMethod("AUTO", 1);

    private static final /* synthetic */ SelfieCaptureMethod[] $values() {
        return new SelfieCaptureMethod[]{MANUAL, AUTO};
    }

    static {
        SelfieCaptureMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private SelfieCaptureMethod(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SelfieCaptureMethod valueOf(String str) {
        return (SelfieCaptureMethod) Enum.valueOf(SelfieCaptureMethod.class, str);
    }

    public static SelfieCaptureMethod[] values() {
        return (SelfieCaptureMethod[]) $VALUES.clone();
    }
}
