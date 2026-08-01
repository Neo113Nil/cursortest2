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
import com.glasspulse.glasspulse.R;
import java.util.HashMap;

/* renamed from: k0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179h extends m {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f2755B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A, reason: collision with root package name */
    public final int f2756A;

    public C0179h(int i) {
        this();
        this.f2756A = i;
    }

    public static void I(u uVar) {
        int visibility = uVar.f2800b.getVisibility();
        HashMap hashMap = uVar.f2799a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = uVar.f2800b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(u uVar, float f2) {
        Float f3;
        return (uVar == null || (f3 = (Float) uVar.f2799a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static I L(u uVar, u uVar2) {
        I i = new I();
        i.f2729a = false;
        i.f2730b = false;
        if (uVar != null) {
            HashMap hashMap = uVar.f2799a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                i.f2731c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                i.f2732e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (uVar2 != null) {
                    HashMap hashMap2 = uVar2.f2799a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        i.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        i.f2733f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (uVar == null && uVar2 != null) {
                            int i2 = i.f2731c;
                            int i3 = i.d;
                            if (i2 == i3 && i.f2732e == i.f2733f) {
                                return i;
                            }
                            if (i2 != i3) {
                                if (i2 == 0) {
                                    i.f2730b = false;
                                    i.f2729a = true;
                                } else if (i3 == 0) {
                                    i.f2730b = true;
                                    i.f2729a = true;
                                }
                            } else if (i.f2733f == null) {
                                i.f2730b = false;
                                i.f2729a = true;
                            } else if (i.f2732e == null) {
                                i.f2730b = true;
                                i.f2729a = true;
                            }
                        } else if (uVar != null && i.d == 0) {
                            i.f2730b = true;
                            i.f2729a = true;
                        } else if (uVar2 == null && i.f2731c == 0) {
                            i.f2730b = false;
                            i.f2729a = true;
                        }
                        return i;
                    }
                }
                i.d = -1;
                i.f2733f = null;
                if (uVar == null) {
                }
                if (uVar != null) {
                }
                if (uVar2 == null) {
                    i.f2730b = false;
                    i.f2729a = true;
                }
                return i;
            }
        }
        i.f2731c = -1;
        i.f2732e = null;
        if (uVar2 != null) {
        }
        i.d = -1;
        i.f2733f = null;
        if (uVar == null) {
        }
        if (uVar != null) {
        }
        if (uVar2 == null) {
        }
        return i;
    }

    public final ObjectAnimator J(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        x.f2803a.o(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, x.f2804b, f3);
        C0178g c0178g = new C0178g(view);
        ofFloat.addListener(c0178g);
        o().a(c0178g);
        return ofFloat;
    }

    @Override // k0.m
    public final void d(u uVar) {
        I(uVar);
    }

    @Override // k0.m
    public final void g(u uVar) {
        I(uVar);
        View view = uVar.f2800b;
        Float f2 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f2 == null) {
            f2 = view.getVisibility() == 0 ? Float.valueOf(x.f2803a.j(view)) : Float.valueOf(0.0f);
        }
        uVar.f2799a.put("android:fade:transitionAlpha", f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (L(n(r3, false), r(r3, false)).f2729a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    @Override // k0.m
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
        int i3 = this.f2756A;
        I L2 = L(uVar, uVar2);
        if (!L2.f2729a || (L2.f2732e == null && L2.f2733f == null)) {
            return null;
        }
        boolean z3 = false;
        if (L2.f2730b) {
            if ((i3 & 1) == 1 && uVar2 != null) {
                View view4 = uVar2.f2800b;
                if (uVar == null) {
                    View view5 = (View) view4.getParent();
                }
                x.f2803a.getClass();
                return J(view4, K(uVar, 0.0f), 1.0f);
            }
            return null;
        }
        int i4 = L2.d;
        if ((i3 & 2) == 2 && uVar != null) {
            View view6 = uVar2 != null ? uVar2.f2800b : null;
            View view7 = uVar.f2800b;
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
                                if (L(r(view9, true), n(view9, true)).f2729a) {
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
                                    boolean z4 = t.f2798a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                    E e2 = x.f2803a;
                                    e2.r(view7, matrix);
                                    e2.s(frameLayout, matrix);
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
                                        if (t.f2798a) {
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
                    int[] iArr = (int[]) uVar.f2799a.get("android:visibility:screenLocation");
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    int[] iArr2 = new int[2];
                    frameLayout.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i5 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i6 - iArr2[1]) - view8.getTop());
                    frameLayout.getOverlay().add(view8);
                }
                E e3 = x.f2803a;
                e3.getClass();
                ObjectAnimator J2 = J(view8, K(uVar, 1.0f), 0.0f);
                if (J2 == null) {
                    e3.o(view8, K(uVar2, 1.0f));
                }
                if (z3) {
                    return J2;
                }
                if (J2 == null) {
                    frameLayout.getOverlay().remove(view8);
                    return J2;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                H h = new H(this, frameLayout, view8, view7);
                J2.addListener(h);
                J2.addPauseListener(h);
                o().a(h);
                return J2;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                x.b(view3, 0);
                E e4 = x.f2803a;
                e4.getClass();
                ObjectAnimator J3 = J(view3, K(uVar, 1.0f), 0.0f);
                if (J3 == null) {
                    e4.o(view3, K(uVar2, 1.0f));
                }
                if (J3 != null) {
                    G g2 = new G(view3, i);
                    J3.addListener(g2);
                    o().a(g2);
                } else {
                    x.b(view3, visibility);
                }
                return J3;
            }
        }
        return null;
    }

    @Override // k0.m
    public final String[] q() {
        return f2755B;
    }

    @Override // k0.m
    public final boolean s(u uVar, u uVar2) {
        if (uVar == null && uVar2 == null) {
            return false;
        }
        if (uVar != null && uVar2 != null && uVar2.f2799a.containsKey("android:visibility:visibility") != uVar.f2799a.containsKey("android:visibility:visibility")) {
            return false;
        }
        I L2 = L(uVar, uVar2);
        if (L2.f2729a) {
            return L2.f2731c == 0 || L2.d == 0;
        }
        return false;
    }

    public C0179h() {
        this.f2756A = 3;
    }
}
