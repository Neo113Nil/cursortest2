package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.google.android.apps.authenticator2.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ls {
    private static ls b;
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private car h;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final qs g = new qs(6);

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        synchronized (ls.class) {
            qs qsVar = g;
            int i2 = (i + 31) * 31;
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) qsVar.a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter != null) {
                return porterDuffColorFilter;
            }
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
            return porterDuffColorFilter2;
        }
    }

    public static synchronized ls e() {
        ls lsVar;
        synchronized (ls.class) {
            lsVar = b;
            if (lsVar == null) {
                lsVar = new ls();
                b = lsVar;
            }
        }
        return lsVar;
    }

    static void g(Drawable drawable, md mdVar, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (mdVar.d) {
                colorStateList = mdVar.a;
            } else {
                if (!mdVar.c) {
                    drawable.clearColorFilter();
                    return;
                }
                colorStateList = null;
            }
            PorterDuff.Mode mode = mdVar.c ? mdVar.b : a;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = b(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    private final synchronized Drawable i(Context context, long j) {
        WeakReference weakReference;
        qq qqVar = (qq) this.d.get(context);
        if (qqVar != null && (weakReference = (WeakReference) qqVar.d(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            qqVar.h(j);
        }
        return null;
    }

    private final synchronized void j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.d;
            qq qqVar = (qq) weakHashMap.get(context);
            if (qqVar == null) {
                qqVar = new qq(null);
                weakHashMap.put(context, qqVar);
            }
            qqVar.g(j, new WeakReference(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0127 A[Catch: all -> 0x0194, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000e, B:9:0x0018, B:13:0x0127, B:15:0x012b, B:16:0x0132, B:18:0x013a, B:19:0x0144, B:21:0x0148, B:23:0x0150, B:27:0x0154, B:29:0x0158, B:31:0x015d, B:32:0x0160, B:34:0x0167, B:35:0x0185, B:38:0x0025, B:41:0x0033, B:44:0x0042, B:46:0x0054, B:48:0x005a, B:49:0x0097, B:50:0x0079, B:53:0x00a4, B:56:0x00b6, B:59:0x00c1, B:65:0x00d8, B:67:0x00e2, B:68:0x00ea, B:70:0x00f4, B:71:0x00fc, B:73:0x0106, B:76:0x0113, B:77:0x011e), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized ColorStateList a(Context context, int i) {
        qz qzVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateList = (weakHashMap == null || (qzVar = (qz) weakHashMap.get(context)) == null) ? null : (ColorStateList) ra.a(qzVar, i);
        if (colorStateList == null) {
            car carVar = this.h;
            if (carVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateList = aat.d(context, R.color.abc_tint_edittext);
                } else if (i == 2131230861) {
                    colorStateList = aat.d(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList c = mb.c(context, R.attr.colorSwitchThumbNormal);
                    if (c == null || !c.isStateful()) {
                        iArr[0] = mb.a;
                        iArr2[0] = mb.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = mb.d;
                        iArr2[1] = mb.b(context, R.attr.colorControlActivated);
                        iArr[2] = mb.e;
                        iArr2[2] = mb.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = mb.a;
                        iArr[0] = iArr3;
                        iArr2[0] = c.getColorForState(iArr3, 0);
                        iArr[1] = mb.d;
                        iArr2[1] = mb.b(context, R.attr.colorControlActivated);
                        iArr[2] = mb.e;
                        iArr2[2] = c.getDefaultColor();
                    }
                    colorStateList = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateList = car.k(context, mb.b(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateList = car.k(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateList = car.k(context, mb.b(context, R.attr.colorAccent));
                } else {
                    if (i != 2131230856 && i != R.drawable.abc_spinner_textfield_background_material) {
                        if (car.j((int[]) carVar.d, i)) {
                            colorStateList = mb.c(context, R.attr.colorControlNormal);
                        } else if (car.j((int[]) carVar.a, i)) {
                            colorStateList = aat.d(context, R.color.abc_tint_default);
                        } else if (car.j((int[]) carVar.c, i)) {
                            colorStateList = aat.d(context, R.color.abc_tint_btn_checkable);
                        } else if (i == R.drawable.abc_seekbar_thumb_material) {
                            colorStateList = aat.d(context, R.color.abc_tint_seek_thumb);
                            i = R.drawable.abc_seekbar_thumb_material;
                        }
                    }
                    colorStateList = aat.d(context, R.color.abc_tint_spinner);
                }
                if (colorStateList != null) {
                    WeakHashMap weakHashMap2 = this.c;
                    if (weakHashMap2 == null) {
                        weakHashMap2 = new WeakHashMap();
                        this.c = weakHashMap2;
                    }
                    qz qzVar2 = (qz) weakHashMap2.get(context);
                    if (qzVar2 == null) {
                        qzVar2 = new qz(null);
                        this.c.put(context, qzVar2);
                    }
                    int i2 = qzVar2.d;
                    if (i2 == 0 || i > qzVar2.b[i2 - 1]) {
                        if (qzVar2.a && i2 >= qzVar2.b.length) {
                            ra.b(qzVar2);
                        }
                        int i3 = qzVar2.d;
                        int[] iArr4 = qzVar2.b;
                        if (i3 >= iArr4.length) {
                            int c2 = rb.c((i3 + 1) * 4) / 4;
                            int[] copyOf = Arrays.copyOf(iArr4, c2);
                            copyOf.getClass();
                            qzVar2.b = copyOf;
                            Object[] copyOf2 = Arrays.copyOf(qzVar2.c, c2);
                            copyOf2.getClass();
                            qzVar2.c = copyOf2;
                        }
                        qzVar2.b[i3] = i;
                        qzVar2.c[i3] = colorStateList;
                        qzVar2.d = i3 + 1;
                    } else {
                        qzVar2.d(i, colorStateList);
                    }
                    return colorStateList;
                }
            }
            colorStateList = null;
            if (colorStateList != null) {
            }
        }
        return colorStateList;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        r0.setTintMode(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a4 A[Catch: all -> 0x01b3, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0031, B:10:0x0038, B:14:0x00ab, B:16:0x00b1, B:18:0x00b7, B:22:0x00cc, B:25:0x01a4, B:31:0x00c8, B:32:0x00d2, B:36:0x00e9, B:40:0x0117, B:42:0x0141, B:48:0x0189, B:50:0x019a, B:51:0x0152, B:54:0x015e, B:56:0x016b, B:59:0x0173, B:67:0x005a, B:71:0x00a1, B:74:0x0065, B:76:0x0082, B:78:0x008c, B:80:0x0096, B:81:0x000e, B:83:0x0019, B:85:0x001d, B:87:0x01a9, B:88:0x01b2), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0189 A[Catch: all -> 0x01b3, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0031, B:10:0x0038, B:14:0x00ab, B:16:0x00b1, B:18:0x00b7, B:22:0x00cc, B:25:0x01a4, B:31:0x00c8, B:32:0x00d2, B:36:0x00e9, B:40:0x0117, B:42:0x0141, B:48:0x0189, B:50:0x019a, B:51:0x0152, B:54:0x015e, B:56:0x016b, B:59:0x0173, B:67:0x005a, B:71:0x00a1, B:74:0x0065, B:76:0x0082, B:78:0x008c, B:80:0x0096, B:81:0x000e, B:83:0x0019, B:85:0x001d, B:87:0x01a9, B:88:0x01b2), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a1 A[Catch: all -> 0x01b3, TryCatch #0 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0031, B:10:0x0038, B:14:0x00ab, B:16:0x00b1, B:18:0x00b7, B:22:0x00cc, B:25:0x01a4, B:31:0x00c8, B:32:0x00d2, B:36:0x00e9, B:40:0x0117, B:42:0x0141, B:48:0x0189, B:50:0x019a, B:51:0x0152, B:54:0x015e, B:56:0x016b, B:59:0x0173, B:67:0x005a, B:71:0x00a1, B:74:0x0065, B:76:0x0082, B:78:0x008c, B:80:0x0096, B:81:0x000e, B:83:0x0019, B:85:0x001d, B:87:0x01a9, B:88:0x01b2), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable drawable;
        int i2;
        int i3;
        int i4 = i;
        synchronized (this) {
            boolean z2 = false;
            if (!this.f) {
                this.f = true;
                Drawable c = c(context, R.drawable.abc_vector_test);
                if (c == null || (!(c instanceof aqq) && !"android.graphics.drawable.VectorDrawable".equals(c.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            TypedValue typedValue = this.e;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.e = typedValue;
            }
            context.getResources().getValue(i4, typedValue, true);
            long j = (typedValue.assetCookie << 32) | typedValue.data;
            Drawable i5 = i(context, j);
            drawable = null;
            r12 = null;
            PorterDuff.Mode mode = null;
            if (i5 == null) {
                if (this.h != null) {
                    if (i4 == R.drawable.abc_cab_background_top_material) {
                        i5 = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230812)});
                    } else if (i4 == R.drawable.abc_ratingbar_material) {
                        i5 = car.l(this, context, R.dimen.abc_star_big);
                    } else if (i4 == R.drawable.abc_ratingbar_indicator_material) {
                        i5 = car.l(this, context, R.dimen.abc_star_medium);
                    } else if (i4 == R.drawable.abc_ratingbar_small_material) {
                        i5 = car.l(this, context, R.dimen.abc_star_small);
                        i4 = R.drawable.abc_ratingbar_small_material;
                    }
                    if (i5 != null) {
                        i5.setChangingConfigurations(typedValue.changingConfigurations);
                        j(context, j, i5);
                    }
                }
                i5 = null;
                if (i5 != null) {
                }
            }
            if (i5 == null) {
                i5 = context.getDrawable(i4);
            }
            if (i5 != null) {
                ColorStateList a2 = a(context, i4);
                if (a2 != null) {
                    Drawable mutate = i5.mutate();
                    mutate.setTintList(a2);
                    if (this.h != null && i4 == R.drawable.abc_switch_thumb_material) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    }
                    drawable = mutate;
                } else {
                    car carVar = this.h;
                    if (carVar != null) {
                        if (i4 == R.drawable.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) i5;
                            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                            int b2 = mb.b(context, R.attr.colorControlNormal);
                            PorterDuff.Mode mode2 = hx.a;
                            car.m(findDrawableByLayerId, b2, mode2);
                            car.m(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), mb.b(context, R.attr.colorControlNormal), mode2);
                            car.m(layerDrawable.findDrawableByLayerId(android.R.id.progress), mb.b(context, R.attr.colorControlActivated), mode2);
                        } else if (i4 == R.drawable.abc_ratingbar_material || i4 == R.drawable.abc_ratingbar_indicator_material || i4 == R.drawable.abc_ratingbar_small_material) {
                            LayerDrawable layerDrawable2 = (LayerDrawable) i5;
                            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                            int a3 = mb.a(context, R.attr.colorControlNormal);
                            PorterDuff.Mode mode3 = hx.a;
                            car.m(findDrawableByLayerId2, a3, mode3);
                            car.m(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), mb.b(context, R.attr.colorControlActivated), mode3);
                            car.m(layerDrawable2.findDrawableByLayerId(android.R.id.progress), mb.b(context, R.attr.colorControlActivated), mode3);
                        }
                    }
                    if (carVar != null) {
                        Object obj = carVar.e;
                        PorterDuff.Mode mode4 = hx.a;
                        if (car.j((int[]) obj, i4)) {
                            i2 = R.attr.colorControlNormal;
                        } else if (car.j((int[]) carVar.f, i4)) {
                            i2 = R.attr.colorControlActivated;
                        } else {
                            boolean j2 = car.j((int[]) carVar.b, i4);
                            i2 = android.R.attr.colorBackground;
                            if (j2) {
                                mode4 = PorterDuff.Mode.MULTIPLY;
                            } else if (i4 == 2131230832) {
                                i3 = Math.round(40.8f);
                                i2 = 16842800;
                                z2 = true;
                                if (z2) {
                                    Drawable mutate2 = i5.mutate();
                                    mutate2.setColorFilter(hx.b(mb.b(context, i2), mode4));
                                    if (i3 != -1) {
                                        mutate2.setAlpha(i3);
                                    }
                                }
                            } else if (i4 != R.drawable.abc_dialog_material_background) {
                                i2 = 0;
                                i3 = -1;
                                if (z2) {
                                }
                            }
                        }
                        i3 = -1;
                        z2 = true;
                        if (z2) {
                        }
                    }
                    if (z) {
                    }
                }
                if (drawable != null) {
                    jl.b(drawable);
                }
            }
            drawable = i5;
            if (drawable != null) {
            }
        }
        return drawable;
    }

    public final synchronized void f(Context context) {
        qq qqVar = (qq) this.d.get(context);
        if (qqVar != null) {
            qqVar.f();
        }
    }

    public final synchronized void h(car carVar) {
        this.h = carVar;
    }
}
