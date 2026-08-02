package com.squareup.cash.work.tinygraph.models;

import com.knotapi.knot.utilities.PreferenceManager;
import com.squareup.moshi.Json;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class EntityType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EntityType[] $VALUES;

    @Json(name = "announcementMerchant")
    public static final EntityType ANNOUNCEMENT_ATTACHMENT;

    @Json(name = "conversation")
    public static final EntityType CONVERSATION;

    @Json(name = "document")
    public static final EntityType DOCUMENT;

    @Json(name = "file")
    public static final EntityType FILE;

    @Json(name = "fileRelationship")
    public static final EntityType FILE_RELATIONSHIP;

    @Json(name = "inboxEntry")
    public static final EntityType INBOX_ENTRY;

    @Json(name = "job")
    public static final EntityType JOB;

    @Json(name = "location")
    public static final EntityType LOCATION;

    @Json(name = "membership")
    public static final EntityType MEMBERSHIP;

    @Json(name = "membershipMetadata")
    public static final EntityType MEMBERSHIP_METADATA;

    @Json(name = "announcement")
    public static final EntityType MERCHANT_ANNOUNCEMENT;

    @Json(name = "merchant")
    public static final EntityType MERCHANT_WRAPPER;

    @Json(name = "message")
    public static final EntityType MESSAGE;

    @Json(name = "feedStory")
    public static final EntityType MESSAGE_FEED_STORY;

    @Json(name = "messageReactionHistory")
    public static final EntityType MESSAGE_REACTION_HISTORY;

    @Json(name = "onboardingMerchant")
    public static final EntityType ONBOARDING_MERCHANT;

    @Json(name = "personMetadata")
    public static final EntityType PERSON_METADATA;

    @Json(name = "person")
    public static final EntityType PERSON_WRAPPER;

    @Json(name = "readReceipt")
    public static final EntityType READ_RECEIPT;

    @Json(name = PreferenceManager.PREF_SETTINGS)
    public static final EntityType SETTINGS;

    @Json(name = "teamMember")
    public static final EntityType TEAM_MEMBER;

    @Json(name = "timecard")
    public static final EntityType TIMECARD;

    @Json(name = "timecardBreak")
    public static final EntityType TIMECARD_BREAK;

    @Json(name = "timecardBreakDefinition")
    public static final EntityType TIMECARD_BREAK_DEFINITION;

    @Json(name = "timestamp")
    public static final EntityType TIMESTAMP;

    @Json(name = "typingUsers")
    public static final EntityType TYPING_USERS;
    public static final EntityType UNDEFINED;

    @Json(name = "userTip")
    public static final EntityType USER_TIP;
    private final String idComponent;

    static {
        EntityType entityType = new EntityType("ANNOUNCEMENT_ATTACHMENT", 0, null);
        ANNOUNCEMENT_ATTACHMENT = entityType;
        EntityType entityType2 = new EntityType("CONVERSATION", 1, null);
        CONVERSATION = entityType2;
        EntityType entityType3 = new EntityType("DOCUMENT", 2, null);
        DOCUMENT = entityType3;
        EntityType entityType4 = new EntityType("FILE", 3, null);
        FILE = entityType4;
        EntityType entityType5 = new EntityType("FILE_RELATIONSHIP", 4, null);
        FILE_RELATIONSHIP = entityType5;
        EntityType entityType6 = new EntityType("INBOX_ENTRY", 5, null);
        INBOX_ENTRY = entityType6;
        EntityType entityType7 = new EntityType("JOB", 6, null);
        JOB = entityType7;
        EntityType entityType8 = new EntityType("LOCATION", 7, "tmlocation");
        LOCATION = entityType8;
        EntityType entityType9 = new EntityType("MEMBERSHIP", 8, null);
        MEMBERSHIP = entityType9;
        EntityType entityType10 = new EntityType("MEMBERSHIP_METADATA", 9, null);
        MEMBERSHIP_METADATA = entityType10;
        EntityType entityType11 = new EntityType("MERCHANT_ANNOUNCEMENT", 10, null);
        MERCHANT_ANNOUNCEMENT = entityType11;
        EntityType entityType12 = new EntityType("MERCHANT_WRAPPER", 11, null);
        MERCHANT_WRAPPER = entityType12;
        EntityType entityType13 = new EntityType("MESSAGE", 12, null);
        MESSAGE = entityType13;
        EntityType entityType14 = new EntityType("MESSAGE_FEED_STORY", 13, null);
        MESSAGE_FEED_STORY = entityType14;
        EntityType entityType15 = new EntityType("MESSAGE_REACTION_HISTORY", 14, null);
        MESSAGE_REACTION_HISTORY = entityType15;
        EntityType entityType16 = new EntityType("ONBOARDING_MERCHANT", 15, null);
        ONBOARDING_MERCHANT = entityType16;
        EntityType entityType17 = new EntityType("PERSON_WRAPPER", 16, "tmperson");
        PERSON_WRAPPER = entityType17;
        EntityType entityType18 = new EntityType("PERSON_METADATA", 17, null);
        PERSON_METADATA = entityType18;
        EntityType entityType19 = new EntityType("READ_RECEIPT", 18, null);
        READ_RECEIPT = entityType19;
        EntityType entityType20 = new EntityType("SETTINGS", 19, null);
        SETTINGS = entityType20;
        EntityType entityType21 = new EntityType("TEAM_MEMBER", 20, null);
        TEAM_MEMBER = entityType21;
        EntityType entityType22 = new EntityType("TIMECARD", 21, null);
        TIMECARD = entityType22;
        EntityType entityType23 = new EntityType("TIMECARD_BREAK", 22, null);
        TIMECARD_BREAK = entityType23;
        EntityType entityType24 = new EntityType("TIMECARD_BREAK_DEFINITION", 23, null);
        TIMECARD_BREAK_DEFINITION = entityType24;
        EntityType entityType25 = new EntityType("TIMESTAMP", 24, null);
        TIMESTAMP = entityType25;
        EntityType entityType26 = new EntityType("TYPING_USERS", 25, null);
        TYPING_USERS = entityType26;
        EntityType entityType27 = new EntityType("USER_TIP", 26, null);
        USER_TIP = entityType27;
        EntityType entityType28 = new EntityType("UNDEFINED", 27, null);
        UNDEFINED = entityType28;
        EntityType[] entityTypeArr = {entityType, entityType2, entityType3, entityType4, entityType5, entityType6, entityType7, entityType8, entityType9, entityType10, entityType11, entityType12, entityType13, entityType14, entityType15, entityType16, entityType17, entityType18, entityType19, entityType20, entityType21, entityType22, entityType23, entityType24, entityType25, entityType26, entityType27, entityType28};
        $VALUES = entityTypeArr;
        $ENTRIES = new EnumEntriesList(entityTypeArr);
    }

    public EntityType(String str, int i, String str2) {
        this.idComponent = str2;
    }

    public static EntityType valueOf(String str) {
        return (EntityType) Enum.valueOf(EntityType.class, str);
    }

    public static EntityType[] values() {
        return (EntityType[]) $VALUES.clone();
    }
}
