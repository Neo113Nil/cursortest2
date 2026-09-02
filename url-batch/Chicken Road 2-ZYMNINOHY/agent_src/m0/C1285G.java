package m0;

import E.AbstractC0005f;
import W.J;
import Y.AbstractC0123c;
import a.AbstractC0124a;
import android.net.Uri;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: m0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285G extends AbstractC0123c implements InterfaceC1291d {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f14331e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14332f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f14333g;

    /* renamed from: h, reason: collision with root package name */
    public int f14334h;

    public C1285G() {
        super(true);
        this.f14332f = 8000L;
        this.f14331e = new LinkedBlockingQueue();
        this.f14333g = new byte[0];
        this.f14334h = -1;
    }

    @Override // Y.h
    public final Uri B() {
        return null;
    }

    @Override // Y.h
    public final long b(Y.k kVar) {
        this.f14334h = kVar.f3701a.getPort();
        return -1L;
    }

    @Override // m0.InterfaceC1291d
    public final String c() {
        AbstractC0124a.t(this.f14334h != -1);
        int i4 = this.f14334h;
        int i5 = this.f14334h + 1;
        String str = J.f3263a;
        Locale locale = Locale.US;
        return AbstractC0005f.i(i4, i5, "RTP/AVP/TCP;unicast;interleaved=", TokenBuilder.TOKEN_DELIMITER);
    }

    @Override // m0.InterfaceC1291d
    public final int e() {
        return this.f14334h;
    }

    @Override // m0.InterfaceC1291d
    public final boolean j() {
        return false;
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int min = Math.min(i5, this.f14333g.length);
        System.arraycopy(this.f14333g, 0, bArr, i4, min);
        byte[] bArr2 = this.f14333g;
        this.f14333g = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i5) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f14331e.poll(this.f14332f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i5 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i4 + min, min2);
            if (min2 < bArr3.length) {
                this.f14333g = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // Y.h
    public final void close() {
    }

    @Override // m0.InterfaceC1291d
    public final C1285G n() {
        return this;
    }
}
