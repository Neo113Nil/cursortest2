package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r implements u.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4393a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4394b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4395c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4396d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4397e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4398f;

    public r() {
        this.f4393a = new int[]{2131165301, 2131165299, 2131165225};
        this.f4394b = new int[]{2131165249, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f4395c = new int[]{2131165298, 2131165300, 2131165242, R.drawable.abc_text_cursor_material, 2131165295, 2131165296, 2131165297};
        this.f4396d = new int[]{2131165274, R.drawable.abc_cab_background_internal_bg, 2131165273};
        this.f4397e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f4398f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean f(int[] iArr, int i) {
        for (int i8 : iArr) {
            if (i8 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList g(Context context, int i) {
        int c8 = v1.c(context, R.attr.colorControlHighlight);
        int b8 = v1.b(context, R.attr.colorButtonNormal);
        int[] iArr = v1.f4427b;
        int[] iArr2 = v1.f4429d;
        int b9 = i3.a.b(c8, i);
        return new ColorStateList(new int[][]{iArr, iArr2, v1.f4428c, v1.f4431f}, new int[]{b8, b9, i3.a.b(c8, i), i});
    }

    public static LayerDrawable h(q1 q1Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c8 = q1Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c9 = q1Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c8 instanceof BitmapDrawable) && c8.getIntrinsicWidth() == dimensionPixelSize && c8.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c8;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c8.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c8.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c9 instanceof BitmapDrawable) && c9.getIntrinsicWidth() == dimensionPixelSize && c9.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c9;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c9.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c9.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void j(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = s.f4401b;
        }
        mutate.setColorFilter(s.b(i, mode));
    }

    @Override // u.y0
    public boolean b() {
        return ((Boolean) ((m0.h1) this.f4396d).getValue()).booleanValue();
    }

    @Override // u.y0
    public Object c(t.j0 j0Var, p6.e eVar, i6.c cVar) {
        Object b8 = a7.x.b(new b0.c(this, j0Var, eVar, null, 13), cVar);
        return b8 == h6.a.f3204d ? b8 : c6.m.f1757a;
    }

    @Override // u.y0
    public float e(float f6) {
        return ((Number) ((p6.c) this.f4393a).i(Float.valueOf(f6))).floatValue();
    }

    public ColorStateList i(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return s6.a.q(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165291) {
            return s6.a.q(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return g(context, v1.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return g(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return g(context, v1.c(context, R.attr.colorAccent));
            }
            if (i == 2131165286 || i == R.drawable.abc_spinner_textfield_background_material) {
                return s6.a.q(context, R.color.abc_tint_spinner);
            }
            if (f((int[]) this.f4394b, i)) {
                return v1.d(context, R.attr.colorControlNormal);
            }
            if (f((int[]) this.f4397e, i)) {
                return s6.a.q(context, R.color.abc_tint_default);
            }
            if (f((int[]) this.f4398f, i)) {
                return s6.a.q(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return s6.a.q(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d8 = v1.d(context, R.attr.colorSwitchThumbNormal);
        if (d8 == null || !d8.isStateful()) {
            iArr[0] = v1.f4427b;
            iArr2[0] = v1.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = v1.f4430e;
            iArr2[1] = v1.c(context, R.attr.colorControlActivated);
            iArr[2] = v1.f4431f;
            iArr2[2] = v1.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = v1.f4427b;
            iArr[0] = iArr3;
            iArr2[0] = d8.getColorForState(iArr3, 0);
            iArr[1] = v1.f4430e;
            iArr2[1] = v1.c(context, R.attr.colorControlActivated);
            iArr[2] = v1.f4431f;
            iArr2[2] = d8.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public r(p6.c cVar) {
        this.f4393a = cVar;
        this.f4394b = new u.j(this);
        this.f4395c = new t.n0();
        Boolean bool = Boolean.FALSE;
        this.f4396d = m0.b.q(bool);
        this.f4397e = m0.b.q(bool);
        this.f4398f = m0.b.q(bool);
    }
}
