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
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.io.ByteArrayOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s0 implements z4, c1, w0 {
    public static FrameLayout s;
    public final Activity a;
    public final String b;
    public final g5 c;
    public boolean d;
    public final b1 e;
    public r0 f;
    public String g;
    public boolean h;
    public boolean i;
    public AnimationSet j;
    public boolean k;
    public boolean l;
    public ByteArrayOutputStream m;
    public Bitmap n;
    public b o;
    public final b0 p;
    public final v0 q;
    public final LinearLayout r;

    public s0(Activity activity, String name, h messageSender, z4 z4Var) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.a = activity;
        this.b = name;
        this.c = messageSender;
        this.d = true;
        b1 b1Var = new b1(activity, this);
        this.e = b1Var;
        this.k = true;
        if (s == null) {
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.setVisibility(4);
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            s = frameLayout;
        }
        b1Var.setX(0.0f);
        b1Var.setY(0.0f);
        b1Var.setVisibility(4);
        b1Var.setId(View.generateViewId());
        FrameLayout frameLayout2 = s;
        Intrinsics.checkNotNull(frameLayout2);
        b0 b0Var = new b0(activity, b1Var, frameLayout2, name, messageSender, z4Var == null ? this : z4Var);
        b0Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.onevcat.uniwebview.s0$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return s0.a(s0.this, view, motionEvent);
            }
        });
        this.p = b0Var;
        v0 v0Var = new v0(activity);
        v0Var.setDelegate(this);
        v0Var.setLayoutParams(new Toolbar.LayoutParams(-1, -2));
        v0Var.setVisibility(8);
        this.q = v0Var;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(0);
        this.r = linearLayout;
    }

    public final boolean a(int i, int i2, int i3, int i4, float f, float f2, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.j != null) {
            o oVar = o.b;
            oVar.getClass();
            Intrinsics.checkNotNullParameter("Trying to animate web view but an other transition animation is not finished yet. Ignore this one.", "message");
            oVar.a(n.CRITICAL, "Trying to animate web view but an other transition animation is not finished yet. Ignore this one.");
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
        b1 b1Var = this.e;
        q qVar = new q(b1Var, b1Var.getWidth(), i3, this.e.getHeight(), i4);
        qVar.setFillAfter(true);
        qVar.setDuration(j);
        qVar.setStartOffset(j2);
        animationSet.addAnimation(qVar);
        animationSet.setAnimationListener(new p0(this, i, i2, i3, i4, identifier));
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
            this.f = new r0(this.a);
        }
        r0 r0Var = this.f;
        if (r0Var != null) {
            r0Var.setCanceledOnTouchOutside(this.d);
        }
        if ((z || this.h) && this.e.getVisibility() == 0) {
            o oVar = o.b;
            oVar.getClass();
            Intrinsics.checkNotNullParameter("Show progress dialog.", "message");
            oVar.a(n.VERBOSE, "Show progress dialog.");
            r0 r0Var2 = this.f;
            if (r0Var2 != null) {
                String str = this.g;
                if (str == null) {
                    str = this.a.getResources().getString(R.string.LOADING);
                    Intrinsics.checkNotNullExpressionValue(str, "activity.resources.getString(R.string.LOADING)");
                }
                r0Var2.setMessage(str);
            }
            r0 r0Var3 = this.f;
            if (r0Var3 != null) {
                r0Var3.show();
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
        r0 r0Var;
        if ((z || this.h) && (r0Var = this.f) != null && r0Var.isShowing()) {
            o oVar = o.b;
            oVar.getClass();
            Intrinsics.checkNotNullParameter("Hide progress dialog.", "message");
            oVar.a(n.VERBOSE, "Hide progress dialog.");
            r0 r0Var2 = this.f;
            if (r0Var2 != null) {
                r0Var2.dismiss();
            }
        }
    }

    @Override // com.onevcat.uniwebview.z4
    public final void a(String str, int i) {
        o oVar = o.b;
        String message = "onPageFinished. URL: " + str + ", status code: " + i;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        v0 v0Var = this.q;
        b0 b0Var = this.p;
        boolean z = true;
        boolean z2 = b0Var.d.i != null || b0Var.canGoBack();
        b0 b0Var2 = this.p;
        b0 b0Var3 = b0Var2.d.i;
        if ((b0Var3 == null || !b0Var3.canGoForward()) && !b0Var2.canGoForward()) {
            z = false;
        }
        v0Var.a(z2, z);
        this.i = false;
        a(false);
        String valueOf = String.valueOf(i);
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.c.a(this.p.getName(), h5.PageFinished, new c5(BuildConfig.FLAVOR, valueOf, str, null));
    }

    @Override // com.onevcat.uniwebview.z4
    public final void a(String str) {
        o oVar = o.b;
        oVar.a(n.INFO, d.a("onPageStarted: ", str, oVar, "message"));
        v0 v0Var = this.q;
        b0 b0Var = this.p;
        boolean z = b0Var.d.i != null || b0Var.canGoBack();
        b0 b0Var2 = this.p;
        b0 b0Var3 = b0Var2.d.i;
        v0Var.a(z, (b0Var3 != null && b0Var3.canGoForward()) || b0Var2.canGoForward());
        this.i = true;
        c(false);
        g5 g5Var = this.c;
        String name = this.p.getName();
        h5 h5Var = h5.PageStarted;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        g5Var.a(name, h5Var, str);
    }

    @Override // com.onevcat.uniwebview.z4
    public final void a(c5 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        JSONObject jSONObject = payload.d;
        String string = jSONObject != null ? jSONObject.getString("failingURL") : null;
        o oVar = o.b;
        String message = "onReceivedError. URL: " + string + ", error code: " + payload.b + ", description: " + payload.c;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.CRITICAL, message);
        v0 v0Var = this.q;
        b0 b0Var = this.p;
        boolean z = true;
        boolean z2 = b0Var.d.i != null || b0Var.canGoBack();
        b0 b0Var2 = this.p;
        b0 b0Var3 = b0Var2.d.i;
        if ((b0Var3 == null || !b0Var3.canGoForward()) && !b0Var2.canGoForward()) {
            z = false;
        }
        v0Var.a(z2, z);
        this.i = false;
        a(false);
        this.c.a(this.p.getName(), h5.PageErrorReceived, payload);
    }

    @Override // com.onevcat.uniwebview.z4
    public final void a() {
        this.i = false;
        a(false);
        this.c.a(this.p.getName(), h5.WebContentProcessDidTerminate, BuildConfig.FLAVOR);
    }

    public final void a(float f) {
        this.e.setAlpha(RangesKt.coerceIn(f, 0.0f, 1.0f));
    }

    public final void a(int i, int i2, int i3, int i4) {
        o oVar = o.b;
        String message = "Setting web container frame to {(" + i + ", " + i2 + "), (" + i3 + ", " + i4 + ")}";
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.VERBOSE, message);
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
        b bVar = this.o;
        if (bVar != null) {
            bVar.g = max2;
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
            o oVar = o.b;
            oVar.getClass();
            Intrinsics.checkNotNullParameter("Showing web view is ignored since it is already visible.", "message");
            oVar.a(n.CRITICAL, "Showing web view is ignored since it is already visible.");
            return false;
        }
        if (!z3 && !z) {
            o oVar2 = o.b;
            oVar2.getClass();
            Intrinsics.checkNotNullParameter("Hiding web view is ignored since it is already invisible.", "message");
            oVar2.a(n.CRITICAL, "Hiding web view is ignored since it is already invisible.");
            return false;
        }
        if (this.j != null) {
            o oVar3 = o.b;
            oVar3.getClass();
            Intrinsics.checkNotNullParameter("Trying to show or hide web view but an other transition animation is not finished yet. Ignore this one.", "message");
            oVar3.a(n.CRITICAL, "Trying to show or hide web view but an other transition animation is not finished yet. Ignore this one.");
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
        int[] b = c.b(5);
        int length = b.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i2 = 0;
                break;
            }
            i2 = b[i6];
            if (c.a(i2) == i) {
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
            int a = c.a(i2);
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
            animationSet.setAnimationListener(new q0(this, z, identifier));
            this.e.startAnimation(animationSet);
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.onevcat.uniwebview.s0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.a(s0.this, z, identifier);
                }
            }, 1L);
        }
        return true;
    }

    public static final void a(s0 this$0, boolean z, String identifier) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        if (z) {
            this$0.c.a(this$0.p.getName(), h5.ShowTransitionFinished, identifier);
        } else {
            this$0.e.setVisibility(4);
            this$0.c.a(this$0.p.getName(), h5.HideTransitionFinished, identifier);
        }
    }

    public static final boolean a(s0 this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return !this$0.k;
    }
}
