package h4;

import android.view.KeyCharacterMap;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public int f5277a;

    public v(int i2) {
        switch (i2) {
            case 1:
                this.f5277a = k5.g.f6069n.getAndIncrement();
                break;
            default:
                this.f5277a = 0;
                break;
        }
    }

    public Character a(int i2) {
        char c7 = (char) i2;
        if ((Integer.MIN_VALUE & i2) != 0) {
            int i5 = i2 & Integer.MAX_VALUE;
            int i7 = this.f5277a;
            if (i7 != 0) {
                this.f5277a = KeyCharacterMap.getDeadChar(i7, i5);
            } else {
                this.f5277a = i5;
            }
        } else {
            int i8 = this.f5277a;
            if (i8 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i8, i2);
                if (deadChar > 0) {
                    c7 = (char) deadChar;
                }
                this.f5277a = 0;
            }
        }
        return Character.valueOf(c7);
    }
}
