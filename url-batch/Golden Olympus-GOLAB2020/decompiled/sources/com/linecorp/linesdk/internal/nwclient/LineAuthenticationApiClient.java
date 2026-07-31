package com.linecorp.linesdk.internal.nwclient;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.BuildConfig;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.Scope;
import com.linecorp.linesdk.internal.AccessTokenVerificationResult;
import com.linecorp.linesdk.internal.IdTokenKeyType;
import com.linecorp.linesdk.internal.InternalAccessToken;
import com.linecorp.linesdk.internal.IssueAccessTokenResult;
import com.linecorp.linesdk.internal.JWKSet;
import com.linecorp.linesdk.internal.OpenIdDiscoveryDocument;
import com.linecorp.linesdk.internal.RefreshTokenResult;
import com.linecorp.linesdk.internal.nwclient.core.ChannelServiceHttpClient;
import com.linecorp.linesdk.internal.nwclient.core.ResponseDataParser;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import com.linecorp.linesdk.utils.UriUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LineAuthenticationApiClient {
    private static final String AVAILABLE_TOKEN_TYPE = "Bearer";
    private static final String BASE_PATH_OAUTH_V21_API = "oauth2/v2.1";
    private static final ResponseDataParser<RefreshTokenResult> REFRESH_TOKEN_RESULT_PARSER;
    private static final String TAG = "LineAuthApiClient";
    private static final ResponseDataParser<AccessTokenVerificationResult> VERIFICATION_RESULT_PARSER;
    private final ResponseDataParser<IssueAccessTokenResult> ISSUE_ACCESS_TOKEN_RESULT_PARSER;

    @NonNull
    private final Uri apiBaseUrl;

    @NonNull
    private final ChannelServiceHttpClient httpClient;

    @NonNull
    private final Uri openidDiscoveryDocumentUrl;
    private final OpenIdSigningKeyResolver signingKeyResolver;
    private static final ResponseDataParser<?> NO_RESULT_RESPONSE_PARSER = new NoResultResponseParser();
    private static final ResponseDataParser<OpenIdDiscoveryDocument> OPEN_ID_DISCOVERY_DOCUMENT_PARSER = new OpenIdDiscoveryDocumentParser();
    private static final ResponseDataParser<JWKSet> JWK_SET_PARSER = new JWKSetParser();

    private class IssueAccessTokenResultParser extends JsonToObjectBaseResponseParser<IssueAccessTokenResult> {
        private IssueAccessTokenResultParser() {
        }

        private LineIdToken parseIdToken(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return IdTokenParser.parse(str, LineAuthenticationApiClient.this.signingKeyResolver);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public IssueAccessTokenResult parseJsonToObject(@NonNull JSONObject jSONObject) {
            String string = jSONObject.getString("token_type");
            if (LineAuthenticationApiClient.AVAILABLE_TOKEN_TYPE.equals(string)) {
                try {
                    return new IssueAccessTokenResult(new InternalAccessToken(jSONObject.getString("access_token"), 1000 * jSONObject.getLong("expires_in"), System.currentTimeMillis(), jSONObject.getString("refresh_token")), Scope.parseToList(jSONObject.getString("scope")), parseIdToken(jSONObject.optString("id_token")));
                } catch (Exception e4) {
                    throw new JSONException(e4.getMessage());
                }
            }
            throw new JSONException("Illegal token type. token_type=" + string);
        }
    }

    private static class RefreshTokenResultParser extends JsonToObjectBaseResponseParser<RefreshTokenResult> {
        private RefreshTokenResultParser() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public RefreshTokenResult parseJsonToObject(@NonNull JSONObject jSONObject) {
            String string = jSONObject.getString("token_type");
            if (LineAuthenticationApiClient.AVAILABLE_TOKEN_TYPE.equals(string)) {
                return new RefreshTokenResult(jSONObject.getString("access_token"), 1000 * jSONObject.getLong("expires_in"), jSONObject.getString("refresh_token"), Scope.parseToList(jSONObject.getString("scope")));
            }
            throw new JSONException("Illegal token type. token_type=" + string);
        }
    }

    private static class VerificationResultParser extends JsonToObjectBaseResponseParser<AccessTokenVerificationResult> {
        private VerificationResultParser() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public AccessTokenVerificationResult parseJsonToObject(@NonNull JSONObject jSONObject) {
            return new AccessTokenVerificationResult(jSONObject.getString("client_id"), jSONObject.getLong("expires_in") * 1000, Scope.parseToList(jSONObject.getString("scope")));
        }
    }

    static {
        VERIFICATION_RESULT_PARSER = new VerificationResultParser();
        REFRESH_TOKEN_RESULT_PARSER = new RefreshTokenResultParser();
    }

    public LineAuthenticationApiClient(@NonNull Context context, @NonNull Uri uri, @NonNull Uri uri2) {
        this(uri, uri2, new ChannelServiceHttpClient(context, BuildConfig.VERSION_NAME));
    }

    @NonNull
    public LineApiResponse<JWKSet> getJWKSet() {
        LineApiResponse<OpenIdDiscoveryDocument> openIdDiscoveryDocument = getOpenIdDiscoveryDocument();
        if (!openIdDiscoveryDocument.isSuccess()) {
            return LineApiResponse.createAsError(openIdDiscoveryDocument.getResponseCode(), openIdDiscoveryDocument.getErrorData());
        }
        Uri parse = Uri.parse(openIdDiscoveryDocument.getResponseData().getJwksUri());
        ChannelServiceHttpClient channelServiceHttpClient = this.httpClient;
        Map<String, String> map = Collections.EMPTY_MAP;
        LineApiResponse<JWKSet> lineApiResponse = channelServiceHttpClient.get(parse, map, map, JWK_SET_PARSER);
        if (!lineApiResponse.isSuccess()) {
            Log.e(TAG, "getJWKSet failed: " + lineApiResponse);
        }
        return lineApiResponse;
    }

    @NonNull
    public LineApiResponse<OpenIdDiscoveryDocument> getOpenIdDiscoveryDocument() {
        Uri buildUri = UriUtils.buildUri(this.openidDiscoveryDocumentUrl, new String[0]);
        ChannelServiceHttpClient channelServiceHttpClient = this.httpClient;
        Map<String, String> map = Collections.EMPTY_MAP;
        LineApiResponse<OpenIdDiscoveryDocument> lineApiResponse = channelServiceHttpClient.get(buildUri, map, map, OPEN_ID_DISCOVERY_DOCUMENT_PARSER);
        if (!lineApiResponse.isSuccess()) {
            Log.e(TAG, "getOpenIdDiscoveryDocument failed: " + lineApiResponse);
        }
        return lineApiResponse;
    }

    @NonNull
    public LineApiResponse<IssueAccessTokenResult> issueAccessToken(@NonNull String str, @NonNull String str2, @NonNull PKCECode pKCECode, @NonNull String str3) {
        return this.httpClient.post(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OAUTH_V21_API, "token"), Collections.EMPTY_MAP, UriUtils.buildParams("grant_type", "authorization_code", "code", str2, "redirect_uri", str3, "client_id", str, "code_verifier", pKCECode.getVerifier(), "id_token_key_type", IdTokenKeyType.JWK.name(), "client_version", "LINE SDK Android v5.8.1"), this.ISSUE_ACCESS_TOKEN_RESULT_PARSER);
    }

    @NonNull
    public LineApiResponse<RefreshTokenResult> refreshToken(@NonNull String str, @NonNull InternalAccessToken internalAccessToken) {
        return this.httpClient.post(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OAUTH_V21_API, "token"), Collections.EMPTY_MAP, UriUtils.buildParams("grant_type", "refresh_token", "refresh_token", internalAccessToken.getRefreshToken(), "client_id", str), REFRESH_TOKEN_RESULT_PARSER);
    }

    @NonNull
    public LineApiResponse<?> revokeAccessToken(@NonNull String str, @NonNull InternalAccessToken internalAccessToken) {
        return this.httpClient.post(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OAUTH_V21_API, "revoke"), Collections.EMPTY_MAP, UriUtils.buildParams("access_token", internalAccessToken.getAccessToken(), "client_id", str), NO_RESULT_RESPONSE_PARSER);
    }

    @NonNull
    public LineApiResponse<?> revokeRefreshToken(@NonNull String str, @NonNull InternalAccessToken internalAccessToken) {
        return this.httpClient.post(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OAUTH_V21_API, "revoke"), Collections.EMPTY_MAP, UriUtils.buildParams("refresh_token", internalAccessToken.getRefreshToken(), "client_id", str), NO_RESULT_RESPONSE_PARSER);
    }

    @NonNull
    public LineApiResponse<AccessTokenVerificationResult> verifyAccessToken(@NonNull InternalAccessToken internalAccessToken) {
        return this.httpClient.get(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OAUTH_V21_API, "verify"), Collections.EMPTY_MAP, UriUtils.buildParams("access_token", internalAccessToken.getAccessToken()), VERIFICATION_RESULT_PARSER);
    }

    LineAuthenticationApiClient(@NonNull Uri uri, @NonNull Uri uri2, @NonNull ChannelServiceHttpClient channelServiceHttpClient) {
        this.ISSUE_ACCESS_TOKEN_RESULT_PARSER = new IssueAccessTokenResultParser();
        this.signingKeyResolver = new OpenIdSigningKeyResolver(this);
        this.apiBaseUrl = uri2;
        this.httpClient = channelServiceHttpClient;
        this.openidDiscoveryDocumentUrl = uri;
    }
}
