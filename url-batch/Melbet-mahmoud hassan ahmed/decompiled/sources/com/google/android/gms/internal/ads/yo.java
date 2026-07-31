package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
/* loaded from: classes.dex */
public final class yo extends Thread {

    /* renamed from: f, reason: collision with root package name */
    private boolean f14747f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14748g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f14749h;

    /* renamed from: i, reason: collision with root package name */
    private final po f14750i;

    /* renamed from: j, reason: collision with root package name */
    private final int f14751j;

    /* renamed from: k, reason: collision with root package name */
    private final int f14752k;

    /* renamed from: l, reason: collision with root package name */
    private final int f14753l;

    /* renamed from: m, reason: collision with root package name */
    private final int f14754m;

    /* renamed from: n, reason: collision with root package name */
    private final int f14755n;

    /* renamed from: o, reason: collision with root package name */
    private final int f14756o;

    /* renamed from: p, reason: collision with root package name */
    private final int f14757p;

    /* renamed from: q, reason: collision with root package name */
    private final int f14758q;

    /* renamed from: r, reason: collision with root package name */
    private final String f14759r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f14760s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f14761t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f14762u;

    public yo() {
        po poVar = new po();
        this.f14747f = false;
        this.f14748g = false;
        this.f14750i = poVar;
        this.f14749h = new Object();
        this.f14752k = u20.f12588d.e().intValue();
        this.f14753l = u20.f12585a.e().intValue();
        this.f14754m = u20.f12589e.e().intValue();
        this.f14755n = u20.f12587c.e().intValue();
        this.f14756o = ((Integer) sw.c().b(m10.N)).intValue();
        this.f14757p = ((Integer) sw.c().b(m10.O)).intValue();
        this.f14758q = ((Integer) sw.c().b(m10.P)).intValue();
        this.f14751j = u20.f12590f.e().intValue();
        this.f14759r = (String) sw.c().b(m10.R);
        this.f14760s = ((Boolean) sw.c().b(m10.S)).booleanValue();
        this.f14761t = ((Boolean) sw.c().b(m10.T)).booleanValue();
        this.f14762u = ((Boolean) sw.c().b(m10.U)).booleanValue();
        setName("ContentFetchTask");
    }

    public final oo a() {
        return this.f14750i.a(this.f14762u);
    }

    final xo b(View view, oo ooVar) {
        if (view == null) {
            return new xo(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new xo(this, 0, 0);
            }
            ooVar.k(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new xo(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof eu0)) {
            WebView webView = (WebView) view;
            if (!v3.l.e()) {
                return new xo(this, 0, 0);
            }
            ooVar.h();
            webView.post(new wo(this, ooVar, webView, globalVisibleRect));
            return new xo(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new xo(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            xo b7 = b(viewGroup.getChildAt(i9), ooVar);
            i7 += b7.f14275a;
            i8 += b7.f14276b;
        }
        return new xo(this, i7, i8);
    }

    final void c(View view) {
        try {
            oo ooVar = new oo(this.f14752k, this.f14753l, this.f14754m, this.f14755n, this.f14756o, this.f14757p, this.f14758q, this.f14761t);
            Context b7 = y2.t.c().b();
            if (b7 != null && !TextUtils.isEmpty(this.f14759r)) {
                String str = (String) view.getTag(b7.getResources().getIdentifier((String) sw.c().b(m10.Q), "id", b7.getPackageName()));
                if (str != null && str.equals(this.f14759r)) {
                    return;
                }
            }
            xo b8 = b(view, ooVar);
            ooVar.m();
            if (b8.f14275a == 0 && b8.f14276b == 0) {
                return;
            }
            if (b8.f14276b == 0 && ooVar.c() == 0) {
                return;
            }
            if (b8.f14276b == 0 && this.f14750i.d(ooVar)) {
                return;
            }
            this.f14750i.b(ooVar);
        } catch (Exception e7) {
            io0.e("Exception in fetchContentOnUIThread", e7);
            y2.t.p().s(e7, "ContentFetchTask.fetchContent");
        }
    }

    final void d(oo ooVar, WebView webView, String str, boolean z6) {
        ooVar.g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f14760s || TextUtils.isEmpty(webView.getTitle())) {
                    ooVar.l(optString, z6, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    ooVar.l(sb.toString(), z6, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (ooVar.o()) {
                this.f14750i.c(ooVar);
            }
        } catch (JSONException unused) {
            io0.b("Json string may be malformed.");
        } catch (Throwable th) {
            io0.c("Failed to get webview content.", th);
            y2.t.p().s(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void e() {
        synchronized (this.f14749h) {
            if (this.f14747f) {
                io0.b("Content hash thread already started, quiting...");
            } else {
                this.f14747f = true;
                start();
            }
        }
    }

    public final void f() {
        synchronized (this.f14749h) {
            this.f14748g = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            io0.b(sb.toString());
        }
    }

    public final void g() {
        synchronized (this.f14749h) {
            this.f14748g = false;
            this.f14749h.notifyAll();
            io0.b("ContentFetchThread: wakeup");
        }
    }

    public final boolean h() {
        return this.f14748g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        com.google.android.gms.internal.ads.io0.e("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        com.google.android.gms.internal.ads.io0.e("Error in ContentFetchTask", r0);
        y2.t.p().s(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0042, code lost:
    
        if (r3.importance != 100) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0052, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005a, code lost:
    
        r0 = y2.t.c().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0062, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        com.google.android.gms.internal.ads.io0.b("ContentFetchThread: no activity. Sleeping.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0072, code lost:
    
        if (r0.getWindow() == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007c, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x007e, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008f, code lost:
    
        y2.t.p().s(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.io0.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00da A[EXC_TOP_SPLITTER, LOOP:1: B:10:0x00da->B:17:0x00da, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        View view;
        while (true) {
            try {
                Context b7 = y2.t.c().b();
                if (b7 != null) {
                    ActivityManager activityManager = (ActivityManager) b7.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) b7.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                y2.t.p().s(th, "ContentFetchTask.isInForeground");
            }
            io0.b("ContentFetchTask: sleeping");
            f();
            Thread.sleep(this.f14751j * 1000);
            synchronized (this.f14749h) {
                while (this.f14748g) {
                    try {
                        io0.b("ContentFetchTask: waiting");
                        this.f14749h.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new uo(this, view));
        }
        Thread.sleep(this.f14751j * 1000);
        synchronized (this.f14749h) {
        }
    }
}
