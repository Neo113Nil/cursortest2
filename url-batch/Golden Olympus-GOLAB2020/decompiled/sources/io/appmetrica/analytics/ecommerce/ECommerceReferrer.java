package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class ECommerceReferrer {

    /* renamed from: a, reason: collision with root package name */
    private String f37102a;

    /* renamed from: b, reason: collision with root package name */
    private String f37103b;

    /* renamed from: c, reason: collision with root package name */
    private ECommerceScreen f37104c;

    public String getIdentifier() {
        return this.f37103b;
    }

    public ECommerceScreen getScreen() {
        return this.f37104c;
    }

    public String getType() {
        return this.f37102a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(String str) {
        this.f37103b = str;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f37104c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(String str) {
        this.f37102a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f37102a + "', identifier='" + this.f37103b + "', screen=" + this.f37104c + '}';
    }
}
