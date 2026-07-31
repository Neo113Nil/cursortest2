package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ot1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, nt1> f9827a = new HashMap();

    ot1() {
    }

    public final synchronized nt1 a(String str) {
        return this.f9827a.get(str);
    }

    public final nt1 b(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            nt1 a7 = a(it.next());
            if (a7 != null) {
                return a7;
            }
        }
        return null;
    }

    final synchronized void c(String str, at2 at2Var) {
        if (this.f9827a.containsKey(str)) {
            return;
        }
        try {
            this.f9827a.put(str, new nt1(str, at2Var.h(), at2Var.i()));
        } catch (ps2 unused) {
        }
    }

    final synchronized void d(String str, cf0 cf0Var) {
        if (this.f9827a.containsKey(str)) {
            return;
        }
        try {
            this.f9827a.put(str, new nt1(str, cf0Var.d(), cf0Var.e()));
        } catch (Throwable unused) {
        }
    }
}
