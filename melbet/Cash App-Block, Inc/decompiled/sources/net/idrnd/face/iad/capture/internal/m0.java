package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes9.dex */
public final class m0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final m0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 4;
    private static volatile Parser<m0> PARSER = null;
    public static final int RAW_DATA_FIELD_NUMBER = 2;
    public static final int SCHEME_FIELD_NUMBER = 3;
    private String keyId_;
    private ByteString key_;
    private ByteString rawData_;
    private int scheme_;

    static {
        m0 m0Var = new m0();
        DEFAULT_INSTANCE = m0Var;
        GeneratedMessageLite.registerDefaultInstance(m0.class, m0Var);
    }

    public m0() {
        ByteString byteString = ByteString.EMPTY;
        this.key_ = byteString;
        this.keyId_ = "";
        this.rawData_ = byteString;
    }

    public static l0 a() {
        return (l0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (k0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new m0();
            case 2:
                return new l0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u000b\u0004Ȉ", new Object[]{"key_", "rawData_", "scheme_", "keyId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<m0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (m0.class) {
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
