package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.ra;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f6141b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static o f6142c;

    /* renamed from: a, reason: collision with root package name */
    public j1 f6143a;

    public static synchronized void b() {
        synchronized (o.class) {
            if (f6142c == null) {
                o oVar = new o();
                f6142c = oVar;
                oVar.f6143a = j1.c();
                j1 j1Var = f6142c.f6143a;
                ra raVar = new ra();
                raVar.f2737a = new int[]{2131165261, 2131165259, 2131165185};
                raVar.f2738b = new int[]{2131165209, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                raVar.f2739c = new int[]{2131165258, 2131165260, 2131165202, R.drawable.abc_text_cursor_material, 2131165255, 2131165256, 2131165257};
                raVar.f2740d = new int[]{2131165234, R.drawable.abc_cab_background_internal_bg, 2131165233};
                raVar.f2741e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                raVar.f2742f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (j1Var) {
                    j1Var.f6116e = raVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, q1 q1Var, int[] iArr) {
        PorterDuff.Mode mode = j1.f6110f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = q1Var.f6174d;
        if (!z10 && !q1Var.f6173c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z10 ? q1Var.f6171a : null;
        PorterDuff.Mode mode2 = q1Var.f6173c ? q1Var.f6172b : j1.f6110f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = j1.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i3) {
        return this.f6143a.d(context, i3);
    }
}
