package N1;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.EP;
import com.google.android.gms.internal.ads.O4;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class l implements O4 {

    /* renamed from: n, reason: collision with root package name */
    public long f1968n;

    /* renamed from: u, reason: collision with root package name */
    public long f1969u;

    /* renamed from: v, reason: collision with root package name */
    public Object f1970v;

    public l() {
        this.f1968n = com.anythink.basead.exoplayer.b.f6539b;
        this.f1969u = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.O4
    public long a() {
        return this.f1969u;
    }

    public synchronized Object b(Object obj) {
        k kVar;
        kVar = (k) ((LinkedHashMap) this.f1970v).get(obj);
        return kVar != null ? kVar.f1966a : null;
    }

    public int c(Object obj) {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.O4
    public void d(MessageDigest[] messageDigestArr, long j9, int i) {
        MappedByteBuffer map = ((FileChannel) this.f1970v).map(FileChannel.MapMode.READ_ONLY, this.f1968n + j9, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public synchronized Object f(Object obj, Object obj2) {
        int c4 = c(obj2);
        long j9 = c4;
        if (j9 >= this.f1968n) {
            e(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f1969u += j9;
        }
        k kVar = (k) ((LinkedHashMap) this.f1970v).put(obj, obj2 == null ? null : new k(c4, obj2));
        if (kVar != null) {
            this.f1969u -= kVar.f1967b;
            if (!kVar.f1966a.equals(obj2)) {
                e(obj, kVar.f1966a);
            }
        }
        g(this.f1968n);
        return kVar != null ? kVar.f1966a : null;
    }

    public synchronized void g(long j9) {
        while (this.f1969u > j9) {
            Iterator it = ((LinkedHashMap) this.f1970v).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            k kVar = (k) entry.getValue();
            this.f1969u -= kVar.f1967b;
            Object key = entry.getKey();
            it.remove();
            e(key, kVar.f1966a);
        }
    }

    public void h(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f1970v) == null) {
            this.f1970v = exc;
        }
        if (this.f1968n == com.anythink.basead.exoplayer.b.f6539b && EP.Y.get() <= 0) {
            this.f1968n = 200 + elapsedRealtime;
        }
        long j9 = this.f1968n;
        if (j9 == com.anythink.basead.exoplayer.b.f6539b || elapsedRealtime < j9) {
            this.f1969u = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f1970v;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f1970v;
        this.f1970v = null;
        this.f1968n = com.anythink.basead.exoplayer.b.f6539b;
        this.f1969u = com.anythink.basead.exoplayer.b.f6539b;
        throw exc3;
    }

    public l(FileChannel fileChannel, long j9, long j10) {
        this.f1970v = fileChannel;
        this.f1968n = j9;
        this.f1969u = j10;
    }

    public l(long j9, int i) {
        switch (i) {
            case 3:
                this.f1969u = Long.MIN_VALUE;
                this.f1970v = new Object();
                this.f1968n = j9;
                break;
            default:
                this.f1970v = new LinkedHashMap(100, 0.75f, true);
                this.f1968n = j9;
                break;
        }
    }

    public void e(Object obj, Object obj2) {
    }
}
