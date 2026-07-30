package com.github.mikephil.charting.renderer;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;

/* loaded from: classes3.dex */
public abstract class c extends g {
    protected a mXBounds;

    protected class a {
        public int max;
        public int min;
        public int range;

        protected a() {
        }

        public void set(u4.b bVar, v4.b bVar2) {
            float max = Math.max(0.0f, Math.min(1.0f, c.this.mAnimator.getPhaseX()));
            float lowestVisibleX = bVar.getLowestVisibleX();
            float highestVisibleX = bVar.getHighestVisibleX();
            Entry entryForXValue = bVar2.getEntryForXValue(lowestVisibleX, Float.NaN, DataSet.Rounding.DOWN);
            Entry entryForXValue2 = bVar2.getEntryForXValue(highestVisibleX, Float.NaN, DataSet.Rounding.UP);
            this.min = entryForXValue == null ? 0 : bVar2.getEntryIndex(entryForXValue);
            this.max = entryForXValue2 != null ? bVar2.getEntryIndex(entryForXValue2) : 0;
            this.range = (int) ((r2 - this.min) * max);
        }
    }

    public c(com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.j jVar) {
        super(aVar, jVar);
        this.mXBounds = new a();
    }

    protected boolean isInBoundsX(Entry entry, v4.b bVar) {
        return entry != null && ((float) bVar.getEntryIndex(entry)) < ((float) bVar.getEntryCount()) * this.mAnimator.getPhaseX();
    }

    protected boolean shouldDrawValues(v4.e eVar) {
        return eVar.isVisible() && (eVar.isDrawValuesEnabled() || eVar.isDrawIconsEnabled());
    }
}
