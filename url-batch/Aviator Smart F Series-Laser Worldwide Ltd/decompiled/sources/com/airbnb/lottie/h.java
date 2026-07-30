package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class h {
    private Rect bounds;
    private SparseArrayCompat<com.airbnb.lottie.model.c> characters;
    private float endFrame;
    private Map<String, com.airbnb.lottie.model.b> fonts;
    private float frameRate;
    private boolean hasDashPattern;
    private Map<String, j0> images;
    private LongSparseArray<Layer> layerMap;
    private List<Layer> layers;
    private List<com.airbnb.lottie.model.g> markers;
    private Map<String, List<Layer>> precomps;
    private float startFrame;
    private final r0 performanceTracker = new r0();
    private final HashSet<String> warnings = new HashSet<>();
    private int maskAndMatteCount = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void addWarning(String str) {
        com.airbnb.lottie.utils.f.warning(str);
        this.warnings.add(str);
    }

    public Rect getBounds() {
        return this.bounds;
    }

    public SparseArrayCompat<com.airbnb.lottie.model.c> getCharacters() {
        return this.characters;
    }

    public float getDuration() {
        return (long) ((getDurationFrames() / this.frameRate) * 1000.0f);
    }

    public float getDurationFrames() {
        return this.endFrame - this.startFrame;
    }

    public float getEndFrame() {
        return this.endFrame;
    }

    public Map<String, com.airbnb.lottie.model.b> getFonts() {
        return this.fonts;
    }

    public float getFrameForProgress(float f8) {
        return com.airbnb.lottie.utils.i.lerp(this.startFrame, this.endFrame, f8);
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public Map<String, j0> getImages() {
        return this.images;
    }

    public List<Layer> getLayers() {
        return this.layers;
    }

    @Nullable
    public com.airbnb.lottie.model.g getMarker(String str) {
        int size = this.markers.size();
        for (int i8 = 0; i8 < size; i8++) {
            com.airbnb.lottie.model.g gVar = this.markers.get(i8);
            if (gVar.matchesName(str)) {
                return gVar;
            }
        }
        return null;
    }

    public List<com.airbnb.lottie.model.g> getMarkers() {
        return this.markers;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getMaskAndMatteCount() {
        return this.maskAndMatteCount;
    }

    public r0 getPerformanceTracker() {
        return this.performanceTracker;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> getPrecomps(String str) {
        return this.precomps.get(str);
    }

    public float getProgressForFrame(float f8) {
        float f9 = this.startFrame;
        return (f8 - f9) / (this.endFrame - f9);
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public ArrayList<String> getWarnings() {
        HashSet<String> hashSet = this.warnings;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDashPattern() {
        return this.hasDashPattern;
    }

    public boolean hasImages() {
        return !this.images.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void incrementMatteOrMaskCount(int i8) {
        this.maskAndMatteCount += i8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void init(Rect rect, float f8, float f9, float f10, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, j0> map2, SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat, Map<String, com.airbnb.lottie.model.b> map3, List<com.airbnb.lottie.model.g> list2) {
        this.bounds = rect;
        this.startFrame = f8;
        this.endFrame = f9;
        this.frameRate = f10;
        this.layers = list;
        this.layerMap = longSparseArray;
        this.precomps = map;
        this.images = map2;
        this.characters = sparseArrayCompat;
        this.fonts = map3;
        this.markers = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer layerModelForId(long j8) {
        return this.layerMap.get(j8);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setHasDashPattern(boolean z7) {
        this.hasDashPattern = z7;
    }

    public void setPerformanceTrackingEnabled(boolean z7) {
        this.performanceTracker.setEnabled(z7);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.layers.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString("\t"));
        }
        return sb.toString();
    }
}
