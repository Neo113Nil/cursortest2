package k3;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: i, reason: collision with root package name */
    public static final u f7478i;

    /* renamed from: j, reason: collision with root package name */
    public static final u f7479j;

    /* renamed from: k, reason: collision with root package name */
    public static final u f7480k;

    /* renamed from: l, reason: collision with root package name */
    public static final u f7481l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ u[] f7482m;

    /* renamed from: d, reason: collision with root package name */
    public final char f7483d;

    /* renamed from: e, reason: collision with root package name */
    public final char f7484e;

    static {
        u uVar = new u("OBJ", 0, '{', '}');
        f7478i = uVar;
        u uVar2 = new u("LIST", 1, '[', ']');
        f7479j = uVar2;
        u uVar3 = new u("MAP", 2, '{', '}');
        f7480k = uVar3;
        u uVar4 = new u("POLY_OBJ", 3, '[', ']');
        f7481l = uVar4;
        u[] entries = {uVar, uVar2, uVar3, uVar4};
        f7482m = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public u(String str, int i2, char c4, char c5) {
        this.f7483d = c4;
        this.f7484e = c5;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f7482m.clone();
    }
}
