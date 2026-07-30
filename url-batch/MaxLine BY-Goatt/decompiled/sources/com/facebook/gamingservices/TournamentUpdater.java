package com.facebook.gamingservices;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.internal.ServerProtocol;
import defpackage.ey;
import defpackage.py2;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class TournamentUpdater {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void update$lambda$0(TaskCompletionSource taskCompletionSource, GraphResponse graphResponse) {
        taskCompletionSource.getClass();
        graphResponse.getClass();
        if (graphResponse.getError() != null) {
            FacebookRequestError error = graphResponse.getError();
            if ((error != null ? error.getException() : null) == null) {
                taskCompletionSource.setError(new GraphAPIException("Graph API Error"));
                return;
            } else {
                FacebookRequestError error2 = graphResponse.getError();
                taskCompletionSource.setError(error2 != null ? error2.getException() : null);
                return;
            }
        }
        JSONObject jSONObject = graphResponse.getJSONObject();
        String optString = jSONObject != null ? jSONObject.optString("success") : null;
        if (optString == null || optString.length() == 0) {
            taskCompletionSource.setError(new GraphAPIException("Graph API Error"));
        } else {
            taskCompletionSource.setResult(Boolean.valueOf(optString.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)));
        }
    }

    public final TaskCompletionSource<Boolean> update(String str, Number number) {
        str.getClass();
        number.getClass();
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            ey.i("Attempted to fetch tournament with an invalid access token");
            return null;
        }
        if (currentAccessToken.getGraphDomain() == null || !FacebookSdk.GAMING.equals(currentAccessToken.getGraphDomain())) {
            ey.i("User is not using gaming login");
            return null;
        }
        TaskCompletionSource<Boolean> taskCompletionSource = new TaskCompletionSource<>();
        String concat = str.concat("/update_score");
        Bundle bundle = new Bundle();
        bundle.putInt("score", number.intValue());
        new GraphRequest(currentAccessToken, concat, bundle, HttpMethod.POST, new py2(taskCompletionSource, 1), null, 32, null).executeAsync();
        return taskCompletionSource;
    }

    public final TaskCompletionSource<Boolean> update(Tournament tournament, Number number) {
        tournament.getClass();
        number.getClass();
        return update(tournament.identifier, number);
    }
}
