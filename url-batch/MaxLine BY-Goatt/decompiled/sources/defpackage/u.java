package defpackage;

import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Object obj) {
        super(0);
        this.m = i;
        this.n = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:410:0x057a, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0288 A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #20 {all -> 0x021f, blocks: (B:60:0x014e, B:117:0x0226, B:144:0x0288, B:151:0x02a9, B:154:0x0282, B:166:0x021e, B:176:0x0215, B:195:0x02e3, B:196:0x02e6, B:38:0x02c4, B:42:0x02d9, B:43:0x02e0, B:210:0x02eb, B:211:0x0301, B:141:0x027d, B:172:0x0210, B:62:0x0157, B:64:0x0160, B:67:0x0171, B:85:0x01fd, B:96:0x01f6, B:108:0x0201, B:109:0x0206, B:111:0x0207, B:92:0x01f1), top: B:59:0x014e, inners: #0, #10, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fd A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        k00 k00Var;
        t81 parentLayoutCoordinates;
        int lastIndexOf;
        d71 d71Var;
        int i;
        Throwable th;
        gl0 gl0Var;
        Pair pair;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        int m;
        Pair pair2;
        boolean z2 = false;
        int i2 = 1;
        switch (this.m) {
            case 0:
                ((nu) this.n).H.invoke();
                return Boolean.TRUE;
            case 1:
                j8.m(((ua) this.n).o, null);
                return Unit.a;
            case 2:
                ((fb) this.n).v.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.a;
            case 3:
                z71.F((gb) this.n);
                return Unit.a;
            case 4:
                ((tb) this.n).b = null;
                return Unit.a;
            case 5:
                ((g30) this.n).a.setValue(d30.a);
                return Unit.a;
            case 6:
                return ((sc1) this.n).d();
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return new dv2((ww1) this.n, 0.0f);
            case 8:
                return new de0((ee0) this.n);
            case 9:
                Object obj = cl0.d;
                File file = (File) this.n;
                synchronized (obj) {
                    cl0.c.remove(file.getAbsolutePath());
                }
                return Unit.a;
            case 10:
                ((yo0) this.n).H0();
                return Unit.a;
            case 11:
                cp0 cp0Var = (cp0) this.n;
                bl0 bl0Var = bl0.s;
                ul1 ul1Var = cp0Var.m;
                eo1 eo1Var = null;
                while (true) {
                    if (ul1Var == null) {
                        if (!cp0Var.m.z) {
                            h21.b("visitChildren called on an unattached node");
                        }
                        eo1 eo1Var2 = new eo1(new ul1[16]);
                        ul1 ul1Var2 = cp0Var.m;
                        ul1 ul1Var3 = ul1Var2.r;
                        if (ul1Var3 == null) {
                            s03.b(eo1Var2, ul1Var2);
                        } else {
                            eo1Var2.b(ul1Var3);
                        }
                        while (true) {
                            int i3 = eo1Var2.o;
                            if (i3 != 0) {
                                ul1 ul1Var4 = (ul1) eo1Var2.l(i3 - 1);
                                if ((ul1Var4.p & 1024) == 0) {
                                    s03.b(eo1Var2, ul1Var4);
                                } else {
                                    while (true) {
                                        if (ul1Var4 == null) {
                                            break;
                                        }
                                        if ((ul1Var4.o & 1024) != 0) {
                                            eo1 eo1Var3 = null;
                                            while (ul1Var4 != null) {
                                                if (ul1Var4 instanceof yo0) {
                                                    yo0 yo0Var = (yo0) ul1Var4;
                                                    z = yo0Var.H0().a ? yo0Var.K0(7) : mh2.h(yo0Var, 7, bl0Var);
                                                } else {
                                                    if ((ul1Var4.o & 1024) != 0 && (ul1Var4 instanceof p90)) {
                                                        int i4 = 0;
                                                        for (ul1 ul1Var5 = ((p90) ul1Var4).B; ul1Var5 != null; ul1Var5 = ul1Var5.r) {
                                                            if ((ul1Var5.o & 1024) != 0) {
                                                                i4++;
                                                                if (i4 == 1) {
                                                                    ul1Var4 = ul1Var5;
                                                                } else {
                                                                    if (eo1Var3 == null) {
                                                                        eo1Var3 = new eo1(new ul1[16]);
                                                                    }
                                                                    if (ul1Var4 != null) {
                                                                        eo1Var3.b(ul1Var4);
                                                                        ul1Var4 = null;
                                                                    }
                                                                    eo1Var3.b(ul1Var5);
                                                                }
                                                            }
                                                        }
                                                        if (i4 == 1) {
                                                        }
                                                    }
                                                    ul1Var4 = s03.c(eo1Var3);
                                                }
                                            }
                                        } else {
                                            ul1Var4 = ul1Var4.r;
                                        }
                                    }
                                }
                            } else {
                                z = false;
                            }
                        }
                    } else if (ul1Var instanceof yo0) {
                        yo0 yo0Var2 = (yo0) ul1Var;
                        z = yo0Var2.H0().a ? yo0Var2.K0(7) : mh2.h(yo0Var2, 7, bl0Var);
                    } else {
                        if ((ul1Var.o & 1024) != 0 && (ul1Var instanceof p90)) {
                            int i5 = 0;
                            for (ul1 ul1Var6 = ((p90) ul1Var).B; ul1Var6 != null; ul1Var6 = ul1Var6.r) {
                                if ((ul1Var6.o & 1024) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        ul1Var = ul1Var6;
                                    } else {
                                        if (eo1Var == null) {
                                            eo1Var = new eo1(new ul1[16]);
                                        }
                                        if (ul1Var != null) {
                                            eo1Var.b(ul1Var);
                                            ul1Var = null;
                                        }
                                        eo1Var.b(ul1Var6);
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                        ul1Var = s03.c(eo1Var);
                    }
                }
                return Boolean.valueOf(z);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                Object systemService = ((View) ((mh) this.n).n).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                Object systemService2 = ((View) ((t21) this.n).n).getContext().getSystemService("input_method");
                systemService2.getClass();
                return (InputMethodManager) systemService2;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                m91 m91Var = ((i91) this.n).Q;
                m91Var.p.K = true;
                xg1 xg1Var = m91Var.q;
                if (xg1Var != null) {
                    xg1Var.E = true;
                }
                return Unit.a;
            case 15:
                o91 o91Var = (o91) this.n;
                if (!((Boolean) o91Var.f.getValue()).booleanValue() && (k00Var = o91Var.c) != null) {
                    k00Var.k();
                }
                return Unit.a;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return new gc1((ld2) this.n, mi1.c());
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return new BaseInputConnection(((tc1) this.n).a, false);
            case 18:
                xl1 xl1Var = (xl1) this.n;
                eo1 eo1Var4 = xl1Var.c;
                eo1 eo1Var5 = xl1Var.b;
                eo1 eo1Var6 = xl1Var.e;
                xl1Var.f = false;
                HashSet hashSet = new HashSet();
                eo1 eo1Var7 = xl1Var.d;
                Object[] objArr = eo1Var7.m;
                int i6 = eo1Var7.o;
                for (int i7 = 0; i7 < i6; i7++) {
                    i91 i91Var = (i91) objArr[i7];
                    u52 u52Var = (u52) eo1Var6.m[i7];
                    ul1 ul1Var7 = i91Var.P.f;
                    if (ul1Var7.z) {
                        xl1.b(ul1Var7, u52Var, hashSet);
                    }
                }
                eo1Var7.g();
                eo1Var6.g();
                Object[] objArr2 = eo1Var5.m;
                int i8 = eo1Var5.o;
                for (int i9 = 0; i9 < i8; i9++) {
                    fn fnVar = (fn) objArr2[i9];
                    u52 u52Var2 = (u52) eo1Var4.m[i9];
                    if (fnVar.z) {
                        xl1.b(fnVar, u52Var2, hashSet);
                    }
                }
                eo1Var5.g();
                eo1Var4.g();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((fn) it.next()).I0();
                }
                return Unit.a;
            case 19:
                up1 up1Var = (up1) this.n;
                Context context = up1Var.a;
                dr1 dr1Var = up1Var.v;
                context.getClass();
                dr1Var.getClass();
                return new cq1();
            case 20:
                return new lp1((String) this.n);
            case 21:
                return ap.l((Context) this.n);
            case 22:
                return (a50) ((js0) this.n).p;
            case 23:
                return ((mr1) this.n).G0();
            case 24:
                Function1 function1 = (Function1) this.n;
                ia2 ia2Var = ks1.V;
                function1.invoke(ia2Var);
                ia2Var.B = ia2Var.v.a(ia2Var.x, ia2Var.z, ia2Var.y);
                return Unit.a;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                m32 m32Var = (m32) this.n;
                parentLayoutCoordinates = m32Var.getParentLayoutCoordinates();
                return Boolean.valueOf((((parentLayoutCoordinates == null || !parentLayoutCoordinates.y()) ? null : parentLayoutCoordinates) == null || m32Var.m14getPopupContentSizebOM6tXw() == null) ? false : true);
            case 26:
                File file2 = (File) ((k7) this.n).invoke();
                String name = file2.getName();
                name.getClass();
                if (!up2.I(name, '.', BuildConfig.FLAVOR).equals("preferences_pb")) {
                    ey.f(file2, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                    return null;
                }
                File absoluteFile = file2.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 27:
                dx0 dx0Var = ((v62) this.n).e;
                dx0Var.getClass();
                List<Certificate> a = dx0Var.a();
                ArrayList arrayList = new ArrayList(rv.l(a, 10));
                for (Certificate certificate : a) {
                    certificate.getClass();
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 28:
                x72 x72Var = (x72) this.n;
                x72Var.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    x72Var.b();
                    Unit unit = Unit.a;
                    Trace.endSection();
                    return Unit.a;
                } catch (Throwable th5) {
                    Trace.endSection();
                    throw th5;
                }
            default:
                l92 l92Var = (l92) this.n;
                ClassLoader classLoader = l92Var.b;
                gl0 gl0Var2 = l92Var.c;
                Enumeration<URL> resources = classLoader.getResources(BuildConfig.FLAVOR);
                resources.getClass();
                ArrayList list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size = list.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = list.get(i10);
                    i10++;
                    URL url = (URL) obj2;
                    url.getClass();
                    if (Intrinsics.b(url.getProtocol(), ShareInternalUtility.STAGING_PARAM)) {
                        String str = qz1.n;
                        pair2 = new Pair(gl0Var2, nm1.s(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList2.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList3 = new ArrayList();
                int size2 = list2.size();
                int i11 = 0;
                while (i11 < size2) {
                    int i12 = i11 + 1;
                    URL url2 = (URL) list2.get(i11);
                    url2.getClass();
                    String url3 = url2.toString();
                    url3.getClass();
                    if (tp2.o(url3, "jar:file:", z2) && (lastIndexOf = url3.lastIndexOf("!", url3.length() - i2)) != -1) {
                        String str2 = qz1.n;
                        qz1 s = nm1.s(new File(URI.create(url3.substring(4, lastIndexOf))));
                        d71 j = gl0Var2.j(s);
                        try {
                            long size3 = j.size();
                            long j2 = size3 - 22;
                            gl0 gl0Var3 = gl0Var2;
                            if (j2 < 0) {
                                throw new IOException("not a zip: size=" + j.size());
                            }
                            long max = Math.max(size3 - 65558, 0L);
                            long j3 = 0;
                            long j4 = j2;
                            while (true) {
                                p62 p62Var = new p62(j.b(j4));
                                try {
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                if (p62Var.m() == 101010256) {
                                    int o = p62Var.o() & 65535;
                                    int o2 = p62Var.o() & 65535;
                                    long j5 = j4;
                                    long o3 = p62Var.o() & 65535;
                                    d71 d71Var2 = j;
                                    if (o3 == (p62Var.o() & 65535) && o == 0 && o2 == 0) {
                                        try {
                                            p62Var.skip(4L);
                                            int o4 = p62Var.o() & 65535;
                                            ii0 ii0Var = new ii0(o3, p62Var.m() & 4294967295L, o4);
                                            p62Var.p(o4);
                                            try {
                                                p62Var.close();
                                                long j6 = j5 - 20;
                                                if (j6 > 0) {
                                                    d71Var = d71Var2;
                                                    try {
                                                        p62 p62Var2 = new p62(d71Var.b(j6));
                                                        try {
                                                            if (p62Var2.m() == 117853008) {
                                                                int m2 = p62Var2.m();
                                                                long n = p62Var2.n();
                                                                if (p62Var2.m() != 1 || m2 != 0) {
                                                                    throw new IOException("unsupported zip: spanned");
                                                                }
                                                                p62 p62Var3 = new p62(d71Var.b(n));
                                                                try {
                                                                    m = p62Var3.m();
                                                                } catch (Throwable th7) {
                                                                    th3 = th7;
                                                                }
                                                                if (m != 101075792) {
                                                                    throw new IOException("bad zip: expected " + yh2.j(101075792) + " but was " + yh2.j(m));
                                                                }
                                                                p62Var3.skip(12L);
                                                                int m3 = p62Var3.m();
                                                                int m4 = p62Var3.m();
                                                                long n2 = p62Var3.n();
                                                                if (n2 != p62Var3.n() || m3 != 0 || m4 != 0) {
                                                                    throw new IOException("unsupported zip: spanned");
                                                                }
                                                                p62Var3.skip(8L);
                                                                ii0 ii0Var2 = new ii0(n2, p62Var3.n(), o4);
                                                                try {
                                                                    Unit unit2 = Unit.a;
                                                                    try {
                                                                        p62Var3.close();
                                                                        th4 = null;
                                                                    } catch (Throwable th8) {
                                                                        th4 = th8;
                                                                    }
                                                                    ii0Var = ii0Var2;
                                                                } catch (Throwable th9) {
                                                                    th3 = th9;
                                                                    ii0Var = ii0Var2;
                                                                    try {
                                                                        p62Var3.close();
                                                                    } catch (Throwable th10) {
                                                                        wi0.a(th3, th10);
                                                                    }
                                                                    th4 = th3;
                                                                    if (th4 == null) {
                                                                    }
                                                                }
                                                                if (th4 == null) {
                                                                    throw th4;
                                                                }
                                                            }
                                                            Unit unit3 = Unit.a;
                                                            try {
                                                                p62Var2.close();
                                                                th2 = null;
                                                            } catch (Throwable th11) {
                                                                th2 = th11;
                                                            }
                                                        } catch (Throwable th12) {
                                                            try {
                                                                p62Var2.close();
                                                            } catch (Throwable th13) {
                                                                wi0.a(th12, th13);
                                                            }
                                                            th2 = th12;
                                                        }
                                                        if (th2 != null) {
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        Throwable th15 = th;
                                                        if (d71Var == null) {
                                                            throw th15;
                                                        }
                                                        try {
                                                            d71Var.close();
                                                            throw th15;
                                                        } catch (Throwable th16) {
                                                            wi0.a(th15, th16);
                                                            throw th15;
                                                        }
                                                    }
                                                } else {
                                                    d71Var = d71Var2;
                                                }
                                                ii0 ii0Var3 = ii0Var;
                                                ArrayList arrayList4 = new ArrayList();
                                                p62 p62Var4 = new p62(d71Var.b(ii0Var3.b));
                                                try {
                                                    long j7 = ii0Var3.a;
                                                    while (j3 < j7) {
                                                        o93 n3 = yh2.n(p62Var4);
                                                        i = i12;
                                                        long j8 = j7;
                                                        try {
                                                            if (n3.h >= ii0Var3.b) {
                                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                                                break;
                                                            } else {
                                                                qz1 qz1Var = l92.e;
                                                                if (nm1.i(n3.a)) {
                                                                    arrayList4.add(n3);
                                                                }
                                                                j3++;
                                                                i12 = i;
                                                                j7 = j8;
                                                            }
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                            Throwable th18 = th;
                                                            try {
                                                                p62Var4.close();
                                                            } catch (Throwable th19) {
                                                                wi0.a(th18, th19);
                                                            }
                                                            th = th18;
                                                            if (th == null) {
                                                            }
                                                        }
                                                    }
                                                    i = i12;
                                                    Unit unit4 = Unit.a;
                                                    try {
                                                        p62Var4.close();
                                                        th = null;
                                                    } catch (Throwable th20) {
                                                        th = th20;
                                                    }
                                                } catch (Throwable th21) {
                                                    th = th21;
                                                    i = i12;
                                                }
                                                if (th == null) {
                                                    throw th;
                                                }
                                                gl0Var = gl0Var3;
                                                p93 p93Var = new p93(s, gl0Var, yh2.e(arrayList4));
                                                try {
                                                    d71Var.close();
                                                } catch (Throwable unused) {
                                                }
                                                pair = new Pair(p93Var, l92.e);
                                            } catch (Throwable th22) {
                                                th = th22;
                                                d71Var = d71Var2;
                                            }
                                        } catch (Throwable th23) {
                                            th = th23;
                                        }
                                    } else {
                                        try {
                                            throw new IOException("unsupported zip: spanned");
                                        } catch (Throwable th24) {
                                            th = th24;
                                        }
                                    }
                                    p62Var.close();
                                    throw th;
                                }
                                long j9 = j4;
                                int i13 = i12;
                                d71 d71Var3 = j;
                                gl0 gl0Var4 = gl0Var3;
                                p62Var.close();
                                long j10 = j9 - 1;
                                if (j10 < max) {
                                    throw new IOException("not a zip: end of central directory signature not found");
                                }
                                j = d71Var3;
                                gl0Var3 = gl0Var4;
                                j4 = j10;
                                i12 = i13;
                            }
                        } catch (Throwable th25) {
                            th = th25;
                            d71Var = j;
                        }
                    } else {
                        gl0Var = gl0Var2;
                        i = i12;
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                    gl0Var2 = gl0Var;
                    i11 = i;
                    z2 = false;
                    i2 = 1;
                }
                return zv.E(arrayList2, arrayList3);
        }
    }
}
