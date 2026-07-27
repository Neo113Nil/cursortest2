package P2;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f3788d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final c f3789e = G2.b.f3169a.b();

    @Metadata
    public static final class a extends c implements Serializable {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Override // P2.c
        public final int a(int i2) {
            return c.f3789e.a(i2);
        }

        @Override // P2.c
        public final int b() {
            return c.f3789e.b();
        }

        @Override // P2.c
        public final int c() {
            return c.f3789e.c();
        }

        @Override // P2.c
        public final int d() {
            return c.f3789e.d();
        }
    }

    public abstract int a(int i2);

    public int b() {
        return a(32);
    }

    public int c() {
        return d();
    }

    public int d() {
        int b4;
        int i2;
        do {
            b4 = b() >>> 1;
            i2 = b4 % 2147418112;
        } while ((b4 - i2) + 2147418111 < 0);
        return i2;
    }
}
