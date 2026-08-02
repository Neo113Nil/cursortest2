package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxi {
    public static final jxi a;
    public static final jxi b;
    public static final jxi c;
    public static final jxi d;
    public static final jxi e;
    private static final /* synthetic */ jxi[] f;

    static {
        jxi jxiVar = new jxi("CONNECTING", 0);
        a = jxiVar;
        jxi jxiVar2 = new jxi("READY", 1);
        b = jxiVar2;
        jxi jxiVar3 = new jxi("TRANSIENT_FAILURE", 2);
        c = jxiVar3;
        jxi jxiVar4 = new jxi("IDLE", 3);
        d = jxiVar4;
        jxi jxiVar5 = new jxi("SHUTDOWN", 4);
        e = jxiVar5;
        f = new jxi[]{jxiVar, jxiVar2, jxiVar3, jxiVar4, jxiVar5};
    }

    public static jxi[] values() {
        return (jxi[]) f.clone();
    }
}
