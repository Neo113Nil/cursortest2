package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes2.dex */
public final class ba implements com.google.android.play.integrity.internal.ak {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f32a;
    private final com.google.android.play.integrity.internal.an b;

    public ba(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2) {
        this.f32a = anVar;
        this.b = anVar2;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        com.google.android.play.integrity.internal.an anVar = this.b;
        return new az((bn) this.f32a.a(), (bt) anVar.a());
    }
}
