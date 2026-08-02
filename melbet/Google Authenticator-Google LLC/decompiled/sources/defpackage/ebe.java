package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebe {
    public static final ebe a;
    public static final ebe b;
    public static final ebe c;
    public static final ebe d;
    private static final /* synthetic */ ebe[] e;

    static {
        ebe ebeVar = new ebe("ALWAYS_HIDE_DIVIDER_CARD", 0);
        a = ebeVar;
        ebe ebeVar2 = new ebe("CUSTOM_ACTION_CARD", 1);
        b = ebeVar2;
        ebe ebeVar3 = new ebe("COMMON_ACTION_CARD", 2);
        c = ebeVar3;
        ebe ebeVar4 = new ebe("INDENTED_DIVIDER_ACTION_CARD", 3);
        d = ebeVar4;
        e = new ebe[]{ebeVar, ebeVar2, ebeVar3, ebeVar4};
    }

    public static ebe[] values() {
        return (ebe[]) e.clone();
    }
}
