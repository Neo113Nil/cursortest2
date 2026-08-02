package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gue {
    public static final gue a;
    public static final gue b;
    public static final gue c;
    private static final /* synthetic */ gue[] d;

    static {
        gue gueVar = new gue("DISABLED", 0);
        a = gueVar;
        gue gueVar2 = new gue("THROW_ON_FAILURE", 1);
        b = gueVar2;
        gue gueVar3 = new gue("LOG_ON_FAILURE", 2);
        c = gueVar3;
        d = new gue[]{gueVar, gueVar2, gueVar3};
    }

    public static gue[] values() {
        return (gue[]) d.clone();
    }
}
