package net.idrnd.face.iad.capture.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class u {
    public static final u a;
    public static final /* synthetic */ u[] b;

    static {
        u uVar = new u("NineSquareGrid", 0);
        a = uVar;
        b = new u[]{uVar};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) b.clone();
    }
}
