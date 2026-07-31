package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.App;
import com.chartboost.sdk.impl.Device;
import com.chartboost.sdk.impl.Imp;
import com.chartboost.sdk.impl.Regs;
import com.chartboost.sdk.impl.User;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002\b\u001dBQ\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u00105\u001a\u00020\r\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u000106¢\u0006\u0004\b=\u0010>Bg\b\u0011\u0012\u0006\u0010?\u001a\u00020\r\u0012\u0010\b\u0001\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010#\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010*\u0012\b\b\u0001\u00105\u001a\u00020\r\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u000106\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\b=\u0010BJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u001a\u001a\u0004\b&\u0010'R\"\u00100\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u001a\u001a\u0004\b-\u0010.R \u00105\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u0010\u001a\u001a\u0004\b3\u0010\u000fR\"\u0010<\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010\u001a\u001a\u0004\b9\u0010:¨\u0006D"}, d2 = {"Lcom/chartboost/sdk/impl/n2;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/n2;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lcom/chartboost/sdk/impl/w9;", "Ljava/util/List;", "getImp", "()Ljava/util/List;", "getImp$annotations", "()V", POBConstants.KEY_IMPRESSION, "Lcom/chartboost/sdk/impl/o1;", "b", "Lcom/chartboost/sdk/impl/o1;", "getApp", "()Lcom/chartboost/sdk/impl/o1;", "getApp$annotations", "app", "Lcom/chartboost/sdk/impl/k6;", "c", "Lcom/chartboost/sdk/impl/k6;", "getDevice", "()Lcom/chartboost/sdk/impl/k6;", "getDevice$annotations", "device", "Lcom/chartboost/sdk/impl/jj;", "d", "Lcom/chartboost/sdk/impl/jj;", "getUser", "()Lcom/chartboost/sdk/impl/jj;", "getUser$annotations", POBConstants.KEY_USER, EidRequestBuilder.REQUEST_FIELD_EMAIL, "I", "getTest", "getTest$annotations", POBConstants.TEST_MODE, "Lcom/chartboost/sdk/impl/qf;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/chartboost/sdk/impl/qf;", "getRegs", "()Lcom/chartboost/sdk/impl/qf;", "getRegs$annotations", POBConstants.KEY_REGS, "<init>", "(Ljava/util/List;Lcom/chartboost/sdk/impl/o1;Lcom/chartboost/sdk/impl/k6;Lcom/chartboost/sdk/impl/jj;ILcom/chartboost/sdk/impl/qf;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/chartboost/sdk/impl/o1;Lcom/chartboost/sdk/impl/k6;Lcom/chartboost/sdk/impl/jj;ILcom/chartboost/sdk/impl/qf;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
@Serializable
/* renamed from: com.chartboost.sdk.impl.n2, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class BidRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final KSerializer[] g = {new ArrayListSerializer(Imp.a.a), null, null, null, null, null};

    /* renamed from: a, reason: from kotlin metadata and from toString */
    public final List imp;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    public final App app;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    public final Device device;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    public final User user;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    public final int test;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    public final Regs regs;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidRequest)) {
            return false;
        }
        BidRequest bidRequest = (BidRequest) other;
        return Intrinsics.areEqual(this.imp, bidRequest.imp) && Intrinsics.areEqual(this.app, bidRequest.app) && Intrinsics.areEqual(this.device, bidRequest.device) && Intrinsics.areEqual(this.user, bidRequest.user) && this.test == bidRequest.test && Intrinsics.areEqual(this.regs, bidRequest.regs);
    }

    public int hashCode() {
        int hashCode = this.imp.hashCode() * 31;
        App app = this.app;
        int hashCode2 = (hashCode + (app == null ? 0 : app.hashCode())) * 31;
        Device device = this.device;
        int hashCode3 = (hashCode2 + (device == null ? 0 : device.hashCode())) * 31;
        User user = this.user;
        int hashCode4 = (((hashCode3 + (user == null ? 0 : user.hashCode())) * 31) + Integer.hashCode(this.test)) * 31;
        Regs regs = this.regs;
        return hashCode4 + (regs != null ? regs.hashCode() : 0);
    }

    public String toString() {
        return "BidRequest(imp=" + this.imp + ", app=" + this.app + ", device=" + this.device + ", user=" + this.user + ", test=" + this.test + ", regs=" + this.regs + ")";
    }

    /* renamed from: com.chartboost.sdk.impl.n2$a */
    public static final class a implements GeneratedSerializer {
        public static final a a;
        public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.BidRequest", aVar, 6);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_IMPRESSION, true);
            pluginGeneratedSerialDescriptor.addElement("app", true);
            pluginGeneratedSerialDescriptor.addElement("device", true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_USER, true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.TEST_MODE, true);
            pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_REGS, true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BidRequest deserialize(Decoder decoder) {
            int i;
            int i2;
            List list;
            App app;
            Device device;
            User user;
            Regs regs;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            KSerializer[] kSerializerArr = BidRequest.g;
            int i3 = 5;
            if (beginStructure.decodeSequentially()) {
                List list2 = (List) beginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], null);
                App app2 = (App) beginStructure.decodeNullableSerializableElement(descriptor, 1, App.a.a, null);
                Device device2 = (Device) beginStructure.decodeNullableSerializableElement(descriptor, 2, Device.a.a, null);
                User user2 = (User) beginStructure.decodeNullableSerializableElement(descriptor, 3, User.a.a, null);
                int decodeIntElement = beginStructure.decodeIntElement(descriptor, 4);
                list = list2;
                app = app2;
                regs = (Regs) beginStructure.decodeNullableSerializableElement(descriptor, 5, Regs.a.a, null);
                user = user2;
                i = decodeIntElement;
                device = device2;
                i2 = 63;
            } else {
                boolean z = true;
                int i4 = 0;
                List list3 = null;
                App app3 = null;
                Device device3 = null;
                User user3 = null;
                Regs regs2 = null;
                int i5 = 0;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            continue;
                        case 0:
                            list3 = (List) beginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], list3);
                            i5 |= 1;
                            i3 = 5;
                            continue;
                        case 1:
                            app3 = (App) beginStructure.decodeNullableSerializableElement(descriptor, 1, App.a.a, app3);
                            i5 |= 2;
                            break;
                        case 2:
                            device3 = (Device) beginStructure.decodeNullableSerializableElement(descriptor, 2, Device.a.a, device3);
                            i5 |= 4;
                            break;
                        case 3:
                            user3 = (User) beginStructure.decodeNullableSerializableElement(descriptor, 3, User.a.a, user3);
                            i5 |= 8;
                            break;
                        case 4:
                            i4 = beginStructure.decodeIntElement(descriptor, 4);
                            i5 |= 16;
                            break;
                        case 5:
                            regs2 = (Regs) beginStructure.decodeNullableSerializableElement(descriptor, i3, Regs.a.a, regs2);
                            i5 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                i = i4;
                i2 = i5;
                list = list3;
                app = app3;
                device = device3;
                user = user3;
                regs = regs2;
            }
            beginStructure.endStructure(descriptor);
            return new BidRequest(i2, list, app, device, user, i, regs, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            return new KSerializer[]{BidRequest.g[0], BuiltinSerializersKt.getNullable(App.a.a), BuiltinSerializersKt.getNullable(Device.a.a), BuiltinSerializersKt.getNullable(User.a.a), IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(Regs.a.a)};
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
        public void serialize(Encoder encoder, BidRequest value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            BidRequest.a(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.n2$b, reason: from kotlin metadata */
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

    public /* synthetic */ BidRequest(int i, List list, App app, Device device, User user, int i2, Regs regs, SerializationConstructorMarker serializationConstructorMarker) {
        this.imp = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            this.app = null;
        } else {
            this.app = app;
        }
        if ((i & 4) == 0) {
            this.device = null;
        } else {
            this.device = device;
        }
        if ((i & 8) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i & 16) == 0) {
            this.test = 0;
        } else {
            this.test = i2;
        }
        if ((i & 32) == 0) {
            this.regs = null;
        } else {
            this.regs = regs;
        }
    }

    public static final /* synthetic */ void a(BidRequest self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = g;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.imp, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.imp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.app != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, App.a.a, self.app);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.device != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, Device.a.a, self.device);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.user != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, User.a.a, self.user);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.test != 0) {
            output.encodeIntElement(serialDesc, 4, self.test);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.regs == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, Regs.a.a, self.regs);
    }

    public BidRequest(List imp, App app, Device device, User user, int i, Regs regs) {
        Intrinsics.checkNotNullParameter(imp, "imp");
        this.imp = imp;
        this.app = app;
        this.device = device;
        this.user = user;
        this.test = i;
        this.regs = regs;
    }
}
