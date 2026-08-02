package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.serializer.BodyEntrySerializer;
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
/* loaded from: classes3.dex */
public final class FinancialConnectionsGenericInfoScreen implements Parcelable {
    public final Body body;
    public final Footer footer;
    public final Header header;
    public final String id;
    public final Options options;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FinancialConnectionsGenericInfoScreen> CREATOR = new Creator(0);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public final class Companion {
        public final KSerializer serializer() {
            return FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes4.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int i = 0;
            int i2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new FinancialConnectionsGenericInfoScreen(parcel.readString(), parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Body.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Footer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Options.CREATOR.createFromParcel(parcel) : null);
                case 1:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(Body.class, parcel, arrayList, i, 1);
                    }
                    return new Body(arrayList);
                case 2:
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i2 != readInt2) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(Body.Entry.Bullets.GenericBulletPoint.CREATOR, parcel, arrayList2, i2, 1);
                    }
                    return new Body.Entry.Bullets(readString, arrayList2);
                case 3:
                    parcel.getClass();
                    return new Body.Entry.Bullets.GenericBulletPoint(parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new Body.Entry.Image(Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new Body.Entry.Text(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()), parcel.readInt() != 0 ? Size.valueOf(parcel.readString()) : null);
                case 6:
                    parcel.getClass();
                    return new Body.Entry.Unknown(parcel.readString());
                case 7:
                    parcel.getClass();
                    return new Footer(parcel.readString(), parcel.readInt() == 0 ? null : Footer.GenericInfoAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Footer.GenericInfoAction.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                case 8:
                    parcel.getClass();
                    return new Footer.GenericInfoAction(parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                case 9:
                    parcel.getClass();
                    return new Header(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Alignment.valueOf(parcel.readString()) : null);
                default:
                    parcel.getClass();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Options(valueOf, parcel.readInt() != 0 ? VerticalAlignment.valueOf(parcel.readString()) : null);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new FinancialConnectionsGenericInfoScreen[i];
                case 1:
                    return new Body[i];
                case 2:
                    return new Body.Entry.Bullets[i];
                case 3:
                    return new Body.Entry.Bullets.GenericBulletPoint[i];
                case 4:
                    return new Body.Entry.Image[i];
                case 5:
                    return new Body.Entry.Text[i];
                case 6:
                    return new Body.Entry.Unknown[i];
                case 7:
                    return new Footer[i];
                case 8:
                    return new Footer.GenericInfoAction[i];
                case 9:
                    return new Header[i];
                default:
                    return new Options[i];
            }
        }
    }

    public /* synthetic */ FinancialConnectionsGenericInfoScreen(int i, String str, Header header, Body body, Footer footer, Options options) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.header = null;
        } else {
            this.header = header;
        }
        if ((i & 4) == 0) {
            this.body = null;
        } else {
            this.body = body;
        }
        if ((i & 8) == 0) {
            this.footer = null;
        } else {
            this.footer = footer;
        }
        if ((i & 16) == 0) {
            this.options = null;
        } else {
            this.options = options;
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
        if (!(obj instanceof FinancialConnectionsGenericInfoScreen)) {
            return false;
        }
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen = (FinancialConnectionsGenericInfoScreen) obj;
        return Intrinsics.areEqual(this.id, financialConnectionsGenericInfoScreen.id) && Intrinsics.areEqual(this.header, financialConnectionsGenericInfoScreen.header) && Intrinsics.areEqual(this.body, financialConnectionsGenericInfoScreen.body) && Intrinsics.areEqual(this.footer, financialConnectionsGenericInfoScreen.footer) && Intrinsics.areEqual(this.options, financialConnectionsGenericInfoScreen.options);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        Header header = this.header;
        int hashCode2 = (hashCode + (header == null ? 0 : header.hashCode())) * 31;
        Body body = this.body;
        int hashCode3 = (hashCode2 + (body == null ? 0 : body.entries.hashCode())) * 31;
        Footer footer = this.footer;
        int hashCode4 = (hashCode3 + (footer == null ? 0 : footer.hashCode())) * 31;
        Options options = this.options;
        return hashCode4 + (options != null ? options.hashCode() : 0);
    }

    public final String toString() {
        return "FinancialConnectionsGenericInfoScreen(id=" + this.id + ", header=" + this.header + ", body=" + this.body + ", footer=" + this.footer + ", options=" + this.options + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        Header header = this.header;
        if (header == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            header.writeToParcel(parcel, i);
        }
        Body body = this.body;
        if (body == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            body.writeToParcel(parcel, i);
        }
        Footer footer = this.footer;
        if (footer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            footer.writeToParcel(parcel, i);
        }
        Options options = this.options;
        if (options == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            options.writeToParcel(parcel, i);
        }
    }

    @Serializable
    public final class Body implements Parcelable {
        public final List entries;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Body> CREATOR = new Creator(1);
        public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Size$$ExternalSyntheticLambda0(2))};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Body$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Body(int i, List list) {
            if (1 == (i & 1)) {
                this.entries = list;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE.getDescriptor());
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
            return (obj instanceof Body) && Intrinsics.areEqual(this.entries, ((Body) obj).entries);
        }

        public final int hashCode() {
            return this.entries.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Body(entries=", ")", this.entries);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.entries, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }

        @Serializable(with = BodyEntrySerializer.class)
        public abstract class Entry implements Parcelable {
            public static final Companion Companion = new Companion();

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Body$Entry$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public final class Companion {
                public final KSerializer serializer() {
                    return BodyEntrySerializer.INSTANCE;
                }
            }

            @Serializable
            /* loaded from: classes4.dex */
            public final class Unknown extends Entry {
                public final String id;
                public static final Companion Companion = new Companion();
                public static final Parcelable.Creator<Unknown> CREATOR = new Creator(6);

                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return FinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$$serializer.INSTANCE;
                    }
                }

                public Unknown(int i, String str) {
                    if (1 == (i & 1)) {
                        this.id = str;
                    } else {
                        TuplesKt.throwMissingFieldException(i, 1, FinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$$serializer.INSTANCE.getDescriptor());
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
                    return (obj instanceof Unknown) && Intrinsics.areEqual(this.id, ((Unknown) obj).id);
                }

                public final int hashCode() {
                    return this.id.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unknown(id=", this.id, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.id);
                }

                public Unknown(String str) {
                    str.getClass();
                    this.id = str;
                }
            }

            @Serializable
            /* loaded from: classes4.dex */
            public final class Bullets extends Entry {
                public final List bullets;
                public final String id;
                public static final Companion Companion = new Companion();
                public static final Parcelable.Creator<Bullets> CREATOR = new Creator(2);
                public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Size$$ExternalSyntheticLambda0(3))};

                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$$serializer.INSTANCE;
                    }
                }

                public Bullets(String str, List list, int i) {
                    if (3 != (i & 3)) {
                        TuplesKt.throwMissingFieldException(i, 3, FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.id = str;
                    this.bullets = list;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Bullets)) {
                        return false;
                    }
                    Bullets bullets = (Bullets) obj;
                    return Intrinsics.areEqual(this.id, bullets.id) && Intrinsics.areEqual(this.bullets, bullets.bullets);
                }

                public final int hashCode() {
                    return this.bullets.hashCode() + (this.id.hashCode() * 31);
                }

                public final String toString() {
                    return CameraState$Type$EnumUnboxingLocalUtility.m("Bullets(id=", this.id, ", bullets=", ")", this.bullets);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.id);
                    Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.bullets, parcel);
                    while (m.hasNext()) {
                        ((GenericBulletPoint) m.next()).writeToParcel(parcel, i);
                    }
                }

                public Bullets(String str, ArrayList arrayList) {
                    str.getClass();
                    this.id = str;
                    this.bullets = arrayList;
                }

                @Serializable
                public final class GenericBulletPoint implements Parcelable {
                    public final String content;
                    public final com.stripe.android.financialconnections.model.Image icon;
                    public final String id;
                    public final String title;
                    public static final Companion Companion = new Companion();
                    public static final Parcelable.Creator<GenericBulletPoint> CREATOR = new Creator(3);

                    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                    public final class Companion {
                        public final KSerializer serializer() {
                            return FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer.INSTANCE;
                        }
                    }

                    public /* synthetic */ GenericBulletPoint(int i, String str, com.stripe.android.financialconnections.model.Image image, String str2, String str3) {
                        if (1 != (i & 1)) {
                            TuplesKt.throwMissingFieldException(i, 1, FinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$GenericBulletPoint$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                        this.id = str;
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
                        if ((i & 8) == 0) {
                            this.content = null;
                        } else {
                            this.content = str3;
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
                        if (!(obj instanceof GenericBulletPoint)) {
                            return false;
                        }
                        GenericBulletPoint genericBulletPoint = (GenericBulletPoint) obj;
                        return Intrinsics.areEqual(this.id, genericBulletPoint.id) && Intrinsics.areEqual(this.icon, genericBulletPoint.icon) && Intrinsics.areEqual(this.title, genericBulletPoint.title) && Intrinsics.areEqual(this.content, genericBulletPoint.content);
                    }

                    public final int hashCode() {
                        int hashCode = this.id.hashCode() * 31;
                        com.stripe.android.financialconnections.model.Image image = this.icon;
                        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
                        String str = this.title;
                        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.content;
                        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("GenericBulletPoint(id=");
                        sb.append(this.id);
                        sb.append(", icon=");
                        sb.append(this.icon);
                        sb.append(", title=");
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.title, ", content=", this.content, ")");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeString(this.id);
                        com.stripe.android.financialconnections.model.Image image = this.icon;
                        if (image == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            parcel.writeString(image.f809default);
                        }
                        parcel.writeString(this.title);
                        parcel.writeString(this.content);
                    }

                    public GenericBulletPoint(String str, com.stripe.android.financialconnections.model.Image image, String str2, String str3) {
                        str.getClass();
                        this.id = str;
                        this.icon = image;
                        this.title = str2;
                        this.content = str3;
                    }
                }
            }

            @Serializable
            /* loaded from: classes4.dex */
            public final class Image extends Entry {
                public final String alt;
                public final String id;
                public final com.stripe.android.financialconnections.model.Image image;
                public static final Companion Companion = new Companion();
                public static final Parcelable.Creator<Image> CREATOR = new Creator(4);

                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Body$Entry$Image$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Image;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return FinancialConnectionsGenericInfoScreen$Body$Entry$Image$$serializer.INSTANCE;
                    }
                }

                public Image(int i, com.stripe.android.financialconnections.model.Image image, String str, String str2) {
                    if (7 != (i & 7)) {
                        TuplesKt.throwMissingFieldException(i, 7, FinancialConnectionsGenericInfoScreen$Body$Entry$Image$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.id = str;
                    this.image = image;
                    this.alt = str2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) obj;
                    return Intrinsics.areEqual(this.id, image.id) && Intrinsics.areEqual(this.image, image.image) && Intrinsics.areEqual(this.alt, image.alt);
                }

                public final int hashCode() {
                    return this.alt.hashCode() + ((this.image.hashCode() + (this.id.hashCode() * 31)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Image(id=");
                    sb.append(this.id);
                    sb.append(", image=");
                    sb.append(this.image);
                    sb.append(", alt=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.alt, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.id);
                    com.stripe.android.financialconnections.model.Image image = this.image;
                    image.getClass();
                    parcel.writeString(image.f809default);
                    parcel.writeString(this.alt);
                }

                public Image(com.stripe.android.financialconnections.model.Image image, String str, String str2) {
                    str.getClass();
                    image.getClass();
                    str2.getClass();
                    this.id = str;
                    this.image = image;
                    this.alt = str2;
                }
            }

            @Serializable
            /* loaded from: classes4.dex */
            public final class Text extends Entry {
                public static final Lazy[] $childSerializers;
                public static final Parcelable.Creator<Text> CREATOR;
                public static final Companion Companion = new Companion();
                public final Alignment alignment;
                public final String id;
                public final Size size;
                public final String text;

                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Body$Entry$Text$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return FinancialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer.INSTANCE;
                    }
                }

                static {
                    int i = 5;
                    CREATOR = new Creator(i);
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                    $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Size$$ExternalSyntheticLambda0(4)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Size$$ExternalSyntheticLambda0(i))};
                }

                public Text(int i, String str, String str2, Alignment alignment, Size size) {
                    if (3 != (i & 3)) {
                        TuplesKt.throwMissingFieldException(i, 3, FinancialConnectionsGenericInfoScreen$Body$Entry$Text$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.id = str;
                    this.text = str2;
                    if ((i & 4) == 0) {
                        this.alignment = null;
                    } else {
                        this.alignment = alignment;
                    }
                    if ((i & 8) == 0) {
                        this.size = null;
                    } else {
                        this.size = size;
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
                    if (!(obj instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) obj;
                    return Intrinsics.areEqual(this.id, text.id) && Intrinsics.areEqual(this.text, text.text) && this.alignment == text.alignment && this.size == text.size;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.text);
                    Alignment alignment = this.alignment;
                    int hashCode = (m + (alignment == null ? 0 : alignment.hashCode())) * 31;
                    Size size = this.size;
                    return hashCode + (size != null ? size.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(id=", this.id, ", text=", this.text, ", alignment=");
                    m.append(this.alignment);
                    m.append(", size=");
                    m.append(this.size);
                    m.append(")");
                    return m.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.id);
                    parcel.writeString(this.text);
                    Alignment alignment = this.alignment;
                    if (alignment == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(alignment.name());
                    }
                    Size size = this.size;
                    if (size == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(size.name());
                    }
                }

                public Text(String str, String str2, Alignment alignment, Size size) {
                    str.getClass();
                    str2.getClass();
                    this.id = str;
                    this.text = str2;
                    this.alignment = alignment;
                    this.size = size;
                }
            }
        }

        public Body(ArrayList arrayList) {
            this.entries = arrayList;
        }
    }

    @Serializable
    /* loaded from: classes4.dex */
    public final class Options implements Parcelable {
        public final Boolean fullWidthContent;
        public final VerticalAlignment verticalAlignment;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Options> CREATOR = new Creator(10);
        public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Size$$ExternalSyntheticLambda0(7))};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Options$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Options;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FinancialConnectionsGenericInfoScreen$Options$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Options(int i, Boolean bool, VerticalAlignment verticalAlignment) {
            if ((i & 1) == 0) {
                this.fullWidthContent = null;
            } else {
                this.fullWidthContent = bool;
            }
            if ((i & 2) == 0) {
                this.verticalAlignment = null;
            } else {
                this.verticalAlignment = verticalAlignment;
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
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            return Intrinsics.areEqual(this.fullWidthContent, options.fullWidthContent) && this.verticalAlignment == options.verticalAlignment;
        }

        public final int hashCode() {
            Boolean bool = this.fullWidthContent;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            VerticalAlignment verticalAlignment = this.verticalAlignment;
            return hashCode + (verticalAlignment != null ? verticalAlignment.hashCode() : 0);
        }

        public final String toString() {
            return "Options(fullWidthContent=" + this.fullWidthContent + ", verticalAlignment=" + this.verticalAlignment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Boolean bool = this.fullWidthContent;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
            }
            VerticalAlignment verticalAlignment = this.verticalAlignment;
            if (verticalAlignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(verticalAlignment.name());
            }
        }

        public Options(Boolean bool, VerticalAlignment verticalAlignment) {
            this.fullWidthContent = bool;
            this.verticalAlignment = verticalAlignment;
        }
    }

    @Serializable
    /* loaded from: classes4.dex */
    public final class Footer implements Parcelable {
        public final String belowCta;
        public final String disclaimer;
        public final GenericInfoAction primaryCta;
        public final GenericInfoAction secondaryCta;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Footer> CREATOR = new Creator(7);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Footer$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Footer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FinancialConnectionsGenericInfoScreen$Footer$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Footer(int i, String str, GenericInfoAction genericInfoAction, GenericInfoAction genericInfoAction2, String str2) {
            if ((i & 1) == 0) {
                this.disclaimer = null;
            } else {
                this.disclaimer = str;
            }
            if ((i & 2) == 0) {
                this.primaryCta = null;
            } else {
                this.primaryCta = genericInfoAction;
            }
            if ((i & 4) == 0) {
                this.secondaryCta = null;
            } else {
                this.secondaryCta = genericInfoAction2;
            }
            if ((i & 8) == 0) {
                this.belowCta = null;
            } else {
                this.belowCta = str2;
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
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.areEqual(this.disclaimer, footer.disclaimer) && Intrinsics.areEqual(this.primaryCta, footer.primaryCta) && Intrinsics.areEqual(this.secondaryCta, footer.secondaryCta) && Intrinsics.areEqual(this.belowCta, footer.belowCta);
        }

        public final int hashCode() {
            String str = this.disclaimer;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            GenericInfoAction genericInfoAction = this.primaryCta;
            int hashCode2 = (hashCode + (genericInfoAction == null ? 0 : genericInfoAction.hashCode())) * 31;
            GenericInfoAction genericInfoAction2 = this.secondaryCta;
            int hashCode3 = (hashCode2 + (genericInfoAction2 == null ? 0 : genericInfoAction2.hashCode())) * 31;
            String str2 = this.belowCta;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return "Footer(disclaimer=" + this.disclaimer + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", belowCta=" + this.belowCta + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.disclaimer);
            GenericInfoAction genericInfoAction = this.primaryCta;
            if (genericInfoAction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                genericInfoAction.writeToParcel(parcel, i);
            }
            GenericInfoAction genericInfoAction2 = this.secondaryCta;
            if (genericInfoAction2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                genericInfoAction2.writeToParcel(parcel, i);
            }
            parcel.writeString(this.belowCta);
        }

        @Serializable
        public final class GenericInfoAction implements Parcelable {
            public final Image icon;
            public final String id;
            public final String label;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<GenericInfoAction> CREATOR = new Creator(8);

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ GenericInfoAction(int i, Image image, String str, String str2) {
                if (3 != (i & 3)) {
                    TuplesKt.throwMissingFieldException(i, 3, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.id = str;
                this.label = str2;
                if ((i & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = image;
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
                if (!(obj instanceof GenericInfoAction)) {
                    return false;
                }
                GenericInfoAction genericInfoAction = (GenericInfoAction) obj;
                return Intrinsics.areEqual(this.id, genericInfoAction.id) && Intrinsics.areEqual(this.label, genericInfoAction.label) && Intrinsics.areEqual(this.icon, genericInfoAction.icon);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.label);
                Image image = this.icon;
                return m + (image == null ? 0 : image.hashCode());
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GenericInfoAction(id=", this.id, ", label=", this.label, ", icon=");
                m.append(this.icon);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.id);
                parcel.writeString(this.label);
                Image image = this.icon;
                if (image == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(image.f809default);
                }
            }

            public GenericInfoAction(Image image, String str, String str2) {
                str.getClass();
                str2.getClass();
                this.id = str;
                this.label = str2;
                this.icon = image;
            }
        }

        public Footer(String str, GenericInfoAction genericInfoAction, GenericInfoAction genericInfoAction2, String str2) {
            this.disclaimer = str;
            this.primaryCta = genericInfoAction;
            this.secondaryCta = genericInfoAction2;
            this.belowCta = str2;
        }
    }

    @Serializable
    /* loaded from: classes4.dex */
    public final class Header implements Parcelable {
        public final Alignment alignment;
        public final Image icon;
        public final String subtitle;
        public final String title;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Header> CREATOR = new Creator(9);
        public static final Lazy[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Size$$ExternalSyntheticLambda0(6))};

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"FinancialConnectionsGenericInfoScreen$Header$Companion", "", "Lkotlinx/serialization/KSerializer;", "LFinancialConnectionsGenericInfoScreen$Header;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FinancialConnectionsGenericInfoScreen$Header$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Header(int i, String str, String str2, Image image, Alignment alignment) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.icon = null;
            } else {
                this.icon = image;
            }
            if ((i & 8) == 0) {
                this.alignment = null;
            } else {
                this.alignment = alignment;
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
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.areEqual(this.title, header.title) && Intrinsics.areEqual(this.subtitle, header.subtitle) && Intrinsics.areEqual(this.icon, header.icon) && this.alignment == header.alignment;
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.icon;
            int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            Alignment alignment = this.alignment;
            return hashCode3 + (alignment != null ? alignment.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header(title=", this.title, ", subtitle=", this.subtitle, ", icon=");
            m.append(this.icon);
            m.append(", alignment=");
            m.append(this.alignment);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            Image image = this.icon;
            if (image == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(image.f809default);
            }
            Alignment alignment = this.alignment;
            if (alignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(alignment.name());
            }
        }

        public Header(String str, String str2, Image image, Alignment alignment) {
            this.title = str;
            this.subtitle = str2;
            this.icon = image;
            this.alignment = alignment;
        }
    }

    public FinancialConnectionsGenericInfoScreen(String str, Header header, Body body, Footer footer, Options options) {
        str.getClass();
        this.id = str;
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.options = options;
    }
}
