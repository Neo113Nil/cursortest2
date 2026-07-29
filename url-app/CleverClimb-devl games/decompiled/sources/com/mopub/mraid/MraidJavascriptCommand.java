package com.mopub.mraid;

import com.youappi.sdk.net.model.VideoEvent;

/* loaded from: classes2.dex */
public enum MraidJavascriptCommand {
    CLOSE("close"),
    EXPAND(VideoEvent.EVENT_EXPAND) { // from class: com.mopub.mraid.MraidJavascriptCommand.1
        @Override // com.mopub.mraid.MraidJavascriptCommand
        boolean requiresClick(PlacementType placementType) {
            return placementType == PlacementType.INLINE;
        }
    },
    USE_CUSTOM_CLOSE("usecustomclose"),
    OPEN("open") { // from class: com.mopub.mraid.MraidJavascriptCommand.2
        @Override // com.mopub.mraid.MraidJavascriptCommand
        boolean requiresClick(PlacementType placementType) {
            return true;
        }
    },
    RESIZE("resize") { // from class: com.mopub.mraid.MraidJavascriptCommand.3
        @Override // com.mopub.mraid.MraidJavascriptCommand
        boolean requiresClick(PlacementType placementType) {
            return true;
        }
    },
    SET_ORIENTATION_PROPERTIES("setOrientationProperties"),
    PLAY_VIDEO("playVideo") { // from class: com.mopub.mraid.MraidJavascriptCommand.4
        @Override // com.mopub.mraid.MraidJavascriptCommand
        boolean requiresClick(PlacementType placementType) {
            return placementType == PlacementType.INLINE;
        }
    },
    STORE_PICTURE("storePicture") { // from class: com.mopub.mraid.MraidJavascriptCommand.5
        @Override // com.mopub.mraid.MraidJavascriptCommand
        boolean requiresClick(PlacementType placementType) {
            return true;
        }
    },
    CREATE_CALENDAR_EVENT("createCalendarEvent") { // from class: com.mopub.mraid.MraidJavascriptCommand.6
        @Override // com.mopub.mraid.MraidJavascriptCommand
        boolean requiresClick(PlacementType placementType) {
            return true;
        }
    },
    UNSPECIFIED("");

    private final String mJavascriptString;

    boolean requiresClick(PlacementType placementType) {
        return false;
    }

    MraidJavascriptCommand(String str) {
        this.mJavascriptString = str;
    }

    static MraidJavascriptCommand fromJavascriptString(String str) {
        for (MraidJavascriptCommand mraidJavascriptCommand : values()) {
            if (mraidJavascriptCommand.mJavascriptString.equals(str)) {
                return mraidJavascriptCommand;
            }
        }
        return UNSPECIFIED;
    }

    String toJavascriptString() {
        return this.mJavascriptString;
    }
}
