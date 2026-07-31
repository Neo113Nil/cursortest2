package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f4401b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static s f4402c;

    /* renamed from: a, reason: collision with root package name */
    public q1 f4403a;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e8;
        synchronized (s.class) {
            e8 = q1.e(i, mode);
        }
        return e8;
    }

    public static synchronized void c() {
        synchronized (s.class) {
            if (f4402c == null) {
                s sVar = new s();
                f4402c = sVar;
                sVar.f4403a = q1.b();
                q1 q1Var = f4402c.f4403a;
                r rVar = new r();
                synchronized (q1Var) {
                    q1Var.f4392e = rVar;
                }
            }
        }
    }

    public static void d(Drawable drawable, x1 x1Var, int[] iArr) {
        PorterDuff.Mode mode = q1.f4385f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = x1Var.f4455d;
        if (!z3 && !x1Var.f4454c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z3 ? x1Var.f4452a : null;
        PorterDuff.Mode mode2 = x1Var.f4454c ? x1Var.f4453b : q1.f4385f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = q1.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.f4403a.c(context, i);
    }
}
