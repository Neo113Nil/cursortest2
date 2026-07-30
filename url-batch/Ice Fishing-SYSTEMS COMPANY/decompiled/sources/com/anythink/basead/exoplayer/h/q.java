package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.aa;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class q extends f<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final s f7917a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7918b;

    /* renamed from: c, reason: collision with root package name */
    private int f7919c;

    public static final class a extends p {
        public a(com.anythink.basead.exoplayer.ae aeVar) {
            super(aeVar);
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final int a(int i, int i4, boolean z8) {
            int a9 = this.f7916b.a(i, i4, z8);
            return a9 == -1 ? b(z8) : a9;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final int b(int i, int i4, boolean z8) {
            int b9 = this.f7916b.b(i, i4, z8);
            return b9 == -1 ? a(z8) : b9;
        }
    }

    public static final class b extends com.anythink.basead.exoplayer.h.a {

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.ae f7920b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7921c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7922d;

        /* renamed from: e, reason: collision with root package name */
        private final int f7923e;

        public b(com.anythink.basead.exoplayer.ae aeVar, int i) {
            super(false, new aa.b(i));
            this.f7920b = aeVar;
            int c4 = aeVar.c();
            this.f7921c = c4;
            this.f7922d = aeVar.b();
            this.f7923e = i;
            if (c4 > 0) {
                C0544a.b(i <= Integer.MAX_VALUE / c4, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int a(int i) {
            return i / this.f7921c;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int b() {
            return this.f7922d * this.f7923e;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int c() {
            return this.f7921c * this.f7923e;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int d(int i) {
            return i * this.f7921c;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int e(int i) {
            return i * this.f7922d;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final Object f(int i) {
            return Integer.valueOf(i);
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(int i) {
            return i / this.f7922d;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final com.anythink.basead.exoplayer.ae c(int i) {
            return this.f7920b;
        }

        @Override // com.anythink.basead.exoplayer.h.a
        public final int b(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }
    }

    private q(s sVar) {
        this(sVar, (byte) 0);
    }

    private void b(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        this.f7919c = aeVar.c();
        a(this.f7918b != Integer.MAX_VALUE ? new b(aeVar, this.f7918b) : new a(aeVar), obj);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z8) {
        super.a(hVar, z8);
        a((q) null, this.f7917a);
    }

    private q(s sVar, byte b9) {
        C0544a.a(true);
        this.f7917a = sVar;
        this.f7918b = Integer.MAX_VALUE;
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        if (this.f7918b != Integer.MAX_VALUE) {
            return this.f7917a.a(aVar.a(aVar.f7924a % this.f7919c), bVar);
        }
        return this.f7917a.a(aVar, bVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        this.f7917a.a(rVar);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f7919c = 0;
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ void a(Void r12, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        com.anythink.basead.exoplayer.ae aVar;
        this.f7919c = aeVar.c();
        if (this.f7918b != Integer.MAX_VALUE) {
            aVar = new b(aeVar, this.f7918b);
        } else {
            aVar = new a(aeVar);
        }
        a(aVar, obj);
    }
}
