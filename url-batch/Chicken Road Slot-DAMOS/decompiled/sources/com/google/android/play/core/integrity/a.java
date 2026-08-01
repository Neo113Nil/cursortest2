package com.google.android.play.core.integrity;

import a2.r;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import kotlin.collections.i0;
import x7.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends IntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    public String f3065a;

    /* renamed from: b, reason: collision with root package name */
    public Long f3066b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f3065a;
        if (str != null) {
            return new i(str, this.f3066b);
        }
        i0.l("Missing required properties: nonce");
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f3066b = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f3065a = str;
            return this;
        }
        r.j("Null nonce");
        return null;
    }
}
