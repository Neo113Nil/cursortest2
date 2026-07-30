package Z3;

import a4.C0428a;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f4272b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4273c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static j f4274d;

    /* renamed from: a, reason: collision with root package name */
    public final C3.e f4275a;

    public j(C3.e eVar) {
        this.f4275a = eVar;
    }

    public final boolean a(C0428a c0428a) {
        if (TextUtils.isEmpty(c0428a.f4378c)) {
            return true;
        }
        long j9 = c0428a.f4381f + c0428a.f4380e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4275a.getClass();
        return j9 < timeUnit.toSeconds(System.currentTimeMillis()) + f4272b;
    }
}
