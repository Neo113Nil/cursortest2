package androidx.lifecycle;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2375a;

    public F(int i3) {
        switch (i3) {
            case 1:
                this.f2375a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f2375a = new LinkedHashMap();
                break;
        }
    }
}
