package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.Cta;
import com.stripe.android.financialconnections.model.serializer.EntrySerializer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable(with = EntrySerializer.class)
/* loaded from: classes8.dex */
public abstract class Entry implements Parcelable {
    public static final Companion Companion = new Companion();

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/stripe/android/financialconnections/model/Entry$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/Entry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "TYPE_TEXT", "Ljava/lang/String;", "TYPE_IMAGE", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return EntrySerializer.INSTANCE;
        }
    }

    @Serializable
    public final class Image extends Entry {
        public final com.stripe.android.financialconnections.model.Image content;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Image> CREATOR = new Cta.Creator(13);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/Entry$Image$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/Entry$Image;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Entry$Image$$serializer.INSTANCE;
            }
        }

        public Image(int i, com.stripe.android.financialconnections.model.Image image) {
            if (1 == (i & 1)) {
                this.content = image;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, Entry$Image$$serializer.INSTANCE.getDescriptor());
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
            return (obj instanceof Image) && Intrinsics.areEqual(this.content, ((Image) obj).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }

        public final String toString() {
            return "Image(content=" + this.content + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.content.writeToParcel(parcel, i);
        }

        public Image(com.stripe.android.financialconnections.model.Image image) {
            image.getClass();
            this.content = image;
        }
    }

    @Serializable
    public final class Text extends Entry {
        public final String content;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Text> CREATOR = new Cta.Creator(14);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/Entry$Text$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/Entry$Text;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return Entry$Text$$serializer.INSTANCE;
            }
        }

        public Text(int i, String str) {
            if (1 == (i & 1)) {
                this.content = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, Entry$Text$$serializer.INSTANCE.getDescriptor());
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
            return (obj instanceof Text) && Intrinsics.areEqual(this.content, ((Text) obj).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(content=", this.content, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.content);
        }

        public Text(String str) {
            str.getClass();
            this.content = str;
        }
    }
}
