package com.tapjoy.internal;

/* loaded from: classes2.dex */
public enum ez implements en {
    APP(0),
    CAMPAIGN(1),
    CUSTOM(2),
    USAGES(3);

    public static final ek ADAPTER = new eg() { // from class: com.tapjoy.internal.ez.a
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tapjoy.internal.eg
        public final /* bridge */ /* synthetic */ en a(int i) {
            return ez.a(i);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f8056a;

    ez(int i) {
        this.f8056a = i;
    }

    public static ez a(int i) {
        switch (i) {
            case 0:
                return APP;
            case 1:
                return CAMPAIGN;
            case 2:
                return CUSTOM;
            case 3:
                return USAGES;
            default:
                return null;
        }
    }

    @Override // com.tapjoy.internal.en
    public final int a() {
        return this.f8056a;
    }
}
