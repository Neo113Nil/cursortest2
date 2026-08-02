package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ljh implements ljr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ljr
    public final void a() {
        List list;
        int i = this.b;
        if (i == 0) {
            ljj ljjVar = (ljj) this.a;
            if (ljjVar.i == null) {
                ljq ljqVar = ljjVar.k;
                ljqVar.l = 10;
                HttpURLConnection httpURLConnection = ljjVar.h;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.connect();
                ljqVar.l = 12;
                ljjVar.j = httpURLConnection.getOutputStream();
                ljjVar.i = Channels.newChannel(ljjVar.j);
            }
            ljjVar.a.set(0);
            ljjVar.b();
            return;
        }
        Network network = null;
        if (i == 1) {
            Object obj = this.a;
            ljj ljjVar2 = (ljj) obj;
            ljjVar2.c.read((UploadDataSink) obj, ljjVar2.d);
            ljjVar2.b.execute(new kkh(obj, 9, null));
            return;
        }
        if (i == 2) {
            ((UploadDataProvider) this.a).close();
            return;
        }
        if (i != 3) {
            Object obj2 = this.a;
            if (i != 4) {
                ljo ljoVar = (ljo) obj2;
                ljq ljqVar2 = ljoVar.d;
                if (ljqVar2.g.compareAndSet(1, 4)) {
                    ljoVar.a.onResponseStarted(ljqVar2, ljqVar2.o);
                    return;
                }
                return;
            }
            ljq ljqVar3 = (ljq) obj2;
            if (ljqVar3.q == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            String str = "http/1.1";
            int i2 = 0;
            while (true) {
                String headerFieldKey = ljqVar3.q.getHeaderFieldKey(i2);
                if (headerFieldKey == null) {
                    break;
                }
                if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                    str = ljqVar3.q.getHeaderField(i2);
                }
                if (!headerFieldKey.startsWith("X-Android")) {
                    arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, ljqVar3.q.getHeaderField(i2)));
                }
                i2++;
            }
            int responseCode = ljqVar3.q.getResponseCode();
            ljy ljyVar = new ljy(new ArrayList(ljqVar3.f), responseCode, ljqVar3.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList), str);
            if (responseCode >= 300 && responseCode < 400 && (list = (List) ljyVar.getAllHeaders().get("location")) != null) {
                ljqVar3.j(1, 2, new kfu(obj2, (String) list.get(0), ljyVar, 6, null));
                return;
            }
            ljqVar3.o = ljyVar;
            ljqVar3.e();
            if (responseCode < 400) {
                ljqVar3.n = ljd.a(ljqVar3.q.getInputStream());
                ljqVar3.b.d();
                return;
            } else {
                InputStream errorStream = ljqVar3.q.getErrorStream();
                ljqVar3.n = errorStream != null ? ljd.a(errorStream) : null;
                ljqVar3.b.d();
                return;
            }
        }
        ljq ljqVar4 = (ljq) this.a;
        if (ljqVar4.g.get() == 8) {
            return;
        }
        URL url = new URL(ljqVar4.m);
        HttpURLConnection httpURLConnection2 = ljqVar4.q;
        if (httpURLConnection2 != null) {
            httpURLConnection2.disconnect();
            ljqVar4.q = null;
        }
        long j = ljqVar4.u;
        if (j == -1) {
            ljqVar4.q = (HttpURLConnection) url.openConnection();
        } else {
            Network[] allNetworks = ((ConnectivityManager) ljqVar4.r.d.getSystemService("connectivity")).getAllNetworks();
            int length = allNetworks.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Network network2 = allNetworks[i3];
                if (network2.getNetworkHandle() == j) {
                    network = network2;
                    break;
                }
                i3++;
            }
            if (network == null) {
                throw new ljt();
            }
            ljqVar4.q = (HttpURLConnection) network.openConnection(url);
        }
        ljqVar4.q.setInstanceFollowRedirects(false);
        Map map = ljqVar4.e;
        if (!map.containsKey("User-Agent")) {
            map.put("User-Agent", ljqVar4.d);
        }
        for (Map.Entry entry : map.entrySet()) {
            ljqVar4.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        ljqVar4.q.setRequestMethod(ljqVar4.i);
        lkb lkbVar = ljqVar4.j;
        if (lkbVar != null) {
            ljqVar4.y = new ljj(ljqVar4, ljqVar4.k, ljqVar4.c, ljqVar4.q, lkbVar);
            ljj ljjVar3 = ljqVar4.y;
            ljjVar3.a(new lji(ljjVar3, ljqVar4.f.size() == 1, 1), "start");
        } else {
            ljqVar4.l = 10;
            ljqVar4.q.connect();
            ljqVar4.g();
        }
    }
}
