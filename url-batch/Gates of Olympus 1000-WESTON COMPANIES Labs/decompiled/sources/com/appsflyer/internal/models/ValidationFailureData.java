package com.appsflyer.internal.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ValidationFailureData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/appsflyer/internal/models/ValidationFailureData;", "", NotificationCompat.CATEGORY_STATUS, "", "description", "", "(ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class ValidationFailureData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String description;
    private final int status;

    public static /* synthetic */ ValidationFailureData copy$default(ValidationFailureData validationFailureData, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = validationFailureData.status;
        }
        if ((i2 & 2) != 0) {
            str = validationFailureData.description;
        }
        return validationFailureData.copy(i, str);
    }

    @JvmStatic
    public static ValidationFailureData fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final ValidationFailureData copy(int status, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new ValidationFailureData(status, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationFailureData)) {
            return false;
        }
        ValidationFailureData validationFailureData = (ValidationFailureData) other;
        return this.status == validationFailureData.status && Intrinsics.areEqual(this.description, validationFailureData.description);
    }

    public int hashCode() {
        return (Integer.hashCode(this.status) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "ValidationFailureData(status=" + this.status + ", description=" + this.description + ")";
    }

    public ValidationFailureData(int i, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.status = i;
        this.description = description;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getDescription() {
        return this.description;
    }

    /* compiled from: ValidationFailureData.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/ValidationFailureData$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/ValidationFailureData;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion implements Deserialize<ValidationFailureData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @JvmStatic
        public ValidationFailureData fromJson(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            int optInt = json.optInt(NotificationCompat.CATEGORY_STATUS, -1);
            String description = json.optString("description");
            Intrinsics.checkNotNullExpressionValue(description, "description");
            return new ValidationFailureData(optInt, description);
        }
    }
}
