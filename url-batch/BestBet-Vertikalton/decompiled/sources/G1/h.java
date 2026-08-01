package G1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.fortunequest.neontrack.R;
import java.io.Serializable;
import l.C0260t;
import l.L0;
import l.Q0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f389a;

    /* renamed from: b, reason: collision with root package name */
    public Object f390b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f391c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f392e;

    /* renamed from: f, reason: collision with root package name */
    public Object f393f;

    /* JADX WARN: Type inference failed for: r0v3, types: [int[], java.io.Serializable] */
    public h() {
        this.f389a = new int[]{2131165301, 2131165299, 2131165225};
        this.f390b = new int[]{2131165249, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f391c = new int[]{2131165298, 2131165300, 2131165242, R.drawable.abc_text_cursor_material, 2131165295, 2131165296, 2131165297};
        this.d = new int[]{2131165274, R.drawable.abc_cab_background_internal_bg, 2131165273};
        this.f392e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f393f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i) {
        int c2 = Q0.c(context, R.attr.colorControlHighlight);
        int b2 = Q0.b(context, R.attr.colorButtonNormal);
        int[] iArr = Q0.f3328b;
        int[] iArr2 = Q0.d;
        int b3 = C.a.b(c2, i);
        return new ColorStateList(new int[][]{iArr, iArr2, Q0.f3329c, Q0.f3331f}, new int[]{b2, b3, C.a.b(c2, i), i});
    }

    public static LayerDrawable c(L0 l02, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c2 = l02.c(context, R.drawable.abc_star_black_48dp);
        Drawable c3 = l02.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c2;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c3 instanceof BitmapDrawable) && c3.getIntrinsicWidth() == dimensionPixelSize && c3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c3;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c3.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0260t.f3467b;
        }
        mutate.setColorFilter(C0260t.c(i, mode));
    }

    public ColorStateList d(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return H1.d.z(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165291) {
            return H1.d.z(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, Q0.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return b(context, Q0.c(context, R.attr.colorAccent));
            }
            if (i == 2131165286 || i == R.drawable.abc_spinner_textfield_background_material) {
                return H1.d.z(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.f390b, i)) {
                return Q0.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f392e, i)) {
                return H1.d.z(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f393f, i)) {
                return H1.d.z(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return H1.d.z(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = Q0.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = Q0.f3328b;
            iArr2[0] = Q0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = Q0.f3330e;
            iArr2[1] = Q0.c(context, R.attr.colorControlActivated);
            iArr[2] = Q0.f3331f;
            iArr2[2] = Q0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = Q0.f3328b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = Q0.f3330e;
            iArr2[1] = Q0.c(context, R.attr.colorControlActivated);
            iArr[2] = Q0.f3331f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public h(C1.d dVar) {
        k1.e.e(dVar, "taskRunner");
        this.f389a = dVar;
        this.f393f = j.f394a;
    }
}
