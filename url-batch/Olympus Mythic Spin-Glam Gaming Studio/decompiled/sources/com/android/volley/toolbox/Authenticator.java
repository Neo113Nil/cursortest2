package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;

/* loaded from: classes12.dex */
public interface Authenticator {
    String getAuthToken() throws AuthFailureError;

    void invalidateAuthToken(String str);
}
