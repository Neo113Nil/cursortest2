package com.baidu.location.pb;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class CellValueList extends MessageMicro {
    public static final int CELL_VALUE_FIELD_NUMBER = 1;
    private List<CellValue> cellValue_ = Collections.emptyList();
    private int cachedSize = -1;

    public static CellValueList parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new CellValueList().mergeFrom(codedInputStreamMicro);
    }

    public CellValueList addCellValue(CellValue cellValue) {
        if (cellValue == null) {
            return this;
        }
        if (this.cellValue_.isEmpty()) {
            this.cellValue_ = new ArrayList();
        }
        this.cellValue_.add(cellValue);
        return this;
    }

    public final CellValueList clear() {
        clearCellValue();
        this.cachedSize = -1;
        return this;
    }

    public CellValueList clearCellValue() {
        this.cellValue_ = Collections.emptyList();
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public CellValue getCellValue(int i8) {
        return this.cellValue_.get(i8);
    }

    public int getCellValueCount() {
        return this.cellValue_.size();
    }

    public List<CellValue> getCellValueList() {
        return this.cellValue_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        Iterator<CellValue> it = getCellValueList().iterator();
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
    public CellValueList mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                CellValue cellValue = new CellValue();
                codedInputStreamMicro.readMessage(cellValue);
                addCellValue(cellValue);
            } else if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                return this;
            }
        }
    }

    public CellValueList setCellValue(int i8, CellValue cellValue) {
        if (cellValue == null) {
            return this;
        }
        this.cellValue_.set(i8, cellValue);
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        Iterator<CellValue> it = getCellValueList().iterator();
        while (it.hasNext()) {
            codedOutputStreamMicro.writeMessage(1, it.next());
        }
    }

    public static CellValueList parseFrom(byte[] bArr) {
        return (CellValueList) new CellValueList().mergeFrom(bArr);
    }
}
