package j3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.gglhk.bofio.fortunetiger.R;
import java.io.Serializable;
import k.j2;
import k.o2;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2425a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2426b;
    public Serializable c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2427d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2428e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2429f;

    /* JADX WARN: Type inference failed for: r0v3, types: [int[], java.io.Serializable] */
    public g() {
        this.f2425a = new int[]{2131165301, 2131165299, 2131165225};
        this.f2426b = new int[]{2131165249, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{2131165298, 2131165300, 2131165242, R.drawable.abc_text_cursor_material, 2131165295, 2131165296, 2131165297};
        this.f2427d = new int[]{2131165274, R.drawable.abc_cab_background_internal_bg, 2131165273};
        this.f2428e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f2429f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int[] iArr, int i4) {
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i4) {
        int c = o2.c(context, R.attr.colorControlHighlight);
        int b2 = o2.b(context, R.attr.colorButtonNormal);
        int[] iArr = o2.f2613b;
        int[] iArr2 = o2.f2614d;
        int b4 = c0.a.b(c, i4);
        return new ColorStateList(new int[][]{iArr, iArr2, o2.c, o2.f2616f}, new int[]{b2, b4, c0.a.b(c, i4), i4});
    }

    public static LayerDrawable c(j2 j2Var, Context context, int i4) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
        Drawable c = j2Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c4 = j2Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c instanceof BitmapDrawable) && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c4 instanceof BitmapDrawable) && c4.getIntrinsicWidth() == dimensionPixelSize && c4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c4;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c4.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i4, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = k.s.f2640b;
        }
        mutate.setColorFilter(k.s.c(i4, mode));
    }

    public ColorStateList d(Context context, int i4) {
        if (i4 == R.drawable.abc_edit_text_material) {
            return k3.d.D(context, R.color.abc_tint_edittext);
        }
        if (i4 == 2131165291) {
            return k3.d.D(context, R.color.abc_tint_switch_track);
        }
        if (i4 != R.drawable.abc_switch_thumb_material) {
            if (i4 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, o2.c(context, R.attr.colorButtonNormal));
            }
            if (i4 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i4 == R.drawable.abc_btn_colored_material) {
                return b(context, o2.c(context, R.attr.colorAccent));
            }
            if (i4 == 2131165286 || i4 == R.drawable.abc_spinner_textfield_background_material) {
                return k3.d.D(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.f2426b, i4)) {
                return o2.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f2428e, i4)) {
                return k3.d.D(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f2429f, i4)) {
                return k3.d.D(context, R.color.abc_tint_btn_checkable);
            }
            if (i4 == R.drawable.abc_seekbar_thumb_material) {
                return k3.d.D(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d4 = o2.d(context, R.attr.colorSwitchThumbNormal);
        if (d4 == null || !d4.isStateful()) {
            iArr[0] = o2.f2613b;
            iArr2[0] = o2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = o2.f2615e;
            iArr2[1] = o2.c(context, R.attr.colorControlActivated);
            iArr[2] = o2.f2616f;
            iArr2[2] = o2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = o2.f2613b;
            iArr[0] = iArr3;
            iArr2[0] = d4.getColorForState(iArr3, 0);
            iArr[1] = o2.f2615e;
            iArr2[1] = o2.c(context, R.attr.colorControlActivated);
            iArr[2] = o2.f2616f;
            iArr2[2] = d4.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public g(f3.d dVar) {
        u2.c.e(dVar, "taskRunner");
        this.f2425a = dVar;
        this.f2429f = i.f2430a;
    }
}
