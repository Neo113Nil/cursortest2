package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.OwnershipRefresh;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.model.LinkBrand;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class ServerLink implements Parcelable {
    public final String content;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ServerLink> CREATOR = new Creator(0);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/ServerLink$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ServerLink;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ServerLink$$serializer.INSTANCE;
        }
    }

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new ServerLink(parcel.readString(), parcel.readString());
                case 1:
                    parcel.getClass();
                    return new ManualEntry(ManualEntryMode.valueOf(parcel.readString()));
                case 2:
                    parcel.getClass();
                    return new NetworkedAccount(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DataAccessNotice.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel));
                case 3:
                    int i = 0;
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(Bullet.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new NetworkingLinkSignupBody(arrayList);
                case 4:
                    parcel.getClass();
                    return new NetworkingLinkSignupPane(parcel.readString(), NetworkingLinkSignupBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LegalDetailsNotice.CREATOR.createFromParcel(parcel));
                case 5:
                    parcel.getClass();
                    return new OauthPrepane(Body.CREATOR.createFromParcel(parcel), Cta.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PartnerNotice.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DataAccessNotice.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                case 6:
                    parcel.getClass();
                    return new OwnershipRefresh(parcel.readInt(), OwnershipRefresh.Status.valueOf(parcel.readString()));
                case 7:
                    parcel.getClass();
                    String readString = parcel.readString();
                    FinancialConnectionsAccount.Category valueOf2 = parcel.readInt() == 0 ? null : FinancialConnectionsAccount.Category.valueOf(parcel.readString());
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    FinancialConnectionsAccount.Subcategory valueOf3 = parcel.readInt() == 0 ? null : FinancialConnectionsAccount.Subcategory.valueOf(parcel.readString());
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        arrayList2.add(FinancialConnectionsAccount.SupportedPaymentMethodTypes.valueOf(parcel.readString()));
                    }
                    Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString4 = parcel.readString();
                    FinancialConnectionsInstitution createFromParcel = parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel);
                    String readString5 = parcel.readString();
                    Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString6 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new PartnerAccount(readString, valueOf2, readString2, readString3, valueOf3, arrayList2, valueOf4, readString4, createFromParcel, readString5, valueOf5, readString6, valueOf, parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsAccount.Status.valueOf(parcel.readString()));
                case 8:
                    parcel.getClass();
                    return new PartnerNotice(Image.CREATOR.createFromParcel(parcel), parcel.readString());
                case 9:
                    parcel.getClass();
                    return new PaymentAccountParams.BankAccount(parcel.readString(), parcel.readString());
                case 10:
                    parcel.getClass();
                    return new PaymentAccountParams.LinkedAccount(parcel.readString());
                case 11:
                    int i3 = 0;
                    parcel.getClass();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    AddNewAccount createFromParcel2 = AddNewAccount.CREATOR.createFromParcel(parcel);
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    while (i3 != readInt3) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(NetworkedAccount.CREATOR, parcel, arrayList3, i3, 1);
                    }
                    return new ReturningNetworkingUserAccountPicker(readString7, readString8, createFromParcel2, arrayList3, parcel.readString(), parcel.readInt() == 0 ? null : DataAccessNotice.CREATOR.createFromParcel(parcel));
                case 12:
                    parcel.getClass();
                    return new SuccessPane(parcel.readString(), parcel.readString());
                case 13:
                    parcel.getClass();
                    return new SynchronizeSessionResponse(FinancialConnectionsSessionManifest.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextUpdate.CREATOR.createFromParcel(parcel), VisualUpdate.CREATOR.createFromParcel(parcel));
                case 14:
                    parcel.getClass();
                    return new TextUpdate(parcel.readInt() == 0 ? null : AccountPickerPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConsentPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LinkLoginPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NetworkingLinkSignupPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : OauthPrepane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ReturningNetworkingUserAccountPicker.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuccessPane.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IDConsentContentPane.CREATOR.createFromParcel(parcel));
                case 15:
                    parcel.getClass();
                    return new VisualUpdate(parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
                case 16:
                    parcel.getClass();
                    return new WebAuthFlowState.Canceled(parcel.readString());
                case 17:
                    parcel.getClass();
                    return new WebAuthFlowState.Failed(parcel.readString(), parcel.readString(), parcel.readString());
                case 18:
                    parcel.getClass();
                    parcel.readInt();
                    return WebAuthFlowState.InProgress.INSTANCE;
                case 19:
                    parcel.getClass();
                    return new WebAuthFlowState.Success(parcel.readString());
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return WebAuthFlowState.Uninitialized.INSTANCE;
                case 21:
                    parcel.getClass();
                    return new AccountUpdateRequiredContentRepository.State(NoticeSheetState.NoticeSheetContent.UpdateRequired.CREATOR.createFromParcel(parcel));
                case 22:
                    parcel.getClass();
                    return new AttachedPaymentAccountRepository.State((PaymentAccountParams) parcel.readParcelable(AttachedPaymentAccountRepository.State.class.getClassLoader()));
                case 23:
                    parcel.getClass();
                    return new CachedConsumerSession(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? LinkBrand.valueOf(parcel.readString()) : null);
                case 24:
                    parcel.getClass();
                    return new CoreAuthorizationPendingNetworkingRepairRepository.State(parcel.readString());
                case 25:
                    parcel.getClass();
                    return new FinancialConnectionsErrorRepository.State((Throwable) parcel.readSerializable());
                case 26:
                    parcel.getClass();
                    return new NoticeSheetContentRepository.State((NoticeSheetState.NoticeSheetContent) parcel.readParcelable(NoticeSheetContentRepository.State.class.getClassLoader()));
                case 27:
                    parcel.getClass();
                    return new SuccessContentRepository.State((TextResource) parcel.readParcelable(SuccessContentRepository.State.class.getClassLoader()), (TextResource) parcel.readParcelable(SuccessContentRepository.State.class.getClassLoader()));
                case 28:
                    parcel.getClass();
                    return new TextResource.PluralId(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList());
                default:
                    parcel.getClass();
                    return new TextResource.StringId(parcel.readInt(), parcel.createStringArrayList());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new ServerLink[i];
                case 1:
                    return new ManualEntry[i];
                case 2:
                    return new NetworkedAccount[i];
                case 3:
                    return new NetworkingLinkSignupBody[i];
                case 4:
                    return new NetworkingLinkSignupPane[i];
                case 5:
                    return new OauthPrepane[i];
                case 6:
                    return new OwnershipRefresh[i];
                case 7:
                    return new PartnerAccount[i];
                case 8:
                    return new PartnerNotice[i];
                case 9:
                    return new PaymentAccountParams.BankAccount[i];
                case 10:
                    return new PaymentAccountParams.LinkedAccount[i];
                case 11:
                    return new ReturningNetworkingUserAccountPicker[i];
                case 12:
                    return new SuccessPane[i];
                case 13:
                    return new SynchronizeSessionResponse[i];
                case 14:
                    return new TextUpdate[i];
                case 15:
                    return new VisualUpdate[i];
                case 16:
                    return new WebAuthFlowState.Canceled[i];
                case 17:
                    return new WebAuthFlowState.Failed[i];
                case 18:
                    return new WebAuthFlowState.InProgress[i];
                case 19:
                    return new WebAuthFlowState.Success[i];
                case 20:
                    return new WebAuthFlowState.Uninitialized[i];
                case 21:
                    return new AccountUpdateRequiredContentRepository.State[i];
                case 22:
                    return new AttachedPaymentAccountRepository.State[i];
                case 23:
                    return new CachedConsumerSession[i];
                case 24:
                    return new CoreAuthorizationPendingNetworkingRepairRepository.State[i];
                case 25:
                    return new FinancialConnectionsErrorRepository.State[i];
                case 26:
                    return new NoticeSheetContentRepository.State[i];
                case 27:
                    return new SuccessContentRepository.State[i];
                case 28:
                    return new TextResource.PluralId[i];
                default:
                    return new TextResource.StringId[i];
            }
        }
    }

    public /* synthetic */ ServerLink(int i, String str, String str2) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, ServerLink$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerLink)) {
            return false;
        }
        ServerLink serverLink = (ServerLink) obj;
        return Intrinsics.areEqual(this.title, serverLink.title) && Intrinsics.areEqual(this.content, serverLink.content);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.content;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ServerLink(title=", this.title, ", content=", this.content, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.content);
    }

    public ServerLink(String str, String str2) {
        str.getClass();
        this.title = str;
        this.content = str2;
    }
}
