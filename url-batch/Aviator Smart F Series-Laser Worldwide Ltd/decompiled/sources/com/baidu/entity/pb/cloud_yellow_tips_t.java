package com.baidu.entity.pb;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class cloud_yellow_tips_t extends MessageMicro {
    public static final int CLOUD_YELLOW_TIPS_FIELD_NUMBER = 1;
    private List<yellow_tips_t> cloudYellowTips_ = Collections.emptyList();
    private int cachedSize = -1;

    public static cloud_yellow_tips_t parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new cloud_yellow_tips_t().mergeFrom(codedInputStreamMicro);
    }

    public cloud_yellow_tips_t addCloudYellowTips(yellow_tips_t yellow_tips_tVar) {
        if (yellow_tips_tVar == null) {
            return this;
        }
        if (this.cloudYellowTips_.isEmpty()) {
            this.cloudYellowTips_ = new ArrayList();
        }
        this.cloudYellowTips_.add(yellow_tips_tVar);
        return this;
    }

    public final cloud_yellow_tips_t clear() {
        clearCloudYellowTips();
        this.cachedSize = -1;
        return this;
    }

    public cloud_yellow_tips_t clearCloudYellowTips() {
        this.cloudYellowTips_ = Collections.emptyList();
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public yellow_tips_t getCloudYellowTips(int i8) {
        return this.cloudYellowTips_.get(i8);
    }

    public int getCloudYellowTipsCount() {
        return this.cloudYellowTips_.size();
    }

    public List<yellow_tips_t> getCloudYellowTipsList() {
        return this.cloudYellowTips_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        Iterator<yellow_tips_t> it = getCloudYellowTipsList().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += CodedOutputStreamMicro.computeMessageSize(1, it.next());
        }
        this.cachedSize = i8;
        return i8;
    }

    public final boolean isInitialized() {
        Iterator<yellow_tips_t> it = getCloudYellowTipsList().iterator();
        while (it.hasNext()) {
            if (!it.next().isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public cloud_yellow_tips_t mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                yellow_tips_t yellow_tips_tVar = new yellow_tips_t();
                codedInputStreamMicro.readMessage(yellow_tips_tVar);
                addCloudYellowTips(yellow_tips_tVar);
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public cloud_yellow_tips_t setCloudYellowTips(int i8, yellow_tips_t yellow_tips_tVar) {
        if (yellow_tips_tVar == null) {
            return this;
        }
        this.cloudYellowTips_.set(i8, yellow_tips_tVar);
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        Iterator<yellow_tips_t> it = getCloudYellowTipsList().iterator();
        while (it.hasNext()) {
            codedOutputStreamMicro.writeMessage(1, it.next());
        }
    }

    public static cloud_yellow_tips_t parseFrom(byte[] bArr) {
        return (cloud_yellow_tips_t) new cloud_yellow_tips_t().mergeFrom(bArr);
    }
}
