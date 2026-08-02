package com.squareup.cash.threedsdataonly.viewmodels;

import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ThreeDsViewModel {

    public final class DefaultLoading extends ThreeDsViewModel {
        public final String progressMessage;

        public DefaultLoading(String str) {
            this.progressMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DefaultLoading) && Intrinsics.areEqual(this.progressMessage, ((DefaultLoading) obj).progressMessage);
        }

        @Override // com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewModel
        public final String getProgressMessage() {
            return this.progressMessage;
        }

        public final int hashCode() {
            String str = this.progressMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DefaultLoading(progressMessage=", this.progressMessage, ")");
        }
    }

    public final class IssuerLoading extends ThreeDsViewModel {
        public final Image issuerLogo;
        public final String progressMessage;

        public IssuerLoading(String str, Image image) {
            image.getClass();
            this.progressMessage = str;
            this.issuerLogo = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IssuerLoading)) {
                return false;
            }
            IssuerLoading issuerLoading = (IssuerLoading) obj;
            return Intrinsics.areEqual(this.progressMessage, issuerLoading.progressMessage) && Intrinsics.areEqual(this.issuerLogo, issuerLoading.issuerLogo);
        }

        @Override // com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewModel
        public final String getProgressMessage() {
            return this.progressMessage;
        }

        public final int hashCode() {
            String str = this.progressMessage;
            return this.issuerLogo.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "IssuerLoading(progressMessage=" + this.progressMessage + ", issuerLogo=" + this.issuerLogo + ")";
        }
    }

    public abstract String getProgressMessage();
}
