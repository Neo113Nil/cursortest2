package com.baidu.ar;

import com.baidu.ar.arplay.core.message.ARPMessage;
import java.util.HashMap;

/* loaded from: classes.dex */
public class w4 {

    /* renamed from: a, reason: collision with root package name */
    public ARPMessage.MessageHandler f3608a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3609b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3610c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3611d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3612e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3613f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3614g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3615h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3616i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3617j = false;

    public class a implements ARPMessage.MessageHandler {
        public a() {
        }

        @Override // com.baidu.ar.arplay.core.message.ARPMessage.MessageHandler
        public void handleMessage(int i8, int i9, HashMap<String, Object> hashMap) {
            if (hashMap != null) {
                if (hashMap.get("disable_all") != null) {
                    if (1 == ((Integer) hashMap.get("disable_all")).intValue()) {
                        w4.this.f3609b = true;
                    } else {
                        w4.this.f3609b = false;
                    }
                }
                if (hashMap.get("disable_click") != null) {
                    if (1 == ((Integer) hashMap.get("disable_click")).intValue()) {
                        w4.this.f3610c = true;
                    } else {
                        w4.this.f3610c = false;
                    }
                }
                if (hashMap.get("disable_double_click") != null) {
                    if (1 == ((Integer) hashMap.get("disable_double_click")).intValue()) {
                        w4.this.f3611d = true;
                    } else {
                        w4.this.f3611d = false;
                    }
                }
                if (hashMap.get("disable_long_press") != null) {
                    if (1 == ((Integer) hashMap.get("disable_long_press")).intValue()) {
                        w4.this.f3612e = true;
                    } else {
                        w4.this.f3612e = false;
                    }
                }
                if (hashMap.get("disable_swipe") != null) {
                    if (1 == ((Integer) hashMap.get("disable_swipe")).intValue()) {
                        w4.this.f3613f = true;
                    } else {
                        w4.this.f3613f = false;
                    }
                }
                if (hashMap.get("disable_scroll") != null) {
                    if (1 == ((Integer) hashMap.get("disable_scroll")).intValue()) {
                        w4.this.f3614g = true;
                    } else {
                        w4.this.f3614g = false;
                    }
                }
                if (hashMap.get("disable_two_finger_scroll") != null) {
                    if (1 == ((Integer) hashMap.get("disable_two_finger_scroll")).intValue()) {
                        w4.this.f3615h = true;
                    } else {
                        w4.this.f3615h = false;
                    }
                }
                if (hashMap.get("disable_pinch") != null) {
                    if (1 == ((Integer) hashMap.get("disable_pinch")).intValue()) {
                        w4.this.f3616i = true;
                    } else {
                        w4.this.f3616i = false;
                    }
                }
                if (hashMap.get("disable_two_finger_rotate") != null) {
                    if (1 == ((Integer) hashMap.get("disable_two_finger_rotate")).intValue()) {
                        w4.this.f3617j = true;
                    } else {
                        w4.this.f3617j = false;
                    }
                }
            }
        }
    }

    public w4() {
        a();
    }

    public final void a() {
        this.f3608a = new a();
    }

    public boolean b() {
        return (this.f3609b || this.f3615h) ? false : true;
    }

    public boolean c() {
        return (this.f3609b || this.f3610c) ? false : true;
    }

    public boolean d() {
        return (this.f3609b || this.f3611d) ? false : true;
    }

    public boolean e() {
        return (this.f3609b || this.f3612e) ? false : true;
    }

    public boolean f() {
        return (this.f3609b || this.f3616i) ? false : true;
    }

    public boolean g() {
        return (this.f3609b || this.f3617j) ? false : true;
    }

    public boolean h() {
        return (this.f3609b || this.f3614g) ? false : true;
    }

    public boolean i() {
        return (this.f3609b || this.f3613f) ? false : true;
    }

    public void j() {
        ARPMessage.getInstance().removeMessageHandeler(this.f3608a);
    }

    public void k() {
        ARPMessage.getInstance().registerMessageHandler(11, this.f3608a);
    }

    public void l() {
        this.f3608a = null;
    }
}
