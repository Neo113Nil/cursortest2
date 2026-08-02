package io.flutter.plugins.inapppurchase;

import E.AbstractC0005f;
import d3.j;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformUserChoiceProduct {
    public static final Companion Companion = new Companion(null);
    private final String id;
    private final String offerToken;
    private final PlatformProductType type;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final PlatformUserChoiceProduct fromList(List<? extends Object> list) {
            String str = (String) AbstractC0005f.h(list, "pigeonVar_list", 0, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) list.get(1);
            Object obj = list.get(2);
            i.c(obj, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
            return new PlatformUserChoiceProduct(str, str2, (PlatformProductType) obj);
        }

        private Companion() {
        }
    }

    public PlatformUserChoiceProduct(String id, String str, PlatformProductType type) {
        i.e(id, "id");
        i.e(type, "type");
        this.id = id;
        this.offerToken = str;
        this.type = type;
    }

    public static /* synthetic */ PlatformUserChoiceProduct copy$default(PlatformUserChoiceProduct platformUserChoiceProduct, String str, String str2, PlatformProductType platformProductType, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = platformUserChoiceProduct.id;
        }
        if ((i4 & 2) != 0) {
            str2 = platformUserChoiceProduct.offerToken;
        }
        if ((i4 & 4) != 0) {
            platformProductType = platformUserChoiceProduct.type;
        }
        return platformUserChoiceProduct.copy(str, str2, platformProductType);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.offerToken;
    }

    public final PlatformProductType component3() {
        return this.type;
    }

    public final PlatformUserChoiceProduct copy(String id, String str, PlatformProductType type) {
        i.e(id, "id");
        i.e(type, "type");
        return new PlatformUserChoiceProduct(id, str, type);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(PlatformUserChoiceProduct.class)) {
            if (this == obj) {
                return true;
            }
            PlatformUserChoiceProduct platformUserChoiceProduct = (PlatformUserChoiceProduct) obj;
            MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
            if (messagesPigeonUtils.deepEquals(this.id, platformUserChoiceProduct.id) && messagesPigeonUtils.deepEquals(this.offerToken, platformUserChoiceProduct.offerToken) && messagesPigeonUtils.deepEquals(this.type, platformUserChoiceProduct.type)) {
                return true;
            }
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final PlatformProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = PlatformUserChoiceProduct.class.hashCode() * 31;
        MessagesPigeonUtils messagesPigeonUtils = MessagesPigeonUtils.INSTANCE;
        return ((((hashCode + messagesPigeonUtils.deepHash(this.id)) * 31) + messagesPigeonUtils.deepHash(this.offerToken)) * 31) + messagesPigeonUtils.deepHash(this.type);
    }

    public final List<Object> toList() {
        return j.W(this.id, this.offerToken, this.type);
    }

    public String toString() {
        return "PlatformUserChoiceProduct(id=" + this.id + ", offerToken=" + this.offerToken + ", type=" + this.type + ")";
    }

    public /* synthetic */ PlatformUserChoiceProduct(String str, String str2, PlatformProductType platformProductType, int i4, kotlin.jvm.internal.e eVar) {
        this(str, (i4 & 2) != 0 ? null : str2, platformProductType);
    }
}
