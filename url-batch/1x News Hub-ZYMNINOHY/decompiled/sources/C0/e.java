package C0;

import C0.e;
import C0.h;
import E.A;
import E.AbstractC0019u;
import E.C0009j;
import E.W;
import E1.AbstractActivityC0029e;
import E1.AbstractC0033i;
import E1.E;
import E1.K;
import E1.L;
import E1.t;
import K.C0054s;
import K.InterfaceC0044h;
import P1.v;
import U.N;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.Size;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import android.window.BackEvent;
import b0.C0178i;
import b0.r;
import b0.s;
import b2.C0195i;
import c.RunnableC0198c;
import c.u;
import com.google.android.gms.tasks.Task;
import com.startapp.sdk.internal.D;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f0.C0322a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0642l9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.ViewOnSystemUiVisibilityChangeListenerC1047e;
import io.flutter.plugin.platform.o;
import io.flutter.plugin.platform.q;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import l2.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x0.InterfaceC1239b;

/* loaded from: classes.dex */
public class e implements InterfaceC1239b, K, P1.d, w2.d, InterfaceC0044h, P1.m, M0.h, N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200a;

    /* renamed from: b, reason: collision with root package name */
    public Object f201b;

    public /* synthetic */ e(int i3) {
        this.f200a = i3;
    }

    public static HashMap c(BackEvent backEvent) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0183 A[Catch: JSONException -> 0x0029, TryCatch #9 {JSONException -> 0x0029, blocks: (B:5:0x0013, B:6:0x0019, B:11:0x00ce, B:14:0x00d6, B:16:0x0108, B:19:0x012c, B:21:0x011f, B:24:0x0126, B:25:0x013e, B:27:0x0165, B:37:0x0169, B:30:0x0179, B:32:0x0183, B:34:0x0193, B:39:0x016e, B:40:0x019b, B:42:0x01ab, B:43:0x01b8, B:45:0x01b5, B:46:0x01c0, B:48:0x01d2, B:49:0x01d5, B:51:0x0205, B:53:0x0218, B:56:0x02f5, B:77:0x0315, B:79:0x0325, B:80:0x0336, B:83:0x0333, B:113:0x01f9, B:99:0x0252, B:106:0x0276, B:74:0x02c0, B:92:0x02ea, B:60:0x030a, B:85:0x033e, B:115:0x001e, B:118:0x002c, B:121:0x0037, B:124:0x0043, B:127:0x004f, B:130:0x005a, B:133:0x0066, B:136:0x0070, B:139:0x007a, B:142:0x0084, B:145:0x008e, B:148:0x0098, B:151:0x00a3, B:154:0x00ae, B:157:0x00b9, B:63:0x0282, B:65:0x028c, B:66:0x028f, B:68:0x02a5, B:69:0x02b7, B:72:0x02ae), top: B:4:0x0013, inners: #0, #2, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0193 A[Catch: JSONException -> 0x0029, TryCatch #9 {JSONException -> 0x0029, blocks: (B:5:0x0013, B:6:0x0019, B:11:0x00ce, B:14:0x00d6, B:16:0x0108, B:19:0x012c, B:21:0x011f, B:24:0x0126, B:25:0x013e, B:27:0x0165, B:37:0x0169, B:30:0x0179, B:32:0x0183, B:34:0x0193, B:39:0x016e, B:40:0x019b, B:42:0x01ab, B:43:0x01b8, B:45:0x01b5, B:46:0x01c0, B:48:0x01d2, B:49:0x01d5, B:51:0x0205, B:53:0x0218, B:56:0x02f5, B:77:0x0315, B:79:0x0325, B:80:0x0336, B:83:0x0333, B:113:0x01f9, B:99:0x0252, B:106:0x0276, B:74:0x02c0, B:92:0x02ea, B:60:0x030a, B:85:0x033e, B:115:0x001e, B:118:0x002c, B:121:0x0037, B:124:0x0043, B:127:0x004f, B:130:0x005a, B:133:0x0066, B:136:0x0070, B:139:0x007a, B:142:0x0084, B:145:0x008e, B:148:0x0098, B:151:0x00a3, B:154:0x00ae, B:157:0x00b9, B:63:0x0282, B:65:0x028c, B:66:0x028f, B:68:0x02a5, B:69:0x02b7, B:72:0x02ae), top: B:4:0x0013, inners: #0, #2, #3, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void k(P1.l lVar, P1.n nVar) {
        char c3;
        O1.b a3;
        CharSequence i3;
        ClipDescription primaryClipDescription;
        V0.e eVar = (V0.e) this.f201b;
        if (((o) eVar.f1600c) == null) {
            return;
        }
        String str = lVar.f1266a;
        try {
            boolean z = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        c3 = 14;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        c3 = '\f';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        c3 = '\r';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            Object obj = lVar.f1267b;
            switch (c3) {
                case 0:
                    try {
                        int c4 = AbstractC0033i.c((String) obj);
                        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) ((o) eVar.f1600c).f9273b;
                        if (c4 == 1) {
                            fVar.f9251a.getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            fVar.getClass();
                        }
                        ((O1.j) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        ((O1.j) nVar).b("error", e3.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((o) eVar.f1600c).r(AbstractC0033i.b((String) obj));
                        ((O1.j) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException e4) {
                        ((O1.j) nVar).b("error", e4.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((io.flutter.plugin.platform.f) ((o) eVar.f1600c).f9273b).f9251a.setRequestedOrientation(V0.e.q(eVar, (JSONArray) obj));
                        ((O1.j) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e5) {
                        ((O1.j) nVar).b("error", e5.getMessage(), null);
                        return;
                    }
                case 3:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i4 = jSONObject.getInt("primaryColor");
                        if (i4 != 0) {
                            i4 |= -16777216;
                        }
                        String string = jSONObject.getString("label");
                        o oVar = (o) eVar.f1600c;
                        int i5 = Build.VERSION.SDK_INT;
                        AbstractActivityC0029e abstractActivityC0029e = ((io.flutter.plugin.platform.f) oVar.f9273b).f9251a;
                        if (i5 < 28) {
                            abstractActivityC0029e.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i4));
                        } else {
                            abstractActivityC0029e.setTaskDescription(D.d(i4, string));
                        }
                        ((O1.j) nVar).success(null);
                        return;
                    } catch (JSONException e6) {
                        ((O1.j) nVar).b("error", e6.getMessage(), null);
                        return;
                    }
                case 4:
                    try {
                        ((o) eVar.f1600c).m(V0.e.r(eVar, (JSONArray) obj));
                        ((O1.j) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        ((O1.j) nVar).b("error", e7.getMessage(), null);
                        return;
                    }
                case 5:
                    try {
                        ((o) eVar.f1600c).n(V0.e.s(eVar, (String) obj));
                        ((O1.j) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        ((O1.j) nVar).b("error", e8.getMessage(), null);
                        return;
                    }
                case 6:
                    io.flutter.plugin.platform.f fVar2 = (io.flutter.plugin.platform.f) ((o) eVar.f1600c).f9273b;
                    View decorView = fVar2.f9251a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC1047e(fVar2, decorView));
                    ((O1.j) nVar).success(null);
                    return;
                case 7:
                    ((io.flutter.plugin.platform.f) ((o) eVar.f1600c).f9273b).b();
                    ((O1.j) nVar).success(null);
                    return;
                case '\b':
                    try {
                        ((io.flutter.plugin.platform.f) ((o) eVar.f1600c).f9273b).a(V0.e.t(eVar, (JSONObject) obj));
                        ((O1.j) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e9) {
                        ((O1.j) nVar).b("error", e9.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    AbstractActivityC0029e abstractActivityC0029e2 = ((io.flutter.plugin.platform.f) ((o) eVar.f1600c).f9273b).f9253c;
                    if (abstractActivityC0029e2 != null) {
                        abstractActivityC0029e2.j(booleanValue);
                    }
                    ((O1.j) nVar).success(null);
                    return;
                case '\n':
                    io.flutter.plugin.platform.f fVar3 = (io.flutter.plugin.platform.f) ((o) eVar.f1600c).f9273b;
                    AbstractActivityC0029e abstractActivityC0029e3 = fVar3.f9253c;
                    AbstractActivityC0029e abstractActivityC0029e4 = fVar3.f9251a;
                    if (abstractActivityC0029e4 instanceof u) {
                        ((u) abstractActivityC0029e4).a().b();
                    } else {
                        abstractActivityC0029e4.finish();
                    }
                    ((O1.j) nVar).success(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a3 = O1.b.a(str2);
                        } catch (NoSuchFieldException unused) {
                            ((O1.j) nVar).b("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        i3 = ((o) eVar.f1600c).i(a3);
                        if (i3 != null) {
                            ((O1.j) nVar).success(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", i3);
                        ((O1.j) nVar).success(jSONObject2);
                        return;
                    }
                    a3 = null;
                    i3 = ((o) eVar.f1600c).i(a3);
                    if (i3 != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((io.flutter.plugin.platform.f) ((o) eVar.f1600c).f9273b).f9251a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    ((O1.j) nVar).success(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.f) ((o) eVar.f1600c).f9273b).f9251a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z);
                    ((O1.j) nVar).success(jSONObject3);
                    return;
                case 14:
                    io.flutter.plugin.platform.f fVar4 = (io.flutter.plugin.platform.f) ((o) eVar.f1600c).f9273b;
                    fVar4.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    fVar4.f9251a.startActivity(Intent.createChooser(intent, null));
                    ((O1.j) nVar).success(null);
                    return;
                default:
                    ((O1.j) nVar).a();
                    return;
            }
        } catch (JSONException e10) {
            ((O1.j) nVar).b("error", "JSON error: " + e10.getMessage(), null);
        }
        ((O1.j) nVar).b("error", "JSON error: " + e10.getMessage(), null);
    }

    @Override // K.InterfaceC0044h
    public Object a(p pVar, f2.i iVar) {
        return ((InterfaceC0044h) this.f201b).a(new N.c(pVar, null), iVar);
    }

    @Override // M0.h
    public void accept(Object obj, Object obj2) {
        d1.e eVar = (d1.e) obj2;
        P0.a aVar = (P0.a) ((P0.d) obj).q();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f1618d);
        int i3 = W0.b.f1619a;
        N0.i iVar = (N0.i) this.f201b;
        if (iVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            iVar.writeToParcel(obtain, 0);
        }
        try {
            aVar.f1617c.transact(1, obtain, null, 1);
            obtain.recycle();
            eVar.f4931a.e(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void b(String str) {
        V0.e eVar = (V0.e) this.f201b;
        R1.a aVar = (R1.a) eVar.f1599b;
        E e3 = V0.e.f;
        Integer valueOf = Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        if (e3 == null) {
            E e4 = new E();
            e4.put("alias", 1010);
            e4.put("allScroll", 1013);
            e4.put("basic", valueOf);
            e4.put("cell", 1006);
            e4.put("click", 1002);
            e4.put("contextMenu", 1001);
            e4.put("copy", 1011);
            e4.put("forbidden", 1012);
            e4.put("grab", 1020);
            e4.put("grabbing", 1021);
            e4.put("help", 1003);
            e4.put("move", 1013);
            e4.put("none", 0);
            e4.put("noDrop", 1012);
            e4.put("precise", 1007);
            e4.put("text", 1008);
            e4.put("resizeColumn", 1014);
            e4.put("resizeDown", 1015);
            e4.put("resizeUpLeft", 1016);
            e4.put("resizeDownRight", 1017);
            e4.put("resizeLeft", 1014);
            e4.put("resizeLeftRight", 1014);
            e4.put("resizeRight", 1014);
            e4.put("resizeRow", 1015);
            e4.put("resizeUp", 1015);
            e4.put("resizeUpDown", 1015);
            e4.put("resizeUpLeft", 1017);
            e4.put("resizeUpRight", 1016);
            e4.put("resizeUpLeftDownRight", 1017);
            e4.put("resizeUpRightDownLeft", 1016);
            e4.put("verticalText", 1009);
            e4.put("wait", 1004);
            e4.put("zoomIn", 1018);
            e4.put("zoomOut", 1019);
            V0.e.f = e4;
        }
        aVar.setPointerIcon(PointerIcon.getSystemIcon(((t) ((R1.a) eVar.f1599b)).getContext(), ((Integer) V0.e.f.getOrDefault(str, valueOf)).intValue()));
    }

    @Override // P1.d
    public void d(ByteBuffer byteBuffer, G1.g gVar) {
        v.f1275b.getClass();
        v.a(byteBuffer);
        ((G1.b) this.f201b).getClass();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [I1.a] */
    public Bitmap e(ByteBuffer byteBuffer, I1.d dVar) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: I1.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace colorSpace;
                    Size size;
                    ColorSpace.Named unused;
                    e eVar = e.this;
                    eVar.getClass();
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    h hVar = (h) eVar.f201b;
                    if (hVar != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(hVar.f205a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e3) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e3);
            return null;
        }
    }

    @Override // U.N
    public int f() {
        U.u uVar = (U.u) this.f201b;
        return uVar.f1456g - uVar.r();
    }

    @Override // E1.K
    public void g() {
        ((L) this.f201b).f325b = null;
    }

    @Override // a2.InterfaceC0133a
    public Object get() {
        String packageName = ((Context) ((r) this.f201b).f2543a).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // K.InterfaceC0044h
    public w2.d getData() {
        return ((InterfaceC0044h) this.f201b).getData();
    }

    @Override // U.N
    public int h(View view) {
        U.v vVar = (U.v) view.getLayoutParams();
        ((U.u) this.f201b).getClass();
        return (view.getTop() - ((U.v) view.getLayoutParams()).f1457a.top) - ((ViewGroup.MarginLayoutParams) vVar).topMargin;
    }

    public Task l(Task task) {
        V0.e eVar = (V0.e) this.f201b;
        if (task.c() || ((d1.k) task).f4945d) {
            return task;
        }
        Exception a3 = task.a();
        if (!(a3 instanceof L0.d)) {
            return task;
        }
        int i3 = ((L0.d) a3).f876a.f2677a;
        if (i3 == 43001 || i3 == 43002 || i3 == 43003 || i3 == 17) {
            V0.e eVar2 = (V0.e) eVar.f1600c;
            eVar2.getClass();
            d1.e eVar3 = new d1.e();
            ((ExecutorService) eVar2.f1600c).execute(new B.a(eVar2, 4, eVar3));
            return eVar3.f4931a;
        }
        if (i3 == 43000) {
            Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
            d1.k kVar = new d1.k();
            kVar.d(exc);
            return kVar;
        }
        if (i3 != 15) {
            return task;
        }
        Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
        d1.k kVar2 = new d1.k();
        kVar2.d(exc2);
        return kVar2;
    }

    @Override // U.N
    public View m(int i3) {
        return ((U.u) this.f201b).o(i3);
    }

    @Override // w2.d
    public Object n(w2.e eVar, InterfaceC0300c interfaceC0300c) {
        Object n3 = ((C0322a) this.f201b).n(new C0054s(eVar, 0), interfaceC0300c);
        return n3 == EnumC0317a.f4969a ? n3 : C0195i.f2555a;
    }

    @Override // U.N
    public int o() {
        return ((U.u) this.f201b).u();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // P1.m
    public void onMethodCall(P1.l lVar, P1.n nVar) {
        char c3;
        char c4;
        Bundle bundle;
        switch (this.f200a) {
            case 12:
                V0.e eVar = (V0.e) this.f201b;
                if (((C0178i) eVar.f1600c) != null) {
                    String str = lVar.f1266a;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        ((O1.j) nVar).a();
                        break;
                    } else {
                        JSONObject jSONObject = (JSONObject) lVar.f1267b;
                        try {
                            ((O1.j) nVar).success(((C0178i) eVar.f1600c).u(jSONObject.getString("key"), jSONObject.has(CommonUrlParts.LOCALE) ? jSONObject.getString(CommonUrlParts.LOCALE) : null));
                            break;
                        } catch (JSONException e3) {
                            ((O1.j) nVar).b("error", e3.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
            case 13:
            default:
                V0.e eVar2 = (V0.e) this.f201b;
                if (((s) eVar2.f1600c) != null) {
                    String str2 = lVar.f1266a;
                    str2.getClass();
                    Object obj = lVar.f1267b;
                    switch (str2.hashCode()) {
                        case -1779068172:
                            if (str2.equals("TextInput.setPlatformViewClient")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1015421462:
                            if (str2.equals("TextInput.setEditingState")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -37561188:
                            if (str2.equals("TextInput.setClient")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 270476819:
                            if (str2.equals("TextInput.hide")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 270803918:
                            if (str2.equals("TextInput.show")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 649192816:
                            if (str2.equals("TextInput.sendAppPrivateCommand")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1204752139:
                            if (str2.equals("TextInput.setEditableSizeAndTransform")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1727570905:
                            if (str2.equals("TextInput.finishAutofillContext")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1904427655:
                            if (str2.equals("TextInput.clearClient")) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2113369584:
                            if (str2.equals("TextInput.requestAutofill")) {
                                c4 = '\t';
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj;
                                int i3 = jSONObject2.getInt("platformViewId");
                                boolean optBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                                io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) ((s) eVar2.f1600c).f2544a;
                                if (optBoolean) {
                                    View view = kVar.f9213a;
                                    view.requestFocus();
                                    kVar.f9217e = new C0009j(3, i3);
                                    kVar.f9214b.restartInput(view);
                                    kVar.f9220i = false;
                                } else {
                                    kVar.getClass();
                                    kVar.f9217e = new C0009j(4, i3);
                                    kVar.f9221j = null;
                                }
                                ((O1.j) nVar).success(null);
                                break;
                            } catch (JSONException e4) {
                                ((O1.j) nVar).b("error", e4.getMessage(), null);
                            }
                        case 1:
                            try {
                                ((s) eVar2.f1600c).i(O1.p.a((JSONObject) obj));
                                ((O1.j) nVar).success(null);
                                break;
                            } catch (JSONException e5) {
                                ((O1.j) nVar).b("error", e5.getMessage(), null);
                                return;
                            }
                        case 2:
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                ((s) eVar2.f1600c).g(jSONArray.getInt(0), O1.n.a(jSONArray.getJSONObject(1)));
                                ((O1.j) nVar).success(null);
                                break;
                            } catch (NoSuchFieldException | JSONException e6) {
                                ((O1.j) nVar).b("error", e6.getMessage(), null);
                                return;
                            }
                        case 3:
                            io.flutter.plugin.editing.k kVar2 = (io.flutter.plugin.editing.k) ((s) eVar2.f1600c).f2544a;
                            if (kVar2.f9217e.f291b == 4) {
                                kVar2.d();
                            } else {
                                kVar2.d();
                                kVar2.f9214b.hideSoftInputFromWindow(kVar2.f9213a.getApplicationWindowToken(), 0);
                            }
                            ((O1.j) nVar).success(null);
                            break;
                        case 4:
                            io.flutter.plugin.editing.k kVar3 = (io.flutter.plugin.editing.k) ((s) eVar2.f1600c).f2544a;
                            View view2 = kVar3.f9213a;
                            O1.n nVar2 = kVar3.f;
                            InputMethodManager inputMethodManager = kVar3.f9214b;
                            if (nVar2 == null || nVar2.f1195g.f1202a != 11) {
                                view2.requestFocus();
                                inputMethodManager.showSoftInput(view2, 0);
                            } else {
                                kVar3.d();
                                inputMethodManager.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                            }
                            ((O1.j) nVar).success(null);
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
                                io.flutter.plugin.editing.k kVar4 = (io.flutter.plugin.editing.k) ((s) eVar2.f1600c).f2544a;
                                kVar4.f9214b.sendAppPrivateCommand(kVar4.f9213a, string, bundle);
                                ((O1.j) nVar).success(null);
                                break;
                            } catch (JSONException e7) {
                                ((O1.j) nVar).b("error", e7.getMessage(), null);
                                return;
                            }
                            break;
                        case 6:
                            try {
                                JSONObject jSONObject4 = (JSONObject) obj;
                                double d3 = jSONObject4.getDouble("width");
                                double d4 = jSONObject4.getDouble("height");
                                JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int i4 = 0; i4 < 16; i4++) {
                                    dArr[i4] = jSONArray2.getDouble(i4);
                                }
                                ((s) eVar2.f1600c).h(d3, d4, dArr);
                                ((O1.j) nVar).success(null);
                                break;
                            } catch (JSONException e8) {
                                ((O1.j) nVar).b("error", e8.getMessage(), null);
                                return;
                            }
                        case 7:
                            s sVar = (s) eVar2.f1600c;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = ((io.flutter.plugin.editing.k) sVar.f2544a).f9215c;
                                if (autofillManager != null) {
                                    if (booleanValue) {
                                        autofillManager.commit();
                                    } else {
                                        autofillManager.cancel();
                                    }
                                }
                            } else {
                                sVar.getClass();
                            }
                            ((O1.j) nVar).success(null);
                            break;
                        case '\b':
                            io.flutter.plugin.editing.k kVar5 = (io.flutter.plugin.editing.k) ((s) eVar2.f1600c).f2544a;
                            if (kVar5.f9217e.f291b != 3) {
                                kVar5.f9219h.e(kVar5);
                                kVar5.d();
                                kVar5.f = null;
                                kVar5.e(null);
                                kVar5.f9217e = new C0009j(1, 0);
                                kVar5.f9224m = null;
                                Field field = A.f243a;
                                View view3 = kVar5.f9213a;
                                W a3 = AbstractC0019u.a(view3);
                                if (a3 != null && !a3.f270a.n(8)) {
                                    kVar5.f9214b.restartInput(view3);
                                }
                            }
                            ((O1.j) nVar).success(null);
                            break;
                        case '\t':
                            s sVar2 = (s) eVar2.f1600c;
                            int i5 = Build.VERSION.SDK_INT;
                            io.flutter.plugin.editing.k kVar6 = (io.flutter.plugin.editing.k) sVar2.f2544a;
                            if (i5 < 26) {
                                kVar6.getClass();
                            } else if (kVar6.f9215c != null && kVar6.f9218g != null) {
                                String str3 = (String) kVar6.f.f1198j.f162a;
                                int[] iArr = new int[2];
                                View view4 = kVar6.f9213a;
                                view4.getLocationOnScreen(iArr);
                                Rect rect = new Rect(kVar6.f9224m);
                                rect.offset(iArr[0], iArr[1]);
                                kVar6.f9215c.notifyViewEntered(view4, str3.hashCode(), rect);
                            }
                            ((O1.j) nVar).success(null);
                            break;
                        default:
                            ((O1.j) nVar).a();
                            break;
                    }
                }
                break;
            case 14:
                k(lVar, nVar);
                break;
            case 15:
                V0.e eVar3 = (V0.e) this.f201b;
                if (((o) eVar3.f1600c) != null) {
                    String str4 = lVar.f1266a;
                    str4.getClass();
                    Object obj2 = lVar.f1267b;
                    switch (str4.hashCode()) {
                        case -1352294148:
                            if (str4.equals("create")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -756050293:
                            if (str4.equals("clearFocus")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 110550847:
                            if (str4.equals("touch")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 576796989:
                            if (str4.equals("setDirection")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 751366695:
                            if (str4.equals("isSurfaceControlEnabled")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1671767583:
                            if (str4.equals("dispose")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            Map map = (Map) obj2;
                            try {
                                ((o) eVar3.f1600c).f(new O1.e(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null));
                                ((O1.j) nVar).success(null);
                                break;
                            } catch (IllegalStateException e9) {
                                ((O1.j) nVar).b("error", Log.getStackTraceString(e9), null);
                                return;
                            }
                        case 1:
                            try {
                                ((o) eVar3.f1600c).l(((Integer) obj2).intValue());
                                ((O1.j) nVar).success(null);
                                break;
                            } catch (IllegalStateException e10) {
                                ((O1.j) nVar).b("error", Log.getStackTraceString(e10), null);
                                return;
                            }
                        case 2:
                            List list = (List) obj2;
                            try {
                                ((o) eVar3.f1600c).k(new O1.f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                                ((O1.j) nVar).success(null);
                                break;
                            } catch (IllegalStateException e11) {
                                ((O1.j) nVar).b("error", Log.getStackTraceString(e11), null);
                                return;
                            }
                        case 3:
                            Map map2 = (Map) obj2;
                            try {
                                ((o) eVar3.f1600c).e(((Integer) map2.get("id")).intValue(), ((Integer) map2.get("direction")).intValue());
                                ((O1.j) nVar).success(null);
                                break;
                            } catch (IllegalStateException e12) {
                                ((O1.j) nVar).b("error", Log.getStackTraceString(e12), null);
                                return;
                            }
                        case 4:
                            FlutterJNI flutterJNI = ((q) ((o) eVar3.f1600c).f9273b).f9283e;
                            ((O1.j) nVar).success(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                            break;
                        case 5:
                            try {
                                ((o) eVar3.f1600c).o(((Integer) ((Map) obj2).get("id")).intValue());
                                ((O1.j) nVar).success(null);
                                break;
                            } catch (IllegalStateException e13) {
                                ((O1.j) nVar).b("error", Log.getStackTraceString(e13), null);
                                return;
                            }
                        default:
                            ((O1.j) nVar).a();
                            break;
                    }
                }
                break;
            case 16:
                String str5 = lVar.f1266a;
                str5.getClass();
                O1.k kVar7 = (O1.k) this.f201b;
                if (str5.equals("get")) {
                    kVar7.f1182c = true;
                    if (kVar7.f1181b || !kVar7.f1180a) {
                        ((O1.j) nVar).success(O1.k.b((byte[]) kVar7.f1183d));
                        break;
                    } else {
                        kVar7.f = (O1.j) nVar;
                        break;
                    }
                } else if (str5.equals("put")) {
                    kVar7.f1183d = (byte[]) lVar.f1267b;
                    ((O1.j) nVar).success(null);
                    break;
                } else {
                    ((O1.j) nVar).a();
                    break;
                }
                break;
        }
    }

    @Override // U.N
    public int p(View view) {
        U.v vVar = (U.v) view.getLayoutParams();
        ((U.u) this.f201b).getClass();
        return view.getBottom() + ((U.v) view.getLayoutParams()).f1457a.bottom + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin;
    }

    @Override // E1.K
    public void r(io.flutter.embedding.engine.renderer.j jVar) {
        ((L) this.f201b).f325b = jVar;
    }

    public /* synthetic */ e(int i3, Object obj) {
        this.f200a = i3;
        this.f201b = obj;
    }

    public e(G1.b bVar, int i3) {
        this.f200a = i3;
        switch (i3) {
            case 13:
                new P1.o(bVar, "flutter/mousecursor", P1.u.f1272b, null).b(new C0178i(13, this));
                break;
            case 14:
            case 15:
            case 16:
            default:
                K0.j jVar = new K0.j(12);
                P1.o oVar = new P1.o(bVar, "flutter/backgesture", P1.u.f1272b, null);
                this.f201b = oVar;
                oVar.b(jVar);
                break;
            case 17:
                new P1.o(bVar, "flutter/scribe", P1.j.f1265a, null).b(new C0178i(17, this));
                break;
            case 18:
                new P1.o(bVar, "flutter/sensitivecontent", P1.u.f1272b, null).b(new C0178i(18, this));
                break;
            case C0642l9.f7777C /* 19 */:
                new P1.o(bVar, "flutter/spellcheck", P1.u.f1272b, null).b(new C0178i(19, this));
                break;
        }
    }

    public e(P1.f fVar) {
        this.f200a = 11;
        this.f201b = new B0.p(fVar, "flutter/keyevent", (P1.k) P1.i.f1264a, (K0.j) null);
    }

    public e(RunnableC0198c runnableC0198c) {
        this.f200a = 1;
        this.f201b = new CopyOnWriteArrayList();
        new HashMap();
    }

    @Override // E1.K
    public void j() {
    }
}
