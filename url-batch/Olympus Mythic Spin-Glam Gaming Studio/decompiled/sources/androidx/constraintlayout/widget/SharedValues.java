package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class SharedValues {
    private SparseIntArray mValues = new SparseIntArray();
    private HashMap mValuesListeners = new HashMap();

    public interface SharedValuesListener {
    }

    public void addListener(int i, SharedValuesListener sharedValuesListener) {
        HashSet hashSet = (HashSet) this.mValuesListeners.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.mValuesListeners.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(sharedValuesListener));
    }

    public void removeListener(int i, SharedValuesListener sharedValuesListener) {
        HashSet hashSet = (HashSet) this.mValuesListeners.get(Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            SharedValuesListener sharedValuesListener2 = (SharedValuesListener) weakReference.get();
            if (sharedValuesListener2 == null || sharedValuesListener2 == sharedValuesListener) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }
}
