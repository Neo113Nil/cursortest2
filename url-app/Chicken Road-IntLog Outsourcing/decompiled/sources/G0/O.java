package G0;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: A, reason: collision with root package name */
    public static final C0060j f766A;

    /* renamed from: B, reason: collision with root package name */
    public static final C0060j f767B;

    /* renamed from: C, reason: collision with root package name */
    public static final C0060j f768C;

    /* renamed from: D, reason: collision with root package name */
    public static final C0060j f769D;

    /* renamed from: E, reason: collision with root package name */
    public static final C0060j f770E;

    /* renamed from: a, reason: collision with root package name */
    public static final C0060j f771a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0060j f772b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0060j f773c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0060j f774d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0060j f775e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0060j f776f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0060j f777g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0060j f778h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0060j f779i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0060j f780j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0060j f781k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0060j f782l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0060j f783m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0060j f784n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0060j f785o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0060j f786p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0060j f787q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0060j f788r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0060j f789s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0060j f790t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0060j f791u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0060j f792v;

    /* renamed from: w, reason: collision with root package name */
    public static final C0060j f793w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0060j f794x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0060j f795y;
    public static final C0060j z;

    static {
        C0058h b6 = C0060j.b();
        b6.f854a = 3;
        b6.f855b = "Google Play In-app Billing API version is less than 3";
        f771a = b6.a();
        C0058h b7 = C0060j.b();
        b7.f854a = 3;
        b7.f855b = "Google Play In-app Billing API version is less than 9";
        f772b = b7.a();
        C0058h b8 = C0060j.b();
        b8.f854a = 3;
        b8.f855b = "Billing service unavailable on device.";
        f773c = b8.a();
        C0058h b9 = C0060j.b();
        b9.f854a = 2;
        b9.f855b = "Billing service unavailable on device.";
        f774d = b9.a();
        C0058h b10 = C0060j.b();
        b10.f854a = 5;
        b10.f855b = "Client is already in the process of connecting to billing service.";
        f775e = b10.a();
        C0058h b11 = C0060j.b();
        b11.f854a = 5;
        b11.f855b = "The list of SKUs can't be empty.";
        b11.a();
        C0058h b12 = C0060j.b();
        b12.f854a = 5;
        b12.f855b = "SKU type can't be empty.";
        b12.a();
        C0058h b13 = C0060j.b();
        b13.f854a = 5;
        b13.f855b = "Product type can't be empty.";
        f776f = b13.a();
        C0058h b14 = C0060j.b();
        b14.f854a = -2;
        b14.f855b = "Client does not support extra params.";
        f777g = b14.a();
        C0058h b15 = C0060j.b();
        b15.f854a = 5;
        b15.f855b = "Invalid purchase token.";
        f778h = b15.a();
        C0058h b16 = C0060j.b();
        b16.f854a = 6;
        b16.f855b = "An internal error occurred.";
        f779i = b16.a();
        C0058h b17 = C0060j.b();
        b17.f854a = 5;
        b17.f855b = "SKU can't be null.";
        b17.a();
        C0058h b18 = C0060j.b();
        b18.f854a = 0;
        f780j = b18.a();
        C0058h b19 = C0060j.b();
        b19.f854a = -1;
        b19.f855b = "Service connection is disconnected.";
        f781k = b19.a();
        C0058h b20 = C0060j.b();
        b20.f854a = 2;
        b20.f855b = "Timeout communicating with service.";
        f782l = b20.a();
        C0058h b21 = C0060j.b();
        b21.f854a = -2;
        b21.f855b = "Client does not support subscriptions.";
        f783m = b21.a();
        C0058h b22 = C0060j.b();
        b22.f854a = -2;
        b22.f855b = "Client does not support subscriptions update.";
        f784n = b22.a();
        C0058h b23 = C0060j.b();
        b23.f854a = -2;
        b23.f855b = "Client does not support get purchase history.";
        f785o = b23.a();
        C0058h b24 = C0060j.b();
        b24.f854a = -2;
        b24.f855b = "Client does not support price change confirmation.";
        f786p = b24.a();
        C0058h b25 = C0060j.b();
        b25.f854a = -2;
        b25.f855b = "Play Store version installed does not support cross selling products.";
        f787q = b25.a();
        C0058h b26 = C0060j.b();
        b26.f854a = -2;
        b26.f855b = "Client does not support multi-item purchases.";
        f788r = b26.a();
        C0058h b27 = C0060j.b();
        b27.f854a = -2;
        b27.f855b = "Client does not support offer_id_token.";
        f789s = b27.a();
        C0058h b28 = C0060j.b();
        b28.f854a = -2;
        b28.f855b = "Client does not support ProductDetails.";
        f790t = b28.a();
        C0058h b29 = C0060j.b();
        b29.f854a = -2;
        b29.f855b = "Client does not support in-app messages.";
        f791u = b29.a();
        C0058h b30 = C0060j.b();
        b30.f854a = -2;
        b30.f855b = "Client does not support user choice billing.";
        b30.a();
        C0058h b31 = C0060j.b();
        b31.f854a = -2;
        b31.f855b = "Play Store version installed does not support external offer.";
        f792v = b31.a();
        C0058h b32 = C0060j.b();
        b32.f854a = -2;
        b32.f855b = "Play Store version installed does not support multi-item purchases with season pass in one cart.";
        f793w = b32.a();
        C0058h b33 = C0060j.b();
        b33.f854a = 5;
        b33.f855b = "Unknown feature";
        f794x = b33.a();
        C0058h b34 = C0060j.b();
        b34.f854a = -2;
        b34.f855b = "Play Store version installed does not support get billing config.";
        f795y = b34.a();
        C0058h b35 = C0060j.b();
        b35.f854a = -2;
        b35.f855b = "Query product details with serialized docid is not supported.";
        z = b35.a();
        C0058h b36 = C0060j.b();
        b36.f854a = 4;
        b36.f855b = "Item is unavailable for purchase.";
        f766A = b36.a();
        C0058h b37 = C0060j.b();
        b37.f854a = -2;
        b37.f855b = "Query product details with developer specified account is not supported.";
        f767B = b37.a();
        C0058h b38 = C0060j.b();
        b38.f854a = -2;
        b38.f855b = "Play Store version installed does not support alternative billing only.";
        f768C = b38.a();
        C0058h b39 = C0060j.b();
        b39.f854a = 5;
        b39.f855b = "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.";
        f769D = b39.a();
        C0058h b40 = C0060j.b();
        b40.f854a = 6;
        b40.f855b = "An error occurred while retrieving billing override.";
        f770E = b40.a();
    }

    public static C0060j a(int i2, String str) {
        C0058h b6 = C0060j.b();
        b6.f854a = i2;
        b6.f855b = str;
        return b6.a();
    }
}
