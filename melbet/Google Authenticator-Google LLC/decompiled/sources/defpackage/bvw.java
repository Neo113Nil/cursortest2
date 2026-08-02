package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.main.CountdownIndicatorView;
import com.google.android.apps.authenticator2.main.OtpView;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvw {
    public static bvw d;
    public final Object a;
    public final Object b;
    public final Object c;

    private bvw(Context context) {
        int i = 1;
        this.c = hoq.v(new csm(i));
        this.b = new AtomicLong(-1L);
        this.a = hoq.v(new dxi(context, new crh("auth:gau"), i));
    }

    public static ImageView a(OtpView otpView) {
        return (ImageView) otpView.findViewById(R.id.hotp_refresh_button);
    }

    public static CountdownIndicatorView b(OtpView otpView) {
        return (CountdownIndicatorView) otpView.findViewById(R.id.countdown_icon);
    }

    public static bvw h(Context context) {
        etd.e(context);
        return new bvw(context);
    }

    public final boolean c(Class cls, Class cls2) {
        return ((Class) this.c).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cet, java.lang.Object] */
    public final cfz d(ccl cclVar, ccp ccpVar) {
        ?? r0 = this.a;
        if (r0.contains(cclVar)) {
            return new cfz((ces) this.b, cclVar, ccpVar, (cet) this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cclVar, r0));
    }

    public final hvi e() {
        hvi d2 = f().d();
        d2.getClass();
        return d2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, koi] */
    public final fcu f() {
        Object a = this.c.a();
        a.getClass();
        return (fcu) a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r4 > 1800000) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [hac, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void g(int i, int i2, long j, long j2, long j3) {
        ?? r0 = this.c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (new Random().nextFloat() <= ((Double) r0.bB()).doubleValue()) {
            Object obj = this.b;
            if (((AtomicLong) obj).get() != -1) {
                long j4 = elapsedRealtime - ((AtomicLong) obj).get();
                TimeUnit timeUnit = TimeUnit.MINUTES;
            }
            ((crv) this.a.bB()).a(new crg(0, Arrays.asList(new cqy(i, i2, 0, j, j2, null, null, 0, (int) (SystemClock.elapsedRealtime() - j3))))).m(new jec(this, elapsedRealtime, 1));
        }
    }

    public final boolean i(Class cls) {
        return ((Class) this.a).isAssignableFrom(cls);
    }

    public final String j() {
        String uuid = ((UUID) this.a).toString();
        uuid.getClass();
        return uuid;
    }

    public final void k(Menu menu, MenuInflater menuInflater) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((by) ((kee) it.next()).a).R(menu, menuInflater);
        }
    }

    public final void l(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((by) ((kee) it.next()).a).T(menu);
        }
    }

    public final boolean m(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            if (((by) ((kee) it.next()).a).S(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void n(se seVar) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = seVar.aJ.size();
        for (int i = 0; i < size; i++) {
            sd sdVar = (sd) seVar.aJ.get(i);
            if (sdVar.O() == 3 || sdVar.P() == 3) {
                arrayList.add(sdVar);
            }
        }
        seVar.c();
    }

    public final boolean o(te teVar, sd sdVar, int i) {
        sm smVar = (sm) this.a;
        smVar.i = sdVar.O();
        smVar.j = sdVar.P();
        smVar.a = sdVar.j();
        smVar.b = sdVar.h();
        smVar.g = false;
        smVar.h = i;
        int i2 = smVar.i;
        int i3 = smVar.j;
        boolean z = i2 == 3 && sdVar.Y > 0.0f;
        boolean z2 = i3 == 3 && sdVar.Y > 0.0f;
        if (z && sdVar.v[0] == 4) {
            smVar.i = 1;
        }
        if (z2 && sdVar.v[1] == 4) {
            smVar.j = 1;
        }
        teVar.a(sdVar, smVar);
        sdVar.E(smVar.c);
        sdVar.z(smVar.d);
        sdVar.G = smVar.f;
        sdVar.w(smVar.e);
        smVar.h = 0;
        return smVar.g;
    }

    public final void p(se seVar, int i, int i2, int i3) {
        int i4 = seVar.ad;
        int i5 = seVar.ae;
        seVar.D(0);
        seVar.C(0);
        seVar.E(i2);
        seVar.z(i3);
        seVar.D(i4);
        seVar.C(i5);
        Object obj = this.c;
        ((se) obj).b = i;
        ((sl) obj).W();
    }

    public final Location q(String str) {
        try {
            Object obj = this.b;
            if (((LocationManager) obj).isProviderEnabled(str)) {
                return ((LocationManager) obj).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public bvw(Context context, cgw cgwVar, cgw cgwVar2) {
        this.b = context;
        this.a = cgwVar;
        this.c = cgwVar2;
    }

    public bvw(Context context, fym fymVar) {
        this.b = context;
        this.a = fymVar;
        this.c = new kop(new aux(this, 6));
    }

    public bvw(cou couVar, kee keeVar, Runnable runnable, byte[] bArr) {
        this.c = couVar;
        this.a = keeVar;
        this.b = runnable;
    }

    public bvw(Class cls, Class cls2, bgf bgfVar) {
        this.a = cls;
        this.b = cls2;
        this.c = bgfVar;
    }

    public bvw(Class cls, Class cls2, bjs bjsVar) {
        this.c = cls;
        this.b = cls2;
        this.a = bjsVar;
    }

    public bvw(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public bvw(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public bvw(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
    }

    public bvw(Cipher cipher) {
        this.b = cipher;
        this.a = null;
        this.c = null;
    }

    public bvw(Mac mac) {
        this.c = mac;
        this.b = null;
        this.a = null;
    }

    public bvw(Context context, LocationManager locationManager) {
        this.c = new eh();
        this.a = context;
        this.b = locationManager;
    }

    public bvw(bbh bbhVar, bbu bbuVar) {
        List list = Collections.EMPTY_LIST;
        a.v(bbhVar, "Argument must not be null");
        this.c = bbhVar;
        a.v(list, "Argument must not be null");
        this.a = list;
        this.b = bbuVar;
    }

    public bvw(se seVar) {
        this.b = new ArrayList();
        this.a = new sm();
        this.c = seVar;
    }

    public bvw(Runnable runnable) {
        this.b = new CopyOnWriteArrayList();
        this.a = new HashMap();
        this.c = runnable;
    }

    public bvw(asr asrVar) {
        this(asrVar.b, asrVar.c, asrVar.d);
    }

    public bvw(UUID uuid, axt axtVar, Set set) {
        uuid.getClass();
        axtVar.getClass();
        this.a = uuid;
        this.b = axtVar;
        this.c = set;
    }
}
