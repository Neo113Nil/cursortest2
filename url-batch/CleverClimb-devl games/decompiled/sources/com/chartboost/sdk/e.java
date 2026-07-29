package com.chartboost.sdk;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3650a;

    /* renamed from: b, reason: collision with root package name */
    public final c f3651b;

    /* renamed from: d, reason: collision with root package name */
    protected JSONObject f3653d;
    public final com.chartboost.sdk.Model.c e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3652c = false;
    public final Map<View, Runnable> g = new IdentityHashMap();
    protected boolean h = true;
    protected boolean i = true;
    private a k = null;
    protected int f = CBUtility.a();
    private boolean j = false;

    protected abstract a b(Context context);

    public float j() {
        return 0.0f;
    }

    public float k() {
        return 0.0f;
    }

    public boolean l() {
        return false;
    }

    public abstract class a extends RelativeLayout {

        /* renamed from: a, reason: collision with root package name */
        Integer f3657a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3659c;

        /* renamed from: d, reason: collision with root package name */
        private int f3660d;
        private int e;
        private int f;
        private int g;

        protected abstract void a(int i, int i2);

        public void b() {
        }

        public a(Context context) {
            super(context);
            this.f3659c = false;
            this.f3660d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.f3657a = null;
            setFocusableInTouchMode(true);
            requestFocus();
        }

        @Override // android.view.View
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.f = i;
            this.g = i2;
            if (this.f3660d == -1 || this.e == -1 || e.this.e == null || e.this.e.p.f3611b != 0) {
                return;
            }
            a();
        }

        private boolean b(int i, int i2) {
            boolean z = true;
            if (e.this.e != null && e.this.e.p.f3611b == 1) {
                return true;
            }
            if (this.f3659c) {
                return false;
            }
            int a2 = CBUtility.a();
            if (this.f3660d == i && this.e == i2 && this.f3657a != null && this.f3657a.intValue() == a2) {
                return true;
            }
            this.f3659c = true;
            try {
                if (e.this.h && CBUtility.a(a2)) {
                    e.this.f = a2;
                } else if (e.this.i && CBUtility.b(a2)) {
                    e.this.f = a2;
                }
                a(i, i2);
                post(new Runnable() { // from class: com.chartboost.sdk.e.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.requestLayout();
                    }
                });
                this.f3660d = i;
                this.e = i2;
                this.f3657a = Integer.valueOf(a2);
            } catch (Exception e) {
                CBLogging.a("CBViewProtocol", "Exception raised while layouting Subviews", e);
                com.chartboost.sdk.Tracking.a.a(getClass(), "tryLayout", e);
                z = false;
            }
            this.f3659c = false;
            return z;
        }

        public final void a() {
            a(false);
        }

        public final void a(boolean z) {
            if (z) {
                this.f3657a = null;
            }
            a((Activity) getContext());
        }

        public boolean a(Activity activity) {
            int i;
            int i2;
            int i3;
            if (this.f == -1 || this.g == -1) {
                try {
                    i = getWidth();
                    i2 = getHeight();
                    if (i == 0 || i2 == 0) {
                        View findViewById = activity.getWindow().findViewById(R.id.content);
                        if (findViewById == null) {
                            findViewById = activity.getWindow().getDecorView();
                        }
                        int width = findViewById.getWidth();
                        i2 = findViewById.getHeight();
                        i = width;
                    }
                } catch (Exception unused) {
                    i = 0;
                    i2 = 0;
                }
                if (i == 0 || i2 == 0) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    i3 = displayMetrics.widthPixels;
                    i2 = displayMetrics.heightPixels;
                } else {
                    i3 = i;
                }
                this.f = i3;
                this.g = i2;
            }
            return b(this.f, this.g);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            synchronized (e.this.g) {
                Iterator<Runnable> it = e.this.g.values().iterator();
                while (it.hasNext()) {
                    e.this.f3650a.removeCallbacks(it.next());
                }
                e.this.g.clear();
            }
        }

        public final void a(View view) {
            int id = getId();
            int i = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            if (200 == id) {
                i = 201;
            }
            View findViewById = findViewById(i);
            while (findViewById != null) {
                i++;
                findViewById = findViewById(i);
            }
            view.setId(i);
            view.setSaveEnabled(false);
        }
    }

    public static boolean a(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 4;
    }

    public e(com.chartboost.sdk.Model.c cVar, Handler handler, c cVar2) {
        this.f3650a = handler;
        this.f3651b = cVar2;
        this.e = cVar;
    }

    public int a() {
        return this.f;
    }

    public boolean a(JSONObject jSONObject) {
        this.f3653d = com.chartboost.sdk.Libraries.e.a(jSONObject, "assets");
        if (this.f3653d != null) {
            return true;
        }
        this.f3653d = new JSONObject();
        CBLogging.b("CBViewProtocol", "Media got from the response is null or empty");
        a(CBError.CBImpressionError.INVALID_RESPONSE);
        return false;
    }

    public void b() {
        i();
    }

    public CBError.CBImpressionError c() {
        Activity b2 = this.f3651b.b();
        if (b2 == null) {
            this.k = null;
            return CBError.CBImpressionError.NO_HOST_ACTIVITY;
        }
        if (!this.i && !this.h) {
            return CBError.CBImpressionError.WRONG_ORIENTATION;
        }
        if (this.k == null) {
            this.k = b(b2);
        }
        if (this.e.p.f3611b != 0 || this.k.a(b2)) {
            return null;
        }
        this.k = null;
        return CBError.CBImpressionError.ERROR_CREATING_VIEW;
    }

    public void d() {
        f();
        synchronized (this.g) {
            Iterator<Runnable> it = this.g.values().iterator();
            while (it.hasNext()) {
                this.f3650a.removeCallbacks(it.next());
            }
            this.g.clear();
        }
    }

    public a e() {
        return this.k;
    }

    public void f() {
        if (this.k != null) {
            this.k.b();
        }
        this.k = null;
    }

    public JSONObject g() {
        return this.f3653d;
    }

    public void a(CBError.CBImpressionError cBImpressionError) {
        this.e.a(cBImpressionError);
    }

    public void h() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.e.c();
    }

    protected void i() {
        this.e.d();
    }

    public boolean b(JSONObject jSONObject) {
        return this.e.a(jSONObject);
    }

    public void a(boolean z, View view) {
        a(z, view, true);
    }

    public void a(final boolean z, final View view, boolean z2) {
        if ((z && view.getVisibility() == 0) || (!z && view.getVisibility() == 8)) {
            synchronized (this.g) {
                if (!this.g.containsKey(view)) {
                    return;
                }
            }
        }
        if (!z2) {
            view.setVisibility(z ? 0 : 8);
            view.setClickable(z);
        } else {
            Runnable runnable = new Runnable() { // from class: com.chartboost.sdk.e.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!z) {
                        view.setVisibility(8);
                        view.setClickable(false);
                    }
                    synchronized (e.this.g) {
                        e.this.g.remove(view);
                    }
                }
            };
            int i = this.e.p.f3611b;
            this.e.i.f3643a.a(z, view, 500L);
            a(view, runnable, 500L);
        }
    }

    public void a(View view, Runnable runnable, long j) {
        synchronized (this.g) {
            Runnable runnable2 = this.g.get(view);
            if (runnable2 != null) {
                this.f3650a.removeCallbacks(runnable2);
            }
            this.g.put(view, runnable);
        }
        this.f3650a.postDelayed(runnable, j);
    }

    public static int a(String str) {
        if (str != null) {
            if (!str.startsWith("#")) {
                try {
                    return Color.parseColor(str);
                } catch (IllegalArgumentException unused) {
                    str = "#" + str;
                }
            }
            if (str.length() == 4 || str.length() == 5) {
                StringBuilder sb = new StringBuilder((str.length() * 2) + 1);
                sb.append("#");
                int i = 0;
                while (i < str.length() - 1) {
                    i++;
                    sb.append(str.charAt(i));
                    sb.append(str.charAt(i));
                }
                str = sb.toString();
            }
            try {
                return Color.parseColor(str);
            } catch (IllegalArgumentException e) {
                CBLogging.c("CBViewProtocol", "error parsing color " + str, e);
            }
        }
        return 0;
    }

    public void m() {
        if (this.f3652c) {
            this.f3652c = false;
        }
        a e = e();
        if (e != null) {
            if (e.f3657a == null || CBUtility.a() != e.f3657a.intValue()) {
                e.a(false);
            }
        }
    }

    public void n() {
        this.f3652c = true;
    }
}
