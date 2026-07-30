package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nh {
    public static final nh m;
    public static final nh n;
    public static final /* synthetic */ nh[] o;

    static {
        nh nhVar = new nh("RU", 0);
        m = nhVar;
        nh nhVar2 = new nh("EN", 1);
        n = nhVar2;
        o = new nh[]{nhVar, nhVar2};
    }

    public static nh valueOf(String str) {
        return (nh) Enum.valueOf(nh.class, str);
    }

    public static nh[] values() {
        return (nh[]) o.clone();
    }
}
