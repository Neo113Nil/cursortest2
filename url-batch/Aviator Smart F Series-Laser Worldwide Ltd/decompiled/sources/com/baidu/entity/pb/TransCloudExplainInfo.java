package com.baidu.entity.pb;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class TransCloudExplainInfo extends MessageMicro {
    public static final int DYNAMIC_INFO_FIELD_NUMBER = 1;
    private List<TransDynamicInfo> dynamicInfo_ = Collections.emptyList();
    private int cachedSize = -1;

    public static TransCloudExplainInfo parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new TransCloudExplainInfo().mergeFrom(codedInputStreamMicro);
    }

    public TransCloudExplainInfo addDynamicInfo(TransDynamicInfo transDynamicInfo) {
        if (transDynamicInfo == null) {
            return this;
        }
        if (this.dynamicInfo_.isEmpty()) {
            this.dynamicInfo_ = new ArrayList();
        }
        this.dynamicInfo_.add(transDynamicInfo);
        return this;
    }

    public final TransCloudExplainInfo clear() {
        clearDynamicInfo();
        this.cachedSize = -1;
        return this;
    }

    public TransCloudExplainInfo clearDynamicInfo() {
        this.dynamicInfo_ = Collections.emptyList();
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public TransDynamicInfo getDynamicInfo(int i8) {
        return this.dynamicInfo_.get(i8);
    }

    public int getDynamicInfoCount() {
        return this.dynamicInfo_.size();
    }

    public List<TransDynamicInfo> getDynamicInfoList() {
        return this.dynamicInfo_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        Iterator<TransDynamicInfo> it = getDynamicInfoList().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += CodedOutputStreamMicro.computeMessageSize(1, it.next());
        }
        this.cachedSize = i8;
        return i8;
    }

    public final boolean isInitialized() {
        Iterator<TransDynamicInfo> it = getDynamicInfoList().iterator();
        while (it.hasNext()) {
            if (!it.next().isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public TransCloudExplainInfo mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                TransDynamicInfo transDynamicInfo = new TransDynamicInfo();
                codedInputStreamMicro.readMessage(transDynamicInfo);
                addDynamicInfo(transDynamicInfo);
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public TransCloudExplainInfo setDynamicInfo(int i8, TransDynamicInfo transDynamicInfo) {
        if (transDynamicInfo == null) {
            return this;
        }
        this.dynamicInfo_.set(i8, transDynamicInfo);
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        Iterator<TransDynamicInfo> it = getDynamicInfoList().iterator();
        while (it.hasNext()) {
            codedOutputStreamMicro.writeMessage(1, it.next());
        }
    }

    public static TransCloudExplainInfo parseFrom(byte[] bArr) {
        return (TransCloudExplainInfo) new TransCloudExplainInfo().mergeFrom(bArr);
    }
}
