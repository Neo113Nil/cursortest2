package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.I;
import com.onesignal.core.activities.PermissionsActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements T.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3191b;

    public /* synthetic */ c(int i7, Object obj) {
        this.f3190a = i7;
        this.f3191b = obj;
    }

    @Override // T.e
    public final Bundle a() {
        switch (this.f3190a) {
            case 0:
                return l.b((PermissionsActivity) this.f3191b);
            default:
                return I.a((I) this.f3191b);
        }
    }
}
