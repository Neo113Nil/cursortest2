package R1;

import E.r;
import T.AbstractC0088f;
import T.C0094l;
import T.C0095m;
import T.C0097o;
import T.N;
import T.T;
import T.Z;
import T.a0;
import W.InterfaceC0113f;
import W.InterfaceC0118k;
import W.InterfaceC0119l;
import W.J;
import Y.B;
import Y.q;
import Y.t;
import a.AbstractC0124a;
import a0.C0130F;
import a0.C0146l;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b0.C0255a;
import c0.s;
import c0.u;
import f0.AbstractC0411a;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import j0.p;
import j0.v;
import j0.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import q0.C1353B;
import q0.H;
import v2.G;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements T1.b, S1.h, InterfaceC0119l, InterfaceC0118k, VideoPlayer.DisposeHandler, v, InterfaceC0113f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2358c;

    public /* synthetic */ k(Object obj, int i4, Object obj2) {
        this.f2356a = i4;
        this.f2357b = obj;
        this.f2358c = obj2;
    }

    @Override // j0.v
    public int a(Object obj) {
        Context context = (Context) this.f2357b;
        C0097o c0097o = (C0097o) this.f2358c;
        j0.o oVar = (j0.o) obj;
        String str = oVar.f13767b;
        return ((str.equals(c0097o.n) || str.equals(w.c(c0097o))) && oVar.c(context, c0097o, false) && oVar.d(c0097o)) ? 1 : 0;
    }

    @Override // W.InterfaceC0113f
    public void accept(Object obj) {
        f0.e eVar = (f0.e) this.f2357b;
        ((H) obj).b(eVar.f8491a, eVar.f8492b, (n0.g) this.f2358c);
    }

    @Override // S1.h
    public Object apply(Object obj) {
        S1.j jVar = (S1.j) this.f2357b;
        L1.j jVar2 = (L1.j) this.f2358c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        S1.a aVar = jVar.f2589d;
        ArrayList f4 = jVar.f(sQLiteDatabase, jVar2, aVar.f2571b);
        for (I1.c cVar : I1.c.values()) {
            if (cVar != jVar2.f1647c) {
                int size = aVar.f2571b - f4.size();
                if (size <= 0) {
                    break;
                }
                B1.j a3 = L1.j.a();
                a3.D(jVar2.f1645a);
                if (cVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a3.f203d = cVar;
                a3.f202c = jVar2.f1646b;
                f4.addAll(jVar.f(sQLiteDatabase, a3.h(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i4 = 0; i4 < f4.size(); i4++) {
            sb.append(((S1.b) f4.get(i4)).f2575a);
            if (i4 < f4.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                long j4 = cursor.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j4));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j4), set);
                }
                set.add(new S1.i(cursor.getString(1), cursor.getString(2)));
            }
            query.close();
            ListIterator listIterator = f4.listIterator();
            while (listIterator.hasNext()) {
                S1.b bVar = (S1.b) listIterator.next();
                long j5 = bVar.f2575a;
                if (hashMap.containsKey(Long.valueOf(j5))) {
                    L1.h c4 = bVar.f2577c.c();
                    for (S1.i iVar : (Set) hashMap.get(Long.valueOf(j5))) {
                        c4.a(iVar.f2583a, iVar.f2584b);
                    }
                    listIterator.set(new S1.b(j5, bVar.f2576b, c4.d()));
                }
            }
            return f4;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0721 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0541  */
    @Override // W.InterfaceC0119l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Object obj, C0095m c0095m) {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        r rVar;
        r rVar2;
        r rVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i16;
        boolean z4;
        int i17;
        int i18;
        L3.h hVar;
        int i19;
        C0130F c0130f;
        int i20;
        boolean z5;
        b0.h hVar2;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        C0097o c0097o;
        int i21;
        int i22;
        C0094l c0094l;
        int i23;
        b0.d dVar = (b0.d) this.f2357b;
        N n = (N) this.f2358c;
        b0.h hVar3 = (b0.h) obj;
        SparseArray sparseArray = dVar.f5273e;
        SparseArray sparseArray2 = new SparseArray(c0095m.f2805a.size());
        for (int i24 = 0; i24 < c0095m.f2805a.size(); i24++) {
            SparseBooleanArray sparseBooleanArray = c0095m.f2805a;
            AbstractC0124a.m(i24, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i24);
            C0255a c0255a = (C0255a) sparseArray.get(keyAt);
            c0255a.getClass();
            sparseArray2.append(keyAt, c0255a);
        }
        hVar3.getClass();
        if (c0095m.f2805a.size() == 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            boolean z6 = true;
            if (i25 >= c0095m.f2805a.size()) {
                break;
            }
            SparseBooleanArray sparseBooleanArray2 = c0095m.f2805a;
            AbstractC0124a.m(i25, sparseBooleanArray2.size());
            int keyAt2 = sparseBooleanArray2.keyAt(i25);
            C0255a c0255a2 = (C0255a) sparseArray2.get(keyAt2);
            c0255a2.getClass();
            if (keyAt2 == 0) {
                b0.f fVar = hVar3.f5298c;
                synchronized (fVar) {
                    try {
                        fVar.f5290d.getClass();
                        T t4 = fVar.f5291e;
                        fVar.f5291e = c0255a2.f5258b;
                        Iterator it = fVar.f5289c.values().iterator();
                        while (it.hasNext()) {
                            b0.e eVar = (b0.e) it.next();
                            if (eVar.b(t4, fVar.f5291e) && !eVar.a(c0255a2)) {
                            }
                            it.remove();
                            if (eVar.f5278a.equals(fVar.f5292f)) {
                                fVar.a(eVar);
                            }
                            if (eVar.f5282e) {
                                fVar.f5290d.d(c0255a2, eVar.f5278a);
                            }
                        }
                        fVar.d(c0255a2);
                    } finally {
                    }
                }
            } else if (keyAt2 == 11) {
                b0.f fVar2 = hVar3.f5298c;
                int i26 = hVar3.f5307l;
                synchronized (fVar2) {
                    try {
                        fVar2.f5290d.getClass();
                        if (i26 != 0) {
                            z6 = false;
                        }
                        Iterator it2 = fVar2.f5289c.values().iterator();
                        while (it2.hasNext()) {
                            b0.e eVar2 = (b0.e) it2.next();
                            if (eVar2.a(c0255a2)) {
                                it2.remove();
                                boolean equals = eVar2.f5278a.equals(fVar2.f5292f);
                                if (equals) {
                                    fVar2.a(eVar2);
                                }
                                if (eVar2.f5282e) {
                                    if (z6 && equals) {
                                        boolean z7 = eVar2.f5283f;
                                    }
                                    fVar2.f5290d.d(c0255a2, eVar2.f5278a);
                                }
                            }
                        }
                        fVar2.d(c0255a2);
                    } finally {
                    }
                }
            } else {
                hVar3.f5298c.e(c0255a2);
            }
            i25++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c0095m.f2805a.get(0)) {
            C0255a c0255a3 = (C0255a) sparseArray2.get(0);
            c0255a3.getClass();
            if (hVar3.f5306k != null) {
                hVar3.c(c0255a3.f5258b, c0255a3.f5260d);
            }
        }
        if (c0095m.f2805a.get(2) && hVar3.f5306k != null) {
            C0130F c0130f2 = (C0130F) n;
            c0130f2.L();
            G listIterator = c0130f2.f3886i0.f4147i.f15387d.f2765a.listIterator(0);
            loop4: while (true) {
                if (!listIterator.hasNext()) {
                    c0094l = null;
                    break;
                }
                Z z8 = (Z) listIterator.next();
                for (int i27 = 0; i27 < z8.f2751a; i27++) {
                    if (z8.f2755e[i27] && (c0094l = z8.f2752b.f2708d[i27].f2871r) != null) {
                        break loop4;
                    }
                }
            }
            if (c0094l != null) {
                PlaybackMetrics.Builder k4 = W.o.k(hVar3.f5306k);
                int i28 = 0;
                while (true) {
                    if (i28 >= c0094l.f2804d) {
                        i23 = 1;
                        break;
                    }
                    UUID uuid = c0094l.f2801a[i28].f2797b;
                    if (uuid.equals(AbstractC0088f.f2782d)) {
                        i23 = 3;
                        break;
                    } else if (uuid.equals(AbstractC0088f.f2783e)) {
                        i23 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC0088f.f2781c)) {
                            i23 = 6;
                            break;
                        }
                        i28++;
                    }
                }
                k4.setDrmType(i23);
            }
        }
        if (c0095m.f2805a.get(1011)) {
            hVar3.f5294A++;
        }
        T.H h2 = hVar3.o;
        if (h2 == null) {
            i8 = 4;
            i5 = 5;
            i10 = 13;
            i6 = 7;
            i7 = 6;
            i9 = 9;
        } else {
            int i29 = h2.f2661a;
            Context context = hVar3.f5296a;
            boolean z9 = hVar3.f5315w == 4;
            if (i29 == 1001) {
                rVar = new r(20, 0, 2);
                i5 = 5;
            } else {
                if (h2 instanceof C0146l) {
                    C0146l c0146l = (C0146l) h2;
                    z = c0146l.f4175c == 1;
                    i4 = c0146l.f4179g;
                } else {
                    i4 = 0;
                    z = false;
                }
                Throwable cause = h2.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    i5 = 5;
                    int i30 = 24;
                    i6 = 7;
                    i7 = 6;
                    i8 = 4;
                    i9 = 9;
                    if (z && (i4 == 0 || i4 == 1)) {
                        rVar3 = new r(35, 0, 2);
                    } else if (z && i4 == 3) {
                        rVar3 = new r(15, 0, 2);
                    } else if (z && i4 == 2) {
                        rVar3 = new r(23, 0, 2);
                    } else {
                        if (cause instanceof p) {
                            i10 = 13;
                            rVar2 = new r(13, J.y(((p) cause).f13781d), 2);
                        } else {
                            i10 = 13;
                            if (cause instanceof j0.n) {
                                rVar = new r(14, ((j0.n) cause).f13765a, 2);
                            } else if (cause instanceof OutOfMemoryError) {
                                rVar = new r(14, 0, 2);
                            } else if (cause instanceof s) {
                                rVar = new r(17, 0, 2);
                            } else if (cause instanceof u) {
                                rVar2 = new r(18, ((u) cause).f5604a, 2);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (J.x(errorCode2)) {
                                    case 6002:
                                        break;
                                    case 6003:
                                        i30 = 28;
                                        break;
                                    case 6004:
                                        i30 = 25;
                                        break;
                                    case 6005:
                                        i30 = 26;
                                        break;
                                    default:
                                        i30 = 27;
                                        break;
                                }
                                rVar2 = new r(i30, errorCode2, 2);
                            } else {
                                rVar = new r(22, 0, 2);
                            }
                            timeSinceCreatedMillis = b0.g.d().setTimeSinceCreatedMillis(elapsedRealtime - hVar3.f5300e);
                            errorCode = timeSinceCreatedMillis.setErrorCode(rVar.f437b);
                            subErrorCode = errorCode.setSubErrorCode(rVar.f438c);
                            exception = subErrorCode.setException(h2);
                            build = exception.build();
                            hVar3.f5297b.execute(new e(hVar3, 15, build));
                            hVar3.f5295B = true;
                            hVar3.o = null;
                        }
                        rVar = rVar2;
                        timeSinceCreatedMillis = b0.g.d().setTimeSinceCreatedMillis(elapsedRealtime - hVar3.f5300e);
                        errorCode = timeSinceCreatedMillis.setErrorCode(rVar.f437b);
                        subErrorCode = errorCode.setSubErrorCode(rVar.f438c);
                        exception = subErrorCode.setException(h2);
                        build = exception.build();
                        hVar3.f5297b.execute(new e(hVar3, 15, build));
                        hVar3.f5295B = true;
                        hVar3.o = null;
                    }
                    rVar = rVar3;
                    i10 = 13;
                    timeSinceCreatedMillis = b0.g.d().setTimeSinceCreatedMillis(elapsedRealtime - hVar3.f5300e);
                    errorCode = timeSinceCreatedMillis.setErrorCode(rVar.f437b);
                    subErrorCode = errorCode.setSubErrorCode(rVar.f438c);
                    exception = subErrorCode.setException(h2);
                    build = exception.build();
                    hVar3.f5297b.execute(new e(hVar3, 15, build));
                    hVar3.f5295B = true;
                    hVar3.o = null;
                } else if (cause instanceof Y.v) {
                    i5 = 5;
                    rVar = new r(5, ((Y.v) cause).f3743c, 2);
                } else {
                    i5 = 5;
                    if ((cause instanceof Y.u) || (cause instanceof T.G)) {
                        i11 = 4;
                        i12 = 6;
                        i13 = 7;
                        rVar = new r(z9 ? 10 : 11, 0, 2);
                    } else {
                        boolean z10 = cause instanceof t;
                        if (z10 || (cause instanceof B)) {
                            i14 = 9;
                            if (W.s.a(context).b() == 1) {
                                rVar = new r(3, 0, 2);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    rVar = new r(6, 0, 2);
                                    i9 = 9;
                                    i7 = 6;
                                    i10 = 13;
                                    i6 = 7;
                                } else {
                                    i12 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        rVar = new r(7, 0, 2);
                                        i9 = 9;
                                        i7 = 6;
                                        i6 = 7;
                                        i10 = 13;
                                    } else {
                                        i13 = 7;
                                        if (z10 && ((t) cause).f3742b == 1) {
                                            rVar = new r(4, 0, 2);
                                            i9 = 9;
                                            i8 = 4;
                                            i7 = 6;
                                            i6 = 7;
                                            i10 = 13;
                                            timeSinceCreatedMillis = b0.g.d().setTimeSinceCreatedMillis(elapsedRealtime - hVar3.f5300e);
                                            errorCode = timeSinceCreatedMillis.setErrorCode(rVar.f437b);
                                            subErrorCode = errorCode.setSubErrorCode(rVar.f438c);
                                            exception = subErrorCode.setException(h2);
                                            build = exception.build();
                                            hVar3.f5297b.execute(new e(hVar3, 15, build));
                                            hVar3.f5295B = true;
                                            hVar3.o = null;
                                        } else {
                                            i11 = 4;
                                            rVar = new r(8, 0, 2);
                                        }
                                    }
                                }
                                i8 = 4;
                                timeSinceCreatedMillis = b0.g.d().setTimeSinceCreatedMillis(elapsedRealtime - hVar3.f5300e);
                                errorCode = timeSinceCreatedMillis.setErrorCode(rVar.f437b);
                                subErrorCode = errorCode.setSubErrorCode(rVar.f438c);
                                exception = subErrorCode.setException(h2);
                                build = exception.build();
                                hVar3.f5297b.execute(new e(hVar3, 15, build));
                                hVar3.f5295B = true;
                                hVar3.o = null;
                            }
                        } else if (i29 == 1002) {
                            rVar = new r(21, 0, 2);
                        } else if (cause instanceof f0.c) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int y4 = J.y(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (J.x(y4)) {
                                    case 6002:
                                        i15 = 24;
                                        break;
                                    case 6003:
                                        i15 = 28;
                                        break;
                                    case 6004:
                                        i15 = 25;
                                        break;
                                    case 6005:
                                        i15 = 26;
                                        break;
                                    default:
                                        i15 = 27;
                                        break;
                                }
                                rVar = new r(i15, y4, 2);
                            } else {
                                rVar = cause3 instanceof MediaDrmResetException ? new r(27, 0, 2) : cause3 instanceof NotProvisionedException ? new r(24, 0, 2) : cause3 instanceof DeniedByServerException ? new r(29, 0, 2) : cause3 instanceof f0.k ? new r(23, 0, 2) : cause3 instanceof AbstractC0411a ? new r(28, 0, 2) : new r(30, 0, 2);
                            }
                        } else if ((cause instanceof q) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            rVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new r(32, 0, 2) : new r(31, 0, 2);
                        } else {
                            i14 = 9;
                            rVar = new r(9, 0, 2);
                        }
                        i9 = i14;
                        i10 = 13;
                        i6 = 7;
                        i7 = 6;
                        i8 = 4;
                        timeSinceCreatedMillis = b0.g.d().setTimeSinceCreatedMillis(elapsedRealtime - hVar3.f5300e);
                        errorCode = timeSinceCreatedMillis.setErrorCode(rVar.f437b);
                        subErrorCode = errorCode.setSubErrorCode(rVar.f438c);
                        exception = subErrorCode.setException(h2);
                        build = exception.build();
                        hVar3.f5297b.execute(new e(hVar3, 15, build));
                        hVar3.f5295B = true;
                        hVar3.o = null;
                    }
                    i8 = i11;
                    i7 = i12;
                    i6 = i13;
                    i10 = 13;
                    i9 = 9;
                    timeSinceCreatedMillis = b0.g.d().setTimeSinceCreatedMillis(elapsedRealtime - hVar3.f5300e);
                    errorCode = timeSinceCreatedMillis.setErrorCode(rVar.f437b);
                    subErrorCode = errorCode.setSubErrorCode(rVar.f438c);
                    exception = subErrorCode.setException(h2);
                    build = exception.build();
                    hVar3.f5297b.execute(new e(hVar3, 15, build));
                    hVar3.f5295B = true;
                    hVar3.o = null;
                }
            }
            i10 = 13;
            i6 = 7;
            i7 = 6;
            i8 = 4;
            i9 = 9;
            timeSinceCreatedMillis = b0.g.d().setTimeSinceCreatedMillis(elapsedRealtime - hVar3.f5300e);
            errorCode = timeSinceCreatedMillis.setErrorCode(rVar.f437b);
            subErrorCode = errorCode.setSubErrorCode(rVar.f438c);
            exception = subErrorCode.setException(h2);
            build = exception.build();
            hVar3.f5297b.execute(new e(hVar3, 15, build));
            hVar3.f5295B = true;
            hVar3.o = null;
        }
        if (c0095m.f2805a.get(2)) {
            C0130F c0130f3 = (C0130F) n;
            c0130f3.L();
            a0 a0Var = c0130f3.f3886i0.f4147i.f15387d;
            boolean a3 = a0Var.a(2);
            boolean a4 = a0Var.a(1);
            boolean a5 = a0Var.a(3);
            if (a3 || a4 || a5) {
                if (a3) {
                    i17 = 3;
                    i16 = i8;
                    c0097o = null;
                } else {
                    c0097o = null;
                    if (Objects.equals(hVar3.f5312s, null)) {
                        i17 = 3;
                        i16 = i8;
                    } else {
                        if (hVar3.f5312s == null) {
                            i21 = 3;
                            i22 = 1;
                        } else {
                            i21 = 3;
                            i22 = 0;
                        }
                        hVar3.f5312s = null;
                        i17 = i21;
                        i16 = i8;
                        i18 = 8;
                        hVar3.e(1, elapsedRealtime, null, i22);
                        if (!a4 && !Objects.equals(hVar3.f5313t, c0097o)) {
                            int i31 = hVar3.f5313t != null ? 1 : 0;
                            hVar3.f5313t = c0097o;
                            hVar3.e(0, elapsedRealtime, c0097o, i31);
                        }
                        if (!a5 && !Objects.equals(hVar3.f5314u, c0097o)) {
                            int i32 = hVar3.f5314u != null ? 1 : 0;
                            hVar3.f5314u = c0097o;
                            hVar3.e(2, elapsedRealtime, c0097o, i32);
                        }
                        hVar = c0097o;
                        if (hVar3.a(hVar3.f5309p)) {
                            L3.h hVar4 = hVar3.f5309p;
                            C0097o c0097o2 = (C0097o) hVar4.f1682d;
                            if (c0097o2.v != -1) {
                                int i33 = hVar4.f1680b;
                                if (!Objects.equals(hVar3.f5312s, c0097o2)) {
                                    int i34 = (hVar3.f5312s == null && i33 == 0) ? 1 : i33;
                                    hVar3.f5312s = c0097o2;
                                    hVar3.e(1, elapsedRealtime, c0097o2, i34);
                                }
                                hVar3.f5309p = hVar;
                            }
                        }
                        if (hVar3.a(hVar3.f5310q)) {
                            L3.h hVar5 = hVar3.f5310q;
                            C0097o c0097o3 = (C0097o) hVar5.f1682d;
                            int i35 = hVar5.f1680b;
                            if (!Objects.equals(hVar3.f5313t, c0097o3)) {
                                int i36 = (hVar3.f5313t == null && i35 == 0) ? 1 : i35;
                                hVar3.f5313t = c0097o3;
                                hVar3.e(0, elapsedRealtime, c0097o3, i36);
                            }
                            hVar3.f5310q = hVar;
                        }
                        if (hVar3.a(hVar3.f5311r)) {
                            L3.h hVar6 = hVar3.f5311r;
                            C0097o c0097o4 = (C0097o) hVar6.f1682d;
                            int i37 = hVar6.f1680b;
                            if (!Objects.equals(hVar3.f5314u, c0097o4)) {
                                int i38 = (hVar3.f5314u == null && i37 == 0) ? 1 : i37;
                                hVar3.f5314u = c0097o4;
                                hVar3.e(2, elapsedRealtime, c0097o4, i38);
                            }
                            hVar3.f5311r = hVar;
                        }
                        switch (W.s.a(hVar3.f5296a).b()) {
                            case 0:
                                i19 = 0;
                                break;
                            case 1:
                                i19 = i9;
                                break;
                            case 2:
                                i19 = 2;
                                break;
                            case 3:
                                i19 = i16;
                                break;
                            case 4:
                                i19 = i5;
                                break;
                            case 5:
                                i19 = i7;
                                break;
                            case 6:
                            case 8:
                            default:
                                i19 = 1;
                                break;
                            case 7:
                                i19 = i17;
                                break;
                            case 9:
                                i19 = i18;
                                break;
                            case 10:
                                i19 = i6;
                                break;
                        }
                        if (i19 != hVar3.n) {
                            hVar3.n = i19;
                            networkType = b0.g.c().setNetworkType(i19);
                            timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - hVar3.f5300e);
                            build3 = timeSinceCreatedMillis3.build();
                            hVar3.f5297b.execute(new e(hVar3, 14, build3));
                        }
                        c0130f = (C0130F) n;
                        if (c0130f.u() != 2) {
                            hVar3.v = false;
                        }
                        c0130f.L();
                        if (c0130f.f3886i0.f4144f == null) {
                            hVar3.f5316x = false;
                            i20 = 10;
                        } else {
                            i20 = 10;
                            if (c0095m.f2805a.get(10)) {
                                hVar3.f5316x = true;
                            }
                        }
                        int u4 = c0130f.u();
                        if (hVar3.v) {
                            i10 = i5;
                        } else if (!hVar3.f5316x) {
                            if (u4 == i16) {
                                i10 = 11;
                            } else {
                                i10 = 12;
                                if (u4 == 2) {
                                    int i39 = hVar3.f5308m;
                                    if (i39 == 0 || i39 == 2 || i39 == 12) {
                                        i10 = 2;
                                    } else if (c0130f.t()) {
                                        c0130f.L();
                                        i10 = c0130f.f3886i0.n != 0 ? i20 : i7;
                                    } else {
                                        i10 = i6;
                                    }
                                } else {
                                    if (u4 != i17) {
                                        z5 = true;
                                        if (u4 != 1 || hVar3.f5308m == 0) {
                                            i10 = hVar3.f5308m;
                                        }
                                        if (hVar3.f5308m != i10) {
                                            hVar3.f5308m = i10;
                                            hVar3.f5295B = z5;
                                            state = b0.g.g().setState(hVar3.f5308m);
                                            timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - hVar3.f5300e);
                                            build2 = timeSinceCreatedMillis2.build();
                                            hVar3.f5297b.execute(new e(hVar3, 17, build2));
                                        }
                                        if (c0095m.f2805a.get(1028)) {
                                            return;
                                        }
                                        b0.f fVar3 = hVar3.f5298c;
                                        C0255a c0255a4 = (C0255a) sparseArray2.get(1028);
                                        c0255a4.getClass();
                                        synchronized (fVar3) {
                                            try {
                                                String str = fVar3.f5292f;
                                                if (str != null) {
                                                    b0.e eVar3 = (b0.e) fVar3.f5289c.get(str);
                                                    eVar3.getClass();
                                                    fVar3.a(eVar3);
                                                }
                                                Iterator it3 = fVar3.f5289c.values().iterator();
                                                while (it3.hasNext()) {
                                                    b0.e eVar4 = (b0.e) it3.next();
                                                    it3.remove();
                                                    if (eVar4.f5282e && (hVar2 = fVar3.f5290d) != null) {
                                                        hVar2.d(c0255a4, eVar4.f5278a);
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        return;
                                    }
                                    if (c0130f.t()) {
                                        c0130f.L();
                                        i10 = c0130f.f3886i0.n != 0 ? i9 : i17;
                                    } else {
                                        i10 = i16;
                                    }
                                }
                            }
                        }
                        z5 = true;
                        if (hVar3.f5308m != i10) {
                        }
                        if (c0095m.f2805a.get(1028)) {
                        }
                    }
                }
                i18 = 8;
                if (!a4) {
                    if (hVar3.f5313t != null) {
                    }
                    hVar3.f5313t = c0097o;
                    hVar3.e(0, elapsedRealtime, c0097o, i31);
                }
                if (!a5) {
                    if (hVar3.f5314u != null) {
                    }
                    hVar3.f5314u = c0097o;
                    hVar3.e(2, elapsedRealtime, c0097o, i32);
                }
                hVar = c0097o;
                if (hVar3.a(hVar3.f5309p)) {
                }
                if (hVar3.a(hVar3.f5310q)) {
                }
                if (hVar3.a(hVar3.f5311r)) {
                }
                switch (W.s.a(hVar3.f5296a).b()) {
                }
                if (i19 != hVar3.n) {
                }
                c0130f = (C0130F) n;
                if (c0130f.u() != 2) {
                }
                c0130f.L();
                if (c0130f.f3886i0.f4144f == null) {
                }
                int u42 = c0130f.u();
                if (hVar3.v) {
                }
                z5 = true;
                if (hVar3.f5308m != i10) {
                }
                if (c0095m.f2805a.get(1028)) {
                }
            } else {
                i17 = 3;
                i16 = i8;
                z4 = false;
            }
        } else {
            i16 = i8;
            z4 = false;
            i17 = 3;
        }
        i18 = 8;
        hVar = z4;
        if (hVar3.a(hVar3.f5309p)) {
        }
        if (hVar3.a(hVar3.f5310q)) {
        }
        if (hVar3.a(hVar3.f5311r)) {
        }
        switch (W.s.a(hVar3.f5296a).b()) {
        }
        if (i19 != hVar3.n) {
        }
        c0130f = (C0130F) n;
        if (c0130f.u() != 2) {
        }
        c0130f.L();
        if (c0130f.f3886i0.f4144f == null) {
        }
        int u422 = c0130f.u();
        if (hVar3.v) {
        }
        z5 = true;
        if (hVar3.f5308m != i10) {
        }
        if (c0095m.f2805a.get(1028)) {
        }
    }

    @Override // T1.b
    public Object c() {
        switch (this.f2356a) {
            case 0:
                m mVar = (m) this.f2357b;
                Iterable iterable = (Iterable) this.f2358c;
                S1.j jVar = (S1.j) mVar.f2364c;
                jVar.getClass();
                if (iterable.iterator().hasNext()) {
                    jVar.a().compileStatement("DELETE FROM events WHERE _id in " + S1.j.s(iterable)).execute();
                    break;
                }
                break;
            default:
                m mVar2 = (m) this.f2357b;
                for (Map.Entry entry : ((HashMap) this.f2358c).entrySet()) {
                    ((S1.j) mVar2.f2370i).k(((Integer) entry.getValue()).intValue(), O1.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // W.InterfaceC0118k
    public void invoke(Object obj) {
        C0255a c0255a = (C0255a) this.f2357b;
        n0.g gVar = (n0.g) this.f2358c;
        b0.h hVar = (b0.h) obj;
        hVar.getClass();
        C1353B c1353b = c0255a.f5260d;
        if (c1353b == null) {
            return;
        }
        C0097o c0097o = (C0097o) gVar.f14563f;
        c0097o.getClass();
        int i4 = gVar.f14560c;
        b0.f fVar = hVar.f5298c;
        T t4 = c0255a.f5258b;
        c1353b.getClass();
        L3.h hVar2 = new L3.h(c0097o, i4, fVar.c(t4, c1353b), 1);
        int i5 = gVar.f14559b;
        if (i5 != 0) {
            if (i5 == 1) {
                hVar.f5310q = hVar2;
                return;
            } else if (i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                hVar.f5311r = hVar2;
                return;
            }
        }
        hVar.f5309p = hVar2;
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayer.DisposeHandler
    public void onDispose() {
        VideoPlayerPlugin.lambda$registerPlayerInstance$0((BinaryMessenger) this.f2357b, (String) this.f2358c);
    }
}
