package com.chartboost.sdk.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ci {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final AdSize h;

    public ci(String location, String adType, String str, String adCreativeId, String adCreativeType, String adMarkup, String templateUrl, AdSize adSize) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adCreativeId, "adCreativeId");
        Intrinsics.checkNotNullParameter(adCreativeType, "adCreativeType");
        Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        Intrinsics.checkNotNullParameter(templateUrl, "templateUrl");
        this.a = location;
        this.b = adType;
        this.c = str;
        this.d = adCreativeId;
        this.e = adCreativeType;
        this.f = adMarkup;
        this.g = templateUrl;
        this.h = adSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return Intrinsics.areEqual(this.a, ciVar.a) && Intrinsics.areEqual(this.b, ciVar.b) && Intrinsics.areEqual(this.c, ciVar.c) && Intrinsics.areEqual(this.d, ciVar.d) && Intrinsics.areEqual(this.e, ciVar.e) && Intrinsics.areEqual(this.f, ciVar.f) && Intrinsics.areEqual(this.g, ciVar.g) && Intrinsics.areEqual(this.h, ciVar.h);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        AdSize adSize = this.h;
        return hashCode2 + (adSize != null ? adSize.hashCode() : 0);
    }

    public final String e() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String a() {
        return this.d;
    }

    public final String g() {
        return this.g;
    }

    public final AdSize c() {
        return this.h;
    }

    public /* synthetic */ ci(String str, String str2, String str3, String str4, String str5, String str6, String str7, AdSize adSize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : adSize);
    }

    public final String f() {
        String str = this.c;
        if (str == null) {
            return null;
        }
        String substring = str.substring(0, RangesKt.coerceAtMost(str.length(), 20));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public String toString() {
        return "TrackAd: location: " + this.a + " adType: " + this.b + " adImpressionId: " + f() + " adCreativeId: " + this.d + " adCreativeType: " + this.e + " adMarkup: " + this.f + " templateUrl: " + this.g;
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\b\u0017B\u001f\u0012\n\u0010\u0016\u001a\u00060\rj\u0002`\u0014\u0012\n\u0010\u0018\u001a\u00060\rj\u0002`\u0014¢\u0006\u0004\b\u0019\u0010\u001aB3\b\u0011\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\n\u0010\u0016\u001a\u00060\rj\u0002`\u0014\u0012\n\u0010\u0018\u001a\u00060\rj\u0002`\u0014\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00060\rj\u0002`\u00148\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\b\u0010\u000fR\u001b\u0010\u0018\u001a\u00060\rj\u0002`\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000f¨\u0006 "}, d2 = {"Lcom/chartboost/sdk/impl/ci$a;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/ci$a;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/chartboost/sdk/tracking/Pixels;", "I", "height", "b", "width", "<init>", "(II)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
    @Serializable
    /* renamed from: com.chartboost.sdk.impl.ci$a, reason: from toString */
    public static final /* data */ class AdSize {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: from kotlin metadata and from toString */
        public final int height;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        public final int width;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSize)) {
                return false;
            }
            AdSize adSize = (AdSize) other;
            return this.height == adSize.height && this.width == adSize.width;
        }

        public int hashCode() {
            return (Integer.hashCode(this.height) * 31) + Integer.hashCode(this.width);
        }

        public String toString() {
            return "AdSize(height=" + this.height + ", width=" + this.width + ")";
        }

        /* renamed from: com.chartboost.sdk.impl.ci$a$a, reason: collision with other inner class name */
        public static final class C0218a implements GeneratedSerializer {
            public static final C0218a a;
            public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

            static {
                C0218a c0218a = new C0218a();
                a = c0218a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.tracking.TrackAd.AdSize", c0218a, 2);
                pluginGeneratedSerialDescriptor.addElement("height", false);
                pluginGeneratedSerialDescriptor.addElement("width", false);
                b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AdSize deserialize(Decoder decoder) {
                int i;
                int i2;
                int i3;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
                if (beginStructure.decodeSequentially()) {
                    i = beginStructure.decodeIntElement(descriptor, 0);
                    i2 = beginStructure.decodeIntElement(descriptor, 1);
                    i3 = 3;
                } else {
                    boolean z = true;
                    i = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (z) {
                        int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                        if (decodeElementIndex == -1) {
                            z = false;
                        } else if (decodeElementIndex == 0) {
                            i = beginStructure.decodeIntElement(descriptor, 0);
                            i5 |= 1;
                        } else {
                            if (decodeElementIndex != 1) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            i4 = beginStructure.decodeIntElement(descriptor, 1);
                            i5 |= 2;
                        }
                    }
                    i2 = i4;
                    i3 = i5;
                }
                beginStructure.endStructure(descriptor);
                return new AdSize(i3, i, i2, null);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public SerialDescriptor getDescriptor() {
                return b;
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer[] childSerializers() {
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                return new KSerializer[]{intSerializer, intSerializer};
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public KSerializer[] typeParametersSerializers() {
                return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
            }

            @Override // kotlinx.serialization.SerializationStrategy
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(Encoder encoder, AdSize value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor descriptor = getDescriptor();
                CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
                AdSize.a(value, beginStructure, descriptor);
                beginStructure.endStructure(descriptor);
            }
        }

        /* renamed from: com.chartboost.sdk.impl.ci$a$b, reason: from kotlin metadata */
        public static final class Companion {
            @NotNull
            public final KSerializer serializer() {
                return C0218a.a;
            }

            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public AdSize(int i, int i2) {
            this.height = i;
            this.width = i2;
        }

        /* renamed from: a, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: b, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        public static final /* synthetic */ void a(AdSize self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.height);
            output.encodeIntElement(serialDesc, 1, self.width);
        }

        public /* synthetic */ AdSize(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, C0218a.a.getDescriptor());
            }
            this.height = i2;
            this.width = i3;
        }
    }
}
