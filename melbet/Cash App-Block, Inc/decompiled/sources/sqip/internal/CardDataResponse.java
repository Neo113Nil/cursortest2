package sqip.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lsqip/internal/CardDataResponse;", "", "card_brand", "", "last_4", "exp_month", "", "exp_year", "billing_postal_code", "card_type", "prepaid_type", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBilling_postal_code", "()Ljava/lang/String;", "getCard_brand", "getCard_type", "getExp_month", "()I", "getExp_year", "getLast_4", "getPrepaid_type", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CardDataResponse {
    private final String billing_postal_code;
    private final String card_brand;
    private final String card_type;
    private final int exp_month;
    private final int exp_year;
    private final String last_4;
    private final String prepaid_type;

    public CardDataResponse(String str, String str2, int i, int i2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.card_brand = str;
        this.last_4 = str2;
        this.exp_month = i;
        this.exp_year = i2;
        this.billing_postal_code = str3;
        this.card_type = str4;
        this.prepaid_type = str5;
    }

    public static /* synthetic */ CardDataResponse copy$default(CardDataResponse cardDataResponse, String str, String str2, int i, int i2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cardDataResponse.card_brand;
        }
        if ((i3 & 2) != 0) {
            str2 = cardDataResponse.last_4;
        }
        if ((i3 & 4) != 0) {
            i = cardDataResponse.exp_month;
        }
        if ((i3 & 8) != 0) {
            i2 = cardDataResponse.exp_year;
        }
        if ((i3 & 16) != 0) {
            str3 = cardDataResponse.billing_postal_code;
        }
        if ((i3 & 32) != 0) {
            str4 = cardDataResponse.card_type;
        }
        if ((i3 & 64) != 0) {
            str5 = cardDataResponse.prepaid_type;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        int i4 = i;
        return cardDataResponse.copy(str, str2, i4, i2, str8, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCard_brand() {
        return this.card_brand;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLast_4() {
        return this.last_4;
    }

    /* renamed from: component3, reason: from getter */
    public final int getExp_month() {
        return this.exp_month;
    }

    /* renamed from: component4, reason: from getter */
    public final int getExp_year() {
        return this.exp_year;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBilling_postal_code() {
        return this.billing_postal_code;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCard_type() {
        return this.card_type;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPrepaid_type() {
        return this.prepaid_type;
    }

    public final CardDataResponse copy(String card_brand, String last_4, int exp_month, int exp_year, String billing_postal_code, String card_type, String prepaid_type) {
        card_brand.getClass();
        last_4.getClass();
        return new CardDataResponse(card_brand, last_4, exp_month, exp_year, billing_postal_code, card_type, prepaid_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDataResponse)) {
            return false;
        }
        CardDataResponse cardDataResponse = (CardDataResponse) other;
        return Intrinsics.areEqual(this.card_brand, cardDataResponse.card_brand) && Intrinsics.areEqual(this.last_4, cardDataResponse.last_4) && this.exp_month == cardDataResponse.exp_month && this.exp_year == cardDataResponse.exp_year && Intrinsics.areEqual(this.billing_postal_code, cardDataResponse.billing_postal_code) && Intrinsics.areEqual(this.card_type, cardDataResponse.card_type) && Intrinsics.areEqual(this.prepaid_type, cardDataResponse.prepaid_type);
    }

    public final String getBilling_postal_code() {
        return this.billing_postal_code;
    }

    public final String getCard_brand() {
        return this.card_brand;
    }

    public final String getCard_type() {
        return this.card_type;
    }

    public final int getExp_month() {
        return this.exp_month;
    }

    public final int getExp_year() {
        return this.exp_year;
    }

    public final String getLast_4() {
        return this.last_4;
    }

    public final String getPrepaid_type() {
        return this.prepaid_type;
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.exp_year, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.exp_month, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.card_brand.hashCode() * 31, 31, this.last_4), 31), 31);
        String str = this.billing_postal_code;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.card_type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.prepaid_type;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.card_brand;
        String str2 = this.last_4;
        int i = this.exp_month;
        int i2 = this.exp_year;
        String str3 = this.billing_postal_code;
        String str4 = this.card_type;
        String str5 = this.prepaid_type;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardDataResponse(card_brand=", str, ", last_4=", str2, ", exp_month=");
        Recorder$$ExternalSyntheticOutline1.m105m(i, i2, ", exp_year=", ", billing_postal_code=", m);
        Boxes$$ExternalSyntheticOutline1.m(m, str3, ", card_type=", str4, ", prepaid_type=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, str5, ")");
    }
}
