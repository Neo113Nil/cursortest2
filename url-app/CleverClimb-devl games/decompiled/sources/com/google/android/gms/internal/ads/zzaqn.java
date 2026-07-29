package com.google.android.gms.internal.ads;

import com.aiming.mdt.utils.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzadh
/* loaded from: classes2.dex */
public final class zzaqn extends zzaqh {
    private static final Set<String> zzdbg = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzdbh = new DecimalFormat("#,###");
    private File zzdbi;
    private boolean zzdbj;

    public zzaqn(zzapw zzapwVar) {
        super(zzapwVar);
        File cacheDir = this.mContext.getCacheDir();
        if (cacheDir == null) {
            zzakb.zzdk("Context.getCacheDir() returned null");
            return;
        }
        this.zzdbi = new File(cacheDir, "admobVideoStreams");
        if (!this.zzdbi.isDirectory() && !this.zzdbi.mkdirs()) {
            String valueOf = String.valueOf(this.zzdbi.getAbsolutePath());
            zzakb.zzdk(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.zzdbi = null;
        } else {
            if (this.zzdbi.setReadable(true, false) && this.zzdbi.setExecutable(true, false)) {
                return;
            }
            String valueOf2 = String.valueOf(this.zzdbi.getAbsolutePath());
            zzakb.zzdk(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.zzdbi = null;
        }
    }

    private final File zzc(File file) {
        return new File(this.zzdbi, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void abort() {
        this.zzdbj = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f3, code lost:
    
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01f5, code lost:
    
        r1 = r5.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01fe, code lost:
    
        if (r1 < 400) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0202, code lost:
    
        r3 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0210, code lost:
    
        if (r3.length() == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0212, code lost:
    
        r3 = "HTTP request failed. Code: ".concat(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x021d, code lost:
    
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r5.append("HTTP status code ");
        r5.append(r1);
        r5.append(" at ");
        r5.append(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0245, code lost:
    
        throw new java.io.IOException(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0246, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0247, code lost:
    
        r15 = "badUrl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0218, code lost:
    
        r3 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0249, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x024a, code lost:
    
        r15 = "badUrl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x024c, code lost:
    
        r7 = r5.getContentLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0250, code lost:
    
        if (r7 >= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0252, code lost:
    
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x025c, code lost:
    
        if (r1.length() == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x025e, code lost:
    
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0269, code lost:
    
        com.google.android.gms.internal.ads.zzakb.zzdk(r0);
        zza(r31, r12.getAbsolutePath(), "contentLengthMissing", null);
        com.google.android.gms.internal.ads.zzaqn.zzdbg.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x027a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0263, code lost:
    
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x027b, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzaqn.zzdbh.format(r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzauy)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0292, code lost:
    
        if (r7 <= r3) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0294, code lost:
    
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r31);
        com.google.android.gms.internal.ads.zzakb.zzdk(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02cd, code lost:
    
        if (r1.length() == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02cf, code lost:
    
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02da, code lost:
    
        zza(r31, r12.getAbsolutePath(), "sizeExceeded", r0);
        com.google.android.gms.internal.ads.zzaqn.zzdbg.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d4, code lost:
    
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02e9, code lost:
    
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r31);
        com.google.android.gms.internal.ads.zzakb.zzck(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0324, code lost:
    
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.zzbv.zzer();
        r17 = r16.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0342, code lost:
    
        r20 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0344, code lost:
    
        r10 = new com.google.android.gms.internal.ads.zzamj(((java.lang.Long) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzavb)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzava)).longValue();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x035e, code lost:
    
        r21 = r5.read(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0362, code lost:
    
        if (r21 < 0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0364, code lost:
    
        r6 = r6 + r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0366, code lost:
    
        if (r6 <= r3) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x039f, code lost:
    
        r1.flip();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03a6, code lost:
    
        if (r2.write(r1) > 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03a8, code lost:
    
        r1.clear();
        r25 = ((r16.currentTimeMillis() - r17) > (1000 * r13) ? 1 : ((r16.currentTimeMillis() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03b9, code lost:
    
        if (r25 > 0) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03bd, code lost:
    
        if (r30.zzdbj != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03c3, code lost:
    
        if (r10.tryAcquire() == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03c5, code lost:
    
        r26 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03cd, code lost:
    
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03d1, code lost:
    
        r22 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r11 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03ec, code lost:
    
        com.google.android.gms.internal.ads.zzamu.zzsy.post(new com.google.android.gms.internal.ads.zzaqi(r30, r31, r12.getAbsolutePath(), r6, r7, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x040b, code lost:
    
        r5 = r11;
        r6 = r19;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r25;
        r10 = r26;
        r15 = r27;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04d7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04d8, code lost:
    
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03f3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03f4, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03f8, code lost:
    
        r22 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r11 = r5;
        r19 = r6;
        r29 = r7;
        r26 = r10;
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x042c, code lost:
    
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x042d, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0431, code lost:
    
        r15 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0433, code lost:
    
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r10 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x045e, code lost:
    
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x045f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0460, code lost:
    
        r3 = r10;
        r1 = r20;
        r10 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0467, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04e4, code lost:
    
        r1 = r20;
        r25 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04ed, code lost:
    
        r10 = r25;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x036a, code lost:
    
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0378, code lost:
    
        if (r2.length() == 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x037a, code lost:
    
        r10 = "File too big for full file cache. Size: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x038d, code lost:
    
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x038e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x038f, code lost:
    
        r15 = "sizeExceeded";
        r3 = r10;
        r1 = r20;
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0385, code lost:
    
        r10 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0396, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0397, code lost:
    
        r15 = "sizeExceeded";
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x039a, code lost:
    
        r10 = r4;
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x046a, code lost:
    
        r25 = r4;
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0470, code lost:
    
        r25.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0477, code lost:
    
        if (com.google.android.gms.internal.ads.zzakb.isLoggable(3) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0479, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzaqn.zzdbh.format(r6);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r31);
        com.google.android.gms.internal.ads.zzakb.zzck(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04af, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04b8, code lost:
    
        if (r0.isFile() == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04ba, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04c2, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04df, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04e0, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04e7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04e8, code lost:
    
        r25 = r4;
        r1 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 27, insn: 0x0508: MOVE (r15 I:??[OBJECT, ARRAY]) = (r27 I:??[OBJECT, ARRAY]), block:B:275:0x0508 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0549  */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v8, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzdp(String str) {
        int i;
        File file;
        String str2;
        String str3;
        String str4;
        String str5;
        int intValue;
        URL url;
        int i2;
        String str6;
        String str7;
        int i3;
        FileOutputStream fileOutputStream;
        String str8;
        boolean delete;
        String str9;
        FileOutputStream fileOutputStream2 = null;
        if (this.zzdbi == null) {
            str9 = "noCacheDir";
        } else {
            do {
                if (this.zzdbi == null) {
                    i = 0;
                } else {
                    i = 0;
                    for (File file2 : this.zzdbi.listFiles()) {
                        if (!file2.getName().endsWith(".done")) {
                            i++;
                        }
                    }
                }
                if (i <= ((Integer) zzkb.zzik().zzd(zznk.zzaux)).intValue()) {
                    zzkb.zzif();
                    file = new File(this.zzdbi, zzamu.zzde(str));
                    File zzc = zzc(file);
                    if (file.isFile() && zzc.isFile()) {
                        int length = (int) file.length();
                        String valueOf = String.valueOf(str);
                        zzakb.zzck(valueOf.length() != 0 ? "Stream cache hit at ".concat(valueOf) : new String("Stream cache hit at "));
                        zza(str, file.getAbsolutePath(), length);
                        return true;
                    }
                    String valueOf2 = String.valueOf(this.zzdbi.getAbsolutePath());
                    String valueOf3 = String.valueOf(str);
                    String concat = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                    synchronized (zzdbg) {
                        if (zzdbg.contains(concat)) {
                            String valueOf4 = String.valueOf(str);
                            zzakb.zzdk(valueOf4.length() != 0 ? "Stream cache already in progress at ".concat(valueOf4) : new String("Stream cache already in progress at "));
                            zza(str, file.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        zzdbg.add(concat);
                        str2 = "error";
                        try {
                            com.google.android.gms.ads.internal.zzbv.zzew();
                            intValue = ((Integer) zzkb.zzik().zzd(zznk.zzavc)).intValue();
                            url = new URL(str);
                            i2 = 0;
                        } catch (IOException | RuntimeException e) {
                            e = e;
                            str3 = concat;
                        }
                        while (true) {
                            i2++;
                            try {
                            } catch (IOException | RuntimeException e2) {
                                e = e2;
                                str2 = str6;
                                str3 = intValue;
                                str4 = null;
                                fileOutputStream2 = null;
                                str5 = str3;
                                if (e instanceof RuntimeException) {
                                }
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException | NullPointerException unused) {
                                }
                                if (this.zzdbj) {
                                }
                                if (file.exists()) {
                                }
                                zza(str, file.getAbsolutePath(), str2, str4);
                                zzdbg.remove(str5);
                                return false;
                            }
                            if (i2 > 20) {
                                throw new IOException("Too many redirects (20)");
                            }
                            URLConnection openConnection = url.openConnection();
                            openConnection.setConnectTimeout(intValue);
                            openConnection.setReadTimeout(intValue);
                            if (!(openConnection instanceof HttpURLConnection)) {
                                throw new IOException("Invalid protocol.");
                            }
                            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                            zzamy zzamyVar = new zzamy();
                            zzamyVar.zza(httpURLConnection, (byte[]) null);
                            httpURLConnection.setInstanceFollowRedirects(false);
                            int responseCode = httpURLConnection.getResponseCode();
                            zzamyVar.zza(httpURLConnection, responseCode);
                            if (responseCode / 100 != 3) {
                                break;
                            }
                            try {
                                String headerField = httpURLConnection.getHeaderField(Constants.KEY_LOCATION);
                                if (headerField == null) {
                                    throw new IOException("Missing Location header in redirect");
                                }
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    throw new IOException("Protocol is null");
                                }
                                if (!protocol.equals(com.mopub.common.Constants.HTTP) && !protocol.equals(com.mopub.common.Constants.HTTPS)) {
                                    String valueOf5 = String.valueOf(protocol);
                                    throw new IOException(valueOf5.length() != 0 ? "Unsupported scheme: ".concat(valueOf5) : new String("Unsupported scheme: "));
                                }
                                String valueOf6 = String.valueOf(headerField);
                                zzakb.zzck(valueOf6.length() != 0 ? "Redirecting to ".concat(valueOf6) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } catch (IOException | RuntimeException e3) {
                                e = e3;
                            }
                            str4 = null;
                            str5 = concat;
                            if (e instanceof RuntimeException) {
                                com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "VideoStreamFullFileCache.preload");
                            }
                            fileOutputStream2.close();
                            if (this.zzdbj) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
                                sb.append("Preload aborted for URL \"");
                                sb.append(str);
                                sb.append("\"");
                                zzakb.zzdj(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25);
                                sb2.append("Preload failed for URL \"");
                                sb2.append(str);
                                sb2.append("\"");
                                zzakb.zzc(sb2.toString(), e);
                            }
                            if (file.exists() && !file.delete()) {
                                String valueOf7 = String.valueOf(file.getAbsolutePath());
                                zzakb.zzdk(valueOf7.length() == 0 ? "Could not delete partial cache file at ".concat(valueOf7) : new String("Could not delete partial cache file at "));
                            }
                            zza(str, file.getAbsolutePath(), str2, str4);
                            zzdbg.remove(str5);
                            return false;
                        }
                    }
                }
                if (this.zzdbi != null) {
                    long j = Long.MAX_VALUE;
                    File file3 = null;
                    for (File file4 : this.zzdbi.listFiles()) {
                        if (!file4.getName().endsWith(".done")) {
                            long lastModified = file4.lastModified();
                            if (lastModified < j) {
                                file3 = file4;
                                j = lastModified;
                            }
                        }
                    }
                    if (file3 != null) {
                        delete = file3.delete();
                        File zzc2 = zzc(file3);
                        if (zzc2.isFile()) {
                            delete &= zzc2.delete();
                        }
                    }
                }
                delete = false;
            } while (delete);
            zzakb.zzdk("Unable to expire stream cache");
            str9 = "expireFailed";
        }
        zza(str, null, str9, null);
        return false;
        zza(str, file.getAbsolutePath(), i3);
        String str10 = str7;
        try {
            zzdbg.remove(str10);
            return true;
        } catch (IOException | RuntimeException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            str2 = str8;
            String str11 = str10;
            str4 = null;
            str5 = str11;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.zzdbj) {
            }
            if (file.exists()) {
                String valueOf72 = String.valueOf(file.getAbsolutePath());
                zzakb.zzdk(valueOf72.length() == 0 ? "Could not delete partial cache file at ".concat(valueOf72) : new String("Could not delete partial cache file at "));
            }
            zza(str, file.getAbsolutePath(), str2, str4);
            zzdbg.remove(str5);
            return false;
        }
    }
}
