package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.Menu;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sf {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public sf(Set set, String str, String str2) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.a = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = str;
        this.d = str2;
        this.e = el2.a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.b = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            b71.o();
            throw null;
        }
    }

    public static void a(Menu menu, mk1 mk1Var) {
        int i;
        int i2 = mk1Var.m;
        int i3 = mk1Var.n;
        int ordinal = mk1Var.ordinal();
        if (ordinal == 0) {
            i = R.string.copy;
        } else if (ordinal == 1) {
            i = R.string.paste;
        } else if (ordinal == 2) {
            i = R.string.cut;
        } else if (ordinal == 3) {
            i = R.string.selectAll;
        } else {
            if (ordinal != 4) {
                a.b();
                return;
            }
            i = Build.VERSION.SDK_INT <= 26 ? com.majelw.libystne.R.string.autofill : R.string.autofill;
        }
        menu.add(0, i2, i3, i).setShowAsAction(1);
    }

    public static void c(Menu menu, mk1 mk1Var, Function0 function0) {
        int i = mk1Var.m;
        if (function0 != null && menu.findItem(i) == null) {
            a(menu, mk1Var);
        } else {
            if (function0 != null || menu.findItem(i) == null) {
                return;
            }
            menu.removeItem(i);
        }
    }

    public static boolean d(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList f(Context context, int i) {
        int c = xw2.c(context, com.majelw.libystne.R.attr.colorControlHighlight);
        int b = xw2.b(context, com.majelw.libystne.R.attr.colorButtonNormal);
        int[] iArr = xw2.b;
        int[] iArr2 = xw2.d;
        int b2 = nw.b(c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, xw2.c, xw2.f}, new int[]{b, b2, nw.b(c, i), i});
    }

    public static LayerDrawable g(p92 p92Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = p92Var.c(context, com.majelw.libystne.R.drawable.abc_star_black_48dp);
        Drawable c2 = p92Var.c(context, com.majelw.libystne.R.drawable.abc_star_half_black_48dp);
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
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void i(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = tf.b;
        }
        PorterDuff.Mode mode2 = tf.b;
        synchronized (tf.class) {
            e = p92.e(i, mode);
        }
        mutate.setColorFilter(e);
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            lh.g("Property \"autoMetadata\" has not been set");
        }
    }

    public wl e() {
        String str = ((String) this.a) == null ? " transportName" : BuildConfig.FLAVOR;
        if (((hh0) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.e) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new wl((String) this.a, (Integer) this.b, (hh0) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        lh.g("Missing required properties:".concat(str));
        return null;
    }

    public ColorStateList h(Context context, int i) {
        if (i == com.majelw.libystne.R.drawable.abc_edit_text_material) {
            return j8.D(context, com.majelw.libystne.R.color.abc_tint_edittext);
        }
        if (i == 2131230787) {
            return j8.D(context, com.majelw.libystne.R.color.abc_tint_switch_track);
        }
        if (i != com.majelw.libystne.R.drawable.abc_switch_thumb_material) {
            if (i == com.majelw.libystne.R.drawable.abc_btn_default_mtrl_shape) {
                return f(context, xw2.c(context, com.majelw.libystne.R.attr.colorButtonNormal));
            }
            if (i == com.majelw.libystne.R.drawable.abc_btn_borderless_material) {
                return f(context, 0);
            }
            if (i == com.majelw.libystne.R.drawable.abc_btn_colored_material) {
                return f(context, xw2.c(context, com.majelw.libystne.R.attr.colorAccent));
            }
            if (i == 2131230782 || i == com.majelw.libystne.R.drawable.abc_spinner_textfield_background_material) {
                return j8.D(context, com.majelw.libystne.R.color.abc_tint_spinner);
            }
            if (d((int[]) this.b, i)) {
                return xw2.d(context, com.majelw.libystne.R.attr.colorControlNormal);
            }
            if (d((int[]) this.e, i)) {
                return j8.D(context, com.majelw.libystne.R.color.abc_tint_default);
            }
            if (d((int[]) this.f, i)) {
                return j8.D(context, com.majelw.libystne.R.color.abc_tint_btn_checkable);
            }
            if (i == com.majelw.libystne.R.drawable.abc_seekbar_thumb_material) {
                return j8.D(context, com.majelw.libystne.R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = xw2.d(context, com.majelw.libystne.R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = xw2.b;
            iArr2[0] = xw2.b(context, com.majelw.libystne.R.attr.colorSwitchThumbNormal);
            iArr[1] = xw2.e;
            iArr2[1] = xw2.c(context, com.majelw.libystne.R.attr.colorControlActivated);
            iArr[2] = xw2.f;
            iArr2[2] = xw2.c(context, com.majelw.libystne.R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = xw2.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = xw2.e;
            iArr2[1] = xw2.c(context, com.majelw.libystne.R.attr.colorControlActivated);
            iArr[2] = xw2.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
