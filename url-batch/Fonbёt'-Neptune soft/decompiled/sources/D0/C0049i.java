package D0;

import android.util.Log;

/* renamed from: D0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049i extends Q0.i implements P0.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f363f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0049i(long j2) {
        super(1);
        this.f363f = j2;
    }

    @Override // P0.l
    public final Object i(Object obj) {
        if (((F0.e) obj).f464e instanceof F0.d) {
            Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + this.f363f);
        }
        return F0.h.f469a;
    }
}
