package com.baidu.entity.pb;

import com.google.protobuf.micro.ByteStringMicro;
import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;

/* loaded from: classes2.dex */
public final class TransPanel extends MessageMicro {
    public static final int BASE_MAP_TYPE_FIELD_NUMBER = 8;
    public static final int CONTENT_FIELD_NUMBER = 1;
    public static final int DISPLAY_DURATION_FIELD_NUMBER = 3;
    public static final int DISPLAY_TIME_TYPE_FIELD_NUMBER = 9;
    public static final int ICON_ID_FIELD_NUMBER = 5;
    public static final int IS_DEFAULT_CHOOSE_FIELD_NUMBER = 6;
    public static final int PATTERN_FIELD_NUMBER = 4;
    public static final int SCENE_ID_FIELD_NUMBER = 7;
    public static final int SUB_CONTENT_FIELD_NUMBER = 2;
    private int baseMapType_;
    private int cachedSize;
    private ByteStringMicro content_;
    private int displayDuration_;
    private int displayTimeType_;
    private boolean hasBaseMapType;
    private boolean hasContent;
    private boolean hasDisplayDuration;
    private boolean hasDisplayTimeType;
    private boolean hasIconId;
    private boolean hasIsDefaultChoose;
    private boolean hasPattern;
    private boolean hasSceneId;
    private boolean hasSubContent;
    private int iconId_;
    private int isDefaultChoose_;
    private int pattern_;
    private int sceneId_;
    private ByteStringMicro subContent_;

    public TransPanel() {
        ByteStringMicro byteStringMicro = ByteStringMicro.EMPTY;
        this.content_ = byteStringMicro;
        this.subContent_ = byteStringMicro;
        this.displayDuration_ = 0;
        this.pattern_ = 0;
        this.iconId_ = 0;
        this.isDefaultChoose_ = 0;
        this.sceneId_ = 0;
        this.baseMapType_ = 0;
        this.displayTimeType_ = 0;
        this.cachedSize = -1;
    }

