package v3;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import c3.AbstractC1381a;
import com.ironsource.cc;
import f2.AbstractC2420c;
import f3.C2423a;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l3.d;
import l3.g;
import l3.h;
import l3.i;
import l3.j;
import org.json.JSONArray;
import t3.c;
import x3.b;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final c f46489a;

    /* renamed from: b, reason: collision with root package name */
    private final b f46490b;

    /* renamed from: c, reason: collision with root package name */
    private final C2423a f46491c;

    public a(c tracer, w3.a limits) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f46489a = tracer;
        this.f46490b = b.f46714e.a(tracer);
        this.f46491c = new C2423a.C0217a().e("CRASH_REPORT").f(limits).a();
    }

    private final k3.a a() {
        return x3.a.f46710b.a(this.f46489a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void b(String severity, Throwable e4, String str, List logs, List tags) {
        ?? r32;
        List list;
        String sb;
        byte[] bytes;
        JSONArray b4;
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(e4, "e");
        Intrinsics.checkNotNullParameter(logs, "logs");
        Intrinsics.checkNotNullParameter(tags, "tags");
        try {
            String g4 = this.f46489a.g();
            if (g4 == null) {
                throw new IllegalStateException("No lib token");
            }
            String a4 = AbstractC1381a.a(this.f46489a.c());
            Context c4 = this.f46489a.c();
            t3.b h4 = this.f46489a.h();
            String l4 = this.f46489a.l();
            Date date = new Date();
            if (tags.isEmpty()) {
                r32 = 0;
                list = null;
            } else {
                list = tags;
                r32 = 0;
            }
            String jSONObject = x3.c.a(c4, h4, l4, date, str, list).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "uploadBean.toString()");
            StringBuilder sb2 = new StringBuilder();
            r3.a.b(e4, sb2);
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            byte[] a5 = n3.b.a(sb3);
            if (logs.isEmpty()) {
                sb = r32;
            } else {
                StringBuilder sb4 = new StringBuilder();
                Iterator it = logs.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw r32;
                }
                sb = sb4.toString();
                Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().apply(builderAction).toString()");
            }
            byte[] a6 = sb != null ? n3.b.a(sb) : r32;
            Collection e5 = a().e();
            Collection collection = !e5.isEmpty() ? e5 : r32;
            String jSONArray = (collection == null || (b4 = k3.c.f41024a.b(collection)) == null) ? r32 : b4.toString();
            Uri.Builder appendQueryParameter = Uri.parse(this.f46489a.b().a()).buildUpon().appendEncodedPath("api/crash/upload").appendQueryParameter("crashToken", g4);
            if (a4 != null) {
                appendQueryParameter.appendQueryParameter("crashHostAppToken", a4);
            }
            String builder = appendQueryParameter.toString();
            Intrinsics.checkNotNullExpressionValue(builder, "tracer.configuration.api…}\n            .toString()");
            d dVar = new d();
            dVar.c("type", "NON_FATAL");
            dVar.c("format", "JVM_STACKTRACE");
            dVar.c("severity", severity);
            h.a aVar = h.f41350L2;
            dVar.a("stackTrace", "stack.gzip", aVar.a("application/octet-stream", a5));
            d.b(dVar, "uploadBean", null, h.a.c(aVar, "application/json; charset=utf-8", jSONObject, null, 4, null), 2, null);
            if (a6 != null) {
                dVar.a("logs", "logs.gzip", aVar.a("application/octet-stream", a6));
            }
            if (jSONArray != null) {
                dVar.a("drops", "drops.json", h.a.c(aVar, cc.f15719L, jSONArray, null, 4, null));
            }
            try {
                i a7 = this.f46490b.d().a(new g(builder, dVar.d()));
                try {
                    int o4 = a7.o();
                    String n4 = a7.n();
                    j m4 = a7.m();
                    String contentType = m4 != null ? m4.getContentType() : r32;
                    j m5 = a7.m();
                    this.f46491c.a(contentType, (m5 == null || (bytes = m5.getBytes()) == null) ? r32 : StringsKt.t(bytes));
                    if (o4 == 200) {
                        Unit unit = Unit.f41027a;
                        AbstractC2420c.a(a7, r32);
                        return;
                    }
                    throw new IOException("HTTP " + o4 + ' ' + n4);
                } finally {
                }
            } catch (IOException e6) {
                Log.e("ru.ok.tracer", "Tracer crash report failed", e6);
                a().b(e5);
            }
        } catch (Exception unused) {
            Log.e("Tracer", "No lib token");
        }
    }
}
