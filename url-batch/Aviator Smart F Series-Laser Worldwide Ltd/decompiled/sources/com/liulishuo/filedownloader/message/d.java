package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.download.d;
import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.LargeMessageSnapshot;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.util.f;
import java.io.File;

/* loaded from: classes4.dex */
public class d {
    public static MessageSnapshot catchCanReusedOldFile(int i8, File file, boolean z7) {
        long length = file.length();
        return length > 2147483647L ? z7 ? new LargeMessageSnapshot.CompletedFlowDirectlySnapshot(i8, true, length) : new LargeMessageSnapshot.CompletedSnapshot(i8, true, length) : z7 ? new SmallMessageSnapshot.CompletedFlowDirectlySnapshot(i8, true, (int) length) : new SmallMessageSnapshot.CompletedSnapshot(i8, true, (int) length);
    }

    public static MessageSnapshot catchException(int i8, long j8, Throwable th) {
        return j8 > 2147483647L ? new LargeMessageSnapshot.ErrorMessageSnapshot(i8, j8, th) : new SmallMessageSnapshot.ErrorMessageSnapshot(i8, (int) j8, th);
    }

    public static MessageSnapshot catchPause(com.liulishuo.filedownloader.a aVar) {
        return aVar.isLargeFile() ? new LargeMessageSnapshot.PausedSnapshot(aVar.getId(), aVar.getLargeFileSoFarBytes(), aVar.getLargeFileTotalBytes()) : new SmallMessageSnapshot.PausedSnapshot(aVar.getId(), aVar.getSmallFileSoFarBytes(), aVar.getSmallFileTotalBytes());
    }

    public static MessageSnapshot catchWarn(int i8, long j8, long j9, boolean z7) {
        return j9 > 2147483647L ? z7 ? new LargeMessageSnapshot.WarnFlowDirectlySnapshot(i8, j8, j9) : new LargeMessageSnapshot.WarnMessageSnapshot(i8, j8, j9) : z7 ? new SmallMessageSnapshot.WarnFlowDirectlySnapshot(i8, (int) j8, (int) j9) : new SmallMessageSnapshot.WarnMessageSnapshot(i8, (int) j8, (int) j9);
    }

    public static MessageSnapshot take(byte b8, FileDownloadModel fileDownloadModel) {
        return take(b8, fileDownloadModel, null);
    }

    public static MessageSnapshot takeBlockCompleted(MessageSnapshot messageSnapshot) {
        if (messageSnapshot.getStatus() == -3) {
            return new BlockCompleteMessage.BlockCompleteMessageImpl(messageSnapshot);
        }
        throw new IllegalStateException(f.formatString("take block completed snapshot, must has already be completed. %d %d", Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(messageSnapshot.getStatus())));
    }

    public static MessageSnapshot take(byte b8, FileDownloadModel fileDownloadModel, d.a aVar) {
        MessageSnapshot errorMessageSnapshot;
        int id = fileDownloadModel.getId();
        if (b8 == -4) {
            throw new IllegalStateException(f.formatString("please use #catchWarn instead %d", Integer.valueOf(id)));
        }
        if (b8 == -3) {
            return fileDownloadModel.isLargeFile() ? new LargeMessageSnapshot.CompletedSnapshot(id, false, fileDownloadModel.getTotal()) : new SmallMessageSnapshot.CompletedSnapshot(id, false, (int) fileDownloadModel.getTotal());
        }
        if (b8 == -1) {
            errorMessageSnapshot = fileDownloadModel.isLargeFile() ? new LargeMessageSnapshot.ErrorMessageSnapshot(id, fileDownloadModel.getSoFar(), aVar.getException()) : new SmallMessageSnapshot.ErrorMessageSnapshot(id, (int) fileDownloadModel.getSoFar(), aVar.getException());
        } else {
            if (b8 == 1) {
                return fileDownloadModel.isLargeFile() ? new LargeMessageSnapshot.PendingMessageSnapshot(id, fileDownloadModel.getSoFar(), fileDownloadModel.getTotal()) : new SmallMessageSnapshot.PendingMessageSnapshot(id, (int) fileDownloadModel.getSoFar(), (int) fileDownloadModel.getTotal());
            }
            if (b8 == 2) {
                String filename = fileDownloadModel.isPathAsDirectory() ? fileDownloadModel.getFilename() : null;
                return fileDownloadModel.isLargeFile() ? new LargeMessageSnapshot.ConnectedMessageSnapshot(id, aVar.isResuming(), fileDownloadModel.getTotal(), fileDownloadModel.getETag(), filename) : new SmallMessageSnapshot.ConnectedMessageSnapshot(id, aVar.isResuming(), (int) fileDownloadModel.getTotal(), fileDownloadModel.getETag(), filename);
            }
            if (b8 == 3) {
                return fileDownloadModel.isLargeFile() ? new LargeMessageSnapshot.ProgressMessageSnapshot(id, fileDownloadModel.getSoFar()) : new SmallMessageSnapshot.ProgressMessageSnapshot(id, (int) fileDownloadModel.getSoFar());
            }
            if (b8 != 5) {
                if (b8 == 6) {
                    return new MessageSnapshot.StartedMessageSnapshot(id);
                }
                String formatString = f.formatString("it can't takes a snapshot for the task(%s) when its status is %d,", fileDownloadModel, Byte.valueOf(b8));
                com.liulishuo.filedownloader.util.d.w(d.class, "it can't takes a snapshot for the task(%s) when its status is %d,", fileDownloadModel, Byte.valueOf(b8));
                IllegalStateException illegalStateException = aVar.getException() != null ? new IllegalStateException(formatString, aVar.getException()) : new IllegalStateException(formatString);
                return fileDownloadModel.isLargeFile() ? new LargeMessageSnapshot.ErrorMessageSnapshot(id, fileDownloadModel.getSoFar(), illegalStateException) : new SmallMessageSnapshot.ErrorMessageSnapshot(id, (int) fileDownloadModel.getSoFar(), illegalStateException);
            }
            errorMessageSnapshot = fileDownloadModel.isLargeFile() ? new LargeMessageSnapshot.RetryMessageSnapshot(id, fileDownloadModel.getSoFar(), aVar.getException(), aVar.getRetryingTimes()) : new SmallMessageSnapshot.RetryMessageSnapshot(id, (int) fileDownloadModel.getSoFar(), aVar.getException(), aVar.getRetryingTimes());
        }
        return errorMessageSnapshot;
    }
}
