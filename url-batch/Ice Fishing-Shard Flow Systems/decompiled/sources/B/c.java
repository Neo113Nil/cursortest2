package B;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f146e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f147a;

    /* renamed from: b, reason: collision with root package name */
    public final int f148b;

    /* renamed from: c, reason: collision with root package name */
    public final int f149c;

    /* renamed from: d, reason: collision with root package name */
    public final int f150d;

    public c(int i2, int i5, int i7, int i8) {
        this.f147a = i2;
        this.f148b = i5;
        this.f149c = i7;
        this.f150d = i8;
    }

    public static c a(int i2, int i5, int i7, int i8) {
        return (i2 == 0 && i5 == 0 && i7 == 0 && i8 == 0) ? f146e : new c(i2, i5, i7, i8);
    }

    public static c b(Insets insets) {
        int i2;
        int i5;
        int i7;
        int i8;
        i2 = insets.left;
        i5 = insets.top;
        i7 = insets.right;
        i8 = insets.bottom;
        return a(i2, i5, i7, i8);
    }

    public final Insets c() {
        return b.b(this.f147a, this.f148b, this.f149c, this.f150d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f150d == cVar.f150d && this.f147a == cVar.f147a && this.f149c == cVar.f149c && this.f148b == cVar.f148b;
    }

    public final int hashCode() {
        return (((((this.f147a * 31) + this.f148b) * 31) + this.f149c) * 31) + this.f150d;
    }

    public final String toString() {
        return "Insets{left=" + this.f147a + ", top=" + this.f148b + ", right=" + this.f149c + ", bottom=" + this.f150d + '}';
    }
}
