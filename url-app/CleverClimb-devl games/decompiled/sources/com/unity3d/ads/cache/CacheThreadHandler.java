package com.unity3d.ads.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.ads.api.Request;
import com.unity3d.ads.device.Device;
import com.unity3d.ads.log.DeviceLog;
import com.unity3d.ads.request.IWebRequestProgressListener;
import com.unity3d.ads.request.NetworkIOException;
import com.unity3d.ads.request.WebRequest;
import com.unity3d.ads.webview.WebViewApp;
import com.unity3d.ads.webview.WebViewEventCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    CacheThreadHandler() {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        HashMap<String, List<String>> hashMap;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            HashMap<String, List<String>> hashMap2 = new HashMap<>();
            for (String str : data.keySet()) {
                hashMap2.put(str, Arrays.asList(data.getStringArray(str)));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this._active = false;
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i, i2, i3, hashMap, z);
        }
    }

    public void setCancelStatus(boolean z) {
        this._canceled = z;
        if (!z || this._currentRequest == null) {
            return;
        }
        this._active = false;
        this._currentRequest.cancel();
    }

    public boolean isActive() {
        return this._active;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void downloadFile(String str, String str2, int i, int i2, final int i3, HashMap<String, List<String>> hashMap, boolean z) {
        boolean z2;
        char c2;
        WebRequest webRequest;
        ?? r6;
        WebRequest webRequest2;
        ?? r62;
        WebRequest webRequest3;
        ?? r63;
        WebRequest webRequest4;
        ?? r64;
        WebRequest webRequest5;
        boolean z3;
        Throwable th;
        WebRequest webRequest6;
        ?? r65;
        WebViewApp currentApp;
        WebViewEventCategory webViewEventCategory;
        CacheEvent cacheEvent;
        Object[] objArr;
        FileOutputStream fileOutputStream;
        WebRequest webRequest7;
        boolean z4;
        WebRequest webRequest8;
        boolean z5;
        WebRequest webRequest9;
        boolean z6;
        WebRequest webRequest10;
        boolean z7;
        WebRequest webRequest11;
        boolean z8;
        WebRequest webRequest12;
        boolean z9;
        long makeStreamRequest;
        WebRequest webRequest13;
        if (this._canceled || str == null || str2 == null) {
            return;
        }
        final File file = new File(str2);
        if (z) {
            DeviceLog.debug("Unity Ads cache: resuming download " + str + " to " + str2 + " at " + file.length() + " bytes");
        } else {
            DeviceLog.debug("Unity Ads cache: start downloading " + str + " to " + str2);
        }
        ?? r15 = 2;
        if (!Device.isActiveNetworkConnected()) {
            DeviceLog.debug("Unity Ads cache: download cancelled, no internet connection available");
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_ERROR, CacheError.NO_INTERNET, str);
            return;
        }
        this._active = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file, z);
                try {
                    this._currentRequest = getWebRequest(str, i, i2, hashMap);
                    this._currentRequest.setProgressListener(new IWebRequestProgressListener() { // from class: com.unity3d.ads.cache.CacheThreadHandler.1
                        private long lastProgressEventTime = System.currentTimeMillis();

                        @Override // com.unity3d.ads.request.IWebRequestProgressListener
                        public void onRequestStart(String str3, long j, int i4, Map<String, List<String>> map) {
                            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_STARTED, str3, Long.valueOf(file.length()), Long.valueOf(j + file.length()), Integer.valueOf(i4), Request.getResponseHeadersMap(map));
                        }

                        @Override // com.unity3d.ads.request.IWebRequestProgressListener
                        public void onRequestProgress(String str3, long j, long j2) {
                            if (i3 <= 0 || System.currentTimeMillis() - this.lastProgressEventTime <= i3) {
                                return;
                            }
                            this.lastProgressEventTime = System.currentTimeMillis();
                            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_PROGRESS, str3, Long.valueOf(j), Long.valueOf(j2));
                        }
                    });
                    makeStreamRequest = this._currentRequest.makeStreamRequest(fileOutputStream3);
                    this._active = false;
                    fileOutputStream = fileOutputStream3;
                    webRequest13 = null;
                    c2 = 1;
                } catch (NetworkIOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream3;
                    webRequest12 = null;
                    z9 = false;
                    c2 = 1;
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream3;
                    webRequest11 = null;
                    z8 = false;
                    c2 = 1;
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream3;
                    webRequest10 = null;
                    z7 = false;
                    c2 = 1;
                } catch (IllegalStateException e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream3;
                    webRequest9 = null;
                    z6 = false;
                    c2 = 1;
                } catch (MalformedURLException e5) {
                    e = e5;
                    fileOutputStream = fileOutputStream3;
                    webRequest8 = null;
                    z5 = false;
                    c2 = 1;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream3;
                    webRequest7 = null;
                    z4 = false;
                    c2 = 1;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                r65 = z2;
                webRequest6 = r15;
                this._currentRequest = webRequest6;
                if (fileOutputStream2 == null) {
                    throw th;
                }
                try {
                    fileOutputStream2.close();
                    throw th;
                } catch (Exception e6) {
                    DeviceLog.exception("Error closing stream", e6);
                    WebViewApp currentApp2 = WebViewApp.getCurrentApp();
                    WebViewEventCategory webViewEventCategory2 = WebViewEventCategory.CACHE;
                    CacheEvent cacheEvent2 = CacheEvent.DOWNLOAD_ERROR;
                    Object[] objArr2 = new Object[3];
                    objArr2[r65] = CacheError.FILE_IO_ERROR;
                    objArr2[c2] = str;
                    objArr2[2] = e6.getMessage();
                    currentApp2.sendEvent(webViewEventCategory2, cacheEvent2, objArr2);
                    throw th;
                }
            }
        } catch (NetworkIOException e7) {
            e = e7;
            webRequest5 = null;
            z3 = false;
            c2 = 1;
        } catch (FileNotFoundException e8) {
            e = e8;
            webRequest4 = null;
            r64 = 0;
            c2 = 1;
        } catch (IOException e9) {
            e = e9;
            webRequest3 = null;
            r63 = 0;
            c2 = 1;
        } catch (IllegalStateException e10) {
            e = e10;
            webRequest2 = null;
            r62 = 0;
            c2 = 1;
        } catch (MalformedURLException e11) {
            e = e11;
            webRequest = null;
            r6 = 0;
            c2 = 1;
        } catch (Throwable th4) {
            th = th4;
            r15 = 0;
            z2 = false;
            c2 = 1;
            th = th;
            r65 = z2;
            webRequest6 = r15;
            this._currentRequest = webRequest6;
            if (fileOutputStream2 == null) {
            }
        }
        try {
            postProcessDownload(elapsedRealtime, str, file, makeStreamRequest, this._currentRequest.getContentLength(), this._currentRequest.isCanceled(), this._currentRequest.getResponseCode(), this._currentRequest.getResponseHeaders());
            this._currentRequest = null;
            try {
                fileOutputStream.close();
            } catch (Exception e12) {
                DeviceLog.exception("Error closing stream", e12);
                currentApp = WebViewApp.getCurrentApp();
                webViewEventCategory = WebViewEventCategory.CACHE;
                cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                objArr = new Object[]{CacheError.FILE_IO_ERROR, str, e12.getMessage()};
                currentApp.sendEvent(webViewEventCategory, cacheEvent, objArr);
            }
        } catch (NetworkIOException e13) {
            e = e13;
            z9 = false;
            webRequest12 = webRequest13;
            fileOutputStream2 = fileOutputStream;
            z3 = z9;
            webRequest5 = webRequest12;
            DeviceLog.exception("Network error", e);
            this._active = z3;
            WebViewApp currentApp3 = WebViewApp.getCurrentApp();
            WebViewEventCategory webViewEventCategory3 = WebViewEventCategory.CACHE;
            CacheEvent cacheEvent3 = CacheEvent.DOWNLOAD_ERROR;
            Object[] objArr3 = new Object[3];
            objArr3[z3 ? 1 : 0] = CacheError.NETWORK_ERROR;
            objArr3[c2] = str;
            objArr3[2] = e.getMessage();
            currentApp3.sendEvent(webViewEventCategory3, cacheEvent3, objArr3);
            this._currentRequest = webRequest5;
            z2 = z3;
            r15 = webRequest5;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    z2 = z3;
                    r15 = webRequest5;
                } catch (Exception e14) {
                    DeviceLog.exception("Error closing stream", e14);
                    currentApp = WebViewApp.getCurrentApp();
                    webViewEventCategory = WebViewEventCategory.CACHE;
                    cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                    objArr = new Object[3];
                    objArr[z3 ? 1 : 0] = CacheError.FILE_IO_ERROR;
                    objArr[c2] = str;
                    objArr[2] = e14.getMessage();
                    currentApp.sendEvent(webViewEventCategory, cacheEvent, objArr);
                }
            }
        } catch (FileNotFoundException e15) {
            e = e15;
            z8 = false;
            webRequest11 = webRequest13;
            fileOutputStream2 = fileOutputStream;
            r64 = z8;
            webRequest4 = webRequest11;
            DeviceLog.exception("Couldn't create target file", e);
            this._active = r64;
            WebViewApp currentApp4 = WebViewApp.getCurrentApp();
            WebViewEventCategory webViewEventCategory4 = WebViewEventCategory.CACHE;
            CacheEvent cacheEvent4 = CacheEvent.DOWNLOAD_ERROR;
            Object[] objArr4 = new Object[3];
            objArr4[r64] = CacheError.FILE_IO_ERROR;
            objArr4[c2] = str;
            objArr4[2] = e.getMessage();
            currentApp4.sendEvent(webViewEventCategory4, cacheEvent4, objArr4);
            this._currentRequest = webRequest4;
            z2 = r64;
            r15 = webRequest4;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    z2 = r64;
                    r15 = webRequest4;
                } catch (Exception e16) {
                    DeviceLog.exception("Error closing stream", e16);
                    currentApp = WebViewApp.getCurrentApp();
                    webViewEventCategory = WebViewEventCategory.CACHE;
                    cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                    objArr = new Object[3];
                    objArr[r64] = CacheError.FILE_IO_ERROR;
                    objArr[c2] = str;
                    objArr[2] = e16.getMessage();
                    currentApp.sendEvent(webViewEventCategory, cacheEvent, objArr);
                }
            }
        } catch (IOException e17) {
            e = e17;
            z7 = false;
            webRequest10 = webRequest13;
            fileOutputStream2 = fileOutputStream;
            r63 = z7;
            webRequest3 = webRequest10;
            DeviceLog.exception("Couldn't request stream", e);
            this._active = r63;
            WebViewApp currentApp5 = WebViewApp.getCurrentApp();
            WebViewEventCategory webViewEventCategory5 = WebViewEventCategory.CACHE;
            CacheEvent cacheEvent5 = CacheEvent.DOWNLOAD_ERROR;
            Object[] objArr5 = new Object[3];
            objArr5[r63] = CacheError.FILE_IO_ERROR;
            objArr5[c2] = str;
            objArr5[2] = e.getMessage();
            currentApp5.sendEvent(webViewEventCategory5, cacheEvent5, objArr5);
            this._currentRequest = webRequest3;
            z2 = r63;
            r15 = webRequest3;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    z2 = r63;
                    r15 = webRequest3;
                } catch (Exception e18) {
                    DeviceLog.exception("Error closing stream", e18);
                    currentApp = WebViewApp.getCurrentApp();
                    webViewEventCategory = WebViewEventCategory.CACHE;
                    cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                    objArr = new Object[3];
                    objArr[r63] = CacheError.FILE_IO_ERROR;
                    objArr[c2] = str;
                    objArr[2] = e18.getMessage();
                    currentApp.sendEvent(webViewEventCategory, cacheEvent, objArr);
                }
            }
        } catch (IllegalStateException e19) {
            e = e19;
            z6 = false;
            webRequest9 = webRequest13;
            fileOutputStream2 = fileOutputStream;
            r62 = z6;
            webRequest2 = webRequest9;
            DeviceLog.exception("Illegal state", e);
            this._active = r62;
            WebViewApp currentApp6 = WebViewApp.getCurrentApp();
            WebViewEventCategory webViewEventCategory6 = WebViewEventCategory.CACHE;
            CacheEvent cacheEvent6 = CacheEvent.DOWNLOAD_ERROR;
            Object[] objArr6 = new Object[3];
            objArr6[r62] = CacheError.ILLEGAL_STATE;
            objArr6[c2] = str;
            objArr6[2] = e.getMessage();
            currentApp6.sendEvent(webViewEventCategory6, cacheEvent6, objArr6);
            this._currentRequest = webRequest2;
            z2 = r62;
            r15 = webRequest2;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    z2 = r62;
                    r15 = webRequest2;
                } catch (Exception e20) {
                    DeviceLog.exception("Error closing stream", e20);
                    currentApp = WebViewApp.getCurrentApp();
                    webViewEventCategory = WebViewEventCategory.CACHE;
                    cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                    objArr = new Object[3];
                    objArr[r62] = CacheError.FILE_IO_ERROR;
                    objArr[c2] = str;
                    objArr[2] = e20.getMessage();
                    currentApp.sendEvent(webViewEventCategory, cacheEvent, objArr);
                }
            }
        } catch (MalformedURLException e21) {
            e = e21;
            z5 = false;
            webRequest8 = webRequest13;
            fileOutputStream2 = fileOutputStream;
            r6 = z5;
            webRequest = webRequest8;
            DeviceLog.exception("Malformed URL", e);
            this._active = r6;
            WebViewApp currentApp7 = WebViewApp.getCurrentApp();
            WebViewEventCategory webViewEventCategory7 = WebViewEventCategory.CACHE;
            CacheEvent cacheEvent7 = CacheEvent.DOWNLOAD_ERROR;
            Object[] objArr7 = new Object[3];
            objArr7[r6] = CacheError.MALFORMED_URL;
            objArr7[c2] = str;
            objArr7[2] = e.getMessage();
            currentApp7.sendEvent(webViewEventCategory7, cacheEvent7, objArr7);
            this._currentRequest = webRequest;
            z2 = r6;
            r15 = webRequest;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    z2 = r6;
                    r15 = webRequest;
                } catch (Exception e22) {
                    DeviceLog.exception("Error closing stream", e22);
                    currentApp = WebViewApp.getCurrentApp();
                    webViewEventCategory = WebViewEventCategory.CACHE;
                    cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                    objArr = new Object[3];
                    objArr[r6] = CacheError.FILE_IO_ERROR;
                    objArr[c2] = str;
                    objArr[2] = e22.getMessage();
                    currentApp.sendEvent(webViewEventCategory, cacheEvent, objArr);
                }
            }
        } catch (Throwable th5) {
            th = th5;
            z4 = false;
            webRequest7 = webRequest13;
            th = th;
            fileOutputStream2 = fileOutputStream;
            r65 = z4;
            webRequest6 = webRequest7;
            this._currentRequest = webRequest6;
            if (fileOutputStream2 == null) {
            }
        }
    }

    private void postProcessDownload(long j, String str, File file, long j2, long j3, boolean z, int i, Map<String, List<String>> map) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (!z) {
            DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + elapsedRealtime + "ms");
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_END, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    private WebRequest getWebRequest(String str, int i, int i2, HashMap<String, List<String>> hashMap) throws MalformedURLException {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new WebRequest(str, "GET", hashMap2, i, i2);
    }
}
