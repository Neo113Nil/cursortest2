package sqip.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import sqip.Card;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f¨\u0006\r"}, d2 = {"toBrand", "Lsqip/Card$Brand;", "brandString", "", "toPrepaidType", "Lsqip/Card$PrepaidType;", "prepaid", "toType", "Lsqip/Card$Type;", "type", "toCardData", "Lsqip/Card;", "Lsqip/internal/CardDataResponse;", "sqip_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardDataResponseKt {
    private static final Card.Brand toBrand(String str) {
        EnumEntries entries = Card.Brand.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((Card.Brand) it.next()).name());
        }
        return arrayList.contains(str) ? Card.Brand.valueOf(str) : Intrinsics.areEqual(str, "MASTER_CARD") ? Card.Brand.MASTERCARD : Intrinsics.areEqual(str, "UNION_PAY") ? Card.Brand.CHINA_UNION_PAY : Card.Brand.OTHER_BRAND;
    }

    public static final Card toCardData(CardDataResponse cardDataResponse) {
        cardDataResponse.getClass();
        return new Card(toBrand(cardDataResponse.getCard_brand()), cardDataResponse.getLast_4(), cardDataResponse.getExp_month(), cardDataResponse.getExp_year(), cardDataResponse.getBilling_postal_code(), toType(cardDataResponse.getCard_type()), toPrepaidType(cardDataResponse.getPrepaid_type()));
    }

    private static final Card.PrepaidType toPrepaidType(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 187566659) {
                if (hashCode != 399611855) {
                    if (hashCode == 1813936031 && str.equals("UNKNOWN_PREPAID_TYPE")) {
                        return Card.PrepaidType.UNKNOWN;
                    }
                } else if (str.equals("PREPAID")) {
                    return Card.PrepaidType.PREPAID;
                }
            } else if (str.equals("NOT_PREPAID")) {
                return Card.PrepaidType.NOT_PREPAID;
            }
        }
        return Card.PrepaidType.UNKNOWN;
    }

    private static final Card.Type toType(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 64920780) {
                if (hashCode != 1996005113) {
                    if (hashCode == 2108800308 && str.equals("UNKNOWN_CARD_TYPE")) {
                        return Card.Type.UNKNOWN;
                    }
                } else if (str.equals("CREDIT")) {
                    return Card.Type.CREDIT;
                }
            } else if (str.equals("DEBIT")) {
                return Card.Type.DEBIT;
            }
        }
        return Card.Type.UNKNOWN;
    }
}
