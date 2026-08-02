package com.stripe.android.financialconnections.features.notice;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.Country;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NoticeSheetState {
    public final NoticeSheetContent content;
    public final FinancialConnectionsSessionManifest.Pane pane;
    public final NoticeSheetState$ViewEffect$OpenUrl viewEffect;

    public interface NoticeSheetContent extends Parcelable {

        public final class DataAccess implements NoticeSheetContent {
            public static final Parcelable.Creator<DataAccess> CREATOR = new Country.Creator(8);
            public final DataAccessNotice dataAccess;

            public DataAccess(DataAccessNotice dataAccessNotice) {
                dataAccessNotice.getClass();
                this.dataAccess = dataAccessNotice;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DataAccess) && Intrinsics.areEqual(this.dataAccess, ((DataAccess) obj).dataAccess);
            }

            public final int hashCode() {
                return this.dataAccess.hashCode();
            }

            public final String toString() {
                return "DataAccess(dataAccess=" + this.dataAccess + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.dataAccess.writeToParcel(parcel, i);
            }
        }

        public final class Generic implements NoticeSheetContent {
            public static final Parcelable.Creator<Generic> CREATOR = new Country.Creator(9);
            public final FinancialConnectionsGenericInfoScreen generic;

            public Generic(FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen) {
                financialConnectionsGenericInfoScreen.getClass();
                this.generic = financialConnectionsGenericInfoScreen;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Generic) && Intrinsics.areEqual(this.generic, ((Generic) obj).generic);
            }

            public final int hashCode() {
                return this.generic.hashCode();
            }

            public final String toString() {
                return "Generic(generic=" + this.generic + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.generic.writeToParcel(parcel, i);
            }
        }

        public final class Legal implements NoticeSheetContent {
            public static final Parcelable.Creator<Legal> CREATOR = new Country.Creator(10);
            public final LegalDetailsNotice legalDetails;

            public Legal(LegalDetailsNotice legalDetailsNotice) {
                legalDetailsNotice.getClass();
                this.legalDetails = legalDetailsNotice;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Legal) && Intrinsics.areEqual(this.legalDetails, ((Legal) obj).legalDetails);
            }

            public final int hashCode() {
                return this.legalDetails.hashCode();
            }

            public final String toString() {
                return "Legal(legalDetails=" + this.legalDetails + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.legalDetails.writeToParcel(parcel, i);
            }
        }

        public final class UpdateRequired implements NoticeSheetContent {
            public static final Parcelable.Creator<UpdateRequired> CREATOR = new Country.Creator(11);
            public final FinancialConnectionsGenericInfoScreen generic;

            /* renamed from: type, reason: collision with root package name */
            public final Type f1430type;

            public interface Type extends Parcelable {

                public final class Repair implements Type {
                    public static final Parcelable.Creator<Repair> CREATOR = new Country.Creator(12);
                    public final String authorization;
                    public final FinancialConnectionsInstitution institution;

                    public Repair(String str, FinancialConnectionsInstitution financialConnectionsInstitution) {
                        this.authorization = str;
                        this.institution = financialConnectionsInstitution;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Repair)) {
                            return false;
                        }
                        Repair repair = (Repair) obj;
                        return Intrinsics.areEqual(this.authorization, repair.authorization) && Intrinsics.areEqual(this.institution, repair.institution);
                    }

                    public final int hashCode() {
                        String str = this.authorization;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
                        return hashCode + (financialConnectionsInstitution != null ? financialConnectionsInstitution.hashCode() : 0);
                    }

                    public final String toString() {
                        return "Repair(authorization=" + this.authorization + ", institution=" + this.institution + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeString(this.authorization);
                        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
                        if (financialConnectionsInstitution == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            financialConnectionsInstitution.writeToParcel(parcel, i);
                        }
                    }
                }

                public final class Supportability implements Type {
                    public static final Parcelable.Creator<Supportability> CREATOR = new Country.Creator(13);
                    public final FinancialConnectionsInstitution institution;

                    public Supportability(FinancialConnectionsInstitution financialConnectionsInstitution) {
                        this.institution = financialConnectionsInstitution;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Supportability) && Intrinsics.areEqual(this.institution, ((Supportability) obj).institution);
                    }

                    public final int hashCode() {
                        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
                        if (financialConnectionsInstitution == null) {
                            return 0;
                        }
                        return financialConnectionsInstitution.hashCode();
                    }

                    public final String toString() {
                        return "Supportability(institution=" + this.institution + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
                        if (financialConnectionsInstitution == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            financialConnectionsInstitution.writeToParcel(parcel, i);
                        }
                    }
                }
            }

            public UpdateRequired(FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, Type type2) {
                financialConnectionsGenericInfoScreen.getClass();
                type2.getClass();
                this.generic = financialConnectionsGenericInfoScreen;
                this.f1430type = type2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdateRequired)) {
                    return false;
                }
                UpdateRequired updateRequired = (UpdateRequired) obj;
                return Intrinsics.areEqual(this.generic, updateRequired.generic) && Intrinsics.areEqual(this.f1430type, updateRequired.f1430type);
            }

            public final int hashCode() {
                return this.f1430type.hashCode() + (this.generic.hashCode() * 31);
            }

            public final String toString() {
                return "UpdateRequired(generic=" + this.generic + ", type=" + this.f1430type + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.generic.writeToParcel(parcel, i);
                parcel.writeParcelable(this.f1430type, i);
            }
        }
    }

    public NoticeSheetState(FinancialConnectionsSessionManifest.Pane pane, NoticeSheetContent noticeSheetContent, NoticeSheetState$ViewEffect$OpenUrl noticeSheetState$ViewEffect$OpenUrl) {
        this.pane = pane;
        this.content = noticeSheetContent;
        this.viewEffect = noticeSheetState$ViewEffect$OpenUrl;
    }

    public static NoticeSheetState copy$default(NoticeSheetState noticeSheetState, NoticeSheetContent noticeSheetContent, NoticeSheetState$ViewEffect$OpenUrl noticeSheetState$ViewEffect$OpenUrl, int i) {
        FinancialConnectionsSessionManifest.Pane pane = noticeSheetState.pane;
        if ((i & 2) != 0) {
            noticeSheetContent = noticeSheetState.content;
        }
        if ((i & 4) != 0) {
            noticeSheetState$ViewEffect$OpenUrl = noticeSheetState.viewEffect;
        }
        noticeSheetState.getClass();
        return new NoticeSheetState(pane, noticeSheetContent, noticeSheetState$ViewEffect$OpenUrl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeSheetState)) {
            return false;
        }
        NoticeSheetState noticeSheetState = (NoticeSheetState) obj;
        return this.pane == noticeSheetState.pane && Intrinsics.areEqual(this.content, noticeSheetState.content) && Intrinsics.areEqual(this.viewEffect, noticeSheetState.viewEffect);
    }

    public final int hashCode() {
        int hashCode = this.pane.hashCode() * 31;
        NoticeSheetContent noticeSheetContent = this.content;
        int hashCode2 = (hashCode + (noticeSheetContent == null ? 0 : noticeSheetContent.hashCode())) * 31;
        NoticeSheetState$ViewEffect$OpenUrl noticeSheetState$ViewEffect$OpenUrl = this.viewEffect;
        return hashCode2 + (noticeSheetState$ViewEffect$OpenUrl != null ? noticeSheetState$ViewEffect$OpenUrl.hashCode() : 0);
    }

    public final String toString() {
        return "NoticeSheetState(pane=" + this.pane + ", content=" + this.content + ", viewEffect=" + this.viewEffect + ")";
    }
}
