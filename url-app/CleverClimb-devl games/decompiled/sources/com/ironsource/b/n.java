package com.ironsource.b;

import android.text.TextUtils;
import android.util.Pair;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: IronSourceSegment.java */
/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private String f6968a;

    /* renamed from: b, reason: collision with root package name */
    private int f6969b;

    /* renamed from: c, reason: collision with root package name */
    private String f6970c;

    /* renamed from: d, reason: collision with root package name */
    private int f6971d;
    private AtomicBoolean e;
    private double f;
    private long g;
    private Vector<Pair<String, String>> h;

    public int a() {
        return this.f6969b;
    }

    public String b() {
        return this.f6970c;
    }

    public int c() {
        return this.f6971d;
    }

    public AtomicBoolean d() {
        return this.e;
    }

    public double e() {
        return this.f;
    }

    public long f() {
        return this.g;
    }

    Vector<Pair<String, String>> g() {
        Vector<Pair<String, String>> vector = new Vector<>();
        if (this.f6969b != -1) {
            vector.add(new Pair<>("age", this.f6969b + ""));
        }
        if (!TextUtils.isEmpty(this.f6970c)) {
            vector.add(new Pair<>("gen", this.f6970c));
        }
        if (this.f6971d != -1) {
            vector.add(new Pair<>("lvl", this.f6971d + ""));
        }
        if (this.e != null) {
            vector.add(new Pair<>("pay", this.e + ""));
        }
        if (this.f != -1.0d) {
            vector.add(new Pair<>("iapt", this.f + ""));
        }
        if (this.g != 0) {
            vector.add(new Pair<>("ucd", this.g + ""));
        }
        if (!TextUtils.isEmpty(this.f6968a)) {
            vector.add(new Pair<>("segName", this.f6968a));
        }
        vector.addAll(this.h);
        return vector;
    }
}
