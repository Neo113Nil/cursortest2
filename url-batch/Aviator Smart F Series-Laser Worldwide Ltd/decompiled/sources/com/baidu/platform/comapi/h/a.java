package com.baidu.platform.comapi.h;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.baidu.ar.NavigationController;
import com.baidu.ar.NavigationType;
import com.baidu.ar.bean.DuMixARConfig;
import com.baidu.ar.marker.IMarkerStateListener;
import com.baidu.ar.marker.model.Segments;
import com.baidu.mapsdkplatform.comapi.util.SyncSysInfo;
import com.baidu.platform.comapi.util.j;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f9014a;

    /* renamed from: c, reason: collision with root package name */
    private Context f9016c;

    /* renamed from: f, reason: collision with root package name */
    private ViewGroup f9019f;

    /* renamed from: g, reason: collision with root package name */
    private NavigationController f9020g;

    /* renamed from: j, reason: collision with root package name */
    private List<Segments> f9023j;

    /* renamed from: k, reason: collision with root package name */
    private double[] f9024k;

    /* renamed from: l, reason: collision with root package name */
    private List<double[]> f9025l;

    /* renamed from: m, reason: collision with root package name */
    private int f9026m;

    /* renamed from: n, reason: collision with root package name */
    private double[] f9027n;

    /* renamed from: o, reason: collision with root package name */
    private double[] f9028o;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9015b = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9017d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9018e = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9021h = false;

    /* renamed from: i, reason: collision with root package name */
    private int f9022i = 0;

    /* renamed from: p, reason: collision with root package name */
    private NavigationType f9029p = NavigationType.ARIMU;

    /* renamed from: com.baidu.platform.comapi.h.a$a, reason: collision with other inner class name */
    class RunnableC0104a implements Runnable {
        RunnableC0104a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.a().a(a.this.f9023j, "runVIOIMU");
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final a f9031a = new a();
    }

    public NavigationController b() {
        return this.f9020g;
    }

    public synchronized boolean c() {
        return this.f9021h;
    }

    public boolean d() {
        return this.f9017d;
    }

    public NavigationType e() {
        return this.f9029p;
    }

    public void f() {
        if (this.f9020g != null) {
            com.baidu.platform.comapi.walknavi.b.n().b("onDestroy");
            this.f9020g.onDestroy();
            this.f9020g = null;
            this.f9023j = null;
            this.f9025l = null;
            this.f9024k = null;
            this.f9028o = null;
            this.f9027n = null;
            this.f9018e = false;
            this.f9017d = false;
        }
    }

    public void g() {
        ViewGroup viewGroup = this.f9019f;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (this.f9020g != null) {
            com.baidu.platform.comapi.walknavi.b.n().b("onPause");
            com.baidu.platform.comapi.h.s.b H = com.baidu.platform.comapi.walknavi.b.n().H();
            if ((H instanceof com.baidu.platform.comapi.walknavi.k.b) && ((com.baidu.platform.comapi.walknavi.k.b) H).w().b()) {
                this.f9020g.onPause();
            }
        }
    }

    public boolean h() {
        ViewGroup viewGroup = this.f9019f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        try {
            if (this.f9020g == null) {
                return true;
            }
            com.baidu.platform.comapi.walknavi.b.n().b("resume");
            this.f9020g.onResume();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public void i() {
        ViewGroup viewGroup = this.f9019f;
        if (viewGroup != null) {
            viewGroup.removeView(this.f9014a);
            this.f9014a = null;
        }
    }

    public static a a() {
        return b.f9031a;
    }

    public void b(boolean z7) {
        if (z7) {
            j.a(new RunnableC0104a(), 0L);
        }
        this.f9017d = z7;
    }

    public void a(boolean z7) {
        List<Segments> list;
        this.f9015b = z7;
        if (!z7 || (list = this.f9023j) == null) {
            return;
        }
        a(list, "caseOK");
    }

    public void a(IMarkerStateListener iMarkerStateListener) {
        NavigationController navigationController = this.f9020g;
        if (navigationController != null) {
            navigationController.setMarkerStateListener(iMarkerStateListener);
        }
    }

    public void a(List<Segments> list, String str) {
        try {
            if (!this.f9015b || !d()) {
                this.f9023j = list;
                return;
            }
            if (this.f9020g != null) {
                com.baidu.platform.comapi.h.s.b H = com.baidu.platform.comapi.walknavi.b.n().H();
                if (H instanceof com.baidu.platform.comapi.walknavi.k.b) {
                    com.baidu.platform.comapi.walknavi.k.b bVar = (com.baidu.platform.comapi.walknavi.k.b) H;
                    if (bVar.w() != null) {
                        bVar.w().a(false);
                    }
                }
                if (list == null || list.isEmpty()) {
                    return;
                }
                for (int i8 = 0; i8 < list.size(); i8++) {
                    list.get(i8);
                }
                this.f9020g.postNavigationRoute(list);
                com.baidu.platform.comapi.walknavi.b.n().b("postNavigationRoute!!!" + list.size() + str);
                this.f9023j = null;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void a(int i8) {
        NavigationController navigationController = this.f9020g;
        if (navigationController != null) {
            this.f9026m = i8;
            navigationController.updateMeters(i8);
        }
    }

    public void a(Activity activity, RelativeLayout relativeLayout, boolean z7) {
        try {
            if (this.f9020g != null) {
                return;
            }
            this.f9018e = false;
            this.f9017d = false;
            if (activity == null) {
                return;
            }
            this.f9016c = activity;
            this.f9020g = new NavigationController();
            com.baidu.platform.comapi.walknavi.b.n().b("create surface" + this.f9029p);
            this.f9014a = this.f9020g.createGLSurfaceViewWithSize(activity, this.f9029p, z7);
            relativeLayout.addView(this.f9014a, 0, new RelativeLayout.LayoutParams(-1, -1));
            this.f9019f = relativeLayout;
            if (z7) {
                DuMixARConfig.setCuid(SyncSysInfo.getCid());
            }
            this.f9015b = false;
            this.f9021h = false;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
