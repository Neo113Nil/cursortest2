package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbe {
    public static final kbe a;
    public static final kbe b;
    public static final kbe c;
    private static final /* synthetic */ kbe[] d;

    static {
        kbe kbeVar = new kbe("NONE", 0);
        a = kbeVar;
        kbe kbeVar2 = new kbe("INTEGRITY", 1);
        b = kbeVar2;
        kbe kbeVar3 = new kbe("PRIVACY_AND_INTEGRITY", 2);
        c = kbeVar3;
        d = new kbe[]{kbeVar, kbeVar2, kbeVar3};
    }

    public static kbe[] values() {
        return (kbe[]) d.clone();
    }
}
