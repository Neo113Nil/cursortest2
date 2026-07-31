package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.utils.DebugUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class LineCredential implements Parcelable {
    public static final Parcelable.Creator<LineCredential> CREATOR = new Parcelable.Creator<LineCredential>() { // from class: com.linecorp.linesdk.LineCredential.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineCredential createFromParcel(Parcel parcel) {
            return new LineCredential(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LineCredential[] newArray(int i4) {
            return new LineCredential[i4];
        }
    };

    @NonNull
    private final LineAccessToken accessToken;

    @NonNull
    private final List<Scope> scopes;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineCredential lineCredential = (LineCredential) obj;
        if (this.accessToken.equals(lineCredential.accessToken)) {
            return this.scopes.equals(lineCredential.scopes);
        }
        return false;
    }

    @NonNull
    public LineAccessToken getAccessToken() {
        return this.accessToken;
    }

    @NonNull
    public List<Scope> getScopes() {
        return this.scopes;
    }

    public int hashCode() {
        return (this.accessToken.hashCode() * 31) + this.scopes.hashCode();
    }

    public String toString() {
        return "LineCredential{accessToken=" + DebugUtils.hideIfNotDebug(this.accessToken) + ", scopes=" + this.scopes + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.accessToken, i4);
        parcel.writeStringList(Scope.convertToCodeList(this.scopes));
    }

    public LineCredential(@NonNull LineAccessToken lineAccessToken, @NonNull List<Scope> list) {
        this.accessToken = lineAccessToken;
        this.scopes = list;
    }

    private LineCredential(@NonNull Parcel parcel) {
        this.accessToken = (LineAccessToken) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.scopes = Scope.convertToScopeList(arrayList);
    }
}
