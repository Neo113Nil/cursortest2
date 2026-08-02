package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajx implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public ajx(coo cooVar, col colVar, int i) {
        this.d = i;
        this.b = colVar;
        this.a = "ConnectionlessLifecycleHelper";
        this.c = cooVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v108, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v116, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kri] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kri] */
    /* JADX WARN: Type inference failed for: r0v93, types: [aer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kuv] */
    /* JADX WARN: Type inference failed for: r14v40, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.view.ViewTreeObserver$OnDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r1v9, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kuv] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, krx] */
    /* JADX WARN: Type inference failed for: r6v4, types: [awt, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        axl a;
        ArrayList arrayList;
        Object[] objArr = 0;
        boolean z = true;
        boolean z2 = true;
        z = true;
        boolean z3 = false;
        switch (this.d) {
            case 0:
                try {
                    ?? r3 = this.a;
                    ixg.e(((kuw) r3).b.minusKey(kqk.b), new akl((ajw) this.b, (kuv) r3, (krx) this.c, (kqj) null, 1));
                    return;
                } catch (Throwable th) {
                    this.a.j(th);
                    return;
                }
            case 1:
                int i = ai.e;
                ((ViewGroup) this.a).endViewTransition((View) this.c);
                Object obj = this.b;
                ((aj) obj).a.a.f((ck) obj);
                return;
            case 2:
                aru.a((AtomicBoolean) this.c, (rm) this.b, this.a);
                return;
            case 3:
                aru.a((AtomicBoolean) this.c, (rm) this.b, this.a);
                return;
            case 4:
                Object obj2 = this.c;
                ?? r1 = this.a;
                Object obj3 = this.b;
                try {
                    z2 = ((Boolean) r1.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (((atx) obj3).k) {
                    a = ((avi) obj2).a();
                    String str = a.a;
                    if (((atx) obj3).b(str) == obj2) {
                        ((atx) obj3).a(str);
                    }
                    asq.a();
                    obj3.getClass().getSimpleName();
                    arrayList = new ArrayList(((atx) obj3).j);
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((atm) arrayList.get(i2)).a(a, z2);
                }
                return;
            case 5:
                ArrayList arrayList2 = new ArrayList();
                ?? r6 = ((brr) this.a).b;
                Object obj4 = this.c;
                Object obj5 = ((brn) obj4).a;
                axl axlVar = (axl) obj5;
                String str2 = axlVar.a;
                atx atxVar = (atx) r6;
                bqi bqiVar = new bqi(atxVar, arrayList2, str2, z ? 1 : 0);
                WorkDatabase workDatabase = atxVar.e;
                axt axtVar = (axt) workDatabase.e(bqiVar);
                if (axtVar == null) {
                    asq a2 = asq.a();
                    String str3 = atx.a;
                    Objects.toString(obj5);
                    a2.e(str3, "Didn't find WorkSpec for id ".concat(obj5.toString()));
                    atxVar.f(axlVar);
                    return;
                }
                synchronized (atxVar.k) {
                    if (((atx) r6).e(str2)) {
                        Set set = (Set) ((atx) r6).h.get(str2);
                        if (((axl) ((brn) set.iterator().next()).a).b == ((axl) obj5).b) {
                            set.add(obj4);
                            asq.a();
                            Objects.toString(obj5);
                        } else {
                            ((atx) r6).f((axl) obj5);
                        }
                        return;
                    }
                    if (axtVar.t != ((axl) obj5).b) {
                        ((atx) r6).f((axl) obj5);
                        return;
                    }
                    Context context = ((atx) r6).c;
                    arv arvVar = ((atx) r6).d;
                    ldt ldtVar = ((atx) r6).l;
                    avi aviVar = new avi(new iee(context, arvVar, ldtVar, (awt) r6, workDatabase, axtVar, arrayList2));
                    hvi g = yn.g(((kqe) aviVar.k.c).plus(new kww()), new aki(aviVar, (kqj) null, 6, (byte[]) null));
                    g.c(new ajx((Object) r6, (Object) g, (Object) aviVar, 4, (char[]) null), ldtVar.d);
                    ((atx) r6).g.put(str2, aviVar);
                    HashSet hashSet = new HashSet();
                    hashSet.add(obj4);
                    ((atx) r6).h.put(str2, hashSet);
                    asq.a();
                    r6.getClass().getSimpleName();
                    Objects.toString(obj5);
                    return;
                }
            case 6:
                Object obj6 = this.b;
                Object obj7 = this.c;
                Object obj8 = this.a;
                if (!(obj6 instanceof ave)) {
                    if (obj6 instanceof avd) {
                        ((avi) obj7).f(new asm());
                        ((ksu) obj8).a = false;
                        return;
                    } else if (obj6 instanceof avf) {
                        ((ksu) obj8).a = ((avi) obj7).c(((avf) obj6).a);
                        return;
                    } else {
                        if (!(obj6 instanceof avg)) {
                            throw new koj();
                        }
                        if (((avg) obj6).a) {
                            z3 = ((avi) obj7).c(-256);
                        } else {
                            ((avi) obj7).f(new asm());
                        }
                        ((ksu) obj8).a = z3;
                        return;
                    }
                }
                yo yoVar = ((ave) obj6).a;
                avi aviVar2 = (avi) obj7;
                axu axuVar = aviVar2.f;
                String str4 = aviVar2.c;
                WorkDatabase workDatabase2 = aviVar2.e;
                atb b = axuVar.b(str4);
                workDatabase2.B().a(str4);
                if (b != null) {
                    if (b == atb.b) {
                        if (yoVar instanceof aso) {
                            String str5 = avk.a;
                            asq.a();
                            if (aviVar2.a.d()) {
                                aviVar2.e();
                            } else {
                                axuVar.B(atb.c, str4);
                                asa asaVar = ((aso) yoVar).a;
                                asaVar.getClass();
                                axuVar.r(str4, asaVar);
                                awx awxVar = aviVar2.g;
                                long currentTimeMillis = System.currentTimeMillis();
                                for (String str6 : awxVar.a(str4)) {
                                    if (axuVar.b(str6) == atb.e && awxVar.b(str6)) {
                                        asq.a();
                                        axuVar.B(atb.a, str6);
                                        axuVar.q(str6, currentTimeMillis);
                                        aviVar2.i.add(str6);
                                    }
                                }
                            }
                        } else {
                            if (yoVar instanceof asn) {
                                String str7 = avk.a;
                                asq.a();
                                aviVar2.d(-256);
                                ((ksu) obj8).a = z;
                                return;
                            }
                            String str8 = avk.a;
                            asq.a();
                            if (aviVar2.a.d()) {
                                aviVar2.e();
                            } else {
                                aviVar2.g(yoVar);
                            }
                        }
                    } else if (!b.a()) {
                        aviVar2.d(-512);
                        ((ksu) obj8).a = z;
                        return;
                    }
                }
                z = false;
                ((ksu) obj8).a = z;
                return;
            case 7:
                Iterator it = ((WorkDatabase) this.b).C().j((String) this.a).iterator();
                while (it.hasNext()) {
                    aei.h((auy) this.c, (String) it.next());
                }
                return;
            case 8:
                big a3 = big.a();
                bmi.f();
                a3.b.set(true);
                bka bkaVar = ((bjz) this.a).b;
                bkaVar.b = true;
                ((View) this.b).getViewTreeObserver().removeOnDrawListener(this.c);
                bkaVar.a.clear();
                return;
            case 9:
                Object obj9 = this.b;
                Object obj10 = this.c;
                Object obj11 = this.a;
                try {
                    iyi iyiVar = ((cfk) obj11).f;
                    String str9 = ((ces) obj10).a;
                    cfb y = iyiVar.y(str9);
                    if (y != null) {
                        ((cfk) obj11).d.f(new cfx((cfk) obj11, (ces) obj10, y.a((ceo) obj9), z ? 1 : 0));
                        return;
                    }
                    String format = String.format("Transport backend '%s' is not registered", str9);
                    cfk.a.logp(Level.WARNING, "com.google.android.datatransport.runtime.scheduling.DefaultScheduler", "schedule", format);
                    new IllegalArgumentException(format);
                    return;
                } catch (Exception e) {
                    cfk.a.logp(Level.WARNING, "com.google.android.datatransport.runtime.scheduling.DefaultScheduler", "schedule", "Error scheduling event ".concat(String.valueOf(e.getMessage())));
                    return;
                }
            case 10:
                coo cooVar = (coo) this.c;
                if (cooVar.a > 0) {
                    Object obj12 = this.b;
                    Bundle bundle = cooVar.b;
                    ((col) obj12).d(bundle != null ? bundle.getBundle((String) this.a) : null);
                }
                if (cooVar.a >= 2) {
                    ((col) this.b).i();
                }
                if (cooVar.a >= 3) {
                    ((cnz) this.b).k();
                }
                if (cooVar.a >= 4) {
                    ((col) this.b).j();
                    return;
                }
                return;
            case 11:
                huf hufVar = huf.a;
                dfu dfuVar = new dfu();
                Object obj13 = this.b;
                StrictMode.ThreadPolicy.Builder builder = (StrictMode.ThreadPolicy.Builder) obj13;
                builder.penaltyListener(hufVar, dfuVar);
                gzp gzpVar = (gzp) ((jrx) ((bst) this.c).a).a;
                if (gzpVar.f()) {
                    try {
                        feh fehVar = (feh) gzpVar.b();
                        ((StrictMode.ThreadPolicy.Builder) obj13).build();
                        fehVar.a();
                    } catch (Exception e2) {
                        Log.e("AndroidExecutorsModule", "Failed to install thread interceptor", e2);
                        fhq.i(builder.penaltyLog().penaltyDeath().build());
                    }
                } else {
                    fhq.i(builder.penaltyLog().penaltyDeath().build());
                }
                this.a.run();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((AccountParticleDisc) this.c).i.a(this.a, (ImageView) this.b);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj14 = this.b;
                Object obj15 = this.c;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(((dpk) obj15).a((Bitmap) obj14));
                Map map = dpl.a;
                Object obj16 = this.a;
                map.put(obj16, bitmapDrawable);
                dpl.b.remove(obj16);
                dih.W(new dgc(obj15, bitmapDrawable, 17, objArr == true ? 1 : 0));
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ?? r0 = this.b;
                boolean a4 = r0.L().c.a(aek.d);
                Object obj17 = this.c;
                Object obj18 = this.a;
                if (a4) {
                    ((SelectedAccountDisc) obj17).b((dsf) obj18, r0);
                    return;
                } else {
                    r0.L().a(new drm((SelectedAccountDisc) obj17, (dsf) obj18, r0));
                    return;
                }
            case 15:
                Object obj19 = this.a;
                dtw dtwVar = (dtw) obj19;
                ehi b2 = dtwVar.aG().a().b();
                View view = (View) this.b;
                Context context2 = view.getContext();
                context2.getClass();
                eff a5 = dtwVar.aG().a().a();
                gjl gjlVar = dtwVar.ar;
                if (gjlVar == null) {
                    ksp.a("appStateDataInterface");
                    gjlVar = null;
                }
                Object obj20 = this.c;
                b2.c(context2, a5, (fwm) gjlVar.d);
                bd bdVar = (bd) obj19;
                ixg.i(yj.j(bdVar.M()), null, 0, new avz(dtwVar, (FrameLayout) obj20, view, null, 4, null), 3);
                if (dtwVar.ar == null) {
                    ksp.a("appStateDataInterface");
                }
                ixg.i(yj.j(bdVar.M()), null, 0, new aki(dtwVar, (kqj) null, 16, (byte[]) null), 3);
                return;
            case 16:
                ((eea) this.b).d((eeg) this.c, this.a);
                return;
            case 17:
                ((fea) ((efn) ((fwm) this.b).b.bB()).h.bB()).b(this.c, this.a);
                return;
            case 18:
                ((fea) ((efn) ((fwm) this.b).b.bB()).k.bB()).b(this.c, this.a);
                return;
            case 19:
                ((fea) ((efn) ((fwm) this.b).b.bB()).j.bB()).b(this.c, this.a);
                return;
            default:
                ((ert) this.c).c(this.a, (ggw) this.b);
                return;
        }
    }

    public ajx(bjz bjzVar, View view, ViewTreeObserver.OnDrawListener onDrawListener, int i) {
        this.d = i;
        this.b = view;
        this.c = onDrawListener;
        this.a = bjzVar;
    }

    public /* synthetic */ ajx(dtw dtwVar, View view, FrameLayout frameLayout, int i) {
        this.d = i;
        this.a = dtwVar;
        this.b = view;
        this.c = frameLayout;
    }

    public /* synthetic */ ajx(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ajx(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ajx(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ajx(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ajx(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public ajx(kuv kuvVar, ajw ajwVar, krx krxVar, int i) {
        this.d = i;
        this.a = kuvVar;
        this.b = ajwVar;
        this.c = krxVar;
    }
}
