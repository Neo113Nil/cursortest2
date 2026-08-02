package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class u {
    public static final u LENIENT;
    public static final u SMART;
    public static final u STRICT;
    public static final /* synthetic */ u[] a;

    static {
        u uVar = new u("STRICT", 0);
        STRICT = uVar;
        u uVar2 = new u("SMART", 1);
        SMART = uVar2;
        u uVar3 = new u("LENIENT", 2);
        LENIENT = uVar3;
        a = new u[]{uVar, uVar2, uVar3};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) a.clone();
    }
}
