package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ec {

    /* renamed from: a, reason: collision with root package name */
    private String f15991a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15992b;

    /* renamed from: c, reason: collision with root package name */
    private String f15993c;

    /* renamed from: d, reason: collision with root package name */
    private wf f15994d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15995e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f15996f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f15997a;

        /* renamed from: d, reason: collision with root package name */
        private wf f16000d;

        /* renamed from: b, reason: collision with root package name */
        private boolean f15998b = false;

        /* renamed from: c, reason: collision with root package name */
        private String f15999c = jn.f16865b;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16001e = false;

        /* renamed from: f, reason: collision with root package name */
        private ArrayList<Pair<String, String>> f16002f = new ArrayList<>();

        public a(String str) {
            this.f15997a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f15997a = str;
        }

        public a a(Pair<String, String> pair) {
            this.f16002f.add(pair);
            return this;
        }

        public a b() {
            this.f15999c = jn.f16864a;
            return this;
        }

        public a c() {
            this.f15999c = jn.f16865b;
            return this;
        }

        public a a(wf wfVar) {
            this.f16000d = wfVar;
            return this;
        }

        public a b(boolean z4) {
            this.f15998b = z4;
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f16002f.addAll(list);
            return this;
        }

        public a a(boolean z4) {
            this.f16001e = z4;
            return this;
        }

        public ec a() {
            return new ec(this);
        }
    }

    ec(a aVar) {
        this.f15995e = false;
        this.f15991a = aVar.f15997a;
        this.f15992b = aVar.f15998b;
        this.f15993c = aVar.f15999c;
        this.f15994d = aVar.f16000d;
        this.f15995e = aVar.f16001e;
        if (aVar.f16002f != null) {
            this.f15996f = new ArrayList<>(aVar.f16002f);
        }
    }

    public boolean a() {
        return this.f15992b;
    }

    public String b() {
        return this.f15991a;
    }

    public wf c() {
        return this.f15994d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f15996f);
    }

    public String e() {
        return this.f15993c;
    }

    public boolean f() {
        return this.f15995e;
    }
}
