package B1;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import y1.C0760d;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final long f110b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f111c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static l f112d;

    /* renamed from: a, reason: collision with root package name */
    public final C0760d f113a;

    public l(C0760d c0760d) {
        this.f113a = c0760d;
    }

    public final boolean a(C1.a aVar) {
        if (TextUtils.isEmpty(aVar.f191c)) {
            return true;
        }
        long j4 = aVar.f194f + aVar.f193e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f113a.getClass();
        return j4 < timeUnit.toSeconds(System.currentTimeMillis()) + f110b;
    }
}
