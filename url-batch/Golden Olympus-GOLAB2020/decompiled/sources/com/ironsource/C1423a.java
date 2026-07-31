package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1423a extends Thread {

    /* renamed from: l, reason: collision with root package name */
    private static final int f14952l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final InterfaceC1430b f14953m = new C0145a();

    /* renamed from: n, reason: collision with root package name */
    private static final zi f14954n = new b();

    /* renamed from: d, reason: collision with root package name */
    private final int f14958d;

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1430b f14955a = f14953m;

    /* renamed from: b, reason: collision with root package name */
    private zi f14956b = f14954n;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f14957c = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private String f14959e = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f14960f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14961g = false;

    /* renamed from: h, reason: collision with root package name */
    private volatile int f14962h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f14963i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f14964j = 0;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f14965k = new c();

    /* renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    class C0145a implements InterfaceC1430b {
        C0145a() {
        }

        @Override // com.ironsource.InterfaceC1430b
        public void a() {
        }

        @Override // com.ironsource.InterfaceC1430b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* renamed from: com.ironsource.a$b */
    class b implements zi {
        b() {
        }

        @Override // com.ironsource.zi
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* renamed from: com.ironsource.a$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1423a c1423a = C1423a.this;
            c1423a.f14962h = (c1423a.f14962h + 1) % Integer.MAX_VALUE;
        }
    }

    public C1423a(int i4) {
        this.f14958d = i4;
    }

    public int a() {
        return this.f14964j;
    }

    public int b() {
        return this.f14963i;
    }

    public C1423a c() {
        this.f14959e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i4 = -1;
        while (!isInterrupted() && this.f14964j < this.f14963i) {
            int i5 = this.f14962h;
            this.f14957c.post(this.f14965k);
            try {
                Thread.sleep(this.f14958d);
                if (this.f14962h != i5) {
                    this.f14964j = 0;
                } else if (this.f14961g || !Debug.isDebuggerConnected()) {
                    this.f14964j++;
                    this.f14955a.a();
                    String str = o9.f18496l;
                    if (str != null && !str.trim().isEmpty()) {
                        new lc(o9.f18496l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.f14962h != i4) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i4 = this.f14962h;
                }
            } catch (InterruptedException e4) {
                this.f14956b.a(e4);
                return;
            }
        }
        if (this.f14964j >= this.f14963i) {
            this.f14955a.b();
        }
    }

    public C1423a b(boolean z4) {
        this.f14960f = z4;
        return this;
    }

    public C1423a a(InterfaceC1430b interfaceC1430b) {
        if (interfaceC1430b == null) {
            this.f14955a = f14953m;
            return this;
        }
        this.f14955a = interfaceC1430b;
        return this;
    }

    public C1423a a(zi ziVar) {
        if (ziVar == null) {
            this.f14956b = f14954n;
            return this;
        }
        this.f14956b = ziVar;
        return this;
    }

    public C1423a a(String str) {
        if (str == null) {
            str = "";
        }
        this.f14959e = str;
        return this;
    }

    public C1423a a(boolean z4) {
        this.f14961g = z4;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }

    public void a(int i4) {
        this.f14963i = i4;
    }
}
