package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;

/* loaded from: classes.dex */
public abstract class Guideline extends Helper {
    private int mEnd;
    private float mPercent;
    private int mStart;

    Guideline(String str) {
        super(str, new Helper.HelperType(""));
        this.mStart = Integer.MIN_VALUE;
        this.mEnd = Integer.MIN_VALUE;
        this.mPercent = Float.NaN;
    }

    public int getEnd() {
        return this.mEnd;
    }

    public float getPercent() {
        return this.mPercent;
    }

    public int getStart() {
        return this.mStart;
    }

    public void setEnd(int i8) {
        this.mEnd = i8;
        this.configMap.put("end", String.valueOf(i8));
    }

    public void setPercent(float f8) {
        this.mPercent = f8;
        this.configMap.put("percent", String.valueOf(f8));
    }

    public void setStart(int i8) {
        this.mStart = i8;
        this.configMap.put("start", String.valueOf(i8));
    }
}
