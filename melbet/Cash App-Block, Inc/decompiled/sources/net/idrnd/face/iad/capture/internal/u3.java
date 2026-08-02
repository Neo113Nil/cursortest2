package net.idrnd.face.iad.capture.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u3 {
    public static final u3 a;
    public static final /* synthetic */ u3[] c;

    static {
        u3 u3Var = new u3("Face", 0);
        a = u3Var;
        c = new u3[]{u3Var, new u3("Document", 1)};
    }

    public static u3 valueOf(String str) {
        return (u3) Enum.valueOf(u3.class, str);
    }

    public static u3[] values() {
        return (u3[]) c.clone();
    }
}
