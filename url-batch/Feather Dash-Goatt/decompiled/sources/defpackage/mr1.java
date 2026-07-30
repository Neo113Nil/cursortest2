package defpackage;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mr1 extends IntegrityTokenResponse {
    public final String a;

    public mr1(String str) {
        this.a = str;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.a;
    }
}
