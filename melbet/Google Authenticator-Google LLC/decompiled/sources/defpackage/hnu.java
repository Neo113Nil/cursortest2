package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.google.firebase.components.ComponentRegistrar;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hnu {
    public hnu() {
    }

    public static LinkedHashMap A(int i) {
        return new LinkedHashMap(w(i));
    }

    public static boolean B(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ArrayList C(Iterator it) {
        ArrayList arrayList = new ArrayList();
        N(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList D(Object... objArr) {
        ArrayList arrayList = new ArrayList(ba(objArr.length + 5));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList E(int i) {
        ap(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List F(List list) {
        return list instanceof hel ? ((hel) list).a() : list instanceof hgz ? ((hgz) list).a : list instanceof RandomAccess ? new hgx(list) : new hgz(list);
    }

    public static List G(List list, gzf gzfVar) {
        return list instanceof RandomAccess ? new hhb(list, gzfVar) : new hhd(list, gzfVar);
    }

    public static boolean H(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!Objects.equals(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static int I(Iterator it, int i) {
        it.getClass();
        int i2 = 0;
        hoq.y(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static hjr J(Iterator it) {
        it.getClass();
        return it instanceof hjr ? (hjr) it : new hgd(it);
    }

    public static Object K(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static Iterator L(Iterator it, gzf gzfVar) {
        gzfVar.getClass();
        return new hgf(it, gzfVar);
    }

    public static void M(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean N(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static boolean O(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static Object Q(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static gzp R(Iterable iterable, gzr gzrVar) {
        Iterator it = iterable.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (gzrVar.a(next)) {
                return gzp.h(next);
            }
        }
        return gyf.a;
    }

    public static Iterable S(Iterable iterable, gzr gzrVar) {
        iterable.getClass();
        return new hfy(iterable, gzrVar);
    }

    public static Iterable T(Iterable iterable, int i) {
        iterable.getClass();
        hoq.y(i >= 0, "number to skip cannot be negative");
        return new hgb(iterable, i);
    }

    public static Object U(Iterable iterable, int i) {
        Iterator it = iterable.iterator();
        int I = I(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException("position (" + i + ") must be less than the number of elements that remained (" + I + ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object V(Iterable iterable) {
        if (iterable.isEmpty()) {
            throw new NoSuchElementException();
        }
        return W(iterable);
    }

    public static Object W(List list) {
        return list.get(list.size() - 1);
    }

    public static Object X(Iterable iterable) {
        Iterator it = iterable.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static Collection Y(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : C(iterable.iterator());
    }

    public static boolean Z(Iterable iterable, gzr gzrVar) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!gzrVar.a(it.next())) {
                i++;
            } else if (i != -1) {
                return true;
            }
        }
        return false;
    }

    public static void aA(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }

    public static hvl aB(ExecutorService executorService) {
        return executorService instanceof hvl ? (hvl) executorService : executorService instanceof ScheduledExecutorService ? new hvr((ScheduledExecutorService) executorService) : new hvo(executorService);
    }

    public static hvm aC(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof hvm ? (hvm) scheduledExecutorService : new hvr(scheduledExecutorService);
    }

    public static Executor aD(final Executor executor, final hsw hswVar) {
        executor.getClass();
        return executor == huf.a ? executor : new Executor() { // from class: hvn
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                hnu.aE(executor, hswVar, runnable);
            }
        };
    }

    public static /* synthetic */ void aE(Executor executor, hsw hswVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            hswVar.p(e);
        }
    }

    static long aF(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    public static hvi aG(Iterable iterable) {
        return new hua(hel.n(iterable), true);
    }

    public static hvi aH() {
        hvd hvdVar = hvd.a;
        return hvdVar != null ? hvdVar : new hvd();
    }

    public static hvi aI(Throwable th) {
        th.getClass();
        return new hvw(th);
    }

    public static hvi aJ(Object obj) {
        return obj == null ? hve.a : new hve(obj);
    }

    public static hvi aK(hvi hviVar) {
        if (hviVar.isDone()) {
            return hviVar;
        }
        huy huyVar = new huy(hviVar);
        hviVar.c(huyVar, huf.a);
        return huyVar;
    }

    public static hvi aL(Runnable runnable, Executor executor) {
        hwd d = hwd.d(runnable, null);
        executor.execute(d);
        return d;
    }

    public static hvi aM(Callable callable, Executor executor) {
        hwd hwdVar = new hwd(callable);
        executor.execute(hwdVar);
        return hwdVar;
    }

    public static hvi aN(htq htqVar, Executor executor) {
        hwd hwdVar = new hwd(htqVar);
        executor.execute(hwdVar);
        return hwdVar;
    }

    public static hvi aO(Iterable iterable) {
        return new hua(hel.n(iterable), false);
    }

    public static hvi aP(hvi hviVar, Duration duration, ScheduledExecutorService scheduledExecutorService) {
        return aQ(hviVar, aF(duration), TimeUnit.NANOSECONDS, scheduledExecutorService);
    }

    public static hvi aQ(hvi hviVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (hviVar.isDone()) {
            return hviVar;
        }
        hwa hwaVar = new hwa(hviVar);
        hvy hvyVar = new hvy(hwaVar);
        hwaVar.b = scheduledExecutorService.schedule(hvyVar, j, timeUnit);
        hviVar.c(hvyVar, huf.a);
        return hwaVar;
    }

    public static Object aR(Future future) {
        hoq.K(future.isDone(), "Future was expected to be done: %s", future);
        return a.n(future);
    }

    public static void aS(hvi hviVar, hut hutVar, Executor executor) {
        hutVar.getClass();
        hviVar.c(new huu(hviVar, hutVar), executor);
    }

    public static void aT(hvi hviVar, Future future) {
        if (hviVar instanceof hsw) {
            ((hsw) hviVar).m(future);
        } else {
            if (hviVar == null || !hviVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void aU(hvi hviVar, Future future) {
        hviVar.getClass();
        if (future.isDone()) {
            return;
        }
        if (hviVar.isDone()) {
            aT(hviVar, future);
            return;
        }
        huv huvVar = new huv(hviVar, future, 0);
        huf hufVar = huf.a;
        hviVar.c(huvVar, hufVar);
        if (future instanceof hvi) {
            future.c(huvVar, hufVar);
        }
    }

    public static jxu aV(Iterable iterable) {
        return new jxu(false, hel.n(iterable));
    }

    @SafeVarargs
    public static jxu aW(hvi... hviVarArr) {
        return new jxu(false, hel.p(hviVarArr));
    }

    public static jxu aX(Iterable iterable) {
        return new jxu(true, hel.n(iterable));
    }

    @SafeVarargs
    public static jxu aY(hvi... hviVarArr) {
        return new jxu(true, hel.p(hviVarArr));
    }

    public static long aZ(int i) {
        return i & 4294967295L;
    }

    public static Object[] aa(Iterable iterable) {
        return Y(iterable).toArray();
    }

    public static Object ab(Iterable iterable) {
        return Q(((hjc) iterable).iterator());
    }

    public static /* synthetic */ hel ac(Collection collection) {
        hel o = hel.o(collection);
        o.getClass();
        return o;
    }

    public static /* synthetic */ her ad(Map map) {
        her i = her.i(map);
        i.getClass();
        return i;
    }

    public static /* synthetic */ hfm ae(Collection collection) {
        hfm n = hfm.n(collection);
        n.getClass();
        return n;
    }

    public static int af(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int ag(Object obj) {
        return af(obj == null ? 0 : obj.hashCode());
    }

    public static int ah(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= highestOneBit) {
            return highestOneBit;
        }
        int i2 = highestOneBit + highestOneBit;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        an(r11, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int ai(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int ag = ag(obj);
        int i2 = ag & i;
        int aj = aj(obj3, i2);
        if (aj != 0) {
            int i3 = ~i;
            int i4 = ag & i3;
            int i5 = -1;
            while (true) {
                int i6 = aj - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !Objects.equals(obj, objArr[i6]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    aj = i8;
                }
            }
        }
        return -1;
    }

    public static int aj(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static int ak(int i) {
        return Math.max(4, ah(i + 1));
    }

    public static Object al(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(a.Y(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void am(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static void an(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static void ao(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        }
        if (obj2 == null) {
            throw new NullPointerException(a.aa(obj, "null value in entry: ", "=null"));
        }
    }

    public static void ap(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e8  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kmr] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kmw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jwx aq(idc idcVar, CronetEngine cronetEngine, gzp gzpVar) {
        int i;
        Boolean valueOf;
        Boolean valueOf2;
        jwz jwzVar;
        Object obj = idcVar.g;
        if (obj == null) {
            obj = gzpVar.f() ? gzpVar.b() : new CronetEngine.Builder(idcVar.b).getDefaultUserAgent();
        }
        URI uri = idcVar.c;
        String host = uri.getHost();
        int port = uri.getPort();
        cronetEngine.getClass();
        jxz jxzVar = new jxz(host, port, cronetEngine);
        kiu kiuVar = jxzVar.c;
        kiuVar.m = (String) obj;
        Executor executor = idcVar.e;
        int i2 = 1;
        if (executor != null) {
            kiuVar.g = new kmj(executor, 1);
        } else {
            kiuVar.g = kiu.d;
        }
        Executor executor2 = idcVar.d;
        if (executor2 != null) {
            kiuVar.h = new kmj(executor2, 1);
        } else {
            kiuVar.h = kiu.d;
        }
        long j = idcVar.l;
        boolean z = j > 0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hoq.B(z, "idle timeout is %s, but must be positive", j);
        if (j / 86400000 >= 30) {
            kiuVar.q = -1L;
        } else {
            kiuVar.q = Math.max(j, kiu.c);
        }
        int i3 = idcVar.m;
        hoq.y(i3 >= 0, "maxMessageSize must be >= 0");
        jxzVar.d = i3;
        ScheduledExecutorService scheduledExecutorService = idcVar.f;
        if (scheduledExecutorService != null) {
            jxzVar.a = scheduledExecutorService;
        }
        icv icvVar = idcVar.i;
        jwz jwzVar2 = null;
        if (icvVar != null) {
            hjr it = icvVar.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((icu) it.next()).a() != null) {
                    kiuVar.v = true;
                    int i4 = hel.d;
                    heg hegVar = new heg(4);
                    hjr it2 = icvVar.a().iterator();
                    while (it2.hasNext()) {
                        icu icuVar = (icu) it2.next();
                        hen henVar = new hen(4);
                        hen henVar2 = new hen(4);
                        henVar2.g("service", icuVar.c());
                        if (icuVar.b() != null) {
                            String str = icuVar.b().b;
                            int lastIndexOf = str.lastIndexOf(47);
                            henVar2.g("method", lastIndexOf == -1 ? null : str.substring(lastIndexOf + 1));
                        }
                        henVar.g("name", hel.q(henVar2.d(true)));
                        ict a = icuVar.a();
                        if (a != null && a.f()) {
                            hen henVar3 = new hen(4);
                            henVar3.g("maxAttempts", Double.valueOf(a.d()));
                            henVar3.g("initialBackoff", a.b() + "s");
                            henVar3.g("maxBackoff", a.c() + "s");
                            henVar3.g("backoffMultiplier", Double.valueOf(a.a()));
                            henVar3.g("retryableStatusCodes", G(a.e(), new gxw(8)));
                            henVar.f(her.j("retryPolicy", henVar3.d(true)).entrySet());
                        }
                        hegVar.h(henVar.d(true));
                    }
                    kiuVar.x = kiu.m(her.j("methodConfig", hegVar.g()));
                }
            }
        }
        Integer num = idcVar.j;
        if (num != null) {
            int intValue = num.intValue();
            jxzVar.g = true;
            jxzVar.h = intValue;
        }
        Integer num2 = idcVar.k;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            jxzVar.e = true;
            jxzVar.f = intValue2;
        }
        jxz jxzVar2 = (jxz) kiuVar.F.a;
        kea keaVar = new kea(new keb(jxzVar2.b, jxzVar2.e, jxzVar2.f, jxzVar2.g, jxzVar2.h), huf.a, jxzVar2.a, jxzVar2.d, new kmt(jxzVar2.i.a));
        kuq o = jxy.a ? kiu.o(kiuVar.l, kiuVar.j) : kiu.n(kiuVar.l, kiuVar.j);
        Set singleton = Collections.singleton(InetSocketAddress.class);
        if (singleton != null && !singleton.containsAll(((kar) o.b).e())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", ((kar) o.b).c(), o.a));
        }
        ?? r8 = o.a;
        Object obj2 = o.b;
        kmj kmjVar = new kmj(khd.n, 0);
        hac hacVar = khd.p;
        r8.toString();
        List<jwz> list = kiuVar.i;
        ArrayList arrayList = new ArrayList(list.size());
        for (jwz jwzVar3 : list) {
            int i5 = i2;
            if (jwzVar3 instanceof kit) {
                jzp jzpVar = ((kit) jwzVar3).a;
                throw null;
            }
            arrayList.add(jwzVar3);
            i2 = i5;
        }
        int i6 = i2;
        ixa.a();
        if (kiuVar.z) {
            Method method = kiu.f;
            if (method != null) {
                try {
                    valueOf = Boolean.valueOf(kiuVar.A);
                    valueOf2 = Boolean.valueOf(kiuVar.B);
                    i = 0;
                } catch (IllegalAccessException e) {
                    e = e;
                    i = 0;
                } catch (InvocationTargetException e2) {
                    e = e2;
                    i = 0;
                }
                try {
                    Boolean valueOf3 = Boolean.valueOf(kiuVar.C);
                    Object[] objArr = new Object[4];
                    objArr[0] = valueOf;
                    objArr[i6] = valueOf2;
                    objArr[2] = false;
                    objArr[3] = valueOf3;
                    jwzVar = (jwz) method.invoke(null, objArr);
                } catch (IllegalAccessException e3) {
                    e = e3;
                    kiu.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e);
                    jwzVar = null;
                    if (jwzVar != null) {
                    }
                    if (kiuVar.D) {
                    }
                    kiw kiwVar = new kiw(new kiq(kiuVar, keaVar, r8, (kar) obj2, kmjVar, hacVar, arrayList, kmr.a));
                    jwz[] jwzVarArr = new jwz[i6];
                    jwzVarArr[0] = new djx(new dkc(idcVar.h));
                    return iwu.b(kiwVar, jwzVarArr);
                } catch (InvocationTargetException e4) {
                    e = e4;
                    kiu.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e);
                    jwzVar = null;
                    if (jwzVar != null) {
                    }
                    if (kiuVar.D) {
                    }
                    kiw kiwVar2 = new kiw(new kiq(kiuVar, keaVar, r8, (kar) obj2, kmjVar, hacVar, arrayList, kmr.a));
                    jwz[] jwzVarArr2 = new jwz[i6];
                    jwzVarArr2[0] = new djx(new dkc(idcVar.h));
                    return iwu.b(kiwVar2, jwzVarArr2);
                }
                if (jwzVar != null) {
                    arrayList.add(i, jwzVar);
                }
            } else {
                i = 0;
            }
            jwzVar = null;
            if (jwzVar != null) {
            }
        }
        if (kiuVar.D) {
            try {
                jwzVar2 = (jwz) Class.forName("kdz").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
            } catch (ClassNotFoundException e5) {
                kiu.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
            } catch (IllegalAccessException e6) {
                kiu.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
            } catch (NoSuchMethodException e7) {
                kiu.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e7);
            } catch (InvocationTargetException e8) {
                kiu.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e8);
            }
            if (jwzVar2 != null) {
                arrayList.add(0, jwzVar2);
            }
        }
        kiw kiwVar22 = new kiw(new kiq(kiuVar, keaVar, r8, (kar) obj2, kmjVar, hacVar, arrayList, kmr.a));
        jwz[] jwzVarArr22 = new jwz[i6];
        jwzVarArr22[0] = new djx(new dkc(idcVar.h));
        return iwu.b(kiwVar22, jwzVarArr22);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Set] */
    public static void ar(List list) {
        Set<iyi> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (iyi iyiVar : (Set) it2.next()) {
                        for (ian ianVar : ((iah) iyiVar.c).b) {
                            if (ianVar.a() && (set = (Set) hashMap.get(new iam(ianVar.a, ianVar.b()))) != null) {
                                for (iyi iyiVar2 : set) {
                                    iyiVar.b.add(iyiVar2);
                                    iyiVar2.a.add(iyiVar);
                                }
                            }
                        }
                    }
                }
                HashSet<iyi> hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (iyi iyiVar3 : hashSet) {
                    if (iyiVar3.b()) {
                        hashSet2.add(iyiVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    iyi iyiVar4 = (iyi) hashSet2.iterator().next();
                    hashSet2.remove(iyiVar4);
                    i++;
                    for (iyi iyiVar5 : iyiVar4.b) {
                        iyiVar5.a.remove(iyiVar4);
                        if (iyiVar5.b()) {
                            hashSet2.add(iyiVar5);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (iyi iyiVar6 : hashSet) {
                    if (!iyiVar6.b() && !iyiVar6.b.isEmpty()) {
                        arrayList.add(iyiVar6.c);
                    }
                }
                throw new iao(arrayList);
            }
            iah iahVar = (iah) it.next();
            iyi iyiVar7 = new iyi(iahVar);
            for (iaz iazVar : iahVar.a) {
                iam iamVar = new iam(iazVar, !iahVar.c());
                if (!hashMap.containsKey(iamVar)) {
                    hashMap.put(iamVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(iamVar);
                if (!set2.isEmpty() && !iamVar.a) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", iazVar));
                }
                set2.add(iyiVar7);
            }
        }
    }

    public static ComponentRegistrar as(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new ias(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new ias(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new ias(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new ias(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new ias(String.format("Could not instantiate %s", str), e4);
        }
    }

    public static Object at(iai iaiVar, Class cls) {
        icd a = iaiVar.a(new iaz(iay.class, cls));
        if (a == null) {
            return null;
        }
        return a.a();
    }

    public static Set au(iai iaiVar, Class cls) {
        iaz iazVar = new iaz(iay.class, cls);
        ibb ibbVar = (ibb) iaiVar;
        if (ibbVar.a.contains(iazVar)) {
            return (Set) ibbVar.b.c(iazVar).a();
        }
        throw new iap(String.format("Attempting to request an undeclared dependency Set<%s>.", iazVar));
    }

    public static Long av(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return Long.valueOf(ByteBuffer.wrap(messageDigest.digest()).getLong());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void aw(Enum r0, Object obj, Map map, Map map2) {
        map.put(r0, obj);
        map2.put(obj, r0);
    }

    public static boolean ax(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !hyh.a();
        }
        if (hyh.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                hyh.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = false;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static void ay() {
        Thread.currentThread().interrupt();
    }

    public static void az(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static ggn bA(boolean z) {
        return z ? ggn.a : ggn.b;
    }

    public static ggn bB(final double d) {
        return new ggn(new kri() { // from class: ggm
            @Override // defpackage.kri
            public final Object a() {
                return Double.valueOf(d);
            }
        }, 3, null, false);
    }

    public static ggn bC(final long j) {
        return new ggn(new kri() { // from class: ggl
            @Override // defpackage.kri
            public final Object a() {
                return Long.valueOf(j);
            }
        }, 1, null, false);
    }

    public static ggn bD(String str) {
        return new ggn(new ggy(str, 1), 4, null, false);
    }

    public static /* synthetic */ String bE(int i) {
        switch (i) {
            case 1:
                return "LONG_VALUE";
            case 2:
                return "BOOLEAN_VALUE";
            case 3:
                return "DOUBLE_VALUE";
            case 4:
                return "STRING_VALUE";
            case 5:
                return "BYTES_VALUE";
            case 6:
                return "PROTO_VALUE";
            case 7:
                return "FLAGVALUE_NOT_SET";
            default:
                return "null";
        }
    }

    public static int bF(int i) {
        switch (i) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public static /* synthetic */ ggj bG(jkj jkjVar) {
        jkp q = jkjVar.q();
        q.getClass();
        return (ggj) q;
    }

    public static void bH(Throwable th) {
        throw new gey(th);
    }

    public static hvi bI(hvi hviVar) {
        return hoq.at(hviVar, new fxn(5), huf.a);
    }

    public static hvi bJ() {
        return aI(new UnsupportedOperationException("A NoAccountWorker or AccountWorker used by a TikTokWorkSpec with setExpedited() must override getForegroundInfoAsync() in order to support API levels < 31."));
    }

    public static String bK(String str, gzp gzpVar) {
        if (!gzpVar.f()) {
            return str;
        }
        return str + "_proc<" + gzpVar.b() + ">";
    }

    public static hvi bL(hvi hviVar, Callable callable, Executor executor) {
        hvj hvjVar = new hvj(callable);
        hviVar.c(hvjVar, executor);
        bM(hviVar, hvjVar);
        return hvjVar;
    }

    public static void bM(hvi hviVar, hvi hviVar2) {
        hviVar2.c(new evb(hviVar2, hviVar, 9), huf.a);
    }

    public static /* synthetic */ Uri bN(cfe cfeVar, gpj gpjVar, String str) {
        str.getClass();
        gpk gpkVar = cfeVar.e(str) ? new gpk(1, 1) : new gpk(1, 2);
        Uri c = gpjVar.c(gpkVar, File.separator + "phenotype" + File.separator + str);
        c.getClass();
        return c;
    }

    public static hvi bO(gce gceVar, String str, int i, bvw bvwVar) {
        return gceVar.c(str, i, Collections.singletonList(bvwVar));
    }

    private static her bP(Iterator it, gzf gzfVar, hen henVar) {
        while (it.hasNext()) {
            Object next = it.next();
            henVar.g(gzfVar.a(next), next);
        }
        try {
            return henVar.d(true);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    private static Context bQ(Context context, Class... clsArr) {
        loop0: while (context instanceof ContextWrapper) {
            for (Class cls : clsArr) {
                if (cls.isInstance(context)) {
                    break loop0;
                }
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static int ba(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int bb(int i, int i2) {
        hoq.D(true, "min (%s) must be less than or equal to max (%s)", i2, 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static Bundle bc(bd bdVar) {
        Bundle bundle = bdVar.n;
        return bundle == null ? new Bundle() : bundle;
    }

    public static void bd(Activity activity) {
        if (activity == null) {
            throw new IllegalStateException("Attempted use of the activity when it is null");
        }
    }

    public static boolean be(Context context) {
        return !((Boolean) ((gme) bp(context, gme.class)).i().d(false)).booleanValue();
    }

    public static Context bf(View view) {
        if (view.getParent() instanceof View) {
            return bQ(((View) view.getParent()).getContext(), jrg.class, Activity.class);
        }
        return null;
    }

    public static boolean bg(Context context) {
        Context bQ = bQ(context, jrg.class);
        if (bQ instanceof jrg) {
            jrg jrgVar = (jrg) bQ;
            if (jrgVar.a != null) {
                for (bd a = jrgVar.a(); a != null; a = a.F) {
                    if (a.t) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static Object bh(jrr jrrVar, Class cls) {
        try {
            jrq b = jrrVar.b();
            if (b instanceof jqi) {
                jqi jqiVar = (jqi) b;
                if (!(jrrVar instanceof bd)) {
                    return cls.cast(jqiVar.f());
                }
            }
            return cls.cast(b.C());
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        }
    }

    public static void bi(Intent intent, Context context) {
        Context applicationContext = context.getApplicationContext();
        if (intent.getPackage() == null || !intent.getPackage().equals(applicationContext.getPackageName())) {
            return;
        }
        gvx.k(intent);
    }

    public static Locale bj(bd bdVar) {
        Bundle bundle = bdVar.n;
        if (bundle == null) {
            return null;
        }
        return (Locale) bundle.getSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE");
    }

    public static long bk(long j) {
        return Math.max(0L, System.currentTimeMillis() - Math.max(0L, SystemClock.elapsedRealtime() - j));
    }

    public static long bl() {
        long startElapsedRealtime;
        gzp a = eqp.a();
        if (a.f()) {
            return ((Long) a.b()).longValue();
        }
        int i = gll.c;
        startElapsedRealtime = Process.getStartElapsedRealtime();
        return startElapsedRealtime;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Set] */
    public static agh bm(bd bdVar, agh aghVar) {
        glh glhVar = (glh) imq.a(bdVar, glh.class);
        ikj u = glhVar.u();
        return new glg(bdVar, ((jqa) imq.a(glhVar.r().a, jqa.class)).k().g(aghVar), u.b, (boc) u.a);
    }

    public static String bn(String str) {
        return str == null ? "103243289" : "103243289_".concat(new kud("[^A-Za-z0-9\\-_:]").a(str, "_"));
    }

    public static void bo(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.writeInt(i);
        randomAccessFile.seek(0L);
    }

    public static Object bp(Context context, Class cls) {
        context.getClass();
        cls.getClass();
        ComponentCallbacks2 a = iwe.a(context.getApplicationContext());
        a.getClass();
        if (!(a instanceof jrq)) {
            Class<?> cls2 = a.getClass();
            java.util.Objects.toString(cls2);
            throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls2)));
        }
        try {
            Object cast = cls.cast(((jrq) a).C());
            cast.getClass();
            return cast;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
        }
    }

    public static Object bq(Context context, Class cls, frv frvVar) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        try {
            Object cast = cls.cast(((gji) bp(applicationContext, gji.class)).y().a(frvVar));
            cast.getClass();
            return cast;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", e);
        }
    }

    public static gkg br(frv frvVar, bd bdVar) {
        gkg gkgVar;
        gkg gkgVar2;
        bd bdVar2 = bdVar;
        while (true) {
            if (bdVar2 == null) {
                gkgVar = null;
                break;
            }
            if (bdVar2 instanceof jrr) {
                jrq b = ((jrr) bdVar2).b();
                if (b instanceof gkh) {
                    gkgVar = ((gkh) b).a();
                    break;
                }
            }
            bdVar2 = bdVar2.F;
        }
        if (gkgVar != null) {
            return gkgVar;
        }
        gkj l = ((gjh) imq.a(bs(bdVar), gjh.class)).l();
        synchronized (l.b) {
            Map map = l.c;
            if (!map.containsKey(frvVar)) {
                map.put(frvVar, l.a(frvVar));
            }
            gkgVar2 = (gkg) map.get(frvVar);
        }
        return gkgVar2;
    }

    public static bnh bs(bd bdVar) {
        for (bd bdVar2 = bdVar; bdVar2 != null; bdVar2 = bdVar2.F) {
            if (bdVar2 instanceof jrr) {
                jrq b = ((jrr) bdVar2).b();
                if (b instanceof jqi) {
                    return ((jqi) b).f();
                }
            }
        }
        hoq.K(bdVar.Q() instanceof jrr, "TikTok Fragments must be attached to a TikTok Activity. Found: %s", bdVar.Q().getClass());
        jrq b2 = ((jrr) bdVar.Q()).b();
        hoq.K(b2 instanceof jqi, "TikTok Fragments must be attached to a TikTok Activity. Found: %s", bdVar.Q().getClass());
        return ((jqi) b2).f();
    }

    public static /* synthetic */ String bt(int i) {
        return i + (-1) != 0 ? "retry" : "onetry";
    }

    public static boolean bu(fwm fwmVar, Optional optional) {
        return fwmVar.l() || optional.isPresent();
    }

    public static ghm bv(ggj ggjVar, jkj jkjVar, evx evxVar) {
        if (evxVar.d) {
            String str = ggjVar.d;
            str.getClass();
            if (str.length() != 0) {
                String str2 = ggjVar.d;
                if (!jkjVar.b.M()) {
                    jkjVar.t();
                }
                etm etmVar = (etm) jkjVar.b;
                etm etmVar2 = etm.a;
                str2.getClass();
                etmVar.b |= 1;
                etmVar.c = str2;
            }
        } else {
            String str3 = ggjVar.d;
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            etm etmVar3 = (etm) jkjVar.b;
            etm etmVar4 = etm.a;
            str3.getClass();
            etmVar3.b |= 1;
            etmVar3.c = str3;
        }
        String str4 = ggjVar.c;
        str4.getClass();
        jjq jjqVar = (ggjVar.b & 4) != 0 ? ggjVar.e : null;
        long j = ggjVar.i;
        jkp q = jkjVar.q();
        q.getClass();
        return new ghm(str4, jjqVar, j, (etm) q);
    }

    public static void bw(hvi hviVar, String str) {
        aS(hviVar, gvx.f(new gai(str, 2)), huf.a);
    }

    public static hvi bx(List list) {
        return hoq.aU(list).t(new fxs(list, 7), huf.a);
    }

    public static String by(Map map, ght ghtVar) {
        String a = ghtVar.a();
        if (ksp.m(a, "#", false)) {
            throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(a)));
        }
        String str = (String) map.get(a);
        return str != null ? a.ag(str, a, "#") : a;
    }

    public static /* synthetic */ String bz(Map map, ghu ghuVar) {
        String a = ghuVar.a();
        if (ksp.m(a, "#", false)) {
            throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(a)));
        }
        String str = (String) map.get(a);
        return str != null ? a.ag(str, a, "#") : a;
    }

    public static int d(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static String e(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(String.valueOf(str));
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static char[] f(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    public static boolean g(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = hih.a;
            }
        } else {
            if (!(iterable instanceof hjo)) {
                return false;
            }
            comparator2 = ((hjo) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static int h(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static hjm i(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new hji(set, set2);
    }

    public static HashSet j(int i) {
        return new HashSet(w(i));
    }

    public static Set k() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set l() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static boolean m(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean n(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof hic) {
            collection = ((hic) collection).i();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? o(set, collection.iterator()) : P(set.iterator(), collection);
    }

    public static boolean o(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static void p(hhu hhuVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(hhuVar.p().size());
        for (Map.Entry entry : hhuVar.p().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static Object[] q(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    public static Object[] r(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = q(objArr, size);
        }
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public static void s(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException(a.Y(i, "at index "));
        }
    }

    public static void t(Object... objArr) {
        u(objArr, objArr.length);
    }

    public static void u(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            s(objArr[i2], i2);
        }
    }

    public static boolean v(hic hicVar, Object obj) {
        if (obj == hicVar) {
            return true;
        }
        if (obj instanceof hic) {
            hic hicVar2 = (hic) obj;
            if (hicVar.size() == hicVar2.size() && hicVar.j().size() == hicVar2.j().size()) {
                for (hid hidVar : hicVar2.j()) {
                    if (hicVar.b(hidVar.a) != hidVar.a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static int w(int i) {
        if (i < 3) {
            ap(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static her x(Iterable iterable, gzf gzfVar) {
        return ((iterable instanceof List) || (iterable instanceof heb)) ? bP(iterable.iterator(), gzfVar, her.h(iterable.size())) : bP(iterable.iterator(), gzfVar, new hen(4));
    }

    public static Object y(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static Object z(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public hob b() {
        return hob.b;
    }

    public hma bR() {
        return hlz.a;
    }

    protected hnu(byte[] bArr, byte[] bArr2) {
        this();
    }

    public hnu(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this();
    }

    public hnu(short[] sArr) {
    }

    public void c(String str, Level level, boolean z) {
    }
}
