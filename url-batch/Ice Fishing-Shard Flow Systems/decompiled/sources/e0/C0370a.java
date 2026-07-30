package e0;

import D6.z;
import P0.s;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.C0258y;
import h4.AbstractActivityC0488c;
import h4.C0492g;
import i.C0511M;
import i4.AbstractC0549e;
import i4.C0547c;
import io.flutter.plugin.platform.t;
import io.flutter.plugin.platform.u;
import j4.C0573b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import m4.C0690c;
import p4.InterfaceC0828a;
import s4.q;
import s4.w;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4666a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4667b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4668c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4669d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4670e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f4671f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4672g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4673h;

    public C0370a(Context context, C0547c c0547c, C0690c c0690c) {
        this.f4667b = new HashMap();
        this.f4671f = new HashMap();
        this.f4666a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f4668c = c0547c;
        this.f4669d = c0690c;
        this.f4670e = new o4.b(context, c0547c, c0547c.f5503c, c0547c.f5518s.f5753d, new C0511M(1, c0690c));
    }

    public void a(o4.c cVar) {
        HashMap hashMap = (HashMap) this.f4667b;
        A4.a.d("FlutterEngineConnectionRegistry#add ".concat(cVar.getClass().getSimpleName()));
        try {
            if (hashMap.containsKey(cVar.getClass())) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + cVar + ") but it was already registered with this FlutterEngine (" + ((C0547c) this.f4668c) + ").");
                Trace.endSection();
                return;
            }
            cVar.toString();
            hashMap.put(cVar.getClass(), cVar);
            cVar.onAttachedToEngine((o4.b) this.f4670e);
            if (cVar instanceof InterfaceC0828a) {
                InterfaceC0828a interfaceC0828a = (InterfaceC0828a) cVar;
                ((HashMap) this.f4671f).put(cVar.getClass(), interfaceC0828a);
                if (f()) {
                    interfaceC0828a.onAttachedToActivity((z) this.f4673h);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void b(AbstractActivityC0488c abstractActivityC0488c, C0258y c0258y) {
        this.f4673h = new z(abstractActivityC0488c, c0258y);
        Intent intent = abstractActivityC0488c.getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("enable-software-rendering", false) : false;
        if (booleanExtra) {
            String str = AbstractC0549e.f5534h.f5525b;
        } else {
            booleanExtra = ((C0690c) this.f4669d).f6534a;
        }
        C0547c c0547c = (C0547c) this.f4668c;
        c0547c.f5518s.f5751D = booleanExtra;
        s sVar = c0547c.f5520u;
        io.flutter.embedding.engine.renderer.j jVar = c0547c.f5502b;
        C0573b c0573b = c0547c.f5503c;
        u uVar = (u) sVar.f2251d;
        if (uVar.f5755i != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        uVar.f5755i = abstractActivityC0488c;
        uVar.f5758n = jVar;
        s sVar2 = new s();
        C0511M c0511m = new C0511M(12, sVar2);
        q qVar = new q(c0573b, "flutter/platform_views", w.f7775a);
        sVar2.f2251d = qVar;
        qVar.b(c0511m);
        uVar.f5760p = sVar2;
        t tVar = (t) sVar.f2252e;
        if (tVar.f5732i != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        tVar.f5732i = abstractActivityC0488c;
        P0.l lVar = new P0.l(c0573b, 10);
        tVar.f5736o = lVar;
        lVar.f2210i = tVar.f5746y;
        uVar.f5760p.f2252e = sVar;
        for (InterfaceC0828a interfaceC0828a : ((HashMap) this.f4671f).values()) {
            if (this.f4666a) {
                interfaceC0828a.onReattachedToActivityForConfigChanges((z) this.f4673h);
            } else {
                interfaceC0828a.onAttachedToActivity((z) this.f4673h);
            }
        }
        this.f4666a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        A4.a.d("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f4671f).values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0828a) it.next()).onDetachedFromActivity();
            }
            d();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void d() {
        C0547c c0547c = (C0547c) this.f4668c;
        u uVar = c0547c.f5518s;
        s sVar = uVar.f5760p;
        if (sVar != null) {
            sVar.f2252e = null;
        }
        uVar.c();
        uVar.f5760p = null;
        uVar.f5755i = null;
        uVar.f5758n = null;
        t tVar = c0547c.f5519t;
        P0.l lVar = tVar.f5736o;
        if (lVar != null) {
            lVar.f2210i = null;
        }
        Surface surface = tVar.f5743v;
        if (surface != null) {
            surface.release();
            tVar.f5743v = null;
            tVar.f5744w = null;
        }
        tVar.f5736o = null;
        tVar.f5732i = null;
        this.f4672g = null;
        this.f4673h = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((C0492g) this.f4672g) != null;
    }

    public FileInputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((d) this.f4668c).l();
            return null;
        }
    }

    public void h(int i2, Serializable serializable) {
        ((Executor) this.f4667b).execute(new d.l(i2, 2, this, serializable));
    }

    public C0370a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.f4666a = false;
        this.f4667b = executor;
        this.f4668c = dVar;
        this.f4672g = str;
        this.f4671f = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = e.f4691h;
                    break;
                case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                    bArr = e.f4690g;
                    break;
                case 27:
                    bArr = e.f4689f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f4688e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e.f4687d;
                    break;
            }
        }
        this.f4669d = bArr;
    }
}
