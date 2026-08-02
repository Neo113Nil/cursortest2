package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gec {
    public static final gec a;
    public static final gec b;
    private static final /* synthetic */ gec[] c;

    static {
        gec gecVar = new gec("LOCAL_STATE_CHANGE", 0);
        a = gecVar;
        gec gecVar2 = new gec("REMOTE_STATE_CHANGE", 1);
        b = gecVar2;
        c = new gec[]{gecVar, gecVar2};
    }

    public static gec[] values() {
        return (gec[]) c.clone();
    }
}
