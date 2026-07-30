package f4;

import B2.N;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f37775c;

    /* renamed from: a, reason: collision with root package name */
    public N f37776a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f37777b;

    public s(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f37777b = scheduledThreadPoolExecutor;
    }

    public final synchronized r a() {
        String str;
        r rVar;
        N n9 = this.f37776a;
        synchronized (((ArrayDeque) n9.f199x)) {
            str = (String) ((ArrayDeque) n9.f199x).peek();
        }
        Pattern pattern = r.f37771d;
        rVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                rVar = new r(split[0], split[1]);
            }
        }
        return rVar;
    }
}
