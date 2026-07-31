package com.linecorp.linesdk.api;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.FriendSortField;
import com.linecorp.linesdk.GetFriendsResponse;
import com.linecorp.linesdk.GetGroupsResponse;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineFriendshipStatus;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.SendMessageResponse;
import com.linecorp.linesdk.message.MessageData;
import com.linecorp.linesdk.openchat.MembershipStatus;
import com.linecorp.linesdk.openchat.OpenChatParameters;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import com.linecorp.linesdk.openchat.OpenChatRoomJoinType;
import com.linecorp.linesdk.openchat.OpenChatRoomStatus;
import java.util.List;

/* loaded from: classes2.dex */
public interface LineApiClient {
    @NonNull
    LineApiResponse<OpenChatRoomInfo> createOpenChatRoom(@NonNull OpenChatParameters openChatParameters);

    @NonNull
    LineApiResponse<LineAccessToken> getCurrentAccessToken();

    @NonNull
    LineApiResponse<GetFriendsResponse> getFriends(@NonNull FriendSortField friendSortField, String str);

    @NonNull
    LineApiResponse<GetFriendsResponse> getFriends(@NonNull FriendSortField friendSortField, String str, boolean z4);

    @NonNull
    LineApiResponse<GetFriendsResponse> getFriendsApprovers(@NonNull FriendSortField friendSortField, String str);

    @NonNull
    LineApiResponse<LineFriendshipStatus> getFriendshipStatus();

    @NonNull
    LineApiResponse<GetFriendsResponse> getGroupApprovers(@NonNull String str, String str2);

    @NonNull
    LineApiResponse<GetGroupsResponse> getGroups(String str);

    @NonNull
    LineApiResponse<GetGroupsResponse> getGroups(String str, boolean z4);

    @NonNull
    LineApiResponse<Boolean> getOpenChatAgreementStatus();

    @NonNull
    LineApiResponse<MembershipStatus> getOpenChatMembershipStatus(@NonNull String str);

    @NonNull
    LineApiResponse<OpenChatRoomJoinType> getOpenChatRoomJoinType(@NonNull String str);

    @NonNull
    LineApiResponse<OpenChatRoomStatus> getOpenChatRoomStatus(@NonNull String str);

    @NonNull
    LineApiResponse<LineProfile> getProfile();

    @NonNull
    LineApiResponse<Boolean> joinOpenChatRoom(@NonNull String str, @NonNull String str2);

    @NonNull
    LineApiResponse<?> logout();

    @NonNull
    LineApiResponse<LineAccessToken> refreshAccessToken();

    @NonNull
    LineApiResponse<String> sendMessage(@NonNull String str, @NonNull List<MessageData> list);

    @NonNull
    LineApiResponse<List<SendMessageResponse>> sendMessageToMultipleUsers(@NonNull List<String> list, @NonNull List<MessageData> list2);

    @NonNull
    LineApiResponse<List<SendMessageResponse>> sendMessageToMultipleUsers(@NonNull List<String> list, @NonNull List<MessageData> list2, boolean z4);

    @NonNull
    LineApiResponse<LineCredential> verifyToken();
}
