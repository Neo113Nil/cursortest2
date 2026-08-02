package com.withpersona.sdk2.inquiry.tracking.model;

import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;", "", "<init>", "(Ljava/lang/String;I)V", "ShowingIntegration", "Error", "Complete", "Paused", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntegrationState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IntegrationState[] $VALUES;

    @Json(name = "showing_integration")
    public static final IntegrationState ShowingIntegration = new IntegrationState("ShowingIntegration", 0);

    @Json(name = BreadcrumbHelper.Category.ERROR)
    public static final IntegrationState Error = new IntegrationState("Error", 1);

    @Json(name = "complete")
    public static final IntegrationState Complete = new IntegrationState("Complete", 2);

    @Json(name = "paused")
    public static final IntegrationState Paused = new IntegrationState("Paused", 3);

    private static final /* synthetic */ IntegrationState[] $values() {
        return new IntegrationState[]{ShowingIntegration, Error, Complete, Paused};
    }

    static {
        IntegrationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private IntegrationState(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static IntegrationState valueOf(String str) {
        return (IntegrationState) Enum.valueOf(IntegrationState.class, str);
    }

    public static IntegrationState[] values() {
        return (IntegrationState[]) $VALUES.clone();
    }
}
