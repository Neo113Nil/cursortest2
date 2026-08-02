package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aya implements krt {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aya(String str, int i) {
        this.c = i;
        this.a = "SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1";
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        if (defpackage.ksp.m(r1, "gemini", true) == true) goto L114;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.krt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        Intent A;
        int i = 0;
        int i2 = 1;
        atb atbVar = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        String str = null;
        atbVar = null;
        switch (this.c) {
            case 0:
                return Boolean.valueOf(brr.g((String) this.a, (String) this.b, (ana) obj));
            case 1:
                return Integer.valueOf(brr.e((String) this.a, (String) this.b, (ana) obj));
            case 2:
                return Integer.valueOf(brr.e((String) this.a, (String) this.b, (ana) obj));
            case 3:
                ana anaVar = (ana) obj;
                anaVar.getClass();
                amh a = anaVar.a((String) this.a);
                try {
                    a.i(1, (String) this.b);
                    if (a.l()) {
                        Integer valueOf = a.k(0) ? null : Integer.valueOf((int) a.b(0));
                        if (valueOf != null) {
                            atbVar = abf.l(valueOf.intValue());
                        }
                    }
                    return atbVar;
                } finally {
                    a.close();
                }
            case 4:
                ana anaVar2 = (ana) obj;
                anaVar2.getClass();
                ((aye) this.b).a.c(anaVar2, this.a);
                return kow.a;
            case 5:
                return brr.d((String) this.a, (String) this.b, (ana) obj);
            case 6:
                return brr.c((String) this.a, (String) this.b, (ana) obj);
            case 7:
                ana anaVar3 = (ana) obj;
                anaVar3.getClass();
                ((ayh) this.b).b.c(anaVar3, this.a);
                return kow.a;
            case 8:
                String str2 = ((chu) this.a).e;
                if (str2 != null) {
                    ((duf) this.b).a(str2);
                }
                return kow.a;
            case 9:
                eb ebVar = (eb) obj;
                ebVar.getClass();
                View view = ebVar.R;
                if (view != null) {
                    ((gjl) this.a).e(view, ((jgw) this.b).a);
                }
                return kow.a;
            case 10:
                eb ebVar2 = (eb) obj;
                ebVar2.getClass();
                View view2 = ebVar2.R;
                if (view2 != null) {
                    ((dun) ((gjl) this.a).h).a.a(view2, ((jhj) this.b).a);
                }
                return kow.a;
            case 11:
                eb ebVar3 = (eb) obj;
                ebVar3.getClass();
                View view3 = ebVar3.R;
                if (view3 != null) {
                    ((dun) ((gjl) this.a).h).b.a(view3, ((jhp) this.b).a);
                }
                return kow.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((View) obj).getClass();
                ijp ijpVar = (ijp) this.b;
                int i3 = ijpVar.e;
                if (i3 == 4) {
                    hpq hpqVar = i3 == 4 ? (hpq) ijpVar.f : hpq.a;
                    Object obj2 = this.a;
                    hpqVar.getClass();
                    ((dvi) obj2).b(hpqVar);
                }
                return jiv.a;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((View) obj).getClass();
                ijh ijhVar = (ijh) this.b;
                int i4 = ijhVar.d;
                if (i4 == 0) {
                    i = 6;
                } else if (i4 == 5) {
                    i = 1;
                } else if (i4 == 6) {
                    i = 2;
                } else if (i4 == 7) {
                    i = 3;
                } else if (i4 == 9) {
                    i = 4;
                } else if (i4 == 10) {
                    i = 5;
                }
                if (i == 0) {
                    throw null;
                }
                int i5 = i - 1;
                Object obj3 = this.a;
                if (i5 == 0) {
                    hpq hpqVar2 = i4 == 5 ? (hpq) ijhVar.e : hpq.a;
                    hpqVar2.getClass();
                    ((dvi) obj3).b(hpqVar2);
                } else if (i5 == 1) {
                    ijz ijzVar = i4 == 6 ? (ijz) ijhVar.e : ijz.a;
                    ijzVar.getClass();
                    if ((ijzVar.b & 1) != 0) {
                        hpq hpqVar3 = ijzVar.c;
                        if (hpqVar3 == null) {
                            hpqVar3 = hpq.a;
                        }
                        hpqVar3.getClass();
                        ((dvi) obj3).b(hpqVar3);
                    }
                } else if (i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5) {
                    throw new koj();
                }
                return jiv.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((View) obj).getClass();
                dvq dvqVar = (dvq) this.a;
                Optional optional = dvqVar.c;
                Object obj4 = this.b;
                if (optional.isPresent()) {
                    ijk ijkVar = (ijk) obj4;
                    if ((ijkVar.b & 4) != 0) {
                        dva dvaVar = (dva) optional.get();
                        jjd jjdVar = ijkVar.e;
                        if (jjdVar == null) {
                            jjdVar = jjd.a;
                        }
                        jjdVar.getClass();
                        return dvaVar.c();
                    }
                }
                ijk ijkVar2 = (ijk) obj4;
                if ((ijkVar2.b & 8) == 0) {
                    return jiv.a;
                }
                hpq hpqVar4 = ijkVar2.f;
                if (hpqVar4 == null) {
                    hpqVar4 = hpq.a;
                }
                String str3 = hpr.a(hpqVar4).a;
                if (str3.length() > 0) {
                    String packageName = dvqVar.e.getPackageName();
                    packageName.getClass();
                    String str4 = dvqVar.g;
                    Uri parse = Uri.parse(str3);
                    parse.getClass();
                    switch (packageName.hashCode()) {
                        case -2103931100:
                            if (packageName.equals("com.google.android.apps.subscriptions.red")) {
                                str = "google_one";
                                break;
                            }
                            break;
                        case -1958346218:
                            if (packageName.equals("com.google.android.googlequicksearchbox")) {
                                if (str4 != null) {
                                    str = "gemini";
                                    break;
                                }
                                str = "search";
                                break;
                            }
                            break;
                        case -1874619167:
                            if (packageName.equals("com.google.android.apps.docs.editors.docs")) {
                                str = "docs";
                                break;
                            }
                            break;
                        case -1494700006:
                            if (packageName.equals("com.google.android.apps.docs.editors.sheets")) {
                                str = "sheets";
                                break;
                            }
                            break;
                        case -1490888184:
                            if (packageName.equals("com.google.android.apps.docs.editors.slides")) {
                                str = "slides";
                                break;
                            }
                            break;
                        case -1430093937:
                            if (packageName.equals("com.google.android.apps.messaging")) {
                                str = "messages";
                                break;
                            }
                            break;
                        case -543674259:
                            if (packageName.equals("com.google.android.gm")) {
                                str = "gmail";
                                break;
                            }
                            break;
                        case 40464080:
                            if (packageName.equals("com.google.android.apps.docs")) {
                                str = "drive";
                                break;
                            }
                            break;
                        case 40719148:
                            if (packageName.equals("com.google.android.apps.maps")) {
                                str = "maps";
                                break;
                            }
                            break;
                        case 568722390:
                            if (packageName.equals("com.google.android.apps.photos")) {
                                str = "photos";
                                break;
                            }
                            break;
                        case 578428293:
                            if (packageName.equals("com.google.android.calendar")) {
                                str = "calendar";
                                break;
                            }
                            break;
                        case 1556390611:
                            if (packageName.equals("com.google.android.apps.recorder")) {
                                str = "recorder";
                                break;
                            }
                            break;
                    }
                    if (str != null) {
                        parse = parse.buildUpon().appendQueryParameter("utm_source", str).build();
                        parse.getClass();
                    }
                    dvqVar.p.e(new Intent("android.intent.action.VIEW", parse), new dtn(dul.a, jiv.a), 1);
                }
                return jiv.a;
            case 15:
                ((View) obj).getClass();
                dva dvaVar2 = (dva) ((dvq) this.a).c.get();
                ijp ijpVar2 = (ijp) this.b;
                (ijpVar2.e == 6 ? (jjd) ijpVar2.f : jjd.a).getClass();
                return dvaVar2.c();
            case 16:
                ((View) obj).getClass();
                dva dvaVar3 = (dva) ((dvq) this.a).c.get();
                ijp ijpVar3 = (ijp) this.b;
                if (ijpVar3.e == 6) {
                } else {
                    jjd jjdVar2 = jjd.a;
                }
                return dvaVar3.c();
            case 17:
                ((View) obj).getClass();
                dvw dvwVar = (dvw) this.b;
                boolean i6 = dvwVar.f.i();
                jiv jivVar = i6 ? jiv.b : jiv.a;
                ehr ehrVar = dvwVar.c;
                if (ehrVar != null) {
                    Object obj5 = this.a;
                    if (i6) {
                        Object obj6 = ((gjl) obj5).f;
                        dvwVar.g.d().getClass();
                        jkj k = iiw.a.k();
                        if (!k.b.M()) {
                            k.t();
                        }
                        iiw iiwVar = (iiw) k.b;
                        iiwVar.b = 1 | iiwVar.b;
                        iiwVar.c = 10003;
                        jkp q = k.q();
                        q.getClass();
                        A = eos.A(ehrVar, (gzp) obj6, (iiw) q);
                    } else {
                        Object obj7 = ((gjl) obj5).f;
                        dvwVar.g.d().getClass();
                        jkj k2 = iiw.a.k();
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        jkp jkpVar = k2.b;
                        iiw iiwVar2 = (iiw) jkpVar;
                        iiwVar2.b = 1 | iiwVar2.b;
                        iiwVar2.c = 218;
                        if (!jkpVar.M()) {
                            k2.t();
                        }
                        ((iiw) k2.b).b().put("hostId", "ogb");
                        jkp q2 = k2.q();
                        q2.getClass();
                        A = eos.A(ehrVar, (gzp) obj7, (iiw) q2);
                    }
                    dvwVar.h.e(A, new dtn(dul.a, jivVar), 3);
                }
                return jivVar;
            case 18:
                View view4 = (View) obj;
                view4.getClass();
                ((dwe) this.a).k.e(view4, (jit) this.b);
                return jiv.a;
            case 19:
                kzg kzgVar = (kzg) obj;
                kzgVar.getClass();
                ebc ebcVar = (ebc) this.b;
                gzp gzpVar = ebcVar.g;
                gzpVar.getClass();
                Object obj8 = this.a;
                return new eav(ebcVar, kzgVar, (jiw) ((cfe) obj8).a, new fvv(obj8, gzpVar, i2));
            default:
                kzg kzgVar2 = (kzg) obj;
                kzgVar2.getClass();
                ebb ebbVar = (ebb) this.b;
                gzp gzpVar2 = ebbVar.g;
                gzpVar2.getClass();
                Object obj9 = this.a;
                return new eat(ebbVar, kzgVar2, (jiw) ((cfe) obj9).a, new fvv(obj9, gzpVar2, i2));
        }
    }

    public /* synthetic */ aya(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ aya(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ aya(String str, int i, byte[] bArr) {
        this.c = i;
        this.a = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ aya(String str, int i, char[] cArr) {
        this.c = i;
        this.a = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ aya(String str, int i, int[] iArr) {
        this.c = i;
        this.a = "DELETE FROM worktag WHERE work_spec_id=?";
        this.b = str;
    }

    public /* synthetic */ aya(String str, int i, short[] sArr) {
        this.c = i;
        this.a = "SELECT state FROM workspec WHERE id=?";
        this.b = str;
    }

    public /* synthetic */ aya(String str, int i, boolean[] zArr) {
        this.c = i;
        this.a = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        this.b = str;
    }
}
