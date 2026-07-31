package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import com.bytedance.zmn.zmn;
import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class iv<D> extends com.bytedance.zmn.zmn<D> {
    private static final HashSet<String> zmn;

    static {
        HashSet<String> hashSet = new HashSet<>();
        zmn = hashSet;
        hashSet.add("play_start");
        hashSet.add("feed_play");
        hashSet.add("feed_continue");
        hashSet.add("feed_pause");
        hashSet.add("feed_break");
        hashSet.add("feed_over");
    }

    public iv(String str, zmn.InterfaceC0212zmn<D> interfaceC0212zmn) {
        super(str, (zmn.InterfaceC0212zmn) interfaceC0212zmn);
    }

    public iv(String str, D d) {
        super(str, d);
    }

    @Override // com.bytedance.zmn.zmn
    public final int nps() {
        if ((this instanceof mw) || fs() == 1) {
            return 4;
        }
        boolean z = this instanceof bvs;
        if (z) {
            if (zmn.contains(((bvs) this).zg())) {
                return 3;
            }
        }
        return z ? 2 : 1;
    }
}