    public static TransPanel parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new TransPanel().mergeFrom(codedInputStreamMicro);
    }

    public final TransPanel clear() {
        clearContent();
        clearSubContent();
        clearDisplayDuration();
        clearPattern();
        clearIconId();
        clearIsDefaultChoose();
        clearSceneId();
        clearBaseMapType();
        clearDisplayTimeType();
        this.cachedSize = -1;
        return this;
    }

    public TransPanel clearBaseMapType() {
        this.hasBaseMapType = false;
        this.baseMapType_ = 0;
        return this;
    }

    public TransPanel clearContent() {
        this.hasContent = false;
        this.content_ = ByteStringMicro.EMPTY;
        return this;
    }

    public TransPanel clearDisplayDuration() {
        this.hasDisplayDuration = false;
        this.displayDuration_ = 0;
        return this;
    }

    public TransPanel clearDisplayTimeType() {
        this.hasDisplayTimeType = false;
        this.displayTimeType_ = 0;
        return this;
    }

    public TransPanel clearIconId() {
        this.hasIconId = false;
        this.iconId_ = 0;
        return this;
    }

    public TransPanel clearIsDefaultChoose() {
        this.hasIsDefaultChoose = false;
        this.isDefaultChoose_ = 0;
        return this;
    }

    public TransPanel clearPattern() {
        this.hasPattern = false;
        this.pattern_ = 0;
        return this;
    }

    public TransPanel clearSceneId() {
        this.hasSceneId = false;
        this.sceneId_ = 0;
        return this;
    }

    public TransPanel clearSubContent() {
        this.hasSubContent = false;
        this.subContent_ = ByteStringMicro.EMPTY;
        return this;
    }

    public int getBaseMapType() {
        return this.baseMapType_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public ByteStringMicro getContent() {
        return this.content_;
    }

    public int getDisplayDuration() {
        return this.displayDuration_;
    }

    public int getDisplayTimeType() {
        return this.displayTimeType_;
    }

    public int getIconId() {
        return this.iconId_;
    }

    public int getIsDefaultChoose() {
        return this.isDefaultChoose_;
    }

    public int getPattern() {
        return this.pattern_;
    }

    public int getSceneId() {
        return this.sceneId_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeBytesSize = hasContent() ? CodedOutputStreamMicro.computeBytesSize(1, getContent()) : 0;
        if (hasSubContent()) {
            computeBytesSize += CodedOutputStreamMicro.computeBytesSize(2, getSubContent());
        }
        if (hasDisplayDuration()) {
            computeBytesSize += CodedOutputStreamMicro.computeInt32Size(3, getDisplayDuration());
        }
        if (hasPattern()) {
            computeBytesSize += CodedOutputStreamMicro.computeInt32Size(4, getPattern());
        }
        if (hasIconId()) {
            computeBytesSize += CodedOutputStreamMicro.computeInt32Size(5, getIconId());
        }
        if (hasIsDefaultChoose()) {
            computeBytesSize += CodedOutputStreamMicro.computeInt32Size(6, getIsDefaultChoose());
        }
        if (hasSceneId()) {
            computeBytesSize += CodedOutputStreamMicro.computeInt32Size(7, getSceneId());
        }
        if (hasBaseMapType()) {
            computeBytesSize += CodedOutputStreamMicro.computeInt32Size(8, getBaseMapType());
        }
        if (hasDisplayTimeType()) {
            computeBytesSize += CodedOutputStreamMicro.computeInt32Size(9, getDisplayTimeType());
        }
        this.cachedSize = computeBytesSize;
        return computeBytesSize;
    }

    public ByteStringMicro getSubContent() {
        return this.subContent_;
    }

    public boolean hasBaseMapType() {
        return this.hasBaseMapType;
    }

    public boolean hasContent() {
        return this.hasContent;
    }

    public boolean hasDisplayDuration() {
        return this.hasDisplayDuration;
    }

    public boolean hasDisplayTimeType() {
        return this.hasDisplayTimeType;
    }

    public boolean hasIconId() {
        return this.hasIconId;
    }

    public boolean hasIsDefaultChoose() {
        return this.hasIsDefaultChoose;
    }

    public boolean hasPattern() {
        return this.hasPattern;
    }

    public boolean hasSceneId() {
        return this.hasSceneId;
    }

    public boolean hasSubContent() {
        return this.hasSubContent;
    }

    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public TransPanel mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                setContent(codedInputStreamMicro.readBytes());
            } else if (readTag == 18) {
                setSubContent(codedInputStreamMicro.readBytes());
            } else if (readTag == 24) {
                setDisplayDuration(codedInputStreamMicro.readInt32());
            } else if (readTag == 32) {
                setPattern(codedInputStreamMicro.readInt32());
            } else if (readTag == 40) {
                setIconId(codedInputStreamMicro.readInt32());
            } else if (readTag == 48) {
                setIsDefaultChoose(codedInputStreamMicro.readInt32());
            } else if (readTag == 56) {
                setSceneId(codedInputStreamMicro.readInt32());
            } else if (readTag == 64) {
                setBaseMapType(codedInputStreamMicro.readInt32());
            } else if (readTag == 72) {
                setDisplayTimeType(codedInputStreamMicro.readInt32());
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public TransPanel setBaseMapType(int i8) {
        this.hasBaseMapType = true;
        this.baseMapType_ = i8;
        return this;
    }

    public TransPanel setContent(ByteStringMicro byteStringMicro) {
        this.hasContent = true;
        this.content_ = byteStringMicro;
        return this;
    }

    public TransPanel setDisplayDuration(int i8) {
        this.hasDisplayDuration = true;
        this.displayDuration_ = i8;
        return this;
    }

    public TransPanel setDisplayTimeType(int i8) {
        this.hasDisplayTimeType = true;
        this.displayTimeType_ = i8;
        return this;
    }

    public TransPanel setIconId(int i8) {
        this.hasIconId = true;
        this.iconId_ = i8;
        return this;
    }

    public TransPanel setIsDefaultChoose(int i8) {
        this.hasIsDefaultChoose = true;
        this.isDefaultChoose_ = i8;
        return this;
    }

    public TransPanel setPattern(int i8) {
        this.hasPattern = true;
        this.pattern_ = i8;
        return this;
    }

    public TransPanel setSceneId(int i8) {
        this.hasSceneId = true;
        this.sceneId_ = i8;
        return this;
    }

    public TransPanel setSubContent(ByteStringMicro byteStringMicro) {
        this.hasSubContent = true;
        this.subContent_ = byteStringMicro;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasContent()) {
            codedOutputStreamMicro.writeBytes(1, getContent());
        }
        if (hasSubContent()) {
            codedOutputStreamMicro.writeBytes(2, getSubContent());
        }
        if (hasDisplayDuration()) {
            codedOutputStreamMicro.writeInt32(3, getDisplayDuration());
        }
        if (hasPattern()) {
            codedOutputStreamMicro.writeInt32(4, getPattern());
        }
        if (hasIconId()) {
            codedOutputStreamMicro.writeInt32(5, getIconId());
        }
        if (hasIsDefaultChoose()) {
            codedOutputStreamMicro.writeInt32(6, getIsDefaultChoose());
        }
        if (hasSceneId()) {
            codedOutputStreamMicro.writeInt32(7, getSceneId());
        }
        if (hasBaseMapType()) {
            codedOutputStreamMicro.writeInt32(8, getBaseMapType());
        }
        if (hasDisplayTimeType()) {
            codedOutputStreamMicro.writeInt32(9, getDisplayTimeType());
        }
    }

    public static TransPanel parseFrom(byte[] bArr) {
        return (TransPanel) new TransPanel().mergeFrom(bArr);
    }
}
