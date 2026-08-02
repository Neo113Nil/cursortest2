package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class h2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final h2 DEFAULT_INSTANCE;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
    private static volatile Parser<h2> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VENDOR_FIELD_NUMBER = 2;
    private String type_ = "";
    private String vendor_ = "";
    private String deviceModel_ = "";

    static {
        h2 h2Var = new h2();
        DEFAULT_INSTANCE = h2Var;
        GeneratedMessageLite.registerDefaultInstance(h2.class, h2Var);
    }

    public static g2 a() {
        return (g2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new h2();
            case 2:
                return new g2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "vendor_", "deviceModel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<h2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (h2.class) {
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
