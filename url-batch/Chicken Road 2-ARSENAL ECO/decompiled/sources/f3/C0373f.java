package f3;

import H5.AbstractC0165z;
import a.AbstractC0219a;
import c3.m;
import com.onesignal.debug.internal.crash.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import k5.v;
import kotlin.jvm.internal.i;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* renamed from: f3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373f {

    /* renamed from: a, reason: collision with root package name */
    public final m f4219a;

    /* renamed from: b, reason: collision with root package name */
    public final com.onesignal.debug.internal.logging.otel.android.c f4220b;

    /* renamed from: c, reason: collision with root package name */
    public final com.onesignal.debug.internal.logging.otel.android.a f4221c;

    public C0373f(m mVar, com.onesignal.debug.internal.logging.otel.android.c cVar, com.onesignal.debug.internal.logging.otel.android.a aVar) {
        this.f4219a = mVar;
        this.f4220b = cVar;
        this.f4221c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC0607c abstractC0607c) {
        C0372e c0372e;
        int i7;
        C0373f c0373f;
        if (abstractC0607c instanceof C0372e) {
            c0372e = (C0372e) abstractC0607c;
            int i8 = c0372e.f4218i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0372e.f4218i = i8 - Integer.MIN_VALUE;
                Object obj = c0372e.f4216g;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = c0372e.f4218i;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.debug.internal.logging.otel.android.c cVar = this.f4220b;
                    Iterator it = AbstractC0219a.r(cVar.getMinFileAgeForReadMillis(), cVar.getCrashStoragePath()).f6039f.iterator();
                    i.d(it, "iterator(...)");
                    b(it);
                    long minFileAgeForReadMillis = cVar.getMinFileAgeForReadMillis();
                    c0372e.f4215f = this;
                    c0372e.f4218i = 1;
                    if (AbstractC0165z.d(minFileAgeForReadMillis, c0372e) == enumC0580a) {
                        return enumC0580a;
                    }
                    c0373f = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0373f = c0372e.f4215f;
                    AbstractC0676f.w(obj);
                }
                com.onesignal.debug.internal.logging.otel.android.c cVar2 = c0373f.f4220b;
                Iterator it2 = AbstractC0219a.r(cVar2.getMinFileAgeForReadMillis(), cVar2.getCrashStoragePath()).f6039f.iterator();
                i.d(it2, "iterator(...)");
                c0373f.b(it2);
                return v.f5219a;
            }
        }
        c0372e = new C0372e(this, abstractC0607c);
        Object obj2 = c0372e.f4216g;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = c0372e.f4218i;
        if (i7 != 0) {
        }
        com.onesignal.debug.internal.logging.otel.android.c cVar22 = c0373f.f4220b;
        Iterator it22 = AbstractC0219a.r(cVar22.getMinFileAgeForReadMillis(), cVar22.getCrashStoragePath()).f6039f.iterator();
        i.d(it22, "iterator(...)");
        c0373f.b(it22);
        return v.f5219a;
    }

    public final void b(Iterator it) {
        U4.e eVar = (U4.e) this.f4219a.f3799g.getValue();
        boolean z5 = false;
        while (it.hasNext() && !z5) {
            O4.c r6 = eVar.r((Collection) it.next());
            com.onesignal.debug.internal.logging.otel.android.a aVar = this.f4221c;
            aVar.debug("Sending OneSignal crash report");
            r6.c(30L, TimeUnit.SECONDS);
            z5 = !r6.b();
            aVar.debug("Done OneSignal crash report, failed: " + z5);
        }
    }

    public final Object c(n.a aVar) {
        String remoteLogLevel = this.f4220b.getRemoteLogLevel();
        v vVar = v.f5219a;
        com.onesignal.debug.internal.logging.otel.android.a aVar2 = this.f4221c;
        if (remoteLogLevel != null && !remoteLogLevel.equals("NONE")) {
            aVar2.info("OtelCrashUploader: starting");
            Object a7 = a(aVar);
            return a7 == EnumC0580a.f5697f ? a7 : vVar;
        }
        aVar2.info("OtelCrashUploader: remote logging disabled (level: " + remoteLogLevel + ')');
        return vVar;
    }
}
