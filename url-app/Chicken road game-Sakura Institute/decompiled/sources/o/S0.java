package o;

import G.W0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public long f8711a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8712b;

    public S0(z3.z source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f8712b = source;
        this.f8711a = 262144L;
    }

    public m3.l a() {
        W0 w02 = new W0(4);
        while (true) {
            String line = ((z3.z) this.f8712b).r(this.f8711a);
            this.f8711a -= line.length();
            if (line.length() == 0) {
                return w02.b();
            }
            Intrinsics.checkNotNullParameter(line, "line");
            int u4 = kotlin.text.y.u(line, ':', 1, false, 4);
            if (u4 != -1) {
                String substring = line.substring(0, u4);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(u4 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                w02.a(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                w02.a("", substring3);
            } else {
                w02.a("", line);
            }
        }
    }

    public S0(N n2) {
        this.f8712b = n2;
        this.f8711a = 0L;
    }
}
