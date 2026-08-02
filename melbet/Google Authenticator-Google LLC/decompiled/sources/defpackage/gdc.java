package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gdc {
    public static final gdc a;
    public static final gdc b;
    public static final gdc c;
    public static final gdc d;
    public static final gdc e;
    private static final /* synthetic */ gdc[] f;

    static {
        gdc gdcVar = new gdc("PROD", 0);
        a = gdcVar;
        gdc gdcVar2 = new gdc("DEV", 1);
        b = gdcVar2;
        gdc gdcVar3 = new gdc("ROBOLECTRIC", 2);
        c = gdcVar3;
        gdc gdcVar4 = new gdc("EMULATOR", 3);
        d = gdcVar4;
        gdc gdcVar5 = new gdc("UNKNOWN", 4);
        e = gdcVar5;
        f = new gdc[]{gdcVar, gdcVar2, gdcVar3, gdcVar4, gdcVar5};
    }

    public static gdc[] values() {
        return (gdc[]) f.clone();
    }
}
