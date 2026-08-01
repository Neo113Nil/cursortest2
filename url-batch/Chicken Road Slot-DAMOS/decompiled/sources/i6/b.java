package i6;

import java.net.URL;
import java.util.regex.Pattern;
import u8.d;
import x8.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f4653a;

    /* renamed from: b, reason: collision with root package name */
    public int f4654b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4655c;

    public b() {
        if (d.f9691e == null) {
            Pattern pattern = j.f10562b;
            d.f9691e = new d(3);
        }
        d dVar = d.f9691e;
        if (j.f10563c == null) {
            j.f10563c = new j(dVar);
        }
        this.f4655c = j.f10563c;
    }

    public synchronized boolean a() {
        boolean z10;
        if (this.f4654b != 0) {
            ((j) this.f4655c).f10564a.getClass();
            z10 = System.currentTimeMillis() > this.f4653a;
        }
        return z10;
    }

    public synchronized void b(int i3) {
        long min;
        if ((i3 >= 200 && i3 < 300) || i3 == 401 || i3 == 404) {
            synchronized (this) {
                this.f4654b = 0;
            }
            return;
        }
        this.f4654b++;
        synchronized (this) {
            if (i3 != 429 && (i3 < 500 || i3 >= 600)) {
                min = 86400000;
                ((j) this.f4655c).f10564a.getClass();
                this.f4653a = System.currentTimeMillis() + min;
            }
            double pow = Math.pow(2.0d, this.f4654b);
            ((j) this.f4655c).getClass();
            min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), 1800000L);
            ((j) this.f4655c).f10564a.getClass();
            this.f4653a = System.currentTimeMillis() + min;
        }
        return;
    }

    public b(int i3, URL url, long j) {
        this.f4654b = i3;
        this.f4655c = url;
        this.f4653a = j;
    }
}
