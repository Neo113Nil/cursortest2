package com.squareup.util.pseudolocalization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Pseudolocalizer$Method {
    public static final /* synthetic */ Pseudolocalizer$Method[] $VALUES = {new Pseudolocalizer$Method("NONE", 0), new Pseudolocalizer$Method("ACCENT", 1), new Pseudolocalizer$Method("BIDI", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Pseudolocalizer$Method EF5;

    public static Pseudolocalizer$Method valueOf(String str) {
        return (Pseudolocalizer$Method) Enum.valueOf(Pseudolocalizer$Method.class, str);
    }

    public static Pseudolocalizer$Method[] values() {
        return (Pseudolocalizer$Method[]) $VALUES.clone();
    }
}
