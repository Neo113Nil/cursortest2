package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class AC implements InterfaceC1883q2 {
    public final List<InterfaceC1884q3> A00 = new ArrayList();

    @Override // com.instagram.common.viewpoint.core.InterfaceC1883q2
    public final InterfaceC1884q3 A6a(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1884q3> iterator() {
        return this.A00.iterator();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1883q2
    public final int size() {
        return this.A00.size();
    }
}
