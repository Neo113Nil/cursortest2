package a0;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final i1 f106a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        q6.i.d(lowerCase, "toLowerCase(...)");
        f106a = lowerCase.equals("robolectric") ? new i1() : null;
    }
}
