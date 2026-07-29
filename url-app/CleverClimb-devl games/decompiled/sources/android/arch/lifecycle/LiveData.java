package android.arch.lifecycle;

import android.arch.lifecycle.c;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    private static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private final Object mDataLock = new Object();
    private android.arch.a.b.b<k<T>, LiveData<T>.b> mObservers = new android.arch.a.b.b<>();
    private int mActiveCount = 0;
    private volatile Object mData = NOT_SET;
    private volatile Object mPendingData = NOT_SET;
    private int mVersion = -1;
    private final Runnable mPostValueRunnable = new Runnable() { // from class: android.arch.lifecycle.LiveData.1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    };

    protected void onActive() {
    }

    protected void onInactive() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void considerNotify(LiveData<T>.b bVar) {
        if (bVar.f1346d) {
            if (!bVar.a()) {
                bVar.a(false);
            } else {
                if (bVar.e >= this.mVersion) {
                    return;
                }
                bVar.e = this.mVersion;
                bVar.f1345c.onChanged(this.mData);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchingValue(LiveData<T>.b bVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (bVar != null) {
                considerNotify(bVar);
                bVar = null;
            } else {
                android.arch.a.b.b<k<T>, LiveData<T>.b>.d c2 = this.mObservers.c();
                while (c2.hasNext()) {
                    considerNotify((b) c2.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public void observe(e eVar, k<T> kVar) {
        if (eVar.getLifecycle().a() == c.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(eVar, kVar);
        LiveData<T>.b a2 = this.mObservers.a(kVar, lifecycleBoundObserver);
        if (a2 != null && !a2.a(eVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a2 != null) {
            return;
        }
        eVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void observeForever(k<T> kVar) {
        a aVar = new a(kVar);
        LiveData<T>.b a2 = this.mObservers.a(kVar, aVar);
        if (a2 != null && (a2 instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a2 != null) {
            return;
        }
        aVar.a(true);
    }

    public void removeObserver(k<T> kVar) {
        assertMainThread("removeObserver");
        LiveData<T>.b b2 = this.mObservers.b(kVar);
        if (b2 == null) {
            return;
        }
        b2.b();
        b2.a(false);
    }

    public void removeObservers(e eVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<k<T>, LiveData<T>.b>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<k<T>, LiveData<T>.b> next = it.next();
            if (next.getValue().a(eVar)) {
                removeObserver(next.getKey());
            }
        }
    }

    protected void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            android.arch.a.a.a.a().b(this.mPostValueRunnable);
        }
    }

    protected void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    public T getValue() {
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    int getVersion() {
        return this.mVersion;
    }

    public boolean hasObservers() {
        return this.mObservers.a() > 0;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    class LifecycleBoundObserver extends LiveData<T>.b implements GenericLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        final e f1342a;

        LifecycleBoundObserver(e eVar, k<T> kVar) {
            super(kVar);
            this.f1342a = eVar;
        }

        @Override // android.arch.lifecycle.LiveData.b
        boolean a() {
            return this.f1342a.getLifecycle().a().a(c.b.STARTED);
        }

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        public void a(e eVar, c.a aVar) {
            if (this.f1342a.getLifecycle().a() == c.b.DESTROYED) {
                LiveData.this.removeObserver(this.f1345c);
            } else {
                a(a());
            }
        }

        @Override // android.arch.lifecycle.LiveData.b
        boolean a(e eVar) {
            return this.f1342a == eVar;
        }

        @Override // android.arch.lifecycle.LiveData.b
        void b() {
            this.f1342a.getLifecycle().b(this);
        }
    }

    private abstract class b {

        /* renamed from: c, reason: collision with root package name */
        final k<T> f1345c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1346d;
        int e = -1;

        abstract boolean a();

        boolean a(e eVar) {
            return false;
        }

        void b() {
        }

        b(k<T> kVar) {
            this.f1345c = kVar;
        }

        void a(boolean z) {
            if (z == this.f1346d) {
                return;
            }
            this.f1346d = z;
            boolean z2 = LiveData.this.mActiveCount == 0;
            LiveData.this.mActiveCount += this.f1346d ? 1 : -1;
            if (z2 && this.f1346d) {
                LiveData.this.onActive();
            }
            if (LiveData.this.mActiveCount == 0 && !this.f1346d) {
                LiveData.this.onInactive();
            }
            if (this.f1346d) {
                LiveData.this.dispatchingValue(this);
            }
        }
    }

    private class a extends LiveData<T>.b {
        @Override // android.arch.lifecycle.LiveData.b
        boolean a() {
            return true;
        }

        a(k<T> kVar) {
            super(kVar);
        }
    }

    private static void assertMainThread(String str) {
        if (android.arch.a.a.a.a().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }
}
