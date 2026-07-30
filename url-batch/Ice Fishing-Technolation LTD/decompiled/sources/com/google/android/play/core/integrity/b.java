package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes2.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f31a;
    private y b;

    b() {
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq a(y yVar) {
        this.b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f31a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final br c() {
        y yVar;
        String str = this.f31a;
        if (str != null && (yVar = this.b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f31a == null) {
            sb.append(" token");
        }
        if (this.b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
