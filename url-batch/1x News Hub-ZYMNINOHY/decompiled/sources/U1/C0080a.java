package U1;

import W1.N;
import a0.AbstractC0131b;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b0.AbstractC0182m;
import b0.AbstractC0183n;
import b0.C0171b;
import b0.C0178i;
import b0.C0179j;
import b0.C0185p;
import f0.C0322a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import k.InterfaceC1070o;
import k.MenuC1065j;
import k.SubMenuC1075t;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONObject;

/* renamed from: U1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080a implements M0.h, InterfaceC1070o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1496a;

    public /* synthetic */ C0080a(int i3) {
        this.f1496a = i3;
    }

    public static void b(WebView webView) {
        int i3 = 0;
        C0322a c0322a = new C0322a(webView, new C0080a(27));
        WebView webView2 = (WebView) c0322a.f4977b;
        boolean y3 = C2.b.y("WEB_MESSAGE_LISTENER");
        C0080a c0080a = (C0080a) c0322a.f4978c;
        if (!y3) {
            c0080a.getClass();
            return;
        }
        try {
            c0080a.getClass();
            WeakHashMap weakHashMap = AbstractC0131b.f1921a;
            C0171b c0171b = AbstractC0182m.f2537c;
            if (!c0171b.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            AbstractC0131b.b(webView2).f2542a.removeWebMessageListener("omidJsAttestationListener");
            b0.r rVar = new b0.r(c0322a);
            HashSet hashSet = new HashSet(Arrays.asList("*"));
            if (!c0171b.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            C0185p b3 = AbstractC0131b.b(webView2);
            b3.f2542a.addWebMessageListener("omidJsAttestationListener", (String[]) hashSet.toArray(new String[0]), new C2.a(new C0178i(i3, rVar)));
        } catch (Exception unused) {
            c0080a.getClass();
        }
    }

    public static void g(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            try {
                String string = jSONObject.getString("mechanism");
                String string2 = jSONObject.getString("version");
                HashMap d3 = r1.b.d(jSONObject.getJSONObject("attestationArgs"));
                d3.put("version", string2);
                android.support.v4.media.session.a.b(n1.h.f10158b.f10159a.getApplicationContext(), string, new b0.s(d3));
            } catch (Exception unused) {
            }
        }
    }

    public static void h(WebSettings webSettings, boolean z) {
        C0178i c0179j;
        int i3 = 29;
        if (!AbstractC0182m.f2539e.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        try {
            c0179j = new C0178i(i3, (WebSettingsBoundaryInterface) C2.b.e(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) AbstractC0183n.f2540a.f2544a).convertSettings(webSettings)));
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e3;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e3);
            c0179j = new C0179j(i3, null);
        }
        c0179j.v(z);
    }

    @Override // M0.h
    public void accept(Object obj, Object obj2) {
        V0.c cVar = (V0.c) ((V0.b) obj).q();
        V0.f fVar = new V0.f((d1.e) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i3 = V0.a.f1594a;
        obtain.writeInt(1);
        C2.b.T(obtain, C2.b.S(obtain, 20293));
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f1595a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public List c(String listString) {
        switch (this.f1496a) {
            case 5:
                try {
                    return (List) new N(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
                } catch (IOException | ClassNotFoundException e3) {
                    throw new RuntimeException(e3);
                }
            default:
                kotlin.jvm.internal.j.e(listString, "listString");
                Object readObject = new N(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
                kotlin.jvm.internal.j.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) readObject) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }

    @Override // k.InterfaceC1070o
    public boolean d(SubMenuC1075t subMenuC1075t) {
        return false;
    }

    public String e(List list) {
        switch (this.f1496a) {
            case 5:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            default:
                kotlin.jvm.internal.j.e(list, "list");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                kotlin.jvm.internal.j.d(encodeToString, "encodeToString(...)");
                return encodeToString;
        }
    }

    public void f(C0082c c0082c) {
        switch (this.f1496a) {
            case 0:
                Log.e("IN_APP_PURCHASE", "userSelectedalternativeBilling handler error: " + c0082c);
                break;
            case 1:
            default:
                Log.e("IN_APP_PURCHASE", "onPurchaseUpdated handler error: " + c0082c);
                break;
            case 2:
                Log.e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + c0082c);
                break;
        }
    }

    public /* synthetic */ C0080a(int i3, Object obj) {
        this.f1496a = i3;
    }

    @Override // k.InterfaceC1070o
    public void a(MenuC1065j menuC1065j, boolean z) {
    }
}
