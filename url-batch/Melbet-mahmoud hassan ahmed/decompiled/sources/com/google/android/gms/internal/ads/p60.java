package com.google.android.gms.internal.ads;

import u2.f;

/* loaded from: classes.dex */
public final class p60 {

    /* renamed from: a, reason: collision with root package name */
    private final f.b f10107a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a f10108b;

    /* renamed from: c, reason: collision with root package name */
    private u2.f f10109c;

    public p60(f.b bVar, f.a aVar) {
        this.f10107a = bVar;
        this.f10108b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized u2.f f(e50 e50Var) {
        u2.f fVar = this.f10109c;
        if (fVar != null) {
            return fVar;
        }
        f50 f50Var = new f50(e50Var);
        this.f10109c = f50Var;
        return f50Var;
    }

    public final o50 d() {
        l60 l60Var = null;
        if (this.f10108b == null) {
            return null;
        }
        return new m60(this, l60Var);
    }

    public final r50 e() {
        return new o60(this, null);
    }
}
