package d0;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import c0.AbstractActivityC0104f;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import d.AbstractC0110a;
import h.AbstractC0171y;
import h.C0162o;
import h.O;
import h.h0;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k0.InterfaceC0181b;
import m0.C0201k;
import p.AbstractC0215a;
import q0.C0219a;

/* loaded from: classes.dex */
public final class d implements InterfaceC0181b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1811a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1812b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1813c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1814d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1815e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1816f;

    public d() {
        this.f1811a = new int[]{2131165267, 2131165265, 2131165184};
        this.f1812b = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
        this.f1813c = new int[]{2131165264, 2131165266, 2131165201, R.drawable.abc_text_cursor_material, 2131165258, 2131165260, 2131165262, 2131165259, 2131165261, 2131165263};
        this.f1814d = new int[]{2131165239, R.drawable.abc_cab_background_internal_bg, 2131165238};
        this.f1815e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f1816f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
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
        int b2 = h0.b(context, R.attr.colorControlHighlight);
        int a2 = h0.a(context, R.attr.colorButtonNormal);
        int[] iArr = h0.f2193b;
        int[] iArr2 = h0.f2195d;
        int a3 = AbstractC0215a.a(b2, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, h0.f2194c, h0.f2197f}, new int[]{a2, a3, AbstractC0215a.a(b2, i2), i2});
    }

    public static void e(Drawable drawable, int i2) {
        PorterDuffColorFilter e2;
        PorterDuff.Mode mode = C0162o.f2247b;
        if (AbstractC0171y.a(drawable)) {
            drawable = drawable.mutate();
        }
        synchronized (C0162o.class) {
            e2 = O.e(i2, mode);
        }
        drawable.setColorFilter(e2);
    }

    public ColorStateList c(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC0110a.f1784a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i2 == 2131165254) {
            Object obj2 = AbstractC0110a.f1784a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i2 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c2 = h0.c(context, R.attr.colorSwitchThumbNormal);
            if (c2 == null || !c2.isStateful()) {
                iArr[0] = h0.f2193b;
                iArr2[0] = h0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = h0.f2196e;
                iArr2[1] = h0.b(context, R.attr.colorControlActivated);
                iArr[2] = h0.f2197f;
                iArr2[2] = h0.b(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = h0.f2193b;
                iArr[0] = iArr3;
                iArr2[0] = c2.getColorForState(iArr3, 0);
                iArr[1] = h0.f2196e;
                iArr2[1] = h0.b(context, R.attr.colorControlActivated);
                iArr[2] = h0.f2197f;
                iArr2[2] = c2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
            return b(context, h0.b(context, R.attr.colorButtonNormal));
        }
        if (i2 == R.drawable.abc_btn_borderless_material) {
            return b(context, 0);
        }
        if (i2 == R.drawable.abc_btn_colored_material) {
            return b(context, h0.b(context, R.attr.colorAccent));
        }
        if (i2 == 2131165251 || i2 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC0110a.f1784a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (a((int[]) this.f1812b, i2)) {
            return h0.c(context, R.attr.colorControlNormal);
        }
        if (a((int[]) this.f1815e, i2)) {
            Object obj4 = AbstractC0110a.f1784a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (a((int[]) this.f1816f, i2)) {
            Object obj5 = AbstractC0110a.f1784a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i2 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC0110a.f1784a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    public boolean d(int i2, int i3, Intent intent) {
        Iterator it = new HashSet((HashSet) this.f1813c).iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                HashMap hashMap = ((C0219a) it.next()).f2833h;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    ((C0201k) hashMap.remove(Integer.valueOf(i2))).c(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z2) {
                }
                z2 = true;
            }
            return z2;
        }
    }

    public d(AbstractActivityC0104f abstractActivityC0104f, androidx.lifecycle.j jVar) {
        this.f1812b = new HashSet();
        this.f1813c = new HashSet();
        this.f1814d = new HashSet();
        this.f1815e = new HashSet();
        new HashSet();
        this.f1816f = new HashSet();
        this.f1811a = abstractActivityC0104f;
        new HiddenLifecycleReference(jVar);
    }
}
