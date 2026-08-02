package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class ProtoBuf {

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface CompilerPluginDataOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0),
        FAKE_OVERRIDE(1),
        DELEGATION(2),
        SYNTHESIZED(3);

        public final int value;

        MemberKind(int i) {
            this.value = i;
        }

        public static MemberKind valueOf(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i == 1) {
                return FAKE_OVERRIDE;
            }
            if (i == 2) {
                return DELEGATION;
            }
            if (i != 3) {
                return null;
            }
            return SYNTHESIZED;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0),
        OPEN(1),
        ABSTRACT(2),
        SEALED(3);

        public final int value;

        Modality(int i) {
            this.value = i;
        }

        public static Modality valueOf(int i) {
            if (i == 0) {
                return FINAL;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return ABSTRACT;
            }
            if (i != 3) {
                return null;
            }
            return SEALED;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum ReturnValueStatus implements Internal.EnumLite {
        UNSPECIFIED(0),
        MUST_USE(1),
        EXPLICITLY_IGNORABLE(2);

        public final int value;

        ReturnValueStatus(int i) {
            this.value = i;
        }

        public static ReturnValueStatus valueOf(int i) {
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return MUST_USE;
            }
            if (i != 2) {
                return null;
            }
            return EXPLICITLY_IGNORABLE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0),
        PRIVATE(1),
        PROTECTED(2),
        PUBLIC(3),
        PRIVATE_TO_THIS(4),
        LOCAL(5);

        public final int value;

        Visibility(int i) {
            this.value = i;
        }

        public static Visibility valueOf(int i) {
            if (i == 0) {
                return INTERNAL;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return PROTECTED;
            }
            if (i == 3) {
                return PUBLIC;
            }
            if (i == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i != 5) {
                return null;
            }
            return LOCAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new AnonymousClass1();
        public static final Annotation defaultInstance;
        public List argument_;
        public int bitField0_;
        public int id_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            Annotation annotation = new Annotation();
            defaultInstance = annotation;
            annotation.id_ = 0;
            annotation.argument_ = Collections.EMPTY_LIST;
        }

        public Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.id_ = 0;
            this.argument_ = Collections.EMPTY_LIST;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            char c = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.bitField0_ |= 1;
                                    this.id_ = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    if ((c & 2) != 2) {
                                        this.argument_ = new ArrayList();
                                        c = 2;
                                    }
                                    this.argument_.add(codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                                } else if (!codedInputStream.skipField(readTag, newInstance)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    throw th;
                }
            }
            if ((c & 2) == 2) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
        }

        public static Annotation getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        public Argument getArgument(int i) {
            return (Argument) this.argument_.get(i);
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        public List<Argument> getArgumentList() {
            return this.argument_;
        }

        public int getId() {
            return this.id_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Annotation> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.id_) : 0;
            for (int i2 = 0; i2 < this.argument_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.argument_.get(i2));
            }
            int size = this.unknownFields.size() + computeInt32Size;
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.argument_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new AnonymousClass1();
            public static final Argument defaultInstance;
            public int bitField0_;
            public byte memoizedIsInitialized;
            public int memoizedSerializedSize;
            public int nameId_;
            public final ByteString unknownFields;
            public Value value_;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractParser {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            static {
                Argument argument = new Argument();
                defaultInstance = argument;
                argument.nameId_ = 0;
                argument.value_ = Value.getDefaultInstance();
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                boolean z = false;
                this.nameId_ = 0;
                this.value_ = Value.getDefaultInstance();
                ByteString.Output newOutput = ByteString.newOutput();
                CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                while (!z) {
                    try {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 8) {
                                        this.bitField0_ |= 1;
                                        this.nameId_ = codedInputStream.readInt32();
                                    } else if (readTag == 18) {
                                        Value.Builder builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                        Value value = (Value) codedInputStream.readMessage(Value.PARSER, extensionRegistryLite);
                                        this.value_ = value;
                                        if (builder != null) {
                                            builder.mergeFrom(value);
                                            this.value_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 2;
                                    } else if (!codedInputStream.skipField(readTag, newInstance)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = newOutput.toByteString();
                    throw th3;
                }
                this.unknownFields = newOutput.toByteString();
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            public int getNameId() {
                return this.nameId_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.nameId_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    computeInt32Size += CodedOutputStream.computeMessageSize(2, this.value_);
                }
                int size = this.unknownFields.size() + computeInt32Size;
                this.memoizedSerializedSize = size;
                return size;
            }

            public Value getValue() {
                return this.value_;
            }

            public boolean hasNameId() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasValue() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (getValue().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.value_);
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static Parser<Value> PARSER = new AnonymousClass1();
                public static final Value defaultInstance;
                public Annotation annotation_;
                public int arrayDimensionCount_;
                public List arrayElement_;
                public int bitField0_;
                public int classId_;
                public double doubleValue_;
                public int enumValueId_;
                public int flags_;
                public float floatValue_;
                public long intValue_;
                public byte memoizedIsInitialized;
                public int memoizedSerializedSize;
                public int stringValue_;
                public Type type_;
                public final ByteString unknownFields;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$1, reason: invalid class name */
                public final class AnonymousClass1 extends AbstractParser {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);

                    public final int value;

                    Type(int i) {
                        this.value = i;
                    }

                    public static Type valueOf(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.value;
                    }
                }

                static {
                    Value value = new Value();
                    defaultInstance = value;
                    value.initFields();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                public Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    initFields();
                    ByteString.Output newOutput = ByteString.newOutput();
                    CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                    boolean z = false;
                    char c = 0;
                    while (true) {
                        ?? r5 = 256;
                        if (z) {
                            if ((c & 256) == 256) {
                                this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                            }
                            try {
                                newInstance.flush();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                this.unknownFields = newOutput.toByteString();
                                throw th;
                            }
                            this.unknownFields = newOutput.toByteString();
                            return;
                        }
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                switch (readTag) {
                                    case 0:
                                        z = true;
                                    case 8:
                                        int readEnum = codedInputStream.readEnum();
                                        Type valueOf = Type.valueOf(readEnum);
                                        if (valueOf == null) {
                                            newInstance.writeRawVarint32(readTag);
                                            newInstance.writeRawVarint32(readEnum);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.type_ = valueOf;
                                        }
                                    case 16:
                                        this.bitField0_ |= 2;
                                        this.intValue_ = codedInputStream.readSInt64();
                                    case 29:
                                        this.bitField0_ |= 4;
                                        this.floatValue_ = codedInputStream.readFloat();
                                    case 33:
                                        this.bitField0_ |= 8;
                                        this.doubleValue_ = codedInputStream.readDouble();
                                    case 40:
                                        this.bitField0_ |= 16;
                                        this.stringValue_ = codedInputStream.readInt32();
                                    case 48:
                                        this.bitField0_ |= 32;
                                        this.classId_ = codedInputStream.readInt32();
                                    case 56:
                                        this.bitField0_ |= 64;
                                        this.enumValueId_ = codedInputStream.readInt32();
                                    case 66:
                                        Builder builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                        Annotation annotation = (Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite);
                                        this.annotation_ = annotation;
                                        if (builder != null) {
                                            builder.mergeFrom(annotation);
                                            this.annotation_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 128;
                                    case 74:
                                        if ((c & 256) != 256) {
                                            this.arrayElement_ = new ArrayList();
                                            c = 256;
                                        }
                                        this.arrayElement_.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                    case 80:
                                        this.bitField0_ |= 512;
                                        this.flags_ = codedInputStream.readInt32();
                                    case 88:
                                        this.bitField0_ |= 256;
                                        this.arrayDimensionCount_ = codedInputStream.readInt32();
                                    default:
                                        r5 = codedInputStream.skipField(readTag, newInstance);
                                        if (r5 == 0) {
                                            z = true;
                                        }
                                }
                            } catch (Throwable th2) {
                                if ((c & 256) == r5) {
                                    this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                                }
                                try {
                                    newInstance.flush();
                                } catch (IOException unused2) {
                                } catch (Throwable th3) {
                                    this.unknownFields = newOutput.toByteString();
                                    throw th3;
                                }
                                this.unknownFields = newOutput.toByteString();
                                throw th2;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    }
                }

                public static Value getDefaultInstance() {
                    return defaultInstance;
                }

                public static Builder newBuilder(Value value) {
                    return newBuilder().mergeFrom(value);
                }

                public Annotation getAnnotation() {
                    return this.annotation_;
                }

                public int getArrayDimensionCount() {
                    return this.arrayDimensionCount_;
                }

                public Value getArrayElement(int i) {
                    return (Value) this.arrayElement_.get(i);
                }

                public int getArrayElementCount() {
                    return this.arrayElement_.size();
                }

                public List<Value> getArrayElementList() {
                    return this.arrayElement_;
                }

                public int getClassId() {
                    return this.classId_;
                }

                public double getDoubleValue() {
                    return this.doubleValue_;
                }

                public int getEnumValueId() {
                    return this.enumValueId_;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public float getFloatValue() {
                    return this.floatValue_;
                }

                public long getIntValue() {
                    return this.intValue_;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Parser<Value> getParserForType() {
                    return PARSER;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.memoizedSerializedSize;
                    if (i != -1) {
                        return i;
                    }
                    int computeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.type_.getNumber()) : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        computeEnumSize += CodedOutputStream.computeSInt64Size(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        computeEnumSize += CodedOutputStream.computeFloatSize(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        computeEnumSize += CodedOutputStream.computeDoubleSize(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        computeEnumSize += CodedOutputStream.computeInt32Size(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        computeEnumSize += CodedOutputStream.computeInt32Size(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        computeEnumSize += CodedOutputStream.computeInt32Size(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        computeEnumSize += CodedOutputStream.computeMessageSize(8, this.annotation_);
                    }
                    for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
                        computeEnumSize += CodedOutputStream.computeMessageSize(9, (MessageLite) this.arrayElement_.get(i2));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        computeEnumSize += CodedOutputStream.computeInt32Size(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        computeEnumSize += CodedOutputStream.computeInt32Size(11, this.arrayDimensionCount_);
                    }
                    int size = this.unknownFields.size() + computeEnumSize;
                    this.memoizedSerializedSize = size;
                    return size;
                }

                public int getStringValue() {
                    return this.stringValue_;
                }

                public Type getType() {
                    return this.type_;
                }

                public boolean hasAnnotation() {
                    return (this.bitField0_ & 128) == 128;
                }

                public boolean hasArrayDimensionCount() {
                    return (this.bitField0_ & 256) == 256;
                }

                public boolean hasClassId() {
                    return (this.bitField0_ & 32) == 32;
                }

                public boolean hasDoubleValue() {
                    return (this.bitField0_ & 8) == 8;
                }

                public boolean hasEnumValueId() {
                    return (this.bitField0_ & 64) == 64;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 512) == 512;
                }

                public boolean hasFloatValue() {
                    return (this.bitField0_ & 4) == 4;
                }

                public boolean hasIntValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                public boolean hasStringValue() {
                    return (this.bitField0_ & 16) == 16;
                }

                public boolean hasType() {
                    return (this.bitField0_ & 1) == 1;
                }

                public final void initFields() {
                    this.type_ = Type.BYTE;
                    this.intValue_ = 0L;
                    this.floatValue_ = RecyclerView.DECELERATION_RATE;
                    this.doubleValue_ = 0.0d;
                    this.stringValue_ = 0;
                    this.classId_ = 0;
                    this.enumValueId_ = 0;
                    this.annotation_ = Annotation.getDefaultInstance();
                    this.arrayElement_ = Collections.EMPTY_LIST;
                    this.arrayDimensionCount_ = 0;
                    this.flags_ = 0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                    for (int i = 0; i < getArrayElementCount(); i++) {
                        if (!getArrayElement(i).isInitialized()) {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    getSerializedSize();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.type_.getNumber());
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        codedOutputStream.writeMessage(8, this.annotation_);
                    }
                    for (int i = 0; i < this.arrayElement_.size(); i++) {
                        codedOutputStream.writeMessage(9, (MessageLite) this.arrayElement_.get(i));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.writeInt32(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.writeInt32(11, this.arrayDimensionCount_);
                    }
                    codedOutputStream.writeRawBytes(this.unknownFields);
                }

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
                    public int arrayDimensionCount_;
                    public int bitField0_;
                    public int classId_;
                    public double doubleValue_;
                    public int enumValueId_;
                    public int flags_;
                    public float floatValue_;
                    public long intValue_;
                    public int stringValue_;
                    public Type type_ = Type.BYTE;
                    public Annotation annotation_ = Annotation.getDefaultInstance();
                    public List arrayElement_ = Collections.EMPTY_LIST;

                    public Builder addArrayElement(Builder builder) {
                        if ((this.bitField0_ & 256) != 256) {
                            this.arrayElement_ = new ArrayList(this.arrayElement_);
                            this.bitField0_ |= 256;
                        }
                        this.arrayElement_.add(builder.build());
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Value build() {
                        Value buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw new UninitializedMessageException(buildPartial);
                    }

                    public Value buildPartial() {
                        Value value = new Value(this);
                        int i = this.bitField0_;
                        int i2 = (i & 1) != 1 ? 0 : 1;
                        value.type_ = this.type_;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.intValue_ = this.intValue_;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.floatValue_ = this.floatValue_;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.doubleValue_ = this.doubleValue_;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.stringValue_ = this.stringValue_;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.classId_ = this.classId_;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.enumValueId_ = this.enumValueId_;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        value.annotation_ = this.annotation_;
                        if ((i & 256) == 256) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                            this.bitField0_ &= -257;
                        }
                        value.arrayElement_ = this.arrayElement_;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        value.arrayDimensionCount_ = this.arrayDimensionCount_;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        value.flags_ = this.flags_;
                        value.bitField0_ = i2;
                        return value;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* renamed from: clone */
                    public Builder mo4151clone() {
                        return new Builder().mergeFrom(buildPartial());
                    }

                    public Annotation getAnnotation() {
                        return this.annotation_;
                    }

                    public Value getArrayElement(int i) {
                        return (Value) this.arrayElement_.get(i);
                    }

                    public int getArrayElementCount() {
                        return this.arrayElement_.size();
                    }

                    public boolean hasAnnotation() {
                        return (this.bitField0_ & 128) == 128;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i = 0; i < getArrayElementCount(); i++) {
                            if (!getArrayElement(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder mergeAnnotation(Annotation annotation) {
                        if ((this.bitField0_ & 128) != 128 || this.annotation_ == Annotation.getDefaultInstance()) {
                            this.annotation_ = annotation;
                        } else {
                            this.annotation_ = Annotation.newBuilder(this.annotation_).mergeFrom(annotation).buildPartial();
                        }
                        this.bitField0_ |= 128;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public Builder mergeFrom(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.arrayElement_.isEmpty()) {
                            if (this.arrayElement_.isEmpty()) {
                                this.arrayElement_ = value.arrayElement_;
                                this.bitField0_ &= -257;
                            } else {
                                if ((this.bitField0_ & 256) != 256) {
                                    this.arrayElement_ = new ArrayList(this.arrayElement_);
                                    this.bitField0_ |= 256;
                                }
                                this.arrayElement_.addAll(value.arrayElement_);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.unknownFields));
                        return this;
                    }

                    public Builder setAnnotation(Annotation annotation) {
                        annotation.getClass();
                        this.annotation_ = annotation;
                        this.bitField0_ |= 128;
                        return this;
                    }

                    public Builder setArrayDimensionCount(int i) {
                        this.bitField0_ |= 512;
                        this.arrayDimensionCount_ = i;
                        return this;
                    }

                    public Builder setClassId(int i) {
                        this.bitField0_ |= 32;
                        this.classId_ = i;
                        return this;
                    }

                    public Builder setDoubleValue(double d) {
                        this.bitField0_ |= 8;
                        this.doubleValue_ = d;
                        return this;
                    }

                    public Builder setEnumValueId(int i) {
                        this.bitField0_ |= 64;
                        this.enumValueId_ = i;
                        return this;
                    }

                    public Builder setFlags(int i) {
                        this.bitField0_ |= 1024;
                        this.flags_ = i;
                        return this;
                    }

                    public Builder setFloatValue(float f) {
                        this.bitField0_ |= 4;
                        this.floatValue_ = f;
                        return this;
                    }

                    public Builder setIntValue(long j) {
                        this.bitField0_ |= 2;
                        this.intValue_ = j;
                        return this;
                    }

                    public Builder setStringValue(int i) {
                        this.bitField0_ |= 16;
                        this.stringValue_ = i;
                        return this;
                    }

                    public Builder setType(Type type2) {
                        type2.getClass();
                        this.bitField0_ |= 1;
                        this.type_ = type2;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        Value value = null;
                        try {
                            try {
                                Value parsePartialFrom = Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                                if (parsePartialFrom != null) {
                                    mergeFrom(parsePartialFrom);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                Value value2 = (Value) e.getUnfinishedMessage();
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    value = value2;
                                    if (value != null) {
                                        mergeFrom(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (value != null) {
                            }
                            throw th;
                        }
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Value getDefaultInstanceForType() {
                    return defaultInstance;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder toBuilder() {
                    return newBuilder(this);
                }

                public static Builder newBuilder() {
                    return new Builder();
                }

                public Value() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = ByteString.EMPTY;
                }

                public Value(Builder builder) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = builder.getUnknownFields();
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                public int bitField0_;
                public int nameId_;
                public Value value_ = Value.getDefaultInstance();

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw new UninitializedMessageException(buildPartial);
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i = this.bitField0_;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.nameId_ = this.nameId_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.value_ = this.value_;
                    argument.bitField0_ = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone, reason: merged with bridge method [inline-methods] */
                public Builder mo4151clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                public Value getValue() {
                    return this.value_;
                }

                public boolean hasNameId() {
                    return (this.bitField0_ & 1) == 1;
                }

                public boolean hasValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasNameId() && hasValue() && getValue().isInitialized();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                    return this;
                }

                public Builder mergeValue(Value value) {
                    if ((this.bitField0_ & 2) != 2 || this.value_ == Value.getDefaultInstance()) {
                        this.value_ = value;
                    } else {
                        this.value_ = Value.newBuilder(this.value_).mergeFrom(value).buildPartial();
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                public Builder setNameId(int i) {
                    this.bitField0_ |= 1;
                    this.nameId_ = i;
                    return this;
                }

                public Builder setValue(Value value) {
                    value.getClass();
                    this.value_ = value;
                    this.bitField0_ |= 2;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Argument argument = null;
                    try {
                        try {
                            Argument parsePartialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (parsePartialFrom != null) {
                                mergeFrom(parsePartialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Argument argument2 = (Argument) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                        }
                        throw th;
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            public Argument() {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            public Argument(Builder builder) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
            public List argument_ = Collections.EMPTY_LIST;
            public int bitField0_;
            public int id_;

            public Builder addArgument(Argument.Builder builder) {
                if ((this.bitField0_ & 2) != 2) {
                    this.argument_ = new ArrayList(this.argument_);
                    this.bitField0_ |= 2;
                }
                this.argument_.add(builder.build());
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Annotation build() {
                Annotation buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                annotation.id_ = this.id_;
                if ((i & 2) == 2) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -3;
                }
                annotation.argument_ = this.argument_;
                annotation.bitField0_ = i2;
                return annotation;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Argument getArgument(int i) {
                return (Argument) this.argument_.get(i);
            }

            public int getArgumentCount() {
                return this.argument_.size();
            }

            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = annotation.argument_;
                        this.bitField0_ &= -3;
                    } else {
                        if ((this.bitField0_ & 2) != 2) {
                            this.argument_ = new ArrayList(this.argument_);
                            this.bitField0_ |= 2;
                        }
                        this.argument_.addAll(annotation.argument_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.unknownFields));
                return this;
            }

            public Builder setId(int i) {
                this.bitField0_ |= 1;
                this.id_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Annotation annotation = null;
                try {
                    try {
                        Annotation parsePartialFrom = Annotation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Annotation annotation2 = (Annotation) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            annotation = annotation2;
                            if (annotation != null) {
                                mergeFrom(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (annotation != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Annotation getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Annotation() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public Annotation(Builder builder) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new AnonymousClass1();
        public static final QualifiedNameTable defaultInstance;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public List qualifiedName_;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable();
            defaultInstance = qualifiedNameTable;
            qualifiedNameTable.qualifiedName_ = Collections.EMPTY_LIST;
        }

        public QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.qualifiedName_ = Collections.EMPTY_LIST;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!z2) {
                                    this.qualifiedName_ = new ArrayList();
                                    z2 = true;
                                }
                                this.qualifiedName_.add(codedInputStream.readMessage(QualifiedName.PARSER, extensionRegistryLite));
                            } else if (!codedInputStream.skipField(readTag, newInstance)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2) {
                            this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2) {
                this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
        }

        public static QualifiedNameTable getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public QualifiedName getQualifiedName(int i) {
            return (QualifiedName) this.qualifiedName_.get(i);
        }

        public int getQualifiedNameCount() {
            return this.qualifiedName_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.qualifiedName_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.qualifiedName_.get(i3));
            }
            int size = this.unknownFields.size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getQualifiedNameCount(); i++) {
                if (!getQualifiedName(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.qualifiedName_.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.qualifiedName_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new AnonymousClass1();
            public static final QualifiedName defaultInstance;
            public int bitField0_;
            public Kind kind_;
            public byte memoizedIsInitialized;
            public int memoizedSerializedSize;
            public int parentQualifiedName_;
            public int shortName_;
            public final ByteString unknownFields;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractParser {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new QualifiedName(codedInputStream);
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);

                public final int value;

                Kind(int i) {
                    this.value = i;
                }

                public static Kind valueOf(int i) {
                    if (i == 0) {
                        return CLASS;
                    }
                    if (i == 1) {
                        return PACKAGE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName();
                defaultInstance = qualifiedName;
                qualifiedName.parentQualifiedName_ = -1;
                qualifiedName.shortName_ = 0;
                qualifiedName.kind_ = Kind.PACKAGE;
            }

            public QualifiedName(CodedInputStream codedInputStream) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.parentQualifiedName_ = -1;
                boolean z = false;
                this.shortName_ = 0;
                this.kind_ = Kind.PACKAGE;
                ByteString.Output newOutput = ByteString.newOutput();
                CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                while (!z) {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.bitField0_ |= 1;
                                    this.parentQualifiedName_ = codedInputStream.readInt32();
                                } else if (readTag == 16) {
                                    this.bitField0_ |= 2;
                                    this.shortName_ = codedInputStream.readInt32();
                                } else if (readTag == 24) {
                                    int readEnum = codedInputStream.readEnum();
                                    Kind valueOf = Kind.valueOf(readEnum);
                                    if (valueOf == null) {
                                        newInstance.writeRawVarint32(readTag);
                                        newInstance.writeRawVarint32(readEnum);
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.kind_ = valueOf;
                                    }
                                } else if (!codedInputStream.skipField(readTag, newInstance)) {
                                }
                            }
                            z = true;
                        } catch (Throwable th) {
                            try {
                                newInstance.flush();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.unknownFields = newOutput.toByteString();
                                throw th2;
                            }
                            this.unknownFields = newOutput.toByteString();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                }
                try {
                    newInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = newOutput.toByteString();
                    throw th3;
                }
                this.unknownFields = newOutput.toByteString();
            }

            public static QualifiedName getDefaultInstance() {
                return defaultInstance;
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            public Kind getKind() {
                return this.kind_;
            }

            public int getParentQualifiedName() {
                return this.parentQualifiedName_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<QualifiedName> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.parentQualifiedName_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    computeInt32Size += CodedOutputStream.computeInt32Size(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    computeInt32Size += CodedOutputStream.computeEnumSize(3, this.kind_.getNumber());
                }
                int size = this.unknownFields.size() + computeInt32Size;
                this.memoizedSerializedSize = size;
                return size;
            }

            public int getShortName() {
                return this.shortName_;
            }

            public boolean hasKind() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasParentQualifiedName() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasShortName() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (hasShortName()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.kind_.getNumber());
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {
                public int bitField0_;
                public int shortName_;
                public int parentQualifiedName_ = -1;
                public Kind kind_ = Kind.PACKAGE;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public QualifiedName build() {
                    QualifiedName buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw new UninitializedMessageException(buildPartial);
                }

                public QualifiedName buildPartial() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i = this.bitField0_;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    qualifiedName.parentQualifiedName_ = this.parentQualifiedName_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.shortName_ = this.shortName_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.kind_ = this.kind_;
                    qualifiedName.bitField0_ = i2;
                    return qualifiedName;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo4151clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                public boolean hasShortName() {
                    return (this.bitField0_ & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasShortName();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.unknownFields));
                    return this;
                }

                public Builder setKind(Kind kind) {
                    kind.getClass();
                    this.bitField0_ |= 4;
                    this.kind_ = kind;
                    return this;
                }

                public Builder setParentQualifiedName(int i) {
                    this.bitField0_ |= 1;
                    this.parentQualifiedName_ = i;
                    return this;
                }

                public Builder setShortName(int i) {
                    this.bitField0_ |= 2;
                    this.shortName_ = i;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            QualifiedName parsePartialFrom = QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (parsePartialFrom != null) {
                                mergeFrom(parsePartialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            QualifiedName qualifiedName2 = (QualifiedName) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                    mergeFrom(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (qualifiedName != null) {
                        }
                        throw th;
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedName getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            public QualifiedName() {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            public QualifiedName(Builder builder) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {
            public int bitField0_;
            public List qualifiedName_ = Collections.EMPTY_LIST;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public QualifiedNameTable build() {
                QualifiedNameTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public QualifiedNameTable buildPartial() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                    this.bitField0_ &= -2;
                }
                qualifiedNameTable.qualifiedName_ = this.qualifiedName_;
                return qualifiedNameTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public QualifiedName getQualifiedName(int i) {
                return (QualifiedName) this.qualifiedName_.get(i);
            }

            public int getQualifiedNameCount() {
                return this.qualifiedName_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getQualifiedNameCount(); i++) {
                    if (!getQualifiedName(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.qualifiedName_.isEmpty()) {
                    if (this.qualifiedName_.isEmpty()) {
                        this.qualifiedName_ = qualifiedNameTable.qualifiedName_;
                        this.bitField0_ &= -2;
                    } else {
                        if ((this.bitField0_ & 1) != 1) {
                            this.qualifiedName_ = new ArrayList(this.qualifiedName_);
                            this.bitField0_ |= 1;
                        }
                        this.qualifiedName_.addAll(qualifiedNameTable.qualifiedName_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        QualifiedNameTable parsePartialFrom = QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                                mergeFrom(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (qualifiedNameTable != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public QualifiedNameTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public QualifiedNameTable() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public QualifiedNameTable(Builder builder) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static Parser<Type> PARSER = new AnonymousClass1();
        public static final Type defaultInstance;
        public int abbreviatedTypeId_;
        public Type abbreviatedType_;
        public List annotation_;
        public List argument_;
        public int bitField0_;
        public int className_;
        public int flags_;
        public int flexibleTypeCapabilitiesId_;
        public int flexibleUpperBoundId_;
        public Type flexibleUpperBound_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public boolean nullable_;
        public int outerTypeId_;
        public Type outerType_;
        public int typeAliasName_;
        public int typeParameterName_;
        public int typeParameter_;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            Type type2 = new Type();
            defaultInstance = type2;
            type2.initFields$27();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        public Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Builder builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields$27();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            int i = 0;
            while (true) {
                ?? r5 = 16384;
                if (z) {
                    if ((i & 1) == 1) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
                    }
                    if ((i & 16384) == 16384) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                            case 8:
                                this.bitField0_ |= 4096;
                                this.flags_ = codedInputStream.readInt32();
                            case 18:
                                if ((i & 1) != 1) {
                                    this.argument_ = new ArrayList();
                                    i |= 1;
                                }
                                this.argument_.add(codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                            case 24:
                                this.bitField0_ |= 1;
                                this.nullable_ = codedInputStream.readBool();
                            case 32:
                                this.bitField0_ |= 2;
                                this.flexibleTypeCapabilitiesId_ = codedInputStream.readInt32();
                            case 42:
                                builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                this.flexibleUpperBound_ = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.flexibleUpperBound_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 4;
                            case 48:
                                this.bitField0_ |= 16;
                                this.className_ = codedInputStream.readInt32();
                            case 56:
                                this.bitField0_ |= 32;
                                this.typeParameter_ = codedInputStream.readInt32();
                            case 64:
                                this.bitField0_ |= 8;
                                this.flexibleUpperBoundId_ = codedInputStream.readInt32();
                            case 72:
                                this.bitField0_ |= 64;
                                this.typeParameterName_ = codedInputStream.readInt32();
                            case 82:
                                builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : null;
                                Type type3 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                this.outerType_ = type3;
                                if (builder != null) {
                                    builder.mergeFrom(type3);
                                    this.outerType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 256;
                            case 88:
                                this.bitField0_ |= 512;
                                this.outerTypeId_ = codedInputStream.readInt32();
                            case 96:
                                this.bitField0_ |= 128;
                                this.typeAliasName_ = codedInputStream.readInt32();
                            case 106:
                                builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : null;
                                Type type4 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                this.abbreviatedType_ = type4;
                                if (builder != null) {
                                    builder.mergeFrom(type4);
                                    this.abbreviatedType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1024;
                            case 112:
                                this.bitField0_ |= 2048;
                                this.abbreviatedTypeId_ = codedInputStream.readInt32();
                            case 802:
                                if ((i & 16384) != 16384) {
                                    this.annotation_ = new ArrayList();
                                    i |= 16384;
                                }
                                this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            default:
                                r5 = parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag);
                                if (r5 == 0) {
                                    z = true;
                                }
                        }
                    } catch (Throwable th2) {
                        if ((i & 1) == 1) {
                            this.argument_ = Collections.unmodifiableList(this.argument_);
                        }
                        if ((i & 16384) == r5) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.unknownFields = newOutput.toByteString();
                            throw th3;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
        }

        public static Type getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Type type2) {
            return newBuilder().mergeFrom(type2);
        }

        public Type getAbbreviatedType() {
            return this.abbreviatedType_;
        }

        public int getAbbreviatedTypeId() {
            return this.abbreviatedTypeId_;
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public Argument getArgument(int i) {
            return (Argument) this.argument_.get(i);
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        public List<Argument> getArgumentList() {
            return this.argument_;
        }

        public int getClassName() {
            return this.className_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.flexibleTypeCapabilitiesId_;
        }

        public Type getFlexibleUpperBound() {
            return this.flexibleUpperBound_;
        }

        public int getFlexibleUpperBoundId() {
            return this.flexibleUpperBoundId_;
        }

        public boolean getNullable() {
            return this.nullable_;
        }

        public Type getOuterType() {
            return this.outerType_;
        }

        public int getOuterTypeId() {
            return this.outerTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Type> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 4096) == 4096 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            for (int i2 = 0; i2 < this.argument_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.argument_.get(i2));
            }
            if ((this.bitField0_ & 1) == 1) {
                computeInt32Size += CodedOutputStream.computeBoolSize(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeInt32Size(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeMessageSize(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeInt32Size(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                computeInt32Size += CodedOutputStream.computeInt32Size(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeInt32Size(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                computeInt32Size += CodedOutputStream.computeInt32Size(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                computeInt32Size += CodedOutputStream.computeMessageSize(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                computeInt32Size += CodedOutputStream.computeInt32Size(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                computeInt32Size += CodedOutputStream.computeInt32Size(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                computeInt32Size += CodedOutputStream.computeMessageSize(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                computeInt32Size += CodedOutputStream.computeInt32Size(14, this.abbreviatedTypeId_);
            }
            for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(100, (MessageLite) this.annotation_.get(i3));
            }
            int size = this.unknownFields.size() + extensionsSerializedSize() + computeInt32Size;
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getTypeAliasName() {
            return this.typeAliasName_;
        }

        public int getTypeParameter() {
            return this.typeParameter_;
        }

        public int getTypeParameterName() {
            return this.typeParameterName_;
        }

        public boolean hasAbbreviatedType() {
            return (this.bitField0_ & 1024) == 1024;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.bitField0_ & 2048) == 2048;
        }

        public boolean hasClassName() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 4096) == 4096;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasOuterType() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasOuterTypeId() {
            return (this.bitField0_ & 512) == 512;
        }

        public boolean hasTypeAliasName() {
            return (this.bitField0_ & 128) == 128;
        }

        public boolean hasTypeParameter() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasTypeParameterName() {
            return (this.bitField0_ & 64) == 64;
        }

        public final void initFields$27() {
            List list = Collections.EMPTY_LIST;
            this.argument_ = list;
            this.nullable_ = false;
            this.flexibleTypeCapabilitiesId_ = 0;
            this.flexibleUpperBound_ = getDefaultInstance();
            this.flexibleUpperBoundId_ = 0;
            this.className_ = 0;
            this.typeParameter_ = 0;
            this.typeParameterName_ = 0;
            this.typeAliasName_ = 0;
            this.outerType_ = getDefaultInstance();
            this.outerTypeId_ = 0;
            this.abbreviatedType_ = getDefaultInstance();
            this.abbreviatedTypeId_ = 0;
            this.flags_ = 0;
            this.annotation_ = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            for (int i = 0; i < this.argument_.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.argument_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBool(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeMessage(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeInt32(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeInt32(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.abbreviatedTypeId_);
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                codedOutputStream.writeMessage(100, (MessageLite) this.annotation_.get(i2));
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new AnonymousClass1();
            public static final Argument defaultInstance;
            public int bitField0_;
            public byte memoizedIsInitialized;
            public int memoizedSerializedSize;
            public Projection projection_;
            public int typeId_;
            public Type type_;
            public final ByteString unknownFields;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractParser {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);

                public final int value;

                Projection(int i) {
                    this.value = i;
                }

                public static Projection valueOf(int i) {
                    if (i == 0) {
                        return IN;
                    }
                    if (i == 1) {
                        return OUT;
                    }
                    if (i == 2) {
                        return INV;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return STAR;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                Argument argument = new Argument();
                defaultInstance = argument;
                argument.projection_ = Projection.INV;
                argument.type_ = Type.getDefaultInstance();
                argument.typeId_ = 0;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.projection_ = Projection.INV;
                this.type_ = Type.getDefaultInstance();
                boolean z = false;
                this.typeId_ = 0;
                ByteString.Output newOutput = ByteString.newOutput();
                CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
                while (!z) {
                    try {
                        try {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 8) {
                                        int readEnum = codedInputStream.readEnum();
                                        Projection valueOf = Projection.valueOf(readEnum);
                                        if (valueOf == null) {
                                            newInstance.writeRawVarint32(readTag);
                                            newInstance.writeRawVarint32(readEnum);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.projection_ = valueOf;
                                        }
                                    } else if (readTag == 18) {
                                        Builder builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                        Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                        this.type_ = type2;
                                        if (builder != null) {
                                            builder.mergeFrom(type2);
                                            this.type_ = builder.buildPartial();
                                        }
                                        this.bitField0_ |= 2;
                                    } else if (readTag == 24) {
                                        this.bitField0_ |= 4;
                                        this.typeId_ = codedInputStream.readInt32();
                                    } else if (!codedInputStream.skipField(readTag, newInstance)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                }
                try {
                    newInstance.flush();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = newOutput.toByteString();
                    throw th3;
                }
                this.unknownFields = newOutput.toByteString();
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            public Projection getProjection() {
                return this.projection_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int computeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.projection_.getNumber()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    computeEnumSize += CodedOutputStream.computeMessageSize(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    computeEnumSize += CodedOutputStream.computeInt32Size(3, this.typeId_);
                }
                int size = this.unknownFields.size() + computeEnumSize;
                this.memoizedSerializedSize = size;
                return size;
            }

            public Type getType() {
                return this.type_;
            }

            public int getTypeId() {
                return this.typeId_;
            }

            public boolean hasProjection() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasType() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasTypeId() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.typeId_);
                }
                codedOutputStream.writeRawBytes(this.unknownFields);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                public int bitField0_;
                public int typeId_;
                public Projection projection_ = Projection.INV;
                public Type type_ = Type.getDefaultInstance();

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw new UninitializedMessageException(buildPartial);
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i = this.bitField0_;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.projection_ = this.projection_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.type_ = this.type_;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.typeId_ = this.typeId_;
                    argument.bitField0_ = i2;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public Builder mo4151clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                public Type getType() {
                    return this.type_;
                }

                public boolean hasType() {
                    return (this.bitField0_ & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasType() || getType().isInitialized();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.unknownFields));
                    return this;
                }

                public Builder mergeType(Type type2) {
                    if ((this.bitField0_ & 2) != 2 || this.type_ == Type.getDefaultInstance()) {
                        this.type_ = type2;
                    } else {
                        this.type_ = Type.newBuilder(this.type_).mergeFrom(type2).buildPartial();
                    }
                    this.bitField0_ |= 2;
                    return this;
                }

                public Builder setProjection(Projection projection) {
                    projection.getClass();
                    this.bitField0_ |= 1;
                    this.projection_ = projection;
                    return this;
                }

                public Builder setType(Type type2) {
                    type2.getClass();
                    this.type_ = type2;
                    this.bitField0_ |= 2;
                    return this;
                }

                public Builder setTypeId(int i) {
                    this.bitField0_ |= 4;
                    this.typeId_ = i;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Argument argument = null;
                    try {
                        try {
                            Argument parsePartialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (parsePartialFrom != null) {
                                mergeFrom(parsePartialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Argument argument2 = (Argument) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                        }
                        throw th;
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            public Argument() {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ByteString.EMPTY;
            }

            public Argument(Builder builder) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = builder.getUnknownFields();
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {
            public int abbreviatedTypeId_;
            public Type abbreviatedType_;
            public List annotation_;
            public List argument_;
            public int bitField0_;
            public int className_;
            public int flags_;
            public int flexibleTypeCapabilitiesId_;
            public int flexibleUpperBoundId_;
            public Type flexibleUpperBound_;
            public boolean nullable_;
            public int outerTypeId_;
            public Type outerType_;
            public int typeAliasName_;
            public int typeParameterName_;
            public int typeParameter_;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.argument_ = list;
                this.flexibleUpperBound_ = Type.getDefaultInstance();
                this.outerType_ = Type.getDefaultInstance();
                this.abbreviatedType_ = Type.getDefaultInstance();
                this.annotation_ = list;
            }

            public Builder addAnnotation(Annotation annotation) {
                annotation.getClass();
                if ((this.bitField0_ & 16384) != 16384) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 16384;
                }
                this.annotation_.add(annotation);
                return this;
            }

            public Builder addArgument(Argument.Builder builder) {
                if ((this.bitField0_ & 1) != 1) {
                    this.argument_ = new ArrayList(this.argument_);
                    this.bitField0_ |= 1;
                }
                this.argument_.add(builder.build());
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Type build() {
                Type buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public Type buildPartial() {
                Type type2 = new Type(this);
                int i = this.bitField0_;
                if ((i & 1) == 1) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
                    this.bitField0_ &= -2;
                }
                type2.argument_ = this.argument_;
                int i2 = (i & 2) != 2 ? 0 : 1;
                type2.nullable_ = this.nullable_;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type2.flexibleTypeCapabilitiesId_ = this.flexibleTypeCapabilitiesId_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type2.flexibleUpperBound_ = this.flexibleUpperBound_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type2.flexibleUpperBoundId_ = this.flexibleUpperBoundId_;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type2.className_ = this.className_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type2.typeParameter_ = this.typeParameter_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                type2.typeParameterName_ = this.typeParameterName_;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                type2.typeAliasName_ = this.typeAliasName_;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                type2.outerType_ = this.outerType_;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                type2.outerTypeId_ = this.outerTypeId_;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                type2.abbreviatedType_ = this.abbreviatedType_;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type2.abbreviatedTypeId_ = this.abbreviatedTypeId_;
                if ((i & PKIFailureInfo.certRevoked) == 8192) {
                    i2 |= 4096;
                }
                type2.flags_ = this.flags_;
                if ((this.bitField0_ & 16384) == 16384) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -16385;
                }
                type2.annotation_ = this.annotation_;
                type2.bitField0_ = i2;
                return type2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Type getAbbreviatedType() {
                return this.abbreviatedType_;
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.annotation_.get(i);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public Argument getArgument(int i) {
                return (Argument) this.argument_.get(i);
            }

            public int getArgumentCount() {
                return this.argument_.size();
            }

            public Type getFlexibleUpperBound() {
                return this.flexibleUpperBound_;
            }

            public Type getOuterType() {
                return this.outerType_;
            }

            public boolean hasAbbreviatedType() {
                return (this.bitField0_ & 2048) == 2048;
            }

            public boolean hasFlexibleUpperBound() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasOuterType() {
                return (this.bitField0_ & 512) == 512;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (hasOuterType() && !getOuterType().isInitialized()) {
                    return false;
                }
                if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                return this.extensions.isInitialized();
            }

            public Builder mergeAbbreviatedType(Type type2) {
                if ((this.bitField0_ & 2048) != 2048 || this.abbreviatedType_ == Type.getDefaultInstance()) {
                    this.abbreviatedType_ = type2;
                } else {
                    this.abbreviatedType_ = Type.newBuilder(this.abbreviatedType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 2048;
                return this;
            }

            public Builder mergeFlexibleUpperBound(Type type2) {
                if ((this.bitField0_ & 8) != 8 || this.flexibleUpperBound_ == Type.getDefaultInstance()) {
                    this.flexibleUpperBound_ = type2;
                } else {
                    this.flexibleUpperBound_ = Type.newBuilder(this.flexibleUpperBound_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Type type2) {
                if (type2 == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type2.argument_.isEmpty()) {
                    if (this.argument_.isEmpty()) {
                        this.argument_ = type2.argument_;
                        this.bitField0_ &= -2;
                    } else {
                        if ((this.bitField0_ & 1) != 1) {
                            this.argument_ = new ArrayList(this.argument_);
                            this.bitField0_ |= 1;
                        }
                        this.argument_.addAll(type2.argument_);
                    }
                }
                if (type2.hasNullable()) {
                    setNullable(type2.getNullable());
                }
                if (type2.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type2.getFlexibleTypeCapabilitiesId());
                }
                if (type2.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type2.getFlexibleUpperBound());
                }
                if (type2.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type2.getFlexibleUpperBoundId());
                }
                if (type2.hasClassName()) {
                    setClassName(type2.getClassName());
                }
                if (type2.hasTypeParameter()) {
                    setTypeParameter(type2.getTypeParameter());
                }
                if (type2.hasTypeParameterName()) {
                    setTypeParameterName(type2.getTypeParameterName());
                }
                if (type2.hasTypeAliasName()) {
                    setTypeAliasName(type2.getTypeAliasName());
                }
                if (type2.hasOuterType()) {
                    mergeOuterType(type2.getOuterType());
                }
                if (type2.hasOuterTypeId()) {
                    setOuterTypeId(type2.getOuterTypeId());
                }
                if (type2.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type2.getAbbreviatedType());
                }
                if (type2.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type2.getAbbreviatedTypeId());
                }
                if (type2.hasFlags()) {
                    setFlags(type2.getFlags());
                }
                if (!type2.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = type2.annotation_;
                        this.bitField0_ &= -16385;
                    } else {
                        if ((this.bitField0_ & 16384) != 16384) {
                            this.annotation_ = new ArrayList(this.annotation_);
                            this.bitField0_ |= 16384;
                        }
                        this.annotation_.addAll(type2.annotation_);
                    }
                }
                mergeExtensionFields(type2);
                setUnknownFields(getUnknownFields().concat(type2.unknownFields));
                return this;
            }

            public Builder mergeOuterType(Type type2) {
                if ((this.bitField0_ & 512) != 512 || this.outerType_ == Type.getDefaultInstance()) {
                    this.outerType_ = type2;
                } else {
                    this.outerType_ = Type.newBuilder(this.outerType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 512;
                return this;
            }

            public Builder setAbbreviatedType(Type type2) {
                type2.getClass();
                this.abbreviatedType_ = type2;
                this.bitField0_ |= 2048;
                return this;
            }

            public Builder setAbbreviatedTypeId(int i) {
                this.bitField0_ |= 4096;
                this.abbreviatedTypeId_ = i;
                return this;
            }

            public Builder setClassName(int i) {
                this.bitField0_ |= 32;
                this.className_ = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= PKIFailureInfo.certRevoked;
                this.flags_ = i;
                return this;
            }

            public Builder setFlexibleTypeCapabilitiesId(int i) {
                this.bitField0_ |= 4;
                this.flexibleTypeCapabilitiesId_ = i;
                return this;
            }

            public Builder setFlexibleUpperBound(Type type2) {
                type2.getClass();
                this.flexibleUpperBound_ = type2;
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setFlexibleUpperBoundId(int i) {
                this.bitField0_ |= 16;
                this.flexibleUpperBoundId_ = i;
                return this;
            }

            public Builder setNullable(boolean z) {
                this.bitField0_ |= 2;
                this.nullable_ = z;
                return this;
            }

            public Builder setOuterType(Type type2) {
                type2.getClass();
                this.outerType_ = type2;
                this.bitField0_ |= 512;
                return this;
            }

            public Builder setOuterTypeId(int i) {
                this.bitField0_ |= 1024;
                this.outerTypeId_ = i;
                return this;
            }

            public Builder setTypeAliasName(int i) {
                this.bitField0_ |= 256;
                this.typeAliasName_ = i;
                return this;
            }

            public Builder setTypeParameter(int i) {
                this.bitField0_ |= 64;
                this.typeParameter_ = i;
                return this;
            }

            public Builder setTypeParameterName(int i) {
                this.bitField0_ |= 128;
                this.typeParameterName_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Type getDefaultInstanceForType() {
                return Type.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Type type2 = null;
                try {
                    try {
                        Type parsePartialFrom = Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Type type3 = (Type) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            type2 = type3;
                            if (type2 != null) {
                                mergeFrom(type2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (type2 != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Type getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Type() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public Type(Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static Parser<Class> PARSER = new AnonymousClass1();
        public static final Class defaultInstance;
        public List annotation_;
        public int bitField0_;
        public int companionObjectName_;
        public List compilerPluginData_;
        public List constructor_;
        public int contextReceiverTypeIdMemoizedSerializedSize;
        public List contextReceiverTypeId_;
        public List contextReceiverType_;
        public List enumEntry_;
        public int flags_;
        public int fqName_;
        public List function_;
        public int inlineClassUnderlyingPropertyName_;
        public int inlineClassUnderlyingTypeId_;
        public Type inlineClassUnderlyingType_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public int nestedClassNameMemoizedSerializedSize;
        public List nestedClassName_;
        public List property_;
        public int sealedSubclassFqNameMemoizedSerializedSize;
        public List sealedSubclassFqName_;
        public int supertypeIdMemoizedSerializedSize;
        public List supertypeId_;
        public List supertype_;
        public List typeAlias_;
        public List typeParameter_;
        public TypeTable typeTable_;
        public final ByteString unknownFields;
        public VersionRequirementTable versionRequirementTable_;
        public List versionRequirement_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            OBJECT(5),
            COMPANION_OBJECT(6);

            public final int value;

            Kind(int i) {
                this.value = i;
            }

            public static Kind valueOf(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Class r0 = new Class();
            defaultInstance = r0;
            r0.initFields$19();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v20 */
        /* JADX WARN: Type inference failed for: r7v22 */
        /* JADX WARN: Type inference failed for: r7v24 */
        /* JADX WARN: Type inference failed for: r7v26 */
        /* JADX WARN: Type inference failed for: r7v28 */
        /* JADX WARN: Type inference failed for: r7v30 */
        /* JADX WARN: Type inference failed for: r7v32 */
        /* JADX WARN: Type inference failed for: r7v34 */
        /* JADX WARN: Type inference failed for: r7v36 */
        /* JADX WARN: Type inference failed for: r7v38 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v40 */
        /* JADX WARN: Type inference failed for: r7v42 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v8 */
        public Class(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            char c;
            char c2;
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields$19();
            ByteString.Output newOutput = ByteString.newOutput();
            boolean z = true;
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z2 = false;
            char c3 = 0;
            while (true) {
                boolean z3 = z;
                if (z2) {
                    if (((c3 == true ? 1 : 0) & 32) == 32) {
                        this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                    }
                    if (((c3 == true ? 1 : 0) & 8) == 8) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if (((c3 == true ? 1 : 0) & 16) == 16) {
                        this.supertype_ = Collections.unmodifiableList(this.supertype_);
                    }
                    if (((c3 == true ? 1 : 0) & 64) == 64) {
                        this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                    }
                    if (((c3 == true ? 1 : 0) & 512) == 512) {
                        this.constructor_ = Collections.unmodifiableList(this.constructor_);
                    }
                    if (((c3 == true ? 1 : 0) & 1024) == 1024) {
                        this.function_ = Collections.unmodifiableList(this.function_);
                    }
                    if (((c3 == true ? 1 : 0) & 2048) == 2048) {
                        this.property_ = Collections.unmodifiableList(this.property_);
                    }
                    if (((c3 == true ? 1 : 0) & 4096) == 4096) {
                        this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    }
                    if (((c3 == true ? 1 : 0) & PKIFailureInfo.certRevoked) == 8192) {
                        this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                    }
                    if (((c3 == true ? 1 : 0) & 16384) == 16384) {
                        this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                    }
                    if (((c3 == true ? 1 : 0) & 128) == 128) {
                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    }
                    if (((c3 == true ? 1 : 0) & 256) == 256) {
                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if (((c3 == true ? 1 : 0) & PKIFailureInfo.transactionIdInUse) == 262144) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if (((c3 == true ? 1 : 0) & PKIFailureInfo.badCertTemplate) == 1048576) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    if (((c3 == true ? 1 : 0) & 4194304) == 4194304) {
                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            c3 = c3;
                        case 8:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                            z = z3;
                            c3 = c3;
                        case 16:
                            int i = (c3 == true ? 1 : 0) & 32;
                            c3 = c3;
                            if (i != 32) {
                                this.supertypeId_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | ' ';
                            }
                            this.supertypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            z = z3;
                            c3 = c3;
                        case 18:
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            int i2 = (c3 == true ? 1 : 0) & 32;
                            c3 = c3;
                            if (i2 != 32) {
                                c3 = c3;
                                if (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.supertypeId_ = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | ' ';
                                }
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.supertypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                            z = z3;
                            c3 = c3;
                        case 24:
                            this.bitField0_ |= 2;
                            this.fqName_ = codedInputStream.readInt32();
                            z = z3;
                            c3 = c3;
                        case 32:
                            this.bitField0_ |= 4;
                            this.companionObjectName_ = codedInputStream.readInt32();
                            z = z3;
                            c3 = c3;
                        case 42:
                            int i3 = (c3 == true ? 1 : 0) & 8;
                            c3 = c3;
                            if (i3 != 8) {
                                this.typeParameter_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | '\b';
                            }
                            this.typeParameter_.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                            z = z3;
                            c3 = c3;
                        case 50:
                            int i4 = (c3 == true ? 1 : 0) & 16;
                            c3 = c3;
                            if (i4 != 16) {
                                this.supertype_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 16;
                            }
                            this.supertype_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            z = z3;
                            c3 = c3;
                        case 56:
                            int i5 = (c3 == true ? 1 : 0) & 64;
                            c3 = c3;
                            if (i5 != 64) {
                                this.nestedClassName_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | '@';
                            }
                            this.nestedClassName_.add(Integer.valueOf(codedInputStream.readInt32()));
                            z = z3;
                            c3 = c3;
                        case 58:
                            int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            int i6 = (c3 == true ? 1 : 0) & 64;
                            c3 = c3;
                            if (i6 != 64) {
                                c3 = c3;
                                if (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.nestedClassName_ = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | '@';
                                }
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.nestedClassName_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit2);
                            z = z3;
                            c3 = c3;
                        case 66:
                            int i7 = (c3 == true ? 1 : 0) & 512;
                            c3 = c3;
                            if (i7 != 512) {
                                this.constructor_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 512;
                            }
                            this.constructor_.add(codedInputStream.readMessage(Constructor.PARSER, extensionRegistryLite));
                            z = z3;
                            c3 = c3;
                        case 74:
                            int i8 = (c3 == true ? 1 : 0) & 1024;
                            c3 = c3;
                            if (i8 != 1024) {
                                this.function_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 1024;
                            }
                            this.function_.add(codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                            z = z3;
                            c3 = c3;
                        case 82:
                            int i9 = (c3 == true ? 1 : 0) & 2048;
                            c3 = c3;
                            if (i9 != 2048) {
                                this.property_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 2048;
                            }
                            this.property_.add(codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                            z = z3;
                            c3 = c3;
                        case 90:
                            int i10 = (c3 == true ? 1 : 0) & 4096;
                            c3 = c3;
                            if (i10 != 4096) {
                                this.typeAlias_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 4096;
                            }
                            this.typeAlias_.add(codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                            z = z3;
                            c3 = c3;
                        case 106:
                            int i11 = (c3 == true ? 1 : 0) & PKIFailureInfo.certRevoked;
                            c3 = c3;
                            if (i11 != 8192) {
                                this.enumEntry_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 8192;
                            }
                            this.enumEntry_.add(codedInputStream.readMessage(EnumEntry.PARSER, extensionRegistryLite));
                            z = z3;
                            c3 = c3;
                        case 128:
                            int i12 = (c3 == true ? 1 : 0) & 16384;
                            c3 = c3;
                            if (i12 != 16384) {
                                this.sealedSubclassFqName_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 16384;
                            }
                            this.sealedSubclassFqName_.add(Integer.valueOf(codedInputStream.readInt32()));
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                            int pushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            int i13 = (c3 == true ? 1 : 0) & 16384;
                            c3 = c3;
                            if (i13 != 16384) {
                                c3 = c3;
                                if (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.sealedSubclassFqName_ = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 16384;
                                }
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.sealedSubclassFqName_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit3);
                            z = z3;
                            c3 = c3;
                        case 136:
                            this.bitField0_ |= 8;
                            this.inlineClassUnderlyingPropertyName_ = codedInputStream.readInt32();
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                            Type.Builder builder = (this.bitField0_ & 16) == 16 ? this.inlineClassUnderlyingType_.toBuilder() : null;
                            Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.inlineClassUnderlyingType_ = type2;
                            if (builder != null) {
                                builder.mergeFrom(type2);
                                this.inlineClassUnderlyingType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 16;
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                            this.bitField0_ |= 32;
                            this.inlineClassUnderlyingTypeId_ = codedInputStream.readInt32();
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                            int i14 = (c3 == true ? 1 : 0) & 128;
                            c3 = c3;
                            if (i14 != 128) {
                                this.contextReceiverType_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 128;
                            }
                            this.contextReceiverType_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                            int i15 = (c3 == true ? 1 : 0) & 256;
                            c3 = c3;
                            if (i15 != 256) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 256;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                            int pushLimit4 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            int i16 = (c3 == true ? 1 : 0) & 256;
                            c3 = c3;
                            if (i16 != 256) {
                                c3 = c3;
                                if (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 256;
                                }
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit4);
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE:
                            int i17 = (c3 == true ? 1 : 0) & PKIFailureInfo.transactionIdInUse;
                            c3 = c3;
                            if (i17 != 262144) {
                                this.annotation_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 0;
                            }
                            this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                            TypeTable.Builder builder2 = (this.bitField0_ & 64) == 64 ? this.typeTable_.toBuilder() : null;
                            TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                            this.typeTable_ = typeTable;
                            if (builder2 != null) {
                                builder2.mergeFrom(typeTable);
                                this.typeTable_ = builder2.buildPartial();
                            }
                            this.bitField0_ |= 64;
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                            int i18 = (c3 == true ? 1 : 0) & PKIFailureInfo.badCertTemplate;
                            c3 = c3;
                            if (i18 != 1048576) {
                                this.versionRequirement_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 0;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                            int pushLimit5 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            int i19 = (c3 == true ? 1 : 0) & PKIFailureInfo.badCertTemplate;
                            c3 = c3;
                            if (i19 != 1048576) {
                                c3 = c3;
                                if (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 0;
                                }
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit5);
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_HEADER_BOLT_VALUE:
                            VersionRequirementTable.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.versionRequirementTable_.toBuilder() : null;
                            VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                            this.versionRequirementTable_ = versionRequirementTable;
                            if (builder3 != null) {
                                builder3.mergeFrom(versionRequirementTable);
                                this.versionRequirementTable_ = builder3.buildPartial();
                            }
                            this.bitField0_ |= 128;
                            z = z3;
                            c3 = c3;
                        case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                            int i20 = (c3 == true ? 1 : 0) & 4194304;
                            c3 = c3;
                            if (i20 != 4194304) {
                                this.compilerPluginData_ = new ArrayList();
                                c3 = (c3 == true ? 1 : 0) | 0;
                            }
                            c = 0;
                            try {
                                try {
                                    this.compilerPluginData_.add(codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                                    z = z3;
                                    c3 = c3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c2 = c3;
                                    if ((c2 & ' ') == 32) {
                                        this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                                    }
                                    if ((c2 & '\b') == 8) {
                                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                    }
                                    if ((c2 & 16) == 16) {
                                        this.supertype_ = Collections.unmodifiableList(this.supertype_);
                                    }
                                    if ((c2 & '@') == 64) {
                                        this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                                    }
                                    if ((c2 & 512) == 512) {
                                        this.constructor_ = Collections.unmodifiableList(this.constructor_);
                                    }
                                    if ((c2 & 1024) == 1024) {
                                        this.function_ = Collections.unmodifiableList(this.function_);
                                    }
                                    if ((c2 & 2048) == 2048) {
                                        this.property_ = Collections.unmodifiableList(this.property_);
                                    }
                                    if ((c2 & 4096) == 4096) {
                                        this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                                    }
                                    if ((c2 & 8192) == 8192) {
                                        this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                                    }
                                    if ((c2 & 16384) == 16384) {
                                        this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                                    }
                                    if ((c2 & 128) == 128) {
                                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                    }
                                    if ((c2 & 256) == 256) {
                                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                    }
                                    if ((c2 & 0) == 262144) {
                                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                    }
                                    if ((c2 & 0) == 1048576) {
                                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                    }
                                    if ((c2 & c) == c) {
                                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                    }
                                    try {
                                        newInstance.flush();
                                    } catch (IOException unused2) {
                                    } catch (Throwable th3) {
                                        this.unknownFields = newOutput.toByteString();
                                        throw th3;
                                    }
                                    this.unknownFields = newOutput.toByteString();
                                    makeExtensionsImmutable();
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException e) {
                                e = e;
                                throw e.setUnfinishedMessage(this);
                            } catch (IOException e2) {
                                e = e2;
                                throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                            }
                        default:
                            if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                z = z3;
                                c3 = c3;
                            }
                            z2 = z3;
                            z = z3;
                            c3 = c3;
                    }
                } catch (InvalidProtocolBufferException e3) {
                    e = e3;
                } catch (IOException e4) {
                    e = e4;
                } catch (Throwable th4) {
                    th = th4;
                    c = 0;
                    c2 = c3;
                }
            }
        }

        public static Class getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Class r1) {
            return newBuilder().mergeFrom(r1);
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public int getCompanionObjectName() {
            return this.companionObjectName_;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return (CompilerPluginData) this.compilerPluginData_.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public Constructor getConstructor(int i) {
            return (Constructor) this.constructor_.get(i);
        }

        public int getConstructorCount() {
            return this.constructor_.size();
        }

        public List<Constructor> getConstructorList() {
            return this.constructor_;
        }

        public Type getContextReceiverType(int i) {
            return (Type) this.contextReceiverType_.get(i);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        public EnumEntry getEnumEntry(int i) {
            return (EnumEntry) this.enumEntry_.get(i);
        }

        public int getEnumEntryCount() {
            return this.enumEntry_.size();
        }

        public List<EnumEntry> getEnumEntryList() {
            return this.enumEntry_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getFqName() {
            return this.fqName_;
        }

        public Function getFunction(int i) {
            return (Function) this.function_.get(i);
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public List<Function> getFunctionList() {
            return this.function_;
        }

        public int getInlineClassUnderlyingPropertyName() {
            return this.inlineClassUnderlyingPropertyName_;
        }

        public Type getInlineClassUnderlyingType() {
            return this.inlineClassUnderlyingType_;
        }

        public int getInlineClassUnderlyingTypeId() {
            return this.inlineClassUnderlyingTypeId_;
        }

        public List<Integer> getNestedClassNameList() {
            return this.nestedClassName_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Class> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i) {
            return (Property) this.property_.get(i);
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public List<Property> getPropertyList() {
            return this.property_;
        }

        public List<Integer> getSealedSubclassFqNameList() {
            return this.sealedSubclassFqName_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.supertypeId_.size(); i3++) {
                i2 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.supertypeId_.get(i3)).intValue());
            }
            int i4 = computeInt32Size + i2;
            if (!getSupertypeIdList().isEmpty()) {
                i4 = i4 + 1 + CodedOutputStream.computeInt32SizeNoTag(i2);
            }
            this.supertypeIdMemoizedSerializedSize = i2;
            if ((this.bitField0_ & 2) == 2) {
                i4 += CodedOutputStream.computeInt32Size(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i4 += CodedOutputStream.computeInt32Size(4, this.companionObjectName_);
            }
            for (int i5 = 0; i5 < this.typeParameter_.size(); i5++) {
                i4 += CodedOutputStream.computeMessageSize(5, (MessageLite) this.typeParameter_.get(i5));
            }
            for (int i6 = 0; i6 < this.supertype_.size(); i6++) {
                i4 += CodedOutputStream.computeMessageSize(6, (MessageLite) this.supertype_.get(i6));
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.nestedClassName_.size(); i8++) {
                i7 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.nestedClassName_.get(i8)).intValue());
            }
            int i9 = i4 + i7;
            if (!getNestedClassNameList().isEmpty()) {
                i9 = i9 + 1 + CodedOutputStream.computeInt32SizeNoTag(i7);
            }
            this.nestedClassNameMemoizedSerializedSize = i7;
            for (int i10 = 0; i10 < this.constructor_.size(); i10++) {
                i9 += CodedOutputStream.computeMessageSize(8, (MessageLite) this.constructor_.get(i10));
            }
            for (int i11 = 0; i11 < this.function_.size(); i11++) {
                i9 += CodedOutputStream.computeMessageSize(9, (MessageLite) this.function_.get(i11));
            }
            for (int i12 = 0; i12 < this.property_.size(); i12++) {
                i9 += CodedOutputStream.computeMessageSize(10, (MessageLite) this.property_.get(i12));
            }
            for (int i13 = 0; i13 < this.typeAlias_.size(); i13++) {
                i9 += CodedOutputStream.computeMessageSize(11, (MessageLite) this.typeAlias_.get(i13));
            }
            for (int i14 = 0; i14 < this.enumEntry_.size(); i14++) {
                i9 += CodedOutputStream.computeMessageSize(13, (MessageLite) this.enumEntry_.get(i14));
            }
            int i15 = 0;
            for (int i16 = 0; i16 < this.sealedSubclassFqName_.size(); i16++) {
                i15 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.sealedSubclassFqName_.get(i16)).intValue());
            }
            int i17 = i9 + i15;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                i17 = i17 + 2 + CodedOutputStream.computeInt32SizeNoTag(i15);
            }
            this.sealedSubclassFqNameMemoizedSerializedSize = i15;
            if ((this.bitField0_ & 8) == 8) {
                i17 += CodedOutputStream.computeInt32Size(17, this.inlineClassUnderlyingPropertyName_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i17 += CodedOutputStream.computeMessageSize(18, this.inlineClassUnderlyingType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i17 += CodedOutputStream.computeInt32Size(19, this.inlineClassUnderlyingTypeId_);
            }
            for (int i18 = 0; i18 < this.contextReceiverType_.size(); i18++) {
                i17 += CodedOutputStream.computeMessageSize(20, (MessageLite) this.contextReceiverType_.get(i18));
            }
            int i19 = 0;
            for (int i20 = 0; i20 < this.contextReceiverTypeId_.size(); i20++) {
                i19 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.contextReceiverTypeId_.get(i20)).intValue());
            }
            int i21 = i17 + i19;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                i21 = i21 + 2 + CodedOutputStream.computeInt32SizeNoTag(i19);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = i19;
            for (int i22 = 0; i22 < this.annotation_.size(); i22++) {
                i21 += CodedOutputStream.computeMessageSize(25, (MessageLite) this.annotation_.get(i22));
            }
            if ((this.bitField0_ & 64) == 64) {
                i21 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            int i23 = 0;
            for (int i24 = 0; i24 < this.versionRequirement_.size(); i24++) {
                i23 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.versionRequirement_.get(i24)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + i21 + i23;
            if ((this.bitField0_ & 128) == 128) {
                size += CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
            }
            for (int i25 = 0; i25 < this.compilerPluginData_.size(); i25++) {
                size += CodedOutputStream.computeMessageSize(33, (MessageLite) this.compilerPluginData_.get(i25));
            }
            int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
            this.memoizedSerializedSize = size2;
            return size2;
        }

        public Type getSupertype(int i) {
            return (Type) this.supertype_.get(i);
        }

        public int getSupertypeCount() {
            return this.supertype_.size();
        }

        public List<Integer> getSupertypeIdList() {
            return this.supertypeId_;
        }

        public List<Type> getSupertypeList() {
            return this.supertype_;
        }

        public TypeAlias getTypeAlias(int i) {
            return (TypeAlias) this.typeAlias_.get(i);
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public TypeParameter getTypeParameter(int i) {
            return (TypeParameter) this.typeParameter_.get(i);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        public boolean hasCompanionObjectName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasFqName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasInlineClassUnderlyingPropertyName() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasInlineClassUnderlyingType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasInlineClassUnderlyingTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 128) == 128;
        }

        public final void initFields$19() {
            this.flags_ = 6;
            this.fqName_ = 0;
            this.companionObjectName_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.supertype_ = list;
            this.supertypeId_ = list;
            this.nestedClassName_ = list;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.constructor_ = list;
            this.function_ = list;
            this.property_ = list;
            this.typeAlias_ = list;
            this.enumEntry_ = list;
            this.sealedSubclassFqName_ = list;
            this.inlineClassUnderlyingPropertyName_ = 0;
            this.inlineClassUnderlyingType_ = Type.getDefaultInstance();
            this.inlineClassUnderlyingTypeId_ = 0;
            this.annotation_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = list;
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
            this.compilerPluginData_ = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                if (!getSupertype(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
                if (!getContextReceiverType(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getConstructorCount(); i4++) {
                if (!getConstructor(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getFunctionCount(); i5++) {
                if (!getFunction(i5).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getPropertyCount(); i6++) {
                if (!getProperty(i6).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getTypeAliasCount(); i7++) {
                if (!getTypeAlias(i7).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < getEnumEntryCount(); i8++) {
                if (!getEnumEntry(i8).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i9 = 0; i9 < getAnnotationCount(); i9++) {
                if (!getAnnotation(i9).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getCompilerPluginDataCount(); i10++) {
                if (!getCompilerPluginData(i10).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.supertypeIdMemoizedSerializedSize);
            }
            for (int i = 0; i < this.supertypeId_.size(); i++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.supertypeId_.get(i)).intValue());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(4, this.companionObjectName_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.typeParameter_.get(i2));
            }
            for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.supertype_.get(i3));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.nestedClassNameMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.nestedClassName_.get(i4)).intValue());
            }
            for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
                codedOutputStream.writeMessage(8, (MessageLite) this.constructor_.get(i5));
            }
            for (int i6 = 0; i6 < this.function_.size(); i6++) {
                codedOutputStream.writeMessage(9, (MessageLite) this.function_.get(i6));
            }
            for (int i7 = 0; i7 < this.property_.size(); i7++) {
                codedOutputStream.writeMessage(10, (MessageLite) this.property_.get(i7));
            }
            for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
                codedOutputStream.writeMessage(11, (MessageLite) this.typeAlias_.get(i8));
            }
            for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
                codedOutputStream.writeMessage(13, (MessageLite) this.enumEntry_.get(i9));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                codedOutputStream.writeRawVarint32(this.sealedSubclassFqNameMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.sealedSubclassFqName_.get(i10)).intValue());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(17, this.inlineClassUnderlyingPropertyName_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(18, this.inlineClassUnderlyingType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(19, this.inlineClassUnderlyingTypeId_);
            }
            for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
                codedOutputStream.writeMessage(20, (MessageLite) this.contextReceiverType_.get(i11));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
                codedOutputStream.writeRawVarint32(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.contextReceiverTypeId_.get(i12)).intValue());
            }
            for (int i13 = 0; i13 < this.annotation_.size(); i13++) {
                codedOutputStream.writeMessage(25, (MessageLite) this.annotation_.get(i13));
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
                codedOutputStream.writeInt32(31, ((Integer) this.versionRequirement_.get(i14)).intValue());
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(32, this.versionRequirementTable_);
            }
            for (int i15 = 0; i15 < this.compilerPluginData_.size(); i15++) {
                codedOutputStream.writeMessage(33, (MessageLite) this.compilerPluginData_.get(i15));
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
            public List annotation_;
            public int bitField0_;
            public int companionObjectName_;
            public List compilerPluginData_;
            public List constructor_;
            public List contextReceiverTypeId_;
            public List contextReceiverType_;
            public List enumEntry_;
            public int flags_ = 6;
            public int fqName_;
            public List function_;
            public int inlineClassUnderlyingPropertyName_;
            public int inlineClassUnderlyingTypeId_;
            public Type inlineClassUnderlyingType_;
            public List nestedClassName_;
            public List property_;
            public List sealedSubclassFqName_;
            public List supertypeId_;
            public List supertype_;
            public List typeAlias_;
            public List typeParameter_;
            public TypeTable typeTable_;
            public VersionRequirementTable versionRequirementTable_;
            public List versionRequirement_;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.typeParameter_ = list;
                this.supertype_ = list;
                this.supertypeId_ = list;
                this.nestedClassName_ = list;
                this.contextReceiverType_ = list;
                this.contextReceiverTypeId_ = list;
                this.constructor_ = list;
                this.function_ = list;
                this.property_ = list;
                this.typeAlias_ = list;
                this.enumEntry_ = list;
                this.sealedSubclassFqName_ = list;
                this.inlineClassUnderlyingType_ = Type.getDefaultInstance();
                this.annotation_ = list;
                this.typeTable_ = TypeTable.getDefaultInstance();
                this.versionRequirement_ = list;
                this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
                this.compilerPluginData_ = list;
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & PKIFailureInfo.transactionIdInUse) != 262144) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= PKIFailureInfo.transactionIdInUse;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.annotation_);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Class build() {
                Class buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public Class buildPartial() {
                Class r0 = new Class(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                r0.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                r0.fqName_ = this.fqName_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                r0.companionObjectName_ = this.companionObjectName_;
                if ((i & 8) == 8) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -9;
                }
                r0.typeParameter_ = this.typeParameter_;
                if ((this.bitField0_ & 16) == 16) {
                    this.supertype_ = Collections.unmodifiableList(this.supertype_);
                    this.bitField0_ &= -17;
                }
                r0.supertype_ = this.supertype_;
                if ((this.bitField0_ & 32) == 32) {
                    this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                    this.bitField0_ &= -33;
                }
                r0.supertypeId_ = this.supertypeId_;
                if ((this.bitField0_ & 64) == 64) {
                    this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                    this.bitField0_ &= -65;
                }
                r0.nestedClassName_ = this.nestedClassName_;
                if ((this.bitField0_ & 128) == 128) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    this.bitField0_ &= -129;
                }
                r0.contextReceiverType_ = this.contextReceiverType_;
                if ((this.bitField0_ & 256) == 256) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    this.bitField0_ &= -257;
                }
                r0.contextReceiverTypeId_ = this.contextReceiverTypeId_;
                if ((this.bitField0_ & 512) == 512) {
                    this.constructor_ = Collections.unmodifiableList(this.constructor_);
                    this.bitField0_ &= -513;
                }
                r0.constructor_ = this.constructor_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -1025;
                }
                r0.function_ = this.function_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -2049;
                }
                r0.property_ = this.property_;
                if ((this.bitField0_ & 4096) == 4096) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -4097;
                }
                r0.typeAlias_ = this.typeAlias_;
                if ((this.bitField0_ & PKIFailureInfo.certRevoked) == 8192) {
                    this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                    this.bitField0_ &= -8193;
                }
                r0.enumEntry_ = this.enumEntry_;
                if ((this.bitField0_ & 16384) == 16384) {
                    this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                    this.bitField0_ &= -16385;
                }
                r0.sealedSubclassFqName_ = this.sealedSubclassFqName_;
                if ((i & 32768) == 32768) {
                    i2 |= 8;
                }
                r0.inlineClassUnderlyingPropertyName_ = this.inlineClassUnderlyingPropertyName_;
                if ((i & 65536) == 65536) {
                    i2 |= 16;
                }
                r0.inlineClassUnderlyingType_ = this.inlineClassUnderlyingType_;
                if ((i & PKIFailureInfo.unsupportedVersion) == 131072) {
                    i2 |= 32;
                }
                r0.inlineClassUnderlyingTypeId_ = this.inlineClassUnderlyingTypeId_;
                if ((this.bitField0_ & PKIFailureInfo.transactionIdInUse) == 262144) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -262145;
                }
                r0.annotation_ = this.annotation_;
                if ((i & PKIFailureInfo.signerNotTrusted) == 524288) {
                    i2 |= 64;
                }
                r0.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & PKIFailureInfo.badCertTemplate) == 1048576) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -1048577;
                }
                r0.versionRequirement_ = this.versionRequirement_;
                if ((i & PKIFailureInfo.badSenderNonce) == 2097152) {
                    i2 |= 128;
                }
                r0.versionRequirementTable_ = this.versionRequirementTable_;
                if ((this.bitField0_ & 4194304) == 4194304) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    this.bitField0_ &= -4194305;
                }
                r0.compilerPluginData_ = this.compilerPluginData_;
                r0.bitField0_ = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.annotation_.get(i);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public CompilerPluginData getCompilerPluginData(int i) {
                return (CompilerPluginData) this.compilerPluginData_.get(i);
            }

            public int getCompilerPluginDataCount() {
                return this.compilerPluginData_.size();
            }

            public Constructor getConstructor(int i) {
                return (Constructor) this.constructor_.get(i);
            }

            public int getConstructorCount() {
                return this.constructor_.size();
            }

            public Type getContextReceiverType(int i) {
                return (Type) this.contextReceiverType_.get(i);
            }

            public int getContextReceiverTypeCount() {
                return this.contextReceiverType_.size();
            }

            public EnumEntry getEnumEntry(int i) {
                return (EnumEntry) this.enumEntry_.get(i);
            }

            public int getEnumEntryCount() {
                return this.enumEntry_.size();
            }

            public Function getFunction(int i) {
                return (Function) this.function_.get(i);
            }

            public int getFunctionCount() {
                return this.function_.size();
            }

            public Type getInlineClassUnderlyingType() {
                return this.inlineClassUnderlyingType_;
            }

            public Property getProperty(int i) {
                return (Property) this.property_.get(i);
            }

            public int getPropertyCount() {
                return this.property_.size();
            }

            public Type getSupertype(int i) {
                return (Type) this.supertype_.get(i);
            }

            public int getSupertypeCount() {
                return this.supertype_.size();
            }

            public TypeAlias getTypeAlias(int i) {
                return (TypeAlias) this.typeAlias_.get(i);
            }

            public int getTypeAliasCount() {
                return this.typeAlias_.size();
            }

            public TypeParameter getTypeParameter(int i) {
                return (TypeParameter) this.typeParameter_.get(i);
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public boolean hasFqName() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasInlineClassUnderlyingType() {
                return (this.bitField0_ & 65536) == 65536;
            }

            public boolean hasTypeTable() {
                return (this.bitField0_ & PKIFailureInfo.signerNotTrusted) == 524288;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                    if (!getSupertype(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
                    if (!getContextReceiverType(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < getConstructorCount(); i4++) {
                    if (!getConstructor(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getFunctionCount(); i5++) {
                    if (!getFunction(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getPropertyCount(); i6++) {
                    if (!getProperty(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < getTypeAliasCount(); i7++) {
                    if (!getTypeAlias(i7).isInitialized()) {
                        return false;
                    }
                }
                for (int i8 = 0; i8 < getEnumEntryCount(); i8++) {
                    if (!getEnumEntry(i8).isInitialized()) {
                        return false;
                    }
                }
                if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                    return false;
                }
                for (int i9 = 0; i9 < getAnnotationCount(); i9++) {
                    if (!getAnnotation(i9).isInitialized()) {
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < getCompilerPluginDataCount(); i10++) {
                    if (!getCompilerPluginData(i10).isInitialized()) {
                        return false;
                    }
                }
                return this.extensions.isInitialized();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Class r4) {
                if (r4 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r4.hasFlags()) {
                    setFlags(r4.getFlags());
                }
                if (r4.hasFqName()) {
                    setFqName(r4.getFqName());
                }
                if (r4.hasCompanionObjectName()) {
                    setCompanionObjectName(r4.getCompanionObjectName());
                }
                if (!r4.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = r4.typeParameter_;
                        this.bitField0_ &= -9;
                    } else {
                        if ((this.bitField0_ & 8) != 8) {
                            this.typeParameter_ = new ArrayList(this.typeParameter_);
                            this.bitField0_ |= 8;
                        }
                        this.typeParameter_.addAll(r4.typeParameter_);
                    }
                }
                if (!r4.supertype_.isEmpty()) {
                    if (this.supertype_.isEmpty()) {
                        this.supertype_ = r4.supertype_;
                        this.bitField0_ &= -17;
                    } else {
                        if ((this.bitField0_ & 16) != 16) {
                            this.supertype_ = new ArrayList(this.supertype_);
                            this.bitField0_ |= 16;
                        }
                        this.supertype_.addAll(r4.supertype_);
                    }
                }
                if (!r4.supertypeId_.isEmpty()) {
                    if (this.supertypeId_.isEmpty()) {
                        this.supertypeId_ = r4.supertypeId_;
                        this.bitField0_ &= -33;
                    } else {
                        if ((this.bitField0_ & 32) != 32) {
                            this.supertypeId_ = new ArrayList(this.supertypeId_);
                            this.bitField0_ |= 32;
                        }
                        this.supertypeId_.addAll(r4.supertypeId_);
                    }
                }
                if (!r4.nestedClassName_.isEmpty()) {
                    if (this.nestedClassName_.isEmpty()) {
                        this.nestedClassName_ = r4.nestedClassName_;
                        this.bitField0_ &= -65;
                    } else {
                        if ((this.bitField0_ & 64) != 64) {
                            this.nestedClassName_ = new ArrayList(this.nestedClassName_);
                            this.bitField0_ |= 64;
                        }
                        this.nestedClassName_.addAll(r4.nestedClassName_);
                    }
                }
                if (!r4.contextReceiverType_.isEmpty()) {
                    if (this.contextReceiverType_.isEmpty()) {
                        this.contextReceiverType_ = r4.contextReceiverType_;
                        this.bitField0_ &= -129;
                    } else {
                        if ((this.bitField0_ & 128) != 128) {
                            this.contextReceiverType_ = new ArrayList(this.contextReceiverType_);
                            this.bitField0_ |= 128;
                        }
                        this.contextReceiverType_.addAll(r4.contextReceiverType_);
                    }
                }
                if (!r4.contextReceiverTypeId_.isEmpty()) {
                    if (this.contextReceiverTypeId_.isEmpty()) {
                        this.contextReceiverTypeId_ = r4.contextReceiverTypeId_;
                        this.bitField0_ &= -257;
                    } else {
                        if ((this.bitField0_ & 256) != 256) {
                            this.contextReceiverTypeId_ = new ArrayList(this.contextReceiverTypeId_);
                            this.bitField0_ |= 256;
                        }
                        this.contextReceiverTypeId_.addAll(r4.contextReceiverTypeId_);
                    }
                }
                if (!r4.constructor_.isEmpty()) {
                    if (this.constructor_.isEmpty()) {
                        this.constructor_ = r4.constructor_;
                        this.bitField0_ &= -513;
                    } else {
                        if ((this.bitField0_ & 512) != 512) {
                            this.constructor_ = new ArrayList(this.constructor_);
                            this.bitField0_ |= 512;
                        }
                        this.constructor_.addAll(r4.constructor_);
                    }
                }
                if (!r4.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = r4.function_;
                        this.bitField0_ &= -1025;
                    } else {
                        if ((this.bitField0_ & 1024) != 1024) {
                            this.function_ = new ArrayList(this.function_);
                            this.bitField0_ |= 1024;
                        }
                        this.function_.addAll(r4.function_);
                    }
                }
                if (!r4.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = r4.property_;
                        this.bitField0_ &= -2049;
                    } else {
                        if ((this.bitField0_ & 2048) != 2048) {
                            this.property_ = new ArrayList(this.property_);
                            this.bitField0_ |= 2048;
                        }
                        this.property_.addAll(r4.property_);
                    }
                }
                if (!r4.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = r4.typeAlias_;
                        this.bitField0_ &= -4097;
                    } else {
                        if ((this.bitField0_ & 4096) != 4096) {
                            this.typeAlias_ = new ArrayList(this.typeAlias_);
                            this.bitField0_ |= 4096;
                        }
                        this.typeAlias_.addAll(r4.typeAlias_);
                    }
                }
                if (!r4.enumEntry_.isEmpty()) {
                    if (this.enumEntry_.isEmpty()) {
                        this.enumEntry_ = r4.enumEntry_;
                        this.bitField0_ &= -8193;
                    } else {
                        if ((this.bitField0_ & PKIFailureInfo.certRevoked) != 8192) {
                            this.enumEntry_ = new ArrayList(this.enumEntry_);
                            this.bitField0_ |= PKIFailureInfo.certRevoked;
                        }
                        this.enumEntry_.addAll(r4.enumEntry_);
                    }
                }
                if (!r4.sealedSubclassFqName_.isEmpty()) {
                    if (this.sealedSubclassFqName_.isEmpty()) {
                        this.sealedSubclassFqName_ = r4.sealedSubclassFqName_;
                        this.bitField0_ &= -16385;
                    } else {
                        if ((this.bitField0_ & 16384) != 16384) {
                            this.sealedSubclassFqName_ = new ArrayList(this.sealedSubclassFqName_);
                            this.bitField0_ |= 16384;
                        }
                        this.sealedSubclassFqName_.addAll(r4.sealedSubclassFqName_);
                    }
                }
                if (r4.hasInlineClassUnderlyingPropertyName()) {
                    setInlineClassUnderlyingPropertyName(r4.getInlineClassUnderlyingPropertyName());
                }
                if (r4.hasInlineClassUnderlyingType()) {
                    mergeInlineClassUnderlyingType(r4.getInlineClassUnderlyingType());
                }
                if (r4.hasInlineClassUnderlyingTypeId()) {
                    setInlineClassUnderlyingTypeId(r4.getInlineClassUnderlyingTypeId());
                }
                if (!r4.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = r4.annotation_;
                        this.bitField0_ &= -262145;
                    } else {
                        if ((this.bitField0_ & PKIFailureInfo.transactionIdInUse) != 262144) {
                            this.annotation_ = new ArrayList(this.annotation_);
                            this.bitField0_ |= PKIFailureInfo.transactionIdInUse;
                        }
                        this.annotation_.addAll(r4.annotation_);
                    }
                }
                if (r4.hasTypeTable()) {
                    mergeTypeTable(r4.getTypeTable());
                }
                if (!r4.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = r4.versionRequirement_;
                        this.bitField0_ &= -1048577;
                    } else {
                        if ((this.bitField0_ & PKIFailureInfo.badCertTemplate) != 1048576) {
                            this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                            this.bitField0_ |= PKIFailureInfo.badCertTemplate;
                        }
                        this.versionRequirement_.addAll(r4.versionRequirement_);
                    }
                }
                if (r4.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r4.getVersionRequirementTable());
                }
                if (!r4.compilerPluginData_.isEmpty()) {
                    if (this.compilerPluginData_.isEmpty()) {
                        this.compilerPluginData_ = r4.compilerPluginData_;
                        this.bitField0_ &= -4194305;
                    } else {
                        if ((this.bitField0_ & 4194304) != 4194304) {
                            this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
                            this.bitField0_ |= 4194304;
                        }
                        this.compilerPluginData_.addAll(r4.compilerPluginData_);
                    }
                }
                mergeExtensionFields(r4);
                setUnknownFields(getUnknownFields().concat(r4.unknownFields));
                return this;
            }

            public Builder mergeInlineClassUnderlyingType(Type type2) {
                if ((this.bitField0_ & 65536) != 65536 || this.inlineClassUnderlyingType_ == Type.getDefaultInstance()) {
                    this.inlineClassUnderlyingType_ = type2;
                } else {
                    this.inlineClassUnderlyingType_ = Type.newBuilder(this.inlineClassUnderlyingType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 65536;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & PKIFailureInfo.signerNotTrusted) != 524288 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= PKIFailureInfo.signerNotTrusted;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & PKIFailureInfo.badSenderNonce) != 2097152 || this.versionRequirementTable_ == VersionRequirementTable.getDefaultInstance()) {
                    this.versionRequirementTable_ = versionRequirementTable;
                } else {
                    this.versionRequirementTable_ = VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.bitField0_ |= PKIFailureInfo.badSenderNonce;
                return this;
            }

            public Builder setCompanionObjectName(int i) {
                this.bitField0_ |= 4;
                this.companionObjectName_ = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setFqName(int i) {
                this.bitField0_ |= 2;
                this.fqName_ = i;
                return this;
            }

            public Builder setInlineClassUnderlyingPropertyName(int i) {
                this.bitField0_ |= 32768;
                this.inlineClassUnderlyingPropertyName_ = i;
                return this;
            }

            public Builder setInlineClassUnderlyingTypeId(int i) {
                this.bitField0_ |= PKIFailureInfo.unsupportedVersion;
                this.inlineClassUnderlyingTypeId_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Class r0 = null;
                try {
                    try {
                        Class parsePartialFrom = Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Class r4 = (Class) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                mergeFrom(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Class getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Class() {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public Class(Builder builder) {
            super(builder);
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class CompilerPluginData extends GeneratedMessageLite implements CompilerPluginDataOrBuilder {
        public static Parser<CompilerPluginData> PARSER = new AnonymousClass1();
        public static final CompilerPluginData defaultInstance;
        public int bitField0_;
        public ByteString data_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public int pluginId_;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new CompilerPluginData(codedInputStream);
            }
        }

        static {
            CompilerPluginData compilerPluginData = new CompilerPluginData();
            defaultInstance = compilerPluginData;
            compilerPluginData.pluginId_ = 0;
            compilerPluginData.data_ = ByteString.EMPTY;
        }

        public CompilerPluginData(CodedInputStream codedInputStream) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.pluginId_ = 0;
            this.data_ = ByteString.EMPTY;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.bitField0_ |= 1;
                                    this.pluginId_ = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    this.bitField0_ |= 2;
                                    this.data_ = codedInputStream.readBytes();
                                } else if (!codedInputStream.skipField(readTag, newInstance)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    throw th;
                }
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
        }

        public static CompilerPluginData getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(CompilerPluginData compilerPluginData) {
            return newBuilder().mergeFrom(compilerPluginData);
        }

        public ByteString getData() {
            return this.data_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<CompilerPluginData> getParserForType() {
            return PARSER;
        }

        public int getPluginId() {
            return this.pluginId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.pluginId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeBytesSize(2, this.data_);
            }
            int size = this.unknownFields.size() + computeInt32Size;
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasData() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasPluginId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasPluginId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasData()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.pluginId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.data_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<CompilerPluginData, Builder> implements CompilerPluginDataOrBuilder {
            public int bitField0_;
            public ByteString data_ = ByteString.EMPTY;
            public int pluginId_;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public CompilerPluginData build() {
                CompilerPluginData buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public CompilerPluginData buildPartial() {
                CompilerPluginData compilerPluginData = new CompilerPluginData(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                compilerPluginData.pluginId_ = this.pluginId_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                compilerPluginData.data_ = this.data_;
                compilerPluginData.bitField0_ = i2;
                return compilerPluginData;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public boolean hasData() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasPluginId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPluginId() && hasData();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(CompilerPluginData compilerPluginData) {
                if (compilerPluginData == CompilerPluginData.getDefaultInstance()) {
                    return this;
                }
                if (compilerPluginData.hasPluginId()) {
                    setPluginId(compilerPluginData.getPluginId());
                }
                if (compilerPluginData.hasData()) {
                    setData(compilerPluginData.getData());
                }
                setUnknownFields(getUnknownFields().concat(compilerPluginData.unknownFields));
                return this;
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.data_ = byteString;
                return this;
            }

            public Builder setPluginId(int i) {
                this.bitField0_ |= 1;
                this.pluginId_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public CompilerPluginData getDefaultInstanceForType() {
                return CompilerPluginData.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                CompilerPluginData compilerPluginData = null;
                try {
                    try {
                        CompilerPluginData parsePartialFrom = CompilerPluginData.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        CompilerPluginData compilerPluginData2 = (CompilerPluginData) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            compilerPluginData = compilerPluginData2;
                            if (compilerPluginData != null) {
                                mergeFrom(compilerPluginData);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (compilerPluginData != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public CompilerPluginData getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public CompilerPluginData() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public CompilerPluginData(Builder builder) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new AnonymousClass1();
        public static final Constructor defaultInstance;
        public List annotation_;
        public int bitField0_;
        public List compilerPluginData_;
        public int flags_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public final ByteString unknownFields;
        public List valueParameter_;
        public List versionRequirement_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Constructor constructor = new Constructor();
            defaultInstance = constructor;
            constructor.flags_ = 6;
            List list = Collections.EMPTY_LIST;
            constructor.valueParameter_ = list;
            constructor.versionRequirement_ = list;
            constructor.compilerPluginData_ = list;
            constructor.annotation_ = list;
        }

        public Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.flags_ = 6;
            List list = Collections.EMPTY_LIST;
            this.valueParameter_ = list;
            this.versionRequirement_ = list;
            this.compilerPluginData_ = list;
            this.annotation_ = list;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                            } else if (readTag == 18) {
                                if ((i & 2) != 2) {
                                    this.valueParameter_ = new ArrayList();
                                    i |= 2;
                                }
                                this.valueParameter_.add(codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                            } else if (readTag == 26) {
                                if ((i & 16) != 16) {
                                    this.annotation_ = new ArrayList();
                                    i |= 16;
                                }
                                this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            } else if (readTag == 248) {
                                if ((i & 4) != 4) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (readTag == 250) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 258) {
                                if ((i & 8) != 8) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 8;
                                }
                                this.compilerPluginData_.add(codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i & 2) == 2) {
                            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                        }
                        if ((i & 16) == 16) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                        }
                        if ((i & 4) == 4) {
                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                        }
                        if ((i & 8) == 8) {
                            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i & 2) == 2) {
                this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
            }
            if ((i & 16) == 16) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            if ((i & 4) == 4) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            if ((i & 8) == 8) {
                this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        public static Constructor getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return (CompilerPluginData) this.compilerPluginData_.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public int getFlags() {
            return this.flags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Constructor> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.valueParameter_.get(i2));
            }
            for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.annotation_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
                i4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.versionRequirement_.get(i5)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + computeInt32Size + i4;
            for (int i6 = 0; i6 < this.compilerPluginData_.size(); i6++) {
                size += CodedOutputStream.computeMessageSize(32, (MessageLite) this.compilerPluginData_.get(i6));
            }
            int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
            this.memoizedSerializedSize = size2;
            return size2;
        }

        public ValueParameter getValueParameter(int i) {
            return (ValueParameter) this.valueParameter_.get(i);
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getValueParameterCount(); i++) {
                if (!getValueParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getCompilerPluginDataCount(); i2++) {
                if (!getCompilerPluginData(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getAnnotationCount(); i3++) {
                if (!getAnnotation(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            for (int i = 0; i < this.valueParameter_.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.valueParameter_.get(i));
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.annotation_.get(i2));
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.writeInt32(31, ((Integer) this.versionRequirement_.get(i3)).intValue());
            }
            for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
                codedOutputStream.writeMessage(32, (MessageLite) this.compilerPluginData_.get(i4));
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {
            public List annotation_;
            public int bitField0_;
            public List compilerPluginData_;
            public int flags_ = 6;
            public List valueParameter_;
            public List versionRequirement_;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.valueParameter_ = list;
                this.versionRequirement_ = list;
                this.compilerPluginData_ = list;
                this.annotation_ = list;
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & 16) != 16) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 16;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.annotation_);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Constructor build() {
                Constructor buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public Constructor buildPartial() {
                Constructor constructor = new Constructor(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                constructor.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -3;
                }
                constructor.valueParameter_ = this.valueParameter_;
                if ((this.bitField0_ & 4) == 4) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -5;
                }
                constructor.versionRequirement_ = this.versionRequirement_;
                if ((this.bitField0_ & 8) == 8) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    this.bitField0_ &= -9;
                }
                constructor.compilerPluginData_ = this.compilerPluginData_;
                if ((this.bitField0_ & 16) == 16) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -17;
                }
                constructor.annotation_ = this.annotation_;
                constructor.bitField0_ = i2;
                return constructor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.annotation_.get(i);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public CompilerPluginData getCompilerPluginData(int i) {
                return (CompilerPluginData) this.compilerPluginData_.get(i);
            }

            public int getCompilerPluginDataCount() {
                return this.compilerPluginData_.size();
            }

            public ValueParameter getValueParameter(int i) {
                return (ValueParameter) this.valueParameter_.get(i);
            }

            public int getValueParameterCount() {
                return this.valueParameter_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getValueParameterCount(); i++) {
                    if (!getValueParameter(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getCompilerPluginDataCount(); i2++) {
                    if (!getCompilerPluginData(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getAnnotationCount(); i3++) {
                    if (!getAnnotation(i3).isInitialized()) {
                        return false;
                    }
                }
                return this.extensions.isInitialized();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = constructor.valueParameter_;
                        this.bitField0_ &= -3;
                    } else {
                        if ((this.bitField0_ & 2) != 2) {
                            this.valueParameter_ = new ArrayList(this.valueParameter_);
                            this.bitField0_ |= 2;
                        }
                        this.valueParameter_.addAll(constructor.valueParameter_);
                    }
                }
                if (!constructor.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = constructor.versionRequirement_;
                        this.bitField0_ &= -5;
                    } else {
                        if ((this.bitField0_ & 4) != 4) {
                            this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                            this.bitField0_ |= 4;
                        }
                        this.versionRequirement_.addAll(constructor.versionRequirement_);
                    }
                }
                if (!constructor.compilerPluginData_.isEmpty()) {
                    if (this.compilerPluginData_.isEmpty()) {
                        this.compilerPluginData_ = constructor.compilerPluginData_;
                        this.bitField0_ &= -9;
                    } else {
                        if ((this.bitField0_ & 8) != 8) {
                            this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
                            this.bitField0_ |= 8;
                        }
                        this.compilerPluginData_.addAll(constructor.compilerPluginData_);
                    }
                }
                if (!constructor.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = constructor.annotation_;
                        this.bitField0_ &= -17;
                    } else {
                        if ((this.bitField0_ & 16) != 16) {
                            this.annotation_ = new ArrayList(this.annotation_);
                            this.bitField0_ |= 16;
                        }
                        this.annotation_.addAll(constructor.annotation_);
                    }
                }
                mergeExtensionFields(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.unknownFields));
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Constructor constructor = null;
                try {
                    try {
                        Constructor parsePartialFrom = Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Constructor constructor2 = (Constructor) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            constructor = constructor2;
                            if (constructor != null) {
                                mergeFrom(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (constructor != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Constructor getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Constructor() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public Constructor(Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new AnonymousClass1();
        public static final Contract defaultInstance;
        public List effect_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Contract contract = new Contract();
            defaultInstance = contract;
            contract.effect_ = Collections.EMPTY_LIST;
        }

        public Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.effect_ = Collections.EMPTY_LIST;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!z2) {
                                    this.effect_ = new ArrayList();
                                    z2 = true;
                                }
                                this.effect_.add(codedInputStream.readMessage(Effect.PARSER, extensionRegistryLite));
                            } else if (!codedInputStream.skipField(readTag, newInstance)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2) {
                            this.effect_ = Collections.unmodifiableList(this.effect_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2) {
                this.effect_ = Collections.unmodifiableList(this.effect_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
        }

        public static Contract getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        public Effect getEffect(int i) {
            return (Effect) this.effect_.get(i);
        }

        public int getEffectCount() {
            return this.effect_.size();
        }

        public List<Effect> getEffectList() {
            return this.effect_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Contract> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.effect_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.effect_.get(i3));
            }
            int size = this.unknownFields.size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectCount(); i++) {
                if (!getEffect(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.effect_.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.effect_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {
            public int bitField0_;
            public List effect_ = Collections.EMPTY_LIST;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Contract build() {
                Contract buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public Contract buildPartial() {
                Contract contract = new Contract(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.effect_ = Collections.unmodifiableList(this.effect_);
                    this.bitField0_ &= -2;
                }
                contract.effect_ = this.effect_;
                return contract;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Effect getEffect(int i) {
                return (Effect) this.effect_.get(i);
            }

            public int getEffectCount() {
                return this.effect_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectCount(); i++) {
                    if (!getEffect(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.effect_.isEmpty()) {
                    if (this.effect_.isEmpty()) {
                        this.effect_ = contract.effect_;
                        this.bitField0_ &= -2;
                    } else {
                        if ((this.bitField0_ & 1) != 1) {
                            this.effect_ = new ArrayList(this.effect_);
                            this.bitField0_ |= 1;
                        }
                        this.effect_.addAll(contract.effect_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Contract contract = null;
                try {
                    try {
                        Contract parsePartialFrom = Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Contract contract2 = (Contract) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            contract = contract2;
                            if (contract != null) {
                                mergeFrom(contract);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (contract != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Contract getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Contract() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public Contract(Builder builder) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new AnonymousClass1();
        public static final Effect defaultInstance;
        public int bitField0_;
        public Expression conclusionOfConditionalEffect_;
        public EffectConditionKind conditionKind_;
        public List effectConstructorArgument_;
        public EffectType effectType_;
        public InvocationKind kind_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        }

        public enum EffectConditionKind implements Internal.EnumLite {
            CONCLUSION_CONDITION(0),
            RETURNS_CONDITION(1),
            HOLDSIN_CONDITION(2);

            public final int value;

            EffectConditionKind(int i) {
                this.value = i;
            }

            public static EffectConditionKind valueOf(int i) {
                if (i == 0) {
                    return CONCLUSION_CONDITION;
                }
                if (i == 1) {
                    return RETURNS_CONDITION;
                }
                if (i != 2) {
                    return null;
                }
                return HOLDSIN_CONDITION;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);

            public final int value;

            EffectType(int i) {
                this.value = i;
            }

            public static EffectType valueOf(int i) {
                if (i == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i == 1) {
                    return CALLS;
                }
                if (i != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);

            public final int value;

            InvocationKind(int i) {
                this.value = i;
            }

            public static InvocationKind valueOf(int i) {
                if (i == 0) {
                    return AT_MOST_ONCE;
                }
                if (i == 1) {
                    return EXACTLY_ONCE;
                }
                if (i != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Effect effect = new Effect();
            defaultInstance = effect;
            effect.effectType_ = EffectType.RETURNS_CONSTANT;
            effect.effectConstructorArgument_ = Collections.EMPTY_LIST;
            effect.conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            effect.kind_ = InvocationKind.AT_MOST_ONCE;
            effect.conditionKind_ = EffectConditionKind.CONCLUSION_CONDITION;
        }

        public Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.effectType_ = EffectType.RETURNS_CONSTANT;
            this.effectConstructorArgument_ = Collections.EMPTY_LIST;
            this.conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            this.kind_ = InvocationKind.AT_MOST_ONCE;
            this.conditionKind_ = EffectConditionKind.CONCLUSION_CONDITION;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                int readEnum = codedInputStream.readEnum();
                                EffectType valueOf = EffectType.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.effectType_ = valueOf;
                                }
                            } else if (readTag == 18) {
                                if ((c & 2) != 2) {
                                    this.effectConstructorArgument_ = new ArrayList();
                                    c = 2;
                                }
                                this.effectConstructorArgument_.add(codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite));
                            } else if (readTag == 26) {
                                Expression.Builder builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                                Expression expression = (Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite);
                                this.conclusionOfConditionalEffect_ = expression;
                                if (builder != null) {
                                    builder.mergeFrom(expression);
                                    this.conclusionOfConditionalEffect_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (readTag == 32) {
                                int readEnum2 = codedInputStream.readEnum();
                                InvocationKind valueOf2 = InvocationKind.valueOf(readEnum2);
                                if (valueOf2 == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum2);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = valueOf2;
                                }
                            } else if (readTag == 40) {
                                int readEnum3 = codedInputStream.readEnum();
                                EffectConditionKind valueOf3 = EffectConditionKind.valueOf(readEnum3);
                                if (valueOf3 == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum3);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.conditionKind_ = valueOf3;
                                }
                            } else if (!codedInputStream.skipField(readTag, newInstance)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((c & 2) == 2) {
                            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((c & 2) == 2) {
                this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
        }

        public static Effect getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.conclusionOfConditionalEffect_;
        }

        public EffectConditionKind getConditionKind() {
            return this.conditionKind_;
        }

        public Expression getEffectConstructorArgument(int i) {
            return (Expression) this.effectConstructorArgument_.get(i);
        }

        public int getEffectConstructorArgumentCount() {
            return this.effectConstructorArgument_.size();
        }

        public List<Expression> getEffectConstructorArgumentList() {
            return this.effectConstructorArgument_;
        }

        public EffectType getEffectType() {
            return this.effectType_;
        }

        public InvocationKind getKind() {
            return this.kind_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Effect> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.effectType_.getNumber()) : 0;
            for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
                computeEnumSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.effectConstructorArgument_.get(i2));
            }
            if ((this.bitField0_ & 2) == 2) {
                computeEnumSize += CodedOutputStream.computeMessageSize(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeEnumSize += CodedOutputStream.computeEnumSize(4, this.kind_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                computeEnumSize += CodedOutputStream.computeEnumSize(5, this.conditionKind_.getNumber());
            }
            int size = this.unknownFields.size() + computeEnumSize;
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasConditionKind() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasEffectType() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasKind() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                if (!getEffectConstructorArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.effectType_.getNumber());
            }
            for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.effectConstructorArgument_.get(i));
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(4, this.kind_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeEnum(5, this.conditionKind_.getNumber());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {
            public int bitField0_;
            public EffectType effectType_ = EffectType.RETURNS_CONSTANT;
            public List effectConstructorArgument_ = Collections.EMPTY_LIST;
            public Expression conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            public InvocationKind kind_ = InvocationKind.AT_MOST_ONCE;
            public EffectConditionKind conditionKind_ = EffectConditionKind.CONCLUSION_CONDITION;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Effect build() {
                Effect buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public Effect buildPartial() {
                Effect effect = new Effect(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                effect.effectType_ = this.effectType_;
                if ((i & 2) == 2) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                    this.bitField0_ &= -3;
                }
                effect.effectConstructorArgument_ = this.effectConstructorArgument_;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.conclusionOfConditionalEffect_ = this.conclusionOfConditionalEffect_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.kind_ = this.kind_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                effect.conditionKind_ = this.conditionKind_;
                effect.bitField0_ = i2;
                return effect;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Expression getConclusionOfConditionalEffect() {
                return this.conclusionOfConditionalEffect_;
            }

            public Expression getEffectConstructorArgument(int i) {
                return (Expression) this.effectConstructorArgument_.get(i);
            }

            public int getEffectConstructorArgumentCount() {
                return this.effectConstructorArgument_.size();
            }

            public boolean hasConclusionOfConditionalEffect() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                    if (!getEffectConstructorArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return !hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized();
            }

            public Builder mergeConclusionOfConditionalEffect(Expression expression) {
                if ((this.bitField0_ & 4) != 4 || this.conclusionOfConditionalEffect_ == Expression.getDefaultInstance()) {
                    this.conclusionOfConditionalEffect_ = expression;
                } else {
                    this.conclusionOfConditionalEffect_ = Expression.newBuilder(this.conclusionOfConditionalEffect_).mergeFrom(expression).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.effectConstructorArgument_.isEmpty()) {
                    if (this.effectConstructorArgument_.isEmpty()) {
                        this.effectConstructorArgument_ = effect.effectConstructorArgument_;
                        this.bitField0_ &= -3;
                    } else {
                        if ((this.bitField0_ & 2) != 2) {
                            this.effectConstructorArgument_ = new ArrayList(this.effectConstructorArgument_);
                            this.bitField0_ |= 2;
                        }
                        this.effectConstructorArgument_.addAll(effect.effectConstructorArgument_);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                if (effect.hasConditionKind()) {
                    setConditionKind(effect.getConditionKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.unknownFields));
                return this;
            }

            public Builder setConditionKind(EffectConditionKind effectConditionKind) {
                effectConditionKind.getClass();
                this.bitField0_ |= 16;
                this.conditionKind_ = effectConditionKind;
                return this;
            }

            public Builder setEffectType(EffectType effectType) {
                effectType.getClass();
                this.bitField0_ |= 1;
                this.effectType_ = effectType;
                return this;
            }

            public Builder setKind(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.bitField0_ |= 8;
                this.kind_ = invocationKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Effect effect = null;
                try {
                    try {
                        Effect parsePartialFrom = Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Effect effect2 = (Effect) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            effect = effect2;
                            if (effect != null) {
                                mergeFrom(effect);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (effect != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Effect getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Effect() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public Effect(Builder builder) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new AnonymousClass1();
        public static final EnumEntry defaultInstance;
        public List annotation_;
        public int bitField0_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public int name_;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry();
            defaultInstance = enumEntry;
            enumEntry.name_ = 0;
            enumEntry.annotation_ = Collections.EMPTY_LIST;
        }

        public EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.name_ = 0;
            this.annotation_ = Collections.EMPTY_LIST;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            char c = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.bitField0_ |= 1;
                                    this.name_ = codedInputStream.readInt32();
                                } else if (readTag == 18) {
                                    if ((c & 2) != 2) {
                                        this.annotation_ = new ArrayList();
                                        c = 2;
                                    }
                                    this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((c & 2) == 2) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        public static EnumEntry getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<EnumEntry> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.name_) : 0;
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.annotation_.get(i2));
            }
            int size = this.unknownFields.size() + extensionsSerializedSize() + computeInt32Size;
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getAnnotationCount(); i++) {
                if (!getAnnotation(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.name_);
            }
            for (int i = 0; i < this.annotation_.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.annotation_.get(i));
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {
            public List annotation_ = Collections.EMPTY_LIST;
            public int bitField0_;
            public int name_;

            public Builder addAnnotation(Annotation annotation) {
                annotation.getClass();
                if ((this.bitField0_ & 2) != 2) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 2;
                }
                this.annotation_.add(annotation);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public EnumEntry build() {
                EnumEntry buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public EnumEntry buildPartial() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                enumEntry.name_ = this.name_;
                if ((i & 2) == 2) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -3;
                }
                enumEntry.annotation_ = this.annotation_;
                enumEntry.bitField0_ = i2;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.annotation_.get(i);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getAnnotationCount(); i++) {
                    if (!getAnnotation(i).isInitialized()) {
                        return false;
                    }
                }
                return this.extensions.isInitialized();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                if (!enumEntry.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = enumEntry.annotation_;
                        this.bitField0_ &= -3;
                    } else {
                        if ((this.bitField0_ & 2) != 2) {
                            this.annotation_ = new ArrayList(this.annotation_);
                            this.bitField0_ |= 2;
                        }
                        this.annotation_.addAll(enumEntry.annotation_);
                    }
                }
                mergeExtensionFields(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.unknownFields));
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 1;
                this.name_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                EnumEntry enumEntry = null;
                try {
                    try {
                        EnumEntry parsePartialFrom = EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        EnumEntry enumEntry2 = (EnumEntry) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                                mergeFrom(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (enumEntry != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public EnumEntry getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public EnumEntry() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public EnumEntry(Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static Parser<Expression> PARSER = new AnonymousClass1();
        public static final Expression defaultInstance;
        public List andArgument_;
        public int bitField0_;
        public ConstantValue constantValue_;
        public int flags_;
        public int isInstanceTypeId_;
        public Type isInstanceType_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public List orArgument_;
        public final ByteString unknownFields;
        public int valueParameterReference_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0),
            FALSE(1),
            NULL(2);

            public final int value;

            ConstantValue(int i) {
                this.value = i;
            }

            public static ConstantValue valueOf(int i) {
                if (i == 0) {
                    return TRUE;
                }
                if (i == 1) {
                    return FALSE;
                }
                if (i != 2) {
                    return null;
                }
                return NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Expression expression = new Expression();
            defaultInstance = expression;
            expression.flags_ = 0;
            expression.valueParameterReference_ = 0;
            expression.constantValue_ = ConstantValue.TRUE;
            expression.isInstanceType_ = Type.getDefaultInstance();
            expression.isInstanceTypeId_ = 0;
            List list = Collections.EMPTY_LIST;
            expression.andArgument_ = list;
            expression.orArgument_ = list;
        }

        public Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.flags_ = 0;
            this.valueParameterReference_ = 0;
            this.constantValue_ = ConstantValue.TRUE;
            this.isInstanceType_ = Type.getDefaultInstance();
            this.isInstanceTypeId_ = 0;
            List list = Collections.EMPTY_LIST;
            this.andArgument_ = list;
            this.orArgument_ = list;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            int i = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.bitField0_ |= 2;
                                this.valueParameterReference_ = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                int readEnum = codedInputStream.readEnum();
                                ConstantValue valueOf = ConstantValue.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.constantValue_ = valueOf;
                                }
                            } else if (readTag == 34) {
                                Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.isInstanceType_ = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.isInstanceType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 8;
                            } else if (readTag == 40) {
                                this.bitField0_ |= 16;
                                this.isInstanceTypeId_ = codedInputStream.readInt32();
                            } else if (readTag == 50) {
                                if ((i & 32) != 32) {
                                    this.andArgument_ = new ArrayList();
                                    i |= 32;
                                }
                                this.andArgument_.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (readTag == 58) {
                                if ((i & 64) != 64) {
                                    this.orArgument_ = new ArrayList();
                                    i |= 64;
                                }
                                this.orArgument_.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (!codedInputStream.skipField(readTag, newInstance)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i & 32) == 32) {
                            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                        }
                        if ((i & 64) == 64) {
                            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i & 32) == 32) {
                this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
            }
            if ((i & 64) == 64) {
                this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
        }

        public static Expression getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        public Expression getAndArgument(int i) {
            return (Expression) this.andArgument_.get(i);
        }

        public int getAndArgumentCount() {
            return this.andArgument_.size();
        }

        public List<Expression> getAndArgumentList() {
            return this.andArgument_;
        }

        public ConstantValue getConstantValue() {
            return this.constantValue_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public Type getIsInstanceType() {
            return this.isInstanceType_;
        }

        public int getIsInstanceTypeId() {
            return this.isInstanceTypeId_;
        }

        public Expression getOrArgument(int i) {
            return (Expression) this.orArgument_.get(i);
        }

        public int getOrArgumentCount() {
            return this.orArgument_.size();
        }

        public List<Expression> getOrArgumentList() {
            return this.orArgument_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Expression> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeEnumSize(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeMessageSize(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeInt32Size(5, this.isInstanceTypeId_);
            }
            for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.andArgument_.get(i2));
            }
            for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(7, (MessageLite) this.orArgument_.get(i3));
            }
            int size = this.unknownFields.size() + computeInt32Size;
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getValueParameterReference() {
            return this.valueParameterReference_;
        }

        public boolean hasConstantValue() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasIsInstanceType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasValueParameterReference() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getAndArgumentCount(); i++) {
                if (!getAndArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                if (!getOrArgument(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(5, this.isInstanceTypeId_);
            }
            for (int i = 0; i < this.andArgument_.size(); i++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.andArgument_.get(i));
            }
            for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.orArgument_.get(i2));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {
            public List andArgument_;
            public int bitField0_;
            public int flags_;
            public int isInstanceTypeId_;
            public List orArgument_;
            public int valueParameterReference_;
            public ConstantValue constantValue_ = ConstantValue.TRUE;
            public Type isInstanceType_ = Type.getDefaultInstance();

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.andArgument_ = list;
                this.orArgument_ = list;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Expression build() {
                Expression buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public Expression buildPartial() {
                Expression expression = new Expression(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                expression.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.valueParameterReference_ = this.valueParameterReference_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.constantValue_ = this.constantValue_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.isInstanceType_ = this.isInstanceType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.isInstanceTypeId_ = this.isInstanceTypeId_;
                if ((i & 32) == 32) {
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                    this.bitField0_ &= -33;
                }
                expression.andArgument_ = this.andArgument_;
                if ((this.bitField0_ & 64) == 64) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                    this.bitField0_ &= -65;
                }
                expression.orArgument_ = this.orArgument_;
                expression.bitField0_ = i2;
                return expression;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Expression getAndArgument(int i) {
                return (Expression) this.andArgument_.get(i);
            }

            public int getAndArgumentCount() {
                return this.andArgument_.size();
            }

            public Type getIsInstanceType() {
                return this.isInstanceType_;
            }

            public Expression getOrArgument(int i) {
                return (Expression) this.orArgument_.get(i);
            }

            public int getOrArgumentCount() {
                return this.orArgument_.size();
            }

            public boolean hasIsInstanceType() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getAndArgumentCount(); i++) {
                    if (!getAndArgument(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                    if (!getOrArgument(i2).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.andArgument_.isEmpty()) {
                    if (this.andArgument_.isEmpty()) {
                        this.andArgument_ = expression.andArgument_;
                        this.bitField0_ &= -33;
                    } else {
                        if ((this.bitField0_ & 32) != 32) {
                            this.andArgument_ = new ArrayList(this.andArgument_);
                            this.bitField0_ |= 32;
                        }
                        this.andArgument_.addAll(expression.andArgument_);
                    }
                }
                if (!expression.orArgument_.isEmpty()) {
                    if (this.orArgument_.isEmpty()) {
                        this.orArgument_ = expression.orArgument_;
                        this.bitField0_ &= -65;
                    } else {
                        if ((this.bitField0_ & 64) != 64) {
                            this.orArgument_ = new ArrayList(this.orArgument_);
                            this.bitField0_ |= 64;
                        }
                        this.orArgument_.addAll(expression.orArgument_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.unknownFields));
                return this;
            }

            public Builder mergeIsInstanceType(Type type2) {
                if ((this.bitField0_ & 8) != 8 || this.isInstanceType_ == Type.getDefaultInstance()) {
                    this.isInstanceType_ = type2;
                } else {
                    this.isInstanceType_ = Type.newBuilder(this.isInstanceType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setConstantValue(ConstantValue constantValue) {
                constantValue.getClass();
                this.bitField0_ |= 4;
                this.constantValue_ = constantValue;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setIsInstanceTypeId(int i) {
                this.bitField0_ |= 16;
                this.isInstanceTypeId_ = i;
                return this;
            }

            public Builder setValueParameterReference(int i) {
                this.bitField0_ |= 2;
                this.valueParameterReference_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Expression expression = null;
                try {
                    try {
                        Expression parsePartialFrom = Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Expression expression2 = (Expression) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            expression = expression2;
                            if (expression != null) {
                                mergeFrom(expression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (expression != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Expression getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Expression() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public Expression(Builder builder) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static Parser<Function> PARSER = new AnonymousClass1();
        public static final Function defaultInstance;
        public List annotation_;
        public int bitField0_;
        public List compilerPluginData_;
        public List contextParameter_;
        public int contextReceiverTypeIdMemoizedSerializedSize;
        public List contextReceiverTypeId_;
        public List contextReceiverType_;
        public Contract contract_;
        public List extensionReceiverAnnotation_;
        public int flags_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public int name_;
        public int oldFlags_;
        public int receiverTypeId_;
        public Type receiverType_;
        public int returnTypeId_;
        public Type returnType_;
        public List typeParameter_;
        public TypeTable typeTable_;
        public final ByteString unknownFields;
        public List valueParameter_;
        public List versionRequirement_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Function function = new Function();
            defaultInstance = function;
            function.initFields$22();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0330  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x033c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0348  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0354  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0360  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x036c  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0378  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0386  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0394  */
        /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            boolean z;
            int i;
            int i2;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields$22();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                int i4 = 32768;
                boolean z3 = z;
                ?? r4 = 256;
                r4 = 256;
                int i5 = 256;
                if (z2) {
                    if ((i3 & 32) == 32) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i3 & 2048) == 2048) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if ((i3 & 256) == 256) {
                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    }
                    if ((i3 & 512) == 512) {
                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if ((i3 & 65536) == 65536) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i3 & 1024) == 1024) {
                        this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                    }
                    if ((i3 & PKIFailureInfo.certRevoked) == 8192) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    if ((i3 & 32768) == 32768) {
                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    }
                    if ((i3 & PKIFailureInfo.unsupportedVersion) == 131072) {
                        this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            z2 = z3;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = codedInputStream.readInt32();
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = codedInputStream.readInt32();
                        case 26:
                            Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                            Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.returnType_ = type2;
                            if (builder != null) {
                                builder.mergeFrom(type2);
                                this.returnType_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 8;
                        case 34:
                            if ((i3 & 32) != 32) {
                                this.typeParameter_ = new ArrayList();
                                i3 |= 32;
                            }
                            this.typeParameter_.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                        case 42:
                            Type.Builder builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                            Type type3 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                            this.receiverType_ = type3;
                            if (builder2 != null) {
                                builder2.mergeFrom(type3);
                                this.receiverType_ = builder2.buildPartial();
                            }
                            this.bitField0_ |= 32;
                        case 50:
                            if ((i3 & 2048) != 2048) {
                                this.valueParameter_ = new ArrayList();
                                i3 |= 2048;
                            }
                            this.valueParameter_.add(codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                        case 56:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = codedInputStream.readInt32();
                        case 64:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = codedInputStream.readInt32();
                        case 72:
                            this.bitField0_ |= 1;
                            this.flags_ = codedInputStream.readInt32();
                        case 82:
                            if ((i3 & 256) != 256) {
                                this.contextReceiverType_ = new ArrayList();
                                i3 |= 256;
                            }
                            this.contextReceiverType_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                        case 88:
                            if ((i3 & 512) != 512) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i3 |= 512;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                        case 90:
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if ((i3 & 512) != 512 && codedInputStream.getBytesUntilLimit() > 0) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i3 |= 512;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            }
                            codedInputStream.popLimit(pushLimit);
                            break;
                        case 98:
                            if ((i3 & 65536) != 65536) {
                                this.annotation_ = new ArrayList();
                                i3 |= 65536;
                            }
                            this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                        case 106:
                            if ((i3 & 1024) != 1024) {
                                this.contextParameter_ = new ArrayList();
                                i3 |= 1024;
                            }
                            this.contextParameter_.add(codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                            TypeTable.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.typeTable_.toBuilder() : null;
                            TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                            this.typeTable_ = typeTable;
                            if (builder3 != null) {
                                builder3.mergeFrom(typeTable);
                                this.typeTable_ = builder3.buildPartial();
                            }
                            this.bitField0_ |= 128;
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                            if ((i3 & PKIFailureInfo.certRevoked) != 8192) {
                                this.versionRequirement_ = new ArrayList();
                                i3 |= PKIFailureInfo.certRevoked;
                            }
                            this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                            i2 = 131072;
                            int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            if ((i3 & PKIFailureInfo.certRevoked) != 8192 && codedInputStream.getBytesUntilLimit() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i3 |= PKIFailureInfo.certRevoked;
                            }
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                i = i4;
                                try {
                                    try {
                                        this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                        i4 = i;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if ((i3 & 32) == 32) {
                                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                        }
                                        if ((i3 & 2048) == 2048) {
                                            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                                        }
                                        if ((i3 & 256) == i5) {
                                            this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                        }
                                        if ((i3 & 512) == 512) {
                                            this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                        }
                                        if ((i3 & 65536) == 65536) {
                                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                        }
                                        if ((i3 & 1024) == 1024) {
                                            this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                        }
                                        if ((i3 & PKIFailureInfo.certRevoked) == 8192) {
                                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                        }
                                        if ((i3 & i) == i) {
                                            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                        }
                                        if ((i3 & i2) == i2) {
                                            this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                        }
                                        try {
                                            newInstance.flush();
                                        } catch (IOException unused2) {
                                        } catch (Throwable th3) {
                                            this.unknownFields = newOutput.toByteString();
                                            throw th3;
                                        }
                                        this.unknownFields = newOutput.toByteString();
                                        makeExtensionsImmutable();
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException e) {
                                    e = e;
                                    throw e.setUnfinishedMessage(this);
                                } catch (IOException e2) {
                                    e = e2;
                                    throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                }
                            }
                            codedInputStream.popLimit(pushLimit2);
                            break;
                        case SDK_ASSET_HEADER_BOLT_VALUE:
                            Contract.Builder builder4 = (this.bitField0_ & 256) == 256 ? this.contract_.toBuilder() : null;
                            Contract contract = (Contract) codedInputStream.readMessage(Contract.PARSER, extensionRegistryLite);
                            this.contract_ = contract;
                            if (builder4 != null) {
                                builder4.mergeFrom(contract);
                                this.contract_ = builder4.buildPartial();
                            }
                            this.bitField0_ |= 256;
                        case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                            if ((i3 & 32768) != 32768) {
                                this.compilerPluginData_ = new ArrayList();
                                i3 |= 32768;
                            }
                            this.compilerPluginData_.add(codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                        case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                            if ((i3 & PKIFailureInfo.unsupportedVersion) != 131072) {
                                this.extensionReceiverAnnotation_ = new ArrayList();
                                i3 |= PKIFailureInfo.unsupportedVersion;
                            }
                            try {
                                i2 = 131072;
                            } catch (InvalidProtocolBufferException e3) {
                                e = e3;
                            } catch (IOException e4) {
                                e = e4;
                            } catch (Throwable th4) {
                                th = th4;
                                i2 = 131072;
                            }
                            try {
                                this.extensionReceiverAnnotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            } catch (InvalidProtocolBufferException e5) {
                                e = e5;
                                throw e.setUnfinishedMessage(this);
                            } catch (IOException e6) {
                                e = e6;
                                throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                            } catch (Throwable th5) {
                                th = th5;
                                i = 32768;
                                if ((i3 & 32) == 32) {
                                }
                                if ((i3 & 2048) == 2048) {
                                }
                                if ((i3 & 256) == i5) {
                                }
                                if ((i3 & 512) == 512) {
                                }
                                if ((i3 & 65536) == 65536) {
                                }
                                if ((i3 & 1024) == 1024) {
                                }
                                if ((i3 & PKIFailureInfo.certRevoked) == 8192) {
                                }
                                if ((i3 & i) == i) {
                                }
                                if ((i3 & i2) == i2) {
                                }
                                newInstance.flush();
                                this.unknownFields = newOutput.toByteString();
                                makeExtensionsImmutable();
                                throw th;
                            }
                            break;
                        default:
                            r4 = parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag);
                            z = r4 != 0 ? z3 : true;
                            z2 = z3;
                    }
                } catch (InvalidProtocolBufferException e7) {
                    e = e7;
                } catch (IOException e8) {
                    e = e8;
                } catch (Throwable th6) {
                    th = th6;
                    i = 32768;
                    i2 = 131072;
                    i5 = r4;
                }
            }
        }

        public static Function getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Function function) {
            return newBuilder().mergeFrom(function);
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return (CompilerPluginData) this.compilerPluginData_.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public ValueParameter getContextParameter(int i) {
            return (ValueParameter) this.contextParameter_.get(i);
        }

        public int getContextParameterCount() {
            return this.contextParameter_.size();
        }

        public List<ValueParameter> getContextParameterList() {
            return this.contextParameter_;
        }

        public Type getContextReceiverType(int i) {
            return (Type) this.contextReceiverType_.get(i);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        public Contract getContract() {
            return this.contract_;
        }

        public Annotation getExtensionReceiverAnnotation(int i) {
            return (Annotation) this.extensionReceiverAnnotation_.get(i);
        }

        public int getExtensionReceiverAnnotationCount() {
            return this.extensionReceiverAnnotation_.size();
        }

        public List<Annotation> getExtensionReceiverAnnotationList() {
            return this.extensionReceiverAnnotation_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Function> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.receiverType_;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public Type getReturnType() {
            return this.returnType_;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.oldFlags_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeMessageSize(3, this.returnType_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                computeInt32Size += CodedOutputStream.computeMessageSize(5, this.receiverType_);
            }
            for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.valueParameter_.get(i3));
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeInt32Size(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                computeInt32Size += CodedOutputStream.computeInt32Size(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                computeInt32Size += CodedOutputStream.computeInt32Size(9, this.flags_);
            }
            for (int i4 = 0; i4 < this.contextReceiverType_.size(); i4++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(10, (MessageLite) this.contextReceiverType_.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.contextReceiverTypeId_.size(); i6++) {
                i5 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.contextReceiverTypeId_.get(i6)).intValue());
            }
            int i7 = computeInt32Size + i5;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                i7 = i7 + 1 + CodedOutputStream.computeInt32SizeNoTag(i5);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = i5;
            for (int i8 = 0; i8 < this.annotation_.size(); i8++) {
                i7 += CodedOutputStream.computeMessageSize(12, (MessageLite) this.annotation_.get(i8));
            }
            for (int i9 = 0; i9 < this.contextParameter_.size(); i9++) {
                i7 += CodedOutputStream.computeMessageSize(13, (MessageLite) this.contextParameter_.get(i9));
            }
            if ((this.bitField0_ & 128) == 128) {
                i7 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.versionRequirement_.size(); i11++) {
                i10 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.versionRequirement_.get(i11)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + i7 + i10;
            if ((this.bitField0_ & 256) == 256) {
                size += CodedOutputStream.computeMessageSize(32, this.contract_);
            }
            for (int i12 = 0; i12 < this.compilerPluginData_.size(); i12++) {
                size += CodedOutputStream.computeMessageSize(33, (MessageLite) this.compilerPluginData_.get(i12));
            }
            for (int i13 = 0; i13 < this.extensionReceiverAnnotation_.size(); i13++) {
                size += CodedOutputStream.computeMessageSize(34, (MessageLite) this.extensionReceiverAnnotation_.get(i13));
            }
            int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
            this.memoizedSerializedSize = size2;
            return size2;
        }

        public TypeParameter getTypeParameter(int i) {
            return (TypeParameter) this.typeParameter_.get(i);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public ValueParameter getValueParameter(int i) {
            return (ValueParameter) this.valueParameter_.get(i);
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasContract() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 128) == 128;
        }

        public final void initFields$22() {
            this.flags_ = 6;
            this.oldFlags_ = 6;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.contextParameter_ = list;
            this.valueParameter_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = list;
            this.contract_ = Contract.getDefaultInstance();
            this.compilerPluginData_ = list;
            this.annotation_ = list;
            this.extensionReceiverAnnotation_ = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                if (!getContextReceiverType(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                if (!getContextParameter(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getValueParameterCount(); i4++) {
                if (!getValueParameter(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < getCompilerPluginDataCount(); i5++) {
                if (!getCompilerPluginData(i5).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getAnnotationCount(); i6++) {
                if (!getAnnotation(i6).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getExtensionReceiverAnnotationCount(); i7++) {
                if (!getExtensionReceiverAnnotation(i7).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(5, this.receiverType_);
            }
            for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.valueParameter_.get(i2));
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(9, this.flags_);
            }
            for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
                codedOutputStream.writeMessage(10, (MessageLite) this.contextReceiverType_.get(i3));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(90);
                codedOutputStream.writeRawVarint32(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.contextReceiverTypeId_.get(i4)).intValue());
            }
            for (int i5 = 0; i5 < this.annotation_.size(); i5++) {
                codedOutputStream.writeMessage(12, (MessageLite) this.annotation_.get(i5));
            }
            for (int i6 = 0; i6 < this.contextParameter_.size(); i6++) {
                codedOutputStream.writeMessage(13, (MessageLite) this.contextParameter_.get(i6));
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            for (int i7 = 0; i7 < this.versionRequirement_.size(); i7++) {
                codedOutputStream.writeInt32(31, ((Integer) this.versionRequirement_.get(i7)).intValue());
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeMessage(32, this.contract_);
            }
            for (int i8 = 0; i8 < this.compilerPluginData_.size(); i8++) {
                codedOutputStream.writeMessage(33, (MessageLite) this.compilerPluginData_.get(i8));
            }
            for (int i9 = 0; i9 < this.extensionReceiverAnnotation_.size(); i9++) {
                codedOutputStream.writeMessage(34, (MessageLite) this.extensionReceiverAnnotation_.get(i9));
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {
            public List annotation_;
            public int bitField0_;
            public List compilerPluginData_;
            public List contextParameter_;
            public List contextReceiverTypeId_;
            public List contextReceiverType_;
            public Contract contract_;
            public List extensionReceiverAnnotation_;
            public int name_;
            public int receiverTypeId_;
            public Type receiverType_;
            public int returnTypeId_;
            public List typeParameter_;
            public TypeTable typeTable_;
            public List valueParameter_;
            public List versionRequirement_;
            public int flags_ = 6;
            public int oldFlags_ = 6;
            public Type returnType_ = Type.getDefaultInstance();

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.typeParameter_ = list;
                this.receiverType_ = Type.getDefaultInstance();
                this.contextReceiverType_ = list;
                this.contextReceiverTypeId_ = list;
                this.contextParameter_ = list;
                this.valueParameter_ = list;
                this.typeTable_ = TypeTable.getDefaultInstance();
                this.versionRequirement_ = list;
                this.contract_ = Contract.getDefaultInstance();
                this.compilerPluginData_ = list;
                this.annotation_ = list;
                this.extensionReceiverAnnotation_ = list;
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & 65536) != 65536) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 65536;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.annotation_);
                return this;
            }

            public Builder addAllExtensionReceiverAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & PKIFailureInfo.unsupportedVersion) != 131072) {
                    this.extensionReceiverAnnotation_ = new ArrayList(this.extensionReceiverAnnotation_);
                    this.bitField0_ |= PKIFailureInfo.unsupportedVersion;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.extensionReceiverAnnotation_);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Function build() {
                Function buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public Function buildPartial() {
                Function function = new Function(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                function.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.oldFlags_ = this.oldFlags_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.name_ = this.name_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.returnType_ = this.returnType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.returnTypeId_ = this.returnTypeId_;
                if ((i & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                function.typeParameter_ = this.typeParameter_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.receiverType_ = this.receiverType_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                function.receiverTypeId_ = this.receiverTypeId_;
                if ((this.bitField0_ & 256) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    this.bitField0_ &= -257;
                }
                function.contextReceiverType_ = this.contextReceiverType_;
                if ((this.bitField0_ & 512) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    this.bitField0_ &= -513;
                }
                function.contextReceiverTypeId_ = this.contextReceiverTypeId_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                    this.bitField0_ &= -1025;
                }
                function.contextParameter_ = this.contextParameter_;
                if ((this.bitField0_ & 2048) == 2048) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    this.bitField0_ &= -2049;
                }
                function.valueParameter_ = this.valueParameter_;
                if ((i & 4096) == 4096) {
                    i2 |= 128;
                }
                function.typeTable_ = this.typeTable_;
                if ((this.bitField0_ & PKIFailureInfo.certRevoked) == 8192) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -8193;
                }
                function.versionRequirement_ = this.versionRequirement_;
                if ((i & 16384) == 16384) {
                    i2 |= 256;
                }
                function.contract_ = this.contract_;
                if ((this.bitField0_ & 32768) == 32768) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    this.bitField0_ &= -32769;
                }
                function.compilerPluginData_ = this.compilerPluginData_;
                if ((this.bitField0_ & 65536) == 65536) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -65537;
                }
                function.annotation_ = this.annotation_;
                if ((this.bitField0_ & PKIFailureInfo.unsupportedVersion) == 131072) {
                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                    this.bitField0_ &= -131073;
                }
                function.extensionReceiverAnnotation_ = this.extensionReceiverAnnotation_;
                function.bitField0_ = i2;
                return function;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.annotation_.get(i);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public CompilerPluginData getCompilerPluginData(int i) {
                return (CompilerPluginData) this.compilerPluginData_.get(i);
            }

            public int getCompilerPluginDataCount() {
                return this.compilerPluginData_.size();
            }

            public ValueParameter getContextParameter(int i) {
                return (ValueParameter) this.contextParameter_.get(i);
            }

            public int getContextParameterCount() {
                return this.contextParameter_.size();
            }

            public Type getContextReceiverType(int i) {
                return (Type) this.contextReceiverType_.get(i);
            }

            public int getContextReceiverTypeCount() {
                return this.contextReceiverType_.size();
            }

            public Contract getContract() {
                return this.contract_;
            }

            public Annotation getExtensionReceiverAnnotation(int i) {
                return (Annotation) this.extensionReceiverAnnotation_.get(i);
            }

            public int getExtensionReceiverAnnotationCount() {
                return this.extensionReceiverAnnotation_.size();
            }

            public Type getReceiverType() {
                return this.receiverType_;
            }

            public Type getReturnType() {
                return this.returnType_;
            }

            public TypeParameter getTypeParameter(int i) {
                return (TypeParameter) this.typeParameter_.get(i);
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public ValueParameter getValueParameter(int i) {
                return (ValueParameter) this.valueParameter_.get(i);
            }

            public int getValueParameterCount() {
                return this.valueParameter_.size();
            }

            public boolean hasContract() {
                return (this.bitField0_ & 16384) == 16384;
            }

            public boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.bitField0_ & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasTypeTable() {
                return (this.bitField0_ & 4096) == 4096;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                    if (!getContextReceiverType(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                    if (!getContextParameter(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < getValueParameterCount(); i4++) {
                    if (!getValueParameter(i4).isInitialized()) {
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    return false;
                }
                if (hasContract() && !getContract().isInitialized()) {
                    return false;
                }
                for (int i5 = 0; i5 < getCompilerPluginDataCount(); i5++) {
                    if (!getCompilerPluginData(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getAnnotationCount(); i6++) {
                    if (!getAnnotation(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < getExtensionReceiverAnnotationCount(); i7++) {
                    if (!getExtensionReceiverAnnotation(i7).isInitialized()) {
                        return false;
                    }
                }
                return this.extensions.isInitialized();
            }

            public Builder mergeContract(Contract contract) {
                if ((this.bitField0_ & 16384) != 16384 || this.contract_ == Contract.getDefaultInstance()) {
                    this.contract_ = contract;
                } else {
                    this.contract_ = Contract.newBuilder(this.contract_).mergeFrom(contract).buildPartial();
                }
                this.bitField0_ |= 16384;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = function.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        if ((this.bitField0_ & 32) != 32) {
                            this.typeParameter_ = new ArrayList(this.typeParameter_);
                            this.bitField0_ |= 32;
                        }
                        this.typeParameter_.addAll(function.typeParameter_);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.contextReceiverType_.isEmpty()) {
                    if (this.contextReceiverType_.isEmpty()) {
                        this.contextReceiverType_ = function.contextReceiverType_;
                        this.bitField0_ &= -257;
                    } else {
                        if ((this.bitField0_ & 256) != 256) {
                            this.contextReceiverType_ = new ArrayList(this.contextReceiverType_);
                            this.bitField0_ |= 256;
                        }
                        this.contextReceiverType_.addAll(function.contextReceiverType_);
                    }
                }
                if (!function.contextReceiverTypeId_.isEmpty()) {
                    if (this.contextReceiverTypeId_.isEmpty()) {
                        this.contextReceiverTypeId_ = function.contextReceiverTypeId_;
                        this.bitField0_ &= -513;
                    } else {
                        if ((this.bitField0_ & 512) != 512) {
                            this.contextReceiverTypeId_ = new ArrayList(this.contextReceiverTypeId_);
                            this.bitField0_ |= 512;
                        }
                        this.contextReceiverTypeId_.addAll(function.contextReceiverTypeId_);
                    }
                }
                if (!function.contextParameter_.isEmpty()) {
                    if (this.contextParameter_.isEmpty()) {
                        this.contextParameter_ = function.contextParameter_;
                        this.bitField0_ &= -1025;
                    } else {
                        if ((this.bitField0_ & 1024) != 1024) {
                            this.contextParameter_ = new ArrayList(this.contextParameter_);
                            this.bitField0_ |= 1024;
                        }
                        this.contextParameter_.addAll(function.contextParameter_);
                    }
                }
                if (!function.valueParameter_.isEmpty()) {
                    if (this.valueParameter_.isEmpty()) {
                        this.valueParameter_ = function.valueParameter_;
                        this.bitField0_ &= -2049;
                    } else {
                        if ((this.bitField0_ & 2048) != 2048) {
                            this.valueParameter_ = new ArrayList(this.valueParameter_);
                            this.bitField0_ |= 2048;
                        }
                        this.valueParameter_.addAll(function.valueParameter_);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = function.versionRequirement_;
                        this.bitField0_ &= -8193;
                    } else {
                        if ((this.bitField0_ & PKIFailureInfo.certRevoked) != 8192) {
                            this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                            this.bitField0_ |= PKIFailureInfo.certRevoked;
                        }
                        this.versionRequirement_.addAll(function.versionRequirement_);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                if (!function.compilerPluginData_.isEmpty()) {
                    if (this.compilerPluginData_.isEmpty()) {
                        this.compilerPluginData_ = function.compilerPluginData_;
                        this.bitField0_ &= -32769;
                    } else {
                        if ((this.bitField0_ & 32768) != 32768) {
                            this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
                            this.bitField0_ |= 32768;
                        }
                        this.compilerPluginData_.addAll(function.compilerPluginData_);
                    }
                }
                if (!function.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = function.annotation_;
                        this.bitField0_ &= -65537;
                    } else {
                        if ((this.bitField0_ & 65536) != 65536) {
                            this.annotation_ = new ArrayList(this.annotation_);
                            this.bitField0_ |= 65536;
                        }
                        this.annotation_.addAll(function.annotation_);
                    }
                }
                if (!function.extensionReceiverAnnotation_.isEmpty()) {
                    if (this.extensionReceiverAnnotation_.isEmpty()) {
                        this.extensionReceiverAnnotation_ = function.extensionReceiverAnnotation_;
                        this.bitField0_ &= -131073;
                    } else {
                        if ((this.bitField0_ & PKIFailureInfo.unsupportedVersion) != 131072) {
                            this.extensionReceiverAnnotation_ = new ArrayList(this.extensionReceiverAnnotation_);
                            this.bitField0_ |= PKIFailureInfo.unsupportedVersion;
                        }
                        this.extensionReceiverAnnotation_.addAll(function.extensionReceiverAnnotation_);
                    }
                }
                mergeExtensionFields(function);
                setUnknownFields(getUnknownFields().concat(function.unknownFields));
                return this;
            }

            public Builder mergeReceiverType(Type type2) {
                if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.getDefaultInstance()) {
                    this.receiverType_ = type2;
                } else {
                    this.receiverType_ = Type.newBuilder(this.receiverType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type2) {
                if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.getDefaultInstance()) {
                    this.returnType_ = type2;
                } else {
                    this.returnType_ = Type.newBuilder(this.returnType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & 4096) != 4096 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= 4096;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 4;
                this.name_ = i;
                return this;
            }

            public Builder setOldFlags(int i) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i;
                return this;
            }

            public Builder setReceiverTypeId(int i) {
                this.bitField0_ |= 128;
                this.receiverTypeId_ = i;
                return this;
            }

            public Builder setReturnTypeId(int i) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Function function = null;
                try {
                    try {
                        Function parsePartialFrom = Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Function function2 = (Function) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            function = function2;
                            if (function != null) {
                                mergeFrom(function);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (function != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Function getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Function() {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public Function(Builder builder) {
            super(builder);
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static Parser<Package> PARSER = new AnonymousClass1();
        public static final Package defaultInstance;
        public int bitField0_;
        public List function_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public List property_;
        public List typeAlias_;
        public TypeTable typeTable_;
        public final ByteString unknownFields;
        public VersionRequirementTable versionRequirementTable_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Package r0 = new Package();
            defaultInstance = r0;
            List list = Collections.EMPTY_LIST;
            r0.function_ = list;
            r0.property_ = list;
            r0.typeAlias_ = list;
            r0.typeTable_ = TypeTable.getDefaultInstance();
            r0.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8 */
        public Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            List list = Collections.EMPTY_LIST;
            this.function_ = list;
            this.property_ = list;
            this.typeAlias_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 26) {
                                int i = (c == true ? 1 : 0) & 1;
                                c = c;
                                if (i != 1) {
                                    this.function_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 1;
                                }
                                this.function_.add(codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                            } else if (readTag == 34) {
                                int i2 = (c == true ? 1 : 0) & 2;
                                c = c;
                                if (i2 != 2) {
                                    this.property_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 2;
                                }
                                this.property_.add(codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                            } else if (readTag != 42) {
                                if (readTag == 242) {
                                    TypeTable.Builder builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                    this.typeTable_ = typeTable;
                                    if (builder != null) {
                                        builder.mergeFrom(typeTable);
                                        this.typeTable_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 1;
                                } else if (readTag == 258) {
                                    VersionRequirementTable.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                    VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                    this.versionRequirementTable_ = versionRequirementTable;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(versionRequirementTable);
                                        this.versionRequirementTable_ = builder2.buildPartial();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                int i3 = (c == true ? 1 : 0) & 4;
                                c = c;
                                if (i3 != 4) {
                                    this.typeAlias_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 4;
                                }
                                this.typeAlias_.add(codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & 1) == 1) {
                            this.function_ = Collections.unmodifiableList(this.function_);
                        }
                        if (((c == true ? 1 : 0) & 2) == 2) {
                            this.property_ = Collections.unmodifiableList(this.property_);
                        }
                        if (((c == true ? 1 : 0) & 4) == 4) {
                            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c == true ? 1 : 0) & 1) == 1) {
                this.function_ = Collections.unmodifiableList(this.function_);
            }
            if (((c == true ? 1 : 0) & 2) == 2) {
                this.property_ = Collections.unmodifiableList(this.property_);
            }
            if (((c == true ? 1 : 0) & 4) == 4) {
                this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        public static Package getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Package r1) {
            return newBuilder().mergeFrom(r1);
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Function getFunction(int i) {
            return (Function) this.function_.get(i);
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public List<Function> getFunctionList() {
            return this.function_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Package> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i) {
            return (Property) this.property_.get(i);
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public List<Property> getPropertyList() {
            return this.property_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.function_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(3, (MessageLite) this.function_.get(i3));
            }
            for (int i4 = 0; i4 < this.property_.size(); i4++) {
                i2 += CodedOutputStream.computeMessageSize(4, (MessageLite) this.property_.get(i4));
            }
            for (int i5 = 0; i5 < this.typeAlias_.size(); i5++) {
                i2 += CodedOutputStream.computeMessageSize(5, (MessageLite) this.typeAlias_.get(i5));
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 += CodedOutputStream.computeMessageSize(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.computeMessageSize(32, this.versionRequirementTable_);
            }
            int size = this.unknownFields.size() + extensionsSerializedSize() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        public TypeAlias getTypeAlias(int i) {
            return (TypeAlias) this.typeAlias_.get(i);
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getFunctionCount(); i++) {
                if (!getFunction(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                if (!getProperty(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                if (!getTypeAlias(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            for (int i = 0; i < this.function_.size(); i++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.function_.get(i));
            }
            for (int i2 = 0; i2 < this.property_.size(); i2++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.property_.get(i2));
            }
            for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.typeAlias_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(32, this.versionRequirementTable_);
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {
            public int bitField0_;
            public List function_;
            public List property_;
            public List typeAlias_;
            public TypeTable typeTable_;
            public VersionRequirementTable versionRequirementTable_;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.function_ = list;
                this.property_ = list;
                this.typeAlias_ = list;
                this.typeTable_ = TypeTable.getDefaultInstance();
                this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Package build() {
                Package buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public Package buildPartial() {
                Package r0 = new Package(this);
                int i = this.bitField0_;
                if ((i & 1) == 1) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                    this.bitField0_ &= -2;
                }
                r0.function_ = this.function_;
                if ((this.bitField0_ & 2) == 2) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                    this.bitField0_ &= -3;
                }
                r0.property_ = this.property_;
                if ((this.bitField0_ & 4) == 4) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    this.bitField0_ &= -5;
                }
                r0.typeAlias_ = this.typeAlias_;
                int i2 = (i & 8) != 8 ? 0 : 1;
                r0.typeTable_ = this.typeTable_;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                r0.versionRequirementTable_ = this.versionRequirementTable_;
                r0.bitField0_ = i2;
                return r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Function getFunction(int i) {
                return (Function) this.function_.get(i);
            }

            public int getFunctionCount() {
                return this.function_.size();
            }

            public Property getProperty(int i) {
                return (Property) this.property_.get(i);
            }

            public int getPropertyCount() {
                return this.property_.size();
            }

            public TypeAlias getTypeAlias(int i) {
                return (TypeAlias) this.typeAlias_.get(i);
            }

            public int getTypeAliasCount() {
                return this.typeAlias_.size();
            }

            public TypeTable getTypeTable() {
                return this.typeTable_;
            }

            public boolean hasTypeTable() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getFunctionCount(); i++) {
                    if (!getFunction(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                    if (!getProperty(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                    if (!getTypeAlias(i3).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && this.extensions.isInitialized();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Package r4) {
                if (r4 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r4.function_.isEmpty()) {
                    if (this.function_.isEmpty()) {
                        this.function_ = r4.function_;
                        this.bitField0_ &= -2;
                    } else {
                        if ((this.bitField0_ & 1) != 1) {
                            this.function_ = new ArrayList(this.function_);
                            this.bitField0_ |= 1;
                        }
                        this.function_.addAll(r4.function_);
                    }
                }
                if (!r4.property_.isEmpty()) {
                    if (this.property_.isEmpty()) {
                        this.property_ = r4.property_;
                        this.bitField0_ &= -3;
                    } else {
                        if ((this.bitField0_ & 2) != 2) {
                            this.property_ = new ArrayList(this.property_);
                            this.bitField0_ |= 2;
                        }
                        this.property_.addAll(r4.property_);
                    }
                }
                if (!r4.typeAlias_.isEmpty()) {
                    if (this.typeAlias_.isEmpty()) {
                        this.typeAlias_ = r4.typeAlias_;
                        this.bitField0_ &= -5;
                    } else {
                        if ((this.bitField0_ & 4) != 4) {
                            this.typeAlias_ = new ArrayList(this.typeAlias_);
                            this.bitField0_ |= 4;
                        }
                        this.typeAlias_.addAll(r4.typeAlias_);
                    }
                }
                if (r4.hasTypeTable()) {
                    mergeTypeTable(r4.getTypeTable());
                }
                if (r4.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r4.getVersionRequirementTable());
                }
                mergeExtensionFields(r4);
                setUnknownFields(getUnknownFields().concat(r4.unknownFields));
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.bitField0_ & 8) != 8 || this.typeTable_ == TypeTable.getDefaultInstance()) {
                    this.typeTable_ = typeTable;
                } else {
                    this.typeTable_ = TypeTable.newBuilder(this.typeTable_).mergeFrom(typeTable).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.bitField0_ & 16) != 16 || this.versionRequirementTable_ == VersionRequirementTable.getDefaultInstance()) {
                    this.versionRequirementTable_ = versionRequirementTable;
                } else {
                    this.versionRequirementTable_ = VersionRequirementTable.newBuilder(this.versionRequirementTable_).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.bitField0_ |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Package r0 = null;
                try {
                    try {
                        Package parsePartialFrom = Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Package r4 = (Package) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                mergeFrom(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Package getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Package() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public Package(Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new AnonymousClass1();
        public static final PackageFragment defaultInstance;
        public int bitField0_;
        public List class__;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public Package package_;
        public QualifiedNameTable qualifiedNames_;
        public StringTable strings_;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment();
            defaultInstance = packageFragment;
            packageFragment.strings_ = StringTable.getDefaultInstance();
            packageFragment.qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            packageFragment.package_ = Package.getDefaultInstance();
            packageFragment.class__ = Collections.EMPTY_LIST;
        }

        public PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.strings_ = StringTable.getDefaultInstance();
            this.qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            this.package_ = Package.getDefaultInstance();
            this.class__ = Collections.EMPTY_LIST;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                StringTable.Builder builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                                StringTable stringTable = (StringTable) codedInputStream.readMessage(StringTable.PARSER, extensionRegistryLite);
                                this.strings_ = stringTable;
                                if (builder != null) {
                                    builder.mergeFrom(stringTable);
                                    this.strings_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1;
                            } else if (readTag == 18) {
                                QualifiedNameTable.Builder builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.readMessage(QualifiedNameTable.PARSER, extensionRegistryLite);
                                this.qualifiedNames_ = qualifiedNameTable;
                                if (builder2 != null) {
                                    builder2.mergeFrom(qualifiedNameTable);
                                    this.qualifiedNames_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (readTag == 26) {
                                Package.Builder builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                                Package r6 = (Package) codedInputStream.readMessage(Package.PARSER, extensionRegistryLite);
                                this.package_ = r6;
                                if (builder3 != null) {
                                    builder3.mergeFrom(r6);
                                    this.package_ = builder3.buildPartial();
                                }
                                this.bitField0_ |= 4;
                            } else if (readTag == 34) {
                                int i = (c == true ? 1 : 0) & '\b';
                                c = c;
                                if (i != 8) {
                                    this.class__ = new ArrayList();
                                    c = '\b';
                                }
                                this.class__.add(codedInputStream.readMessage(Class.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & '\b') == 8) {
                            this.class__ = Collections.unmodifiableList(this.class__);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c == true ? 1 : 0) & '\b') == 8) {
                this.class__ = Collections.unmodifiableList(this.class__);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        public static PackageFragment getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Class getClass_(int i) {
            return (Class) this.class__.get(i);
        }

        public int getClass_Count() {
            return this.class__.size();
        }

        public List<Class> getClass_List() {
            return this.class__;
        }

        public Package getPackage() {
            return this.package_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<PackageFragment> getParserForType() {
            return PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.qualifiedNames_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeMessageSize = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.strings_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeMessageSize += CodedOutputStream.computeMessageSize(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeMessageSize += CodedOutputStream.computeMessageSize(3, this.package_);
            }
            for (int i2 = 0; i2 < this.class__.size(); i2++) {
                computeMessageSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.class__.get(i2));
            }
            int size = this.unknownFields.size() + extensionsSerializedSize() + computeMessageSize;
            this.memoizedSerializedSize = size;
            return size;
        }

        public StringTable getStrings() {
            return this.strings_;
        }

        public boolean hasPackage() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasQualifiedNames() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasStrings() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getClass_Count(); i++) {
                if (!getClass_(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, this.strings_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.package_);
            }
            for (int i = 0; i < this.class__.size(); i++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.class__.get(i));
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {
            public int bitField0_;
            public StringTable strings_ = StringTable.getDefaultInstance();
            public QualifiedNameTable qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            public Package package_ = Package.getDefaultInstance();
            public List class__ = Collections.EMPTY_LIST;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public PackageFragment build() {
                PackageFragment buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public PackageFragment buildPartial() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                packageFragment.strings_ = this.strings_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                packageFragment.qualifiedNames_ = this.qualifiedNames_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                packageFragment.package_ = this.package_;
                if ((i & 8) == 8) {
                    this.class__ = Collections.unmodifiableList(this.class__);
                    this.bitField0_ &= -9;
                }
                packageFragment.class__ = this.class__;
                packageFragment.bitField0_ = i2;
                return packageFragment;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Class getClass_(int i) {
                return (Class) this.class__.get(i);
            }

            public int getClass_Count() {
                return this.class__.size();
            }

            public Package getPackage() {
                return this.package_;
            }

            public QualifiedNameTable getQualifiedNames() {
                return this.qualifiedNames_;
            }

            public boolean hasPackage() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasQualifiedNames() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getClass_Count(); i++) {
                    if (!getClass_(i).isInitialized()) {
                        return false;
                    }
                }
                return this.extensions.isInitialized();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.class__.isEmpty()) {
                    if (this.class__.isEmpty()) {
                        this.class__ = packageFragment.class__;
                        this.bitField0_ &= -9;
                    } else {
                        if ((this.bitField0_ & 8) != 8) {
                            this.class__ = new ArrayList(this.class__);
                            this.bitField0_ |= 8;
                        }
                        this.class__.addAll(packageFragment.class__);
                    }
                }
                mergeExtensionFields(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.unknownFields));
                return this;
            }

            public Builder mergePackage(Package r4) {
                if ((this.bitField0_ & 4) != 4 || this.package_ == Package.getDefaultInstance()) {
                    this.package_ = r4;
                } else {
                    this.package_ = Package.newBuilder(this.package_).mergeFrom(r4).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder mergeQualifiedNames(QualifiedNameTable qualifiedNameTable) {
                if ((this.bitField0_ & 2) != 2 || this.qualifiedNames_ == QualifiedNameTable.getDefaultInstance()) {
                    this.qualifiedNames_ = qualifiedNameTable;
                } else {
                    this.qualifiedNames_ = QualifiedNameTable.newBuilder(this.qualifiedNames_).mergeFrom(qualifiedNameTable).buildPartial();
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder mergeStrings(StringTable stringTable) {
                if ((this.bitField0_ & 1) != 1 || this.strings_ == StringTable.getDefaultInstance()) {
                    this.strings_ = stringTable;
                } else {
                    this.strings_ = StringTable.newBuilder(this.strings_).mergeFrom(stringTable).buildPartial();
                }
                this.bitField0_ |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                PackageFragment packageFragment = null;
                try {
                    try {
                        PackageFragment parsePartialFrom = PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        PackageFragment packageFragment2 = (PackageFragment) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                                mergeFrom(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (packageFragment != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public PackageFragment getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public PackageFragment() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public PackageFragment(Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static Parser<Property> PARSER = new AnonymousClass1();
        public static final Property defaultInstance;
        public List annotation_;
        public List backingFieldAnnotation_;
        public int bitField0_;
        public List compilerPluginData_;
        public List contextParameter_;
        public int contextReceiverTypeIdMemoizedSerializedSize;
        public List contextReceiverTypeId_;
        public List contextReceiverType_;
        public List delegateFieldAnnotation_;
        public List extensionReceiverAnnotation_;
        public int flags_;
        public List getterAnnotation_;
        public Contract getterContract_;
        public int getterFlags_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public int name_;
        public int oldFlags_;
        public int receiverTypeId_;
        public Type receiverType_;
        public int returnTypeId_;
        public Type returnType_;
        public List setterAnnotation_;
        public Contract setterContract_;
        public int setterFlags_;
        public ValueParameter setterValueParameter_;
        public List typeParameter_;
        public final ByteString unknownFields;
        public List versionRequirement_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Property property = new Property();
            defaultInstance = property;
            property.initFields$25();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v19 */
        /* JADX WARN: Type inference failed for: r7v21 */
        /* JADX WARN: Type inference failed for: r7v23 */
        /* JADX WARN: Type inference failed for: r7v25 */
        /* JADX WARN: Type inference failed for: r7v27 */
        /* JADX WARN: Type inference failed for: r7v29 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v9 */
        public Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields$25();
            ByteString.Output newOutput = ByteString.newOutput();
            boolean z = true;
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z2 = false;
            char c = 0;
            while (true) {
                boolean z3 = z;
                if (z2) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if (((c == true ? 1 : 0) & 65536) == 65536) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if (((c == true ? 1 : 0) & PKIFailureInfo.unsupportedVersion) == 131072) {
                        this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                    }
                    if (((c == true ? 1 : 0) & PKIFailureInfo.transactionIdInUse) == 262144) {
                        this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                    }
                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                        this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                    }
                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    if (((c == true ? 1 : 0) & 32768) == 32768) {
                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    }
                    if (((c == true ? 1 : 0) & PKIFailureInfo.signerNotTrusted) == 524288) {
                        this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                    }
                    if (((c == true ? 1 : 0) & PKIFailureInfo.badCertTemplate) == 1048576) {
                        this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                    }
                    if (((c == true ? 1 : 0) & PKIFailureInfo.badSenderNonce) == 2097152) {
                        this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z2 = z3;
                                z = z3;
                                c = c;
                            case 8:
                                this.bitField0_ |= 2;
                                this.oldFlags_ = codedInputStream.readInt32();
                                z = z3;
                                c = c;
                            case 16:
                                this.bitField0_ |= 4;
                                this.name_ = codedInputStream.readInt32();
                                z = z3;
                                c = c;
                            case 26:
                                Type.Builder builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.returnType_ = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.returnType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 8;
                                z = z3;
                                c = c;
                            case 34:
                                int i = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i != 32) {
                                    this.typeParameter_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | ' ';
                                }
                                this.typeParameter_.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                z = z3;
                                c = c;
                            case 42:
                                Type.Builder builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                                Type type3 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.receiverType_ = type3;
                                if (builder2 != null) {
                                    builder2.mergeFrom(type3);
                                    this.receiverType_ = builder2.buildPartial();
                                }
                                this.bitField0_ |= 32;
                                z = z3;
                                c = c;
                            case 50:
                                ValueParameter.Builder builder3 = (this.bitField0_ & 128) == 128 ? this.setterValueParameter_.toBuilder() : null;
                                ValueParameter valueParameter = (ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite);
                                this.setterValueParameter_ = valueParameter;
                                if (builder3 != null) {
                                    builder3.mergeFrom(valueParameter);
                                    this.setterValueParameter_ = builder3.buildPartial();
                                }
                                this.bitField0_ |= 128;
                                z = z3;
                                c = c;
                            case 56:
                                this.bitField0_ |= 256;
                                this.getterFlags_ = codedInputStream.readInt32();
                                z = z3;
                                c = c;
                            case 64:
                                this.bitField0_ |= 512;
                                this.setterFlags_ = codedInputStream.readInt32();
                                z = z3;
                                c = c;
                            case 72:
                                this.bitField0_ |= 16;
                                this.returnTypeId_ = codedInputStream.readInt32();
                                z = z3;
                                c = c;
                            case 80:
                                this.bitField0_ |= 64;
                                this.receiverTypeId_ = codedInputStream.readInt32();
                                z = z3;
                                c = c;
                            case 88:
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                                z = z3;
                                c = c;
                            case 98:
                                int i2 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i2 != 256) {
                                    this.contextReceiverType_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 256;
                                }
                                this.contextReceiverType_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                z = z3;
                                c = c;
                            case 104:
                                int i3 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i3 != 512) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                                this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                                z = z3;
                                c = c;
                            case 106:
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i4 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i4 != 512) {
                                    c = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.contextReceiverTypeId_ = new ArrayList();
                                        c = (c == true ? 1 : 0) | 512;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.contextReceiverTypeId_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit);
                                z = z3;
                                c = c;
                            case 114:
                                int i5 = (c == true ? 1 : 0) & 65536;
                                c = c;
                                if (i5 != 65536) {
                                    this.annotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z = z3;
                                c = c;
                            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                                int i6 = (c == true ? 1 : 0) & PKIFailureInfo.unsupportedVersion;
                                c = c;
                                if (i6 != 131072) {
                                    this.getterAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.getterAnnotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z = z3;
                                c = c;
                            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                int i7 = (c == true ? 1 : 0) & PKIFailureInfo.transactionIdInUse;
                                c = c;
                                if (i7 != 262144) {
                                    this.setterAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.setterAnnotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z = z3;
                                c = c;
                            case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                                int i8 = (c == true ? 1 : 0) & 1024;
                                c = c;
                                if (i8 != 1024) {
                                    this.contextParameter_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 1024;
                                }
                                this.contextParameter_.add(codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                                z = z3;
                                c = c;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                                int i9 = (c == true ? 1 : 0) & 16384;
                                c = c;
                                if (i9 != 16384) {
                                    this.versionRequirement_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 16384;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                z = z3;
                                c = c;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i10 = (c == true ? 1 : 0) & 16384;
                                c = c;
                                if (i10 != 16384) {
                                    c = c;
                                    if (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.versionRequirement_ = new ArrayList();
                                        c = (c == true ? 1 : 0) | 16384;
                                    }
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit2);
                                z = z3;
                                c = c;
                            case SDK_ASSET_HEADER_BOLT_VALUE:
                                int i11 = (c == true ? 1 : 0) & 32768;
                                c = c;
                                if (i11 != 32768) {
                                    this.compilerPluginData_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 32768;
                                }
                                this.compilerPluginData_.add(codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                                z = z3;
                                c = c;
                            case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                                int i12 = (c == true ? 1 : 0) & PKIFailureInfo.signerNotTrusted;
                                c = c;
                                if (i12 != 524288) {
                                    this.extensionReceiverAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.extensionReceiverAnnotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z = z3;
                                c = c;
                            case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                                int i13 = (c == true ? 1 : 0) & PKIFailureInfo.badCertTemplate;
                                c = c;
                                if (i13 != 1048576) {
                                    this.backingFieldAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.backingFieldAnnotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z = z3;
                                c = c;
                            case SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE:
                                int i14 = (c == true ? 1 : 0) & PKIFailureInfo.badSenderNonce;
                                c = c;
                                if (i14 != 2097152) {
                                    this.delegateFieldAnnotation_ = new ArrayList();
                                    c = (c == true ? 1 : 0) | 0;
                                }
                                this.delegateFieldAnnotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                z = z3;
                                c = c;
                            case SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE:
                                Contract.Builder builder4 = (this.bitField0_ & 1024) == 1024 ? this.getterContract_.toBuilder() : null;
                                Contract contract = (Contract) codedInputStream.readMessage(Contract.PARSER, extensionRegistryLite);
                                this.getterContract_ = contract;
                                if (builder4 != null) {
                                    builder4.mergeFrom(contract);
                                    this.getterContract_ = builder4.buildPartial();
                                }
                                this.bitField0_ |= 1024;
                                z = z3;
                                c = c;
                            case 330:
                                try {
                                    Contract.Builder builder5 = (this.bitField0_ & 2048) == 2048 ? this.setterContract_.toBuilder() : null;
                                    Contract contract2 = (Contract) codedInputStream.readMessage(Contract.PARSER, extensionRegistryLite);
                                    this.setterContract_ = contract2;
                                    if (builder5 != null) {
                                        builder5.mergeFrom(contract2);
                                        this.setterContract_ = builder5.buildPartial();
                                    }
                                    this.bitField0_ |= 2048;
                                    z = z3;
                                    c = c;
                                } catch (InvalidProtocolBufferException e) {
                                    e = e;
                                    throw e.setUnfinishedMessage(this);
                                } catch (IOException e2) {
                                    e = e2;
                                    throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (((c == true ? 1 : 0) & 32) == 32) {
                                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                    }
                                    if (((c == true ? 1 : 0) & 256) == 256) {
                                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                    }
                                    if (((c == true ? 1 : 0) & 512) == 512) {
                                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                    }
                                    if (((c == true ? 1 : 0) & 65536) == 65536) {
                                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                                    }
                                    if (((c == true ? 1 : 0) & PKIFailureInfo.unsupportedVersion) == 131072) {
                                        this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                                    }
                                    if (((c == true ? 1 : 0) & PKIFailureInfo.transactionIdInUse) == 262144) {
                                        this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                                    }
                                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                                        this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                                    }
                                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                    }
                                    if (((c == true ? 1 : 0) & 32768) == 32768) {
                                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                                    }
                                    if (((c == true ? 1 : 0) & PKIFailureInfo.signerNotTrusted) == 524288) {
                                        this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                                    }
                                    if (((c == true ? 1 : 0) & PKIFailureInfo.badCertTemplate) == 1048576) {
                                        this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                                    }
                                    if (((c == true ? 1 : 0) & PKIFailureInfo.badSenderNonce) == 2097152) {
                                        this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                                    }
                                    try {
                                        newInstance.flush();
                                    } catch (IOException unused2) {
                                    } catch (Throwable th3) {
                                        this.unknownFields = newOutput.toByteString();
                                        throw th3;
                                    }
                                    this.unknownFields = newOutput.toByteString();
                                    makeExtensionsImmutable();
                                    throw th;
                                }
                            default:
                                if (parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                    z = z3;
                                    c = c;
                                }
                                z2 = z3;
                                z = z3;
                                c = c;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (InvalidProtocolBufferException e3) {
                    e = e3;
                } catch (IOException e4) {
                    e = e4;
                }
            }
        }

        public static Property getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(Property property) {
            return newBuilder().mergeFrom(property);
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public Annotation getBackingFieldAnnotation(int i) {
            return (Annotation) this.backingFieldAnnotation_.get(i);
        }

        public int getBackingFieldAnnotationCount() {
            return this.backingFieldAnnotation_.size();
        }

        public List<Annotation> getBackingFieldAnnotationList() {
            return this.backingFieldAnnotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return (CompilerPluginData) this.compilerPluginData_.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public ValueParameter getContextParameter(int i) {
            return (ValueParameter) this.contextParameter_.get(i);
        }

        public int getContextParameterCount() {
            return this.contextParameter_.size();
        }

        public List<ValueParameter> getContextParameterList() {
            return this.contextParameter_;
        }

        public Type getContextReceiverType(int i) {
            return (Type) this.contextReceiverType_.get(i);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        public Annotation getDelegateFieldAnnotation(int i) {
            return (Annotation) this.delegateFieldAnnotation_.get(i);
        }

        public int getDelegateFieldAnnotationCount() {
            return this.delegateFieldAnnotation_.size();
        }

        public List<Annotation> getDelegateFieldAnnotationList() {
            return this.delegateFieldAnnotation_;
        }

        public Annotation getExtensionReceiverAnnotation(int i) {
            return (Annotation) this.extensionReceiverAnnotation_.get(i);
        }

        public int getExtensionReceiverAnnotationCount() {
            return this.extensionReceiverAnnotation_.size();
        }

        public List<Annotation> getExtensionReceiverAnnotationList() {
            return this.extensionReceiverAnnotation_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public Annotation getGetterAnnotation(int i) {
            return (Annotation) this.getterAnnotation_.get(i);
        }

        public int getGetterAnnotationCount() {
            return this.getterAnnotation_.size();
        }

        public List<Annotation> getGetterAnnotationList() {
            return this.getterAnnotation_;
        }

        public Contract getGetterContract() {
            return this.getterContract_;
        }

        public int getGetterFlags() {
            return this.getterFlags_;
        }

        public int getName() {
            return this.name_;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Property> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.receiverType_;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public Type getReturnType() {
            return this.returnType_;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.oldFlags_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeMessageSize(3, this.returnType_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 32) == 32) {
                computeInt32Size += CodedOutputStream.computeMessageSize(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                computeInt32Size += CodedOutputStream.computeMessageSize(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                computeInt32Size += CodedOutputStream.computeInt32Size(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                computeInt32Size += CodedOutputStream.computeInt32Size(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeInt32Size(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                computeInt32Size += CodedOutputStream.computeInt32Size(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                computeInt32Size += CodedOutputStream.computeInt32Size(11, this.flags_);
            }
            for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(12, (MessageLite) this.contextReceiverType_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.contextReceiverTypeId_.size(); i5++) {
                i4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.contextReceiverTypeId_.get(i5)).intValue());
            }
            int i6 = computeInt32Size + i4;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.computeInt32SizeNoTag(i4);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = i4;
            for (int i7 = 0; i7 < this.annotation_.size(); i7++) {
                i6 += CodedOutputStream.computeMessageSize(14, (MessageLite) this.annotation_.get(i7));
            }
            for (int i8 = 0; i8 < this.getterAnnotation_.size(); i8++) {
                i6 += CodedOutputStream.computeMessageSize(15, (MessageLite) this.getterAnnotation_.get(i8));
            }
            for (int i9 = 0; i9 < this.setterAnnotation_.size(); i9++) {
                i6 += CodedOutputStream.computeMessageSize(16, (MessageLite) this.setterAnnotation_.get(i9));
            }
            for (int i10 = 0; i10 < this.contextParameter_.size(); i10++) {
                i6 += CodedOutputStream.computeMessageSize(17, (MessageLite) this.contextParameter_.get(i10));
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.versionRequirement_.size(); i12++) {
                i11 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.versionRequirement_.get(i12)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + i6 + i11;
            for (int i13 = 0; i13 < this.compilerPluginData_.size(); i13++) {
                size += CodedOutputStream.computeMessageSize(32, (MessageLite) this.compilerPluginData_.get(i13));
            }
            for (int i14 = 0; i14 < this.extensionReceiverAnnotation_.size(); i14++) {
                size += CodedOutputStream.computeMessageSize(33, (MessageLite) this.extensionReceiverAnnotation_.get(i14));
            }
            for (int i15 = 0; i15 < this.backingFieldAnnotation_.size(); i15++) {
                size += CodedOutputStream.computeMessageSize(34, (MessageLite) this.backingFieldAnnotation_.get(i15));
            }
            for (int i16 = 0; i16 < this.delegateFieldAnnotation_.size(); i16++) {
                size += CodedOutputStream.computeMessageSize(35, (MessageLite) this.delegateFieldAnnotation_.get(i16));
            }
            if ((this.bitField0_ & 1024) == 1024) {
                size += CodedOutputStream.computeMessageSize(40, this.getterContract_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                size += CodedOutputStream.computeMessageSize(41, this.setterContract_);
            }
            int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
            this.memoizedSerializedSize = size2;
            return size2;
        }

        public Annotation getSetterAnnotation(int i) {
            return (Annotation) this.setterAnnotation_.get(i);
        }

        public int getSetterAnnotationCount() {
            return this.setterAnnotation_.size();
        }

        public List<Annotation> getSetterAnnotationList() {
            return this.setterAnnotation_;
        }

        public Contract getSetterContract() {
            return this.setterContract_;
        }

        public int getSetterFlags() {
            return this.setterFlags_;
        }

        public ValueParameter getSetterValueParameter() {
            return this.setterValueParameter_;
        }

        public TypeParameter getTypeParameter(int i) {
            return (TypeParameter) this.typeParameter_.get(i);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasGetterContract() {
            return (this.bitField0_ & 1024) == 1024;
        }

        public boolean hasGetterFlags() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasSetterContract() {
            return (this.bitField0_ & 2048) == 2048;
        }

        public boolean hasSetterFlags() {
            return (this.bitField0_ & 512) == 512;
        }

        public boolean hasSetterValueParameter() {
            return (this.bitField0_ & 128) == 128;
        }

        public final void initFields$25() {
            this.flags_ = 518;
            this.oldFlags_ = 2054;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.contextParameter_ = list;
            this.setterValueParameter_ = ValueParameter.getDefaultInstance();
            this.getterFlags_ = 0;
            this.setterFlags_ = 0;
            this.versionRequirement_ = list;
            this.compilerPluginData_ = list;
            this.annotation_ = list;
            this.getterAnnotation_ = list;
            this.setterAnnotation_ = list;
            this.extensionReceiverAnnotation_ = list;
            this.backingFieldAnnotation_ = list;
            this.delegateFieldAnnotation_ = list;
            this.getterContract_ = Contract.getDefaultInstance();
            this.setterContract_ = Contract.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                if (!getContextReceiverType(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                if (!getContextParameter(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < getCompilerPluginDataCount(); i4++) {
                if (!getCompilerPluginData(i4).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getAnnotationCount(); i5++) {
                if (!getAnnotation(i5).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getGetterAnnotationCount(); i6++) {
                if (!getGetterAnnotation(i6).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getSetterAnnotationCount(); i7++) {
                if (!getSetterAnnotation(i7).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < getExtensionReceiverAnnotationCount(); i8++) {
                if (!getExtensionReceiverAnnotation(i8).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i9 = 0; i9 < getBackingFieldAnnotationCount(); i9++) {
                if (!getBackingFieldAnnotation(i9).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i10 = 0; i10 < getDelegateFieldAnnotationCount(); i10++) {
                if (!getDelegateFieldAnnotation(i10).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasGetterContract() && !getGetterContract().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSetterContract() && !getSetterContract().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(3, this.returnType_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeMessage(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.writeMessage(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.writeInt32(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeInt32(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeInt32(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(11, this.flags_);
            }
            for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
                codedOutputStream.writeMessage(12, (MessageLite) this.contextReceiverType_.get(i2));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(106);
                codedOutputStream.writeRawVarint32(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.contextReceiverTypeId_.get(i3)).intValue());
            }
            for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
                codedOutputStream.writeMessage(14, (MessageLite) this.annotation_.get(i4));
            }
            for (int i5 = 0; i5 < this.getterAnnotation_.size(); i5++) {
                codedOutputStream.writeMessage(15, (MessageLite) this.getterAnnotation_.get(i5));
            }
            for (int i6 = 0; i6 < this.setterAnnotation_.size(); i6++) {
                codedOutputStream.writeMessage(16, (MessageLite) this.setterAnnotation_.get(i6));
            }
            for (int i7 = 0; i7 < this.contextParameter_.size(); i7++) {
                codedOutputStream.writeMessage(17, (MessageLite) this.contextParameter_.get(i7));
            }
            for (int i8 = 0; i8 < this.versionRequirement_.size(); i8++) {
                codedOutputStream.writeInt32(31, ((Integer) this.versionRequirement_.get(i8)).intValue());
            }
            for (int i9 = 0; i9 < this.compilerPluginData_.size(); i9++) {
                codedOutputStream.writeMessage(32, (MessageLite) this.compilerPluginData_.get(i9));
            }
            for (int i10 = 0; i10 < this.extensionReceiverAnnotation_.size(); i10++) {
                codedOutputStream.writeMessage(33, (MessageLite) this.extensionReceiverAnnotation_.get(i10));
            }
            for (int i11 = 0; i11 < this.backingFieldAnnotation_.size(); i11++) {
                codedOutputStream.writeMessage(34, (MessageLite) this.backingFieldAnnotation_.get(i11));
            }
            for (int i12 = 0; i12 < this.delegateFieldAnnotation_.size(); i12++) {
                codedOutputStream.writeMessage(35, (MessageLite) this.delegateFieldAnnotation_.get(i12));
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.writeMessage(40, this.getterContract_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.writeMessage(41, this.setterContract_);
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {
            public List annotation_;
            public List backingFieldAnnotation_;
            public int bitField0_;
            public List compilerPluginData_;
            public List contextParameter_;
            public List contextReceiverTypeId_;
            public List contextReceiverType_;
            public List delegateFieldAnnotation_;
            public List extensionReceiverAnnotation_;
            public List getterAnnotation_;
            public Contract getterContract_;
            public int getterFlags_;
            public int name_;
            public int receiverTypeId_;
            public Type receiverType_;
            public int returnTypeId_;
            public List setterAnnotation_;
            public Contract setterContract_;
            public int setterFlags_;
            public ValueParameter setterValueParameter_;
            public List typeParameter_;
            public List versionRequirement_;
            public int flags_ = 518;
            public int oldFlags_ = 2054;
            public Type returnType_ = Type.getDefaultInstance();

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.typeParameter_ = list;
                this.receiverType_ = Type.getDefaultInstance();
                this.contextReceiverType_ = list;
                this.contextReceiverTypeId_ = list;
                this.contextParameter_ = list;
                this.setterValueParameter_ = ValueParameter.getDefaultInstance();
                this.versionRequirement_ = list;
                this.compilerPluginData_ = list;
                this.annotation_ = list;
                this.getterAnnotation_ = list;
                this.setterAnnotation_ = list;
                this.extensionReceiverAnnotation_ = list;
                this.backingFieldAnnotation_ = list;
                this.delegateFieldAnnotation_ = list;
                this.getterContract_ = Contract.getDefaultInstance();
                this.setterContract_ = Contract.getDefaultInstance();
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & 65536) != 65536) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 65536;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.annotation_);
                return this;
            }

            public Builder addAllBackingFieldAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & PKIFailureInfo.badCertTemplate) != 1048576) {
                    this.backingFieldAnnotation_ = new ArrayList(this.backingFieldAnnotation_);
                    this.bitField0_ |= PKIFailureInfo.badCertTemplate;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.backingFieldAnnotation_);
                return this;
            }

            public Builder addAllContextParameter(Iterable<? extends ValueParameter> iterable) {
                if ((this.bitField0_ & 1024) != 1024) {
                    this.contextParameter_ = new ArrayList(this.contextParameter_);
                    this.bitField0_ |= 1024;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.contextParameter_);
                return this;
            }

            public Builder addAllContextReceiverType(Iterable<? extends Type> iterable) {
                if ((this.bitField0_ & 256) != 256) {
                    this.contextReceiverType_ = new ArrayList(this.contextReceiverType_);
                    this.bitField0_ |= 256;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.contextReceiverType_);
                return this;
            }

            public Builder addAllDelegateFieldAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & PKIFailureInfo.badSenderNonce) != 2097152) {
                    this.delegateFieldAnnotation_ = new ArrayList(this.delegateFieldAnnotation_);
                    this.bitField0_ |= PKIFailureInfo.badSenderNonce;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.delegateFieldAnnotation_);
                return this;
            }

            public Builder addAllExtensionReceiverAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & PKIFailureInfo.signerNotTrusted) != 524288) {
                    this.extensionReceiverAnnotation_ = new ArrayList(this.extensionReceiverAnnotation_);
                    this.bitField0_ |= PKIFailureInfo.signerNotTrusted;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.extensionReceiverAnnotation_);
                return this;
            }

            public Builder addAllGetterAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & PKIFailureInfo.unsupportedVersion) != 131072) {
                    this.getterAnnotation_ = new ArrayList(this.getterAnnotation_);
                    this.bitField0_ |= PKIFailureInfo.unsupportedVersion;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.getterAnnotation_);
                return this;
            }

            public Builder addAllSetterAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & PKIFailureInfo.transactionIdInUse) != 262144) {
                    this.setterAnnotation_ = new ArrayList(this.setterAnnotation_);
                    this.bitField0_ |= PKIFailureInfo.transactionIdInUse;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.setterAnnotation_);
                return this;
            }

            public Builder addAllVersionRequirement(Iterable<? extends Integer> iterable) {
                if ((this.bitField0_ & 16384) != 16384) {
                    this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                    this.bitField0_ |= 16384;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.versionRequirement_);
                return this;
            }

            public Builder addTypeParameter(TypeParameter typeParameter) {
                typeParameter.getClass();
                if ((this.bitField0_ & 32) != 32) {
                    this.typeParameter_ = new ArrayList(this.typeParameter_);
                    this.bitField0_ |= 32;
                }
                this.typeParameter_.add(typeParameter);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Property build() {
                Property buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public Property buildPartial() {
                Property property = new Property(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                property.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.oldFlags_ = this.oldFlags_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.name_ = this.name_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.returnType_ = this.returnType_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.returnTypeId_ = this.returnTypeId_;
                if ((i & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -33;
                }
                property.typeParameter_ = this.typeParameter_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.receiverType_ = this.receiverType_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                property.receiverTypeId_ = this.receiverTypeId_;
                if ((this.bitField0_ & 256) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    this.bitField0_ &= -257;
                }
                property.contextReceiverType_ = this.contextReceiverType_;
                if ((this.bitField0_ & 512) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    this.bitField0_ &= -513;
                }
                property.contextReceiverTypeId_ = this.contextReceiverTypeId_;
                if ((this.bitField0_ & 1024) == 1024) {
                    this.contextParameter_ = Collections.unmodifiableList(this.contextParameter_);
                    this.bitField0_ &= -1025;
                }
                property.contextParameter_ = this.contextParameter_;
                if ((i & 2048) == 2048) {
                    i2 |= 128;
                }
                property.setterValueParameter_ = this.setterValueParameter_;
                if ((i & 4096) == 4096) {
                    i2 |= 256;
                }
                property.getterFlags_ = this.getterFlags_;
                if ((i & PKIFailureInfo.certRevoked) == 8192) {
                    i2 |= 512;
                }
                property.setterFlags_ = this.setterFlags_;
                if ((this.bitField0_ & 16384) == 16384) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -16385;
                }
                property.versionRequirement_ = this.versionRequirement_;
                if ((this.bitField0_ & 32768) == 32768) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    this.bitField0_ &= -32769;
                }
                property.compilerPluginData_ = this.compilerPluginData_;
                if ((this.bitField0_ & 65536) == 65536) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -65537;
                }
                property.annotation_ = this.annotation_;
                if ((this.bitField0_ & PKIFailureInfo.unsupportedVersion) == 131072) {
                    this.getterAnnotation_ = Collections.unmodifiableList(this.getterAnnotation_);
                    this.bitField0_ &= -131073;
                }
                property.getterAnnotation_ = this.getterAnnotation_;
                if ((this.bitField0_ & PKIFailureInfo.transactionIdInUse) == 262144) {
                    this.setterAnnotation_ = Collections.unmodifiableList(this.setterAnnotation_);
                    this.bitField0_ &= -262145;
                }
                property.setterAnnotation_ = this.setterAnnotation_;
                if ((this.bitField0_ & PKIFailureInfo.signerNotTrusted) == 524288) {
                    this.extensionReceiverAnnotation_ = Collections.unmodifiableList(this.extensionReceiverAnnotation_);
                    this.bitField0_ &= -524289;
                }
                property.extensionReceiverAnnotation_ = this.extensionReceiverAnnotation_;
                if ((this.bitField0_ & PKIFailureInfo.badCertTemplate) == 1048576) {
                    this.backingFieldAnnotation_ = Collections.unmodifiableList(this.backingFieldAnnotation_);
                    this.bitField0_ &= -1048577;
                }
                property.backingFieldAnnotation_ = this.backingFieldAnnotation_;
                if ((this.bitField0_ & PKIFailureInfo.badSenderNonce) == 2097152) {
                    this.delegateFieldAnnotation_ = Collections.unmodifiableList(this.delegateFieldAnnotation_);
                    this.bitField0_ &= -2097153;
                }
                property.delegateFieldAnnotation_ = this.delegateFieldAnnotation_;
                if ((i & 4194304) == 4194304) {
                    i2 |= 1024;
                }
                property.getterContract_ = this.getterContract_;
                if ((i & 8388608) == 8388608) {
                    i2 |= 2048;
                }
                property.setterContract_ = this.setterContract_;
                property.bitField0_ = i2;
                return property;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.annotation_.get(i);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public Annotation getBackingFieldAnnotation(int i) {
                return (Annotation) this.backingFieldAnnotation_.get(i);
            }

            public int getBackingFieldAnnotationCount() {
                return this.backingFieldAnnotation_.size();
            }

            public CompilerPluginData getCompilerPluginData(int i) {
                return (CompilerPluginData) this.compilerPluginData_.get(i);
            }

            public int getCompilerPluginDataCount() {
                return this.compilerPluginData_.size();
            }

            public ValueParameter getContextParameter(int i) {
                return (ValueParameter) this.contextParameter_.get(i);
            }

            public int getContextParameterCount() {
                return this.contextParameter_.size();
            }

            public Type getContextReceiverType(int i) {
                return (Type) this.contextReceiverType_.get(i);
            }

            public int getContextReceiverTypeCount() {
                return this.contextReceiverType_.size();
            }

            public Annotation getDelegateFieldAnnotation(int i) {
                return (Annotation) this.delegateFieldAnnotation_.get(i);
            }

            public int getDelegateFieldAnnotationCount() {
                return this.delegateFieldAnnotation_.size();
            }

            public Annotation getExtensionReceiverAnnotation(int i) {
                return (Annotation) this.extensionReceiverAnnotation_.get(i);
            }

            public int getExtensionReceiverAnnotationCount() {
                return this.extensionReceiverAnnotation_.size();
            }

            public Annotation getGetterAnnotation(int i) {
                return (Annotation) this.getterAnnotation_.get(i);
            }

            public int getGetterAnnotationCount() {
                return this.getterAnnotation_.size();
            }

            public Contract getGetterContract() {
                return this.getterContract_;
            }

            public Type getReceiverType() {
                return this.receiverType_;
            }

            public Type getReturnType() {
                return this.returnType_;
            }

            public Annotation getSetterAnnotation(int i) {
                return (Annotation) this.setterAnnotation_.get(i);
            }

            public int getSetterAnnotationCount() {
                return this.setterAnnotation_.size();
            }

            public Contract getSetterContract() {
                return this.setterContract_;
            }

            public ValueParameter getSetterValueParameter() {
                return this.setterValueParameter_;
            }

            public TypeParameter getTypeParameter(int i) {
                return (TypeParameter) this.typeParameter_.get(i);
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public boolean hasGetterContract() {
                return (this.bitField0_ & 4194304) == 4194304;
            }

            public boolean hasName() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.bitField0_ & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasSetterContract() {
                return (this.bitField0_ & 8388608) == 8388608;
            }

            public boolean hasSetterValueParameter() {
                return (this.bitField0_ & 2048) == 2048;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                    if (!getContextReceiverType(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getContextParameterCount(); i3++) {
                    if (!getContextParameter(i3).isInitialized()) {
                        return false;
                    }
                }
                if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                    return false;
                }
                for (int i4 = 0; i4 < getCompilerPluginDataCount(); i4++) {
                    if (!getCompilerPluginData(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getAnnotationCount(); i5++) {
                    if (!getAnnotation(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getGetterAnnotationCount(); i6++) {
                    if (!getGetterAnnotation(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < getSetterAnnotationCount(); i7++) {
                    if (!getSetterAnnotation(i7).isInitialized()) {
                        return false;
                    }
                }
                for (int i8 = 0; i8 < getExtensionReceiverAnnotationCount(); i8++) {
                    if (!getExtensionReceiverAnnotation(i8).isInitialized()) {
                        return false;
                    }
                }
                for (int i9 = 0; i9 < getBackingFieldAnnotationCount(); i9++) {
                    if (!getBackingFieldAnnotation(i9).isInitialized()) {
                        return false;
                    }
                }
                for (int i10 = 0; i10 < getDelegateFieldAnnotationCount(); i10++) {
                    if (!getDelegateFieldAnnotation(i10).isInitialized()) {
                        return false;
                    }
                }
                if (!hasGetterContract() || getGetterContract().isInitialized()) {
                    return (!hasSetterContract() || getSetterContract().isInitialized()) && this.extensions.isInitialized();
                }
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = property.typeParameter_;
                        this.bitField0_ &= -33;
                    } else {
                        if ((this.bitField0_ & 32) != 32) {
                            this.typeParameter_ = new ArrayList(this.typeParameter_);
                            this.bitField0_ |= 32;
                        }
                        this.typeParameter_.addAll(property.typeParameter_);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (!property.contextReceiverType_.isEmpty()) {
                    if (this.contextReceiverType_.isEmpty()) {
                        this.contextReceiverType_ = property.contextReceiverType_;
                        this.bitField0_ &= -257;
                    } else {
                        if ((this.bitField0_ & 256) != 256) {
                            this.contextReceiverType_ = new ArrayList(this.contextReceiverType_);
                            this.bitField0_ |= 256;
                        }
                        this.contextReceiverType_.addAll(property.contextReceiverType_);
                    }
                }
                if (!property.contextReceiverTypeId_.isEmpty()) {
                    if (this.contextReceiverTypeId_.isEmpty()) {
                        this.contextReceiverTypeId_ = property.contextReceiverTypeId_;
                        this.bitField0_ &= -513;
                    } else {
                        if ((this.bitField0_ & 512) != 512) {
                            this.contextReceiverTypeId_ = new ArrayList(this.contextReceiverTypeId_);
                            this.bitField0_ |= 512;
                        }
                        this.contextReceiverTypeId_.addAll(property.contextReceiverTypeId_);
                    }
                }
                if (!property.contextParameter_.isEmpty()) {
                    if (this.contextParameter_.isEmpty()) {
                        this.contextParameter_ = property.contextParameter_;
                        this.bitField0_ &= -1025;
                    } else {
                        if ((this.bitField0_ & 1024) != 1024) {
                            this.contextParameter_ = new ArrayList(this.contextParameter_);
                            this.bitField0_ |= 1024;
                        }
                        this.contextParameter_.addAll(property.contextParameter_);
                    }
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = property.versionRequirement_;
                        this.bitField0_ &= -16385;
                    } else {
                        if ((this.bitField0_ & 16384) != 16384) {
                            this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                            this.bitField0_ |= 16384;
                        }
                        this.versionRequirement_.addAll(property.versionRequirement_);
                    }
                }
                if (!property.compilerPluginData_.isEmpty()) {
                    if (this.compilerPluginData_.isEmpty()) {
                        this.compilerPluginData_ = property.compilerPluginData_;
                        this.bitField0_ &= -32769;
                    } else {
                        if ((this.bitField0_ & 32768) != 32768) {
                            this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
                            this.bitField0_ |= 32768;
                        }
                        this.compilerPluginData_.addAll(property.compilerPluginData_);
                    }
                }
                if (!property.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = property.annotation_;
                        this.bitField0_ &= -65537;
                    } else {
                        if ((this.bitField0_ & 65536) != 65536) {
                            this.annotation_ = new ArrayList(this.annotation_);
                            this.bitField0_ |= 65536;
                        }
                        this.annotation_.addAll(property.annotation_);
                    }
                }
                if (!property.getterAnnotation_.isEmpty()) {
                    if (this.getterAnnotation_.isEmpty()) {
                        this.getterAnnotation_ = property.getterAnnotation_;
                        this.bitField0_ &= -131073;
                    } else {
                        if ((this.bitField0_ & PKIFailureInfo.unsupportedVersion) != 131072) {
                            this.getterAnnotation_ = new ArrayList(this.getterAnnotation_);
                            this.bitField0_ |= PKIFailureInfo.unsupportedVersion;
                        }
                        this.getterAnnotation_.addAll(property.getterAnnotation_);
                    }
                }
                if (!property.setterAnnotation_.isEmpty()) {
                    if (this.setterAnnotation_.isEmpty()) {
                        this.setterAnnotation_ = property.setterAnnotation_;
                        this.bitField0_ &= -262145;
                    } else {
                        if ((this.bitField0_ & PKIFailureInfo.transactionIdInUse) != 262144) {
                            this.setterAnnotation_ = new ArrayList(this.setterAnnotation_);
                            this.bitField0_ |= PKIFailureInfo.transactionIdInUse;
                        }
                        this.setterAnnotation_.addAll(property.setterAnnotation_);
                    }
                }
                if (!property.extensionReceiverAnnotation_.isEmpty()) {
                    if (this.extensionReceiverAnnotation_.isEmpty()) {
                        this.extensionReceiverAnnotation_ = property.extensionReceiverAnnotation_;
                        this.bitField0_ &= -524289;
                    } else {
                        if ((this.bitField0_ & PKIFailureInfo.signerNotTrusted) != 524288) {
                            this.extensionReceiverAnnotation_ = new ArrayList(this.extensionReceiverAnnotation_);
                            this.bitField0_ |= PKIFailureInfo.signerNotTrusted;
                        }
                        this.extensionReceiverAnnotation_.addAll(property.extensionReceiverAnnotation_);
                    }
                }
                if (!property.backingFieldAnnotation_.isEmpty()) {
                    if (this.backingFieldAnnotation_.isEmpty()) {
                        this.backingFieldAnnotation_ = property.backingFieldAnnotation_;
                        this.bitField0_ &= -1048577;
                    } else {
                        if ((this.bitField0_ & PKIFailureInfo.badCertTemplate) != 1048576) {
                            this.backingFieldAnnotation_ = new ArrayList(this.backingFieldAnnotation_);
                            this.bitField0_ |= PKIFailureInfo.badCertTemplate;
                        }
                        this.backingFieldAnnotation_.addAll(property.backingFieldAnnotation_);
                    }
                }
                if (!property.delegateFieldAnnotation_.isEmpty()) {
                    if (this.delegateFieldAnnotation_.isEmpty()) {
                        this.delegateFieldAnnotation_ = property.delegateFieldAnnotation_;
                        this.bitField0_ &= -2097153;
                    } else {
                        if ((this.bitField0_ & PKIFailureInfo.badSenderNonce) != 2097152) {
                            this.delegateFieldAnnotation_ = new ArrayList(this.delegateFieldAnnotation_);
                            this.bitField0_ |= PKIFailureInfo.badSenderNonce;
                        }
                        this.delegateFieldAnnotation_.addAll(property.delegateFieldAnnotation_);
                    }
                }
                if (property.hasGetterContract()) {
                    mergeGetterContract(property.getGetterContract());
                }
                if (property.hasSetterContract()) {
                    mergeSetterContract(property.getSetterContract());
                }
                mergeExtensionFields(property);
                setUnknownFields(getUnknownFields().concat(property.unknownFields));
                return this;
            }

            public Builder mergeGetterContract(Contract contract) {
                if ((this.bitField0_ & 4194304) != 4194304 || this.getterContract_ == Contract.getDefaultInstance()) {
                    this.getterContract_ = contract;
                } else {
                    this.getterContract_ = Contract.newBuilder(this.getterContract_).mergeFrom(contract).buildPartial();
                }
                this.bitField0_ |= 4194304;
                return this;
            }

            public Builder mergeReceiverType(Type type2) {
                if ((this.bitField0_ & 64) != 64 || this.receiverType_ == Type.getDefaultInstance()) {
                    this.receiverType_ = type2;
                } else {
                    this.receiverType_ = Type.newBuilder(this.receiverType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type2) {
                if ((this.bitField0_ & 8) != 8 || this.returnType_ == Type.getDefaultInstance()) {
                    this.returnType_ = type2;
                } else {
                    this.returnType_ = Type.newBuilder(this.returnType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeSetterContract(Contract contract) {
                if ((this.bitField0_ & 8388608) != 8388608 || this.setterContract_ == Contract.getDefaultInstance()) {
                    this.setterContract_ = contract;
                } else {
                    this.setterContract_ = Contract.newBuilder(this.setterContract_).mergeFrom(contract).buildPartial();
                }
                this.bitField0_ |= 8388608;
                return this;
            }

            public Builder mergeSetterValueParameter(ValueParameter valueParameter) {
                if ((this.bitField0_ & 2048) != 2048 || this.setterValueParameter_ == ValueParameter.getDefaultInstance()) {
                    this.setterValueParameter_ = valueParameter;
                } else {
                    this.setterValueParameter_ = ValueParameter.newBuilder(this.setterValueParameter_).mergeFrom(valueParameter).buildPartial();
                }
                this.bitField0_ |= 2048;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setGetterFlags(int i) {
                this.bitField0_ |= 4096;
                this.getterFlags_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 4;
                this.name_ = i;
                return this;
            }

            public Builder setOldFlags(int i) {
                this.bitField0_ |= 2;
                this.oldFlags_ = i;
                return this;
            }

            public Builder setReceiverType(Type type2) {
                type2.getClass();
                this.receiverType_ = type2;
                this.bitField0_ |= 64;
                return this;
            }

            public Builder setReceiverTypeId(int i) {
                this.bitField0_ |= 128;
                this.receiverTypeId_ = i;
                return this;
            }

            public Builder setReturnType(Type type2) {
                type2.getClass();
                this.returnType_ = type2;
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setReturnTypeId(int i) {
                this.bitField0_ |= 16;
                this.returnTypeId_ = i;
                return this;
            }

            public Builder setSetterFlags(int i) {
                this.bitField0_ |= PKIFailureInfo.certRevoked;
                this.setterFlags_ = i;
                return this;
            }

            public Builder setSetterValueParameter(ValueParameter valueParameter) {
                valueParameter.getClass();
                this.setterValueParameter_ = valueParameter;
                this.bitField0_ |= 2048;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Property property = null;
                try {
                    try {
                        Property parsePartialFrom = Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Property property2 = (Property) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            property = property2;
                            if (property != null) {
                                mergeFrom(property);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (property != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Property getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Property() {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public Property(Builder builder) {
            super(builder);
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new AnonymousClass1();
        public static final StringTable defaultInstance;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public LazyStringList string_;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StringTable(codedInputStream);
            }
        }

        static {
            StringTable stringTable = new StringTable();
            defaultInstance = stringTable;
            stringTable.string_ = LazyStringArrayList.EMPTY;
        }

        public StringTable(CodedInputStream codedInputStream) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.string_ = LazyStringArrayList.EMPTY;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                ByteString readBytes = codedInputStream.readBytes();
                                if (!z2) {
                                    this.string_ = new LazyStringArrayList();
                                    z2 = true;
                                }
                                this.string_.add(readBytes);
                            } else if (!codedInputStream.skipField(readTag, newInstance)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2) {
                            this.string_ = this.string_.getUnmodifiableView();
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2) {
                this.string_ = this.string_.getUnmodifiableView();
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
        }

        public static StringTable getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.string_.size(); i3++) {
                i2 += CodedOutputStream.computeBytesSizeNoTag(this.string_.getByteString(i3));
            }
            int size = this.unknownFields.size() + getStringList().size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        public String getString(int i) {
            return this.string_.get(i);
        }

        public ProtocolStringList getStringList() {
            return this.string_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.string_.size(); i++) {
                codedOutputStream.writeBytes(1, this.string_.getByteString(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {
            public int bitField0_;
            public LazyStringList string_ = LazyStringArrayList.EMPTY;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTable build() {
                StringTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public StringTable buildPartial() {
                StringTable stringTable = new StringTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.string_ = this.string_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                stringTable.string_ = this.string_;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.string_.isEmpty()) {
                    if (this.string_.isEmpty()) {
                        this.string_ = stringTable.string_;
                        this.bitField0_ &= -2;
                    } else {
                        if ((this.bitField0_ & 1) != 1) {
                            this.string_ = new LazyStringArrayList(this.string_);
                            this.bitField0_ |= 1;
                        }
                        this.string_.addAll(stringTable.string_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                StringTable stringTable = null;
                try {
                    try {
                        StringTable parsePartialFrom = StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        StringTable stringTable2 = (StringTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                                mergeFrom(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (stringTable != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public StringTable() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public StringTable(Builder builder) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static Parser<TypeAlias> PARSER = new AnonymousClass1();
        public static final TypeAlias defaultInstance;
        public List annotation_;
        public int bitField0_;
        public List compilerPluginData_;
        public int expandedTypeId_;
        public Type expandedType_;
        public int flags_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public int name_;
        public List typeParameter_;
        public int underlyingTypeId_;
        public Type underlyingType_;
        public final ByteString unknownFields;
        public List versionRequirement_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias();
            defaultInstance = typeAlias;
            typeAlias.initFields$26();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        public TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Type.Builder builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields$26();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            int i = 0;
            while (true) {
                ?? r5 = 128;
                if (z) {
                    if ((i & 4) == 4) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i & 128) == 128) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i & 256) == 256) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    if ((i & 512) == 512) {
                        this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                    this.unknownFields = newOutput.toByteString();
                    makeExtensionsImmutable();
                    return;
                }
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                            case 8:
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                            case 16:
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.readInt32();
                            case 26:
                                if ((i & 4) != 4) {
                                    this.typeParameter_ = new ArrayList();
                                    i |= 4;
                                }
                                this.typeParameter_.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                            case 34:
                                builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.underlyingType_ = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.underlyingType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 4;
                            case 40:
                                this.bitField0_ |= 8;
                                this.underlyingTypeId_ = codedInputStream.readInt32();
                            case 50:
                                builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                                Type type3 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.expandedType_ = type3;
                                if (builder != null) {
                                    builder.mergeFrom(type3);
                                    this.expandedType_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 16;
                            case 56:
                                this.bitField0_ |= 32;
                                this.expandedTypeId_ = codedInputStream.readInt32();
                            case 66:
                                if ((i & 128) != 128) {
                                    this.annotation_ = new ArrayList();
                                    i |= 128;
                                }
                                this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                                if ((i & 256) != 256) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 256;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit);
                                break;
                            case SDK_ASSET_HEADER_BOLT_VALUE:
                                if ((i & 512) != 512) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 512;
                                }
                                this.compilerPluginData_.add(codedInputStream.readMessage(CompilerPluginData.PARSER, extensionRegistryLite));
                            default:
                                r5 = parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag);
                                if (r5 == 0) {
                                    z = true;
                                }
                        }
                    } catch (Throwable th2) {
                        if ((i & 4) == 4) {
                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                        }
                        if ((i & 128) == r5) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                        }
                        if ((i & 256) == 256) {
                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                        }
                        if ((i & 512) == 512) {
                            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.unknownFields = newOutput.toByteString();
                            throw th3;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
        }

        public static TypeAlias getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public CompilerPluginData getCompilerPluginData(int i) {
            return (CompilerPluginData) this.compilerPluginData_.get(i);
        }

        public int getCompilerPluginDataCount() {
            return this.compilerPluginData_.size();
        }

        public Type getExpandedType() {
            return this.expandedType_;
        }

        public int getExpandedTypeId() {
            return this.expandedTypeId_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeAlias> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.typeParameter_.get(i2));
            }
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeMessageSize(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeInt32Size(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeMessageSize(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                computeInt32Size += CodedOutputStream.computeInt32Size(7, this.expandedTypeId_);
            }
            for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(8, (MessageLite) this.annotation_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
                i4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.versionRequirement_.get(i5)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + computeInt32Size + i4;
            for (int i6 = 0; i6 < this.compilerPluginData_.size(); i6++) {
                size += CodedOutputStream.computeMessageSize(32, (MessageLite) this.compilerPluginData_.get(i6));
            }
            int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
            this.memoizedSerializedSize = size2;
            return size2;
        }

        public TypeParameter getTypeParameter(int i) {
            return (TypeParameter) this.typeParameter_.get(i);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public Type getUnderlyingType() {
            return this.underlyingType_;
        }

        public int getUnderlyingTypeId() {
            return this.underlyingTypeId_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasExpandedType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasExpandedTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasUnderlyingType() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        public final void initFields$26() {
            this.flags_ = 6;
            this.name_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.underlyingType_ = Type.getDefaultInstance();
            this.underlyingTypeId_ = 0;
            this.expandedType_ = Type.getDefaultInstance();
            this.expandedTypeId_ = 0;
            this.annotation_ = list;
            this.versionRequirement_ = list;
            this.compilerPluginData_ = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getCompilerPluginDataCount(); i3++) {
                if (!getCompilerPluginData(i3).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.typeParameter_.get(i));
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(7, this.expandedTypeId_);
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                codedOutputStream.writeMessage(8, (MessageLite) this.annotation_.get(i2));
            }
            for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
                codedOutputStream.writeInt32(31, ((Integer) this.versionRequirement_.get(i3)).intValue());
            }
            for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
                codedOutputStream.writeMessage(32, (MessageLite) this.compilerPluginData_.get(i4));
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {
            public List annotation_;
            public int bitField0_;
            public List compilerPluginData_;
            public int expandedTypeId_;
            public Type expandedType_;
            public int flags_ = 6;
            public int name_;
            public List typeParameter_;
            public int underlyingTypeId_;
            public Type underlyingType_;
            public List versionRequirement_;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.typeParameter_ = list;
                this.underlyingType_ = Type.getDefaultInstance();
                this.expandedType_ = Type.getDefaultInstance();
                this.annotation_ = list;
                this.versionRequirement_ = list;
                this.compilerPluginData_ = list;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeAlias build() {
                TypeAlias buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public TypeAlias buildPartial() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeAlias.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.name_ = this.name_;
                if ((i & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    this.bitField0_ &= -5;
                }
                typeAlias.typeParameter_ = this.typeParameter_;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.underlyingType_ = this.underlyingType_;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.underlyingTypeId_ = this.underlyingTypeId_;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.expandedType_ = this.expandedType_;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.expandedTypeId_ = this.expandedTypeId_;
                if ((this.bitField0_ & 128) == 128) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -129;
                }
                typeAlias.annotation_ = this.annotation_;
                if ((this.bitField0_ & 256) == 256) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    this.bitField0_ &= -257;
                }
                typeAlias.versionRequirement_ = this.versionRequirement_;
                if ((this.bitField0_ & 512) == 512) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                    this.bitField0_ &= -513;
                }
                typeAlias.compilerPluginData_ = this.compilerPluginData_;
                typeAlias.bitField0_ = i2;
                return typeAlias;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.annotation_.get(i);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public CompilerPluginData getCompilerPluginData(int i) {
                return (CompilerPluginData) this.compilerPluginData_.get(i);
            }

            public int getCompilerPluginDataCount() {
                return this.compilerPluginData_.size();
            }

            public Type getExpandedType() {
                return this.expandedType_;
            }

            public TypeParameter getTypeParameter(int i) {
                return (TypeParameter) this.typeParameter_.get(i);
            }

            public int getTypeParameterCount() {
                return this.typeParameter_.size();
            }

            public Type getUnderlyingType() {
                return this.underlyingType_;
            }

            public boolean hasExpandedType() {
                return (this.bitField0_ & 32) == 32;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasUnderlyingType() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getCompilerPluginDataCount(); i3++) {
                    if (!getCompilerPluginData(i3).isInitialized()) {
                        return false;
                    }
                }
                return this.extensions.isInitialized();
            }

            public Builder mergeExpandedType(Type type2) {
                if ((this.bitField0_ & 32) != 32 || this.expandedType_ == Type.getDefaultInstance()) {
                    this.expandedType_ = type2;
                } else {
                    this.expandedType_ = Type.newBuilder(this.expandedType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 32;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.typeParameter_.isEmpty()) {
                    if (this.typeParameter_.isEmpty()) {
                        this.typeParameter_ = typeAlias.typeParameter_;
                        this.bitField0_ &= -5;
                    } else {
                        if ((this.bitField0_ & 4) != 4) {
                            this.typeParameter_ = new ArrayList(this.typeParameter_);
                            this.bitField0_ |= 4;
                        }
                        this.typeParameter_.addAll(typeAlias.typeParameter_);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = typeAlias.annotation_;
                        this.bitField0_ &= -129;
                    } else {
                        if ((this.bitField0_ & 128) != 128) {
                            this.annotation_ = new ArrayList(this.annotation_);
                            this.bitField0_ |= 128;
                        }
                        this.annotation_.addAll(typeAlias.annotation_);
                    }
                }
                if (!typeAlias.versionRequirement_.isEmpty()) {
                    if (this.versionRequirement_.isEmpty()) {
                        this.versionRequirement_ = typeAlias.versionRequirement_;
                        this.bitField0_ &= -257;
                    } else {
                        if ((this.bitField0_ & 256) != 256) {
                            this.versionRequirement_ = new ArrayList(this.versionRequirement_);
                            this.bitField0_ |= 256;
                        }
                        this.versionRequirement_.addAll(typeAlias.versionRequirement_);
                    }
                }
                if (!typeAlias.compilerPluginData_.isEmpty()) {
                    if (this.compilerPluginData_.isEmpty()) {
                        this.compilerPluginData_ = typeAlias.compilerPluginData_;
                        this.bitField0_ &= -513;
                    } else {
                        if ((this.bitField0_ & 512) != 512) {
                            this.compilerPluginData_ = new ArrayList(this.compilerPluginData_);
                            this.bitField0_ |= 512;
                        }
                        this.compilerPluginData_.addAll(typeAlias.compilerPluginData_);
                    }
                }
                mergeExtensionFields(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.unknownFields));
                return this;
            }

            public Builder mergeUnderlyingType(Type type2) {
                if ((this.bitField0_ & 8) != 8 || this.underlyingType_ == Type.getDefaultInstance()) {
                    this.underlyingType_ = type2;
                } else {
                    this.underlyingType_ = Type.newBuilder(this.underlyingType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setExpandedTypeId(int i) {
                this.bitField0_ |= 64;
                this.expandedTypeId_ = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public Builder setUnderlyingTypeId(int i) {
                this.bitField0_ |= 16;
                this.underlyingTypeId_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                TypeAlias typeAlias = null;
                try {
                    try {
                        TypeAlias parsePartialFrom = TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TypeAlias typeAlias2 = (TypeAlias) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                                mergeFrom(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeAlias != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeAlias getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public TypeAlias() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public TypeAlias(Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static Parser<TypeParameter> PARSER = new AnonymousClass1();
        public static final TypeParameter defaultInstance;
        public List annotation_;
        public int bitField0_;
        public int id_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public int name_;
        public boolean reified_;
        public final ByteString unknownFields;
        public int upperBoundIdMemoizedSerializedSize;
        public List upperBoundId_;
        public List upperBound_;
        public Variance variance_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0),
            OUT(1),
            INV(2);

            public final int value;

            Variance(int i) {
                this.value = i;
            }

            public static Variance valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i != 2) {
                    return null;
                }
                return INV;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter();
            defaultInstance = typeParameter;
            typeParameter.id_ = 0;
            typeParameter.name_ = 0;
            typeParameter.reified_ = false;
            typeParameter.variance_ = Variance.INV;
            List list = Collections.EMPTY_LIST;
            typeParameter.upperBound_ = list;
            typeParameter.upperBoundId_ = list;
            typeParameter.annotation_ = list;
        }

        public TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.id_ = 0;
            this.name_ = 0;
            this.reified_ = false;
            this.variance_ = Variance.INV;
            List list = Collections.EMPTY_LIST;
            this.upperBound_ = list;
            this.upperBoundId_ = list;
            this.annotation_ = list;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            int i = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                this.bitField0_ |= 4;
                                this.reified_ = codedInputStream.readBool();
                            } else if (readTag == 32) {
                                int readEnum = codedInputStream.readEnum();
                                Variance valueOf = Variance.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.variance_ = valueOf;
                                }
                            } else if (readTag == 42) {
                                if ((i & 16) != 16) {
                                    this.upperBound_ = new ArrayList();
                                    i |= 16;
                                }
                                this.upperBound_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (readTag == 48) {
                                if ((i & 32) != 32) {
                                    this.upperBoundId_ = new ArrayList();
                                    i |= 32;
                                }
                                this.upperBoundId_.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (readTag == 50) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.upperBoundId_ = new ArrayList();
                                    i |= 32;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.upperBoundId_.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 802) {
                                if ((i & 64) != 64) {
                                    this.annotation_ = new ArrayList();
                                    i |= 64;
                                }
                                this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i & 16) == 16) {
                            this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                        }
                        if ((i & 32) == 32) {
                            this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                        }
                        if ((i & 64) == 64) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i & 16) == 16) {
                this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
            }
            if ((i & 32) == 32) {
                this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
            }
            if ((i & 64) == 64) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        public static TypeParameter getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public int getId() {
            return this.id_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeParameter> getParserForType() {
            return PARSER;
        }

        public boolean getReified() {
            return this.reified_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeBoolSize(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeEnumSize(4, this.variance_.getNumber());
            }
            for (int i2 = 0; i2 < this.upperBound_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(5, (MessageLite) this.upperBound_.get(i2));
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.upperBoundId_.size(); i4++) {
                i3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.upperBoundId_.get(i4)).intValue());
            }
            int i5 = computeInt32Size + i3;
            if (!getUpperBoundIdList().isEmpty()) {
                i5 = i5 + 1 + CodedOutputStream.computeInt32SizeNoTag(i3);
            }
            this.upperBoundIdMemoizedSerializedSize = i3;
            for (int i6 = 0; i6 < this.annotation_.size(); i6++) {
                i5 += CodedOutputStream.computeMessageSize(100, (MessageLite) this.annotation_.get(i6));
            }
            int size = this.unknownFields.size() + extensionsSerializedSize() + i5;
            this.memoizedSerializedSize = size;
            return size;
        }

        public Type getUpperBound(int i) {
            return (Type) this.upperBound_.get(i);
        }

        public int getUpperBoundCount() {
            return this.upperBound_.size();
        }

        public List<Integer> getUpperBoundIdList() {
            return this.upperBoundId_;
        }

        public List<Type> getUpperBoundList() {
            return this.upperBound_;
        }

        public Variance getVariance() {
            return this.variance_;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReified() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasVariance() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUpperBoundCount(); i++) {
                if (!getUpperBound(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBool(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeEnum(4, this.variance_.getNumber());
            }
            for (int i = 0; i < this.upperBound_.size(); i++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.upperBound_.get(i));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.upperBoundIdMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.upperBoundId_.get(i2)).intValue());
            }
            for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
                codedOutputStream.writeMessage(100, (MessageLite) this.annotation_.get(i3));
            }
            extensionWriter.writeUntil(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {
            public List annotation_;
            public int bitField0_;
            public int id_;
            public int name_;
            public boolean reified_;
            public List upperBoundId_;
            public List upperBound_;
            public Variance variance_ = Variance.INV;

            public Builder() {
                List list = Collections.EMPTY_LIST;
                this.upperBound_ = list;
                this.upperBoundId_ = list;
                this.annotation_ = list;
            }

            public Builder addAnnotation(Annotation annotation) {
                annotation.getClass();
                if ((this.bitField0_ & 64) != 64) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 64;
                }
                this.annotation_.add(annotation);
                return this;
            }

            public Builder addUpperBound(Type type2) {
                type2.getClass();
                if ((this.bitField0_ & 16) != 16) {
                    this.upperBound_ = new ArrayList(this.upperBound_);
                    this.bitField0_ |= 16;
                }
                this.upperBound_.add(type2);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeParameter build() {
                TypeParameter buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public TypeParameter buildPartial() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeParameter.id_ = this.id_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.name_ = this.name_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.reified_ = this.reified_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.variance_ = this.variance_;
                if ((i & 16) == 16) {
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    this.bitField0_ &= -17;
                }
                typeParameter.upperBound_ = this.upperBound_;
                if ((this.bitField0_ & 32) == 32) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                    this.bitField0_ &= -33;
                }
                typeParameter.upperBoundId_ = this.upperBoundId_;
                if ((this.bitField0_ & 64) == 64) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -65;
                }
                typeParameter.annotation_ = this.annotation_;
                typeParameter.bitField0_ = i2;
                return typeParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.annotation_.get(i);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public Type getUpperBound(int i) {
                return (Type) this.upperBound_.get(i);
            }

            public int getUpperBoundCount() {
                return this.upperBound_.size();
            }

            public boolean hasId() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i = 0; i < getUpperBoundCount(); i++) {
                    if (!getUpperBound(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                return this.extensions.isInitialized();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.upperBound_.isEmpty()) {
                    if (this.upperBound_.isEmpty()) {
                        this.upperBound_ = typeParameter.upperBound_;
                        this.bitField0_ &= -17;
                    } else {
                        if ((this.bitField0_ & 16) != 16) {
                            this.upperBound_ = new ArrayList(this.upperBound_);
                            this.bitField0_ |= 16;
                        }
                        this.upperBound_.addAll(typeParameter.upperBound_);
                    }
                }
                if (!typeParameter.upperBoundId_.isEmpty()) {
                    if (this.upperBoundId_.isEmpty()) {
                        this.upperBoundId_ = typeParameter.upperBoundId_;
                        this.bitField0_ &= -33;
                    } else {
                        if ((this.bitField0_ & 32) != 32) {
                            this.upperBoundId_ = new ArrayList(this.upperBoundId_);
                            this.bitField0_ |= 32;
                        }
                        this.upperBoundId_.addAll(typeParameter.upperBoundId_);
                    }
                }
                if (!typeParameter.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = typeParameter.annotation_;
                        this.bitField0_ &= -65;
                    } else {
                        if ((this.bitField0_ & 64) != 64) {
                            this.annotation_ = new ArrayList(this.annotation_);
                            this.bitField0_ |= 64;
                        }
                        this.annotation_.addAll(typeParameter.annotation_);
                    }
                }
                mergeExtensionFields(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.unknownFields));
                return this;
            }

            public Builder setId(int i) {
                this.bitField0_ |= 1;
                this.id_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public Builder setReified(boolean z) {
                this.bitField0_ |= 4;
                this.reified_ = z;
                return this;
            }

            public Builder setVariance(Variance variance) {
                variance.getClass();
                this.bitField0_ |= 8;
                this.variance_ = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                TypeParameter typeParameter = null;
                try {
                    try {
                        TypeParameter parsePartialFrom = TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TypeParameter typeParameter2 = (TypeParameter) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                                mergeFrom(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeParameter != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public TypeParameter() {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public TypeParameter(Builder builder) {
            super(builder);
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new AnonymousClass1();
        public static final TypeTable defaultInstance;
        public int bitField0_;
        public int firstNullable_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public List type_;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeTable typeTable = new TypeTable();
            defaultInstance = typeTable;
            typeTable.type_ = Collections.EMPTY_LIST;
            typeTable.firstNullable_ = -1;
        }

        public TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.type_ = Collections.EMPTY_LIST;
            this.firstNullable_ = -1;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    if (!z2) {
                                        this.type_ = new ArrayList();
                                        z2 = true;
                                    }
                                    this.type_.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                } else if (readTag == 16) {
                                    this.bitField0_ |= 1;
                                    this.firstNullable_ = codedInputStream.readInt32();
                                } else if (!codedInputStream.skipField(readTag, newInstance)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.type_ = Collections.unmodifiableList(this.type_);
                    }
                    try {
                        newInstance.flush();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = newOutput.toByteString();
                        throw th2;
                    }
                    this.unknownFields = newOutput.toByteString();
                    throw th;
                }
            }
            if (z2) {
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
        }

        public static TypeTable getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        public int getFirstNullable() {
            return this.firstNullable_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.type_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.type_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 += CodedOutputStream.computeInt32Size(2, this.firstNullable_);
            }
            int size = this.unknownFields.size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        public Type getType(int i) {
            return (Type) this.type_.get(i);
        }

        public int getTypeCount() {
            return this.type_.size();
        }

        public List<Type> getTypeList() {
            return this.type_;
        }

        public boolean hasFirstNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getTypeCount(); i++) {
                if (!getType(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.type_.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.type_.get(i));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(2, this.firstNullable_);
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {
            public int bitField0_;
            public List type_ = Collections.EMPTY_LIST;
            public int firstNullable_ = -1;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeTable build() {
                TypeTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public TypeTable buildPartial() {
                TypeTable typeTable = new TypeTable(this);
                int i = this.bitField0_;
                if ((i & 1) == 1) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -2;
                }
                typeTable.type_ = this.type_;
                int i2 = (i & 2) != 2 ? 0 : 1;
                typeTable.firstNullable_ = this.firstNullable_;
                typeTable.bitField0_ = i2;
                return typeTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Type getType(int i) {
                return (Type) this.type_.get(i);
            }

            public int getTypeCount() {
                return this.type_.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getTypeCount(); i++) {
                    if (!getType(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = typeTable.type_;
                        this.bitField0_ &= -2;
                    } else {
                        if ((this.bitField0_ & 1) != 1) {
                            this.type_ = new ArrayList(this.type_);
                            this.bitField0_ |= 1;
                        }
                        this.type_.addAll(typeTable.type_);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.unknownFields));
                return this;
            }

            public Builder setFirstNullable(int i) {
                this.bitField0_ |= 2;
                this.firstNullable_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                TypeTable typeTable = null;
                try {
                    try {
                        TypeTable parsePartialFrom = TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TypeTable typeTable2 = (TypeTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                                mergeFrom(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeTable != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public TypeTable() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public TypeTable(Builder builder) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static Parser<ValueParameter> PARSER = new AnonymousClass1();
        public static final ValueParameter defaultInstance;
        public Annotation.Argument.Value annotationParameterDefaultValue_;
        public List annotation_;
        public int bitField0_;
        public int flags_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public int name_;
        public int typeId_;
        public Type type_;
        public final ByteString unknownFields;
        public int varargElementTypeId_;
        public Type varargElementType_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter();
            defaultInstance = valueParameter;
            valueParameter.initFields$29();
        }

        public ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields$29();
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = codedInputStream.readInt32();
                            } else if (readTag != 16) {
                                if (readTag == 26) {
                                    Type.Builder builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.type_ = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.type_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 4;
                                } else if (readTag == 34) {
                                    Type.Builder builder2 = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                    Type type3 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.varargElementType_ = type3;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(type3);
                                        this.varargElementType_ = builder2.buildPartial();
                                    }
                                    this.bitField0_ |= 16;
                                } else if (readTag == 40) {
                                    this.bitField0_ |= 8;
                                    this.typeId_ = codedInputStream.readInt32();
                                } else if (readTag == 48) {
                                    this.bitField0_ |= 32;
                                    this.varargElementTypeId_ = codedInputStream.readInt32();
                                } else if (readTag == 58) {
                                    int i = (c == true ? 1 : 0) & '@';
                                    c = c;
                                    if (i != 64) {
                                        this.annotation_ = new ArrayList();
                                        c = '@';
                                    }
                                    this.annotation_.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                } else if (readTag == 66) {
                                    Annotation.Argument.Value.Builder builder3 = (this.bitField0_ & 64) == 64 ? this.annotationParameterDefaultValue_.toBuilder() : null;
                                    Annotation.Argument.Value value = (Annotation.Argument.Value) codedInputStream.readMessage(Annotation.Argument.Value.PARSER, extensionRegistryLite);
                                    this.annotationParameterDefaultValue_ = value;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(value);
                                        this.annotationParameterDefaultValue_ = builder3.buildPartial();
                                    }
                                    this.bitField0_ |= 64;
                                } else if (!parseUnknownField(codedInputStream, newInstance, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.name_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & '@') == 64) {
                            this.annotation_ = Collections.unmodifiableList(this.annotation_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c == true ? 1 : 0) & '@') == 64) {
                this.annotation_ = Collections.unmodifiableList(this.annotation_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
            makeExtensionsImmutable();
        }

        public static ValueParameter getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        public Annotation getAnnotation(int i) {
            return (Annotation) this.annotation_.get(i);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public Annotation.Argument.Value getAnnotationParameterDefaultValue() {
            return this.annotationParameterDefaultValue_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<ValueParameter> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeMessageSize(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeMessageSize(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeInt32Size(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                computeInt32Size += CodedOutputStream.computeInt32Size(6, this.varargElementTypeId_);
            }
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                computeInt32Size += CodedOutputStream.computeMessageSize(7, (MessageLite) this.annotation_.get(i2));
            }
            if ((this.bitField0_ & 64) == 64) {
                computeInt32Size += CodedOutputStream.computeMessageSize(8, this.annotationParameterDefaultValue_);
            }
            int size = this.unknownFields.size() + extensionsSerializedSize() + computeInt32Size;
            this.memoizedSerializedSize = size;
            return size;
        }

        public Type getType() {
            return this.type_;
        }

        public int getTypeId() {
            return this.typeId_;
        }

        public Type getVarargElementType() {
            return this.varargElementType_;
        }

        public int getVarargElementTypeId() {
            return this.varargElementTypeId_;
        }

        public boolean hasAnnotationParameterDefaultValue() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasType() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasVarargElementType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasVarargElementTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public final void initFields$29() {
            this.flags_ = 0;
            this.name_ = 0;
            this.type_ = Type.getDefaultInstance();
            this.typeId_ = 0;
            this.varargElementType_ = Type.getDefaultInstance();
            this.varargElementTypeId_ = 0;
            this.annotation_ = Collections.EMPTY_LIST;
            this.annotationParameterDefaultValue_ = Annotation.Argument.Value.getDefaultInstance();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i = 0; i < getAnnotationCount(); i++) {
                if (!getAnnotation(i).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasAnnotationParameterDefaultValue() && !getAnnotationParameterDefaultValue().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (this.extensions.isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeMessage(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeInt32(6, this.varargElementTypeId_);
            }
            for (int i = 0; i < this.annotation_.size(); i++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.annotation_.get(i));
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeMessage(8, this.annotationParameterDefaultValue_);
            }
            extensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {
            public int bitField0_;
            public int flags_;
            public int name_;
            public int typeId_;
            public int varargElementTypeId_;
            public Type type_ = Type.getDefaultInstance();
            public Type varargElementType_ = Type.getDefaultInstance();
            public List annotation_ = Collections.EMPTY_LIST;
            public Annotation.Argument.Value annotationParameterDefaultValue_ = Annotation.Argument.Value.getDefaultInstance();

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                if ((this.bitField0_ & 64) != 64) {
                    this.annotation_ = new ArrayList(this.annotation_);
                    this.bitField0_ |= 64;
                }
                AbstractMessageLite.Builder.addAll(iterable, this.annotation_);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public ValueParameter build() {
                ValueParameter buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public ValueParameter buildPartial() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                valueParameter.flags_ = this.flags_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.name_ = this.name_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.type_ = this.type_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.typeId_ = this.typeId_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.varargElementType_ = this.varargElementType_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.varargElementTypeId_ = this.varargElementTypeId_;
                if ((i & 64) == 64) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    this.bitField0_ &= -65;
                }
                valueParameter.annotation_ = this.annotation_;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                valueParameter.annotationParameterDefaultValue_ = this.annotationParameterDefaultValue_;
                valueParameter.bitField0_ = i2;
                return valueParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            public Annotation getAnnotation(int i) {
                return (Annotation) this.annotation_.get(i);
            }

            public int getAnnotationCount() {
                return this.annotation_.size();
            }

            public Annotation.Argument.Value getAnnotationParameterDefaultValue() {
                return this.annotationParameterDefaultValue_;
            }

            public Type getType() {
                return this.type_;
            }

            public Type getVarargElementType() {
                return this.varargElementType_;
            }

            public boolean hasAnnotationParameterDefaultValue() {
                return (this.bitField0_ & 128) == 128;
            }

            public boolean hasName() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasType() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasVarargElementType() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasType() && !getType().isInitialized()) {
                    return false;
                }
                if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getAnnotationCount(); i++) {
                    if (!getAnnotation(i).isInitialized()) {
                        return false;
                    }
                }
                return (!hasAnnotationParameterDefaultValue() || getAnnotationParameterDefaultValue().isInitialized()) && this.extensions.isInitialized();
            }

            public Builder mergeAnnotationParameterDefaultValue(Annotation.Argument.Value value) {
                if ((this.bitField0_ & 128) != 128 || this.annotationParameterDefaultValue_ == Annotation.Argument.Value.getDefaultInstance()) {
                    this.annotationParameterDefaultValue_ = value;
                } else {
                    this.annotationParameterDefaultValue_ = Annotation.Argument.Value.newBuilder(this.annotationParameterDefaultValue_).mergeFrom(value).buildPartial();
                }
                this.bitField0_ |= 128;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                if (!valueParameter.annotation_.isEmpty()) {
                    if (this.annotation_.isEmpty()) {
                        this.annotation_ = valueParameter.annotation_;
                        this.bitField0_ &= -65;
                    } else {
                        if ((this.bitField0_ & 64) != 64) {
                            this.annotation_ = new ArrayList(this.annotation_);
                            this.bitField0_ |= 64;
                        }
                        this.annotation_.addAll(valueParameter.annotation_);
                    }
                }
                if (valueParameter.hasAnnotationParameterDefaultValue()) {
                    mergeAnnotationParameterDefaultValue(valueParameter.getAnnotationParameterDefaultValue());
                }
                mergeExtensionFields(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.unknownFields));
                return this;
            }

            public Builder mergeType(Type type2) {
                if ((this.bitField0_ & 4) != 4 || this.type_ == Type.getDefaultInstance()) {
                    this.type_ = type2;
                } else {
                    this.type_ = Type.newBuilder(this.type_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder mergeVarargElementType(Type type2) {
                if ((this.bitField0_ & 16) != 16 || this.varargElementType_ == Type.getDefaultInstance()) {
                    this.varargElementType_ = type2;
                } else {
                    this.varargElementType_ = Type.newBuilder(this.varargElementType_).mergeFrom(type2).buildPartial();
                }
                this.bitField0_ |= 16;
                return this;
            }

            public Builder setAnnotationParameterDefaultValue(Annotation.Argument.Value value) {
                value.getClass();
                this.annotationParameterDefaultValue_ = value;
                this.bitField0_ |= 128;
                return this;
            }

            public Builder setFlags(int i) {
                this.bitField0_ |= 1;
                this.flags_ = i;
                return this;
            }

            public Builder setName(int i) {
                this.bitField0_ |= 2;
                this.name_ = i;
                return this;
            }

            public Builder setType(Type type2) {
                type2.getClass();
                this.type_ = type2;
                this.bitField0_ |= 4;
                return this;
            }

            public Builder setTypeId(int i) {
                this.bitField0_ |= 8;
                this.typeId_ = i;
                return this;
            }

            public Builder setVarargElementType(Type type2) {
                type2.getClass();
                this.varargElementType_ = type2;
                this.bitField0_ |= 16;
                return this;
            }

            public Builder setVarargElementTypeId(int i) {
                this.bitField0_ |= 32;
                this.varargElementTypeId_ = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ValueParameter parsePartialFrom = ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        ValueParameter valueParameter2 = (ValueParameter) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                                mergeFrom(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (valueParameter != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public ValueParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public ValueParameter() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public ValueParameter(Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static Parser<VersionRequirement> PARSER = new AnonymousClass1();
        public static final VersionRequirement defaultInstance;
        public int bitField0_;
        public int errorCode_;
        public Level level_;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public int message_;
        public final ByteString unknownFields;
        public int versionFull_;
        public VersionKind versionKind_;
        public int version_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new VersionRequirement(codedInputStream);
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);

            public final int value;

            Level(int i) {
                this.value = i;
            }

            public static Level valueOf(int i) {
                if (i == 0) {
                    return WARNING;
                }
                if (i == 1) {
                    return ERROR;
                }
                if (i != 2) {
                    return null;
                }
                return HIDDEN;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);

            public final int value;

            VersionKind(int i) {
                this.value = i;
            }

            public static VersionKind valueOf(int i) {
                if (i == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i == 1) {
                    return COMPILER_VERSION;
                }
                if (i != 2) {
                    return null;
                }
                return API_VERSION;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement();
            defaultInstance = versionRequirement;
            versionRequirement.version_ = 0;
            versionRequirement.versionFull_ = 0;
            versionRequirement.level_ = Level.ERROR;
            versionRequirement.errorCode_ = 0;
            versionRequirement.message_ = 0;
            versionRequirement.versionKind_ = VersionKind.LANGUAGE_VERSION;
        }

        public VersionRequirement(CodedInputStream codedInputStream) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.version_ = 0;
            this.versionFull_ = 0;
            this.level_ = Level.ERROR;
            this.errorCode_ = 0;
            this.message_ = 0;
            this.versionKind_ = VersionKind.LANGUAGE_VERSION;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.bitField0_ |= 1;
                                this.version_ = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.bitField0_ |= 2;
                                this.versionFull_ = codedInputStream.readInt32();
                            } else if (readTag == 24) {
                                int readEnum = codedInputStream.readEnum();
                                Level valueOf = Level.valueOf(readEnum);
                                if (valueOf == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.level_ = valueOf;
                                }
                            } else if (readTag == 32) {
                                this.bitField0_ |= 8;
                                this.errorCode_ = codedInputStream.readInt32();
                            } else if (readTag == 40) {
                                this.bitField0_ |= 16;
                                this.message_ = codedInputStream.readInt32();
                            } else if (readTag == 48) {
                                int readEnum2 = codedInputStream.readEnum();
                                VersionKind valueOf2 = VersionKind.valueOf(readEnum2);
                                if (valueOf2 == null) {
                                    newInstance.writeRawVarint32(readTag);
                                    newInstance.writeRawVarint32(readEnum2);
                                } else {
                                    this.bitField0_ |= 32;
                                    this.versionKind_ = valueOf2;
                                }
                            } else if (!codedInputStream.skipField(readTag, newInstance)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
        }

        public static VersionRequirement getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        public Level getLevel() {
            return this.level_;
        }

        public int getMessage() {
            return this.message_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirement> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int computeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.version_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                computeInt32Size += CodedOutputStream.computeInt32Size(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                computeInt32Size += CodedOutputStream.computeEnumSize(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                computeInt32Size += CodedOutputStream.computeInt32Size(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                computeInt32Size += CodedOutputStream.computeInt32Size(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                computeInt32Size += CodedOutputStream.computeEnumSize(6, this.versionKind_.getNumber());
            }
            int size = this.unknownFields.size() + computeInt32Size;
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getVersion() {
            return this.version_;
        }

        public int getVersionFull() {
            return this.versionFull_;
        }

        public VersionKind getVersionKind() {
            return this.versionKind_;
        }

        public boolean hasErrorCode() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasLevel() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasMessage() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasVersionFull() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasVersionKind() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeInt32(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeInt32(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeEnum(6, this.versionKind_.getNumber());
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {
            public int bitField0_;
            public int errorCode_;
            public int message_;
            public int versionFull_;
            public int version_;
            public Level level_ = Level.ERROR;
            public VersionKind versionKind_ = VersionKind.LANGUAGE_VERSION;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirement build() {
                VersionRequirement buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public VersionRequirement buildPartial() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                versionRequirement.version_ = this.version_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.versionFull_ = this.versionFull_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.level_ = this.level_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.errorCode_ = this.errorCode_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.message_ = this.message_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.versionKind_ = this.versionKind_;
                versionRequirement.bitField0_ = i2;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.unknownFields));
                return this;
            }

            public Builder setErrorCode(int i) {
                this.bitField0_ |= 8;
                this.errorCode_ = i;
                return this;
            }

            public Builder setLevel(Level level) {
                level.getClass();
                this.bitField0_ |= 4;
                this.level_ = level;
                return this;
            }

            public Builder setMessage(int i) {
                this.bitField0_ |= 16;
                this.message_ = i;
                return this;
            }

            public Builder setVersion(int i) {
                this.bitField0_ |= 1;
                this.version_ = i;
                return this;
            }

            public Builder setVersionFull(int i) {
                this.bitField0_ |= 2;
                this.versionFull_ = i;
                return this;
            }

            public Builder setVersionKind(VersionKind versionKind) {
                versionKind.getClass();
                this.bitField0_ |= 32;
                this.versionKind_ = versionKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        VersionRequirement parsePartialFrom = VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        VersionRequirement versionRequirement2 = (VersionRequirement) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                                mergeFrom(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirement != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirement getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public VersionRequirement() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public VersionRequirement(Builder builder) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new AnonymousClass1();
        public static final VersionRequirementTable defaultInstance;
        public byte memoizedIsInitialized;
        public int memoizedSerializedSize;
        public List requirement_;
        public final ByteString unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractParser {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable();
            defaultInstance = versionRequirementTable;
            versionRequirementTable.requirement_ = Collections.EMPTY_LIST;
        }

        public VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.requirement_ = Collections.EMPTY_LIST;
            ByteString.Output newOutput = ByteString.newOutput();
            CodedOutputStream newInstance = CodedOutputStream.newInstance(newOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!z2) {
                                    this.requirement_ = new ArrayList();
                                    z2 = true;
                                }
                                this.requirement_.add(codedInputStream.readMessage(VersionRequirement.PARSER, extensionRegistryLite));
                            } else if (!codedInputStream.skipField(readTag, newInstance)) {
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2) {
                            this.requirement_ = Collections.unmodifiableList(this.requirement_);
                        }
                        try {
                            newInstance.flush();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = newOutput.toByteString();
                            throw th2;
                        }
                        this.unknownFields = newOutput.toByteString();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2) {
                this.requirement_ = Collections.unmodifiableList(this.requirement_);
            }
            try {
                newInstance.flush();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = newOutput.toByteString();
                throw th3;
            }
            this.unknownFields = newOutput.toByteString();
        }

        public static VersionRequirementTable getDefaultInstance() {
            return defaultInstance;
        }

        public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public int getRequirementCount() {
            return this.requirement_.size();
        }

        public List<VersionRequirement> getRequirementList() {
            return this.requirement_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.requirement_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.requirement_.get(i3));
            }
            int size = this.unknownFields.size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.requirement_.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.requirement_.get(i));
            }
            codedOutputStream.writeRawBytes(this.unknownFields);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {
            public int bitField0_;
            public List requirement_ = Collections.EMPTY_LIST;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirementTable build() {
                VersionRequirementTable buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw new UninitializedMessageException(buildPartial);
            }

            public VersionRequirementTable buildPartial() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.bitField0_ & 1) == 1) {
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
                    this.bitField0_ &= -2;
                }
                versionRequirementTable.requirement_ = this.requirement_;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public Builder mo4151clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.requirement_.isEmpty()) {
                    if (this.requirement_.isEmpty()) {
                        this.requirement_ = versionRequirementTable.requirement_;
                        this.bitField0_ &= -2;
                    } else {
                        if ((this.bitField0_ & 1) != 1) {
                            this.requirement_ = new ArrayList(this.requirement_);
                            this.bitField0_ |= 1;
                        }
                        this.requirement_.addAll(versionRequirementTable.requirement_);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.unknownFields));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        VersionRequirementTable parsePartialFrom = VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (parsePartialFrom != null) {
                            mergeFrom(parsePartialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                                mergeFrom(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirementTable != null) {
                    }
                    throw th;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirementTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public VersionRequirementTable() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public VersionRequirementTable(Builder builder) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }
    }
}
