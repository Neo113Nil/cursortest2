package com.anythink.splashad.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.l;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.i;
import com.anythink.core.common.h.n;
import com.anythink.core.common.u;
import com.anythink.core.common.u.h;
import com.anythink.core.common.v.a.f;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.d;
import com.anythink.splashad.api.ATSplashAdExtraInfo;
import com.anythink.splashad.api.ATSplashSkipAdListener;
import com.anythink.splashad.api.ATSplashSkipInfo;
import com.anythink.splashad.api.IATSplashEyeAd;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import com.anythink.splashad.unitgroup.api.CustomSplashEventListener;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class f implements CustomSplashEventListener {

    /* renamed from: a, reason: collision with root package name */
    CustomSplashAdapter f23505a;

    /* renamed from: b, reason: collision with root package name */
    a f23506b;

    /* renamed from: c, reason: collision with root package name */
    boolean f23507c;

    /* renamed from: d, reason: collision with root package name */
    long f23508d;

    /* renamed from: e, reason: collision with root package name */
    private Timer f23509e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23510f = false;

    /* renamed from: g, reason: collision with root package name */
    private int f23511g = 0;

    /* renamed from: com.anythink.splashad.a.f$2, reason: invalid class name */
    public class AnonymousClass2 extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f23514a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.b f23515b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ATSplashSkipAdListener f23516c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f23517d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f23518e;

        public AnonymousClass2(ViewGroup viewGroup, f.b bVar, ATSplashSkipAdListener aTSplashSkipAdListener, long j9, long j10) {
            this.f23514a = viewGroup;
            this.f23515b = bVar;
            this.f23516c = aTSplashSkipAdListener;
            this.f23517d = j9;
            this.f23518e = j10;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ViewGroup viewGroup = this.f23514a;
            if (viewGroup == null || am.a(viewGroup, this.f23515b)) {
                t.b().b(new Runnable() { // from class: com.anythink.splashad.a.f.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        f fVar = f.this;
                        long j9 = fVar.f23508d;
                        if (j9 <= 0) {
                            fVar.a(3);
                            f.this.onSplashAdDismiss();
                        } else {
                            ATSplashSkipAdListener aTSplashSkipAdListener = anonymousClass2.f23516c;
                            if (aTSplashSkipAdListener != null) {
                                aTSplashSkipAdListener.onAdTick(anonymousClass2.f23517d, j9);
                            }
                        }
                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                        f.this.f23508d -= anonymousClass22.f23518e;
                    }
                });
            }
        }
    }

    /* renamed from: com.anythink.splashad.a.f$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATSplashSkipAdListener f23521a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f23522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f23523c;

        public AnonymousClass3(ATSplashSkipAdListener aTSplashSkipAdListener, long j9, long j10) {
            this.f23521a = aTSplashSkipAdListener;
            this.f23522b = j9;
            this.f23523c = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATSplashSkipAdListener aTSplashSkipAdListener = this.f23521a;
            if (aTSplashSkipAdListener != null) {
                aTSplashSkipAdListener.onAdTick(this.f23522b, f.this.f23508d);
                f.this.f23508d -= this.f23523c;
            }
        }
    }

    public f(CustomSplashAdapter customSplashAdapter, a aVar) {
        this.f23505a = customSplashAdapter;
        this.f23506b = aVar;
    }

    private void a(ATSplashSkipInfo aTSplashSkipInfo) {
        if (this.f23509e == null) {
            long callbackInterval = aTSplashSkipInfo.getCallbackInterval();
            long countDownDuration = aTSplashSkipInfo.getCountDownDuration();
            ViewGroup container = aTSplashSkipInfo.getContainer();
            f.b bVar = new f.b(1);
            ATSplashSkipAdListener aTSplashSkipAdListener = aTSplashSkipInfo.getATSplashSkipAdListener();
            this.f23508d = countDownDuration;
            Timer timer = new Timer();
            this.f23509e = timer;
            timer.schedule(new AnonymousClass2(container, bVar, aTSplashSkipAdListener, countDownDuration, callbackInterval), callbackInterval, callbackInterval);
            t.b().b(new AnonymousClass3(aTSplashSkipAdListener, countDownDuration, callbackInterval));
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDeeplinkCallback(boolean z8) {
        a aVar = this.f23506b;
        if (aVar != null) {
            aVar.onDeeplinkCallback(l.a(this.f23505a), z8);
        }
        CustomSplashAdapter customSplashAdapter = this.f23505a;
        if (customSplashAdapter != null) {
            ab.a(customSplashAdapter.getTrackingInfo(), j.r.f12694j, z8 ? j.r.f12697m : j.r.f12698n, "");
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        a aVar = this.f23506b;
        if (aVar != null) {
            aVar.onDownloadConfirm(context, l.a(this.f23505a), aTNetworkConfirmInfo);
        }
        CustomSplashAdapter customSplashAdapter = this.f23505a;
        if (customSplashAdapter != null) {
            ab.a(customSplashAdapter.getTrackingInfo(), j.r.f12695k, j.r.f12697m, "");
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdClicked() {
        CustomSplashAdapter customSplashAdapter = this.f23505a;
        if (customSplashAdapter != null) {
            n trackingInfo = customSplashAdapter.getTrackingInfo();
            com.anythink.core.common.u.c.a(t.b().g()).a(6, trackingInfo);
            if (trackingInfo != null ? trackingInfo.aw() : false) {
                return;
            } else {
                ab.a(trackingInfo, j.r.f12689d, j.r.f12697m, "");
            }
        }
        com.anythink.core.common.v.c.a().b(this.f23505a);
        a aVar = this.f23506b;
        if (aVar != null) {
            aVar.onAdClick(l.a(this.f23505a));
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdDismiss() {
        boolean z8;
        Timer timer = this.f23509e;
        if (timer != null) {
            timer.cancel();
        }
        CustomSplashAdapter customSplashAdapter = this.f23505a;
        if (customSplashAdapter != null) {
            n trackingInfo = customSplashAdapter.getTrackingInfo();
            int i = this.f23511g;
            if (i != 0) {
                trackingInfo.K(i);
            } else {
                i = this.f23505a.getDismissType();
                if (i == 0) {
                    i = 1;
                }
                trackingInfo.K(i);
            }
            Map<String, Object> adExtraInfoMap = this.f23505a.getAdExtraInfoMap();
            if (adExtraInfoMap != null) {
                Object remove = adExtraInfoMap.remove(b.C0073b.f12265a);
                Object remove2 = adExtraInfoMap.remove(b.C0073b.f12266b);
                if (remove instanceof Integer) {
                    trackingInfo.R(((Integer) remove).intValue());
                }
                z8 = remove2 instanceof Boolean ? ((Boolean) remove2).booleanValue() : true;
                Object remove3 = adExtraInfoMap.remove(b.C0073b.f12267c);
                Object remove4 = adExtraInfoMap.remove(b.C0073b.f12268d);
                if (remove3 instanceof Integer) {
                    trackingInfo.S(((Integer) remove3).intValue());
                } else {
                    trackingInfo.S(2);
                }
                if (remove4 instanceof Integer) {
                    trackingInfo.T(((Integer) remove4).intValue());
                } else {
                    trackingInfo.T(2);
                }
            } else {
                z8 = true;
            }
            com.anythink.core.common.u.e.a(trackingInfo, false);
            ATSplashSkipInfo splashSkipInfo = this.f23505a.getSplashSkipInfo();
            if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView()) {
                this.f23505a.startSplashCustomSkipViewClickEye();
                Timer timer2 = this.f23509e;
                if (timer2 != null) {
                    timer2.cancel();
                    this.f23509e = null;
                }
                splashSkipInfo.destroy();
                this.f23505a.setSplashSkipInfo(null);
            }
            ab.a(trackingInfo, j.r.f12690e, j.r.f12697m, "");
            a(trackingInfo.aI());
            IATSplashEyeAd splashEyeAd = this.f23505a != null ? this.f23505a.getSplashEyeAd() : null;
            if (this.f23506b != null && !this.f23510f) {
                this.f23510f = true;
                if (trackingInfo.Y() != 66) {
                    this.f23506b.onCallbackAdDismiss(l.a(trackingInfo, this.f23505a), new ATSplashAdExtraInfo(i, splashEyeAd));
                } else if (z8) {
                    this.f23506b.onCallbackAdDismiss(l.a(trackingInfo, this.f23505a), new ATSplashAdExtraInfo(i, splashEyeAd));
                }
            }
            if (splashEyeAd == null) {
                CustomSplashAdapter customSplashAdapter2 = this.f23505a;
                if (customSplashAdapter2 != null) {
                    customSplashAdapter2.cleanImpressionListener();
                }
                if (this.f23505a != null) {
                    com.anythink.core.common.v.d.a().d(this.f23505a);
                    this.f23505a.internalDestory();
                }
            }
            a(trackingInfo.aI(), 18);
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShow() {
        f fVar;
        if ((this.f23505a == null || (com.anythink.core.common.v.d.a().a(this.f23505a) && com.anythink.core.common.v.d.a().b(this.f23505a))) && !this.f23507c) {
            this.f23507c = true;
            com.anythink.core.common.v.c.a().a(this.f23505a);
            l a9 = l.a(this.f23505a);
            CustomSplashAdapter customSplashAdapter = this.f23505a;
            if (customSplashAdapter != null) {
                final n trackingInfo = customSplashAdapter.getTrackingInfo();
                trackingInfo.a(this.f23505a.getInternalNetworkInfoMap());
                com.anythink.core.common.v.d.a().a(trackingInfo, this.f23505a.getUnitGroupInfo(), 6);
                com.anythink.core.common.v.d.a().a(this.f23505a, new d.a() { // from class: com.anythink.splashad.a.f.1
                    @Override // com.anythink.core.common.v.d.a
                    public final void a() {
                        com.anythink.core.common.u.c.a(t.b().g()).a(4, trackingInfo, f.this.f23505a.getUnitGroupInfo());
                    }

                    @Override // com.anythink.core.common.v.d.a
                    public final void b() {
                    }
                });
                ab.a(trackingInfo, j.r.f12688c, j.r.f12697m, "");
                ATSplashSkipInfo splashSkipInfo = this.f23505a.getSplashSkipInfo();
                if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView() && this.f23505a.isSupportCustomSkipView() && this.f23509e == null) {
                    long callbackInterval = splashSkipInfo.getCallbackInterval();
                    long countDownDuration = splashSkipInfo.getCountDownDuration();
                    ViewGroup container = splashSkipInfo.getContainer();
                    f.b bVar = new f.b(1);
                    ATSplashSkipAdListener aTSplashSkipAdListener = splashSkipInfo.getATSplashSkipAdListener();
                    this.f23508d = countDownDuration;
                    Timer timer = new Timer();
                    this.f23509e = timer;
                    timer.schedule(new AnonymousClass2(container, bVar, aTSplashSkipAdListener, countDownDuration, callbackInterval), callbackInterval, callbackInterval);
                    fVar = this;
                    t.b().b(fVar.new AnonymousClass3(aTSplashSkipAdListener, countDownDuration, callbackInterval));
                } else {
                    fVar = this;
                }
                u.a().a(trackingInfo.aI(), a9);
                a(trackingInfo.aI(), 6);
            } else {
                fVar = this;
            }
            if (fVar.f23506b != null) {
                if (a9.getNetworkFirmId() == -1) {
                    h.a(j.n.f12666e, fVar.f23505a, null);
                }
                fVar.f23506b.onAdShow(a9);
            }
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShowFail(AdError adError) {
        String str;
        CustomSplashAdapter customSplashAdapter = this.f23505a;
        if (customSplashAdapter != null) {
            n trackingInfo = customSplashAdapter.getTrackingInfo();
            com.anythink.core.common.u.e.a(trackingInfo, adError, this.f23505a.getInternalNetworkInfoMap());
            if (trackingInfo != null) {
                str = trackingInfo.aI();
                a(trackingInfo.aI());
            } else {
                str = "";
            }
            a(str, 7);
            ab.a(trackingInfo, j.r.f12696l, j.r.f12698n, adError != null ? adError.getFullErrorInfo() : "");
        }
    }

    private void a() {
        Timer timer = this.f23509e;
        if (timer != null) {
            timer.cancel();
            this.f23509e = null;
        }
    }

    public final void a(int i) {
        this.f23511g = i;
    }

    private static void a(String str) {
        i c4;
        if (TextUtils.isEmpty(str) || (c4 = u.a().c(str)) == null) {
            return;
        }
        u.a().d(str);
        com.anythink.core.common.f.a(t.b().g(), str, "4").c(u.a().b(str, c4.a()));
    }

    private static void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.f a9 = com.anythink.core.common.f.a(t.b().M(), str, "4");
        if (a9.a((ATAdStatusInfo) null, i)) {
            ar arVar = new ar();
            arVar.a(t.b().M());
            arVar.f13704c = i;
            a9.b(t.b().M(), "4", str, arVar, null);
        }
    }
}
