package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.libraries.onegoogle.account.disc.SimpleAvatarView;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.TextViewContainer;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards.CardFrameLayout;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwm {
    public final Object a;
    public final Object b;

    public fwm(Context context, cxl cxlVar, Account account, hac hacVar, hac hacVar2) {
        this.b = cxlVar;
        this.a = new cxf("profile-".concat("OneGoogle"), 1L);
        dos dosVar = new dos(hacVar2, account);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(dosVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"), 2);
        } else {
            context.registerReceiver(dosVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        }
        dot dotVar = new dot(hacVar, account);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(dotVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"), 2);
        } else {
            context.registerReceiver(dotVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
        }
    }

    public static fwm V(long j) {
        return new fwm(Long.TYPE, Long.valueOf(j), (short[]) null);
    }

    private static final lfy W(final int i, boolean z, gzp gzpVar) {
        gzp gzpVar2;
        jkj k = lfy.a.k();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        lfy lfyVar = (lfy) jkpVar;
        lfyVar.b |= 1;
        lfyVar.c = elapsedCpuTime;
        if (!jkpVar.M()) {
            k.t();
        }
        lfy lfyVar2 = (lfy) k.b;
        lfyVar2.b |= 2;
        lfyVar2.d = z;
        int activeCount = Thread.activeCount();
        if (!k.b.M()) {
            k.t();
        }
        lfy lfyVar3 = (lfy) k.b;
        lfyVar3.b |= 4;
        lfyVar3.e = activeCount;
        String format = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(i));
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(format, "r");
                try {
                    gzpVar2 = gzp.g(randomAccessFile.readLine()).a(new drv(20));
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                gzpVar2 = gyf.a;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            if (gzpVar2.f()) {
                int intValue = ((Integer) gzpVar2.b()).intValue();
                if (!k.b.M()) {
                    k.t();
                }
                lfy lfyVar4 = (lfy) k.b;
                lfyVar4.b |= 16;
                lfyVar4.g = intValue;
            }
            if (gzpVar.f()) {
                eli eliVar = (eli) gzpVar.b();
                gzp gzpVar3 = !eliVar.a ? gyf.a : (gzp) hnu.R(eliVar.a(), new gzr() { // from class: elg
                    @Override // defpackage.gzr
                    public final boolean a(Object obj) {
                        return ((ActivityManager.RunningAppProcessInfo) obj).pid == i;
                    }
                }).a(new drv(15)).d(gyf.a);
                if (gzpVar3.f()) {
                    String flattenToString = ((ComponentName) gzpVar3.b()).flattenToString();
                    if (!k.b.M()) {
                        k.t();
                    }
                    lfy lfyVar5 = (lfy) k.b;
                    flattenToString.getClass();
                    lfyVar5.b |= 32;
                    lfyVar5.h = flattenToString;
                }
            }
            return (lfy) k.q();
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fxf a(fxd fxdVar, frv frvVar) {
        try {
            fxf fxfVar = (fxf) fxdVar.d.get(Integer.valueOf(frvVar.a));
            if (fxfVar != null) {
                return fxfVar;
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new fvb(e);
        }
    }

    public static void i() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final void A(final double d, final String str, final String str2, final int i, final String str3, final boolean z) {
        B(new Runnable() { // from class: efl
            /* JADX WARN: Type inference failed for: r0v1, types: [hac, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((fdx) ((efn) fwm.this.b.bB()).f.bB()).b(d, str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void B(Runnable runnable) {
        ((efg) this.a).a(runnable);
    }

    public final void C(efe efeVar, eff effVar, int i) {
        B(new dpi(this, effVar, efeVar, i, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final void D() {
        fao.c();
        while (true) {
            ?? r0 = this.b;
            if (r0.isEmpty()) {
                return;
            } else {
                ((Runnable) r0.remove()).run();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ecs, java.lang.Object] */
    public final void E() {
        hoq.I(this.a.aH(), "Object was not initialized");
        dih.W(new ect(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ecs, java.lang.Object] */
    public final void F(Runnable runnable) {
        fao.c();
        this.b.add(runnable);
        if (this.a.aH()) {
            D();
        }
    }

    public final dzv G(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_card, viewGroup, false);
        inflate.getClass();
        CardFrameLayout cardFrameLayout = (CardFrameLayout) inflate;
        ConstraintLayout constraintLayout = (ConstraintLayout) cardFrameLayout.findViewById(R.id.og_bento_ready_card_container);
        constraintLayout.getClass();
        LayoutInflater.from(constraintLayout.getContext()).inflate(R.layout.og_bento_ready_card, constraintLayout);
        FrameLayout frameLayout = (FrameLayout) constraintLayout.findViewById(R.id.og_bento_card_trailing_content);
        LinearLayout linearLayout = (LinearLayout) constraintLayout.findViewById(R.id.og_bento_card_progress_content);
        FrameLayout frameLayout2 = (FrameLayout) constraintLayout.findViewById(R.id.og_bento_card_primary_button);
        FrameLayout frameLayout3 = (FrameLayout) constraintLayout.findViewById(R.id.og_bento_card_secondary_button);
        FrameLayout frameLayout4 = (FrameLayout) constraintLayout.findViewById(R.id.og_bento_card_image_container);
        tn tnVar = new tn();
        tnVar.c(constraintLayout);
        hac v = hoq.v(new cud(frameLayout4, 11));
        Object obj = this.a;
        byte[] bArr = null;
        hoq.v(new dxi(obj, frameLayout4, 5, bArr));
        View findViewById = constraintLayout.findViewById(R.id.og_bento_card_title);
        findViewById.getClass();
        iyi iyiVar = new iyi((TextView) findViewById, (TextViewContainer) constraintLayout.findViewById(R.id.og_bento_card_title_container));
        View findViewById2 = constraintLayout.findViewById(R.id.og_bento_card_subtitle);
        findViewById2.getClass();
        iyi iyiVar2 = new iyi((TextView) findViewById2, (TextViewContainer) null);
        View findViewById3 = constraintLayout.findViewById(R.id.og_bento_card_top_content);
        findViewById3.getClass();
        frameLayout.getClass();
        hac v2 = hoq.v(new dxi(obj, frameLayout, 6, bArr));
        View findViewById4 = constraintLayout.findViewById(R.id.og_bento_card_main_content);
        findViewById4.getClass();
        View findViewById5 = constraintLayout.findViewById(R.id.og_bento_card_paragraph);
        findViewById5.getClass();
        iyi iyiVar3 = new iyi((TextView) findViewById5, (TextViewContainer) null);
        hac v3 = hoq.v(new cud(linearLayout, 12));
        linearLayout.getClass();
        hac v4 = hoq.v(new cud(frameLayout2, 13));
        frameLayout2.getClass();
        hac v5 = hoq.v(new cud(frameLayout3, 14));
        frameLayout3.getClass();
        View findViewById6 = constraintLayout.findViewById(R.id.og_bento_card_buttons_flow);
        findViewById6.getClass();
        frameLayout4.getClass();
        eaf eafVar = new eaf(constraintLayout, tnVar, v, iyiVar, iyiVar2, (ConstraintLayout) findViewById3, frameLayout, v2, findViewById4, iyiVar3, v3, linearLayout, v4, frameLayout2, v5, frameLayout3, findViewById6, frameLayout4);
        cardFrameLayout.a = eafVar.w;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) cardFrameLayout.findViewById(R.id.og_bento_loading_card_container);
        Object obj2 = this.b;
        constraintLayout2.getClass();
        LayoutInflater.from(constraintLayout2.getContext()).inflate(R.layout.og_bento_loading_card, constraintLayout2);
        View findViewById7 = constraintLayout2.findViewById(R.id.og_bento_card_icon_placeholder);
        findViewById7.getClass();
        eaa eaaVar = (eaa) obj2;
        eaaVar.a((ImageView) findViewById7, eaa.b);
        View findViewById8 = constraintLayout2.findViewById(R.id.og_bento_card_title_placeholder);
        findViewById8.getClass();
        eaaVar.a((ImageView) findViewById8, eaa.a);
        return new dzv(cardFrameLayout, eafVar, constraintLayout, constraintLayout2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jpt] */
    public final dze H(ViewGroup viewGroup) {
        SimpleAvatarView simpleAvatarView = new SimpleAvatarView(viewGroup.getContext());
        simpleAvatarView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        simpleAvatarView.i(((ehi) this.a.b()).b());
        bst bstVar = (bst) this.b;
        simpleAvatarView.j(bstVar.j());
        simpleAvatarView.l();
        dja.y(simpleAvatarView, bstVar.h());
        viewGroup.addView(simpleAvatarView);
        return new dze(simpleAvatarView);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, koi] */
    public final ehi I() {
        return (ehi) this.b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(jfy jfyVar, gjl gjlVar, wo woVar, krt krtVar, lao laoVar, kqj kqjVar) {
        duk dukVar;
        int i;
        jfy jfyVar2;
        jfy jfyVar3;
        krt krtVar2 = krtVar;
        if (kqjVar instanceof duk) {
            dukVar = (duk) kqjVar;
            int i2 = dukVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dukVar.c = i2 - Integer.MIN_VALUE;
                duk dukVar2 = dukVar;
                Object obj = dukVar2.b;
                kqp kqpVar = kqp.a;
                i = dukVar2.c;
                if (i == 0) {
                    if (i == 1) {
                        ajq ajqVar = dukVar2.d;
                        Object obj2 = dukVar2.a;
                        ixc.Y(obj);
                        krtVar2 = ajqVar;
                        jfyVar2 = obj2;
                        if (jfyVar2.a() == jiv.a) {
                        }
                        return kow.a;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ajq ajqVar2 = dukVar2.d;
                    Object obj3 = dukVar2.a;
                    ixc.Y(obj);
                    krtVar2 = ajqVar2;
                    jfyVar3 = obj3;
                    jfyVar2 = jfyVar3;
                    if (jfyVar2.a() == jiv.a) {
                        krtVar2.a(new ajt(14));
                    }
                    return kow.a;
                }
                ixc.Y(obj);
                if (!(jfyVar instanceof jgy)) {
                    byte[] bArr = null;
                    if (jfyVar instanceof jgh) {
                        dukVar2.a = jfyVar;
                        dukVar2.d = (ajq) krtVar2;
                        dukVar2.c = 2;
                        jgg jggVar = ((jgh) jfyVar).a;
                        jit jitVar = jggVar.a;
                        int i3 = jggVar.g;
                        if (i3 != 1) {
                            obj = ((duf) this.b).c(gjlVar, i3, jitVar, woVar, laoVar, dukVar2);
                        } else {
                            if (((gzp) this.a).f()) {
                                laoVar.d(jhu.a((jhu) laoVar.b(), false, null, false, null, 11));
                                kxt kxtVar = new kxt();
                                kvj kvjVar = kwa.a;
                                ixg.i(new lby(ixe.h(kxtVar, lcv.a), 0), null, 0, new avz(this, jitVar, laoVar, (kqj) null, 5), 3);
                            } else {
                                ehq ehqVar = (ehq) ((ekx) gjlVar.m).c;
                                dov dovVar = ehqVar.b;
                                dqy dqyVar = ehqVar.a;
                                dqyVar.c(dih.G(dqyVar, dovVar, jitVar));
                            }
                            obj = kow.a;
                        }
                        if (obj == kqpVar) {
                            return kqpVar;
                        }
                        jfyVar3 = jfyVar;
                        jfyVar2 = jfyVar3;
                        if (jfyVar2.a() == jiv.a) {
                        }
                        return kow.a;
                    }
                    if (jfyVar instanceof jgw) {
                        krtVar2.a(new aya(gjlVar, jfyVar, 9, bArr));
                    } else if (jfyVar instanceof jfz) {
                        laoVar.d(jhu.a((jhu) laoVar.b(), ((jfz) jfyVar).a, null, false, null, 14));
                    } else if (!(jfyVar instanceof jgo) && !(jfyVar instanceof jfw)) {
                        if (jfyVar instanceof jgq) {
                            laoVar.d(jhu.a((jhu) laoVar.b(), false, Boolean.valueOf(((jgq) jfyVar).a), false, null, 13));
                        } else if (jfyVar instanceof jgp) {
                            jhu jhuVar = (jhu) laoVar.b();
                            boolean z = ((jgp) jfyVar).a;
                            laoVar.d(jhu.a(jhuVar, false, null, false, null, 11));
                        } else if (jfyVar instanceof jhj) {
                            krtVar2.a(new aya(gjlVar, jfyVar, 10, bArr));
                        } else if (jfyVar instanceof jhp) {
                            krtVar2.a(new aya(gjlVar, jfyVar, 11, bArr));
                        } else {
                            if (!(jfyVar instanceof jgt)) {
                                throw new koj();
                            }
                            krtVar2.a(new ajq(gjlVar, 19));
                        }
                    }
                }
                jfyVar2 = jfyVar;
                if (jfyVar2.a() == jiv.a) {
                }
                return kow.a;
            }
        }
        dukVar = new duk(this, kqjVar);
        duk dukVar22 = dukVar;
        Object obj4 = dukVar22.b;
        kqp kqpVar2 = kqp.a;
        i = dukVar22.c;
        if (i == 0) {
        }
    }

    public final hvi K() {
        cxi cxiVar = new cxi();
        return hoq.au(dih.d(((cxl) this.b).a(new byte[0], cxiVar, (cxf) this.a)), new bwu(14), huf.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final hvi L(doo dooVar, int i) {
        return hnu.aN(new bwr(this, i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Uri.parse(dooVar.g) : Uri.parse(dooVar.f) : Uri.parse(dooVar.e) : Uri.parse(dooVar.d) : Uri.parse(dooVar.c) : Uri.parse(dooVar.b), 5, null), this.a);
    }

    protected final String M(String str) {
        return ((String) this.a).concat(str);
    }

    public final void N(String str, Throwable th) {
        Log.e((String) this.b, M(str), th);
    }

    public final void O(String str) {
        Log.e((String) this.b, M(str));
    }

    public final void P(String str) {
        Log.w((String) this.b, M(str));
    }

    public final void Q() {
        Object obj = this.a;
        synchronized (obj) {
            ((SparseIntArray) obj).clear();
        }
    }

    public final int R(int i) {
        int i2;
        Object obj = this.a;
        synchronized (obj) {
            i2 = ((SparseIntArray) obj).get(i, -1);
        }
        return i2;
    }

    public final String S(String str) {
        Object obj = this.b;
        return obj == null ? str : ((String) obj).concat(str);
    }

    public final boolean T(int i) {
        return Log.isLoggable((String) this.a, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final void U(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        ?? r0 = this.a;
        synchronized (r0) {
            hashMap = new HashMap((Map) r0);
        }
        ?? r3 = this.b;
        synchronized (r3) {
            hashMap2 = new HashMap((Map) r3);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).j(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((bst) entry2.getKey()).d(new cmm(status));
            }
        }
    }

    public final String b(ful fulVar) {
        if (((String) ((gzs) this.b).a).equals(fulVar.k)) {
            return fulVar.g;
        }
        return null;
    }

    public final hvi c(frv frvVar) {
        hvi f = ((fwm) ((gzs) this.a).a).f(frvVar);
        int i = 14;
        gzf a = gvx.a(new euy(this, i));
        huf hufVar = huf.a;
        return hso.f(hso.f(hti.f(f, a, hufVar), IllegalArgumentException.class, gvx.a(new esh(13)), hufVar), fvb.class, gvx.a(new esh(i)), hufVar);
    }

    public final her d() {
        Set<fuu> b = ((jsd) this.a).b();
        hen henVar = new hen(4);
        for (fuu fuuVar : b) {
            String str = fuuVar.a;
            hoq.y(true ^ str.isEmpty(), "AccountProvider's account type cannot be an empty string.");
            henVar.g(str, fuuVar.b);
        }
        return henVar.d(true);
    }

    public final hvi e(frv frvVar) {
        Object obj = this.a;
        return hti.g(((iyi) ((ghf) obj).f).h(), gvx.c(new egl(obj, frvVar, 15, null)), huf.a);
    }

    public final hvi f(frv frvVar) {
        return hoq.at(((iyi) ((fwm) this.b).a).h(), new euy(frvVar, 16), huf.a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final hvi g() {
        fwm fwmVar = (fwm) this.b;
        return hoq.at(((iyi) fwmVar.a).h(), new esh(18), fwmVar.b);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final hvi h() {
        fwm fwmVar = (fwm) this.b;
        return hoq.at(((iyi) fwmVar.a).h(), new esh(17), fwmVar.b);
    }

    @SafeVarargs
    public final int j(ContentValues contentValues, String... strArr) {
        i();
        gty aC = hoq.aC(73, "UPDATE WHERE unique_id = ? ");
        try {
            int update = ((SQLiteDatabase) this.b).update("otp_table", contentValues, "unique_id = ? ", strArr);
            aC.close();
            return update;
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object, java.util.Set] */
    public final String k() {
        ?? r0 = this.b;
        int size = r0.size();
        if (size == 0) {
            return ((Context) this.a).getPackageName();
        }
        if (size != 1) {
            throw new IllegalArgumentException("More than 1 custom main process specified");
        }
        String a = ((ewn) hnu.X(r0)).a();
        hoq.C(a.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", a);
        return String.valueOf(((Context) this.a).getPackageName()).concat(String.valueOf(a));
    }

    public final boolean l() {
        if (!eos.H()) {
            return false;
        }
        String I = eos.I();
        if (I == null) {
            return true;
        }
        return I.equals(k());
    }

    public final eva m(String str, long j) {
        return new eut((String) this.b, str, (evj) this.a, j);
    }

    public final eva n(String str, boolean z) {
        return new eun((String) this.b, str, (evj) this.a, z);
    }

    public final eva o(String str, eum eumVar, String str2) {
        return new eup((String) this.b, str, (evj) this.a, eumVar, str2);
    }

    public final Cursor p(fwm fwmVar) {
        i();
        Object obj = fwmVar.b;
        gty aC = hoq.aC(72, "Query: ".concat((String) obj));
        try {
            Cursor rawQueryWithFactory = ((SQLiteDatabase) this.b).rawQueryWithFactory(new fdr((Object[]) fwmVar.a), (String) obj, null, null, (CancellationSignal) this.a);
            aC.close();
            return rawQueryWithFactory;
        } finally {
        }
    }

    public final void q(fwm fwmVar) {
        i();
        Object obj = fwmVar.b;
        gty aC = hoq.aC(70, "execSQL: ".concat((String) obj));
        try {
            ((SQLiteDatabase) this.b).execSQL((String) obj, (Object[]) fwmVar.a);
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final lfy r() {
        Object obj = this.a;
        int myPid = Process.myPid();
        eli a = elh.a((Context) obj, "getAndroidProcessStats");
        return W(myPid, ((iyi) this.b).w(new eks(a, 2)), gzp.g(a));
    }

    public final lfy s(int i, hac hacVar) {
        return W(i, ((iyi) this.b).w(hacVar), gzp.g((eli) hacVar.bB()));
    }

    public final void t(String str, String str2) {
        B(new ajx(this, str, str2, 18, (int[]) null));
    }

    public final void u(String str, String str2) {
        B(new ajx(this, str, str2, 19, (int[]) null));
    }

    public final void v(String str, String str2) {
        B(new ajx(this, str, str2, 17, (int[]) null));
    }

    public final void w(String str, String str2, String str3, String str4, boolean z) {
        B(new efj(this, str, str2, str3, str4, z, 0));
    }

    public final void x(final String str, final String str2, final int i, final String str3, final boolean z) {
        B(new Runnable() { // from class: efi
            /* JADX WARN: Type inference failed for: r0v1, types: [hac, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((fea) ((efn) fwm.this.b.bB()).d.bB()).b(str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void y(final String str, final boolean z, final boolean z2, final boolean z3, final int i, final String str2) {
        B(new Runnable() { // from class: efh
            /* JADX WARN: Type inference failed for: r0v1, types: [hac, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((fea) ((efn) fwm.this.b.bB()).c.bB()).b(str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i), str2);
            }
        });
    }

    public final void z(final double d, final String str, final String str2, final String str3, final String str4, final boolean z) {
        B(new Runnable() { // from class: efk
            /* JADX WARN: Type inference failed for: r0v1, types: [hac, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((fdx) ((efn) fwm.this.b.bB()).g.bB()).b(d, str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public fwm(Context context, byte[] bArr) {
        this.a = context;
        this.b = new kop(new aux(this, 14));
    }

    public fwm(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public fwm(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public fwm(Object obj, Object obj2, char[] cArr) {
        this.a = obj;
        this.b = obj2;
    }

    public fwm(Object obj, Object obj2, short[] sArr) {
        this.a = obj;
        this.b = obj2;
    }

    public fwm(String str) {
        this.a = str;
        this.b = "Auth";
        for (int i = 2; i <= 7 && !Log.isLoggable((String) this.b, i); i++) {
        }
    }

    public fwm(String str, byte[] bArr) {
        this.a = str;
        this.b = null;
    }

    public fwm(koe koeVar, Executor executor) {
        this.b = executor;
        this.a = koeVar;
    }

    public fwm(Activity activity) {
        this.a = activity;
        this.b = new cud(activity, 0);
    }

    public fwm(clm clmVar) {
        this.a = new SparseIntArray();
        oy.at(clmVar);
        this.b = clmVar;
    }

    public fwm(ecs ecsVar) {
        this.b = new ArrayDeque();
        this.a = ecsVar;
    }

    public fwm(gzp gzpVar, gzp gzpVar2, gzp gzpVar3) {
        this.a = gzpVar;
        this.b = gzpVar2;
        ((Boolean) gzpVar3.d(false)).booleanValue();
    }

    public fwm(jpt jptVar, bst bstVar) {
        jptVar.getClass();
        this.a = jptVar;
        this.b = bstVar;
    }

    public fwm(byte[] bArr, byte[] bArr2) {
        this.b = new WeakHashMap();
        this.a = new eke(this);
    }

    public fwm(char[] cArr) {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public fwm(Context context, ScheduledExecutorService scheduledExecutorService) {
        context.getClass();
        scheduledExecutorService.getClass();
        this.b = hoq.v(new dxi(scheduledExecutorService, context, 8, null));
        this.a = new efg(scheduledExecutorService);
    }

    public fwm(Context context) {
        this.b = new elq();
        this.a = context;
    }

    public fwm(Context context, Map map) {
        this.a = context;
        this.b = map.keySet();
    }

    public fwm(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
        this.a = new CancellationSignal();
    }

    public fwm() {
        this.b = new Rect();
        this.a = new Rect();
    }

    public fwm(dov dovVar, gzp gzpVar) {
        dovVar.getClass();
        this.a = dovVar;
        this.b = gzpVar;
    }

    public fwm(duf dufVar, gzp gzpVar, gzp gzpVar2) {
        gzpVar.getClass();
        gzpVar2.getClass();
        this.b = dufVar;
        this.a = gzpVar2;
    }
}
