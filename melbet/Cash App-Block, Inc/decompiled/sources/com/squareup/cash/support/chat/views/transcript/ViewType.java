package com.squareup.cash.support.chat.views.transcript;

import com.squareup.cash.work.service.real.WorkCookieJar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ViewType {
    public static final /* synthetic */ ViewType[] $VALUES;
    public static final ViewType BOTTOM_BOOKMARK;
    public static final WorkCookieJar Companion;
    public static final ViewType DISCLAIMER;
    public static final ViewType DIVIDER;
    public static final ViewType ENHANCED_SUGGESTED_REPLIES;
    public static final ViewType ERROR;
    public static final ViewType LOAD_OLD_MESSAGES;
    public static final ViewType MESSAGE_ACTION;
    public static final ViewType MESSAGE_ACTION_COMPOSE;
    public static final ViewType MESSAGE_ACTIVITY;
    public static final ViewType MESSAGE_ACTIVITY_COMPOSE;
    public static final ViewType MESSAGE_FILE;
    public static final ViewType MESSAGE_FILE_COMPOSE;
    public static final ViewType MESSAGE_IMAGE;
    public static final ViewType MESSAGE_IMAGE_COMPOSE;
    public static final ViewType MESSAGE_SYSTEM_MESSAGE;
    public static final ViewType MESSAGE_SYSTEM_MESSAGE_COMPOSE;
    public static final ViewType MESSAGE_TEXT;
    public static final ViewType MESSAGE_TEXT_COMPOSE;
    public static final ViewType MESSAGE_TRANSACTION;
    public static final ViewType MESSAGE_TYPING_INDICATOR;
    public static final ViewType MESSAGE_TYPING_INDICATOR_COMPOSE;
    public static final ViewType MESSAGE_UNKNOWN;
    public static final ViewType MESSAGE_UNKNOWN_COMPOSE;
    public static final ViewType NAME_DISPLAY;
    public static final ViewType STATUS;
    public static final ViewType STATUS_TIMESTAMP;
    public static final ViewType SUGGESTED_REPLIES;
    public static final ViewType TIMESTAMP_DIVIDER;

    static {
        ViewType viewType = new ViewType("MESSAGE_TEXT", 0);
        MESSAGE_TEXT = viewType;
        ViewType viewType2 = new ViewType("MESSAGE_IMAGE", 1);
        MESSAGE_IMAGE = viewType2;
        ViewType viewType3 = new ViewType("MESSAGE_FILE", 2);
        MESSAGE_FILE = viewType3;
        ViewType viewType4 = new ViewType("MESSAGE_ACTION", 3);
        MESSAGE_ACTION = viewType4;
        ViewType viewType5 = new ViewType("MESSAGE_TRANSACTION", 4);
        MESSAGE_TRANSACTION = viewType5;
        ViewType viewType6 = new ViewType("MESSAGE_ACTIVITY", 5);
        MESSAGE_ACTIVITY = viewType6;
        ViewType viewType7 = new ViewType("MESSAGE_TYPING_INDICATOR", 6);
        MESSAGE_TYPING_INDICATOR = viewType7;
        ViewType viewType8 = new ViewType("MESSAGE_SYSTEM_MESSAGE", 7);
        MESSAGE_SYSTEM_MESSAGE = viewType8;
        ViewType viewType9 = new ViewType("MESSAGE_UNKNOWN", 8);
        MESSAGE_UNKNOWN = viewType9;
        ViewType viewType10 = new ViewType("MESSAGE_TEXT_COMPOSE", 9);
        MESSAGE_TEXT_COMPOSE = viewType10;
        ViewType viewType11 = new ViewType("MESSAGE_IMAGE_COMPOSE", 10);
        MESSAGE_IMAGE_COMPOSE = viewType11;
        ViewType viewType12 = new ViewType("MESSAGE_FILE_COMPOSE", 11);
        MESSAGE_FILE_COMPOSE = viewType12;
        ViewType viewType13 = new ViewType("MESSAGE_ACTION_COMPOSE", 12);
        MESSAGE_ACTION_COMPOSE = viewType13;
        ViewType viewType14 = new ViewType("MESSAGE_ACTIVITY_COMPOSE", 13);
        MESSAGE_ACTIVITY_COMPOSE = viewType14;
        ViewType viewType15 = new ViewType("MESSAGE_TYPING_INDICATOR_COMPOSE", 14);
        MESSAGE_TYPING_INDICATOR_COMPOSE = viewType15;
        ViewType viewType16 = new ViewType("MESSAGE_SYSTEM_MESSAGE_COMPOSE", 15);
        MESSAGE_SYSTEM_MESSAGE_COMPOSE = viewType16;
        ViewType viewType17 = new ViewType("MESSAGE_UNKNOWN_COMPOSE", 16);
        MESSAGE_UNKNOWN_COMPOSE = viewType17;
        ViewType viewType18 = new ViewType("DIVIDER", 17);
        DIVIDER = viewType18;
        ViewType viewType19 = new ViewType("DISCLAIMER", 18);
        DISCLAIMER = viewType19;
        ViewType viewType20 = new ViewType("STATUS", 19);
        STATUS = viewType20;
        ViewType viewType21 = new ViewType("TIMESTAMP_DIVIDER", 20);
        TIMESTAMP_DIVIDER = viewType21;
        ViewType viewType22 = new ViewType("STATUS_TIMESTAMP", 21);
        STATUS_TIMESTAMP = viewType22;
        ViewType viewType23 = new ViewType("SUGGESTED_REPLIES", 22);
        SUGGESTED_REPLIES = viewType23;
        ViewType viewType24 = new ViewType("ENHANCED_SUGGESTED_REPLIES", 23);
        ENHANCED_SUGGESTED_REPLIES = viewType24;
        ViewType viewType25 = new ViewType("LOAD_OLD_MESSAGES", 24);
        LOAD_OLD_MESSAGES = viewType25;
        ViewType viewType26 = new ViewType("ERROR", 25);
        ERROR = viewType26;
        ViewType viewType27 = new ViewType("BOTTOM_BOOKMARK", 26);
        BOTTOM_BOOKMARK = viewType27;
        ViewType viewType28 = new ViewType("NAME_DISPLAY", 27);
        NAME_DISPLAY = viewType28;
        $VALUES = new ViewType[]{viewType, viewType2, viewType3, viewType4, viewType5, viewType6, viewType7, viewType8, viewType9, viewType10, viewType11, viewType12, viewType13, viewType14, viewType15, viewType16, viewType17, viewType18, viewType19, viewType20, viewType21, viewType22, viewType23, viewType24, viewType25, viewType26, viewType27, viewType28};
        Companion = new WorkCookieJar(10);
    }

    public static ViewType valueOf(String str) {
        return (ViewType) Enum.valueOf(ViewType.class, str);
    }

    public static ViewType[] values() {
        return (ViewType[]) $VALUES.clone();
    }
}
