package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Card;
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
public final class ConsentUi implements StripeModel {
    public final ConsentPane consentPane;
    public final ConsentSection consentSection;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ConsentUi> CREATOR = new Card.Creator(17);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsentUi$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsentUi;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ConsentUi$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConsentUi(int i, ConsentPane consentPane, ConsentSection consentSection) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, ConsentUi$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.consentPane = consentPane;
        this.consentSection = consentSection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentUi)) {
            return false;
        }
        ConsentUi consentUi = (ConsentUi) obj;
        return Intrinsics.areEqual(this.consentPane, consentUi.consentPane) && Intrinsics.areEqual(this.consentSection, consentUi.consentSection);
    }

    public final int hashCode() {
        ConsentPane consentPane = this.consentPane;
        int hashCode = (consentPane == null ? 0 : consentPane.hashCode()) * 31;
        ConsentSection consentSection = this.consentSection;
        return hashCode + (consentSection != null ? consentSection.disclaimer.hashCode() : 0);
    }

    public final String toString() {
        return "ConsentUi(consentPane=" + this.consentPane + ", consentSection=" + this.consentSection + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ConsentPane consentPane = this.consentPane;
        if (consentPane == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            consentPane.writeToParcel(parcel, i);
        }
        ConsentSection consentSection = this.consentSection;
        if (consentSection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(consentSection.disclaimer);
        }
    }

    @Serializable
    public final class ConsentSection implements StripeModel {
        public final String disclaimer;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<ConsentSection> CREATOR = new Card.Creator(16);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsentUi$ConsentSection$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsentUi$ConsentSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ConsentUi$ConsentSection$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ConsentSection(int i, String str) {
            if (1 == (i & 1)) {
                this.disclaimer = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, ConsentUi$ConsentSection$$serializer.INSTANCE.getDescriptor());
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
            return (obj instanceof ConsentSection) && Intrinsics.areEqual(this.disclaimer, ((ConsentSection) obj).disclaimer);
        }

        public final int hashCode() {
            return this.disclaimer.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConsentSection(disclaimer=", this.disclaimer, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.disclaimer);
        }

        public ConsentSection(String str) {
            str.getClass();
            this.disclaimer = str;
        }
    }

    @Serializable
    public final class Icon implements StripeModel {

        /* renamed from: default, reason: not valid java name */
        public final String f826default;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Icon> CREATOR = new Card.Creator(18);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsentUi$Icon$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsentUi$Icon;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ConsentUi$Icon$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Icon(int i, String str) {
            if (1 == (i & 1)) {
                this.f826default = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, ConsentUi$Icon$$serializer.INSTANCE.getDescriptor());
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
            return (obj instanceof Icon) && Intrinsics.areEqual(this.f826default, ((Icon) obj).f826default);
        }

        public final int hashCode() {
            return this.f826default.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Icon(default=", this.f826default, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f826default);
        }

        public Icon(String str) {
            str.getClass();
            this.f826default = str;
        }
    }

    @Serializable
    public final class ConsentPane implements StripeModel {
        public final String allowButtonLabel;
        public final String denyButtonLabel;
        public final String disclaimer;
        public final ScopesSection scopesSection;
        public final String title;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<ConsentPane> CREATOR = new Card.Creator(13);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsentUi$ConsentPane$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsentUi$ConsentPane;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ConsentUi$ConsentPane$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ConsentPane(int i, String str, ScopesSection scopesSection, String str2, String str3, String str4) {
            if (31 != (i & 31)) {
                TuplesKt.throwMissingFieldException(i, 31, ConsentUi$ConsentPane$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.title = str;
            this.scopesSection = scopesSection;
            this.disclaimer = str2;
            this.denyButtonLabel = str3;
            this.allowButtonLabel = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConsentPane)) {
                return false;
            }
            ConsentPane consentPane = (ConsentPane) obj;
            return Intrinsics.areEqual(this.title, consentPane.title) && Intrinsics.areEqual(this.scopesSection, consentPane.scopesSection) && Intrinsics.areEqual(this.disclaimer, consentPane.disclaimer) && Intrinsics.areEqual(this.denyButtonLabel, consentPane.denyButtonLabel) && Intrinsics.areEqual(this.allowButtonLabel, consentPane.allowButtonLabel);
        }

        public final int hashCode() {
            int hashCode = (this.scopesSection.hashCode() + (this.title.hashCode() * 31)) * 31;
            String str = this.disclaimer;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.denyButtonLabel;
            return this.allowButtonLabel.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConsentPane(title=");
            sb.append(this.title);
            sb.append(", scopesSection=");
            sb.append(this.scopesSection);
            sb.append(", disclaimer=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.disclaimer, ", denyButtonLabel=", this.denyButtonLabel, ", allowButtonLabel=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.allowButtonLabel, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            this.scopesSection.writeToParcel(parcel, i);
            parcel.writeString(this.disclaimer);
            parcel.writeString(this.denyButtonLabel);
            parcel.writeString(this.allowButtonLabel);
        }

        @Serializable
        public final class ScopesSection implements StripeModel {
            public final String header;
            public final List scopes;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<ScopesSection> CREATOR = new Card.Creator(14);
            public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(26))};

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return ConsentUi$ConsentPane$ScopesSection$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ ScopesSection(String str, List list, int i) {
                if (3 != (i & 3)) {
                    TuplesKt.throwMissingFieldException(i, 3, ConsentUi$ConsentPane$ScopesSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.header = str;
                this.scopes = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ScopesSection)) {
                    return false;
                }
                ScopesSection scopesSection = (ScopesSection) obj;
                return Intrinsics.areEqual(this.header, scopesSection.header) && Intrinsics.areEqual(this.scopes, scopesSection.scopes);
            }

            public final int hashCode() {
                return this.scopes.hashCode() + (this.header.hashCode() * 31);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("ScopesSection(header=", this.header, ", scopes=", ")", this.scopes);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.header);
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.scopes, parcel);
                while (m.hasNext()) {
                    ((Scope) m.next()).writeToParcel(parcel, i);
                }
            }

            public ScopesSection(String str, ArrayList arrayList) {
                str.getClass();
                this.header = str;
                this.scopes = arrayList;
            }

            @Serializable
            public final class Scope implements StripeModel {
                public final String description;
                public final String header;
                public final Icon icon;
                public static final Companion Companion = new Companion();
                public static final Parcelable.Creator<Scope> CREATOR = new Card.Creator(15);

                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return ConsentUi$ConsentPane$ScopesSection$Scope$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Scope(int i, Icon icon, String str, String str2) {
                    if (7 != (i & 7)) {
                        TuplesKt.throwMissingFieldException(i, 7, ConsentUi$ConsentPane$ScopesSection$Scope$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.icon = icon;
                    this.header = str;
                    this.description = str2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Scope)) {
                        return false;
                    }
                    Scope scope = (Scope) obj;
                    return Intrinsics.areEqual(this.icon, scope.icon) && Intrinsics.areEqual(this.header, scope.header) && Intrinsics.areEqual(this.description, scope.description);
                }

                public final int hashCode() {
                    int hashCode = this.icon.f826default.hashCode() * 31;
                    String str = this.header;
                    return this.description.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Scope(icon=");
                    sb.append(this.icon);
                    sb.append(", header=");
                    sb.append(this.header);
                    sb.append(", description=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.description, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    this.icon.writeToParcel(parcel, i);
                    parcel.writeString(this.header);
                    parcel.writeString(this.description);
                }

                public Scope(Icon icon, String str, String str2) {
                    icon.getClass();
                    str2.getClass();
                    this.icon = icon;
                    this.header = str;
                    this.description = str2;
                }
            }
        }

        public ConsentPane(String str, ScopesSection scopesSection, String str2, String str3, String str4) {
            str.getClass();
            scopesSection.getClass();
            str4.getClass();
            this.title = str;
            this.scopesSection = scopesSection;
            this.disclaimer = str2;
            this.denyButtonLabel = str3;
            this.allowButtonLabel = str4;
        }
    }

    public ConsentUi(ConsentPane consentPane, ConsentSection consentSection) {
        this.consentPane = consentPane;
        this.consentSection = consentSection;
    }
}
