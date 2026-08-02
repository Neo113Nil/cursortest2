package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fyc implements gzf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fyc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v58, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r7v61, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v63, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r7v64, types: [java.lang.Object, krt] */
    @Override // defpackage.gzf
    public final Object a(Object obj) {
        int i = 1;
        switch (this.b) {
            case 0:
                fyg fygVar = (fyg) obj;
                jkj C = fygVar.C();
                for (String str : DesugarCollections.unmodifiableMap(fygVar.b).keySet()) {
                    str.getClass();
                    Integer num = (Integer) fygVar.b.get(str);
                    if (num == null) {
                        throw new IllegalArgumentException();
                    }
                    if (num.intValue() == ((frv) this.a).a) {
                        str.getClass();
                        if (!C.b.M()) {
                            C.t();
                        }
                        ((fyg) C.b).b().remove(str);
                    }
                }
                return (fyg) C.q();
            case 1:
                String str2 = ((fye) this.a).a;
                fyg fygVar2 = (fyg) obj;
                str2.getClass();
                if (!fygVar2.b.containsKey(str2)) {
                    return null;
                }
                str2.getClass();
                Integer num2 = (Integer) fygVar2.b.get(str2);
                if (num2 != null) {
                    return frv.a(num2.intValue());
                }
                throw new IllegalArgumentException();
            case 2:
                File[] listFiles = ((File) obj).listFiles(new gab(this.a, i));
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.delete()) {
                            ((hkf) ((hkf) fzz.a.e()).i("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet", "clean", 71, "OrphanCacheAccountSynclet.java")).u("Removed orphaned cache file: %s", file);
                        } else {
                            ((hkf) ((hkf) fzz.a.f()).i("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet", "clean", 73, "OrphanCacheAccountSynclet.java")).u("Failed to remove orphaned cache file: %s", file);
                        }
                    }
                }
                return null;
            case 3:
                return ((bvw) this.a).a;
            case 4:
                return ((bvw) this.a).a;
            case 5:
                return ((bvw) this.a).a;
            case 6:
                return ((bvw) this.a).a;
            case 7:
                int i2 = gdh.b;
                return this.a.a(obj);
            case 8:
                int i3 = gdh.b;
                return this.a.a(obj);
            case 9:
                int i4 = gdh.b;
                return this.a.a(obj);
            case 10:
                ggg gggVar = (ggg) this.a;
                hel helVar = gggVar.a;
                Throwable th = (Throwable) obj;
                gga ggaVar = gga.b;
                if (!helVar.contains(ggaVar)) {
                    return gge.a;
                }
                if (gggVar.b) {
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    ggb a = ggc.a();
                    a.b(true);
                    a.d(ggaVar);
                    a.c(jjq.t(stringWriter.toString()));
                    return a.a();
                }
                StringBuilder sb = new StringBuilder();
                cfe.h(sb, th);
                for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                    sb.append("Caused by: ");
                    cfe.h(sb, cause);
                }
                ggb a2 = ggc.a();
                a2.b(false);
                a2.d(ggaVar);
                a2.c(jjq.t(sb.toString()));
                return a2.a();
            case 11:
                ggc ggcVar = (ggc) obj;
                if (((ggg) this.a).b || !ggcVar.c) {
                    return ggcVar;
                }
                throw new IllegalStateException("DebugData may contain PII, but no PII was allowed.");
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                this.a.a(obj);
                return null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return this.a.a(obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ggw ggwVar = (ggw) obj;
                ggwVar.getClass();
                if (!ggwVar.a) {
                    ghf ghfVar = (ghf) this.a;
                    Optional optional = (Optional) ghfVar.a;
                    if (optional.isPresent()) {
                        ((cfe) ghfVar.e).c();
                        ((evt) optional.get()).a();
                    }
                }
                return ggwVar;
            case 15:
                ((List) obj).getClass();
                return (ggw) hnu.aR(this.a);
            case 16:
                return this.a.a(obj);
            case 17:
                this.a.a(obj);
                return null;
            case 18:
                return this.a.a(obj);
            case 19:
                return this.a;
            default:
                return this.a;
        }
    }
}
