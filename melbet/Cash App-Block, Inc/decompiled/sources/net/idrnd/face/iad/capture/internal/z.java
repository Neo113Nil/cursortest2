package net.idrnd.face.iad.capture.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class z {
    public static final z a;
    public static final z b;
    public static final z c;
    public static final z d;
    public static final z e;
    public static final z f;
    public static final z g;
    public static final z h;
    public static final z i;
    public static final z j;
    public static final z k;
    public static final z l;
    public static final z m;
    public static final z n;
    public static final z o;
    public static final z p;
    public static final z q;
    public static final /* synthetic */ z[] r;

    static {
        z zVar = new z("BrandStartsWithGeneric", 0);
        a = zVar;
        z zVar2 = new z("FingerprintStartsWithGeneric", 1);
        b = zVar2;
        z zVar3 = new z("FingerprintStartsWithUnknown", 2);
        c = zVar3;
        z zVar4 = new z("HardwareContainsGoldfish", 3);
        d = zVar4;
        z zVar5 = new z("HardwareContainsRanchu", 4);
        e = zVar5;
        z zVar6 = new z("HardwareContainsGoogleSdk", 5);
        f = zVar6;
        z zVar7 = new z("ModelContainsEmulator", 6);
        g = zVar7;
        z zVar8 = new z("ModelContainsAndroidSdk", 7);
        h = zVar8;
        z zVar9 = new z("ManufacturerContainsGenymotion", 8);
        i = zVar9;
        z zVar10 = new z("ProductContainsSdkGoogle", 9);
        j = zVar10;
        z zVar11 = new z("ProductContainsGoogleSdk", 10);
        k = zVar11;
        z zVar12 = new z("ProductContainsSdk", 11);
        l = zVar12;
        z zVar13 = new z("ProductContainsSdkX86", 12);
        m = zVar13;
        z zVar14 = new z("ProductContainsSdkGphone64Arm64", 13);
        n = zVar14;
        z zVar15 = new z("ProductContainsVbox86p", 14);
        o = zVar15;
        z zVar16 = new z("ProductContainsEmulator", 15);
        p = zVar16;
        z zVar17 = new z("ProductContainsSimulator", 16);
        q = zVar17;
        r = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9, zVar10, zVar11, zVar12, zVar13, zVar14, zVar15, zVar16, zVar17};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) r.clone();
    }
}
