package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceReferrer {

    /* renamed from: a, reason: collision with root package name */
    private String f9817a;

    /* renamed from: b, reason: collision with root package name */
    private String f9818b;

    /* renamed from: c, reason: collision with root package name */
    private ECommerceScreen f9819c;

    public String getIdentifier() {
        return this.f9818b;
    }

    public ECommerceScreen getScreen() {
        return this.f9819c;
    }

    public String getType() {
        return this.f9817a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f9818b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f9819c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f9817a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f9817a + "', identifier='" + this.f9818b + "', screen=" + this.f9819c + '}';
    }
}
