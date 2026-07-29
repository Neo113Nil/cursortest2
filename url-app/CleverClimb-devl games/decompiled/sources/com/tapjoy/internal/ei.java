package com.tapjoy.internal;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class ei implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    transient int f7996a = 0;

    /* renamed from: b, reason: collision with root package name */
    protected transient int f7997b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final transient ek f7998c;

    /* renamed from: d, reason: collision with root package name */
    private final transient iv f7999d;

    protected ei(ek ekVar, iv ivVar) {
        if (ekVar == null) {
            throw new NullPointerException("adapter == null");
        }
        if (ivVar == null) {
            throw new NullPointerException("unknownFields == null");
        }
        this.f7998c = ekVar;
        this.f7999d = ivVar;
    }

    public final iv a() {
        iv ivVar = this.f7999d;
        return ivVar != null ? ivVar : iv.f8418b;
    }

    public String toString() {
        return ek.c(this);
    }

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        is f8000a;

        /* renamed from: b, reason: collision with root package name */
        em f8001b;

        protected a() {
        }

        public final a a(iv ivVar) {
            if (ivVar.c() > 0) {
                if (this.f8001b == null) {
                    this.f8000a = new is();
                    this.f8001b = new em(this.f8000a);
                }
                try {
                    this.f8001b.a(ivVar);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public final a a(int i, eh ehVar, Object obj) {
            if (this.f8001b == null) {
                this.f8000a = new is();
                this.f8001b = new em(this.f8000a);
            }
            try {
                ehVar.a().a(this.f8001b, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        public final iv a() {
            if (this.f8000a == null) {
                return iv.f8418b;
            }
            return new iv(this.f8000a.clone().g());
        }
    }
}
