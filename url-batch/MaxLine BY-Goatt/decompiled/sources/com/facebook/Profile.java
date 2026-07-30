package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Profile implements Parcelable {
    private static final String FIRST_NAME_KEY = "first_name";
    private static final String ID_KEY = "id";
    private static final String LAST_NAME_KEY = "last_name";
    private static final String LINK_URI_KEY = "link_uri";
    private static final String MIDDLE_NAME_KEY = "middle_name";
    private static final String NAME_KEY = "name";
    private static final String PICTURE_URI_KEY = "picture_uri";
    private final String firstName;
    private final String id;
    private final String lastName;
    private final Uri linkUri;
    private final String middleName;
    private final String name;
    private final Uri pictureUri;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "Profile";
    public static final Parcelable.Creator<Profile> CREATOR = new Parcelable.Creator<Profile>() { // from class: com.facebook.Profile$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Profile createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Profile(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    };

    public Profile(JSONObject jSONObject) {
        jSONObject.getClass();
        this.id = jSONObject.optString("id", null);
        this.firstName = jSONObject.optString(FIRST_NAME_KEY, null);
        this.middleName = jSONObject.optString("middle_name", null);
        this.lastName = jSONObject.optString(LAST_NAME_KEY, null);
        this.name = jSONObject.optString("name", null);
        String optString = jSONObject.optString(LINK_URI_KEY, null);
        this.linkUri = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString(PICTURE_URI_KEY, null);
        this.pictureUri = optString2 != null ? Uri.parse(optString2) : null;
    }

    public static final void fetchProfileForCurrentAccessToken() {
        Companion.fetchProfileForCurrentAccessToken();
    }

    public static final Profile getCurrentProfile() {
        return Companion.getCurrentProfile();
    }

    public static final void setCurrentProfile(Profile profile) {
        Companion.setCurrentProfile(profile);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.id;
        return ((str5 == null && ((Profile) obj).id == null) || Intrinsics.b(str5, ((Profile) obj).id)) && (((str = this.firstName) == null && ((Profile) obj).firstName == null) || Intrinsics.b(str, ((Profile) obj).firstName)) && ((((str2 = this.middleName) == null && ((Profile) obj).middleName == null) || Intrinsics.b(str2, ((Profile) obj).middleName)) && ((((str3 = this.lastName) == null && ((Profile) obj).lastName == null) || Intrinsics.b(str3, ((Profile) obj).lastName)) && ((((str4 = this.name) == null && ((Profile) obj).name == null) || Intrinsics.b(str4, ((Profile) obj).name)) && ((((uri = this.linkUri) == null && ((Profile) obj).linkUri == null) || Intrinsics.b(uri, ((Profile) obj).linkUri)) && (((uri2 = this.pictureUri) == null && ((Profile) obj).pictureUri == null) || Intrinsics.b(uri2, ((Profile) obj).pictureUri))))));
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final Uri getLinkUri() {
        return this.linkUri;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getPictureUri() {
        return this.pictureUri;
    }

    public final Uri getProfilePictureUri(int i, int i2) {
        String str;
        Uri uri = this.pictureUri;
        if (uri != null) {
            return uri;
        }
        AccessToken.Companion companion = AccessToken.Companion;
        if (companion.isCurrentAccessTokenActive()) {
            AccessToken currentAccessToken = companion.getCurrentAccessToken();
            str = currentAccessToken != null ? currentAccessToken.getToken() : null;
        } else {
            str = com.google.firebase.encoders.json.BuildConfig.FLAVOR;
        }
        return ImageRequest.Companion.getProfilePictureUri(this.id, i, i2, str);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.firstName;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.middleName;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.lastName;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.name;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.linkUri;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.pictureUri;
        if (uri2 != null) {
            return uri2.hashCode() + (hashCode * 31);
        }
        return hashCode;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put(FIRST_NAME_KEY, this.firstName);
            jSONObject.put("middle_name", this.middleName);
            jSONObject.put(LAST_NAME_KEY, this.lastName);
            jSONObject.put("name", this.name);
            Uri uri = this.linkUri;
            if (uri != null) {
                jSONObject.put(LINK_URI_KEY, uri.toString());
            }
            Uri uri2 = this.pictureUri;
            if (uri2 != null) {
                jSONObject.put(PICTURE_URI_KEY, uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.firstName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.name);
        Uri uri = this.linkUri;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.pictureUri;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void fetchProfileForCurrentAccessToken() {
            AccessToken.Companion companion = AccessToken.Companion;
            AccessToken currentAccessToken = companion.getCurrentAccessToken();
            if (currentAccessToken == null) {
                return;
            }
            if (companion.isCurrentAccessTokenActive()) {
                Utility.getGraphMeRequestWithCacheAsync(currentAccessToken.getToken(), new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.Profile$Companion$fetchProfileForCurrentAccessToken$1
                    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                    public void onFailure(FacebookException facebookException) {
                        String str;
                        str = Profile.TAG;
                        Log.e(str, "Got unexpected exception: " + facebookException);
                    }

                    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                    public void onSuccess(JSONObject jSONObject) {
                        String str;
                        String optString = jSONObject != null ? jSONObject.optString("id") : null;
                        if (optString == null) {
                            str = Profile.TAG;
                            Log.w(str, "No user ID returned on Me request");
                        } else {
                            String optString2 = jSONObject.optString("link");
                            String optString3 = jSONObject.optString("profile_picture", null);
                            Profile.Companion.setCurrentProfile(new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_MIDDLE_NAME), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null, optString3 != null ? Uri.parse(optString3) : null));
                        }
                    }
                });
            } else {
                setCurrentProfile(null);
            }
        }

        public final Profile getCurrentProfile() {
            return ProfileManager.Companion.getInstance().getCurrentProfile();
        }

        public final void setCurrentProfile(Profile profile) {
            ProfileManager.Companion.getInstance().setCurrentProfile(profile);
        }

        private Companion() {
        }
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        this(str, str2, str3, str4, str5, uri, null, 64, null);
    }

    public /* synthetic */ Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, uri, (i & 64) != 0 ? null : uri2);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        Validate.notNullOrEmpty(str, "id");
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
        this.pictureUri = uri2;
    }

    public /* synthetic */ Profile(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private Profile(Parcel parcel) {
        this.id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String readString = parcel.readString();
        this.linkUri = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.pictureUri = readString2 != null ? Uri.parse(readString2) : null;
    }
}
