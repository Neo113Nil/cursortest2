package com.baidu.platform.comapi.h.k;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.bikenavi.adapter.IBRouteGuidanceListener;
import com.baidu.mapapi.bikenavi.model.BikeSimpleMapInfo;
import com.baidu.mapapi.bikenavi.model.IBRouteIconInfo;
import com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener;
import com.baidu.mapapi.walknavi.model.IWRouteIconInfo;
import com.baidu.mapapi.walknavi.model.RouteGuideKind;
import com.baidu.mapapi.walknavi.model.WalkSimpleMapInfo;
import com.baidu.platform.comapi.h.m.c;
import com.baidu.platform.comapi.h.m.d;
import com.baidu.platform.comapi.h.m.e;
import com.baidu.platform.comapi.h.t.g;
import com.baidu.platform.comjni.jninative.vibrate.IVibrateListener;
import com.baidu.platform.comjni.jninative.vibrate.VibrateHelper;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.comapi.walknavi.a implements com.baidu.platform.comapi.h.m.a, c, com.baidu.platform.comapi.h.f.a, IVibrateListener {

    /* renamed from: a, reason: collision with root package name */
    private IWRouteGuidanceListener f9141a = null;

    /* renamed from: b, reason: collision with root package name */
    private IBRouteGuidanceListener f9142b = null;

    /* renamed from: c, reason: collision with root package name */
    private Activity f9143c;

    public b(Activity activity) {
        this.f9143c = activity;
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void a(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.f.a
    public void b(int i8) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void c(Bundle bundle) {
        IBRouteGuidanceListener iBRouteGuidanceListener = this.f9142b;
        if (iBRouteGuidanceListener != null) {
            iBRouteGuidanceListener.onGetRouteDetailInfo(a.a(bundle));
        }
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void d(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.f.a
    public void e(Message message) {
        Activity activity = this.f9143c;
        if (activity == null) {
            return;
        }
        IBRouteGuidanceListener iBRouteGuidanceListener = this.f9142b;
        if (iBRouteGuidanceListener != null && message.arg1 == 0) {
            if (com.baidu.platform.comapi.b.a.a.f8739a) {
                iBRouteGuidanceListener.onGpsStatusChange(com.baidu.platform.comapi.h.t.p.a.e().getString(R.string.wsdk_string_rg_search_gps), com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, R.drawable.wn_gps));
                return;
            } else {
                iBRouteGuidanceListener.onGpsStatusChange(activity.getResources().getString(R.string.wsdk_string_rg_search_gps), this.f9143c.getResources().getDrawable(R.drawable.wn_gps));
                return;
            }
        }
        IWRouteGuidanceListener iWRouteGuidanceListener = this.f9141a;
        if (iWRouteGuidanceListener == null || message.arg1 != 0) {
            return;
        }
        if (com.baidu.platform.comapi.b.a.a.f8739a) {
            iWRouteGuidanceListener.onGpsStatusChange(com.baidu.platform.comapi.h.t.p.a.e().getString(R.string.wsdk_string_rg_search_gps), com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, R.drawable.wn_gps));
        } else {
            iWRouteGuidanceListener.onGpsStatusChange(activity.getResources().getString(R.string.wsdk_string_rg_search_gps), this.f9143c.getResources().getDrawable(R.drawable.wn_gps));
        }
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void f(Bundle bundle) {
        int i8;
        if (this.f9143c == null) {
            return;
        }
        com.baidu.platform.comapi.h.g.a.c("OuterWalkGuideInfo", "OutWalkGuide mIBRouteGuidanceListener:" + this.f9142b);
        int i9 = bundle.getInt("simpleUpdateType");
        com.baidu.platform.comapi.h.g.a.c("OuterWalkGuideInfo", "OutWalkGuide updateType:" + i9 + "  data:" + bundle);
        if (i9 == e.f9155a || i9 == e.f9157c) {
            return;
        }
        if (PermissionUtils.getInstance().isBWNaviInfoAuthorized()) {
            int i10 = bundle.getInt("nParagraphLength", -1);
            int i11 = bundle.getInt("nDistance2GP", -1);
            boolean z7 = bundle.getInt("nextStepTurnMsg", 0) == 1;
            String string = bundle.getString("nextRouteName", "");
            if (this.f9142b != null && com.baidu.platform.comapi.h.c.b().e()) {
                BikeSimpleMapInfo bikeSimpleMapInfo = new BikeSimpleMapInfo();
                bikeSimpleMapInfo.setParagraphLength(i10);
                bikeSimpleMapInfo.setDistToNextGP(i11);
                bikeSimpleMapInfo.setNextStepTurnMsg(z7);
                bikeSimpleMapInfo.setNextRouteName(string);
                this.f9142b.onSimpleMapInfoUpdate(bikeSimpleMapInfo);
            } else if (this.f9141a != null && com.baidu.platform.comapi.h.c.b().j()) {
                WalkSimpleMapInfo walkSimpleMapInfo = new WalkSimpleMapInfo();
                walkSimpleMapInfo.setParagraphLength(i10);
                walkSimpleMapInfo.setDistToNextGP(i11);
                walkSimpleMapInfo.setNextStepTurnMsg(z7);
                walkSimpleMapInfo.setNextRouteName(string);
                this.f9141a.onSimpleMapInfoUpdate(walkSimpleMapInfo);
            }
        }
        if (bundle.containsKey("maneuverKind") && PermissionUtils.getInstance().isBWNaviInfoAuthorized() && (i8 = bundle.getInt("maneuverKind")) < RouteGuideKind.values().length) {
            IBRouteGuidanceListener iBRouteGuidanceListener = this.f9142b;
            if (iBRouteGuidanceListener != null) {
                iBRouteGuidanceListener.onRouteGuideKind(RouteGuideKind.values()[i8]);
            } else {
                IWRouteGuidanceListener iWRouteGuidanceListener = this.f9141a;
                if (iWRouteGuidanceListener != null) {
                    iWRouteGuidanceListener.onRouteGuideKind(RouteGuideKind.values()[i8]);
                }
            }
        }
        com.baidu.platform.comapi.walknavi.k.e.a.a(bundle, 1, bundle.getInt("nRemainDist"), bundle.getInt("nStartDist"));
        if (bundle.containsKey("maneuverKind")) {
            int i12 = bundle.getInt("maneuverKind");
            String a8 = com.baidu.platform.comapi.h.c.b().e() ? d.a(RouteGuideKind.values()[i12]) : com.baidu.platform.comapi.h.c.b().j() ? d.b(RouteGuideKind.values()[i12]) : "";
            int a9 = com.baidu.platform.comapi.h.c.b().e() ? com.baidu.platform.comapi.b.c.a.a(a8) : com.baidu.platform.comapi.h.c.b().j() ? com.baidu.platform.comapi.walknavi.k.e.c.c(a8) : 0;
            String b8 = com.baidu.platform.comapi.h.c.b().e() ? com.baidu.platform.comapi.b.c.a.b(a8) : com.baidu.platform.comapi.h.c.b().j() ? com.baidu.platform.comapi.walknavi.k.e.c.a(a8) : null;
            if (PermissionUtils.getInstance().isBWNaviInfoAuthorized()) {
                if (com.baidu.platform.comapi.b.a.a.f8739a) {
                    IBRouteGuidanceListener iBRouteGuidanceListener2 = this.f9142b;
                    if (iBRouteGuidanceListener2 != null) {
                        iBRouteGuidanceListener2.onRouteGuideIconUpdate(com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, a9));
                        this.f9142b.onRouteGuideIconInfoUpdate(new IBRouteIconInfo(com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, a9), b8));
                    } else {
                        IWRouteGuidanceListener iWRouteGuidanceListener2 = this.f9141a;
                        if (iWRouteGuidanceListener2 != null) {
                            iWRouteGuidanceListener2.onRouteGuideIconUpdate(com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, a9));
                            this.f9141a.onRouteGuideIconInfoUpdate(new IWRouteIconInfo(com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, a9), b8));
                        }
                    }
                } else {
                    IBRouteGuidanceListener iBRouteGuidanceListener3 = this.f9142b;
                    if (iBRouteGuidanceListener3 != null) {
                        iBRouteGuidanceListener3.onRouteGuideIconUpdate(com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, a9));
                        this.f9142b.onRouteGuideIconInfoUpdate(new IBRouteIconInfo(com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, a9), b8));
                    } else {
                        IWRouteGuidanceListener iWRouteGuidanceListener3 = this.f9141a;
                        if (iWRouteGuidanceListener3 != null) {
                            iWRouteGuidanceListener3.onRouteGuideIconUpdate(com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, a9));
                            this.f9141a.onRouteGuideIconInfoUpdate(new IWRouteIconInfo(com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, a9), b8));
                        }
                    }
                }
            }
            com.baidu.platform.comapi.h.g.a.c("OuterWalkGuideInfo", "OutWalkGuide getResources ID:" + a9);
        }
        if (bundle.containsKey("nRemainDist")) {
            String string2 = bundle.getString("usGuideText");
            int[] intArray = bundle.getIntArray("unIdx");
            bundle.getIntArray("unWordCnt");
            int[] intArray2 = bundle.getIntArray("unLineNo");
            bundle.getBooleanArray("bHighLight");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            if (string2.contains("@")) {
                string2 = string2.replace("@", "...");
            }
            if (intArray.length == 0) {
                return;
            }
            int i13 = intArray2[0];
            int i14 = 0;
            while (true) {
                if (i14 >= intArray.length) {
                    break;
                }
                int i15 = intArray2[i14];
                if (i15 != i13) {
                    i13 = i14;
                    break;
                } else {
                    i14++;
                    i13 = i15;
                }
            }
            sb.append((CharSequence) string2, 0, intArray[i13]);
            sb2.append((CharSequence) string2, intArray[i13], string2.length());
            sb2.append("");
            com.baidu.platform.comapi.h.g.a.c("OuterWalkGuideInfo", "OutWalkGuide onRoadGuideTextUpdate:" + ((Object) sb));
            if (PermissionUtils.getInstance().isBWNaviInfoAuthorized()) {
                IBRouteGuidanceListener iBRouteGuidanceListener4 = this.f9142b;
                if (iBRouteGuidanceListener4 != null) {
                    iBRouteGuidanceListener4.onRoadGuideTextUpdate(sb.toString(), sb2.toString());
                    return;
                }
                IWRouteGuidanceListener iWRouteGuidanceListener4 = this.f9141a;
                if (iWRouteGuidanceListener4 != null) {
                    iWRouteGuidanceListener4.onRoadGuideTextUpdate(sb.toString(), sb2.toString());
                }
            }
        }
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void onFinalEnd(Message message) {
        IBRouteGuidanceListener iBRouteGuidanceListener = this.f9142b;
        if (iBRouteGuidanceListener != null) {
            iBRouteGuidanceListener.onArriveDest();
            return;
        }
        IWRouteGuidanceListener iWRouteGuidanceListener = this.f9141a;
        if (iWRouteGuidanceListener != null) {
            iWRouteGuidanceListener.onFinalEnd(message);
        }
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void onIndoorEnd(Message message) {
        IWRouteGuidanceListener iWRouteGuidanceListener = this.f9141a;
        if (iWRouteGuidanceListener != null) {
            iWRouteGuidanceListener.onIndoorEnd(message);
        }
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void onNaviLocationUpdate() {
        IWRouteGuidanceListener iWRouteGuidanceListener = this.f9141a;
        if (iWRouteGuidanceListener != null) {
            iWRouteGuidanceListener.onNaviLocationUpdate();
        }
        IBRouteGuidanceListener iBRouteGuidanceListener = this.f9142b;
        if (iBRouteGuidanceListener != null) {
            iBRouteGuidanceListener.onNaviLocationUpdate();
        }
    }

    @Override // com.baidu.platform.comjni.jninative.vibrate.IVibrateListener
    public void onVibrate() {
        IBRouteGuidanceListener iBRouteGuidanceListener = this.f9142b;
        if (iBRouteGuidanceListener != null) {
            iBRouteGuidanceListener.onVibrate();
            return;
        }
        IWRouteGuidanceListener iWRouteGuidanceListener = this.f9141a;
        if (iWRouteGuidanceListener != null) {
            iWRouteGuidanceListener.onVibrate();
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        this.f9141a = null;
        this.f9142b = null;
        if (this.f9143c != null) {
            this.f9143c = null;
        }
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void a(byte[] bArr) {
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void b(Bundle bundle) {
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void c(Message message) {
        IBRouteGuidanceListener iBRouteGuidanceListener = this.f9142b;
        if (iBRouteGuidanceListener != null) {
            iBRouteGuidanceListener.onArriveDest();
            return;
        }
        IWRouteGuidanceListener iWRouteGuidanceListener = this.f9141a;
        if (iWRouteGuidanceListener != null) {
            iWRouteGuidanceListener.onArriveDest();
        }
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void d(Message message) {
        Activity activity = this.f9143c;
        if (activity == null) {
            return;
        }
        if (this.f9142b != null) {
            if (com.baidu.platform.comapi.b.a.a.f8739a) {
                this.f9142b.onRoutePlanYawing(com.baidu.platform.comapi.h.t.p.a.e().getString(R.string.wsdk_string_rg_recalcing), com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, R.drawable.wn_reroute));
                return;
            } else {
                this.f9142b.onRoutePlanYawing(activity.getResources().getString(R.string.wsdk_string_rg_recalcing), this.f9143c.getResources().getDrawable(R.drawable.wn_reroute));
                return;
            }
        }
        if (this.f9141a != null) {
            if (com.baidu.platform.comapi.b.a.a.f8739a) {
                this.f9141a.onRoutePlanYawing(com.baidu.platform.comapi.h.t.p.a.e().getString(R.string.wsdk_string_rg_recalcing), com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, R.drawable.wn_reroute));
            } else {
                this.f9141a.onRoutePlanYawing(activity.getResources().getString(R.string.wsdk_string_rg_recalcing), this.f9143c.getResources().getDrawable(R.drawable.wn_reroute));
            }
        }
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void a(Message message) {
        IBRouteGuidanceListener iBRouteGuidanceListener = this.f9142b;
        if (iBRouteGuidanceListener != null) {
            iBRouteGuidanceListener.onReRouteComplete();
            return;
        }
        IWRouteGuidanceListener iWRouteGuidanceListener = this.f9141a;
        if (iWRouteGuidanceListener != null) {
            iWRouteGuidanceListener.onReRouteComplete();
        }
    }

    @Override // com.baidu.platform.comapi.h.m.c
    public void b(Message message) {
        Activity activity = this.f9143c;
        if (activity == null) {
            return;
        }
        if (this.f9142b != null) {
            if (com.baidu.platform.comapi.b.a.a.f8739a) {
                this.f9142b.onRouteFarAway(com.baidu.platform.comapi.h.t.p.a.e().getString(R.string.wsdk_string_rg_faraway), com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, R.drawable.wn_faraway_route));
                return;
            } else {
                this.f9142b.onRouteFarAway(activity.getResources().getString(R.string.wsdk_string_rg_faraway), this.f9143c.getResources().getDrawable(R.drawable.wn_faraway_route));
                return;
            }
        }
        if (this.f9141a != null) {
            if (com.baidu.platform.comapi.b.a.a.f8739a) {
                this.f9141a.onRouteFarAway(com.baidu.platform.comapi.h.t.p.a.e().getString(R.string.wsdk_string_rg_faraway), com.baidu.platform.comapi.h.t.p.a.a(this.f9143c, R.drawable.wn_faraway_route));
            } else {
                this.f9141a.onRouteFarAway(activity.getResources().getString(R.string.wsdk_string_rg_faraway), this.f9143c.getResources().getDrawable(R.drawable.wn_faraway_route));
            }
        }
    }

    public void a(IWRouteGuidanceListener iWRouteGuidanceListener) {
        this.f9141a = iWRouteGuidanceListener;
        if (iWRouteGuidanceListener != null) {
            com.baidu.platform.comapi.walknavi.b.n().z().a((com.baidu.platform.comapi.h.m.a) this);
            com.baidu.platform.comapi.walknavi.b.n().z().a((c) this);
            com.baidu.platform.comapi.walknavi.b.n().q().a(this);
            VibrateHelper.addVibrateListener(this);
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().z().b((com.baidu.platform.comapi.h.m.a) this);
        com.baidu.platform.comapi.walknavi.b.n().z().b((c) this);
        com.baidu.platform.comapi.walknavi.b.n().q().b(this);
        VibrateHelper.removeVibrateListener(this);
    }

    public void a(IBRouteGuidanceListener iBRouteGuidanceListener) {
        this.f9142b = iBRouteGuidanceListener;
        if (iBRouteGuidanceListener != null) {
            com.baidu.platform.comapi.walknavi.b.n().z().a((com.baidu.platform.comapi.h.m.a) this);
            com.baidu.platform.comapi.walknavi.b.n().z().a((c) this);
            com.baidu.platform.comapi.walknavi.b.n().q().a(this);
            VibrateHelper.addVibrateListener(this);
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().z().b((com.baidu.platform.comapi.h.m.a) this);
        com.baidu.platform.comapi.walknavi.b.n().z().b((c) this);
        com.baidu.platform.comapi.walknavi.b.n().q().b(this);
        VibrateHelper.removeVibrateListener(this);
    }

    @Override // com.baidu.platform.comapi.h.m.a
    public void e(Bundle bundle) {
        int i8 = bundle.getInt("totaldist");
        int i9 = bundle.getInt("totaltime");
        StringBuffer stringBuffer = new StringBuffer();
        g.a(i8, g.a.ZH, stringBuffer);
        IBRouteGuidanceListener iBRouteGuidanceListener = this.f9142b;
        if (iBRouteGuidanceListener != null) {
            iBRouteGuidanceListener.onRemainDistanceUpdate(stringBuffer.toString());
            this.f9142b.onRemainTimeUpdate(g.a(i9, 2));
            this.f9142b.onRemainDistanceUpdate(i8);
            this.f9142b.onRemainTimeUpdate(i9);
            return;
        }
        IWRouteGuidanceListener iWRouteGuidanceListener = this.f9141a;
        if (iWRouteGuidanceListener != null) {
            iWRouteGuidanceListener.onRemainDistanceUpdate(stringBuffer.toString());
            this.f9141a.onRemainTimeUpdate(g.a(i9, 2));
            this.f9141a.onRemainDistanceUpdate(i8);
            this.f9141a.onRemainTimeUpdate(i9);
        }
    }
}
