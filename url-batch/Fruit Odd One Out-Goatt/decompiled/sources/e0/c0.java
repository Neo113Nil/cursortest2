package e0;

import android.view.KeyCharacterMap;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f133a;

    public c0() {
        this.f133a = 0;
    }

    public Character a(int i2) {
        char c2 = (char) i2;
        int i3 = Integer.MIN_VALUE & i2;
        int i4 = this.f133a;
        if (i3 != 0) {
            int i5 = i2 & Integer.MAX_VALUE;
            if (i4 != 0) {
                this.f133a = KeyCharacterMap.getDeadChar(i4, i5);
            } else {
                this.f133a = i5;
            }
        } else if (i4 != 0) {
            int deadChar = KeyCharacterMap.getDeadChar(i4, i2);
            if (deadChar > 0) {
                c2 = (char) deadChar;
            }
            this.f133a = 0;
        }
        return Character.valueOf(c2);
    }

    public c0(int i2) {
        this.f133a = i2;
    }
}
