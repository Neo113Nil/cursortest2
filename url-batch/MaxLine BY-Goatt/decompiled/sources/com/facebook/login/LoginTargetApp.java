package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public enum LoginTargetApp {
    FACEBOOK(AccessToken.DEFAULT_GRAPH_DOMAIN),
    INSTAGRAM(FacebookSdk.INSTAGRAM);

    public static final Companion Companion = new Companion(null);
    private final String targetApp;

    LoginTargetApp(String str) {
        this.targetApp = str;
    }

    public static final LoginTargetApp fromString(String str) {
        return Companion.fromString(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LoginTargetApp fromString(String str) {
            for (LoginTargetApp loginTargetApp : LoginTargetApp.values()) {
                if (Intrinsics.b(loginTargetApp.toString(), str)) {
                    return loginTargetApp;
                }
            }
            return LoginTargetApp.FACEBOOK;
        }

        private Companion() {
        }
    }
}
