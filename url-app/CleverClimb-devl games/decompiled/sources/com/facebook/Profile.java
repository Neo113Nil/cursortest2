package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.ab;
import com.facebook.internal.ac;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new Parcelable.Creator() { // from class: com.facebook.Profile.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    };
    private final String firstName;
    private final String id;
    private final String lastName;
    private final Uri linkUri;
    private final String middleName;
    private final String name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static Profile getCurrentProfile() {
        return w.a().b();
    }

    public static void setCurrentProfile(Profile profile) {
        w.a().a(profile);
    }

    public static void fetchProfileForCurrentAccessToken() {
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken == null) {
            setCurrentProfile(null);
        } else {
            ab.a(currentAccessToken.getToken(), new ab.c() { // from class: com.facebook.Profile.1
                @Override // com.facebook.internal.ab.c
                public void a(j jVar) {
                }

                @Override // com.facebook.internal.ab.c
                public void a(JSONObject jSONObject) {
                    String optString = jSONObject.optString("id");
                    if (optString == null) {
                        return;
                    }
                    String optString2 = jSONObject.optString("link");
                    Profile.setCurrentProfile(new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null));
                }
            });
        }
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        ac.a(str, "id");
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        if (this.id.equals(profile.id) && this.firstName == null) {
            if (profile.firstName == null) {
                return true;
            }
        } else if (this.firstName.equals(profile.firstName) && this.middleName == null) {
            if (profile.middleName == null) {
                return true;
            }
        } else if (this.middleName.equals(profile.middleName) && this.lastName == null) {
            if (profile.lastName == null) {
                return true;
            }
        } else if (this.lastName.equals(profile.lastName) && this.name == null) {
            if (profile.name == null) {
                return true;
            }
        } else {
            if (!this.name.equals(profile.name) || this.linkUri != null) {
                return this.linkUri.equals(profile.linkUri);
            }
            if (profile.linkUri == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = 527 + this.id.hashCode();
        if (this.firstName != null) {
            hashCode = (hashCode * 31) + this.firstName.hashCode();
        }
        if (this.middleName != null) {
            hashCode = (hashCode * 31) + this.middleName.hashCode();
        }
        if (this.lastName != null) {
            hashCode = (hashCode * 31) + this.lastName.hashCode();
        }
        if (this.name != null) {
            hashCode = (hashCode * 31) + this.name.hashCode();
        }
        return this.linkUri != null ? (hashCode * 31) + this.linkUri.hashCode() : hashCode;
    }

    JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("first_name", this.firstName);
            jSONObject.put("middle_name", this.middleName);
            jSONObject.put("last_name", this.lastName);
            jSONObject.put("name", this.name);
            if (this.linkUri == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.linkUri.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    Profile(JSONObject jSONObject) {
        this.id = jSONObject.optString("id", null);
        this.firstName = jSONObject.optString("first_name", null);
        this.middleName = jSONObject.optString("middle_name", null);
        this.lastName = jSONObject.optString("last_name", null);
        this.name = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        this.linkUri = optString != null ? Uri.parse(optString) : null;
    }

    private Profile(Parcel parcel) {
        this.id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String readString = parcel.readString();
        this.linkUri = readString == null ? null : Uri.parse(readString);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.firstName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.name);
        parcel.writeString(this.linkUri == null ? null : this.linkUri.toString());
    }
}
