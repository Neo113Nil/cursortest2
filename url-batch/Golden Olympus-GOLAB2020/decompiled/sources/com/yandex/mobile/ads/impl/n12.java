package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class n12 {

    /* renamed from: a, reason: collision with root package name */
    private final tn f29350a;

    /* renamed from: b, reason: collision with root package name */
    private final b f29351b;

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class a extends AbstractC1958h<String> {

        /* renamed from: d, reason: collision with root package name */
        final CharSequence f29352d;

        /* renamed from: e, reason: collision with root package name */
        final tn f29353e;

        /* renamed from: g, reason: collision with root package name */
        int f29355g = 0;

        /* renamed from: f, reason: collision with root package name */
        final boolean f29354f = false;

        /* renamed from: h, reason: collision with root package name */
        int f29356h = Integer.MAX_VALUE;

        protected a(n12 n12Var, CharSequence charSequence) {
            this.f29353e = n12Var.f29350a;
            this.f29352d = charSequence;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
    }

    private n12(m12 m12Var, tn tnVar) {
        this.f29351b = m12Var;
        this.f29350a = tnVar;
    }

    public final List<String> a(CharSequence charSequence) {
        charSequence.getClass();
        m12 m12Var = (m12) this.f29351b;
        m12Var.getClass();
        l12 l12Var = new l12(m12Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (l12Var.hasNext()) {
            arrayList.add(l12Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static n12 a(char c4) {
        return new n12(new m12(new tn.b(c4)), tn.d.f32514c);
    }
}
