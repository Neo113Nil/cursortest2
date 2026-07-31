package com.appsflyer.internal.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: SubscriptionPurchase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/appsflyer/internal/models/PausedStateContext;", "", "autoResumeTime", "", "(Ljava/lang/String;)V", "getAutoResumeTime", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class PausedStateContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String autoResumeTime;

    public static /* synthetic */ PausedStateContext copy$default(PausedStateContext pausedStateContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pausedStateContext.autoResumeTime;
        }
        return pausedStateContext.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAutoResumeTime() {
        return this.autoResumeTime;
    }

    public final PausedStateContext copy(String autoResumeTime) {
        Intrinsics.checkNotNullParameter(autoResumeTime, "autoResumeTime");
        return new PausedStateContext(autoResumeTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PausedStateContext) && Intrinsics.areEqual(this.autoResumeTime, ((PausedStateContext) other).autoResumeTime);
    }

    public int hashCode() {
        return this.autoResumeTime.hashCode();
    }

    public String toString() {
        return "PausedStateContext(autoResumeTime=" + this.autoResumeTime + ")";
    }

    public PausedStateContext(String autoResumeTime) {
        Intrinsics.checkNotNullParameter(autoResumeTime, "autoResumeTime");
        this.autoResumeTime = autoResumeTime;
    }

    public final String getAutoResumeTime() {
        return this.autoResumeTime;
    }

    /* compiled from: SubscriptionPurchase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/PausedStateContext$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/PausedStateContext;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion implements Deserialize<PausedStateContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public PausedStateContext fromJson(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = json.optString("autoResumeTime");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(\"autoResumeTime\")");
            return new PausedStateContext(optString);
        }
    }
}
