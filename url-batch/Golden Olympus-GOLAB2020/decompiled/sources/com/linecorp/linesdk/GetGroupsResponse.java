package com.linecorp.linesdk;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes2.dex */
public class GetGroupsResponse {

    @NonNull
    private List<LineGroup> groups;
    private String nextPageRequestToken;

    public GetGroupsResponse(@NonNull List<LineGroup> list) {
        this.groups = list;
    }

    @NonNull
    public List<LineGroup> getGroups() {
        return this.groups;
    }

    public String getNextPageRequestToken() {
        return this.nextPageRequestToken;
    }

    public String toString() {
        return "GetFriendsResponse{groups=" + this.groups + ", nextPageRequestToken='" + this.nextPageRequestToken + "'}";
    }

    public GetGroupsResponse(@NonNull List<LineGroup> list, String str) {
        this.groups = list;
        this.nextPageRequestToken = str;
    }
}
