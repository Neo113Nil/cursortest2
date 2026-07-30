package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class la3 {
    public static final u93 a = new u93(0);

    static {
        new Scope(1, "profile");
        new Scope(1, AuthenticationTokenClaims.JSON_KEY_EMAIL);
    }
}
