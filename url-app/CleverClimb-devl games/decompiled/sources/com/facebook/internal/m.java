package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;

/* compiled from: FragmentWrapper.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private Fragment f6147a;

    /* renamed from: b, reason: collision with root package name */
    private android.app.Fragment f6148b;

    public m(Fragment fragment) {
        ac.a(fragment, "fragment");
        this.f6147a = fragment;
    }

    public m(android.app.Fragment fragment) {
        ac.a(fragment, "fragment");
        this.f6148b = fragment;
    }

    public android.app.Fragment a() {
        return this.f6148b;
    }

    public Fragment b() {
        return this.f6147a;
    }

    public void a(Intent intent, int i) {
        if (this.f6147a != null) {
            this.f6147a.startActivityForResult(intent, i);
        } else {
            this.f6148b.startActivityForResult(intent, i);
        }
    }

    public final Activity c() {
        if (this.f6147a != null) {
            return this.f6147a.getActivity();
        }
        return this.f6148b.getActivity();
    }
}
