package com.squareup.cash.work.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PayHistoryListViewModel {

    public final class Error implements PayHistoryListViewModel {
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

    public final class Loaded implements PayHistoryListViewModel {
        public final boolean hasMoreItems;
        public final boolean isLoadingMore;
        public final String merchantName;
        public final List sections;
        public final SellerCardViewModel sellerCard;

        public Loaded(SellerCardViewModel sellerCardViewModel, String str, List list, boolean z, boolean z2) {
            str.getClass();
            sellerCardViewModel.getClass();
            this.merchantName = str;
            this.sellerCard = sellerCardViewModel;
            this.sections = list;
            this.isLoadingMore = z;
            this.hasMoreItems = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.merchantName, loaded.merchantName) && Intrinsics.areEqual(this.sellerCard, loaded.sellerCard) && this.sections.equals(loaded.sections) && this.isLoadingMore == loaded.isLoadingMore && this.hasMoreItems == loaded.hasMoreItems;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasMoreItems) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((this.sellerCard.hashCode() + (this.merchantName.hashCode() * 31)) * 31, 31, this.sections), 31, this.isLoadingMore);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(merchantName=");
            sb.append(this.merchantName);
            sb.append(", sellerCard=");
            sb.append(this.sellerCard);
            sb.append(", sections=");
            sb.append(this.sections);
            sb.append(", isLoadingMore=");
            sb.append(this.isLoadingMore);
            sb.append(", hasMoreItems=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasMoreItems, ")");
        }
    }

    public final class Loading implements PayHistoryListViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1934981676;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
