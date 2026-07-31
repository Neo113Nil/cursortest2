package k0;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
class O implements P {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f40895a;

    O(View view) {
        this.f40895a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof O) && ((O) obj).f40895a.equals(this.f40895a);
    }

    public int hashCode() {
        return this.f40895a.hashCode();
    }
}
