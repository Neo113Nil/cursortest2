package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.derinko.gbini.n1casino.R;
import java.util.HashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class xi extends s60 {
    public static final String[] G = {"android:visibility:visibility", "android:visibility:parent"};
    public final int F;

    public xi() {
        this.F = 3;
    }

    public static void I(a70 a70Var) {
        View view = a70Var.b;
        int visibility = view.getVisibility();
        HashMap hashMap = a70Var.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(a70 a70Var, float f) {
        Float f2;
        return (a70Var == null || (f2 = (Float) a70Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ha0 L(a70 a70Var, a70 a70Var2) {
        ha0 ha0Var = new ha0();
        ha0Var.a = false;
        ha0Var.b = false;
        if (a70Var != null) {
            HashMap hashMap = a70Var.a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                ha0Var.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                ha0Var.e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (a70Var2 != null) {
                    HashMap hashMap2 = a70Var2.a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        ha0Var.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        ha0Var.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (a70Var == null && a70Var2 != null) {
                            int i = ha0Var.c;
                            int i2 = ha0Var.d;
                            if (i != i2 || ha0Var.e != ha0Var.f) {
                                if (i != i2) {
                                    if (i == 0) {
                                        ha0Var.b = false;
                                        ha0Var.a = true;
                                        return ha0Var;
                                    }
                                    if (i2 == 0) {
                                        ha0Var.b = true;
                                        ha0Var.a = true;
                                        return ha0Var;
                                    }
                                } else {
                                    if (ha0Var.f == null) {
                                        ha0Var.b = false;
                                        ha0Var.a = true;
                                        return ha0Var;
                                    }
                                    if (ha0Var.e == null) {
                                        ha0Var.b = true;
                                        ha0Var.a = true;
                                        return ha0Var;
                                    }
                                }
                            }
                        } else {
                            if (a70Var != null && ha0Var.d == 0) {
                                ha0Var.b = true;
                                ha0Var.a = true;
                                return ha0Var;
                            }
                            if (a70Var2 == null && ha0Var.c == 0) {
                                ha0Var.b = false;
                                ha0Var.a = true;
                            }
                        }
                        return ha0Var;
                    }
                }
                ha0Var.d = -1;
                ha0Var.f = null;
                if (a70Var == null) {
                }
                if (a70Var != null) {
                }
                if (a70Var2 == null) {
                    ha0Var.b = false;
                    ha0Var.a = true;
                }
                return ha0Var;
            }
        }
        ha0Var.c = -1;
        ha0Var.e = null;
        if (a70Var2 != null) {
        }
        ha0Var.d = -1;
        ha0Var.f = null;
        if (a70Var == null) {
        }
        if (a70Var != null) {
        }
        if (a70Var2 == null) {
        }
        return ha0Var;
    }

    public final ObjectAnimator J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        t90.a.j(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, t90.b, f2);
        wi wiVar = new wi(view);
        ofFloat.addListener(wiVar);
        o().a(wiVar);
        return ofFloat;
    }

    @Override // defpackage.s60
    public final void d(a70 a70Var) {
        I(a70Var);
    }

    @Override // defpackage.s60
    public final void g(a70 a70Var) {
        I(a70Var);
        View view = a70Var.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(t90.a.c(view)) : Float.valueOf(0.0f);
        }
        a70Var.a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (L(n(r3, false), r(r3, false)).a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01df  */
    @Override // defpackage.s60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, a70 a70Var, a70 a70Var2) {
        boolean z;
        View view;
        int i;
        char c;
        int i2;
        View view2;
        Animator animator;
        View view3;
        boolean z2;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmap;
        ha0 L = L(a70Var, a70Var2);
        if (L.a && (L.e != null || L.f != null)) {
            boolean z3 = L.b;
            int i4 = this.F;
            int i5 = 1;
            if (!z3) {
                int i6 = L.d;
                if ((i4 & 2) == 2 && a70Var != null) {
                    View view4 = a70Var.b;
                    View view5 = a70Var2 != null ? a70Var2.b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z = false;
                                view = null;
                                if (z) {
                                    if (view4.getParent() == null) {
                                        i = i6;
                                        c = 1;
                                        i5 = 0;
                                        i2 = 0;
                                        view3 = view;
                                        animator = null;
                                        view6 = view4;
                                    } else if (view4.getParent() instanceof View) {
                                        View view7 = (View) view4.getParent();
                                        animator = null;
                                        i2 = 0;
                                        if (L(r(view7, true), n(view7, true)).a) {
                                            i = i6;
                                            c = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view6 = view5;
                                            i5 = i2;
                                            view3 = view2;
                                        } else {
                                            boolean z4 = z60.a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            ba0 ba0Var = t90.a;
                                            ba0Var.n(view4, matrix);
                                            ba0Var.o(viewGroup, matrix);
                                            RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            c = 1;
                                            int round3 = Math.round(rectF.right);
                                            int round4 = Math.round(rectF.bottom);
                                            ImageView imageView = new ImageView(view4.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view4.isAttachedToWindow();
                                            boolean z5 = viewGroup != null && viewGroup.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z2 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i3 = 0;
                                            } else if (z5) {
                                                viewGroup2 = (ViewGroup) view4.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view4);
                                                z2 = isAttachedToWindow;
                                                viewGroup.getOverlay().add(view4);
                                                i3 = indexOfChild;
                                            } else {
                                                i = i6;
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view6 = imageView;
                                                i5 = i2;
                                                view3 = view2;
                                            }
                                            view2 = view;
                                            int round5 = Math.round(rectF.width());
                                            i = i6;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (z60.a) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view4.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = y60.a(picture);
                                                } else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    view4.draw(canvas);
                                                }
                                            }
                                            if (!z2) {
                                                viewGroup.getOverlay().remove(view4);
                                                viewGroup2.addView(view4, i3);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i5 = i2;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i5 = i2;
                                view3 = view2;
                            }
                        } else if (i6 == 4 || view4 == view5) {
                            z = false;
                            view = view5;
                            view5 = null;
                            if (z) {
                            }
                            i = i6;
                            c = 1;
                            i2 = 0;
                            view2 = view;
                            animator = null;
                            view6 = view5;
                            i5 = i2;
                            view3 = view2;
                        }
                        z = true;
                        view5 = null;
                        view = null;
                        if (z) {
                        }
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view2 = view;
                        animator = null;
                        view6 = view5;
                        i5 = i2;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        t90.b(view3, i2);
                        ba0 ba0Var2 = t90.a;
                        ba0Var2.getClass();
                        ObjectAnimator J = J(view3, K(a70Var, 1.0f), 0.0f);
                        if (J == null) {
                            ba0Var2.j(view3, K(a70Var2, 1.0f));
                        }
                        if (J == null) {
                            t90.b(view3, visibility);
                            return J;
                        }
                        fa0 fa0Var = new fa0(view3, i);
                        J.addListener(fa0Var);
                        o().a(fa0Var);
                        return J;
                    }
                    if (i5 == 0) {
                        int[] iArr = (int[]) a70Var.a.get("android:visibility:screenLocation");
                        int i7 = iArr[i2];
                        int i8 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i7 - iArr2[i2]) - view6.getLeft());
                        view6.offsetTopAndBottom((i8 - iArr2[c]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    ba0 ba0Var3 = t90.a;
                    ba0Var3.getClass();
                    ObjectAnimator J2 = J(view6, K(a70Var, 1.0f), 0.0f);
                    if (J2 == null) {
                        ba0Var3.j(view6, K(a70Var2, 1.0f));
                    }
                    if (i5 == 0) {
                        if (J2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return J2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        ga0 ga0Var = new ga0(this, viewGroup, view6, view4);
                        J2.addListener(ga0Var);
                        J2.addPauseListener(ga0Var);
                        o().a(ga0Var);
                    }
                    return J2;
                }
            } else if ((i4 & 1) == 1 && a70Var2 != null) {
                View view8 = a70Var2.b;
                if (a70Var == null) {
                    View view9 = (View) view8.getParent();
                }
                t90.a.getClass();
                return J(view8, K(a70Var, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // defpackage.s60
    public final String[] q() {
        return G;
    }

    @Override // defpackage.s60
    public final boolean s(a70 a70Var, a70 a70Var2) {
        if (a70Var == null && a70Var2 == null) {
            return false;
        }
        if (a70Var != null && a70Var2 != null && a70Var2.a.containsKey("android:visibility:visibility") != a70Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        ha0 L = L(a70Var, a70Var2);
        if (L.a) {
            return L.c == 0 || L.d == 0;
        }
        return false;
    }

    public xi(int i) {
        this();
        this.F = i;
    }
}
