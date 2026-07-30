package com.facebook.gamingservices;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.bolts.TaskCompletionSource;
import defpackage.ey;
import defpackage.oi;
import defpackage.py2;
import defpackage.uw0;
import defpackage.vw0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class TournamentFetcher {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchTournaments$lambda$1(TaskCompletionSource taskCompletionSource, GraphResponse graphResponse) {
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
        try {
            JSONObject jSONObject = graphResponse.getJSONObject();
            if (jSONObject == null) {
                taskCompletionSource.setError(new GraphAPIException("Failed to get response"));
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray.length() < 1) {
                taskCompletionSource.setError(new GraphAPIException(String.format(Locale.ROOT, "No tournament found", Arrays.copyOf(new Object[]{Integer.valueOf(jSONArray.length()), 1}, 2))));
                return;
            }
            uw0 a = new vw0().a();
            String jSONArray2 = jSONArray.toString();
            jSONArray2.getClass();
            Object a2 = a.a(jSONArray2);
            a2.getClass();
            taskCompletionSource.setResult(oi.y((Object[]) a2));
        } catch (JSONException e) {
            taskCompletionSource.setError(e);
        }
    }

    public final TaskCompletionSource<List<Tournament>> fetchTournaments() {
        TaskCompletionSource<List<Tournament>> taskCompletionSource = new TaskCompletionSource<>();
        Bundle bundle = new Bundle();
        AccessToken.Companion companion = AccessToken.Companion;
        AccessToken currentAccessToken = companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            ey.i("Attempted to fetch tournament with an invalid access token");
            return null;
        }
        if (currentAccessToken.getGraphDomain() == null || !FacebookSdk.GAMING.equals(currentAccessToken.getGraphDomain())) {
            ey.i("User is not using gaming login");
            return null;
        }
        GraphRequest graphRequest = new GraphRequest(companion.getCurrentAccessToken(), "me/tournaments", bundle, HttpMethod.GET, new py2(taskCompletionSource, 0), null, 32, null);
        graphRequest.setParameters(bundle);
        graphRequest.executeAsync();
        return taskCompletionSource;
    }
}
