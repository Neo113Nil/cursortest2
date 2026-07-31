package gbcorp.c312.merkmarker.info.data.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMROrderEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/entity/MRKMROrderEntity;", "", "orderNumber", "", "description", "customerFirstName", "customerLastName", "customerEmail", FirebaseAnalytics.Param.PRICE, "", "timestamp", "Ljava/time/LocalDateTime;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/time/LocalDateTime;)V", "getOrderNumber", "()Ljava/lang/String;", "getDescription", "getCustomerFirstName", "getCustomerLastName", "getCustomerEmail", "getPrice", "()D", "getTimestamp", "()Ljava/time/LocalDateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MRKMROrderEntity {
    public static final int $stable = 8;
    private final String customerEmail;
    private final String customerFirstName;
    private final String customerLastName;
    private final String description;
    private final String orderNumber;
    private final double price;
    private final LocalDateTime timestamp;

    public static /* synthetic */ MRKMROrderEntity copy$default(MRKMROrderEntity mRKMROrderEntity, String str, String str2, String str3, String str4, String str5, double d, LocalDateTime localDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mRKMROrderEntity.orderNumber;
        }
        if ((i & 2) != 0) {
            str2 = mRKMROrderEntity.description;
        }
        if ((i & 4) != 0) {
            str3 = mRKMROrderEntity.customerFirstName;
        }
        if ((i & 8) != 0) {
            str4 = mRKMROrderEntity.customerLastName;
        }
        if ((i & 16) != 0) {
            str5 = mRKMROrderEntity.customerEmail;
        }
        if ((i & 32) != 0) {
            d = mRKMROrderEntity.price;
        }
        if ((i & 64) != 0) {
            localDateTime = mRKMROrderEntity.timestamp;
        }
        LocalDateTime localDateTime2 = localDateTime;
        double d2 = d;
        String str6 = str5;
        String str7 = str3;
        return mRKMROrderEntity.copy(str, str2, str7, str4, str6, d2, localDateTime2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCustomerFirstName() {
        return this.customerFirstName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCustomerLastName() {
        return this.customerLastName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component7, reason: from getter */
    public final LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public final MRKMROrderEntity copy(String orderNumber, String description, String customerFirstName, String customerLastName, String customerEmail, double price, LocalDateTime timestamp) {
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(customerFirstName, "customerFirstName");
        Intrinsics.checkNotNullParameter(customerLastName, "customerLastName");
        Intrinsics.checkNotNullParameter(customerEmail, "customerEmail");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new MRKMROrderEntity(orderNumber, description, customerFirstName, customerLastName, customerEmail, price, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MRKMROrderEntity)) {
            return false;
        }
        MRKMROrderEntity mRKMROrderEntity = (MRKMROrderEntity) other;
        return Intrinsics.areEqual(this.orderNumber, mRKMROrderEntity.orderNumber) && Intrinsics.areEqual(this.description, mRKMROrderEntity.description) && Intrinsics.areEqual(this.customerFirstName, mRKMROrderEntity.customerFirstName) && Intrinsics.areEqual(this.customerLastName, mRKMROrderEntity.customerLastName) && Intrinsics.areEqual(this.customerEmail, mRKMROrderEntity.customerEmail) && Double.compare(this.price, mRKMROrderEntity.price) == 0 && Intrinsics.areEqual(this.timestamp, mRKMROrderEntity.timestamp);
    }

    public int hashCode() {
        return (((((((((((this.orderNumber.hashCode() * 31) + this.description.hashCode()) * 31) + this.customerFirstName.hashCode()) * 31) + this.customerLastName.hashCode()) * 31) + this.customerEmail.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + this.timestamp.hashCode();
    }

    public String toString() {
        return "MRKMROrderEntity(orderNumber=" + this.orderNumber + ", description=" + this.description + ", customerFirstName=" + this.customerFirstName + ", customerLastName=" + this.customerLastName + ", customerEmail=" + this.customerEmail + ", price=" + this.price + ", timestamp=" + this.timestamp + ")";
    }

    public MRKMROrderEntity(String orderNumber, String description, String customerFirstName, String customerLastName, String customerEmail, double d, LocalDateTime timestamp) {
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(customerFirstName, "customerFirstName");
        Intrinsics.checkNotNullParameter(customerLastName, "customerLastName");
        Intrinsics.checkNotNullParameter(customerEmail, "customerEmail");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.orderNumber = orderNumber;
        this.description = description;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        this.price = d;
        this.timestamp = timestamp;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getCustomerFirstName() {
        return this.customerFirstName;
    }

    public final String getCustomerLastName() {
        return this.customerLastName;
    }

    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    public final double getPrice() {
        return this.price;
    }

    public final LocalDateTime getTimestamp() {
        return this.timestamp;
    }
}
