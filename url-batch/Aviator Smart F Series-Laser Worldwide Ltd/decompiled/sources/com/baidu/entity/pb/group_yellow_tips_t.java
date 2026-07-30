package com.baidu.entity.pb;

import com.google.protobuf.micro.ByteStringMicro;
import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class group_yellow_tips_t extends MessageMicro {
    public static final int EVENT_IDS_FIELD_NUMBER = 5;
    public static final int ROUTE_TAG_OFF_FIELD_NUMBER = 4;
    public static final int TAG_FIELD_NUMBER = 1;
    public static final int TAG_INFO_FIELD_NUMBER = 2;
    public static final int YELLOW_TIPS_FIELD_NUMBER = 3;
    private int cachedSize;
    private List<Long> eventIds_;
    private boolean hasRouteTagOff;
    private boolean hasTag;
    private boolean hasTagInfo;
    private boolean routeTagOff_;
    private ByteStringMicro tagInfo_;
    private ByteStringMicro tag_;
    private List<yellow_tips_list_t> yellowTips_;

    public group_yellow_tips_t() {
        ByteStringMicro byteStringMicro = ByteStringMicro.EMPTY;
        this.tag_ = byteStringMicro;
        this.tagInfo_ = byteStringMicro;
        this.yellowTips_ = Collections.emptyList();
        this.routeTagOff_ = false;
        this.eventIds_ = Collections.emptyList();
        this.cachedSize = -1;
    }

    public static group_yellow_tips_t parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new group_yellow_tips_t().mergeFrom(codedInputStreamMicro);
    }

    public group_yellow_tips_t addEventIds(long j8) {
        if (this.eventIds_.isEmpty()) {
            this.eventIds_ = new ArrayList();
        }
        this.eventIds_.add(Long.valueOf(j8));
        return this;
    }

    public group_yellow_tips_t addYellowTips(yellow_tips_list_t yellow_tips_list_tVar) {
        if (yellow_tips_list_tVar == null) {
            return this;
        }
        if (this.yellowTips_.isEmpty()) {
            this.yellowTips_ = new ArrayList();
        }
        this.yellowTips_.add(yellow_tips_list_tVar);
        return this;
    }

    public final group_yellow_tips_t clear() {
        clearTag();
        clearTagInfo();
        clearYellowTips();
        clearRouteTagOff();
        clearEventIds();
        this.cachedSize = -1;
        return this;
    }

    public group_yellow_tips_t clearEventIds() {
        this.eventIds_ = Collections.emptyList();
        return this;
    }

    public group_yellow_tips_t clearRouteTagOff() {
        this.hasRouteTagOff = false;
        this.routeTagOff_ = false;
        return this;
    }

    public group_yellow_tips_t clearTag() {
        this.hasTag = false;
        this.tag_ = ByteStringMicro.EMPTY;
        return this;
    }

    public group_yellow_tips_t clearTagInfo() {
        this.hasTagInfo = false;
        this.tagInfo_ = ByteStringMicro.EMPTY;
        return this;
    }

    public group_yellow_tips_t clearYellowTips() {
        this.yellowTips_ = Collections.emptyList();
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public long getEventIds(int i8) {
        return this.eventIds_.get(i8).longValue();
    }

    public int getEventIdsCount() {
        return this.eventIds_.size();
    }

    public List<Long> getEventIdsList() {
        return this.eventIds_;
    }

    public boolean getRouteTagOff() {
        return this.routeTagOff_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int i8 = 0;
        int computeBytesSize = hasTag() ? CodedOutputStreamMicro.computeBytesSize(1, getTag()) : 0;
        if (hasTagInfo()) {
            computeBytesSize += CodedOutputStreamMicro.computeBytesSize(2, getTagInfo());
        }
        Iterator<yellow_tips_list_t> it = getYellowTipsList().iterator();
        while (it.hasNext()) {
            computeBytesSize += CodedOutputStreamMicro.computeMessageSize(3, it.next());
        }
        if (hasRouteTagOff()) {
            computeBytesSize += CodedOutputStreamMicro.computeBoolSize(4, getRouteTagOff());
        }
        Iterator<Long> it2 = getEventIdsList().iterator();
        while (it2.hasNext()) {
            i8 += CodedOutputStreamMicro.computeInt64SizeNoTag(it2.next().longValue());
        }
        int size = computeBytesSize + i8 + getEventIdsList().size();
        this.cachedSize = size;
        return size;
    }

    public ByteStringMicro getTag() {
        return this.tag_;
    }

    public ByteStringMicro getTagInfo() {
        return this.tagInfo_;
    }

    public yellow_tips_list_t getYellowTips(int i8) {
        return this.yellowTips_.get(i8);
    }

    public int getYellowTipsCount() {
        return this.yellowTips_.size();
    }

    public List<yellow_tips_list_t> getYellowTipsList() {
        return this.yellowTips_;
    }

    public boolean hasRouteTagOff() {
        return this.hasRouteTagOff;
    }

    public boolean hasTag() {
        return this.hasTag;
    }

    public boolean hasTagInfo() {
        return this.hasTagInfo;
    }

    public final boolean isInitialized() {
        Iterator<yellow_tips_list_t> it = getYellowTipsList().iterator();
        while (it.hasNext()) {
            if (!it.next().isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public group_yellow_tips_t mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                setTag(codedInputStreamMicro.readBytes());
            } else if (readTag == 18) {
                setTagInfo(codedInputStreamMicro.readBytes());
            } else if (readTag == 26) {
                yellow_tips_list_t yellow_tips_list_tVar = new yellow_tips_list_t();
                codedInputStreamMicro.readMessage(yellow_tips_list_tVar);
                addYellowTips(yellow_tips_list_tVar);
            } else if (readTag == 32) {
                setRouteTagOff(codedInputStreamMicro.readBool());
            } else if (readTag == 40) {
                addEventIds(codedInputStreamMicro.readInt64());
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public group_yellow_tips_t setEventIds(int i8, long j8) {
        this.eventIds_.set(i8, Long.valueOf(j8));
        return this;
    }

    public group_yellow_tips_t setRouteTagOff(boolean z7) {
        this.hasRouteTagOff = true;
        this.routeTagOff_ = z7;
        return this;
    }

    public group_yellow_tips_t setTag(ByteStringMicro byteStringMicro) {
        this.hasTag = true;
        this.tag_ = byteStringMicro;
        return this;
    }

    public group_yellow_tips_t setTagInfo(ByteStringMicro byteStringMicro) {
        this.hasTagInfo = true;
        this.tagInfo_ = byteStringMicro;
        return this;
    }

    public group_yellow_tips_t setYellowTips(int i8, yellow_tips_list_t yellow_tips_list_tVar) {
        if (yellow_tips_list_tVar == null) {
            return this;
        }
        this.yellowTips_.set(i8, yellow_tips_list_tVar);
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasTag()) {
            codedOutputStreamMicro.writeBytes(1, getTag());
        }
        if (hasTagInfo()) {
            codedOutputStreamMicro.writeBytes(2, getTagInfo());
        }
        Iterator<yellow_tips_list_t> it = getYellowTipsList().iterator();
        while (it.hasNext()) {
            codedOutputStreamMicro.writeMessage(3, it.next());
        }
        if (hasRouteTagOff()) {
            codedOutputStreamMicro.writeBool(4, getRouteTagOff());
        }
        Iterator<Long> it2 = getEventIdsList().iterator();
        while (it2.hasNext()) {
            codedOutputStreamMicro.writeInt64(5, it2.next().longValue());
        }
    }

    public static group_yellow_tips_t parseFrom(byte[] bArr) {
        return (group_yellow_tips_t) new group_yellow_tips_t().mergeFrom(bArr);
    }
}
