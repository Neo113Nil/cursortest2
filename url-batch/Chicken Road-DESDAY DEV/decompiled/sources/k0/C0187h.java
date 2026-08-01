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
import com.playgen.securelock.R;
import java.util.HashMap;

/* renamed from: k0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187h extends n {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f2719B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A, reason: collision with root package name */
    public final int f2720A;

    public C0187h(int i) {
        this();
        this.f2720A = i;
    }

    public static void I(v vVar) {
        int visibility = vVar.f2767b.getVisibility();
        HashMap hashMap = vVar.f2766a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = vVar.f2767b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(v vVar, float f2) {
        Float f3;
        return (vVar == null || (f3 = (Float) vVar.f2766a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static H L(v vVar, v vVar2) {
        H h = new H();
        h.f2693a = false;
        h.f2694b = false;
        if (vVar != null) {
            HashMap hashMap = vVar.f2766a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                h.f2695c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                h.f2696e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (vVar2 != null) {
                    HashMap hashMap2 = vVar2.f2766a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        h.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        h.f2697f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (vVar == null && vVar2 != null) {
                            int i = h.f2695c;
                            int i2 = h.d;
                            if (i == i2 && h.f2696e == h.f2697f) {
                                return h;
                            }
                            if (i != i2) {
                                if (i == 0) {
                                    h.f2694b = false;
                                    h.f2693a = true;
                                } else if (i2 == 0) {
                                    h.f2694b = true;
                                    h.f2693a = true;
                                }
                            } else if (h.f2697f == null) {
                                h.f2694b = false;
                                h.f2693a = true;
                            } else if (h.f2696e == null) {
                                h.f2694b = true;
                                h.f2693a = true;
                            }
                        } else if (vVar != null && h.d == 0) {
                            h.f2694b = true;
                            h.f2693a = true;
                        } else if (vVar2 == null && h.f2695c == 0) {
                            h.f2694b = false;
                            h.f2693a = true;
                        }
                        return h;
                    }
                }
                h.d = -1;
                h.f2697f = null;
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                if (vVar2 == null) {
                    h.f2694b = false;
                    h.f2693a = true;
                }
                return h;
            }
        }
        h.f2695c = -1;
        h.f2696e = null;
        if (vVar2 != null) {
        }
        h.d = -1;
        h.f2697f = null;
        if (vVar == null) {
        }
        if (vVar != null) {
        }
        if (vVar2 == null) {
        }
        return h;
    }

    public final ObjectAnimator J(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        x.f2769a.s(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, x.f2770b, f3);
        C0186g c0186g = new C0186g(view);
        ofFloat.addListener(c0186g);
        o().a(c0186g);
        return ofFloat;
    }

    @Override // k0.n
    public final void d(v vVar) {
        I(vVar);
    }

    @Override // k0.n
    public final void g(v vVar) {
        I(vVar);
        View view = vVar.f2767b;
        Float f2 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f2 == null) {
            f2 = view.getVisibility() == 0 ? Float.valueOf(x.f2769a.k(view)) : Float.valueOf(0.0f);
        }
        vVar.f2766a.put("android:fade:transitionAlpha", f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (L(n(r3, false), r(r3, false)).f2693a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    @Override // k0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(FrameLayout frameLayout, v vVar, v vVar2) {
        boolean z2;
        View view;
        int i;
        View view2;
        View view3;
        ViewGroup viewGroup;
        int i2;
        Bitmap bitmap;
        int i3 = this.f2720A;
        H L2 = L(vVar, vVar2);
        if (!L2.f2693a || (L2.f2696e == null && L2.f2697f == null)) {
            return null;
        }
        boolean z3 = false;
        if (L2.f2694b) {
            if ((i3 & 1) == 1 && vVar2 != null) {
                View view4 = vVar2.f2767b;
                if (vVar == null) {
                    View view5 = (View) view4.getParent();
                }
                x.f2769a.getClass();
                return J(view4, K(vVar, 0.0f), 1.0f);
            }
            return null;
        }
        int i4 = L2.d;
        if ((i3 & 2) == 2 && vVar != null) {
            View view6 = vVar2 != null ? vVar2.f2767b : null;
            View view7 = vVar.f2767b;
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
                                if (L(r(view9, true), n(view9, true)).f2693a) {
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
                                    boolean z4 = u.f2765a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                    C0178D c0178d = x.f2769a;
                                    c0178d.x(view7, matrix);
                                    c0178d.y(frameLayout, matrix);
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
                                        if (u.f2765a) {
                                            Picture picture = new Picture();
                                            Canvas beginRecording = picture.beginRecording(round7, round8);
                                            beginRecording.concat(matrix);
                                            view7.draw(beginRecording);
                                            picture.endRecording();
                                            bitmap = t.a(picture);
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
                    int[] iArr = (int[]) vVar.f2766a.get("android:visibility:screenLocation");
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    int[] iArr2 = new int[2];
                    frameLayout.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i5 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i6 - iArr2[1]) - view8.getTop());
                    frameLayout.getOverlay().add(view8);
                }
                C0178D c0178d2 = x.f2769a;
                c0178d2.getClass();
                ObjectAnimator J2 = J(view8, K(vVar, 1.0f), 0.0f);
                if (J2 == null) {
                    c0178d2.s(view8, K(vVar2, 1.0f));
                }
                if (z3) {
                    return J2;
                }
                if (J2 == null) {
                    frameLayout.getOverlay().remove(view8);
                    return J2;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                G g2 = new G(this, frameLayout, view8, view7);
                J2.addListener(g2);
                J2.addPauseListener(g2);
                o().a(g2);
                return J2;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                x.b(view3, 0);
                C0178D c0178d3 = x.f2769a;
                c0178d3.getClass();
                ObjectAnimator J3 = J(view3, K(vVar, 1.0f), 0.0f);
                if (J3 == null) {
                    c0178d3.s(view3, K(vVar2, 1.0f));
                }
                if (J3 != null) {
                    F f2 = new F(view3, i);
                    J3.addListener(f2);
                    o().a(f2);
                } else {
                    x.b(view3, visibility);
                }
                return J3;
            }
        }
        return null;
    }

    @Override // k0.n
    public final String[] q() {
        return f2719B;
    }

    @Override // k0.n
    public final boolean s(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.f2766a.containsKey("android:visibility:visibility") != vVar.f2766a.containsKey("android:visibility:visibility")) {
            return false;
        }
        H L2 = L(vVar, vVar2);
        if (L2.f2693a) {
            return L2.f2695c == 0 || L2.d == 0;
        }
        return false;
    }

    public C0187h() {
        this.f2720A = 3;
    }
}
