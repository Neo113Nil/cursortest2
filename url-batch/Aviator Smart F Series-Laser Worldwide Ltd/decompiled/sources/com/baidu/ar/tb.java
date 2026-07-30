package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.rb;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class tb implements s3 {

    /* renamed from: a, reason: collision with root package name */
    public Context f3318a;

    /* renamed from: b, reason: collision with root package name */
    public rb.a f3319b;

    public class a implements rb.a {
        public a(tb tbVar) {
        }

        @Override // com.baidu.ar.rb.a
        public void a(float f8, float f9, float f10, float f11) {
            h.b("acc  x " + f8 + " , y : " + f9 + " , z " + f10);
            StatisticApi.onEvent(StatisticConstants.MODEL_PHONE_SHAKE);
            tb.a(f8, f9, f10, f11);
        }

        @Override // com.baidu.ar.rb.a
        public void destroy() {
        }
    }

    public tb(Context context) {
        this.f3318a = context.getApplicationContext();
    }

    @Override // com.baidu.ar.s3
    public List<Integer> a() {
        return Arrays.asList(1901);
    }

    public void b() {
        sb.a(this.f3318a).a();
        this.f3319b = null;
        this.f3318a = null;
    }

    public void c() {
        Context context = this.f3318a;
        if (context != null) {
            try {
                sb.a(context).b();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(float f8, float f9, float f10, float f11) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 10000);
        hashMap.put("max_acc", Float.valueOf(f11));
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    @Override // com.baidu.ar.s3
    public void a(int i8, int i9, HashMap<String, Object> hashMap) {
        if (i8 != 1901 || hashMap == null) {
            return;
        }
        int a8 = a9.a(hashMap.get("id"), -1);
        if (a8 == 10001) {
            sb.a(this.f3318a).a(this.f3319b);
        } else if (a8 == 10002) {
            sb.a(this.f3318a).b();
        } else {
            if (a8 != 10004) {
                return;
            }
            sb.a(this.f3318a).a(true);
        }
    }

    public void a(r3 r3Var) {
        this.f3319b = new a(this);
        r3Var.a(this);
    }
}
