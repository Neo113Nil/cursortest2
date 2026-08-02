package com.stripe.android.financialconnections.ui.components;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class StringAnnotation {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ StringAnnotation[] $VALUES;
    public static final StringAnnotation BOLD;
    public static final StringAnnotation CLICKABLE;
    public final String value;

    static {
        StringAnnotation stringAnnotation = new StringAnnotation("CLICKABLE", 0, "clickable");
        CLICKABLE = stringAnnotation;
        StringAnnotation stringAnnotation2 = new StringAnnotation("BOLD", 1, "bold");
        BOLD = stringAnnotation2;
        StringAnnotation[] stringAnnotationArr = {stringAnnotation, stringAnnotation2};
        $VALUES = stringAnnotationArr;
        $ENTRIES = new EnumEntriesList(stringAnnotationArr);
    }

    public StringAnnotation(String str, int i, String str2) {
        this.value = str2;
    }

    public static StringAnnotation valueOf(String str) {
        return (StringAnnotation) Enum.valueOf(StringAnnotation.class, str);
    }

    public static StringAnnotation[] values() {
        return (StringAnnotation[]) $VALUES.clone();
    }
}
