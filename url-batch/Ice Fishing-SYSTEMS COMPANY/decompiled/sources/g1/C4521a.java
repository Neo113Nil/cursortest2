package g1;

import j1.AbstractC4591d;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import z6.C5282a;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4521a implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37848n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f37849u;

    public /* synthetic */ C4521a(int i, Object obj) {
        this.f37848n = i;
        this.f37849u = obj;
    }

    public static String g(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    public String b() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f37849u;
        boolean z8 = false;
        try {
            try {
                if (httpURLConnection.getResponseCode() / 100 == 2) {
                    z8 = true;
                }
            } catch (NullPointerException e6) {
                e = e6;
                AbstractC4591d.c("get error failed ", e);
                return e.getMessage();
            }
        } catch (IOException unused) {
        }
        if (z8) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + g(httpURLConnection);
        } catch (IOException e9) {
            e = e9;
            AbstractC4591d.c("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f37848n) {
            case 0:
                ((HttpURLConnection) this.f37849u).disconnect();
                break;
            default:
                ((C5282a) this.f37849u).close();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] j() {
        int i;
        RandomAccessFile randomAccessFile = ((C5282a) this.f37849u).f42177n;
        int i4 = 0;
        try {
            i = randomAccessFile.read();
        } catch (IOException unused) {
        }
        if (i != -1) {
            if ((i & 128) != 0) {
                i &= com.anythink.expressad.video.module.a.a.f21886R;
                int i9 = 7;
                while (true) {
                    if (i9 >= 32) {
                        while (i9 < 64) {
                            int read = randomAccessFile.read();
                            if (read == -1) {
                                throw new IllegalStateException();
                            }
                            if ((read & 128) != 0) {
                                i9 += 7;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    int read2 = randomAccessFile.read();
                    if (read2 == -1) {
                        throw new IllegalStateException();
                    }
                    i |= (read2 & com.anythink.expressad.video.module.a.a.f21886R) << i9;
                    if ((read2 & 128) == 0) {
                        break;
                    }
                    i9 += 7;
                }
            }
            if (i >= 1) {
                return null;
            }
            byte[] bArr = new byte[i];
            do {
                int read3 = randomAccessFile.read(bArr, i4, i - i4);
                i4 += read3;
                if (read3 == -1) {
                    break;
                }
            } while (i4 < i);
            if (i4 != i) {
                return null;
            }
            return bArr;
        }
        i = 0;
        if (i >= 1) {
        }
    }
}
