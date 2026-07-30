package c8;

import y7.C5256b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C5256b f5804A;

    /* renamed from: v, reason: collision with root package name */
    public static final u f5805v;

    /* renamed from: w, reason: collision with root package name */
    public static final u f5806w;

    /* renamed from: x, reason: collision with root package name */
    public static final u f5807x;

    /* renamed from: y, reason: collision with root package name */
    public static final u f5808y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ u[] f5809z;

    /* renamed from: n, reason: collision with root package name */
    public final char f5810n;

    /* renamed from: u, reason: collision with root package name */
    public final char f5811u;

    static {
        u uVar = new u("OBJ", 0, '{', '}');
        f5805v = uVar;
        u uVar2 = new u("LIST", 1, '[', ']');
        f5806w = uVar2;
        u uVar3 = new u("MAP", 2, '{', '}');
        f5807x = uVar3;
        u uVar4 = new u("POLY_OBJ", 3, '[', ']');
        f5808y = uVar4;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        f5809z = uVarArr;
        f5804A = W2.e.d(uVarArr);
    }

    public u(String str, int i, char c4, char c9) {
        this.f5810n = c4;
        this.f5811u = c9;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f5809z.clone();
    }
}
