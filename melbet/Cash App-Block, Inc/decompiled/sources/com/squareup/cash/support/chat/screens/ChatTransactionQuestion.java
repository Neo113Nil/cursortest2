package com.squareup.cash.support.chat.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.support.backend.api.activities.Amount;

/* loaded from: classes7.dex */
public final class ChatTransactionQuestion implements Question {
    public static final ChatTransactionQuestion INSTANCE = new ChatTransactionQuestion();
    public static final Parcelable.Creator<ChatTransactionQuestion> CREATOR = new Amount.Creator(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ChatTransactionQuestion);
    }

    public final int hashCode() {
        return -1292407168;
    }

    public final String toString() {
        return "ChatTransactionQuestion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
