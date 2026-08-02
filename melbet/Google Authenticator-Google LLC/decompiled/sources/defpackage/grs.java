package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grs implements jrw {
    private final jsb a;
    private final jsb b;
    private final /* synthetic */ int c;

    public grs(jsb jsbVar, jsb jsbVar2, int i) {
        this.c = i;
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, koe] */
    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        ikm ikmVar;
        switch (this.c) {
            case 0:
                Object hjnVar = ((gjf) this.a).a().booleanValue() ? new hjn(((gru) this.b).b()) : hjb.a;
                hjnVar.getClass();
                return hjnVar;
            case 1:
                Object hjnVar2 = ((gjf) this.a).a().booleanValue() ? new hjn(((gru) this.b).b()) : hjb.a;
                hjnVar2.getClass();
                return hjnVar2;
            case 2:
                Object hjnVar3 = ((gjf) this.a).a().booleanValue() ? new hjn(((grw) this.b).b()) : hjb.a;
                hjnVar3.getClass();
                return hjnVar3;
            case 3:
                iwq b = ((gxi) this.a).b();
                return new gxh(this.b, b.a, ((bnu) b.d).a(), b.b, b.c);
            case 4:
                jsb jsbVar = this.b;
                iee b2 = ((ief) this.a).b();
                Set b3 = ((jsd) jsbVar).b();
                gty aC = hoq.aC(288, "CronetConfigurationModule#getCronetEngine");
                try {
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    try {
                        try {
                            Object obj = b2.a;
                            ?? r4 = b2.b;
                            Object obj2 = b2.c;
                            ExperimentalCronetEngine.Builder a = b2.a((Context) obj, r4, (gzp) obj2);
                            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                            Object obj3 = b2.g;
                            if (((gzp) obj2).f()) {
                                iea ieaVar = (iea) ((gzp) obj2).b();
                                int i = ieaVar.j() ? ieaVar.k() ? 3 : 2 : 0;
                                if (i != 0) {
                                    File file = new File(((Context) obj).getCacheDir(), ieaVar.g());
                                    file.mkdirs();
                                    if (file.isDirectory()) {
                                        a.setStoragePath(file.getAbsolutePath());
                                        a.enableHttpCache(i, ieaVar.a());
                                    }
                                } else if (ieaVar.g() != null && ((Boolean) ((gzp) obj3).d(false)).booleanValue()) {
                                    File file2 = new File(((Context) obj).getCacheDir(), ieaVar.g());
                                    file2.mkdirs();
                                    if (file2.isDirectory()) {
                                        a.setStoragePath(file2.getAbsolutePath());
                                    }
                                }
                                iee.d((gzp) obj2, a);
                            }
                            iee.b((gzp) obj2, a);
                            ExperimentalCronetEngine build = a.build();
                            iee.c((gzp) obj2, build, b2.e, b2.f);
                            iee.e((gzp) obj2, build);
                            ikmVar = new ikm(build, a.getDefaultUserAgent());
                            StrictMode.setThreadPolicy(threadPolicy);
                            aC.close();
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    } catch (IllegalStateException e) {
                        Object obj4 = b2.c;
                        if (!((gzp) obj4).f() || !((iea) ((gzp) obj4).b()).l()) {
                            throw e;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        ExperimentalCronetEngine.Builder a2 = b2.a((Context) b2.a, b2.b, (gzp) obj4);
                        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                        iee.d((gzp) obj4, a2);
                        iee.b((gzp) obj4, a2);
                        ExperimentalCronetEngine build2 = a2.build();
                        iee.c((gzp) obj4, build2, b2.e, b2.f);
                        iee.e((gzp) obj4, build2);
                        ikm ikmVar2 = new ikm(build2, a2.getDefaultUserAgent());
                        StrictMode.setThreadPolicy(threadPolicy);
                        aC.close();
                        ikmVar = ikmVar2;
                    }
                    Iterator it = b3.iterator();
                    while (it.hasNext()) {
                        ((CronetEngine) ikmVar.a).addRequestFinishedListener((RequestFinishedInfo.Listener) it.next());
                    }
                    return ikmVar;
                } finally {
                }
            case 5:
                gva gvaVar = (gva) this.b.b();
                hen henVar = new hen(4);
                for (Map.Entry entry : ((jrt) this.a).a.entrySet()) {
                    henVar.g((String) entry.getKey(), new gnk(gvaVar, entry, 4, null));
                }
                return new iga(henVar.d(true));
            case 6:
                return new ihd(((ihc) this.a).b(), (gzp) ((jrx) this.b).a);
            case 7:
                return new ggo(((jsd) this.a).b(), (Set) ((jrx) this.b).a);
            default:
                return new ggo(((jsd) this.a).b(), (Set) ((jrx) this.b).a);
        }
    }

    public grs(jsb jsbVar, jsb jsbVar2, int i, short[] sArr) {
        this.c = i;
        this.b = jsbVar;
        this.a = jsbVar2;
    }
}
