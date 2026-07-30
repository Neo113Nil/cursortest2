package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ni {
    public static final ni d;
    public static final ni e;
    public static final /* synthetic */ ni[] g;

    /* JADX INFO: Fake field, exist only in values array */
    ni EF1;

    static {
        ni niVar = new ni("Background", 0);
        ni niVar2 = new ni("Error", 1);
        ni niVar3 = new ni("ErrorContainer", 2);
        ni niVar4 = new ni("InverseOnSurface", 3);
        ni niVar5 = new ni("InversePrimary", 4);
        ni niVar6 = new ni("InverseSurface", 5);
        ni niVar7 = new ni("OnBackground", 6);
        ni niVar8 = new ni("OnError", 7);
        ni niVar9 = new ni("OnErrorContainer", 8);
        ni niVar10 = new ni("OnPrimary", 9);
        ni niVar11 = new ni("OnPrimaryContainer", 10);
        ni niVar12 = new ni("OnPrimaryFixed", 11);
        ni niVar13 = new ni("OnPrimaryFixedVariant", 12);
        ni niVar14 = new ni("OnSecondary", 13);
        ni niVar15 = new ni("OnSecondaryContainer", 14);
        ni niVar16 = new ni("OnSecondaryFixed", 15);
        ni niVar17 = new ni("OnSecondaryFixedVariant", 16);
        ni niVar18 = new ni("OnSurface", 17);
        ni niVar19 = new ni("OnSurfaceVariant", 18);
        ni niVar20 = new ni("OnTertiary", 19);
        ni niVar21 = new ni("OnTertiaryContainer", 20);
        ni niVar22 = new ni("OnTertiaryFixed", 21);
        ni niVar23 = new ni("OnTertiaryFixedVariant", 22);
        ni niVar24 = new ni("Outline", 23);
        ni niVar25 = new ni("OutlineVariant", 24);
        ni niVar26 = new ni("Primary", 25);
        d = niVar26;
        ni niVar27 = new ni("PrimaryContainer", 26);
        ni niVar28 = new ni("PrimaryFixed", 27);
        ni niVar29 = new ni("PrimaryFixedDim", 28);
        ni niVar30 = new ni("Scrim", 29);
        ni niVar31 = new ni("Secondary", 30);
        ni niVar32 = new ni("SecondaryContainer", 31);
        e = niVar32;
        g = new ni[]{niVar, niVar2, niVar3, niVar4, niVar5, niVar6, niVar7, niVar8, niVar9, niVar10, niVar11, niVar12, niVar13, niVar14, niVar15, niVar16, niVar17, niVar18, niVar19, niVar20, niVar21, niVar22, niVar23, niVar24, niVar25, niVar26, niVar27, niVar28, niVar29, niVar30, niVar31, niVar32, new ni("SecondaryFixed", 32), new ni("SecondaryFixedDim", 33), new ni("Surface", 34), new ni("SurfaceBright", 35), new ni("SurfaceContainer", 36), new ni("SurfaceContainerHigh", 37), new ni("SurfaceContainerHighest", 38), new ni("SurfaceContainerLow", 39), new ni("SurfaceContainerLowest", 40), new ni("SurfaceDim", 41), new ni("SurfaceTint", 42), new ni("SurfaceVariant", 43), new ni("Tertiary", 44), new ni("TertiaryContainer", 45), new ni("TertiaryFixed", 46), new ni("TertiaryFixedDim", 47)};
    }

    public static ni valueOf(String str) {
        return (ni) Enum.valueOf(ni.class, str);
    }

    public static ni[] values() {
        return (ni[]) g.clone();
    }
}
