package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class ChatOverseasSearchKey implements Parcelable {
    public static final Parcelable.Creator<ChatOverseasSearchKey> CREATOR = new a();
    private final String agentId;
    private final String apiVersion;
    private final String appId;
    private final String password;
    private final String resourceName;
    private final String subscriptionId;
    private final String tenantId;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final ChatOverseasSearchKey createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new ChatOverseasSearchKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChatOverseasSearchKey[] newArray(int i8) {
            return new ChatOverseasSearchKey[i8];
        }
    }

    public ChatOverseasSearchKey(String agentId, String apiVersion, String appId, String password, String resourceName, String subscriptionId, String tenantId) {
        s.checkNotNullParameter(agentId, "agentId");
        s.checkNotNullParameter(apiVersion, "apiVersion");
        s.checkNotNullParameter(appId, "appId");
        s.checkNotNullParameter(password, "password");
        s.checkNotNullParameter(resourceName, "resourceName");
        s.checkNotNullParameter(subscriptionId, "subscriptionId");
        s.checkNotNullParameter(tenantId, "tenantId");
        this.agentId = agentId;
        this.apiVersion = apiVersion;
        this.appId = appId;
        this.password = password;
        this.resourceName = resourceName;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
    }

    public static /* synthetic */ ChatOverseasSearchKey copy$default(ChatOverseasSearchKey chatOverseasSearchKey, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = chatOverseasSearchKey.agentId;
        }
        if ((i8 & 2) != 0) {
            str2 = chatOverseasSearchKey.apiVersion;
        }
        String str8 = str2;
        if ((i8 & 4) != 0) {
            str3 = chatOverseasSearchKey.appId;
        }
        String str9 = str3;
        if ((i8 & 8) != 0) {
            str4 = chatOverseasSearchKey.password;
        }
        String str10 = str4;
        if ((i8 & 16) != 0) {
            str5 = chatOverseasSearchKey.resourceName;
        }
        String str11 = str5;
        if ((i8 & 32) != 0) {
            str6 = chatOverseasSearchKey.subscriptionId;
        }
        String str12 = str6;
        if ((i8 & 64) != 0) {
            str7 = chatOverseasSearchKey.tenantId;
        }
        return chatOverseasSearchKey.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.agentId;
    }

    public final String component2() {
        return this.apiVersion;
    }

    public final String component3() {
        return this.appId;
    }

    public final String component4() {
        return this.password;
    }

    public final String component5() {
        return this.resourceName;
    }

    public final String component6() {
        return this.subscriptionId;
    }

    public final String component7() {
        return this.tenantId;
    }

    public final ChatOverseasSearchKey copy(String agentId, String apiVersion, String appId, String password, String resourceName, String subscriptionId, String tenantId) {
        s.checkNotNullParameter(agentId, "agentId");
        s.checkNotNullParameter(apiVersion, "apiVersion");
        s.checkNotNullParameter(appId, "appId");
        s.checkNotNullParameter(password, "password");
        s.checkNotNullParameter(resourceName, "resourceName");
        s.checkNotNullParameter(subscriptionId, "subscriptionId");
        s.checkNotNullParameter(tenantId, "tenantId");
        return new ChatOverseasSearchKey(agentId, apiVersion, appId, password, resourceName, subscriptionId, tenantId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatOverseasSearchKey)) {
            return false;
        }
        ChatOverseasSearchKey chatOverseasSearchKey = (ChatOverseasSearchKey) obj;
        return s.areEqual(this.agentId, chatOverseasSearchKey.agentId) && s.areEqual(this.apiVersion, chatOverseasSearchKey.apiVersion) && s.areEqual(this.appId, chatOverseasSearchKey.appId) && s.areEqual(this.password, chatOverseasSearchKey.password) && s.areEqual(this.resourceName, chatOverseasSearchKey.resourceName) && s.areEqual(this.subscriptionId, chatOverseasSearchKey.subscriptionId) && s.areEqual(this.tenantId, chatOverseasSearchKey.tenantId);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getApiVersion() {
        return this.apiVersion;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getResourceName() {
        return this.resourceName;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final String getTenantId() {
        return this.tenantId;
    }

    public int hashCode() {
        return (((((((((((this.agentId.hashCode() * 31) + this.apiVersion.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.password.hashCode()) * 31) + this.resourceName.hashCode()) * 31) + this.subscriptionId.hashCode()) * 31) + this.tenantId.hashCode();
    }

    public String toString() {
        return "ChatOverseasSearchKey(agentId=" + this.agentId + ", apiVersion=" + this.apiVersion + ", appId=" + this.appId + ", password=" + this.password + ", resourceName=" + this.resourceName + ", subscriptionId=" + this.subscriptionId + ", tenantId=" + this.tenantId + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.agentId);
        out.writeString(this.apiVersion);
        out.writeString(this.appId);
        out.writeString(this.password);
        out.writeString(this.resourceName);
        out.writeString(this.subscriptionId);
        out.writeString(this.tenantId);
    }
}
