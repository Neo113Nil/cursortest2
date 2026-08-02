package defpackage;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bo implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0385, code lost:
    
        if (r2 == null) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        vv vvVar;
        LocaleList forLanguageTags;
        Object obj;
        LocaleList applicationLocales;
        Context a;
        boolean z2;
        switch (this.b) {
            case 0:
                ArrayList arrayList = ((by) this.a).i;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                }
                return;
            case 1:
                ((bd) this.a).ag.b(aej.ON_CREATE);
                return;
            case 2:
                ((by) this.a).af(true);
                return;
            case 3:
                int i2 = dk.a;
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context = (Context) this.a;
                    ComponentName componentName = new ComponentName(context, "android.support.v7.app.AppLocalesMetadataHolderService");
                    z = true;
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (Build.VERSION.SDK_INT < 33) {
                            vvVar = dk.b;
                            break;
                        } else {
                            qj qjVar = new qj(dk.e);
                            while (true) {
                                if (qjVar.hasNext()) {
                                    dk dkVar = (dk) ((WeakReference) qjVar.next()).get();
                                    if (dkVar != null && (a = dkVar.a()) != null) {
                                        obj = a.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                applicationLocales = bo$$ExternalSyntheticApiModelOutline0.m(obj).getApplicationLocales();
                                vvVar = vv.d(applicationLocales);
                                if (vvVar.g()) {
                                    String a2 = ue.a(context);
                                    Object systemService = context.getSystemService("locale");
                                    if (systemService != null) {
                                        forLanguageTags = LocaleList.forLanguageTags(a2);
                                        bo$$ExternalSyntheticApiModelOutline0.m(systemService).setApplicationLocales(forLanguageTags);
                                    }
                                }
                                z = true;
                                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            vvVar = vv.a;
                            if (vvVar.g()) {
                            }
                            z = true;
                            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                } else {
                    z = true;
                }
                dk.d = z;
                return;
            case 4:
                dy dyVar = (dy) this.a;
                if ((dyVar.J & 1) != 0) {
                    dyVar.B(0);
                }
                if ((dyVar.J & 4096) != 0) {
                    dyVar.B(108);
                }
                dyVar.I = false;
                dyVar.J = 0;
                return;
            case 5:
                dy dyVar2 = (dy) this.a;
                dyVar2.t.showAtLocation(dyVar2.s, 55, 0, 0);
                dyVar2.C();
                if (!dyVar2.L()) {
                    dyVar2.s.setAlpha(1.0f);
                    dyVar2.s.setVisibility(0);
                    return;
                }
                dyVar2.s.setAlpha(0.0f);
                brn s = yq.s(dyVar2.s);
                s.N(1.0f);
                dyVar2.M = s;
                dyVar2.M.P(new dl(this));
                return;
            case 6:
                Object obj2 = this.a;
                Menu w = ((ef) obj2).w();
                Menu menu = true != (w instanceof gd) ? null : w;
                if (menu != null) {
                    ((gd) menu).s();
                }
                try {
                    w.clear();
                    Window.Callback callback = ((ef) obj2).a;
                    if (!callback.onCreatePanelMenu(0, w) || !callback.onPreparePanel(0, null, w)) {
                        w.clear();
                    }
                    if (menu != null) {
                        ((gd) menu).r();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (menu != null) {
                        ((gd) menu).r();
                    }
                    throw th;
                }
            case 7:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.a;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.i = actionBarOverlayLayout.c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.j);
                return;
            case 8:
                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.a;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.i = actionBarOverlayLayout2.c.animate().translationY(-actionBarOverlayLayout2.c.getHeight()).setListener(actionBarOverlayLayout2.j);
                return;
            case 9:
                jp jpVar = (jp) this.a;
                jpVar.b = null;
                jpVar.drawableStateChanged();
                return;
            case 10:
                js jsVar = (js) this.a;
                int i3 = jsVar.q;
                if (i3 == 1) {
                    jsVar.p.cancel();
                } else if (i3 != 2) {
                    return;
                }
                jsVar.q = 3;
                ValueAnimator valueAnimator = jsVar.p;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 11:
                ViewParent parent = ((jt) this.a).c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                jt jtVar = (jt) this.a;
                jtVar.d();
                View view = jtVar.c;
                if (view.isEnabled() && !view.isLongClickable() && jtVar.b()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    jtVar.d = true;
                    return;
                }
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ki) this.a).q();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ki kiVar = (ki) this.a;
                jp jpVar2 = kiVar.e;
                if (jpVar2 == null || !jpVar2.isAttachedToWindow() || kiVar.e.getCount() <= kiVar.e.getChildCount()) {
                    return;
                }
                kiVar.e.getChildCount();
                kiVar.p.setInputMethodMode(2);
                kiVar.v();
                return;
            case 15:
                ((RecyclerView) this.a).r = false;
                return;
            case 16:
                RecyclerView recyclerView = (RecyclerView) this.a;
                kv kvVar = recyclerView.C;
                if (kvVar != null) {
                    boolean isEmpty = kvVar.b.isEmpty();
                    boolean z3 = !isEmpty;
                    boolean isEmpty2 = kvVar.d.isEmpty();
                    boolean isEmpty3 = kvVar.e.isEmpty();
                    boolean z4 = !isEmpty3;
                    boolean isEmpty4 = kvVar.c.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4) {
                        if (!isEmpty3) {
                            z4 = true;
                        }
                    }
                    ArrayList arrayList2 = kvVar.b;
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            lp lpVar = (lp) arrayList2.get(i4);
                            View view2 = lpVar.a;
                            ViewPropertyAnimator animate = view2.animate();
                            kvVar.k.add(lpVar);
                            animate.setDuration(120L).alpha(0.0f).setListener(new jc(kvVar, lpVar, animate, view2)).start();
                            i4++;
                        } else {
                            kvVar.b.clear();
                            if (!isEmpty2) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.addAll(kvVar.d);
                                kvVar.g.add(arrayList3);
                                kvVar.d.clear();
                                at atVar = new at(kvVar, arrayList3, 10, (byte[]) null);
                                if (isEmpty) {
                                    atVar.run();
                                } else {
                                    View view3 = ((ji) arrayList3.get(0)).a.a;
                                    int i5 = yq.a;
                                    view3.postOnAnimationDelayed(atVar, 120L);
                                }
                            }
                            if (z4) {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.addAll(kvVar.e);
                                kvVar.h.add(arrayList4);
                                kvVar.e.clear();
                                at atVar2 = new at(kvVar, arrayList4, 11, (byte[]) null);
                                if (isEmpty) {
                                    atVar2.run();
                                } else {
                                    View view4 = ((jh) arrayList4.get(0)).a.a;
                                    int i6 = yq.a;
                                    view4.postOnAnimationDelayed(atVar2, 120L);
                                }
                            }
                            if (!isEmpty4) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(kvVar.c);
                                kvVar.f.add(arrayList5);
                                kvVar.c.clear();
                                at atVar3 = new at(kvVar, arrayList5, 12, (byte[]) null);
                                if (!isEmpty || !isEmpty2 || z4) {
                                    long max = (true != z3 ? 0L : 120L) + Math.max(!isEmpty2 ? 250L : 0L, z4 ? 250L : 0L);
                                    z2 = false;
                                    View view5 = ((lp) arrayList5.get(0)).a;
                                    int i7 = yq.a;
                                    view5.postOnAnimationDelayed(atVar3, max);
                                    recyclerView.P = z2;
                                    return;
                                }
                                atVar3.run();
                            }
                        }
                    }
                }
                z2 = false;
                recyclerView.P = z2;
                return;
            case 17:
                ((StaggeredGridLayoutManager) this.a).L();
                return;
            case 18:
                ((Toolbar) this.a).j();
                return;
            case 19:
                Toolbar toolbar = (Toolbar) this.a;
                ArrayList arrayList6 = toolbar.r;
                int size3 = arrayList6.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    toolbar.f().removeItem(((MenuItem) arrayList6.get(i8)).getItemId());
                }
                Menu f = toolbar.f();
                ArrayList i9 = toolbar.i();
                toolbar.x.k(f, toolbar.g());
                ArrayList i10 = toolbar.i();
                i10.removeAll(i9);
                toolbar.r = i10;
                return;
            default:
                ((Toolbar) this.a).y();
                return;
        }
    }

    public bo(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
