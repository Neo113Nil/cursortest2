package k1;

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
import com.gdmhkmf.belbet.R;
import java.util.HashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h extends n {
    public static final String[] G = {"android:visibility:visibility", "android:visibility:parent"};
    public final int F;

    public h(int i) {
        this();
        this.F = i;
    }

    public static void I(v vVar) {
        View view = vVar.f2377b;
        int visibility = view.getVisibility();
        HashMap hashMap = vVar.f2376a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(v vVar, float f5) {
        Float f6;
        return (vVar == null || (f6 = (Float) vVar.f2376a.get("android:fade:transitionAlpha")) == null) ? f5 : f6.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h0 L(v vVar, v vVar2) {
        h0 h0Var = new h0();
        h0Var.f2330a = false;
        h0Var.f2331b = false;
        if (vVar != null) {
            HashMap hashMap = vVar.f2376a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                h0Var.f2332c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                h0Var.f2333e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (vVar2 != null) {
                    HashMap hashMap2 = vVar2.f2376a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        h0Var.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        h0Var.f2334f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (vVar == null && vVar2 != null) {
                            int i = h0Var.f2332c;
                            int i4 = h0Var.d;
                            if (i != i4 || h0Var.f2333e != h0Var.f2334f) {
                                if (i != i4) {
                                    if (i == 0) {
                                        h0Var.f2331b = false;
                                        h0Var.f2330a = true;
                                        return h0Var;
                                    }
                                    if (i4 == 0) {
                                        h0Var.f2331b = true;
                                        h0Var.f2330a = true;
                                        return h0Var;
                                    }
                                } else {
                                    if (h0Var.f2334f == null) {
                                        h0Var.f2331b = false;
                                        h0Var.f2330a = true;
                                        return h0Var;
                                    }
                                    if (h0Var.f2333e == null) {
                                        h0Var.f2331b = true;
                                        h0Var.f2330a = true;
                                        return h0Var;
                                    }
                                }
                            }
                        } else {
                            if (vVar != null && h0Var.d == 0) {
                                h0Var.f2331b = true;
                                h0Var.f2330a = true;
                                return h0Var;
                            }
                            if (vVar2 == null && h0Var.f2332c == 0) {
                                h0Var.f2331b = false;
                                h0Var.f2330a = true;
                            }
                        }
                        return h0Var;
                    }
                }
                h0Var.d = -1;
                h0Var.f2334f = null;
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                if (vVar2 == null) {
                    h0Var.f2331b = false;
                    h0Var.f2330a = true;
                }
                return h0Var;
            }
        }
        h0Var.f2332c = -1;
        h0Var.f2333e = null;
        if (vVar2 != null) {
        }
        h0Var.d = -1;
        h0Var.f2334f = null;
        if (vVar == null) {
        }
        if (vVar != null) {
        }
        if (vVar2 == null) {
        }
        return h0Var;
    }

    public final ObjectAnimator J(View view, float f5, float f6) {
        if (f5 == f6) {
            return null;
        }
        x.f2379a.T(view, f5);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, x.f2380b, f6);
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        o().a(gVar);
        return ofFloat;
    }

    @Override // k1.n
    public final void d(v vVar) {
        I(vVar);
    }

    @Override // k1.n
    public final void g(v vVar) {
        I(vVar);
        View view = vVar.f2377b;
        Float f5 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f5 == null) {
            f5 = view.getVisibility() == 0 ? Float.valueOf(x.f2379a.A(view)) : Float.valueOf(0.0f);
        }
        vVar.f2376a.put("android:fade:transitionAlpha", f5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (L(n(r3, false), r(r3, false)).f2330a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    @Override // k1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        boolean z4;
        View view;
        int i;
        char c5;
        int i4;
        View view2;
        Animator animator;
        View view3;
        boolean z5;
        ViewGroup viewGroup2;
        int i5;
        Bitmap bitmap;
        h0 L = L(vVar, vVar2);
        if (L.f2330a && (L.f2333e != null || L.f2334f != null)) {
            boolean z6 = L.f2331b;
            int i6 = this.F;
            int i7 = 1;
            if (!z6) {
                int i8 = L.d;
                if ((i6 & 2) == 2 && vVar != null) {
                    View view4 = vVar.f2377b;
                    View view5 = vVar2 != null ? vVar2.f2377b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i8;
                        c5 = 1;
                        i4 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z4 = false;
                                view = null;
                                if (z4) {
                                    if (view4.getParent() == null) {
                                        i = i8;
                                        c5 = 1;
                                        i7 = 0;
                                        i4 = 0;
                                        view3 = view;
                                        animator = null;
                                        view6 = view4;
                                    } else if (view4.getParent() instanceof View) {
                                        View view7 = (View) view4.getParent();
                                        animator = null;
                                        i4 = 0;
                                        if (L(r(view7, true), n(view7, true)).f2330a) {
                                            i = i8;
                                            c5 = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view6 = view5;
                                            i7 = i4;
                                            view3 = view2;
                                        } else {
                                            boolean z7 = u.f2375a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            d0 d0Var = x.f2379a;
                                            d0Var.a0(view4, matrix);
                                            d0Var.b0(viewGroup, matrix);
                                            RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            c5 = 1;
                                            int round3 = Math.round(rectF.right);
                                            int round4 = Math.round(rectF.bottom);
                                            ImageView imageView = new ImageView(view4.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view4.isAttachedToWindow();
                                            boolean z8 = viewGroup != null && viewGroup.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z5 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i5 = 0;
                                            } else if (z8) {
                                                viewGroup2 = (ViewGroup) view4.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view4);
                                                z5 = isAttachedToWindow;
                                                viewGroup.getOverlay().add(view4);
                                                i5 = indexOfChild;
                                            } else {
                                                i = i8;
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view6 = imageView;
                                                i7 = i4;
                                                view3 = view2;
                                            }
                                            view2 = view;
                                            int round5 = Math.round(rectF.width());
                                            i = i8;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (u.f2375a) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view4.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = t.a(picture);
                                                } else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    view4.draw(canvas);
                                                }
                                            }
                                            if (!z5) {
                                                viewGroup.getOverlay().remove(view4);
                                                viewGroup2.addView(view4, i5);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i7 = i4;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i = i8;
                                c5 = 1;
                                i4 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i7 = i4;
                                view3 = view2;
                            }
                        } else if (i8 == 4 || view4 == view5) {
                            z4 = false;
                            view = view5;
                            view5 = null;
                            if (z4) {
                            }
                            i = i8;
                            c5 = 1;
                            i4 = 0;
                            view2 = view;
                            animator = null;
                            view6 = view5;
                            i7 = i4;
                            view3 = view2;
                        }
                        z4 = true;
                        view5 = null;
                        view = null;
                        if (z4) {
                        }
                        i = i8;
                        c5 = 1;
                        i4 = 0;
                        view2 = view;
                        animator = null;
                        view6 = view5;
                        i7 = i4;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        x.b(view3, i4);
                        d0 d0Var2 = x.f2379a;
                        d0Var2.getClass();
                        ObjectAnimator J = J(view3, K(vVar, 1.0f), 0.0f);
                        if (J == null) {
                            d0Var2.T(view3, K(vVar2, 1.0f));
                        }
                        if (J == null) {
                            x.b(view3, visibility);
                            return J;
                        }
                        f0 f0Var = new f0(view3, i);
                        J.addListener(f0Var);
                        o().a(f0Var);
                        return J;
                    }
                    if (i7 == 0) {
                        int[] iArr = (int[]) vVar.f2376a.get("android:visibility:screenLocation");
                        int i9 = iArr[i4];
                        int i10 = iArr[c5];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i9 - iArr2[i4]) - view6.getLeft());
                        view6.offsetTopAndBottom((i10 - iArr2[c5]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    d0 d0Var3 = x.f2379a;
                    d0Var3.getClass();
                    ObjectAnimator J2 = J(view6, K(vVar, 1.0f), 0.0f);
                    if (J2 == null) {
                        d0Var3.T(view6, K(vVar2, 1.0f));
                    }
                    if (i7 == 0) {
                        if (J2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return J2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        g0 g0Var = new g0(this, viewGroup, view6, view4);
                        J2.addListener(g0Var);
                        J2.addPauseListener(g0Var);
                        o().a(g0Var);
                    }
                    return J2;
                }
            } else if ((i6 & 1) == 1 && vVar2 != null) {
                View view8 = vVar2.f2377b;
                if (vVar == null) {
                    View view9 = (View) view8.getParent();
                }
                x.f2379a.getClass();
                return J(view8, K(vVar, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // k1.n
    public final String[] q() {
        return G;
    }

    @Override // k1.n
    public final boolean s(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.f2376a.containsKey("android:visibility:visibility") != vVar.f2376a.containsKey("android:visibility:visibility")) {
            return false;
        }
        h0 L = L(vVar, vVar2);
        if (L.f2330a) {
            return L.f2332c == 0 || L.d == 0;
        }
        return false;
    }

    public h() {
        this.F = 3;
    }
}
