package com.instagram.common.viewpoint.core;

import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: assets/audience_network.dex */
public class TR implements Callable<Boolean> {
    public final /* synthetic */ W4 A00;
    public final /* synthetic */ String A01;

    public TR(W4 w4, String str) {
        this.A00 = w4;
        this.A01 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        Map map;
        Map map2;
        this.A00.A05();
        map = TT.A04;
        synchronized (map) {
            map2 = TT.A04;
            map2.put(this.A01, 2);
        }
        return true;
    }
}
