package j1;

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
import com.oriondriftchasers.arordrft.R;
import java.util.HashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h extends o {
    public static final String[] H = {"android:visibility:visibility", "android:visibility:parent"};
    public final int G;

    public h(int i) {
        this();
        this.G = i;
    }

    public static void J(w wVar) {
        View view = wVar.f1968b;
        int visibility = view.getVisibility();
        HashMap hashMap = wVar.f1967a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float L(w wVar, float f2) {
        Float f4;
        return (wVar == null || (f4 = (Float) wVar.f1967a.get("android:fade:transitionAlpha")) == null) ? f2 : f4.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h0 M(w wVar, w wVar2) {
        h0 h0Var = new h0();
        h0Var.f1918a = false;
        h0Var.f1919b = false;
        if (wVar != null) {
            HashMap hashMap = wVar.f1967a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                h0Var.f1920c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                h0Var.f1921e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (wVar2 != null) {
                    HashMap hashMap2 = wVar2.f1967a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        h0Var.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        h0Var.f1922f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (wVar == null && wVar2 != null) {
                            int i = h0Var.f1920c;
                            int i4 = h0Var.d;
                            if (i != i4 || h0Var.f1921e != h0Var.f1922f) {
                                if (i != i4) {
                                    if (i == 0) {
                                        h0Var.f1919b = false;
                                        h0Var.f1918a = true;
                                        return h0Var;
                                    }
                                    if (i4 == 0) {
                                        h0Var.f1919b = true;
                                        h0Var.f1918a = true;
                                        return h0Var;
                                    }
                                } else {
                                    if (h0Var.f1922f == null) {
                                        h0Var.f1919b = false;
                                        h0Var.f1918a = true;
                                        return h0Var;
                                    }
                                    if (h0Var.f1921e == null) {
                                        h0Var.f1919b = true;
                                        h0Var.f1918a = true;
                                        return h0Var;
                                    }
                                }
                            }
                        } else {
                            if (wVar != null && h0Var.d == 0) {
                                h0Var.f1919b = true;
                                h0Var.f1918a = true;
                                return h0Var;
                            }
                            if (wVar2 == null && h0Var.f1920c == 0) {
                                h0Var.f1919b = false;
                                h0Var.f1918a = true;
                            }
                        }
                        return h0Var;
                    }
                }
                h0Var.d = -1;
                h0Var.f1922f = null;
                if (wVar == null) {
                }
                if (wVar != null) {
                }
                if (wVar2 == null) {
                    h0Var.f1919b = false;
                    h0Var.f1918a = true;
                }
                return h0Var;
            }
        }
        h0Var.f1920c = -1;
        h0Var.f1921e = null;
        if (wVar2 != null) {
        }
        h0Var.d = -1;
        h0Var.f1922f = null;
        if (wVar == null) {
        }
        if (wVar != null) {
        }
        if (wVar2 == null) {
        }
        return h0Var;
    }

    public final ObjectAnimator K(View view, float f2, float f4) {
        if (f2 == f4) {
            return null;
        }
        y.f1970a.m0(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, y.f1971b, f4);
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        p().a(gVar);
        return ofFloat;
    }

    @Override // j1.o
    public final void d(w wVar) {
        J(wVar);
    }

    @Override // j1.o
    public final void g(w wVar) {
        J(wVar);
        View view = wVar.f1968b;
        Float f2 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f2 == null) {
            f2 = view.getVisibility() == 0 ? Float.valueOf(y.f1970a.I(view)) : Float.valueOf(0.0f);
        }
        wVar.f1967a.put("android:fade:transitionAlpha", f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (M(o(r3, false), s(r3, false)).f1918a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    @Override // j1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        boolean z3;
        View view;
        int i;
        char c4;
        int i4;
        View view2;
        Animator animator;
        View view3;
        boolean z4;
        ViewGroup viewGroup2;
        int i5;
        Bitmap bitmap;
        h0 M = M(wVar, wVar2);
        if (M.f1918a && (M.f1921e != null || M.f1922f != null)) {
            boolean z5 = M.f1919b;
            int i6 = this.G;
            int i7 = 1;
            if (!z5) {
                int i8 = M.d;
                if ((i6 & 2) == 2 && wVar != null) {
                    View view4 = wVar.f1968b;
                    View view5 = wVar2 != null ? wVar2.f1968b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i8;
                        c4 = 1;
                        i4 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z3 = false;
                                view = null;
                                if (z3) {
                                    if (view4.getParent() == null) {
                                        i = i8;
                                        c4 = 1;
                                        i7 = 0;
                                        i4 = 0;
                                        view3 = view;
                                        animator = null;
                                        view6 = view4;
                                    } else if (view4.getParent() instanceof View) {
                                        View view7 = (View) view4.getParent();
                                        animator = null;
                                        i4 = 0;
                                        if (M(s(view7, true), o(view7, true)).f1918a) {
                                            i = i8;
                                            c4 = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view6 = view5;
                                            i7 = i4;
                                            view3 = view2;
                                        } else {
                                            boolean z6 = v.f1966a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            d0 d0Var = y.f1970a;
                                            d0Var.u0(view4, matrix);
                                            d0Var.v0(viewGroup, matrix);
                                            RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            c4 = 1;
                                            int round3 = Math.round(rectF.right);
                                            int round4 = Math.round(rectF.bottom);
                                            ImageView imageView = new ImageView(view4.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view4.isAttachedToWindow();
                                            boolean z7 = viewGroup != null && viewGroup.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z4 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i5 = 0;
                                            } else if (z7) {
                                                viewGroup2 = (ViewGroup) view4.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view4);
                                                z4 = isAttachedToWindow;
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
                                                if (v.f1966a) {
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
                                c4 = 1;
                                i4 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i7 = i4;
                                view3 = view2;
                            }
                        } else if (i8 == 4 || view4 == view5) {
                            z3 = false;
                            view = view5;
                            view5 = null;
                            if (z3) {
                            }
                            i = i8;
                            c4 = 1;
                            i4 = 0;
                            view2 = view;
                            animator = null;
                            view6 = view5;
                            i7 = i4;
                            view3 = view2;
                        }
                        z3 = true;
                        view5 = null;
                        view = null;
                        if (z3) {
                        }
                        i = i8;
                        c4 = 1;
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
                        y.b(view3, i4);
                        d0 d0Var2 = y.f1970a;
                        d0Var2.getClass();
                        ObjectAnimator K = K(view3, L(wVar, 1.0f), 0.0f);
                        if (K == null) {
                            d0Var2.m0(view3, L(wVar2, 1.0f));
                        }
                        if (K == null) {
                            y.b(view3, visibility);
                            return K;
                        }
                        f0 f0Var = new f0(view3, i);
                        K.addListener(f0Var);
                        p().a(f0Var);
                        return K;
                    }
                    if (i7 == 0) {
                        int[] iArr = (int[]) wVar.f1967a.get("android:visibility:screenLocation");
                        int i9 = iArr[i4];
                        int i10 = iArr[c4];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i9 - iArr2[i4]) - view6.getLeft());
                        view6.offsetTopAndBottom((i10 - iArr2[c4]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    d0 d0Var3 = y.f1970a;
                    d0Var3.getClass();
                    ObjectAnimator K2 = K(view6, L(wVar, 1.0f), 0.0f);
                    if (K2 == null) {
                        d0Var3.m0(view6, L(wVar2, 1.0f));
                    }
                    if (i7 == 0) {
                        if (K2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return K2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        g0 g0Var = new g0(this, viewGroup, view6, view4);
                        K2.addListener(g0Var);
                        K2.addPauseListener(g0Var);
                        p().a(g0Var);
                    }
                    return K2;
                }
            } else if ((i6 & 1) == 1 && wVar2 != null) {
                View view8 = wVar2.f1968b;
                if (wVar == null) {
                    View view9 = (View) view8.getParent();
                }
                y.f1970a.getClass();
                return K(view8, L(wVar, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // j1.o
    public final String[] r() {
        return H;
    }

    @Override // j1.o
    public final boolean t(w wVar, w wVar2) {
        if (wVar == null && wVar2 == null) {
            return false;
        }
        if (wVar != null && wVar2 != null && wVar2.f1967a.containsKey("android:visibility:visibility") != wVar.f1967a.containsKey("android:visibility:visibility")) {
            return false;
        }
        h0 M = M(wVar, wVar2);
        if (M.f1918a) {
            return M.f1920c == 0 || M.d == 0;
        }
        return false;
    }

    public h() {
        this.G = 3;
    }
}
