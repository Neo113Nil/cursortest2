package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.facebook.internal.ab;
import com.tapjoy.TJAdUnitConstants;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class FacebookRequestError implements Parcelable {
    private final Object batchRequestResult;
    private final a category;
    private final HttpURLConnection connection;
    private final int errorCode;
    private final String errorMessage;
    private final String errorRecoveryMessage;
    private final String errorType;
    private final String errorUserMessage;
    private final String errorUserTitle;
    private final j exception;
    private final JSONObject requestResult;
    private final JSONObject requestResultBody;
    private final int requestStatusCode;
    private final int subErrorCode;
    static final b HTTP_RANGE_SUCCESS = new b(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, 299);
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new Parcelable.Creator<FacebookRequestError>() { // from class: com.facebook.FacebookRequestError.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    };

    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f4697a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4698b;

        private b(int i, int i2) {
            this.f4697a = i;
            this.f4698b = i2;
        }

        boolean a(int i) {
            return this.f4697a <= i && i <= this.f4698b;
        }
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, j jVar) {
        boolean z2;
        this.requestStatusCode = i;
        this.errorCode = i2;
        this.subErrorCode = i3;
        this.errorType = str;
        this.errorMessage = str2;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        if (jVar != null) {
            this.exception = jVar;
            z2 = true;
        } else {
            this.exception = new n(this, str2);
            z2 = false;
        }
        com.facebook.internal.j errorClassification = getErrorClassification();
        this.category = z2 ? a.OTHER : errorClassification.a(i2, i3, z);
        this.errorRecoveryMessage = errorClassification.a(this.category);
    }

    FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, exc instanceof j ? (j) exc : new j(exc));
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    public int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getSubErrorCode() {
        return this.subErrorCode;
    }

    public String getErrorType() {
        return this.errorType;
    }

    public String getErrorMessage() {
        if (this.errorMessage != null) {
            return this.errorMessage;
        }
        return this.exception.getLocalizedMessage();
    }

    public j getException() {
        return this.exception;
    }

    public String toString() {
        return "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", errorType: " + this.errorType + ", errorMessage: " + getErrorMessage() + "}";
    }

    static FacebookRequestError checkResponseAndCreateError(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        int optInt;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        try {
            if (jSONObject.has("code")) {
                int i = jSONObject.getInt("code");
                Object a2 = ab.a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (a2 != null && (a2 instanceof JSONObject)) {
                    JSONObject jSONObject2 = (JSONObject) a2;
                    boolean z2 = true;
                    int i2 = -1;
                    if (jSONObject2.has("error")) {
                        JSONObject jSONObject3 = (JSONObject) ab.a(jSONObject2, "error", (String) null);
                        str4 = jSONObject3.optString("type", null);
                        str3 = jSONObject3.optString(TJAdUnitConstants.String.MESSAGE, null);
                        int optInt2 = jSONObject3.optInt("code", -1);
                        int optInt3 = jSONObject3.optInt("error_subcode", -1);
                        String optString = jSONObject3.optString("error_user_msg", null);
                        str2 = jSONObject3.optString("error_user_title", null);
                        optInt = optInt3;
                        i2 = optInt2;
                        str = optString;
                        z = jSONObject3.optBoolean("is_transient", false);
                    } else {
                        if (!jSONObject2.has("error_code") && !jSONObject2.has("error_msg") && !jSONObject2.has("error_reason")) {
                            str4 = null;
                            str3 = null;
                            str = null;
                            str2 = null;
                            z2 = false;
                            optInt = -1;
                            z = false;
                        }
                        String optString2 = jSONObject2.optString("error_reason", null);
                        String optString3 = jSONObject2.optString("error_msg", null);
                        int optInt4 = jSONObject2.optInt("error_code", -1);
                        optInt = jSONObject2.optInt("error_subcode", -1);
                        i2 = optInt4;
                        str = null;
                        str2 = null;
                        z = false;
                        str3 = optString3;
                        str4 = optString2;
                    }
                    if (z2) {
                        return new FacebookRequestError(i, i2, optInt, str4, str3, str2, str, z, jSONObject2, jSONObject, obj, httpURLConnection, null);
                    }
                }
                if (!HTTP_RANGE_SUCCESS.a(i)) {
                    return new FacebookRequestError(i, -1, -1, null, null, null, null, false, jSONObject.has("body") ? (JSONObject) ab.a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT") : null, jSONObject, obj, httpURLConnection, null);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    static synchronized com.facebook.internal.j getErrorClassification() {
        synchronized (FacebookRequestError.class) {
            ab.b d2 = ab.d(l.i());
            if (d2 == null) {
                return com.facebook.internal.j.a();
            }
            return d2.f();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.requestStatusCode);
        parcel.writeInt(this.errorCode);
        parcel.writeInt(this.subErrorCode);
        parcel.writeString(this.errorType);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.errorUserTitle);
        parcel.writeString(this.errorUserMessage);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }
}
