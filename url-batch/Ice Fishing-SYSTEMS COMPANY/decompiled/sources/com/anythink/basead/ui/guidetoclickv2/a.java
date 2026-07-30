package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.b.e;
import com.anythink.basead.g.f;
import com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View;
import com.anythink.basead.ui.guidetoclickv2.b;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.m;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    Queue<b> f11162a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f11163b;

    /* renamed from: c, reason: collision with root package name */
    BaseG2CV2View.b f11164c = new BaseG2CV2View.b() { // from class: com.anythink.basead.ui.guidetoclickv2.a.1
        @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.b
        public final void a() {
            a.this.f();
        }

        @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.b
        public final void b() {
            Object obj;
            Map<String, Object> map = a.this.f11163b;
            if (map != null && (obj = map.get(g.a.f11325c)) != null && (obj instanceof f)) {
                ((f) obj).onATImproveClickViewRenderFail(2);
            }
            a.this.c();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private Context f11165d;

    /* renamed from: e, reason: collision with root package name */
    private w f11166e;

    /* renamed from: f, reason: collision with root package name */
    private x f11167f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f11168g;

    /* renamed from: h, reason: collision with root package name */
    private int f11169h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private b f11170j;

    /* renamed from: k, reason: collision with root package name */
    private c.a f11171k;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.a$a, reason: collision with other inner class name */
    public static class C0059a {

        /* renamed from: a, reason: collision with root package name */
        public static int f11173a = 180;

        /* renamed from: b, reason: collision with root package name */
        public static int f11174b = 50;
    }

    public a(Context context, w wVar, x xVar, int i, RelativeLayout relativeLayout, View view, c.a aVar) {
        this.f11165d = context;
        this.f11166e = wVar;
        this.f11167f = xVar;
        this.f11169h = i;
        this.f11168g = relativeLayout;
        this.i = view;
        this.f11171k = aVar;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r9 != 3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r12 != 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b8, code lost:
    
        if (r2 != 3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e4, code lost:
    
        if (com.anythink.core.common.v.g.a().b(com.anythink.core.common.a.b.d.i) == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d() {
        this.f11162a = new ConcurrentLinkedQueue();
        y yVar = this.f11167f.f14325o;
        int C7 = this.f11169h == 3 ? yVar.C() : m.f(this.f11165d);
        long av = yVar.av();
        String aw = yVar.aw();
        if (TextUtils.isEmpty(aw)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(aw);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("cgf_type", -1);
                    boolean z8 = true;
                    switch (optInt) {
                        case 1:
                        case 6:
                        case 7:
                        case 11:
                        case 12:
                            if (optInt == 6) {
                                break;
                            }
                            z8 = false;
                            break;
                        case 2:
                            if (!e.a(this.f11166e, this.f11167f)) {
                                int i4 = this.f11169h;
                                if (i4 != 1) {
                                    if (i4 == 3) {
                                    }
                                }
                                z8 = false;
                                break;
                            }
                            break;
                        case 3:
                            int i9 = this.f11169h;
                            if (i9 != 1) {
                                if (i9 == 3) {
                                }
                            }
                            z8 = false;
                            break;
                        case 4:
                        case 5:
                            int i10 = this.f11169h;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                }
                            }
                            if (this.i == null) {
                                break;
                            }
                            z8 = false;
                            break;
                        case 8:
                        case 9:
                        case 10:
                            boolean z9 = (this.f11167f.f14320j == 1 && C7 == 1) ? false : true;
                            if (!z9) {
                                if (optInt == 9 && !com.anythink.core.common.v.g.a().b(b.d.f12278f)) {
                                    z9 = true;
                                }
                                if ((optInt == 8 || optInt == 10) && !com.anythink.core.common.v.g.a().b(b.d.f12282k)) {
                                    z9 = true;
                                }
                                if (optInt == 10 && !com.anythink.core.common.v.g.a().b(b.d.f12283l)) {
                                    z9 = true;
                                }
                                if (optInt == 8 && !com.anythink.core.common.v.g.a().b(b.d.f12284m)) {
                                    break;
                                }
                            }
                            z8 = z9;
                            break;
                        case 13:
                            int i11 = this.f11167f.f14320j;
                            if (i11 != 4) {
                            }
                            break;
                    }
                    if (!z8) {
                        long optLong = optJSONObject.optLong("cgf_st", -1L);
                        if (optInt > 0 && optLong >= 0) {
                            this.f11162a.add(new b(this.f11165d, this.f11166e, this.f11167f, this.f11169h, new b.a(i + 1, optInt, av, optLong, yVar.ax(), C7), this.f11168g, this.i, this.f11171k, this.f11164c));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void e() {
        b bVar = this.f11170j;
        if (bVar != null) {
            bVar.a();
        } else {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        g();
        if (this.f11162a.size() > 0) {
            this.f11170j = this.f11162a.poll();
            e();
        }
    }

    private void g() {
        b bVar = this.f11170j;
        if (bVar != null) {
            bVar.c();
            this.f11170j = null;
        }
    }

    public final void b() {
        b bVar = this.f11170j;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void c() {
        b bVar = this.f11170j;
        if (bVar != null) {
            bVar.b();
        }
        g();
        Queue<b> queue = this.f11162a;
        if (queue != null) {
            queue.clear();
        }
    }

    public final void a() {
        e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(int i, int i4) {
        int i9;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 11:
            case 12:
                return i == 6 && !com.anythink.core.common.v.g.a().b(b.d.i);
            case 2:
                return e.a(this.f11166e, this.f11167f) || !((i9 = this.f11169h) == 1 || i9 == 3);
            case 3:
                int i10 = this.f11169h;
                if (i10 == 1 || i10 == 3) {
                    return false;
                }
            case 4:
            case 5:
                int i11 = this.f11169h;
                return !(i11 == 1 || i11 == 2 || i11 == 3) || this.i == null;
            case 8:
            case 9:
            case 10:
                boolean z8 = (this.f11167f.f14320j == 1 && i4 == 1) ? false : true;
                if (!z8) {
                    if (i == 9 && !com.anythink.core.common.v.g.a().b(b.d.f12278f)) {
                        z8 = true;
                    }
                    if ((i == 8 || i == 10) && !com.anythink.core.common.v.g.a().b(b.d.f12282k)) {
                        z8 = true;
                    }
                    if (i == 10 && !com.anythink.core.common.v.g.a().b(b.d.f12283l)) {
                        z8 = true;
                    }
                    if (i == 8 && !com.anythink.core.common.v.g.a().b(b.d.f12284m)) {
                        return true;
                    }
                }
                return z8;
            case 13:
                int i12 = this.f11167f.f14320j;
                if ((i12 == 4 || i12 == 3) && i4 == 1) {
                    return false;
                }
        }
    }

    public final void a(Map<String, Object> map) {
        this.f11163b = map;
    }
}
