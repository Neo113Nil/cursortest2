package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ii2 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f27214a = Log.isLoggable("Volley", 2);

    static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f27215c = ii2.f27214a;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f27216a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f27217b = false;

        /* renamed from: com.yandex.mobile.ads.impl.ii2$a$a, reason: collision with other inner class name */
        private static class C0191a {

            /* renamed from: a, reason: collision with root package name */
            public final String f27218a;

            /* renamed from: b, reason: collision with root package name */
            public final long f27219b;

            /* renamed from: c, reason: collision with root package name */
            public final long f27220c;

            public C0191a(String str, long j4, long j5) {
                this.f27218a = str;
                this.f27219b = j4;
                this.f27220c = j5;
            }
        }

        a() {
        }

        public final synchronized void a(String str, long j4) {
            if (this.f27217b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f27216a.add(new C0191a(str, j4, SystemClock.elapsedRealtime()));
        }

        protected final void finalize() {
            if (this.f27217b) {
                return;
            }
            a("Request on the loose");
            ap0.b(new Object[0]);
        }

        public final synchronized void a(String str) {
            long j4;
            this.f27217b = true;
            int i4 = 0;
            if (this.f27216a.size() == 0) {
                j4 = 0;
            } else {
                long j5 = ((C0191a) this.f27216a.get(0)).f27220c;
                ArrayList arrayList = this.f27216a;
                j4 = ((C0191a) arrayList.get(arrayList.size() - 1)).f27220c - j5;
            }
            if (j4 <= 0) {
                return;
            }
            long j6 = ((C0191a) this.f27216a.get(0)).f27220c;
            ap0.a(Long.valueOf(j4), str);
            ArrayList arrayList2 = this.f27216a;
            int size = arrayList2.size();
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                C0191a c0191a = (C0191a) obj;
                long j7 = c0191a.f27220c;
                ap0.a(Long.valueOf(j7 - j6), Long.valueOf(c0191a.f27219b), c0191a.f27218a);
                j6 = j7;
            }
        }
    }
}
