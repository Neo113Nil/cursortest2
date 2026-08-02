package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.Cta;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes8.dex */
public final class Bullet implements Parcelable {
    public final String content;
    public final Image icon;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Bullet> CREATOR = new Cta.Creator(4);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/Bullet$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/Bullet;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Bullet$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Bullet(int i, Image image, String str, String str2) {
        if ((i & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str2;
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
        if (!(obj instanceof Bullet)) {
            return false;
        }
        Bullet bullet = (Bullet) obj;
        return Intrinsics.areEqual(this.content, bullet.content) && Intrinsics.areEqual(this.icon, bullet.icon) && Intrinsics.areEqual(this.title, bullet.title);
    }

    public final int hashCode() {
        String str = this.content;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.icon;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.title;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bullet(content=");
        sb.append(this.content);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", title=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.title, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.content);
        Image image = this.icon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(image.f809default);
        }
        parcel.writeString(this.title);
    }

    public Bullet(Image image, String str, String str2) {
        this.content = str;
        this.icon = image;
        this.title = str2;
    }
}
