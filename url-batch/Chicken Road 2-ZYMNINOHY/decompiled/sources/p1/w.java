package p1;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f14801a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f14802b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f14803c;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f14801a = true;
        f14802b = true;
        f14803c = i4 >= 28;
    }
}
