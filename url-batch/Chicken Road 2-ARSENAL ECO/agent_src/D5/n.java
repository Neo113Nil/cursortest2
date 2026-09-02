package D5;

import a.AbstractC0219a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n[] f573f;

    static {
        n[] nVarArr = {new n("PUBLIC", 0), new n("PROTECTED", 1), new n("INTERNAL", 2), new n("PRIVATE", 3)};
        f573f = nVarArr;
        AbstractC0219a.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f573f.clone();
    }
}
