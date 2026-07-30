package com.google.maps.android;

import a6.a;
import com.baidu.platform.comapi.map.MapController;
import kotlin.jvm.internal.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Source {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Source[] $VALUES;
    public static final Source DEFAULT = new Source("DEFAULT", 0, MapController.DEFAULT_LAYER_TAG);
    public static final Source OUTDOOR = new Source("OUTDOOR", 1, "outdoor");
    private String value;

    private static final /* synthetic */ Source[] $values() {
        return new Source[]{DEFAULT, OUTDOOR};
    }

    static {
        Source[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.enumEntries($values);
    }

    private Source(String str, int i8, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }
}
