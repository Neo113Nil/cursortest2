package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m5.a;

/* loaded from: classes.dex */
public final /* synthetic */ class r0 {
    public static /* synthetic */ void A(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("requireArg unexpectedly null.");
        }
        uVar.f(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void B(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("supportArg unexpectedly null.");
        }
        uVar.i(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void C(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("overviewArg unexpectedly null.");
        }
        uVar.k(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void D(m5.c cVar, final k.u uVar) {
        m5.a aVar = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.create", o());
        if (uVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.i0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.p(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        m5.a aVar2 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.dispose", o());
        if (uVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.o0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.q(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        m5.a aVar3 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setDomStorageEnabled", o());
        if (uVar != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.g0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.v(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        m5.a aVar4 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically", o());
        if (uVar != null) {
            aVar4.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.m0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.w(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        m5.a aVar5 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setSupportMultipleWindows", o());
        if (uVar != null) {
            aVar5.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.q0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.x(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        m5.a aVar6 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setJavaScriptEnabled", o());
        if (uVar != null) {
            aVar6.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.e0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.y(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        m5.a aVar7 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setUserAgentString", o());
        if (uVar != null) {
            aVar7.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.k0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.z(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
        m5.a aVar8 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setMediaPlaybackRequiresUserGesture", o());
        if (uVar != null) {
            aVar8.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.l0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.A(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar8.e(null);
        }
        m5.a aVar9 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setSupportZoom", o());
        if (uVar != null) {
            aVar9.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.d0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.B(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar9.e(null);
        }
        m5.a aVar10 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setLoadWithOverviewMode", o());
        if (uVar != null) {
            aVar10.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.j0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.C(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar10.e(null);
        }
        m5.a aVar11 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setUseWideViewPort", o());
        if (uVar != null) {
            aVar11.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.h0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.r(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar11.e(null);
        }
        m5.a aVar12 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setDisplayZoomControls", o());
        if (uVar != null) {
            aVar12.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.p0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.s(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar12.e(null);
        }
        m5.a aVar13 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setBuiltInZoomControls", o());
        if (uVar != null) {
            aVar13.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.n0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.t(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar13.e(null);
        }
        m5.a aVar14 = new m5.a(cVar, "dev.flutter.pigeon.WebSettingsHostApi.setAllowFileAccess", o());
        if (uVar != null) {
            aVar14.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.f0
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    r0.u(k.u.this, obj, eVar);
                }
            });
        } else {
            aVar14.e(null);
        }
    }

    public static m5.i<Object> o() {
        return k.v.f17718d;
    }

    public static /* synthetic */ void p(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Number number2 = (Number) arrayList.get(1);
        if (number2 == null) {
            throw new NullPointerException("webViewInstanceIdArg unexpectedly null.");
        }
        uVar.b(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void q(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            number = (Number) ((ArrayList) obj).get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        uVar.a(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void r(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("useArg unexpectedly null.");
        }
        uVar.l(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void s(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("enabledArg unexpectedly null.");
        }
        uVar.e(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void t(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("enabledArg unexpectedly null.");
        }
        uVar.n(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void u(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("enabledArg unexpectedly null.");
        }
        uVar.h(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void v(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("flagArg unexpectedly null.");
        }
        uVar.d(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void w(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("flagArg unexpectedly null.");
        }
        uVar.m(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void x(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("supportArg unexpectedly null.");
        }
        uVar.g(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void y(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        Boolean bool = (Boolean) arrayList.get(1);
        if (bool == null) {
            throw new NullPointerException("flagArg unexpectedly null.");
        }
        uVar.c(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void z(k.u uVar, Object obj, a.e eVar) {
        Map b7;
        ArrayList arrayList;
        Number number;
        HashMap hashMap = new HashMap();
        try {
            arrayList = (ArrayList) obj;
            number = (Number) arrayList.get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (number == null) {
            throw new NullPointerException("instanceIdArg unexpectedly null.");
        }
        uVar.j(Long.valueOf(number.longValue()), (String) arrayList.get(1));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }
}
