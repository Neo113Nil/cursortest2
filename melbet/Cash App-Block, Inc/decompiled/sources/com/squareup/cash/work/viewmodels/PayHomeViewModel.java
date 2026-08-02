package com.squareup.cash.work.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PayHomeViewModel {

    public final class Error implements PayHomeViewModel {
        public final String message;

        public Error(String str) {
            str.getClass();
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(message=", this.message, ")");
        }
    }

    public final class Loaded implements PayHomeViewModel {
        public final String basePay;
        public final String estimatedTotal;
        public final String hoursWorked;
        public final String merchantName;
        public final List pastPayStubs;
        public final String payPeriod;
        public final String paydayDate;
        public final SellerCardViewModel sellerCard;
        public final boolean showDirectDeposit;
        public final boolean showLinkedAccounts;
        public final boolean showSeeMoreButton;
        public final String timecards;
        public final String tips;

        public Loaded(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SellerCardViewModel sellerCardViewModel, List list, boolean z, boolean z2, boolean z3) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
            str6.getClass();
            str7.getClass();
            str8.getClass();
            list.getClass();
            this.paydayDate = str;
            this.estimatedTotal = str2;
            this.timecards = str3;
            this.hoursWorked = str4;
            this.payPeriod = str5;
            this.basePay = str6;
            this.tips = str7;
            this.merchantName = str8;
            this.sellerCard = sellerCardViewModel;
            this.pastPayStubs = list;
            this.showSeeMoreButton = z;
            this.showDirectDeposit = z2;
            this.showLinkedAccounts = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.paydayDate, loaded.paydayDate) && Intrinsics.areEqual(this.estimatedTotal, loaded.estimatedTotal) && Intrinsics.areEqual(this.timecards, loaded.timecards) && Intrinsics.areEqual(this.hoursWorked, loaded.hoursWorked) && Intrinsics.areEqual(this.payPeriod, loaded.payPeriod) && Intrinsics.areEqual(this.basePay, loaded.basePay) && Intrinsics.areEqual(this.tips, loaded.tips) && Intrinsics.areEqual(this.merchantName, loaded.merchantName) && this.sellerCard.equals(loaded.sellerCard) && Intrinsics.areEqual(this.pastPayStubs, loaded.pastPayStubs) && this.showSeeMoreButton == loaded.showSeeMoreButton && this.showDirectDeposit == loaded.showDirectDeposit && this.showLinkedAccounts == loaded.showLinkedAccounts;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((this.sellerCard.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.paydayDate.hashCode() * 31, 31, this.estimatedTotal), 31, this.timecards), 31, this.hoursWorked), 31, this.payPeriod), 31, this.basePay), 31, this.tips), 31, this.merchantName)) * 31, 31, this.pastPayStubs), 31, this.showSeeMoreButton), 31, this.showDirectDeposit), 31, this.showLinkedAccounts);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(paydayDate=", this.paydayDate, ", estimatedTotal=", this.estimatedTotal, ", timecards=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.timecards, ", hoursWorked=", this.hoursWorked, ", payPeriod=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.payPeriod, ", basePay=", this.basePay, ", tips=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.tips, ", merchantName=", this.merchantName, ", sellerCard=");
            m.append(this.sellerCard);
            m.append(", pastPayStubs=");
            m.append(this.pastPayStubs);
            m.append(", showSeeMoreButton=");
            re$$ExternalSyntheticOutline0.m(m, this.showSeeMoreButton, ", showDirectDeposit=", this.showDirectDeposit, ", showLinkedAccounts=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.showLinkedAccounts, ", showTaxForms=false)");
        }
    }

    public final class Loading implements PayHomeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1568689599;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
