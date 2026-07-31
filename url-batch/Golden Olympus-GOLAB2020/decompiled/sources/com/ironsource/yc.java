package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
class yc implements Callable<eb> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f20424d = "FileWorkerThread";

    /* renamed from: e, reason: collision with root package name */
    private static final String f20425e = "X-Android-Protocols";

    /* renamed from: f, reason: collision with root package name */
    private static final String f20426f = "http/1.1,h2";

    /* renamed from: a, reason: collision with root package name */
    private final db f20427a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20428b;

    /* renamed from: c, reason: collision with root package name */
    private long f20429c;

    yc(db dbVar, String str, long j4) {
        this.f20427a = dbVar;
        this.f20428b = str;
        this.f20429c = j4;
    }

    int a(byte[] bArr, String str) {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public eb call() {
        yc ycVar;
        int i4;
        if (this.f20429c == 0) {
            this.f20429c = 1L;
        }
        eb ebVar = null;
        int i5 = 0;
        while (true) {
            if (i5 >= this.f20429c) {
                ycVar = this;
                break;
            }
            ycVar = this;
            ebVar = ycVar.a(this.f20427a.e(), i5, this.f20427a.a(), this.f20427a.c(), this.f20427a.f());
            int b4 = ebVar.b();
            if (b4 != 1008 && b4 != 1009) {
                break;
            }
            i5++;
        }
        eb ebVar2 = ebVar;
        if (ebVar2 != null && ebVar2.a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(ycVar.f20428b);
            String str = File.separator;
            sb.append(str);
            sb.append(ycVar.f20427a.b().getName());
            String sb2 = sb.toString();
            String str2 = ycVar.f20427a.d() + str + d9.f15836E + ycVar.f20427a.b().getName();
            try {
                if (a(ebVar2.a(), str2) == 0) {
                    ebVar2.a(1006);
                    return ebVar2;
                }
                if (!a(str2, sb2)) {
                    ebVar2.a(d9.f15849j);
                    return ebVar2;
                }
            } catch (FileNotFoundException e4) {
                o9.d().a(e4);
                i4 = 1018;
                ebVar2.a(i4);
            } catch (Error e5) {
                o9.d().a(e5);
                if (!TextUtils.isEmpty(e5.getMessage())) {
                    Logger.i(f20424d, e5.getMessage());
                }
                i4 = 1019;
                ebVar2.a(i4);
            } catch (Exception e6) {
                o9.d().a(e6);
                if (!TextUtils.isEmpty(e6.getMessage())) {
                    Logger.i(f20424d, e6.getMessage());
                }
                ebVar2.a(1009);
            }
        }
        return ebVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0130, code lost:
    
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011e, code lost:
    
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
    
        if (r4 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0163, code lost:
    
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0141, code lost:
    
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
    
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011c, code lost:
    
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[Catch: all -> 0x00a0, TRY_ENTER, TryCatch #0 {all -> 0x00a0, blocks: (B:20:0x009c, B:21:0x00a2, B:46:0x00dc), top: B:8:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    eb a(String str, int i4, int i5, int i6, boolean z4) {
        HttpURLConnection httpURLConnection;
        eb ebVar = new eb();
        if (TextUtils.isEmpty(str)) {
            ebVar.a(str);
            ebVar.a(1007);
            return ebVar;
        }
        InputStream inputStream = null;
        Object[] objArr = 0;
        InputStream inputStream2 = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        int i7 = 0;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                try {
                    URL url = new URL(str);
                    url.toURI();
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    try {
                        httpURLConnection.setRequestMethod(jn.f16864a);
                        if (z4) {
                            try {
                                httpURLConnection.setRequestProperty(f20425e, f20426f);
                            } catch (IllegalStateException e4) {
                                o9.d().a(e4);
                            }
                        }
                        httpURLConnection.setConnectTimeout(i5);
                        httpURLConnection.setReadTimeout(i6);
                        httpURLConnection.connect();
                        i7 = httpURLConnection.getResponseCode();
                    } catch (FileNotFoundException e5) {
                        e = e5;
                        o9.d().a(e);
                        i4 = 1018;
                        if (0 != 0) {
                            (objArr2 == true ? 1 : 0).close();
                        }
                    } catch (Error e6) {
                        e = e6;
                        o9.d().a(e);
                        i7 = 1019;
                        if (!TextUtils.isEmpty(e.getMessage())) {
                            Logger.i(f20424d, e.getMessage());
                        }
                        if (0 != 0) {
                            (objArr3 == true ? 1 : 0).close();
                        }
                    } catch (MalformedURLException e7) {
                        e = e7;
                        o9.d().a(e);
                        i4 = 1004;
                        if (0 != 0) {
                            (objArr4 == true ? 1 : 0).close();
                        }
                    } catch (SocketTimeoutException e8) {
                        e = e8;
                        o9.d().a(e);
                        i4 = 1008;
                        if (0 != 0) {
                            (objArr5 == true ? 1 : 0).close();
                        }
                    } catch (URISyntaxException e9) {
                        e = e9;
                        o9.d().a(e);
                        i4 = 1010;
                        if (0 != 0) {
                            (objArr6 == true ? 1 : 0).close();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        o9.d().a(e);
                        if (!TextUtils.isEmpty(e.getMessage())) {
                            Logger.i(f20424d, e.getMessage());
                        }
                        i4 = 1009;
                        if (0 != 0) {
                            (objArr7 == true ? 1 : 0).close();
                        }
                    }
                } catch (Throwable th2) {
                    o9.d().a(th2);
                    IronLog.INTERNAL.error(th2.toString());
                }
            } catch (Throwable th3) {
                o9.d().a(th3);
                IronLog.INTERNAL.error(th3.toString());
                ebVar.a(str);
                ebVar.a(i4);
                return ebVar;
            }
        } catch (FileNotFoundException e11) {
            e = e11;
            httpURLConnection = null;
        } catch (Error e12) {
            e = e12;
            httpURLConnection = null;
        } catch (MalformedURLException e13) {
            e = e13;
            httpURLConnection = null;
        } catch (SocketTimeoutException e14) {
            e = e14;
            httpURLConnection = null;
        } catch (URISyntaxException e15) {
            e = e15;
            httpURLConnection = null;
        } catch (Exception e16) {
            e = e16;
            httpURLConnection = null;
        } catch (Throwable th4) {
            th = th4;
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Throwable th5) {
                    o9.d().a(th5);
                    IronLog.INTERNAL.error(th5.toString());
                    ebVar.a(str);
                    ebVar.a(0);
                    throw th;
                }
            }
            if (0 != 0) {
                (objArr == true ? 1 : 0).disconnect();
            }
            ebVar.a(str);
            ebVar.a(0);
            throw th;
        }
        if (i7 >= 200 && i7 < 400) {
            inputStream2 = httpURLConnection.getInputStream();
            ebVar.a(a(inputStream2));
            if (inputStream2 != null) {
                inputStream2.close();
            }
            httpURLConnection.disconnect();
            ebVar.a(str);
            ebVar.a(i7);
            return ebVar;
        }
        Logger.i(f20424d, " RESPONSE CODE: " + i7 + " URL: " + str + " ATTEMPT: " + i4);
        i7 = 1011;
        if (inputStream2 != null) {
        }
        httpURLConnection.disconnect();
        ebVar.a(str);
        ebVar.a(i7);
        return ebVar;
    }

    boolean a(String str, String str2) {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
