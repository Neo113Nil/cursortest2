package com.moyoung.lib.ai.img;

import android.util.Log;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class e {
    private static final String TAG = "ImgDownloader";
    private final OkHttpClient client;

    class a implements Callback {
        final /* synthetic */ b val$callback;
        final /* synthetic */ String val$imageUrl;
        final /* synthetic */ String val$imgFileDir;
        final /* synthetic */ String val$taskId;

        a(b bVar, String str, String str2, String str3) {
            this.val$callback = bVar;
            this.val$imgFileDir = str;
            this.val$imageUrl = str2;
            this.val$taskId = str3;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            Log.e(e.TAG, "下载图片失败: " + iOException.getMessage(), iOException);
            this.val$callback.onError("下载图片失败: " + iOException.getMessage());
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            Log.d(e.TAG, "响应码: " + response.code());
            Log.d(e.TAG, "响应消息: " + response.message());
            String header = response.header("Content-Type");
            String header2 = response.header("Content-Length");
            String header3 = response.header("Content-Encoding");
            Log.d(e.TAG, "内容类型: " + header);
            Log.d(e.TAG, "内容长度: " + header2);
            Log.d(e.TAG, "内容编码: " + header3);
            if (!response.isSuccessful()) {
                String str = "下载图片失败: " + response.code() + l.SPACE + response.message();
                Log.e(e.TAG, str);
                this.val$callback.onError(str);
                response.close();
                return;
            }
            if (header == null || !(header.startsWith("image/") || header.equals("application/octet-stream"))) {
                Log.e(e.TAG, "响应不是图片类型: " + header);
                this.val$callback.onError("响应不是图片类型: " + header);
                response.close();
                return;
            }
            try {
                try {
                    if (response.body() != null) {
                        File file = new File(this.val$imgFileDir);
                        if (!file.exists()) {
                            Log.d(e.TAG, "创建目录结果: " + file.mkdirs());
                        }
                        File file2 = new File(file, "moy_ai_image_" + this.val$taskId + e.this.getFileExtension(this.val$imageUrl, response));
                        StringBuilder sb = new StringBuilder();
                        sb.append("保存文件路径: ");
                        sb.append(file2.getAbsolutePath());
                        Log.d(e.TAG, sb.toString());
                        if (file2.exists()) {
                            file2.delete();
                        }
                        if (e.this.writeImageToFileBinarySafe(response, file2) && file2.exists() && file2.length() > 0) {
                            Log.d(e.TAG, "文件保存成功，大小: " + file2.length() + " 字节");
                            String validateImageFile = e.this.validateImageFile(file2);
                            Log.d(e.TAG, "文件验证结果: " + validateImageFile);
                            if ("VALID".equals(validateImageFile)) {
                                this.val$callback.onSuccess(file2.getAbsolutePath(), this.val$taskId);
                            } else {
                                this.val$callback.onError("文件验证失败: " + validateImageFile);
                            }
                        } else {
                            Log.e(e.TAG, "文件保存失败");
                            this.val$callback.onError("文件保存失败");
                        }
                    } else {
                        Log.e(e.TAG, "响应体为空");
                        this.val$callback.onError("图片数据为空");
                    }
                } catch (Exception e8) {
                    Log.e(e.TAG, "保存图片失败: " + e8.getMessage(), e8);
                    this.val$callback.onError("保存图片失败: " + e8.getMessage());
                }
                response.close();
            } catch (Throwable th) {
                response.close();
                throw th;
            }
        }
    }

    public e() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.client = builder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getFileExtension(String str, Response response) {
        String str2;
        String header = response.header("Content-Type");
        if (header != null) {
            if (header.contains(MimeTypes.IMAGE_JPEG) || header.contains("image/jpg")) {
                str2 = ".jpg";
            } else if (!header.contains(MimeTypes.IMAGE_PNG)) {
                if (header.contains("image/gif")) {
                    str2 = ".gif";
                } else if (header.contains(MimeTypes.IMAGE_WEBP)) {
                    str2 = ".webp";
                }
            }
            if (str.contains(".")) {
                if (str.contains("?")) {
                    str = str.substring(0, str.indexOf("?"));
                }
                int lastIndexOf = str.lastIndexOf(".");
                if (lastIndexOf != -1 && lastIndexOf < str.length() - 1) {
                    str2 = str.substring(lastIndexOf);
                }
            }
            if (!str2.startsWith(".")) {
                str2 = "." + str2;
            }
            String str3 = str2.matches("\\.[a-zA-Z0-9]+") ? str2 : ".png";
            Log.d(TAG, "确定文件扩展名: " + str3);
            return str3;
        }
        str2 = ".png";
        if (str.contains(".")) {
        }
        if (!str2.startsWith(".")) {
        }
        if (str2.matches("\\.[a-zA-Z0-9]+")) {
        }
        Log.d(TAG, "确定文件扩展名: " + str3);
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String validateImageFile(File file) {
        try {
            if (!file.exists()) {
                return "文件不存在";
            }
            if (file.length() == 0) {
                return "文件为空";
            }
            if (file.length() < 10) {
                return "文件过小";
            }
            byte[] bArr = new byte[32];
            FileInputStream fileInputStream = new FileInputStream(file);
            int read = fileInputStream.read(bArr);
            fileInputStream.close();
            if (read < 8) {
                return "文件头数据不足";
            }
            StringBuilder sb = new StringBuilder("文件头(Hex): ");
            for (int i8 = 0; i8 < Math.min(read, 16); i8++) {
                sb.append(String.format("%02X ", Integer.valueOf(255 & bArr[i8])));
            }
            Log.d(TAG, sb.toString());
            byte b8 = bArr[0];
            return ((b8 & 255) == 137 && (bArr[1] & 255) == 80 && (bArr[2] & 255) == 78 && (bArr[3] & 255) == 71 && (bArr[4] & 255) == 13 && (bArr[5] & 255) == 10 && (bArr[6] & 255) == 26 && (bArr[7] & 255) == 10) ? "VALID" : ((b8 & 255) == 255 && (bArr[1] & 255) == 216 && (bArr[2] & 255) == 255) ? "VALID" : ((b8 & 255) == 71 && (bArr[1] & 255) == 73 && (bArr[2] & 255) == 70) ? (bArr[3] & 255) == 56 ? "VALID" : "未知文件格式" : "未知文件格式";
        } catch (Exception e8) {
            Log.e(TAG, "验证图片文件时出错", e8);
            return "验证出错: " + e8.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean writeImageToFileBinarySafe(Response response, File file) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream byteStream = response.body().byteStream();
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    long j8 = 0;
                    while (true) {
                        int read = byteStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        j8 += read;
                    }
                    fileOutputStream.flush();
                    Log.d(TAG, "写入完成，总字节数: " + j8);
                    boolean z7 = j8 > 0;
                    try {
                        byteStream.close();
                    } catch (IOException e8) {
                        Log.e(TAG, "关闭输入流失败", e8);
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e9) {
                        Log.e(TAG, "关闭输出流失败", e9);
                    }
                    return z7;
                } catch (IOException e10) {
                    e = e10;
                    inputStream = byteStream;
                    try {
                        Log.e(TAG, "写入文件时出错", e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e11) {
                                Log.e(TAG, "关闭输入流失败", e11);
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e12) {
                                Log.e(TAG, "关闭输出流失败", e12);
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e13) {
                                Log.e(TAG, "关闭输入流失败", e13);
                            }
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e14) {
                            Log.e(TAG, "关闭输出流失败", e14);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = byteStream;
                    if (inputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                }
            } catch (IOException e15) {
                e = e15;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e16) {
            e = e16;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public void downloadAndSaveImage(String str, String str2, String str3, b bVar) {
        Log.d(TAG, "开始下载图片: " + str);
        this.client.newCall(new Request.Builder().url(str).build()).enqueue(new a(bVar, str2, str, str3));
    }
}
