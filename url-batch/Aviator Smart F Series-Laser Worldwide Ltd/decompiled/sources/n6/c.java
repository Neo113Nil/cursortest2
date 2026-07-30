package n6;

import android.database.Observable;

/* loaded from: classes5.dex */
public class c extends Observable {
    public void notifyAdd(boolean z7, Object obj, Object obj2) {
        synchronized (((Observable) this).mObservers) {
            try {
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((d) ((Observable) this).mObservers.get(size)).onAdd(z7, obj, obj2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyChanged() {
        synchronized (((Observable) this).mObservers) {
            try {
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((d) ((Observable) this).mObservers.get(size)).onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyRemove(boolean z7, Object obj) {
        synchronized (((Observable) this).mObservers) {
            try {
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((d) ((Observable) this).mObservers.get(size)).onRemove(z7, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
