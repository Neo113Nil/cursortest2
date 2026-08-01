package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.Q;

/* compiled from: HandlerWapper.java */
/* loaded from: classes3.dex */
public class N extends Q implements O {
    private final HandlerThread b;

    N(HandlerThread handlerThread, Q.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.b = handlerThread;
    }

    public void a(String str) {
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
