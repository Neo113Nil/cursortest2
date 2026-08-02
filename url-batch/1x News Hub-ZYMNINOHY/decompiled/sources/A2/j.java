package A2;

import android.view.KeyCharacterMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f59a;

    public j() {
        this.f59a = 0;
    }

    public Character a(int i3) {
        char c3 = (char) i3;
        if ((Integer.MIN_VALUE & i3) != 0) {
            int i4 = i3 & Integer.MAX_VALUE;
            int i5 = this.f59a;
            if (i5 != 0) {
                this.f59a = KeyCharacterMap.getDeadChar(i5, i4);
            } else {
                this.f59a = i4;
            }
        } else {
            int i6 = this.f59a;
            if (i6 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i6, i3);
                if (deadChar > 0) {
                    c3 = (char) deadChar;
                }
                this.f59a = 0;
            }
        }
        return Character.valueOf(c3);
    }

    public j(int i3) {
        this.f59a = i3;
    }
}
