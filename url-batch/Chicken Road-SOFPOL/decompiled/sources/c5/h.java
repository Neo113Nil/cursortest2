package c5;

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
import com.snovikpovik.vuevnxsj.R;
import java.util.HashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends o {
    public static final String[] E = {"android:visibility:visibility", "android:visibility:parent"};
    public final int D;

    public h(int i) {
        this();
        this.D = i;
    }

    public static void I(w wVar) {
        View view = wVar.f1735b;
        int visibility = view.getVisibility();
        HashMap hashMap = wVar.f1734a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(w wVar, float f6) {
        Float f8;
        return (wVar == null || (f8 = (Float) wVar.f1734a.get("android:fade:transitionAlpha")) == null) ? f6 : f8.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i0 L(w wVar, w wVar2) {
        i0 i0Var = new i0();
        i0Var.f1679a = false;
        i0Var.f1680b = false;
        if (wVar != null) {
            HashMap hashMap = wVar.f1734a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                i0Var.f1681c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                i0Var.f1683e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (wVar2 != null) {
                    HashMap hashMap2 = wVar2.f1734a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        i0Var.f1682d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        i0Var.f1684f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (wVar == null && wVar2 != null) {
                            int i = i0Var.f1681c;
                            int i8 = i0Var.f1682d;
                            if (i != i8 || i0Var.f1683e != i0Var.f1684f) {
                                if (i != i8) {
                                    if (i == 0) {
                                        i0Var.f1680b = false;
                                        i0Var.f1679a = true;
                                        return i0Var;
                                    }
                                    if (i8 == 0) {
                                        i0Var.f1680b = true;
                                        i0Var.f1679a = true;
                                        return i0Var;
                                    }
                                } else {
                                    if (i0Var.f1684f == null) {
                                        i0Var.f1680b = false;
                                        i0Var.f1679a = true;
                                        return i0Var;
                                    }
                                    if (i0Var.f1683e == null) {
                                        i0Var.f1680b = true;
                                        i0Var.f1679a = true;
                                        return i0Var;
                                    }
                                }
                            }
                        } else {
                            if (wVar != null && i0Var.f1682d == 0) {
                                i0Var.f1680b = true;
                                i0Var.f1679a = true;
                                return i0Var;
                            }
                            if (wVar2 == null && i0Var.f1681c == 0) {
                                i0Var.f1680b = false;
                                i0Var.f1679a = true;
                            }
                        }
                        return i0Var;
                    }
                }
                i0Var.f1682d = -1;
                i0Var.f1684f = null;
                if (wVar == null) {
                }
                if (wVar != null) {
                }
                if (wVar2 == null) {
                    i0Var.f1680b = false;
                    i0Var.f1679a = true;
                }
                return i0Var;
            }
        }
        i0Var.f1681c = -1;
        i0Var.f1683e = null;
        if (wVar2 != null) {
        }
        i0Var.f1682d = -1;
        i0Var.f1684f = null;
        if (wVar == null) {
        }
        if (wVar != null) {
        }
        if (wVar2 == null) {
        }
        return i0Var;
    }

    public final ObjectAnimator J(View view, float f6, float f8) {
        if (f6 == f8) {
            return null;
        }
        z.f1741a.y(view, f6);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, z.f1742b, f8);
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        o().a(gVar);
        return ofFloat;
    }

    @Override // c5.o
    public final void d(w wVar) {
        I(wVar);
    }

    @Override // c5.o
    public final void g(w wVar) {
        I(wVar);
        View view = wVar.f1735b;
        Float f6 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f6 == null) {
            f6 = view.getVisibility() == 0 ? Float.valueOf(z.f1741a.n(view)) : Float.valueOf(0.0f);
        }
        wVar.f1734a.put("android:fade:transitionAlpha", f6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (L(n(r3, false), r(r3, false)).f1679a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    @Override // c5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        boolean z3;
        View view;
        int i;
        char c8;
        int i8;
        View view2;
        Animator animator;
        View view3;
        boolean z7;
        ViewGroup viewGroup2;
        int i9;
        Bitmap bitmap;
        i0 L = L(wVar, wVar2);
        if (L.f1679a && (L.f1683e != null || L.f1684f != null)) {
            boolean z8 = L.f1680b;
            int i10 = this.D;
            int i11 = 1;
            if (!z8) {
                int i12 = L.f1682d;
                if ((i10 & 2) == 2 && wVar != null) {
                    View view4 = wVar.f1735b;
                    View view5 = wVar2 != null ? wVar2.f1735b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i12;
                        c8 = 1;
                        i8 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z3 = false;
                                view = null;
                                if (z3) {
                                    if (view4.getParent() == null) {
                                        i = i12;
                                        c8 = 1;
                                        i11 = 0;
                                        i8 = 0;
                                        view3 = view;
                                        animator = null;
                                        view6 = view4;
                                    } else if (view4.getParent() instanceof View) {
                                        View view7 = (View) view4.getParent();
                                        animator = null;
                                        i8 = 0;
                                        if (L(r(view7, true), n(view7, true)).f1679a) {
                                            i = i12;
                                            c8 = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view6 = view5;
                                            i11 = i8;
                                            view3 = view2;
                                        } else {
                                            boolean z9 = v.f1733a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            e0 e0Var = z.f1741a;
                                            e0Var.F(view4, matrix);
                                            e0Var.G(viewGroup, matrix);
                                            RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            c8 = 1;
                                            int round3 = Math.round(rectF.right);
                                            int round4 = Math.round(rectF.bottom);
                                            ImageView imageView = new ImageView(view4.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view4.isAttachedToWindow();
                                            boolean z10 = viewGroup != null && viewGroup.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z7 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i9 = 0;
                                            } else if (z10) {
                                                viewGroup2 = (ViewGroup) view4.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view4);
                                                z7 = isAttachedToWindow;
                                                viewGroup.getOverlay().add(view4);
                                                i9 = indexOfChild;
                                            } else {
                                                i = i12;
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view6 = imageView;
                                                i11 = i8;
                                                view3 = view2;
                                            }
                                            view2 = view;
                                            int round5 = Math.round(rectF.width());
                                            i = i12;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (v.f1733a) {
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
                                            if (!z7) {
                                                viewGroup.getOverlay().remove(view4);
                                                viewGroup2.addView(view4, i9);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i11 = i8;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i = i12;
                                c8 = 1;
                                i8 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i11 = i8;
                                view3 = view2;
                            }
                        } else if (i12 == 4 || view4 == view5) {
                            z3 = false;
                            view = view5;
                            view5 = null;
                            if (z3) {
                            }
                            i = i12;
                            c8 = 1;
                            i8 = 0;
                            view2 = view;
                            animator = null;
                            view6 = view5;
                            i11 = i8;
                            view3 = view2;
                        }
                        z3 = true;
                        view5 = null;
                        view = null;
                        if (z3) {
                        }
                        i = i12;
                        c8 = 1;
                        i8 = 0;
                        view2 = view;
                        animator = null;
                        view6 = view5;
                        i11 = i8;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        z.b(view3, i8);
                        e0 e0Var2 = z.f1741a;
                        e0Var2.getClass();
                        ObjectAnimator J = J(view3, K(wVar, 1.0f), 0.0f);
                        if (J == null) {
                            e0Var2.y(view3, K(wVar2, 1.0f));
                        }
                        if (J == null) {
                            z.b(view3, visibility);
                            return J;
                        }
                        g0 g0Var = new g0(view3, i);
                        J.addListener(g0Var);
                        o().a(g0Var);
                        return J;
                    }
                    if (i11 == 0) {
                        int[] iArr = (int[]) wVar.f1734a.get("android:visibility:screenLocation");
                        int i13 = iArr[i8];
                        int i14 = iArr[c8];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i13 - iArr2[i8]) - view6.getLeft());
                        view6.offsetTopAndBottom((i14 - iArr2[c8]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    e0 e0Var3 = z.f1741a;
                    e0Var3.getClass();
                    ObjectAnimator J2 = J(view6, K(wVar, 1.0f), 0.0f);
                    if (J2 == null) {
                        e0Var3.y(view6, K(wVar2, 1.0f));
                    }
                    if (i11 == 0) {
                        if (J2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return J2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        h0 h0Var = new h0(this, viewGroup, view6, view4);
                        J2.addListener(h0Var);
                        J2.addPauseListener(h0Var);
                        o().a(h0Var);
                    }
                    return J2;
                }
            } else if ((i10 & 1) == 1 && wVar2 != null) {
                View view8 = wVar2.f1735b;
                if (wVar == null) {
                    View view9 = (View) view8.getParent();
                }
                z.f1741a.getClass();
                return J(view8, K(wVar, 0.0f), 1.0f);
            }
        }
        return null;
    }

    @Override // c5.o
    public final String[] q() {
        return E;
    }

    @Override // c5.o
    public final boolean s(w wVar, w wVar2) {
        if (wVar == null && wVar2 == null) {
            return false;
        }
        if (wVar != null && wVar2 != null && wVar2.f1734a.containsKey("android:visibility:visibility") != wVar.f1734a.containsKey("android:visibility:visibility")) {
            return false;
        }
        i0 L = L(wVar, wVar2);
        if (L.f1679a) {
            return L.f1681c == 0 || L.f1682d == 0;
        }
        return false;
    }

    public h() {
        this.D = 3;
    }
}
