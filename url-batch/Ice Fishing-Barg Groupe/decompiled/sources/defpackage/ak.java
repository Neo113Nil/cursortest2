package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ak {
    public static final ak OPXfSBeufaJ8;
    public static final /* synthetic */ ak[] dgRBjINgWbAK;
    public static final ak rtx2ld2ELZv4;
    public static final ak wdg6QnbFHrFF;

    static {
        ak akVar = new ak("NONE", 0);
        rtx2ld2ELZv4 = akVar;
        ak akVar2 = new ak("ALL_JSON_OBJECTS", 1);
        OPXfSBeufaJ8 = akVar2;
        ak akVar3 = new ak("POLYMORPHIC", 2);
        wdg6QnbFHrFF = akVar3;
        dgRBjINgWbAK = new ak[]{akVar, akVar2, akVar3};
    }

    public static ak valueOf(String str) {
        return (ak) Enum.valueOf(ak.class, str);
    }

    public static ak[] values() {
        return (ak[]) dgRBjINgWbAK.clone();
    }
}
