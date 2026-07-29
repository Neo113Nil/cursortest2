package com.applovin.impl.mediation;

import android.os.Bundle;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f2752a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f2753a = new Bundle();

        public a a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("No key specified.");
            }
            this.f2753a.remove(str);
            return this;
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("No key specified");
            }
            this.f2753a.putString(str, str2);
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    private c(a aVar) {
        this.f2752a = aVar.f2753a;
    }

    public Bundle a() {
        return this.f2752a;
    }
}
