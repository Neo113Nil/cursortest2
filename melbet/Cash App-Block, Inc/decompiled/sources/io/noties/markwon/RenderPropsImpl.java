package io.noties.markwon;

import java.util.Calendar;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class RenderPropsImpl {
    public final HashMap values;

    public RenderPropsImpl(int i) {
        switch (i) {
            case 1:
                this.values = new HashMap();
                break;
            case 2:
                Calendar.getInstance().getTime();
                this.values = new HashMap();
                break;
            default:
                this.values = new HashMap(3);
                break;
        }
    }
}
