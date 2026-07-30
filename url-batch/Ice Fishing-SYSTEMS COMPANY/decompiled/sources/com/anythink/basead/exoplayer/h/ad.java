package com.anythink.basead.exoplayer.h;

import android.net.Uri;
import android.os.Handler;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.j.h;
import com.anythink.basead.exoplayer.k.C0544a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ad extends com.anythink.basead.exoplayer.h.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7654a = 3;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.k f7655b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a f7656c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.m f7657d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7658e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7659f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7660g;

    /* renamed from: h, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.ae f7661h;

    @Deprecated
    public interface a {
        void a();
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        private final a f7662a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7663b;

        public b(a aVar, int i) {
            this.f7662a = (a) C0544a.a(aVar);
            this.f7663b = i;
        }

        @Override // com.anythink.basead.exoplayer.h.k, com.anythink.basead.exoplayer.h.t
        public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z8) {
        }
    }

    public /* synthetic */ ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j9, int i, boolean z8, Object obj, byte b9) {
        this(uri, aVar, mVar, j9, i, z8, obj);
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public final void a() {
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void b() {
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final h.a f7664a;

        /* renamed from: b, reason: collision with root package name */
        private int f7665b = 3;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7666c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f7667d;

        /* renamed from: e, reason: collision with root package name */
        private Object f7668e;

        private c(h.a aVar) {
            this.f7664a = (h.a) C0544a.a(aVar);
        }

        private c a(Object obj) {
            C0544a.b(!this.f7667d);
            this.f7668e = obj;
            return this;
        }

        private c a(int i) {
            C0544a.b(!this.f7667d);
            this.f7665b = i;
            return this;
        }

        private c a(boolean z8) {
            C0544a.b(!this.f7667d);
            this.f7666c = z8;
            return this;
        }

        private ad a(Uri uri, com.anythink.basead.exoplayer.m mVar, long j9) {
            this.f7667d = true;
            return new ad(uri, this.f7664a, mVar, j9, this.f7665b, this.f7666c, this.f7668e, (byte) 0);
        }

        @Deprecated
        private ad a(Uri uri, com.anythink.basead.exoplayer.m mVar, long j9, Handler handler, t tVar) {
            this.f7667d = true;
            ad adVar = new ad(uri, this.f7664a, mVar, j9, this.f7665b, this.f7666c, this.f7668e, (byte) 0);
            if (handler != null && tVar != null) {
                adVar.a(handler, tVar);
            }
            return adVar;
        }
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j9) {
        this(uri, aVar, mVar, j9, (byte) 0);
    }

    @Override // com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z8) {
        a(this.f7661h, (Object) null);
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j9, byte b9) {
        this(uri, aVar, mVar, j9, 3, false, null);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        C0544a.a(aVar.f7924a == 0);
        return new ac(this.f7655b, this.f7656c, this.f7657d, this.f7658e, this.f7659f, a(aVar), this.f7660g);
    }

    @Deprecated
    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j9, int i, Handler handler, a aVar2, int i4, boolean z8) {
        this(uri, aVar, mVar, j9, i, z8, null);
        if (handler == null || aVar2 == null) {
            return;
        }
        a(handler, new b(aVar2, i4));
    }

    private ad(Uri uri, h.a aVar, com.anythink.basead.exoplayer.m mVar, long j9, int i, boolean z8, Object obj) {
        this.f7656c = aVar;
        this.f7657d = mVar;
        this.f7658e = j9;
        this.f7659f = i;
        this.f7660g = z8;
        this.f7655b = new com.anythink.basead.exoplayer.j.k(uri);
        this.f7661h = new ab(j9, true, false, obj);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        ((ac) rVar).f();
    }
}
