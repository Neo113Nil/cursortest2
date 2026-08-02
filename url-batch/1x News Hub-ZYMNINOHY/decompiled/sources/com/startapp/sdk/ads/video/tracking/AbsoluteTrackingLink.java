package com.startapp.sdk.ads.video.tracking;

import com.startapp.json.TypeClassInfo;
import java.io.Serializable;

@TypeClassInfo(extendsClass = true)
/* loaded from: classes.dex */
public class AbsoluteTrackingLink extends VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 6710863919461399416L;
    private int videoOffsetMillis;

    public final void a(int i3) {
        this.videoOffsetMillis = i3;
    }

    public final int g() {
        return this.videoOffsetMillis;
    }
}
