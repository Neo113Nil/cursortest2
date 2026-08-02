package E1;

import E.AbstractC0005f;
import a.AbstractC0124a;
import android.net.Uri;
import android.os.HandlerThread;
import android.util.Base64;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public int f511a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f512b;

    /* renamed from: c, reason: collision with root package name */
    public Object f513c;

    /* renamed from: d, reason: collision with root package name */
    public Object f514d;

    public /* synthetic */ N(int i4, String str, Serializable serializable, Serializable serializable2) {
        this.f511a = i4;
        this.f514d = str;
        this.f512b = serializable;
        this.f513c = serializable2;
    }

    public String a(C0025a c0025a, Uri uri, int i4) {
        String str = (String) this.f513c;
        String str2 = (String) this.f514d;
        String str3 = (String) this.f512b;
        int i5 = this.f511a;
        if (i5 == 1) {
            String encodeToString = Base64.encodeToString((c0025a.f563b + StringUtils.PROCESS_POSTFIX_DELIMITER + c0025a.f564c).getBytes(m0.y.f14470g), 0);
            String str4 = W.J.f3263a;
            Locale locale = Locale.US;
            return AbstractC0005f.n("Basic ", encodeToString);
        }
        if (i5 != 2) {
            throw new T.G(null, new UnsupportedOperationException(), false, 4);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String g4 = m0.z.g(i4);
            String str5 = c0025a.f563b + StringUtils.PROCESS_POSTFIX_DELIMITER + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + c0025a.f564c;
            Charset charset = m0.y.f14470g;
            String Y2 = W.J.Y(messageDigest.digest((W.J.Y(messageDigest.digest(str5.getBytes(charset))) + StringUtils.PROCESS_POSTFIX_DELIMITER + str3 + StringUtils.PROCESS_POSTFIX_DELIMITER + W.J.Y(messageDigest.digest((g4 + StringUtils.PROCESS_POSTFIX_DELIMITER + uri).getBytes(charset)))).getBytes(charset)));
            if (str.isEmpty()) {
                return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", c0025a.f563b, str2, str3, uri, Y2);
            }
            return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", c0025a.f563b, str2, str3, uri, Y2, str);
        } catch (NoSuchAlgorithmException e4) {
            throw new T.G(null, e4, false, 4);
        }
    }

    public int b() {
        int i4 = this.f511a;
        if (i4 != 2) {
            return i4 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public void c() {
        HandlerThread handlerThread;
        synchronized (this.f512b) {
            try {
                AbstractC0124a.t(this.f511a > 0);
                int i4 = this.f511a - 1;
                this.f511a = i4;
                if (i4 == 0 && (handlerThread = (HandlerThread) this.f514d) != null) {
                    handlerThread.quit();
                    this.f514d = null;
                    this.f513c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Throwable th) {
        T t4 = (T) this.f514d;
        if (th instanceof TimeoutException) {
            t4.Q(102, 28, W.f532E);
            AbstractC0352w.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            t4.Q(95, 28, W.f532E);
            AbstractC0352w.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f513c).run();
    }

    public N(T t4, int i4, D.a aVar, Runnable runnable) {
        this.f511a = i4;
        this.f512b = aVar;
        this.f513c = runnable;
        this.f514d = t4;
    }

    public N() {
        this.f512b = new Object();
        this.f513c = null;
        this.f514d = null;
        this.f511a = 0;
    }

    public N(int i4, String str, int i5, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f514d = str;
        this.f511a = i5;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f512b = unmodifiableList;
        this.f513c = bArr;
    }
}
