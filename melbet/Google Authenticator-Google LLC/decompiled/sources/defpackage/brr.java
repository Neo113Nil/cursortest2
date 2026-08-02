package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brr {
    public final Object a;
    public final Object b;

    public brr(List list, List list2) {
        int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.a)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.b)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public static /* synthetic */ List c(String str, String str2, ana anaVar) {
        anaVar.getClass();
        amh a = anaVar.a(str);
        try {
            a.i(1, str2);
            ArrayList arrayList = new ArrayList();
            while (a.l()) {
                arrayList.add(a.d(0));
            }
            return arrayList;
        } finally {
            a.close();
        }
    }

    public static /* synthetic */ kow d(String str, String str2, ana anaVar) {
        anaVar.getClass();
        amh a = anaVar.a(str);
        try {
            a.i(1, str2);
            a.l();
            a.close();
            return kow.a;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    public static /* synthetic */ int e(String str, String str2, ana anaVar) {
        anaVar.getClass();
        amh a = anaVar.a(str);
        try {
            a.i(1, str2);
            a.l();
            return afg.e(anaVar);
        } finally {
            a.close();
        }
    }

    public static /* synthetic */ List f(String str, ana anaVar) {
        int i;
        int i2;
        Integer valueOf;
        anaVar.getClass();
        amh a = anaVar.a(str);
        try {
            int d = afg.d(a, "id");
            int d2 = afg.d(a, "state");
            int d3 = afg.d(a, "worker_class_name");
            int d4 = afg.d(a, "input_merger_class_name");
            int d5 = afg.d(a, "input");
            int d6 = afg.d(a, "output");
            int d7 = afg.d(a, "initial_delay");
            int d8 = afg.d(a, "interval_duration");
            int d9 = afg.d(a, "flex_duration");
            int d10 = afg.d(a, "run_attempt_count");
            int d11 = afg.d(a, "backoff_policy");
            int d12 = afg.d(a, "backoff_delay_duration");
            int d13 = afg.d(a, "last_enqueue_time");
            int d14 = afg.d(a, "minimum_retention_duration");
            int d15 = afg.d(a, "schedule_requested_at");
            int d16 = afg.d(a, "run_in_foreground");
            int d17 = afg.d(a, "out_of_quota_policy");
            int d18 = afg.d(a, "period_count");
            int d19 = afg.d(a, "generation");
            int d20 = afg.d(a, "next_schedule_time_override");
            int d21 = afg.d(a, "next_schedule_time_override_generation");
            int d22 = afg.d(a, "stop_reason");
            int d23 = afg.d(a, "trace_tag");
            int d24 = afg.d(a, "backoff_on_system_interruptions");
            int d25 = afg.d(a, "required_network_type");
            int d26 = afg.d(a, "required_network_request");
            int d27 = afg.d(a, "requires_charging");
            int d28 = afg.d(a, "requires_device_idle");
            int d29 = afg.d(a, "requires_battery_not_low");
            int d30 = afg.d(a, "requires_storage_not_low");
            int d31 = afg.d(a, "trigger_content_update_delay");
            int d32 = afg.d(a, "trigger_max_content_delay");
            int d33 = afg.d(a, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (a.l()) {
                String d34 = a.d(d);
                int i3 = d14;
                ArrayList arrayList2 = arrayList;
                atb l = abf.l((int) a.b(d2));
                String d35 = a.d(d3);
                String d36 = a.d(d4);
                byte[] m = a.m(d5);
                asa asaVar = asa.a;
                asa h = yn.h(m);
                asa h2 = yn.h(a.m(d6));
                long b = a.b(d7);
                long b2 = a.b(d8);
                long b3 = a.b(d9);
                int b4 = (int) a.b(d10);
                int i4 = d2;
                int i5 = d3;
                art k = abf.k((int) a.b(d11));
                long b5 = a.b(d12);
                long b6 = a.b(d13);
                long b7 = a.b(i3);
                int i6 = d15;
                long b8 = a.b(i6);
                int i7 = d;
                int i8 = d16;
                boolean z = ((int) a.b(i8)) != 0;
                int i9 = d17;
                int i10 = d4;
                int t = abf.t((int) a.b(i9));
                int i11 = d18;
                int i12 = d5;
                int b9 = (int) a.b(i11);
                int i13 = d19;
                int b10 = (int) a.b(i13);
                int i14 = d20;
                long b11 = a.b(i14);
                int i15 = d21;
                int b12 = (int) a.b(i15);
                int i16 = d22;
                int b13 = (int) a.b(i16);
                int i17 = d23;
                Boolean bool = null;
                String d37 = a.k(i17) ? null : a.d(i17);
                int i18 = d24;
                if (a.k(i18)) {
                    i = b12;
                    i2 = i16;
                    valueOf = null;
                } else {
                    i = b12;
                    i2 = i16;
                    valueOf = Integer.valueOf((int) a.b(i18));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i19 = d25;
                Boolean bool2 = bool;
                int s = abf.s((int) a.b(i19));
                int i20 = d26;
                ayk m2 = abf.m(a.m(i20));
                d25 = i19;
                d26 = i20;
                int i21 = d27;
                boolean z2 = ((int) a.b(i21)) != 0;
                d27 = i21;
                int i22 = d28;
                boolean z3 = ((int) a.b(i22)) != 0;
                int i23 = d29;
                boolean z4 = ((int) a.b(i23)) != 0;
                d29 = i23;
                int i24 = d30;
                int i25 = d31;
                int i26 = d32;
                int i27 = d33;
                d33 = i27;
                arrayList2.add(new axt(d34, l, d35, d36, h, h2, b, b2, b3, new ary(m2, s, z2, z3, z4, ((int) a.b(i24)) != 0, a.b(i25), a.b(i26), abf.n(a.m(i27))), b4, k, b5, b6, b7, b8, z, t, b9, b10, b11, i, b13, d37, bool2));
                d30 = i24;
                d4 = i10;
                d17 = i9;
                d19 = i13;
                d22 = i2;
                d24 = i18;
                d31 = i25;
                d32 = i26;
                d2 = i4;
                d14 = i3;
                d3 = i5;
                arrayList = arrayList2;
                d = i7;
                d15 = i6;
                d16 = i8;
                d20 = i14;
                d21 = i15;
                d23 = i17;
                d28 = i22;
                d5 = i12;
                d18 = i11;
            }
            return arrayList;
        } finally {
            a.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (((int) r3.b(0)) != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ boolean g(String str, String str2, ana anaVar) {
        anaVar.getClass();
        amh a = anaVar.a(str);
        boolean z = true;
        try {
            a.i(1, str2);
            if (a.l()) {
            }
            z = false;
            return z;
        } finally {
            a.close();
        }
    }

    public static final boolean p(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public static final KeyListener q(KeyListener keyListener) {
        if (p(keyListener) && !(keyListener instanceof adb)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new adb(keyListener);
            }
        }
        return keyListener;
    }

    public final void A(bd bdVar, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.A(bdVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void B(bd bdVar, Bundle bundle, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.B(bdVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void C(bd bdVar, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.C(bdVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void D(bd bdVar, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.D(bdVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void E(bd bdVar, View view, Bundle bundle, boolean z) {
        bdVar.getClass();
        view.getClass();
        by byVar = (by) this.b;
        bd bdVar2 = byVar.n;
        if (bdVar2 != null) {
            bdVar2.G().x.E(bdVar, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
                awc awcVar = (awc) obj;
                if (bdVar == awcVar.b) {
                    Object obj2 = byVar.x.a;
                    synchronized (obj2) {
                        int size = ((CopyOnWriteArrayList) obj2).size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (((brn) ((CopyOnWriteArrayList) obj2).get(i)).a == obj) {
                                ((CopyOnWriteArrayList) obj2).remove(i);
                                break;
                            }
                            i++;
                        }
                    }
                    ara.x(view, (FrameLayout) awcVar.a);
                } else {
                    continue;
                }
            }
        }
    }

    public final void F(bd bdVar, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.F(bdVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void G(brn brnVar, int i) {
        ((ldt) this.a).r(new ayp((atx) this.b, brnVar, false, i));
    }

    public final void H(brn brnVar, zx zxVar) {
        ((ldt) this.a).r(new ajx(this, brnVar, zxVar, 5));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, wq] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, wq] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, wq] */
    public final String a(bbh bbhVar) {
        String str;
        Object obj = this.a;
        synchronized (obj) {
            str = (String) ((bme) obj).f(bbhVar);
        }
        if (str == null) {
            bey beyVar = (bey) this.b.a();
            try {
                MessageDigest messageDigest = beyVar.a;
                bbhVar.a(messageDigest);
                byte[] digest = messageDigest.digest();
                char[] cArr = bmi.b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i];
                        int i2 = i + i;
                        char[] cArr2 = bmi.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.b(beyVar);
            }
        }
        Object obj2 = this.a;
        synchronized (obj2) {
            ((bme) obj2).g(bbhVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Queue] */
    public final void b(String str) {
        ckm ckmVar;
        synchronized (this) {
            ?? r2 = this.a;
            ckmVar = (ckm) r2.get(str);
            a.v(ckmVar, "Argument must not be null");
            int i = ckmVar.a;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + i);
            }
            int i2 = i - 1;
            ckmVar.a = i2;
            if (i2 == 0) {
                ckm ckmVar2 = (ckm) r2.remove(str);
                if (!ckmVar2.equals(ckmVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + ckmVar.toString() + ", but actually removed: " + String.valueOf(ckmVar2) + ", safeKey: " + str);
                }
                ?? r6 = ((brn) this.b).a;
                synchronized (r6) {
                    if (r6.size() < 10) {
                        r6.offer(ckmVar2);
                    }
                }
            }
        }
        ckmVar.b.unlock();
    }

    public final void h() {
        ((amg) this.b).a();
    }

    public final void i(Bundle bundle) {
        amg amgVar = (amg) this.b;
        if (!amgVar.b) {
            amgVar.a();
        }
        ame ameVar = amgVar.a;
        if (ameVar.L().c.a(aek.d)) {
            aek aekVar = ameVar.L().c;
            Objects.toString(aekVar);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(aekVar)));
        }
        if (amgVar.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = amb.a(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        amgVar.c = bundle2;
        amgVar.d = true;
    }

    public final void j(Bundle bundle) {
        int i;
        Bundle h = pk.h((kol[]) Arrays.copyOf(new kol[0], 0));
        Object obj = this.b;
        amg amgVar = (amg) obj;
        Bundle bundle2 = amgVar.c;
        if (bundle2 != null) {
            h.putAll(bundle2);
        }
        synchronized (amgVar.g) {
            qv qvVar = ((amg) obj).f;
            Object[] objArr = qvVar.b;
            Object[] objArr2 = qvVar.c;
            long[] jArr = qvVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            i = 8 - ((~i3) >>> 31);
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                amf.a(h, (String) objArr[i5], ((amd) objArr2[i5]).a());
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        if (h.isEmpty()) {
            return;
        }
        amf.a(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", h);
    }

    public final void k() {
        synchronized (this) {
            Object obj = this.b;
            ((AtomicInteger) obj).decrementAndGet();
            if (((AtomicInteger) obj).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean l() {
        synchronized (this) {
            if (((AtomicBoolean) this.a).get()) {
                return false;
            }
            ((AtomicInteger) this.b).incrementAndGet();
            return true;
        }
    }

    public final void m(Context context, Uri uri) {
        Intent intent = (Intent) this.b;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void n(bsh bshVar) {
        int i = bshVar.a;
        if (i != 0) {
            this.a.execute(new vz((brn) this.b, i, 0));
        } else {
            Object obj = bshVar.b;
            this.a.execute(new at((brn) this.b, (Typeface) obj, 16));
        }
    }

    public final void o(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.a).getContext().obtainStyledAttributes(attributeSet, em.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            ade adeVar = (ade) ((afr) this.b).a;
            if (adeVar.a != z) {
                adeVar.a = z;
                if (z) {
                    acv.a();
                    throw null;
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection r(InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof ada) ? new ada((TextView) ((afr) this.b).b, inputConnection) : inputConnection;
    }

    public final void s(bd bdVar, Bundle bundle, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.s(bdVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void t(bd bdVar, boolean z) {
        bdVar.getClass();
        by byVar = (by) this.b;
        Context context = byVar.l.c;
        bd bdVar2 = byVar.n;
        if (bdVar2 != null) {
            bdVar2.G().x.t(bdVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void u(bd bdVar, Bundle bundle, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.u(bdVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void v(bd bdVar, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.v(bdVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void w(bd bdVar, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.w(bdVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void x(bd bdVar, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.x(bdVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void y(bd bdVar, boolean z) {
        bdVar.getClass();
        by byVar = (by) this.b;
        Context context = byVar.l.c;
        bd bdVar2 = byVar.n;
        if (bdVar2 != null) {
            bdVar2.G().x.y(bdVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public final void z(bd bdVar, Bundle bundle, boolean z) {
        bdVar.getClass();
        bd bdVar2 = ((by) this.b).n;
        if (bdVar2 != null) {
            bdVar2.G().x.z(bdVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            brn brnVar = (brn) it.next();
            if (!z) {
                Object obj = brnVar.a;
            }
        }
    }

    public brr(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public brr(amg amgVar) {
        this.b = amgVar;
        this.a = new boe(amgVar);
    }

    public brr(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public brr(brp brpVar, brn brnVar) {
        this.a = brpVar;
        this.b = brnVar;
    }

    public brr(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public brr(String str, String str2, byte[] bArr) {
        this.b = str;
        this.a = str2;
    }

    public brr(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public brr(atx atxVar, ldt ldtVar) {
        atxVar.getClass();
        ldtVar.getClass();
        this.b = atxVar;
        this.a = ldtVar;
    }

    public brr(by byVar) {
        this.b = byVar;
        this.a = new CopyOnWriteArrayList();
    }

    public brr(String str, String str2) {
        str.getClass();
        this.b = str;
        this.a = str2;
    }

    public brr(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public brr(jpt jptVar, Context context, hvl hvlVar) {
        jptVar.getClass();
        hvlVar.getClass();
        this.b = jptVar;
        this.a = context;
    }

    public brr(EditText editText) {
        this.a = editText;
        this.b = new afr(editText);
    }

    public brr(String str, String str2, char[] cArr) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public brr(byte[] bArr) {
        this.a = new HashMap();
        this.b = new brn((byte[]) null, (byte[]) null, (char[]) null);
    }

    public brr(ael aelVar) {
        aelVar.getClass();
        this.b = aelVar;
        this.a = new ArrayList();
    }

    public brr() {
        this.a = new bme(1000L);
        this.b = bmp.a(10, new bex(0));
    }

    public brr(char[] cArr) {
        this.b = new AtomicInteger(0);
        this.a = new AtomicBoolean(false);
    }
}
