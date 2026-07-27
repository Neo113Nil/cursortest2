package B1;

import E.AbstractC0049y;
import E.C0042q;
import E.G;
import E.b0;
import H2.s;
import M.C0090t;
import M.InterfaceC0080i;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import android.window.BackEvent;
import androidx.activity.u;
import androidx.work.impl.WorkDatabase;
import b2.AbstractC0279e;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.C;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import e.C0400a;
import e.InterfaceC0401b;
import f2.t;
import f4.v;
import g4.AbstractC0465j;
import h2.C0482c;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.flutter.embedding.engine.FlutterJNI;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import o.C1351f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.C1410b;
import t4.InterfaceC1445p;
import t4.InterfaceC1446q;
import u1.AbstractC1477a;
import v.AbstractC1485a;
import w2.AbstractActivityC1515c;
import y2.C1557b;

/* loaded from: classes.dex */
public final class g implements InterfaceC0401b, H2.m, G4.d, InterfaceC0080i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214a;

    /* renamed from: b, reason: collision with root package name */
    public Object f215b;

    public /* synthetic */ g(int i2, Object obj) {
        this.f214a = i2;
        this.f215b = obj;
    }

    public static HashMap e(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }

    public static O0.a g(Map map) {
        Integer valueOf;
        B4.i b6;
        B4.i b7;
        B4.i b8;
        String str;
        Integer valueOf2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        Boolean bool2;
        Set set;
        Map map2;
        Double d6;
        Integer valueOf3;
        Boolean bool3;
        Double d7;
        Double d8;
        Boolean bool4;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        if (map == null) {
            return null;
        }
        Map map3 = (Map) map.get("colorSchemes");
        if (map3 == null) {
            b8 = null;
            valueOf = null;
            b6 = null;
            b7 = null;
        } else {
            Long l2 = (Long) map3.get("colorScheme");
            valueOf = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
            b6 = AbstractC1477a.b((Map) map3.get("lightParams"));
            b7 = AbstractC1477a.b((Map) map3.get("darkParams"));
            b8 = AbstractC1477a.b((Map) map3.get("defaultParams"));
        }
        t tVar = new t();
        tVar.f5636a = valueOf;
        tVar.f5637b = b6;
        tVar.f5638c = b7;
        tVar.f5639d = b8;
        Boolean bool5 = (Boolean) map.get("urlBarHidingEnabled");
        Long l6 = (Long) map.get("shareState");
        Integer valueOf4 = l6 != null ? Integer.valueOf((int) l6.longValue()) : null;
        Boolean bool6 = (Boolean) map.get("showTitle");
        Boolean bool7 = (Boolean) map.get("instantAppsEnabled");
        Boolean bool8 = (Boolean) map.get("bookmarksButtonEnabled");
        Boolean bool9 = (Boolean) map.get("downloadButtonEnabled");
        Boolean bool10 = (Boolean) map.get("shareIdentityEnabled");
        Map map4 = (Map) map.get("closeButton");
        if (map4 == null) {
            valueOf2 = null;
            str = null;
        } else {
            str = (String) map4.get("icon");
            Long l7 = (Long) map4.get("position");
            valueOf2 = l7 != null ? Integer.valueOf((int) l7.longValue()) : null;
        }
        x1.e eVar = new x1.e(str, valueOf2);
        Map map5 = (Map) map.get("animations");
        if (map5 == null) {
            str5 = null;
            str2 = null;
            str3 = null;
            str4 = null;
        } else {
            str2 = (String) map5.get("startEnter");
            str3 = (String) map5.get("startExit");
            str4 = (String) map5.get("endEnter");
            str5 = (String) map5.get("endExit");
        }
        B0.n nVar = new B0.n(str2, str3, str4, str5);
        Map map6 = (Map) map.get("browser");
        if (map6 == null) {
            bool = null;
            bool2 = null;
            set = null;
            map2 = null;
            str6 = null;
        } else {
            Boolean bool11 = (Boolean) map6.get("prefersExternalBrowser");
            Boolean bool12 = (Boolean) map6.get("prefersDefaultBrowser");
            List list = (List) map6.get("fallbackCustomTabs");
            Set X02 = list != null ? AbstractC0465j.X0(list) : null;
            Map map7 = (Map) map6.get("headers");
            str6 = (String) map6.get("sessionPackageName");
            bool = bool11;
            bool2 = bool12;
            set = X02;
            map2 = map7;
        }
        B.d dVar = new B.d(bool, bool2, set, map2, str6);
        Map map8 = (Map) map.get("partial");
        if (map8 == null) {
            d6 = null;
            num = null;
            d7 = null;
            d8 = null;
            bool4 = null;
            num2 = null;
            num3 = null;
            num4 = null;
            valueOf3 = null;
            bool3 = null;
        } else {
            Double d9 = (Double) map8.get("initialHeight");
            Long l8 = (Long) map8.get("activityHeightResizeBehavior");
            Integer valueOf5 = l8 != null ? Integer.valueOf((int) l8.longValue()) : null;
            Double d10 = (Double) map8.get("initialWidth");
            Double d11 = (Double) map8.get("activitySideSheetBreakpoint");
            Boolean bool13 = (Boolean) map8.get("activitySideSheetMaximizationEnabled");
            Long l9 = (Long) map8.get("activitySideSheetPosition");
            Integer num5 = valueOf5;
            Integer valueOf6 = l9 != null ? Integer.valueOf((int) l9.longValue()) : null;
            Long l10 = (Long) map8.get("activitySideSheetDecorationType");
            Integer num6 = valueOf6;
            Integer valueOf7 = l10 != null ? Integer.valueOf((int) l10.longValue()) : null;
            Long l11 = (Long) map8.get("activitySideSheetRoundedCornersPosition");
            Integer num7 = valueOf7;
            Integer valueOf8 = l11 != null ? Integer.valueOf((int) l11.longValue()) : null;
            Boolean bool14 = (Boolean) map8.get("backgroundInteractionEnabled");
            Integer num8 = valueOf8;
            Long l12 = (Long) map8.get("cornerRadius");
            d6 = d9;
            valueOf3 = l12 != null ? Integer.valueOf((int) l12.longValue()) : null;
            bool3 = bool14;
            d7 = d10;
            d8 = d11;
            bool4 = bool13;
            num = num5;
            num2 = num6;
            num3 = num7;
            num4 = num8;
        }
        return new O0.a(tVar, bool5, valueOf4, bool6, bool7, bool8, bool9, bool10, eVar, nVar, dVar, new O0.b(d6, num, d7, d8, bool4, num2, num3, num4, valueOf3, bool3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void k(H2.l lVar, H2.n nVar) {
        char c2;
        C0482c c0482c = (C0482c) this.f215b;
        if (((V0.j) c0482c.f5783b) == null) {
            return;
        }
        String str = lVar.f1146a;
        str.getClass();
        Object obj = lVar.f1147b;
        switch (str.hashCode()) {
            case -1352294148:
                if (str.equals("create")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -756050293:
                if (str.equals("clearFocus")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 110550847:
                if (str.equals("touch")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 576796989:
                if (str.equals("setDirection")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 751366695:
                if (str.equals("isSurfaceControlEnabled")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1671767583:
                if (str.equals("dispose")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                Map map = (Map) obj;
                if (map.containsKey(OutcomeEventsTable.COLUMN_NAME_PARAMS)) {
                    ByteBuffer.wrap((byte[]) map.get(OutcomeEventsTable.COLUMN_NAME_PARAMS));
                }
                try {
                    ((Integer) map.get(OutcomeConstants.OUTCOME_ID)).intValue();
                    String str2 = (String) map.get("viewType");
                    ((Integer) map.get("direction")).intValue();
                    if (((io.flutter.plugin.platform.l) ((V0.j) c0482c.f5783b).f3212b).f10221a.f12299a.get(str2) != null) {
                        throw new ClassCastException();
                    }
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                } catch (IllegalStateException e3) {
                    ((G2.i) nVar).b("error", Log.getStackTraceString(e3), null);
                    return;
                }
            case 1:
                int intValue = ((Integer) obj).intValue();
                try {
                    AbstractC0279e.o(((io.flutter.plugin.platform.l) ((V0.j) c0482c.f5783b).f3212b).f10227g.get(intValue));
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                    ((G2.i) nVar).success(null);
                    return;
                } catch (IllegalStateException e6) {
                    ((G2.i) nVar).b("error", Log.getStackTraceString(e6), null);
                    return;
                }
            case 2:
                List list = (List) obj;
                int intValue2 = ((Integer) list.get(0)).intValue();
                ((Integer) list.get(3)).getClass();
                ((Integer) list.get(4)).getClass();
                list.get(5);
                list.get(6);
                ((Integer) list.get(7)).getClass();
                ((Integer) list.get(8)).getClass();
                ((Double) list.get(9)).getClass();
                ((Double) list.get(10)).getClass();
                ((Integer) list.get(11)).getClass();
                ((Integer) list.get(12)).getClass();
                ((Integer) list.get(13)).getClass();
                ((Integer) list.get(14)).getClass();
                ((Number) list.get(15)).longValue();
                try {
                    V0.j jVar = (V0.j) c0482c.f5783b;
                    jVar.getClass();
                    io.flutter.plugin.platform.l lVar2 = (io.flutter.plugin.platform.l) jVar.f3212b;
                    float f3 = lVar2.f10222b.getResources().getDisplayMetrics().density;
                    if (lVar2.f10227g.get(intValue2) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                    ((G2.i) nVar).success(null);
                    return;
                } catch (IllegalStateException e7) {
                    ((G2.i) nVar).b("error", Log.getStackTraceString(e7), null);
                    return;
                }
            case 3:
                Map map2 = (Map) obj;
                int intValue3 = ((Integer) map2.get(OutcomeConstants.OUTCOME_ID)).intValue();
                ((Integer) map2.get("direction")).getClass();
                try {
                    if (((io.flutter.plugin.platform.l) ((V0.j) c0482c.f5783b).f3212b).f10227g.get(intValue3) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                    ((G2.i) nVar).success(null);
                    return;
                } catch (IllegalStateException e8) {
                    ((G2.i) nVar).b("error", Log.getStackTraceString(e8), null);
                    return;
                }
            case 4:
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.l) ((V0.j) c0482c.f5783b).f3212b).f10224d;
                ((G2.i) nVar).success(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case 5:
                try {
                    ((V0.j) c0482c.f5783b).C(((Integer) ((Map) obj).get(OutcomeConstants.OUTCOME_ID)).intValue());
                    ((G2.i) nVar).success(null);
                    return;
                } catch (IllegalStateException e9) {
                    ((G2.i) nVar).b("error", Log.getStackTraceString(e9), null);
                    return;
                }
            default:
                ((G2.i) nVar).a();
                return;
        }
    }

    private final void l(H2.l lVar, H2.n nVar) {
        Object obj;
        Bundle bundle;
        x1.e eVar = (x1.e) this.f215b;
        if (((V0.j) eVar.f12266b) == null) {
        }
        String str = lVar.f1146a;
        str.getClass();
        obj = lVar.f1147b;
        switch (str) {
            case "TextInput.setPlatformViewClient":
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    int i2 = jSONObject.getInt("platformViewId");
                    boolean optBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                    io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) ((V0.j) eVar.f12266b).f3212b;
                    if (optBoolean) {
                        w2.m mVar = jVar.f10193a;
                        mVar.requestFocus();
                        jVar.f10197e = new C0042q(3, i2);
                        jVar.f10194b.restartInput(mVar);
                        jVar.f10201i = false;
                    } else {
                        jVar.getClass();
                        jVar.f10197e = new C0042q(4, i2);
                        jVar.f10202j = null;
                    }
                    ((G2.i) nVar).success(null);
                    break;
                } catch (JSONException e3) {
                    ((G2.i) nVar).b("error", e3.getMessage(), null);
                    return;
                }
            case "TextInput.setEditingState":
                try {
                    ((V0.j) eVar.f12266b).R(G2.o.a((JSONObject) obj));
                    ((G2.i) nVar).success(null);
                    break;
                } catch (JSONException e6) {
                    ((G2.i) nVar).b("error", e6.getMessage(), null);
                    return;
                }
            case "TextInput.setClient":
                try {
                    JSONArray jSONArray = (JSONArray) obj;
                    ((V0.j) eVar.f12266b).P(jSONArray.getInt(0), G2.m.a(jSONArray.getJSONObject(1)));
                    ((G2.i) nVar).success(null);
                    break;
                } catch (NoSuchFieldException | JSONException e7) {
                    ((G2.i) nVar).b("error", e7.getMessage(), null);
                    return;
                }
            case "TextInput.hide":
                io.flutter.plugin.editing.j jVar2 = (io.flutter.plugin.editing.j) ((V0.j) eVar.f12266b).f3212b;
                if (jVar2.f10197e.f631b == 4) {
                    jVar2.c();
                } else {
                    jVar2.c();
                    jVar2.f10194b.hideSoftInputFromWindow(jVar2.f10193a.getApplicationWindowToken(), 0);
                }
                ((G2.i) nVar).success(null);
                break;
            case "TextInput.show":
                io.flutter.plugin.editing.j jVar3 = (io.flutter.plugin.editing.j) ((V0.j) eVar.f12266b).f3212b;
                w2.m mVar2 = jVar3.f10193a;
                G2.m mVar3 = jVar3.f10198f;
                InputMethodManager inputMethodManager = jVar3.f10194b;
                if (mVar3 == null || mVar3.f987g.f994a != 11) {
                    mVar2.requestFocus();
                    inputMethodManager.showSoftInput(mVar2, 0);
                } else {
                    jVar3.c();
                    inputMethodManager.hideSoftInputFromWindow(mVar2.getApplicationWindowToken(), 0);
                }
                ((G2.i) nVar).success(null);
                break;
            case "TextInput.sendAppPrivateCommand":
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    String string = jSONObject2.getString("action");
                    String string2 = jSONObject2.getString("data");
                    if (string2 == null || string2.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("data", string2);
                    }
                    io.flutter.plugin.editing.j jVar4 = (io.flutter.plugin.editing.j) ((V0.j) eVar.f12266b).f3212b;
                    jVar4.f10194b.sendAppPrivateCommand(jVar4.f10193a, string, bundle);
                    ((G2.i) nVar).success(null);
                    break;
                } catch (JSONException e8) {
                    ((G2.i) nVar).b("error", e8.getMessage(), null);
                    return;
                }
                break;
            case "TextInput.setEditableSizeAndTransform":
                try {
                    JSONObject jSONObject3 = (JSONObject) obj;
                    double d6 = jSONObject3.getDouble("width");
                    double d7 = jSONObject3.getDouble("height");
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                    double[] dArr = new double[16];
                    for (int i3 = 0; i3 < 16; i3++) {
                        dArr[i3] = jSONArray2.getDouble(i3);
                    }
                    ((V0.j) eVar.f12266b).Q(d6, d7, dArr);
                    ((G2.i) nVar).success(null);
                    break;
                } catch (JSONException e9) {
                    ((G2.i) nVar).b("error", e9.getMessage(), null);
                    return;
                }
            case "TextInput.finishAutofillContext":
                V0.j jVar5 = (V0.j) eVar.f12266b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (Build.VERSION.SDK_INT >= 26) {
                    AutofillManager autofillManager = ((io.flutter.plugin.editing.j) jVar5.f3212b).f10195c;
                    if (autofillManager != null) {
                        if (booleanValue) {
                            autofillManager.commit();
                        } else {
                            autofillManager.cancel();
                        }
                    }
                } else {
                    jVar5.getClass();
                }
                ((G2.i) nVar).success(null);
                break;
            case "TextInput.clearClient":
                io.flutter.plugin.editing.j jVar6 = (io.flutter.plugin.editing.j) ((V0.j) eVar.f12266b).f3212b;
                if (jVar6.f10197e.f631b != 3) {
                    jVar6.f10200h.e(jVar6);
                    jVar6.c();
                    jVar6.f10198f = null;
                    jVar6.d(null);
                    jVar6.f10197e = new C0042q(1, 0);
                    jVar6.f10205m = null;
                    Field field = G.f566a;
                    w2.m mVar4 = jVar6.f10193a;
                    b0 a6 = AbstractC0049y.a(mVar4);
                    if (a6 != null && !a6.f601a.m(8)) {
                        jVar6.f10194b.restartInput(mVar4);
                    }
                }
                ((G2.i) nVar).success(null);
                break;
            case "TextInput.requestAutofill":
                V0.j jVar7 = (V0.j) eVar.f12266b;
                int i6 = Build.VERSION.SDK_INT;
                io.flutter.plugin.editing.j jVar8 = (io.flutter.plugin.editing.j) jVar7.f3212b;
                if (i6 < 26) {
                    jVar8.getClass();
                } else if (jVar8.f10195c != null && jVar8.f10199g != null) {
                    String str2 = (String) jVar8.f10198f.f990j.f167a;
                    int[] iArr = new int[2];
                    w2.m mVar5 = jVar8.f10193a;
                    mVar5.getLocationOnScreen(iArr);
                    Rect rect = new Rect(jVar8.f10205m);
                    rect.offset(iArr[0], iArr[1]);
                    jVar8.f10195c.notifyViewEntered(mVar5, str2.hashCode(), rect);
                }
                ((G2.i) nVar).success(null);
                break;
            default:
                ((G2.i) nVar).a();
                break;
        }
    }

    @Override // e.InterfaceC0401b
    public void b(Object obj) {
        C0400a c0400a = (C0400a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f215b;
        proxyBillingActivityV2.getClass();
        Intent intent = c0400a.f5495b;
        int i2 = AbstractC0357o0.d(intent, "ProxyBillingActivityV2").f862a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f4940d;
        if (resultReceiver != null) {
            resultReceiver.send(i2, intent == null ? null : intent.getExtras());
        }
        int i3 = c0400a.f5494a;
        if (i3 != -1 || i2 != 0) {
            AbstractC0357o0.g("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i3 + " and billing's responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // M.InterfaceC0080i
    public Object c(InterfaceC1445p interfaceC1445p, m4.h hVar) {
        return ((InterfaceC0080i) this.f215b).c(new P.c(interfaceC1445p, null), hVar);
    }

    public void d(String str) {
        B0.l lVar = (B0.l) this.f215b;
        w2.m mVar = (w2.m) lVar.f163b;
        J2.a aVar = B0.l.f161d;
        Integer valueOf = Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        if (aVar == null) {
            J2.a aVar2 = new J2.a();
            aVar2.put("alias", 1010);
            aVar2.put("allScroll", 1013);
            aVar2.put("basic", valueOf);
            aVar2.put("cell", 1006);
            aVar2.put("click", 1002);
            aVar2.put("contextMenu", 1001);
            aVar2.put("copy", 1011);
            aVar2.put("forbidden", 1012);
            aVar2.put("grab", 1020);
            aVar2.put("grabbing", 1021);
            aVar2.put("help", 1003);
            aVar2.put("move", 1013);
            aVar2.put("none", 0);
            aVar2.put("noDrop", 1012);
            aVar2.put("precise", 1007);
            aVar2.put("text", 1008);
            aVar2.put("resizeColumn", 1014);
            aVar2.put("resizeDown", 1015);
            aVar2.put("resizeUpLeft", 1016);
            aVar2.put("resizeDownRight", 1017);
            aVar2.put("resizeLeft", 1014);
            aVar2.put("resizeLeftRight", 1014);
            aVar2.put("resizeRight", 1014);
            aVar2.put("resizeRow", 1015);
            aVar2.put("resizeUp", 1015);
            aVar2.put("resizeUpDown", 1015);
            aVar2.put("resizeUpLeft", 1017);
            aVar2.put("resizeUpRight", 1016);
            aVar2.put("resizeUpLeftDownRight", 1017);
            aVar2.put("resizeUpRightDownLeft", 1016);
            aVar2.put("verticalText", 1009);
            aVar2.put("wait", 1004);
            aVar2.put("zoomIn", 1018);
            aVar2.put("zoomOut", 1019);
            B0.l.f161d = aVar2;
        }
        mVar.setPointerIcon(PointerIcon.getSystemIcon(((w2.m) lVar.f163b).getContext(), ((Integer) B0.l.f161d.getOrDefault(str, valueOf)).intValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B0.e f(AbstractActivityC1515c context, O0.a aVar, P0.b sessionProvider) {
        String str;
        Drawable b6;
        P0.a aVar2;
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(sessionProvider, "sessionProvider");
        B.d dVar = aVar.f2214k;
        if (dVar == null) {
            dVar = new B.d((Boolean) null, (Boolean) null, (Set) null, (Map) null, (String) null);
        }
        Bitmap bitmap = null;
        String str2 = (String) dVar.f106b;
        C1351f c1351f = new C1351f((str2 == null || (aVar2 = (P0.a) sessionProvider.f2283a.get(str2)) == null) ? null : aVar2.f2281c);
        Intent intent = c1351f.f11476a;
        t tVar = aVar.f2204a;
        if (tVar != null) {
            Integer num = (Integer) tVar.f5636a;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue < 0 || intValue > 2) {
                    throw new IllegalArgumentException("Invalid value for the colorScheme argument");
                }
                intent.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", intValue);
            }
            B4.i iVar = (B4.i) tVar.f5637b;
            if (iVar != null) {
                c1351f.b(1, iVar);
            }
            B4.i iVar2 = (B4.i) tVar.f5638c;
            if (iVar2 != null) {
                c1351f.b(2, iVar2);
            }
            B4.i iVar3 = (B4.i) tVar.f5639d;
            if (iVar3 != null) {
                c1351f.f11480e = iVar3.U();
            }
        }
        Boolean bool = aVar.f2205b;
        if (bool != null) {
            intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", bool.booleanValue());
        }
        Integer num2 = aVar.f2206c;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (intValue2 < 0 || intValue2 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            c1351f.f11481f = intValue2;
            if (intValue2 == 1) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (intValue2 == 2) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
        }
        Boolean bool2 = aVar.f2207d;
        if (bool2 != null) {
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = aVar.f2208e;
        if (bool3 != null) {
            c1351f.f11482g = bool3.booleanValue();
        }
        if (aVar.f2209f != null) {
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", !r10.booleanValue());
        }
        if (aVar.f2210g != null) {
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", !r10.booleanValue());
        }
        Boolean bool4 = aVar.f2211h;
        if (bool4 != null) {
            c1351f.f11483h = bool4.booleanValue();
        }
        N0.a aVar3 = (N0.a) this.f215b;
        x1.e eVar = aVar.f2212i;
        if (eVar != null) {
            String str3 = (String) eVar.f12265a;
            if (str3 != null) {
                aVar3.getClass();
                int a6 = N0.a.a(context, "drawable", str3);
                if (a6 != 0 && (b6 = AbstractC1485a.b(context, a6)) != null) {
                    int intrinsicWidth = b6.getIntrinsicWidth();
                    int intrinsicHeight = b6.getIntrinsicHeight();
                    if (b6 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) b6;
                        if (bitmapDrawable.getBitmap() == null) {
                            throw new IllegalArgumentException("bitmap is null");
                        }
                        bitmap = (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
                    } else {
                        Rect bounds = b6.getBounds();
                        int i2 = bounds.left;
                        int i3 = bounds.top;
                        int i6 = bounds.right;
                        int i7 = bounds.bottom;
                        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                        str = str2;
                        b6.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        b6.draw(new Canvas(createBitmap));
                        b6.setBounds(i2, i3, i6, i7);
                        bitmap = createBitmap;
                        if (bitmap != null) {
                            intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
                        }
                    }
                }
                str = str2;
                if (bitmap != null) {
                }
            } else {
                str = str2;
            }
            Integer num3 = (Integer) eVar.f12266b;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                if (intValue3 < 0 || intValue3 > 2) {
                    throw new IllegalArgumentException("Invalid value for the position argument");
                }
                intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", intValue3);
            }
        } else {
            str = str2;
        }
        B0.n nVar = aVar.f2213j;
        if (nVar != null) {
            aVar3.getClass();
            int a7 = N0.a.a(context, "anim", (String) nVar.f167a);
            int a8 = N0.a.a(context, "anim", (String) nVar.f168b);
            if (a7 != 0 && a8 != 0) {
                c1351f.f11478c = ActivityOptions.makeCustomAnimation(context, a7, a8);
            }
            int a9 = N0.a.a(context, "anim", (String) nVar.f169c);
            int a10 = N0.a.a(context, "anim", (String) nVar.f170d);
            if (a9 != 0 && a10 != 0) {
                intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(context, a9, a10).toBundle());
            }
        }
        O0.b bVar = aVar.f2215l;
        if (bVar != null) {
            Double d6 = bVar.f2216a;
            if (d6 != null) {
                double doubleValue = d6.doubleValue();
                aVar3.getClass();
                int i8 = (int) ((doubleValue * context.getResources().getDisplayMetrics().density) + 0.5d);
                Integer num4 = bVar.f2217b;
                if (num4 == null) {
                    c1351f.c(i8, 0);
                } else {
                    c1351f.c(i8, num4.intValue());
                }
            }
            Double d7 = bVar.f2218c;
            if (d7 != null) {
                double doubleValue2 = d7.doubleValue();
                aVar3.getClass();
                int i9 = (int) ((doubleValue2 * context.getResources().getDisplayMetrics().density) + 0.5d);
                if (i9 <= 0) {
                    throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
                }
                intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", i9);
            }
            Double d8 = bVar.f2219d;
            if (d8 != null) {
                int doubleValue3 = (int) d8.doubleValue();
                if (doubleValue3 <= 0) {
                    throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
                }
                intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", doubleValue3);
            }
            Boolean bool5 = bVar.f2220e;
            if (bool5 != null) {
                intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION", bool5.booleanValue());
            }
            Integer num5 = bVar.f2221f;
            if (num5 != null) {
                int intValue4 = num5.intValue();
                if (intValue4 < 0 || intValue4 > 2) {
                    throw new IllegalArgumentException("Invalid value for the sideSheetPosition argument");
                }
                intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION", intValue4);
            }
            Integer num6 = bVar.f2222g;
            if (num6 != null) {
                int intValue5 = num6.intValue();
                if (intValue5 < 0 || intValue5 > 3) {
                    throw new IllegalArgumentException("Invalid value for the decorationType argument");
                }
                intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE", intValue5);
            }
            Integer num7 = bVar.f2223h;
            if (num7 != null) {
                int intValue6 = num7.intValue();
                if (intValue6 < 0 || intValue6 > 2) {
                    throw new IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
                }
                intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION", intValue6);
            }
            Integer num8 = bVar.f2224i;
            if (num8 != null) {
                int intValue7 = num8.intValue();
                if (intValue7 < 0 || intValue7 > 16) {
                    throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
                }
                intent.putExtra("androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP", intValue7);
            }
            if (bVar.f2225j != null) {
                intent.putExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", !r1.booleanValue());
            }
        }
        B0.e a11 = c1351f.a();
        Intent intent2 = (Intent) a11.f146b;
        kotlin.jvm.internal.i.d(intent2, "intent");
        Map map = (Map) dVar.f110f;
        if (map != null) {
            intent2.putExtra("com.android.browser.headers", e5.g.i(map));
        }
        if (intent2.getPackage() == null) {
            if (str != null) {
                intent2.setPackage(str);
            } else {
                C0482c h3 = dVar.h(context);
                if (kotlin.jvm.internal.i.a((Boolean) dVar.f108d, Boolean.TRUE)) {
                    intent2.setPackage(e5.g.p(context, false, h3));
                } else {
                    intent2.setPackage(e5.g.p(context, true, h3));
                }
            }
        }
        return a11;
    }

    @Override // M.InterfaceC0080i
    public G4.d getData() {
        return ((InterfaceC0080i) this.f215b).getData();
    }

    public Object h(N4.e descriptor, R4.n nVar) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f215b).get(descriptor);
        Object obj = map != null ? map.get(nVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // G4.d
    public Object i(G4.e eVar, InterfaceC1218d interfaceC1218d) {
        Object i2 = ((B0.e) this.f215b).i(new C0090t(eVar, 0), interfaceC1218d);
        return i2 == EnumC1260a.f11058a ? i2 : v.f5689a;
    }

    public String j(String str, String str2) {
        I2.a aVar = (I2.a) this.f215b;
        Context context = aVar.f1270b;
        AbstractActivityC1515c abstractActivityC1515c = aVar.f1270b;
        if (str2 != null) {
            Locale a6 = I2.a.a(str2);
            Configuration configuration = new Configuration(abstractActivityC1515c.getResources().getConfiguration());
            configuration.setLocale(a6);
            context = abstractActivityC1515c.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", abstractActivityC1515c.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public void m(Exception exc) {
        O1.i iVar = (O1.i) this.f215b;
        iVar.getClass();
        if (s.g.f11743f.H(iVar, null, new C1410b(exc))) {
            s.g.e(iVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x002e, code lost:
    
        if (r2.equals("hasCustomVibrationsSupport") == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03bc A[Catch: JSONException -> 0x025a, TryCatch #3 {JSONException -> 0x025a, blocks: (B:99:0x0246, B:100:0x024a, B:105:0x02fe, B:107:0x0307, B:109:0x033b, B:112:0x0360, B:114:0x0353, B:117:0x035a, B:118:0x0373, B:120:0x039c, B:130:0x03a0, B:123:0x03b2, B:125:0x03bc, B:127:0x03cd, B:132:0x03a5, B:133:0x03d7, B:135:0x03e7, B:136:0x03f4, B:138:0x03f1, B:139:0x03fe, B:141:0x0410, B:142:0x0413, B:144:0x0449, B:146:0x045e, B:149:0x054f, B:170:0x0573, B:172:0x0583, B:173:0x0595, B:176:0x0592, B:192:0x043b, B:199:0x049c, B:185:0x04c4, B:167:0x0513, B:206:0x0541, B:153:0x0566, B:178:0x059f, B:208:0x024f, B:211:0x025d, B:214:0x0267, B:217:0x0273, B:220:0x027f, B:223:0x028a, B:226:0x0296, B:229:0x02a0, B:232:0x02aa, B:235:0x02b4, B:238:0x02be, B:241:0x02c8, B:244:0x02d3, B:247:0x02de, B:250:0x02e9, B:156:0x04d2, B:158:0x04dc, B:159:0x04df, B:161:0x04f5, B:162:0x0508, B:165:0x04ff), top: B:98:0x0246, inners: #6, #7, #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cd A[Catch: JSONException -> 0x025a, TryCatch #3 {JSONException -> 0x025a, blocks: (B:99:0x0246, B:100:0x024a, B:105:0x02fe, B:107:0x0307, B:109:0x033b, B:112:0x0360, B:114:0x0353, B:117:0x035a, B:118:0x0373, B:120:0x039c, B:130:0x03a0, B:123:0x03b2, B:125:0x03bc, B:127:0x03cd, B:132:0x03a5, B:133:0x03d7, B:135:0x03e7, B:136:0x03f4, B:138:0x03f1, B:139:0x03fe, B:141:0x0410, B:142:0x0413, B:144:0x0449, B:146:0x045e, B:149:0x054f, B:170:0x0573, B:172:0x0583, B:173:0x0595, B:176:0x0592, B:192:0x043b, B:199:0x049c, B:185:0x04c4, B:167:0x0513, B:206:0x0541, B:153:0x0566, B:178:0x059f, B:208:0x024f, B:211:0x025d, B:214:0x0267, B:217:0x0273, B:220:0x027f, B:223:0x028a, B:226:0x0296, B:229:0x02a0, B:232:0x02aa, B:235:0x02b4, B:238:0x02be, B:241:0x02c8, B:244:0x02d3, B:247:0x02de, B:250:0x02e9, B:156:0x04d2, B:158:0x04dc, B:159:0x04df, B:161:0x04f5, B:162:0x0508, B:165:0x04ff), top: B:98:0x0246, inners: #6, #7, #9, #12 }] */
    @Override // H2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMethodCall(H2.l lVar, H2.n nVar) {
        G2.c a6;
        CharSequence s2;
        ClipDescription primaryClipDescription;
        boolean hasMimeType;
        boolean hasAmplitudeControl;
        boolean hasAmplitudeControl2;
        VibrationEffect createOneShot;
        VibrationEffect createOneShot2;
        VibrationEffect createWaveform;
        boolean hasAmplitudeControl3;
        VibrationEffect createWaveform2;
        VibrationEffect createWaveform3;
        char c2 = 4;
        char c6 = 3;
        switch (this.f214a) {
            case 8:
                B0.c cVar = (B0.c) this.f215b;
                if (((g) cVar.f141c) != null) {
                    String str = lVar.f1146a;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        ((G2.i) nVar).a();
                        break;
                    } else {
                        JSONObject jSONObject = (JSONObject) lVar.f1147b;
                        try {
                            ((G2.i) nVar).success(((g) cVar.f141c).j(jSONObject.getString("key"), jSONObject.has(CommonUrlParts.LOCALE) ? jSONObject.getString(CommonUrlParts.LOCALE) : null));
                            break;
                        } catch (JSONException e3) {
                            ((G2.i) nVar).b("error", e3.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
            case 10:
                B0.e eVar = (B0.e) this.f215b;
                if (((U.e) eVar.f147c) != null) {
                    String str2 = lVar.f1146a;
                    try {
                        switch (str2.hashCode()) {
                            case -1501580720:
                                if (str2.equals("SystemNavigator.setFrameworkHandlesBack")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -931781241:
                                if (str2.equals("Share.invoke")) {
                                    c2 = 14;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -766342101:
                                if (str2.equals("SystemNavigator.pop")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -720677196:
                                if (str2.equals("Clipboard.setData")) {
                                    c2 = '\f';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -577225884:
                                if (str2.equals("SystemChrome.setSystemUIChangeListener")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -548468504:
                                if (str2.equals("SystemChrome.setApplicationSwitcherDescription")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -247230243:
                                if (str2.equals("HapticFeedback.vibrate")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -215273374:
                                if (str2.equals("SystemSound.play")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 241845679:
                                if (str2.equals("SystemChrome.restoreSystemUIOverlays")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 875995648:
                                if (str2.equals("Clipboard.hasStrings")) {
                                    c2 = '\r';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1128339786:
                                if (str2.equals("SystemChrome.setEnabledSystemUIMode")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1390477857:
                                if (str2.equals("SystemChrome.setSystemUIOverlayStyle")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1514180520:
                                if (str2.equals("Clipboard.getData")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1674312266:
                                if (str2.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2119655719:
                                if (str2.equals("SystemChrome.setPreferredOrientations")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        Object obj = lVar.f1147b;
                        switch (c2) {
                            case 0:
                                try {
                                    int c7 = B0.o.c((String) obj);
                                    io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) ((U.e) eVar.f147c).f3053a;
                                    if (c7 == 1) {
                                        fVar.f10215a.getWindow().getDecorView().playSoundEffect(0);
                                    } else {
                                        fVar.getClass();
                                    }
                                    ((G2.i) nVar).success(null);
                                    break;
                                } catch (NoSuchFieldException e6) {
                                    ((G2.i) nVar).b("error", e6.getMessage(), null);
                                    return;
                                }
                            case 1:
                                try {
                                    ((U.e) eVar.f147c).C(B0.o.b((String) obj));
                                    ((G2.i) nVar).success(null);
                                    break;
                                } catch (NoSuchFieldException e7) {
                                    ((G2.i) nVar).b("error", e7.getMessage(), null);
                                    return;
                                }
                            case 2:
                                try {
                                    ((io.flutter.plugin.platform.f) ((U.e) eVar.f147c).f3053a).f10215a.setRequestedOrientation(B0.e.f(eVar, (JSONArray) obj));
                                    ((G2.i) nVar).success(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e8) {
                                    ((G2.i) nVar).b("error", e8.getMessage(), null);
                                    return;
                                }
                            case 3:
                                try {
                                    JSONObject jSONObject2 = (JSONObject) obj;
                                    int i2 = jSONObject2.getInt("primaryColor");
                                    if (i2 != 0) {
                                        i2 |= -16777216;
                                    }
                                    String string = jSONObject2.getString("label");
                                    U.e eVar2 = (U.e) eVar.f147c;
                                    int i3 = Build.VERSION.SDK_INT;
                                    AbstractActivityC1515c abstractActivityC1515c = ((io.flutter.plugin.platform.f) eVar2.f3053a).f10215a;
                                    if (i3 < 28) {
                                        abstractActivityC1515c.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i2));
                                    } else {
                                        abstractActivityC1515c.setTaskDescription(io.flutter.plugin.platform.c.c(i2, string));
                                    }
                                    ((G2.i) nVar).success(null);
                                    break;
                                } catch (JSONException e9) {
                                    ((G2.i) nVar).b("error", e9.getMessage(), null);
                                    return;
                                }
                            case 4:
                                try {
                                    ((U.e) eVar.f147c).A(B0.e.g(eVar, (JSONArray) obj));
                                    ((G2.i) nVar).success(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e10) {
                                    ((G2.i) nVar).b("error", e10.getMessage(), null);
                                    return;
                                }
                            case 5:
                                try {
                                    ((U.e) eVar.f147c).B(B0.e.h(eVar, (String) obj));
                                    ((G2.i) nVar).success(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e11) {
                                    ((G2.i) nVar).b("error", e11.getMessage(), null);
                                    return;
                                }
                            case 6:
                                io.flutter.plugin.platform.f fVar2 = (io.flutter.plugin.platform.f) ((U.e) eVar.f147c).f3053a;
                                View decorView = fVar2.f10215a.getWindow().getDecorView();
                                decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.e(fVar2, decorView));
                                ((G2.i) nVar).success(null);
                                break;
                            case 7:
                                ((io.flutter.plugin.platform.f) ((U.e) eVar.f147c).f3053a).b();
                                ((G2.i) nVar).success(null);
                                break;
                            case '\b':
                                try {
                                    ((io.flutter.plugin.platform.f) ((U.e) eVar.f147c).f3053a).a(B0.e.j(eVar, (JSONObject) obj));
                                    ((G2.i) nVar).success(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e12) {
                                    ((G2.i) nVar).b("error", e12.getMessage(), null);
                                    return;
                                }
                            case '\t':
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                AbstractActivityC1515c abstractActivityC1515c2 = ((io.flutter.plugin.platform.f) ((U.e) eVar.f147c).f3053a).f10217c;
                                if (abstractActivityC1515c2 != null) {
                                    abstractActivityC1515c2.g(booleanValue);
                                }
                                ((G2.i) nVar).success(null);
                                break;
                            case '\n':
                                io.flutter.plugin.platform.f fVar3 = (io.flutter.plugin.platform.f) ((U.e) eVar.f147c).f3053a;
                                AbstractActivityC1515c abstractActivityC1515c3 = fVar3.f10217c;
                                AbstractActivityC1515c abstractActivityC1515c4 = fVar3.f10215a;
                                if (abstractActivityC1515c4 instanceof u) {
                                    ((u) abstractActivityC1515c4).getOnBackPressedDispatcher().a();
                                } else {
                                    abstractActivityC1515c4.finish();
                                }
                                ((G2.i) nVar).success(null);
                                break;
                            case 11:
                                String str3 = (String) obj;
                                if (str3 != null) {
                                    try {
                                        a6 = G2.c.a(str3);
                                    } catch (NoSuchFieldException unused) {
                                        ((G2.i) nVar).b("error", "No such clipboard content format: ".concat(str3), null);
                                    }
                                    s2 = ((U.e) eVar.f147c).s(a6);
                                    if (s2 == null) {
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("text", s2);
                                        ((G2.i) nVar).success(jSONObject3);
                                        break;
                                    } else {
                                        ((G2.i) nVar).success(null);
                                        break;
                                    }
                                }
                                a6 = null;
                                s2 = ((U.e) eVar.f147c).s(a6);
                                if (s2 == null) {
                                }
                            case '\f':
                                ((ClipboardManager) ((io.flutter.plugin.platform.f) ((U.e) eVar.f147c).f3053a).f10215a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                                ((G2.i) nVar).success(null);
                                break;
                            case '\r':
                                ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.f) ((U.e) eVar.f147c).f3053a).f10215a.getSystemService("clipboard");
                                if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                                    hasMimeType = primaryClipDescription.hasMimeType("text/*");
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("value", hasMimeType);
                                    ((G2.i) nVar).success(jSONObject4);
                                    break;
                                }
                                hasMimeType = false;
                                JSONObject jSONObject42 = new JSONObject();
                                jSONObject42.put("value", hasMimeType);
                                ((G2.i) nVar).success(jSONObject42);
                                break;
                            case 14:
                                io.flutter.plugin.platform.f fVar4 = (io.flutter.plugin.platform.f) ((U.e) eVar.f147c).f3053a;
                                fVar4.getClass();
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", (String) obj);
                                fVar4.f10215a.startActivity(Intent.createChooser(intent, null));
                                ((G2.i) nVar).success(null);
                                break;
                            default:
                                ((G2.i) nVar).a();
                                break;
                        }
                    } catch (JSONException e13) {
                        ((G2.i) nVar).b("error", "JSON error: " + e13.getMessage(), null);
                        return;
                    }
                    ((G2.i) nVar).b("error", "JSON error: " + e13.getMessage(), null);
                }
                break;
            case 11:
                k(lVar, nVar);
                break;
            case 13:
                String str4 = lVar.f1146a;
                str4.getClass();
                G2.j jVar = (G2.j) this.f215b;
                if (str4.equals("get")) {
                    jVar.f975f = true;
                    if (jVar.f974e || !jVar.f970a) {
                        ((G2.i) nVar).success(G2.j.a(jVar.f971b));
                        break;
                    } else {
                        jVar.f973d = (G2.i) nVar;
                        break;
                    }
                } else if (str4.equals("put")) {
                    jVar.f971b = (byte[]) lVar.f1147b;
                    ((G2.i) nVar).success(null);
                    break;
                } else {
                    ((G2.i) nVar).a();
                    break;
                }
                break;
            case 17:
                l(lVar, nVar);
                break;
            default:
                String str5 = lVar.f1146a;
                str5.getClass();
                Vibrator vibrator = (Vibrator) ((C0482c) this.f215b).f5783b;
                switch (str5.hashCode()) {
                    case -1367724422:
                        if (str5.equals("cancel")) {
                            c6 = 0;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 86129172:
                        if (str5.equals("hasAmplitudeControl")) {
                            c6 = 1;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 451310959:
                        if (str5.equals("vibrate")) {
                            c6 = 2;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 890723587:
                        break;
                    default:
                        c6 = 65535;
                        break;
                }
                switch (c6) {
                    case 0:
                        vibrator.cancel();
                        ((G2.i) nVar).success(null);
                        break;
                    case 1:
                        if (Build.VERSION.SDK_INT >= 26) {
                            hasAmplitudeControl = vibrator.hasAmplitudeControl();
                            ((G2.i) nVar).success(Boolean.valueOf(hasAmplitudeControl));
                            break;
                        } else {
                            ((G2.i) nVar).success(Boolean.FALSE);
                            break;
                        }
                    case 2:
                        int intValue = ((Integer) lVar.a("duration")).intValue();
                        List list = (List) lVar.a("pattern");
                        int intValue2 = ((Integer) lVar.a("repeat")).intValue();
                        List list2 = (List) lVar.a("intensities");
                        int intValue3 = ((Integer) lVar.a("amplitude")).intValue();
                        if (list.size() > 0 && list2.size() > 0) {
                            int size = list.size();
                            long[] jArr = new long[size];
                            int size2 = list2.size();
                            int[] iArr = new int[size2];
                            for (int i6 = 0; i6 < size; i6++) {
                                jArr[i6] = ((Integer) list.get(i6)).intValue();
                            }
                            for (int i7 = 0; i7 < size2; i7++) {
                                iArr[i7] = ((Integer) list2.get(i7)).intValue();
                            }
                            if (vibrator.hasVibrator()) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    hasAmplitudeControl3 = vibrator.hasAmplitudeControl();
                                    if (hasAmplitudeControl3) {
                                        createWaveform3 = VibrationEffect.createWaveform(jArr, iArr, intValue2);
                                        vibrator.vibrate(createWaveform3, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                                    } else {
                                        createWaveform2 = VibrationEffect.createWaveform(jArr, intValue2);
                                        vibrator.vibrate(createWaveform2, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                                    }
                                } else {
                                    vibrator.vibrate(jArr, intValue2);
                                }
                            }
                        } else if (list.size() > 0) {
                            int size3 = list.size();
                            long[] jArr2 = new long[size3];
                            for (int i8 = 0; i8 < size3; i8++) {
                                jArr2[i8] = ((Integer) list.get(i8)).intValue();
                            }
                            if (vibrator.hasVibrator()) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    createWaveform = VibrationEffect.createWaveform(jArr2, intValue2);
                                    vibrator.vibrate(createWaveform, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                                } else {
                                    vibrator.vibrate(jArr2, intValue2);
                                }
                            }
                        } else {
                            long j2 = intValue;
                            if (vibrator.hasVibrator()) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    hasAmplitudeControl2 = vibrator.hasAmplitudeControl();
                                    if (hasAmplitudeControl2) {
                                        createOneShot2 = VibrationEffect.createOneShot(j2, intValue3);
                                        vibrator.vibrate(createOneShot2, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                                    } else {
                                        createOneShot = VibrationEffect.createOneShot(j2, -1);
                                        vibrator.vibrate(createOneShot, new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                                    }
                                } else {
                                    vibrator.vibrate(j2);
                                }
                            }
                        }
                        ((G2.i) nVar).success(null);
                        break;
                    case 3:
                        ((G2.i) nVar).success(Boolean.TRUE);
                        break;
                    default:
                        ((G2.i) nVar).a();
                        break;
                }
        }
    }

    public /* synthetic */ g(C0482c c0482c) {
        this.f214a = 4;
        this.f215b = (C) c0482c.f5783b;
    }

    public g(int i2) {
        this.f214a = i2;
        switch (i2) {
            case 28:
                this.f215b = new ConcurrentHashMap(16);
                break;
            default:
                this.f215b = new N0.a();
                break;
        }
    }

    public g(WorkDatabase workDatabase) {
        this.f214a = 1;
        kotlin.jvm.internal.i.e(workDatabase, "workDatabase");
        this.f215b = workDatabase;
    }

    public g(C1557b c1557b, int i2) {
        this.f214a = i2;
        switch (i2) {
            case 9:
                new H2.o(c1557b, "flutter/mousecursor", s.f1151b).b(new C0482c(10, this));
                break;
            case 10:
            case 11:
            case 13:
            default:
                l1.j jVar = new l1.j(3);
                H2.o oVar = new H2.o(c1557b, "flutter/backgesture", s.f1151b);
                this.f215b = oVar;
                oVar.b(jVar);
                break;
            case 12:
                new H2.o(c1557b, "flutter/platform_views", s.f1151b).b(new C0482c(12, this));
                break;
            case 14:
                new H2.o(c1557b, "flutter/scribe", H2.j.f1145a).b(new C0482c(15, this));
                break;
            case 15:
                new H2.o(c1557b, "flutter/sensitivecontent", s.f1151b).b(new C0482c(16, this));
                break;
            case 16:
                new H2.o(c1557b, "flutter/spellcheck", s.f1151b).b(new C0482c(17, this));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r18v0, types: [T4.g] */
    public g(final int i2, final int i3, final int i6, final int i7, final boolean z, final boolean z5, final V0.j jVar) {
        this.f214a = 29;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        final W4.d taskRunner = W4.d.f3433l;
        X4.f fVar = X4.f.f3554a;
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        final int i8 = 0;
        this.f215b = new X4.t(taskRunner, 5, 5L, timeUnit, fVar, new InterfaceC1446q() { // from class: T4.g
            @Override // t4.InterfaceC1446q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                X4.t pool = (X4.t) obj;
                C0151a address = (C0151a) obj2;
                X4.a user = (X4.a) obj3;
                kotlin.jvm.internal.i.e(pool, "pool");
                kotlin.jvm.internal.i.e(address, "address");
                kotlin.jvm.internal.i.e(user, "user");
                W4.d dVar = W4.d.this;
                return new X4.m(new X4.n(new X4.u(dVar, pool, i2, i3, i6, i7, i8, z, z5, address, jVar, user)), dVar);
            }
        });
    }

    public g(H2.f fVar) {
        this.f214a = 7;
        this.f215b = new t(fVar, "flutter/keyevent", H2.i.f1144a, null);
    }
}
