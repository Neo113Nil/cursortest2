package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import com.facebook.common.util.UriUtil;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzflt implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzflv zza;

    zzflt(zzflv zzflvVar) {
        Objects.requireNonNull(zzflvVar);
        this.zza = zzflvVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME).getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                String.valueOf(string);
                zzflg.zza.booleanValue();
            }
        } catch (JSONException e) {
            zzfne.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
