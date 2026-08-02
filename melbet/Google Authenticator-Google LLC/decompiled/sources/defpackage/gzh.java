package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gzh implements gzf {
    public static final gzh a;
    private static final /* synthetic */ gzh[] b;

    static {
        gzh gzhVar = new gzh();
        a = gzhVar;
        b = new gzh[]{gzhVar};
    }

    private gzh() {
    }

    public static gzh[] values() {
        return (gzh[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        return obj;
    }
}
