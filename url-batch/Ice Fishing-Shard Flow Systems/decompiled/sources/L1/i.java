package L1;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* loaded from: classes.dex */
public final class i extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f1680a;

    public i(String str) {
        this.f1680a = str;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f1680a;
    }
}
