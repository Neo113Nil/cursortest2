package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class v3 {
    private final List a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(y2 y2Var);
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public void b(a aVar) {
        this.a.remove(aVar);
    }

    public void a(y2 y2Var) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(y2Var);
        }
    }
}
