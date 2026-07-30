package C0;

import A0.i;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import x0.C0997d;

/* loaded from: classes.dex */
public final class c implements B0.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f274a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.b f275b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f276c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f277d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f278e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f279f;

    public c(WindowLayoutComponent component, l4.b consumerAdapter) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        this.f274a = component;
        this.f275b = consumerAdapter;
        this.f276c = new ReentrantLock();
        this.f277d = new LinkedHashMap();
        this.f278e = new LinkedHashMap();
        this.f279f = new LinkedHashMap();
    }

    @Override // B0.a
    public final void a(i listener) {
        LinkedHashMap linkedHashMap = this.f277d;
        LinkedHashMap linkedHashMap2 = this.f278e;
        Intrinsics.checkNotNullParameter(listener, "callback");
        ReentrantLock reentrantLock = this.f276c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(listener);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            f fVar = (f) linkedHashMap.get(context);
            if (fVar == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = fVar.f287d;
            Intrinsics.checkNotNullParameter(listener, "listener");
            ReentrantLock reentrantLock2 = fVar.f285b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(listener);
                reentrantLock2.unlock();
                linkedHashMap2.remove(listener);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    C0997d c0997d = (C0997d) this.f279f.remove(fVar);
                    if (c0997d != null) {
                        c0997d.f8298a.invoke(c0997d.f8299b, c0997d.f8300c);
                    }
                }
                Unit unit = Unit.f6114a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // B0.a
    public final void b(Context context, e0.c executor, i callback) {
        Unit unit;
        LinkedHashMap linkedHashMap = this.f277d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f276c;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f278e;
            if (fVar != null) {
                fVar.b(callback);
                linkedHashMap2.put(callback, context);
                unit = Unit.f6114a;
            } else {
                unit = null;
            }
            if (unit == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(callback, context);
                fVar2.b(callback);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(A.f6115d));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f279f.put(fVar2, this.f275b.q(this.f274a, E.a(WindowLayoutInfo.class), (Activity) context, new b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            Unit unit2 = Unit.f6114a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
