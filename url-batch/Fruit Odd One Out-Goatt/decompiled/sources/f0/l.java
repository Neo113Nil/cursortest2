package f0;

import java.io.IOException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final /* synthetic */ class l {
    public static /* synthetic */ void a() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void b(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void c(String str, int i2) {
        throw new IndexOutOfBoundsException(str + i2);
    }

    public static /* synthetic */ void d(String str, int i2, Object obj) {
        throw new IllegalArgumentException((str + i2 + obj).toString());
    }

    public static /* synthetic */ void e(String str, int i2, Object obj, int i3) {
        throw new IllegalArgumentException((str + i2 + obj + i3).toString());
    }

    public static /* synthetic */ void f(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void g(String str, int i2, Object obj, int i3) {
        throw new IndexOutOfBoundsException(str + i2 + obj + i3);
    }

    public static /* synthetic */ void h(String str, Object obj) {
        throw new NoSuchFieldException(str + obj);
    }

    public static /* synthetic */ void i(String str, Object obj) {
        throw new IOException(str + obj);
    }
}
