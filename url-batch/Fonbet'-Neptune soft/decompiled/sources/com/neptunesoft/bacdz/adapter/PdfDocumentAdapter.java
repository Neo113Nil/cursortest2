package com.neptunesoft.bacdz.adapter;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class PdfDocumentAdapter extends PrintDocumentAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    Context context;
    String pathName;

    public PdfDocumentAdapter(Context ctxt, String pathName) {
        this.context = ctxt;
        this.pathName = pathName;
    }

    @Override // android.print.PrintDocumentAdapter
    public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes1, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
            return;
        }
        PrintDocumentInfo.Builder builder = new PrintDocumentInfo.Builder(" file name");
        builder.setContentType(0).setPageCount(-1).build();
        layoutResultCallback.onLayoutFinished(builder.build(), !printAttributes1.equals(printAttributes));
    }

    @Override // android.print.PrintDocumentAdapter
    public void onWrite(PageRange[] pageRanges, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        OutputStream outputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Exception e;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(new File(this.pathName));
                    try {
                        fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                        try {
                            byte[] bArr = new byte[16384];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read < 0 || cancellationSignal.isCanceled()) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, read);
                                }
                            }
                            if (cancellationSignal.isCanceled()) {
                                writeResultCallback.onWriteCancelled();
                            } else {
                                writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                            }
                            fileInputStream.close();
                            fileOutputStream.close();
                        } catch (Exception e2) {
                            e = e2;
                            writeResultCallback.onWriteFailed(e.getMessage());
                            e.printStackTrace();
                            fileInputStream.close();
                            fileOutputStream.close();
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = null;
                        e = e;
                        writeResultCallback.onWriteFailed(e.getMessage());
                        e.printStackTrace();
                        fileInputStream.close();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        outputStream = null;
                        th = th;
                        try {
                            fileInputStream.close();
                            outputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            } catch (Exception e6) {
                e = e6;
                fileOutputStream = null;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                fileInputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
