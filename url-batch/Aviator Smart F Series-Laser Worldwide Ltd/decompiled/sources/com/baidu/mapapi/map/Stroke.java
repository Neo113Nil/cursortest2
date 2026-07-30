package com.baidu.mapapi.map;

import android.os.Bundle;
import com.arthenica.ffmpegkit.x;

/* loaded from: classes2.dex */
public final class Stroke {
    public final int color;
    public final int strokeWidth;

    public Stroke(int i8, int i9) {
        this.strokeWidth = i8 <= 0 ? 5 : i8;
        this.color = i9;
    }

    Bundle a(Bundle bundle) {
        bundle.putInt(x.KEY_WIDTH, this.strokeWidth);
        Overlay.d(this.color, bundle);
        return bundle;
    }
}
