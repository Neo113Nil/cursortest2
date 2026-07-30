package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class LoginResult {
    private final AccessToken accessToken;
    private final AuthenticationToken authenticationToken;
    private final Set<String> recentlyDeniedPermissions;
    private final Set<String> recentlyGrantedPermissions;

    public LoginResult(AccessToken accessToken, AuthenticationToken authenticationToken, Set<String> set, Set<String> set2) {
        accessToken.getClass();
        set.getClass();
        set2.getClass();
        this.accessToken = accessToken;
        this.authenticationToken = authenticationToken;
        this.recentlyGrantedPermissions = set;
        this.recentlyDeniedPermissions = set2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            accessToken = loginResult.accessToken;
        }
        if ((i & 2) != 0) {
            authenticationToken = loginResult.authenticationToken;
        }
        if ((i & 4) != 0) {
            set = loginResult.recentlyGrantedPermissions;
        }
        if ((i & 8) != 0) {
            set2 = loginResult.recentlyDeniedPermissions;
        }
        return loginResult.copy(accessToken, authenticationToken, set, set2);
    }

    public final AccessToken component1() {
        return this.accessToken;
    }

    public final AuthenticationToken component2() {
        return this.authenticationToken;
    }

    public final Set<String> component3() {
        return this.recentlyGrantedPermissions;
    }

    public final Set<String> component4() {
        return this.recentlyDeniedPermissions;
    }

    public final LoginResult copy(AccessToken accessToken, AuthenticationToken authenticationToken, Set<String> set, Set<String> set2) {
        accessToken.getClass();
        set.getClass();
        set2.getClass();
        return new LoginResult(accessToken, authenticationToken, set, set2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResult)) {
            return false;
        }
        LoginResult loginResult = (LoginResult) obj;
        return Intrinsics.b(this.accessToken, loginResult.accessToken) && Intrinsics.b(this.authenticationToken, loginResult.authenticationToken) && Intrinsics.b(this.recentlyGrantedPermissions, loginResult.recentlyGrantedPermissions) && Intrinsics.b(this.recentlyDeniedPermissions, loginResult.recentlyDeniedPermissions);
    }

    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final AuthenticationToken getAuthenticationToken() {
        return this.authenticationToken;
    }

    public final Set<String> getRecentlyDeniedPermissions() {
        return this.recentlyDeniedPermissions;
    }

    public final Set<String> getRecentlyGrantedPermissions() {
        return this.recentlyGrantedPermissions;
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        AuthenticationToken authenticationToken = this.authenticationToken;
        return this.recentlyDeniedPermissions.hashCode() + ((this.recentlyGrantedPermissions.hashCode() + ((hashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31)) * 31);
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.accessToken + ", authenticationToken=" + this.authenticationToken + ", recentlyGrantedPermissions=" + this.recentlyGrantedPermissions + ", recentlyDeniedPermissions=" + this.recentlyDeniedPermissions + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginResult(AccessToken accessToken, Set<String> set, Set<String> set2) {
        this(accessToken, null, set, set2, 2, null);
        accessToken.getClass();
        set.getClass();
        set2.getClass();
    }

    public /* synthetic */ LoginResult(AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accessToken, (i & 2) != 0 ? null : authenticationToken, set, set2);
    }
}
