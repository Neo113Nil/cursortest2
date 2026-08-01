package f1;

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
import com.gglhk.bofio.fortunetiger.R;
import java.util.HashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h extends o {
    public static final String[] G = {"android:visibility:visibility", "android:visibility:parent"};
    public final int F;

    public h(int i4) {
        this();
        this.F = i4;
    }

    public static void I(w wVar) {
        View view = wVar.f1725b;
        int visibility = view.getVisibility();
        HashMap hashMap = wVar.f1724a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(w wVar, float f4) {
        Float f5;
        return (wVar == null || (f5 = (Float) wVar.f1724a.get("android:fade:transitionAlpha")) == null) ? f4 : f5.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h0 L(w wVar, w wVar2) {
        h0 h0Var = new h0();
        h0Var.f1679a = false;
        h0Var.f1680b = false;
        if (wVar != null) {
            HashMap hashMap = wVar.f1724a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                h0Var.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                h0Var.f1682e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (wVar2 != null) {
                    HashMap hashMap2 = wVar2.f1724a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        h0Var.f1681d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        h0Var.f1683f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (wVar == null && wVar2 != null) {
                            int i4 = h0Var.c;
                            int i5 = h0Var.f1681d;
                            if (i4 != i5 || h0Var.f1682e != h0Var.f1683f) {
                                if (i4 != i5) {
                                    if (i4 == 0) {
                                        h0Var.f1680b = false;
                                        h0Var.f1679a = true;
                                        return h0Var;
                                    }
                                    if (i5 == 0) {
                                        h0Var.f1680b = true;
                                        h0Var.f1679a = true;
                                        return h0Var;
                                    }
                                } else {
                                    if (h0Var.f1683f == null) {
                                        h0Var.f1680b = false;
                                        h0Var.f1679a = true;
                                        return h0Var;
                                    }
                                    if (h0Var.f1682e == null) {
                                        h0Var.f1680b = true;
                                        h0Var.f1679a = true;
                                        return h0Var;
                                    }
                                }
                            }
                        } else {
                            if (wVar != null && h0Var.f1681d == 0) {
                                h0Var.f1680b = true;
                                h0Var.f1679a = true;
                                return h0Var;
                            }
                            if (wVar2 == null && h0Var.c == 0) {
                                h0Var.f1680b = false;
                                h0Var.f1679a = true;
                            }
                        }
                        return h0Var;
                    }
                }
                h0Var.f1681d = -1;
                h0Var.f1683f = null;
                if (wVar == null) {
                }
                if (wVar != null) {
                }
                if (wVar2 == null) {
                    h0Var.f1680b = false;
                    h0Var.f1679a = true;
                }
                return h0Var;
            }
        }
        h0Var.c = -1;
        h0Var.f1682e = null;
        if (wVar2 != null) {
        }
        h0Var.f1681d = -1;
        h0Var.f1683f = null;
        if (wVar == null) {
        }
        if (wVar != null) {
        }
        if (wVar2 == null) {
        }
        return h0Var;
    }

    public final ObjectAnimator J(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        y.f1726a.U(view, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, y.f1727b, f5);
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        o().a(gVar);
        return ofFloat;
    }

    @Override // f1.o
    public final void d(w wVar) {
        I(wVar);
    }

    @Override // f1.o
    public final void g(w wVar) {
        I(wVar);
        View view = wVar.f1725b;
        Float f4 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f4 == null) {
            f4 = view.getVisibility() == 0 ? Float.valueOf(y.f1726a.A(view)) : Float.valueOf(0.0f);
        }
        wVar.f1724a.put("android:fade:transitionAlpha", f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (L(n(r3, false), r(r3, false)).f1679a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    @Override // f1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        boolean z3;
        View view;
        int i4;
        char c;
        int i5;
        View view2;
        Animator animator;
        View view3;
        boolean z4;
        ViewGroup viewGroup2;
        int i6;
        Bitmap bitmap;
        h0 L = L(wVar, wVar2);
        if (L.f1679a && (L.f1682e != null || L.f1683f != null)) {
            boolean z5 = L.f1680b;
            int i7 = this.F;
            int i8 = 1;
            if (!z5) {
                int i9 = L.f1681d;
                if ((i7 & 2) == 2 && wVar != null) {
                    View view4 = wVar.f1725b;
                    View view5 = wVar2 != null ? wVar2.f1725b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i4 = i9;
                        c = 1;
                        i5 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z3 = false;
                                view = null;
                                if (z3) {
                                    if (view4.getParent() == null) {
                                        i4 = i9;
                                        c = 1;
                                        i8 = 0;
                                        i5 = 0;
                                        view3 = view;
                                        animator = null;
                                        view6 = view4;
                                    } else if (view4.getParent() instanceof View) {
                                        View view7 = (View) view4.getParent();
                                        animator = null;
                                        i5 = 0;
                                        if (L(r(view7, true), n(view7, true)).f1679a) {
                                            i4 = i9;
                                            c = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view6 = view5;
                                            i8 = i5;
                                            view3 = view2;
                                        } else {
                                            boolean z6 = v.f1723a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            d0 d0Var = y.f1726a;
                                            d0Var.X(view4, matrix);
                                            d0Var.Y(viewGroup, matrix);
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
                                            boolean z7 = viewGroup != null && viewGroup.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z4 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i6 = 0;
                                            } else if (z7) {
                                                viewGroup2 = (ViewGroup) view4.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view4);
                                                z4 = isAttachedToWindow;
                                                viewGroup.getOverlay().add(view4);
                                                i6 = indexOfChild;
                                            } else {
                                                i4 = i9;
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view6 = imageView;
                                                i8 = i5;
                                                view3 = view2;
                                            }
                                            view2 = view;
                                            int round5 = Math.round(rectF.width());
                                            i4 = i9;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (v.f1723a) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view4.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = u.a(picture);
                                                } else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    view4.draw(canvas);
                                                }
                                            }
                                            if (!z4) {
                                                viewGroup.getOverlay().remove(view4);
                                                viewGroup2.addView(view4, i6);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i8 = i5;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i4 = i9;
                                c = 1;
                                i5 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i8 = i5;
                                view3 = view2;
                            }
                        } else if (i9 == 4 || view4 == view5) {
                            z3 = false;
                            view = view5;
                            view5 = null;
                            if (z3) {
                            }
                            i4 = i9;
                            c = 1;
                            i5 = 0;
                            view2 = view;
                            animator = null;
                            view6 = view5;
                            i8 = i5;
                            view3 = view2;
                        }
                        z3 = true;
                        view5 = null;
                        view = null;
                        if (z3) {
                        }
                        i4 = i9;
                        c = 1;
                        i5 = 0;
                        view2 = view;
                        animator = null;
                        view6 = view5;
                        i8 = i5;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        y.b(view3, i5);
                        d0 d0Var2 = y.f1726a;
                        d0Var2.getClass();
                        ObjectAnimator J = J(view3, K(wVar, 1.0f), 0.0f);
                        if (J == null) {
                            d0Var2.U(view3, K(wVar2, 1.0f));
                        }
                        if (J == null) {
                            y.b(view3, visibility);
                            return J;
                        }
                        f0 f0Var = new f0(view3, i4);
                        J.addListener(f0Var);
                        o().a(f0Var);
                        return J;
                    }
                    if (i8 == 0) {
                        int[] iArr = (int[]) wVar.f1724a.get("android:visibility:screenLocation");
                        int i10 = iArr[i5];
                        int i11 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i10 - iArr2[i5]) - view6.getLeft());
                        view6.offsetTopAndBottom((i11 - iArr2[c]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    d0 d0Var3 = y.f1726a;
                    d0Var3.getClass();
                    ObjectAnimator J2 = J(view6, K(wVar, 1.0f), 0.0f);
                    if (J2 == null) {
                        d0Var3.U(view6, K(wVar2, 1.0f));
                    }
                    if (i8 == 0) {
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
            } else if ((i7 & 1) == 1 && wVar2 != null) {
                View view8 = wVar2.f1725b;
                if (wVar == null) {
                    View view9 = (View) view8.getParent();
                }
                y.f1726a.getClass();
                return J(view8, K(wVar, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // f1.o
    public final String[] q() {
        return G;
    }

    @Override // f1.o
    public final boolean s(w wVar, w wVar2) {
        if (wVar == null && wVar2 == null) {
            return false;
        }
        if (wVar != null && wVar2 != null && wVar2.f1724a.containsKey("android:visibility:visibility") != wVar.f1724a.containsKey("android:visibility:visibility")) {
            return false;
        }
        h0 L = L(wVar, wVar2);
        if (L.f1679a) {
            return L.c == 0 || L.f1681d == 0;
        }
        return false;
    }

    public h() {
        this.F = 3;
    }
}
