package net.idrnd.face.iad.capture.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class h1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int APPLICATION_VERSION_FIELD_NUMBER = 15;
    public static final int CONTROL_PHOTO_FIELD_NUMBER = 2;
    public static final int CROPS_FIELD_NUMBER = 11;
    private static final h1 DEFAULT_INSTANCE;
    public static final int EXTRA_IMAGES_FIELD_NUMBER = 18;
    public static final int FRAME_SIMILARITY_CHECK_FIELD_NUMBER = 17;
    public static final int FRONT_CHECK_FIELD_NUMBER = 6;
    public static final int META_INFO_FIELD_NUMBER = 3;
    private static volatile Parser<h1> PARSER = null;
    public static final int PHOTO_FIELD_NUMBER = 1;
    public static final int PHOTO_FORMAT_FIELD_NUMBER = 12;
    public static final int PLATFORM_FIELD_NUMBER = 5;
    public static final int QUALITY_PHOTO_FIELD_NUMBER = 16;
    public static final int SENSORS_FIELD_NUMBER = 14;
    public static final int TIMESTAMP_SEC_FIELD_NUMBER = 10;
    public static final int USED_TAKE_PHOTO_METHOD_FIELD_NUMBER = 7;
    public static final int VIDEO_FIELD_NUMBER = 13;
    private String applicationVersion_;
    private ByteString controlPhoto_;
    private Internal.ProtobufList<v1> crops_;
    private Internal.ProtobufList<ByteString> extraImages_;
    private r1 frameSimilarityCheck_;
    private t1 frontCheck_;
    private a2 metaInfo_;
    private x1 photoFormat_;
    private ByteString photo_;
    private int platform_;
    private int qualityPhoto_;
    private l2 sensors_;
    private long timestampSec_;
    private int usedTakePhotoMethod_;
    private r2 video_;

    static {
        h1 h1Var = new h1();
        DEFAULT_INSTANCE = h1Var;
        GeneratedMessageLite.registerDefaultInstance(h1.class, h1Var);
    }

    public h1() {
        ByteString byteString = ByteString.EMPTY;
        this.photo_ = byteString;
        this.controlPhoto_ = byteString;
        this.crops_ = GeneratedMessageLite.emptyProtobufList();
        this.applicationVersion_ = "";
        this.extraImages_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static e1 c() {
        return (e1) DEFAULT_INSTANCE.createBuilder();
    }

    public final void a$1(ArrayList arrayList) {
        Internal.ProtobufList<v1> protobufList = this.crops_;
        if (!protobufList.isModifiable()) {
            this.crops_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) this.crops_);
    }

    public final void b$1(ArrayList arrayList) {
        Internal.ProtobufList<ByteString> protobufList = this.extraImages_;
        if (!protobufList.isModifiable()) {
            this.extraImages_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) this.extraImages_);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new h1();
            case 2:
                return new e1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u0012\u000f\u0000\u0002\u0000\u0001\n\u0002\n\u0003\t\u0005\f\u0006\t\u0007\f\n\u0002\u000b\u001b\f\t\r\t\u000e\t\u000fȈ\u0010\f\u0011\t\u0012\u001c", new Object[]{"photo_", "controlPhoto_", "metaInfo_", "platform_", "frontCheck_", "usedTakePhotoMethod_", "timestampSec_", "crops_", v1.class, "photoFormat_", "video_", "sensors_", "applicationVersion_", "qualityPhoto_", "frameSimilarityCheck_", "extraImages_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<h1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (h1.class) {
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
