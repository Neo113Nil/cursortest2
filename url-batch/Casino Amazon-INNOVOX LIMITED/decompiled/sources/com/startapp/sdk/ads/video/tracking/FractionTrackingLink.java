package com.startapp.sdk.ads.video.tracking;

import com.startapp.json.TypeClassInfo;
import java.io.Serializable;

/* compiled from: Sta */
@TypeClassInfo(extendsClass = true)
/* loaded from: classes3.dex */
public class FractionTrackingLink extends VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 1389232981938306043L;
    private int fraction;

    public final void a(int i) {
        this.fraction = i;
    }

    public final int g() {
        return this.fraction;
    }
}
