package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f13577a;

    /* renamed from: b, reason: collision with root package name */
    private byte f13578b;

    c() {
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i4) {
        this.f13578b = (byte) (this.f13578b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f13578b == 3) {
            return new e(this.f13577a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f13578b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f13578b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j4) {
        this.f13577a = j4;
        this.f13578b = (byte) (this.f13578b | 1);
        return this;
    }
}
