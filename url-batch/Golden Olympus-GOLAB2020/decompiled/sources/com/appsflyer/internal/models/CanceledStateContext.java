package com.appsflyer.internal.models;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA2z;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class CanceledStateContext {
    public static final Companion Companion = new Companion(null);
    private final DeveloperInitiatedCancellation developerInitiatedCancellation;
    private final ReplacementCancellation replacementCancellation;
    private final SystemInitiatedCancellation systemInitiatedCancellation;
    private final UserInitiatedCancellation userInitiatedCancellation;

    @Metadata
    public static final class Companion implements Deserialize<CanceledStateContext> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 1;
        private static int getPackageName = 0;
        private static long getQuantity = 6123178973585501029L;

        private Companion() {
        }

        private static void a(String str, int i4, Object[] objArr) {
            char[] cArr = str;
            if (str != null) {
                int i5 = $11 + 97;
                $10 = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i5 % 2 != 0) {
                    int i6 = 22 / 0;
                    cArr = str.toCharArray();
                } else {
                    cArr = str.toCharArray();
                }
            }
            AFPurchaseConnectorA2z aFPurchaseConnectorA2z = new AFPurchaseConnectorA2z();
            char[] oneTimePurchaseOfferDetails = AFPurchaseConnectorA2z.getOneTimePurchaseOfferDetails(getQuantity ^ 7848782090230080433L, cArr, i4);
            aFPurchaseConnectorA2z.getPackageName = 4;
            while (true) {
                int i7 = aFPurchaseConnectorA2z.getPackageName;
                if (i7 >= oneTimePurchaseOfferDetails.length) {
                    break;
                }
                $11 = ($10 + InterfaceC1490j3.d.b.f16810b) % UserVerificationMethods.USER_VERIFY_PATTERN;
                aFPurchaseConnectorA2z.getOneTimePurchaseOfferDetails = i7 - 4;
                oneTimePurchaseOfferDetails[i7] = (char) ((oneTimePurchaseOfferDetails[i7] ^ oneTimePurchaseOfferDetails[i7 % 4]) ^ (r3 * (getQuantity ^ 7848782090230080433L)));
                aFPurchaseConnectorA2z.getPackageName = i7 + 1;
            }
            String str2 = new String(oneTimePurchaseOfferDetails, 4, oneTimePurchaseOfferDetails.length - 4);
            int i8 = $11 + 33;
            $10 = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i8 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ CanceledStateContext fromJson(JSONObject jSONObject) {
            int i4 = getOneTimePurchaseOfferDetails + InterfaceC1490j3.d.b.f16815g;
            getPackageName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i5 = i4 % 2;
            CanceledStateContext fromJson = fromJson(jSONObject);
            if (i5 != 0) {
                int i6 = 78 / 0;
            }
            getOneTimePurchaseOfferDetails = (getPackageName + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final CanceledStateContext fromJson(JSONObject jSONObject) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("氬\uda93汈捲ሢ뼨\uf2ac\ue531伐㛘ퟺ슁⫾햮뭔ṝ֨\ue83e颋笰\ue109賣緙壵\udcd2ꎔℯ둈뾠䙆ڎ鄝魳\u1af9", TextUtils.getOffsetAfter("", 0), objArr);
            object = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr[0]).intern(), DeveloperInitiatedCancellation.Companion);
            Object[] objArr2 = new Object[1];
            a("‟\ue833\u206d䅲₂篕킪⇅̮Ѵ\uf5efٴ曚\ue729饎\uda8a䦎\uda99몉뿜괳빋忻鰝郦鄸̤", View.resolveSizeAndState(0, 0, 0), objArr2);
            object2 = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr2[0]).intern(), ReplacementCancellation.Companion);
            Object[] objArr3 = new Object[1];
            a("戟椫扬伪ꆆ旪\udef1㿢䄪蕢ﮛᡈⓖ昫霋쒗\u0b9b宊듖ꇅ\uef3e㽑冡舳틣ဣ൳溒놖\uf5f0⫌", (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
            object3 = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr3[0]).intern(), SystemInitiatedCancellation.Companion);
            Object[] objArr4 = new Object[1];
            a("\udc12发\udc67뗎魶遪␃쩤＋뾛ş\uedd2髛峄淲ㄓ떆慖丷周儱֠ꭊ瞺泣⫁\uf79f鬉ྜ", View.resolveSize(0, 0), objArr4);
            object4 = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr4[0]).intern(), UserInitiatedCancellation.Companion);
            CanceledStateContext canceledStateContext = new CanceledStateContext((DeveloperInitiatedCancellation) object, (ReplacementCancellation) object2, (SystemInitiatedCancellation) object3, (UserInitiatedCancellation) object4);
            getOneTimePurchaseOfferDetails = (getPackageName + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return canceledStateContext;
        }
    }

    public CanceledStateContext(DeveloperInitiatedCancellation developerInitiatedCancellation, ReplacementCancellation replacementCancellation, SystemInitiatedCancellation systemInitiatedCancellation, UserInitiatedCancellation userInitiatedCancellation) {
        this.developerInitiatedCancellation = developerInitiatedCancellation;
        this.replacementCancellation = replacementCancellation;
        this.systemInitiatedCancellation = systemInitiatedCancellation;
        this.userInitiatedCancellation = userInitiatedCancellation;
    }

    public static /* synthetic */ CanceledStateContext copy$default(CanceledStateContext canceledStateContext, DeveloperInitiatedCancellation developerInitiatedCancellation, ReplacementCancellation replacementCancellation, SystemInitiatedCancellation systemInitiatedCancellation, UserInitiatedCancellation userInitiatedCancellation, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            developerInitiatedCancellation = canceledStateContext.developerInitiatedCancellation;
        }
        if ((i4 & 2) != 0) {
            replacementCancellation = canceledStateContext.replacementCancellation;
        }
        if ((i4 & 4) != 0) {
            systemInitiatedCancellation = canceledStateContext.systemInitiatedCancellation;
        }
        if ((i4 & 8) != 0) {
            userInitiatedCancellation = canceledStateContext.userInitiatedCancellation;
        }
        return canceledStateContext.copy(developerInitiatedCancellation, replacementCancellation, systemInitiatedCancellation, userInitiatedCancellation);
    }

    public final DeveloperInitiatedCancellation component1() {
        return this.developerInitiatedCancellation;
    }

    public final ReplacementCancellation component2() {
        return this.replacementCancellation;
    }

    public final SystemInitiatedCancellation component3() {
        return this.systemInitiatedCancellation;
    }

    public final UserInitiatedCancellation component4() {
        return this.userInitiatedCancellation;
    }

    public final CanceledStateContext copy(DeveloperInitiatedCancellation developerInitiatedCancellation, ReplacementCancellation replacementCancellation, SystemInitiatedCancellation systemInitiatedCancellation, UserInitiatedCancellation userInitiatedCancellation) {
        return new CanceledStateContext(developerInitiatedCancellation, replacementCancellation, systemInitiatedCancellation, userInitiatedCancellation);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanceledStateContext)) {
            return false;
        }
        CanceledStateContext canceledStateContext = (CanceledStateContext) obj;
        return Intrinsics.areEqual(this.developerInitiatedCancellation, canceledStateContext.developerInitiatedCancellation) && Intrinsics.areEqual(this.replacementCancellation, canceledStateContext.replacementCancellation) && Intrinsics.areEqual(this.systemInitiatedCancellation, canceledStateContext.systemInitiatedCancellation) && Intrinsics.areEqual(this.userInitiatedCancellation, canceledStateContext.userInitiatedCancellation);
    }

    public final DeveloperInitiatedCancellation getDeveloperInitiatedCancellation() {
        return this.developerInitiatedCancellation;
    }

    public final ReplacementCancellation getReplacementCancellation() {
        return this.replacementCancellation;
    }

    public final SystemInitiatedCancellation getSystemInitiatedCancellation() {
        return this.systemInitiatedCancellation;
    }

    public final UserInitiatedCancellation getUserInitiatedCancellation() {
        return this.userInitiatedCancellation;
    }

    public final int hashCode() {
        DeveloperInitiatedCancellation developerInitiatedCancellation = this.developerInitiatedCancellation;
        int hashCode = (developerInitiatedCancellation == null ? 0 : developerInitiatedCancellation.hashCode()) * 31;
        ReplacementCancellation replacementCancellation = this.replacementCancellation;
        int hashCode2 = (hashCode + (replacementCancellation == null ? 0 : replacementCancellation.hashCode())) * 31;
        SystemInitiatedCancellation systemInitiatedCancellation = this.systemInitiatedCancellation;
        int hashCode3 = (hashCode2 + (systemInitiatedCancellation == null ? 0 : systemInitiatedCancellation.hashCode())) * 31;
        UserInitiatedCancellation userInitiatedCancellation = this.userInitiatedCancellation;
        return hashCode3 + (userInitiatedCancellation != null ? userInitiatedCancellation.hashCode() : 0);
    }

    public final String toString() {
        return "CanceledStateContext(developerInitiatedCancellation=" + this.developerInitiatedCancellation + ", replacementCancellation=" + this.replacementCancellation + ", systemInitiatedCancellation=" + this.systemInitiatedCancellation + ", userInitiatedCancellation=" + this.userInitiatedCancellation + ")";
    }
}
