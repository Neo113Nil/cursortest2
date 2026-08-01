package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class o1 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public o1() {
        this.a = new int[]{2131165301, 2131165299, 2131165225};
        this.b = new int[]{2131165249, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{2131165298, 2131165300, 2131165242, R.drawable.abc_text_cursor_material, 2131165295, 2131165296, 2131165297};
        this.d = new int[]{2131165274, R.drawable.abc_cab_background_internal_bg, 2131165273};
        this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
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
        int c = z80.c(context, R.attr.colorControlHighlight);
        int b = z80.b(context, R.attr.colorButtonNormal);
        int[] iArr = z80.b;
        int[] iArr2 = z80.d;
        int b2 = gc.b(c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, z80.c, z80.f}, new int[]{b, b2, gc.b(c, i), i});
    }

    public static LayerDrawable c(h30 h30Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = h30Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c2 = h30Var.c(context, R.drawable.abc_star_half_black_48dp);
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
        if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
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
            mode = r4.b;
        }
        mutate.setColorFilter(r4.c(i, mode));
    }

    public ColorStateList d(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return la0.w(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165291) {
            return la0.w(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, z80.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return b(context, z80.c(context, R.attr.colorAccent));
            }
            if (i == 2131165286 || i == R.drawable.abc_spinner_textfield_background_material) {
                return la0.w(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.b, i)) {
                return z80.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.e, i)) {
                return la0.w(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.f, i)) {
                return la0.w(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return la0.w(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = z80.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = z80.b;
            iArr2[0] = z80.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = z80.e;
            iArr2[1] = z80.c(context, R.attr.colorControlActivated);
            iArr[2] = z80.f;
            iArr2[2] = z80.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = z80.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = z80.e;
            iArr2[1] = z80.c(context, R.attr.colorControlActivated);
            iArr[2] = z80.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public o1(MaterialCardView materialCardView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.a = materialCardView;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
    }

    public o1(CoordinatorLayout coordinatorLayout, ChipGroup chipGroup, TextInputEditText textInputEditText, ExtendedFloatingActionButton extendedFloatingActionButton, LinearLayout linearLayout, CoordinatorLayout coordinatorLayout2, RecyclerView recyclerView) {
        this.a = chipGroup;
        this.b = textInputEditText;
        this.c = extendedFloatingActionButton;
        this.d = linearLayout;
        this.e = coordinatorLayout2;
        this.f = recyclerView;
    }

    public o1(l80 l80Var) {
        l80Var.getClass();
        this.a = l80Var;
        this.f = bq.a;
    }
}
