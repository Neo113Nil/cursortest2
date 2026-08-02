package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.rockchicken.pump.up.road.R;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1227n {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f14049b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C1227n f14050c;

    /* renamed from: a, reason: collision with root package name */
    public C1190N f14051a;

    public static synchronized void b() {
        synchronized (C1227n.class) {
            if (f14050c == null) {
                C1227n c1227n = new C1227n();
                f14050c = c1227n;
                c1227n.f14051a = C1190N.b();
                C1190N c1190n = f14050c.f14051a;
                L1.h hVar = new L1.h();
                hVar.f1633a = new int[]{2131165267, 2131165265, 2131165184};
                hVar.f1634b = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
                hVar.f1635c = new int[]{2131165264, 2131165266, 2131165201, R.drawable.abc_text_cursor_material, 2131165258, 2131165260, 2131165262, 2131165259, 2131165261, 2131165263};
                hVar.f1636d = new int[]{2131165239, R.drawable.abc_cab_background_internal_bg, 2131165238};
                hVar.f1637e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                hVar.f1638f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                synchronized (c1190n) {
                    c1190n.f13952e = hVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, G3.h hVar, int[] iArr) {
        PorterDuff.Mode mode = C1190N.f13945f;
        if (AbstractC1237x.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = hVar.f908b;
        if (!z && !hVar.f907a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) hVar.f909c : null;
        PorterDuff.Mode mode2 = hVar.f907a ? (PorterDuff.Mode) hVar.f910d : C1190N.f13945f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = C1190N.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i4) {
        return this.f14051a.c(context, i4);
    }
}
