package com.cmplay.kinfoc.report.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cmplay.kinfoc.report.d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class NetWorkChangeReceiver extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    private int f4424c;

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList<a> f4422b = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    public static int f4421a = 4;

    /* renamed from: d, reason: collision with root package name */
    private static int f4423d = 4;

    public interface a {
        void a(int i);
    }

    public NetWorkChangeReceiver() {
        this.f4424c = 0;
        this.f4424c = 0;
    }

    public NetWorkChangeReceiver(int i) {
        this.f4424c = 0;
        if (i == 0 || 1 == i) {
            this.f4424c = i;
        }
    }

    public static void a(a aVar) {
        if (f4422b.contains(aVar)) {
            return;
        }
        f4422b.add(aVar);
    }

    public static void b(a aVar) {
        if (f4422b.contains(aVar)) {
            f4422b.remove(aVar);
        }
    }

    public static void a(Context context) {
        int a2 = d.a(context.getApplicationContext());
        if (a2 != f4421a) {
            f4421a = a2;
        }
    }

    private static void a(int i) {
        if (i != f4421a) {
            f4421a = i;
            Iterator<a> it = f4422b.iterator();
            while (it.hasNext()) {
                it.next().a(i);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            int a2 = d.a(context);
            if (this.f4424c == 0) {
                a(a2);
            }
        } catch (Exception unused) {
        }
    }
}
