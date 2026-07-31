package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.yandex.mobile.ads.impl.c92;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r21 implements gd1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f31002a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final cd1 f31003b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y52 f31004c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f31005d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final EnumC1848c9 f31006e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f31007f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C1920f9 f31008g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ew1 f31009h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final g62 f31010i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ArrayList f31011j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private ck0 f31012k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f31013l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f31014m;

    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final cd1 f31015a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Looper looper, @NotNull cd1 noticeReportController) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(noticeReportController, "noticeReportController");
            this.f31015a = noticeReportController;
        }

        @Override // android.os.Handler
        public final void handleMessage(@NotNull Message msg) {
            long elapsedRealtime;
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i4 = msg.what;
            int i5 = 0;
            if (i4 == 1) {
                Object obj = msg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Pair<java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager>, com.monetization.ads.base.impression.tracking.model.TrackingNotice>");
                Pair pair = (Pair) obj;
                r21 r21Var = (r21) ((WeakReference) pair.getFirst()).get();
                if (r21Var != null) {
                    f62 f62Var = (f62) pair.getSecond();
                    ap0.d(r21Var.f31005d);
                    r21Var.f31008g.a(f62Var.d(), o62.f29923h);
                    r21Var.f31011j.remove(f62Var);
                    r21Var.e();
                    cd1 cd1Var = this.f31015a;
                    ux1 c4 = f62Var.c();
                    ArrayList arrayList = r21Var.f31011j;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    int size = arrayList.size();
                    while (i5 < size) {
                        Object obj2 = arrayList.get(i5);
                        i5++;
                        arrayList2.add(((f62) obj2).c());
                    }
                    cd1Var.a(c4, arrayList2);
                    return;
                }
                return;
            }
            if (i4 != 2) {
                return;
            }
            Object obj3 = msg.obj;
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager?>");
            r21 r21Var2 = (r21) ((WeakReference) obj3).get();
            if (r21Var2 != null) {
                ap0.d(Integer.valueOf(r21Var2.f31011j.size()), r21Var2.f31005d);
                ArrayList arrayList3 = r21Var2.f31011j;
                int size2 = arrayList3.size();
                while (i5 < size2) {
                    Object obj4 = arrayList3.get(i5);
                    i5++;
                    f62 f62Var2 = (f62) obj4;
                    c92 a4 = r21.a(r21Var2, f62Var2);
                    if (r21.a(a4)) {
                        Long b4 = f62Var2.b();
                        if (b4 != null) {
                            elapsedRealtime = b4.longValue();
                        } else {
                            elapsedRealtime = SystemClock.elapsedRealtime();
                            f62Var2.a(Long.valueOf(elapsedRealtime));
                        }
                        if (SystemClock.elapsedRealtime() - elapsedRealtime >= f62Var2.a()) {
                            r21Var2.f31007f.sendMessage(Message.obtain(r21Var2.f31007f, 1, TuplesKt.to(new WeakReference(r21Var2), f62Var2)));
                        }
                        r21Var2.f();
                        this.f31015a.a(f62Var2.c());
                    } else {
                        f62Var2.a(null);
                        this.f31015a.a(f62Var2.c(), a4);
                    }
                }
                if (r21Var2.d()) {
                    r21Var2.f31007f.sendMessageDelayed(Message.obtain(r21Var2.f31007f, 2, new WeakReference(r21Var2)), 200L);
                }
            }
        }
    }

    public r21(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull cd1 noticeReportController, @NotNull y52 trackingChecker, @NotNull String viewControllerDescription, @NotNull EnumC1848c9 adStructureType, @NotNull a handler, @NotNull C1920f9 adTracker, @NotNull ew1 sdkSettings, @NotNull g62 trackingNoticeBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(noticeReportController, "noticeReportController");
        Intrinsics.checkNotNullParameter(trackingChecker, "trackingChecker");
        Intrinsics.checkNotNullParameter(viewControllerDescription, "viewControllerDescription");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(trackingNoticeBuilder, "trackingNoticeBuilder");
        this.f31002a = context;
        this.f31003b = noticeReportController;
        this.f31004c = trackingChecker;
        this.f31005d = viewControllerDescription;
        this.f31006e = adStructureType;
        this.f31007f = handler;
        this.f31008g = adTracker;
        this.f31009h = sdkSettings;
        this.f31010i = trackingNoticeBuilder;
        this.f31011j = new ArrayList();
    }

    public final void f() {
        if (this.f31013l) {
            return;
        }
        this.f31013l = true;
        ck0 ck0Var = this.f31012k;
        if (ck0Var != null) {
            ck0Var.c();
        }
    }

    public static final boolean a(c92 c92Var) {
        return c92Var.b() == c92.a.f24127c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean d() {
        return !this.f31011j.isEmpty();
    }

    @Override // com.yandex.mobile.ads.impl.gd1
    public final synchronized void b() {
        ap0.d(new Object[0]);
        if (yg1.f35123h.a(this.f31002a).b() && d() && !this.f31007f.hasMessages(2)) {
            a aVar = this.f31007f;
            aVar.sendMessage(Message.obtain(aVar, 2, new WeakReference(this)));
        }
    }

    @Override // com.yandex.mobile.ads.impl.gd1
    public final synchronized void c() {
        try {
            ap0.d(Integer.valueOf(this.f31011j.size()), this.f31005d);
            a();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f31011j.iterator();
            while (it.hasNext()) {
                f62 f62Var = (f62) it.next();
                du1 a4 = this.f31009h.a(this.f31002a);
                int i4 = 0;
                c92 b4 = a4 != null ? a4.i0() : false ? this.f31004c.b(f62Var.e()) : a4 != null ? a4.X() : false ? new c92(c92.a.f24127c, null) : this.f31004c.a(f62Var.e());
                ap0.d(b4.b().a());
                a(f62Var, b4);
                if (b4.b() == c92.a.f24127c) {
                    it.remove();
                    f();
                    e();
                    this.f31003b.a(f62Var.c());
                    cd1 cd1Var = this.f31003b;
                    ux1 c4 = f62Var.c();
                    ArrayList arrayList2 = this.f31011j;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    int size = arrayList2.size();
                    while (i4 < size) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        arrayList3.add(((f62) obj).c());
                    }
                    cd1Var.a(c4, arrayList3);
                } else {
                    arrayList.add(new id1(f62Var, b4));
                }
            }
            this.f31003b.a(arrayList);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e() {
        if (this.f31014m || !this.f31011j.isEmpty()) {
            return;
        }
        this.f31014m = true;
        ck0 ck0Var = this.f31012k;
        if (ck0Var != null) {
            ck0Var.g();
        }
    }

    public static final c92 a(r21 r21Var, f62 f62Var) {
        c92 b4 = r21Var.f31004c.b(f62Var.e());
        ap0.d(b4.b().a());
        return b4;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(@NotNull List<tx1> showNotices) {
        ux1 ux1Var;
        ux1 b4;
        ux1 ux1Var2;
        try {
            Intrinsics.checkNotNullParameter(showNotices, "showNotices");
            this.f31011j.clear();
            g62 g62Var = this.f31010i;
            EnumC1848c9 adStructureType = this.f31006e;
            g62Var.getClass();
            Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
            Intrinsics.checkNotNullParameter(showNotices, "showNotices");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(showNotices, 10));
            Iterator<T> it = showNotices.iterator();
            while (it.hasNext()) {
                arrayList.add(((tx1) it.next()).b());
            }
            Set set = CollectionsKt.toSet(arrayList);
            int ordinal = adStructureType.ordinal();
            if (ordinal == 0) {
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (((ux1) it2.next()) == ux1.f33443c) {
                            ux1Var = null;
                            break;
                        }
                    }
                }
                ux1Var = ux1.f33442b;
            } else if (ordinal == 1) {
                ux1Var = ux1.f33443c;
            } else if (ordinal == 2) {
                ux1Var = ux1.f33442b;
            } else {
                throw new W1.m();
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : showNotices) {
                if (((tx1) obj).c() != null) {
                    arrayList3.add(obj);
                }
            }
            int size = arrayList3.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                tx1 tx1Var = (tx1) obj2;
                String c4 = tx1Var.c();
                long a4 = tx1Var.a();
                int d4 = tx1Var.d();
                if (tx1Var.b() != ux1.f33444d) {
                    b4 = tx1Var.b();
                } else if (ux1Var == null) {
                    b4 = tx1Var.b();
                } else {
                    ux1Var2 = ux1Var;
                    if (c4 == null) {
                        arrayList2.add(new f62(d4, a4, ux1Var2, c4));
                    }
                }
                ux1Var2 = b4;
                if (c4 == null) {
                }
            }
            this.f31011j.addAll(arrayList2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(@NotNull vg1 phoneState, boolean z4) {
        try {
            Intrinsics.checkNotNullParameter(phoneState, "phoneState");
            Objects.toString(phoneState);
            ap0.d(new Object[0]);
            int ordinal = phoneState.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    a();
                } else if (ordinal != 2) {
                }
            }
            if (z4) {
                b();
            }
        } finally {
        }
    }

    @Override // com.yandex.mobile.ads.impl.gd1
    public final void a(@NotNull ck0 impressionTrackingListener) {
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        this.f31012k = impressionTrackingListener;
    }

    @Override // com.yandex.mobile.ads.impl.gd1
    public final synchronized void a() {
        int i4 = 0;
        ap0.d(new Object[0]);
        this.f31007f.removeMessages(2);
        this.f31007f.removeMessages(1);
        ArrayList arrayList = this.f31011j;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((f62) obj).a(null);
        }
    }

    private final synchronized void a(f62 f62Var, c92 c92Var) {
        try {
            if (c92Var.b() == c92.a.f24127c) {
                this.f31008g.a(f62Var.d(), o62.f29923h);
            } else {
                this.f31003b.a(f62Var.c(), c92Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.gd1
    public final synchronized void a(@NotNull C2360y7<?> adResponse, @NotNull List<tx1> showNotices) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        ap0.d(new Object[0]);
        this.f31003b.a(adResponse);
        this.f31011j.clear();
        this.f31003b.invalidate();
        this.f31014m = false;
        a();
        a(showNotices);
    }
}
