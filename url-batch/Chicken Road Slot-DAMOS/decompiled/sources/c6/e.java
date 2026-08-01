package c6;

import android.database.Cursor;
import android.graphics.Insets;
import android.util.Log;
import android.view.WindowInsetsAnimation;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import f8.d0;
import f8.f0;
import f8.l0;
import f8.o0;
import f8.x0;
import f8.y;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import r0.j0;
import s7.e0;
import s7.g2;
import s7.q1;
import s7.q2;
import s7.v0;
import s7.x3;
import te.k0;
import te.s0;
import te.y0;
import te.z0;
import z4.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements OnCompleteListener, j0, z0, z7.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1813d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1814e;

    /* renamed from: i, reason: collision with root package name */
    public Object f1815i;

    public e(int i3) {
        this.f1813d = i3;
        switch (i3) {
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                this.f1814e = new ArrayList();
                this.f1815i = new HashMap();
                new HashMap();
                break;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f1814e = new AtomicReference(o0.f4157e);
                this.f1815i = new a1.n(17, false);
                break;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 13:
                this.f1814e = new Object();
                this.f1815i = new LinkedHashMap();
                break;
            default:
                this.f1814e = new o0.e(new Reference[16]);
                this.f1815i = new ReferenceQueue();
                break;
        }
    }

    @Override // z7.i
    public Object a() {
        return new x7.g(((c4.o) this.f1814e).f1772d, (z7.o) ((z7.g) this.f1815i).a(), new x7.d(4));
    }

    @Override // r0.j0
    public List b(Integer num) {
        List b10 = ((j0) this.f1814e).b(null);
        q0.k kVar = (q0.k) this.f1815i;
        int i3 = kVar.f7779v;
        return i3 < 0 ? b10 : CollectionsKt.G(cf.c.l(kVar, num, i3, Integer.valueOf(kVar.E(kVar.f7761b, i3))), b10);
    }

    @Override // r0.j0
    public boolean c() {
        return ((j0) this.f1814e).c();
    }

    @Override // te.z0
    public Object d(ce.b bVar, ArrayList arrayList) {
        Object obj;
        Object mVar;
        obj = ((te.p) this.f1815i).get(a.a.D(bVar));
        obj.getClass();
        s0 s0Var = (s0) obj;
        Object obj2 = s0Var.f9437a.get();
        if (obj2 == null) {
            synchronized (s0Var) {
                obj2 = s0Var.f9437a.get();
                if (obj2 == null) {
                    obj2 = new y0();
                    s0Var.f9437a = new SoftReference(obj2);
                }
            }
        }
        y0 y0Var = (y0) obj2;
        ArrayList arrayList2 = new ArrayList(z.j(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList.get(i3);
            i3++;
            arrayList2.add(new k0((k0) obj3));
        }
        ConcurrentHashMap concurrentHashMap = y0Var.f9469a;
        Object obj4 = concurrentHashMap.get(arrayList2);
        if (obj4 == null) {
            try {
                hd.l lVar = hd.n.f4511e;
                mVar = (pe.a) ((Function2) this.f1814e).invoke(bVar, arrayList);
            } catch (Throwable th) {
                hd.l lVar2 = hd.n.f4511e;
                mVar = new hd.m(th);
            }
            hd.n nVar = new hd.n(mVar);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, nVar);
            obj4 = putIfAbsent == null ? nVar : putIfAbsent;
        }
        return ((hd.n) obj4).f4512d;
    }

    public void e(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f1814e).add(v4.a.p(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    public boolean f() {
        synchronized (this) {
            if (((AtomicBoolean) this.f1815i).get()) {
                return false;
            }
            ((AtomicInteger) this.f1814e).incrementAndGet();
            return true;
        }
    }

    public boolean g(j jVar) {
        boolean containsKey;
        synchronized (this.f1814e) {
            containsKey = ((LinkedHashMap) this.f1815i).containsKey(jVar);
        }
        return containsKey;
    }

    public File h() {
        if (((File) this.f1814e) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f1814e) == null) {
                        String str = "PersistedInstallation." + ((g8.g) this.f1815i).d() + ".json";
                        g8.g gVar = (g8.g) this.f1815i;
                        gVar.a();
                        File file = new File(gVar.f4300a.getNoBackupFilesDir(), str);
                        this.f1814e = file;
                        if (file.exists()) {
                            return (File) this.f1814e;
                        }
                        g8.g gVar2 = (g8.g) this.f1815i;
                        gVar2.a();
                        File file2 = new File(gVar2.f4300a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f1814e)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.f1814e;
    }

    public List i() {
        ArrayList arrayList;
        if (((ArrayList) this.f1814e).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1814e)) {
            arrayList = new ArrayList((ArrayList) this.f1814e);
        }
        return arrayList;
    }

    public Long j(String str) {
        u uVar = (u) this.f1814e;
        z4.z a9 = z4.z.a(1, "SELECT long_value FROM Preference where `key`=?");
        a9.l(1, str);
        uVar.b();
        Cursor E = cf.c.E(uVar, a9);
        try {
            Long l10 = null;
            if (E.moveToFirst() && !E.isNull(0)) {
                l10 = Long.valueOf(E.getLong(0));
            }
            return l10;
        } finally {
            E.close();
            a9.d();
        }
    }

    public void k(y8.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f10675a);
            jSONObject.put("Status", a4.i.b(bVar.f10676b));
            jSONObject.put("AuthToken", bVar.f10677c);
            jSONObject.put("RefreshToken", bVar.f10678d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f10680f);
            jSONObject.put("ExpiresInSecs", bVar.f10679e);
            jSONObject.put("FisError", bVar.g);
            g8.g gVar = (g8.g) this.f1815i;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f4300a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(h())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void l(d dVar) {
        u uVar = (u) this.f1814e;
        uVar.b();
        uVar.c();
        try {
            ((b) this.f1815i).e(dVar);
            uVar.u();
        } finally {
            uVar.h();
        }
    }

    public void m(Throwable th) {
        q2 q2Var = (q2) this.f1815i;
        q2Var.s();
        q1 q1Var = (q1) q2Var.f1478d;
        q2Var.f8950w = false;
        q2Var.Q().add((x3) this.f1814e);
        if (q2Var.f8951x > ((Integer) e0.f8655v0.a(null)).intValue()) {
            q2Var.f8951x = 1;
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9053w.c(v0.A(q1Var.q().y()), v0.A(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        v0 v0Var2 = q1Var.f8937t;
        q1.l(v0Var2);
        v0Var2.f9053w.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", v0.A(q1Var.q().y()), v0.A(String.valueOf(q2Var.f8951x)), v0.A(th.toString()));
        int i3 = q2Var.f8951x;
        if (q2Var.f8952y == null) {
            q2Var.f8952y = new g2(q2Var, q1Var, 1);
        }
        q2Var.f8952y.b(i3 * 1000);
        int i10 = q2Var.f8951x;
        q2Var.f8951x = i10 + i10;
    }

    public y8.b n() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(h());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i3 = y8.b.f10674h;
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        int i10 = a4.i.c(5)[optInt];
        if (i10 == 0) {
            a2.r.j("Null registrationStatus");
            return null;
        }
        byte b11 = (byte) (((byte) (b10 | 2)) | 1);
        if (b11 == 3 && i10 != 0) {
            return new y8.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 == 0) {
            sb2.append(" registrationStatus");
        }
        if ((b11 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b11 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        a2.r.s(sb2, "Missing required properties:");
        return null;
    }

    public List o(String str) {
        List Q;
        str.getClass();
        synchronized (this.f1814e) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1815i;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (Intrinsics.a(((j) entry.getKey()).f1824a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f1815i).remove((j) it.next());
                }
                Q = CollectionsKt.Q(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return Q;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((c) this.f1815i).f1810i).remove((w7.g) this.f1814e);
    }

    public u5.i p(j jVar) {
        u5.i iVar;
        synchronized (this.f1814e) {
            iVar = (u5.i) ((LinkedHashMap) this.f1815i).remove(jVar);
        }
        return iVar;
    }

    public ListenableFuture q(y yVar, Executor executor) {
        executor.getClass();
        f0 f0Var = new f0(f8.e0.f4132d);
        f0Var.f4142e = executor;
        f0Var.f4141d = this;
        c cVar = new c(6, f0Var, yVar);
        x0 x0Var = new x0();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.f1814e).getAndSet(x0Var);
        f8.z0 z0Var = new f8.z0();
        z0Var.f4204w = new f8.y0(z0Var, cVar);
        listenableFuture.a(z0Var, f0Var);
        ListenableFuture e2 = l0.e(z0Var);
        d.m mVar = new d.m(z0Var, x0Var, listenableFuture, e2, f0Var, 2);
        d0 d0Var = d0.f4128d;
        e2.a(mVar, d0Var);
        z0Var.a(mVar, d0Var);
        return e2;
    }

    public u5.i r(j jVar) {
        u5.i iVar;
        synchronized (this.f1814e) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1815i;
                Object obj = linkedHashMap.get(jVar);
                if (obj == null) {
                    obj = new u5.i(jVar);
                    linkedHashMap.put(jVar, obj);
                }
                iVar = (u5.i) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public void s() {
        synchronized (this) {
            ((AtomicInteger) this.f1814e).decrementAndGet();
            if (((AtomicInteger) this.f1814e).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public String toString() {
        switch (this.f1813d) {
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f1815i.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f1814e;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb2.append((String) arrayList.get(i3));
                    if (i3 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 9:
                return "Bounds{lower=" + ((h3.b) this.f1814e) + " upper=" + ((h3.b) this.f1815i) + "}";
            default:
                return super.toString();
        }
    }

    public e(c4.o oVar, z7.g gVar, x7.d dVar) {
        this.f1813d = 14;
        this.f1814e = oVar;
        this.f1815i = gVar;
    }

    public e(c cVar, w7.g gVar) {
        this.f1813d = 2;
        this.f1814e = gVar;
        Objects.requireNonNull(cVar);
        this.f1815i = cVar;
    }

    public /* synthetic */ e(Object obj) {
        this.f1813d = 3;
        this.f1815i = obj;
        this.f1814e = new ArrayList();
    }

    public e(q2 q2Var, x3 x3Var) {
        this.f1813d = 11;
        this.f1814e = x3Var;
        this.f1815i = q2Var;
    }

    public e(WorkDatabase workDatabase) {
        this.f1813d = 0;
        this.f1814e = workDatabase;
        this.f1815i = new b(workDatabase);
    }

    public /* synthetic */ e(int i3, Object obj, Object obj2) {
        this.f1813d = i3;
        this.f1814e = obj;
        this.f1815i = obj2;
    }

    public e(se seVar) {
        this.f1813d = 7;
        this.f1814e = seVar;
        this.f1815i = new ArrayList();
    }

    public e(d2.o oVar) {
        this.f1813d = 1;
        this.f1814e = new AtomicInteger(0);
        this.f1815i = new AtomicBoolean(false);
    }

    public e(g8.g gVar) {
        this.f1813d = 15;
        this.f1815i = gVar;
    }

    public e(Function2 function2) {
        this.f1813d = 12;
        this.f1814e = function2;
        this.f1815i = new te.p();
    }

    public e(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f1813d = 9;
        lowerBound = bounds.getLowerBound();
        this.f1814e = h3.b.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f1815i = h3.b.c(upperBound);
    }
}
