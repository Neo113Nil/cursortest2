package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fnh implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fnh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v36, types: [hvi, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        int i = 0;
        int i2 = 1;
        switch (this.b) {
            case 0:
                gam gamVar = new gam((byte[]) null);
                fnr fnrVar = (fnr) this.a;
                gamVar.b(fnrVar.f(true));
                Iterator it = fnrVar.i(true).iterator();
                while (it.hasNext()) {
                    gamVar.c((act) it.next());
                }
                gamVar.d(new fni(fnrVar, gamVar, 1));
                gamVar.f();
                fnrVar.w = gamVar;
                return;
            case 1:
                ((View) this.a).requestFocus();
                return;
            case 2:
                ((fng) this.a).d();
                return;
            case 3:
                fnr fnrVar2 = (fnr) this.a;
                fnrVar2.c.setTranslationY(r0.getHeight());
                AnimatorSet g = fnrVar2.g(true);
                g.addListener(new fnj(fnrVar2, g));
                g.start();
                fnrVar2.m = g;
                return;
            case 4:
                fpk fpkVar = (fpk) this.a;
                fpj fpjVar = fpkVar.j;
                if (fpjVar == null || (context = fpkVar.i) == null) {
                    return;
                }
                int height = fik.b(context).height();
                int[] iArr = new int[2];
                fpjVar.getLocationInWindow(iArr);
                int height2 = height - (iArr[1] + fpjVar.getHeight());
                int translationY = (int) fpjVar.getTranslationY();
                int i3 = fpkVar.q;
                int i4 = height2 + translationY;
                if (i4 >= i3) {
                    fpkVar.r = i3;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = fpjVar.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(fpk.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                fpkVar.r = fpkVar.q;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += fpkVar.q - i4;
                fpjVar.requestLayout();
                return;
            case 5:
                ((fpk) this.a).k();
                return;
            case 6:
                Object obj = this.a;
                fpk fpkVar2 = (fpk) obj;
                fpj fpjVar2 = fpkVar2.j;
                if (fpjVar2 == null) {
                    return;
                }
                if (fpjVar2.getParent() != null) {
                    fpjVar2.setVisibility(0);
                }
                if (fpjVar2.c == 1) {
                    ValueAnimator c = fpkVar2.c(0.0f, 1.0f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
                    ofFloat.setInterpolator(fpkVar2.g);
                    ofFloat.addUpdateListener(new fpa(obj, 2));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(c, ofFloat);
                    animatorSet.setDuration(fpkVar2.c);
                    animatorSet.addListener(new fpg(fpkVar2));
                    animatorSet.start();
                    return;
                }
                int b = fpkVar2.b();
                fpjVar2.setTranslationY(b);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(b, 0);
                valueAnimator.setInterpolator(fpkVar2.f);
                valueAnimator.setDuration(fpkVar2.e);
                valueAnimator.addListener(new fpb(fpkVar2));
                valueAnimator.addUpdateListener(new fpa(obj, 3));
                valueAnimator.start();
                return;
            case 7:
                ((fqe) this.a).f(true);
                return;
            case 8:
                fqo fqoVar = (fqo) this.a;
                boolean isPopupShowing = fqoVar.a.isPopupShowing();
                fqoVar.k(isPopupShowing);
                fqoVar.c = isPopupShowing;
                return;
            case 9:
                ((TextInputLayout) this.a).c.requestLayout();
                return;
            case 10:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.a).b.d;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 11:
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((azj) this.a).e();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Context context2 = ((gac) this.a).b;
                for (String str : context2.databaseList()) {
                    if (str.startsWith("SqliteKeyValueCache:") && str.endsWith(":Singleton") && !str.endsWith("-wal") && !str.endsWith("-shm")) {
                        if (context2.deleteDatabase(str)) {
                            ((hkf) ((hkf) gac.a.e()).i("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "wipeLegacy", 75, "OrphanCacheSingletonSynclet.java")).u("Removed orphaned cache file: %s", str);
                        } else {
                            ((hkf) ((hkf) gac.a.f()).i("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "wipeLegacy", 77, "OrphanCacheSingletonSynclet.java")).u("Failed to remove orphaned cache file: %s", str);
                        }
                    }
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((PowerManager.WakeLock) this.a).release();
                return;
            case 15:
                gbf.d(this.a);
                return;
            case 16:
                throw ((Throwable) this.a);
            case 17:
                throw ((Throwable) this.a);
            case 18:
                geu geuVar = ((get) this.a).a;
                gec gecVar = (gec) geuVar.d.getAndSet(null);
                gei geiVar = geuVar.f;
                long j = geiVar.d;
                boolean z = j != Long.MAX_VALUE;
                Instant now = Instant.now();
                hoq.I(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
                gdn gdnVar = geiVar.a;
                Object obj2 = geiVar.b;
                geuVar.f = new gei(gdnVar, geiVar.c, j, geiVar.f, geiVar.e.a(gdnVar, now));
                if (gec.a.equals(gecVar)) {
                    geuVar.e(geuVar.f.e);
                    return;
                } else {
                    if (!gec.b.equals(gecVar)) {
                        throw new IllegalStateException("Invalidation was ".concat(String.valueOf(String.valueOf(gecVar))));
                    }
                    geuVar.d(geuVar.f.e);
                    return;
                }
            case 19:
                gfo gfoVar = (gfo) this.a;
                hjr it2 = gfoVar.b.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    gex gexVar = (gex) entry.getKey();
                    hrz hrzVar = (hrz) entry.getValue();
                    gfq gfqVar = new gfq(gexVar, i2);
                    gfl gflVar = new gfl(gfoVar, hrzVar, i2);
                    fao.c();
                    Object obj3 = hrzVar.a;
                    obj3.getClass();
                    gfp gfpVar = (gfp) obj3;
                    gzp gzpVar = gfpVar.c;
                    if (gzpVar.f()) {
                        hrzVar.a = gfpVar.a((gft) gzpVar.b());
                    }
                    gfp gfpVar2 = (gfp) hrzVar.a;
                    gzp gzpVar2 = gfpVar2.d;
                    gzp gzpVar3 = gfpVar2.b;
                    if (gzpVar2.f()) {
                        gfqVar.accept(gzpVar2.b());
                    }
                    if (gzpVar3.f()) {
                        gflVar.accept(gzpVar3.b());
                    }
                }
                return;
            default:
                throw ((Throwable) this.a);
        }
        while (true) {
            fua fuaVar = (fua) this.a;
            if (i >= fuaVar.b) {
                return;
            }
            ((hvi) fuaVar.a.get(i)).cancel(true);
            i++;
        }
    }

    public fnh(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
