package com.crrepa.band.my.device.appmarket.openharmony.service;

import android.os.Environment;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public class DownloadWatchFaceService {
    private static final int BUFFER_LENGTH = 1024000;
    private static final String TAG = "tagWatchConnectApp";

    public interface DownloadWatchFaceCallback {
        void onDownloadWatchFaceComplete(int i8, String str);

        void onDownloadWatchFaceProgress(long j8);
    }

    private boolean isFileExist(String str) {
        return new File(str).exists();
    }

    public void downloadWatchFace(JsonObject jsonObject, final DownloadWatchFaceCallback downloadWatchFaceCallback) {
        String asString = jsonObject.get("url").getAsString();
        String asString2 = jsonObject.get("name").getAsString();
        String asString3 = jsonObject.get("fileName").getAsString();
        if (asString.isEmpty() || asString2.isEmpty() || asString3.isEmpty()) {
            Log.i(TAG, "url/name/fileName is not set!!!");
            if (downloadWatchFaceCallback != null) {
                downloadWatchFaceCallback.onDownloadWatchFaceComplete(1, "url/name/fileName is not set!!!");
                return;
            }
            return;
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (!externalStoragePublicDirectory.exists()) {
            externalStoragePublicDirectory = com.moyoung.dafit.module.common.utils.d.get().getCacheDir();
        }
        final String format = String.format("%s/%s", externalStoragePublicDirectory, asString3);
        Log.i(TAG, "save file path:" + format);
        if (isFileExist(format) && !new File(format).delete()) {
            Log.i(TAG, "delete old watch face file fail!!");
        }
        new OkHttpClient().newCall(new Request.Builder().url(asString).build()).enqueue(new Callback() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.DownloadWatchFaceService.1
            @Override // okhttp3.Callback
            public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
                Log.e(DownloadWatchFaceService.TAG, "Download file fail, msg:" + iOException.getMessage());
                DownloadWatchFaceCallback downloadWatchFaceCallback2 = downloadWatchFaceCallback;
                if (downloadWatchFaceCallback2 != null) {
                    downloadWatchFaceCallback2.onDownloadWatchFaceComplete(1, iOException.getMessage());
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(@NonNull Call call, @NonNull Response response) {
                StringBuilder sb;
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        if (response.body() == null) {
                            Log.e(DownloadWatchFaceService.TAG, "Download file response body is error!!");
                            DownloadWatchFaceCallback downloadWatchFaceCallback2 = downloadWatchFaceCallback;
                            if (downloadWatchFaceCallback2 != null) {
                                downloadWatchFaceCallback2.onDownloadWatchFaceComplete(1, "Download file response body is error!!");
                                return;
                            }
                            return;
                        }
                        InputStream byteStream = response.body().byteStream();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(format);
                        try {
                            long contentLength = response.body().contentLength();
                            byte[] bArr = new byte[DownloadWatchFaceService.BUFFER_LENGTH];
                            int i8 = 0;
                            while (true) {
                                int read = byteStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, read);
                                i8 += read;
                                int i9 = (int) (((i8 * 1.0f) / contentLength) * 100.0f);
                                DownloadWatchFaceCallback downloadWatchFaceCallback3 = downloadWatchFaceCallback;
                                if (downloadWatchFaceCallback3 != null) {
                                    downloadWatchFaceCallback3.onDownloadWatchFaceProgress(i9);
                                }
                            }
                            DownloadWatchFaceCallback downloadWatchFaceCallback4 = downloadWatchFaceCallback;
                            if (downloadWatchFaceCallback4 != null) {
                                downloadWatchFaceCallback4.onDownloadWatchFaceComplete(0, "Download success!!");
                            }
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e8) {
                                e = e8;
                                sb = new StringBuilder();
                                sb.append("Close output stream fail, msg:");
                                sb.append(e.getMessage());
                                Log.e(DownloadWatchFaceService.TAG, sb.toString());
                            }
                        } catch (Exception e9) {
                            e = e9;
                            fileOutputStream = fileOutputStream2;
                            DownloadWatchFaceCallback downloadWatchFaceCallback5 = downloadWatchFaceCallback;
                            if (downloadWatchFaceCallback5 != null) {
                                downloadWatchFaceCallback5.onDownloadWatchFaceComplete(1, "Read/write file fail, msg:" + e.getMessage());
                            }
                            Log.e(DownloadWatchFaceService.TAG, "Read/write file fail, msg:" + e.getMessage());
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e10) {
                                    e = e10;
                                    sb = new StringBuilder();
                                    sb.append("Close output stream fail, msg:");
                                    sb.append(e.getMessage());
                                    Log.e(DownloadWatchFaceService.TAG, sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e11) {
                                    Log.e(DownloadWatchFaceService.TAG, "Close output stream fail, msg:" + e11.getMessage());
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        });
    }
}
