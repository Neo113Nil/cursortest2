package com.squareup.cash.transfers.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.squareup.cash.out.sync_entity.BankAccountQualifier;
import com.squareup.cash.out.sync_entity.DebitCardQualifier;
import com.squareup.cash.out.sync_entity.SupportedFlows;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashOutCapabilityManager$CashOutCapabilities {
    public final ArrayList capabilities;
    public final ArrayList preselectionPriority;
    public final ArrayList unsupportedSpeedActions;

    public final class InstrumentCapability {
        public final CashInstrumentType instrumentType;
        public final ArrayList qualifiedCapability;

        public InstrumentCapability(CashInstrumentType cashInstrumentType, ArrayList arrayList) {
            cashInstrumentType.getClass();
            this.instrumentType = cashInstrumentType;
            this.qualifiedCapability = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentCapability)) {
                return false;
            }
            InstrumentCapability instrumentCapability = (InstrumentCapability) obj;
            return this.instrumentType == instrumentCapability.instrumentType && this.qualifiedCapability.equals(instrumentCapability.qualifiedCapability);
        }

        public final int hashCode() {
            return this.qualifiedCapability.hashCode() + (this.instrumentType.hashCode() * 31);
        }

        public final String toString() {
            return "InstrumentCapability(instrumentType=" + this.instrumentType + ", qualifiedCapability=" + this.qualifiedCapability + ")";
        }
    }

    public interface InstrumentQualifier {

        public final class BankAccount implements InstrumentQualifier {
            public final BankAccountQualifier bankAccountQualifier;

            public BankAccount(BankAccountQualifier bankAccountQualifier) {
                bankAccountQualifier.getClass();
                this.bankAccountQualifier = bankAccountQualifier;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BankAccount) && this.bankAccountQualifier == ((BankAccount) obj).bankAccountQualifier;
            }

            public final int hashCode() {
                return this.bankAccountQualifier.hashCode();
            }

            public final String toString() {
                return "BankAccount(bankAccountQualifier=" + this.bankAccountQualifier + ")";
            }
        }

        public final class Debit implements InstrumentQualifier {
            public final DebitCardQualifier debitCardQualifier;

            public Debit(DebitCardQualifier debitCardQualifier) {
                debitCardQualifier.getClass();
                this.debitCardQualifier = debitCardQualifier;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Debit) && this.debitCardQualifier == ((Debit) obj).debitCardQualifier;
            }

            public final int hashCode() {
                return this.debitCardQualifier.hashCode();
            }

            public final String toString() {
                return "Debit(debitCardQualifier=" + this.debitCardQualifier + ")";
            }
        }
    }

    public final class PreselectionPriorityItem {
        public final InstrumentQualifier instrumentQualifier;
        public final CashInstrumentType instrumentType;

        public PreselectionPriorityItem(CashInstrumentType cashInstrumentType, InstrumentQualifier instrumentQualifier) {
            cashInstrumentType.getClass();
            this.instrumentType = cashInstrumentType;
            this.instrumentQualifier = instrumentQualifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreselectionPriorityItem)) {
                return false;
            }
            PreselectionPriorityItem preselectionPriorityItem = (PreselectionPriorityItem) obj;
            return this.instrumentType == preselectionPriorityItem.instrumentType && Intrinsics.areEqual(this.instrumentQualifier, preselectionPriorityItem.instrumentQualifier);
        }

        public final int hashCode() {
            int hashCode = this.instrumentType.hashCode() * 31;
            InstrumentQualifier instrumentQualifier = this.instrumentQualifier;
            return hashCode + (instrumentQualifier == null ? 0 : instrumentQualifier.hashCode());
        }

        public final String toString() {
            return "PreselectionPriorityItem(instrumentType=" + this.instrumentType + ", instrumentQualifier=" + this.instrumentQualifier + ")";
        }
    }

    public final class QualifiedCapability {
        public final InstrumentQualifier instrumentQualifier;
        public final List supportedFlows;

        public QualifiedCapability(List list, InstrumentQualifier instrumentQualifier) {
            list.getClass();
            this.supportedFlows = list;
            this.instrumentQualifier = instrumentQualifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QualifiedCapability)) {
                return false;
            }
            QualifiedCapability qualifiedCapability = (QualifiedCapability) obj;
            return Intrinsics.areEqual(this.supportedFlows, qualifiedCapability.supportedFlows) && Intrinsics.areEqual(this.instrumentQualifier, qualifiedCapability.instrumentQualifier);
        }

        public final int hashCode() {
            int hashCode = this.supportedFlows.hashCode() * 31;
            InstrumentQualifier instrumentQualifier = this.instrumentQualifier;
            return hashCode + (instrumentQualifier == null ? 0 : instrumentQualifier.hashCode());
        }

        public final String toString() {
            return "QualifiedCapability(supportedFlows=" + this.supportedFlows + ", instrumentQualifier=" + this.instrumentQualifier + ")";
        }
    }

    public final class UnsupportedSpeedAction {
        public final CashInstrumentType instrumentType;
        public final SupportedFlows supportedFlows;
        public final String title;

        public UnsupportedSpeedAction(SupportedFlows supportedFlows, CashInstrumentType cashInstrumentType, String str) {
            cashInstrumentType.getClass();
            this.supportedFlows = supportedFlows;
            this.instrumentType = cashInstrumentType;
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnsupportedSpeedAction)) {
                return false;
            }
            UnsupportedSpeedAction unsupportedSpeedAction = (UnsupportedSpeedAction) obj;
            return this.supportedFlows == unsupportedSpeedAction.supportedFlows && this.instrumentType == unsupportedSpeedAction.instrumentType && this.title.equals(unsupportedSpeedAction.title);
        }

        public final int hashCode() {
            SupportedFlows supportedFlows = this.supportedFlows;
            int hashCode = supportedFlows == null ? 0 : supportedFlows.hashCode();
            return this.title.hashCode() + ((this.instrumentType.hashCode() + (hashCode * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UnsupportedSpeedAction(supportedFlows=");
            sb.append(this.supportedFlows);
            sb.append(", instrumentType=");
            sb.append(this.instrumentType);
            sb.append(", title=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.title, ")");
        }
    }

    public CashOutCapabilityManager$CashOutCapabilities(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.capabilities = arrayList;
        this.preselectionPriority = arrayList2;
        this.unsupportedSpeedActions = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashOutCapabilityManager$CashOutCapabilities)) {
            return false;
        }
        CashOutCapabilityManager$CashOutCapabilities cashOutCapabilityManager$CashOutCapabilities = (CashOutCapabilityManager$CashOutCapabilities) obj;
        return this.capabilities.equals(cashOutCapabilityManager$CashOutCapabilities.capabilities) && this.preselectionPriority.equals(cashOutCapabilityManager$CashOutCapabilities.preselectionPriority) && this.unsupportedSpeedActions.equals(cashOutCapabilityManager$CashOutCapabilities.unsupportedSpeedActions);
    }

    public final int hashCode() {
        return this.unsupportedSpeedActions.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.preselectionPriority, this.capabilities.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashOutCapabilities(capabilities=");
        sb.append(this.capabilities);
        sb.append(", preselectionPriority=");
        sb.append(this.preselectionPriority);
        sb.append(", unsupportedSpeedActions=");
        return Recorder$$ExternalSyntheticOutline1.m(")", sb, this.unsupportedSpeedActions);
    }
}
