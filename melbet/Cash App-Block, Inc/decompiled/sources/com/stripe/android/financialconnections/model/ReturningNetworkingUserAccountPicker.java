package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.stripe.android.financialconnections.model.ServerLink;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class ReturningNetworkingUserAccountPicker implements Parcelable {
    public final String aboveCta;
    public final List accounts;
    public final AddNewAccount addNewAccount;
    public final String defaultCta;
    public final DataAccessNotice multipleAccountTypesSelectedDataAccessNotice;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ReturningNetworkingUserAccountPicker> CREATOR = new ServerLink.Creator(11);
    public static final Lazy[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(14)), null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ReturningNetworkingUserAccountPicker$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReturningNetworkingUserAccountPicker(int i, String str, String str2, AddNewAccount addNewAccount, List list, String str3, DataAccessNotice dataAccessNotice) {
        if (15 != (i & 15)) {
            TuplesKt.throwMissingFieldException(i, 15, ReturningNetworkingUserAccountPicker$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.defaultCta = str2;
        this.addNewAccount = addNewAccount;
        this.accounts = list;
        if ((i & 16) == 0) {
            this.aboveCta = null;
        } else {
            this.aboveCta = str3;
        }
        if ((i & 32) == 0) {
            this.multipleAccountTypesSelectedDataAccessNotice = null;
        } else {
            this.multipleAccountTypesSelectedDataAccessNotice = dataAccessNotice;
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
        if (!(obj instanceof ReturningNetworkingUserAccountPicker)) {
            return false;
        }
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker = (ReturningNetworkingUserAccountPicker) obj;
        return Intrinsics.areEqual(this.title, returningNetworkingUserAccountPicker.title) && Intrinsics.areEqual(this.defaultCta, returningNetworkingUserAccountPicker.defaultCta) && Intrinsics.areEqual(this.addNewAccount, returningNetworkingUserAccountPicker.addNewAccount) && Intrinsics.areEqual(this.accounts, returningNetworkingUserAccountPicker.accounts) && Intrinsics.areEqual(this.aboveCta, returningNetworkingUserAccountPicker.aboveCta) && Intrinsics.areEqual(this.multipleAccountTypesSelectedDataAccessNotice, returningNetworkingUserAccountPicker.multipleAccountTypesSelectedDataAccessNotice);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m((this.addNewAccount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.defaultCta)) * 31, 31, this.accounts);
        String str = this.aboveCta;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        DataAccessNotice dataAccessNotice = this.multipleAccountTypesSelectedDataAccessNotice;
        return hashCode + (dataAccessNotice != null ? dataAccessNotice.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReturningNetworkingUserAccountPicker(title=", this.title, ", defaultCta=", this.defaultCta, ", addNewAccount=");
        m.append(this.addNewAccount);
        m.append(", accounts=");
        m.append(this.accounts);
        m.append(", aboveCta=");
        m.append(this.aboveCta);
        m.append(", multipleAccountTypesSelectedDataAccessNotice=");
        m.append(this.multipleAccountTypesSelectedDataAccessNotice);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.defaultCta);
        this.addNewAccount.writeToParcel(parcel, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.accounts, parcel);
        while (m.hasNext()) {
            ((NetworkedAccount) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.aboveCta);
        DataAccessNotice dataAccessNotice = this.multipleAccountTypesSelectedDataAccessNotice;
        if (dataAccessNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dataAccessNotice.writeToParcel(parcel, i);
        }
    }

    public ReturningNetworkingUserAccountPicker(String str, String str2, AddNewAccount addNewAccount, ArrayList arrayList, String str3, DataAccessNotice dataAccessNotice) {
        str.getClass();
        str2.getClass();
        addNewAccount.getClass();
        this.title = str;
        this.defaultCta = str2;
        this.addNewAccount = addNewAccount;
        this.accounts = arrayList;
        this.aboveCta = str3;
        this.multipleAccountTypesSelectedDataAccessNotice = dataAccessNotice;
    }
}
