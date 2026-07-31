package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f13529a;

    /* renamed from: b, reason: collision with root package name */
    private y f13530b;

    b() {
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq a(y yVar) {
        this.f13530b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f13529a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final br c() {
        y yVar;
        String str = this.f13529a;
        if (str != null && (yVar = this.f13530b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f13529a == null) {
            sb.append(" token");
        }
        if (this.f13530b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
