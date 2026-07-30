package R;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2368a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2369b;

    public e(SharedPreferences prefs, Set set) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f2368a = prefs;
        this.f2369b = set;
    }
}
