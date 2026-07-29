package com.mopub.common.privacy;

import android.content.Context;
import android.text.TextUtils;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.MoPubRequest;
import com.mopub.volley.DefaultRetryPolicy;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.Response;
import com.mopub.volley.toolbox.HttpHeaderParser;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class ConsentDialogRequest extends MoPubRequest<ConsentDialogResponse> {
    private static final String HTML_KEY = "dialog_html";
    private Listener mListener;

    public interface Listener extends Response.ErrorListener {
        void onSuccess(ConsentDialogResponse consentDialogResponse);
    }

    ConsentDialogRequest(Context context, String str, Listener listener) {
        super(context, str, listener);
        this.mListener = listener;
        setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 1, 1.0f));
        setShouldCache(false);
    }

    @Override // com.mopub.volley.Request
    protected Response<ConsentDialogResponse> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            String string = new JSONObject(parseStringBody(networkResponse)).getString(HTML_KEY);
            if (TextUtils.isEmpty(string)) {
                throw new JSONException("Empty HTML body");
            }
            return Response.success(new ConsentDialogResponse(string), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (JSONException unused) {
            return Response.error(new MoPubNetworkError("Unable to parse consent dialog request network response.", MoPubNetworkError.Reason.BAD_BODY, (Integer) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mopub.volley.Request
    public void deliverResponse(ConsentDialogResponse consentDialogResponse) {
        if (this.mListener != null) {
            this.mListener.onSuccess(consentDialogResponse);
        }
    }
}
