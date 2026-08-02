package J0;

import T.C0096n;
import T.C0097o;
import T.D;
import T.F;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements D {

    /* renamed from: g, reason: collision with root package name */
    public static final C0097o f1143g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0097o f1144h;

    /* renamed from: a, reason: collision with root package name */
    public final String f1145a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1146b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1147c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1148d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1149e;

    /* renamed from: f, reason: collision with root package name */
    public int f1150f;

    static {
        C0096n c0096n = new C0096n();
        c0096n.f2831m = F.n("application/id3");
        f1143g = new C0097o(c0096n);
        C0096n c0096n2 = new C0096n();
        c0096n2.f2831m = F.n("application/x-scte35");
        f1144h = new C0097o(c0096n2);
    }

    public a(String str, String str2, long j4, long j5, byte[] bArr) {
        this.f1145a = str;
        this.f1146b = str2;
        this.f1147c = j4;
        this.f1148d = j5;
        this.f1149e = bArr;
    }

    @Override // T.D
    public final C0097o a() {
        String str = this.f1145a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f1144h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f1143g;
            default:
                return null;
        }
    }

    @Override // T.D
    public final byte[] b() {
        if (a() != null) {
            return this.f1149e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f1147c == aVar.f1147c && this.f1148d == aVar.f1148d && Objects.equals(this.f1145a, aVar.f1145a) && Objects.equals(this.f1146b, aVar.f1146b) && Arrays.equals(this.f1149e, aVar.f1149e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1150f == 0) {
            String str = this.f1145a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f1146b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j4 = this.f1147c;
            int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f1148d;
            this.f1150f = Arrays.hashCode(this.f1149e) + ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31);
        }
        return this.f1150f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f1145a + ", id=" + this.f1148d + ", durationMs=" + this.f1147c + ", value=" + this.f1146b;
    }
}
