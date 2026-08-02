package V0;

import java.util.List;
import v2.I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final I f3182a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3183b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3184c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3185d;

    public a(long j4, long j5, List list) {
        this.f3182a = I.k(list);
        this.f3183b = j4;
        this.f3184c = j5;
        long j6 = -9223372036854775807L;
        if (j4 != -9223372036854775807L && j5 != -9223372036854775807L) {
            j6 = j4 + j5;
        }
        this.f3185d = j6;
    }
}
