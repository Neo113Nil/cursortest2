package com.stripe.android.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerArgs;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerCompleted;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.strings.IdentifierResolvableString;
import com.stripe.android.core.strings.StaticResolvableString;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.CachedPartnerAccount;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import com.stripe.android.financialconnections.model.AccountHolder;
import com.stripe.android.financialconnections.model.AccountPickerPane;
import com.stripe.android.financialconnections.model.AddNewAccount;
import com.stripe.android.financialconnections.model.Balance;
import com.stripe.android.financialconnections.model.CashBalance;
import com.stripe.android.financialconnections.model.CreditBalance;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.model.PassiveCaptchaParams;
import com.stripe.android.model.Token;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class Country implements Parcelable {
    public final CountryCode code;
    public final String name;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Country> CREATOR = new Creator(0);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/core/model/Country$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/core/model/Country;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Country$$serializer.INSTANCE;
        }
    }

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new Country(CountryCode.CREATOR.createFromParcel(parcel), parcel.readString());
                case 1:
                    parcel.getClass();
                    return new PassiveChallengeWarmerArgs(PassiveCaptchaParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList());
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return PassiveChallengeWarmerCompleted.INSTANCE;
                case 3:
                    parcel.getClass();
                    return new FraudDetectionData(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new CountryCode(parcel.readString());
                case 5:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(IdentifierResolvableString.class, parcel, arrayList, i2, 1);
                    }
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt3);
                    while (i != readInt3) {
                        arrayList2.add(parcel.readValue(IdentifierResolvableString.class.getClassLoader()));
                        i++;
                    }
                    return new IdentifierResolvableString(readInt, arrayList, arrayList2);
                case 6:
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt4);
                    while (i != readInt4) {
                        arrayList3.add(parcel.readValue(StaticResolvableString.class.getClassLoader()));
                        i++;
                    }
                    return new StaticResolvableString(readString, arrayList3);
                case 7:
                    parcel.getClass();
                    return new CachedPartnerAccount(parcel.readString(), parcel.readString());
                case 8:
                    parcel.getClass();
                    return new NoticeSheetState.NoticeSheetContent.DataAccess(DataAccessNotice.CREATOR.createFromParcel(parcel));
                case 9:
                    parcel.getClass();
                    return new NoticeSheetState.NoticeSheetContent.Generic(FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel));
                case 10:
                    parcel.getClass();
                    return new NoticeSheetState.NoticeSheetContent.Legal(LegalDetailsNotice.CREATOR.createFromParcel(parcel));
                case 11:
                    parcel.getClass();
                    return new NoticeSheetState.NoticeSheetContent.UpdateRequired(FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel), (NoticeSheetState.NoticeSheetContent.UpdateRequired.Type) parcel.readParcelable(NoticeSheetState.NoticeSheetContent.UpdateRequired.class.getClassLoader()));
                case 12:
                    parcel.getClass();
                    return new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair(parcel.readString(), (FinancialConnectionsInstitution) (parcel.readInt() != 0 ? FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel) : null));
                case 13:
                    parcel.getClass();
                    return new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability((FinancialConnectionsInstitution) (parcel.readInt() != 0 ? FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel) : null));
                case 14:
                    parcel.getClass();
                    return new PartnerAuthViewModel.Args(parcel.readInt() != 0, FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString()));
                case 15:
                    parcel.getClass();
                    return new FinancialConnectionsSheetActivityArgs.ForData(FinancialConnectionsSheetConfiguration.CREATOR.createFromParcel(parcel), (ElementsSessionContext) (parcel.readInt() != 0 ? ElementsSessionContext.CREATOR.createFromParcel(parcel) : null));
                case 16:
                    parcel.getClass();
                    return new FinancialConnectionsSheetActivityArgs.ForInstantDebits(FinancialConnectionsSheetConfiguration.CREATOR.createFromParcel(parcel), (ElementsSessionContext) (parcel.readInt() != 0 ? ElementsSessionContext.CREATOR.createFromParcel(parcel) : null));
                case 17:
                    parcel.getClass();
                    return new FinancialConnectionsSheetActivityArgs.ForToken(FinancialConnectionsSheetConfiguration.CREATOR.createFromParcel(parcel), (ElementsSessionContext) (parcel.readInt() != 0 ? ElementsSessionContext.CREATOR.createFromParcel(parcel) : null));
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return FinancialConnectionsSheetActivityResult.Canceled.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new FinancialConnectionsSheetActivityResult.Completed(parcel.readInt() == 0 ? null : InstantDebitsResult.CREATOR.createFromParcel(parcel), (FinancialConnectionsSession) (parcel.readInt() != 0 ? FinancialConnectionsSession.CREATOR.createFromParcel(parcel) : null), (Token) parcel.readParcelable(FinancialConnectionsSheetActivityResult.Completed.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    return new FinancialConnectionsSheetActivityResult.Failed((Throwable) parcel.readSerializable());
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return FinancialConnectionsSheetInstantDebitsResult.Canceled.INSTANCE;
                case 22:
                    parcel.getClass();
                    return new FinancialConnectionsSheetInstantDebitsResult.Completed(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 23:
                    parcel.getClass();
                    return new FinancialConnectionsSheetInstantDebitsResult.Failed((Throwable) parcel.readSerializable());
                case 24:
                    parcel.getClass();
                    return new FinancialConnectionsSheetNativeActivityArgs(FinancialConnectionsSheetFlowType.valueOf(parcel.readString()), (FinancialConnectionsSheetConfiguration) parcel.readParcelable(FinancialConnectionsSheetNativeActivityArgs.class.getClassLoader()), SynchronizeSessionResponse.CREATOR.createFromParcel(parcel), (ElementsSessionContext) parcel.readParcelable(FinancialConnectionsSheetNativeActivityArgs.class.getClassLoader()));
                case 25:
                    parcel.getClass();
                    return new InstantDebitsResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 26:
                    parcel.getClass();
                    return new AccountHolder(AccountHolder.Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                case 27:
                    parcel.getClass();
                    return new AccountPickerPane(parcel.readString());
                case 28:
                    parcel.getClass();
                    return new AddNewAccount((Image) (parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null), parcel.readString());
                default:
                    parcel.getClass();
                    int readInt5 = parcel.readInt();
                    int readInt6 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt6);
                    while (i != readInt6) {
                        linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                        i++;
                    }
                    return new Balance(readInt5, linkedHashMap, Balance.Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CashBalance.CREATOR.createFromParcel(parcel), (CreditBalance) (parcel.readInt() != 0 ? CreditBalance.CREATOR.createFromParcel(parcel) : null));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Country[i];
                case 1:
                    return new PassiveChallengeWarmerArgs[i];
                case 2:
                    return new PassiveChallengeWarmerCompleted[i];
                case 3:
                    return new FraudDetectionData[i];
                case 4:
                    return new CountryCode[i];
                case 5:
                    return new IdentifierResolvableString[i];
                case 6:
                    return new StaticResolvableString[i];
                case 7:
                    return new CachedPartnerAccount[i];
                case 8:
                    return new NoticeSheetState.NoticeSheetContent.DataAccess[i];
                case 9:
                    return new NoticeSheetState.NoticeSheetContent.Generic[i];
                case 10:
                    return new NoticeSheetState.NoticeSheetContent.Legal[i];
                case 11:
                    return new NoticeSheetState.NoticeSheetContent.UpdateRequired[i];
                case 12:
                    return new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Repair[i];
                case 13:
                    return new NoticeSheetState.NoticeSheetContent.UpdateRequired.Type.Supportability[i];
                case 14:
                    return new PartnerAuthViewModel.Args[i];
                case 15:
                    return new FinancialConnectionsSheetActivityArgs.ForData[i];
                case 16:
                    return new FinancialConnectionsSheetActivityArgs.ForInstantDebits[i];
                case 17:
                    return new FinancialConnectionsSheetActivityArgs.ForToken[i];
                case 18:
                    return new FinancialConnectionsSheetActivityResult.Canceled[i];
                case 19:
                    return new FinancialConnectionsSheetActivityResult.Completed[i];
                case 20:
                    return new FinancialConnectionsSheetActivityResult.Failed[i];
                case 21:
                    return new FinancialConnectionsSheetInstantDebitsResult.Canceled[i];
                case 22:
                    return new FinancialConnectionsSheetInstantDebitsResult.Completed[i];
                case 23:
                    return new FinancialConnectionsSheetInstantDebitsResult.Failed[i];
                case 24:
                    return new FinancialConnectionsSheetNativeActivityArgs[i];
                case 25:
                    return new InstantDebitsResult[i];
                case 26:
                    return new AccountHolder[i];
                case 27:
                    return new AccountPickerPane[i];
                case 28:
                    return new AddNewAccount[i];
                default:
                    return new Balance[i];
            }
        }
    }

    public /* synthetic */ Country(int i, CountryCode countryCode, String str) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, Country$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.code = countryCode;
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Country)) {
            return false;
        }
        Country country = (Country) obj;
        return Intrinsics.areEqual(this.code, country.code) && Intrinsics.areEqual(this.name, country.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.code.value.hashCode() * 31);
    }

    public final String toString() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.code.writeToParcel(parcel, i);
        parcel.writeString(this.name);
    }

    public Country(CountryCode countryCode, String str) {
        countryCode.getClass();
        str.getClass();
        this.code = countryCode;
        this.name = str;
    }
}
