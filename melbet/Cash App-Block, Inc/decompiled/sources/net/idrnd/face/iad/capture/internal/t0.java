package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* loaded from: classes9.dex */
public final class t0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BOARD_FIELD_NUMBER = 6;
    public static final int BOOTLOADER_FIELD_NUMBER = 7;
    public static final int BRAND_FIELD_NUMBER = 5;
    private static final t0 DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 4;
    public static final int DISPLAY_FIELD_NUMBER = 8;
    public static final int FINGERPRINT_FIELD_NUMBER = 9;
    public static final int HARDWARE_FIELD_NUMBER = 10;
    public static final int HOST_FIELD_NUMBER = 11;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int MANUFACTURER_FIELD_NUMBER = 1;
    public static final int MODEL_FIELD_NUMBER = 2;
    public static final int ODM_SKU_FIELD_NUMBER = 20;
    private static volatile Parser<t0> PARSER = null;
    public static final int PRODUCT_FIELD_NUMBER = 12;
    public static final int SKU_FIELD_NUMBER = 21;
    public static final int SOC_MANUFACTURER_FIELD_NUMBER = 22;
    public static final int SOC_MODEL_FIELD_NUMBER = 23;
    public static final int SUPPORTED_32BIT_ABIS_FIELD_NUMBER = 17;
    public static final int SUPPORTED_64BIT_ABIS_FIELD_NUMBER = 18;
    public static final int SUPPORTED_ABIS_FIELD_NUMBER = 19;
    public static final int TAGS_FIELD_NUMBER = 13;
    public static final int TIME_FIELD_NUMBER = 14;
    public static final int TYPE_FIELD_NUMBER = 15;
    public static final int USER_FIELD_NUMBER = 16;
    private int bitField0_;
    private long time_;
    private String manufacturer_ = "";
    private String model_ = "";
    private String id_ = "";
    private String device_ = "";
    private String brand_ = "";
    private String board_ = "";
    private String bootloader_ = "";
    private String display_ = "";
    private String fingerprint_ = "";
    private String hardware_ = "";
    private String host_ = "";
    private String product_ = "";
    private String tags_ = "";
    private String type_ = "";
    private String user_ = "";
    private Internal.ProtobufList<String> supported32BitAbis_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> supported64BitAbis_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> supportedAbis_ = GeneratedMessageLite.emptyProtobufList();
    private String odmSku_ = "";
    private String sku_ = "";
    private String socManufacturer_ = "";
    private String socModel_ = "";

    static {
        t0 t0Var = new t0();
        DEFAULT_INSTANCE = t0Var;
        GeneratedMessageLite.registerDefaultInstance(t0.class, t0Var);
    }

    public static s0 d() {
        return (s0) DEFAULT_INSTANCE.createBuilder();
    }

    public final void a(List list) {
        Internal.ProtobufList<String> protobufList = this.supported32BitAbis_;
        if (!protobufList.isModifiable()) {
            this.supported32BitAbis_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) list, (List) this.supported32BitAbis_);
    }

    public final void b$1(List list) {
        Internal.ProtobufList<String> protobufList = this.supported64BitAbis_;
        if (!protobufList.isModifiable()) {
            this.supported64BitAbis_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) list, (List) this.supported64BitAbis_);
    }

    public final void c$1(List list) {
        Internal.ProtobufList<String> protobufList = this.supportedAbis_;
        if (!protobufList.isModifiable()) {
            this.supportedAbis_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) list, (List) this.supportedAbis_);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new t0();
            case 2:
                return new s0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0002\u000fȈ\u0010Ȉ\u0011Ț\u0012Ț\u0013Ț\u0014ለ\u0000\u0015ለ\u0001\u0016ለ\u0002\u0017ለ\u0003", new Object[]{"bitField0_", "manufacturer_", "model_", "id_", "device_", "brand_", "board_", "bootloader_", "display_", "fingerprint_", "hardware_", "host_", "product_", "tags_", "time_", "type_", "user_", "supported32BitAbis_", "supported64BitAbis_", "supportedAbis_", "odmSku_", "sku_", "socManufacturer_", "socModel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<t0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (t0.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m();
            case 7:
                return null;
        }
    }
}
