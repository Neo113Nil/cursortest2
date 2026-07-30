package L4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1683a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f1684b;

    public a(ClassLoader loader, int i2) {
        this.f1683a = i2;
        switch (i2) {
            case 1:
                Intrinsics.checkNotNullParameter(loader, "loader");
                this.f1684b = loader;
                break;
            default:
                this.f1684b = loader;
                break;
        }
    }

    public String toString() {
        switch (this.f1683a) {
            case 0:
                return "ServiceLoaderComponentLoader{classLoader=" + this.f1684b + "}";
            default:
                return super.toString();
        }
    }
}
