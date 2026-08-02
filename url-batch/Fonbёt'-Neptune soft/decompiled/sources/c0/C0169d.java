package c0;

import F0.h;
import a0.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import b0.InterfaceC0164a;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169d implements InterfaceC0164a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1990a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1991b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1992c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1993d = new LinkedHashMap();

    public C0169d(WindowLayoutComponent windowLayoutComponent) {
        this.f1990a = windowLayoutComponent;
    }

    @Override // b0.InterfaceC0164a
    public final void a(Context context, N.d dVar, i iVar) {
        h hVar;
        ReentrantLock reentrantLock = this.f1991b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1992c;
        try {
            C0171f c0171f = (C0171f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1993d;
            if (c0171f != null) {
                c0171f.b(iVar);
                linkedHashMap2.put(iVar, context);
                hVar = h.f469a;
            } else {
                hVar = null;
            }
            if (hVar == null) {
                C0171f c0171f2 = new C0171f(context);
                linkedHashMap.put(context, c0171f2);
                linkedHashMap2.put(iVar, context);
                c0171f2.b(iVar);
                this.f1990a.addWindowLayoutInfoListener(context, c0171f2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // b0.InterfaceC0164a
    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f1991b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1993d;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1992c;
            C0171f c0171f = (C0171f) linkedHashMap2.get(context);
            if (c0171f == null) {
                return;
            }
            c0171f.d(iVar);
            linkedHashMap.remove(iVar);
            if (c0171f.c()) {
                linkedHashMap2.remove(context);
                this.f1990a.removeWindowLayoutInfoListener(c0171f);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
