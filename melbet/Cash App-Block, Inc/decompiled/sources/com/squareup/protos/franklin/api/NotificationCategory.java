package com.squareup.protos.franklin.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/NotificationCategory;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NOTIFICATION_CATEGORY_DO_NOT_USE", "ACCOUNT_AND_TRANSACTION_ACTIVITY", "MARKETING_OFFERS", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationCategory implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NotificationCategory[] $VALUES;
    public static final NotificationCategory ACCOUNT_AND_TRANSACTION_ACTIVITY;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final NotificationCategory MARKETING_OFFERS;
    public static final NotificationCategory NOTIFICATION_CATEGORY_DO_NOT_USE;
    private final int value;

    private static final /* synthetic */ NotificationCategory[] $values() {
        return new NotificationCategory[]{NOTIFICATION_CATEGORY_DO_NOT_USE, ACCOUNT_AND_TRANSACTION_ACTIVITY, MARKETING_OFFERS};
    }

    static {
        final NotificationCategory notificationCategory = new NotificationCategory("NOTIFICATION_CATEGORY_DO_NOT_USE", 0, 0);
        NOTIFICATION_CATEGORY_DO_NOT_USE = notificationCategory;
        ACCOUNT_AND_TRANSACTION_ACTIVITY = new NotificationCategory("ACCOUNT_AND_TRANSACTION_ACTIVITY", 1, 1);
        MARKETING_OFFERS = new NotificationCategory("MARKETING_OFFERS", 2, 2);
        NotificationCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(NotificationCategory.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, notificationCategory) { // from class: com.squareup.protos.franklin.api.NotificationCategory$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public NotificationCategory fromValue(int value) {
                return NotificationCategory.INSTANCE.fromValue(value);
            }
        };
    }

    private NotificationCategory(String str, int i, int i2) {
        this.value = i2;
    }

    public static final NotificationCategory fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static NotificationCategory valueOf(String str) {
        return (NotificationCategory) Enum.valueOf(NotificationCategory.class, str);
    }

    public static NotificationCategory[] values() {
        return (NotificationCategory[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/NotificationCategory$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/NotificationCategory;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationCategory fromValue(int value) {
            if (value == 0) {
                return NotificationCategory.NOTIFICATION_CATEGORY_DO_NOT_USE;
            }
            if (value == 1) {
                return NotificationCategory.ACCOUNT_AND_TRANSACTION_ACTIVITY;
            }
            if (value != 2) {
                return null;
            }
            return NotificationCategory.MARKETING_OFFERS;
        }

        private Companion() {
        }
    }
}
