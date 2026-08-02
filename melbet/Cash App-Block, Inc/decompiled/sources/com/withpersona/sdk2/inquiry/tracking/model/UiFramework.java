package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;", "", "<init>", "(Ljava/lang/String;I)V", "SwiftUi", "UiKit", "Xml", "Compose", "PersonaWorkflow", "SquareWorkflow", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UiFramework {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UiFramework[] $VALUES;

    @Json(name = "SwiftUI")
    public static final UiFramework SwiftUi = new UiFramework("SwiftUi", 0);

    @Json(name = "UIKit")
    public static final UiFramework UiKit = new UiFramework("UiKit", 1);

    @Json(name = "XML")
    public static final UiFramework Xml = new UiFramework("Xml", 2);

    @Json(name = "Compose")
    public static final UiFramework Compose = new UiFramework("Compose", 3);

    @Json(name = "PersonaWorkflow")
    public static final UiFramework PersonaWorkflow = new UiFramework("PersonaWorkflow", 4);

    @Json(name = "SquareWorkflow")
    public static final UiFramework SquareWorkflow = new UiFramework("SquareWorkflow", 5);

    private static final /* synthetic */ UiFramework[] $values() {
        return new UiFramework[]{SwiftUi, UiKit, Xml, Compose, PersonaWorkflow, SquareWorkflow};
    }

    static {
        UiFramework[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private UiFramework(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static UiFramework valueOf(String str) {
        return (UiFramework) Enum.valueOf(UiFramework.class, str);
    }

    public static UiFramework[] values() {
        return (UiFramework[]) $VALUES.clone();
    }
}
