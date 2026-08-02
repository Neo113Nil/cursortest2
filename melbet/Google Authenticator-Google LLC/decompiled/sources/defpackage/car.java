package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.WindowId;
import com.google.android.apps.authenticator2.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class car {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public car() {
        this.e = new int[]{2131230871, 2131230869, 2131230795};
        this.d = new int[]{2131230819, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f = new int[]{2131230868, 2131230870, 2131230812, R.drawable.abc_text_cursor_material, 2131230865, 2131230866, 2131230867};
        this.b = new int[]{2131230844, R.drawable.abc_cab_background_internal_bg, 2131230843};
        this.a = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.c = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static final boolean j(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final ColorStateList k(Context context, int i) {
        int b = mb.b(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{mb.a, mb.c, mb.b, mb.e}, new int[]{mb.a(context, R.attr.colorButtonNormal), va.b(b, i), va.b(b, i), i});
    }

    public static final LayerDrawable l(ls lsVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = lsVar.c(context, R.drawable.abc_star_black_48dp);
        Drawable c2 = lsVar.c(context, R.drawable.abc_star_half_black_48dp);
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

    public static final void m(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = hx.a;
        }
        mutate.setColorFilter(hx.b(i, mode));
    }

    public final cam a(bpc bpcVar) {
        return b(hnu.aJ(bpcVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final cam b(hvi hviVar) {
        Object obj = this.d;
        obj.getClass();
        bpn bpnVar = new bpn(obj, 15);
        ?? r0 = this.c;
        hvi au = hoq.au(hviVar, bpnVar, r0);
        hvi ap = hoq.ap(au, Exception.class, new bwu(5), r0);
        hvi h = h();
        return new cam(au, hoq.aX(ap, h).t(new cap(this, h, ap, 2), r0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final cam c(List list) {
        hvi c = ((bpr) this.d).c(list);
        bwu bwuVar = new bwu(8);
        ?? r1 = this.c;
        hvi ap = hoq.ap(c, Exception.class, bwuVar, r1);
        hvi h = h();
        return new cam(c, hoq.aX(ap, h).t(new cap(this, h, ap, 1), r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final cam d(List list, Long l) {
        bpr bprVar = (bpr) this.d;
        hvi au = hoq.au(bprVar.d.a(), new bpm(bprVar, list, l.longValue(), 0), bprVar.b);
        bwu bwuVar = new bwu(7);
        ?? r0 = this.c;
        hvi ap = hoq.ap(au, Exception.class, bwuVar, r0);
        hvi h = h();
        return new cam(au, hoq.aX(ap, h).t(new cap(this, h, list, 4), r0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final cam e(bpc bpcVar) {
        hvi f = ((bpr) this.d).f(bpcVar);
        bwu bwuVar = new bwu(4);
        ?? r1 = this.c;
        hvi ap = hoq.ap(f, Exception.class, bwuVar, r1);
        hvi h = h();
        return new cam(f, hoq.aX(ap, h).t(new cap(this, h, ap, 0), r1));
    }

    public final hvi f(List list) {
        return ((bpr) this.d).c(list);
    }

    public final hvi g() {
        Object obj = this.d;
        bpr bprVar = (bpr) obj;
        return hoq.au(bprVar.d.a(), new bpn(obj, 3), bprVar.b);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final hvi h() {
        return hoq.at(((fug) this.b).c(), new bpf(this, 20), this.c);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final hvi i() {
        return hoq.au(h(), new bpn(this, 16), this.c);
    }

    public car(View view, String str, ape apeVar, WindowId windowId, apm apmVar, Animator animator) {
        this.f = view;
        this.a = str;
        this.d = apmVar;
        this.e = windowId;
        this.c = apeVar;
        this.b = animator;
    }

    public car(bfc bfcVar, bfc bfcVar2, bfc bfcVar3, bdj bdjVar, bdj bdjVar2) {
        this.d = bmp.a(150, new bdh(this, 0));
        this.b = bfcVar;
        this.c = bfcVar2;
        this.a = bfcVar3;
        this.e = bdjVar;
        this.f = bdjVar2;
    }

    public car(frv frvVar, fug fugVar, Context context, hvl hvlVar) {
        caq caqVar = (caq) hnu.bq(context, caq.class, frvVar);
        this.a = frvVar;
        this.b = fugVar;
        this.d = caqVar.g();
        this.e = caqVar.i();
        this.f = caqVar.j();
        this.c = hvlVar;
    }
}
