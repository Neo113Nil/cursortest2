package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.bT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1101bT {
    public final Map<String, C1114bg> A00;
    public final Set<C1114bg> A01;

    public C1101bT() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1114bg> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1114bg> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C1114bg c1114bg : this.A01) {
            this.A00.put(c1114bg.A04, c1114bg);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C1114bg c1114bg) {
        if (this.A01.add(c1114bg)) {
            this.A00.remove(c1114bg.A04);
            return true;
        }
        return false;
    }
}
