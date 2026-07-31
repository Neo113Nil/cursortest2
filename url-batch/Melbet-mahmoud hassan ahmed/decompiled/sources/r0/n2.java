package r0;

import java.io.IOException;

/* loaded from: classes.dex */
public class n2 extends IOException {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20821f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20822g;

    protected n2(String str, Throwable th, boolean z6, int i7) {
        super(str, th);
        this.f20821f = z6;
        this.f20822g = i7;
    }

    public static n2 a(String str, Throwable th) {
        return new n2(str, th, true, 1);
    }

    public static n2 b(String str, Throwable th) {
        return new n2(str, th, true, 0);
    }

    public static n2 c(String str, Throwable th) {
        return new n2(str, th, true, 4);
    }

    public static n2 d(String str) {
        return new n2(str, null, false, 1);
    }
}
