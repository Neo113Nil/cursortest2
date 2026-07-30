package com.baidu.entity.pb;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;

/* loaded from: classes2.dex */
public final class UgcEventDynamicInfo extends MessageMicro {
    public static final int EXT_INFO_FIELD_NUMBER = 7;
    public static final int INQUIRY_CONFIG_FIELD_NUMBER = 1;
    public static final int INQUIRY_CONFIG_ID_FIELD_NUMBER = 2;
    public static final int META_FIELD_NUMBER = 3;
    public static final int SUB_TYPE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int UGCEXTINFO_FIELD_NUMBER = 6;
    private boolean hasExtInfo;
    private boolean hasInquiryConfig;
    private boolean hasInquiryConfigId;
    private boolean hasMeta;
    private boolean hasSubType;
    private boolean hasType;
    private boolean hasUgcExtInfo;
    private UgcEventInquiryConfig inquiryConfig_ = null;
    private int inquiryConfigId_ = 0;
    private String meta_ = "";
    private int subType_ = 0;
    private int type_ = 0;
    private UgcExtInfo ugcExtInfo_ = null;
    private String extInfo_ = "";
    private int cachedSize = -1;

    public static UgcEventDynamicInfo parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new UgcEventDynamicInfo().mergeFrom(codedInputStreamMicro);
    }

    public final UgcEventDynamicInfo clear() {
        clearInquiryConfig();
        clearInquiryConfigId();
        clearMeta();
        clearSubType();
        clearType();
        clearUgcExtInfo();
        clearExtInfo();
        this.cachedSize = -1;
        return this;
    }

    public UgcEventDynamicInfo clearExtInfo() {
        this.hasExtInfo = false;
        this.extInfo_ = "";
        return this;
    }

    public UgcEventDynamicInfo clearInquiryConfig() {
        this.hasInquiryConfig = false;
        this.inquiryConfig_ = null;
        return this;
    }

    public UgcEventDynamicInfo clearInquiryConfigId() {
        this.hasInquiryConfigId = false;
        this.inquiryConfigId_ = 0;
        return this;
    }

    public UgcEventDynamicInfo clearMeta() {
        this.hasMeta = false;
        this.meta_ = "";
        return this;
    }

    public UgcEventDynamicInfo clearSubType() {
        this.hasSubType = false;
        this.subType_ = 0;
        return this;
    }

    public UgcEventDynamicInfo clearType() {
        this.hasType = false;
        this.type_ = 0;
        return this;
    }

    public UgcEventDynamicInfo clearUgcExtInfo() {
        this.hasUgcExtInfo = false;
        this.ugcExtInfo_ = null;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public String getExtInfo() {
        return this.extInfo_;
    }

    public UgcEventInquiryConfig getInquiryConfig() {
        return this.inquiryConfig_;
    }

    public int getInquiryConfigId() {
        return this.inquiryConfigId_;
    }

    public String getMeta() {
        return this.meta_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeMessageSize = hasInquiryConfig() ? CodedOutputStreamMicro.computeMessageSize(1, getInquiryConfig()) : 0;
        if (hasInquiryConfigId()) {
            computeMessageSize += CodedOutputStreamMicro.computeInt32Size(2, getInquiryConfigId());
        }
        if (hasMeta()) {
            computeMessageSize += CodedOutputStreamMicro.computeStringSize(3, getMeta());
        }
        if (hasSubType()) {
            computeMessageSize += CodedOutputStreamMicro.computeInt32Size(4, getSubType());
        }
        if (hasType()) {
            computeMessageSize += CodedOutputStreamMicro.computeInt32Size(5, getType());
        }
        if (hasUgcExtInfo()) {
            computeMessageSize += CodedOutputStreamMicro.computeMessageSize(6, getUgcExtInfo());
        }
        if (hasExtInfo()) {
            computeMessageSize += CodedOutputStreamMicro.computeStringSize(7, getExtInfo());
        }
        this.cachedSize = computeMessageSize;
        return computeMessageSize;
    }

    public int getSubType() {
        return this.subType_;
    }

    public int getType() {
        return this.type_;
    }

    public UgcExtInfo getUgcExtInfo() {
        return this.ugcExtInfo_;
    }

    public boolean hasExtInfo() {
        return this.hasExtInfo;
    }

    public boolean hasInquiryConfig() {
        return this.hasInquiryConfig;
    }

    public boolean hasInquiryConfigId() {
        return this.hasInquiryConfigId;
    }

    public boolean hasMeta() {
        return this.hasMeta;
    }

    public boolean hasSubType() {
        return this.hasSubType;
    }

    public boolean hasType() {
        return this.hasType;
    }

    public boolean hasUgcExtInfo() {
        return this.hasUgcExtInfo;
    }

    public final boolean isInitialized() {
        if (this.hasInquiryConfig && this.hasInquiryConfigId && getInquiryConfig().isInitialized()) {
            return !hasUgcExtInfo() || getUgcExtInfo().isInitialized();
        }
        return false;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public UgcEventDynamicInfo mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                UgcEventInquiryConfig ugcEventInquiryConfig = new UgcEventInquiryConfig();
                codedInputStreamMicro.readMessage(ugcEventInquiryConfig);
                setInquiryConfig(ugcEventInquiryConfig);
            } else if (readTag == 16) {
                setInquiryConfigId(codedInputStreamMicro.readInt32());
            } else if (readTag == 26) {
                setMeta(codedInputStreamMicro.readString());
            } else if (readTag == 32) {
                setSubType(codedInputStreamMicro.readInt32());
            } else if (readTag == 40) {
                setType(codedInputStreamMicro.readInt32());
            } else if (readTag == 50) {
                UgcExtInfo ugcExtInfo = new UgcExtInfo();
                codedInputStreamMicro.readMessage(ugcExtInfo);
                setUgcExtInfo(ugcExtInfo);
            } else if (readTag == 58) {
                setExtInfo(codedInputStreamMicro.readString());
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public UgcEventDynamicInfo setExtInfo(String str) {
        this.hasExtInfo = true;
        this.extInfo_ = str;
        return this;
    }

    public UgcEventDynamicInfo setInquiryConfig(UgcEventInquiryConfig ugcEventInquiryConfig) {
        if (ugcEventInquiryConfig == null) {
            return clearInquiryConfig();
        }
        this.hasInquiryConfig = true;
        this.inquiryConfig_ = ugcEventInquiryConfig;
        return this;
    }

    public UgcEventDynamicInfo setInquiryConfigId(int i8) {
        this.hasInquiryConfigId = true;
        this.inquiryConfigId_ = i8;
        return this;
    }

    public UgcEventDynamicInfo setMeta(String str) {
        this.hasMeta = true;
        this.meta_ = str;
        return this;
    }

    public UgcEventDynamicInfo setSubType(int i8) {
        this.hasSubType = true;
        this.subType_ = i8;
        return this;
    }

    public UgcEventDynamicInfo setType(int i8) {
        this.hasType = true;
        this.type_ = i8;
        return this;
    }

    public UgcEventDynamicInfo setUgcExtInfo(UgcExtInfo ugcExtInfo) {
        if (ugcExtInfo == null) {
            return clearUgcExtInfo();
        }
        this.hasUgcExtInfo = true;
        this.ugcExtInfo_ = ugcExtInfo;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasInquiryConfig()) {
            codedOutputStreamMicro.writeMessage(1, getInquiryConfig());
        }
        if (hasInquiryConfigId()) {
            codedOutputStreamMicro.writeInt32(2, getInquiryConfigId());
        }
        if (hasMeta()) {
            codedOutputStreamMicro.writeString(3, getMeta());
        }
        if (hasSubType()) {
            codedOutputStreamMicro.writeInt32(4, getSubType());
        }
        if (hasType()) {
            codedOutputStreamMicro.writeInt32(5, getType());
        }
        if (hasUgcExtInfo()) {
            codedOutputStreamMicro.writeMessage(6, getUgcExtInfo());
        }
        if (hasExtInfo()) {
            codedOutputStreamMicro.writeString(7, getExtInfo());
        }
    }

    public static UgcEventDynamicInfo parseFrom(byte[] bArr) {
        return (UgcEventDynamicInfo) new UgcEventDynamicInfo().mergeFrom(bArr);
    }
}
