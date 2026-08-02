package com.stripe.android.model;

import com.squareup.moshi.LinkedHashTreeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import net.idrnd.face.iad.capture.internal.y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class CardBrand {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ CardBrand[] $VALUES;
    public static final CardBrand AmericanExpress;
    public static final y0 Companion;
    public static final CardBrand DinersClub;
    public static final CardBrand Discover;
    public static final CardBrand JCB;
    public static final CardBrand MasterCard;
    public static final CardBrand UnionPay;
    public static final CardBrand Unknown;
    public static final CardBrand Visa;
    public static final List orderedBrands;
    public final String code;
    public final int renderingOrder;
    public final boolean shouldRender;

    static {
        Pattern.compile("^(4)[0-9]*$");
        MapsKt__MapsJVMKt.mapOf(new Pair(1, Pattern.compile("^4$")));
        CardBrand cardBrand = new CardBrand("Visa", 0, "visa", 1, 1656);
        Visa = cardBrand;
        Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$");
        MapsKt__MapsKt.mapOf(new Pair(1, Pattern.compile("^2|5|6$")), new Pair(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$")));
        CardBrand cardBrand2 = new CardBrand("MasterCard", 1, "mastercard", 2, 1656);
        MasterCard = cardBrand2;
        ArraysKt___ArraysKt.toSet(new Integer[]{3, 4});
        Pattern.compile("^(34|37)[0-9]*$");
        MapsKt__MapsJVMKt.mapOf(new Pair(1, Pattern.compile("^3$")));
        CardBrand cardBrand3 = new CardBrand("AmericanExpress", 2, "amex", 3, 1552);
        AmericanExpress = cardBrand3;
        Pattern.compile("^(60|64|65)[0-9]*$");
        MapsKt__MapsJVMKt.mapOf(new Pair(1, Pattern.compile("^6$")));
        CardBrand cardBrand4 = new CardBrand("Discover", 3, "discover", 4, 1656);
        Discover = cardBrand4;
        Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$");
        MapsKt__MapsKt.mapOf(new Pair(1, Pattern.compile("^3$")), new Pair(2, Pattern.compile("^(35)$")), new Pair(3, Pattern.compile("^(35[2-8])$")));
        CardBrand cardBrand5 = new CardBrand("JCB", 4, "jcb", 5, 1656);
        JCB = cardBrand5;
        Pattern.compile("^(36|30|38|39)[0-9]*$");
        MapsKt__MapsJVMKt.mapOf(new Pair(1, Pattern.compile("^3$")));
        MapsKt__MapsJVMKt.mapOf(new Pair(Pattern.compile("^(36)[0-9]*$"), 14));
        CardBrand cardBrand6 = new CardBrand("DinersClub", 5, "diners", 6, 1080);
        DinersClub = cardBrand6;
        Pattern.compile("^(62|81)[0-9]*$");
        MapsKt__MapsJVMKt.mapOf(new Pair(1, Pattern.compile("^6|8$")));
        CardBrand cardBrand7 = new CardBrand("UnionPay", 6, "unionpay", 7, 1656);
        UnionPay = cardBrand7;
        Pattern.compile("(^(4)[0-9]*) |^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$");
        MapsKt__MapsKt.mapOf(new Pair(1, Pattern.compile("^4$")), new Pair(2, Pattern.compile("^2|5|6$")), new Pair(3, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$")));
        CardBrand cardBrand8 = new CardBrand("CartesBancaires", 7, "cartes_bancaires", 8, 632);
        Pattern.compile("^(4506|4519|4724|4536|500|5510|629449)[0-9]*$");
        MapsKt__MapsKt.mapOf(new Pair(1, Pattern.compile("^(4|5|6)$")), new Pair(2, Pattern.compile("^(45|50|55|62)$")), new Pair(3, Pattern.compile("^(450|451|472|453|500|551|629)$")), new Pair(4, Pattern.compile("^(4506|4519|4724|4536|5510|6294)$")), new Pair(5, Pattern.compile("^(62944)$")), new Pair(6, Pattern.compile("^(629449)$")));
        CardBrand cardBrand9 = new CardBrand("Interac", 8, "interac", 9, 632);
        ArraysKt___ArraysKt.toSet(new Integer[]{3, 4});
        EmptyMap.INSTANCE.getClass();
        CardBrand cardBrand10 = new CardBrand("Unknown", 9, "unknown", -1, 1752);
        Unknown = cardBrand10;
        CardBrand[] cardBrandArr = {cardBrand, cardBrand2, cardBrand3, cardBrand4, cardBrand5, cardBrand6, cardBrand7, cardBrand8, cardBrand9, cardBrand10};
        $VALUES = cardBrandArr;
        EnumEntriesList enumEntriesList = new EnumEntriesList(cardBrandArr);
        $ENTRIES = enumEntriesList;
        Companion = new y0();
        ArrayList arrayList = new ArrayList();
        ArrayIterator arrayIterator = new ArrayIterator(enumEntriesList);
        while (arrayIterator.hasNext()) {
            Object next = arrayIterator.next();
            if (((CardBrand) next).shouldRender) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (((CardBrand) next2).renderingOrder > 0) {
                arrayList2.add(next2);
            }
        }
        orderedBrands = CollectionsKt.sortedWith(arrayList2, new LinkedHashTreeMap.AnonymousClass1(20));
    }

    public CardBrand(String str, int i, String str2, int i2, int i3) {
        if ((i3 & 32) != 0) {
            SetsKt__SetsJVMKt.setOf(3);
        }
        if ((i3 & 512) != 0) {
            EmptyMap.INSTANCE.getClass();
        }
        boolean z = (i3 & 1024) != 0;
        this.code = str2;
        this.shouldRender = z;
        this.renderingOrder = i2;
    }

    public static CardBrand valueOf(String str) {
        return (CardBrand) Enum.valueOf(CardBrand.class, str);
    }

    public static CardBrand[] values() {
        return (CardBrand[]) $VALUES.clone();
    }
}
