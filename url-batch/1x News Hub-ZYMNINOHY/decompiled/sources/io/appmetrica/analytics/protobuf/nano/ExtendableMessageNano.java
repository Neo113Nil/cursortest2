package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class ExtendableMessageNano<M extends ExtendableMessageNano<M>> extends MessageNano {
    protected FieldArray unknownFieldData;

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public int computeSerializedSize() {
        if (this.unknownFieldData == null) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.unknownFieldData.size(); i4++) {
            i3 += this.unknownFieldData.dataAt(i4).computeSerializedSize();
        }
        return i3;
    }

    public final <T> T getExtension(Extension<M, T> extension) {
        FieldData fieldData;
        FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null || (fieldData = fieldArray.get(WireFormatNano.getTagFieldNumber(extension.tag))) == null) {
            return null;
        }
        return (T) fieldData.getValue(extension);
    }

    public final boolean hasExtension(Extension<M, ?> extension) {
        FieldArray fieldArray = this.unknownFieldData;
        return (fieldArray == null || fieldArray.get(WireFormatNano.getTagFieldNumber(extension.tag)) == null) ? false : true;
    }

    public final <T> M setExtension(Extension<M, T> extension, T t3) {
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(extension.tag);
        FieldData fieldData = null;
        if (t3 == null) {
            FieldArray fieldArray = this.unknownFieldData;
            if (fieldArray != null) {
                fieldArray.remove(tagFieldNumber);
                if (this.unknownFieldData.isEmpty()) {
                    this.unknownFieldData = null;
                }
            }
            return this;
        }
        FieldArray fieldArray2 = this.unknownFieldData;
        if (fieldArray2 == null) {
            this.unknownFieldData = new FieldArray();
        } else {
            fieldData = fieldArray2.get(tagFieldNumber);
        }
        if (fieldData == null) {
            this.unknownFieldData.put(tagFieldNumber, new FieldData(extension, t3));
            return this;
        }
        fieldData.setValue(extension, t3);
        return this;
    }

    public final boolean storeUnknownField(CodedInputByteBufferNano codedInputByteBufferNano, int i3) throws IOException {
        FieldData fieldData;
        int position = codedInputByteBufferNano.getPosition();
        if (!codedInputByteBufferNano.skipField(i3)) {
            return false;
        }
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(i3);
        UnknownFieldData unknownFieldData = new UnknownFieldData(i3, codedInputByteBufferNano.getData(position, codedInputByteBufferNano.getPosition() - position));
        FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null) {
            this.unknownFieldData = new FieldArray();
            fieldData = null;
        } else {
            fieldData = fieldArray.get(tagFieldNumber);
        }
        if (fieldData == null) {
            fieldData = new FieldData();
            this.unknownFieldData.put(tagFieldNumber, fieldData);
        }
        fieldData.addUnknownField(unknownFieldData);
        return true;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.unknownFieldData == null) {
            return;
        }
        for (int i3 = 0; i3 < this.unknownFieldData.size(); i3++) {
            this.unknownFieldData.dataAt(i3).writeTo(codedOutputByteBufferNano);
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: clone */
    public M mo7clone() throws CloneNotSupportedException {
        M m3 = (M) super.mo7clone();
        InternalNano.cloneUnknownFieldData(this, m3);
        return m3;
    }
}
