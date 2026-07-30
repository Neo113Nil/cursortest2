package com.crrepa.band.my.device.appmarket.openharmony.service;

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
public class DownloadAppService {
    private static final int BUFFER_LENGTH = 1024000;
    private static final String TAG = "tagWatchConnectApp";

    public interface DownloadListener {
        void onComplete(int i8, String str);

        void onProgress(long j8);
    }

    private boolean isFileExist(String str) {
        return new File(str).exists();
    }

    public void downloadApp(JsonObject jsonObject, final DownloadListener downloadListener) {
        Log.i(TAG, "DownloadAppService::DownloadApp:param:" + jsonObject);
        String asString = jsonObject.get("url").getAsString();
        String asString2 = jsonObject.get("packageName").getAsString();
        String asString3 = jsonObject.get("fileName").getAsString();
        Log.i(TAG, "DownloadAppService::DownloadApp, fileSize:" + jsonObject.get("fileSize").getAsBigInteger());
        if (asString.isEmpty() || asString2.isEmpty() || asString3.isEmpty()) {
            Log.e(TAG, "DownloadAppService::DownloadApp, url/packageName is not set!!!");
            if (downloadListener != null) {
                downloadListener.onComplete(1, "url/packageName is not set!!!");
                return;
            }
            return;
        }
        Log.i(TAG, "DownloadAppService::DownloadApp, url:" + asString);
        final String format = String.format("%s/%s", com.moyoung.dafit.module.common.utils.d.get().getCacheDir(), asString3);
        Log.i(TAG, "DownloadAppService::DownloadApp, save file path:" + format);
        if (isFileExist(format) && !new File(format).delete()) {
            Log.i(TAG, "DownloadAppService::DownloadApp, delete file fail!!");
        }
        new OkHttpClient().newCall(new Request.Builder().url(asString).build()).enqueue(new Callback() { // from class: com.crrepa.band.my.device.appmarket.openharmony.service.DownloadAppService.1
            @Override // okhttp3.Callback
            public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
                Log.e(DownloadAppService.TAG, "Download file fail, msg:" + iOException.getMessage());
                DownloadListener downloadListener2 = downloadListener;
                if (downloadListener2 != null) {
                    downloadListener2.onComplete(1, iOException.getMessage());
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(@NonNull Call call, @NonNull Response response) {
                StringBuilder sb;
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        if (response.body() == null) {
                            Log.e(DownloadAppService.TAG, "Download file response body is error!!");
                            DownloadListener downloadListener2 = downloadListener;
                            if (downloadListener2 != null) {
                                downloadListener2.onComplete(1, "Download file response body is error!!");
                                return;
                            }
                            return;
                        }
                        InputStream byteStream = response.body().byteStream();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(format);
                        try {
                            long contentLength = response.body().contentLength();
                            byte[] bArr = new byte[DownloadAppService.BUFFER_LENGTH];
                            int i8 = 0;
                            while (true) {
                                int read = byteStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, read);
                                i8 += read;
                                int i9 = (int) (((i8 * 1.0f) / contentLength) * 100.0f);
                                DownloadListener downloadListener3 = downloadListener;
                                if (downloadListener3 != null) {
                                    downloadListener3.onProgress(i9);
                                }
                            }
                            DownloadListener downloadListener4 = downloadListener;
                            if (downloadListener4 != null) {
                                downloadListener4.onComplete(0, "Download success!!");
                            }
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e8) {
                                e = e8;
                                sb = new StringBuilder();
                                sb.append("Close output stream fail, msg:");
                                sb.append(e.getMessage());
                                Log.e(DownloadAppService.TAG, sb.toString());
                            }
                        } catch (Exception e9) {
                            e = e9;
                            fileOutputStream = fileOutputStream2;
                            DownloadListener downloadListener5 = downloadListener;
                            if (downloadListener5 != null) {
                                downloadListener5.onComplete(1, "Read/write file fail, msg:" + e.getMessage());
                            }
                            Log.e(DownloadAppService.TAG, "Read/write file fail, msg:" + e.getMessage());
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e10) {
                                    e = e10;
                                    sb = new StringBuilder();
                                    sb.append("Close output stream fail, msg:");
                                    sb.append(e.getMessage());
                                    Log.e(DownloadAppService.TAG, sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e11) {
                                    Log.e(DownloadAppService.TAG, "Close output stream fail, msg:" + e11.getMessage());
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
