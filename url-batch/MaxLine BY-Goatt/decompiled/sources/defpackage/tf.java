package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tf {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static tf c;
    public p92 a;

    public static synchronized tf a() {
        tf tfVar;
        synchronized (tf.class) {
            try {
                if (c == null) {
                    c();
                }
                tfVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tfVar;
    }

    public static synchronized void c() {
        synchronized (tf.class) {
            if (c == null) {
                tf tfVar = new tf();
                c = tfVar;
                tfVar.a = p92.b();
                p92 p92Var = c.a;
                sf sfVar = new sf();
                sfVar.a = new int[]{2131230797, 2131230795, 2131230721};
                sfVar.b = new int[]{2131230745, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                sfVar.c = new int[]{2131230794, 2131230796, 2131230738, R.drawable.abc_text_cursor_material, 2131230791, 2131230792, 2131230793};
                sfVar.d = new int[]{2131230770, R.drawable.abc_cab_background_internal_bg, 2131230769};
                sfVar.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                sfVar.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (p92Var) {
                    p92Var.e = sfVar;
                }
            }
        }
    }

    public static void d(Drawable drawable, e10 e10Var, int[] iArr) {
        PorterDuff.Mode mode = p92.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = e10Var.b;
        if (!z && !e10Var.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) e10Var.c : null;
        PorterDuff.Mode mode2 = e10Var.a ? (PorterDuff.Mode) e10Var.d : p92.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = p92.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
