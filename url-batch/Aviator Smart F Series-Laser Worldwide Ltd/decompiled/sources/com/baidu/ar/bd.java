package com.baidu.ar;

import java.util.List;

/* loaded from: classes.dex */
public class bd {

    /* renamed from: a, reason: collision with root package name */
    public List<oc> f1844a;

    /* renamed from: b, reason: collision with root package name */
    public tc f1845b;

    /* renamed from: c, reason: collision with root package name */
    public ed f1846c;

    public enum a {
        MODEL_DISAPPEAR_UNTRACKED,
        MODEL_PERSIST_UNTRACKED,
        MODEL_SHOW_IMMEDIATELY
    }

    public ed a() {
        return this.f1846c;
    }

    public List<oc> b() {
        return this.f1844a;
    }

    public tc c() {
        return this.f1845b;
    }

    public void a(ed edVar) {
        this.f1846c = edVar;
    }

    public void a(tc tcVar) {
        this.f1845b = tcVar;
    }

    public void a(List<oc> list) {
        this.f1844a = list;
    }
}
