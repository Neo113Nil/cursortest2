package n6;

import android.database.Observable;

/* loaded from: classes5.dex */
public class e extends Observable {
    public void notifyChanged() {
        synchronized (((Observable) this).mObservers) {
            try {
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((f) ((Observable) this).mObservers.get(size)).onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
