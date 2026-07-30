package com.google.maps.android.collections;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.MapObjectManager.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class MapObjectManager<O, C extends Collection> {
    protected final GoogleMap mMap;
    private final Map<String, C> mNamedCollections = new HashMap();
    protected final Map<O, C> mAllObjects = new HashMap();

    public class Collection {
        private final Set<O> mObjects = new LinkedHashSet();

        public Collection() {
        }

        protected void add(O o8) {
            this.mObjects.add(o8);
            MapObjectManager.this.mAllObjects.put(o8, this);
        }

        public void clear() {
            for (O o8 : this.mObjects) {
                MapObjectManager.this.removeObjectFromMap(o8);
                MapObjectManager.this.mAllObjects.remove(o8);
            }
            this.mObjects.clear();
        }

        protected java.util.Collection<O> getObjects() {
            return Collections.unmodifiableCollection(this.mObjects);
        }

        protected boolean remove(O o8) {
            if (!this.mObjects.remove(o8)) {
                return false;
            }
            MapObjectManager.this.mAllObjects.remove(o8);
            MapObjectManager.this.removeObjectFromMap(o8);
            return true;
        }
    }

    public MapObjectManager(@NonNull GoogleMap googleMap) {
        this.mMap = googleMap;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.maps.android.collections.MapObjectManager.1
            @Override // java.lang.Runnable
            public void run() {
                MapObjectManager.this.setListenersOnUiThread();
            }
        });
    }

    public C getCollection(String str) {
        return this.mNamedCollections.get(str);
    }

    public abstract C newCollection();

    public C newCollection(String str) {
        if (this.mNamedCollections.get(str) == null) {
            C newCollection = newCollection();
            this.mNamedCollections.put(str, newCollection);
            return newCollection;
        }
        throw new IllegalArgumentException("collection id is not unique: " + str);
    }

    public boolean remove(O o8) {
        C c8 = this.mAllObjects.get(o8);
        return c8 != null && c8.remove(o8);
    }

    protected abstract void removeObjectFromMap(O o8);

    abstract void setListenersOnUiThread();
}
