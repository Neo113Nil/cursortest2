package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.stripe.android.financialconnections.model.BalanceRefresh;
import com.stripe.android.financialconnections.model.Entry;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.model.LinkBrand;
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
public final class Cta implements Parcelable {
    public final Image icon;
    public final String text;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Cta> CREATOR = new Creator(0);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/Cta$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/Cta;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Cta$$serializer.INSTANCE;
        }
    }

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            FinancialConnectionsAccount.Category category;
            ArrayList arrayList;
            int i;
            LinkedHashMap linkedHashMap3;
            FinancialConnectionsSessionManifest.Product product;
            LinkedHashMap linkedHashMap4;
            LinkedHashMap linkedHashMap5;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new Cta(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString());
                case 1:
                    parcel.getClass();
                    return new BalanceRefresh(parcel.readInt() == 0 ? null : BalanceRefresh.BalanceRefreshStatus.valueOf(parcel.readString()), parcel.readInt());
                case 2:
                    parcel.getClass();
                    return new BankAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 3:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(Body.class, parcel, arrayList2, i2, 1);
                    }
                    return new Body(arrayList2);
                case 4:
                    parcel.getClass();
                    return new Bullet(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                case 5:
                    parcel.getClass();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt2);
                        for (int i3 = 0; i3 != readInt2; i3++) {
                            linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                        }
                    }
                    return new CashBalance(linkedHashMap);
                case 6:
                    parcel.getClass();
                    return new ConnectedAccessNotice(parcel.readString(), DataAccessNoticeBody.CREATOR.createFromParcel(parcel));
                case 7:
                    parcel.getClass();
                    return new ConsentPane(parcel.readString(), parcel.readString(), ConsentPaneBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : DataAccessNotice.CREATOR.createFromParcel(parcel), LegalDetailsNotice.CREATOR.createFromParcel(parcel), parcel.readString());
                case 8:
                    parcel.getClass();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    int i4 = 0;
                    while (i4 != readInt3) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(Bullet.CREATOR, parcel, arrayList3, i4, 1);
                    }
                    return new ConsentPaneBody(arrayList3);
                case 9:
                    parcel.getClass();
                    if (parcel.readInt() == 0) {
                        linkedHashMap2 = null;
                    } else {
                        int readInt4 = parcel.readInt();
                        linkedHashMap2 = new LinkedHashMap(readInt4);
                        for (int i5 = 0; i5 != readInt4; i5++) {
                            linkedHashMap2.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                        }
                    }
                    return new CreditBalance(linkedHashMap2);
                case 10:
                    parcel.getClass();
                    return new DataAccessNotice(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), DataAccessNoticeBody.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConnectedAccessNotice.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                case 11:
                    parcel.getClass();
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt5);
                    int i6 = 0;
                    while (i6 != readInt5) {
                        i6 = CameraState$Type$EnumUnboxingLocalUtility.m(Bullet.CREATOR, parcel, arrayList4, i6, 1);
                    }
                    return new DataAccessNoticeBody(arrayList4);
                case 12:
                    parcel.getClass();
                    return new Display(parcel.readInt() == 0 ? null : TextUpdate.CREATOR.createFromParcel(parcel));
                case 13:
                    parcel.getClass();
                    return new Entry.Image(Image.CREATOR.createFromParcel(parcel));
                case 14:
                    parcel.getClass();
                    return new Entry.Text(parcel.readString());
                case 15:
                    parcel.getClass();
                    FinancialConnectionsAccount.Category valueOf = FinancialConnectionsAccount.Category.valueOf(parcel.readString());
                    int readInt6 = parcel.readInt();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z = parcel.readInt() != 0;
                    FinancialConnectionsAccount.Status valueOf2 = FinancialConnectionsAccount.Status.valueOf(parcel.readString());
                    FinancialConnectionsAccount.Subcategory valueOf3 = FinancialConnectionsAccount.Subcategory.valueOf(parcel.readString());
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt7);
                    for (int i7 = 0; i7 != readInt7; i7++) {
                        arrayList5.add(FinancialConnectionsAccount.SupportedPaymentMethodTypes.valueOf(parcel.readString()));
                    }
                    Balance createFromParcel = parcel.readInt() == 0 ? null : Balance.CREATOR.createFromParcel(parcel);
                    BalanceRefresh createFromParcel2 = parcel.readInt() == 0 ? null : BalanceRefresh.CREATOR.createFromParcel(parcel);
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    OwnershipRefresh createFromParcel3 = parcel.readInt() == 0 ? null : OwnershipRefresh.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        category = valueOf;
                        i = readInt6;
                        arrayList = null;
                    } else {
                        int readInt8 = parcel.readInt();
                        category = valueOf;
                        arrayList = new ArrayList(readInt8);
                        i = readInt6;
                        int i8 = 0;
                        while (i8 != readInt8) {
                            arrayList.add(FinancialConnectionsAccount.Permissions.valueOf(parcel.readString()));
                            i8++;
                            readInt8 = readInt8;
                        }
                    }
                    return new FinancialConnectionsAccount(category, i, readString, readString2, z, valueOf2, valueOf3, arrayList5, createFromParcel, createFromParcel2, readString3, readString4, readString5, createFromParcel3, arrayList);
                case 16:
                    parcel.getClass();
                    int readInt9 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt9);
                    int i9 = 0;
                    while (i9 != readInt9) {
                        i9 = CameraState$Type$EnumUnboxingLocalUtility.m(FinancialConnectionsAccount.CREATOR, parcel, arrayList6, i9, 1);
                    }
                    return new FinancialConnectionsAccountList(arrayList6, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                case 17:
                    parcel.getClass();
                    return new FinancialConnectionsAuthorizationSession(parcel.readString(), FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Display.CREATOR.createFromParcel(parcel));
                case 18:
                    parcel.getClass();
                    return new FinancialConnectionsInstitution(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                case 19:
                    parcel.getClass();
                    return new FinancialConnectionsInstitutionSelected(FinancialConnectionsSessionManifest.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextUpdate.CREATOR.createFromParcel(parcel));
                case 20:
                    parcel.getClass();
                    return new FinancialConnectionsSession(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PaymentAccount) parcel.readParcelable(FinancialConnectionsSession.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ManualEntry.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FinancialConnectionsSession.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : FinancialConnectionsSession.StatusDetails.CREATOR.createFromParcel(parcel));
                case 21:
                    parcel.getClass();
                    return new FinancialConnectionsSession.StatusDetails.Cancelled(FinancialConnectionsSession.StatusDetails.Cancelled.Reason.valueOf(parcel.readString()));
                case 22:
                    parcel.getClass();
                    return new FinancialConnectionsSession.StatusDetails(parcel.readInt() == 0 ? null : FinancialConnectionsSession.StatusDetails.Cancelled.CREATOR.createFromParcel(parcel));
                case 23:
                    parcel.getClass();
                    boolean z2 = parcel.readInt() != 0;
                    boolean z3 = parcel.readInt() != 0;
                    String readString6 = parcel.readString();
                    boolean z4 = parcel.readInt() != 0;
                    boolean z5 = parcel.readInt() != 0;
                    String readString7 = parcel.readString();
                    boolean z6 = parcel.readInt() != 0;
                    boolean z7 = parcel.readInt() != 0;
                    boolean z8 = parcel.readInt() != 0;
                    boolean z9 = parcel.readInt() != 0;
                    boolean z10 = parcel.readInt() != 0;
                    boolean z11 = parcel.readInt() != 0;
                    FinancialConnectionsSessionManifest.Pane valueOf4 = FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString());
                    ManualEntryMode valueOf5 = ManualEntryMode.valueOf(parcel.readString());
                    int readInt10 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(readInt10);
                    for (int i10 = 0; i10 != readInt10; i10++) {
                        arrayList7.add(FinancialConnectionsAccount.Permissions.valueOf(parcel.readString()));
                    }
                    FinancialConnectionsSessionManifest.Product valueOf6 = FinancialConnectionsSessionManifest.Product.valueOf(parcel.readString());
                    boolean z12 = parcel.readInt() != 0;
                    boolean z13 = parcel.readInt() != 0;
                    FinancialConnectionsSessionManifest.AccountDisconnectionMethod valueOf7 = parcel.readInt() == 0 ? null : FinancialConnectionsSessionManifest.AccountDisconnectionMethod.valueOf(parcel.readString());
                    String readString8 = parcel.readString();
                    Boolean valueOf8 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    FinancialConnectionsAuthorizationSession createFromParcel4 = parcel.readInt() == 0 ? null : FinancialConnectionsAuthorizationSession.CREATOR.createFromParcel(parcel);
                    FinancialConnectionsInstitution createFromParcel5 = parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel);
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap3 = null;
                        product = valueOf6;
                    } else {
                        int readInt11 = parcel.readInt();
                        linkedHashMap3 = new LinkedHashMap(readInt11);
                        int i11 = 0;
                        while (true) {
                            product = valueOf6;
                            if (i11 != readInt11) {
                                linkedHashMap3.put(parcel.readString(), parcel.readString());
                                i11++;
                                valueOf6 = product;
                            }
                        }
                    }
                    TextUpdate createFromParcel6 = parcel.readInt() == 0 ? null : TextUpdate.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        linkedHashMap4 = null;
                    } else {
                        int readInt12 = parcel.readInt();
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt12);
                        int i12 = 0;
                        while (i12 != readInt12) {
                            int i13 = readInt12;
                            int i14 = i12;
                            linkedHashMap6.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                            i12 = i14 + 1;
                            readInt12 = i13;
                        }
                        linkedHashMap4 = linkedHashMap6;
                    }
                    String readString16 = parcel.readString();
                    FinancialConnectionsInstitution createFromParcel7 = parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel);
                    Boolean valueOf9 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Boolean valueOf10 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Boolean valueOf11 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Boolean valueOf12 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    FinancialConnectionsSessionManifest.LinkAccountSessionCancellationBehavior valueOf13 = parcel.readInt() == 0 ? null : FinancialConnectionsSessionManifest.LinkAccountSessionCancellationBehavior.valueOf(parcel.readString());
                    if (parcel.readInt() == 0) {
                        linkedHashMap5 = null;
                    } else {
                        int readInt13 = parcel.readInt();
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap(readInt13);
                        int i15 = 0;
                        while (i15 != readInt13) {
                            int i16 = readInt13;
                            int i17 = i15;
                            linkedHashMap7.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                            i15 = i17 + 1;
                            readInt13 = i16;
                        }
                        linkedHashMap5 = linkedHashMap7;
                    }
                    return new FinancialConnectionsSessionManifest(z2, z3, readString6, z4, z5, readString7, z6, z7, z8, z9, z10, z11, valueOf4, valueOf5, arrayList7, product, z12, z13, valueOf7, readString8, valueOf8, readString9, readString10, createFromParcel4, createFromParcel5, readString11, readString12, readString13, readString14, readString15, linkedHashMap3, createFromParcel6, linkedHashMap4, readString16, createFromParcel7, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, linkedHashMap5, parcel.readInt() == 0 ? null : FinancialConnectionsAccount.SupportedPaymentMethodTypes.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : FinancialConnectionsSessionManifest.Theme.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : LinkBrand.valueOf(parcel.readString()));
                case 24:
                    parcel.getClass();
                    return new GetFinancialConnectionsAcccountsParams(parcel.readString(), parcel.readString());
                case 25:
                    parcel.getClass();
                    return new IDConsentContentPane(FinancialConnectionsGenericInfoScreen.CREATOR.createFromParcel(parcel), LegalDetailsNotice.CREATOR.createFromParcel(parcel));
                case 26:
                    parcel.getClass();
                    return new Image(parcel.readString());
                case 27:
                    parcel.getClass();
                    int readInt14 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt14);
                    int i18 = 0;
                    while (i18 != readInt14) {
                        i18 = CameraState$Type$EnumUnboxingLocalUtility.m(ServerLink.CREATOR, parcel, arrayList8, i18, 1);
                    }
                    return new LegalDetailsBody(arrayList8);
                case 28:
                    parcel.getClass();
                    return new LegalDetailsNotice(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), LegalDetailsBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                default:
                    parcel.getClass();
                    return new LinkLoginPane(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Cta[i];
                case 1:
                    return new BalanceRefresh[i];
                case 2:
                    return new BankAccount[i];
                case 3:
                    return new Body[i];
                case 4:
                    return new Bullet[i];
                case 5:
                    return new CashBalance[i];
                case 6:
                    return new ConnectedAccessNotice[i];
                case 7:
                    return new ConsentPane[i];
                case 8:
                    return new ConsentPaneBody[i];
                case 9:
                    return new CreditBalance[i];
                case 10:
                    return new DataAccessNotice[i];
                case 11:
                    return new DataAccessNoticeBody[i];
                case 12:
                    return new Display[i];
                case 13:
                    return new Entry.Image[i];
                case 14:
                    return new Entry.Text[i];
                case 15:
                    return new FinancialConnectionsAccount[i];
                case 16:
                    return new FinancialConnectionsAccountList[i];
                case 17:
                    return new FinancialConnectionsAuthorizationSession[i];
                case 18:
                    return new FinancialConnectionsInstitution[i];
                case 19:
                    return new FinancialConnectionsInstitutionSelected[i];
                case 20:
                    return new FinancialConnectionsSession[i];
                case 21:
                    return new FinancialConnectionsSession.StatusDetails.Cancelled[i];
                case 22:
                    return new FinancialConnectionsSession.StatusDetails[i];
                case 23:
                    return new FinancialConnectionsSessionManifest[i];
                case 24:
                    return new GetFinancialConnectionsAcccountsParams[i];
                case 25:
                    return new IDConsentContentPane[i];
                case 26:
                    return new Image[i];
                case 27:
                    return new LegalDetailsBody[i];
                case 28:
                    return new LegalDetailsNotice[i];
                default:
                    return new LinkLoginPane[i];
            }
        }
    }

    public /* synthetic */ Cta(int i, Image image, String str) {
        if (2 != (i & 2)) {
            TuplesKt.throwMissingFieldException(i, 2, Cta$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        this.text = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cta)) {
            return false;
        }
        Cta cta = (Cta) obj;
        return Intrinsics.areEqual(this.icon, cta.icon) && Intrinsics.areEqual(this.text, cta.text);
    }

    public final int hashCode() {
        Image image = this.icon;
        return this.text.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
    }

    public final String toString() {
        return "Cta(icon=" + this.icon + ", text=" + this.text + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Image image = this.icon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(image.f809default);
        }
        parcel.writeString(this.text);
    }

    public Cta(Image image, String str) {
        str.getClass();
        this.icon = image;
        this.text = str;
    }
}
