package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* loaded from: classes4.dex */
public abstract class SmallMessageSnapshot extends MessageSnapshot {

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements a {
        CompletedFlowDirectlySnapshot(int i8, boolean z7, int i9) {
            super(i8, z7, i9);
        }

        CompletedFlowDirectlySnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    public static class CompletedSnapshot extends SmallMessageSnapshot {
        private final boolean reusedDownloadedFile;
        private final int totalBytes;

        CompletedSnapshot(int i8, boolean z7, int i9) {
            super(i8);
            this.reusedDownloadedFile = z7;
            this.totalBytes = i9;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public int getSmallTotalBytes() {
            return this.totalBytes;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public byte getStatus() {
            return (byte) -3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public boolean isReusedDownloadedFile() {
            return this.reusedDownloadedFile;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeByte(this.reusedDownloadedFile ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.totalBytes);
        }

        CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.reusedDownloadedFile = parcel.readByte() != 0;
            this.totalBytes = parcel.readInt();
        }
    }

    public static class ConnectedMessageSnapshot extends SmallMessageSnapshot {
        private final String etag;
        private final String fileName;
        private final boolean resuming;
        private final int totalBytes;

        ConnectedMessageSnapshot(int i8, boolean z7, int i9, String str, String str2) {
            super(i8);
            this.resuming = z7;
            this.totalBytes = i9;
            this.etag = str;
            this.fileName = str2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public String getEtag() {
            return this.etag;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public int getSmallTotalBytes() {
            return this.totalBytes;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public byte getStatus() {
            return (byte) 2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public boolean isResuming() {
            return this.resuming;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeByte(this.resuming ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.totalBytes);
            parcel.writeString(this.etag);
            parcel.writeString(this.fileName);
        }

        ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.resuming = parcel.readByte() != 0;
            this.totalBytes = parcel.readInt();
            this.etag = parcel.readString();
            this.fileName = parcel.readString();
        }
    }

    public static class ErrorMessageSnapshot extends SmallMessageSnapshot {
        private final int sofarBytes;
        private final Throwable throwable;

        ErrorMessageSnapshot(int i8, int i9, Throwable th) {
            super(i8);
            this.sofarBytes = i9;
            this.throwable = th;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public int getSmallSofarBytes() {
            return this.sofarBytes;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public byte getStatus() {
            return (byte) -1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public Throwable getThrowable() {
            return this.throwable;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.sofarBytes);
            parcel.writeSerializable(this.throwable);
        }

        ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.sofarBytes = parcel.readInt();
            this.throwable = (Throwable) parcel.readSerializable();
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        PausedSnapshot(int i8, int i9, int i10) {
            super(i8, i9, i10);
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot, com.liulishuo.filedownloader.message.SmallMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public byte getStatus() {
            return (byte) -2;
        }
    }

    public static class PendingMessageSnapshot extends SmallMessageSnapshot {
        private final int sofarBytes;
        private final int totalBytes;

        PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.getId(), pendingMessageSnapshot.getSmallSofarBytes(), pendingMessageSnapshot.getSmallTotalBytes());
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public int getSmallSofarBytes() {
            return this.sofarBytes;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public int getSmallTotalBytes() {
            return this.totalBytes;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public byte getStatus() {
            return (byte) 1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.sofarBytes);
            parcel.writeInt(this.totalBytes);
        }

        PendingMessageSnapshot(int i8, int i9, int i10) {
            super(i8);
            this.sofarBytes = i9;
            this.totalBytes = i10;
        }

        PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.sofarBytes = parcel.readInt();
            this.totalBytes = parcel.readInt();
        }
    }

    public static class ProgressMessageSnapshot extends SmallMessageSnapshot {
        private final int sofarBytes;

        ProgressMessageSnapshot(int i8, int i9) {
            super(i8);
            this.sofarBytes = i9;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public int getSmallSofarBytes() {
            return this.sofarBytes;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public byte getStatus() {
            return (byte) 3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.sofarBytes);
        }

        ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.sofarBytes = parcel.readInt();
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {
        private final int retryingTimes;

        RetryMessageSnapshot(int i8, int i9, Throwable th, int i10) {
            super(i8, i9, th);
            this.retryingTimes = i10;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public int getRetryingTimes() {
            return this.retryingTimes;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.SmallMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public byte getStatus() {
            return (byte) 5;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.retryingTimes);
        }

        RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.retryingTimes = parcel.readInt();
        }
    }

    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements a {
        WarnFlowDirectlySnapshot(int i8, int i9, int i10) {
            super(i8, i9, i10);
        }

        WarnFlowDirectlySnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.b {
        WarnMessageSnapshot(int i8, int i9, int i10) {
            super(i8, i9, i10);
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot, com.liulishuo.filedownloader.message.SmallMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
        public byte getStatus() {
            return (byte) -4;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot.b
        public MessageSnapshot turnToPending() {
            return new PendingMessageSnapshot(this);
        }

        WarnMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    SmallMessageSnapshot(int i8) {
        super(i8);
        this.isLargeFile = false;
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
    public long getLargeSofarBytes() {
        return getSmallSofarBytes();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
    public long getLargeTotalBytes() {
        return getSmallTotalBytes();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.b
    public abstract /* synthetic */ byte getStatus();

    SmallMessageSnapshot(Parcel parcel) {
        super(parcel);
    }
}
