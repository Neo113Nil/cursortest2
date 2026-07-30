package com.google.android.play.core.integrity;

import L1.h;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* loaded from: classes.dex */
public final class a extends IntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    public String f4403a;

    /* renamed from: b, reason: collision with root package name */
    public Long f4404b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f4403a;
        if (str != null) {
            return new h(str, this.f4404b);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f4404b = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f4403a = str;
        return this;
    }
}
