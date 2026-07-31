package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e90 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    private volatile q80 f4525a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4526b;

    public e90(Context context) {
        this.f4526b = context;
    }

    static /* bridge */ /* synthetic */ void c(e90 e90Var) {
        if (e90Var.f4525a == null) {
            return;
        }
        e90Var.f4525a.d();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.t5
    public final w5 a(a6<?> a6Var) {
        Parcelable.Creator<s80> creator = s80.CREATOR;
        Map<String, String> m7 = a6Var.m();
        int size = m7.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i7 = 0;
        int i8 = 0;
        for (Map.Entry<String, String> entry : m7.entrySet()) {
            strArr[i8] = entry.getKey();
            strArr2[i8] = entry.getValue();
            i8++;
        }
        s80 s80Var = new s80(a6Var.l(), strArr, strArr2);
        long a7 = y2.t.a().a();
        try {
            bp0 bp0Var = new bp0();
            this.f4525a = new q80(this.f4526b, y2.t.u().b(), new c90(this, bp0Var), new d90(this, bp0Var));
            this.f4525a.q();
            a90 a90Var = new a90(this, s80Var);
            dc3 dc3Var = wo0.f13894a;
            cc3 o7 = rb3.o(rb3.n(bp0Var, a90Var, dc3Var), ((Integer) sw.c().b(m10.Z2)).intValue(), TimeUnit.MILLISECONDS, wo0.f13897d);
            o7.b(new b90(this), dc3Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) o7.get();
            long a8 = y2.t.a().a();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(a8 - a7);
            sb.append("ms");
            a3.r1.k(sb.toString());
            u80 u80Var = (u80) new ti0(parcelFileDescriptor).c(u80.CREATOR);
            if (u80Var == null) {
                return null;
            }
            if (u80Var.f12681f) {
                throw new k6(u80Var.f12682g);
            }
            if (u80Var.f12685j.length != u80Var.f12686k.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = u80Var.f12685j;
                if (i7 >= strArr3.length) {
                    return new w5(u80Var.f12683h, u80Var.f12684i, hashMap, u80Var.f12687l, u80Var.f12688m);
                }
                hashMap.put(strArr3[i7], u80Var.f12686k[i7]);
                i7++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            long a9 = y2.t.a().a();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(a9 - a7);
            sb2.append("ms");
            a3.r1.k(sb2.toString());
            return null;
        } catch (Throwable th) {
            long a10 = y2.t.a().a();
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(a10 - a7);
            sb3.append("ms");
            a3.r1.k(sb3.toString());
            throw th;
        }
    }
}
