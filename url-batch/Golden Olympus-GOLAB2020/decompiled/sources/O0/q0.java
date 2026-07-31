package O0;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    private String f1248a;

    /* renamed from: b, reason: collision with root package name */
    public J f1249b;

    public q0(String str) {
        this.f1248a = str;
        this.f1249b = new J(str);
        d0.e().c(this.f1248a, this.f1249b);
    }

    private c0 e(int i4) {
        if (i4 == 0) {
            return this.f1249b.f();
        }
        if (i4 == 1) {
            return this.f1249b.d();
        }
        if (i4 == 2) {
            return this.f1249b.g();
        }
        if (i4 != 3) {
            return null;
        }
        return this.f1249b.a();
    }

    private boolean h(int i4) {
        String str;
        if (i4 != 2) {
            c0 e4 = e(i4);
            if (e4 != null && !TextUtils.isEmpty(e4.x())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i4;
        } else {
            if ("_default_config_tag".equals(this.f1248a)) {
                return true;
            }
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        j0.l("hmsSdk", str);
        return false;
    }

    public void a(int i4) {
        j0.j("hmsSdk", "onReport. TAG: " + this.f1248a + ", TYPE: " + i4);
        C0419t.a().d(this.f1248a, i4);
    }

    public void b(int i4, String str, LinkedHashMap linkedHashMap) {
        j0.j("hmsSdk", "onEvent. TAG: " + this.f1248a + ", TYPE: " + i4 + ", eventId : " + str);
        if (AbstractC0415o.b(str) || !h(i4)) {
            j0.l("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f1248a + ", TYPE: " + i4);
            return;
        }
        if (!AbstractC0415o.e(linkedHashMap)) {
            j0.l("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.f1248a + ", TYPE: " + i4);
            linkedHashMap = null;
        }
        C0419t.a().e(this.f1248a, i4, str, linkedHashMap);
    }

    public void c(c0 c0Var) {
        j0.b("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f1248a);
        if (c0Var != null) {
            this.f1249b.c(c0Var);
        } else {
            j0.l("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.f1249b.c(null);
        }
    }

    public void d(Context context, String str, String str2) {
        j0.j("hmsSdk", "onEvent(context). TAG: " + this.f1248a + ", eventId : " + str);
        if (context == null) {
            j0.l("hmsSdk", "context is null in onevent ");
            return;
        }
        if (AbstractC0415o.b(str) || !h(0)) {
            j0.l("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f1248a);
            return;
        }
        if (!AbstractC0415o.c("value", str2, 65536)) {
            j0.l("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f1248a);
            str2 = "";
        }
        C0419t.a().f(this.f1248a, context, str, str2);
    }

    public void f(int i4, String str, LinkedHashMap linkedHashMap) {
        j0.j("hmsSdk", "onStreamEvent. TAG: " + this.f1248a + ", TYPE: " + i4 + ", eventId : " + str);
        if (AbstractC0415o.b(str) || !h(i4)) {
            j0.l("hmsSdk", "onStreamEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f1248a + ", TYPE: " + i4);
            return;
        }
        if (!AbstractC0415o.e(linkedHashMap)) {
            j0.l("hmsSdk", "onStreamEvent() parameter mapValue will be cleared.TAG: " + this.f1248a + ", TYPE: " + i4);
            linkedHashMap = null;
        }
        C0419t.a().h(this.f1248a, i4, str, linkedHashMap);
    }

    public void g(c0 c0Var) {
        j0.b("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f1248a);
        if (c0Var != null) {
            this.f1249b.e(c0Var);
        } else {
            this.f1249b.e(null);
            j0.l("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        }
    }
}
