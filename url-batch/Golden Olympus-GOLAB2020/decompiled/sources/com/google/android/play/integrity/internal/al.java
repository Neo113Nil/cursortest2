package com.google.android.play.integrity.internal;

/* loaded from: classes.dex */
public final class al implements ak {

    /* renamed from: a, reason: collision with root package name */
    private static final al f13634a = new al(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f13635b;

    private al(Object obj) {
        this.f13635b = obj;
    }

    public static ak b(Object obj) {
        if (obj != null) {
            return new al(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a() {
        return this.f13635b;
    }
}
