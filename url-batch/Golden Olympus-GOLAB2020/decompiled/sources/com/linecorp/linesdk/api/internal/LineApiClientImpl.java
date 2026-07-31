package com.linecorp.linesdk.api.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.FriendSortField;
import com.linecorp.linesdk.GetFriendsResponse;
import com.linecorp.linesdk.GetGroupsResponse;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineFriendshipStatus;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.SendMessageResponse;
import com.linecorp.linesdk.api.LineApiClient;
import com.linecorp.linesdk.internal.AccessTokenCache;
import com.linecorp.linesdk.internal.AccessTokenVerificationResult;
import com.linecorp.linesdk.internal.InternalAccessToken;
import com.linecorp.linesdk.internal.RefreshTokenResult;
import com.linecorp.linesdk.internal.nwclient.LineAuthenticationApiClient;
import com.linecorp.linesdk.internal.nwclient.TalkApiClient;
import com.linecorp.linesdk.message.MessageData;
import com.linecorp.linesdk.openchat.MembershipStatus;
import com.linecorp.linesdk.openchat.OpenChatParameters;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import com.linecorp.linesdk.openchat.OpenChatRoomJoinType;
import com.linecorp.linesdk.openchat.OpenChatRoomStatus;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class LineApiClientImpl implements LineApiClient {
    private static final LineApiResponse ERROR_RESPONSE_NO_TOKEN = LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("access token is null"));

    @NonNull
    private final AccessTokenCache accessTokenCache;

    @NonNull
    private final String channelId;

    @NonNull
    private final LineAuthenticationApiClient oauthApiClient;

    @NonNull
    private final TalkApiClient talkApiClient;

    /* JADX INFO: Access modifiers changed from: private */
    @FunctionalInterface
    interface APIWithAccessToken<T> {
        LineApiResponse<T> call(InternalAccessToken internalAccessToken);
    }

    public LineApiClientImpl(@NonNull String str, @NonNull LineAuthenticationApiClient lineAuthenticationApiClient, @NonNull TalkApiClient talkApiClient, @NonNull AccessTokenCache accessTokenCache) {
        this.channelId = str;
        this.oauthApiClient = lineAuthenticationApiClient;
        this.talkApiClient = talkApiClient;
        this.accessTokenCache = accessTokenCache;
    }

    @NonNull
    private <T> LineApiResponse<T> callWithAccessToken(@NonNull APIWithAccessToken<T> aPIWithAccessToken) {
        try {
            InternalAccessToken accessToken = this.accessTokenCache.getAccessToken();
            return accessToken == null ? ERROR_RESPONSE_NO_TOKEN : aPIWithAccessToken.call(accessToken);
        } catch (Exception e4) {
            return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("get access token fail:" + e4.getMessage()));
        }
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public LineApiResponse<OpenChatRoomInfo> createOpenChatRoom(@NonNull final OpenChatParameters openChatParameters) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.m
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse createOpenChatRoom;
                createOpenChatRoom = LineApiClientImpl.this.talkApiClient.createOpenChatRoom(internalAccessToken, openChatParameters);
                return createOpenChatRoom;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public LineApiResponse<LineAccessToken> getCurrentAccessToken() {
        try {
            InternalAccessToken accessToken = this.accessTokenCache.getAccessToken();
            return accessToken == null ? LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("The cached access token does not exist.")) : LineApiResponse.createAsSuccess(new LineAccessToken(accessToken.getAccessToken(), accessToken.getExpiresInMillis(), accessToken.getIssuedClientTimeMillis()));
        } catch (Exception e4) {
            return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("get access token fail:" + e4.getMessage()));
        }
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<GetFriendsResponse> getFriends(@NonNull FriendSortField friendSortField, String str) {
        return getFriends(friendSortField, str, false);
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<GetFriendsResponse> getFriendsApprovers(final FriendSortField friendSortField, final String str) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.h
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse friendsApprovers;
                friendsApprovers = LineApiClientImpl.this.talkApiClient.getFriendsApprovers(internalAccessToken, friendSortField, str);
                return friendsApprovers;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<LineFriendshipStatus> getFriendshipStatus() {
        final TalkApiClient talkApiClient = this.talkApiClient;
        Objects.requireNonNull(talkApiClient);
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.a
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                return TalkApiClient.this.getFriendshipStatus(internalAccessToken);
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<GetFriendsResponse> getGroupApprovers(@NonNull final String str, final String str2) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.l
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse groupApprovers;
                groupApprovers = LineApiClientImpl.this.talkApiClient.getGroupApprovers(internalAccessToken, str, str2);
                return groupApprovers;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<GetGroupsResponse> getGroups(String str) {
        return getGroups(str, false);
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public LineApiResponse<Boolean> getOpenChatAgreementStatus() {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.g
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse openChatAgreementStatus;
                openChatAgreementStatus = LineApiClientImpl.this.talkApiClient.getOpenChatAgreementStatus(internalAccessToken);
                return openChatAgreementStatus;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public LineApiResponse<MembershipStatus> getOpenChatMembershipStatus(@NonNull final String str) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.o
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse openChatMembershipStatus;
                openChatMembershipStatus = LineApiClientImpl.this.talkApiClient.getOpenChatMembershipStatus(internalAccessToken, str);
                return openChatMembershipStatus;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public LineApiResponse<OpenChatRoomJoinType> getOpenChatRoomJoinType(@NonNull final String str) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.b
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse openChatRoomJoinType;
                openChatRoomJoinType = LineApiClientImpl.this.talkApiClient.getOpenChatRoomJoinType(internalAccessToken, str);
                return openChatRoomJoinType;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public LineApiResponse<OpenChatRoomStatus> getOpenChatRoomStatus(@NonNull final String str) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.i
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse openChatRoomStatus;
                openChatRoomStatus = LineApiClientImpl.this.talkApiClient.getOpenChatRoomStatus(internalAccessToken, str);
                return openChatRoomStatus;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<LineProfile> getProfile() {
        final TalkApiClient talkApiClient = this.talkApiClient;
        Objects.requireNonNull(talkApiClient);
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.k
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                return TalkApiClient.this.getProfile(internalAccessToken);
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public LineApiResponse<Boolean> joinOpenChatRoom(@NonNull final String str, @NonNull final String str2) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.c
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse joinOpenChatRoom;
                joinOpenChatRoom = LineApiClientImpl.this.talkApiClient.joinOpenChatRoom(internalAccessToken, str, str2);
                return joinOpenChatRoom;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public LineApiResponse<?> logout() {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.e
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse logout;
                logout = LineApiClientImpl.this.logout(internalAccessToken);
                return logout;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public LineApiResponse<LineAccessToken> refreshAccessToken() {
        try {
            InternalAccessToken accessToken = this.accessTokenCache.getAccessToken();
            if (accessToken == null || TextUtils.isEmpty(accessToken.getRefreshToken())) {
                return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("access token or refresh token is not found."));
            }
            LineApiResponse<RefreshTokenResult> refreshToken = this.oauthApiClient.refreshToken(this.channelId, accessToken);
            if (!refreshToken.isSuccess()) {
                return LineApiResponse.createAsError(refreshToken.getResponseCode(), refreshToken.getErrorData());
            }
            RefreshTokenResult responseData = refreshToken.getResponseData();
            InternalAccessToken internalAccessToken = new InternalAccessToken(responseData.getAccessToken(), responseData.getExpiresInMillis(), System.currentTimeMillis(), TextUtils.isEmpty(responseData.getRefreshToken()) ? accessToken.getRefreshToken() : responseData.getRefreshToken());
            try {
                this.accessTokenCache.saveAccessToken(internalAccessToken);
                return LineApiResponse.createAsSuccess(new LineAccessToken(internalAccessToken.getAccessToken(), internalAccessToken.getExpiresInMillis(), internalAccessToken.getIssuedClientTimeMillis()));
            } catch (Exception e4) {
                return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("save access token fail:" + e4.getMessage()));
            }
        } catch (Exception e5) {
            return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("get access token fail:" + e5.getMessage()));
        }
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<String> sendMessage(@NonNull final String str, @NonNull final List<MessageData> list) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.d
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse sendMessage;
                sendMessage = LineApiClientImpl.this.talkApiClient.sendMessage(internalAccessToken, str, list);
                return sendMessage;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<List<SendMessageResponse>> sendMessageToMultipleUsers(@NonNull List<String> list, @NonNull List<MessageData> list2) {
        return sendMessageToMultipleUsers(list, list2, false);
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    public LineApiResponse<LineCredential> verifyToken() {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.j
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse verifyToken;
                verifyToken = LineApiClientImpl.this.verifyToken(internalAccessToken);
                return verifyToken;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public LineApiResponse<?> logout(@NonNull InternalAccessToken internalAccessToken) {
        this.accessTokenCache.clear();
        return this.oauthApiClient.revokeRefreshToken(this.channelId, internalAccessToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public LineApiResponse<LineCredential> verifyToken(@NonNull InternalAccessToken internalAccessToken) {
        LineApiResponse<AccessTokenVerificationResult> verifyAccessToken = this.oauthApiClient.verifyAccessToken(internalAccessToken);
        if (!verifyAccessToken.isSuccess()) {
            return LineApiResponse.createAsError(verifyAccessToken.getResponseCode(), verifyAccessToken.getErrorData());
        }
        AccessTokenVerificationResult responseData = verifyAccessToken.getResponseData();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.accessTokenCache.saveAccessToken(new InternalAccessToken(internalAccessToken.getAccessToken(), responseData.getExpiresInMillis(), currentTimeMillis, internalAccessToken.getRefreshToken()));
            return LineApiResponse.createAsSuccess(new LineCredential(new LineAccessToken(internalAccessToken.getAccessToken(), responseData.getExpiresInMillis(), currentTimeMillis), responseData.getScopes()));
        } catch (Exception e4) {
            return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("save access token fail:" + e4.getMessage()));
        }
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<GetFriendsResponse> getFriends(@NonNull final FriendSortField friendSortField, final String str, final boolean z4) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.p
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse friends;
                friends = LineApiClientImpl.this.talkApiClient.getFriends(internalAccessToken, friendSortField, str, z4);
                return friends;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<GetGroupsResponse> getGroups(final String str, final boolean z4) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.n
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse groups;
                groups = LineApiClientImpl.this.talkApiClient.getGroups(internalAccessToken, str, z4);
                return groups;
            }
        });
    }

    @Override // com.linecorp.linesdk.api.LineApiClient
    @NonNull
    @TokenAutoRefresh
    public LineApiResponse<List<SendMessageResponse>> sendMessageToMultipleUsers(@NonNull final List<String> list, @NonNull final List<MessageData> list2, final boolean z4) {
        return callWithAccessToken(new APIWithAccessToken() { // from class: com.linecorp.linesdk.api.internal.f
            @Override // com.linecorp.linesdk.api.internal.LineApiClientImpl.APIWithAccessToken
            public final LineApiResponse call(InternalAccessToken internalAccessToken) {
                LineApiResponse sendMessageToMultipleUsers;
                sendMessageToMultipleUsers = LineApiClientImpl.this.talkApiClient.sendMessageToMultipleUsers(internalAccessToken, list, list2, z4);
                return sendMessageToMultipleUsers;
            }
        });
    }
}
