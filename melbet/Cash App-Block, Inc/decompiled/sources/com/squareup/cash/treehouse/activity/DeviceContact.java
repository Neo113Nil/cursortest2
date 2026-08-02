package com.squareup.cash.treehouse.activity;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes7.dex */
public final class DeviceContact {
    public static final Companion Companion = new Companion();
    public final String customerId;
    public final String displayName;
    public final String email;
    public final String lookupIdForPhoto;
    public final String sms;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/DeviceContact$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/DeviceContact;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return DeviceContact$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeviceContact(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.customerId = null;
        } else {
            this.customerId = str;
        }
        if ((i & 2) == 0) {
            this.sms = null;
        } else {
            this.sms = str2;
        }
        if ((i & 4) == 0) {
            this.email = null;
        } else {
            this.email = str3;
        }
        if ((i & 8) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str4;
        }
        if ((i & 16) == 0) {
            this.lookupIdForPhoto = null;
        } else {
            this.lookupIdForPhoto = str5;
        }
    }

    public DeviceContact(String str, String str2, String str3, String str4, String str5) {
        this.customerId = str;
        this.sms = str2;
        this.email = str3;
        this.displayName = str4;
        this.lookupIdForPhoto = str5;
    }
}
