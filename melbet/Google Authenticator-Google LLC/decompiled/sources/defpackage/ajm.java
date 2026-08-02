package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajm {
    public static final ajm a;
    public static final ajm b;
    public static final ajm c;
    private static final /* synthetic */ ajm[] d;

    static {
        ajm ajmVar = new ajm("NO_OP", 0);
        a = ajmVar;
        ajm ajmVar2 = new ajm("ADD", 1);
        b = ajmVar2;
        ajm ajmVar3 = new ajm("REMOVE", 2);
        c = ajmVar3;
        ajm[] ajmVarArr = {ajmVar, ajmVar2, ajmVar3};
        d = ajmVarArr;
        ixf.k(ajmVarArr);
    }

    public static ajm[] values() {
        return (ajm[]) d.clone();
    }
}
