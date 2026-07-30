package n6;

import android.database.Observable;

/* loaded from: classes5.dex */
public class a extends Observable {
    public void notifyChanged() {
        synchronized (((Observable) this).mObservers) {
            try {
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((b) ((Observable) this).mObservers.get(size)).onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyInited() {
        synchronized (((Observable) this).mObservers) {
            try {
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((b) ((Observable) this).mObservers.get(size)).onInited();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifySetListener(int i8) {
        synchronized (((Observable) this).mObservers) {
            try {
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((b) ((Observable) this).mObservers.get(size)).onSetListener(i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
