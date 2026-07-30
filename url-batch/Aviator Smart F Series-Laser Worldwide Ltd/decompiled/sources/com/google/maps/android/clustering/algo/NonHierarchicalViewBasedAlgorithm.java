package com.google.maps.android.clustering.algo;

import com.github.mikephil.charting.utils.i;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public class NonHierarchicalViewBasedAlgorithm<T extends ClusterItem> extends NonHierarchicalDistanceBasedAlgorithm<T> implements ScreenBasedAlgorithm<T> {
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private LatLng mMapCenter;
    private int mViewHeight;
    private int mViewWidth;

    public NonHierarchicalViewBasedAlgorithm(int i8, int i9) {
        this.mViewWidth = i8;
        this.mViewHeight = i9;
    }

    private Bounds getVisibleBounds(float f8) {
        LatLng latLng = this.mMapCenter;
        if (latLng == null) {
            return new Bounds(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
        }
        Point point = PROJECTION.toPoint(latLng);
        double d8 = f8;
        double pow = ((this.mViewWidth / Math.pow(2.0d, d8)) / 256.0d) / 2.0d;
        double pow2 = ((this.mViewHeight / Math.pow(2.0d, d8)) / 256.0d) / 2.0d;
        double d9 = point.f15120x;
        double d10 = point.f15121y;
        return new Bounds(d9 - pow, d9 + pow, d10 - pow2, d10 + pow2);
    }

    @Override // com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm
    protected Collection<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> getClusteringItems(PointQuadTree<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> pointQuadTree, float f8) {
        Bounds visibleBounds = getVisibleBounds(f8);
        ArrayList arrayList = new ArrayList();
        double d8 = visibleBounds.minX;
        if (d8 < i.DOUBLE_EPSILON) {
            arrayList.addAll(pointQuadTree.search(new Bounds(d8 + 1.0d, 1.0d, visibleBounds.minY, visibleBounds.maxY)));
            visibleBounds = new Bounds(i.DOUBLE_EPSILON, visibleBounds.maxX, visibleBounds.minY, visibleBounds.maxY);
        }
        double d9 = visibleBounds.maxX;
        if (d9 > 1.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(i.DOUBLE_EPSILON, d9 - 1.0d, visibleBounds.minY, visibleBounds.maxY)));
            visibleBounds = new Bounds(visibleBounds.minX, 1.0d, visibleBounds.minY, visibleBounds.maxY);
        }
        arrayList.addAll(pointQuadTree.search(visibleBounds));
        return arrayList;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(CameraPosition cameraPosition) {
        this.mMapCenter = cameraPosition.target;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public boolean shouldReclusterOnMapMovement() {
        return true;
    }

    public void updateViewSize(int i8, int i9) {
        this.mViewWidth = i8;
        this.mViewHeight = i9;
    }
}
