package com.onevcat.uniwebview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toolbar;
import androidx.core.view.ViewCompat;
import java.io.ByteArrayOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class N implements V1, Y, S {
    public static FrameLayout s;
    public final Activity a;
    public final String b;
    public final c2 c;
    public boolean d;
    public final X e;
    public M f;
    public String g;
    public boolean h;
    public boolean i;
    public AnimationSet j;
    public boolean k;
    public boolean l;
    public ByteArrayOutputStream m;
    public Bitmap n;
    public C0030b o;
    public final C0093w p;
    public final Q q;
    public final LinearLayout r;

    public N(Activity activity, String name, C0042f messageSender, V1 v1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.a = activity;
        this.b = name;
        this.c = messageSender;
        this.d = true;
        X x = new X(activity, this);
        this.e = x;
        this.k = true;
        if (s == null) {
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.setVisibility(4);
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            s = frameLayout;
        }
        x.setX(0.0f);
        x.setY(0.0f);
        x.setVisibility(4);
        x.setId(View.generateViewId());
        FrameLayout frameLayout2 = s;
        Intrinsics.checkNotNull(frameLayout2);
        C0093w c0093w = new C0093w(activity, x, frameLayout2, name, messageSender, v1 == null ? this : v1);
        c0093w.setOnTouchListener(new View.OnTouchListener() { // from class: com.onevcat.uniwebview.N$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return N.a(N.this, view, motionEvent);
            }
        });
        this.p = c0093w;
        Q q = new Q(activity);
        q.setDelegate(this);
        q.setLayoutParams(new Toolbar.LayoutParams(-1, -2));
        q.setVisibility(8);
        this.q = q;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(0);
        this.r = linearLayout;
    }

    public final boolean a(int i, int i2, int i3, int i4, float f, float f2, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.j != null) {
            C0060l c0060l = C0060l.b;
            c0060l.getClass();
            Intrinsics.checkNotNullParameter("Trying to animate web view but an other transition animation is not finished yet. Ignore this one.", "message");
            c0060l.a(EnumC0057k.CRITICAL, "Trying to animate web view but an other transition animation is not finished yet. Ignore this one.");
            return false;
        }
        float f3 = 1000;
        long j = (long) (f * f3);
        long j2 = (long) (f3 * f2);
        AnimationSet animationSet = new AnimationSet(false);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, i - this.e.getX(), 0.0f, i2 - this.e.getY());
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(j);
        translateAnimation.setStartOffset(j2);
        animationSet.addAnimation(translateAnimation);
        X x = this.e;
        C0066n c0066n = new C0066n(x, x.getWidth(), i3, this.e.getHeight(), i4);
        c0066n.setFillAfter(true);
        c0066n.setDuration(j);
        c0066n.setStartOffset(j2);
        animationSet.addAnimation(c0066n);
        animationSet.setAnimationListener(new K(this, i, i2, i3, i4, identifier));
        this.e.startAnimation(animationSet);
        return true;
    }

    public final void b() {
        Object systemService = this.a.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.p.getWindowToken(), 0);
        }
    }

    public final float c() {
        return this.e.getAlpha();
    }

    public final void b(boolean z) {
        this.q.setVisibility(z ? 0 : 8);
    }

    public final void c(boolean z) {
        if (this.f == null) {
            this.f = new M(this.a);
        }
        M m = this.f;
        if (m != null) {
            m.setCanceledOnTouchOutside(this.d);
        }
        if ((z || this.h) && this.e.getVisibility() == 0) {
            C0060l c0060l = C0060l.b;
            c0060l.getClass();
            Intrinsics.checkNotNullParameter("Show progress dialog.", "message");
            c0060l.a(EnumC0057k.VERBOSE, "Show progress dialog.");
            M m2 = this.f;
            if (m2 != null) {
                String str = this.g;
                if (str == null) {
                    str = this.a.getResources().getString(R.string.LOADING);
                    Intrinsics.checkNotNullExpressionValue(str, "activity.resources.getString(R.string.LOADING)");
                }
                m2.setMessage(str);
            }
            M m3 = this.f;
            if (m3 != null) {
                m3.show();
            }
        }
    }

    public final Bitmap a(Rect rect) {
        if (rect == null) {
            rect = new Rect(0, 0, this.e.getWidth(), this.e.getHeight());
        }
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(r.width(), … Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-rect.left, -rect.top);
        this.e.draw(canvas);
        return createBitmap;
    }

    public final void a(boolean z) {
        M m;
        if ((z || this.h) && (m = this.f) != null && m.isShowing()) {
            C0060l c0060l = C0060l.b;
            c0060l.getClass();
            Intrinsics.checkNotNullParameter("Hide progress dialog.", "message");
            c0060l.a(EnumC0057k.VERBOSE, "Hide progress dialog.");
            M m2 = this.f;
            if (m2 != null) {
                m2.dismiss();
            }
        }
    }

    @Override // com.onevcat.uniwebview.V1
    public final void a(String str, int i) {
        C0060l c0060l = C0060l.b;
        String message = "onPageFinished. URL: " + str + ", status code: " + i;
        c0060l.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(EnumC0057k.INFO, message);
        Q q = this.q;
        C0093w c0093w = this.p;
        boolean z = true;
        boolean z2 = c0093w.d.i != null || c0093w.canGoBack();
        C0093w c0093w2 = this.p;
        C0093w c0093w3 = c0093w2.d.i;
        if ((c0093w3 == null || !c0093w3.canGoForward()) && !c0093w2.canGoForward()) {
            z = false;
        }
        q.a(z2, z);
        this.i = false;
        a(false);
        String valueOf = String.valueOf(i);
        if (str == null) {
            str = "";
        }
        this.c.a(this.p.getName(), d2.PageFinished, new Y1("", valueOf, str, null));
    }

    @Override // com.onevcat.uniwebview.V1
    public final void a(String str) {
        C0060l c0060l = C0060l.b;
        c0060l.a(EnumC0057k.INFO, AbstractC0075q.a("onPageStarted: ", str, c0060l, "message"));
        Q q = this.q;
        C0093w c0093w = this.p;
        boolean z = c0093w.d.i != null || c0093w.canGoBack();
        C0093w c0093w2 = this.p;
        C0093w c0093w3 = c0093w2.d.i;
        q.a(z, (c0093w3 != null && c0093w3.canGoForward()) || c0093w2.canGoForward());
        this.i = true;
        c(false);
        c2 c2Var = this.c;
        String name = this.p.getName();
        d2 d2Var = d2.PageStarted;
        if (str == null) {
            str = "";
        }
        c2Var.a(name, d2Var, str);
    }

    @Override // com.onevcat.uniwebview.V1
    public final void a(Y1 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        JSONObject jSONObject = payload.d;
        String string = jSONObject != null ? jSONObject.getString("failingURL") : null;
        C0060l c0060l = C0060l.b;
        String message = "onReceivedError. URL: " + string + ", error code: " + payload.b + ", description: " + payload.c;
        c0060l.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(EnumC0057k.CRITICAL, message);
        Q q = this.q;
        C0093w c0093w = this.p;
        boolean z = true;
        boolean z2 = c0093w.d.i != null || c0093w.canGoBack();
        C0093w c0093w2 = this.p;
        C0093w c0093w3 = c0093w2.d.i;
        if ((c0093w3 == null || !c0093w3.canGoForward()) && !c0093w2.canGoForward()) {
            z = false;
        }
        q.a(z2, z);
        this.i = false;
        a(false);
        this.c.a(this.p.getName(), d2.PageErrorReceived, payload);
    }

    @Override // com.onevcat.uniwebview.V1
    public final void a() {
        this.i = false;
        a(false);
        this.c.a(this.p.getName(), d2.WebContentProcessDidTerminate, "");
    }

    public final void a(float f) {
        this.e.setAlpha(RangesKt.coerceIn(f, 0.0f, 1.0f));
    }

    public final void a(int i, int i2, int i3, int i4) {
        C0060l c0060l = C0060l.b;
        String message = "Setting web container frame to {(" + i + ", " + i2 + "), (" + i3 + ", " + i4 + ")}";
        c0060l.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(EnumC0057k.VERBOSE, message);
        a(i, i2);
        int max = Math.max(0, i3);
        int max2 = Math.max(0, i4);
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = max;
        layoutParams2.height = max2;
        layoutParams2.gravity = 51;
        this.e.setLayoutParams(layoutParams2);
        C0030b c0030b = this.o;
        if (c0030b != null) {
            c0030b.g = max2;
        }
    }

    public final void a(int i, int i2) {
        this.e.setX(i);
        this.e.setY(i2);
    }

    public final boolean a(final boolean z, boolean z2, int i, float f, final String identifier) {
        int i2;
        AlphaAnimation alphaAnimation;
        int i3;
        TranslateAnimation translateAnimation;
        int i4;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        int i5 = 0;
        if (this.p.get_webChromeClient$uniwebview_release().f) {
            FrameLayout frameLayout = s;
            if (frameLayout != null) {
                frameLayout.setVisibility(z ? 0 : 4);
            }
            return true;
        }
        boolean z3 = this.e.getVisibility() == 0;
        if (z3 && z) {
            C0060l c0060l = C0060l.b;
            c0060l.getClass();
            Intrinsics.checkNotNullParameter("Showing web view is ignored since it is already visible.", "message");
            c0060l.a(EnumC0057k.CRITICAL, "Showing web view is ignored since it is already visible.");
            return false;
        }
        if (!z3 && !z) {
            C0060l c0060l2 = C0060l.b;
            c0060l2.getClass();
            Intrinsics.checkNotNullParameter("Hiding web view is ignored since it is already invisible.", "message");
            c0060l2.a(EnumC0057k.CRITICAL, "Hiding web view is ignored since it is already invisible.");
            return false;
        }
        if (this.j != null) {
            C0060l c0060l3 = C0060l.b;
            c0060l3.getClass();
            Intrinsics.checkNotNullParameter("Trying to show or hide web view but an other transition animation is not finished yet. Ignore this one.", "message");
            c0060l3.a(EnumC0057k.CRITICAL, "Trying to show or hide web view but an other transition animation is not finished yet. Ignore this one.");
            return false;
        }
        if (z) {
            this.e.setVisibility(0);
            if (this.i) {
                c(false);
            }
        } else {
            b();
            a(false);
        }
        this.e.requestLayout();
        int[] b = AbstractC0033c.b(5);
        int length = b.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i2 = 0;
                break;
            }
            i2 = b[i6];
            if (AbstractC0033c.a(i2) == i) {
                break;
            }
            i6++;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        if ((z2 || i2 != 1) && f > 0.0f) {
            AnimationSet animationSet = new AnimationSet(false);
            long j = (long) (f * 1000);
            if (z2) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(z ? 0.0f : this.e.getAlpha(), z ? this.e.getAlpha() : 0.0f);
                alphaAnimation2.setFillAfter(true);
                alphaAnimation2.setDuration(j);
                alphaAnimation = alphaAnimation2;
            } else {
                alphaAnimation = null;
            }
            if (alphaAnimation != null) {
                animationSet.addAnimation(alphaAnimation);
            }
            Display defaultDisplay = this.a.getWindow().getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int a = AbstractC0033c.a(i2);
            if (a != 0) {
                if (a == 1) {
                    i4 = -point.y;
                } else if (a == 2) {
                    i3 = -point.x;
                } else if (a == 3) {
                    i4 = point.y;
                } else {
                    if (a != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = point.x;
                }
                i5 = i4;
                i3 = 0;
            } else {
                i3 = 0;
            }
            if (z) {
                translateAnimation = new TranslateAnimation(i3, 0.0f, i5, 0.0f);
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                translateAnimation = new TranslateAnimation(0.0f, i3, 0.0f, i5);
            }
            translateAnimation.setFillAfter(true);
            translateAnimation.setDuration(j);
            animationSet.addAnimation(translateAnimation);
            this.j = animationSet;
            animationSet.setAnimationListener(new L(this, z, identifier));
            this.e.startAnimation(animationSet);
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.onevcat.uniwebview.N$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    N.a(N.this, z, identifier);
                }
            }, 1L);
        }
        return true;
    }

    public static final void a(N this$0, boolean z, String identifier) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        if (z) {
            this$0.c.a(this$0.p.getName(), d2.ShowTransitionFinished, identifier);
        } else {
            this$0.e.setVisibility(4);
            this$0.c.a(this$0.p.getName(), d2.HideTransitionFinished, identifier);
        }
    }

    public static final boolean a(N this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return !this$0.k;
    }
}
