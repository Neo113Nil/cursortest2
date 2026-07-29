package com.cmplay.base.util.gif;

import com.cmplay.base.util.gif.annotations.Beta;

@Beta
/* loaded from: classes.dex */
public class GifOptions {
    boolean inIsOpaque;
    char inSampleSize;

    public GifOptions() {
        reset();
    }

    private void reset() {
        this.inSampleSize = (char) 1;
        this.inIsOpaque = false;
    }

    public void setInSampleSize(int i) {
        if (i < 1 || i > 65535) {
            this.inSampleSize = (char) 1;
        } else {
            this.inSampleSize = (char) i;
        }
    }

    public void setInIsOpaque(boolean z) {
        this.inIsOpaque = z;
    }

    void setFrom(GifOptions gifOptions) {
        if (gifOptions == null) {
            reset();
        } else {
            this.inIsOpaque = gifOptions.inIsOpaque;
            this.inSampleSize = gifOptions.inSampleSize;
        }
    }
}
