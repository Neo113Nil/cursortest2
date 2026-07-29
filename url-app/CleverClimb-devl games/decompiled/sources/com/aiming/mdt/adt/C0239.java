package com.aiming.mdt.adt;

import android.content.Context;
import android.text.TextUtils;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.adt.bean.AdBean;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.aiming.mdt.adt.ʼʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0239 implements C0226.InterfaceC0227 {

    /* renamed from: ʻ, reason: contains not printable characters */
    protected C0226 f752;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    protected String f753;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private long f754;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected Context f755;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private long f756;

    /* renamed from: ʽ, reason: contains not printable characters */
    private InterfaceC0231 f757;

    public C0239(Context context, String str, int i) {
        if (context == null) {
            this.f756 = System.currentTimeMillis();
            C0285.m979(new RunnableC0230(this, "Context error"));
        } else if (TextUtils.isEmpty(str)) {
            C0282.m973("BaseAdImp", "placementId is null");
            this.f756 = System.currentTimeMillis();
            C0285.m979(new RunnableC0230(this, "Placement id is empty"));
        } else {
            this.f755 = context.getApplicationContext();
            this.f752 = new C0226(str, i, this);
            this.f753 = str;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static byte[] m850(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
        } catch (IOException e) {
            C0282.m972("G", e);
            C0076.m232().m236(e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: Exception -> 0x0092, TryCatch #10 {Exception -> 0x0092, blocks: (B:51:0x008e, B:42:0x0096, B:44:0x009b), top: B:50:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #10 {Exception -> 0x0092, blocks: (B:51:0x008e, B:42:0x0096, B:44:0x009b), top: B:50:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.InputStream, java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: ʻʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m852(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        ?? r2;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        if (bArr != null) {
            ?? length = bArr.length;
            try {
                try {
                    if (length != 0) {
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(bArr);
                        } catch (Exception e) {
                            e = e;
                            byteArrayOutputStream = null;
                            byteArrayInputStream = null;
                            r2 = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayInputStream = null;
                            r2 = 0;
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                r2 = new GZIPInputStream(byteArrayInputStream);
                                try {
                                    try {
                                        byte[] bArr2 = new byte[1024];
                                        while (true) {
                                            int read = r2.read(bArr2, 0, 1024);
                                            if (read == -1) {
                                                break;
                                            }
                                            byteArrayOutputStream.write(bArr2, 0, read);
                                        }
                                        r2.close();
                                        byteArrayInputStream.close();
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.flush();
                                        byteArrayOutputStream.close();
                                        length = byteArray;
                                    } catch (Exception e2) {
                                        e = e2;
                                        C0282.m972("G", e);
                                        C0076.m232().m236(e);
                                        if (r2 != 0) {
                                            r2.close();
                                        }
                                        if (byteArrayInputStream != null) {
                                            byteArrayInputStream.close();
                                        }
                                        if (byteArrayOutputStream == null) {
                                            return null;
                                        }
                                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.flush();
                                        byteArrayOutputStream.close();
                                        length = byteArray2;
                                        return length;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (r2 != 0) {
                                        try {
                                            r2.close();
                                        } catch (Exception e3) {
                                            C0282.m972("G", e3);
                                            C0076.m232().m236(e3);
                                            throw th;
                                        }
                                    }
                                    if (byteArrayInputStream != null) {
                                        byteArrayInputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.flush();
                                        byteArrayOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                r2 = 0;
                            } catch (Throwable th4) {
                                r2 = 0;
                                th = th4;
                                if (r2 != 0) {
                                }
                                if (byteArrayInputStream != null) {
                                }
                                if (byteArrayOutputStream != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            byteArrayOutputStream = null;
                            r2 = 0;
                        } catch (Throwable th5) {
                            th = th5;
                            r2 = 0;
                            th = th;
                            byteArrayOutputStream = r2;
                            if (r2 != 0) {
                            }
                            if (byteArrayInputStream != null) {
                            }
                            if (byteArrayOutputStream != null) {
                            }
                            throw th;
                        }
                        return length;
                    }
                } catch (Exception e6) {
                    e = e6;
                    C0282.m972("G", e);
                    C0076.m232().m236(e);
                    return length;
                }
            } catch (Exception e7) {
                e = e7;
                length = 0;
                C0282.m972("G", e);
                C0076.m232().m236(e);
                return length;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.aiming.mdt.a.ʻʽʿˈˉ] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m853(byte[] bArr) {
        Exception e;
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr2 = null;
        if (bArr != null) {
            ?? length = bArr.length;
            try {
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    C0282.m972("G", e);
                    length = C0076.m232();
                    length.m236(e);
                    bArr = bArr2;
                    return bArr;
                }
            } catch (Exception e3) {
                bArr2 = bArr;
                e = e3;
                C0282.m972("G", e);
                length = C0076.m232();
                length.m236(e);
                bArr = bArr2;
                return bArr;
            }
            if (length != 0) {
                try {
                    length = new ByteArrayOutputStream();
                    try {
                        gZIPOutputStream = new GZIPOutputStream(length);
                        try {
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.finish();
                            gZIPOutputStream.close();
                            bArr = length.toByteArray();
                            length.close();
                        } catch (Exception e4) {
                            e = e4;
                            C0282.m972("G", e);
                            C0076.m232().m236(e);
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.finish();
                                gZIPOutputStream.close();
                            }
                            if (length != 0) {
                                bArr = length.toByteArray();
                                length.close();
                                return bArr;
                            }
                            bArr = bArr2;
                            return bArr;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        gZIPOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream = null;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.finish();
                                gZIPOutputStream.close();
                            } catch (Exception e6) {
                                C0282.m972("G", e6);
                                C0076.m232().m236(e6);
                                throw th;
                            }
                        }
                        if (length != 0) {
                            length.toByteArray();
                            length.close();
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    length = 0;
                    gZIPOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    length = 0;
                    gZIPOutputStream = null;
                }
                return bArr;
            }
        }
        return null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m854() {
        try {
            if (this.f754 > this.f756) {
                return;
            }
            this.f754 = System.currentTimeMillis();
            if (this.f752 != null) {
                if (!mo818()) {
                    this.f752.m843(this.f755);
                    return;
                }
                this.f756 = System.currentTimeMillis();
                if (this.f757 != null) {
                    C0285.m979(new RunnableC0241(this));
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(this.f753)) {
                C0282.m973("BaseAdImp", "create adManager null, cause placementId is null");
                this.f756 = System.currentTimeMillis();
                C0285.m979(new RunnableC0230(this, "Placement id is empty"));
            } else {
                C0282.m973("BaseAdImp", "create adManager null, can't load ad");
                this.f756 = System.currentTimeMillis();
                C0285.m979(new RunnableC0230(this, "UnSpecified Error"));
            }
        } catch (Exception e) {
            this.f756 = System.currentTimeMillis();
            C0285.m979(new RunnableC0230(this, "UnSpecified Error"));
            C0282.m972("BaseAdImp", e);
            C0076.m232().m236(e);
        }
    }

    /* renamed from: ʻʼ */
    protected void mo811() {
    }

    @Override // com.aiming.mdt.adt.C0226.InterfaceC0227
    /* renamed from: ʻʼ */
    public final void mo846(String str) {
        StringBuilder sb = new StringBuilder("request ad failed : ");
        sb.append(str);
        String obj = sb.toString();
        this.f756 = System.currentTimeMillis();
        C0285.m979(new RunnableC0230(this, obj));
    }

    /* renamed from: ʻʽ */
    protected void mo11() {
        if (this.f752 != null) {
            this.f752.m840();
        }
        this.f757 = null;
        this.f755 = null;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    protected final void m855(String str) {
        this.f756 = System.currentTimeMillis();
        C0285.m979(new RunnableC0230(this, str));
    }

    /* renamed from: ʻʾ */
    protected void mo13() {
    }

    /* renamed from: ʼ */
    public boolean mo818() {
        return this.f752 != null && this.f752.m842();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m856() {
        this.f756 = System.currentTimeMillis();
        if (this.f757 == null) {
            return;
        }
        C0285.m979(new RunnableC0241(this));
    }

    @Override // com.aiming.mdt.adt.C0226.InterfaceC0227
    /* renamed from: ʽ */
    public void mo15(AdBean adBean) {
    }

    /* renamed from: ʽ */
    protected void mo16(InterfaceC0231 interfaceC0231) {
        if (interfaceC0231 == null) {
            throw new IllegalArgumentException("Please setUp a adListener instance, current is null");
        }
        this.f757 = interfaceC0231;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    protected final void m857() {
        if (this.f757 == null) {
            return;
        }
        C0285.m979(new RunnableC0238(this));
    }
}
