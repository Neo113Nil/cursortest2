package Y;

import E.AbstractC0005f;
import a.AbstractC0124a;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f3700i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3701a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3702b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3703c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f3704d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3705e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3706f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3707g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3708h;

    static {
        T.A.a("media3.datasource");
    }

    public k(Uri uri, int i4, byte[] bArr, Map map, long j4, long j5, String str, int i5) {
        AbstractC0124a.h(j4 >= 0);
        AbstractC0124a.h(j4 >= 0);
        AbstractC0124a.h(j5 > 0 || j5 == -1);
        uri.getClass();
        this.f3701a = uri;
        this.f3702b = i4;
        this.f3703c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f3704d = Collections.unmodifiableMap(new HashMap(map));
        this.f3705e = j4;
        this.f3706f = j5;
        this.f3707g = str;
        this.f3708h = i5;
    }

    public final k a(long j4) {
        long j5 = this.f3706f;
        long j6 = j5 != -1 ? j5 - j4 : -1L;
        if (j4 == 0 && j5 == j6) {
            return this;
        }
        return new k(this.f3701a, this.f3702b, this.f3703c, this.f3704d, this.f3705e + j4, j6, this.f3707g, this.f3708h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i4 = this.f3702b;
        if (i4 == 1) {
            str = "GET";
        } else if (i4 == 2) {
            str = "POST";
        } else {
            if (i4 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f3701a);
        sb.append(", ");
        sb.append(this.f3705e);
        sb.append(", ");
        sb.append(this.f3706f);
        sb.append(", ");
        sb.append(this.f3707g);
        sb.append(", ");
        return AbstractC0005f.o(sb, this.f3708h, "]");
    }
}
