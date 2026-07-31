package l5;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.c;
import java.util.HashMap;
import m5.a;
import m5.q;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final m5.a<Object> f18630a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f18631b;

    /* renamed from: c, reason: collision with root package name */
    private b f18632c;

    /* renamed from: d, reason: collision with root package name */
    final a.d<Object> f18633d;

    /* renamed from: l5.a$a, reason: collision with other inner class name */
    class C0094a implements a.d<Object> {
        C0094a() {
        }

        @Override // m5.a.d
        public void a(Object obj, a.e<Object> eVar) {
            HashMap hashMap;
            HashMap hashMap2;
            if (a.this.f18632c == null) {
                eVar.a(null);
                return;
            }
            hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            hashMap2 = (HashMap) hashMap.get("data");
            z4.b.e("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            switch (str) {
                case "tooltip":
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        a.this.f18632c.d(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        a.this.f18632c.a(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        a.this.f18632c.f(num.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        a.this.f18632c.e(num2.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    public interface b extends FlutterJNI.a {
        void a(String str);

        void d(String str);

        void e(int i7);

        void f(int i7);
    }

    public a(a5.a aVar, FlutterJNI flutterJNI) {
        C0094a c0094a = new C0094a();
        this.f18633d = c0094a;
        m5.a<Object> aVar2 = new m5.a<>(aVar, "flutter/accessibility", q.f19259a);
        this.f18630a = aVar2;
        aVar2.e(c0094a);
        this.f18631b = flutterJNI;
    }

    public void b(int i7, c.g gVar) {
        this.f18631b.dispatchSemanticsAction(i7, gVar);
    }

    public void c(int i7, c.g gVar, Object obj) {
        this.f18631b.dispatchSemanticsAction(i7, gVar, obj);
    }

    public void d() {
        this.f18631b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f18631b.setSemanticsEnabled(true);
    }

    public void f(int i7) {
        this.f18631b.setAccessibilityFeatures(i7);
    }

    public void g(b bVar) {
        this.f18632c = bVar;
        this.f18631b.setAccessibilityDelegate(bVar);
    }
}
