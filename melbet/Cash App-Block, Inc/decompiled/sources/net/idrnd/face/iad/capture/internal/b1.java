package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import io.noties.markwon.LinkResolverDef;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes9.dex */
public final class b1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final b1 DEFAULT_INSTANCE;
    public static final int EMULATOR_SIGNS_FIELD_NUMBER = 3;
    private static volatile Parser<b1> PARSER = null;
    public static final int ROOT_SIGNS_FIELD_NUMBER = 1;
    public static final int SANDBOX_SIGNS_FIELD_NUMBER = 2;
    private int emulatorSignsMemoizedSerializedSize;
    private int rootSignsMemoizedSerializedSize;
    private int sandboxSignsMemoizedSerializedSize;
    private static final Internal.ListAdapter.Converter<Integer, v0> rootSigns_converter_ = new LinkResolverDef(22);
    private static final Internal.ListAdapter.Converter<Integer, w0> sandboxSigns_converter_ = new y0();
    private static final Internal.ListAdapter.Converter<Integer, u0> emulatorSigns_converter_ = new KClasses$$Lambda$1(22);
    private Internal.IntList rootSigns_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList sandboxSigns_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList emulatorSigns_ = GeneratedMessageLite.emptyIntList();

    static {
        b1 b1Var = new b1();
        DEFAULT_INSTANCE = b1Var;
        GeneratedMessageLite.registerDefaultInstance(b1.class, b1Var);
    }

    public static a1 d() {
        return (a1) DEFAULT_INSTANCE.createBuilder();
    }

    public final void a() {
        Internal.IntList intList = this.emulatorSigns_;
        if (intList.isModifiable()) {
            return;
        }
        this.emulatorSigns_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public final void b() {
        Internal.IntList intList = this.rootSigns_;
        if (intList.isModifiable()) {
            return;
        }
        this.rootSigns_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public final void c() {
        Internal.IntList intList = this.sandboxSigns_;
        if (intList.isModifiable()) {
            return;
        }
        this.sandboxSigns_ = GeneratedMessageLite.mutableCopy(intList);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new b1();
            case 2:
                return new a1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001,\u0002,\u0003,", new Object[]{"rootSigns_", "sandboxSigns_", "emulatorSigns_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<b1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (b1.class) {
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
