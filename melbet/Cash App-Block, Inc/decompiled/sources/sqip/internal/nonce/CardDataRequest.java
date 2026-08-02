package sqip.internal.nonce;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lsqip/internal/nonce/CardDataRequest;", "", InquiryField.FloatField.TYPE2, "", "exp_month", "", "exp_year", "cvv", "billing_postal_code", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getBilling_postal_code", "()Ljava/lang/String;", "getCvv", "getExp_month", "()I", "getExp_year", "getNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CardDataRequest {
    private final String billing_postal_code;
    private final String cvv;
    private final int exp_month;
    private final int exp_year;
    private final String number;

    public CardDataRequest(String str, int i, int i2, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.number = str;
        this.exp_month = i;
        this.exp_year = i2;
        this.cvv = str2;
        this.billing_postal_code = str3;
    }

    public static /* synthetic */ CardDataRequest copy$default(CardDataRequest cardDataRequest, String str, int i, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cardDataRequest.number;
        }
        if ((i3 & 2) != 0) {
            i = cardDataRequest.exp_month;
        }
        if ((i3 & 4) != 0) {
            i2 = cardDataRequest.exp_year;
        }
        if ((i3 & 8) != 0) {
            str2 = cardDataRequest.cvv;
        }
        if ((i3 & 16) != 0) {
            str3 = cardDataRequest.billing_postal_code;
        }
        String str4 = str3;
        int i4 = i2;
        return cardDataRequest.copy(str, i, i4, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExp_month() {
        return this.exp_month;
    }

    /* renamed from: component3, reason: from getter */
    public final int getExp_year() {
        return this.exp_year;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBilling_postal_code() {
        return this.billing_postal_code;
    }

    public final CardDataRequest copy(String number, int exp_month, int exp_year, String cvv, String billing_postal_code) {
        number.getClass();
        cvv.getClass();
        return new CardDataRequest(number, exp_month, exp_year, cvv, billing_postal_code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDataRequest)) {
            return false;
        }
        CardDataRequest cardDataRequest = (CardDataRequest) other;
        return Intrinsics.areEqual(this.number, cardDataRequest.number) && this.exp_month == cardDataRequest.exp_month && this.exp_year == cardDataRequest.exp_year && Intrinsics.areEqual(this.cvv, cardDataRequest.cvv) && Intrinsics.areEqual(this.billing_postal_code, cardDataRequest.billing_postal_code);
    }

    public final String getBilling_postal_code() {
        return this.billing_postal_code;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final int getExp_month() {
        return this.exp_month;
    }

    public final int getExp_year() {
        return this.exp_year;
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.exp_year, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.exp_month, this.number.hashCode() * 31, 31), 31), 31, this.cvv);
        String str = this.billing_postal_code;
        return m + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.number;
        int i = this.exp_month;
        int i2 = this.exp_year;
        String str2 = this.cvv;
        String str3 = this.billing_postal_code;
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("CardDataRequest(number=", i, str, ", exp_month=", ", exp_year=");
        m.append(i2);
        m.append(", cvv=");
        m.append(str2);
        m.append(", billing_postal_code=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, str3, ")");
    }
}
