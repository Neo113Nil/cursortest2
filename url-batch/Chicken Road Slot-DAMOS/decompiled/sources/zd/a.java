package zd;

import java.util.Random;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a extends d {
    @Override // zd.d
    public final int a(int i3) {
        return ((-i3) >> 31) & (d().nextInt() >>> (32 - i3));
    }

    @Override // zd.d
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();

    public final int e(int i3) {
        return d().nextInt(i3);
    }
}
