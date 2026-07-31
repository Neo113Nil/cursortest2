package g5;

import java.util.Random;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f implements InterfaceC0400c {

    /* renamed from: f, reason: collision with root package name */
    public static final f f4293f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f4294g;

    static {
        f fVar = new f("INSTANCE", 0);
        f4293f = fVar;
        f4294g = new f[]{fVar};
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            Random random = Q4.a.f2008f;
        }
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f4294g.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "RandomIdGenerator{}";
    }
}
