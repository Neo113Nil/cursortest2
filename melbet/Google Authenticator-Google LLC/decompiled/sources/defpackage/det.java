package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class det {
    public final fym a;
    private final int b = R.drawable.privacy_screen_background_app_logo;

    public det(fym fymVar) {
        this.a = fymVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof det)) {
            return false;
        }
        det detVar = (det) obj;
        int i = detVar.b;
        return ksp.b(this.a, detVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1643655621;
    }

    public final String toString() {
        return "PrivacyScreenConfig(appIconRes=2131231131, protoStoreFactory=" + this.a + ")";
    }
}
