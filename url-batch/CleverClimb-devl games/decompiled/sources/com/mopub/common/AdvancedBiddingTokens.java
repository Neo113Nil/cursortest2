package com.mopub.common;

import android.content.Context;
import android.os.AsyncTask;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Reflection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdvancedBiddingTokens implements AdvancedBiddersInitializedListener {
    private static final String TOKEN_KEY = "token";
    private List<MoPubAdvancedBidder> mAdvancedBidders = new ArrayList();
    private final SdkInitializationListener mSdkInitializationListener;

    public AdvancedBiddingTokens(SdkInitializationListener sdkInitializationListener) {
        this.mSdkInitializationListener = sdkInitializationListener;
    }

    public void addAdvancedBidders(List<Class<? extends MoPubAdvancedBidder>> list) {
        Preconditions.checkNotNull(list);
        new AdvancedBiddersInitializationAsyncTask(list, this).execute(new Void[0]);
    }

    String getTokensAsJsonString(Context context) {
        Preconditions.checkNotNull(context);
        JSONObject tokensAsJsonObject = getTokensAsJsonObject(context);
        if (tokensAsJsonObject == null) {
            return null;
        }
        return tokensAsJsonObject.toString();
    }

    private JSONObject getTokensAsJsonObject(Context context) {
        Preconditions.checkNotNull(context);
        if (this.mAdvancedBidders.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (MoPubAdvancedBidder moPubAdvancedBidder : this.mAdvancedBidders) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TOKEN_KEY, moPubAdvancedBidder.getToken(context));
                jSONObject.put(moPubAdvancedBidder.getCreativeNetworkName(), jSONObject2);
            } catch (JSONException unused) {
                MoPubLog.d("JSON parsing failed for creative network name: " + moPubAdvancedBidder.getCreativeNetworkName());
            }
        }
        return jSONObject;
    }

    @Override // com.mopub.common.AdvancedBiddersInitializedListener
    public void onAdvancedBiddersInitialized(List<MoPubAdvancedBidder> list) {
        Preconditions.checkNotNull(list);
        this.mAdvancedBidders = list;
        if (this.mSdkInitializationListener != null) {
            this.mSdkInitializationListener.onInitializationFinished();
        }
    }

    private static class AdvancedBiddersInitializationAsyncTask extends AsyncTask<Void, Void, List<MoPubAdvancedBidder>> {
        private final List<Class<? extends MoPubAdvancedBidder>> advancedBidderClasses;
        private final AdvancedBiddersInitializedListener mAdvancedBiddersInitializedListener;

        AdvancedBiddersInitializationAsyncTask(List<Class<? extends MoPubAdvancedBidder>> list, AdvancedBiddersInitializedListener advancedBiddersInitializedListener) {
            Preconditions.checkNotNull(list);
            Preconditions.checkNotNull(advancedBiddersInitializedListener);
            this.advancedBidderClasses = list;
            this.mAdvancedBiddersInitializedListener = advancedBiddersInitializedListener;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public List<MoPubAdvancedBidder> doInBackground(Void... voidArr) {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends MoPubAdvancedBidder> cls : this.advancedBidderClasses) {
                try {
                    arrayList.add((MoPubAdvancedBidder) Reflection.instantiateClassWithEmptyConstructor(cls.getName(), MoPubAdvancedBidder.class));
                } catch (Exception unused) {
                    MoPubLog.e("Unable to find class " + cls.getName());
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(List<MoPubAdvancedBidder> list) {
            this.mAdvancedBiddersInitializedListener.onAdvancedBiddersInitialized(list);
        }
    }
}
