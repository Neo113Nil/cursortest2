package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

@RestrictTo
/* loaded from: classes14.dex */
class VersionedParcelStream extends VersionedParcel {
    private static final Charset UTF_16 = Charset.forName("UTF-16");
    int mCount;
    private DataInputStream mCurrentInput;
    private DataOutputStream mCurrentOutput;
    private FieldBuffer mFieldBuffer;
    private int mFieldId;
    int mFieldSize;
    private boolean mIgnoreParcelables;
    private final DataInputStream mMasterInput;
    private final DataOutputStream mMasterOutput;

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean isStream() {
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence readCharSequence() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable readParcelable() {
        return null;
    }

    private VersionedParcelStream(InputStream inputStream, OutputStream outputStream, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.mCount = 0;
        this.mFieldId = -1;
        this.mFieldSize = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new FilterInputStream(inputStream) { // from class: androidx.versionedparcelable.VersionedParcelStream.1
            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i = versionedParcelStream.mFieldSize;
                if (i != -1 && versionedParcelStream.mCount >= i) {
                    throw new IOException();
                }
                int read = super.read();
                VersionedParcelStream.this.mCount++;
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i3 = versionedParcelStream.mFieldSize;
                if (i3 != -1 && versionedParcelStream.mCount >= i3) {
                    throw new IOException();
                }
                int read = super.read(bArr, i, i2);
                if (read > 0) {
                    VersionedParcelStream.this.mCount += read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i = versionedParcelStream.mFieldSize;
                if (i != -1 && versionedParcelStream.mCount >= i) {
                    throw new IOException();
                }
                long skip = super.skip(j);
                if (skip > 0) {
                    VersionedParcelStream.this.mCount += (int) skip;
                }
                return skip;
            }
        }) : null;
        this.mMasterInput = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.mMasterOutput = dataOutputStream;
        this.mCurrentInput = dataInputStream;
        this.mCurrentOutput = dataOutputStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setSerializationFlags(boolean z, boolean z2) {
        if (!z) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.mIgnoreParcelables = z2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        FieldBuffer fieldBuffer = this.mFieldBuffer;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.mOutput.size() != 0) {
                    this.mFieldBuffer.flushField();
                }
                this.mFieldBuffer = null;
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel createSubParcel() {
        return new VersionedParcelStream(this.mCurrentInput, this.mCurrentOutput, this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int i) {
        while (true) {
            try {
                int i2 = this.mFieldId;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                if (this.mCount < this.mFieldSize) {
                    this.mMasterInput.skip(r2 - r1);
                }
                this.mFieldSize = -1;
                int readInt = this.mMasterInput.readInt();
                this.mCount = 0;
                int i3 = readInt & 65535;
                if (i3 == 65535) {
                    i3 = this.mMasterInput.readInt();
                }
                this.mFieldId = (readInt >> 16) & 65535;
                this.mFieldSize = i3;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int i) {
        closeField();
        FieldBuffer fieldBuffer = new FieldBuffer(i, this.mMasterOutput);
        this.mFieldBuffer = fieldBuffer;
        this.mCurrentOutput = fieldBuffer.mDataStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr) {
        try {
            if (bArr != null) {
                this.mCurrentOutput.writeInt(bArr.length);
                this.mCurrentOutput.write(bArr);
            } else {
                this.mCurrentOutput.writeInt(-1);
            }
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void writeCharSequence(CharSequence charSequence) {
        if (!this.mIgnoreParcelables) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int i) {
        try {
            this.mCurrentOutput.writeInt(i);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(UTF_16);
                this.mCurrentOutput.writeInt(bytes.length);
                this.mCurrentOutput.write(bytes);
            } else {
                this.mCurrentOutput.writeInt(-1);
            }
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean z) {
        try {
            this.mCurrentOutput.writeBoolean(z);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(Parcelable parcelable) {
        if (!this.mIgnoreParcelables) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        try {
            return this.mCurrentInput.readInt();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String readString() {
        try {
            int readInt = this.mCurrentInput.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.mCurrentInput.readFully(bArr);
            return new String(bArr, UTF_16);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        try {
            int readInt = this.mCurrentInput.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.mCurrentInput.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        try {
            return this.mCurrentInput.readBoolean();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    private static class FieldBuffer {
        final DataOutputStream mDataStream;
        private final int mFieldId;
        final ByteArrayOutputStream mOutput;
        private final DataOutputStream mTarget;

        FieldBuffer(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.mOutput = byteArrayOutputStream;
            this.mDataStream = new DataOutputStream(byteArrayOutputStream);
            this.mFieldId = i;
            this.mTarget = dataOutputStream;
        }

        void flushField() {
            this.mDataStream.flush();
            int size = this.mOutput.size();
            this.mTarget.writeInt((this.mFieldId << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.mTarget.writeInt(size);
            }
            this.mOutput.writeTo(this.mTarget);
        }
    }
}
