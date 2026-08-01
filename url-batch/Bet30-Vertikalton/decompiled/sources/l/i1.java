package l;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3001a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3002b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f3003c;

    static {
        f3003c = Build.VERSION.SDK_INT >= 27;
    }
}
