package com.airbnb.lottie;

import android.util.Log;
import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class r0 {
    private boolean enabled = false;
    private final Set<b> frameListeners = new ArraySet();
    private final Map<String, com.airbnb.lottie.utils.h> layerRenderTimes = new HashMap();
    private final Comparator<Pair<String, Float>> floatComparator = new a();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    public interface b {
    }

    public void addFrameListener(b bVar) {
        this.frameListeners.add(bVar);
    }

    public void clearRenderTimes() {
        this.layerRenderTimes.clear();
    }

    public List<Pair<String, Float>> getSortedRenderTimes() {
        if (!this.enabled) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.layerRenderTimes.size());
        for (Map.Entry<String, com.airbnb.lottie.utils.h> entry : this.layerRenderTimes.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), Float.valueOf(entry.getValue().getMean())));
        }
        Collections.sort(arrayList, this.floatComparator);
        return arrayList;
    }

    public void logRenderTimes() {
        if (this.enabled) {
            List<Pair<String, Float>> sortedRenderTimes = getSortedRenderTimes();
            Log.d(c.TAG, "Render times:");
            for (int i8 = 0; i8 < sortedRenderTimes.size(); i8++) {
                Pair<String, Float> pair = sortedRenderTimes.get(i8);
                Log.d(c.TAG, String.format("\t\t%30s:%.2f", pair.first, pair.second));
            }
        }
    }

    public void recordRenderTime(String str, float f8) {
        if (this.enabled) {
            com.airbnb.lottie.utils.h hVar = this.layerRenderTimes.get(str);
            if (hVar == null) {
                hVar = new com.airbnb.lottie.utils.h();
                this.layerRenderTimes.put(str, hVar);
            }
            hVar.add(f8);
            if (str.equals("__container")) {
                Iterator<b> it = this.frameListeners.iterator();
                if (it.hasNext()) {
                    cn.hutool.core.convert.impl.s.a(it.next());
                    throw null;
                }
            }
        }
    }

    public void removeFrameListener(b bVar) {
        this.frameListeners.remove(bVar);
    }

    void setEnabled(boolean z7) {
        this.enabled = z7;
    }
}
