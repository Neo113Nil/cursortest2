package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m5.a;

/* loaded from: classes.dex */
public final /* synthetic */ class f2 {

    class a implements k.n<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f17649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f17650b;

        a(Map map, a.e eVar) {
            this.f17649a = map;
            this.f17650b = eVar;
        }

        @Override // io.flutter.plugins.webviewflutter.k.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(String str) {
            this.f17649a.put("result", str);
            this.f17650b.a(this.f17649a);
        }
    }

    public static m5.i<Object> B() {
        return k.d0.f17688d;
    }

    public static /* synthetic */ void C(k.c0 c0Var, Object obj, a.e eVar) {
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
            throw new NullPointerException("useHybridCompositionArg unexpectedly null.");
        }
        c0Var.b(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void D(k.c0 c0Var, Object obj, a.e eVar) {
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
        c0Var.a(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void E(k.c0 c0Var, Object obj, a.e eVar) {
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
        c0Var.o(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void F(k.c0 c0Var, Object obj, a.e eVar) {
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
        c0Var.f(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void G(k.c0 c0Var, Object obj, a.e eVar) {
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
            throw new NullPointerException("includeDiskFilesArg unexpectedly null.");
        }
        c0Var.r(Long.valueOf(number.longValue()), bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void H(k.c0 c0Var, Object obj, a.e eVar) {
        Map b7;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            Number number = (Number) arrayList.get(0);
            if (number == null) {
                throw new NullPointerException("instanceIdArg unexpectedly null.");
            }
            String str = (String) arrayList.get(1);
            if (str == null) {
                throw new NullPointerException("javascriptStringArg unexpectedly null.");
            }
            c0Var.u(Long.valueOf(number.longValue()), str, new a(hashMap, eVar));
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void I(k.c0 c0Var, Object obj, a.e eVar) {
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
        hashMap.put("result", c0Var.d(Long.valueOf(number.longValue())));
        eVar.a(hashMap);
    }

    public static /* synthetic */ void J(k.c0 c0Var, Object obj, a.e eVar) {
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
            throw new NullPointerException("xArg unexpectedly null.");
        }
        Number number3 = (Number) arrayList.get(2);
        if (number3 == null) {
            throw new NullPointerException("yArg unexpectedly null.");
        }
        c0Var.v(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), Long.valueOf(number3.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void K(k.c0 c0Var, Object obj, a.e eVar) {
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
            throw new NullPointerException("xArg unexpectedly null.");
        }
        Number number3 = (Number) arrayList.get(2);
        if (number3 == null) {
            throw new NullPointerException("yArg unexpectedly null.");
        }
        c0Var.z(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()), Long.valueOf(number3.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void L(k.c0 c0Var, Object obj, a.e eVar) {
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
        hashMap.put("result", c0Var.c(Long.valueOf(number.longValue())));
        eVar.a(hashMap);
    }

    public static /* synthetic */ void M(k.c0 c0Var, Object obj, a.e eVar) {
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
        hashMap.put("result", c0Var.x(Long.valueOf(number.longValue())));
        eVar.a(hashMap);
    }

    public static /* synthetic */ void N(k.c0 c0Var, Object obj, a.e eVar) {
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
        hashMap.put("result", c0Var.y(Long.valueOf(number.longValue())));
        eVar.a(hashMap);
    }

    public static /* synthetic */ void O(k.c0 c0Var, Object obj, a.e eVar) {
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
        String str = (String) arrayList.get(1);
        if (str == null) {
            throw new NullPointerException("dataArg unexpectedly null.");
        }
        c0Var.e(Long.valueOf(number.longValue()), str, (String) arrayList.get(2), (String) arrayList.get(3));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void P(k.c0 c0Var, Object obj, a.e eVar) {
        Map b7;
        Boolean bool;
        HashMap hashMap = new HashMap();
        try {
            bool = (Boolean) ((ArrayList) obj).get(0);
        } catch (Error | RuntimeException e7) {
            b7 = k.b(e7);
            hashMap.put("error", b7);
        }
        if (bool == null) {
            throw new NullPointerException("enabledArg unexpectedly null.");
        }
        c0Var.m(bool);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void Q(k.c0 c0Var, Object obj, a.e eVar) {
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
            throw new NullPointerException("webViewClientInstanceIdArg unexpectedly null.");
        }
        c0Var.A(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void R(k.c0 c0Var, Object obj, a.e eVar) {
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
            throw new NullPointerException("javaScriptChannelInstanceIdArg unexpectedly null.");
        }
        c0Var.g(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void S(k.c0 c0Var, Object obj, a.e eVar) {
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
            throw new NullPointerException("javaScriptChannelInstanceIdArg unexpectedly null.");
        }
        c0Var.w(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void T(k.c0 c0Var, Object obj, a.e eVar) {
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
        c0Var.l(Long.valueOf(number.longValue()), number2 == null ? null : Long.valueOf(number2.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void U(k.c0 c0Var, Object obj, a.e eVar) {
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
        c0Var.n(Long.valueOf(number.longValue()), number2 == null ? null : Long.valueOf(number2.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void V(k.c0 c0Var, Object obj, a.e eVar) {
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
            throw new NullPointerException("colorArg unexpectedly null.");
        }
        c0Var.k(Long.valueOf(number.longValue()), Long.valueOf(number2.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void W(k.c0 c0Var, Object obj, a.e eVar) {
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
        String str = (String) arrayList.get(1);
        String str2 = (String) arrayList.get(2);
        if (str2 == null) {
            throw new NullPointerException("dataArg unexpectedly null.");
        }
        c0Var.i(Long.valueOf(number.longValue()), str, str2, (String) arrayList.get(3), (String) arrayList.get(4), (String) arrayList.get(5));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void X(k.c0 c0Var, Object obj, a.e eVar) {
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
        String str = (String) arrayList.get(1);
        if (str == null) {
            throw new NullPointerException("urlArg unexpectedly null.");
        }
        Map<String, String> map = (Map) arrayList.get(2);
        if (map == null) {
            throw new NullPointerException("headersArg unexpectedly null.");
        }
        c0Var.p(Long.valueOf(number.longValue()), str, map);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void Y(k.c0 c0Var, Object obj, a.e eVar) {
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
        String str = (String) arrayList.get(1);
        if (str == null) {
            throw new NullPointerException("urlArg unexpectedly null.");
        }
        byte[] bArr = (byte[]) arrayList.get(2);
        if (bArr == null) {
            throw new NullPointerException("dataArg unexpectedly null.");
        }
        c0Var.t(Long.valueOf(number.longValue()), str, bArr);
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static /* synthetic */ void Z(k.c0 c0Var, Object obj, a.e eVar) {
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
        hashMap.put("result", c0Var.s(Long.valueOf(number.longValue())));
        eVar.a(hashMap);
    }

    public static /* synthetic */ void a0(k.c0 c0Var, Object obj, a.e eVar) {
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
        hashMap.put("result", c0Var.q(Long.valueOf(number.longValue())));
        eVar.a(hashMap);
    }

    public static /* synthetic */ void b0(k.c0 c0Var, Object obj, a.e eVar) {
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
        hashMap.put("result", c0Var.h(Long.valueOf(number.longValue())));
        eVar.a(hashMap);
    }

    public static /* synthetic */ void c0(k.c0 c0Var, Object obj, a.e eVar) {
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
        c0Var.j(Long.valueOf(number.longValue()));
        hashMap.put("result", null);
        eVar.a(hashMap);
    }

    public static void d0(m5.c cVar, final k.c0 c0Var) {
        m5.a aVar = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.create", B());
        if (c0Var != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.w1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.C(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        m5.a aVar2 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.dispose", B());
        if (c0Var != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.f1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.D(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        m5.a aVar3 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.loadData", B());
        if (c0Var != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.d2
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.O(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        m5.a aVar4 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.loadDataWithBaseUrl", B());
        if (c0Var != null) {
            aVar4.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.e2
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.W(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
        m5.a aVar5 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.loadUrl", B());
        if (c0Var != null) {
            aVar5.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.s1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.X(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar5.e(null);
        }
        m5.a aVar6 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.postUrl", B());
        if (c0Var != null) {
            aVar6.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.v1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.Y(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar6.e(null);
        }
        m5.a aVar7 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.getUrl", B());
        if (c0Var != null) {
            aVar7.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.m1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.Z(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar7.e(null);
        }
        m5.a aVar8 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.canGoBack", B());
        if (c0Var != null) {
            aVar8.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.p1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.a0(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar8.e(null);
        }
        m5.a aVar9 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.canGoForward", B());
        if (c0Var != null) {
            aVar9.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.l1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.b0(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar9.e(null);
        }
        m5.a aVar10 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.goBack", B());
        if (c0Var != null) {
            aVar10.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.y1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.c0(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar10.e(null);
        }
        m5.a aVar11 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.goForward", B());
        if (c0Var != null) {
            aVar11.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.o1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.E(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar11.e(null);
        }
        m5.a aVar12 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.reload", B());
        if (c0Var != null) {
            aVar12.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.i1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.F(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar12.e(null);
        }
        m5.a aVar13 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.clearCache", B());
        if (c0Var != null) {
            aVar13.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.g1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.G(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar13.e(null);
        }
        m5.a aVar14 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.evaluateJavascript", B());
        if (c0Var != null) {
            aVar14.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.k1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.H(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar14.e(null);
        }
        m5.a aVar15 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.getTitle", B());
        if (c0Var != null) {
            aVar15.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.x1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.I(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar15.e(null);
        }
        m5.a aVar16 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.scrollTo", B());
        if (c0Var != null) {
            aVar16.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.e1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.J(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar16.e(null);
        }
        m5.a aVar17 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.scrollBy", B());
        if (c0Var != null) {
            aVar17.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.a2
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.K(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar17.e(null);
        }
        m5.a aVar18 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.getScrollX", B());
        if (c0Var != null) {
            aVar18.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.t1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.L(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar18.e(null);
        }
        m5.a aVar19 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.getScrollY", B());
        if (c0Var != null) {
            aVar19.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.c2
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.M(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar19.e(null);
        }
        m5.a aVar20 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.getScrollPosition", B());
        if (c0Var != null) {
            aVar20.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.u1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.N(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar20.e(null);
        }
        m5.a aVar21 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.setWebContentsDebuggingEnabled", B());
        if (c0Var != null) {
            aVar21.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.b2
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.P(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar21.e(null);
        }
        m5.a aVar22 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.setWebViewClient", B());
        if (c0Var != null) {
            aVar22.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.n1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.Q(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar22.e(null);
        }
        m5.a aVar23 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.addJavaScriptChannel", B());
        if (c0Var != null) {
            aVar23.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.h1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.R(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar23.e(null);
        }
        m5.a aVar24 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.removeJavaScriptChannel", B());
        if (c0Var != null) {
            aVar24.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.q1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.S(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar24.e(null);
        }
        m5.a aVar25 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.setDownloadListener", B());
        if (c0Var != null) {
            aVar25.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.z1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.T(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar25.e(null);
        }
        m5.a aVar26 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.setWebChromeClient", B());
        if (c0Var != null) {
            aVar26.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.r1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.U(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar26.e(null);
        }
        m5.a aVar27 = new m5.a(cVar, "dev.flutter.pigeon.WebViewHostApi.setBackgroundColor", B());
        if (c0Var != null) {
            aVar27.e(new a.d() { // from class: io.flutter.plugins.webviewflutter.j1
                @Override // m5.a.d
                public final void a(Object obj, a.e eVar) {
                    f2.V(k.c0.this, obj, eVar);
                }
            });
        } else {
            aVar27.e(null);
        }
    }
}
