package m0;

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
import com.winfour.winrandom.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f3263B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A, reason: collision with root package name */
    public final int f3264A;

    public g(int i) {
        this();
        this.f3264A = i;
    }

    public static void I(t tVar) {
        int visibility = tVar.f3309b.getVisibility();
        HashMap hashMap = tVar.f3308a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = tVar.f3309b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float K(t tVar, float f2) {
        Float f3;
        return (tVar == null || (f3 = (Float) tVar.f3308a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0257E L(t tVar, t tVar2) {
        C0257E c0257e = new C0257E();
        c0257e.f3237a = false;
        c0257e.f3238b = false;
        if (tVar != null) {
            HashMap hashMap = tVar.f3308a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                c0257e.f3239c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                c0257e.f3240e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (tVar2 != null) {
                    HashMap hashMap2 = tVar2.f3308a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        c0257e.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        c0257e.f3241f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (tVar == null && tVar2 != null) {
                            int i = c0257e.f3239c;
                            int i2 = c0257e.d;
                            if (i == i2 && c0257e.f3240e == c0257e.f3241f) {
                                return c0257e;
                            }
                            if (i != i2) {
                                if (i == 0) {
                                    c0257e.f3238b = false;
                                    c0257e.f3237a = true;
                                } else if (i2 == 0) {
                                    c0257e.f3238b = true;
                                    c0257e.f3237a = true;
                                }
                            } else if (c0257e.f3241f == null) {
                                c0257e.f3238b = false;
                                c0257e.f3237a = true;
                            } else if (c0257e.f3240e == null) {
                                c0257e.f3238b = true;
                                c0257e.f3237a = true;
                            }
                        } else if (tVar != null && c0257e.d == 0) {
                            c0257e.f3238b = true;
                            c0257e.f3237a = true;
                        } else if (tVar2 == null && c0257e.f3239c == 0) {
                            c0257e.f3238b = false;
                            c0257e.f3237a = true;
                        }
                        return c0257e;
                    }
                }
                c0257e.d = -1;
                c0257e.f3241f = null;
                if (tVar == null) {
                }
                if (tVar != null) {
                }
                if (tVar2 == null) {
                    c0257e.f3238b = false;
                    c0257e.f3237a = true;
                }
                return c0257e;
            }
        }
        c0257e.f3239c = -1;
        c0257e.f3240e = null;
        if (tVar2 != null) {
        }
        c0257e.d = -1;
        c0257e.f3241f = null;
        if (tVar == null) {
        }
        if (tVar != null) {
        }
        if (tVar2 == null) {
        }
        return c0257e;
    }

    public final ObjectAnimator J(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        v.f3311a.r(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, v.f3312b, f3);
        f fVar = new f(view);
        ofFloat.addListener(fVar);
        o().a(fVar);
        return ofFloat;
    }

    @Override // m0.l
    public final void d(t tVar) {
        I(tVar);
    }

    @Override // m0.l
    public final void g(t tVar) {
        I(tVar);
        View view = tVar.f3309b;
        Float f2 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f2 == null) {
            f2 = view.getVisibility() == 0 ? Float.valueOf(v.f3311a.m(view)) : Float.valueOf(RecyclerView.A0);
        }
        tVar.f3308a.put("android:fade:transitionAlpha", f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (L(n(r3, false), r(r3, false)).f3237a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    @Override // m0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(FrameLayout frameLayout, t tVar, t tVar2) {
        boolean z2;
        View view;
        int i;
        View view2;
        View view3;
        ViewGroup viewGroup;
        int i2;
        Bitmap bitmap;
        int i3 = this.f3264A;
        C0257E L2 = L(tVar, tVar2);
        if (!L2.f3237a || (L2.f3240e == null && L2.f3241f == null)) {
            return null;
        }
        boolean z3 = false;
        if (L2.f3238b) {
            if ((i3 & 1) == 1 && tVar2 != null) {
                View view4 = tVar2.f3309b;
                if (tVar == null) {
                    View view5 = (View) view4.getParent();
                }
                v.f3311a.getClass();
                return J(view4, K(tVar, RecyclerView.A0), 1.0f);
            }
            return null;
        }
        int i4 = L2.d;
        if ((i3 & 2) == 2 && tVar != null) {
            View view6 = tVar2 != null ? tVar2.f3309b : null;
            View view7 = tVar.f3309b;
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
                                if (L(r(view9, true), n(view9, true)).f3237a) {
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
                                    boolean z4 = s.f3307a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                    C0253A c0253a = v.f3311a;
                                    c0253a.w(view7, matrix);
                                    c0253a.x(frameLayout, matrix);
                                    RectF rectF = new RectF(RecyclerView.A0, RecyclerView.A0, view7.getWidth(), view7.getHeight());
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
                                        if (s.f3307a) {
                                            Picture picture = new Picture();
                                            Canvas beginRecording = picture.beginRecording(round7, round8);
                                            beginRecording.concat(matrix);
                                            view7.draw(beginRecording);
                                            picture.endRecording();
                                            bitmap = r.a(picture);
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
                    int[] iArr = (int[]) tVar.f3308a.get("android:visibility:screenLocation");
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    int[] iArr2 = new int[2];
                    frameLayout.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i5 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i6 - iArr2[1]) - view8.getTop());
                    frameLayout.getOverlay().add(view8);
                }
                C0253A c0253a2 = v.f3311a;
                c0253a2.getClass();
                ObjectAnimator J2 = J(view8, K(tVar, 1.0f), RecyclerView.A0);
                if (J2 == null) {
                    c0253a2.r(view8, K(tVar2, 1.0f));
                }
                if (z3) {
                    return J2;
                }
                if (J2 == null) {
                    frameLayout.getOverlay().remove(view8);
                    return J2;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                C0256D c0256d = new C0256D(this, frameLayout, view8, view7);
                J2.addListener(c0256d);
                J2.addPauseListener(c0256d);
                o().a(c0256d);
                return J2;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                v.b(view3, 0);
                C0253A c0253a3 = v.f3311a;
                c0253a3.getClass();
                ObjectAnimator J3 = J(view3, K(tVar, 1.0f), RecyclerView.A0);
                if (J3 == null) {
                    c0253a3.r(view3, K(tVar2, 1.0f));
                }
                if (J3 != null) {
                    C0255C c0255c = new C0255C(view3, i);
                    J3.addListener(c0255c);
                    o().a(c0255c);
                } else {
                    v.b(view3, visibility);
                }
                return J3;
            }
        }
        return null;
    }

    @Override // m0.l
    public final String[] q() {
        return f3263B;
    }

    @Override // m0.l
    public final boolean s(t tVar, t tVar2) {
        if (tVar == null && tVar2 == null) {
            return false;
        }
        if (tVar != null && tVar2 != null && tVar2.f3308a.containsKey("android:visibility:visibility") != tVar.f3308a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0257E L2 = L(tVar, tVar2);
        if (L2.f3237a) {
            return L2.f3239c == 0 || L2.d == 0;
        }
        return false;
    }

    public g() {
        this.f3264A = 3;
    }
}
