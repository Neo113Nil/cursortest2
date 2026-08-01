package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class cd implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cd f2195e = new cd(0);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cd f2196i = new cd(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2197d;

    public /* synthetic */ cd(int i3) {
        this.f2197d = i3;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f2197d) {
            case 0:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }

    private final /* synthetic */ void a() {
    }
}
