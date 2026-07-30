package com.appsflyer;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/appsflyer/AFPurchaseType;", "", "", "AFInAppEventType", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "SUBSCRIPTION", "ONE_TIME_PURCHASE"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum AFPurchaseType {
    SUBSCRIPTION("subscription"),
    ONE_TIME_PURCHASE("one_time_purchase");


    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    private final String value;

    AFPurchaseType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
