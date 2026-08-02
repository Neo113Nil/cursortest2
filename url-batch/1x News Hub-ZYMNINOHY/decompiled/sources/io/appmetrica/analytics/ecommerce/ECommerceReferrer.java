package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceReferrer {

    /* renamed from: a, reason: collision with root package name */
    private String f5562a;

    /* renamed from: b, reason: collision with root package name */
    private String f5563b;

    /* renamed from: c, reason: collision with root package name */
    private ECommerceScreen f5564c;

    public String getIdentifier() {
        return this.f5563b;
    }

    public ECommerceScreen getScreen() {
        return this.f5564c;
    }

    public String getType() {
        return this.f5562a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f5563b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f5564c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f5562a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f5562a + "', identifier='" + this.f5563b + "', screen=" + this.f5564c + '}';
    }
}
