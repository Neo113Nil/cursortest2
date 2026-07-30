package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.internal.Validate;
import com.facebook.internal.security.OidcSecurityUtil;
import defpackage.in1;
import defpackage.lh;
import defpackage.up2;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AuthenticationToken implements Parcelable {
    public static final String AUTHENTICATION_TOKEN_KEY = "id_token";
    private static final String CLAIMS_KEY = "claims";
    private static final String EXPECTED_NONCE_KEY = "expected_nonce";
    private static final String HEADER_KEY = "header";
    private static final String SIGNATURE_KEY = "signature";
    private static final String TOKEN_STRING_KEY = "token_string";
    private final AuthenticationTokenClaims claims;
    private final String expectedNonce;
    private final AuthenticationTokenHeader header;
    private final String signature;
    private final String token;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new Parcelable.Creator<AuthenticationToken>() { // from class: com.facebook.AuthenticationToken$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationToken createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AuthenticationToken(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationToken[] newArray(int i) {
            return new AuthenticationToken[i];
        }
    };

    public AuthenticationToken(String str, String str2) {
        str.getClass();
        str2.getClass();
        Validate.notEmpty(str, "token");
        Validate.notEmpty(str2, "expectedNonce");
        List F = up2.F(0, 6, str, new String[]{"."});
        if (F.size() != 3) {
            lh.e("Invalid IdToken string");
            throw null;
        }
        String str3 = (String) F.get(0);
        String str4 = (String) F.get(1);
        String str5 = (String) F.get(2);
        this.token = str;
        this.expectedNonce = str2;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
        this.header = authenticationTokenHeader;
        this.claims = new AuthenticationTokenClaims(str4, str2);
        if (isValidSignature(str3, str4, str5, authenticationTokenHeader.getKid())) {
            this.signature = str5;
        } else {
            lh.e("Invalid Signature");
            throw null;
        }
    }

    public static final AuthenticationToken getCurrentAuthenticationToken() {
        return Companion.getCurrentAuthenticationToken();
    }

    private final boolean isValidSignature(String str, String str2, String str3, String str4) {
        try {
            String rawKeyFromEndPoint = OidcSecurityUtil.getRawKeyFromEndPoint(str4);
            if (rawKeyFromEndPoint == null) {
                return false;
            }
            return OidcSecurityUtil.verify(OidcSecurityUtil.getPublicKeyFromString(rawKeyFromEndPoint), str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public static final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken) {
        Companion.setCurrentAuthenticationToken(authenticationToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return Intrinsics.b(this.token, authenticationToken.token) && Intrinsics.b(this.expectedNonce, authenticationToken.expectedNonce) && Intrinsics.b(this.header, authenticationToken.header) && Intrinsics.b(this.claims, authenticationToken.claims) && Intrinsics.b(this.signature, authenticationToken.signature);
    }

    public final AuthenticationTokenClaims getClaims() {
        return this.claims;
    }

    public final String getExpectedNonce() {
        return this.expectedNonce;
    }

    public final AuthenticationTokenHeader getHeader() {
        return this.header;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.signature.hashCode() + ((this.claims.hashCode() + ((this.header.hashCode() + in1.j(this.expectedNonce, in1.j(this.token, 527, 31), 31)) * 31)) * 31);
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TOKEN_STRING_KEY, this.token);
        jSONObject.put(EXPECTED_NONCE_KEY, this.expectedNonce);
        jSONObject.put(HEADER_KEY, this.header.toJSONObject$facebook_core_release());
        jSONObject.put(CLAIMS_KEY, this.claims.toJSONObject$facebook_core_release());
        jSONObject.put(SIGNATURE_KEY, this.signature);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.expectedNonce);
        parcel.writeParcelable(this.header, i);
        parcel.writeParcelable(this.claims, i);
        parcel.writeString(this.signature);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthenticationToken getCurrentAuthenticationToken() {
            return AuthenticationTokenManager.Companion.getInstance().getCurrentAuthenticationToken();
        }

        public final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.Companion.getInstance().setCurrentAuthenticationToken(authenticationToken);
        }

        private Companion() {
        }
    }

    public AuthenticationToken(Parcel parcel) {
        parcel.getClass();
        this.token = Validate.notNullOrEmpty(parcel.readString(), "token");
        this.expectedNonce = Validate.notNullOrEmpty(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (readParcelable != null) {
            this.header = (AuthenticationTokenHeader) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (readParcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) readParcelable2;
                this.signature = Validate.notNullOrEmpty(parcel.readString(), SIGNATURE_KEY);
                return;
            } else {
                lh.g("Required value was null.");
                throw null;
            }
        }
        lh.g("Required value was null.");
        throw null;
    }

    public AuthenticationToken(JSONObject jSONObject) {
        jSONObject.getClass();
        String string = jSONObject.getString(TOKEN_STRING_KEY);
        string.getClass();
        this.token = string;
        String string2 = jSONObject.getString(EXPECTED_NONCE_KEY);
        string2.getClass();
        this.expectedNonce = string2;
        String string3 = jSONObject.getString(SIGNATURE_KEY);
        string3.getClass();
        this.signature = string3;
        JSONObject jSONObject2 = jSONObject.getJSONObject(HEADER_KEY);
        JSONObject jSONObject3 = jSONObject.getJSONObject(CLAIMS_KEY);
        jSONObject2.getClass();
        this.header = new AuthenticationTokenHeader(jSONObject2);
        AuthenticationTokenClaims.Companion companion = AuthenticationTokenClaims.Companion;
        jSONObject3.getClass();
        this.claims = companion.createFromJSONObject$facebook_core_release(jSONObject3);
    }
}
