package squareup.cash.cryptocurrency;

import android.os.Parcelable;
import com.squareup.protos.person.Alias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class CryptoEligibilities extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CryptoEligibilities> CREATOR;
    public final CryptoEligibilityStatus btc_deposit;
    public final CryptoEligibilityStatus btc_lightning_deposit;
    public final CryptoEligibilityStatus btc_lightning_withdraw;
    public final CryptoEligibilityStatus btc_map;
    public final CryptoEligibilityStatus btc_p2p_receive;
    public final CryptoEligibilityStatus btc_p2p_send;
    public final CryptoEligibilityStatus btc_withdraw;

    static {
        CryptoEligibilities$Companion$ADAPTER$1 cryptoEligibilities$Companion$ADAPTER$1 = new CryptoEligibilities$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CryptoEligibilities.class), "type.googleapis.com/squareup.cash.cryptocurrency.CryptoEligibilities", Syntax.PROTO_3, null, "squareup/cash/cryptocurrency/CryptoEligibilities.proto");
        ADAPTER = cryptoEligibilities$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cryptoEligibilities$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoEligibilities(CryptoEligibilityStatus cryptoEligibilityStatus, CryptoEligibilityStatus cryptoEligibilityStatus2, CryptoEligibilityStatus cryptoEligibilityStatus3, CryptoEligibilityStatus cryptoEligibilityStatus4, CryptoEligibilityStatus cryptoEligibilityStatus5, CryptoEligibilityStatus cryptoEligibilityStatus6, CryptoEligibilityStatus cryptoEligibilityStatus7, ByteString byteString) {
        super(ADAPTER, byteString);
        cryptoEligibilityStatus.getClass();
        cryptoEligibilityStatus2.getClass();
        cryptoEligibilityStatus3.getClass();
        cryptoEligibilityStatus4.getClass();
        cryptoEligibilityStatus5.getClass();
        cryptoEligibilityStatus6.getClass();
        cryptoEligibilityStatus7.getClass();
        byteString.getClass();
        this.btc_p2p_send = cryptoEligibilityStatus;
        this.btc_p2p_receive = cryptoEligibilityStatus2;
        this.btc_withdraw = cryptoEligibilityStatus3;
        this.btc_deposit = cryptoEligibilityStatus4;
        this.btc_lightning_withdraw = cryptoEligibilityStatus5;
        this.btc_lightning_deposit = cryptoEligibilityStatus6;
        this.btc_map = cryptoEligibilityStatus7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CryptoEligibilities)) {
            return false;
        }
        CryptoEligibilities cryptoEligibilities = (CryptoEligibilities) obj;
        return Intrinsics.areEqual(unknownFields(), cryptoEligibilities.unknownFields()) && this.btc_p2p_send == cryptoEligibilities.btc_p2p_send && this.btc_p2p_receive == cryptoEligibilities.btc_p2p_receive && this.btc_withdraw == cryptoEligibilities.btc_withdraw && this.btc_deposit == cryptoEligibilities.btc_deposit && this.btc_lightning_withdraw == cryptoEligibilities.btc_lightning_withdraw && this.btc_lightning_deposit == cryptoEligibilities.btc_lightning_deposit && this.btc_map == cryptoEligibilities.btc_map;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.btc_map.hashCode() + ((this.btc_lightning_deposit.hashCode() + ((this.btc_lightning_withdraw.hashCode() + ((this.btc_deposit.hashCode() + ((this.btc_withdraw.hashCode() + ((this.btc_p2p_receive.hashCode() + ((this.btc_p2p_send.hashCode() + (unknownFields().hashCode() * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(26, false);
        POPMatchingFactory pOPMatchingFactory = CryptoEligibilityStatus.Companion;
        builder.f1407type = this.btc_p2p_send;
        builder.scope = this.btc_p2p_receive;
        builder.value = this.btc_withdraw;
        builder.first_verified_at_ms = this.btc_deposit;
        builder.last_verified_at_ms = this.btc_lightning_withdraw;
        builder.created_at = this.btc_lightning_deposit;
        builder.updated_at = this.btc_map;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("btc_p2p_send=" + this.btc_p2p_send);
        arrayList.add("btc_p2p_receive=" + this.btc_p2p_receive);
        arrayList.add("btc_withdraw=" + this.btc_withdraw);
        arrayList.add("btc_deposit=" + this.btc_deposit);
        arrayList.add("btc_lightning_withdraw=" + this.btc_lightning_withdraw);
        arrayList.add("btc_lightning_deposit=" + this.btc_lightning_deposit);
        arrayList.add("btc_map=" + this.btc_map);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoEligibilities{", "}", 0, null, null, 56);
    }
}
