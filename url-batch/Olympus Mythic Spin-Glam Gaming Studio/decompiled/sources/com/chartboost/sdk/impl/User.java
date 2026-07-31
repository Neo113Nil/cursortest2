package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.UserExt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\b\u001aB\u001f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b \u0010!B3\b\u0011\u0012\u0006\u0010\"\u001a\u00020\r\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\fR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/chartboost/sdk/impl/jj;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/jj;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConsent", "getConsent$annotations", "()V", "consent", "Lcom/chartboost/sdk/impl/lj;", "b", "Lcom/chartboost/sdk/impl/lj;", "getExt", "()Lcom/chartboost/sdk/impl/lj;", "getExt$annotations", "ext", "<init>", "(Ljava/lang/String;Lcom/chartboost/sdk/impl/lj;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/chartboost/sdk/impl/lj;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
/* renamed from: com.chartboost.sdk.impl.jj, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class User {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final String consent;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final UserExt ext;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.areEqual(this.consent, user.consent) && Intrinsics.areEqual(this.ext, user.ext);
    }

    public int hashCode() {
        String str = this.consent;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserExt userExt = this.ext;
        return hashCode + (userExt != null ? userExt.hashCode() : 0);
    }

    public String toString() {
        return "User(consent=" + this.consent + ", ext=" + this.ext + ")";
    }

    /* renamed from: com.chartboost.sdk.impl.jj$a */
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.User", aVar, 2);
            pluginGeneratedSerialDescriptor.addElement("consent", true);
            pluginGeneratedSerialDescriptor.addElement("ext", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public User deserialize(Decoder decoder) {
            String str;
            UserExt userExt;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            SerializationConstructorMarker serializationConstructorMarker = null;
            if (beginStructure.decodeSequentially()) {
                str = (String) beginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, null);
                userExt = (UserExt) beginStructure.decodeNullableSerializableElement(descriptor, 1, UserExt.a.a, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                str = null;
                UserExt userExt2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str = (String) beginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        userExt2 = (UserExt) beginStructure.decodeNullableSerializableElement(descriptor, 1, UserExt.a.a, userExt2);
                        i2 |= 2;
                    }
                }
                userExt = userExt2;
                i = i2;
            }
            beginStructure.endStructure(descriptor);
            return new User(i, str, userExt, serializationConstructorMarker);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(UserExt.a.a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, User value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            User.a(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.jj$b, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return a.a;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ User(int i, String str, UserExt userExt, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.consent = null;
        } else {
            this.consent = str;
        }
        if ((i & 2) == 0) {
            this.ext = null;
        } else {
            this.ext = userExt;
        }
    }

    public static final /* synthetic */ void a(User self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.consent != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.consent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.ext == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, UserExt.a.a, self.ext);
    }

    public User(String str, UserExt userExt) {
        this.consent = str;
        this.ext = userExt;
    }
}
