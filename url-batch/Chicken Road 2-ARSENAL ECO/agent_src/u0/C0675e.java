package u0;

import D3.F;
import D3.M;
import X5.w;
import X5.y;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.work.impl.WorkDatabase;
import f3.C0371d;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import k5.v;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;

/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675e implements c3.b {

    /* renamed from: d, reason: collision with root package name */
    public static C0675e f5972d;

    /* renamed from: e, reason: collision with root package name */
    public static F f5973e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5974a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5975b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5976c;

    public /* synthetic */ C0675e(Object obj, int i7, Object obj2) {
        this.f5974a = i7;
        this.f5975b = obj;
        this.f5976c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0675e a(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLock = null;
            }
            try {
                return new C0675e(fileChannel, 1, fileLock);
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
            fileChannel = null;
            fileLock = null;
        }
    }

    public static HashMap d(String str, int i7, int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i7));
        hashMap.put("selectionExtent", Integer.valueOf(i8));
        hashMap.put("composingBase", Integer.valueOf(i9));
        hashMap.put("composingExtent", Integer.valueOf(i10));
        return hashMap;
    }

    public void b(Object obj, String str) {
        ((ArrayList) this.f5975b).add(str + "=" + String.valueOf(obj));
    }

    public Object c(String str) {
        Object obj = this.f5976c;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public Long e(String str) {
        WorkDatabase workDatabase = (WorkDatabase) this.f5975b;
        Q.k e4 = Q.k.e("SELECT long_value FROM Preference where `key`=?", 1);
        e4.B(str, 1);
        workDatabase.b();
        Cursor m4 = workDatabase.m(e4);
        try {
            Long l7 = null;
            if (m4.moveToFirst() && !m4.isNull(0)) {
                l7 = Long.valueOf(m4.getLong(0));
            }
            return l7;
        } finally {
            m4.close();
            e4.g();
        }
    }

    public void f(C0674d c0674d) {
        WorkDatabase workDatabase = (WorkDatabase) this.f5975b;
        workDatabase.b();
        workDatabase.c();
        try {
            ((C0672b) this.f5976c).q(c0674d);
            workDatabase.o();
        } finally {
            workDatabase.k();
        }
    }

    public void g(w wVar) {
        y yVar = wVar.f3067l;
        try {
            ((C4.a) this.f5976c).accept(new I4.c(wVar, yVar));
            if (yVar != null) {
                yVar.close();
            }
        } catch (Throwable th) {
            if (yVar != null) {
                try {
                    yVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void h() {
        try {
            ((FileLock) this.f5976c).release();
            ((FileChannel) this.f5975b).close();
        } catch (IOException e4) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(Thread thread, Throwable th, b4.i iVar, boolean z5, AbstractC0607c abstractC0607c) {
        C0371d c0371d;
        EnumC0580a enumC0580a;
        int i7;
        RuntimeException runtimeException;
        C0675e c0675e;
        IOException iOException;
        V3.a t6;
        String str;
        C0675e c0675e2;
        Instant now;
        Object obj;
        String str2;
        c3.c cVar = (c3.c) this.f5976c;
        if (abstractC0607c instanceof C0371d) {
            c0371d = (C0371d) abstractC0607c;
            int i8 = c0371d.f4214l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0371d.f4214l = i8 - Integer.MIN_VALUE;
                Object obj2 = c0371d.f4212j;
                enumC0580a = EnumC0580a.f5697f;
                i7 = c0371d.f4214l;
                if (i7 != 0) {
                    AbstractC0676f.w(obj2);
                    String str3 = z5 ? "Crash report" : "Non-fatal report";
                    try {
                        StringBuilder sb = new StringBuilder("OtelCrashReporter: Starting to save ");
                        String lowerCase = str3.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                        sb.append(lowerCase);
                        sb.append(" for ");
                        sb.append(th.getClass().getSimpleName());
                        cVar.info(sb.toString());
                        M m4 = new M(27);
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        m4.v("exception.message", message);
                        m4.v("exception.stacktrace", i6.g.y(th));
                        m4.v("exception.type", th.getClass().getName());
                        m4.v("ossdk.exception.thread.name", thread.getName());
                        m4.u(a4.e.a(V3.b.f2708g, "ossdk.crash.fatal"), Boolean.valueOf(z5));
                        t6 = m4.t();
                        cVar.debug("OtelCrashReporter: Creating log record with attributes...");
                        Object obj3 = (c3.d) this.f5975b;
                        c0371d.f4208f = this;
                        c0371d.f4209g = iVar;
                        c0371d.f4210h = str3;
                        c0371d.f4211i = t6;
                        c0371d.f4214l = 1;
                        Object b7 = c3.j.b((c3.j) obj3, c0371d);
                        if (b7 != enumC0580a) {
                            String str4 = str3;
                            obj2 = b7;
                            str = str4;
                            c0675e2 = this;
                        }
                        return enumC0580a;
                    } catch (IOException e4) {
                        iOException = e4;
                        c0675e = this;
                        ((c3.c) c0675e.f5976c).error("OtelCrashReporter: IO error saving crash report: " + iOException.getMessage());
                        throw iOException;
                    } catch (RuntimeException e7) {
                        runtimeException = e7;
                        c0675e = this;
                        ((c3.c) c0675e.f5976c).error("OtelCrashReporter: Failed to save crash report: " + runtimeException.getMessage() + " - " + runtimeException.getClass().getSimpleName());
                        throw runtimeException;
                    }
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) c0371d.f4209g;
                    c0675e = c0371d.f4208f;
                    try {
                        AbstractC0676f.w(obj2);
                        ((c3.c) c0675e.f5976c).info("OtelCrashReporter: ✅ " + str2 + " saved and flushed successfully to disk");
                        return v.f5219a;
                    } catch (IOException e8) {
                        iOException = e8;
                        ((c3.c) c0675e.f5976c).error("OtelCrashReporter: IO error saving crash report: " + iOException.getMessage());
                        throw iOException;
                    } catch (RuntimeException e9) {
                        runtimeException = e9;
                        ((c3.c) c0675e.f5976c).error("OtelCrashReporter: Failed to save crash report: " + runtimeException.getMessage() + " - " + runtimeException.getClass().getSimpleName());
                        throw runtimeException;
                    }
                }
                t6 = c0371d.f4211i;
                str = c0371d.f4210h;
                iVar = (b4.i) c0371d.f4209g;
                c0675e2 = c0371d.f4208f;
                try {
                    AbstractC0676f.w(obj2);
                } catch (IOException e10) {
                    iOException = e10;
                    c0675e = c0675e2;
                    ((c3.c) c0675e.f5976c).error("OtelCrashReporter: IO error saving crash report: " + iOException.getMessage());
                    throw iOException;
                } catch (RuntimeException e11) {
                    runtimeException = e11;
                    c0675e = c0675e2;
                    ((c3.c) c0675e.f5976c).error("OtelCrashReporter: Failed to save crash report: " + runtimeException.getMessage() + " - " + runtimeException.getClass().getSimpleName());
                    throw runtimeException;
                }
                b4.e e12 = ((b4.e) obj2).f(t6).e(iVar);
                now = Instant.now();
                e12.c(now).b();
                c3.c cVar2 = (c3.c) c0675e2.f5976c;
                StringBuilder sb2 = new StringBuilder("OtelCrashReporter: Flushing ");
                String lowerCase2 = str.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.i.d(lowerCase2, "toLowerCase(...)");
                sb2.append(lowerCase2);
                sb2.append(" to disk...");
                cVar2.debug(sb2.toString());
                obj = (c3.d) c0675e2.f5975b;
                c0371d.f4208f = c0675e2;
                c0371d.f4209g = str;
                c0371d.f4210h = null;
                c0371d.f4211i = null;
                c0371d.f4214l = 2;
                if (c3.j.a((c3.j) obj, c0371d) != enumC0580a) {
                    str2 = str;
                    c0675e = c0675e2;
                    ((c3.c) c0675e.f5976c).info("OtelCrashReporter: ✅ " + str2 + " saved and flushed successfully to disk");
                    return v.f5219a;
                }
                return enumC0580a;
            }
        }
        c0371d = new C0371d(this, abstractC0607c);
        Object obj22 = c0371d.f4212j;
        enumC0580a = EnumC0580a.f5697f;
        i7 = c0371d.f4214l;
        if (i7 != 0) {
        }
        b4.e e122 = ((b4.e) obj22).f(t6).e(iVar);
        now = Instant.now();
        e122.c(now).b();
        c3.c cVar22 = (c3.c) c0675e2.f5976c;
        StringBuilder sb22 = new StringBuilder("OtelCrashReporter: Flushing ");
        String lowerCase22 = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase22, "toLowerCase(...)");
        sb22.append(lowerCase22);
        sb22.append(" to disk...");
        cVar22.debug(sb22.toString());
        obj = (c3.d) c0675e2.f5975b;
        c0371d.f4208f = c0675e2;
        c0371d.f4209g = str;
        c0371d.f4210h = null;
        c0371d.f4211i = null;
        c0371d.f4214l = 2;
        if (c3.j.a((c3.j) obj, c0371d) != enumC0580a) {
        }
        return enumC0580a;
    }

    public String toString() {
        switch (this.f5974a) {
            case 8:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f5976c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f5975b;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    sb.append((String) arrayList.get(i7));
                    if (i7 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0675e(Object obj) {
        this.f5974a = 8;
        this.f5976c = obj;
        this.f5975b = new ArrayList();
    }

    public C0675e(Q3.a aVar, J1.c cVar) {
        this.f5974a = 7;
        this.f5975b = aVar;
        this.f5976c = cVar;
        cVar.f1289g = new M(21, this);
    }

    public C0675e(WorkDatabase workDatabase) {
        this.f5974a = 0;
        this.f5975b = workDatabase;
        this.f5976c = new C0672b(workDatabase);
    }

    public C0675e(int i7) {
        this.f5974a = i7;
        switch (i7) {
            case 11:
                break;
            default:
                this.f5975b = new LongSparseArray();
                this.f5976c = new PriorityQueue();
                break;
        }
    }

    public C0675e(F3.b bVar, int i7) {
        this.f5974a = i7;
        switch (i7) {
            case 5:
                J1.c cVar = new J1.c(22, this);
                B0.c cVar2 = new B0.c((Object) bVar, "flutter/textinput", (Object) O3.g.f1770b, 12);
                this.f5975b = cVar2;
                cVar2.C(cVar);
                break;
            default:
                J1.c cVar3 = new J1.c(13, this);
                B0.c cVar4 = new B0.c((Object) bVar, "flutter/localization", (Object) O3.g.f1770b, 12);
                this.f5975b = cVar4;
                cVar4.C(cVar3);
                break;
        }
    }
}
