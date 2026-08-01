package c6;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import b7.e0;
import c7.c0;
import com.appsflyer.R;
import f8.j0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s.h0;
import s7.t3;
import te.l1;
import z4.t;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements l1, i5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1828d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1829e;

    /* renamed from: i, reason: collision with root package name */
    public Object f1830i;

    public l(m.n nVar) {
        this.f1828d = 4;
        this.f1829e = nVar;
        e4.i iVar = new e4.i(nVar);
        this.f1830i = iVar;
        nVar.addTextChangedListener(iVar);
        if (e4.a.f3854b == null) {
            synchronized (e4.a.f3853a) {
                try {
                    if (e4.a.f3854b == null) {
                        e4.a aVar = new e4.a();
                        try {
                            e4.a.f3855c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, e4.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        e4.a.f3854b = aVar;
                    }
                } finally {
                }
            }
        }
        nVar.setEditableFactory(e4.a.f3854b);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l a(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e2) {
                e = e2;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e9) {
            e = e9;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new l(14, fileChannel, fileLock);
        } catch (IOException e10) {
            e = e10;
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
        } catch (Error e11) {
            e = e11;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e12) {
            e = e12;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public Bundle b(String str) {
        Bundle bundle;
        h5.b bVar = (h5.b) this.f1829e;
        if (!bVar.g) {
            i0.l("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = bVar.f4473f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                f.Q(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            bVar.f4473f = null;
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    @Override // i5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i5.a c(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        z4.q qVar = (z4.q) this.f1830i;
        if (!str.equals(":memory:")) {
            str = qVar.f10809c.f10703a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z10 = true;
        a5.a aVar = new a5.a(str, (qVar.f10807a || qVar.f10808b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = aVar.f291a;
        reentrantLock.lock();
        l lVar = aVar.f292b;
        if (lVar != null) {
            try {
                lVar.g();
            } catch (Throwable th) {
                th = th;
                z10 = false;
                try {
                    if (!z10) {
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (qVar.f10808b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                i5.a c10 = ((i5.b) this.f1829e).c(str);
                if (qVar.f10807a) {
                    z4.q.b(c10);
                    if (qVar.f10809c.g == t.f10832i) {
                        g8.b.y(c10, "PRAGMA synchronous = NORMAL");
                    } else {
                        g8.b.y(c10, "PRAGMA synchronous = FULL");
                    }
                    qVar.f10810d.d(c10);
                } else {
                    try {
                        qVar.f10808b = true;
                        z4.q.a(qVar, c10);
                        qVar.f10808b = false;
                    } catch (Throwable th2) {
                        qVar.f10808b = false;
                        throw th2;
                    }
                }
                if (lVar != null && (fileChannel2 = (FileChannel) lVar.f1830i) != null) {
                    try {
                        fileChannel2.close();
                        lVar.f1830i = null;
                    } finally {
                    }
                }
                return c10;
            } catch (Throwable th3) {
                th = th3;
                if (!z10) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (Throwable th4) {
            if (lVar != null && (fileChannel = (FileChannel) lVar.f1830i) != null) {
                try {
                    fileChannel.close();
                    lVar.f1830i = null;
                } finally {
                }
            }
            throw th4;
        }
    }

    @Override // te.l1
    public pe.a d(ce.b bVar) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f1830i;
        Class D = a.a.D(bVar);
        Object obj = concurrentHashMap.get(D);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(D, (obj = new te.j((pe.a) ((Function1) this.f1829e).invoke(bVar))))) != null) {
            obj = putIfAbsent;
        }
        return ((te.j) obj).f9390a;
    }

    public f5.d e(String str) {
        f5.d dVar;
        h5.b bVar = (h5.b) this.f1829e;
        synchronized (bVar.f4470c) {
            Iterator it = bVar.f4471d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                f5.d dVar2 = (f5.d) entry.getValue();
                if (Intrinsics.a(str2, str)) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public String f(String str) {
        String str2 = (String) this.f1830i;
        Resources resources = (Resources) this.f1829e;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void g() {
        String str = (String) this.f1829e;
        if (((FileChannel) this.f1830i) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f1830i = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f1830i;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f1830i = null;
            throw new IllegalStateException(n0.l.g("Unable to lock file: '", str, "'."), th);
        }
    }

    public void h(l3.f fVar) {
        e0 e0Var = (e0) this.f1830i;
        d9.c cVar = (d9.c) this.f1829e;
        int i3 = fVar.f5848b;
        if (i3 != 0) {
            e0Var.execute(new b6.d(i3, 3, cVar));
        } else {
            e0Var.execute(new j0(9, cVar, fVar.f5847a));
        }
    }

    public void i(String str, f5.d dVar) {
        dVar.getClass();
        h5.b bVar = (h5.b) this.f1829e;
        synchronized (bVar.f4470c) {
            if (bVar.f4471d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            bVar.f4471d.put(str, dVar);
        }
    }

    public void j() {
        try {
            ((FileLock) this.f1830i).release();
            ((FileChannel) this.f1829e).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    @Override // i5.b
    public boolean k() {
        return ((i5.b) this.f1829e).k();
    }

    public void l() {
        if (!((h5.b) this.f1829e).f4474h) {
            i0.l("Can not perform this action after onSaveInstanceState");
            return;
        }
        f5.a aVar = (f5.a) this.f1830i;
        if (aVar == null) {
            aVar = new f5.a(this);
        }
        this.f1830i = aVar;
        try {
            androidx.lifecycle.l.class.getDeclaredConstructor(null);
            f5.a aVar2 = (f5.a) this.f1830i;
            if (aVar2 != null) {
                aVar2.f4106a.add(androidx.lifecycle.l.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + androidx.lifecycle.l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public String toString() {
        switch (this.f1828d) {
            case 13:
                return "AnimationResult(endReason=" + ((v.d) this.f1830i) + ", endState=" + ((v.g) this.f1829e) + ')';
            default:
                return super.toString();
        }
    }

    public l(Context context) {
        this.f1828d = 3;
        c0.g(context);
        Resources resources = context.getResources();
        this.f1829e = resources;
        this.f1830i = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public l(t3 t3Var) {
        this.f1828d = 11;
        this.f1830i = t3Var;
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f1828d = 0;
        this.f1829e = workDatabase_Impl;
        this.f1830i = new b(workDatabase_Impl, 3);
    }

    public l(h5.b bVar) {
        this.f1828d = 5;
        this.f1829e = bVar;
    }

    public l(String str) {
        this.f1828d = 1;
        this.f1829e = str.concat(".lck");
    }

    public l(z4.q qVar, i5.b bVar) {
        this.f1828d = 15;
        bVar.getClass();
        this.f1830i = qVar;
        this.f1829e = bVar;
    }

    public l(Function1 function1) {
        this.f1828d = 12;
        this.f1829e = function1;
        this.f1830i = new ConcurrentHashMap();
    }

    public l(ArrayList arrayList, ArrayList arrayList2) {
        this.f1828d = 6;
        int size = arrayList.size();
        this.f1829e = new int[size];
        this.f1830i = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            ((int[]) this.f1829e)[i3] = ((Integer) arrayList.get(i3)).intValue();
            ((float[]) this.f1830i)[i3] = ((Float) arrayList2.get(i3)).floatValue();
        }
    }

    public l(int i3, int i10) {
        this.f1828d = 6;
        this.f1829e = new int[]{i3, i10};
        this.f1830i = new float[]{0.0f, 1.0f};
    }

    public /* synthetic */ l(int i3, Object obj, Object obj2) {
        this.f1828d = i3;
        this.f1829e = obj;
        this.f1830i = obj2;
    }

    public l(int i3, int i10, int i11) {
        this.f1828d = 6;
        this.f1829e = new int[]{i3, i10, i11};
        this.f1830i = new float[]{0.0f, 0.5f, 1.0f};
    }

    public l(int i3) {
        this.f1828d = i3;
        switch (i3) {
            case 9:
                this.f1829e = new s7.c0(16);
                this.f1830i = new s.r(16);
                break;
            default:
                this.f1829e = new h0();
                this.f1830i = new h0();
                break;
        }
    }
}
