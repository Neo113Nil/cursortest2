package l4;

import B.f;
import I.L;
import I.T;
import I.v0;
import P.C0154t;
import Q0.t;
import S.j;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d.B;
import g0.C0432l;
import h4.AbstractActivityC0488c;
import h4.InterfaceC0491f;
import h4.h;
import i.C0507I;
import i.C0511M;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.i;
import io.flutter.plugin.platform.C0560f;
import io.flutter.plugin.platform.ViewOnSystemUiVisibilityChangeListenerC0559e;
import io.flutter.plugin.platform.q;
import j4.C0573b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.Intrinsics;
import m.C0681f;
import m.g;
import m.k;
import m.m;
import n.InterfaceC0722m;
import n.J0;
import n.p1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r1.InterfaceC0844c;
import r4.l;
import s1.C0869K;
import s1.C0883n;
import s1.C0885p;
import s1.C0888s;
import s1.InterfaceC0875f;
import s1.InterfaceC0886q;
import s1.z;
import s4.InterfaceC0893b;
import s4.n;
import s4.o;
import s4.p;
import s4.w;
import t1.C0923j;
import x0.C0996c;
import x0.C0997d;

/* loaded from: classes.dex */
public class b implements J0, k, InterfaceC0722m, OnCompleteListener, InterfaceC0893b, o, InterfaceC0886q, z, InterfaceC0875f, q6.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6271d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6272e;

    public /* synthetic */ b(int i2, Object obj) {
        this.f6271d = i2;
        this.f6272e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0180 A[Catch: JSONException -> 0x002b, TryCatch #9 {JSONException -> 0x002b, blocks: (B:5:0x0015, B:6:0x001b, B:11:0x00ce, B:14:0x00d6, B:16:0x0105, B:19:0x0129, B:21:0x011c, B:24:0x0123, B:25:0x013b, B:27:0x0162, B:37:0x0166, B:30:0x0176, B:32:0x0180, B:34:0x0190, B:39:0x016b, B:40:0x0198, B:42:0x01a6, B:43:0x01b3, B:45:0x01b0, B:46:0x01bb, B:48:0x01cd, B:49:0x01d2, B:51:0x0202, B:53:0x0215, B:70:0x02f2, B:77:0x0312, B:79:0x0322, B:80:0x032f, B:112:0x01f6, B:98:0x024f, B:105:0x0273, B:67:0x02bd, B:91:0x02e7, B:74:0x0307, B:84:0x0337, B:114:0x0020, B:117:0x002e, B:120:0x0039, B:123:0x0045, B:126:0x0051, B:129:0x005c, B:132:0x0068, B:135:0x0072, B:138:0x007c, B:141:0x0086, B:144:0x0090, B:147:0x009a, B:150:0x00a5, B:153:0x00b0, B:156:0x00bb, B:56:0x027f, B:58:0x0289, B:59:0x028c, B:61:0x02a2, B:62:0x02b4, B:65:0x02ab), top: B:4:0x0015, inners: #2, #3, #4, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0190 A[Catch: JSONException -> 0x002b, TryCatch #9 {JSONException -> 0x002b, blocks: (B:5:0x0015, B:6:0x001b, B:11:0x00ce, B:14:0x00d6, B:16:0x0105, B:19:0x0129, B:21:0x011c, B:24:0x0123, B:25:0x013b, B:27:0x0162, B:37:0x0166, B:30:0x0176, B:32:0x0180, B:34:0x0190, B:39:0x016b, B:40:0x0198, B:42:0x01a6, B:43:0x01b3, B:45:0x01b0, B:46:0x01bb, B:48:0x01cd, B:49:0x01d2, B:51:0x0202, B:53:0x0215, B:70:0x02f2, B:77:0x0312, B:79:0x0322, B:80:0x032f, B:112:0x01f6, B:98:0x024f, B:105:0x0273, B:67:0x02bd, B:91:0x02e7, B:74:0x0307, B:84:0x0337, B:114:0x0020, B:117:0x002e, B:120:0x0039, B:123:0x0045, B:126:0x0051, B:129:0x005c, B:132:0x0068, B:135:0x0072, B:138:0x007c, B:141:0x0086, B:144:0x0090, B:147:0x009a, B:150:0x00a5, B:153:0x00b0, B:156:0x00bb, B:56:0x027f, B:58:0x0289, B:59:0x028c, B:61:0x02a2, B:62:0x02b4, B:65:0x02ab), top: B:4:0x0015, inners: #2, #3, #4, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void t(n nVar, p pVar) {
        char c7;
        r4.e a7;
        CharSequence d7;
        ClipDescription primaryClipDescription;
        P0.e eVar = (P0.e) this.f6272e;
        if (((q) eVar.f2195i) == null) {
            return;
        }
        String str = nVar.f7767a;
        Object obj = nVar.f7768b;
        try {
            boolean z7 = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        c7 = '\t';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        c7 = 14;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        c7 = '\n';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        c7 = '\f';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        c7 = '\r';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        c7 = '\b';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        c7 = 11;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    try {
                        int c8 = C4.p.c((String) obj);
                        C0560f c0560f = (C0560f) ((q) eVar.f2195i).f5724e;
                        if (c8 == 1) {
                            c0560f.f5697a.getWindow().getDecorView().playSoundEffect(0);
                        }
                        ((l) pVar).success(null);
                        return;
                    } catch (NoSuchFieldException e7) {
                        ((l) pVar).error("error", e7.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((q) eVar.f2195i).j(C4.p.b((String) obj));
                        ((l) pVar).success(null);
                        return;
                    } catch (NoSuchFieldException e8) {
                        ((l) pVar).error("error", e8.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((C0560f) ((q) eVar.f2195i).f5724e).f5697a.setRequestedOrientation(P0.e.h(eVar, (JSONArray) obj));
                        ((l) pVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e9) {
                        ((l) pVar).error("error", e9.getMessage(), null);
                        return;
                    }
                case 3:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i2 = jSONObject.getInt("primaryColor");
                        if (i2 != 0) {
                            i2 |= -16777216;
                        }
                        String string = jSONObject.getString("label");
                        Activity activity = ((C0560f) ((q) eVar.f2195i).f5724e).f5697a;
                        if (Build.VERSION.SDK_INT < 28) {
                            activity.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i2));
                        } else {
                            activity.setTaskDescription(h.a(i2, string));
                        }
                        ((l) pVar).success(null);
                        return;
                    } catch (JSONException e10) {
                        ((l) pVar).error("error", e10.getMessage(), null);
                        return;
                    }
                case 4:
                    try {
                        ((q) eVar.f2195i).e(P0.e.i(eVar, (JSONArray) obj));
                        ((l) pVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e11) {
                        ((l) pVar).error("error", e11.getMessage(), null);
                        return;
                    }
                case 5:
                    try {
                        ((q) eVar.f2195i).g(P0.e.j(eVar, (String) obj));
                        ((l) pVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e12) {
                        ((l) pVar).error("error", e12.getMessage(), null);
                        return;
                    }
                case 6:
                    C0560f c0560f2 = (C0560f) ((q) eVar.f2195i).f5724e;
                    View decorView = c0560f2.f5697a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC0559e(c0560f2, decorView));
                    ((l) pVar).success(null);
                    return;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    ((C0560f) ((q) eVar.f2195i).f5724e).b();
                    ((l) pVar).success(null);
                    return;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    try {
                        ((C0560f) ((q) eVar.f2195i).f5724e).a(P0.e.k(eVar, (JSONObject) obj));
                        ((l) pVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e13) {
                        ((l) pVar).error("error", e13.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    InterfaceC0491f interfaceC0491f = ((C0560f) ((q) eVar.f2195i).f5724e).f5699c;
                    if (interfaceC0491f != null) {
                        ((AbstractActivityC0488c) interfaceC0491f).g(booleanValue);
                    }
                    ((l) pVar).success(null);
                    return;
                case '\n':
                    Activity activity2 = ((C0560f) ((q) eVar.f2195i).f5724e).f5697a;
                    if (activity2 instanceof B) {
                        ((B) activity2).getOnBackPressedDispatcher().b();
                    } else {
                        activity2.finish();
                    }
                    ((l) pVar).success(null);
                    return;
                case RequestError.STOP_TRACKING /* 11 */:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a7 = r4.e.a(str2);
                        } catch (NoSuchFieldException unused) {
                            ((l) pVar).error("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        d7 = ((q) eVar.f2195i).d(a7);
                        if (d7 != null) {
                            ((l) pVar).success(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", d7);
                        ((l) pVar).success(jSONObject2);
                        return;
                    }
                    a7 = null;
                    d7 = ((q) eVar.f2195i).d(a7);
                    if (d7 != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((C0560f) ((q) eVar.f2195i).f5724e).f5697a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    ((l) pVar).success(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((C0560f) ((q) eVar.f2195i).f5724e).f5697a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z7 = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z7);
                    ((l) pVar).success(jSONObject3);
                    return;
                case 14:
                    C0560f c0560f3 = (C0560f) ((q) eVar.f2195i).f5724e;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    c0560f3.f5697a.startActivity(Intent.createChooser(intent, null));
                    ((l) pVar).success(null);
                    return;
                default:
                    ((l) pVar).notImplemented();
                    return;
            }
        } catch (JSONException e14) {
            ((l) pVar).error("error", "JSON error: " + e14.getMessage(), null);
        }
        ((l) pVar).error("error", "JSON error: " + e14.getMessage(), null);
    }

    @Override // s1.InterfaceC0886q
    public void a() {
        C0888s c0888s = (C0888s) this.f6272e;
        Lock lock = c0888s.f7720e;
        lock.lock();
        try {
            c0888s.f7729o = new C0883n(c0888s, c0888s.f7726l, c0888s.f7727m, c0888s.f7723h, c0888s.f7728n, lock, c0888s.f7722g);
            c0888s.f7729o.l();
            c0888s.f7721f.signalAll();
        } finally {
            c0888s.f7720e.unlock();
        }
    }

    @Override // s1.InterfaceC0875f
    public void accept(Object obj, Object obj2) {
        K1.h hVar = (K1.h) obj2;
        v1.c cVar = (v1.c) ((v1.e) obj).i();
        C0923j c0923j = (C0923j) this.f6272e;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(cVar.f289f);
        int i2 = C1.b.f290a;
        if (c0923j == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c0923j.writeToParcel(obtain, 0);
        }
        try {
            cVar.f288e.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // m.k
    public boolean d(m mVar, MenuItem menuItem) {
        boolean onMenuItemSelected;
        InterfaceC0722m interfaceC0722m = ((ActionMenuView) this.f6272e).f3203I;
        if (interfaceC0722m != null) {
            Toolbar toolbar = (Toolbar) ((b) interfaceC0722m).f6272e;
            if (toolbar.f3321O.a()) {
                onMenuItemSelected = true;
            } else {
                p1 p1Var = toolbar.Q;
                onMenuItemSelected = p1Var != null ? ((C0507I) p1Var).f5368a.f5370b.onMenuItemSelected(0, menuItem) : false;
            }
            if (onMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // q6.d
    public Object e(q6.e eVar, V5.b bVar) {
        Object e7 = ((q6.d) this.f6272e).e(new C0154t(eVar, 1), bVar);
        return e7 == W5.a.f2787d ? e7 : Unit.f6114a;
    }

    @Override // n.J0
    public void f(m mVar, m.o oVar) {
        g gVar = (g) this.f6272e;
        Handler handler = gVar.f6382n;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f6384p;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (mVar == ((C0681f) arrayList.get(i2)).f6368b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i5 = i2 + 1;
        handler.postAtTime(new t(this, i5 < arrayList.size() ? (C0681f) arrayList.get(i5) : null, oVar, mVar, 1), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // s1.z
    public void g(Bundle bundle) {
        C0869K c0869k = (C0869K) this.f6272e;
        c0869k.f7632m.lock();
        try {
            c0869k.f7630k = q1.b.f7309n;
            c0869k.f();
        } finally {
            c0869k.f7632m.unlock();
        }
    }

    @Override // s1.InterfaceC0886q
    public boolean i() {
        return true;
    }

    @Override // m.k
    public void j(m mVar) {
        k kVar = ((ActionMenuView) this.f6272e).f3198D;
        if (kVar != null) {
            kVar.j(mVar);
        }
    }

    @Override // s4.InterfaceC0893b
    public void k(Object obj, P0.e eVar) {
        HashMap hashMap;
        HashMap hashMap2;
        D0.j jVar = (D0.j) this.f6272e;
        if (((io.flutter.view.a) jVar.f332l) == null) {
            eVar.g(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get(com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_KEY);
        hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.g gVar = (io.flutter.view.g) ((io.flutter.view.a) jVar.f332l).f5787a;
                    if (Build.VERSION.SDK_INT < 28) {
                        AccessibilityEvent e7 = gVar.e(0, 32);
                        e7.getText().add(str2);
                        gVar.i(e7);
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.a aVar = (io.flutter.view.a) jVar.f332l;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.g) aVar.f5787a).f5879a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) jVar.f332l;
                    ((io.flutter.view.g) aVar2.f5787a).h(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.a aVar3 = (io.flutter.view.a) jVar.f332l;
                    ((io.flutter.view.g) aVar3.f5787a).h(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.a aVar4 = (io.flutter.view.a) jVar.f332l;
                    ((io.flutter.view.g) aVar4.f5787a).h(num3.intValue(), 2);
                    break;
                }
                break;
        }
        eVar.g(null);
    }

    @Override // s1.InterfaceC0886q
    public void l() {
        switch (this.f6271d) {
            case 17:
                C0888s c0888s = (C0888s) this.f6272e;
                Iterator it = c0888s.j.values().iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.common.internal.a) ((InterfaceC0844c) it.next())).d();
                }
                c0888s.f7731q.f7716x = Collections.EMPTY_SET;
                break;
            default:
                C0885p c0885p = (C0885p) ((WeakReference) this.f6272e).get();
                if (c0885p != null) {
                    c0885p.d();
                    break;
                }
                break;
        }
    }

    @Override // s1.z
    public void m(q1.b bVar) {
        C0869K c0869k = (C0869K) this.f6272e;
        c0869k.f7632m.lock();
        try {
            c0869k.f7630k = bVar;
            c0869k.f();
        } finally {
            c0869k.f7632m.unlock();
        }
    }

    @Override // n.J0
    public void n(m mVar, MenuItem menuItem) {
        ((g) this.f6272e).f6382n.removeCallbacksAndMessages(mVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ((CountDownLatch) this.f6272e).countDown();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // s4.o
    public void onMethodCall(n nVar, p pVar) {
        char c7;
        char c8;
        Bundle bundle;
        switch (this.f6271d) {
            case j.BYTES_FIELD_NUMBER /* 8 */:
                P0.c cVar = (P0.c) this.f6272e;
                if (((b) cVar.f2190i) != null) {
                    String str = nVar.f7767a;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        ((l) pVar).notImplemented();
                        break;
                    } else {
                        JSONObject jSONObject = (JSONObject) nVar.f7768b;
                        try {
                            ((l) pVar).success(((b) cVar.f2190i).s(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                            break;
                        } catch (JSONException e7) {
                            ((l) pVar).error("error", e7.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
            case 9:
            default:
                P0.l lVar = (P0.l) this.f6272e;
                if (((f) lVar.f2210i) != null) {
                    String str2 = nVar.f7767a;
                    Object obj = nVar.f7768b;
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1779068172:
                            if (str2.equals("TextInput.setPlatformViewClient")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -1015421462:
                            if (str2.equals("TextInput.setEditingState")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case -37561188:
                            if (str2.equals("TextInput.setClient")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 270476819:
                            if (str2.equals("TextInput.hide")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 270803918:
                            if (str2.equals("TextInput.show")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 649192816:
                            if (str2.equals("TextInput.sendAppPrivateCommand")) {
                                c8 = 5;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1204752139:
                            if (str2.equals("TextInput.setEditableSizeAndTransform")) {
                                c8 = 6;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1727570905:
                            if (str2.equals("TextInput.finishAutofillContext")) {
                                c8 = 7;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1904427655:
                            if (str2.equals("TextInput.clearClient")) {
                                c8 = '\b';
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 2113369584:
                            if (str2.equals("TextInput.requestAutofill")) {
                                c8 = '\t';
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj;
                                int i2 = jSONObject2.getInt("platformViewId");
                                boolean optBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                                i iVar = (i) ((f) lVar.f2210i).f152e;
                                View view = iVar.f5653a;
                                if (optBoolean) {
                                    view.requestFocus();
                                    iVar.f5657e = new C0432l(3, i2);
                                    iVar.f5654b.restartInput(view);
                                    iVar.f5661i = false;
                                } else {
                                    iVar.f5657e = new C0432l(4, i2);
                                    iVar.j = null;
                                }
                                ((l) pVar).success(null);
                                break;
                            } catch (JSONException e8) {
                                ((l) pVar).error("error", e8.getMessage(), null);
                            }
                        case 1:
                            try {
                                ((f) lVar.f2210i).u(r4.q.a((JSONObject) obj));
                                ((l) pVar).success(null);
                                break;
                            } catch (JSONException e9) {
                                ((l) pVar).error("error", e9.getMessage(), null);
                                return;
                            }
                        case 2:
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                ((f) lVar.f2210i).s(jSONArray.getInt(0), r4.o.a(jSONArray.getJSONObject(1)));
                                ((l) pVar).success(null);
                                break;
                            } catch (NoSuchFieldException | JSONException e10) {
                                ((l) pVar).error("error", e10.getMessage(), null);
                                return;
                            }
                        case 3:
                            i iVar2 = (i) ((f) lVar.f2210i).f152e;
                            if (iVar2.f5657e.f4946b == 4) {
                                iVar2.d();
                            } else {
                                View view2 = iVar2.f5653a;
                                iVar2.d();
                                iVar2.f5654b.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                            }
                            ((l) pVar).success(null);
                            break;
                        case 4:
                            i iVar3 = (i) ((f) lVar.f2210i).f152e;
                            InputMethodManager inputMethodManager = iVar3.f5654b;
                            View view3 = iVar3.f5653a;
                            r4.o oVar = iVar3.f5658f;
                            if (oVar == null || oVar.f7513g.f7519a != 11) {
                                view3.requestFocus();
                                inputMethodManager.showSoftInput(view3, 0);
                            } else {
                                iVar3.d();
                                inputMethodManager.hideSoftInputFromWindow(view3.getApplicationWindowToken(), 0);
                            }
                            ((l) pVar).success(null);
                            break;
                        case 5:
                            try {
                                JSONObject jSONObject3 = (JSONObject) obj;
                                String string = jSONObject3.getString("action");
                                String string2 = jSONObject3.getString("data");
                                if (string2 == null || string2.isEmpty()) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("data", string2);
                                }
                                i iVar4 = (i) ((f) lVar.f2210i).f152e;
                                iVar4.f5654b.sendAppPrivateCommand(iVar4.f5653a, string, bundle);
                                ((l) pVar).success(null);
                                break;
                            } catch (JSONException e11) {
                                ((l) pVar).error("error", e11.getMessage(), null);
                                return;
                            }
                            break;
                        case 6:
                            try {
                                JSONObject jSONObject4 = (JSONObject) obj;
                                double d7 = jSONObject4.getDouble("width");
                                double d8 = jSONObject4.getDouble("height");
                                JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int i5 = 0; i5 < 16; i5++) {
                                    dArr[i5] = jSONArray2.getDouble(i5);
                                }
                                ((f) lVar.f2210i).t(d7, d8, dArr);
                                ((l) pVar).success(null);
                                break;
                            } catch (JSONException e12) {
                                ((l) pVar).error("error", e12.getMessage(), null);
                                return;
                            }
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            f fVar = (f) lVar.f2210i;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = ((i) fVar.f152e).f5655c;
                                if (autofillManager != null) {
                                    if (booleanValue) {
                                        autofillManager.commit();
                                    } else {
                                        autofillManager.cancel();
                                    }
                                }
                            } else {
                                fVar.getClass();
                            }
                            ((l) pVar).success(null);
                            break;
                        case j.BYTES_FIELD_NUMBER /* 8 */:
                            i iVar5 = (i) ((f) lVar.f2210i).f152e;
                            View view4 = iVar5.f5653a;
                            if (iVar5.f5657e.f4946b != 3) {
                                iVar5.f5660h.e(iVar5);
                                iVar5.d();
                                iVar5.f5658f = null;
                                iVar5.e(null);
                                iVar5.f5657e = new C0432l(1, 0);
                                iVar5.f5664m = null;
                                WeakHashMap weakHashMap = T.f1153a;
                                v0 a7 = L.a(view4);
                                if (a7 != null && !a7.f1239a.r(8)) {
                                    iVar5.f5654b.restartInput(view4);
                                }
                            }
                            ((l) pVar).success(null);
                            break;
                        case '\t':
                            i iVar6 = (i) ((f) lVar.f2210i).f152e;
                            View view5 = iVar6.f5653a;
                            if (Build.VERSION.SDK_INT >= 26 && iVar6.f5655c != null && iVar6.f5659g != null) {
                                String str3 = (String) iVar6.f5658f.j.f4535d;
                                int[] iArr = new int[2];
                                view5.getLocationOnScreen(iArr);
                                Rect rect = new Rect(iVar6.f5664m);
                                rect.offset(iArr[0], iArr[1]);
                                iVar6.f5655c.notifyViewEntered(view5, str3.hashCode(), rect);
                            }
                            ((l) pVar).success(null);
                            break;
                        default:
                            ((l) pVar).notImplemented();
                            break;
                    }
                }
                break;
            case 10:
                t(nVar, pVar);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                P0.l lVar2 = (P0.l) this.f6272e;
                if (((q) lVar2.f2210i) != null) {
                    String str4 = nVar.f7767a;
                    Object obj2 = nVar.f7768b;
                    str4.getClass();
                    switch (str4.hashCode()) {
                        case -1352294148:
                            if (str4.equals("create")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -756050293:
                            if (str4.equals("clearFocus")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 110550847:
                            if (str4.equals("touch")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 576796989:
                            if (str4.equals("setDirection")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 751366695:
                            if (str4.equals("isSurfaceControlEnabled")) {
                                c7 = 4;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1671767583:
                            if (str4.equals("dispose")) {
                                c7 = 5;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    switch (c7) {
                        case 0:
                            Map map = (Map) obj2;
                            try {
                                ((q) lVar2.f2210i).b(new r4.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null));
                                ((l) pVar).success(null);
                                break;
                            } catch (IllegalStateException e13) {
                                ((l) pVar).error("error", Log.getStackTraceString(e13), null);
                                return;
                            }
                        case 1:
                            try {
                                ((q) lVar2.f2210i).n(((Integer) obj2).intValue());
                                ((l) pVar).success(null);
                                break;
                            } catch (IllegalStateException e14) {
                                ((l) pVar).error("error", Log.getStackTraceString(e14), null);
                                return;
                            }
                        case 2:
                            List list = (List) obj2;
                            try {
                                ((q) lVar2.f2210i).l(new r4.i(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                                ((l) pVar).success(null);
                                break;
                            } catch (IllegalStateException e15) {
                                ((l) pVar).error("error", Log.getStackTraceString(e15), null);
                                return;
                            }
                        case 3:
                            Map map2 = (Map) obj2;
                            try {
                                ((q) lVar2.f2210i).i(((Integer) map2.get("id")).intValue(), ((Integer) map2.get("direction")).intValue());
                                ((l) pVar).success(null);
                                break;
                            } catch (IllegalStateException e16) {
                                ((l) pVar).error("error", Log.getStackTraceString(e16), null);
                                return;
                            }
                        case 4:
                            FlutterJNI flutterJNI = ((io.flutter.plugin.platform.t) ((q) lVar2.f2210i).f5724e).f5734m;
                            ((l) pVar).success(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                            break;
                        case 5:
                            try {
                                ((q) lVar2.f2210i).s(((Integer) ((Map) obj2).get("id")).intValue());
                                ((l) pVar).success(null);
                                break;
                            } catch (IllegalStateException e17) {
                                ((l) pVar).error("error", Log.getStackTraceString(e17), null);
                                return;
                            }
                        default:
                            ((l) pVar).notImplemented();
                            break;
                    }
                }
                break;
            case 12:
                A6.j jVar = (A6.j) this.f6272e;
                String str5 = nVar.f7767a;
                Object obj3 = nVar.f7768b;
                str5.getClass();
                if (str5.equals("get")) {
                    jVar.f116d = true;
                    if (jVar.f115c || !jVar.f114b) {
                        ((l) pVar).success(A6.j.d((byte[]) jVar.f117e));
                        break;
                    } else {
                        jVar.f119g = (l) pVar;
                        break;
                    }
                } else if (str5.equals("put")) {
                    jVar.f117e = (byte[]) obj3;
                    ((l) pVar).success(null);
                    break;
                } else {
                    ((l) pVar).notImplemented();
                    break;
                }
                break;
        }
    }

    @Override // s1.z
    public void p(int i2) {
        C0869K c0869k = (C0869K) this.f6272e;
        Lock lock = c0869k.f7632m;
        Lock lock2 = c0869k.f7632m;
        lock.lock();
        try {
            if (c0869k.f7631l) {
                c0869k.f7631l = false;
                c0869k.f7625e.p(i2);
                c0869k.f7630k = null;
                c0869k.j = null;
            } else {
                c0869k.f7631l = true;
                c0869k.f7626f.onConnectionSuspended(i2);
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock2.unlock();
            throw th;
        }
    }

    public C0997d q(Object obj, C0643h clazz, Activity activity, C0.b consumer) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter("addWindowLayoutInfoListener", "addMethodName");
        Intrinsics.checkNotNullParameter("removeWindowLayoutInfoListener", "removeMethodName");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Object newProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f6272e, new Class[]{u()}, new C0996c(clazz, consumer));
        Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, u()).invoke(obj, activity, newProxyInstance);
        return new C0997d(obj.getClass().getMethod("removeWindowLayoutInfoListener", u()), obj, newProxyInstance);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [l4.a] */
    public Bitmap r(ByteBuffer byteBuffer, e eVar) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: l4.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace colorSpace;
                    Size size;
                    ColorSpace.Named unused;
                    b bVar = b.this;
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    i4.j jVar = (i4.j) bVar.f6272e;
                    if (jVar != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(jVar.f5552a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e7) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e7);
            return null;
        }
    }

    public String s(String str, String str2) {
        t4.a aVar = (t4.a) this.f6272e;
        Context context = aVar.f8012b;
        if (str2 != null) {
            Locale a7 = t4.a.a(str2);
            Configuration configuration = new Configuration(aVar.f8012b.getResources().getConfiguration());
            configuration.setLocale(a7);
            context = aVar.f8012b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", aVar.f8012b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public Class u() {
        Class<?> loadClass = ((ClassLoader) this.f6272e).loadClass("java.util.function.Consumer");
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }

    public b(C0885p c0885p) {
        this.f6271d = 18;
        this.f6272e = new WeakReference(c0885p);
    }

    public b(C0573b c0573b, int i2) {
        this.f6271d = i2;
        switch (i2) {
            case 13:
                new s4.q(c0573b, "flutter/scribe", s4.l.f7766a).b(new C0511M(14, this));
                break;
            case 14:
                new s4.q(c0573b, "flutter/sensitivecontent", w.f7775a).b(new C0511M(15, this));
                break;
            case 15:
                new s4.q(c0573b, "flutter/spellcheck", w.f7775a).b(new C0511M(16, this));
                break;
            default:
                new s4.q(c0573b, "flutter/mousecursor", w.f7775a).b(new C0511M(11, this));
                break;
        }
    }

    public b(ClassLoader loader) {
        this.f6271d = 24;
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f6272e = loader;
    }

    public b(s4.f fVar) {
        this.f6271d = 7;
        this.f6272e = new P0.i(fVar, "flutter/keyevent", s4.k.f7765a, null);
    }

    public b(int i2) {
        this.f6271d = i2;
        switch (i2) {
            case 19:
                this.f6272e = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                break;
            case 22:
                this.f6272e = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f6272e = null;
                break;
        }
    }

    @Override // s1.InterfaceC0886q
    public void c(int i2) {
    }

    @Override // s1.InterfaceC0886q
    public void h(Bundle bundle) {
    }

    @Override // s1.InterfaceC0886q
    public void b(q1.b bVar, r1.e eVar, boolean z7) {
    }
}
