package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.fc.barca.football.R;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1093o {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f9861b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C1093o f9862c;

    /* renamed from: a, reason: collision with root package name */
    public P f9863a;

    /* JADX WARN: Type inference failed for: r3v11, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int[], java.io.Serializable] */
    public static synchronized void b() {
        synchronized (C1093o.class) {
            if (f9862c == null) {
                C1093o c1093o = new C1093o();
                f9862c = c1093o;
                c1093o.f9863a = P.b();
                P p3 = f9862c.f9863a;
                F1.c cVar = new F1.c();
                cVar.f486a = new int[]{2131165267, 2131165265, 2131165184};
                cVar.f487b = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
                cVar.f488c = new int[]{2131165264, 2131165266, 2131165201, R.drawable.abc_text_cursor_material, 2131165258, 2131165260, 2131165262, 2131165259, 2131165261, 2131165263};
                cVar.f489d = new int[]{2131165239, R.drawable.abc_cab_background_internal_bg, 2131165238};
                cVar.f490e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                cVar.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (p3) {
                    p3.f9762e = cVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, j0 j0Var, int[] iArr) {
        PorterDuff.Mode mode = P.f;
        if (AbstractC1103z.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = j0Var.f9840d;
        if (!z && !j0Var.f9839c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? j0Var.f9837a : null;
        PorterDuff.Mode mode2 = j0Var.f9839c ? j0Var.f9838b : P.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = P.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i3) {
        return this.f9863a.c(context, i3);
    }
}
