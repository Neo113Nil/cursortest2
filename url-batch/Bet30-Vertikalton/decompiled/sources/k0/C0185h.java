package k0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.lasercut.dash.R;
import java.util.HashMap;

/* renamed from: k0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185h extends AbstractC0190m {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f2791B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A, reason: collision with root package name */
    public final int f2792A;

    public C0185h(int i) {
        this();
        this.f2792A = i;
    }

    public static void I(C0198u c0198u) {
        int visibility = c0198u.f2836b.getVisibility();
        HashMap hashMap = c0198u.f2835a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c0198u.f2836b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(C0198u c0198u, float f2) {
        Float f3;
        return (c0198u == null || (f3 = (Float) c0198u.f2835a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0177G L(C0198u c0198u, C0198u c0198u2) {
        C0177G c0177g = new C0177G();
        c0177g.f2765a = false;
        c0177g.f2766b = false;
        if (c0198u != null) {
            HashMap hashMap = c0198u.f2835a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                c0177g.f2767c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                c0177g.f2768e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (c0198u2 != null) {
                    HashMap hashMap2 = c0198u2.f2835a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        c0177g.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        c0177g.f2769f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (c0198u == null && c0198u2 != null) {
                            int i = c0177g.f2767c;
                            int i2 = c0177g.d;
                            if (i == i2 && c0177g.f2768e == c0177g.f2769f) {
                                return c0177g;
                            }
                            if (i != i2) {
                                if (i == 0) {
                                    c0177g.f2766b = false;
                                    c0177g.f2765a = true;
                                } else if (i2 == 0) {
                                    c0177g.f2766b = true;
                                    c0177g.f2765a = true;
                                }
                            } else if (c0177g.f2769f == null) {
                                c0177g.f2766b = false;
                                c0177g.f2765a = true;
                            } else if (c0177g.f2768e == null) {
                                c0177g.f2766b = true;
                                c0177g.f2765a = true;
                            }
                        } else if (c0198u != null && c0177g.d == 0) {
                            c0177g.f2766b = true;
                            c0177g.f2765a = true;
                        } else if (c0198u2 == null && c0177g.f2767c == 0) {
                            c0177g.f2766b = false;
                            c0177g.f2765a = true;
                        }
                        return c0177g;
                    }
                }
                c0177g.d = -1;
                c0177g.f2769f = null;
                if (c0198u == null) {
                }
                if (c0198u != null) {
                }
                if (c0198u2 == null) {
                    c0177g.f2766b = false;
                    c0177g.f2765a = true;
                }
                return c0177g;
            }
        }
        c0177g.f2767c = -1;
        c0177g.f2768e = null;
        if (c0198u2 != null) {
        }
        c0177g.d = -1;
        c0177g.f2769f = null;
        if (c0198u == null) {
        }
        if (c0198u != null) {
        }
        if (c0198u2 == null) {
        }
        return c0177g;
    }

    public final ObjectAnimator J(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        AbstractC0200w.f2838a.r(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AbstractC0200w.f2839b, f3);
        C0184g c0184g = new C0184g(view);
        ofFloat.addListener(c0184g);
        o().a(c0184g);
        return ofFloat;
    }

    @Override // k0.AbstractC0190m
    public final void d(C0198u c0198u) {
        I(c0198u);
    }

    @Override // k0.AbstractC0190m
    public final void g(C0198u c0198u) {
        I(c0198u);
        View view = c0198u.f2836b;
        Float f2 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f2 == null) {
            f2 = view.getVisibility() == 0 ? Float.valueOf(AbstractC0200w.f2838a.j(view)) : Float.valueOf(0.0f);
        }
        c0198u.f2835a.put("android:fade:transitionAlpha", f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (L(n(r3, false), r(r3, false)).f2765a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    @Override // k0.AbstractC0190m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(FrameLayout frameLayout, C0198u c0198u, C0198u c0198u2) {
        boolean z2;
        View view;
        int i;
        View view2;
        View view3;
        ViewGroup viewGroup;
        int i2;
        Bitmap bitmap;
        int i3 = this.f2792A;
        C0177G L2 = L(c0198u, c0198u2);
        if (!L2.f2765a || (L2.f2768e == null && L2.f2769f == null)) {
            return null;
        }
        boolean z3 = false;
        if (L2.f2766b) {
            if ((i3 & 1) == 1 && c0198u2 != null) {
                View view4 = c0198u2.f2836b;
                if (c0198u == null) {
                    View view5 = (View) view4.getParent();
                }
                AbstractC0200w.f2838a.getClass();
                return J(view4, K(c0198u, 0.0f), 1.0f);
            }
            return null;
        }
        int i4 = L2.d;
        if ((i3 & 2) == 2 && c0198u != null) {
            View view6 = c0198u2 != null ? c0198u2.f2836b : null;
            View view7 = c0198u.f2836b;
            View view8 = (View) view7.getTag(R.id.save_overlay_view);
            if (view8 != null) {
                i = i4;
                z3 = true;
                view3 = null;
            } else {
                if (view6 == null || view6.getParent() == null) {
                    if (view6 != null) {
                        z2 = false;
                        view = null;
                        if (z2) {
                            if (view7.getParent() == null) {
                                i = i4;
                                view3 = view;
                                view8 = view7;
                            } else if (view7.getParent() instanceof View) {
                                View view9 = (View) view7.getParent();
                                if (L(r(view9, true), n(view9, true)).f2765a) {
                                    i = i4;
                                    view2 = view;
                                    int id = view9.getId();
                                    if (view9.getParent() == null && id != -1) {
                                        frameLayout.findViewById(id);
                                    }
                                    view8 = view6;
                                    view3 = view2;
                                    z3 = false;
                                } else {
                                    boolean z4 = AbstractC0197t.f2834a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                    C0173C c0173c = AbstractC0200w.f2838a;
                                    c0173c.w(view7, matrix);
                                    c0173c.x(frameLayout, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                    matrix.mapRect(rectF);
                                    int round = Math.round(rectF.left);
                                    int round2 = Math.round(rectF.top);
                                    int round3 = Math.round(rectF.right);
                                    int round4 = Math.round(rectF.bottom);
                                    ImageView imageView = new ImageView(view7.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    boolean isAttachedToWindow = view7.isAttachedToWindow();
                                    boolean z5 = frameLayout != null && frameLayout.isAttachedToWindow();
                                    if (isAttachedToWindow) {
                                        view2 = view;
                                        viewGroup = null;
                                        i2 = 0;
                                    } else if (z5) {
                                        ViewGroup viewGroup2 = (ViewGroup) view7.getParent();
                                        int indexOfChild = viewGroup2.indexOfChild(view7);
                                        frameLayout.getOverlay().add(view7);
                                        viewGroup = viewGroup2;
                                        view2 = view;
                                        i2 = indexOfChild;
                                    } else {
                                        i = i4;
                                        view2 = view;
                                        bitmap = null;
                                        if (bitmap != null) {
                                            imageView.setImageBitmap(bitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        imageView.layout(round, round2, round3, round4);
                                        view8 = imageView;
                                        view3 = view2;
                                        z3 = false;
                                    }
                                    i = i4;
                                    int round5 = Math.round(rectF.width());
                                    int round6 = Math.round(rectF.height());
                                    if (round5 <= 0 || round6 <= 0) {
                                        bitmap = null;
                                    } else {
                                        float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                        int round7 = Math.round(round5 * min);
                                        int round8 = Math.round(round6 * min);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(min, min);
                                        if (AbstractC0197t.f2834a) {
                                            Picture picture = new Picture();
                                            Canvas beginRecording = picture.beginRecording(round7, round8);
                                            beginRecording.concat(matrix);
                                            view7.draw(beginRecording);
                                            picture.endRecording();
                                            bitmap = AbstractC0196s.a(picture);
                                        } else {
                                            bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmap);
                                            canvas.concat(matrix);
                                            view7.draw(canvas);
                                        }
                                    }
                                    if (!isAttachedToWindow) {
                                        frameLayout.getOverlay().remove(view7);
                                        viewGroup.addView(view7, i2);
                                    }
                                    if (bitmap != null) {
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                    imageView.layout(round, round2, round3, round4);
                                    view8 = imageView;
                                    view3 = view2;
                                    z3 = false;
                                }
                            }
                        }
                        i = i4;
                        view2 = view;
                        view8 = view6;
                        view3 = view2;
                        z3 = false;
                    }
                } else if (i4 == 4 || view7 == view6) {
                    view = view6;
                    z2 = false;
                    view6 = null;
                    if (z2) {
                    }
                    i = i4;
                    view2 = view;
                    view8 = view6;
                    view3 = view2;
                    z3 = false;
                }
                z2 = true;
                view6 = null;
                view = null;
                if (z2) {
                }
                i = i4;
                view2 = view;
                view8 = view6;
                view3 = view2;
                z3 = false;
            }
            if (view8 != null) {
                if (!z3) {
                    int[] iArr = (int[]) c0198u.f2835a.get("android:visibility:screenLocation");
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    int[] iArr2 = new int[2];
                    frameLayout.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i5 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i6 - iArr2[1]) - view8.getTop());
                    frameLayout.getOverlay().add(view8);
                }
                C0173C c0173c2 = AbstractC0200w.f2838a;
                c0173c2.getClass();
                ObjectAnimator J2 = J(view8, K(c0198u, 1.0f), 0.0f);
                if (J2 == null) {
                    c0173c2.r(view8, K(c0198u2, 1.0f));
                }
                if (z3) {
                    return J2;
                }
                if (J2 == null) {
                    frameLayout.getOverlay().remove(view8);
                    return J2;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                C0176F c0176f = new C0176F(this, frameLayout, view8, view7);
                J2.addListener(c0176f);
                J2.addPauseListener(c0176f);
                o().a(c0176f);
                return J2;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                AbstractC0200w.b(view3, 0);
                C0173C c0173c3 = AbstractC0200w.f2838a;
                c0173c3.getClass();
                ObjectAnimator J3 = J(view3, K(c0198u, 1.0f), 0.0f);
                if (J3 == null) {
                    c0173c3.r(view3, K(c0198u2, 1.0f));
                }
                if (J3 != null) {
                    C0175E c0175e = new C0175E(view3, i);
                    J3.addListener(c0175e);
                    o().a(c0175e);
                } else {
                    AbstractC0200w.b(view3, visibility);
                }
                return J3;
            }
        }
        return null;
    }

    @Override // k0.AbstractC0190m
    public final String[] q() {
        return f2791B;
    }

    @Override // k0.AbstractC0190m
    public final boolean s(C0198u c0198u, C0198u c0198u2) {
        if (c0198u == null && c0198u2 == null) {
            return false;
        }
        if (c0198u != null && c0198u2 != null && c0198u2.f2835a.containsKey("android:visibility:visibility") != c0198u.f2835a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0177G L2 = L(c0198u, c0198u2);
        if (L2.f2765a) {
            return L2.f2767c == 0 || L2.d == 0;
        }
        return false;
    }

    public C0185h() {
        this.f2792A = 3;
    }
}
