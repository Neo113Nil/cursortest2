package l0;

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
import androidx.recyclerview.widget.RecyclerView;
import com.playbag.tripgear.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h extends m {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f3069B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A, reason: collision with root package name */
    public final int f3070A;

    public h(int i) {
        this();
        this.f3070A = i;
    }

    public static void I(u uVar) {
        int visibility = uVar.f3114b.getVisibility();
        HashMap hashMap = uVar.f3113a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = uVar.f3114b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(u uVar, float f2) {
        Float f3;
        return (uVar == null || (f3 = (Float) uVar.f3113a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static G L(u uVar, u uVar2) {
        G g2 = new G();
        g2.f3043a = false;
        g2.f3044b = false;
        if (uVar != null) {
            HashMap hashMap = uVar.f3113a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                g2.f3045c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                g2.f3046e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (uVar2 != null) {
                    HashMap hashMap2 = uVar2.f3113a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        g2.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        g2.f3047f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (uVar == null && uVar2 != null) {
                            int i = g2.f3045c;
                            int i2 = g2.d;
                            if (i == i2 && g2.f3046e == g2.f3047f) {
                                return g2;
                            }
                            if (i != i2) {
                                if (i == 0) {
                                    g2.f3044b = false;
                                    g2.f3043a = true;
                                } else if (i2 == 0) {
                                    g2.f3044b = true;
                                    g2.f3043a = true;
                                }
                            } else if (g2.f3047f == null) {
                                g2.f3044b = false;
                                g2.f3043a = true;
                            } else if (g2.f3046e == null) {
                                g2.f3044b = true;
                                g2.f3043a = true;
                            }
                        } else if (uVar != null && g2.d == 0) {
                            g2.f3044b = true;
                            g2.f3043a = true;
                        } else if (uVar2 == null && g2.f3045c == 0) {
                            g2.f3044b = false;
                            g2.f3043a = true;
                        }
                        return g2;
                    }
                }
                g2.d = -1;
                g2.f3047f = null;
                if (uVar == null) {
                }
                if (uVar != null) {
                }
                if (uVar2 == null) {
                    g2.f3044b = false;
                    g2.f3043a = true;
                }
                return g2;
            }
        }
        g2.f3045c = -1;
        g2.f3046e = null;
        if (uVar2 != null) {
        }
        g2.d = -1;
        g2.f3047f = null;
        if (uVar == null) {
        }
        if (uVar != null) {
        }
        if (uVar2 == null) {
        }
        return g2;
    }

    public final ObjectAnimator J(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        w.f3116a.p(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, w.f3117b, f3);
        C0259g c0259g = new C0259g(view);
        ofFloat.addListener(c0259g);
        o().a(c0259g);
        return ofFloat;
    }

    @Override // l0.m
    public final void d(u uVar) {
        I(uVar);
    }

    @Override // l0.m
    public final void g(u uVar) {
        I(uVar);
        View view = uVar.f3114b;
        Float f2 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f2 == null) {
            f2 = view.getVisibility() == 0 ? Float.valueOf(w.f3116a.j(view)) : Float.valueOf(RecyclerView.f1530C0);
        }
        uVar.f3113a.put("android:fade:transitionAlpha", f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (L(n(r3, false), r(r3, false)).f3043a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    @Override // l0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        boolean z2;
        View view;
        int i;
        View view2;
        View view3;
        ViewGroup viewGroup;
        int i2;
        Bitmap bitmap;
        int i3 = this.f3070A;
        G L2 = L(uVar, uVar2);
        if (!L2.f3043a || (L2.f3046e == null && L2.f3047f == null)) {
            return null;
        }
        boolean z3 = false;
        if (L2.f3044b) {
            if ((i3 & 1) == 1 && uVar2 != null) {
                View view4 = uVar2.f3114b;
                if (uVar == null) {
                    View view5 = (View) view4.getParent();
                }
                w.f3116a.getClass();
                return J(view4, K(uVar, RecyclerView.f1530C0), 1.0f);
            }
            return null;
        }
        int i4 = L2.d;
        if ((i3 & 2) == 2 && uVar != null) {
            View view6 = uVar2 != null ? uVar2.f3114b : null;
            View view7 = uVar.f3114b;
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
                                if (L(r(view9, true), n(view9, true)).f3043a) {
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
                                    boolean z4 = t.f3112a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                    C0250C c0250c = w.f3116a;
                                    c0250c.u(view7, matrix);
                                    c0250c.v(frameLayout, matrix);
                                    RectF rectF = new RectF(RecyclerView.f1530C0, RecyclerView.f1530C0, view7.getWidth(), view7.getHeight());
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
                                        if (t.f3112a) {
                                            Picture picture = new Picture();
                                            Canvas beginRecording = picture.beginRecording(round7, round8);
                                            beginRecording.concat(matrix);
                                            view7.draw(beginRecording);
                                            picture.endRecording();
                                            bitmap = s.a(picture);
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
                    int[] iArr = (int[]) uVar.f3113a.get("android:visibility:screenLocation");
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    int[] iArr2 = new int[2];
                    frameLayout.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i5 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i6 - iArr2[1]) - view8.getTop());
                    frameLayout.getOverlay().add(view8);
                }
                C0250C c0250c2 = w.f3116a;
                c0250c2.getClass();
                ObjectAnimator J2 = J(view8, K(uVar, 1.0f), RecyclerView.f1530C0);
                if (J2 == null) {
                    c0250c2.p(view8, K(uVar2, 1.0f));
                }
                if (z3) {
                    return J2;
                }
                if (J2 == null) {
                    frameLayout.getOverlay().remove(view8);
                    return J2;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                F f2 = new F(this, frameLayout, view8, view7);
                J2.addListener(f2);
                J2.addPauseListener(f2);
                o().a(f2);
                return J2;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                w.b(view3, 0);
                C0250C c0250c3 = w.f3116a;
                c0250c3.getClass();
                ObjectAnimator J3 = J(view3, K(uVar, 1.0f), RecyclerView.f1530C0);
                if (J3 == null) {
                    c0250c3.p(view3, K(uVar2, 1.0f));
                }
                if (J3 != null) {
                    C0252E c0252e = new C0252E(view3, i);
                    J3.addListener(c0252e);
                    o().a(c0252e);
                } else {
                    w.b(view3, visibility);
                }
                return J3;
            }
        }
        return null;
    }

    @Override // l0.m
    public final String[] q() {
        return f3069B;
    }

    @Override // l0.m
    public final boolean s(u uVar, u uVar2) {
        if (uVar == null && uVar2 == null) {
            return false;
        }
        if (uVar != null && uVar2 != null && uVar2.f3113a.containsKey("android:visibility:visibility") != uVar.f3113a.containsKey("android:visibility:visibility")) {
            return false;
        }
        G L2 = L(uVar, uVar2);
        if (L2.f3043a) {
            return L2.f3045c == 0 || L2.d == 0;
        }
        return false;
    }

    public h() {
        this.f3070A = 3;
    }
}
