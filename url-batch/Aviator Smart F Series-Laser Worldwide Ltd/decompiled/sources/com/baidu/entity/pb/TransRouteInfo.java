package com.baidu.entity.pb;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class TransRouteInfo extends MessageMicro {
    public static final int LABELS_FIELD_NUMBER = 1;
    private List<TransRouteLabel> labels_ = Collections.emptyList();
    private int cachedSize = -1;

    public static TransRouteInfo parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new TransRouteInfo().mergeFrom(codedInputStreamMicro);
    }

    public TransRouteInfo addLabels(TransRouteLabel transRouteLabel) {
        if (transRouteLabel == null) {
            return this;
        }
        if (this.labels_.isEmpty()) {
            this.labels_ = new ArrayList();
        }
        this.labels_.add(transRouteLabel);
        return this;
    }

    public final TransRouteInfo clear() {
        clearLabels();
        this.cachedSize = -1;
        return this;
    }

    public TransRouteInfo clearLabels() {
        this.labels_ = Collections.emptyList();
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public TransRouteLabel getLabels(int i8) {
        return this.labels_.get(i8);
    }

    public int getLabelsCount() {
        return this.labels_.size();
    }

    public List<TransRouteLabel> getLabelsList() {
        return this.labels_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        Iterator<TransRouteLabel> it = getLabelsList().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += CodedOutputStreamMicro.computeMessageSize(1, it.next());
        }
        this.cachedSize = i8;
        return i8;
    }

    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public TransRouteInfo mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                TransRouteLabel transRouteLabel = new TransRouteLabel();
                codedInputStreamMicro.readMessage(transRouteLabel);
                addLabels(transRouteLabel);
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public TransRouteInfo setLabels(int i8, TransRouteLabel transRouteLabel) {
        if (transRouteLabel == null) {
            return this;
        }
        this.labels_.set(i8, transRouteLabel);
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        Iterator<TransRouteLabel> it = getLabelsList().iterator();
        while (it.hasNext()) {
            codedOutputStreamMicro.writeMessage(1, it.next());
        }
    }

    public static TransRouteInfo parseFrom(byte[] bArr) {
        return (TransRouteInfo) new TransRouteInfo().mergeFrom(bArr);
    }
}
