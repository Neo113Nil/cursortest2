package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.neptunesoft.languesbacdz.R;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import m0.AbstractActivityC0264d;
import t.AbstractC0305a;
import z0.C0335a;

/* renamed from: j.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3015a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3016b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3017c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3018d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3019e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3020f;

    public C0239o() {
        this.f3015a = new int[]{2131165267, 2131165265, 2131165184};
        this.f3016b = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
        this.f3017c = new int[]{2131165264, 2131165266, 2131165201, R.drawable.abc_text_cursor_material, 2131165258, 2131165260, 2131165262, 2131165259, 2131165261, 2131165263};
        this.f3018d = new int[]{2131165239, R.drawable.abc_cab_background_internal_bg, 2131165238};
        this.f3019e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f3020f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i2) {
        int b2 = j0.b(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{j0.f2987b, j0.f2989d, j0.f2988c, j0.f2991f}, new int[]{j0.a(context, R.attr.colorButtonNormal), AbstractC0305a.b(b2, i2), AbstractC0305a.b(b2, i2), i2});
    }

    public static void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter h2;
        if (A.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0240p.f3024b;
        }
        PorterDuff.Mode mode2 = C0240p.f3024b;
        synchronized (C0240p.class) {
            h2 = S.h(i2, mode);
        }
        drawable.setColorFilter(h2);
    }

    public ColorStateList c(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return d.b.b(context, R.color.abc_tint_edittext);
        }
        if (i2 == 2131165254) {
            return d.b.b(context, R.color.abc_tint_switch_track);
        }
        if (i2 != R.drawable.abc_switch_thumb_material) {
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, j0.b(context, R.attr.colorButtonNormal));
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return b(context, j0.b(context, R.attr.colorAccent));
            }
            if (i2 == 2131165251 || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return d.b.b(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.f3016b, i2)) {
                return j0.c(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f3019e, i2)) {
                return d.b.b(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f3020f, i2)) {
                return d.b.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return d.b.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList c2 = j0.c(context, R.attr.colorSwitchThumbNormal);
        if (c2 == null || !c2.isStateful()) {
            iArr[0] = j0.f2987b;
            iArr2[0] = j0.a(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = j0.f2990e;
            iArr2[1] = j0.b(context, R.attr.colorControlActivated);
            iArr[2] = j0.f2991f;
            iArr2[2] = j0.b(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = j0.f2987b;
            iArr[0] = iArr3;
            iArr2[0] = c2.getColorForState(iArr3, 0);
            iArr[1] = j0.f2990e;
            iArr2[1] = j0.b(context, R.attr.colorControlActivated);
            iArr[2] = j0.f2991f;
            iArr2[2] = c2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean d(int i2, int i3, Intent intent) {
        Iterator it = new HashSet((HashSet) this.f3017c).iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                HashMap hashMap = ((C0335a) it.next()).f3598h;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    ((v0.i) hashMap.remove(Integer.valueOf(i2))).c(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z2) {
                }
                z2 = true;
            }
            return z2;
        }
    }

    public C0239o(AbstractActivityC0264d abstractActivityC0264d, androidx.lifecycle.n nVar) {
        this.f3016b = new HashSet();
        this.f3017c = new HashSet();
        this.f3018d = new HashSet();
        this.f3019e = new HashSet();
        new HashSet();
        this.f3020f = new HashSet();
        this.f3015a = abstractActivityC0264d;
        new HiddenLifecycleReference(nVar);
    }
}
