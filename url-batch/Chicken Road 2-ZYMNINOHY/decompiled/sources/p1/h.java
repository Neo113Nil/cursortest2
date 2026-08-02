package p1;

import a0.n0;
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
import com.rockchicken.pump.up.road.R;
import java.util.HashMap;
import l1.C1257d;

/* loaded from: classes.dex */
public final class h extends q {

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f14756w = {"android:visibility:visibility", "android:visibility:parent"};
    public final int v;

    public h(int i4) {
        this.v = i4;
    }

    public static void H(x xVar) {
        int visibility = xVar.f14805b.getVisibility();
        HashMap hashMap = xVar.f14804a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = xVar.f14805b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n0 J(x xVar, x xVar2) {
        n0 n0Var = new n0();
        n0Var.f4198a = false;
        n0Var.f4199b = false;
        if (xVar != null) {
            HashMap hashMap = xVar.f14804a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                n0Var.f4200c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                n0Var.f4202e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (xVar2 != null) {
                    HashMap hashMap2 = xVar2.f14804a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        n0Var.f4201d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        n0Var.f4203f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (xVar == null && xVar2 != null) {
                            int i4 = n0Var.f4200c;
                            int i5 = n0Var.f4201d;
                            if (i4 != i5 || ((ViewGroup) n0Var.f4202e) != ((ViewGroup) n0Var.f4203f)) {
                                if (i4 != i5) {
                                    if (i4 == 0) {
                                        n0Var.f4199b = false;
                                        n0Var.f4198a = true;
                                        return n0Var;
                                    }
                                    if (i5 == 0) {
                                        n0Var.f4199b = true;
                                        n0Var.f4198a = true;
                                        return n0Var;
                                    }
                                } else {
                                    if (((ViewGroup) n0Var.f4203f) == null) {
                                        n0Var.f4199b = false;
                                        n0Var.f4198a = true;
                                        return n0Var;
                                    }
                                    if (((ViewGroup) n0Var.f4202e) == null) {
                                        n0Var.f4199b = true;
                                        n0Var.f4198a = true;
                                        return n0Var;
                                    }
                                }
                            }
                        } else {
                            if (xVar != null && n0Var.f4201d == 0) {
                                n0Var.f4199b = true;
                                n0Var.f4198a = true;
                                return n0Var;
                            }
                            if (xVar2 == null && n0Var.f4200c == 0) {
                                n0Var.f4199b = false;
                                n0Var.f4198a = true;
                            }
                        }
                        return n0Var;
                    }
                }
                n0Var.f4201d = -1;
                n0Var.f4203f = null;
                if (xVar == null) {
                }
                if (xVar != null) {
                }
                if (xVar2 == null) {
                    n0Var.f4199b = false;
                    n0Var.f4198a = true;
                }
                return n0Var;
            }
        }
        n0Var.f4200c = -1;
        n0Var.f4202e = null;
        if (xVar2 != null) {
        }
        n0Var.f4201d = -1;
        n0Var.f4203f = null;
        if (xVar == null) {
        }
        if (xVar != null) {
        }
        if (xVar2 == null) {
        }
        return n0Var;
    }

    public final ObjectAnimator I(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        y.f14807a.w(view, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, y.f14808b, f5);
        ofFloat.addListener(new C1257d(view));
        a(new g(0, view));
        return ofFloat;
    }

    @Override // p1.q
    public final void e(x xVar) {
        H(xVar);
    }

    @Override // p1.q
    public final void h(x xVar) {
        H(xVar);
        xVar.f14804a.put("android:fade:transitionAlpha", Float.valueOf(y.f14807a.l(xVar.f14805b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (J(o(r3, false), r(r3, false)).f4198a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020f  */
    @Override // p1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator l(ViewGroup viewGroup, x xVar, x xVar2) {
        boolean z;
        View view;
        int i4;
        Object obj;
        char c4;
        int i5;
        View view2;
        Animator animator;
        View view3;
        boolean z4;
        boolean z5;
        boolean z6;
        ViewGroup viewGroup2;
        int i6;
        Bitmap bitmap;
        Float f4;
        n0 J4 = J(xVar, xVar2);
        if (J4.f4198a && (((ViewGroup) J4.f4202e) != null || ((ViewGroup) J4.f4203f) != null)) {
            boolean z7 = J4.f4199b;
            int i7 = this.v;
            int i8 = 0;
            if (!z7) {
                int i9 = J4.f4201d;
                if ((i7 & 2) == 2 && xVar != null) {
                    HashMap hashMap = xVar.f14804a;
                    View view4 = xVar.f14805b;
                    View view5 = xVar2 != null ? xVar2.f14805b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i4 = i9;
                        obj = "android:fade:transitionAlpha";
                        c4 = 1;
                        i5 = 0;
                        view3 = null;
                        animator = null;
                        i8 = 1;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z = false;
                                view = null;
                                if (z) {
                                    if (view4.getParent() == null) {
                                        i4 = i9;
                                        obj = "android:fade:transitionAlpha";
                                        c4 = 1;
                                        i5 = 0;
                                        view3 = view;
                                        animator = null;
                                        view6 = view4;
                                    } else if (view4.getParent() instanceof View) {
                                        View view7 = (View) view4.getParent();
                                        animator = null;
                                        i5 = 0;
                                        if (J(r(view7, true), o(view7, true)).f4198a) {
                                            i4 = i9;
                                            obj = "android:fade:transitionAlpha";
                                            c4 = 1;
                                            view2 = view;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view6 = view5;
                                            i8 = i5;
                                            view3 = view2;
                                        } else {
                                            boolean z8 = w.f14801a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            A a3 = y.f14807a;
                                            a3.Q(view4, matrix);
                                            a3.R(viewGroup, matrix);
                                            RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            c4 = 1;
                                            int round3 = Math.round(rectF.right);
                                            int round4 = Math.round(rectF.bottom);
                                            ImageView imageView = new ImageView(view4.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            if (w.f14801a) {
                                                z4 = !view4.isAttachedToWindow();
                                                z5 = viewGroup == null ? false : viewGroup.isAttachedToWindow();
                                            } else {
                                                z4 = false;
                                                z5 = false;
                                            }
                                            boolean z9 = w.f14802b;
                                            if (!z9 || !z4) {
                                                z6 = z4;
                                                viewGroup2 = null;
                                                i6 = 0;
                                            } else if (z5) {
                                                viewGroup2 = (ViewGroup) view4.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view4);
                                                z6 = z4;
                                                viewGroup.getOverlay().add(view4);
                                                i6 = indexOfChild;
                                            } else {
                                                i4 = i9;
                                                obj = "android:fade:transitionAlpha";
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
                                                obj = "android:fade:transitionAlpha";
                                                bitmap = null;
                                            } else {
                                                obj = "android:fade:transitionAlpha";
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (w.f14803c) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view4.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = Bitmap.createBitmap(picture);
                                                } else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    view4.draw(canvas);
                                                }
                                            }
                                            if (z9 && z6) {
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
                                obj = "android:fade:transitionAlpha";
                                c4 = 1;
                                i5 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i8 = i5;
                                view3 = view2;
                            }
                        } else if (i9 == 4 || view4 == view5) {
                            view = view5;
                            z = false;
                            view5 = null;
                            if (z) {
                            }
                            i4 = i9;
                            obj = "android:fade:transitionAlpha";
                            c4 = 1;
                            i5 = 0;
                            view2 = view;
                            animator = null;
                            view6 = view5;
                            i8 = i5;
                            view3 = view2;
                        }
                        z = true;
                        view5 = null;
                        view = null;
                        if (z) {
                        }
                        i4 = i9;
                        obj = "android:fade:transitionAlpha";
                        c4 = 1;
                        i5 = 0;
                        view2 = view;
                        animator = null;
                        view6 = view5;
                        i8 = i5;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        Object obj2 = obj;
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        A a4 = y.f14807a;
                        a4.x(view3, i5);
                        a4.getClass();
                        Float f5 = (Float) hashMap.get(obj2);
                        ObjectAnimator I4 = I(view3, f5 != null ? f5.floatValue() : 1.0f, 0.0f);
                        if (I4 == null) {
                            a4.x(view3, visibility);
                            return I4;
                        }
                        D d4 = new D(view3, i4);
                        I4.addListener(d4);
                        I4.addPauseListener(d4);
                        a(d4);
                        return I4;
                    }
                    if (i8 == 0) {
                        int[] iArr = (int[]) hashMap.get("android:visibility:screenLocation");
                        int i10 = iArr[i5];
                        int i11 = iArr[c4];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i10 - iArr2[i5]) - view6.getLeft());
                        view6.offsetTopAndBottom((i11 - iArr2[c4]) - view6.getTop());
                        viewGroup.getOverlay().add(view6);
                    }
                    y.f14807a.getClass();
                    Float f6 = (Float) hashMap.get(obj);
                    ObjectAnimator I5 = I(view6, f6 != null ? f6.floatValue() : 1.0f, 0.0f);
                    if (i8 == 0) {
                        if (I5 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return I5;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        a(new C(this, viewGroup, view6, view4));
                    }
                    return I5;
                }
            } else if ((i7 & 1) == 1 && xVar2 != null) {
                View view8 = xVar2.f14805b;
                if (xVar == null) {
                    View view9 = (View) view8.getParent();
                }
                float floatValue = (xVar == null || (f4 = (Float) xVar.f14804a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f4.floatValue();
                return I(view8, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
            }
        }
        return null;
    }

    @Override // p1.q
    public final String[] q() {
        return f14756w;
    }

    @Override // p1.q
    public final boolean s(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f14804a.containsKey("android:visibility:visibility") != xVar.f14804a.containsKey("android:visibility:visibility")) {
            return false;
        }
        n0 J4 = J(xVar, xVar2);
        if (J4.f4198a) {
            return J4.f4200c == 0 || J4.f4201d == 0;
        }
        return false;
    }
}
