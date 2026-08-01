package x7;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f10538a;

    public j(String str) {
        this.f10538a = str;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f10538a;
    }
}
