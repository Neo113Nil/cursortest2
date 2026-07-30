package com.onevcat.uniwebview;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowMetrics;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.onevcat.uniwebview.internal.obfuscated.A;
import com.onevcat.uniwebview.internal.obfuscated.A0;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0035c;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0045e;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0060h;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0094p0;
import com.onevcat.uniwebview.internal.obfuscated.AnimationAnimationListenerC0113u0;
import com.onevcat.uniwebview.internal.obfuscated.AnimationAnimationListenerC0117v0;
import com.onevcat.uniwebview.internal.obfuscated.B;
import com.onevcat.uniwebview.internal.obfuscated.C0;
import com.onevcat.uniwebview.internal.obfuscated.C0030b;
import com.onevcat.uniwebview.internal.obfuscated.C0061h0;
import com.onevcat.uniwebview.internal.obfuscated.C0065i;
import com.onevcat.uniwebview.internal.obfuscated.C0078l0;
import com.onevcat.uniwebview.internal.obfuscated.C0101r0;
import com.onevcat.uniwebview.internal.obfuscated.C0105s0;
import com.onevcat.uniwebview.internal.obfuscated.C0109t0;
import com.onevcat.uniwebview.internal.obfuscated.C0121w0;
import com.onevcat.uniwebview.internal.obfuscated.C0133z0;
import com.onevcat.uniwebview.internal.obfuscated.D3;
import com.onevcat.uniwebview.internal.obfuscated.E;
import com.onevcat.uniwebview.internal.obfuscated.E3;
import com.onevcat.uniwebview.internal.obfuscated.H3;
import com.onevcat.uniwebview.internal.obfuscated.p3;
import com.onevcat.uniwebview.internal.obfuscated.q3;
import com.onevcat.uniwebview.internal.obfuscated.s3;
import com.onevcat.uniwebview.internal.obfuscated.v3;
import com.onevcat.uniwebview.internal.obfuscated.w3;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements q3, A0 {
    public static FrameLayout A;
    public static boolean B;
    public final Activity a;
    public final String b;
    public boolean c;
    public final C0 d;
    public s3 e;
    public String f;
    public boolean g;
    public boolean h;
    public AnimationSet i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ByteArrayOutputStream m;
    public Bitmap n;
    public final LinkedHashMap o;
    public C0030b p;
    public Point q;
    public Point r;
    public C0109t0 s;
    public E3 t;
    public C0101r0 u;
    public final a v;
    public final C0133z0 w;
    public String x;
    public final D3 y;
    public final w3 z;

    public d(Activity activity, String name, C0065i messageSender) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.a = activity;
        this.b = name;
        this.c = true;
        C0 c0 = new C0(activity, this);
        this.d = c0;
        this.j = true;
        this.o = new LinkedHashMap();
        this.u = new C0101r0(0.0f, 0.0f, 0.0f, 0.0f);
        if (A == null) {
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.setVisibility(4);
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            A = frameLayout;
        }
        c0.setX(0.0f);
        c0.setY(0.0f);
        c0.setVisibility(4);
        c0.setId(View.generateViewId());
        FrameLayout frameLayout2 = A;
        Intrinsics.checkNotNull(frameLayout2);
        a aVar = new a(activity, c0, frameLayout2, name, messageSender, this);
        aVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.onevcat.uniwebview.d$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return d.a(d.this, view, motionEvent);
            }
        });
        this.v = aVar;
        C0133z0 c0133z0 = new C0133z0(activity);
        c0133z0.setDelegate(this);
        c0133z0.setLayoutParams(new Toolbar.LayoutParams(-1, -2));
        c0133z0.setVisibility(8);
        this.w = c0133z0;
        D3 d3 = new D3(activity);
        d3.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        this.y = d3;
        w3 w3Var = new w3(activity);
        w3Var.setOrientation(1);
        w3Var.setBackgroundColor(0);
        this.z = w3Var;
    }

    public static final void c(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.d.getWidth() >= ((int) (B ? 0.0f : 10000.0f)) * 2) {
            if (this$0.d.getHeight() >= ((int) (B ? 0.0f : 10000.0f)) * 2) {
                return;
            }
        }
        B b = B.b;
        String message = "View height limited to " + this$0.d.getHeight() + ", using fallback. View rotation/resizing might not work properly.";
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        B = true;
        Point point = this$0.q;
        this$0.a(point != null ? point.x : 0, point != null ? point.y : 0);
        Point point2 = this$0.r;
        this$0.b(point2 != null ? point2.x : 0, point2 != null ? point2.y : 0);
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.q3
    public final void a(String str, int i) {
        B b = B.b;
        String message = "onPageFinished. URL: " + str + ", status code: " + i;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        C0133z0 c0133z0 = this.w;
        a aVar = this.v;
        boolean z = true;
        boolean z2 = aVar.f() != null || aVar.canGoBack();
        a aVar2 = this.v;
        a f = aVar2.f();
        if (!(f != null ? f.canGoForward() : false) && !aVar2.canGoForward()) {
            z = false;
        }
        c0133z0.a(z2, z);
        this.h = false;
        a(false);
        String valueOf = String.valueOf(i);
        if (str == null) {
            str = "";
        }
        this.v.a(H3.PageFinished, new v3("", valueOf, str, null));
        if (this.k) {
            d();
            e();
        }
    }

    public final void b(final String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.onevcat.uniwebview.d$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                d.a(str, this);
            }
        };
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            this.a.runOnUiThread(runnable);
        }
    }

    public final void d() {
        if (this.l) {
            B b = B.b;
            b.a(A.VERBOSE, AbstractC0094p0.a(new StringBuilder("Transparency script already injected for "), this.b, ", skipping", b, "message"));
            return;
        }
        B b2 = B.b;
        String message = "Injecting transparency script for " + this.b;
        b2.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b2.a(A.INFO, message);
        if (this.t == null) {
            E3 e3 = new E3(this);
            this.t = e3;
            this.v.addJavascriptInterface(e3, "UniWebViewTransparencyBridge");
        }
        this.v.post(new Runnable() { // from class: com.onevcat.uniwebview.d$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this);
            }
        });
        this.l = true;
    }

    public final void e() {
        B b = B.b;
        String message = "Requesting transparency mask refresh for " + this.b;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.DEBUG, message);
        this.v.post(new Runnable() { // from class: com.onevcat.uniwebview.d$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                d.b(d.this);
            }
        });
    }

    public final void f() {
        Point point = this.r;
        B b = B.b;
        String message = "Container.syncShadow called for " + this.b + ", lastSize=" + point;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        if (point != null) {
            this.y.a(this.z, point.x, point.y);
            return;
        }
        D3 d3 = this.y;
        w3 w3Var = this.z;
        int i = D3.m;
        d3.a(w3Var, 0, 0);
    }

    public static final void b(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v.evaluateJavascript("window.__uv_transparency_collect && window.__uv_transparency_collect();", null);
    }

    public final void b(int i, int i2) {
        int i3;
        this.r = new Point(i, i2);
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        boolean z = B;
        if (z) {
            i3 = -1;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = ((int) (z ? 0.0f : 10000.0f)) * 2;
        }
        layoutParams2.width = i3;
        layoutParams2.height = i3;
        layoutParams2.gravity = 51;
        this.d.setLayoutParams(layoutParams2);
        if (!B) {
            this.d.post(new Runnable() { // from class: com.onevcat.uniwebview.d$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    d.c(d.this);
                }
            });
        }
        ViewGroup.LayoutParams layoutParams3 = this.z.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        int max = Math.max(0, i);
        int max2 = Math.max(0, i2);
        layoutParams3.width = max;
        layoutParams3.height = max2;
        this.z.setLayoutParams(layoutParams3);
        C0030b c0030b = this.p;
        if (c0030b != null) {
            c0030b.f = max2;
        }
        f();
        this.z.post(new Runnable() { // from class: com.onevcat.uniwebview.d$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                d.d(d.this);
            }
        });
    }

    public final void c(boolean z) {
        int i = z ? 0 : 8;
        if (this.w.getVisibility() == i) {
            return;
        }
        this.x = null;
        this.w.setVisibility(i);
    }

    public final float c() {
        return this.z.getAlpha();
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.q3
    public final void a(String parameters) {
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("onPageStarted: ", parameters, b, "message"));
        C0133z0 c0133z0 = this.w;
        a aVar = this.v;
        boolean z = aVar.f() != null || aVar.canGoBack();
        a aVar2 = this.v;
        a f = aVar2.f();
        c0133z0.a(z, (f != null ? f.canGoForward() : false) || aVar2.canGoForward());
        this.h = true;
        d(false);
        this.l = false;
        if (parameters == null) {
            parameters = "";
        }
        a aVar3 = this.v;
        H3 method = H3.PageStarted;
        aVar3.getClass();
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        aVar3.j.a(method, parameters);
        a aVar4 = this.v;
        H3 method2 = H3.PageCommitted;
        aVar4.getClass();
        Intrinsics.checkNotNullParameter(method2, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        aVar4.j.a(method2, parameters);
    }

    public static final void d(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.z.getWidth() <= 0 || this$0.z.getHeight() <= 0) {
            return;
        }
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Container.setSize: layout completed, syncing shadow again", "message");
        b.a(A.INFO, "Container.setSize: layout completed, syncing shadow again");
        this$0.f();
    }

    public final void b(final long j) {
        final C0105s0 c0105s0 = (C0105s0) this.o.get(Long.valueOf(j));
        if (c0105s0 == null || c0105s0.f) {
            return;
        }
        c0105s0.f = true;
        this.z.post(new Runnable() { // from class: com.onevcat.uniwebview.d$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this, j, c0105s0);
            }
        });
    }

    public final void a(int i, int i2, int i3, int i4) {
        B b = B.b;
        String message = "Setting web container frame to {(" + i + ", " + i2 + "), (" + i3 + ", " + i4 + ")}";
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.VERBOSE, message);
        a(i, i2);
        b(i3, i4);
    }

    public final void b(boolean z) {
        int indexOfChild = this.z.indexOfChild(this.w);
        boolean z2 = indexOfChild == 0;
        boolean z3 = indexOfChild == this.z.getChildCount() - 1;
        if (z && z2) {
            return;
        }
        if (z || !z3) {
            this.x = null;
            if (indexOfChild >= 0) {
                this.z.removeViewAt(indexOfChild);
            }
            if (z) {
                this.z.addView(this.w, 0);
            } else {
                this.z.addView(this.w);
            }
        }
    }

    public final boolean b(String str, String str2, String str3) {
        C0061h0 c0061h0 = new C0061h0(this.b, str, str2, str3);
        UniWebViewInterface.Companion.getClass();
        C0078l0 a = p3.a(c0061h0);
        if (a == null) {
            return false;
        }
        try {
            return a.b.getBoolean("result");
        } catch (Exception e) {
            B b = B.b;
            String message = "Invalid EmbeddedToolbarItemAction return value for " + this.b + ": " + a.a + ", error: " + e;
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.CRITICAL, message);
            return false;
        }
    }

    public final void d(boolean z) {
        if (this.e == null) {
            Activity activity = this.a;
            String str = this.f;
            if (str == null) {
                str = activity.getResources().getString(R.string.LOADING);
                Intrinsics.checkNotNullExpressionValue(str, "activity.resources.getString(R.string.LOADING)");
            }
            this.e = new s3(activity, str);
        }
        s3 s3Var = this.e;
        if (s3Var != null) {
            s3Var.setCanceledOnTouchOutside(this.c);
        }
        if ((z || this.g) && this.d.getVisibility() == 0) {
            B b = B.b;
            b.getClass();
            Intrinsics.checkNotNullParameter("Show progress dialog.", "message");
            b.a(A.VERBOSE, "Show progress dialog.");
            s3 s3Var2 = this.e;
            if (s3Var2 != null) {
                String message = this.f;
                if (message == null) {
                    message = this.a.getResources().getString(R.string.LOADING);
                    Intrinsics.checkNotNullExpressionValue(message, "activity.resources.getString(R.string.LOADING)");
                }
                Intrinsics.checkNotNullParameter(message, "message");
                TextView textView = s3Var2.a;
                if (textView != null) {
                    textView.setText(message);
                }
            }
            s3 s3Var3 = this.e;
            if (s3Var3 != null) {
                s3Var3.show();
            }
        }
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.q3
    public final void a(v3 payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        JSONObject jSONObject = payload.d;
        String string = jSONObject != null ? jSONObject.getString("failingURL") : null;
        B b = B.b;
        String message = "onReceivedError. URL: " + string + ", error code: " + payload.b + ", description: " + payload.c;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.CRITICAL, message);
        C0133z0 c0133z0 = this.w;
        a aVar = this.v;
        boolean z = true;
        boolean z2 = aVar.f() != null || aVar.canGoBack();
        a aVar2 = this.v;
        a f = aVar2.f();
        if (!(f != null ? f.canGoForward() : false) && !aVar2.canGoForward()) {
            z = false;
        }
        c0133z0.a(z2, z);
        this.h = false;
        a(false);
        this.v.a(H3.PageErrorReceived, payload);
    }

    public final void b() {
        Object systemService = this.a.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.v.getWindowToken(), 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
    
        if (r4 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0105s0 c0105s0) {
        boolean startBitmapStream;
        Rect rect = c0105s0.c;
        if (rect == null) {
            Pair pair = new Pair(Integer.valueOf((int) (this.z.getWidth() * this.z.getScaleX())), Integer.valueOf((int) (this.z.getHeight() * this.z.getScaleY())));
            rect = new Rect(0, 0, ((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue());
        }
        int width = rect.width();
        int height = rect.height();
        Bitmap bitmap = null;
        if (width <= 0 || height <= 0) {
            B b = B.b;
            String message = "Skip snapshot texture stream capture due to invalid size: width=" + rect.width() + ", height=" + rect.height();
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.INFO, message);
            rect = null;
        }
        if (rect == null) {
            return;
        }
        Bitmap bitmap2 = c0105s0.d;
        if (bitmap2 != null) {
            if (!bitmap2.isRecycled() && bitmap2.getWidth() == rect.width() && bitmap2.getHeight() == rect.height()) {
                bitmap = bitmap2;
            }
        }
        Bitmap bitmap3 = c0105s0.d;
        if (bitmap3 != null) {
            bitmap3.recycle();
        }
        bitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        c0105s0.d = bitmap;
        Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(bounds.widt…bitmap = it\n            }");
        Bitmap bitmap4 = bitmap;
        bitmap4.eraseColor(0);
        Canvas canvas = new Canvas(bitmap4);
        canvas.translate(-rect.left, -rect.top);
        this.z.draw(canvas);
        if (c0105s0.e) {
            startBitmapStream = true;
        } else {
            startBitmapStream = UniWebViewNativeTexture.INSTANCE.startBitmapStream(this.b, c0105s0.a, rect.width(), rect.height(), c0105s0.b);
            c0105s0.e = startBitmapStream;
        }
        if (startBitmapStream) {
            UniWebViewNativeTexture.INSTANCE.uploadBitmapFrame(this.b, c0105s0.a, c0105s0.b, bitmap4);
        }
    }

    public static final void a(final d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.v;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "(function() {\n          if (window.__uvTransparencyBridgeInstalled) {\n            return;\n          }\n          window.__uvTransparencyBridgeInstalled = true;\n        \n          var MASK_ATTR = 'data-uv-transparency';\n          var MODE_OPAQUE = 'opaque';\n          var scheduled = false;\n        \n          function postPayload(payload) {\n            var bridge = window['%s'];\n            if (!bridge || typeof bridge.postMessage !== 'function') {\n              return;\n            }\n            try {\n              bridge.postMessage(JSON.stringify(payload));\n            } catch (error) {\n              console.error('UniWebView transparency payload failed:', error);\n            }\n          }\n        \n          function isElementVisible(element) {\n            var rect = element.getBoundingClientRect();\n            if (!rect || rect.width === 0 || rect.height === 0) {\n              return false;\n            }\n\n            // Check if element is within viewport bounds\n            var viewportWidth = window.innerWidth || document.documentElement.clientWidth;\n            var viewportHeight = window.innerHeight || document.documentElement.clientHeight;\n\n            // Element is completely outside viewport\n            if (rect.bottom < 0 || rect.top > viewportHeight ||\n                rect.right < 0 || rect.left > viewportWidth) {\n              return false;\n            }\n\n            // Check if element is visible in parent containers\n            var parent = element.parentElement;\n            while (parent && parent !== document.body) {\n              var parentRect = parent.getBoundingClientRect();\n              var parentStyle = window.getComputedStyle(parent);\n\n              // If parent has overflow hidden/auto/scroll, check if element is within parent's visible area\n              if (parentStyle.overflow !== 'visible' &&\n                  parentStyle.overflow !== '' &&\n                  parentStyle.overflow !== 'unset') {\n\n                // Check if element is outside parent's visible bounds\n                if (rect.bottom < parentRect.top || rect.top > parentRect.bottom ||\n                    rect.right < parentRect.left || rect.left > parentRect.right) {\n                  return false;\n                }\n              }\n              parent = parent.parentElement;\n            }\n\n            return true;\n          }\n\n          function collect() {\n            scheduled = false;\n            var nodes = document.querySelectorAll('[' + MASK_ATTR + ']');\n            var regions = [];\n            for (var i = 0; i < nodes.length; i += 1) {\n              var node = nodes[i];\n              if (node.getAttribute(MASK_ATTR) !== MODE_OPAQUE) {\n                continue;\n              }\n              if (!isElementVisible(node)) {\n                continue;\n              }\n              var rect = node.getBoundingClientRect();\n              regions.push({\n                mode: MODE_OPAQUE,\n                x: rect.left,\n                y: rect.top,\n                width: rect.width,\n                height: rect.height\n              });\n            }\n        \n            postPayload({\n              type: 'update',\n              timestamp: Date.now(),\n              regions: regions,\n              viewportWidth: window.innerWidth,\n              viewportHeight: window.innerHeight,\n              scale: window.devicePixelRatio || 1\n            });\n          }\n        \n          function schedule() {\n            if (scheduled) {\n              return;\n            }\n            scheduled = true;\n            requestAnimationFrame(collect);\n          }\n        \n          document.addEventListener('DOMContentLoaded', collect);\n          window.addEventListener('load', collect);\n          window.addEventListener('resize', schedule);\n          window.addEventListener('scroll', schedule, true);\n        \n          if (typeof MutationObserver !== 'undefined') {\n            var observer = new MutationObserver(schedule);\n            observer.observe(document.documentElement, { attributes: true, childList: true, subtree: true });\n          }\n        \n          window.__uv_transparency_collect = collect;\n          collect();\n        })();", Arrays.copyOf(new Object[]{"UniWebViewTransparencyBridge"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        aVar.evaluateJavascript(format, new ValueCallback() { // from class: com.onevcat.uniwebview.d$$ExternalSyntheticLambda5
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                d.a(d.this, (String) obj);
            }
        });
    }

    public static final void a(d this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null && !Intrinsics.areEqual(str, "null")) {
            B b = B.b;
            String message = "Transparency script injected successfully for " + this$0.b;
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.VERBOSE, message);
            return;
        }
        B b2 = B.b;
        String message2 = "Failed to inject transparency script for " + this$0.b;
        b2.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        b2.a(A.CRITICAL, message2);
    }

    public static final void a(String str, d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray optJSONArray = jSONObject.optJSONArray("regions");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            float optDouble = (float) jSONObject.optDouble("scale", this$0.v.getScale());
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && Intrinsics.areEqual(optJSONObject.optString("mode"), "opaque")) {
                    float optDouble2 = (float) optJSONObject.optDouble("x", 0.0d);
                    float optDouble3 = (float) optJSONObject.optDouble("y", 0.0d);
                    arrayList.add(new RectF(optDouble2, optDouble3, ((float) optJSONObject.optDouble("width", 0.0d)) + optDouble2, ((float) optJSONObject.optDouble("height", 0.0d)) + optDouble3));
                }
            }
            if (optDouble <= 0.0f) {
                float scale = this$0.v.getScale();
                Float valueOf = Float.valueOf(scale);
                if (scale <= 0.0f) {
                    valueOf = null;
                }
                optDouble = valueOf != null ? valueOf.floatValue() : this$0.v.getResources().getDisplayMetrics().density;
            }
            this$0.a(arrayList, optDouble);
        } catch (Exception e) {
            B b = B.b;
            String message = "Failed to parse transparency mask payload: " + str + ", error: " + e;
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.CRITICAL, message);
        }
    }

    public final void a(List list, float f) {
        List list2;
        String joinToString$default;
        this.s = new C0109t0(list, f);
        if (list.isEmpty()) {
            joinToString$default = "[]";
            list2 = list;
        } else {
            list2 = list;
            joinToString$default = CollectionsKt.joinToString$default(list2, null, "[", "]", 0, null, C0121w0.a, 25, null);
        }
        B b = B.b;
        StringBuilder append = new StringBuilder("Transparency mask updated for ").append(this.b).append(": count=").append(list2.size()).append(", scale=");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        String message = append.append(format).append(", rects=").append(joinToString$default).toString();
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.DEBUG, message);
    }

    public static final boolean a(d this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return !this$0.j;
    }

    public final boolean a(float f, float f2) {
        double radians = Math.toRadians(-this.z.getRotation());
        double width = f - ((this.z.getWidth() / 2.0f) + AbstractC0060h.a(this.z).x);
        double height = f2 - ((this.z.getHeight() / 2.0f) + AbstractC0060h.a(this.z).y);
        float cos = (float) ((Math.cos(radians) * width) - (Math.sin(radians) * height));
        float cos2 = (float) ((Math.cos(radians) * height) + (Math.sin(radians) * width));
        float scaleX = ((this.z.getScaleX() * this.z.getWidth()) / 2.0f) + cos;
        float scaleY = ((this.z.getScaleY() * this.z.getHeight()) / 2.0f) + cos2;
        if (scaleX < 0.0f) {
            return false;
        }
        if (scaleX > this.z.getScaleX() * this.z.getWidth() || scaleY < 0.0f) {
            return false;
        }
        return scaleY <= this.z.getScaleY() * ((float) this.z.getHeight());
    }

    public final void a(float f, float f2, float f3) {
        this.z.setRotation(f);
        this.z.setScaleX(f2);
        this.z.setScaleY(f3);
        f();
    }

    public final void a(int i, int i2) {
        this.q = new Point(i, i2);
        this.d.setX(-(B ? 0.0f : 10000.0f));
        this.d.setY(-(B ? 0.0f : 10000.0f));
        float f = i;
        float f2 = i2;
        w3 view = this.z;
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z = B;
        Point point = new Point((int) (f + (z ? 0.0f : 10000.0f)), (int) (f2 + (z ? 0.0f : 10000.0f)));
        view.setX(point.x);
        view.setY(point.y);
        f();
    }

    public final boolean a(final boolean z, boolean z2, int i, float f, final String identifier) {
        int i2;
        AlphaAnimation alphaAnimation;
        int i3;
        TranslateAnimation translateAnimation;
        int i4;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        int i5 = 0;
        if (this.v.get_webChromeClient$uniwebview_release().f) {
            FrameLayout frameLayout = A;
            if (frameLayout != null) {
                frameLayout.setVisibility(z ? 0 : 4);
            }
            return true;
        }
        boolean z3 = this.d.getVisibility() == 0;
        if (z3 && z) {
            B b = B.b;
            b.getClass();
            Intrinsics.checkNotNullParameter("Showing web view is ignored since it is already visible.", "message");
            b.a(A.CRITICAL, "Showing web view is ignored since it is already visible.");
            return false;
        }
        if (!z3 && !z) {
            B b2 = B.b;
            b2.getClass();
            Intrinsics.checkNotNullParameter("Hiding web view is ignored since it is already invisible.", "message");
            b2.a(A.CRITICAL, "Hiding web view is ignored since it is already invisible.");
            return false;
        }
        if (this.i != null) {
            B b3 = B.b;
            b3.getClass();
            Intrinsics.checkNotNullParameter("Trying to show or hide web view but an other transition animation is not finished yet. Ignore this one.", "message");
            b3.a(A.CRITICAL, "Trying to show or hide web view but an other transition animation is not finished yet. Ignore this one.");
            return false;
        }
        if (z) {
            this.d.setVisibility(0);
            if (this.h) {
                d(false);
            }
        } else {
            b();
            a(false);
        }
        this.d.requestLayout();
        int[] iArr = new int[5];
        System.arraycopy(AbstractC0035c.a, 0, iArr, 0, 5);
        int i6 = 0;
        while (true) {
            if (i6 >= 5) {
                i2 = 0;
                break;
            }
            i2 = iArr[i6];
            if (AbstractC0035c.a(i2) == i) {
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
            w3 w3Var = this.z;
            if (z2) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(z ? 0.0f : w3Var.getAlpha(), z ? 1.0f : 0.0f);
                alphaAnimation2.setFillAfter(true);
                alphaAnimation2.setDuration(j);
                alphaAnimation = alphaAnimation2;
            } else {
                alphaAnimation = null;
            }
            if (alphaAnimation != null) {
                animationSet.addAnimation(alphaAnimation);
            }
            WindowMetrics currentWindowMetrics = this.a.getWindow().getWindowManager().getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "activity.window.windowManager.currentWindowMetrics");
            Rect bounds = currentWindowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "metrics.bounds");
            Point point = new Point(bounds.width(), bounds.height());
            int a = AbstractC0035c.a(i2);
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
            } else if (!z) {
                translateAnimation = new TranslateAnimation(0.0f, i3, 0.0f, i5);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            translateAnimation.setFillAfter(true);
            translateAnimation.setDuration(j);
            animationSet.addAnimation(translateAnimation);
            this.i = animationSet;
            animationSet.setAnimationListener(new AnimationAnimationListenerC0117v0(this, z, identifier));
            w3Var.clearAnimation();
            w3Var.startAnimation(animationSet);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.onevcat.uniwebview.d$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    d.a(d.this, z, identifier);
                }
            }, 1L);
        }
        return true;
    }

    public static final void a(d this$0, boolean z, String identifier) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        this$0.a(identifier, z);
    }

    public final void a(String parameters, boolean z) {
        if (z) {
            a aVar = this.v;
            H3 method = H3.ShowTransitionFinished;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            aVar.j.a(method, parameters);
            return;
        }
        this.d.setVisibility(4);
        a aVar2 = this.v;
        H3 method2 = H3.HideTransitionFinished;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(method2, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        aVar2.j.a(method2, parameters);
    }

    public final boolean a(int i, int i2, int i3, int i4, float f, float f2, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.i != null) {
            B b = B.b;
            b.getClass();
            Intrinsics.checkNotNullParameter("Trying to animate web view but an other transition animation is not finished yet. Ignore this one.", "message");
            b.a(A.CRITICAL, "Trying to animate web view but an other transition animation is not finished yet. Ignore this one.");
            return false;
        }
        float f3 = 1000;
        long j = (long) (f * f3);
        long j2 = (long) (f3 * f2);
        AnimationSet animationSet = new AnimationSet(false);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, i - this.d.getX(), 0.0f, i2 - this.d.getY());
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(j);
        translateAnimation.setStartOffset(j2);
        animationSet.addAnimation(translateAnimation);
        w3 w3Var = this.z;
        E e = new E(w3Var, w3Var.getWidth(), i3, this.z.getHeight(), i4);
        e.setFillAfter(true);
        e.setDuration(j);
        e.setStartOffset(j2);
        animationSet.addAnimation(e);
        animationSet.setAnimationListener(new AnimationAnimationListenerC0113u0(this, i, i2, i3, i4, identifier));
        this.d.startAnimation(animationSet);
        return true;
    }

    public final void a(long j) {
        Bitmap bitmap;
        C0105s0 c0105s0 = (C0105s0) this.o.remove(Long.valueOf(j));
        if (c0105s0 != null && (bitmap = c0105s0.d) != null) {
            bitmap.recycle();
        }
        UniWebViewNativeTexture.INSTANCE.stopBitmapStream(this.b, j);
    }

    public static final void a(d this$0, long j, C0105s0 state) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(state, "$state");
        C0105s0 c0105s0 = (C0105s0) this$0.o.get(Long.valueOf(j));
        if (c0105s0 == state && c0105s0.b == state.b) {
            try {
                this$0.a(c0105s0);
            } finally {
                c0105s0.f = false;
            }
        }
    }

    public final Bitmap a(Rect rect) {
        if (rect == null) {
            Pair pair = new Pair(Integer.valueOf((int) (this.z.getWidth() * this.z.getScaleX())), Integer.valueOf((int) (this.z.getHeight() * this.z.getScaleY())));
            rect = new Rect(0, 0, ((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue());
        }
        int width = rect.width();
        int height = rect.height();
        if (width > 0 && height > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(snapshotWid… Bitmap.Config.ARGB_8888)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-rect.left, -rect.top);
            this.z.draw(canvas);
            return createBitmap;
        }
        B b = B.b;
        String message = "Skip snapshot capture due to invalid size: width=" + width + ", height=" + height;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        return null;
    }

    public final void a(float f) {
        float coerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        this.z.setAlpha(coerceIn);
        this.y.setAlpha(coerceIn);
        this.d.setAlpha(1.0f);
    }

    public final void a(boolean z) {
        s3 s3Var;
        if ((z || this.g) && (s3Var = this.e) != null && s3Var.isShowing()) {
            B b = B.b;
            b.getClass();
            Intrinsics.checkNotNullParameter("Hide progress dialog.", "message");
            b.a(A.VERBOSE, "Hide progress dialog.");
            s3 s3Var2 = this.e;
            if (s3Var2 != null) {
                s3Var2.dismiss();
            }
        }
    }

    @Override // com.onevcat.uniwebview.internal.obfuscated.q3
    public final void a() {
        this.h = false;
        a(false);
        a aVar = this.v;
        H3 method = H3.WebContentProcessDidTerminate;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter("", "parameters");
        aVar.j.a(method, "");
    }

    public final void a(String identifier, String gesture, String str) {
        String url;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(gesture, "gesture");
        if (b(identifier, gesture, str)) {
            return;
        }
        if (Intrinsics.areEqual(gesture, "tap")) {
            this.v.a(0, 0, true);
            return;
        }
        if (!Intrinsics.areEqual(gesture, "longPress") || (url = this.v.getUrl()) == null) {
            return;
        }
        Object systemService = this.a.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
        if (str == null || str.length() == 0) {
            str = "URL copied";
        }
        Toast.makeText(this.a, str, 0).show();
    }
}
