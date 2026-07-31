package com.linecorp.linesdk.internal.nwclient;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Scopes;
import com.ironsource.b9;
import com.linecorp.linesdk.BuildConfig;
import com.linecorp.linesdk.FriendSortField;
import com.linecorp.linesdk.GetFriendsResponse;
import com.linecorp.linesdk.GetGroupsResponse;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.LineFriendProfile;
import com.linecorp.linesdk.LineFriendshipStatus;
import com.linecorp.linesdk.LineGroup;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.SendMessageResponse;
import com.linecorp.linesdk.internal.InternalAccessToken;
import com.linecorp.linesdk.internal.nwclient.core.ChannelServiceHttpClient;
import com.linecorp.linesdk.internal.nwclient.core.ResponseDataParser;
import com.linecorp.linesdk.message.MessageData;
import com.linecorp.linesdk.message.MessageSendRequest;
import com.linecorp.linesdk.message.OttRequest;
import com.linecorp.linesdk.openchat.MembershipStatus;
import com.linecorp.linesdk.openchat.OpenChatParameters;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import com.linecorp.linesdk.openchat.OpenChatRoomJoinType;
import com.linecorp.linesdk.openchat.OpenChatRoomStatus;
import com.linecorp.linesdk.utils.UriUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TalkApiClient {
    private static final String BASE_PATH_COMMON_API = "v2";
    private static final String BASE_PATH_FRIENDSHIP_API = "friendship/v1";
    static final String BASE_PATH_GRAPH_API = "graph/v2";
    static final String BASE_PATH_MESSAGE_API = "message/v3";
    private static final String BASE_PATH_OPENCHAT_API = "openchat/v1";
    private static final ResponseDataParser<Boolean> OPEN_CHAT_AGREEMENT_STATUS_PARSER;
    private static final ResponseDataParser<MembershipStatus> OPEN_CHAT_MEMBERSHIP_PARSER;
    private static final ResponseDataParser<OpenChatRoomInfo> OPEN_CHAT_ROOM_INFO_PARSER;
    private static final ResponseDataParser<OpenChatRoomJoinType> OPEN_CHAT_ROOM_JOIN_TYPE_PARSER;
    private static final ResponseDataParser<OpenChatRoomStatus> OPEN_CHAT_ROOM_STATUS_PARSER;
    static final String PATH_FRIENDS = "friends";
    static final String PATH_GROUPS = "groups";
    static final String PATH_OTS_FRIENDS = "ots/friends";
    static final String PATH_OTS_GROUPS = "ots/groups";
    static final String PATH_OTT_ISSUE = "ott/issue";
    static final String PATH_OTT_SHARE = "ott/share";
    private static final String REQUEST_HEADER_ACCESS_TOKEN = "Authorization";
    private static final String TOKEN_TYPE_BEARER = "Bearer";

    @NonNull
    private final Uri apiBaseUrl;

    @NonNull
    private final ChannelServiceHttpClient httpClient;
    private static final ResponseDataParser<LineProfile> PROFILE_PARSER = new ProfileParser();
    private static final ResponseDataParser<LineFriendshipStatus> FRIENDSHIP_STATUS_PARSER = new FriendshipStatusParser();
    private static final ResponseDataParser<GetFriendsResponse> FRIENDS_PARSER = new FriendsParser();
    private static final ResponseDataParser<GetGroupsResponse> GROUP_PARSER = new GroupParser();
    private static final ResponseDataParser<List<SendMessageResponse>> MULTI_SEND_RESPONSE_PARSER = new MultiSendResponseParser();

    static class FriendProfileParser extends JsonToObjectBaseResponseParser<LineFriendProfile> {
        FriendProfileParser() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static LineFriendProfile parseLineFriendProfile(@NonNull JSONObject jSONObject) {
            LineProfile parseLineProfile = ProfileParser.parseLineProfile(jSONObject);
            return new LineFriendProfile(parseLineProfile.getUserId(), parseLineProfile.getDisplayName(), parseLineProfile.getPictureUrl(), parseLineProfile.getStatusMessage(), jSONObject.optString("displayNameOverridden", null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public LineFriendProfile parseJsonToObject(@NonNull JSONObject jSONObject) {
            return parseLineFriendProfile(jSONObject);
        }
    }

    static class FriendsParser extends JsonToObjectBaseResponseParser<GetFriendsResponse> {
        FriendsParser() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public GetFriendsResponse parseJsonToObject(@NonNull JSONObject jSONObject) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(TalkApiClient.PATH_FRIENDS);
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                arrayList.add(FriendProfileParser.parseLineFriendProfile(jSONArray.getJSONObject(i4)));
            }
            return new GetFriendsResponse(arrayList, jSONObject.optString("pageToken", null));
        }
    }

    static class FriendshipStatusParser extends JsonToObjectBaseResponseParser<LineFriendshipStatus> {
        FriendshipStatusParser() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public LineFriendshipStatus parseJsonToObject(@NonNull JSONObject jSONObject) {
            return new LineFriendshipStatus(jSONObject.getBoolean("friendFlag"));
        }
    }

    static class GroupParser extends JsonToObjectBaseResponseParser<GetGroupsResponse> {
        GroupParser() {
        }

        @NonNull
        private static LineGroup parseLineGroup(@NonNull JSONObject jSONObject) {
            String optString = jSONObject.optString("pictureUrl", null);
            return new LineGroup(jSONObject.getString("groupId"), jSONObject.getString("groupName"), optString != null ? Uri.parse(optString) : null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public GetGroupsResponse parseJsonToObject(@NonNull JSONObject jSONObject) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(TalkApiClient.PATH_GROUPS);
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                arrayList.add(parseLineGroup(jSONArray.getJSONObject(i4)));
            }
            return new GetGroupsResponse(arrayList, jSONObject.optString("pageToken", null));
        }
    }

    private static class MembershipStatusParser extends JsonToObjectBaseResponseParser<MembershipStatus> {
        private MembershipStatusParser() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public MembershipStatus parseJsonToObject(@NonNull JSONObject jSONObject) {
            return MembershipStatus.valueOf(jSONObject.getString(b9.h.f15456P).toUpperCase());
        }
    }

    static class MultiSendResponseParser extends JsonToObjectBaseResponseParser<List<SendMessageResponse>> {
        MultiSendResponseParser() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public List<SendMessageResponse> parseJsonToObject(@NonNull JSONObject jSONObject) {
            ArrayList arrayList = new ArrayList();
            if (jSONObject.has("results")) {
                JSONArray jSONArray = jSONObject.getJSONArray("results");
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(SendMessageResponse.fromJsonObject(jSONArray.getJSONObject(i4)));
                }
            }
            return arrayList;
        }
    }

    private static class OpenChatAgreementStatusParser extends JsonToObjectBaseResponseParser<Boolean> {
        private OpenChatAgreementStatusParser() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public Boolean parseJsonToObject(@NonNull JSONObject jSONObject) {
            return Boolean.valueOf(jSONObject.getBoolean("agreed"));
        }
    }

    private static class OpenChatRoomInfoParser extends JsonToObjectBaseResponseParser<OpenChatRoomInfo> {
        private OpenChatRoomInfoParser() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public OpenChatRoomInfo parseJsonToObject(@NonNull JSONObject jSONObject) {
            return new OpenChatRoomInfo(jSONObject.getString("openchatId"), jSONObject.getString("url"));
        }
    }

    private static class OpenChatRoomJoinTypeParser extends JsonToObjectBaseResponseParser<OpenChatRoomJoinType> {
        private OpenChatRoomJoinTypeParser() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public OpenChatRoomJoinType parseJsonToObject(@NonNull JSONObject jSONObject) {
            return OpenChatRoomJoinType.valueOf(jSONObject.getString("type").toUpperCase());
        }
    }

    private static class OpenChatRoomStatusParser extends JsonToObjectBaseResponseParser<OpenChatRoomStatus> {
        private OpenChatRoomStatusParser() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public OpenChatRoomStatus parseJsonToObject(@NonNull JSONObject jSONObject) {
            return OpenChatRoomStatus.valueOf(jSONObject.getString("status").toUpperCase());
        }
    }

    static class ProfileParser extends JsonToObjectBaseResponseParser<LineProfile> {
        ProfileParser() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static LineProfile parseLineProfile(@NonNull JSONObject jSONObject) {
            String optString = jSONObject.optString("pictureUrl", null);
            return new LineProfile(jSONObject.getString("userId"), jSONObject.getString("displayName"), optString == null ? null : Uri.parse(optString), jSONObject.optString("statusMessage", null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public LineProfile parseJsonToObject(@NonNull JSONObject jSONObject) {
            return parseLineProfile(jSONObject);
        }
    }

    static class StringParser extends JsonToObjectBaseResponseParser<String> {
        private String jsonKey;

        StringParser(String str) {
            this.jsonKey = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
        @NonNull
        public String parseJsonToObject(@NonNull JSONObject jSONObject) {
            return jSONObject.getString(this.jsonKey);
        }
    }

    static {
        OPEN_CHAT_AGREEMENT_STATUS_PARSER = new OpenChatAgreementStatusParser();
        OPEN_CHAT_ROOM_INFO_PARSER = new OpenChatRoomInfoParser();
        OPEN_CHAT_ROOM_STATUS_PARSER = new OpenChatRoomStatusParser();
        OPEN_CHAT_MEMBERSHIP_PARSER = new MembershipStatusParser();
        OPEN_CHAT_ROOM_JOIN_TYPE_PARSER = new OpenChatRoomJoinTypeParser();
    }

    public TalkApiClient(Context context, @NonNull Uri uri) {
        this(uri, new ChannelServiceHttpClient(context, BuildConfig.VERSION_NAME));
    }

    @NonNull
    private static Map<String, String> buildRequestHeaders(@NonNull InternalAccessToken internalAccessToken) {
        return UriUtils.buildParams(REQUEST_HEADER_ACCESS_TOKEN, "Bearer " + internalAccessToken.getAccessToken());
    }

    private <T> LineApiResponse<T> createInternalErrorResponse(Exception exc) {
        return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError(exc));
    }

    @NonNull
    private LineApiResponse<String> getOtt(@NonNull InternalAccessToken internalAccessToken, @NonNull List<String> list) {
        try {
            return this.httpClient.postWithJson(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_MESSAGE_API, PATH_OTT_ISSUE), buildRequestHeaders(internalAccessToken), new OttRequest(list).toJsonString(), new StringParser("token"));
        } catch (JSONException e4) {
            return LineApiResponse.createAsError(LineApiResponseCode.INTERNAL_ERROR, new LineApiError(e4));
        }
    }

    @NonNull
    private LineApiResponse<List<SendMessageResponse>> sendMessageToMultipleUsersUsingUserIds(@NonNull InternalAccessToken internalAccessToken, @NonNull List<String> list, @NonNull List<MessageData> list2) {
        try {
            return this.httpClient.postWithJson(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_MESSAGE_API, "multisend"), buildRequestHeaders(internalAccessToken), MessageSendRequest.createMultiUsersType(list, list2).toJsonString(), MULTI_SEND_RESPONSE_PARSER);
        } catch (JSONException e4) {
            return createInternalErrorResponse(e4);
        }
    }

    @NonNull
    public LineApiResponse<OpenChatRoomInfo> createOpenChatRoom(@NonNull InternalAccessToken internalAccessToken, @NonNull OpenChatParameters openChatParameters) {
        return this.httpClient.postWithJson(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OPENCHAT_API, "openchats"), buildRequestHeaders(internalAccessToken), openChatParameters.toJsonString(), OPEN_CHAT_ROOM_INFO_PARSER);
    }

    @NonNull
    public LineApiResponse<GetFriendsResponse> getFriends(@NonNull InternalAccessToken internalAccessToken, @NonNull FriendSortField friendSortField, String str, boolean z4) {
        Uri buildUri = UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_GRAPH_API, z4 ? PATH_OTS_FRIENDS : PATH_FRIENDS);
        Map<String, String> buildParams = UriUtils.buildParams("sort", friendSortField.getServerKey());
        if (!TextUtils.isEmpty(str)) {
            buildParams.put("pageToken", str);
        }
        return this.httpClient.get(buildUri, buildRequestHeaders(internalAccessToken), buildParams, FRIENDS_PARSER);
    }

    @NonNull
    public LineApiResponse<GetFriendsResponse> getFriendsApprovers(@NonNull InternalAccessToken internalAccessToken, @NonNull FriendSortField friendSortField, String str) {
        Uri buildUri = UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_GRAPH_API, PATH_FRIENDS, "approvers");
        Map<String, String> buildParams = UriUtils.buildParams("sort", friendSortField.getServerKey());
        if (!TextUtils.isEmpty(str)) {
            buildParams.put("pageToken", str);
        }
        return this.httpClient.get(buildUri, buildRequestHeaders(internalAccessToken), buildParams, FRIENDS_PARSER);
    }

    @NonNull
    public LineApiResponse<LineFriendshipStatus> getFriendshipStatus(@NonNull InternalAccessToken internalAccessToken) {
        return this.httpClient.get(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_FRIENDSHIP_API, "status"), buildRequestHeaders(internalAccessToken), Collections.EMPTY_MAP, FRIENDSHIP_STATUS_PARSER);
    }

    @NonNull
    public LineApiResponse<GetFriendsResponse> getGroupApprovers(@NonNull InternalAccessToken internalAccessToken, @NonNull String str, String str2) {
        return this.httpClient.get(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_GRAPH_API, PATH_GROUPS, str, "approvers"), buildRequestHeaders(internalAccessToken), !TextUtils.isEmpty(str2) ? UriUtils.buildParams("pageToken", str2) : Collections.EMPTY_MAP, FRIENDS_PARSER);
    }

    @NonNull
    public LineApiResponse<GetGroupsResponse> getGroups(@NonNull InternalAccessToken internalAccessToken, String str, boolean z4) {
        return this.httpClient.get(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_GRAPH_API, z4 ? PATH_OTS_GROUPS : PATH_GROUPS), buildRequestHeaders(internalAccessToken), !TextUtils.isEmpty(str) ? UriUtils.buildParams("pageToken", str) : Collections.EMPTY_MAP, GROUP_PARSER);
    }

    @NonNull
    public LineApiResponse<Boolean> getOpenChatAgreementStatus(@NonNull InternalAccessToken internalAccessToken) {
        return this.httpClient.get(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OPENCHAT_API, "terms/agreement"), buildRequestHeaders(internalAccessToken), Collections.EMPTY_MAP, OPEN_CHAT_AGREEMENT_STATUS_PARSER);
    }

    @NonNull
    public LineApiResponse<MembershipStatus> getOpenChatMembershipStatus(@NonNull InternalAccessToken internalAccessToken, @NonNull String str) {
        return this.httpClient.get(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OPENCHAT_API, "openchats", str, "members/me/membership"), buildRequestHeaders(internalAccessToken), Collections.EMPTY_MAP, OPEN_CHAT_MEMBERSHIP_PARSER);
    }

    @NonNull
    public LineApiResponse<OpenChatRoomJoinType> getOpenChatRoomJoinType(@NonNull InternalAccessToken internalAccessToken, @NonNull String str) {
        return this.httpClient.get(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OPENCHAT_API, "openchats", str, "type"), buildRequestHeaders(internalAccessToken), Collections.EMPTY_MAP, OPEN_CHAT_ROOM_JOIN_TYPE_PARSER);
    }

    @NonNull
    public LineApiResponse<OpenChatRoomStatus> getOpenChatRoomStatus(@NonNull InternalAccessToken internalAccessToken, @NonNull String str) {
        Uri buildUri = UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OPENCHAT_API, "openchats", str, "status");
        HashMap hashMap = new HashMap();
        hashMap.put("openChatId", str);
        return this.httpClient.get(buildUri, buildRequestHeaders(internalAccessToken), hashMap, OPEN_CHAT_ROOM_STATUS_PARSER);
    }

    @NonNull
    public LineApiResponse<LineProfile> getProfile(@NonNull InternalAccessToken internalAccessToken) {
        return this.httpClient.get(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_COMMON_API, Scopes.PROFILE), buildRequestHeaders(internalAccessToken), Collections.EMPTY_MAP, PROFILE_PARSER);
    }

    @NonNull
    public LineApiResponse<Boolean> joinOpenChatRoom(@NonNull InternalAccessToken internalAccessToken, @NonNull String str, @NonNull String str2) {
        Uri buildUri = UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_OPENCHAT_API, "openchats", str, "join");
        return this.httpClient.postWithJson(buildUri, buildRequestHeaders(internalAccessToken), "{\"displayName\": \"" + str2 + "\" }", null);
    }

    @NonNull
    public LineApiResponse<String> sendMessage(@NonNull InternalAccessToken internalAccessToken, @NonNull String str, @NonNull List<MessageData> list) {
        try {
            return this.httpClient.postWithJson(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_MESSAGE_API, "send"), buildRequestHeaders(internalAccessToken), MessageSendRequest.createSingleUserType(str, list).toJsonString(), new StringParser("status"));
        } catch (JSONException e4) {
            return createInternalErrorResponse(e4);
        }
    }

    @NonNull
    public LineApiResponse<List<SendMessageResponse>> sendMessageToMultipleUsers(@NonNull InternalAccessToken internalAccessToken, @NonNull List<String> list, @NonNull List<MessageData> list2) {
        return sendMessageToMultipleUsers(internalAccessToken, list, list2, false);
    }

    @NonNull
    protected LineApiResponse<List<SendMessageResponse>> sendMessageToMultipleUsersUsingOtt(@NonNull InternalAccessToken internalAccessToken, @NonNull String str, @NonNull List<MessageData> list) {
        try {
            return this.httpClient.postWithJson(UriUtils.buildUri(this.apiBaseUrl, BASE_PATH_MESSAGE_API, PATH_OTT_SHARE), buildRequestHeaders(internalAccessToken), MessageSendRequest.createOttType(str, list).toJsonString(), MULTI_SEND_RESPONSE_PARSER);
        } catch (JSONException e4) {
            return createInternalErrorResponse(e4);
        }
    }

    TalkApiClient(@NonNull Uri uri, @NonNull ChannelServiceHttpClient channelServiceHttpClient) {
        this.apiBaseUrl = uri;
        this.httpClient = channelServiceHttpClient;
    }

    @NonNull
    public LineApiResponse<List<SendMessageResponse>> sendMessageToMultipleUsers(@NonNull InternalAccessToken internalAccessToken, @NonNull List<String> list, @NonNull List<MessageData> list2, boolean z4) {
        if (!z4) {
            return sendMessageToMultipleUsersUsingUserIds(internalAccessToken, list, list2);
        }
        LineApiResponse<String> ott = getOtt(internalAccessToken, list);
        return ott.isSuccess() ? sendMessageToMultipleUsersUsingOtt(internalAccessToken, ott.getResponseData(), list2) : LineApiResponse.createAsError(ott.getResponseCode(), ott.getErrorData());
    }
}
