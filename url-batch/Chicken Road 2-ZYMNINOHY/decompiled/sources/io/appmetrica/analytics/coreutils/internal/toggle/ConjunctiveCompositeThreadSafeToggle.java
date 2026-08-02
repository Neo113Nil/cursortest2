package io.appmetrica.analytics.coreutils.internal.toggle;

import O3.l;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public final class ConjunctiveCompositeThreadSafeToggle implements Toggle {

    /* renamed from: c, reason: collision with root package name */
    private final String f9790c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f9792e;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f9788a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f9789b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ReentrantLock f9791d = new ReentrantLock();

    public ConjunctiveCompositeThreadSafeToggle(List<? extends Toggle> list, String str) {
        this.f9790c = "[ConjunctiveCompositeToggle-" + str + ']';
        try {
            access$acquireLock(this);
            for (final Toggle toggle : list) {
                ToggleObserver toggleObserver = new ToggleObserver() { // from class: io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle$1$1$observer$1
                    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
                    public void onStateChanged(boolean z) {
                        ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle = ConjunctiveCompositeThreadSafeToggle.this;
                        Toggle toggle2 = toggle;
                        try {
                            ConjunctiveCompositeThreadSafeToggle.access$acquireLock(conjunctiveCompositeThreadSafeToggle);
                            ConjunctiveCompositeThreadSafeToggle.access$updateState(conjunctiveCompositeThreadSafeToggle, this, z, String.valueOf(q.a(toggle2.getClass()).b()));
                        } finally {
                            ConjunctiveCompositeThreadSafeToggle.access$releaseLock(conjunctiveCompositeThreadSafeToggle);
                        }
                    }
                };
                this.f9789b.put(toggleObserver, Boolean.valueOf(toggle.getActualState()));
                toggle.registerObserver(toggleObserver, false);
            }
            setActualState(a(this.f9789b.values()));
            access$releaseLock(this);
        } catch (Throwable th) {
            access$releaseLock(this);
            throw th;
        }
    }

    private static boolean a(Collection collection) {
        if (collection != null && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void access$acquireLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.getClass();
        boolean z = false;
        while (!z) {
            try {
                z = conjunctiveCompositeThreadSafeToggle.f9791d.tryLock(100L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                l.h(th);
            }
            if (!z) {
                try {
                    Thread.sleep(100L);
                } catch (Throwable th2) {
                    l.h(th2);
                }
            }
        }
    }

    public static final void access$releaseLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.f9791d.unlock();
    }

    public static final void access$updateState(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle, ToggleObserver toggleObserver, boolean z, String str) {
        conjunctiveCompositeThreadSafeToggle.f9789b.put(toggleObserver, Boolean.valueOf(z));
        boolean a3 = a(conjunctiveCompositeThreadSafeToggle.f9789b.values());
        if (a3 != conjunctiveCompositeThreadSafeToggle.getActualState()) {
            conjunctiveCompositeThreadSafeToggle.setActualState(a3);
            ArrayList arrayList = conjunctiveCompositeThreadSafeToggle.f9788a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((ToggleObserver) obj).onStateChanged(a3);
            }
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public boolean getActualState() {
        return this.f9792e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void registerObserver(ToggleObserver toggleObserver, boolean z) {
        try {
            access$acquireLock(this);
            this.f9788a.add(toggleObserver);
            if (z) {
                toggleObserver.onStateChanged(getActualState());
            }
        } finally {
            access$releaseLock(this);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void removeObserver(ToggleObserver toggleObserver) {
        try {
            access$acquireLock(this);
            this.f9788a.remove(toggleObserver);
        } finally {
            access$releaseLock(this);
        }
    }

    public void setActualState(boolean z) {
        this.f9792e = z;
    }

    public String toString() {
        return "ConjunctiveCompositeThreadSafeToggle(toggleStates=" + this.f9789b + ", tag='" + this.f9790c + "', actualState=" + getActualState() + ')';
    }
}
