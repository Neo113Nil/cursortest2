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
import com.awerser.monnit.betplay.R;
import java.util.HashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class qi extends y60 {
    public static final String[] H = {"android:visibility:visibility", "android:visibility:parent"};
    public final int G;

    public qi() {
        this.G = 3;
    }

    public static void K(h70 h70Var) {
        View view = h70Var.b;
        int visibility = view.getVisibility();
        HashMap hashMap = h70Var.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float M(h70 h70Var, float f) {
        Float f2;
        return (h70Var == null || (f2 = (Float) h70Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static oa0 N(h70 h70Var, h70 h70Var2) {
        oa0 oa0Var = new oa0();
        oa0Var.a = false;
        oa0Var.b = false;
        if (h70Var != null) {
            HashMap hashMap = h70Var.a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                oa0Var.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                oa0Var.e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (h70Var2 != null) {
                    HashMap hashMap2 = h70Var2.a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        oa0Var.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        oa0Var.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (h70Var == null && h70Var2 != null) {
                            int i = oa0Var.c;
                            int i2 = oa0Var.d;
                            if (i != i2 || oa0Var.e != oa0Var.f) {
                                if (i != i2) {
                                    if (i == 0) {
                                        oa0Var.b = false;
                                        oa0Var.a = true;
                                        return oa0Var;
                                    }
                                    if (i2 == 0) {
                                        oa0Var.b = true;
                                        oa0Var.a = true;
                                        return oa0Var;
                                    }
                                } else {
                                    if (oa0Var.f == null) {
                                        oa0Var.b = false;
                                        oa0Var.a = true;
                                        return oa0Var;
                                    }
                                    if (oa0Var.e == null) {
                                        oa0Var.b = true;
                                        oa0Var.a = true;
                                        return oa0Var;
                                    }
                                }
                            }
                        } else {
                            if (h70Var != null && oa0Var.d == 0) {
                                oa0Var.b = true;
                                oa0Var.a = true;
                                return oa0Var;
                            }
                            if (h70Var2 == null && oa0Var.c == 0) {
                                oa0Var.b = false;
                                oa0Var.a = true;
                            }
                        }
                        return oa0Var;
                    }
                }
                oa0Var.d = -1;
                oa0Var.f = null;
                if (h70Var == null) {
                }
                if (h70Var != null) {
                }
                if (h70Var2 == null) {
                    oa0Var.b = false;
                    oa0Var.a = true;
                }
                return oa0Var;
            }
        }
        oa0Var.c = -1;
        oa0Var.e = null;
        if (h70Var2 != null) {
        }
        oa0Var.d = -1;
        oa0Var.f = null;
        if (h70Var == null) {
        }
        if (h70Var != null) {
        }
        if (h70Var2 == null) {
        }
        return oa0Var;
    }

    public final ObjectAnimator L(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        ba0.a.S(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ba0.b, f2);
        pi piVar = new pi(view);
        ofFloat.addListener(piVar);
        p().a(piVar);
        return ofFloat;
    }

    @Override // defpackage.y60
    public final void e(h70 h70Var) {
        K(h70Var);
    }

    @Override // defpackage.y60
    public final void h(h70 h70Var) {
        K(h70Var);
        View view = h70Var.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(ba0.a.x(view)) : Float.valueOf(0.0f);
        }
        h70Var.a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (N(o(r3, false), s(r3, false)).a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01df  */
    @Override // defpackage.y60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator l(ViewGroup viewGroup, h70 h70Var, h70 h70Var2) {
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
        oa0 N = N(h70Var, h70Var2);
        if (N.a && (N.e != null || N.f != null)) {
            boolean z3 = N.b;
            int i4 = this.G;
            int i5 = 1;
            if (!z3) {
                int i6 = N.d;
                if ((i4 & 2) == 2 && h70Var != null) {
                    View view4 = h70Var.b;
                    View view5 = h70Var2 != null ? h70Var2.b : null;
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
                                        if (N(s(view7, true), o(view7, true)).a) {
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
                                            boolean z4 = g70.a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            ha0 ha0Var = ba0.a;
                                            ha0Var.b0(view4, matrix);
                                            ha0Var.c0(viewGroup, matrix);
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
                                                if (g70.a) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view4.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = f70.a(picture);
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
                        ba0.b(view3, i2);
                        ha0 ha0Var2 = ba0.a;
                        ha0Var2.getClass();
                        ObjectAnimator L = L(view3, M(h70Var, 1.0f), 0.0f);
                        if (L == null) {
                            ha0Var2.S(view3, M(h70Var2, 1.0f));
                        }
                        if (L == null) {
                            ba0.b(view3, visibility);
                            return L;
                        }
                        ma0 ma0Var = new ma0(view3, i);
                        L.addListener(ma0Var);
                        p().a(ma0Var);
                        return L;
                    }
                    if (i5 == 0) {
                        int[] iArr = (int[]) h70Var.a.get("android:visibility:screenLocation");
                        int i7 = iArr[i2];
                        int i8 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i7 - iArr2[i2]) - view6.getLeft());
                        view6.offsetTopAndBottom((i8 - iArr2[c]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    ha0 ha0Var3 = ba0.a;
                    ha0Var3.getClass();
                    ObjectAnimator L2 = L(view6, M(h70Var, 1.0f), 0.0f);
                    if (L2 == null) {
                        ha0Var3.S(view6, M(h70Var2, 1.0f));
                    }
                    if (i5 == 0) {
                        if (L2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return L2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        na0 na0Var = new na0(this, viewGroup, view6, view4);
                        L2.addListener(na0Var);
                        L2.addPauseListener(na0Var);
                        p().a(na0Var);
                    }
                    return L2;
                }
            } else if ((i4 & 1) == 1 && h70Var2 != null) {
                View view8 = h70Var2.b;
                if (h70Var == null) {
                    View view9 = (View) view8.getParent();
                }
                ba0.a.getClass();
                return L(view8, M(h70Var, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // defpackage.y60
    public final String[] r() {
        return H;
    }

    @Override // defpackage.y60
    public final boolean t(h70 h70Var, h70 h70Var2) {
        if (h70Var == null && h70Var2 == null) {
            return false;
        }
        if (h70Var != null && h70Var2 != null && h70Var2.a.containsKey("android:visibility:visibility") != h70Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        oa0 N = N(h70Var, h70Var2);
        if (N.a) {
            return N.c == 0 || N.d == 0;
        }
        return false;
    }

    public qi(int i) {
        this();
        this.G = i;
    }
}
