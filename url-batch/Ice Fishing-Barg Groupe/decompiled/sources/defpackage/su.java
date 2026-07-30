package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class su {
    public static final su OPXfSBeufaJ8;
    public static final /* synthetic */ su[] dgRBjINgWbAK;
    public static final su rtx2ld2ELZv4;
    public static final su wdg6QnbFHrFF;

    static {
        su suVar = new su("COROUTINE_SUSPENDED", 0);
        rtx2ld2ELZv4 = suVar;
        su suVar2 = new su("UNDECIDED", 1);
        OPXfSBeufaJ8 = suVar2;
        su suVar3 = new su("RESUMED", 2);
        wdg6QnbFHrFF = suVar3;
        dgRBjINgWbAK = new su[]{suVar, suVar2, suVar3};
    }

    public static su valueOf(String str) {
        return (su) Enum.valueOf(su.class, str);
    }

    public static su[] values() {
        return (su[]) dgRBjINgWbAK.clone();
    }
}
