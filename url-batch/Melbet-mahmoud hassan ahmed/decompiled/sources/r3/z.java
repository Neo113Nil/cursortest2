package r3;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
final class z extends a0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f21341a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f21342b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f21343c;

    z(Intent intent, Activity activity, int i7) {
        this.f21341a = intent;
        this.f21342b = activity;
        this.f21343c = i7;
    }

    @Override // r3.a0
    public final void a() {
        Intent intent = this.f21341a;
        if (intent != null) {
            this.f21342b.startActivityForResult(intent, this.f21343c);
        }
    }
}
