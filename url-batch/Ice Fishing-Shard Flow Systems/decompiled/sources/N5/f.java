package N5;

import java.util.Random;
import x5.EnumC1011a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final f f1848d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f1849e;

    static {
        f fVar = new f("INSTANCE", 0);
        f1848d = fVar;
        f1849e = new f[]{fVar};
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            Random random = EnumC1011a.f8372d;
        }
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f1849e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "RandomIdGenerator{}";
    }
}
