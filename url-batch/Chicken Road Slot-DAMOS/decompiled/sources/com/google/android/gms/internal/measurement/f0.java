package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f2268a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f2269b;

    static {
        i0 i0Var;
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                i0Var = new i0();
                break;
            }
            i0Var = null;
            try {
                i0Var = (i0) Class.forName(f2268a[i3]).asSubclass(i0.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (i0Var != null) {
                break;
            } else {
                i3++;
            }
        }
        f2269b = i0Var;
    }
}
