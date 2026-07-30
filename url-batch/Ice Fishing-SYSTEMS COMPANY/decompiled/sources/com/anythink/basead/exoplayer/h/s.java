package com.anythink.basead.exoplayer.h;

import android.os.Handler;

/* loaded from: classes.dex */
public interface s {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7924a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7925b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7926c;

        /* renamed from: d, reason: collision with root package name */
        public final long f7927d;

        public a(int i) {
            this(i, -1L);
        }

        public final a a(int i) {
            return this.f7924a == i ? this : new a(i, this.f7925b, this.f7926c, this.f7927d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7924a == aVar.f7924a && this.f7925b == aVar.f7925b && this.f7926c == aVar.f7926c && this.f7927d == aVar.f7927d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((((this.f7924a + 527) * 31) + this.f7925b) * 31) + this.f7926c) * 31) + ((int) this.f7927d);
        }

        public a(int i, long j9) {
            this(i, -1, -1, j9);
        }

        public a(int i, int i4, int i9, long j9) {
            this.f7924a = i;
            this.f7925b = i4;
            this.f7926c = i9;
            this.f7927d = j9;
        }

        public final boolean a() {
            return this.f7925b != -1;
        }
    }

    public interface b {
        void a(s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj);
    }

    r a(a aVar, com.anythink.basead.exoplayer.j.b bVar);

    void a(Handler handler, t tVar);

    void a(r rVar);

    void a(b bVar);

    void a(t tVar);

    void a(com.anythink.basead.exoplayer.h hVar, boolean z8, b bVar);

    void b();
}
