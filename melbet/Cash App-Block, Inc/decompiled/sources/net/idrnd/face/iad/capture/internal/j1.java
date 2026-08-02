package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* loaded from: classes9.dex */
public final class j1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final j1 DEFAULT_INSTANCE;
    private static volatile Parser<j1> PARSER = null;
    public static final int SUPPORTED_RESOLUTIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<n2> supportedResolutions_ = GeneratedMessageLite.emptyProtobufList();

    static {
        j1 j1Var = new j1();
        DEFAULT_INSTANCE = j1Var;
        GeneratedMessageLite.registerDefaultInstance(j1.class, j1Var);
    }

    public static i1 b() {
        return (i1) DEFAULT_INSTANCE.createBuilder();
    }

    public final void a(List list) {
        Internal.ProtobufList<n2> protobufList = this.supportedResolutions_;
        if (!protobufList.isModifiable()) {
            this.supportedResolutions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) list, (List) this.supportedResolutions_);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new j1();
            case 2:
                return new i1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"supportedResolutions_", n2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<j1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (j1.class) {
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
