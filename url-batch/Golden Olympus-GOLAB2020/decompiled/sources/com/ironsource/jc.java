package com.ironsource;

import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.tf;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class jc implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final String f16836e = "Content-Type";

    /* renamed from: f, reason: collision with root package name */
    private static final String f16837f = "application/json";

    /* renamed from: a, reason: collision with root package name */
    private tf f16838a;

    /* renamed from: b, reason: collision with root package name */
    String f16839b;

    /* renamed from: c, reason: collision with root package name */
    String f16840c;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<zb> f16841d;

    public jc(tf tfVar, String str, String str2, ArrayList<zb> arrayList) {
        this.f16838a = tfVar;
        this.f16839b = str;
        this.f16840c = str2;
        this.f16841d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        tf.a a4;
        tf.a aVar = new tf.a(this.f16841d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            gq b4 = sg.b(this.f16840c, this.f16839b, arrayList);
            a4 = aVar.a(b4.a()).a(b4.f16542a);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e4.getLocalizedMessage());
            a4 = aVar.a(e4 instanceof ho).a(e4);
        }
        tf tfVar = this.f16838a;
        if (tfVar != null) {
            tfVar.a(a4);
        }
    }
}
