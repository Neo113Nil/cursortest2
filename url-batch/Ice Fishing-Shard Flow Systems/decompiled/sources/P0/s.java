package P0;

import D6.C;
import D6.E;
import T6.v;
import T6.w;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import h0.C0465k;
import h4.x;
import i.C0511M;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.t;
import io.flutter.plugin.platform.u;
import j4.C0578g;
import j5.C0583a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import r1.InterfaceC0844c;
import y4.C1046o;

/* loaded from: classes.dex */
public final class s implements v, x, io.flutter.plugin.platform.m, r4.k, s4.o, s4.d, q6.d {

    /* renamed from: d, reason: collision with root package name */
    public Object f2251d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2252e;

    public /* synthetic */ s(Object obj, Object obj2) {
        this.f2251d = obj;
        this.f2252e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s v(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new s(fileChannel, fileLock);
                } catch (IOException e7) {
                    e = e7;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e8) {
                    e = e8;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLock != null) {
                    }
                    if (fileChannel != null) {
                    }
                    return null;
                } catch (OverlappingFileLockException e9) {
                    e = e9;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLock != null) {
                    }
                    if (fileChannel != null) {
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e10) {
                e = e10;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e11) {
            e = e11;
            fileChannel = null;
            fileLock = null;
        }
    }

    public void A(boolean z7, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.f2251d;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.f2252e;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z7 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z7 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((K1.h) entry2.getKey()).c(new r1.f(status));
            }
        }
    }

    @Override // T6.v
    public w a() {
        return (H6.g) this.f2252e;
    }

    @Override // h4.x
    public void b(KeyEvent keyEvent, B6.e eVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            eVar.c(false);
            return;
        }
        Character a7 = ((h4.v) this.f2252e).a(keyEvent.getUnicodeChar());
        boolean z7 = action != 0;
        l4.b bVar = (l4.b) this.f2251d;
        A4.b bVar2 = new A4.b(13, eVar);
        i iVar = (i) bVar.f6272e;
        HashMap hashMap = new HashMap();
        hashMap.put(com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_KEY, z7 ? "keyup" : "keydown");
        hashMap.put("keymap", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a7.toString());
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        iVar.l(hashMap, new A4.b(14, bVar2));
    }

    @Override // r4.k
    public void c(boolean z7) {
        ((u) ((u) this.f2251d).f5752E.f5724e).f5770z = z7;
    }

    @Override // io.flutter.plugin.platform.m
    public void d(io.flutter.view.g gVar) {
        ((u) this.f2251d).f5761q.f5690a = gVar;
        ((t) this.f2252e).f5737p.f5690a = gVar;
    }

    @Override // q6.d
    public Object e(q6.e eVar, V5.b bVar) {
        Object e7 = ((q6.d) this.f2251d).e(new C1046o(eVar, (T.d) this.f2252e, 2), bVar);
        return e7 == W5.a.f2787d ? e7 : Unit.f6114a;
    }

    @Override // r4.k
    public void f(r4.j jVar, A4.b bVar) {
        if (((t) this.f2252e).m(jVar.f7496a) != null) {
            return;
        }
        ((u) this.f2251d).f5752E.f(jVar, bVar);
    }

    @Override // s4.d
    public void g(ByteBuffer byteBuffer, C0578g c0578g) {
        s4.q qVar = (s4.q) this.f2252e;
        s4.r rVar = qVar.f7771c;
        try {
            ((s4.o) this.f2251d).onMethodCall(rVar.e(byteBuffer), new r4.l(this, 1, c0578g));
        } catch (RuntimeException e7) {
            Log.e("MethodChannel#" + qVar.f7770b, "Failed to handle method call", e7);
            c0578g.a(rVar.c(e7.getMessage(), Log.getStackTraceString(e7)));
        }
    }

    @Override // r4.k
    public void h(int i2, double d7, double d8) {
        if (((t) this.f2252e).m(i2) != null) {
            return;
        }
        ((u) this.f2251d).f5752E.h(i2, d7, d8);
    }

    @Override // r4.k
    public void i(int i2, int i5) {
        t tVar = (t) this.f2252e;
        if (tVar.m(i2) != null) {
            tVar.f5746y.i(i2, i5);
        } else {
            ((u) this.f2251d).f5752E.i(i2, i5);
        }
    }

    @Override // io.flutter.plugin.platform.m
    public boolean j(int i2) {
        t tVar = (t) this.f2252e;
        if (tVar.m(i2) == null) {
            return ((u) this.f2251d).j(i2);
        }
        tVar.getClass();
        return false;
    }

    @Override // r4.k
    public void k(r4.h hVar) {
        ((u) this.f2251d).f5752E.k(hVar);
    }

    @Override // r4.k
    public void l(r4.i iVar) {
        t tVar = (t) this.f2252e;
        if (tVar.m(iVar.f7481a) != null) {
            tVar.f5746y.l(iVar);
        } else {
            ((u) this.f2251d).f5752E.l(iVar);
        }
    }

    @Override // io.flutter.plugin.platform.m
    public View m(int i2) {
        t tVar = (t) this.f2252e;
        return tVar.m(i2) != null ? tVar.m(i2) : ((u) this.f2251d).m(i2);
    }

    @Override // r4.k
    public void n(int i2) {
        t tVar = (t) this.f2252e;
        if (tVar.m(i2) != null) {
            tVar.f5746y.n(i2);
        } else {
            ((u) this.f2251d).f5752E.n(i2);
        }
    }

    @Override // s4.o
    public void onMethodCall(s4.n nVar, s4.p pVar) {
        C0511M c0511m = (C0511M) this.f2252e;
        if (((D0.j) c0511m.f5381e) == null) {
            ((r4.l) pVar).success((Map) this.f2251d);
            return;
        }
        String str = nVar.f7767a;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            ((r4.l) pVar).notImplemented();
            return;
        }
        try {
            this.f2251d = Collections.unmodifiableMap(((h4.u) ((x[]) ((D0.j) c0511m.f5381e).f330e)[0]).f5274e);
        } catch (IllegalStateException e7) {
            ((r4.l) pVar).error("error", e7.getMessage(), null);
        }
        ((r4.l) pVar).success((Map) this.f2251d);
    }

    @Override // r4.k
    public long p(r4.h hVar) {
        return ((u) this.f2251d).f5752E.p(hVar);
    }

    @Override // io.flutter.plugin.platform.m
    public void q() {
        ((u) this.f2251d).q();
        ((t) this.f2252e).q();
    }

    @Override // r4.k
    public void r(r4.h hVar) {
        ((t) this.f2252e).f5746y.b(hVar);
    }

    @Override // r4.k
    public void s(int i2) {
        t tVar = (t) this.f2252e;
        if (tVar.m(i2) != null) {
            tVar.f5746y.s(i2);
        } else {
            ((u) this.f2251d).f5752E.s(i2);
        }
    }

    @Override // r4.k
    public boolean t() {
        FlutterJNI flutterJNI = ((t) this.f2252e).f5734m;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }

    @Override // T6.v
    public T6.u u() {
        return (H6.f) this.f2251d;
    }

    public ArrayList w(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2251d;
        C0465k g7 = C0465k.g(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            g7.l(1);
        } else {
            g7.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor J7 = V6.b.J(workDatabase_Impl, g7);
        try {
            ArrayList arrayList = new ArrayList(J7.getCount());
            while (J7.moveToNext()) {
                arrayList.add(J7.isNull(0) ? null : J7.getString(0));
            }
            return arrayList;
        } finally {
            J7.close();
            g7.h();
        }
    }

    public void x(C c7) {
        E e7 = c7.f432o;
        try {
            ((C0583a) this.f2252e).accept(new p5.b(c7, e7));
            if (e7 != null) {
                e7.close();
            }
        } catch (Throwable th) {
            if (e7 != null) {
                try {
                    e7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void y() {
        try {
            ((FileLock) this.f2252e).release();
            ((FileChannel) this.f2251d).close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }

    public int z(Context context, InterfaceC0844c interfaceC0844c) {
        int i2;
        int i5;
        t1.u.f(context);
        t1.u.f(interfaceC0844c);
        int a7 = interfaceC0844c.a();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2251d;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(a7, -1);
        }
        if (i2 != -1) {
            return i2;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f2251d;
        synchronized (sparseIntArray2) {
            i5 = 0;
            int i7 = 0;
            while (true) {
                try {
                    if (i7 >= sparseIntArray2.size()) {
                        i5 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray2.keyAt(i7);
                    if (keyAt > a7 && sparseIntArray2.get(keyAt) == 0) {
                        break;
                    }
                    i7++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i5 == -1) {
                i5 = ((q1.f) this.f2252e).b(context, a7);
            }
            sparseIntArray2.put(a7, i5);
        }
        return i5;
    }

    public s(q1.f fVar) {
        this.f2251d = new SparseIntArray();
        t1.u.f(fVar);
        this.f2252e = fVar;
    }

    public s(H6.h hVar) {
        this.f2251d = new H6.f(hVar, ((I6.g) hVar.f1054e).d().u(), -1L);
        this.f2252e = new H6.g(hVar, ((I6.g) hVar.f1054e).d().a(), -1L);
    }

    public s(Animation animation) {
        this.f2251d = animation;
        this.f2252e = null;
    }

    public s(Animator animator) {
        this.f2251d = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2252e = animatorSet;
        animatorSet.play(animator);
    }
}
