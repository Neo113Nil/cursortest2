package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Deprecated
/* loaded from: classes3.dex */
public final class BaseUrlExclusionList {
    private final Map<Integer, Long> excludedPriorities;
    private final Map<String, Long> excludedServiceLocations;
    private final Random random;
    private final Map<List<Pair<String, Integer>>, BaseUrl> selectionsTaken;

    public BaseUrlExclusionList() {
        this(new Random());
    }

    private static <T> void addExclusion(T t7, long j8, Map<T, Long> map) {
        if (map.containsKey(t7)) {
            j8 = Math.max(j8, ((Long) Util.castNonNull(map.get(t7))).longValue());
        }
        map.put(t7, Long.valueOf(j8));
    }

    private List<BaseUrl> applyExclusions(List<BaseUrl> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        removeExpiredExclusions(elapsedRealtime, this.excludedServiceLocations);
        removeExpiredExclusions(elapsedRealtime, this.excludedPriorities);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            BaseUrl baseUrl = list.get(i8);
            if (!this.excludedServiceLocations.containsKey(baseUrl.serviceLocation) && !this.excludedPriorities.containsKey(Integer.valueOf(baseUrl.priority))) {
                arrayList.add(baseUrl);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareBaseUrl(BaseUrl baseUrl, BaseUrl baseUrl2) {
        int compare = Integer.compare(baseUrl.priority, baseUrl2.priority);
        return compare != 0 ? compare : baseUrl.serviceLocation.compareTo(baseUrl2.serviceLocation);
    }

    public static int getPriorityCount(List<BaseUrl> list) {
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < list.size(); i8++) {
            hashSet.add(Integer.valueOf(list.get(i8).priority));
        }
        return hashSet.size();
    }

    private static <T> void removeExpiredExclusions(long j8, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j8) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            map.remove(arrayList.get(i8));
        }
    }

    private BaseUrl selectWeighted(List<BaseUrl> list) {
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += list.get(i9).weight;
        }
        int nextInt = this.random.nextInt(i8);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            BaseUrl baseUrl = list.get(i11);
            i10 += baseUrl.weight;
            if (nextInt < i10) {
                return baseUrl;
            }
        }
        return (BaseUrl) Iterables.getLast(list);
    }

    public void exclude(BaseUrl baseUrl, long j8) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j8;
        addExclusion(baseUrl.serviceLocation, elapsedRealtime, this.excludedServiceLocations);
        int i8 = baseUrl.priority;
        if (i8 != Integer.MIN_VALUE) {
            addExclusion(Integer.valueOf(i8), elapsedRealtime, this.excludedPriorities);
        }
    }

    public int getPriorityCountAfterExclusion(List<BaseUrl> list) {
        HashSet hashSet = new HashSet();
        List<BaseUrl> applyExclusions = applyExclusions(list);
        for (int i8 = 0; i8 < applyExclusions.size(); i8++) {
            hashSet.add(Integer.valueOf(applyExclusions.get(i8).priority));
        }
        return hashSet.size();
    }

    public void reset() {
        this.excludedServiceLocations.clear();
        this.excludedPriorities.clear();
        this.selectionsTaken.clear();
    }

    @Nullable
    public BaseUrl selectBaseUrl(List<BaseUrl> list) {
        List<BaseUrl> applyExclusions = applyExclusions(list);
        if (applyExclusions.size() < 2) {
            return (BaseUrl) Iterables.getFirst(applyExclusions, null);
        }
        Collections.sort(applyExclusions, new Comparator() { // from class: com.google.android.exoplayer2.source.dash.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareBaseUrl;
                compareBaseUrl = BaseUrlExclusionList.compareBaseUrl((BaseUrl) obj, (BaseUrl) obj2);
                return compareBaseUrl;
            }
        });
        ArrayList arrayList = new ArrayList();
        int i8 = applyExclusions.get(0).priority;
        int i9 = 0;
        while (true) {
            if (i9 >= applyExclusions.size()) {
                break;
            }
            BaseUrl baseUrl = applyExclusions.get(i9);
            if (i8 == baseUrl.priority) {
                arrayList.add(new Pair(baseUrl.serviceLocation, Integer.valueOf(baseUrl.weight)));
                i9++;
            } else if (arrayList.size() == 1) {
                return applyExclusions.get(0);
            }
        }
        BaseUrl baseUrl2 = this.selectionsTaken.get(arrayList);
        if (baseUrl2 != null) {
            return baseUrl2;
        }
        BaseUrl selectWeighted = selectWeighted(applyExclusions.subList(0, arrayList.size()));
        this.selectionsTaken.put(arrayList, selectWeighted);
        return selectWeighted;
    }

    @VisibleForTesting
    BaseUrlExclusionList(Random random) {
        this.selectionsTaken = new HashMap();
        this.random = random;
        this.excludedServiceLocations = new HashMap();
        this.excludedPriorities = new HashMap();
    }
}
