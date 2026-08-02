package defpackage;

import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.TextViewContainer;
import j$.time.Instant;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Adler32;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyi {
    public final Object a;
    public final Object b;
    public final Object c;

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public iyi(List list) {
        List<fbx> list2 = Collections.EMPTY_LIST;
        List list3 = Collections.EMPTY_LIST;
        this.b = new HashMap();
        this.a = new HashMap();
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fbs fbsVar = (fbs) it.next();
            if (TextUtils.isEmpty(fbsVar.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                fbs fbsVar2 = (fbs) this.b.put(fbsVar.e(), fbsVar);
                if (fbsVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + fbsVar2.getClass().getCanonicalName() + " with " + fbsVar.getClass().getCanonicalName());
                }
            }
        }
        for (fbx fbxVar : list2) {
            if (TextUtils.isEmpty(fbxVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                fbx fbxVar2 = (fbx) this.a.put(fbxVar.a(), fbxVar);
                if (fbxVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + fbxVar2.getClass().getCanonicalName() + " with " + fbxVar.getClass().getCanonicalName());
                }
            }
        }
        this.c.addAll(list3);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    private final fym C(Uri uri) {
        int i = hel.d;
        heg hegVar = new heg(4);
        Pattern pattern = fbm.a;
        heg hegVar2 = new heg(4);
        String encodedFragment = uri.getEncodedFragment();
        hel n = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? his.a : hel.n(gzz.b("+".charAt(0)).a().c(encodedFragment.substring(10)));
        int size = n.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) n.get(i2);
            Matcher matcher = fbm.a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            hegVar2.h(matcher.group(1));
        }
        hel g = hegVar2.g();
        int i3 = ((his) g).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) g.get(i4);
            fbx fbxVar = (fbx) this.a.get(str2);
            if (fbxVar == null) {
                throw new fbg("Requested transform isn't registered: " + str2 + ": " + String.valueOf(uri));
            }
            hegVar.h(fbxVar);
        }
        hel a = hegVar.g().a();
        hwm hwmVar = new hwm(null);
        hwmVar.c = this;
        String scheme = uri.getScheme();
        fbs fbsVar = (fbs) this.b.get(scheme);
        if (fbsVar == null) {
            throw new fbg(String.format("Requested backend isn't registered: %s", scheme));
        }
        hwmVar.e = fbsVar;
        hwmVar.a = this.c;
        hwmVar.d = a;
        hwmVar.b = uri;
        if (!a.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = a.listIterator(a.size());
                while (listIterator.hasPrevious()) {
                    str3 = ((fbx) listIterator.previous()).b();
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        hwmVar.f = uri;
        return new fym(hwmVar);
    }

    public static /* synthetic */ fuf j(fxf fxfVar) {
        frv a = frv.a(fxfVar.c);
        ful fulVar = fxfVar.d;
        if (fulVar == null) {
            fulVar = ful.a;
        }
        int x = a.x(fxfVar.e);
        if (x == 0) {
            x = 1;
        }
        return new fuf(a, fulVar, x);
    }

    public static /* synthetic */ void k(hvw hvwVar, AccountManagerFuture accountManagerFuture) {
        try {
            hoq.H(accountManagerFuture.isDone());
            hvwVar.o(accountManagerFuture.getResult());
        } catch (AuthenticatorException e) {
            e = e;
            hvwVar.p(e);
        } catch (OperationCanceledException e2) {
            e = e2;
            hvwVar.p(e);
        } catch (IOException e3) {
            e = e3;
            hvwVar.p(e);
        } catch (Throwable th) {
            hvwVar.p(th);
        }
    }

    public final boolean A(Class cls, Class cls2) {
        return ((Class) this.a).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.c);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, koe] */
    public final bst B(String str, iwq iwqVar) {
        Context b = ((jrk) this.c).b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.b();
        scheduledExecutorService.getClass();
        bst bstVar = (bst) this.b.b();
        bstVar.getClass();
        cbc cbcVar = new cbc(str, 15);
        iwqVar.getClass();
        return new bst(new fdl(b, scheduledExecutorService, bstVar, cbcVar, iwqVar));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ibg, java.lang.Object] */
    public final byte[] a(Object obj) {
        ibw ibwVar;
        ibg ibgVar;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ibwVar = new ibw(byteArrayOutputStream, this.b, this.a, this.c);
            ibgVar = (ibg) ibwVar.c.get(obj.getClass());
        } catch (IOException unused) {
        }
        if (ibgVar == null) {
            throw new ibe("No encoder for ".concat(String.valueOf(String.valueOf(obj.getClass()))));
        }
        ibgVar.a(obj, ibwVar);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final boolean b() {
        return this.a.isEmpty();
    }

    public final IllegalArgumentException c() {
        Object obj = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        return new IllegalArgumentException("Multiple entries with same key: " + obj3.toString() + "=" + obj2.toString() + " and " + obj3.toString() + "=" + obj.toString());
    }

    public final File d() {
        return new File(((gpj) this.b).b((gpk) this.c), (String) this.a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [etp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final hvi e(String str, frv frvVar, ful fulVar, boolean z) {
        iee o = ((ggq) hnu.bq((Context) this.c, ggq.class, frvVar)).o();
        String d = ((cfe) this.b).d(fulVar);
        guc gucVar = gub.a;
        gty aB = hoq.aB(180, "Fetching experiments for account", gucVar, true);
        try {
            aB = hoq.aB(181, "PhenotypeApi.getConfigurationSnapshot", gucVar, true);
            try {
                hvi c = o.b.c(str, d);
                if (z) {
                    c = gwd.a(c, 25L, TimeUnit.SECONDS, o.f);
                }
                aB.b(c);
                byte[] bArr = null;
                ixf.j(aB, null);
                hvi au = hoq.au(c, gvx.c(new gja(o, str, 0, bArr)), huf.a);
                ixf.j(aB, null);
                hvi d2 = ((etd) o.d).f.d(false);
                gia giaVar = new gia(new ghz(5), 7);
                huf hufVar = huf.a;
                return hti.f(hnu.bx(ixc.D(new hvi[]{hoq.ao(d2, cnf.class, giaVar, hufVar), au})), gvx.a(new gia(au, 9)), hufVar);
            } finally {
            }
        } finally {
        }
    }

    public final hvi f(hvi hviVar, htr htrVar) {
        Set set = (Set) ((jrx) this.a).a;
        hfk i = hfm.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i.c(new gjk(htrVar, (gbv) it.next(), 1));
        }
        return ((cka) this.b).m(new fxs(hviVar, 2), i.g());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, jsb] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, jsb] */
    public final gau g(Class cls) {
        gau gauVar;
        cls.getClass();
        synchronized (this.c) {
            ?? r1 = this.a;
            Object obj = r1.get(cls);
            if (obj == null) {
                Object obj2 = ((cbp) this.b).a;
                Context b = ((jrk) ((iwq) obj2).d).b();
                gau gauVar2 = new gau(b, (hvm) ((iwq) obj2).b.b(), ((gaq) ((iwq) obj2).a).b());
                r1.put(cls, gauVar2);
                obj = gauVar2;
            }
            gauVar = (gau) obj;
        }
        return gauVar;
    }

    public final hvi h() {
        hvi d = ((fcu) this.a).d();
        return d.isDone() ? d : new fwk(this, d);
    }

    public final hvi i(gzf gzfVar, Executor executor) {
        return new fwk(this, ((fcu) this.a).a(gzfVar, new fwo(this, executor, 1)));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Set] */
    public final void l(ful fulVar) {
        hoq.H(!fulVar.equals(ful.a));
        hoq.H((fulVar.b & 256) != 0);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ftm) it.next()).d();
        }
        ?? r2 = this.a;
        int size = r2.size();
        for (int i = 0; i < size; i++) {
            ((ftm) r2.get(i)).d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void m() {
        gty aC = hoq.aC(83, "onBeforeActivityAccountReady");
        try {
            for (ftm ftmVar : this.c) {
                if (ftmVar instanceof ftn) {
                    ((ftn) ftmVar).g();
                }
            }
            Iterator it = ((ArrayList) this.a).iterator();
            while (it.hasNext()) {
                ftm ftmVar2 = (ftm) it.next();
                if (ftmVar2 instanceof ftn) {
                    ((ftn) ftmVar2).g();
                }
            }
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void n() {
        gty aC = hoq.aC(84, "onBeforeNoAccountAvailable");
        try {
            for (ftm ftmVar : this.c) {
                if (ftmVar instanceof ftn) {
                    ((ftn) ftmVar).f();
                }
            }
            Iterator it = ((ArrayList) this.a).iterator();
            while (it.hasNext()) {
                ftm ftmVar2 = (ftm) it.next();
                if (ftmVar2 instanceof ftn) {
                    ((ftn) ftmVar2).f();
                }
            }
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void o() {
        gty aC = hoq.aC(85, "onBeforeAccountLoading");
        try {
            for (ftm ftmVar : this.c) {
                if (ftmVar instanceof ftn) {
                    ((ftn) ftmVar).a();
                }
            }
            Iterator it = ((ArrayList) this.a).iterator();
            while (it.hasNext()) {
                ftm ftmVar2 = (ftm) it.next();
                if (ftmVar2 instanceof ftn) {
                    ((ftn) ftmVar2).a();
                }
            }
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fke, java.lang.Object] */
    public final void p(boolean z) {
        Object obj = this.c;
        if (obj != null) {
            ((fkf) obj).b(this.b, (View) this.a, z);
        }
    }

    public final void q() {
        Object obj = this.c;
        if (obj != null) {
            ((fkf) obj).c((View) this.a);
        }
    }

    public final Object r(Uri uri, far farVar) {
        return farVar.a(C(uri));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fbs, java.lang.Object] */
    public final void s(Uri uri) {
        fym C = C(uri);
        C.c.f((Uri) C.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fbs, java.lang.Object] */
    public final void t(Uri uri, Uri uri2) {
        fym C = C(uri);
        ?? r0 = C.c;
        fym C2 = C(uri2);
        if (r0 != C2.c) {
            throw new fbg("Cannot rename file across backends");
        }
        r0.g((Uri) C.a, (Uri) C2.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fbs, java.lang.Object] */
    public final boolean u(Uri uri) {
        fym C = C(uri);
        return C.c.h((Uri) C.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [hac, java.lang.Object] */
    public final File v() {
        return new File(((String) this.c.bB()) + "/" + ((String) this.a.bB()) + ".pb");
    }

    public final boolean w(hac hacVar) {
        if (((gjf) this.a).a().booleanValue()) {
            return ((ekv) this.c).c.a == 2;
        }
        return elh.d((Context) this.b, (eli) hacVar.bB());
    }

    public final void x(ces cesVar, int i, boolean z) {
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = cesVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        ccn ccnVar = cesVar.c;
        adler32.update(allocate.putInt(cgy.a(ccnVar)).array());
        byte[] bArr = cesVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        return;
                    }
                }
            }
        }
        cgp cgpVar = (cgp) this.a;
        long longValue = ((Long) cgp.g(cgpVar.c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(cgy.a(ccnVar))}), new cgg(6))).longValue();
        boolean z2 = z && cgpVar.l(cesVar);
        Object obj = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        cfr cfrVar = (cfr) obj;
        builder.setMinimumLatency(cfrVar.a(ccnVar, longValue, i, z2));
        Set set = ((cfp) cfrVar.a.get(ccnVar)).c;
        if (set.contains(cfq.a)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(cfq.c)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(cfq.b)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", str);
        persistableBundle.putInt("priority", cgy.a(ccnVar));
        if (bArr != null) {
            persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
        }
        builder.setExtras(persistableBundle);
        cfrVar.a(ccnVar, longValue, i, z2);
        jobScheduler.schedule(builder.build());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [cgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [cgw, java.lang.Object] */
    public final synchronized cfb y(String str) {
        ?? r0 = this.a;
        if (r0.containsKey(str)) {
            return (cfb) r0.get(str);
        }
        cew e = ((dze) this.c).e(str);
        if (e == null) {
            return null;
        }
        Object obj = this.b;
        ?? r4 = ((bvw) obj).c;
        cfb create = e.create(new cez((Context) ((bvw) obj).b, ((bvw) obj).a, r4, str));
        r0.put(str, create);
        return create;
    }

    public final hvi z(bxe bxeVar) {
        return ((bxf) hnu.bq((Context) this.b, bxf.class, (frv) this.c)).n().a(new bpf(bxeVar, 16), huf.a);
    }

    public iyi(Context context, kvm kvmVar) {
        this.c = context;
        this.b = kvmVar;
        this.a = new fwm(context, (byte[]) null);
    }

    public iyi(bry bryVar, koe koeVar, koe koeVar2) {
        this.b = bryVar;
        this.a = koeVar;
        this.c = koeVar2;
    }

    public iyi(cbp cbpVar, fwm fwmVar, fug fugVar) {
        this.a = cbpVar;
        this.c = fwmVar;
        this.b = fugVar;
    }

    public iyi(gpk gpkVar, gpj gpjVar, String str) {
        this.c = gpkVar;
        this.b = gpjVar;
        this.a = str;
    }

    public iyi(iyh iyhVar) {
        this.a = iyhVar.a;
        this.b = iyhVar.b;
        this.c = iyhVar.c;
    }

    public iyi(Class cls, Class cls2, bbn bbnVar) {
        this.a = cls;
        this.c = cls2;
        this.b = bbnVar;
    }

    public iyi(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public iyi(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public iyi(Object obj, Object obj2, Object obj3, char[] cArr) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public iyi(Object obj, Object obj2, Object obj3, int[] iArr) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public iyi(Object obj, Object obj2, Object obj3, short[] sArr) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public iyi(Object obj, Object obj2, Object obj3, boolean[] zArr) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public iyi(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, byte[] bArr) {
        this.c = jsbVar;
        this.a = jsbVar2;
        this.b = jsbVar3;
    }

    public iyi(Context context, bvw bvwVar) {
        dze dzeVar = new dze(context);
        this.a = new HashMap();
        this.c = dzeVar;
        this.b = bvwVar;
    }

    public iyi(Resources resources, dtd dtdVar, boolean z) {
        this.c = resources;
        this.b = dtdVar;
        this.a = new bse(resources, z);
    }

    public iyi(TextView textView, TextViewContainer textViewContainer) {
        this.b = textView;
        this.c = textViewContainer;
        this.a = textViewContainer != null ? textViewContainer.a(textView) : null;
    }

    public iyi(cbp cbpVar) {
        cbpVar.getClass();
        this.b = cbpVar;
        this.c = new Object();
        this.a = new LinkedHashMap();
    }

    public iyi(iah iahVar) {
        this.b = new HashSet();
        this.a = new HashSet();
        this.c = iahVar;
    }

    public iyi(jjq jjqVar, String str, String str2) {
        this.b = hpx.e;
        this.c = hoq.v(new dxi(this, jjqVar, 13));
        this.a = hoq.v(new ewj(this, str, str2, 1));
    }

    public iyi(String str, Instant instant, Instant instant2) {
        this.a = str;
        instant.getClass();
        this.c = instant;
        this.b = instant2;
    }

    public iyi(jpt jptVar, cfe cfeVar, Context context) {
        jptVar.getClass();
        this.a = jptVar;
        this.b = cfeVar;
        this.c = context;
    }

    public iyi() {
        int i = hel.d;
        this.c = new heg(4);
        this.b = new heg(4);
        this.a = "DEFAULT";
    }

    public iyi(String str, hvi hviVar, jjq jjqVar) {
        str.getClass();
        this.a = str;
        this.c = hviVar;
        this.b = jjqVar;
    }

    public iyi(AccountManager accountManager, Executor executor, gbg gbgVar) {
        this.a = accountManager;
        this.b = gbgVar;
        this.c = executor;
    }

    public iyi(cji cjiVar, String str) {
        this.c = new CopyOnWriteArrayList();
        if (str.startsWith("STREAMZ_")) {
            this.a = cjiVar;
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iyi(View view) {
        fke fkeVar = (fke) view;
        this.c = Build.VERSION.SDK_INT >= 34 ? new fkh() : Build.VERSION.SDK_INT >= 33 ? new fkf() : null;
        this.b = fkeVar;
        this.a = view;
    }

    public iyi(Set set) {
        this.b = new Random();
        this.c = set;
        this.a = new ArrayList(2);
    }
}
