package com.baidu.mapsdkplatform.comapi.e;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.animation.Interpolator;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class g extends com.baidu.mapsdkplatform.comapi.e.b {

    /* renamed from: a, reason: collision with root package name */
    private Animator f7995a = null;

    /* renamed from: b, reason: collision with root package name */
    private long f7996b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f7997c = null;

    /* renamed from: d, reason: collision with root package name */
    private TypeEvaluator f7998d = null;

    /* renamed from: e, reason: collision with root package name */
    private Animation.AnimationListener f7999e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f8000f = 1;

    /* renamed from: g, reason: collision with root package name */
    private int f8001g = 0;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f8002h;

    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (g.this.f7999e != null) {
                g.this.f7999e.onAnimationCancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (g.this.f7999e != null) {
                g.this.f7999e.onAnimationEnd();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (g.this.f7999e != null) {
                g.this.f7999e.onAnimationRepeat();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (g.this.f7999e != null) {
                g.this.f7999e.onAnimationStart();
            }
        }
    }

    @TargetApi(11)
    public class b implements TypeEvaluator {
        public b() {
        }

        @Override // android.animation.TypeEvaluator
        public Object evaluate(float f8, Object obj, Object obj2) {
            LatLng latLng = (LatLng) obj;
            LatLng latLng2 = (LatLng) obj2;
            double d8 = latLng.longitude;
            double d9 = f8;
            double d10 = d8 + ((latLng2.longitude - d8) * d9);
            double d11 = latLng.latitude;
            return new LatLng(d11 + (d9 * (latLng2.latitude - d11)), d10);
        }
    }

    @TargetApi(11)
    public class c implements TypeEvaluator {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        public Object evaluate(float f8, Object obj, Object obj2) {
            Point point = (Point) obj;
            Point point2 = (Point) obj2;
            return new Point((int) (point.x + ((point2.x - r0) * f8)), (int) (point.y + (f8 * (point2.y - r5))));
        }
    }

    public g(LatLng... latLngArr) {
        this.f8002h = latLngArr;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(int i8) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void b(int i8) {
        if (i8 > 0 || i8 == -1) {
            this.f8001g = i8;
        }
    }

    public int c() {
        return this.f8000f;
    }

    public g(Point... pointArr) {
        this.f8002h = pointArr;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(long j8) {
        if (j8 < 0) {
            j8 = 0;
        }
        this.f7996b = j8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void b() {
        Animator animator = this.f7995a;
        if (animator == null) {
            return;
        }
        animator.start();
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void c(int i8) {
        this.f8000f = i8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(TypeEvaluator typeEvaluator) {
        this.f7998d = typeEvaluator;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Interpolator interpolator) {
        this.f7997c = interpolator;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Animation.AnimationListener animationListener) {
        this.f7999e = animationListener;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a(Marker marker, Animation animation) {
        ObjectAnimator a8 = a(marker);
        this.f7995a = a8;
        a(a8);
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a() {
        Animator animator = this.f7995a;
        if (animator != null) {
            animator.cancel();
            this.f7995a = null;
        }
    }

    @TargetApi(11)
    ObjectAnimator a(Marker marker) {
        ObjectAnimator ofObject;
        if (marker.isFixed()) {
            if (this.f8002h[0] instanceof Point) {
                ofObject = ObjectAnimator.ofObject(marker, "fixedScreenPosition", new c(), this.f8002h);
            } else {
                throw new ClassCastException("BDMapSDKException: if the marker is fixed on screen, the parameters of Transformation must be android.graphics.Point");
            }
        } else {
            Object[] objArr = this.f8002h;
            if (!(objArr[0] instanceof LatLng)) {
                throw new ClassCastException("BDMapSDKException: if the marker isn't fixed on screen, the parameters of Transformation must be Latlng");
            }
            TypeEvaluator typeEvaluator = this.f7998d;
            if (typeEvaluator != null) {
                ofObject = ObjectAnimator.ofObject(marker, "position", typeEvaluator, objArr);
            } else {
                ofObject = ObjectAnimator.ofObject(marker, "position", new b(), this.f8002h);
            }
        }
        if (ofObject != null) {
            ofObject.setRepeatCount(this.f8001g);
            ofObject.setRepeatMode(c());
            ofObject.setDuration(this.f7996b);
            Interpolator interpolator = this.f7997c;
            if (interpolator != null) {
                ofObject.setInterpolator(interpolator);
            }
        }
        return ofObject;
    }

    @TargetApi(11)
    protected void a(Animator animator) {
        if (animator == null) {
            return;
        }
        animator.addListener(new a());
    }
}
