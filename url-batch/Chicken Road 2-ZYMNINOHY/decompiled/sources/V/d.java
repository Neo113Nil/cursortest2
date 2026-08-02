package V;

import W.J;
import android.os.Bundle;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3165a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f3166b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f3167c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f3168d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f3169e;

    static {
        String str = J.f3263a;
        f3165a = Integer.toString(0, 36);
        f3166b = Integer.toString(1, 36);
        f3167c = Integer.toString(2, 36);
        f3168d = Integer.toString(3, 36);
        f3169e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i4, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f3165a, spanned.getSpanStart(obj));
        bundle2.putInt(f3166b, spanned.getSpanEnd(obj));
        bundle2.putInt(f3167c, spanned.getSpanFlags(obj));
        bundle2.putInt(f3168d, i4);
        if (bundle != null) {
            bundle2.putBundle(f3169e, bundle);
        }
        return bundle2;
    }
}
