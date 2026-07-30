package com.google.maps.android.clustering.algo;

import androidx.collection.LongSparseArray;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class GridBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_GRID_SIZE = 100;
    private int mGridSize = 100;
    private final Set<T> mItems = Collections.synchronizedSet(new HashSet());

    private static long getCoord(long j8, double d8, double d9) {
        return (long) ((j8 * Math.floor(d8)) + Math.floor(d9));
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t7) {
        return this.mItems.add(t7);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        return this.mItems.addAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mItems.clear();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f8) {
        long j8;
        long ceil = (long) Math.ceil((Math.pow(2.0d, f8) * 256.0d) / this.mGridSize);
        SphericalMercatorProjection sphericalMercatorProjection = new SphericalMercatorProjection(ceil);
        HashSet hashSet = new HashSet();
        LongSparseArray longSparseArray = new LongSparseArray();
        synchronized (this.mItems) {
            try {
                for (T t7 : this.mItems) {
                    Point point = sphericalMercatorProjection.toPoint(t7.getPosition());
                    long coord = getCoord(ceil, point.f15120x, point.f15121y);
                    StaticCluster staticCluster = (StaticCluster) longSparseArray.get(coord);
                    if (staticCluster == null) {
                        j8 = ceil;
                        staticCluster = new StaticCluster(sphericalMercatorProjection.toLatLng(new com.google.maps.android.geometry.Point(Math.floor(point.f15120x) + 0.5d, Math.floor(point.f15121y) + 0.5d)));
                        longSparseArray.put(coord, staticCluster);
                        hashSet.add(staticCluster);
                    } else {
                        j8 = ceil;
                    }
                    staticCluster.add(t7);
                    ceil = j8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mGridSize;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t7) {
        return this.mItems.remove(t7);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        return this.mItems.removeAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i8) {
        this.mGridSize = i8;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t7) {
        boolean removeItem;
        synchronized (this.mItems) {
            try {
                removeItem = removeItem(t7);
                if (removeItem) {
                    removeItem = addItem(t7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return removeItem;
    }
}
