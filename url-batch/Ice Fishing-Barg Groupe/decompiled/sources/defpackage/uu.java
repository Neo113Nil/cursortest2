package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uu {
    public static final uu OPXfSBeufaJ8;
    public static final uu dgRBjINgWbAK;
    public static final uu rtx2ld2ELZv4;
    public static final uu wdg6QnbFHrFF;
    public static final /* synthetic */ uu[] x50lh2ztY7Y5;

    static {
        uu uuVar = new uu("DEFAULT", 0);
        rtx2ld2ELZv4 = uuVar;
        uu uuVar2 = new uu("LAZY", 1);
        OPXfSBeufaJ8 = uuVar2;
        uu uuVar3 = new uu("ATOMIC", 2);
        wdg6QnbFHrFF = uuVar3;
        uu uuVar4 = new uu("UNDISPATCHED", 3);
        dgRBjINgWbAK = uuVar4;
        x50lh2ztY7Y5 = new uu[]{uuVar, uuVar2, uuVar3, uuVar4};
    }

    public static uu valueOf(String str) {
        return (uu) Enum.valueOf(uu.class, str);
    }

    public static uu[] values() {
        return (uu[]) x50lh2ztY7Y5.clone();
    }
}
