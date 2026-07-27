package A;

import i.AbstractC0662C;
import k.C0740f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s.C1103g;
import s0.P0;

/* renamed from: A.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016l implements s.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a;

    /* renamed from: b, reason: collision with root package name */
    public int f163b;

    /* renamed from: c, reason: collision with root package name */
    public Object f164c;

    /* renamed from: d, reason: collision with root package name */
    public Object f165d;

    public /* synthetic */ C0016l(int i2) {
        this.f162a = i2;
    }

    public void a(int i2, l2.g gVar) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "size should be >=0, but was ").toString());
        }
        if (i2 == 0) {
            return;
        }
        C1103g c1103g = new C1103g(this.f163b, i2, gVar);
        this.f163b += i2;
        ((I.d) this.f164c).b(c1103g);
    }

    @Override // s.s
    public int b(Object obj) {
        i.v vVar = (i.v) this.f164c;
        int c4 = vVar.c(obj);
        if (c4 >= 0) {
            return vVar.f6970c[c4];
        }
        return -1;
    }

    public void c(int i2) {
        if (i2 < 0 || i2 >= this.f163b) {
            StringBuilder o4 = AbstractC0017m.o(i2, "Index ", ", size ");
            o4.append(this.f163b);
            throw new IndexOutOfBoundsException(o4.toString());
        }
    }

    public C1103g d(int i2) {
        c(i2);
        C1103g c1103g = (C1103g) this.f165d;
        if (c1103g != null) {
            int i4 = c1103g.f9931b;
            int i5 = c1103g.f9930a;
            if (i2 < i4 + i5 && i5 <= i2) {
                return c1103g;
            }
        }
        I.d dVar = (I.d) this.f164c;
        C1103g c1103g2 = (C1103g) dVar.f3330d[m3.s.c(i2, dVar)];
        this.f165d = c1103g2;
        return c1103g2;
    }

    public String e() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.f163b + 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = ((Object[]) this.f164c)[i4];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!Intrinsics.a(serialDescriptor.i(), g3.i.f6808i)) {
                    int i5 = ((int[]) this.f165d)[i4];
                    if (i5 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.a(i5));
                    }
                } else if (((int[]) this.f165d)[i4] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f165d)[i4]);
                    sb.append("]");
                }
            } else if (obj != k3.i.f7441a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public String toString() {
        switch (this.f162a) {
            case 2:
                return e();
            case 3:
                StringBuilder sb = new StringBuilder();
                if (((m3.t) this.f164c) == m3.t.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f163b);
                sb.append(' ');
                sb.append((String) this.f165d);
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0016l(m3.t protocol, int i2, String message) {
        this.f162a = 3;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f164c = protocol;
        this.f163b = i2;
        this.f165d = message;
    }

    public C0016l(IntRange intRange, r.g gVar) {
        this.f162a = 5;
        C0016l c0016l = gVar.f9453a;
        int i2 = intRange.f7505d;
        if (i2 >= 0) {
            int min = Math.min(intRange.f7506e, c0016l.f163b - 1);
            if (min < i2) {
                i.v vVar = AbstractC0662C.f6889a;
                Intrinsics.d(vVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                this.f164c = vVar;
                this.f165d = new Object[0];
                this.f163b = 0;
                return;
            }
            int i4 = (min - i2) + 1;
            this.f165d = new Object[i4];
            this.f163b = i2;
            i.v vVar2 = new i.v(i4);
            C0740f c0740f = new C0740f(i2, min, vVar2, this);
            c0016l.c(i2);
            c0016l.c(min);
            if (min >= i2) {
                I.d dVar = (I.d) c0016l.f164c;
                int c4 = m3.s.c(i2, dVar);
                int i5 = ((C1103g) dVar.f3330d[c4]).f9930a;
                while (i5 <= min) {
                    C1103g c1103g = (C1103g) dVar.f3330d[c4];
                    c0740f.invoke(c1103g);
                    i5 += c1103g.f9931b;
                    c4++;
                }
                this.f164c = vVar2;
                return;
            }
            throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i2 + ')').toString());
        }
        throw new IllegalStateException("negative nearestRange.first");
    }

    public C0016l() {
        this.f162a = 4;
        this.f164c = new I.d(new C1103g[16]);
    }

    public C0016l(P0 p02) {
        this.f162a = 0;
        this.f164c = p02;
    }
}
