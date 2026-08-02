package net.idrnd.face.iad.capture.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class v2 {
    public static final /* synthetic */ v2[] a = {new v2("Jpeg100", 0), new v2("Jpeg70", 1), new v2("Png", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    v2 EF5;

    public static v2 valueOf(String str) {
        return (v2) Enum.valueOf(v2.class, str);
    }

    public static v2[] values() {
        return (v2[]) a.clone();
    }
}
