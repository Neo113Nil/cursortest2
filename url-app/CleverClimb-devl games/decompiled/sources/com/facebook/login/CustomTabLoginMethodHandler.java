package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import com.facebook.internal.ab;
import com.facebook.internal.ac;
import com.facebook.l;
import com.facebook.login.LoginClient;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new Parcelable.Creator() { // from class: com.facebook.login.CustomTabLoginMethodHandler.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    };
    private com.facebook.internal.f customTab;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    String getNameForLogging() {
        return "custom_tab";
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    com.facebook.c getTokenSource() {
        return com.facebook.c.CHROME_CUSTOM_TAB;
    }

    @Override // com.facebook.login.LoginMethodHandler
    boolean tryAuthorize(LoginClient.Request request) {
        if (!isCustomTabsAllowed()) {
            return false;
        }
        Bundle addExtraParameters = addExtraParameters(getParameters(request), request);
        FragmentActivity activity = this.loginClient.getActivity();
        this.customTab = new com.facebook.internal.f("oauth", addExtraParameters);
        this.customTab.a(activity);
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    protected void putChallengeParam(JSONObject jSONObject) throws JSONException {
        if (this.loginClient.getFragment() instanceof LoginFragment) {
            jSONObject.put("7_challenge", ((LoginFragment) this.loginClient.getFragment()).a());
        }
    }

    private boolean isCustomTabsAllowed() {
        return isCustomTabsEnabled() && isChromeCustomTabsSupported(this.loginClient.getActivity()) && ac.c(l.f());
    }

    private boolean isChromeCustomTabsSupported(Context context) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage("com.android.chrome");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        return (queryIntentServices == null || queryIntentServices.isEmpty()) ? false : true;
    }

    private boolean isCustomTabsEnabled() {
        ab.b d2 = ab.d(ab.a(this.loginClient.getActivity()));
        return d2 != null && d2.d();
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
