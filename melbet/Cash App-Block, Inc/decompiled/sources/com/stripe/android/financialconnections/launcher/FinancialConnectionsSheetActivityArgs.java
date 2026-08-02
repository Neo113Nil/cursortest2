package com.stripe.android.financialconnections.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.Country;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class FinancialConnectionsSheetActivityArgs implements Parcelable {

    public final class ForData extends FinancialConnectionsSheetActivityArgs {
        public static final Parcelable.Creator<ForData> CREATOR = new Country.Creator(15);
        public final FinancialConnectionsSheetConfiguration configuration;
        public final ElementsSessionContext elementsSessionContext;

        public ForData(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext) {
            financialConnectionsSheetConfiguration.getClass();
            this.configuration = financialConnectionsSheetConfiguration;
            this.elementsSessionContext = elementsSessionContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForData)) {
                return false;
            }
            ForData forData = (ForData) obj;
            return Intrinsics.areEqual(this.configuration, forData.configuration) && Intrinsics.areEqual(this.elementsSessionContext, forData.elementsSessionContext);
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public final FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        public final int hashCode() {
            int hashCode = this.configuration.hashCode() * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return hashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
        }

        public final String toString() {
            return "ForData(configuration=" + this.configuration + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.configuration.writeToParcel(parcel, i);
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            if (elementsSessionContext == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                elementsSessionContext.writeToParcel(parcel, i);
            }
        }
    }

    public final class ForInstantDebits extends FinancialConnectionsSheetActivityArgs {
        public static final Parcelable.Creator<ForInstantDebits> CREATOR = new Country.Creator(16);
        public final FinancialConnectionsSheetConfiguration configuration;
        public final ElementsSessionContext elementsSessionContext;

        public ForInstantDebits(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext) {
            financialConnectionsSheetConfiguration.getClass();
            this.configuration = financialConnectionsSheetConfiguration;
            this.elementsSessionContext = elementsSessionContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForInstantDebits)) {
                return false;
            }
            ForInstantDebits forInstantDebits = (ForInstantDebits) obj;
            return Intrinsics.areEqual(this.configuration, forInstantDebits.configuration) && Intrinsics.areEqual(this.elementsSessionContext, forInstantDebits.elementsSessionContext);
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public final FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        public final int hashCode() {
            int hashCode = this.configuration.hashCode() * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return hashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
        }

        public final String toString() {
            return "ForInstantDebits(configuration=" + this.configuration + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.configuration.writeToParcel(parcel, i);
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            if (elementsSessionContext == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                elementsSessionContext.writeToParcel(parcel, i);
            }
        }
    }

    public final class ForToken extends FinancialConnectionsSheetActivityArgs {
        public static final Parcelable.Creator<ForToken> CREATOR = new Country.Creator(17);
        public final FinancialConnectionsSheetConfiguration configuration;
        public final ElementsSessionContext elementsSessionContext;

        public ForToken(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext) {
            financialConnectionsSheetConfiguration.getClass();
            this.configuration = financialConnectionsSheetConfiguration;
            this.elementsSessionContext = elementsSessionContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForToken)) {
                return false;
            }
            ForToken forToken = (ForToken) obj;
            return Intrinsics.areEqual(this.configuration, forToken.configuration) && Intrinsics.areEqual(this.elementsSessionContext, forToken.elementsSessionContext);
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public final FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        public final int hashCode() {
            int hashCode = this.configuration.hashCode() * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return hashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
        }

        public final String toString() {
            return "ForToken(configuration=" + this.configuration + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.configuration.writeToParcel(parcel, i);
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            if (elementsSessionContext == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                elementsSessionContext.writeToParcel(parcel, i);
            }
        }
    }

    public abstract FinancialConnectionsSheetConfiguration getConfiguration();

    public abstract ElementsSessionContext getElementsSessionContext();
}
