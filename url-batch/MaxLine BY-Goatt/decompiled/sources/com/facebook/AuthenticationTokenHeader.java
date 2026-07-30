package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.Validate;
import defpackage.in1;
import defpackage.lh;
import defpackage.yt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AuthenticationTokenHeader implements Parcelable {
    private final String alg;
    private final String kid;
    private final String typ;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new Parcelable.Creator<AuthenticationTokenHeader>() { // from class: com.facebook.AuthenticationTokenHeader$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationTokenHeader createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AuthenticationTokenHeader(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationTokenHeader[] newArray(int i) {
            return new AuthenticationTokenHeader[i];
        }
    };

    public AuthenticationTokenHeader(String str) {
        str.getClass();
        if (!isValidHeader(str)) {
            lh.e("Invalid Header");
            throw null;
        }
        byte[] decode = Base64.decode(str, 0);
        decode.getClass();
        JSONObject jSONObject = new JSONObject(new String(decode, yt.b));
        String string = jSONObject.getString("alg");
        string.getClass();
        this.alg = string;
        String string2 = jSONObject.getString("typ");
        string2.getClass();
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        string3.getClass();
        this.kid = string3;
    }

    private final boolean isValidHeader(String str) {
        boolean z;
        boolean z2;
        String optString;
        Validate.notEmpty(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        decode.getClass();
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, yt.b));
            String optString2 = jSONObject.optString("alg");
            optString2.getClass();
            z = optString2.length() > 0 && Intrinsics.b(optString2, "RS256");
            String optString3 = jSONObject.optString("kid");
            optString3.getClass();
            z2 = optString3.length() > 0;
            optString = jSONObject.optString("typ");
            optString.getClass();
        } catch (JSONException unused) {
        }
        return z && z2 && (optString.length() > 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return Intrinsics.b(this.alg, authenticationTokenHeader.alg) && Intrinsics.b(this.typ, authenticationTokenHeader.typ) && Intrinsics.b(this.kid, authenticationTokenHeader.kid);
    }

    public final String getAlg() {
        return this.alg;
    }

    public final String getKid() {
        return this.kid;
    }

    public final String getTyp() {
        return this.typ;
    }

    public int hashCode() {
        return this.kid.hashCode() + in1.j(this.typ, in1.j(this.alg, 527, 31), 31);
    }

    public final String toEnCodedString() {
        byte[] bytes = toString().getBytes(yt.b);
        bytes.getClass();
        String encodeToString = Base64.encodeToString(bytes, 0);
        encodeToString.getClass();
        return encodeToString;
    }

    public final JSONObject toJSONObject$facebook_core_release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put("typ", this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    public String toString() {
        String jSONObject = toJSONObject$facebook_core_release().toString();
        jSONObject.getClass();
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.alg);
        parcel.writeString(this.typ);
        parcel.writeString(this.kid);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        parcel.getClass();
        this.alg = Validate.notNullOrEmpty(parcel.readString(), "alg");
        this.typ = Validate.notNullOrEmpty(parcel.readString(), "typ");
        this.kid = Validate.notNullOrEmpty(parcel.readString(), "kid");
    }

    public AuthenticationTokenHeader(JSONObject jSONObject) {
        jSONObject.getClass();
        String string = jSONObject.getString("alg");
        string.getClass();
        this.alg = string;
        String string2 = jSONObject.getString("typ");
        string2.getClass();
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        string3.getClass();
        this.kid = string3;
    }

    public AuthenticationTokenHeader(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.alg = str;
        this.typ = str2;
        this.kid = str3;
    }
}
