package defpackage;

import android.os.Process;
import j$.time.Duration;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.channels.ReadableByteChannel;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkh implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kkh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0128 A[Catch: RuntimeException -> 0x0143, TryCatch #1 {RuntimeException -> 0x0143, blocks: (B:8:0x0015, B:10:0x0023, B:11:0x0036, B:12:0x0044, B:14:0x004a, B:16:0x0058, B:17:0x005e, B:20:0x0066, B:28:0x00cf, B:30:0x00d5, B:32:0x00e1, B:34:0x00ed, B:42:0x011b, B:45:0x012b, B:47:0x0128, B:48:0x0107, B:49:0x0114, B:55:0x0077, B:56:0x0081, B:58:0x0087, B:60:0x0095, B:61:0x00a0, B:64:0x00a7, B:65:0x00b1, B:67:0x00b7, B:69:0x00bf, B:81:0x0030), top: B:7:0x0015 }] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Map map;
        String str;
        int i;
        long j;
        liz lizVar;
        long j2;
        int i2;
        int i3;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((kki) obj).b.execute(new kkh(obj, 1));
                return;
            case 1:
                Object obj2 = this.a;
                kki kkiVar = (kki) obj2;
                if (!kkiVar.e) {
                    kkiVar.f = null;
                    return;
                }
                long a = kkiVar.d - kkiVar.a();
                if (a > 0) {
                    kkiVar.f = kkiVar.a.schedule(new kkh(obj2, 0), a, TimeUnit.NANOSECONDS);
                    return;
                }
                kkiVar.e = false;
                kkiVar.f = null;
                kkiVar.c.run();
                return;
            case 2:
                kky kkyVar = ((kkk) this.a).g;
                kkyVar.A = true;
                kfi kfiVar = kkyVar.w;
                iyi iyiVar = kkyVar.F;
                kfiVar.a((kbq) iyiVar.b, (kfh) iyiVar.a, (kaa) iyiVar.c);
                return;
            case 3:
                kky kkyVar2 = (kky) this.a;
                if (kkyVar2.A) {
                    return;
                }
                kkyVar2.w.e();
                return;
            case 4:
                kky kkyVar3 = ((kkv) this.a).b;
                kkyVar3.A = true;
                kfi kfiVar2 = kkyVar3.w;
                iyi iyiVar2 = kkyVar3.F;
                kfiVar2.a((kbq) iyiVar2.b, (kfh) iyiVar2.a, (kaa) iyiVar2.c);
                return;
            case 5:
                kky kkyVar4 = ((kkv) this.a).b;
                if (kkyVar4.A) {
                    return;
                }
                kkyVar4.w.e();
                return;
            case 6:
                ((kaq) this.a).b();
                return;
            case 7:
                ((klv) this.a).c.f(kbq.c.e("Handshake timeout exceeded"));
                return;
            case 8:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(0);
                this.a.run();
                return;
            case 9:
                ((ljj) this.a).g++;
                return;
            case 10:
                ljq ljqVar = (ljq) this.a;
                ljj ljjVar = ljqVar.y;
                if (ljjVar != null) {
                    try {
                        ljjVar.e();
                    } catch (IOException e) {
                        jav.c(ljq.a, "Exception when closing OutputChannel", e);
                    }
                }
                HttpURLConnection httpURLConnection = ljqVar.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    ljqVar.q = null;
                    return;
                }
                return;
            case 11:
                ljq ljqVar2 = (ljq) this.a;
                ljqVar2.f.add(ljqVar2.m);
                ljqVar2.h();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ljq ljqVar3 = (ljq) this.a;
                ReadableByteChannel readableByteChannel = ljqVar3.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    ljqVar3.n = null;
                    return;
                }
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ljq) this.a).w++;
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ljq ljqVar4 = (ljq) this.a;
                ljqVar4.m = ljqVar4.p;
                ljqVar4.p = null;
                ljqVar4.h();
                return;
            case 15:
                Object obj3 = this.a;
                try {
                    ljq ljqVar5 = ((ljo) obj3).d;
                    liz lizVar2 = ljqVar5.t;
                    long j3 = ljqVar5.s;
                    ljy ljyVar = ljqVar5.o;
                    if (ljyVar != null) {
                        map = ljyVar.getAllHeaders();
                        ljy ljyVar2 = ljqVar5.o;
                        str = ljyVar2.b;
                        i = ljyVar2.a;
                    } else {
                        map = Collections.EMPTY_MAP;
                        str = "";
                        i = 0;
                    }
                    String str2 = str;
                    long j4 = 0;
                    for (Map.Entry entry : ljqVar5.e.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            j4 += r14.length();
                        }
                        if (((String) entry.getValue()) != null) {
                            j4 += r11.length();
                        }
                    }
                    if (map == null) {
                        j = 0;
                    } else {
                        j = 0;
                        for (Map.Entry entry2 : map.entrySet()) {
                            if (((String) entry2.getKey()) != null) {
                                j += r16.length();
                            }
                            if (entry2.getValue() != null) {
                                Iterator it = ((List) entry2.getValue()).iterator();
                                while (it.hasNext()) {
                                    if (((String) it.next()) != null) {
                                        lizVar = lizVar2;
                                        j += r6.length();
                                    } else {
                                        lizVar = lizVar2;
                                    }
                                    lizVar2 = lizVar;
                                }
                            }
                        }
                    }
                    liz lizVar3 = lizVar2;
                    if (map.containsKey("Content-Length")) {
                        try {
                            j2 = Long.parseLong((String) ((List) map.get("Content-Length")).get(0));
                        } catch (NumberFormatException unused) {
                            j2 = 0;
                        }
                    } else {
                        j2 = -1;
                    }
                    long j5 = j2;
                    Duration ofSeconds = Duration.ofSeconds(0L);
                    ljq ljqVar6 = ((ljo) obj3).d;
                    int i4 = ljqVar6.g.get();
                    if (i4 == 6) {
                        i2 = 2;
                    } else {
                        if (i4 == 7) {
                            i3 = 1;
                            int i5 = ljqVar6.w;
                            int i6 = ljqVar6.v;
                            ljj ljjVar2 = ljqVar6.y;
                            lizVar3.d(j3, new lix(j4, j, j5, i, ofSeconds, str2, i3, i5, i6, ljjVar2 != null ? ljjVar2.g : 0, ljqVar6.x, Process.myUid(), liw.d));
                            return;
                        }
                        if (i4 != 8) {
                            throw new IllegalStateException(a.ai(i4, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                        }
                        i2 = 3;
                    }
                    i3 = i2;
                    int i52 = ljqVar6.w;
                    int i62 = ljqVar6.v;
                    ljj ljjVar22 = ljqVar6.y;
                    lizVar3.d(j3, new lix(j4, j, j5, i, ofSeconds, str2, i3, i52, i62, ljjVar22 != null ? ljjVar22.g : 0, ljqVar6.x, Process.myUid(), liw.d));
                    return;
                } catch (RuntimeException unused2) {
                    String str3 = ljq.a;
                    return;
                }
            default:
                ((ljp) this.a).a();
                return;
        }
    }

    public /* synthetic */ kkh(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
