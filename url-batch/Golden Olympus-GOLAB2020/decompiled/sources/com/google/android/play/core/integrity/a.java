package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private String f13476a;

    /* renamed from: b, reason: collision with root package name */
    private y f13477b;

    a() {
    }

    @Override // com.google.android.play.core.integrity.ap
    final ap a(y yVar) {
        this.f13477b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final ap b(String str) {
        this.f13476a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final aq c() {
        y yVar;
        String str = this.f13476a;
        if (str != null && (yVar = this.f13477b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f13476a == null) {
            sb.append(" token");
        }
        if (this.f13477b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
