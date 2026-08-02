package com.squareup.cash.support.chat.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.support.backend.api.activities.Amount;

/* loaded from: classes.dex */
public final class Conversation implements Parcelable {
    public static final Parcelable.Creator<Conversation> CREATOR = new Amount.Creator(5);
    public final BotStatus botStatus;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class BotStatus {
        public static final /* synthetic */ BotStatus[] $VALUES;
        public static final BotStatus ACTIVE;
        public static final BotStatus HANDED_OVER;
        public static final BotStatus READY;
        public static final BotStatus UNKNOWN;

        static {
            BotStatus botStatus = new BotStatus("UNKNOWN", 0);
            UNKNOWN = botStatus;
            BotStatus botStatus2 = new BotStatus("READY", 1);
            READY = botStatus2;
            BotStatus botStatus3 = new BotStatus("ACTIVE", 2);
            ACTIVE = botStatus3;
            BotStatus botStatus4 = new BotStatus("HANDED_OVER", 3);
            HANDED_OVER = botStatus4;
            $VALUES = new BotStatus[]{botStatus, botStatus2, botStatus3, botStatus4};
        }

        public static BotStatus valueOf(String str) {
            return (BotStatus) Enum.valueOf(BotStatus.class, str);
        }

        public static BotStatus[] values() {
            return (BotStatus[]) $VALUES.clone();
        }
    }

    public Conversation(BotStatus botStatus) {
        botStatus.getClass();
        this.botStatus = botStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Conversation) && this.botStatus == ((Conversation) obj).botStatus;
    }

    public final int hashCode() {
        return this.botStatus.hashCode();
    }

    public final String toString() {
        return "Conversation(botStatus=" + this.botStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.botStatus.name());
    }
}
