package com.linecorp.linesdk.dialog.internal;

import android.net.Uri;
import com.linecorp.linesdk.LineFriendProfile;
import com.linecorp.linesdk.LineGroup;

/* loaded from: classes2.dex */
public class TargetUser {
    private String displayName;
    private String id;
    private Boolean isSelected = Boolean.FALSE;
    private Uri pictureUri;
    private Type type;

    public enum Type {
        FRIEND,
        GROUP
    }

    public TargetUser(Type type, String str, String str2, Uri uri) {
        this.type = type;
        this.id = str;
        this.displayName = str2;
        this.pictureUri = uri;
    }

    public static TargetUser createInstance(LineFriendProfile lineFriendProfile) {
        return new TargetUser(Type.FRIEND, lineFriendProfile.getUserId(), lineFriendProfile.getAvailableDisplayName(), lineFriendProfile.getPictureUrl());
    }

    public static int getTargetTypeCount() {
        return Type.values().length;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getId() {
        return this.id;
    }

    public Uri getPictureUri() {
        return this.pictureUri;
    }

    public Boolean getSelected() {
        return this.isSelected;
    }

    public Type getType() {
        return this.type;
    }

    public void setSelected(Boolean bool) {
        this.isSelected = bool;
    }

    public static TargetUser createInstance(LineGroup lineGroup) {
        return new TargetUser(Type.GROUP, lineGroup.getGroupId(), lineGroup.getGroupName(), lineGroup.getPictureUrl());
    }
}
