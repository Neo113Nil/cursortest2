package f2;

import android.text.TextUtils;
import g2.C0448b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f4795b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4796c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static j f4797d;

    /* renamed from: a, reason: collision with root package name */
    public final c2.e f4798a;

    public j(c2.e eVar) {
        this.f4798a = eVar;
    }

    public final boolean a(C0448b c0448b) {
        if (TextUtils.isEmpty(c0448b.f5022c)) {
            return true;
        }
        long j = c0448b.f5025f + c0448b.f5024e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4798a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f4795b;
    }
}
