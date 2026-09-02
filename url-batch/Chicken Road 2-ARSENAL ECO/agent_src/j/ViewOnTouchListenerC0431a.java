package j;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.onesignal.inAppMessages.internal.display.impl.a;
import k.C0447f;
import k.C0448g;
import k.C0449h;
import k.C0450i;
import k.E;
import k.G;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0431a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f4741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4742b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4743c;

    /* renamed from: d, reason: collision with root package name */
    public final View f4744d;

    /* renamed from: e, reason: collision with root package name */
    public G f4745e;

    /* renamed from: f, reason: collision with root package name */
    public G f4746f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4747g;

    /* renamed from: h, reason: collision with root package name */
    public int f4748h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f4749i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4750j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f4751k;

    public ViewOnTouchListenerC0431a(View view) {
        this.f4749i = new int[2];
        this.f4744d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4741a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4742b = tapTimeout;
        this.f4743c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        G g7 = this.f4746f;
        View view = this.f4744d;
        if (g7 != null) {
            view.removeCallbacks(g7);
        }
        G g8 = this.f4745e;
        if (g8 != null) {
            view.removeCallbacks(g8);
        }
    }

    public final l b() {
        C0447f c0447f;
        switch (this.f4750j) {
            case 0:
                AbstractC0432b abstractC0432b = ((ActionMenuItemView) this.f4751k).f3226p;
                if (abstractC0432b == null || (c0447f = ((C0448g) abstractC0432b).f4994a.f5022x) == null) {
                    return null;
                }
                return c0447f.a();
            default:
                C0447f c0447f2 = ((C0449h) this.f4751k).f4996h.f5021w;
                if (c0447f2 == null) {
                    return null;
                }
                return c0447f2.a();
        }
    }

    public final boolean c() {
        l b7;
        switch (this.f4750j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f4751k;
                i iVar = actionMenuItemView.f3224n;
                return iVar != null && iVar.a(actionMenuItemView.f3221k) && (b7 = b()) != null && b7.h();
            default:
                ((C0449h) this.f4751k).f4996h.h();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        E e4;
        boolean z7 = this.f4747g;
        View view2 = this.f4744d;
        if (z7) {
            l b7 = b();
            if (b7 != null && b7.h() && (e4 = (E) b7.e()) != null && e4.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f4749i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                e4.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b8 = e4.b(this.f4748h, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z8 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b8) {
                }
            }
            switch (this.f4750j) {
                case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                    C0450i c0450i = ((C0449h) this.f4751k).f4996h;
                    if (c0450i.y == null) {
                        c0450i.e();
                        z6 = true;
                        break;
                    } else {
                        z6 = false;
                        break;
                    }
                default:
                    l b9 = b();
                    if (b9 != null && b9.h()) {
                        b9.dismiss();
                    }
                    z6 = true;
                    break;
            }
            if (z6) {
                z5 = false;
            }
            z5 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f4748h);
                            if (findPointerIndex >= 0) {
                                float x6 = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f7 = this.f4741a;
                                float f8 = -f7;
                                if (x6 < f8 || y < f8 || x6 >= (view2.getRight() - view2.getLeft()) + f7 || y >= (view2.getBottom() - view2.getTop()) + f7) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z5 = true;
                                        if (z5) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f4748h = motionEvent.getPointerId(0);
                    if (this.f4745e == null) {
                        this.f4745e = new G(this, 0);
                    }
                    view2.postDelayed(this.f4745e, this.f4742b);
                    if (this.f4746f == null) {
                        this.f4746f = new G(this, 1);
                    }
                    view2.postDelayed(this.f4746f, this.f4743c);
                }
            }
            z5 = false;
            if (z5) {
            }
        }
        this.f4747g = z5;
        return z5 || z7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4747g = false;
        this.f4748h = -1;
        G g7 = this.f4745e;
        if (g7 != null) {
            this.f4744d.removeCallbacks(g7);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0431a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f4750j = 0;
        this.f4751k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0431a(C0449h c0449h, C0449h c0449h2) {
        this(c0449h2);
        this.f4750j = 1;
        this.f4751k = c0449h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
