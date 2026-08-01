package defpackage;

import androidx.fragment.app.Fragment;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class ka0 extends RuntimeException {
    public final Fragment f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(Fragment fragment, String str) {
        super(str);
        fragment.getClass();
        this.f = fragment;
    }
}
