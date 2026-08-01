package androidx.activity;

import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class z extends u2.d implements t2.a {

    /* renamed from: f, reason: collision with root package name */
    public static final z f146f = new z();

    @Override // t2.a
    public final Object a() {
        try {
            InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
            InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
            InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
            return new a0();
        } catch (NoSuchFieldException unused) {
            return a0.f82f;
        }
    }
}
