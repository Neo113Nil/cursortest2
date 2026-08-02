package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.stripe.android.financialconnections.model.Cta;
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
public final class ConsentPaneBody implements Parcelable {
    public final List bullets;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ConsentPaneBody> CREATOR = new Cta.Creator(8);
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Body$$ExternalSyntheticLambda0(22))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/ConsentPaneBody$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ConsentPaneBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ConsentPaneBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConsentPaneBody(int i, List list) {
        if (1 == (i & 1)) {
            this.bullets = list;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, ConsentPaneBody$$serializer.INSTANCE.getDescriptor());
            throw null;
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
        return (obj instanceof ConsentPaneBody) && Intrinsics.areEqual(this.bullets, ((ConsentPaneBody) obj).bullets);
    }

    public final int hashCode() {
        return this.bullets.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("ConsentPaneBody(bullets=", ")", this.bullets);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.bullets, parcel);
        while (m.hasNext()) {
            ((Bullet) m.next()).writeToParcel(parcel, i);
        }
    }

    public ConsentPaneBody(ArrayList arrayList) {
        this.bullets = arrayList;
    }
}
