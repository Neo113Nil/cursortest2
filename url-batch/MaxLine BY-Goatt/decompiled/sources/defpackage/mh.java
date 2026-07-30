package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.majelw.libystne.R;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mh implements mt1, s21, vr1, ek0 {
    public static volatile mh q;
    public static final Object r = new Object();
    public static mh s;
    public final /* synthetic */ int m;
    public Object n;
    public Object o;
    public Object p;

    public mh(int i) {
        this.m = i;
        int i2 = 3;
        switch (i) {
            case 2:
                this.n = new yg1(16);
                long[] jArr = oe2.a;
                this.o = new tn1();
                this.p = new dq2(i2);
                break;
            case 9:
                this.n = new ar0(22);
                this.o = new ar0(22);
                this.p = new ar0(22);
                break;
            case 23:
                this.n = new AtomicReference(yk3.u);
                this.o = new Object();
                break;
            case 29:
                this.n = new WeakHashMap();
                this.o = new WeakHashMap();
                this.p = new WeakHashMap();
                break;
            default:
                this.p = new dq2(i2);
                break;
        }
    }

    public static final void g(mh mhVar, Network network, boolean z) {
        boolean z2;
        Network[] allNetworks = ((ConnectivityManager) mhVar.n).getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.b(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) mhVar.n).getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        fs2 fs2Var = (fs2) mhVar.o;
        synchronized (fs2Var) {
            try {
                if (((b72) fs2Var.m.get()) != null) {
                    fs2Var.q = z3;
                } else {
                    fs2Var.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean k(Editable editable, KeyEvent keyEvent, boolean z) {
        f13[] f13VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (f13VarArr = (f13[]) editable.getSpans(selectionStart, selectionEnd, f13.class)) != null && f13VarArr.length > 0) {
                for (f13 f13Var : f13VarArr) {
                    int spanStart = editable.getSpanStart(f13Var);
                    int spanEnd = editable.getSpanEnd(f13Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static mh t(Context context) {
        if (q == null) {
            synchronized (r) {
                try {
                    if (q == null) {
                        q = new mh(context, 0);
                    }
                } finally {
                }
            }
        }
        return q;
    }

    public static mh z(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new mh(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public Object A(CharSequence charSequence, int i, int i2, int i3, boolean z, lg0 lg0Var) {
        int i4;
        char c;
        og0 og0Var = new og0((ml1) ((js0) this.o).o);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = og0Var.c.a;
                ml1 ml1Var = sparseArray == null ? null : (ml1) sparseArray.get(codePointAt);
                if (og0Var.a == 2) {
                    if (ml1Var != null) {
                        og0Var.c = ml1Var;
                        og0Var.f++;
                    } else {
                        if (codePointAt == 65038) {
                            og0Var.a();
                        } else if (codePointAt != 65039) {
                            ml1 ml1Var2 = og0Var.c;
                            if (ml1Var2.b != null) {
                                if (og0Var.f != 1) {
                                    og0Var.d = ml1Var2;
                                    og0Var.a();
                                } else if (og0Var.b()) {
                                    og0Var.d = og0Var.c;
                                    og0Var.a();
                                } else {
                                    og0Var.a();
                                }
                                c = 3;
                            } else {
                                og0Var.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (ml1Var == null) {
                    og0Var.a();
                    c = 1;
                } else {
                    og0Var.a = 2;
                    og0Var.c = ml1Var;
                    og0Var.f = 1;
                    c = 2;
                }
                og0Var.e = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !w(charSequence, i4, i6, og0Var.d.b)) {
                        z2 = lg0Var.d(charSequence, i4, i6, og0Var.d.b);
                        i5++;
                    }
                }
            }
        }
        if (og0Var.a == 2 && og0Var.c.b != null && ((og0Var.f > 1 || og0Var.b()) && i5 < i3 && z2 && (z || !w(charSequence, i4, i6, og0Var.c.b)))) {
            lg0Var.d(charSequence, i4, i6, og0Var.c.b);
        }
        return lg0Var.a();
    }

    public void B() {
        ((TypedArray) this.n).recycle();
    }

    public void C(gm gmVar, int i, boolean z) {
        em emVar = (em) this.o;
        Context context = (Context) this.p;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = gmVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        y42 y42Var = gmVar.c;
        adler32.update(allocate.putInt(z42.a(y42Var)).array());
        byte[] bArr = gmVar.b;
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
                        s93.C("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", gmVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((tc2) this.n).b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(z42.a(y42Var))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(emVar.a(y42Var, longValue, i));
            Set set = ((fm) emVar.b.get(y42Var)).c;
            if (set.contains(re2.m)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(re2.o)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(re2.n)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", z42.a(y42Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {gmVar, Integer.valueOf(value), Long.valueOf(emVar.a(y42Var, longValue, i)), valueOf, Integer.valueOf(i)};
            String G = s93.G("JobInfoScheduler");
            if (Log.isLoggable(G, 3)) {
                Log.d(G, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void D(vl vlVar) {
        ch2 ch2Var = new ch2(8);
        pz2 pz2Var = (pz2) this.p;
        gm gmVar = (gm) this.n;
        kh0 kh0Var = (kh0) this.o;
        u80 u80Var = pz2Var.c;
        mh a = gm.a();
        a.F(gmVar.a);
        a.p = y42.m;
        a.o = gmVar.b;
        gm i = a.i();
        sf sfVar = new sf();
        sfVar.f = new HashMap();
        sfVar.d = Long.valueOf(pz2Var.a.h());
        sfVar.e = Long.valueOf(pz2Var.b.h());
        sfVar.a = Constants.FirelogAnalytics.FCM_LOG_SOURCE;
        sfVar.c = new hh0(kh0Var, ((MessagingClientEventExtension) vlVar.a).toByteArray());
        sfVar.b = null;
        u80Var.b.execute(new s50(u80Var, i, ch2Var, sfVar.e()));
    }

    public void E(Object obj) {
        long c = ij2.c();
        if (c == ix2.a) {
            this.p = obj;
            return;
        }
        synchronized (this.o) {
            ex2 ex2Var = (ex2) ((AtomicReference) this.n).get();
            int a = ex2Var.a(c);
            if (a >= 0) {
                ex2Var.c[a] = obj;
            } else {
                ((AtomicReference) this.n).set(ex2Var.b(c, obj));
                Unit unit = Unit.a;
            }
        }
    }

    public void F(String str) {
        if (str != null) {
            this.n = str;
        } else {
            ch2.l("Null backendName");
        }
    }

    public void G(ls lsVar) {
        ((ns) this.p).m.c = lsVar;
    }

    public void H(ca0 ca0Var) {
        ((ns) this.p).m.a = ca0Var;
    }

    public void I(u81 u81Var) {
        ((ns) this.p).m.b = u81Var;
    }

    public void J(long j) {
        ((ns) this.p).m.d = j;
    }

    public void K() {
        tn1 tn1Var = (tn1) this.n;
        String str = (String) this.o;
        List list = (List) tn1Var.k(str);
        if (list != null) {
            list.remove((Function0) this.p);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        tn1Var.m(str, list);
    }

    @Override // defpackage.s21
    public ClipDescription a() {
        return (ClipDescription) this.o;
    }

    @Override // defpackage.s21
    public Object b() {
        return null;
    }

    @Override // defpackage.vr1
    public boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.n;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.s21
    public Uri d() {
        return (Uri) this.n;
    }

    @Override // defpackage.s21
    public Uri f() {
        return (Uri) this.p;
    }

    @Override // defpackage.w52
    public Object get() {
        switch (this.m) {
            case 22:
                return new mh((Context) ((w52) this.n).get(), ((w52) this.o).get(), ((nm1) this.p).get(), 14);
            case 23:
                long c = ij2.c();
                if (c == ix2.a) {
                    return this.p;
                }
                ex2 ex2Var = (ex2) ((AtomicReference) this.n).get();
                int a = ex2Var.a(c);
                if (a >= 0) {
                    return ex2Var.c[a];
                }
                return null;
            default:
                return new pz2(new dq2(15), new dq2(9), (u80) ((fy) this.n).get(), (f33) ((oy2) this.o).get(), (js0) ((js0) this.p).get());
        }
    }

    public void h(i91 i91Var, w41 w41Var) {
        ar0 ar0Var = (ar0) this.n;
        ar0 ar0Var2 = (ar0) this.o;
        ar0 ar0Var3 = (ar0) this.p;
        int ordinal = w41Var.ordinal();
        if (ordinal == 0) {
            ar0Var.p(i91Var);
            ar0Var3.p(i91Var);
            return;
        }
        if (ordinal == 1) {
            ar0Var2.p(i91Var);
            ar0Var3.p(i91Var);
            return;
        }
        if (ordinal == 2) {
            if (i91Var.s != null) {
                ar0Var3.p(i91Var);
                return;
            } else {
                ar0Var.p(i91Var);
                return;
            }
        }
        if (ordinal != 3) {
            a.b();
        } else if (i91Var.s != null) {
            ar0Var3.p(i91Var);
        } else {
            ar0Var2.p(i91Var);
        }
    }

    public gm i() {
        String str = ((String) this.n) == null ? " backendName" : BuildConfig.FLAVOR;
        if (((y42) this.p) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new gm((String) this.n, (byte[]) this.o, (y42) this.p);
        }
        lh.g("Missing required properties:".concat(str));
        return null;
    }

    public boolean j(i91 i91Var) {
        return !(i91Var.s == null) && (((on2) ((ar0) this.n).n).contains(i91Var) || ((on2) ((ar0) this.o).n).contains(i91Var));
    }

    public void l(Bundle bundle) {
        HashSet hashSet = (HashSet) this.o;
        String string = ((Context) this.p).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (g21.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new hx(e);
            }
        }
    }

    public Object m(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.n;
        if (ak2.j()) {
            try {
                ak2.f(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                g21 g21Var = (g21) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = g21Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            m(cls2, hashSet);
                        }
                    }
                }
                obj = g21Var.b((Context) this.p);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new hx(th);
            }
        }
        return obj;
    }

    @Override // defpackage.mt1
    public Object n() {
        try {
            return ((ti2) this.n).i((Class) this.o);
        } catch (Exception e) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + ((Type) this.p) + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
        }
    }

    public ls o() {
        return ((ns) this.p).m.c;
    }

    public ColorStateList p(int i) {
        int resourceId;
        ColorStateList D;
        TypedArray typedArray = (TypedArray) this.n;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (D = j8.D((Context) this.p, resourceId)) == null) ? typedArray.getColorStateList(i) : D;
    }

    public Drawable q(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.n;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : j8.F((Context) this.p, resourceId);
    }

    public Drawable r(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.n).hasValue(i) || (resourceId = ((TypedArray) this.n).getResourceId(i, 0)) == 0) {
            return null;
        }
        tf a = tf.a();
        Context context = (Context) this.p;
        synchronized (a) {
            d = a.a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface s(int i, int i2, sg sgVar) {
        int resourceId = ((TypedArray) this.n).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.o) == null) {
            this.o = new TypedValue();
        }
        Context context = (Context) this.p;
        TypedValue typedValue = (TypedValue) this.o;
        ThreadLocal threadLocal = t92.a;
        if (context.isRestricted()) {
            return null;
        }
        return t92.a(context, resourceId, typedValue, i2, sgVar, true);
    }

    @Override // defpackage.vr1
    public void shutdown() {
        ((ConnectivityManager) this.n).unregisterNetworkCallback((f72) this.p);
    }

    public String toString() {
        switch (this.m) {
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.n);
                sb.append('{');
                t21 t21Var = (t21) ((t21) this.o).o;
                String str = BuildConfig.FLAVOR;
                while (t21Var != null) {
                    Object obj = t21Var.n;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    t21Var = (t21) t21Var.o;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 18:
                String str2 = (String) this.p;
                String str3 = (String) this.o;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.n;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str3 != null) {
                    sb2.append(" action=");
                    sb2.append(str3);
                }
                if (str2 != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str2);
                }
                sb2.append(" }");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public f81 u() {
        f81 f81Var = (f81) this.o;
        if (f81Var != null) {
            return f81Var;
        }
        Intrinsics.f("keyboardActions");
        throw null;
    }

    public long v() {
        return ((ns) this.p).m.d;
    }

    public boolean w(CharSequence charSequence, int i, int i2, e13 e13Var) {
        if ((e13Var.c & 3) == 0) {
            d80 d80Var = (d80) this.p;
            kl1 b = e13Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.p).getShort(a + b.m);
            }
            d80Var.getClass();
            ThreadLocal threadLocal = d80.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = d80Var.a.hasGlyph(sb.toString());
            int i3 = e13Var.c & 4;
            e13Var.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (e13Var.c & 3) == 2;
    }

    public boolean x() {
        return !(((on2) ((ar0) this.n).n).isEmpty() && ((on2) ((ar0) this.p).n).isEmpty() && ((on2) ((ar0) this.o).n).isEmpty());
    }

    public boolean y() {
        if (((so2) this.n).getValue() != this.p) {
            return true;
        }
        mh mhVar = (mh) this.o;
        return mhVar != null && mhVar.y();
    }

    @Override // defpackage.s21
    public void e() {
    }

    public /* synthetic */ mh(Context context, Object obj, Object obj2, int i) {
        this.m = i;
        this.p = context;
        this.n = obj;
        this.o = obj2;
    }

    public /* synthetic */ mh(Object obj, Object obj2, Object obj3, int i) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }

    public mh(gm gmVar, kh0 kh0Var, b71 b71Var, pz2 pz2Var) {
        this.m = 25;
        this.n = gmVar;
        this.o = kh0Var;
        this.p = pz2Var;
    }

    public mh(kn2 kn2Var) {
        this.m = 15;
        this.n = kn2Var;
    }

    public /* synthetic */ mh(int i, boolean z) {
        this.m = i;
    }

    public mh(Intent intent) {
        this.m = 18;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.n = data;
        this.o = action;
        this.p = type;
    }

    public mh(View view) {
        this.m = 13;
        this.n = view;
        this.o = ya1.a(kc1.m, new u(12, this));
        at0 at0Var = new at0();
        if (Build.VERSION.SDK_INT >= 30) {
            mn2 mn2Var = new mn2(view);
            mn2Var.n = view;
            at0Var.m = mn2Var;
        } else {
            at0Var.m = new at0(view);
        }
        this.p = at0Var;
    }

    public mh(ns nsVar) {
        this.m = 4;
        this.p = nsVar;
        this.n = new ar0(11, this);
    }

    public mh(Context context, TypedArray typedArray) {
        this.m = 24;
        this.p = context;
        this.n = typedArray;
    }

    public mh(Context context, LocationManager locationManager) {
        this.m = 27;
        this.o = new j03();
        this.p = context;
        this.n = locationManager;
    }

    public mh(ConnectivityManager connectivityManager, fs2 fs2Var) {
        this.m = 20;
        this.n = connectivityManager;
        this.o = fs2Var;
        f72 f72Var = new f72(this);
        this.p = f72Var;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), f72Var);
    }

    public mh(Context context, int i) {
        this.m = i;
        switch (i) {
            case 11:
                this.p = context.getApplicationContext();
                this.n = k.a;
                this.o = new p01();
                break;
            default:
                this.p = context.getApplicationContext();
                this.o = new HashSet();
                this.n = new HashMap();
                break;
        }
    }

    public mh(js0 js0Var, u30 u30Var, d80 d80Var, Set set) {
        this.m = 10;
        this.n = u30Var;
        this.o = js0Var;
        this.p = d80Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            A(str, 0, str.length(), 1, true, new ng0(str, 0));
        }
    }

    public mh(String str) {
        this.m = 17;
        t21 t21Var = new t21(27);
        this.o = t21Var;
        this.p = t21Var;
        this.n = str;
    }

    public mh(j13 j13Var, mh mhVar) {
        this.m = 28;
        this.n = j13Var;
        this.o = mhVar;
        this.p = j13Var.getValue();
    }

    public mh(Class cls, Type type) {
        Object o23Var;
        this.m = 7;
        this.o = cls;
        this.p = type;
        try {
            try {
                try {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    o23Var = new l23(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    o23Var = new o23();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                o23Var = new n23(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            o23Var = new m23(intValue, declaredMethod3);
        }
        this.n = o23Var;
    }
}
