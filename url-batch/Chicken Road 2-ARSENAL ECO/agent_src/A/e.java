package A;

import H5.r;
import X5.u;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import com.onesignal.core.activities.PermissionsActivity;
import e6.C0357c;
import j5.InterfaceC0438a;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import k5.InterfaceC0475e;
import l5.q;
import m1.AbstractC0521b;
import p1.C0576a;
import p1.InterfaceC0577b;
import p1.o;
import p1.p;
import x1.InterfaceC0726a;

/* loaded from: classes.dex */
public final class e implements F0.b, InterfaceC0475e, InterfaceC0577b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8h;

    /* renamed from: i, reason: collision with root package name */
    public Object f9i;

    /* renamed from: j, reason: collision with root package name */
    public Object f10j;

    /* renamed from: k, reason: collision with root package name */
    public Object f11k;

    public /* synthetic */ e(boolean z5) {
        this.f6f = 3;
    }

    public static e g(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        e eVar = new e(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) eVar.f10j)) {
            try {
                ((ArrayDeque) eVar.f10j).clear();
                String string = ((SharedPreferences) eVar.f9i).getString((String) eVar.f7g, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) eVar.f8h)) {
                    String[] split = string.split((String) eVar.f8h, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) eVar.f10j).add(str);
                        }
                    }
                    return eVar;
                }
                return eVar;
            } finally {
            }
        }
    }

    @Override // p1.InterfaceC0577b
    public Object a(Class cls) {
        if (!((Set) this.f7g).contains(o.a(cls))) {
            throw new r("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a7 = ((InterfaceC0577b) this.f11k).a(cls);
        if (!cls.equals(InterfaceC0726a.class)) {
            return a7;
        }
        return new p();
    }

    @Override // p1.InterfaceC0577b
    public Set b(o oVar) {
        if (((Set) this.f9i).contains(oVar)) {
            return ((InterfaceC0577b) this.f11k).b(oVar);
        }
        throw new r("Attempting to request an undeclared dependency Set<" + oVar + ">.");
    }

    @Override // p1.InterfaceC0577b
    public A1.a c(Class cls) {
        return d(o.a(cls));
    }

    @Override // p1.InterfaceC0577b
    public A1.a d(o oVar) {
        if (((Set) this.f8h).contains(oVar)) {
            return ((InterfaceC0577b) this.f11k).d(oVar);
        }
        throw new r("Attempting to request an undeclared dependency Provider<" + oVar + ">.");
    }

    @Override // p1.InterfaceC0577b
    public Object e(o oVar) {
        if (((Set) this.f7g).contains(oVar)) {
            return ((InterfaceC0577b) this.f11k).e(oVar);
        }
        throw new r("Attempting to request an undeclared dependency " + oVar + ".");
    }

    @Override // p1.InterfaceC0577b
    public A1.a f(o oVar) {
        if (((Set) this.f10j).contains(oVar)) {
            return ((InterfaceC0577b) this.f11k).f(oVar);
        }
        throw new r("Attempting to request an undeclared dependency Provider<Set<" + oVar + ">>.");
    }

    @Override // j5.InterfaceC0438a
    public Object get() {
        return new I0.a((Executor) ((InterfaceC0438a) this.f7g).get(), (E0.e) ((InterfaceC0438a) this.f8h).get(), (J0.d) ((B0.c) this.f9i).get(), (K0.d) ((InterfaceC0438a) this.f10j).get(), (L0.c) ((InterfaceC0438a) this.f11k).get());
    }

    @Override // k5.InterfaceC0475e
    public Object getValue() {
        S s6 = (S) this.f11k;
        if (s6 != null) {
            return s6;
        }
        B0.c cVar = new B0.c((X) ((PermissionsActivity.f) this.f8h).invoke(), (V) ((PermissionsActivity.e) this.f9i).invoke(), (O.b) ((PermissionsActivity.g) this.f10j).invoke());
        Class a7 = ((kotlin.jvm.internal.d) this.f7g).a();
        kotlin.jvm.internal.i.c(a7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        String canonicalName = a7.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        S k4 = cVar.k("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), a7);
        this.f11k = k4;
        return k4;
    }

    public void h(String str, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        Q4.j jVar = (Q4.j) this.f9i;
        jVar.getClass();
        i6.g.o(str);
        i6.g.p(value, str);
        jVar.d(str);
        i6.g.j(jVar, str, value);
    }

    public void i(String method, u uVar) {
        kotlin.jvm.internal.i.e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (uVar == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("QUERY") || method.equals("REPORT")) {
                throw new IllegalArgumentException(W4.o.e("method ", method, " must have a request body.").toString());
            }
        } else if (!AbstractC0521b.z(method)) {
            throw new IllegalArgumentException(W4.o.e("method ", method, " must not have a request body.").toString());
        }
        this.f7g = method;
        this.f10j = uVar;
    }

    @Override // k5.InterfaceC0475e
    public boolean isInitialized() {
        return ((S) this.f11k) != null;
    }

    public String toString() {
        switch (this.f6f) {
            case 0:
                List list = (List) this.f11k;
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f7g) + ", mProviderPackage: " + ((String) this.f8h) + ", mQuery: " + ((String) this.f9i) + ", mCertificates:");
                for (int i7 = 0; i7 < list.size(); i7++) {
                    sb.append(" [");
                    List list2 = (List) list.get(i7);
                    for (int i8 = 0; i8 < list2.size(); i8++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i8), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public e(InterfaceC0438a interfaceC0438a, InterfaceC0438a interfaceC0438a2, B0.c cVar, InterfaceC0438a interfaceC0438a3, InterfaceC0438a interfaceC0438a4) {
        this.f6f = 2;
        this.f7g = interfaceC0438a;
        this.f8h = interfaceC0438a2;
        this.f9i = cVar;
        this.f10j = interfaceC0438a3;
        this.f11k = interfaceC0438a4;
    }

    public e(kotlin.jvm.internal.d dVar, PermissionsActivity.f fVar, PermissionsActivity.e eVar, PermissionsActivity.g gVar) {
        this.f6f = 4;
        this.f7g = dVar;
        this.f8h = fVar;
        this.f9i = eVar;
        this.f10j = gVar;
    }

    public e(C0576a c0576a, InterfaceC0577b interfaceC0577b) {
        this.f6f = 6;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<p1.g> set = c0576a.f5662c;
        Set set2 = c0576a.f5666g;
        for (p1.g gVar : set) {
            int i7 = gVar.f5682c;
            int i8 = gVar.f5681b;
            boolean z5 = i7 == 0;
            o oVar = gVar.f5680a;
            if (z5) {
                if (i8 == 2) {
                    hashSet4.add(oVar);
                } else {
                    hashSet.add(oVar);
                }
            } else if (i7 == 2) {
                hashSet3.add(oVar);
            } else if (i8 == 2) {
                hashSet5.add(oVar);
            } else {
                hashSet2.add(oVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(o.a(InterfaceC0726a.class));
        }
        this.f7g = Collections.unmodifiableSet(hashSet);
        this.f8h = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f9i = Collections.unmodifiableSet(hashSet4);
        this.f10j = Collections.unmodifiableSet(hashSet5);
        this.f11k = interfaceC0577b;
    }

    public e(String str, String str2, String str3, List list) {
        this.f6f = 0;
        this.f7g = str;
        this.f8h = str2;
        this.f9i = str3;
        list.getClass();
        this.f11k = list;
        this.f10j = str + "-" + str2 + "-" + str3;
    }

    public e(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f6f = 1;
        this.f10j = new ArrayDeque();
        this.f9i = sharedPreferences;
        this.f7g = "topic_operation_queue";
        this.f8h = ",";
        this.f11k = scheduledThreadPoolExecutor;
    }

    public e() {
        this.f6f = 3;
        this.f11k = q.f5304f;
        this.f7g = "GET";
        this.f9i = new Q4.j(2);
    }

    public e(a6.e taskRunner) {
        this.f6f = 5;
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        this.f8h = taskRunner;
        this.f10j = e6.n.f4090a;
        this.f11k = C0357c.f4046a;
    }
}
