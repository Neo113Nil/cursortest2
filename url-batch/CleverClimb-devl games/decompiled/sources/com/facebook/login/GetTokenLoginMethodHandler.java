package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.ab;
import com.facebook.internal.x;
import com.facebook.j;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new Parcelable.Creator() { // from class: com.facebook.login.GetTokenLoginMethodHandler.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    };
    private c getTokenClient;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    String getNameForLogging() {
        return "get_token";
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // com.facebook.login.LoginMethodHandler
    void cancel() {
        if (this.getTokenClient != null) {
            this.getTokenClient.b();
            this.getTokenClient.a((x.a) null);
            this.getTokenClient = null;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    boolean tryAuthorize(final LoginClient.Request request) {
        this.getTokenClient = new c(this.loginClient.getActivity(), request.getApplicationId());
        if (!this.getTokenClient.a()) {
            return false;
        }
        this.loginClient.notifyBackgroundProcessingStart();
        this.getTokenClient.a(new x.a() { // from class: com.facebook.login.GetTokenLoginMethodHandler.1
            @Override // com.facebook.internal.x.a
            public void a(Bundle bundle) {
                GetTokenLoginMethodHandler.this.getTokenCompleted(request, bundle);
            }
        });
        return true;
    }

    void getTokenCompleted(LoginClient.Request request, Bundle bundle) {
        if (this.getTokenClient != null) {
            this.getTokenClient.a((x.a) null);
        }
        this.getTokenClient = null;
        this.loginClient.notifyBackgroundProcessingStop();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> permissions = request.getPermissions();
            if (stringArrayList != null && (permissions == null || stringArrayList.containsAll(permissions))) {
                complete(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : permissions) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                addLoggingExtra("new_permissions", TextUtils.join(",", hashSet));
            }
            request.setPermissions(hashSet);
        }
        this.loginClient.tryNextHandler();
    }

    void onComplete(LoginClient.Request request, Bundle bundle) {
        this.loginClient.completeAndValidate(LoginClient.Result.createTokenResult(this.loginClient.getPendingRequest(), createAccessTokenFromNativeLogin(bundle, com.facebook.c.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId())));
    }

    void complete(final LoginClient.Request request, final Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.loginClient.notifyBackgroundProcessingStart();
            ab.a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new ab.c() { // from class: com.facebook.login.GetTokenLoginMethodHandler.2
                @Override // com.facebook.internal.ab.c
                public void a(JSONObject jSONObject) {
                    try {
                        bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                        GetTokenLoginMethodHandler.this.onComplete(request, bundle);
                    } catch (JSONException e) {
                        GetTokenLoginMethodHandler.this.loginClient.complete(LoginClient.Result.createErrorResult(GetTokenLoginMethodHandler.this.loginClient.getPendingRequest(), "Caught exception", e.getMessage()));
                    }
                }

                @Override // com.facebook.internal.ab.c
                public void a(j jVar) {
                    GetTokenLoginMethodHandler.this.loginClient.complete(LoginClient.Result.createErrorResult(GetTokenLoginMethodHandler.this.loginClient.getPendingRequest(), "Caught exception", jVar.getMessage()));
                }
            });
        } else {
            onComplete(request, bundle);
        }
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
