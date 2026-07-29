package com.tapjoy.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class ar extends aq {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f7832a = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private int f7833b = 10;

    private void a() {
        int size = this.f7832a.size() - this.f7833b;
        if (size > 0) {
            Iterator it = this.f7832a.entrySet().iterator();
            while (size > 0 && it.hasNext()) {
                size--;
                it.next();
                it.remove();
            }
        }
    }

    @Override // com.tapjoy.internal.aq, com.tapjoy.internal.an
    public final void a(Object obj, Object obj2) {
        super.a(obj, obj2);
        a();
    }

    @Override // com.tapjoy.internal.aq
    protected final ao a(Object obj, boolean z) {
        am amVar = (am) this.f7832a.get(obj);
        if (amVar != null || !z) {
            return amVar;
        }
        am amVar2 = new am(obj);
        this.f7832a.put(obj, amVar2);
        a();
        return amVar2;
    }
}
