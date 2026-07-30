package u2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.C4287ze;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import q2.C4907p;
import q2.r;

/* loaded from: classes.dex */
public final class l implements InterfaceC5109c {

    /* renamed from: n, reason: collision with root package name */
    public final Context f41249n;

    /* renamed from: u, reason: collision with root package name */
    public final String f41250u;

    /* renamed from: v, reason: collision with root package name */
    public String f41251v;

    public l(Context context, String str) {
        this.f41249n = context;
        this.f41250u = str;
    }

    public final k a(HashMap hashMap, String str) {
        k kVar = k.f41246v;
        k kVar2 = k.f41245u;
        if (str != null) {
            C3151ea c3151ea = AbstractC3368ia.f31668g;
            r rVar = r.f40116e;
            if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.f31654e3)).booleanValue() || !C4907p.f40108g.f40111c) {
                    try {
                        StringBuilder sb = new StringBuilder(str.length() + 13);
                        sb.append("Pinging URL: ");
                        sb.append(str);
                        i.a(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) b(str).openConnection();
                        try {
                            d dVar = C4907p.f40108g.f40109a;
                            String str2 = this.f41250u;
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setReadTimeout(60000);
                            if (str2 != null) {
                                httpURLConnection.setRequestProperty("User-Agent", str2);
                            }
                            httpURLConnection.setUseCaches(false);
                            if (hashMap != null) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            f fVar = new f();
                            fVar.a(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            fVar.b(httpURLConnection, responseCode);
                            if (responseCode >= 200 && responseCode < 300) {
                                if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.V8)).booleanValue()) {
                                    this.f41251v = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                kVar2 = k.f41244n;
                                httpURLConnection.disconnect();
                                return kVar2;
                            }
                            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(str);
                            i.f(sb2.toString());
                            if (responseCode == 502) {
                                kVar2 = kVar;
                            }
                            httpURLConnection.disconnect();
                            return kVar2;
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (MalformedURLException e6) {
                        e = e6;
                        kVar = kVar2;
                        c(str, e);
                        return kVar;
                    } catch (IOException e9) {
                        e = e9;
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                        sb3.append("Error while pinging URL: ");
                        sb3.append(str);
                        sb3.append(". ");
                        sb3.append(message);
                        i.f(sb3.toString());
                        return kVar;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        kVar = kVar2;
                        c(str, e);
                        return kVar;
                    } catch (RuntimeException e11) {
                        e = e11;
                        String message2 = e.getMessage();
                        StringBuilder sb32 = new StringBuilder(String.valueOf(message2).length() + str.length() + 27);
                        sb32.append("Error while pinging URL: ");
                        sb32.append(str);
                        sb32.append(". ");
                        sb32.append(message2);
                        i.f(sb32.toString());
                        return kVar;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return kVar2;
    }

    public final URL b(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e6) {
            e = e6;
            c(str, e);
        } catch (MalformedURLException e9) {
            e = e9;
            c(str, e);
        } catch (URISyntaxException e10) {
            c(str, e10);
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31659f)).booleanValue()) {
                try {
                    i.a("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String obj = uri.toString();
                    StringBuilder sb = new StringBuilder(str.length() + 114 + obj.length());
                    sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb.append(str);
                    sb.append("\" -> encoded URI: ");
                    sb.append(obj);
                    i.a(sb.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e11) {
                    c(str, e11);
                }
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 47);
        sb2.append("Falling back to direct new URL(\"");
        sb2.append(str);
        sb2.append("\") constructor.");
        i.a(sb2.toString());
        return new URL(str);
    }

    public final void c(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        i.f(sb.toString());
        C4287ze.a(this.f41249n).f(exc, "HttpUrlPinger.pingUrl", ((Integer) r.f40116e.f40119c.a(AbstractC3368ia.ie)).intValue() / 100.0f);
    }

    @Override // u2.InterfaceC5109c
    public final k d(String str) {
        return a(null, str);
    }
}
