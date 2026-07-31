package u0;

import java.util.Arrays;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3455b {

    /* renamed from: b, reason: collision with root package name */
    public static final C3455b f46375b = new C3455b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C3455b f46376c = new C3455b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C3455b f46377d = new C3455b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C3455b f46378e = new C3455b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C3455b f46379f = new C3455b(4);

    /* renamed from: a, reason: collision with root package name */
    private final int f46380a;

    private C3455b(int i4) {
        this.f46380a = i4;
    }

    private int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3455b.class == obj.getClass() && this.f46380a == ((C3455b) obj).f46380a;
    }

    public int hashCode() {
        return a(Integer.valueOf(this.f46380a));
    }
}
