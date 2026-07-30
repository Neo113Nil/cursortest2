package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pz1 {
    public static final /* synthetic */ pz1[] m = {new pz1("CounterClockwise", 0), new pz1("Clockwise", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    pz1 EF5;

    public static pz1 valueOf(String str) {
        return (pz1) Enum.valueOf(pz1.class, str);
    }

    public static pz1[] values() {
        return (pz1[]) m.clone();
    }
}
