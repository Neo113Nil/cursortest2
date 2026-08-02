package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nc implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0321, code lost:
    
        if (r3 < 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0344, code lost:
    
        if (r3 > 0) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x037a  */
    /* JADX WARN: Type inference failed for: r1v26, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        int i3;
        lp lpVar;
        View view;
        int i4;
        Object obj;
        int i5 = 0;
        switch (this.b) {
            case 0:
                ng.v((ng) this.a);
                return;
            case 1:
                mw mwVar = (mw) this.a;
                if (mwVar.b != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = mwVar.z;
                    long j2 = j != Long.MIN_VALUE ? currentTimeMillis - j : 0L;
                    ky kyVar = mwVar.p.m;
                    if (mwVar.y == null) {
                        mwVar.y = new Rect();
                    }
                    kyVar.aI(mwVar.b.a, mwVar.y);
                    if (kyVar.ad()) {
                        int i6 = (int) (mwVar.i + mwVar.g);
                        int paddingLeft = (i6 - mwVar.y.left) - mwVar.p.getPaddingLeft();
                        float f = mwVar.g;
                        if ((f < 0.0f && paddingLeft < 0) || (f > 0.0f && (paddingLeft = ((i6 + mwVar.b.a.getWidth()) + mwVar.y.right) - (mwVar.p.getWidth() - mwVar.p.getPaddingRight())) > 0)) {
                            i = paddingLeft;
                            if (kyVar.ae()) {
                                int i7 = (int) (mwVar.j + mwVar.h);
                                i2 = (i7 - mwVar.y.top) - mwVar.p.getPaddingTop();
                                float f2 = mwVar.h;
                                if (f2 < 0.0f) {
                                }
                                if (f2 > 0.0f) {
                                    i2 = ((i7 + mwVar.b.a.getHeight()) + mwVar.y.bottom) - (mwVar.p.getHeight() - mwVar.p.getPaddingBottom());
                                    break;
                                }
                            }
                            i2 = 0;
                            if (i != 0) {
                                ms msVar = mwVar.l;
                                RecyclerView recyclerView = mwVar.p;
                                int width = mwVar.b.a.getWidth();
                                mwVar.p.getWidth();
                                i = msVar.c(recyclerView, width, i, j2);
                            }
                            i3 = i;
                            if (i2 == 0) {
                                ms msVar2 = mwVar.l;
                                RecyclerView recyclerView2 = mwVar.p;
                                int height = mwVar.b.a.getHeight();
                                mwVar.p.getHeight();
                                i2 = msVar2.c(recyclerView2, height, i2, j2);
                            }
                            if (i3 == 0) {
                                i5 = i3;
                            } else if (i2 == 0) {
                                mwVar.z = Long.MIN_VALUE;
                                return;
                            }
                            if (mwVar.z == Long.MIN_VALUE) {
                                mwVar.z = currentTimeMillis;
                            }
                            mwVar.p.scrollBy(i5, i2);
                            lpVar = mwVar.b;
                            if (lpVar != null) {
                                mwVar.h(lpVar);
                            }
                            mwVar.p.removeCallbacks(mwVar.q);
                            RecyclerView recyclerView3 = mwVar.p;
                            int i8 = yq.a;
                            recyclerView3.postOnAnimation(this);
                            return;
                        }
                    }
                    i = 0;
                    if (kyVar.ae()) {
                    }
                    i2 = 0;
                    if (i != 0) {
                    }
                    i3 = i;
                    if (i2 == 0) {
                    }
                    if (i3 == 0) {
                    }
                    if (mwVar.z == Long.MIN_VALUE) {
                    }
                    mwVar.p.scrollBy(i5, i2);
                    lpVar = mwVar.b;
                    if (lpVar != null) {
                    }
                    mwVar.p.removeCallbacks(mwVar.q);
                    RecyclerView recyclerView32 = mwVar.p;
                    int i82 = yq.a;
                    recyclerView32.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                nf nfVar = (nf) this.a;
                Runnable runnable = nfVar.a;
                if (runnable != null) {
                    runnable.run();
                    nfVar.a = null;
                    return;
                }
                return;
            case 3:
                nh.g((nh) this.a);
                return;
            case 4:
                ((pn) this.a).a.q().c();
                return;
            case 5:
                ((pn) this.a).a.u = false;
                return;
            case 6:
                Object obj2 = this.a;
                Context x = ((bd) obj2).x();
                if (x == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                }
                ps psVar = (ps) obj2;
                psVar.al.l(1);
                psVar.al.k(x.getString(R.string.fingerprint_dialog_touch_sensor));
                return;
            case 7:
                View view2 = ((abc) this.a).a;
                ViewParent parent = view2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view2);
                    return;
                }
                return;
            case 8:
                abe abeVar = (abe) this.a;
                if (abeVar.e) {
                    if (abeVar.c) {
                        abeVar.c = false;
                        abd abdVar = abeVar.a;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        abdVar.e = currentAnimationTimeMillis;
                        abdVar.g = -1L;
                        abdVar.f = currentAnimationTimeMillis;
                        abdVar.h = 0.5f;
                    }
                    abd abdVar2 = abeVar.a;
                    if ((abdVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > abdVar2.g + abdVar2.i) || !abeVar.b()) {
                        abeVar.e = false;
                        return;
                    }
                    if (abeVar.d) {
                        abeVar.d = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        abeVar.b.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (abdVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = abdVar2.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - abdVar2.f;
                    abdVar2.f = currentAnimationTimeMillis2;
                    abeVar.f.scrollListBy((int) (j3 * (((-4.0f) * a * a) + (a * 4.0f)) * abdVar2.d));
                    View view3 = abeVar.b;
                    int i9 = yq.a;
                    view3.postOnAnimation(this);
                    return;
                }
                return;
            case 9:
                ((abs) this.a).f(0);
                return;
            case 10:
                ((DrawerLayout) this.a).j(false);
                return;
            case 11:
                aca acaVar = (aca) this.a;
                int i10 = acaVar.b.h;
                boolean z = acaVar.a == 3;
                if (z) {
                    view = acaVar.c.d(3);
                    i4 = (view != null ? -view.getWidth() : 0) + i10;
                } else {
                    DrawerLayout drawerLayout = acaVar.c;
                    View d = drawerLayout.d(5);
                    int width2 = drawerLayout.getWidth() - i10;
                    view = d;
                    i4 = width2;
                }
                if (view != null) {
                    if ((!z || view.getLeft() >= i4) && (z || view.getLeft() <= i4)) {
                        return;
                    }
                    DrawerLayout drawerLayout2 = acaVar.c;
                    if (drawerLayout2.b(view) == 0) {
                        abx abxVar = (abx) view.getLayoutParams();
                        acaVar.b.j(view, i4, view.getTop());
                        abxVar.c = true;
                        drawerLayout2.invalidate();
                        acaVar.m();
                        if (drawerLayout2.b) {
                            return;
                        }
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
                        int childCount = drawerLayout2.getChildCount();
                        while (i5 < childCount) {
                            drawerLayout2.getChildAt(i5).dispatchTouchEvent(obtain2);
                            i5++;
                        }
                        obtain2.recycle();
                        drawerLayout2.b = true;
                        return;
                    }
                    return;
                }
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj3 = ((acf) this.a).h.a;
                long uptimeMillis3 = SystemClock.uptimeMillis();
                long uptimeMillis4 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (true) {
                    acf acfVar = (acf) obj3;
                    ArrayList arrayList = acfVar.b;
                    if (i11 >= arrayList.size()) {
                        if (acfVar.d) {
                            int size = arrayList.size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                                        acd acdVar = acfVar.f;
                                        ValueAnimator.unregisterDurationScaleChangeListener(acdVar.a);
                                        acdVar.a = null;
                                    }
                                    acfVar.d = false;
                                } else if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            acfVar.g.d(acfVar.c);
                            return;
                        }
                        return;
                    }
                    acb acbVar = (acb) arrayList.get(i11);
                    if (acbVar != null) {
                        qy qyVar = acfVar.a;
                        Long l = (Long) qyVar.get(acbVar);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis4) {
                                qyVar.remove(acbVar);
                            }
                        }
                        acbVar.a(uptimeMillis3);
                    }
                    i11++;
                }
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj4 = this.a;
                synchronized (((aez) obj4).b) {
                    obj = ((aez) obj4).f;
                    ((aez) obj4).f = aez.a;
                }
                ((aez) this.a).i(obj);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                afh afhVar = (afh) this.a;
                if (afhVar.c == 0) {
                    afhVar.d = true;
                    afhVar.g.b(aej.ON_PAUSE);
                }
                afhVar.c();
                return;
            case 15:
                ((ahq) this.a).aI();
                return;
            case 16:
                RecyclerView recyclerView4 = ((aij) this.a).b;
                recyclerView4.focusableViewAvailable(recyclerView4);
                return;
            case 17:
                ((aim) this.a).u();
                return;
            case 18:
                ((SwipeRefreshLayout) this.a).b();
                return;
            case 19:
                ara araVar = (ara) this.a;
                araVar.h = false;
                araVar.u();
                return;
            default:
                ((AtomicBoolean) this.a).set(true);
                return;
        }
    }

    public nc(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
