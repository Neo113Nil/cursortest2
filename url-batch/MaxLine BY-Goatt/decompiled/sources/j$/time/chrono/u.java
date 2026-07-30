package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class u implements n {
    public static final u BCE;
    public static final u CE;
    public static final /* synthetic */ u[] a;

    static {
        u uVar = new u("BCE", 0);
        BCE = uVar;
        u uVar2 = new u("CE", 1);
        CE = uVar2;
        a = new u[]{uVar, uVar2};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) a.clone();
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return ordinal();
    }
}
