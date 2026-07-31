package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.dz;
import com.yandex.mobile.ads.impl.iv;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class vz implements dw0.a {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f33827a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f33828b;

        /* renamed from: c, reason: collision with root package name */
        private iv.a f33829c;

        public a(mz mzVar) {
            new HashSet();
            this.f33828b = new HashMap();
        }

        public final void a(dz.a aVar) {
            if (aVar != this.f33829c) {
                this.f33829c = aVar;
                this.f33827a.clear();
                this.f33828b.clear();
            }
        }
    }

    public vz(dz.a aVar, mz mzVar) {
        new a(mzVar).a(aVar);
    }
}
