package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pu {
    public static final pu m;
    public static final /* synthetic */ pu[] n;

    /* JADX INFO: Fake field, exist only in values array */
    pu EF0;

    static {
        pu puVar = new pu("UNKNOWN", 0);
        pu puVar2 = new pu("ANDROID_FIREBASE", 1);
        m = puVar2;
        n = new pu[]{puVar, puVar2};
    }

    public static pu valueOf(String str) {
        return (pu) Enum.valueOf(pu.class, str);
    }

    public static pu[] values() {
        return (pu[]) n.clone();
    }
}
