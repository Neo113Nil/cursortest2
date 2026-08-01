package w;

import E.s;
import U.g;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import m.ExecutorC0069e;
import v.InterfaceC0094a;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098d implements InterfaceC0094a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1298a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1299b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1300c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1301d = new LinkedHashMap();

    public C0098d(WindowLayoutComponent windowLayoutComponent) {
        this.f1298a = windowLayoutComponent;
    }

    @Override // v.InterfaceC0094a
    public final void a(Context context, ExecutorC0069e executorC0069e, s sVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f1299b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1300c;
        try {
            C0100f c0100f = (C0100f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1301d;
            if (c0100f != null) {
                c0100f.b(sVar);
                linkedHashMap2.put(sVar, context);
                gVar = g.f433a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                C0100f c0100f2 = new C0100f(context);
                linkedHashMap.put(context, c0100f2);
                linkedHashMap2.put(sVar, context);
                c0100f2.b(sVar);
                this.f1298a.addWindowLayoutInfoListener(context, c0100f2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // v.InterfaceC0094a
    public final void b(s sVar) {
        ReentrantLock reentrantLock = this.f1299b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1301d;
        try {
            Context context = (Context) linkedHashMap.get(sVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1300c;
            C0100f c0100f = (C0100f) linkedHashMap2.get(context);
            if (c0100f == null) {
                return;
            }
            c0100f.d(sVar);
            linkedHashMap.remove(sVar);
            if (c0100f.c()) {
                linkedHashMap2.remove(context);
                this.f1298a.removeWindowLayoutInfoListener(c0100f);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
