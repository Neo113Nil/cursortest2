package com.linecorp.linesdk;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes2.dex */
public class GetFriendsResponse {

    @NonNull
    private List<LineFriendProfile> friends;
    private String nextPageRequestToken;

    public GetFriendsResponse(@NonNull List<LineFriendProfile> list) {
        this.friends = list;
    }

    @NonNull
    public List<LineFriendProfile> getFriends() {
        return this.friends;
    }

    public String getNextPageRequestToken() {
        return this.nextPageRequestToken;
    }

    public String toString() {
        return "GetFriendsResponse{friends=" + this.friends + ", nextPageRequestToken='" + this.nextPageRequestToken + "'}";
    }

    public GetFriendsResponse(@NonNull List<LineFriendProfile> list, String str) {
        this.friends = list;
        this.nextPageRequestToken = str;
    }
}
