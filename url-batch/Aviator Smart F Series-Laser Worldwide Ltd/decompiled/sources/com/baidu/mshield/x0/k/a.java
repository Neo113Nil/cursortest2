package com.baidu.mshield.x0.k;

import android.content.Context;
import android.content.Intent;
import com.baidu.mshield.x0.c.c;
import com.baidu.mshield.x0.d.b;
import com.baidu.mshield.x0.d.d;
import com.baidu.mshield.x0.j.a;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: com.baidu.mshield.x0.k.a$a, reason: collision with other inner class name */
    public static class C0091a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f8483a;

        public C0091a(Context context) {
            this.f8483a = context;
        }

        @Override // com.baidu.mshield.x0.j.a.b
        public void a(int i8) {
            b.a(this.f8483a, (com.baidu.mshield.x0.l.a) null);
            com.baidu.mshield.x0.c.a.a(this.f8483a);
        }
    }

    public static void a(Context context, Intent intent) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:5:0x0003, B:15:0x0043, B:17:0x004a, B:19:0x0027, B:22:0x0033), top: B:4:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, String str) {
        char c8;
        if (str == null) {
            return;
        }
        try {
            com.baidu.mshield.b.c.a.b("secac=" + str);
            int hashCode = str.hashCode();
            if (hashCode != 1083937949) {
                if (hashCode == 1278732294 && str.equals("com.baidu.mshield.x0.detect.app.fr")) {
                    c8 = 1;
                    if (c8 != 0) {
                        a(context);
                        return;
                    } else {
                        if (c8 != 1) {
                            return;
                        }
                        c.a(context);
                        b.c(context);
                        return;
                    }
                }
                c8 = 65535;
                if (c8 != 0) {
                }
            } else {
                if (str.equals("com.baidu.mshield.x0.timer.pp.action")) {
                    c8 = 0;
                    if (c8 != 0) {
                    }
                }
                c8 = 65535;
                if (c8 != 0) {
                }
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public static void a(Context context) {
        try {
            com.baidu.mshield.x0.j.a.a(context).a((a.b) new C0091a(context), true);
        } catch (Throwable th) {
            d.a(th);
        }
    }
}
