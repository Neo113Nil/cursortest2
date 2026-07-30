package I6;

import D6.E;
import D6.u;
import T6.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class j extends E {

    /* renamed from: e, reason: collision with root package name */
    public final String f1305e;

    /* renamed from: i, reason: collision with root package name */
    public final long f1306i;

    /* renamed from: l, reason: collision with root package name */
    public final q f1307l;

    public j(String str, long j, q source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f1305e = str;
        this.f1306i = j;
        this.f1307l = source;
    }

    @Override // D6.E
    public final long a() {
        return this.f1306i;
    }

    @Override // D6.E
    public final u d() {
        String str = this.f1305e;
        if (str == null) {
            return null;
        }
        Regex regex = u.f570b;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return P0.f.p(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // D6.E
    public final T6.h g() {
        return this.f1307l;
    }
}
