package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectMode;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "NOTIFICATION_EMAIL_SUBJECT_MODE_UNSPECIFIED", "NOTIFICATION_EMAIL_SUBJECT_MODE_INSIGHT", "NOTIFICATION_EMAIL_SUBJECT_MODE_AUTOMATION_NAME", "NOTIFICATION_EMAIL_SUBJECT_MODE_GENERIC", "NOTIFICATION_EMAIL_SUBJECT_MODE_CUSTOM", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationEmailSubjectMode implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NotificationEmailSubjectMode[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final NotificationEmailSubjectMode NOTIFICATION_EMAIL_SUBJECT_MODE_AUTOMATION_NAME;
    public static final NotificationEmailSubjectMode NOTIFICATION_EMAIL_SUBJECT_MODE_CUSTOM;
    public static final NotificationEmailSubjectMode NOTIFICATION_EMAIL_SUBJECT_MODE_GENERIC;
    public static final NotificationEmailSubjectMode NOTIFICATION_EMAIL_SUBJECT_MODE_INSIGHT;
    public static final NotificationEmailSubjectMode NOTIFICATION_EMAIL_SUBJECT_MODE_UNSPECIFIED;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectMode$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectMode;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static NotificationEmailSubjectMode fromValue(int i) {
            if (i == 0) {
                return NotificationEmailSubjectMode.NOTIFICATION_EMAIL_SUBJECT_MODE_UNSPECIFIED;
            }
            if (i == 1) {
                return NotificationEmailSubjectMode.NOTIFICATION_EMAIL_SUBJECT_MODE_INSIGHT;
            }
            if (i == 2) {
                return NotificationEmailSubjectMode.NOTIFICATION_EMAIL_SUBJECT_MODE_AUTOMATION_NAME;
            }
            if (i == 3) {
                return NotificationEmailSubjectMode.NOTIFICATION_EMAIL_SUBJECT_MODE_GENERIC;
            }
            if (i != 4) {
                return null;
            }
            return NotificationEmailSubjectMode.NOTIFICATION_EMAIL_SUBJECT_MODE_CUSTOM;
        }
    }

    static {
        NotificationEmailSubjectMode notificationEmailSubjectMode = new NotificationEmailSubjectMode("NOTIFICATION_EMAIL_SUBJECT_MODE_UNSPECIFIED", 0, 0);
        NOTIFICATION_EMAIL_SUBJECT_MODE_UNSPECIFIED = notificationEmailSubjectMode;
        NotificationEmailSubjectMode notificationEmailSubjectMode2 = new NotificationEmailSubjectMode("NOTIFICATION_EMAIL_SUBJECT_MODE_INSIGHT", 1, 1);
        NOTIFICATION_EMAIL_SUBJECT_MODE_INSIGHT = notificationEmailSubjectMode2;
        NotificationEmailSubjectMode notificationEmailSubjectMode3 = new NotificationEmailSubjectMode("NOTIFICATION_EMAIL_SUBJECT_MODE_AUTOMATION_NAME", 2, 2);
        NOTIFICATION_EMAIL_SUBJECT_MODE_AUTOMATION_NAME = notificationEmailSubjectMode3;
        NotificationEmailSubjectMode notificationEmailSubjectMode4 = new NotificationEmailSubjectMode("NOTIFICATION_EMAIL_SUBJECT_MODE_GENERIC", 3, 3);
        NOTIFICATION_EMAIL_SUBJECT_MODE_GENERIC = notificationEmailSubjectMode4;
        NotificationEmailSubjectMode notificationEmailSubjectMode5 = new NotificationEmailSubjectMode("NOTIFICATION_EMAIL_SUBJECT_MODE_CUSTOM", 4, 4);
        NOTIFICATION_EMAIL_SUBJECT_MODE_CUSTOM = notificationEmailSubjectMode5;
        NotificationEmailSubjectMode[] notificationEmailSubjectModeArr = {notificationEmailSubjectMode, notificationEmailSubjectMode2, notificationEmailSubjectMode3, notificationEmailSubjectMode4, notificationEmailSubjectMode5};
        $VALUES = notificationEmailSubjectModeArr;
        $ENTRIES = new EnumEntriesList(notificationEmailSubjectModeArr);
        INSTANCE = new Companion();
        ADAPTER = new NotificationEmailSubjectMode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NotificationEmailSubjectMode.class), Syntax.PROTO_2, notificationEmailSubjectMode);
    }

    public NotificationEmailSubjectMode(String str, int i, int i2) {
        this.value = i2;
    }

    public static final NotificationEmailSubjectMode fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static NotificationEmailSubjectMode valueOf(String str) {
        return (NotificationEmailSubjectMode) Enum.valueOf(NotificationEmailSubjectMode.class, str);
    }

    public static NotificationEmailSubjectMode[] values() {
        return (NotificationEmailSubjectMode[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
