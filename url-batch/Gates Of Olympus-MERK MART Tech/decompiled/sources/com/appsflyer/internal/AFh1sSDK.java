package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\t\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0006X\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u0010X\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0011\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0015X\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u0018X\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019"}, d2 = {"Lcom/appsflyer/internal/AFh1sSDK;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "valueOf", "()Z", "AFKeystoreWrapper", "", "Ljava/lang/String;", "values", "I", "", "AFInAppEventParameterName", "F", "AFInAppEventType", "AFLogger", "", "Ljava/util/List;", "e", "", "J", "unregisterClient", "p1", "p2", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFh1sSDK {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    public final float AFInAppEventType;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    public List<String> e;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public long unregisterClient;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    public final String AFInAppEventParameterName;
    public final String valueOf;
    public final int values;

    public AFh1sSDK(long j, float f, List<String> list, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.unregisterClient = j;
        this.AFInAppEventType = f;
        this.e = list;
        this.values = i;
        this.valueOf = str;
        this.AFInAppEventParameterName = str2;
    }

    public final boolean valueOf() {
        return TimeUnit.SECONDS.toMillis(this.unregisterClient) > AFb1tSDK.AFInAppEventType().values().unregisterClient().AFKeystoreWrapper();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        if (p0 != null) {
            AFh1sSDK aFh1sSDK = (AFh1sSDK) p0;
            return this.unregisterClient == aFh1sSDK.unregisterClient && this.AFInAppEventType == aFh1sSDK.AFInAppEventType && Intrinsics.areEqual(this.e, aFh1sSDK.e) && this.values == aFh1sSDK.values && Intrinsics.areEqual(this.valueOf, aFh1sSDK.valueOf) && Intrinsics.areEqual(this.AFInAppEventParameterName, aFh1sSDK.AFInAppEventParameterName);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.RDConfiguration");
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.unregisterClient) * 31) + Float.hashCode(this.AFInAppEventType)) * 31) + this.e.hashCode()) * 31) + this.values) * 31) + this.valueOf.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }
}
