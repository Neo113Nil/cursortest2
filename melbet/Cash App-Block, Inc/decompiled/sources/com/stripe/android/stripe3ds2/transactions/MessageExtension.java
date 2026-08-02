package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.hcaptcha.HCaptchaStateListener;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class MessageExtension implements Parcelable {
    public static final Parcelable.Creator<MessageExtension> CREATOR = new HCaptchaStateListener.Creator(18);
    public static final EmptyList SUPPORTED_MESSAGE_EXTENSIONS = EmptyList.INSTANCE;
    public final boolean criticalityIndicator;
    public final HashMap data;
    public final String id;
    public final String name;

    public MessageExtension(String str, String str2, boolean z, HashMap hashMap) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.id = str2;
        this.criticalityIndicator = z;
        this.data = hashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageExtension)) {
            return false;
        }
        MessageExtension messageExtension = (MessageExtension) obj;
        return Intrinsics.areEqual(this.name, messageExtension.name) && Intrinsics.areEqual(this.id, messageExtension.id) && this.criticalityIndicator == messageExtension.criticalityIndicator && this.data.equals(messageExtension.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.id), 31, this.criticalityIndicator);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MessageExtension(name=", this.name, ", id=", this.id, ", criticalityIndicator=");
        m.append(this.criticalityIndicator);
        m.append(", data=");
        m.append(this.data);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.id);
        parcel.writeInt(this.criticalityIndicator ? 1 : 0);
        HashMap hashMap = this.data;
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
