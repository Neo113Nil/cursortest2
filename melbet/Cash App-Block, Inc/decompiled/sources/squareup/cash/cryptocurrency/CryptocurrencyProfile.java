package squareup.cash.cryptocurrency;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class CryptocurrencyProfile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CryptocurrencyProfile> CREATOR;
    public final BitcoinDisplayUnits bitcoin_display_units;
    public final CryptoEligibilities eligibilities;
    public final Boolean has_usd_over_ln_payment;

    static {
        CryptocurrencyProfile$Companion$ADAPTER$1 cryptocurrencyProfile$Companion$ADAPTER$1 = new CryptocurrencyProfile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CryptocurrencyProfile.class), "type.googleapis.com/squareup.cash.cryptocurrency.CryptocurrencyProfile", Syntax.PROTO_2, null, "squareup/cash/cryptocurrency/CryptocurrencyProfile.proto");
        ADAPTER = cryptocurrencyProfile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cryptocurrencyProfile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptocurrencyProfile(CryptoEligibilities cryptoEligibilities, BitcoinDisplayUnits bitcoinDisplayUnits, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.eligibilities = cryptoEligibilities;
        this.bitcoin_display_units = bitcoinDisplayUnits;
        this.has_usd_over_ln_payment = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CryptocurrencyProfile)) {
            return false;
        }
        CryptocurrencyProfile cryptocurrencyProfile = (CryptocurrencyProfile) obj;
        return Intrinsics.areEqual(unknownFields(), cryptocurrencyProfile.unknownFields()) && Intrinsics.areEqual(this.eligibilities, cryptocurrencyProfile.eligibilities) && this.bitcoin_display_units == cryptocurrencyProfile.bitcoin_display_units && Intrinsics.areEqual(this.has_usd_over_ln_payment, cryptocurrencyProfile.has_usd_over_ln_payment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CryptoEligibilities cryptoEligibilities = this.eligibilities;
        int hashCode2 = (hashCode + (cryptoEligibilities != null ? cryptoEligibilities.hashCode() : 0)) * 37;
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoin_display_units;
        int hashCode3 = (hashCode2 + (bitcoinDisplayUnits != null ? bitcoinDisplayUnits.hashCode() : 0)) * 37;
        Boolean bool = this.has_usd_over_ln_payment;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(15);
        builder.action = this.eligibilities;
        builder.full_applet = this.bitcoin_display_units;
        builder.half_applet = this.has_usd_over_ln_payment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CryptoEligibilities cryptoEligibilities = this.eligibilities;
        if (cryptoEligibilities != null) {
            arrayList.add("eligibilities=" + cryptoEligibilities);
        }
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoin_display_units;
        if (bitcoinDisplayUnits != null) {
            arrayList.add("bitcoin_display_units=" + bitcoinDisplayUnits);
        }
        Boolean bool = this.has_usd_over_ln_payment;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_usd_over_ln_payment=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptocurrencyProfile{", "}", 0, null, null, 56);
    }
}
