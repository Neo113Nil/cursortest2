package n2;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3267b {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3267b f41379c = new EnumC3267b("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3267b f41380d = new EnumC3267b("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3267b f41381e = new EnumC3267b("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3267b f41382f = new EnumC3267b("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3267b f41383g = new EnumC3267b("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3267b f41384h = new EnumC3267b("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC3267b f41385i = new EnumC3267b("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC3267b[] f41386j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f41387k;

    /* renamed from: b, reason: collision with root package name */
    private final TimeUnit f41388b;

    static {
        EnumC3267b[] c4 = c();
        f41386j = c4;
        f41387k = AbstractC1372b.a(c4);
    }

    private EnumC3267b(String str, int i4, TimeUnit timeUnit) {
        this.f41388b = timeUnit;
    }

    private static final /* synthetic */ EnumC3267b[] c() {
        return new EnumC3267b[]{f41379c, f41380d, f41381e, f41382f, f41383g, f41384h, f41385i};
    }

    public static EnumC3267b valueOf(String str) {
        return (EnumC3267b) Enum.valueOf(EnumC3267b.class, str);
    }

    public static EnumC3267b[] values() {
        return (EnumC3267b[]) f41386j.clone();
    }

    public final TimeUnit d() {
        return this.f41388b;
    }
}
