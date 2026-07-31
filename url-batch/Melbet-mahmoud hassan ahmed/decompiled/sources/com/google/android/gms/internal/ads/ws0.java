package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ws0 extends ts0 {

    /* renamed from: k, reason: collision with root package name */
    private static final Set<String> f13930k = Collections.synchronizedSet(new HashSet());

    /* renamed from: l, reason: collision with root package name */
    private static final DecimalFormat f13931l = new DecimalFormat("#,###");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f13932m = 0;

    /* renamed from: i, reason: collision with root package name */
    private File f13933i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13934j;

    public ws0(tq0 tq0Var) {
        super(tq0Var);
        File cacheDir = this.f12367f.getCacheDir();
        if (cacheDir == null) {
            io0.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f13933i = file;
        if (!file.isDirectory() && !this.f13933i.mkdirs()) {
            String valueOf = String.valueOf(this.f13933i.getAbsolutePath());
            io0.g(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.f13933i = null;
        } else {
            if (this.f13933i.setReadable(true, false) && this.f13933i.setExecutable(true, false)) {
                return;
            }
            String valueOf2 = String.valueOf(this.f13933i.getAbsolutePath());
            io0.g(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.f13933i = null;
        }
    }

    private final File w(File file) {
        return new File(this.f13933i, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final void g() {
        this.f13934j = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x036e, code lost:
    
        r26 = r4;
        r24 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0374, code lost:
    
        r15 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0376, code lost:
    
        r0 = java.lang.Long.toString(r10);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r11 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03a1, code lost:
    
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03a2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a5, code lost:
    
        r2 = r11;
        r1 = r24;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02ab, code lost:
    
        r15 = "sizeExceeded";
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02ad, code lost:
    
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02bb, code lost:
    
        if (r1.length() == 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02bd, code lost:
    
        r11 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02d0, code lost:
    
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02d1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02d4, code lost:
    
        r2 = r11;
        r1 = r14;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02c8, code lost:
    
        r11 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02d9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02dc, code lost:
    
        r11 = r4;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03bd, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03c3, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03cb, code lost:
    
        if (com.google.android.gms.internal.ads.io0.j(3) == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03cd, code lost:
    
        r1 = com.google.android.gms.internal.ads.ws0.f13931l.format(r13);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r30).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r30);
        com.google.android.gms.internal.ads.io0.b(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0403, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x040c, code lost:
    
        if (r0.isFile() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x040e, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0416, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04c9  */
    @Override // com.google.android.gms.internal.ads.ts0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(final String str) {
        int i7;
        File file;
        String str2;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        String str5;
        int i8;
        String str6;
        a3.g1 g1Var;
        FileChannel fileChannel;
        ReadableByteChannel readableByteChannel;
        int i9;
        int i10;
        int responseCode;
        String concat;
        boolean z6;
        FileOutputStream fileOutputStream2 = null;
        if (this.f13933i == null) {
            h(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file2 = this.f13933i;
            if (file2 == null) {
                i7 = 0;
            } else {
                i7 = 0;
                for (File file3 : file2.listFiles()) {
                    if (!file3.getName().endsWith(".done")) {
                        i7++;
                    }
                }
            }
            if (i7 <= ((Integer) sw.c().b(m10.f8272p)).intValue()) {
                file = new File(this.f13933i, bo0.e(str));
                File w6 = w(file);
                if (file.isFile() && w6.isFile()) {
                    int length = (int) file.length();
                    String valueOf = String.valueOf(str);
                    io0.b(valueOf.length() != 0 ? "Stream cache hit at ".concat(valueOf) : new String("Stream cache hit at "));
                    i(str, file.getAbsolutePath(), length);
                    return true;
                }
                String valueOf2 = String.valueOf(this.f13933i.getAbsolutePath());
                String valueOf3 = String.valueOf(str);
                String concat2 = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                Set<String> set = f13930k;
                synchronized (set) {
                    if (set.contains(concat2)) {
                        String valueOf4 = String.valueOf(str);
                        io0.g(valueOf4.length() != 0 ? "Stream cache already in progress at ".concat(valueOf4) : new String("Stream cache already in progress at "));
                        h(str, file.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(concat2);
                    str2 = "error";
                    try {
                        HttpURLConnection v6 = f33.b().v(new m33() { // from class: com.google.android.gms.internal.ads.vs0
                            @Override // com.google.android.gms.internal.ads.m33
                            public final URLConnection zza() {
                                String str7 = str;
                                int i11 = ws0.f13932m;
                                y2.t.x();
                                int intValue = ((Integer) sw.c().b(m10.f8311u)).intValue();
                                URL url = new URL(str7);
                                int i12 = 0;
                                while (true) {
                                    i12++;
                                    if (i12 > 20) {
                                        throw new IOException("Too many redirects (20)");
                                    }
                                    URLConnection openConnection = url.openConnection();
                                    openConnection.setConnectTimeout(intValue);
                                    openConnection.setReadTimeout(intValue);
                                    if (!(openConnection instanceof HttpURLConnection)) {
                                        throw new IOException("Invalid protocol.");
                                    }
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                    ho0 ho0Var = new ho0(null);
                                    ho0Var.c(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode2 = httpURLConnection.getResponseCode();
                                    ho0Var.e(httpURLConnection, responseCode2);
                                    if (responseCode2 / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    String headerField = httpURLConnection.getHeaderField("Location");
                                    if (headerField == null) {
                                        throw new IOException("Missing Location header in redirect");
                                    }
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new IOException("Protocol is null");
                                    }
                                    if (!protocol.equals("http") && !protocol.equals("https")) {
                                        throw new IOException(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
                                    }
                                    io0.b(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if ((v6 instanceof HttpURLConnection) && (responseCode = v6.getResponseCode()) >= 400) {
                            str2 = "badUrl";
                            try {
                                String valueOf5 = String.valueOf(Integer.toString(responseCode));
                                concat = valueOf5.length() != 0 ? "HTTP request failed. Code: ".concat(valueOf5) : new String("HTTP request failed. Code: ");
                            } catch (IOException | RuntimeException e7) {
                                e = e7;
                                str4 = null;
                            }
                            try {
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32);
                                sb.append("HTTP status code ");
                                sb.append(responseCode);
                                sb.append(" at ");
                                sb.append(str);
                                throw new IOException(sb.toString());
                            } catch (IOException | RuntimeException e8) {
                                e = e8;
                                str4 = concat;
                                str3 = concat2;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream2.close();
                                if (this.f13934j) {
                                }
                                if (file.exists()) {
                                }
                                h(str, file.getAbsolutePath(), str2, str4);
                                f13930k.remove(str3);
                                return false;
                            }
                        }
                        int contentLength = v6.getContentLength();
                        if (contentLength < 0) {
                            String valueOf6 = String.valueOf(str);
                            io0.g(valueOf6.length() != 0 ? "Stream cache aborted, missing content-length header at ".concat(valueOf6) : new String("Stream cache aborted, missing content-length header at "));
                            h(str, file.getAbsolutePath(), "contentLengthMissing", null);
                            set.remove(concat2);
                            return false;
                        }
                        String format = f13931l.format(contentLength);
                        int intValue = ((Integer) sw.c().b(m10.f8280q)).intValue();
                        if (contentLength > intValue) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + 33 + String.valueOf(str).length());
                            sb2.append("Content length ");
                            sb2.append(format);
                            sb2.append(" exceeds limit at ");
                            sb2.append(str);
                            io0.g(sb2.toString());
                            String valueOf7 = String.valueOf(format);
                            h(str, file.getAbsolutePath(), "sizeExceeded", valueOf7.length() != 0 ? "File too big for full file cache. Size: ".concat(valueOf7) : new String("File too big for full file cache. Size: "));
                            set.remove(concat2);
                            return false;
                        }
                        StringBuilder sb3 = new StringBuilder(String.valueOf(format).length() + 20 + String.valueOf(str).length());
                        sb3.append("Caching ");
                        sb3.append(format);
                        sb3.append(" bytes from ");
                        sb3.append(str);
                        io0.b(sb3.toString());
                        ReadableByteChannel newChannel = Channels.newChannel(v6.getInputStream());
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            FileChannel channel = fileOutputStream3.getChannel();
                            ByteBuffer allocate = ByteBuffer.allocate(1048576);
                            v3.d a7 = y2.t.a();
                            long b7 = a7.b();
                            a3.g1 g1Var2 = new a3.g1(((Long) sw.c().b(m10.f8304t)).longValue());
                            long longValue = ((Long) sw.c().b(m10.f8296s)).longValue();
                            i8 = 0;
                            while (true) {
                                int read = newChannel.read(allocate);
                                if (read < 0) {
                                    break;
                                }
                                i8 += read;
                                if (i8 > intValue) {
                                    break;
                                }
                                try {
                                    allocate.flip();
                                    do {
                                    } while (channel.write(allocate) > 0);
                                    allocate.clear();
                                } catch (IOException | RuntimeException e9) {
                                    e = e9;
                                    fileOutputStream = fileOutputStream3;
                                    str5 = str2;
                                }
                                try {
                                    if (a7.b() - b7 > 1000 * longValue) {
                                        break;
                                    }
                                    ByteBuffer byteBuffer = allocate;
                                    if (this.f13934j) {
                                        throw new IOException("abort requested");
                                    }
                                    if (g1Var2.b()) {
                                        str5 = str2;
                                        try {
                                            g1Var = g1Var2;
                                            str6 = concat2;
                                            fileChannel = channel;
                                            fileOutputStream = fileOutputStream3;
                                            readableByteChannel = newChannel;
                                            i9 = intValue;
                                            i10 = contentLength;
                                            try {
                                                try {
                                                    bo0.f3473b.post(new ms0(this, str, file.getAbsolutePath(), i8, contentLength, false));
                                                } catch (IOException e10) {
                                                    e = e10;
                                                    str3 = str6;
                                                    str2 = str5;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str4 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.f13934j) {
                                                    }
                                                    if (file.exists()) {
                                                        String valueOf8 = String.valueOf(file.getAbsolutePath());
                                                        io0.g(valueOf8.length() == 0 ? "Could not delete partial cache file at ".concat(valueOf8) : new String("Could not delete partial cache file at "));
                                                    }
                                                    h(str, file.getAbsolutePath(), str2, str4);
                                                    f13930k.remove(str3);
                                                    return false;
                                                }
                                            } catch (RuntimeException e11) {
                                                e = e11;
                                                str3 = str6;
                                                str2 = str5;
                                                fileOutputStream2 = fileOutputStream;
                                                str4 = null;
                                                if (e instanceof RuntimeException) {
                                                }
                                                fileOutputStream2.close();
                                                if (this.f13934j) {
                                                }
                                                if (file.exists()) {
                                                }
                                                h(str, file.getAbsolutePath(), str2, str4);
                                                f13930k.remove(str3);
                                                return false;
                                            }
                                        } catch (IOException e12) {
                                            e = e12;
                                            fileOutputStream = fileOutputStream3;
                                            str3 = concat2;
                                            str2 = str5;
                                            fileOutputStream2 = fileOutputStream;
                                            str4 = null;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream2.close();
                                            if (this.f13934j) {
                                            }
                                            if (file.exists()) {
                                            }
                                            h(str, file.getAbsolutePath(), str2, str4);
                                            f13930k.remove(str3);
                                            return false;
                                        } catch (RuntimeException e13) {
                                            e = e13;
                                            fileOutputStream = fileOutputStream3;
                                            str3 = concat2;
                                            str2 = str5;
                                            fileOutputStream2 = fileOutputStream;
                                            str4 = null;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream2.close();
                                            if (this.f13934j) {
                                            }
                                            if (file.exists()) {
                                            }
                                            h(str, file.getAbsolutePath(), str2, str4);
                                            f13930k.remove(str3);
                                            return false;
                                        }
                                    } else {
                                        g1Var = g1Var2;
                                        fileChannel = channel;
                                        fileOutputStream = fileOutputStream3;
                                        readableByteChannel = newChannel;
                                        i9 = intValue;
                                        i10 = contentLength;
                                        str6 = concat2;
                                        str5 = str2;
                                    }
                                    allocate = byteBuffer;
                                    newChannel = readableByteChannel;
                                    str2 = str5;
                                    g1Var2 = g1Var;
                                    concat2 = str6;
                                    channel = fileChannel;
                                    fileOutputStream3 = fileOutputStream;
                                    intValue = i9;
                                    contentLength = i10;
                                } catch (IOException | RuntimeException e14) {
                                    e = e14;
                                    str3 = str6;
                                    fileOutputStream2 = fileOutputStream;
                                    str4 = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream2.close();
                                    if (this.f13934j) {
                                    }
                                    if (file.exists()) {
                                    }
                                    h(str, file.getAbsolutePath(), str2, str4);
                                    f13930k.remove(str3);
                                    return false;
                                }
                            }
                        } catch (IOException | RuntimeException e15) {
                            e = e15;
                            fileOutputStream = fileOutputStream3;
                            str3 = concat2;
                            str5 = str2;
                        }
                    } catch (IOException | RuntimeException e16) {
                        e = e16;
                        str3 = concat2;
                        str2 = "error";
                        str4 = null;
                        fileOutputStream2 = null;
                    }
                    if (e instanceof RuntimeException) {
                        y2.t.p().s(e, "VideoStreamFullFileCache.preload");
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException | NullPointerException unused) {
                    }
                    if (this.f13934j) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 25);
                        sb4.append("Preload failed for URL \"");
                        sb4.append(str);
                        sb4.append("\"");
                        io0.h(sb4.toString(), e);
                    } else {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 26);
                        sb5.append("Preload aborted for URL \"");
                        sb5.append(str);
                        sb5.append("\"");
                        io0.f(sb5.toString());
                    }
                    if (file.exists() && !file.delete()) {
                        String valueOf82 = String.valueOf(file.getAbsolutePath());
                        io0.g(valueOf82.length() == 0 ? "Could not delete partial cache file at ".concat(valueOf82) : new String("Could not delete partial cache file at "));
                    }
                    h(str, file.getAbsolutePath(), str2, str4);
                    f13930k.remove(str3);
                    return false;
                }
            }
            File file4 = this.f13933i;
            if (file4 == null) {
                break;
            }
            long j7 = Long.MAX_VALUE;
            File file5 = null;
            for (File file6 : file4.listFiles()) {
                if (!file6.getName().endsWith(".done")) {
                    long lastModified = file6.lastModified();
                    if (lastModified < j7) {
                        file5 = file6;
                        j7 = lastModified;
                    }
                }
            }
            if (file5 != null) {
                z6 = file5.delete();
                File w7 = w(file5);
                if (w7.isFile()) {
                    z6 &= w7.delete();
                }
            } else {
                z6 = false;
            }
        } while (z6);
        io0.g("Unable to expire stream cache");
        h(str, null, "expireFailed", null);
        return false;
        i(str, file.getAbsolutePath(), i8);
        str3 = str6;
        try {
            f13930k.remove(str3);
            return true;
        } catch (IOException e17) {
            e = e17;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.f13934j) {
            }
            if (file.exists()) {
            }
            h(str, file.getAbsolutePath(), str2, str4);
            f13930k.remove(str3);
            return false;
        } catch (RuntimeException e18) {
            e = e18;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.f13934j) {
            }
            if (file.exists()) {
            }
            h(str, file.getAbsolutePath(), str2, str4);
            f13930k.remove(str3);
            return false;
        }
    }
}
