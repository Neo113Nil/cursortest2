package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f4951a = new u0();

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f4952b;

    static {
        w0 w0Var = null;
        try {
            w0Var = (w0) p1.m.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4952b = w0Var;
    }

    public static final void a(int i4, ArrayList views) {
        kotlin.jvm.internal.i.e(views, "views");
        int size = views.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = views.get(i5);
            i5++;
            ((View) obj).setVisibility(i4);
        }
    }
}
