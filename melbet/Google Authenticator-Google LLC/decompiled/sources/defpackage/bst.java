package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bst {
    public final Object a;

    public bst(bry bryVar) {
        this.a = new ddm();
        kee keeVar = new kee(this);
        Object obj = bryVar.a;
        ddm ddmVar = (ddm) obj;
        ddmVar.j(ddl.a, new dcx(keeVar));
    }

    public static int[] v(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int countTokens = stringTokenizer.countTokens();
            int[] iArr = new int[countTokens];
            for (int i = 0; i < countTokens; i++) {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(a.Z(str, "Unable to parse HTTP flags version string: `", "`"), e);
        }
    }

    public final kuk A(int i) {
        return ((kuk[]) this.a)[i];
    }

    public final long B(long j) {
        return ((AtomicLong) this.a).addAndGet(j);
    }

    public final ThreadFactory a(ThreadFactory threadFactory) {
        return new dfv(this, threadFactory, new StrictMode.ThreadPolicy.Builder());
    }

    public final void b(Exception exc) {
        ((ddm) this.a).o(exc);
    }

    public final void c(Object obj) {
        ((ddm) this.a).p(obj);
    }

    public final void d(Exception exc) {
        oy.au(exc, "Exception must not be null");
        Object obj = this.a;
        ddm ddmVar = (ddm) obj;
        synchronized (ddmVar.a) {
            if (((ddm) obj).b) {
                return;
            }
            ((ddm) obj).b = true;
            ((ddm) obj).d = exc;
            ddmVar.e.f((ddi) obj);
        }
    }

    public final void e(Object obj) {
        ((ddm) this.a).q(obj);
    }

    public final boolean f() {
        return jtp.a.bB().b((Context) this.a);
    }

    public final boolean g() {
        return jtp.a.bB().c((Context) this.a);
    }

    public final boolean h() {
        return jtp.a.bB().e((Context) this.a);
    }

    public final boolean i() {
        return jtp.a.bB().h((Context) this.a);
    }

    public final boolean j() {
        return jtp.d((Context) this.a);
    }

    public final boolean k() {
        return jtp.a.bB().a((Context) this.a);
    }

    public final frv l() {
        return ftc.b(((Activity) this.a).getIntent());
    }

    public final void m(Intent intent) {
        frx frxVar;
        Activity activity = (Activity) this.a;
        if (fhq.l(activity.getIntent())) {
            Intent intent2 = activity.getIntent();
            intent2.getClass();
            if (!fhq.l(intent2)) {
                throw new IllegalStateException("AccountOperationContext not stored in the intent");
            }
            Object m = oy.m(intent2, "tiktok_account_operation_contexts", frx.class);
            if (m == null) {
                throw new IllegalStateException("Required value was null.");
            }
            frxVar = (frx) m;
        } else {
            frxVar = null;
        }
        if (frxVar != null) {
            intent.getClass();
            intent.putExtra("tiktok_account_operation_contexts", frxVar);
        }
    }

    public final void n(frv frvVar) {
        Intent putExtra = new Intent().putExtra("new_account_id", frvVar.a);
        m(putExtra);
        Activity activity = (Activity) this.a;
        activity.setResult(-1, putExtra);
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    public final frv o() {
        return (frv) ((fwm) this.a).a;
    }

    public final hvi p(fds fdsVar) {
        return ((fdl) this.a).b().b(gvx.d(new fda(fdsVar, 2)), huf.a).f();
    }

    public final hvi q(fdt fdtVar) {
        return ((fdl) this.a).b().b(gvx.d(new fda(fdtVar, 3)), huf.a).f();
    }

    public final int r() {
        return ((AtomicInteger) this.a).get();
    }

    public final htz s(fwm fwmVar) {
        return ((fdl) this.a).b().b(gvx.d(new fda(fwmVar, 1)), huf.a);
    }

    public final hvi t(fwm fwmVar) {
        return ((fdl) this.a).b().b(gvx.d(new fda(fwmVar, 0)), huf.a).f();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Map u() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    public final int w() {
        long j = ((lcu) ((kuk) this.a).a).b.b;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object x() {
        while (true) {
            kuk kukVar = (kuk) this.a;
            lcu lcuVar = (lcu) kukVar.a;
            Object b = lcuVar.b();
            if (b != lcu.a) {
                return b;
            }
            kukVar.d(lcuVar, lcuVar.c());
        }
    }

    public final void y() {
        while (true) {
            kuk kukVar = (kuk) this.a;
            lcu lcuVar = (lcu) kukVar.a;
            if (lcuVar.d()) {
                return;
            } else {
                kukVar.d(lcuVar, lcuVar.c());
            }
        }
    }

    public final boolean z(Object obj) {
        while (true) {
            kuk kukVar = (kuk) this.a;
            lcu lcuVar = (lcu) kukVar.a;
            int a = lcuVar.a(obj);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return false;
            }
            kukVar.d(lcuVar, lcuVar.c());
        }
    }

    public bst(Object obj) {
        this.a = obj;
    }

    public bst(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public bst() {
        this.a = new ddm();
    }

    public bst(jpt jptVar) {
        jptVar.getClass();
        this.a = jptVar;
    }

    public bst(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new LinkedHashMap();
    }

    public bst(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicInteger();
    }

    public bst(char[] cArr, byte[] bArr) {
        this.a = new AtomicLong();
    }

    public bst(int i) {
        kuk[] kukVarArr = new kuk[i];
        for (int i2 = 0; i2 < i; i2++) {
            kukVarArr[i2] = new kuk(null, kul.a);
        }
        this.a = kukVarArr;
    }

    public bst(byte[] bArr) {
        this.a = DesugarCollections.synchronizedSet(new HashSet());
    }

    public bst(String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append(str);
        this.a = exf.q(sb, arrayList);
    }

    public bst(byte[] bArr, char[] cArr) {
        this.a = new AtomicReference(null);
    }

    public bst(char[] cArr) {
        this.a = new kuk(new lcu(8, false), kul.a);
    }
}
