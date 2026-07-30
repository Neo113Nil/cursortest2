package P0;

import P.C0151p;
import R5.C0164d;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import b1.C0269d;
import c1.C0290c;
import c1.InterfaceC0289b;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.icefishing.icefish.ice.fishing.s294s.R;
import h1.C0468a;
import j4.C0573b;
import j4.C0578g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p1.C0820c;
import r6.C0853a;
import s4.InterfaceC0893b;
import s4.w;
import t1.u;
import y4.C1046o;

/* loaded from: classes.dex */
public final class l implements E3.b, OnCompleteListener, InterfaceC0289b, K1.a, q6.d, s4.d, A0.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2208d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2209e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2210i;

    public /* synthetic */ l(Object obj, int i2, Object obj2) {
        this.f2208d = i2;
        this.f2209e = obj;
        this.f2210i = obj2;
    }

    public static HashMap a(int i2, int i5, int i7, int i8, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i5));
        hashMap.put("composingBase", Integer.valueOf(i7));
        hashMap.put("composingExtent", Integer.valueOf(i8));
        return hashMap;
    }

    public String b(String str) {
        String str2 = (String) this.f2210i;
        Resources resources = (Resources) this.f2209e;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void c(F.i iVar) {
        E.e eVar = (E.e) this.f2210i;
        B.f fVar = (B.f) this.f2209e;
        int i2 = iVar.f739b;
        if (i2 != 0) {
            eVar.execute(new F.b(fVar, i2));
        } else {
            eVar.execute(new F.a(fVar, 0, iVar.f738a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Thread thread, Throwable th, X5.c cVar) {
        H3.d dVar;
        W5.a aVar;
        int i2;
        l lVar;
        C4.b b7;
        Object obj;
        l lVar2;
        Instant now;
        E3.j jVar;
        E3.c cVar2 = (E3.c) this.f2210i;
        if (cVar instanceof H3.d) {
            dVar = (H3.d) cVar;
            int i5 = dVar.f971m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar.f971m = i5 - Integer.MIN_VALUE;
                Object obj2 = dVar.f969i;
                aVar = W5.a.f2787d;
                i2 = dVar.f971m;
                if (i2 != 0) {
                    V6.b.P(obj2);
                    try {
                        cVar2.info("OtelCrashReporter: Starting to save crash report for ".concat(th.getClass().getSimpleName()));
                        try {
                            C4.d dVar2 = new C4.d(0);
                            String message = th.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            dVar2.f("exception.message", message);
                            dVar2.f("exception.stacktrace", C0164d.b(th));
                            dVar2.f("exception.type", th.getClass().getName());
                            dVar2.f("ossdk.exception.thread.name", thread.getName());
                            b7 = dVar2.b();
                            cVar2.debug("OtelCrashReporter: Creating log record with attributes...");
                            obj = (E3.d) this.f2209e;
                            dVar.f967d = this;
                            dVar.f968e = b7;
                            dVar.f971m = 1;
                        } catch (IOException e7) {
                            e = e7;
                        } catch (RuntimeException e8) {
                            e = e8;
                        }
                    } catch (IOException e9) {
                        e = e9;
                    } catch (RuntimeException e10) {
                        e = e10;
                    }
                    try {
                        E3.j jVar2 = (E3.j) obj;
                        jVar2.getClass();
                        obj2 = E3.j.b(jVar2, dVar);
                        if (obj2 != aVar) {
                            lVar2 = this;
                        }
                        return aVar;
                    } catch (IOException e11) {
                        e = e11;
                        e = e;
                        lVar = this;
                        ((E3.c) lVar.f2210i).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                        throw e;
                    } catch (RuntimeException e12) {
                        e = e12;
                        e = e;
                        lVar = this;
                        ((E3.c) lVar.f2210i).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                        throw e;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = dVar.f967d;
                    try {
                        V6.b.P(obj2);
                        ((E3.c) lVar.f2210i).info("OtelCrashReporter: ✅ Crash report saved and flushed successfully to disk");
                        return Unit.f6114a;
                    } catch (IOException e13) {
                        e = e13;
                        ((E3.c) lVar.f2210i).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                        throw e;
                    } catch (RuntimeException e14) {
                        e = e14;
                        ((E3.c) lVar.f2210i).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                        throw e;
                    }
                }
                b7 = dVar.f968e;
                lVar2 = dVar.f967d;
                try {
                    V6.b.P(obj2);
                } catch (IOException e15) {
                    l lVar3 = lVar2;
                    e = e15;
                    lVar = lVar3;
                    ((E3.c) lVar.f2210i).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                    throw e;
                } catch (RuntimeException e16) {
                    l lVar4 = lVar2;
                    e = e16;
                    lVar = lVar4;
                    ((E3.c) lVar.f2210i).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                    throw e;
                }
                I4.e d7 = ((I4.e) obj2).c(b7).d(I4.i.FATAL);
                now = Instant.now();
                d7.e(now).b();
                ((E3.c) lVar2.f2210i).debug("OtelCrashReporter: Flushing crash report to disk...");
                Object obj3 = (E3.d) lVar2.f2209e;
                dVar.f967d = lVar2;
                dVar.f968e = null;
                dVar.f971m = 2;
                jVar = (E3.j) obj3;
                jVar.getClass();
                if (E3.j.a(jVar, dVar) != aVar) {
                    lVar = lVar2;
                    ((E3.c) lVar.f2210i).info("OtelCrashReporter: ✅ Crash report saved and flushed successfully to disk");
                    return Unit.f6114a;
                }
                return aVar;
            }
        }
        dVar = new H3.d(this, cVar);
        Object obj22 = dVar.f969i;
        aVar = W5.a.f2787d;
        i2 = dVar.f971m;
        if (i2 != 0) {
        }
        I4.e d72 = ((I4.e) obj22).c(b7).d(I4.i.FATAL);
        now = Instant.now();
        d72.e(now).b();
        ((E3.c) lVar2.f2210i).debug("OtelCrashReporter: Flushing crash report to disk...");
        Object obj32 = (E3.d) lVar2.f2209e;
        dVar.f967d = lVar2;
        dVar.f968e = null;
        dVar.f971m = 2;
        jVar = (E3.j) obj32;
        jVar.getClass();
        if (E3.j.a(jVar, dVar) != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    @Override // q6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(q6.e eVar, V5.b bVar) {
        q6.m mVar;
        int i2;
        C1046o c1046o;
        switch (this.f2208d) {
            case 9:
                if (bVar instanceof q6.m) {
                    mVar = (q6.m) bVar;
                    int i5 = mVar.f7394e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mVar.f7394e = i5 - Integer.MIN_VALUE;
                        Object obj = mVar.f7393d;
                        W5.a aVar = W5.a.f2787d;
                        i2 = mVar.f7394e;
                        if (i2 != 0) {
                            V6.b.P(obj);
                            c cVar = (c) this.f2209e;
                            C1046o c1046o2 = new C1046o((C0151p) this.f2210i, eVar);
                            try {
                                mVar.f7396l = c1046o2;
                                mVar.f7394e = 1;
                                if (cVar.e(c1046o2, mVar) == aVar) {
                                    return aVar;
                                }
                            } catch (C0853a e7) {
                                e = e7;
                                c1046o = c1046o2;
                                if (e.f7541d != c1046o) {
                                    throw e;
                                }
                                return Unit.f6114a;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1046o = mVar.f7396l;
                            try {
                                V6.b.P(obj);
                            } catch (C0853a e8) {
                                e = e8;
                                if (e.f7541d != c1046o) {
                                }
                                return Unit.f6114a;
                            }
                        }
                        return Unit.f6114a;
                    }
                }
                mVar = new q6.m(this, bVar);
                Object obj2 = mVar.f7393d;
                W5.a aVar2 = W5.a.f2787d;
                i2 = mVar.f7394e;
                if (i2 != 0) {
                }
                return Unit.f6114a;
            default:
                Object e9 = ((q6.d) this.f2209e).e(new C1046o(eVar, (T.d) this.f2210i, 1), bVar);
                return e9 == W5.a.f2787d ? e9 : Unit.f6114a;
        }
    }

    @Override // s4.d
    public void g(ByteBuffer byteBuffer, C0578g c0578g) {
        i iVar = (i) this.f2210i;
        try {
            ((InterfaceC0893b) this.f2209e).k(((s4.m) iVar.f2202c).b(byteBuffer), new e(this, 11, c0578g));
        } catch (RuntimeException e7) {
            Log.e("BasicMessageChannel#" + ((String) iVar.f2201b), "Failed to handle message", e7);
            c0578g.a(null);
        }
    }

    @Override // Q5.a
    public Object get() {
        switch (this.f2208d) {
            case 5:
                return new b1.e((Context) ((C0290c) this.f2209e).f4173d, (C0269d) ((B.f) this.f2210i).get());
            default:
                q1.h hVar = new q1.h(22);
                c2.e eVar = new c2.e();
                Object obj = ((Q5.a) this.f2209e).get();
                Q5.a aVar = (Q5.a) this.f2210i;
                return new h1.h(hVar, eVar, C0468a.f5122f, (h1.j) obj, aVar);
        }
    }

    @Override // K1.a
    public Object h(Task task) {
        C0820c c0820c = (C0820c) this.f2209e;
        Bundle bundle = (Bundle) this.f2210i;
        c0820c.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : c0820c.b(bundle).k(K1.n.f1442e, c2.e.f4188l);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        N1.d dVar = (N1.d) this.f2209e;
        K1.h hVar = (K1.h) this.f2210i;
        synchronized (dVar.f1807f) {
            dVar.f1806e.remove(hVar);
        }
    }

    public l(Context context) {
        this.f2208d = 13;
        u.f(context);
        Resources resources = context.getResources();
        this.f2209e = resources;
        this.f2210i = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public l(E3.d openTelemetry, E3.c logger) {
        this.f2208d = 2;
        Intrinsics.checkNotNullParameter(openTelemetry, "openTelemetry");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f2209e = openTelemetry;
        this.f2210i = logger;
    }

    public l(WorkDatabase_Impl database) {
        this.f2208d = 0;
        this.f2209e = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f2210i = new b(database, 3);
    }

    public l(View view, InputMethodManager inputMethodManager, l4.b bVar) {
        this.f2208d = 7;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f2210i = view;
        this.f2209e = inputMethodManager;
        bVar.f6272e = this;
    }

    public l(A0.b tracker) {
        this.f2208d = 15;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        c cVar = new c(16);
        this.f2209e = tracker;
        this.f2210i = cVar;
    }

    public l(C0573b c0573b, int i2) {
        this.f2208d = i2;
        switch (i2) {
            case RequestError.STOP_TRACKING /* 11 */:
                l4.b bVar = new l4.b(16, this);
                s4.q qVar = new s4.q(c0573b, "flutter/textinput", s4.l.f7766a);
                this.f2209e = qVar;
                qVar.b(bVar);
                break;
            default:
                l4.b bVar2 = new l4.b(11, this);
                s4.q qVar2 = new s4.q(c0573b, "flutter/platform_views_2", w.f7775a);
                this.f2209e = qVar2;
                qVar2.b(bVar2);
                break;
        }
    }

    public l(EditText editText) {
        this.f2208d = 4;
        this.f2209e = editText;
        W.i iVar = new W.i(editText);
        this.f2210i = iVar;
        editText.addTextChangedListener(iVar);
        if (W.a.f2766b == null) {
            synchronized (W.a.f2765a) {
                try {
                    if (W.a.f2766b == null) {
                        W.a aVar = new W.a();
                        try {
                            W.a.f2767c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, W.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        W.a.f2766b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(W.a.f2766b);
    }

    public l(i iVar, InterfaceC0893b interfaceC0893b) {
        this.f2208d = 12;
        this.f2210i = iVar;
        this.f2209e = interfaceC0893b;
    }
}
