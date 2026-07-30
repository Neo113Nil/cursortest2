package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class AccountTokenResult implements Parcelable {
    public static final Parcelable.Creator<AccountTokenResult> CREATOR = new a();
    private final String access_token;
    private final int expires_in;
    private final long expires_time;
    private final String refresh_token;
    private final String scope;
    private final String session_key;
    private final String session_secret;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final AccountTokenResult createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new AccountTokenResult(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountTokenResult[] newArray(int i8) {
            return new AccountTokenResult[i8];
        }
    }

    public AccountTokenResult() {
        this(null, 0, null, null, null, null, 0L, 127, null);
    }

    public final String component1() {
        return this.refresh_token;
    }

    public final int component2() {
        return this.expires_in;
    }

    public final String component3() {
        return this.session_key;
    }

    public final String component4() {
        return this.access_token;
    }

    public final String component5() {
        return this.scope;
    }

    public final String component6() {
        return this.session_secret;
    }

    public final long component7() {
        return this.expires_time;
    }

    public final AccountTokenResult copy(String refresh_token, int i8, String session_key, String access_token, String scope, String session_secret, long j8) {
        s.checkNotNullParameter(refresh_token, "refresh_token");
        s.checkNotNullParameter(session_key, "session_key");
        s.checkNotNullParameter(access_token, "access_token");
        s.checkNotNullParameter(scope, "scope");
        s.checkNotNullParameter(session_secret, "session_secret");
        return new AccountTokenResult(refresh_token, i8, session_key, access_token, scope, session_secret, j8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTokenResult)) {
            return false;
        }
        AccountTokenResult accountTokenResult = (AccountTokenResult) obj;
        return s.areEqual(this.refresh_token, accountTokenResult.refresh_token) && this.expires_in == accountTokenResult.expires_in && s.areEqual(this.session_key, accountTokenResult.session_key) && s.areEqual(this.access_token, accountTokenResult.access_token) && s.areEqual(this.scope, accountTokenResult.scope) && s.areEqual(this.session_secret, accountTokenResult.session_secret) && this.expires_time == accountTokenResult.expires_time;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final int getExpires_in() {
        return this.expires_in;
    }

    public final long getExpires_time() {
        return this.expires_time;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getSession_key() {
        return this.session_key;
    }

    public final String getSession_secret() {
        return this.session_secret;
    }

    public int hashCode() {
        return (((((((((((this.refresh_token.hashCode() * 31) + this.expires_in) * 31) + this.session_key.hashCode()) * 31) + this.access_token.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.session_secret.hashCode()) * 31) + androidx.collection.a.a(this.expires_time);
    }

    public String toString() {
        return "AccountTokenResult(refresh_token=" + this.refresh_token + ", expires_in=" + this.expires_in + ", session_key=" + this.session_key + ", access_token=" + this.access_token + ", scope=" + this.scope + ", session_secret=" + this.session_secret + ", expires_time=" + this.expires_time + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.refresh_token);
        out.writeInt(this.expires_in);
        out.writeString(this.session_key);
        out.writeString(this.access_token);
        out.writeString(this.scope);
        out.writeString(this.session_secret);
        out.writeLong(this.expires_time);
    }

    public AccountTokenResult(String refresh_token, int i8, String session_key, String access_token, String scope, String session_secret, long j8) {
        s.checkNotNullParameter(refresh_token, "refresh_token");
        s.checkNotNullParameter(session_key, "session_key");
        s.checkNotNullParameter(access_token, "access_token");
        s.checkNotNullParameter(scope, "scope");
        s.checkNotNullParameter(session_secret, "session_secret");
        this.refresh_token = refresh_token;
        this.expires_in = i8;
        this.session_key = session_key;
        this.access_token = access_token;
        this.scope = scope;
        this.session_secret = session_secret;
        this.expires_time = j8;
    }

    public /* synthetic */ AccountTokenResult(String str, int i8, String str2, String str3, String str4, String str5, long j8, int i9, o oVar) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? 0 : i8, (i9 & 4) != 0 ? "" : str2, (i9 & 8) != 0 ? "" : str3, (i9 & 16) != 0 ? "" : str4, (i9 & 32) == 0 ? str5 : "", (i9 & 64) != 0 ? 0L : j8);
    }
}
