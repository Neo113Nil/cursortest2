package defpackage;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class apz extends ape {
    private static final String[] w = {"android:visibility:visibility", "android:visibility:parent"};
    public int v = 3;

    public static final void G(apm apmVar) {
        Integer valueOf = Integer.valueOf(apmVar.b.getVisibility());
        Map map = apmVar.a;
        map.put("android:visibility:visibility", valueOf);
        map.put("android:visibility:parent", apmVar.b.getParent());
        int[] iArr = new int[2];
        apmVar.b.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r9 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r0.e == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r0.c == 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final apy H(apm apmVar, apm apmVar2) {
        apy apyVar = new apy();
        apyVar.a = false;
        apyVar.b = false;
        if (apmVar != null) {
            Map map = apmVar.a;
            if (map.containsKey("android:visibility:visibility")) {
                apyVar.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                apyVar.e = (ViewGroup) map.get("android:visibility:parent");
                if (apmVar2 != null) {
                    Map map2 = apmVar2.a;
                    if (map2.containsKey("android:visibility:visibility")) {
                        apyVar.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                        apyVar.f = (ViewGroup) map2.get("android:visibility:parent");
                        if (apmVar == null && apmVar2 != null) {
                            int i = apyVar.c;
                            int i2 = apyVar.d;
                            if (i != i2 || apyVar.e != apyVar.f) {
                                if (i != i2) {
                                    if (i != 0) {
                                    }
                                    apyVar.b = false;
                                } else {
                                    if (apyVar.f != null) {
                                    }
                                    apyVar.b = false;
                                }
                            }
                            return apyVar;
                        }
                        if (apmVar == null || apyVar.d != 0) {
                            if (apmVar2 == null) {
                            }
                            return apyVar;
                        }
                        apyVar.b = true;
                        apyVar.a = true;
                        return apyVar;
                    }
                }
                apyVar.d = -1;
                apyVar.f = null;
                if (apmVar == null) {
                }
                if (apmVar == null) {
                }
                if (apmVar2 == null) {
                }
                return apyVar;
            }
        }
        apyVar.c = -1;
        apyVar.e = null;
        if (apmVar2 != null) {
        }
        apyVar.d = -1;
        apyVar.f = null;
        if (apmVar == null) {
        }
        if (apmVar == null) {
        }
        if (apmVar2 == null) {
        }
        return apyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b3  */
    @Override // defpackage.ape
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator a(ViewGroup viewGroup, apm apmVar, apm apmVar2) {
        boolean z;
        int i;
        Animator animator;
        char c;
        int i2;
        View view;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmap;
        apm apmVar3 = apmVar;
        apy H = H(apmVar, apmVar2);
        if (!H.a || (H.e == null && H.f == null)) {
            return null;
        }
        int i4 = 1;
        if (H.b) {
            if ((this.v & 1) == 1 && apmVar2 != null) {
                if (apmVar3 == null) {
                    View view2 = (View) apmVar2.b.getParent();
                    if (!H(j(view2, false), k(view2, false)).a) {
                        apmVar3 = null;
                    }
                }
                return e(apmVar2.b, apmVar3);
            }
            return null;
        }
        int i5 = H.d;
        if ((this.v & 2) != 2 || apmVar3 == null) {
            return null;
        }
        View view3 = apmVar3.b;
        View view4 = apmVar2 != null ? apmVar2.b : null;
        View view5 = (View) view3.getTag(R.id.save_overlay_view);
        if (view5 != null) {
            i = i5;
            view4 = null;
            animator = null;
            c = 1;
            i2 = 0;
        } else if (view4 == null || view4.getParent() == null) {
            if (view4 != null) {
                z = false;
                view5 = view4;
                view4 = null;
                if (z) {
                    if (view3.getParent() == null) {
                        i = i5;
                        view5 = view3;
                        animator = null;
                        c = 1;
                        i4 = 0;
                        i2 = 0;
                    } else if (view3.getParent() instanceof View) {
                        View view6 = (View) view3.getParent();
                        if (H(k(view6, true), j(view6, true)).a) {
                            i = i5;
                            animator = null;
                            c = 1;
                            i2 = 0;
                            view = view4;
                            int id = view6.getId();
                            if (view6.getParent() == null && id != -1) {
                                viewGroup.findViewById(id);
                            }
                        } else {
                            Matrix matrix = new Matrix();
                            matrix.setTranslate(-view6.getScrollX(), -view6.getScrollY());
                            apr aprVar = apq.a;
                            aprVar.e(view3, matrix);
                            aprVar.f(viewGroup, matrix);
                            animator = null;
                            RectF rectF = new RectF(0.0f, 0.0f, view3.getWidth(), view3.getHeight());
                            matrix.mapRect(rectF);
                            int round = Math.round(rectF.left);
                            int round2 = Math.round(rectF.top);
                            int round3 = Math.round(rectF.right);
                            c = 1;
                            int round4 = Math.round(rectF.bottom);
                            i2 = 0;
                            ImageView imageView = new ImageView(view3.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            boolean isAttachedToWindow = view3.isAttachedToWindow();
                            boolean isAttachedToWindow2 = viewGroup.isAttachedToWindow();
                            if (isAttachedToWindow) {
                                view = view4;
                                viewGroup2 = null;
                                i3 = 0;
                            } else if (isAttachedToWindow2) {
                                viewGroup2 = (ViewGroup) view3.getParent();
                                int indexOfChild = viewGroup2.indexOfChild(view3);
                                yq.g(viewGroup, view3);
                                view = view4;
                                i3 = indexOfChild;
                            } else {
                                i = i5;
                                view = view4;
                                bitmap = null;
                                if (bitmap != null) {
                                    imageView.setImageBitmap(bitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                imageView.layout(round, round2, round3, round4);
                                view5 = imageView;
                            }
                            int round5 = Math.round(rectF.width());
                            i = i5;
                            int round6 = Math.round(rectF.height());
                            if (round5 <= 0 || round6 <= 0) {
                                bitmap = null;
                            } else {
                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                int round7 = Math.round(round5 * min);
                                int round8 = Math.round(round6 * min);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                matrix.postScale(min, min);
                                Picture picture = new Picture();
                                Canvas beginRecording = picture.beginRecording(round7, round8);
                                beginRecording.concat(matrix);
                                view3.draw(beginRecording);
                                picture.endRecording();
                                bitmap = Bitmap.createBitmap(picture);
                            }
                            if (!isAttachedToWindow) {
                                viewGroup.getOverlay().remove(view3);
                                viewGroup2.addView(view3, i3);
                            }
                            if (bitmap != null) {
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                            imageView.layout(round, round2, round3, round4);
                            view5 = imageView;
                        }
                        i4 = i2;
                        view4 = view;
                    }
                }
                i = i5;
                animator = null;
                c = 1;
                i2 = 0;
                i4 = 0;
            }
            view4 = null;
            view5 = null;
            z = true;
            if (z) {
            }
            i = i5;
            animator = null;
            c = 1;
            i2 = 0;
            i4 = 0;
        } else {
            if (i5 == 4 || view3 == view4) {
                view5 = null;
                z = false;
                if (z) {
                }
                i = i5;
                animator = null;
                c = 1;
                i2 = 0;
                i4 = 0;
            }
            view4 = null;
            view5 = null;
            z = true;
            if (z) {
            }
            i = i5;
            animator = null;
            c = 1;
            i2 = 0;
            i4 = 0;
        }
        if (view5 == null) {
            if (view4 == null) {
                return animator;
            }
            int visibility = view4.getVisibility();
            apq.d(view4, i2);
            Animator f = f(view4, apmVar3, apmVar2);
            if (f == null) {
                apq.d(view4, visibility);
                return f;
            }
            apw apwVar = new apw(view4, i);
            f.addListener(apwVar);
            i().x(apwVar);
            return f;
        }
        if (i4 == 0) {
            int[] iArr = (int[]) apmVar3.a.get("android:visibility:screenLocation");
            int i6 = iArr[i2];
            int i7 = iArr[c];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view5.offsetLeftAndRight((i6 - iArr2[i2]) - view5.getLeft());
            view5.offsetTopAndBottom((i7 - iArr2[c]) - view5.getTop());
            yq.g(viewGroup, view5);
        }
        Animator f2 = f(view5, apmVar3, apmVar2);
        if (i4 == 0) {
            if (f2 == null) {
                viewGroup.getOverlay().remove(view5);
                return f2;
            }
            view3.setTag(R.id.save_overlay_view, view5);
            apx apxVar = new apx(this, viewGroup, view5, view3);
            f2.addListener(apxVar);
            f2.addPauseListener(apxVar);
            i().x(apxVar);
        }
        return f2;
    }

    @Override // defpackage.ape
    public final void b(apm apmVar) {
        G(apmVar);
    }

    @Override // defpackage.ape
    public void c(apm apmVar) {
        throw null;
    }

    @Override // defpackage.ape
    public final String[] d() {
        return w;
    }

    public Animator e(View view, apm apmVar) {
        throw null;
    }

    public Animator f(View view, apm apmVar, apm apmVar2) {
        throw null;
    }

    @Override // defpackage.ape
    public final boolean v(apm apmVar, apm apmVar2) {
        if (apmVar == null && apmVar2 == null) {
            return false;
        }
        if (apmVar != null && apmVar2 != null) {
            if (apmVar2.a.containsKey("android:visibility:visibility") != apmVar.a.containsKey("android:visibility:visibility")) {
                return false;
            }
        }
        apy H = H(apmVar, apmVar2);
        if (H.a) {
            return H.c == 0 || H.d == 0;
        }
        return false;
    }
}
