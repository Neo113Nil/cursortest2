package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceReferrer {

    /* renamed from: a, reason: collision with root package name */
    private String f6328a;

    /* renamed from: b, reason: collision with root package name */
    private String f6329b;

    /* renamed from: c, reason: collision with root package name */
    private ECommerceScreen f6330c;

    public String getIdentifier() {
        return this.f6329b;
    }

    public ECommerceScreen getScreen() {
        return this.f6330c;
    }

    public String getType() {
        return this.f6328a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f6329b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f6330c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f6328a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f6328a + "', identifier='" + this.f6329b + "', screen=" + this.f6330c + '}';
    }
}
