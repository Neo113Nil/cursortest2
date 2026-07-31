package com.linecorp.linesdk.api;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.ManifestParser;
import com.linecorp.linesdk.api.internal.AutoRefreshLineApiClientProxy;
import com.linecorp.linesdk.api.internal.LineApiClientImpl;
import com.linecorp.linesdk.internal.AccessTokenCache;
import com.linecorp.linesdk.internal.EncryptorHolder;
import com.linecorp.linesdk.internal.nwclient.LineAuthenticationApiClient;
import com.linecorp.linesdk.internal.nwclient.TalkApiClient;

/* loaded from: classes2.dex */
public class LineApiClientBuilder {

    @NonNull
    private Uri apiBaseUri;

    @NonNull
    private final String channelId;

    @NonNull
    private final Context context;
    private boolean isEncryptorPreparationDisabled;
    private boolean isTokenAutoRefreshDisabled;

    @NonNull
    private Uri openidDiscoveryDocumentUrl;

    public LineApiClientBuilder(@NonNull Context context, @NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("channel id is empty");
        }
        this.context = context.getApplicationContext();
        this.channelId = str;
        LineEnvConfig parse = new ManifestParser().parse(context);
        parse = parse == null ? new LineDefaultEnvConfig() : parse;
        this.openidDiscoveryDocumentUrl = Uri.parse(parse.getOpenIdDiscoveryDocumentUrl());
        this.apiBaseUri = Uri.parse(parse.getApiServerBaseUri());
    }

    @NonNull
    @Deprecated
    public LineApiClientBuilder apiBaseUri(Uri uri) {
        if (uri != null) {
            this.apiBaseUri = uri;
        }
        return this;
    }

    @NonNull
    public LineApiClient build() {
        if (!this.isEncryptorPreparationDisabled) {
            EncryptorHolder.initializeOnWorkerThread(this.context);
        }
        LineApiClientImpl lineApiClientImpl = new LineApiClientImpl(this.channelId, new LineAuthenticationApiClient(this.context, this.openidDiscoveryDocumentUrl, this.apiBaseUri), new TalkApiClient(this.context, this.apiBaseUri), new AccessTokenCache(this.context, this.channelId));
        return this.isTokenAutoRefreshDisabled ? lineApiClientImpl : AutoRefreshLineApiClientProxy.newProxy(lineApiClientImpl);
    }

    @NonNull
    public LineApiClientBuilder disableEncryptorPreparation() {
        this.isEncryptorPreparationDisabled = true;
        return this;
    }

    @NonNull
    public LineApiClientBuilder disableTokenAutoRefresh() {
        this.isTokenAutoRefreshDisabled = true;
        return this;
    }

    @NonNull
    @Deprecated
    public LineApiClientBuilder openidDiscoveryDocumentUrl(Uri uri) {
        if (uri != null) {
            this.openidDiscoveryDocumentUrl = uri;
        }
        return this;
    }
}
