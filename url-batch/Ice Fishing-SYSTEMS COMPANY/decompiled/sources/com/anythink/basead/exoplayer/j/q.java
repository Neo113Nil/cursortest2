package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.j.s;

/* loaded from: classes.dex */
public final class q extends s.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f8369a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super h> f8370b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8371c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8372d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8373e;

    public q(String str) {
        this(str, null);
    }

    private p b(s.f fVar) {
        return new p(this.f8369a, null, this.f8370b, this.f8371c, this.f8372d, this.f8373e, fVar);
    }

    @Override // com.anythink.basead.exoplayer.j.s.a
    public final /* synthetic */ s a(s.f fVar) {
        return new p(this.f8369a, null, this.f8370b, this.f8371c, this.f8372d, this.f8373e, fVar);
    }

    public q(String str, aa<? super h> aaVar) {
        this(str, aaVar, (byte) 0);
    }

    private q(String str, aa<? super h> aaVar, byte b9) {
        this.f8369a = str;
        this.f8370b = aaVar;
        this.f8371c = 8000;
        this.f8372d = 8000;
        this.f8373e = false;
    }
}
