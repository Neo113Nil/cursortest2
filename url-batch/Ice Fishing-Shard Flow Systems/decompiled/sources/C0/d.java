package C0;

import A0.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements B0.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f280a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f281b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f282c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f283d;

    public d(WindowLayoutComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f280a = component;
        this.f281b = new ReentrantLock();
        this.f282c = new LinkedHashMap();
        this.f283d = new LinkedHashMap();
    }

    @Override // B0.a
    public final void a(i listener) {
        LinkedHashMap linkedHashMap = this.f282c;
        LinkedHashMap linkedHashMap2 = this.f283d;
        Intrinsics.checkNotNullParameter(listener, "callback");
        ReentrantLock reentrantLock = this.f281b;
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
                    this.f280a.removeWindowLayoutInfoListener(fVar);
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
        LinkedHashMap linkedHashMap = this.f282c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f281b;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f283d;
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
                this.f280a.addWindowLayoutInfoListener(context, fVar2);
            }
            Unit unit2 = Unit.f6114a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
