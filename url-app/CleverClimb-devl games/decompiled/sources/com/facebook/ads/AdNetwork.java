package com.facebook.ads;

import com.facebook.ads.internal.n.c;

/* loaded from: classes.dex */
public enum AdNetwork {
    AN(c.AN),
    ADMOB(c.ADMOB),
    FLURRY(c.FLURRY),
    INMOBI(c.INMOBI);


    /* renamed from: a, reason: collision with root package name */
    private final c f4745a;

    AdNetwork(c cVar) {
        this.f4745a = cVar;
    }

    public static AdNetwork fromInternalAdNetwork(c cVar) {
        if (cVar == null) {
            return AN;
        }
        switch (cVar) {
        }
        return AN;
    }
}
