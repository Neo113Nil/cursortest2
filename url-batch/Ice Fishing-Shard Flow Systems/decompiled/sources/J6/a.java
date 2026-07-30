package J6;

import T6.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1391a;

    /* renamed from: b, reason: collision with root package name */
    public long f1392b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1393c;

    public a(q source) {
        this.f1391a = 0;
        Intrinsics.checkNotNullParameter(source, "source");
        this.f1393c = source;
        this.f1392b = 262144L;
    }

    public int a(int i2) {
        a aVar = (a) this.f1393c;
        if (aVar == null) {
            return i2 >= 64 ? Long.bitCount(this.f1392b) : Long.bitCount(this.f1392b & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f1392b & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f1392b) + aVar.a(i2 - 64);
    }

    public boolean b(int i2) {
        if (i2 < 64) {
            return (this.f1392b & (1 << i2)) != 0;
        }
        if (((a) this.f1393c) == null) {
            this.f1393c = new a();
        }
        return ((a) this.f1393c).b(i2 - 64);
    }

    public D6.q c() {
        C4.d dVar = new C4.d(2);
        while (true) {
            String line = ((T6.h) this.f1393c).u(this.f1392b);
            this.f1392b -= line.length();
            if (line.length() == 0) {
                return dVar.d();
            }
            Intrinsics.checkNotNullParameter(line, "line");
            int x7 = StringsKt.x(line, ':', 1, 4);
            if (x7 != -1) {
                String substring = line.substring(0, x7);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String substring2 = line.substring(x7 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                dVar.a(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                dVar.a("", substring3);
            } else {
                dVar.a("", line);
            }
        }
    }

    public void d() {
        this.f1392b = 0L;
        a aVar = (a) this.f1393c;
        if (aVar != null) {
            aVar.d();
        }
    }

    public String toString() {
        switch (this.f1391a) {
            case 1:
                if (((a) this.f1393c) == null) {
                    return Long.toBinaryString(this.f1392b);
                }
                return ((a) this.f1393c).toString() + "xx" + Long.toBinaryString(this.f1392b);
            default:
                return super.toString();
        }
    }

    public a() {
        this.f1391a = 1;
        this.f1392b = 0L;
    }
}
