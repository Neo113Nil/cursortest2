package com.linecorp.linesdk;

/* loaded from: classes2.dex */
public class LineFriendshipStatus {
    private boolean friendFlag;

    public LineFriendshipStatus(boolean z4) {
        this.friendFlag = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.friendFlag == ((LineFriendshipStatus) obj).friendFlag;
    }

    public int hashCode() {
        return this.friendFlag ? 1 : 0;
    }

    public boolean isFriend() {
        return this.friendFlag;
    }

    public String toString() {
        return "LineFriendshipStatus{friendFlag=" + this.friendFlag + '}';
    }
}
